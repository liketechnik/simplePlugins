package simplePlugins.plugins.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 16 of Februar 2018
 */
@Retention(value = RUNTIME)
@Target(value = METHOD)
public @interface SimpleCommand {
    String name();
    String usage();
}
