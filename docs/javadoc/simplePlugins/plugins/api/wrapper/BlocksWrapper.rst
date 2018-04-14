.. java:import:: net.minecraft.block Block

.. java:import:: net.minecraft.block.state IBlockState

.. java:import:: net.minecraft.init Blocks

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.world World

BlocksWrapper
=============

.. java:package:: simplePlugins.plugins.api.wrapper
   :noindex:

.. java:type:: public class BlocksWrapper

   Provides static methods for working with \ :java:ref:`BlocksWrapper <Block>`\ . For example, you can set a block at a given position or retrieve the block type at a given position.

   :author: Florian Warzecha

Methods
-------
attemptSetBlock
^^^^^^^^^^^^^^^

.. java:method:: public static boolean attemptSetBlock(Block block, World world, BlockPos blockPos)
   :outertype: BlocksWrapper

   Attempts to set a block at a given \ :java:ref:`position <BlockPos>`\ .

   :param block: The block that is set.
   :param world: The world that gets modified.
   :param blockPos: The position of the new block.
   :return: If the block was set.

   **See also:** :java:ref:`World.setBlockState(BlockPos,IBlockState)`, :java:ref:`Block.getDefaultState()`, :java:ref:`BlocksWrapper.forceSetBlock(Block,World,BlockPos)`

attemptSetBlock
^^^^^^^^^^^^^^^

.. java:method:: public static boolean attemptSetBlock(Block block, World world, double x, double y, double z)
   :outertype: BlocksWrapper

   Attempts to set a block at a given position.

   :param block: The block that is set.
   :param world: The world that gets modified.
   :param x: The x coordinate of the block's position.
   :param y: The y coordinate of the block's position.
   :param z: The z coordinate of the block's position.
   :return: If the block was set.

   **See also:** :java:ref:`World.setBlockState(BlockPos,IBlockState)`, :java:ref:`Block.getDefaultState()`, :java:ref:`BlocksWrapper.forceSetBlock(Block,World,BlockPos)`, :java:ref:`BlocksWrapper.attemptSetBlock(Block,World,BlockPos)`

destroyBlockAt
^^^^^^^^^^^^^^

.. java:method:: public static boolean destroyBlockAt(World world, BlockPos blockPos, boolean dropBlock)
   :outertype: BlocksWrapper

   Removes the block at the given \ :java:ref:`posstion <BlockPos>`\ . The difference between this method and \ :java:ref:`removeBlockAt(World,BlockPos)`\  is, that this method will play the block breaking sound and can drop the block item.

   :param world: The world we're operating in.
   :param blockPos: The position at which the block is removed.
   :param dropBlock: If the block should be dropped as an item.
   :return: If the block was successfully removed.

   **See also:** :java:ref:`World.destroyBlock(BlockPos,boolean)`

destroyBlockAt
^^^^^^^^^^^^^^

.. java:method:: public static boolean destroyBlockAt(World world, double x, double y, double z, boolean dropBlock)
   :outertype: BlocksWrapper

   Removes the block at the given posstion. The difference between this method and \ :java:ref:`removeBlockAt(World,BlockPos)`\  is, that this method will play the block breaking sound and can drop the block item.

   :param world: The world we're operating in.
   :param x: The x coordinate of the blocks position.
   :param y: The y coordinate of the blocks position.
   :param z: The z coordinate of the blocks position.
   :param dropBlock: If the block should be dropped as an item.
   :return: If the block was successfully removed.

   **See also:** :java:ref:`World.destroyBlock(BlockPos,boolean)`, :java:ref:`.destroyBlockAt(World,BlockPos,boolean)`

forceSetBlock
^^^^^^^^^^^^^

.. java:method:: public static boolean forceSetBlock(Block block, World world, BlockPos blockPos)
   :outertype: BlocksWrapper

   Sets a block at a given \ :java:ref:`position <BlockPos>`\ .

   :param block: The block that is set.
   :param world: The world that gets modified.
   :param blockPos: The position of the new block.
   :return: If the block was set.

   **See also:** :java:ref:`Block.getDefaultState()`, :java:ref:`World.setBlockState(BlockPos,IBlockState)`

