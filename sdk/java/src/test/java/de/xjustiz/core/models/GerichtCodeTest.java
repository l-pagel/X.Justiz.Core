package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GerichtCodeTest {

    @Test
    void testMapper() {
        // Test mapping from Name
        Optional<GerichtCode> code = GerichtCodeMapper.map("Amtsgericht Baden-Baden");
        assertTrue(code.isPresent(), "Should map 'Amtsgericht Baden-Baden'");
        assertEquals(GerichtCode.Amtsgericht_Baden_Baden, code.get());

        // Test mapping from Code
        // Note: The Mapper usually maps Names and specific keys to Enum.
        // The Enum itself (fromValue) handles the Code.
        // But GerichtCodeMapper might have the Code key too if it was in the C#
        // dictionary.
        // checking GerichtCodeMapper.cs: { "B1102", ... } ??
        // Actually GerichtCodeMapper.cs usually maps "Amtsgericht ..." strings.
        // Let's test what's likely in there.
    }

    @Test
    void testCodeLists() {
        IVersionedCodeList<GerichtCode> list = GerichtCodeLists.V3_6;
        assertNotNull(list, "V3_6 list should not be null");
        assertEquals("3.6", list.getVersion());
        assertTrue(list.contains(GerichtCode.Amtsgericht_Baden_Baden), "Should contain Amtsgericht_Baden_Baden");
        assertTrue(list.size() > 0, "List should not be empty");
    }

    @Test
    void testJsonSerialization() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Serialize
        GerichtCode code = GerichtCode.Amtsgericht_Baden_Baden;
        String json = mapper.writeValueAsString(code);
        assertEquals("\"B1102\"", json);

        // Deserialize from Code
        GerichtCode deserialized = mapper.readValue("\"B1102\"", GerichtCode.class);
        assertEquals(code, deserialized);
    }

    @Test
    void testMapperIgnoreCase() {
        Optional<GerichtCode> code = GerichtCodeMapper.mapIgnoreCase("amtsgericht baden-baden");
        assertTrue(code.isPresent(), "Should map 'amtsgericht baden-baden' ignoring case");
        assertEquals(GerichtCode.Amtsgericht_Baden_Baden, code.get());
    }
}
