package de.xjustiz.core.util.converter;

import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;
import de.xjustiz.core.util.versioning.*;

import java.lang.reflect.*;
import java.time.temporal.Temporal;
import java.util.*;

/**
 * Konverter für Nachrichten im X.Justiz und X.Justiz Core Format.<br/>
 * Konvertiert Nachrichten in eine bestimmte Zielversion und filtert nicht
 * unterstützte Eigenschaften heraus.<br/>
 * <u><b>XJustiz Converter:</b></u> Converter for X.Justiz and X.Justiz Core
 * messages.
 * Converts messages to a specific target version, filtering out unsupported
 * properties.
 */
public final class XJustizConverter {

    private XJustizConverter() {
        // Utility class
    }

    /**
     * Konvertiert die Quellnachricht in die Ziel-X.Justiz-Version.<br/>
     * <u><b>Convert:</b></u> Converts the source message to the target X.Justiz
     * version.
     * 
     * @param source        The source message to convert.
     * @param targetVersion The target X.Justiz version.
     * @return A result containing the converted message and a list of lost data.
     */
    public static ConversionResult convert(UebermittlungSchriftgutobjekteNachricht source,
            XJustizVersion targetVersion) {
        return convertInternal(source, targetVersion);
    }

    /**
     * Konvertiert die Quellnachricht in die Ziel X.Justiz Core Version.<br/>
     * <u><b>Convert:</b></u> Converts the source message to the target X.Justiz
     * Core version.
     * 
     * @param source        The source message to convert.
     * @param targetVersion The target X.Justiz Core version.
     * @return A result containing the converted message and a list of lost data.
     */
    public static ConversionResult convert(UebermittlungSchriftgutobjekteNachricht source,
            XJustizCoreVersion targetVersion) {
        return convertInternal(source, targetVersion);
    }

    private static ConversionResult convertInternal(UebermittlungSchriftgutobjekteNachricht source,
            Enum<?> targetVersion) {
        List<String> lostData = new ArrayList<>();
        UebermittlungSchriftgutobjekteNachricht result = (UebermittlungSchriftgutobjekteNachricht) deepCopy(source,
                targetVersion, lostData, UebermittlungSchriftgutobjekteNachricht.class.getSimpleName());
        return new ConversionResult(result, lostData);
    }

    /**
     * Kopiert das Objekt und filtert Eigenschaften basierend auf der
     * Versionsverfügbarkeit.<br/>
     * <u><b>Deep copy:</b></u> Deep copies the object and filters properties based
     * on version availability.
     * 
     * @param source        The source object.
     * @param targetVersion The target version (XJustizVersion or
     *                      XJustizCoreVersion).
     * @param lostData      The lost data list to populate.
     * @param context       The context path for error messages.
     * @return The copied object, or null if not available.
     */
    public static Object deepCopy(Object source, Enum<?> targetVersion, List<String> lostData, String context) {
        if (source == null) {
            return null;
        }

        Class<?> type = source.getClass();

        // 1. Check availability of the Type (Class/Enum) itself
        if (!isSimple(type) && !isAvailable(type, targetVersion)) {
            lostData.add(String.format("Type '%s' is not available in %s %s. (Context: %s)",
                    type.getSimpleName(), targetVersion.getClass().getSimpleName(), targetVersion, context));
            return null;
        }

        // 2. Handle Simple Types (Primitives, Strings, Enums, DateTime, etc.)
        if (isSimple(type)) {
            return source;
        }

        // 3. Handle Collections (Arrays and Lists)
        if (type.isArray()) {
            return handleArray(source, targetVersion, lostData, context);
        }
        if (Collection.class.isAssignableFrom(type)) {
            return handleCollection(source, targetVersion, lostData, context);
        }

        // 4. Handle Complex Objects (Classes)
        return handleComplexObject(source, type, targetVersion, lostData, context);
    }

    private static Object handleArray(Object source, Enum<?> targetVersion, List<String> lostData, String context) {
        int length = Array.getLength(source);
        List<Object> validItems = new ArrayList<>();
        Class<?> componentType = source.getClass().getComponentType();

        for (int i = 0; i < length; i++) {
            Object val = Array.get(source, i);
            Object converted = deepCopy(val, targetVersion, lostData, context + "[" + i + "]");
            if (converted != null) {
                validItems.add(converted);
            }
        }

        Object newArray = Array.newInstance(componentType, validItems.size());
        for (int i = 0; i < validItems.size(); i++) {
            Array.set(newArray, i, validItems.get(i));
        }
        return newArray;
    }

