package simplePlugins.plugins.api.wrappers.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class EntityWrapper {
    
    private Entity entity;
    
    public EntityWrapper(Entity entity) {
        this.entity = entity;
    }
    
    public Entity getUnwrapped() {
        return this.entity;
    }
    
    public void forceTeleport(double x, double y, double z) {
        this.entity.setPositionAndUpdate(x, y, z);
    }
    
    public void forceTeleport(BlockPos pos) {
        this.entity.setPositionAndUpdate(pos.getX(), pos.getY(), pos.getZ());
    }
    
    public void sendMessageTo(String message, TextFormatting color) {
        ITextComponent textComponent = new TextComponentString(message);
        Style style = new Style();
        style.setColor(color);
        textComponent.setStyle(style);
        this.entity.sendMessage(textComponent);
    }
    
    public void sendMessageTo(String message) {
        this.sendMessageTo(message, TextFormatting.WHITE);
    }
}
