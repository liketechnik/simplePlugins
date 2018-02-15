package simplePlugins;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
public class ModItems {
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        SimplePluginsMod.instance.logger.debug("Initializing item models");
    }
}
