package simplePlugins.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import simplePlugins.SimplePluginsMod;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
@Mod.EventBusSubscriber
public class CommonProxy {
    
    public void preInit(FMLPreInitializationEvent event) {
    }
    
    public void init(FMLInitializationEvent event) {
        SimplePluginsMod.instance.pluginManager.registerEvents();
    }
    
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {
    
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        SimplePluginsMod.instance.logger.info("Registering blocks and corresponding TE's.");
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        SimplePluginsMod.instance.logger.info("Registering items.");
    }
}
