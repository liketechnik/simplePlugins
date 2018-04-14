.. java:import:: net.minecraftforge.event.entity.living LivingEvent

.. java:import:: simplePlugins.plugins.api.events.entity EntityEventWrapper

.. java:import:: simplePlugins.plugins.api.wrappers.entity EntityLivingBaseWrapper

LivingEventWrapper
==================

.. java:package:: simplePlugins.plugins.api.events.entity.living
   :noindex:

.. java:type:: public class LivingEventWrapper extends EntityEventWrapper

   :author: Florian Warzecha

Constructors
------------
LivingEventWrapper
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public LivingEventWrapper(LivingEvent event)
   :outertype: LivingEventWrapper

Methods
-------
getEntityLiving
^^^^^^^^^^^^^^^

.. java:method:: public EntityLivingBaseWrapper getEntityLiving()
   :outertype: LivingEventWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: @Override public LivingEvent getUnwrapped()
   :outertype: LivingEventWrapper

