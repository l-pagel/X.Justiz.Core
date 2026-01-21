package de.xjustiz.core.util.versioning;

import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Überprüft die Kompatibilität von X.Justiz-Nachrichten mit verschiedenen
 * X.Justiz- und X.Justiz Core Versionen.<br/>
 * <u><b>Compatibility Checker:</b></u> Checks the compatibility of X.Justiz
 * messages with different X.Justiz and X.Justiz Core versions.
 */
public final class CompatibilityChecker {

    private CompatibilityChecker() {
        // Utility class
    }

    /**
     * Überprüft die Kompatibilität der übergebenen Nachricht.<br/>
     * <u><b>Check compatibility:</b></u> Checks the compatibility of the provided
     * message.
     * 
     * @param model Die zu prüfende Nachricht. / The message to check.
     * @return Das Ergebnis der Kompatibilitätsprüfung. / The result of the
     *         compatibility check.
     */
    public static CompatibilityResult check(UebermittlungSchriftgutobjekteNachricht model) {
        // Start with all known versions (excluding NONE for XJustiz and testing
        // versions for Core)
        List<XJustizVersion> xVersions = Arrays.stream(XJustizVersion.values())
                .filter(v -> v != XJustizVersion.NONE)
                .collect(Collectors.toCollection(ArrayList::new));

        List<XJustizCoreVersion> xCoreVersions = Arrays.stream(XJustizCoreVersion.values())
                .filter(v -> !v.isForTestingOnly())
                .collect(Collectors.toCollection(ArrayList::new));

        checkObject(model, xVersions, xCoreVersions);

        return new CompatibilityResult(xVersions, xCoreVersions);
    }

    private static void checkObject(Object obj, List<XJustizVersion> xVersions,
            List<XJustizCoreVersion> xCoreVersions) {
        if (obj == null) {
            return;
        }

        if (xVersions.isEmpty() && xCoreVersions.isEmpty()) {
            return;
        }

        Class<?> type = obj.getClass();

        // Check Class Annotations (only for our models)
        if (isXJustizModel(type)) {
            applyAnnotations(type, xVersions, xCoreVersions);
        }

        checkFields(obj, xVersions, xCoreVersions);
    }

    private static void checkFields(Object obj, List<XJustizVersion> xVersions,
            List<XJustizCoreVersion> xCoreVersions) {
        Class<?> type = obj.getClass();

        // Check all declared fields and inherited fields
        List<Field> allFields = getAllFields(type);

        for (Field field : allFields) {
            field.setAccessible(true);
            Object value = getFieldValue(field, obj);

            if (value != null) {
                applyAnnotations(field, xVersions, xCoreVersions);
                checkValueRecursively(value, xVersions, xCoreVersions);
            }

            // Optimization: Stop if no versions left
            if (xVersions.isEmpty() && xCoreVersions.isEmpty()) {
                return;
            }
        }
    }

    private static List<Field> getAllFields(Class<?> type) {
        List<Field> fields = new ArrayList<>();
        Class<?> current = type;
        // Only traverse our model classes, not JDK classes
        while (current != null && current != Object.class && isXJustizModel(current)) {
            fields.addAll(Arrays.asList(current.getDeclaredFields()));
            current = current.getSuperclass();
        }
        return fields;
    }

    private static Object getFieldValue(Field field, Object obj) {
        try {
            // Skip synthetic and special fields
            if (field.isSynthetic()) {
                return null;
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            // Reflection may fail for various reasons, just skip
            return null;
        }
    }

    private static void checkValueRecursively(Object val, List<XJustizVersion> xVersions,
            List<XJustizCoreVersion> xCoreVersions) {
        if (val instanceof String) {
            // String is Iterable but we treat it as primitive
            return;
        }

        if (val instanceof Collection<?> collection) {
            for (Object item : collection) {
                checkObject(item, xVersions, xCoreVersions);
            }
        } else if (val.getClass().isArray()) {
            Object[] array = (Object[]) val;
            for (Object item : array) {
                checkObject(item, xVersions, xCoreVersions);
            }
        } else if (isXJustizModel(val.getClass())) {
            checkObject(val, xVersions, xCoreVersions);
        }
    }

    private static void applyAnnotations(java.lang.reflect.AnnotatedElement element,
            List<XJustizVersion> xVersions, List<XJustizCoreVersion> xCoreVersions) {

        XJustizAvailability xAvail = element.getAnnotation(XJustizAvailability.class);
        if (xAvail != null) {
            xVersions.removeIf(v -> !VersionAvailabilityChecker.isAvailable(
                    v.getValue(),
                    xAvail.introduced().getValue(),
                    xAvail.removed() == XJustizVersion.NONE ? 0 : xAvail.removed().getValue()));
        }

        XJustizCoreAvailability xcAvail = element.getAnnotation(XJustizCoreAvailability.class);
        if (xcAvail != null) {
            int removedValue = xcAvail.isRemoved() ? xcAvail.removed().getValue() : 0;
            xCoreVersions.removeIf(v -> !VersionAvailabilityChecker.isAvailable(
                    v.getValue(),
                    xcAvail.introduced().getValue(),
                    removedValue));
        }
    }

    private static boolean isXJustizModel(Class<?> type) {
        // Check if the type is defined in the xjustiz package
        String packageName = type.getPackageName();
        return packageName != null && packageName.startsWith("de.xjustiz");
    }
}
