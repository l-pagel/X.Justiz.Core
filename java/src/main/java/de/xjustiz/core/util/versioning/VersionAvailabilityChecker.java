package de.xjustiz.core.util.versioning;

import java.lang.reflect.AnnotatedElement;

/**
 * Hilfsmethoden zur Überprüfung der Versionsverfügbarkeit.<br/>
 * <u><b>Version availability checker:</b></u> Helper methods for checking
 * version availability.
 */
public final class VersionAvailabilityChecker {

    private VersionAvailabilityChecker() {
        // Utility class
    }

    /**
     * Checks if the annotated element is available in the specified X.Justiz
     * version.
     * 
     * @param element the annotated element (class, method, or field)
     * @param version the target version
     * @return true if available, false otherwise
     */
    public static boolean isAvailableIn(AnnotatedElement element, XJustizVersion version) {
        XJustizAvailability availability = element.getAnnotation(XJustizAvailability.class);
        if (availability == null) {
            return true; // No annotation means always available
        }
        return isAvailable(version.getValue(), availability.introduced().getValue(),
                availability.removed() == XJustizVersion.NONE ? 0 : availability.removed().getValue());
    }

    /**
     * Checks if the annotated element is available in the specified X.Justiz Core
     * version.
     * 
     * @param element the annotated element (class, method, or field)
     * @param version the target version
     * @return true if available, false otherwise
     */
    public static boolean isAvailableIn(AnnotatedElement element, XJustizCoreVersion version) {
        XJustizCoreAvailability availability = element.getAnnotation(XJustizCoreAvailability.class);
        if (availability == null) {
            return true; // No annotation means always available
        }
        int removedValue = availability.isRemoved() ? availability.removed().getValue() : 0;
        return isAvailable(version.getValue(), availability.introduced().getValue(), removedValue);
    }

    /**
     * Checks if an element is available based on raw version values.
     * 
     * @param targetVersion     the target version value
     * @param introducedVersion the version when introduced
     * @param removedVersion    the version when removed (0 if not removed)
     * @return true if available
     */
    public static boolean isAvailable(int targetVersion, int introducedVersion, int removedVersion) {
        if (targetVersion < introducedVersion) {
            return false;
        }
        return removedVersion == 0 || targetVersion < removedVersion;
    }
}
