.. java:import:: net.minecraft.entity Entity

.. java:import:: net.minecraftforge.event.entity EntityEvent

.. java:import:: simplePlugins.plugins.api.events EventWrapper

.. java:import:: simplePlugins.plugins.api.wrappers.entity EntityWrapper

EntityEventWrapper
==================

.. java:package:: simplePlugins.plugins.api.events.entity
   :noindex:

.. java:type:: public class EntityEventWrapper extends EventWrapper

   :author: Florian Warzecha

Constructors
------------
EntityEventWrapper
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EntityEventWrapper(EntityEvent event)
   :outertype: EntityEventWrapper

Methods
-------
getEntity
^^^^^^^^^

.. java:method:: public EntityWrapper getEntity()
   :outertype: EntityEventWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: @Override public EntityEvent getUnwrapped()
   :outertype: EntityEventWrapper

