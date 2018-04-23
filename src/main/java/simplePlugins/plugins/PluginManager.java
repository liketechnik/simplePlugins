package simplePlugins.plugins;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;
import simplePlugins.SimplePluginsMod;
import simplePlugins.plugins.api.EventListener;
import simplePlugins.plugins.api.Plugin;
import simplePlugins.plugins.api.annotations.ParamCommand;
import simplePlugins.plugins.api.annotations.SimpleCommand;
import simplePlugins.plugins.api.events.entity.player.itemUseEvent.ItemUseEvent;
import simplePlugins.plugins.api.wrappers.EntityPlayerWrapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import static simplePlugins.utils.Reflection.checkParams;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
public class PluginManager {
    
    private List<Plugin> plugins = new LinkedList<>();
    private Queue<Plugin> events = new LinkedBlockingQueue<>();
    private Queue<Method> wrappedEvents = new LinkedBlockingQueue<>();
    private Queue<Plugin> wrappedEventsPlugins = new LinkedBlockingQueue<>();
    private Queue<simplePlugins.plugins.api.commands.SimpleCommand> commands = new LinkedBlockingQueue<>();
    
    private static List<Class<?>> eventWrappers = new LinkedList<>();
    
    static {
        eventWrappers.add(ItemUseEvent.class);
    }
    
    public void loadPlugins(File dir) {
        SimplePluginsMod.instance.logger.info("Loading plugins...");
        
        File[] files = dir.listFiles();
        for (File file : files != null ? files : new File[0]) {
            if (file.getName().endsWith(".jar")) {
                loadPlugin(file);
            } else {
                SimplePluginsMod.instance.logger.warn("Found non plugin file '" +
                file + "' in the plugins directory.");
            }
        }
    
        SimplePluginsMod.instance.logger.info("All plugins loaded!");
    }
    
