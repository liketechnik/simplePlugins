.. java:import:: net.minecraft.entity EntityLivingBase

EntityLivingBaseWrapper
=======================

.. java:package:: simplePlugins.plugins.api.wrappers.entity
   :noindex:

.. java:type:: public class EntityLivingBaseWrapper extends EntityWrapper

   :author: Florian Warzecha

Constructors
------------
EntityLivingBaseWrapper
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EntityLivingBaseWrapper(EntityLivingBase entity)
   :outertype: EntityLivingBaseWrapper

Methods
-------
addHealth
^^^^^^^^^

.. java:method:: public void addHealth(float amount)
   :outertype: EntityLivingBaseWrapper

getUnwrapped
^^^^^^^^^^^^

.. java:method:: @Override public EntityLivingBase getUnwrapped()
   :outertype: EntityLivingBaseWrapper

kill
^^^^

.. java:method:: public void kill()
   :outertype: EntityLivingBaseWrapper

