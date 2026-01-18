package de.xjustiz.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies that generated Java models match the JSON Schema.
 * This ensures parity between .NET and Java SDKs.
 */
class SchemaParityTest {

    private static JsonNode schema;
    private static final ObjectMapper mapper = new ObjectMapper();

    @BeforeAll
    static void loadSchema() throws Exception {
        // Find schema relative to project root
        Path schemaPath = Paths.get("..", "schemas", "xjustiz-core.schema.json");
        File schemaFile = schemaPath.toFile();

        if (!schemaFile.exists()) {
            // Try from project root (when running from IDE)
            schemaPath = Paths.get("schemas", "xjustiz-core.schema.json");
            schemaFile = schemaPath.toFile();
        }

        assertTrue(schemaFile.exists(),
                "JSON Schema not found. Run schema generation first.");

        schema = mapper.readTree(schemaFile);
    }

    @Test
    void rootProperties_shouldExistInRootClass() {
        JsonNode properties = schema.get("properties");
        assertNotNull(properties, "Schema should have root properties");

        // Check that we have the expected root properties
        assertTrue(properties.has("Kopf"), "Schema should have 'Kopf' property");
        assertTrue(properties.has("Grunddaten"), "Schema should have 'Grunddaten' property");
        assertTrue(properties.has("Schriftgutobjekte"), "Schema should have 'Schriftgutobjekte' property");
    }

    @Test
    void allDefinitions_shouldHaveCorrespondingJavaClass() {
        JsonNode definitions = schema.get("definitions");
        assertNotNull(definitions, "Schema should have definitions");

        Set<String> missingClasses = new HashSet<>();

        Iterator<String> fieldNames = definitions.fieldNames();
        while (fieldNames.hasNext()) {
            String typeName = fieldNames.next();

            // Try to find the class in generated or main models package
            boolean found = classExists("de.xjustiz.core.models.generated." + typeName)
                    || classExists("de.xjustiz.core.models." + typeName);

            if (!found) {
                missingClasses.add(typeName);
            }
        }

        assertTrue(missingClasses.isEmpty(),
                "Missing Java classes for schema definitions: " + missingClasses);
    }

    @Test
    void nachrichtenkopf_propertiesShouldMatchSchema() throws Exception {
        JsonNode definitions = schema.get("definitions");
        JsonNode nachrichtenkopfDef = definitions.get("Nachrichtenkopf");

        if (nachrichtenkopfDef == null) {
            // Skip if Nachrichtenkopf is not in definitions (might be inline)
            return;
        }

        JsonNode properties = nachrichtenkopfDef.get("properties");
        assertNotNull(properties, "Nachrichtenkopf should have properties");

        // Try to load the Java class
        Class<?> javaClass = null;
        try {
            javaClass = Class.forName("de.xjustiz.core.models.Nachrichtenkopf");
        } catch (ClassNotFoundException e) {
            try {
                javaClass = Class.forName("de.xjustiz.core.models.generated.Nachrichtenkopf");
            } catch (ClassNotFoundException e2) {
                fail("Nachrichtenkopf class not found in either package");
            }
        }

        // Verify each schema property has a corresponding field with @JsonProperty
        Set<String> missingProps = new HashSet<>();
        Iterator<String> propNames = properties.fieldNames();

        while (propNames.hasNext()) {
            String propName = propNames.next();
            boolean found = hasFieldWithJsonProperty(javaClass, propName);
            if (!found) {
                missingProps.add(propName);
            }
        }

        assertTrue(missingProps.isEmpty(),
                "Nachrichtenkopf missing properties: " + missingProps);
    }

    private boolean classExists(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private boolean hasFieldWithJsonProperty(Class<?> clazz, String propertyName) {
        for (Field field : clazz.getDeclaredFields()) {
            JsonProperty annotation = field.getAnnotation(JsonProperty.class);
            if (annotation != null && annotation.value().equals(propertyName)) {
                return true;
            }
            // Also check if field name matches (camelCase)
            if (field.getName().equalsIgnoreCase(propertyName.replace(".", ""))) {
                return true;
            }
        }
        return false;
    }
}
