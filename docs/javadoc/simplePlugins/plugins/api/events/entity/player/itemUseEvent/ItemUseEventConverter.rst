.. java:import:: net.minecraftforge.event.entity.player PlayerInteractEvent

.. java:import:: net.minecraftforge.fml.common.eventhandler SubscribeEvent

.. java:import:: simplePlugins.plugins.api Plugin

.. java:import:: java.lang.reflect InvocationTargetException

.. java:import:: java.lang.reflect Method

ItemUseEventConverter
=====================

.. java:package:: simplePlugins.plugins.api.events.entity.player.itemUseEvent
   :noindex:

.. java:type:: public class ItemUseEventConverter

   :author: Florian Warzecha

Constructors
------------
ItemUseEventConverter
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ItemUseEventConverter(Method eventReceiver, Plugin plugin)
   :outertype: ItemUseEventConverter

Methods
-------
onItemUse
^^^^^^^^^

.. java:method:: @SubscribeEvent public void onItemUse(PlayerInteractEvent.RightClickItem event)
   :outertype: ItemUseEventConverter