forceSetBlock
^^^^^^^^^^^^^

.. java:method:: public static boolean forceSetBlock(Block block, World world, double x, double y, double z)
   :outertype: BlocksWrapper

   Sets a block at a given position.

   :param block: The block that is set.
   :param world: The world that gets modified.
   :param x: The x coordinate of the block's position.
   :param y: The y coordinate of the block's position.
   :param z: The z coordinate of the block's position.
   :return: If the block was set.

   **See also:** :java:ref:`World.setBlockState(BlockPos,IBlockState)`, :java:ref:`Block.getDefaultState()`, :java:ref:`BlocksWrapper.forceSetBlock(Block,World,BlockPos)`

getBlockAt
^^^^^^^^^^

.. java:method:: public static Block getBlockAt(World world, BlockPos blockPos)
   :outertype: BlocksWrapper

   Looks which block is at the given \ :java:ref:`position <BlockPos>`\ .

   :param world: The world that is loaded.
   :param blockPos: The position where the block type is queried.
   :return: The \ :java:ref:`Block`\  at the \ :java:ref:`BlockPos`\

   **See also:** :java:ref:`World.getBlockState(BlockPos)`, :java:ref:`IBlockState.getBlock()`

getBlockAt
^^^^^^^^^^

.. java:method:: public static Block getBlockAt(World world, double x, double y, double z)
   :outertype: BlocksWrapper

   Looks which block is at the given position.

   :param world: The world that is loaded.
   :param x: The x coordinate of the position.
   :param y: The y coordinate of the position.
   :param z: The z coordinate of the position.
   :return: The \ :java:ref:`Block`\  at the \ :java:ref:`BlockPos`\

   **See also:** :java:ref:`World.getBlockState(BlockPos)`, :java:ref:`IBlockState.getBlock()`, :java:ref:`BlocksWrapper.getBlockAt(World,BlockPos)`

isBlockAt
^^^^^^^^^

.. java:method:: public static boolean isBlockAt(World world, BlockPos blockPos)
   :outertype: BlocksWrapper

   Checks if a block exists yet at a given \ :java:ref:`position <BlockPos>`\ .

   :param world: The world we're operating in.
   :param blockPos: The position we're checking.
   :return: \ ``true``\  if there is a block at the position, \ ``false``\  if not

isBlockAt
^^^^^^^^^

.. java:method:: public static boolean isBlockAt(World world, double x, double y, double z)
   :outertype: BlocksWrapper

   Checks if a block exists yet at a given position.

   :param world: The world we're operating in.
   :param x: The x coordinate of the position.
   :param y: The y coordinate of the position.
   :param z: The z coordinate of the position.
   :return: \ ``true``\  if there is a block at the position, \ ``false``\  if not

removeBlockAt
^^^^^^^^^^^^^

.. java:method:: public static boolean removeBlockAt(World world, BlockPos blockPos)
   :outertype: BlocksWrapper

   Removes the block ate the given \ :java:ref:`position <BlockPos>`\ . This is done by setting it to air.

   :param world: The world we're operating in.
   :param blockPos: The position at which the block is removed.
   :return: If the block was successfully removed.

   **See also:** :java:ref:`World.setBlockToAir(BlockPos)`

removeBlockAt
^^^^^^^^^^^^^

.. java:method:: public static boolean removeBlockAt(World world, double x, double y, double z)
   :outertype: BlocksWrapper

   Removes the block at the given position. This is done by setting it to air.

   :param world: The world we're operating in.
   :param x: The x coordinate of the blocks position.
   :param y: The y coordinate of the blocks position.
   :param z: The z coordinate of the blocks position.
   :return: If the block was successfully removed.

   **See also:** :java:ref:`World.setBlockToAir(BlockPos)`, :java:ref:`.removeBlockAt(World,BlockPos)`

