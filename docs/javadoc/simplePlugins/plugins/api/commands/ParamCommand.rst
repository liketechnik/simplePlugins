.. java:import:: net.minecraft.command CommandException

.. java:import:: net.minecraft.command ICommandSender

.. java:import:: net.minecraft.entity.player EntityPlayer

.. java:import:: net.minecraft.server MinecraftServer

.. java:import:: simplePlugins.plugins.api Plugin

.. java:import:: simplePlugins.plugins.api.wrappers EntityPlayerWrapper

.. java:import:: java.lang.reflect InvocationTargetException

.. java:import:: java.lang.reflect Method

ParamCommand
============

.. java:package:: simplePlugins.plugins.api.commands
   :noindex:

.. java:type:: public class ParamCommand extends SimpleCommand

   :author: Florian Warzecha

Constructors
------------
ParamCommand
^^^^^^^^^^^^

.. java:constructor:: public ParamCommand(String name, String usage, String[] paramsUsage, Method command, Plugin plugin)
   :outertype: ParamCommand

Methods
-------
execute
^^^^^^^

.. java:method:: @Override public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
   :outertype: ParamCommand

getUsage
^^^^^^^^

.. java:method:: @Override public String getUsage(ICommandSender sender)
   :outertype: ParamCommand

