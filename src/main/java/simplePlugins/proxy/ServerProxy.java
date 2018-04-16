package simplePlugins.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
@Mod.EventBusSubscriber(Side.SERVER)
public class ServerProxy extends CommonProxy {
    
    @Override
    public void preInit(FMLPreInitializationEvent event) {
    }
}
