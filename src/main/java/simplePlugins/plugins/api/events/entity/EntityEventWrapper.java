package simplePlugins.plugins.api.events.entity;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.EntityEvent;
import simplePlugins.plugins.api.events.EventWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class EntityEventWrapper extends EventWrapper {
    
    private EntityEvent event;
    
    public EntityEventWrapper(EntityEvent event) {
        super(event);
        this.event = event;
    }
    
    public Entity getEntity() {
        return this.event.getEntity();
    }
    
    @Override
    public EntityEvent getUnwrapped() {
        return event;
    }
}
