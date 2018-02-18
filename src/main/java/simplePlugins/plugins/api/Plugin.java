package simplePlugins.plugins.api;

import net.minecraft.command.ICommand;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
abstract public class Plugin {
    private String name;
    public Logger logger;
    
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    public String getName() {
        return this.name;
    }
    
    /**
     * This is called during registration of commands. Allows
     * the registration of own command <i>classes</i> via
     * the {@link net.minecraftforge.fml.common.event.FMLServerStartingEvent#registerServerCommand(ICommand)}
     * method.
     */
    public void registerCommandClasses(FMLServerStartingEvent event){
    
    }
    
    /**
     * This is called during registration of events. Allows
     * the registration of own event <i>classes</i>  via
     * the {@link net.minecraftforge.fml.common.eventhandler.EventBus#register(Object)}
     * method. Call this method on the following instance: {@link net.minecraftforge.common.MinecraftForge#EVENT_BUS}
     */
    public void registerEventClasses() {
    
    }
    
    public Plugin(String name) {
        this.name = name;
    }
}
