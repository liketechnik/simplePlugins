package simplePlugins.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.server.FMLServerHandler;
import org.apache.logging.log4j.Level;
import simplePlugins.SimplePluginsMod;
import simplePlugins.utils.LogLevels;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ServerProxy extends CommonProxy {
    
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        LogLevels.enableDebugLog("FmlConsole");
        SimplePluginsMod.instance.logger.setLevel(Level.DEBUG);
        SimplePluginsMod.instance.pluginManager.loadPlugins(FMLServerHandler.instance().
                                           getServer().getFile("plugins"));
    }
}
