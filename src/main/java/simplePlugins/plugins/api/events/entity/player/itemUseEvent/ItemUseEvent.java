package simplePlugins.plugins.api.events.entity.player.itemUseEvent;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import simplePlugins.plugins.api.events.entity.player.PlayerInteractEventWrapper;
import simplePlugins.plugins.api.wrappers.WorldWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 03 of April 2018
 */
public class ItemUseEvent extends PlayerInteractEventWrapper {
    
    private PlayerInteractEvent.RightClickItem event;
    private WorldWrapper worldWrapper;
    
    public ItemUseEvent(PlayerInteractEvent.RightClickItem event) {
        super(event);
        this.event = event;
        this.worldWrapper = new WorldWrapper(event.getWorld());
    }
    
    public WorldWrapper getWorld() {
        return this.worldWrapper;
    }
    
    @Override
    public PlayerInteractEvent.RightClickItem getUnwrapped() {
        return this.event;
    }
    
    public static Class<?> getConverter() {
        return ItemUseEventConverter.class;
    }
}
