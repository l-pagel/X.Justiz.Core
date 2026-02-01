package de.xjustiz.core.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.xjustiz.core.serialization.XJustizSerializer;
import de.xjustiz.core.serialization.Format;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VersicherungCoreTest {

    @Test
    void testSerialization_WithVersicherungsTypCode() {
        VersicherungsTyp typ = new VersicherungsTyp();
        typ.setCode(VersicherungsTypCode.Alle_Sparten);

        VersicherungCore core = new VersicherungCore();
        core.setVersicherungstyp(typ);

        XJustizSerializer serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        String json = serializer.serialize(core);
        assertNotNull(json);
        assertTrue(json.contains("\"code\":\"000\"")); // Use quotes if it's a string, or unquoted if number. C#
                                                       // serialized to "000".
        // JsonProperty("000") in generated code implies string "000".
    }

    @Test
    void testDeserialization_WithVersicherungsTypCode() {
        String json = """
                {
                    "Versicherungstyp": {
                        "code": "000"
                    }
                }
                """;

        XJustizSerializer serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        VersicherungCore core = serializer.deserialize(json, VersicherungCore.class);
        assertNotNull(core);
        assertNotNull(core.getVersicherungstyp());
        assertEquals(VersicherungsTypCode.Alle_Sparten, core.getVersicherungstyp().getCode());
    }

    @Test
    void testDeserialization_WithAlias() {
        // Test with a descriptive name, which should work via fromValue
        String json = """
                {
                    "Versicherungstyp": {
                        "code": "Alle Sparten"
                    }
                }
                """;

        XJustizSerializer serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        VersicherungCore core = serializer.deserialize(json, VersicherungCore.class);
        assertNotNull(core);
        assertNotNull(core.getVersicherungstyp());
        assertEquals(VersicherungsTypCode.Alle_Sparten, core.getVersicherungstyp().getCode());
    }
}
