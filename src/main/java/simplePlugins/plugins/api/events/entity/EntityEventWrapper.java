package simplePlugins.plugins.api.events.entity;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.EntityEvent;
import simplePlugins.plugins.api.events.EventWrapper;
import simplePlugins.plugins.api.wrappers.entity.EntityWrapper;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 06 of April 2018
 */
public class EntityEventWrapper extends EventWrapper {
    
    private EntityEvent event;
    private EntityWrapper entityWrapper;
    
    public EntityEventWrapper(EntityEvent event) {
        super(event);
        this.event = event;
        this.entityWrapper = new EntityWrapper(event.getEntity());
    }
    
    public EntityWrapper getEntity() {
        return this.entityWrapper;
    }
    
    @Override
    public EntityEvent getUnwrapped() {
        return event;
    }
}
