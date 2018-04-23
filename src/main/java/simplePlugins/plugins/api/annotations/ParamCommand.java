package simplePlugins.plugins.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 23 of April 2018
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = METHOD)
public @interface ParamCommand {
    String name();
    String usage();
    String[] paramsUsage();
}
