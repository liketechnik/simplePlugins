.. java:import:: net.minecraft.entity EntityLivingBase

.. java:import:: net.minecraft.entity.player EntityPlayer

.. java:import:: net.minecraft.server MinecraftServer

.. java:import:: net.minecraft.util.math BlockPos

.. java:import:: net.minecraft.util.text ITextComponent

.. java:import:: net.minecraft.util.text Style

.. java:import:: net.minecraft.util.text TextComponentString

.. java:import:: net.minecraft.util.text TextFormatting

.. java:import:: net.minecraft.world World

EntityWrapper
=============

.. java:package:: simplePlugins.plugins.api.wrapper
   :noindex:

.. java:type:: public class EntityWrapper

   Provides static wrapper methods for the \ :java:ref:`EntityLivingBase`\ , i. e. probably the \ :java:ref:`Player <net.minecraft.entity.player.EntityPlayer>`\  class. These methods provide easier access to some functions.

   :author: Florian Warzecha

Methods
-------
attemptTeleport
^^^^^^^^^^^^^^^

.. java:method:: public static boolean attemptTeleport(EntityLivingBase entity, BlockPos pos)
   :outertype: EntityWrapper

   Attempts to teleport the entity to the given \ :java:ref:`BlockPos`\ .

   :param entity: The entity instance to port.
   :param pos: The position where the entity is ported to.
   :return: If the teleport succeeded.

   **See also:** :java:ref:`EntityLivingBase.attemptTeleport(double,double,double)`

broadcastMessage
^^^^^^^^^^^^^^^^

.. java:method:: public static void broadcastMessage(World world, String message, TextFormatting color)
   :outertype: EntityWrapper

   Send a message to all players online.

   :param world: The world instance.
   :param message: The message you want to send.
   :param color: The color of the message.

   **See also:** :java:ref:`net.minecraft.server.management.PlayerList.sendMessage(ITextComponent)`, :java:ref:`.sendMessage(EntityPlayer,String,TextFormatting)howtosetcolors`

broadcastMessage
^^^^^^^^^^^^^^^^

.. java:method:: public static void broadcastMessage(World world, String message)
   :outertype: EntityWrapper

   Send a message to all players online. The color of the message defaults to the usual white chat color.

   :param world: The world instance.
   :param message: The message you want to send.

   **See also:** :java:ref:`net.minecraft.server.management.PlayerList.sendMessage(ITextComponent)`, :java:ref:`.broadcastMessage(World,String,TextFormatting)`

forceTeleport
^^^^^^^^^^^^^

.. java:method:: public static void forceTeleport(EntityLivingBase entity, double x, double y, double z)
   :outertype: EntityWrapper

   Teleports the entity to the given coordinates.

   :param entity: The entity instance to port.
   :param x: The x coordinate of the new position.
   :param y: The y coordinate of the new position.
   :param z: The z coordinate of the new position.

   **See also:** :java:ref:`EntityLivingBase.setPosition(double,double,double)`

forceTeleport
^^^^^^^^^^^^^

.. java:method:: public static void forceTeleport(EntityLivingBase entity, BlockPos pos)
   :outertype: EntityWrapper

   Teleports the entity to the given \ :java:ref:`BlockPos`\ .

   :param entity: The entity instance to port.
   :param pos: The position where the entity is ported to.

   **See also:** :java:ref:`EntityLivingBase.setPosition(double,double,double)`, :java:ref:`EntityWrapper.forceTeleport(EntityLivingBase,double,double,double)`

sendMessage
^^^^^^^^^^^

.. java:method:: public static void sendMessage(EntityPlayer entity, String message, TextFormatting color)
   :outertype: EntityWrapper

   Sends a message to the given player. The color can be controlled by passing a field from \ :java:ref:`TextFormatting`\ . If you want for example black text color, pass \ :java:ref:`TextFormatting.BLACK`\  for the color parameter.

   :param entity: The player instance.
   :param message: The message you want to send.
   :param color: The color of the message.

   **See also:** :java:ref:`EntityPlayer.sendMessage(ITextComponent)`

sendMessage
^^^^^^^^^^^

.. java:method:: public static void sendMessage(EntityPlayer entity, String message)
   :outertype: EntityWrapper

   Sends a message to the given player. The color defaults to the usual white chat color.

   :param entity: The player instance.
   :param message: The message you want to send.

   **See also:** :java:ref:`EntityPlayer.sendMessage(ITextComponent)`, :java:ref:`.sendMessage(EntityPlayer,String,TextFormatting)Sendmessagesindifferentcolors`

