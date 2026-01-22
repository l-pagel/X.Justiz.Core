package de.xjustiz.core.util.versioning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Markiert Elemente, die nur zu Testzwecken dienen.<br/>
 * <u><b>For testing only annotation:</b></u> Marks elements intended for
 * testing purposes only.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface ForTestingOnly {
    /**
     * Optional reason for why this is for testing only.
     * 
     * @return the reason
     */
    String reason() default "";
}
