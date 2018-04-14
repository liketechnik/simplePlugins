.. java:import:: net.minecraft.item ItemStack

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.world World

.. java:import:: net.minecraftforge.event.entity.player PlayerInteractEvent

.. java:import:: net.minecraftforge.fml.relauncher Side

PlayerInteractEventWrapper
==========================

.. java:package:: simplePlugins.plugins.api.events.entity.player
   :noindex:

.. java:type:: public class PlayerInteractEventWrapper extends PlayerEventWrapper

   :author: Florian Warzecha

Fields
------
event
^^^^^

.. java:field::  PlayerInteractEvent event
   :outertype: PlayerInteractEventWrapper

Constructors
------------
PlayerInteractEventWrapper
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PlayerInteractEventWrapper(PlayerInteractEvent event)
   :outertype: PlayerInteractEventWrapper

Methods
-------
getUnwrapped
^^^^^^^^^^^^

.. java:method:: public PlayerInteractEvent getUnwrapped()
   :outertype: PlayerInteractEventWrapper

