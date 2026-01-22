package de.xjustiz.core.util.versioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link XJustizVersion}.
 */
class XJustizVersionTest {

    @Test
    void fromString_shouldReturnCorrectVersion() {
        assertEquals(XJustizVersion.V3_5_1, XJustizVersion.fromString("3.5.1"));
        assertEquals(XJustizVersion.V3_4_1, XJustizVersion.fromString("3.4.1"));
        assertEquals(XJustizVersion.V2_1_0, XJustizVersion.fromString("2.1.0"));
    }

    @Test
    void fromString_shouldReturnNone_forInvalidString() {
        assertEquals(XJustizVersion.NONE, XJustizVersion.fromString(null));
        assertEquals(XJustizVersion.NONE, XJustizVersion.fromString(""));
        assertEquals(XJustizVersion.NONE, XJustizVersion.fromString("invalid"));
        assertEquals(XJustizVersion.NONE, XJustizVersion.fromString("99.99.99"));
    }

    @Test
    void toVersionString_shouldReturnCorrectString() {
        assertEquals("3.5.1", XJustizVersion.V3_5_1.toVersionString());
        assertEquals("3.4.1", XJustizVersion.V3_4_1.toVersionString());
        assertEquals("2.1.0", XJustizVersion.V2_1_0.toVersionString());
    }

    @Test
    void toVersionString_shouldReturnEmptyString_forNone() {
        assertEquals("", XJustizVersion.NONE.toVersionString());
    }

    @Test
    void getValue_shouldReturnCorrectIntValue() {
        assertEquals(351, XJustizVersion.V3_5_1.getValue());
        assertEquals(341, XJustizVersion.V3_4_1.getValue());
        assertEquals(0, XJustizVersion.NONE.getValue());
    }

    @Test
    void roundTrip_shouldWork() {
        for (XJustizVersion version : XJustizVersion.values()) {
            if (version == XJustizVersion.NONE)
                continue;

            String versionString = version.toVersionString();
            XJustizVersion parsed = XJustizVersion.fromString(versionString);
            assertEquals(version, parsed, "Round-trip failed for " + version);
        }
    }
}
