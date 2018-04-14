.. java:import:: net.minecraft.entity Entity

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.util.text ITextComponent

.. java:import:: net.minecraft.util.text Style

.. java:import:: net.minecraft.util.text TextComponentString

.. java:import:: net.minecraft.util.text TextFormatting

.. java:import:: simplePlugins.plugins.api.wrappers WorldWrapper

EntityWrapper
=============

.. java:package:: simplePlugins.plugins.api.wrappers.entity
   :noindex:

.. java:type:: public class EntityWrapper

   :author: Florian Warzecha

Constructors
------------
EntityWrapper
^^^^^^^^^^^^^

.. java:constructor:: public EntityWrapper(Entity entity)
   :outertype: EntityWrapper

Methods
-------
forceTeleport
^^^^^^^^^^^^^

.. java:method:: public void forceTeleport(double x, double y, double z)
   :outertype: EntityWrapper

forceTeleport
^^^^^^^^^^^^^

.. java:method:: public void forceTeleport(BlockPos pos)
   :outertype: EntityWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: public Entity getUnwrapped()
   :outertype: EntityWrapper

getWorld
^^^^^^^^

.. java:method:: public WorldWrapper getWorld()
   :outertype: EntityWrapper

sendMessageTo
^^^^^^^^^^^^^

.. java:method:: public void sendMessageTo(String message, TextFormatting color)
   :outertype: EntityWrapper

sendMessageTo
^^^^^^^^^^^^^

.. java:method:: public void sendMessageTo(String message)
   :outertype: EntityWrapper

