package simplePlugins.plugins.api.events.entity.player;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class PlayerInteractEventWrapper extends PlayerEventWrapper {
    
    PlayerInteractEvent event;
    
    public PlayerInteractEventWrapper(PlayerInteractEvent event) {
        super(event);
        this.event = event;
    }
    
    public PlayerInteractEvent getUnwrapped() {
        return this.event;
    }
}
