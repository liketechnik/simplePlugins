package simplePlugins.plugins.api.wrappers;

import net.minecraft.entity.player.EntityPlayer;
import simplePlugins.plugins.api.wrappers.entity.EntityLivingBaseWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 02 of April 2018
 */
public class EntityPlayerWrapper extends EntityLivingBaseWrapper {
    
    private EntityPlayer player;
    
    public EntityPlayerWrapper(EntityPlayer player) {
        super(player);
        this.player = player;
    }
    
    public EntityPlayer getUnwrapped() {
        return player;
    }
}
