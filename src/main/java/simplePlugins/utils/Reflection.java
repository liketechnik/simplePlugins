package simplePlugins.utils;

import java.lang.reflect.Method;

/**
 * @author Florian Warzecha
 * @version 1.0
 * @date 23 of April 2018
 */
public class Reflection {
    
    public static boolean checkParams(Method method, Class... expectedParams) {
        if (method.getParameterCount() != expectedParams.length) {
            return false;
        }
        
        Class[] actualParams = method.getParameterTypes();
        for (int i = 0; i < expectedParams.length; i++) {
            if (!actualParams[i].equals(expectedParams[i])) {
                return false;
            }
        }
        
        return true;
    }
    
}
