package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VersicherungsCodeTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testFromValue_Code() {
        VersicherungsCode code = VersicherungsCode.fromValue("000");
        assertEquals(VersicherungsCode.Alle_Sparten, code);
    }

    @Test
    void testFromValue_Description() {
        VersicherungsCode code = VersicherungsCode.fromValue("Alle Sparten");
        assertEquals(VersicherungsCode.Alle_Sparten, code);
    }

    @Test
    void testFromValue_Alias() {
        // Checking one simple alias based on the file content I saw
        // 01 = Lebensversicherung
        VersicherungsCode code = VersicherungsCode.fromValue("Lebensversicherung");
        assertEquals(VersicherungsCode.Lebensversicherung, code);
    }

    @Test
    void testFromValue_Invalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            VersicherungsCode.fromValue("UngültigerCode123");
        });
    }

    @Test
    void testSerialization() throws Exception {
        String json = mapper.writeValueAsString(VersicherungsCode.Alle_Sparten);
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
        VersicherungsCode code = mapper.readValue("\"000\"", VersicherungsCode.class);
        assertEquals(VersicherungsCode.Alle_Sparten, code);

        // Test deserialization from description if @JsonCreator is on fromValue
        // If fromValue has @JsonCreator, this should work:
        VersicherungsCode codeDesc = mapper.readValue("\"Alle Sparten\"", VersicherungsCode.class);
        assertEquals(VersicherungsCode.Alle_Sparten, codeDesc);
    }
}
