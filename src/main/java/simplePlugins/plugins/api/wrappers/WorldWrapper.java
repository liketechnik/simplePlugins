package simplePlugins.plugins.api.wrappers;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of April 2018
 */
public class WorldWrapper {
    
    private World world;
    
    public WorldWrapper(World world) {
        this.world = world;
    }
    
    public boolean spawnEntity(Entity entity, double x, double y, double z) {
        entity.setPosition(x, y, z);
        return world.spawnEntity(entity);
    }
    
    public boolean spawnEntity(Entity entity, BlockPos pos) {
        return spawnEntity(entity, pos.getX(), pos.getY(), pos.getZ());
    }
    
    public boolean forceSetBlock(Block block, BlockPos pos) {
        IBlockState state = block.getDefaultState();
        return world.setBlockState(pos, state);
    }
    
    public boolean forceSetBlock(Block block, double x, double y, double z) {
        return forceSetBlock(block, new BlockPos(x, y, z));
    }
    
    public boolean attemptSetBlock(Block block, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() == Blocks.AIR || state.getBlock() == Blocks.WATER ||
                state.getBlock() == Blocks.LAVA) {
            return forceSetBlock(block, pos);
        } else {
            return false;
        }
    }
    
    public boolean attemptSetBlock(Block block, double x, double y, double z) {
        return attemptSetBlock(block, new BlockPos(x, y, z));
    }
    
    public Block getBlockAt(BlockPos pos) {
        return world.getBlockState(pos).getBlock();
    }
    
    public Block getBlockAt(double x, double y, double z) {
        return getBlockAt(new BlockPos(x, y, z));
    }
    
    public boolean removeBlockAt(BlockPos pos) {
        return world.setBlockToAir(pos);
    }
    
    public boolean removeBlockAt(double x, double y, double z) {
        return world.setBlockToAir(new BlockPos(x, y, z));
    }
    
    public boolean isBlockAt(BlockPos pos) {
        return !world.isAirBlock(pos);
    }
    
    public boolean isBlockAt(double x, double y, double z) {
        return !world.isAirBlock(new BlockPos(x, y, z));
    }
    
    public World getUnwrapped() {
        return this.world;
    }
}
