package simplePlugins.utils;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.config.AppenderRef;
import org.apache.logging.log4j.core.config.LoggerConfig;
import simplePlugins.SimplePluginsMod;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 14 of Februar 2018
 */
public enum LogLevels {
    
    DEBUG(Level.DEBUG),
    INFO(Level.INFO),
    WARN(Level.WARN);
    
    private final Level level;
    
    LogLevels(Level level) {
        this.level = level;
    }
   
    public Level getLevel() {
        return level;
    }
}
