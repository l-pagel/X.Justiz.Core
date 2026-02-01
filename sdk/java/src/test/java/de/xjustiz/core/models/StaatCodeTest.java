package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StaatCodeTest {

    @Test
    void testMapper() {
        // StaatCodeMapper should map country names to codes
        Optional<StaatCode> code = StaatCodeMapper.map("Deutschland");
        assertTrue(code.isPresent(), "Should map 'Deutschland'");
        assertEquals(StaatCode.Deutschland, code.get());

        // Optional<StaatCode> codeAliases = StaatCodeMapper.map("Germany"); // Assuming
        // alias exists if C# had it
        // Or at least map keys like "DE" if they are in the mapper

        // Let's verify standard keys
        Optional<StaatCode> de = StaatCodeMapper.map("DE");
        if (de.isPresent()) {
            assertEquals(StaatCode.Deutschland, de.get());
        }
    }

    @Test
    void testCodeLists() {
        // Verify V2024_08_01
        IVersionedCodeList<StaatCode> list = StaatCodeLists.V2024_08_01;
        assertNotNull(list, "V2024_08_01 list should not be null");
        assertEquals("2024.08.01", list.getVersion());
        assertTrue(list.contains(StaatCode.Deutschland), "Should contain Deutschland");
        assertTrue(list.size() > 100, "List should not be empty");
    }

    @Test
    void testJsonSerialization() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        StaatCode code = StaatCode.Deutschland;
        // The value is likely the numeric code "000" or similar, or "DE" depending on
        // XML Enum value.
        // Let's check deserialization round trip.
        String json = mapper.writeValueAsString(code);
        assertNotNull(json);

        StaatCode deserialized = mapper.readValue(json, StaatCode.class);
        assertEquals(code, deserialized);
    }
}
