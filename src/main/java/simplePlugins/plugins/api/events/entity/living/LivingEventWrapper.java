package simplePlugins.plugins.api.events.entity.living;

import net.minecraftforge.event.entity.living.LivingEvent;
import simplePlugins.plugins.api.events.entity.EntityEventWrapper;
import simplePlugins.plugins.api.wrappers.entity.EntityLivingBaseWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class LivingEventWrapper extends EntityEventWrapper {
    
    private LivingEvent event;
    private EntityLivingBaseWrapper entityLivingBaseWrapper;
    
    public LivingEventWrapper(LivingEvent event) {
        super(event);
        this.event = event;
        this.entityLivingBaseWrapper = new EntityLivingBaseWrapper(event.getEntityLiving());
    }
    
    public EntityLivingBaseWrapper getEntityLiving() {
        return this.entityLivingBaseWrapper;
    }
    
    @Override
    public LivingEvent getUnwrapped() {
        return this.event;
    }
}
