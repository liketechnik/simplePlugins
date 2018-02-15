package simplePlugins.plugins.api;

import org.apache.logging.log4j.Logger;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
public class Plugin {
    private String name;
    public Logger logger;
    
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Plugin(String name) {
        this.name = name;
    }
}
