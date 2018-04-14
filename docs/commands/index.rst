Commands with SimplePlugins
===========================

With commands you can make minecraft do something, everytime a player uses your command. In this part of the documentation, your are going to 
learn how to create commands with SimplePlugins.

Your first command
------------------

If you have already setup your plugin, you are ready to create your first command now. If you did not setup your plugin yet and need help with it,
take a look at :doc:`/gettingstarted/index`.

In this tutorial, we are going to explain the creation of the command steyp by step. In the tutorials that enlarge the topic commands, we will show you
the whole command and only explain the new parts.

To begin with the creation of your command, open your plugin's main class. Add a method starting with the name of your command and ending with 
``Command``, that return nothing and takes a :java:extdoc:`simplePlugins.plugins.api.wrappers.EntityPlayerWrapper`:

.. code-block:: java
