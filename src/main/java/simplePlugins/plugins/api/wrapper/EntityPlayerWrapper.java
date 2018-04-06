package simplePlugins.plugins.api.wrapper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 02 of April 2018
 */
public class EntityPlayerWrapper {
    
    private EntityPlayer player;
    
    public EntityPlayerWrapper(EntityPlayer player) {
        this.player = player;
    }
    
    public EntityPlayer getUnwrapped() {
        return player;
    }
    
    public void forceTeleport(double x, double y, double z) {
//        this.executeMethod("setPositionAndUpdate", new Class[]{Double.class, Double.class, Double.class}, x, y, z);
        player.setPositionAndUpdate(x, y, z);
    }
    
    public void forceTeleport(BlockPos position) {
        this.forceTeleport(position.getX(), position.getY(), position.getZ());
        player.setPositionAndUpdate(position.getX(), position.getY(), position.getZ());
    }
    
    public void sendMessageTo(String message, TextFormatting color) {
        ITextComponent textComponent = new TextComponentString(message);
        Style style = new Style();
        style.setColor(color);
        textComponent.setStyle(style);
//        this.executeMethod("sendMessage", new Class[]{ITextComponent.class}, textComponent);
        player.sendMessage(textComponent);
    }
    
    public void sendMessageTo(String message) {
        this.sendMessageTo(message, TextFormatting.WHITE);
    }
}
