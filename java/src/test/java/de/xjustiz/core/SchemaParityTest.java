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
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Verifies that Java models match the .NET source of truth.
 * These tests ensure parity between .NET and Java SDKs by checking
 * that key model classes exist with the expected properties.
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
    void rootProperties_shouldExistInSchema() {
        JsonNode properties = schema.get("properties");
        assertNotNull(properties, "Schema should have root properties");

        // Check that we have the expected root properties
        assertTrue(properties.has("Kopf"), "Schema should have 'Kopf' property");
        assertTrue(properties.has("Grunddaten"), "Schema should have 'Grunddaten' property");
        assertTrue(properties.has("Schriftgutobjekte"), "Schema should have 'Schriftgutobjekte' property");
    }

    @Test
    void coreModelClasses_shouldExist() {
        // Verify that core model classes exist in the models package
        String[] expectedClasses = {
                "Nachrichtenkopf",
                "Identifikation",
                "Akte",
                "Dokument",
                "NatuerlichePerson",
                "Beteiligter",
                "Geschlecht",
                "Staat",
                "Anschrift"
        };

        Set<String> missingClasses = new HashSet<>();

        for (String className : expectedClasses) {
            if (!classExists("de.xjustiz.core.models." + className)) {
                missingClasses.add(className);
            }
        }

        assertTrue(missingClasses.isEmpty(),
                "Missing core Java model classes: " + missingClasses);
    }

    @Test
    void nachrichtenkopf_shouldHaveRequiredProperties() throws Exception {
        Class<?> nachrichtenkopf = Class.forName("de.xjustiz.core.models.Nachrichtenkopf");

        // Verify key properties exist
        String[] expectedProperties = {
                "Version",
                "AktenzeichenAbsender",
                "AktenzeichenEmpfaenger",
                "Erstellungszeitpunkt"
        };

        Set<String> missingProps = new HashSet<>();

        for (String propName : expectedProperties) {
            if (!hasFieldWithJsonProperty(nachrichtenkopf, propName)) {
                missingProps.add(propName);
            }
        }

        assertTrue(missingProps.isEmpty(),
                "Nachrichtenkopf missing properties: " + missingProps);
    }

    @Test
    void identifikation_shouldHaveRequiredProperties() throws Exception {
        Class<?> identifikation = Class.forName("de.xjustiz.core.models.Identifikation");

        // Verify key properties exist
        assertTrue(hasFieldWithJsonProperty(identifikation, "Id"),
                "Identifikation should have 'Id' property");
    }

    @Test
    void akte_shouldHaveIdentifikation() throws Exception {
        Class<?> akte = Class.forName("de.xjustiz.core.models.Akte");

        assertTrue(hasFieldWithJsonProperty(akte, "Identifikation"),
                "Akte should have 'Identifikation' property");
    }

    @Test
    void dokument_shouldHaveIdentifikation() throws Exception {
        Class<?> dokument = Class.forName("de.xjustiz.core.models.Dokument");

        assertTrue(hasFieldWithJsonProperty(dokument, "Identifikation"),
                "Dokument should have 'Identifikation' property");
    }

    @Test
    void natuerlichePerson_shouldHaveRequiredProperties() throws Exception {
        Class<?> person = Class.forName("de.xjustiz.core.models.NatuerlichePerson");

        assertTrue(hasFieldWithJsonProperty(person, "VollerName"),
                "NatuerlichePerson should have 'VollerName' property");
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
