package simplePlugins.plugins.api.wrapper;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 26 of Februar 2018
 */
public class WorldWrapper {
    
    /**
     * Spawns an entity at a given position in the world.
     * The vanilla entity classes are contained in the {@link net.minecraft.entity}
     * package. To spawn an entity, for example a chicken, create a new instance of this
     * entity, and pass it together with the world it should spawn in and its position to
     * this method.
     * @param world The world the entity is spawned in.
     * @param entity The entity object that gets spawned. Should be a newly created object everytime.
     * @param x The x coordinate of the spawn position.
     * @param y The y coordinate of the spawn position.
     * @param z The z coordinate of the spawn position.
     * @return If the spawn has been successful.
     * @see World#spawnEntity(Entity)
     */
    public static boolean spawnEntity(World world, Entity entity, double x, double y, double z) {
        entity.setPosition(x, y, z);
        return world.spawnEntity(entity);
    }
    
    /**
     * Spawns an entity at a given position in the world.
     * The vanilla entity classes are contained in the {@link net.minecraft.entity}
     * package. To spawn an entity, for example a chicken, create a new instance of this
     * entity, and pass it together with the world it should spawn in and its position to
     * this method.
     * @param world The world the entity is spawned in.
     * @param entity The entity object that gets spawned. Should be a newly created object everytime.
     * @param pos The position where the entity will spawn.
     * @return If the spawn has been successful.
     * @see World#spawnEntity(Entity)
     * @see #spawnEntity(World, Entity, double, double, double)
     */
    public static boolean spawnEntity(World world, Entity entity, BlockPos pos) {
        return spawnEntity(world, entity, pos.getX(), pos.getY(), pos.getZ());
    }
}
