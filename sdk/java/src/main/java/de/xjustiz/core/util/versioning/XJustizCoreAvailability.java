package de.xjustiz.core.util.versioning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Legt die Verfügbarkeit basierend auf der X.Justiz Core-Version fest.<br/>
 * <u><b>XJustiz core availability annotation:</b></u> Defines availability
 * based on the XJustiz Core version.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface XJustizCoreAvailability {
    /**
     * The version in which this element was introduced.
     * 
     * @return the introduced version
     */
    XJustizCoreVersion introduced();

    /**
     * The version in which this element was removed (optional).
     * If not set, the element is still available.
     * 
     * @return the removed version, or V0_2_0 as default (meaning not removed if
     *         introduced >= V0_2_0)
     */
    XJustizCoreVersion removed() default XJustizCoreVersion.V0_2_0;

    /**
     * Indicates if the removed() value should be considered.
     * 
     * @return true if the element has been removed
     */
    boolean isRemoved() default false;
}
