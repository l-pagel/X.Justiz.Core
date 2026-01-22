package de.xjustiz.core.util.versioning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Legt die Verfügbarkeit basierend auf der XJustiz-Version fest.<br/>
 * <u><b>XJustiz availability annotation:</b></u> Defines availability based on
 * the XJustiz version.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface XJustizAvailability {
    /**
     * The version in which this element was introduced.
     * 
     * @return the introduced version
     */
    XJustizVersion introduced();

    /**
     * The version in which this element was removed (optional).
     * If not set (NONE), the element is still available.
     * 
     * @return the removed version, or NONE if still available
     */
    XJustizVersion removed() default XJustizVersion.NONE;
}
