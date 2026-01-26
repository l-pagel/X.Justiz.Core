package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VersicherungsTypCodeTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testFromValue_Code() {
        VersicherungsTypCode code = VersicherungsTypCode.fromValue("000");
        assertEquals(VersicherungsTypCode.Alle_Sparten, code);
    }

    @Test
    void testFromValue_Description() {
        VersicherungsTypCode code = VersicherungsTypCode.fromValue("Alle Sparten");
        assertEquals(VersicherungsTypCode.Alle_Sparten, code);
    }

    @Test
    void testFromValue_Alias() {
        // Checking one simple alias based on the file content I saw
        // 01 = Lebensversicherung
        VersicherungsTypCode code = VersicherungsTypCode.fromValue("Lebensversicherung");
        assertEquals(VersicherungsTypCode.Lebensversicherung, code);
    }

    @Test
    void testFromValue_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            VersicherungsTypCode.fromValue("UngültigerCode123");
        });
    }

    @Test
    void testSerialization() throws Exception {
        String json = mapper.writeValueAsString(VersicherungsTypCode.Alle_Sparten);
        // It should serialize to the code "000" because of @JsonValue (assuming
        // implementation) or @JsonProperty
        // The generated code had @JsonProperty("000") on the enum constant.
        // If @XmlEnum is used, usually there's a value field.
        // Let's verify what it serializes to.
        // Based on C# behavior it serializes to "000".
        assertEquals("\"000\"", json);
    }

    @Test
    void testDeserialization() throws Exception {
        VersicherungsTypCode code = mapper.readValue("\"000\"", VersicherungsTypCode.class);
        assertEquals(VersicherungsTypCode.Alle_Sparten, code);

        // Test deserialization from description if @JsonCreator is on fromValue
        // If fromValue has @JsonCreator, this should work:
        VersicherungsTypCode codeDesc = mapper.readValue("\"Alle Sparten\"", VersicherungsTypCode.class);
        assertEquals(VersicherungsTypCode.Alle_Sparten, codeDesc);
    }
}
