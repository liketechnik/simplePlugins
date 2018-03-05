package simplePlugins.plugins.api.wrapper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * Provides static wrapper methods for the {@link EntityLivingBase}, i. e. probably the
 * {@link net.minecraft.entity.player.EntityPlayer Player} class. These methods
 * provide easier access to some functions.
 *
 * @author Florian Warzecha
 * @version 1.0
 * @date 16 of Februar 2018
 */
public class EntityWrapper {
    
    /**
     * Teleports the entity to the given coordinates.
     * @param entity  The entity instance to port.
     * @param x The x coordinate of the new position.
     * @param y The y coordinate of the new position.
     * @param z The z coordinate of the new position.
     * @see EntityLivingBase#setPosition(double, double, double)
     */
    public static void forceTeleport(EntityLivingBase entity, double x, double y, double z) {
        entity.setPositionAndUpdate(x, y, z);
    }
    
    /**
     * Teleports the entity to the given {@link BlockPos}.
     * @param entity The entity instance to port.
     * @param pos The position where the entity is ported to.
     * @see EntityLivingBase#setPosition(double, double, double)
     * @see EntityWrapper#forceTeleport(EntityLivingBase, double, double, double)
     */
    public static void forceTeleport(EntityLivingBase entity, BlockPos pos) {
        forceTeleport(entity, pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Attempts to teleport the entity to the given {@link BlockPos}.
     * @param entity The entity instance to port.
     * @param pos The position where the entity is ported to.
     * @return If the teleport succeeded.
     * @see EntityLivingBase#attemptTeleport(double, double, double)
     */
    public static boolean attemptTeleport(EntityLivingBase entity, BlockPos pos) {
        return entity.attemptTeleport(pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Sends a message to the given player.
     * The color can be controlled by passing a field from {@link TextFormatting}.
     * If you want for example black text color, pass {@link TextFormatting#BLACK} for the
     * color parameter.
     * @param entity The player instance.
     * @param message The message you want to send.
     * @param color The color of the message.
     * @see EntityPlayer#sendMessage(ITextComponent)
     */
    public static void sendMessage(EntityPlayer entity, String message, TextFormatting color) {
        ITextComponent textComponent = new TextComponentString(message);
        Style style = new Style();
        style.setColor(color);
        textComponent.setStyle(style);
        entity.sendMessage(textComponent);
    }
    
    /**
     * Sends a message to the given player.
     * The color defaults to the usual white chat color.
     * @param entity The player instance.
     * @param message The message you want to send.
     * @see EntityPlayer#sendMessage(ITextComponent)
     * @see #sendMessage(EntityPlayer, String, TextFormatting) Send messages in different colors
     */
    public static void sendMessage(EntityPlayer entity, String message) {
        sendMessage(entity, message, TextFormatting.WHITE);
    }
    
    /**
     * Send a message to all players online.
     * @param world The world instance.
     * @param message The message you want to send.
     * @param color The color of the message.
     * @see net.minecraft.server.management.PlayerList#sendMessage(ITextComponent)
     * @see #sendMessage(EntityPlayer, String, TextFormatting) how to set colors
     */
    public static void broadcastMessage(World world, String message, TextFormatting color) {
        ITextComponent textComponent = new TextComponentString(message);
        Style style = new Style();
        style.setColor(color);
        textComponent.setStyle(style);
        world.getMinecraftServer().getPlayerList().sendMessage(textComponent);
    }
    
    /**
     * Send a message to all players online.
     * The color of the message defaults to the usual white chat color.
     * @param world The world instance.
     * @param message The message you want to send.
     * @see net.minecraft.server.management.PlayerList#sendMessage(ITextComponent)
     * @see #broadcastMessage(World, String, TextFormatting)
     */
    public static void broadcastMessage(World world, String message) {
        broadcastMessage(world, message, TextFormatting.WHITE);
    }
}
