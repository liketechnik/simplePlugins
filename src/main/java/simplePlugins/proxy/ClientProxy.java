package simplePlugins.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import simplePlugins.ModBlocks;
import simplePlugins.ModItems;
import simplePlugins.SimplePluginsMod;

import java.io.File;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        SimplePluginsMod.instance.pluginManager.loadPlugins(
                new File(Minecraft.getMinecraft().mcDataDir, "plugins"));
    }
    
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
    
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
    
    @Override
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {
        super.serverAboutToStart(event);
    }
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        SimplePluginsMod.instance.logger.debug("Initializing models");
        
        ModBlocks.initModels();
        ModItems.initModels();
    }
}
