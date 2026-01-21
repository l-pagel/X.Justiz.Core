package de.xjustiz.core.util.versioning;

import de.xjustiz.core.models.Nachrichtenkopf;
import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link CompatibilityChecker}.
 */
class CompatibilityCheckerTest {

    @Test
    void check_shouldReturnAllVersions_whenObjectIsEmpty() {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.check(message);

        // Assert
        assertNotNull(result);
        assertFalse(result.getCompatibleXJustizVersions().isEmpty());
        assertFalse(result.getCompatibleXJustizCoreVersions().isEmpty());
    }

    @Test
    void check_shouldHandleNonEmptyMessage() {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();
        var kopf = new Nachrichtenkopf();
        kopf.setVersion("3.5.1");
        kopf.setAktenzeichenAbsender(List.of("123 O 456/24"));
        message.setKopf(kopf);

        // Act
        var result = CompatibilityChecker.check(message);

        // Assert
        assertNotNull(result);
        assertFalse(result.getCompatibleXJustizVersions().isEmpty());
        assertFalse(result.getCompatibleXJustizCoreVersions().isEmpty());
    }

    @Test
    void check_shouldNotReturnVersionsMarkedAsForTestingOnly() {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.check(message);

        // Assert
        assertFalse(result.getCompatibleXJustizCoreVersions().contains(XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET));
    }

    @Test
    void check_shouldNotContainNoneVersion() {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.check(message);

        // Assert
        assertFalse(result.getCompatibleXJustizVersions().contains(XJustizVersion.NONE));
    }

    @Test
    void check_shouldContainV0_2_0() {
        // Arrange
        var message = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var result = CompatibilityChecker.check(message);

        // Assert
        assertTrue(result.getCompatibleXJustizCoreVersions().contains(XJustizCoreVersion.V0_2_0));
    }
}
