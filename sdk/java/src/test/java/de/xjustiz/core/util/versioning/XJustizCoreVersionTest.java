package de.xjustiz.core.util.versioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link XJustizCoreVersion}.
 */
class XJustizCoreVersionTest {

    @Test
    void fromString_shouldReturnCorrectVersion() {
        assertEquals(XJustizCoreVersion.V0_2_0, XJustizCoreVersion.fromString("0.2.0"));
    }

    @Test
    void fromString_shouldReturnNull_forInvalidString() {
        assertNull(XJustizCoreVersion.fromString(null));
        assertNull(XJustizCoreVersion.fromString(""));
        assertNull(XJustizCoreVersion.fromString("invalid"));
    }

    @Test
    void toVersionString_shouldReturnCorrectString() {
        assertEquals("0.2.0", XJustizCoreVersion.V0_2_0.toVersionString());
    }

    @Test
    void isForTestingOnly_shouldReturnCorrectValue() {
        assertFalse(XJustizCoreVersion.V0_2_0.isForTestingOnly());
        assertTrue(XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET.isForTestingOnly());
    }

    @Test
    void getValue_shouldReturnCorrectIntValue() {
        assertEquals(20, XJustizCoreVersion.V0_2_0.getValue());
        assertEquals(9999, XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET.getValue());
    }
}
