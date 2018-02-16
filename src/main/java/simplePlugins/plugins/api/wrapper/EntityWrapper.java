package simplePlugins.plugins.api.wrapper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;

/**
 * Provides static wrapper methods for the {@link EntityLivingBase}, i. e. probably the
 * {@link net.minecraft.entity.player.EntityPlayer Player} class. These methods
 * provide easier access to some functions.
 *
 * @author Florian Warzecha
 * @version 1.0
 * @date 16 of Februar 2018
 */
public class EntityWrapper {
    
    /**
     * Teleports the entity to the given coordinates.
     * @param entity  The entity instance to port.
     * @param x The x coordinate of the new position.
     * @param y The y coordinate of the new position.
     * @param z The z coordinate of the new position.
     * @see EntityLivingBase#setPosition(double, double, double)
     */
    public static void forceTeleport(EntityLivingBase entity, double x, double y, double z) {
        entity.setPosition(x, y, z);
    }
    
    /**
     * Teleports the entity to the given {@link BlockPos}.
     * @param entity The entity instance to port.
     * @param pos The position where the entity is ported to.
     * @see EntityLivingBase#setPosition(double, double, double)
     * @see EntityWrapper#forceTeleport(EntityLivingBase, double, double, double)
     */
    public static void forceTeleport(EntityLivingBase entity, BlockPos pos) {
        forceTeleport(entity, pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Attempts to teleport the entity to the given {@link BlockPos}.
     * @param entity The entity instance to port.
     * @param pos The position where the entity is ported to.
     * @return If the teleport succeeded.
     * @see EntityLivingBase#attemptTeleport(double, double, double)
     */
    public static boolean attemptTeleport(EntityLivingBase entity, BlockPos pos) {
        return entity.attemptTeleport(pos.getX(), pos.getY(), pos.getZ());
    }
}
