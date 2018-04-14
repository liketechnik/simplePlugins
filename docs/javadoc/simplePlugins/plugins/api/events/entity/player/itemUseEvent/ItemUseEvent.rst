.. java:import:: net.minecraftforge.event.entity.player PlayerInteractEvent

.. java:import:: simplePlugins.plugins.api.events.entity.player PlayerInteractEventWrapper

.. java:import:: simplePlugins.plugins.api.wrappers WorldWrapper

ItemUseEvent
============

.. java:package:: simplePlugins.plugins.api.events.entity.player.itemUseEvent
   :noindex:

.. java:type:: public class ItemUseEvent extends PlayerInteractEventWrapper

   :author: Florian Warzecha

Constructors
------------
ItemUseEvent
^^^^^^^^^^^^

.. java:constructor:: public ItemUseEvent(PlayerInteractEvent.RightClickItem event)
   :outertype: ItemUseEvent

Methods
-------
getConverter
^^^^^^^^^^^^

.. java:method:: public static Class<?> getConverter()
   :outertype: ItemUseEvent

getUnwrapped
^^^^^^^^^^^^

.. java:method:: @Override public PlayerInteractEvent.RightClickItem getUnwrapped()
   :outertype: ItemUseEvent

getWorld
^^^^^^^^

.. java:method:: public WorldWrapper getWorld()
   :outertype: ItemUseEvent

