.. java:import:: net.minecraft.command ICommand

.. java:import:: net.minecraftforge.fml.common.event FMLServerStartingEvent

.. java:import:: org.apache.logging.log4j Logger

Plugin
======

.. java:package:: simplePlugins.plugins.api
   :noindex:

.. java:type:: public abstract class Plugin

   :author: Florian Warzecha

Fields
------
logger
^^^^^^

.. java:field:: public Logger logger
   :outertype: Plugin

Constructors
------------
Plugin
^^^^^^

.. java:constructor:: public Plugin(String name)
   :outertype: Plugin

Methods
-------
getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: Plugin

registerCommandClasses
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void registerCommandClasses(FMLServerStartingEvent event)
   :outertype: Plugin

   This is called during registration of commands. Allows the registration of own command \ *classes*\  via the \ :java:ref:`net.minecraftforge.fml.common.event.FMLServerStartingEvent.registerServerCommand(ICommand)`\  method.

registerEventClasses
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void registerEventClasses()
   :outertype: Plugin

   This is called during registration of events. Allows the registration of own event \ *classes*\  via the \ :java:ref:`net.minecraftforge.fml.common.eventhandler.EventBus.register(Object)`\  method. Call this method on the following instance: \ :java:ref:`net.minecraftforge.common.MinecraftForge.EVENT_BUS`\

setLogger
^^^^^^^^^

.. java:method:: public void setLogger(Logger logger)
   :outertype: Plugin