    private void loadPlugin(File pluginJar) {
        Logger logger = SimplePluginsMod.instance.logger;
        logger.debug("Found file '" + pluginJar + "'. Trying to load plugin...");
    
        try {
            JarFile jar = new JarFile(pluginJar);
    
            Manifest manifest = jar.getManifest();
            if (manifest == null) {
                logger.warn("Couldn't load '" + pluginJar + "' because it doesn't contain" +
                                    " a manifest.");
                return;
            }
            Attributes attributes = manifest.getMainAttributes();
            String mainClass = attributes.getValue(Attributes.Name.MAIN_CLASS);
            if (mainClass == null) {
                logger.warn("Couldn't load '" + pluginJar + "' because it doesn't contain" +
                                    " a main class entry in the manifest.");
                return;
            }
    
            this.addPluginToCP(pluginJar.toURI().toURL());
            Class cl = this.getClass().getClassLoader().loadClass(mainClass);
            
            Class parent = cl.getSuperclass();
            boolean isPlugin = false;
            if (parent.getName().equals(Plugin.class.getName())) {
                isPlugin = true;
            }
            
            if (isPlugin) {
                Plugin plugin = (Plugin) cl.newInstance();
                
                plugin.setLogger(logger);
                plugins.add(plugin);
                
                Class[] interfaces = cl.getInterfaces();
                for (Class clazz : interfaces) {
                    if (clazz.getName().equals(EventListener.class.getName())) {
                        events.add(plugin);
                        break;
                    }
                }
                
                Method[] methods = cl.getMethods();
                for (Method method : methods) {
                    int parameters = method.getParameterCount();
                    if (parameters == 1) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (eventWrappers.contains(parameterTypes[0])) {
                            wrappedEvents.add(method);
                            wrappedEventsPlugins.add(plugin);
                            continue;
                        }
                    }
                    
                    SimpleCommand annotation = method.getAnnotation(SimpleCommand.class);
                    if (annotation != null) {
                       // Parameter[] params = method.getParameters();
   
                        if (!checkParams(method, EntityPlayerWrapper.class)) {
                            logger.warn("Not adding command '" + annotation.name() + "'" +
                                                " because of wrong parameter types.");
                        } else {
                            simplePlugins.plugins.api.commands.SimpleCommand command = new simplePlugins.plugins.api.commands.SimpleCommand(annotation.name(), annotation.usage(), method, plugin);
                            commands.add(command);
                        }
                        continue;
                    }
    
                    ParamCommand pAnnotation = method.getAnnotation(ParamCommand.class);
                    if (pAnnotation != null) {
                       if (!checkParams(method, EntityPlayerWrapper.class, String[].class)) {
                           logger.warn("Not adding command '" + pAnnotation.name() + "'" +
                                               " because of wrong parameter types");
                       } else {
                           simplePlugins.plugins.api.commands.ParamCommand command = new simplePlugins.plugins.api.commands.ParamCommand(pAnnotation.name(), pAnnotation.usage(), pAnnotation.paramsUsage(), method, plugin);
                           commands.add(command);
                       }
                    }
                }
                
                logger.info("Loaded Plugin '" + plugin.getName() + "'.");
            } else {
                logger.warn("Couldn't load '" + pluginJar + "' because the main class '" +
                    parent + "' isn't a plugin.");
            }
        } catch (IOException | ClassNotFoundException | InstantiationException |
                                     IllegalAccessException | NoSuchMethodException
                                     | InvocationTargetException e) {
            logger.error("Error loading '" + pluginJar + "'.");
            e.printStackTrace();
        }
    }
    
    public void registerEvents() {
        SimplePluginsMod.instance.logger.debug("registering plugin events");
        while (!events.isEmpty()) {
            SimplePluginsMod.instance.logger.debug("registering events for" +
                                                           "plugin '" + events.peek().getName() +
                                                               "'.");
            MinecraftForge.EVENT_BUS.register(events.remove());
        }
        
        while (!wrappedEvents.isEmpty()) {
            Method event = wrappedEvents.remove();
            try {
                Method converterGetter = event.getParameterTypes()[0].getMethod("getConverter");
                Class<?> converterClass = (Class<?>) converterGetter.invoke(null);
                MinecraftForge.EVENT_BUS.register(converterClass.getConstructor(Method.class, Plugin.class).newInstance(event, wrappedEventsPlugins.remove()));
//                ItemUseEventConverter converter = (ItemUseEventConverter) event.getParameterTypes()[0].getConstructor(Method.class).newInstance(event);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        
        for (Plugin plugin : plugins) {
            SimplePluginsMod.instance.logger.debug("registering event classes " +
                                                           "from '" + plugin.getName() + "' plugin.");
            plugin.registerEventClasses();
        }
        SimplePluginsMod.instance.logger.debug("registered plugin events");
    }
    
    public void registerCommands(FMLServerStartingEvent event) {
        SimplePluginsMod.instance.logger.debug("registering plugin commands");
        for (simplePlugins.plugins.api.commands.SimpleCommand command : commands) {
            SimplePluginsMod.instance.logger.debug("registering command '" +
                                command.getName() + "' from plugin '" + command.getPlugin() + "'.");
            event.registerServerCommand(command);
        }
        for (Plugin plugin : plugins) {
            SimplePluginsMod.instance.logger.debug("registering command classes " +
                                                           "from '" + plugin.getName() + "' plugin.");
            plugin.registerCommandClasses(event);
        }
        SimplePluginsMod.instance.logger.debug("registered plugin commands");
    }
    
    /**
     * Adds the url to the class loader of this class.
     * <b>This will only work in Java 8.</b> This method
     * must be redone when changing to Java 9.
     *
     * This method uses reflection to access the class loaders
     * {@link URLClassLoader#addURL(URL)} method. This is a hack,
     * so it may break easily.
     * @param url
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private void addPluginToCP(URL url) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        URLClassLoader classLoader
                = (URLClassLoader) this.getClass().getClassLoader();
        Class clazz = URLClassLoader.class;
        
        // Use reflection
        Method method = clazz.getDeclaredMethod("addURL", URL.class);
        method.setAccessible(true);
        method.invoke(classLoader, url);
    }
}
