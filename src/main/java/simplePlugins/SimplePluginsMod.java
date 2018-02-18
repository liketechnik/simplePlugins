package simplePlugins;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import simplePlugins.config.ModConfig;
import simplePlugins.plugins.PluginManager;
import simplePlugins.proxy.CommonProxy;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
@Mod(modid = SimplePluginsMod.MODID, name = SimplePluginsMod.MODNAME,
        version = SimplePluginsMod.MODVERSION, dependencies = "required-after:forge@[14.23.2.2618,)",
        acceptedMinecraftVersions = "1.12")
public class SimplePluginsMod {
    
    public static final String MODID = "simpleplugins";
    public static final String MODNAME = "Simple Plugins";
    public static final String MODVERSION = "1.2.1-1";
    
    @SidedProxy(clientSide = "simplePlugins.proxy.ClientProxy",
            serverSide = "simplePlugins.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static SimplePluginsMod instance;
    
    public Logger logger;
    public PluginManager pluginManager;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = (Logger) event.getModLog();
        logger.setLevel(Level.DEBUG);
        
        pluginManager = new PluginManager();
        
        proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        logger.setLevel(ModConfig.developerOptions.logLevel.getLevel());
    }
    
    @Mod.EventHandler
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {
        proxy.serverAboutToStart(event);
    }
    
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
