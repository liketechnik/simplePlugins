.. java:import:: net.minecraft.block Block

.. java:import:: net.minecraft.block.state IBlockState

.. java:import:: net.minecraft.entity Entity

.. java:import:: net.minecraft.init Blocks

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.world World

WorldWrapper
============

.. java:package:: simplePlugins.plugins.api.wrappers
   :noindex:

.. java:type:: public class WorldWrapper

   :author: Florian Warzecha

Constructors
------------
WorldWrapper
^^^^^^^^^^^^

.. java:constructor:: public WorldWrapper(World world)
   :outertype: WorldWrapper

Methods
-------
attemptSetBlock
^^^^^^^^^^^^^^^

.. java:method:: public boolean attemptSetBlock(Block block, BlockPos pos)
   :outertype: WorldWrapper

attemptSetBlock
^^^^^^^^^^^^^^^

.. java:method:: public boolean attemptSetBlock(Block block, double x, double y, double z)
   :outertype: WorldWrapper

forceSetBlock
^^^^^^^^^^^^^

.. java:method:: public boolean forceSetBlock(Block block, BlockPos pos)
   :outertype: WorldWrapper

forceSetBlock
^^^^^^^^^^^^^

.. java:method:: public boolean forceSetBlock(Block block, double x, double y, double z)
   :outertype: WorldWrapper

getBlockAt
^^^^^^^^^^

.. java:method:: public Block getBlockAt(BlockPos pos)
   :outertype: WorldWrapper

getBlockAt
^^^^^^^^^^

.. java:method:: public Block getBlockAt(double x, double y, double z)
   :outertype: WorldWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: public World getUnwrapped()
   :outertype: WorldWrapper

isBlockAt
^^^^^^^^^

.. java:method:: public boolean isBlockAt(BlockPos pos)
   :outertype: WorldWrapper

isBlockAt
^^^^^^^^^

.. java:method:: public boolean isBlockAt(double x, double y, double z)
   :outertype: WorldWrapper

removeBlockAt
^^^^^^^^^^^^^

.. java:method:: public boolean removeBlockAt(BlockPos pos)
   :outertype: WorldWrapper

removeBlockAt
^^^^^^^^^^^^^

.. java:method:: public boolean removeBlockAt(double x, double y, double z)
   :outertype: WorldWrapper

spawnEntity
^^^^^^^^^^^

.. java:method:: public boolean spawnEntity(Entity entity, double x, double y, double z)
   :outertype: WorldWrapper

spawnEntity
^^^^^^^^^^^

.. java:method:: public boolean spawnEntity(Entity entity, BlockPos pos)
   :outertype: WorldWrapper