    private static Object handleCollection(Object source, Enum<?> targetVersion, List<String> lostData,
            String context) {
        Collection<?> sourceCollection = (Collection<?>) source;
        Collection<Object> result;

        if (source instanceof List) {
            result = new ArrayList<>();
        } else if (source instanceof Set) {
            result = new LinkedHashSet<>();
        } else {
            result = new ArrayList<>();
        }

        int i = 0;
        for (Object item : sourceCollection) {
            Object converted = deepCopy(item, targetVersion, lostData, context + "[" + i + "]");
            if (converted != null) {
                result.add(converted);
            }
            i++;
        }
        return result;
    }

    private static Object handleComplexObject(Object source, Class<?> type, Enum<?> targetVersion,
            List<String> lostData, String context) {
        Object instance;
        try {
            Constructor<?> constructor = type.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance = constructor.newInstance();
        } catch (Exception e) {
            return null;
        }

        List<Field> allFields = getAllFields(type);

        for (Field field : allFields) {
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers())) {
                continue;
            }

            field.setAccessible(true);

            // Check Field Availability
            if (!isAvailable(field, targetVersion)) {
                Object value = getFieldValue(field, source);
                if (value != null) {
                    lostData.add(String.format("Field '%s' in '%s' is not available in %s %s. (Context: %s.%s)",
                            field.getName(), type.getSimpleName(),
                            targetVersion.getClass().getSimpleName(), targetVersion,
                            context, field.getName()));
                }
                continue;
            }

            Object val = getFieldValue(field, source);
            Object convertedVal = deepCopy(val, targetVersion, lostData, context + "." + field.getName());

            try {
                field.set(instance, convertedVal);
            } catch (IllegalAccessException ignored) {
                // Continue if we can't set the field
            }
        }

        return instance;
    }

    private static List<Field> getAllFields(Class<?> type) {
        List<Field> fields = new ArrayList<>();
        Class<?> current = type;
        // Only traverse classes in our packages, not JDK classes
        while (current != null && current != Object.class && isXJustizModel(current)) {
            fields.addAll(Arrays.asList(current.getDeclaredFields()));
            current = current.getSuperclass();
        }
        return fields;
    }

    private static Object getFieldValue(Field field, Object obj) {
        try {
            // Skip synthetic fields
            if (field.isSynthetic()) {
                return null;
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            return null;
        }
    }

    private static boolean isXJustizModel(Class<?> type) {
        String packageName = type.getPackageName();
        return packageName != null && packageName.startsWith("de.xjustiz");
    }

    private static boolean isSimple(Class<?> type) {
        return type.isPrimitive()
                || type.isEnum()
                || type == String.class
                || Number.class.isAssignableFrom(type)
                || type == Boolean.class
                || type == Character.class
                || Temporal.class.isAssignableFrom(type)
                || type == Date.class
                || type == UUID.class
                || isWrapperType(type);
    }

    private static boolean isWrapperType(Class<?> type) {
        return type == Integer.class || type == Long.class || type == Double.class
                || type == Float.class || type == Short.class || type == Byte.class;
    }

    private static boolean isAvailable(AnnotatedElement member, Enum<?> targetVersion) {
        if (targetVersion instanceof XJustizVersion xv) {
            XJustizAvailability attr = member.getAnnotation(XJustizAvailability.class);
            if (attr != null) {
                return VersionAvailabilityChecker.isAvailable(
                        xv.getValue(),
                        attr.introduced().getValue(),
                        attr.removed() == XJustizVersion.NONE ? 0 : attr.removed().getValue());
            }
        } else if (targetVersion instanceof XJustizCoreVersion xcv) {
            XJustizCoreAvailability attr = member.getAnnotation(XJustizCoreAvailability.class);
            if (attr != null) {
                int removedValue = attr.isRemoved() ? attr.removed().getValue() : 0;
                return VersionAvailabilityChecker.isAvailable(
                        xcv.getValue(),
                        attr.introduced().getValue(),
                        removedValue);
            }
        }
        return true;
    }
}
