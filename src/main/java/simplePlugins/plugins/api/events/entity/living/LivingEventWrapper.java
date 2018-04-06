package simplePlugins.plugins.api.events.entity.living;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent;
import simplePlugins.plugins.api.events.entity.EntityEventWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class LivingEventWrapper extends EntityEventWrapper {
    
    private LivingEvent event;
    
    public LivingEventWrapper(LivingEvent event) {
        super(event);
        this.event = event;
    }
    
    public EntityLivingBase getEntityLiving() {
        return this.event.getEntityLiving();
    }
    
    @Override
    public LivingEvent getUnwrapped() {
        return this.event;
    }
}
