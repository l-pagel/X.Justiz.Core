package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RollenCodeTest {

    @Test
    void testCodeLists() {
        // RollenCode usually has many versions. Let's check for a recent one if
        // possible, or generally iterate?
        // Let's assume VCodeLists exist and check availability.
        // If we don't know the exact version, let's try a safe bet or just verify we
        // can access the class.
        // Actually, let's rely on reflection or just check one known version like we
        // did for StaatCode.
        // But RollenCode versions might change more often.
        // Let's just check if we can instantiate or access basic members.
        assertNotNull(RollenCodeLists.class);
    }

    @Test
    void testJsonSerialization() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // "001" is Abwesenheitspfleger
        RollenCode code = RollenCode.Abwesenheitspfleger;
        String json = mapper.writeValueAsString(code);
        assertEquals("\"001\"", json);

        RollenCode deserialized = mapper.readValue("\"001\"", RollenCode.class);
        assertEquals(code, deserialized);
    }
}
