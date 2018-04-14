package simplePlugins.plugins.api.events.entity.player.itemUseEvent;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import simplePlugins.plugins.api.Plugin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 03 of April 2018
 */
public class ItemUseEventConverter {
    
    private Method eventReceiver;
    private Plugin plugin;
    
    public ItemUseEventConverter(Method eventReceiver, Plugin plugin) {
        this.eventReceiver = eventReceiver;
        this.plugin = plugin;
    }
    
    @SubscribeEvent
    public void onItemUse(PlayerInteractEvent.RightClickItem event) {
        if (event.getSide().isServer()) {
            try {
                eventReceiver.invoke(plugin, new ItemUseEvent(event));
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
    
}
