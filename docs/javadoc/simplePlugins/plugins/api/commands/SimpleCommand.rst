.. java:import:: net.minecraft.command CommandBase

.. java:import:: net.minecraft.command CommandException

.. java:import:: net.minecraft.command ICommandSender

.. java:import:: net.minecraft.entity.player EntityPlayer

.. java:import:: net.minecraft.server MinecraftServer

.. java:import:: simplePlugins.plugins.api Plugin

.. java:import:: simplePlugins.plugins.api.wrappers EntityPlayerWrapper

.. java:import:: java.lang.reflect InvocationTargetException

.. java:import:: java.lang.reflect Method

SimpleCommand
=============

.. java:package:: simplePlugins.plugins.api.commands
   :noindex:

.. java:type:: public class SimpleCommand extends CommandBase

   :author: Florian Warzecha

Fields
------
command
^^^^^^^

.. java:field:: protected Method command
   :outertype: SimpleCommand

name
^^^^

.. java:field:: protected String name
   :outertype: SimpleCommand

plugin
^^^^^^

.. java:field:: protected Plugin plugin
   :outertype: SimpleCommand

usage
^^^^^

.. java:field:: protected String usage
   :outertype: SimpleCommand

Constructors
------------
SimpleCommand
^^^^^^^^^^^^^

.. java:constructor:: public SimpleCommand(String name, String usage, Method command, Plugin plugin)
   :outertype: SimpleCommand

Methods
-------
execute
^^^^^^^

.. java:method:: @Override public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
   :outertype: SimpleCommand

getName
^^^^^^^

.. java:method:: @Override public String getName()
   :outertype: SimpleCommand

getPlugin
^^^^^^^^^

.. java:method:: public Plugin getPlugin()
   :outertype: SimpleCommand

getUsage
^^^^^^^^

.. java:method:: @Override public String getUsage(ICommandSender sender)
   :outertype: SimpleCommand

