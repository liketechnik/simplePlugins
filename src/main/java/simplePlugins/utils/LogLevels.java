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
    
    public static void enableDebugLog(String appender) {
        Logger logger = SimplePluginsMod.instance.logger;
    
        AppenderRef refConsoleLog = AppenderRef.createAppenderRef(appender, Level.ALL, null);
    
        LoggerConfig loggerConfig = LoggerConfig.createLogger(false, Level.ALL,
                SimplePluginsMod.MODID, "true",
                new AppenderRef[]{refConsoleLog}, null,
                logger.getContext().getConfiguration(), null);
    
        loggerConfig.addAppender(logger.getAppenders().get(appender), Level.ALL, null);
    
        logger.getContext().getConfiguration().addLogger(SimplePluginsMod.MODID, loggerConfig);
        logger.getContext().updateLoggers();
    }
}
