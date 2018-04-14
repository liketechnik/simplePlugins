.. java:import:: net.minecraftforge.event.entity.player PlayerEvent

.. java:import:: simplePlugins.plugins.api.events.entity.living LivingEventWrapper

.. java:import:: simplePlugins.plugins.api.wrappers EntityPlayerWrapper

PlayerEventWrapper
==================

.. java:package:: simplePlugins.plugins.api.events.entity.player
   :noindex:

.. java:type:: public class PlayerEventWrapper extends LivingEventWrapper

   :author: Florian Warzecha

Constructors
------------
PlayerEventWrapper
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PlayerEventWrapper(PlayerEvent event)
   :outertype: PlayerEventWrapper

Methods
-------
getEntityPlayer
^^^^^^^^^^^^^^^

.. java:method:: public EntityPlayerWrapper getEntityPlayer()
   :outertype: PlayerEventWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: @Override public PlayerEvent getUnwrapped()
   :outertype: PlayerEventWrapper

