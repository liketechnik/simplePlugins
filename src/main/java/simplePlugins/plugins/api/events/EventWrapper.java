package simplePlugins.plugins.api.events;

import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 05 of April 2018
 */
public class EventWrapper {
    
    private Event event;
    
    public EventWrapper(Event event) {
        this.event = event;
    }
    
    public void cancel() {
        if (event.isCancelable()) {
            event.setCanceled(true);
        }
    }
    
    public boolean isCancelable() {
        return event.isCancelable();
    }
    
    public Event getUnwrapped() {
        return this.event;
    }
}
