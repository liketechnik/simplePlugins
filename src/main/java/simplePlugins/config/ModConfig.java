package simplePlugins.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import simplePlugins.SimplePluginsMod;
import simplePlugins.utils.LogLevels;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 26 of November 2017
 */
@Config(modid = SimplePluginsMod.MODID, name = "simplePlugins", category = "")
@Config.LangKey("simpleplugins.config.title")
public class ModConfig {

    @Config.LangKey("simpleplugins.config.developerOptions.title")
    public static final DeveloperOptions developerOptions = new DeveloperOptions();

    public static class DeveloperOptions {
        
        @Config.LangKey("simpleplugins.config.developerOptions.logLevel")
        public LogLevels logLevel = LogLevels.INFO;
        
    }
    
    @Mod.EventBusSubscriber
    private static class EventHandler {

        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(SimplePluginsMod.MODID)) {
                ConfigManager.sync(SimplePluginsMod.MODID, Config.Type.INSTANCE);
                SimplePluginsMod.instance.logger.setLevel(developerOptions.logLevel.getLevel());
    
                SimplePluginsMod.instance.logger.debug(String.format(
                        "Changed log level to %s", developerOptions.logLevel));
                SimplePluginsMod.instance.logger.debug("Applied new config");
            }
        }
    }
}

