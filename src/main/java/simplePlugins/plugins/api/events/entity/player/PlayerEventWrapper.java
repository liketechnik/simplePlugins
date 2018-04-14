package simplePlugins.plugins.api.events.entity.player;

import net.minecraftforge.event.entity.player.PlayerEvent;
import simplePlugins.plugins.api.events.entity.living.LivingEventWrapper;
import simplePlugins.plugins.api.wrappers.EntityPlayerWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class PlayerEventWrapper extends LivingEventWrapper {
    
    private PlayerEvent event;
    private EntityPlayerWrapper entityPlayer;
    
    public PlayerEventWrapper(PlayerEvent event) {
        super(event);
        this.event = event;
        this.entityPlayer = new EntityPlayerWrapper(event.getEntityPlayer());
    }
    
    public EntityPlayerWrapper getEntityPlayer() {
        return this.entityPlayer;
    }
    
    @Override
    public PlayerEvent getUnwrapped() {
        return this.event;
    }
    
}
