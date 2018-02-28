package simplePlugins.plugins.api.wrapper;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Provides static methods for working with {@link Block BlocksWrapper}.
 * For example, you can set a block at a given position or retrieve the
 * block type at a given position.
 *
 * @author Florian Warzecha
 * @version 1.0
 * @date 16 of Februar 2018
 */
public class BlocksWrapper {
    
    /**
     * Sets a block at a given {@link BlockPos position}.
     * @param block The block that is set.
     * @param world The world that gets modified.
     * @param blockPos The position of the new block.
     * @return If the block was set.
     * @see Block#getDefaultState()
     * @see World#setBlockState(BlockPos, IBlockState)
     */
    public static boolean forceSetBlock(Block block, World world, BlockPos blockPos) {
        IBlockState state = block.getDefaultState();
        return world.setBlockState(blockPos, state);
    }
    
    /**
     * Sets a block at a given position.
     * @param block The block that is set.
     * @param world The world that gets modified.
     * @param x The x coordinate of the block's position.
     * @param y The y coordinate of the block's position.
     * @param z The z coordinate of the block's position.
     * @return If the block was set.
     * @see World#setBlockState(BlockPos, IBlockState)
     * @see Block#getDefaultState()
     * @see BlocksWrapper#forceSetBlock(Block, World, BlockPos)
     */
    public static boolean forceSetBlock(Block block, World world, double x, double y, double z) {
        return forceSetBlock(block,world, new BlockPos(x, y, z));
    }
    
    /**
     * Attempts to set a block at a given {@link BlockPos position}.
     * @param block The block that is set.
     * @param world The world that gets modified.
     * @param blockPos The position of the new block.
     * @return If the block was set.
     * @see World#setBlockState(BlockPos, IBlockState)
     * @see Block#getDefaultState()
     * @see BlocksWrapper#forceSetBlock(Block, World, BlockPos)
     */
    public static boolean attemptSetBlock(Block block, World world, BlockPos blockPos) {
        IBlockState state = world.getBlockState(blockPos);
        if (state.getBlock() == Blocks.AIR || state.getBlock() == Blocks.WATER ||
                state.getBlock() == Blocks.LAVA) {
            return forceSetBlock(block, world, blockPos);
        } else {
            return false;
        }
    }
    
    /**
     * Attempts to set a block at a given position.
     * @param block The block that is set.
     * @param world The world that gets modified.
     * @param x The x coordinate of the block's position.
     * @param y The y coordinate of the block's position.
     * @param z The z coordinate of the block's position.
     * @return If the block was set.
     * @see World#setBlockState(BlockPos, IBlockState)
     * @see Block#getDefaultState()
     * @see BlocksWrapper#forceSetBlock(Block, World, BlockPos)
     * @see BlocksWrapper#attemptSetBlock(Block, World, BlockPos)
     */
    public static boolean attemptSetBlock(Block block, World world, double x, double y, double z) {
        return attemptSetBlock(block, world, new BlockPos(x, y, z));
    }
    
    /**
     * Looks which block is at the given {@link BlockPos position}.
     * @param world The world that is loaded.
     * @param blockPos The position where the block type is queried.
     * @return The {@link Block} at the {@link BlockPos}
     * @see World#getBlockState(BlockPos)
     * @see IBlockState#getBlock()
     */
    public static Block getBlockAt(World world, BlockPos blockPos) {
        return world.getBlockState(blockPos).getBlock();
    }
    
    /**
     * Looks which block is at the given position.
     *
     * @param world The world that is loaded.
     * @param x The x coordinate of the position.
     * @param y The y coordinate of the position.
     * @param z The z coordinate of the position.
     * @return The {@link Block} at the {@link BlockPos}
     * @see World#getBlockState(BlockPos)
     * @see IBlockState#getBlock()
     * @see BlocksWrapper#getBlockAt(World, BlockPos)
     */
    public static Block getBlockAt(World world, double x, double y, double z) {
        return getBlockAt(world, new BlockPos(x, y, z));
    }
    
    /**
     * Removes the block ate the given {@link BlockPos position}. This is done
     * by setting it to air.
     *
     * @param world The world we're operating in.
     * @param blockPos The position at which the block is removed.
     * @return If the block was successfully removed.
     * @see World#setBlockToAir(BlockPos)
     */
    public static boolean removeBlockAt(World world, BlockPos blockPos) {
        return world.setBlockToAir(blockPos);
    }
    
    /**
     * Removes the block at the given position. This is done
     * by setting it to air.
     *
     * @param world The world we're operating in.
     * @param x The x coordinate of the blocks position.
     * @param y The y coordinate of the blocks position.
     * @param z The z coordinate of the blocks position.
     * @return If the block was successfully removed.
     * @see World#setBlockToAir(BlockPos)
     * @see #removeBlockAt(World, BlockPos)
     */
    public static boolean removeBlockAt(World world, double x, double y, double z) {
        return removeBlockAt(world, new BlockPos(x, y, z));
    }
    
    /**
     * Removes the block at the given {@link BlockPos posstion}. The difference
     * between this method and {@link #removeBlockAt(World, BlockPos)} is, that
     * this method will play the block breaking sound and can drop the block item.
     * @param world The world we're operating in.
     * @param blockPos The position at which the block is removed.
     * @param dropBlock If the block should be dropped as an item.
     * @return If the block was successfully removed.
     * @see World#destroyBlock(BlockPos, boolean)
     */
    public static boolean destroyBlockAt(World world, BlockPos blockPos, boolean dropBlock) {
        return world.destroyBlock(blockPos, dropBlock);
    }
    
    /**
     * Removes the block at the given posstion. The difference
     * between this method and {@link #removeBlockAt(World, BlockPos)} is, that
     * this method will play the block breaking sound and can drop the block item.
     * @param world The world we're operating in.
     * @param x The x coordinate of the blocks position.
     * @param y The y coordinate of the blocks position.
     * @param z The z coordinate of the blocks position.
     * @param dropBlock If the block should be dropped as an item.
     * @return If the block was successfully removed.
     * @see World#destroyBlock(BlockPos, boolean)
     * @see #destroyBlockAt(World, BlockPos, boolean)
     */
    public static boolean destroyBlockAt(World world, double x, double y, double z, boolean dropBlock) {
        return destroyBlockAt(world, new BlockPos(x, y, z), dropBlock);
    }
    
    /**
     * Checks if a block exists yet at a given {@link BlockPos position}.
     * @param world The world we're operating in.
     * @param blockPos The position we're checking.
     * @return {@code true} if there is a block at the position, {@code false} if not
     */
    public static boolean isBlockAt(World world, BlockPos blockPos) {
        return !world.isAirBlock(blockPos);
    }
    
    /**
     * Checks if a block exists yet at a given position.
     * @param world The world we're operating in.
     * @param x The x coordinate of the position.
     * @param y The y coordinate of the position.
     * @param z The z coordinate of the position.
     * @return {@code true} if there is a block at the position, {@code false} if not
     */
    public static boolean isBlockAt(World world, double x, double y, double z) {
        return !world.isAirBlock(new BlockPos(x, y, z));
    }
}
