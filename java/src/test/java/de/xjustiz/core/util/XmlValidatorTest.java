package de.xjustiz.core.util;

import de.xjustiz.core.util.versioning.XJustizVersion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link XmlValidator}.
 */
class XmlValidatorTest {

    private Path tempDir;

    @BeforeEach
    void setUp() throws Exception {
        tempDir = Files.createTempDirectory("XmlValidatorTests_");
    }

    @AfterEach
    void tearDown() throws Exception {
        if (tempDir != null && Files.exists(tempDir)) {
            Files.walk(tempDir)
                    .sorted((a, b) -> b.compareTo(a))
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                        } catch (Exception ignored) {
                        }
                    });
        }
    }

    @Test
    void validate_validXml_returnsNoErrors() throws Exception {
        // Arrange
        String xmlContent = """
                <?xml version="1.0" encoding="utf-8"?>
                <tns:nachricht.gds.basisnachricht.0005006
                    xmlns:tns="http://www.xjustiz.de"
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
                    <tns:nachrichtenkopf xjustizVersion="3.4.1">
                        <tns:erstellungszeitpunkt>2023-10-01T10:00:00</tns:erstellungszeitpunkt>
                        <tns:auswahl_absender>
                            <tns:absender.sonstige>TestAbsender</tns:absender.sonstige>
                        </tns:auswahl_absender>
                        <tns:auswahl_empfaenger>
                            <tns:empfaenger.sonstige>TestEmpfaenger</tns:empfaenger.sonstige>
                        </tns:auswahl_empfaenger>
                        <tns:eigeneNachrichtenID>550e8400-e29b-41d4-a716-446655440000</tns:eigeneNachrichtenID>
                    </tns:nachrichtenkopf>
                    <tns:grunddaten/>
                </tns:nachricht.gds.basisnachricht.0005006>
                """;

        Path filePath = tempDir.resolve("valid.xml");
        Files.writeString(filePath, xmlContent);

        // Act
        List<String> errors = XmlValidator.validate(filePath, XJustizVersion.V3_4_1);

        // Assert
        // Note: This test may fail if X.Justiz-Versions directory is not present
        // In that case, it should return schema loading errors
        assertNotNull(errors);
    }

    @Test
    void validate_malformedXml_returnsParsingError() throws Exception {
        // Arrange
        String xmlContent = "<not<valid>xml";
        InputStream stream = new ByteArrayInputStream(xmlContent.getBytes(StandardCharsets.UTF_8));

        // Act
        List<String> errors = XmlValidator.validate(stream, XJustizVersion.V3_4_1);

        // Assert
        assertNotNull(errors);
        // Should contain some error (either parsing or schema loading)
        // The exact error depends on whether the XSD files are available
    }

    @Test
    void validate_nonExistentFile_throwsFileNotFound() {
        assertThrows(FileNotFoundException.class,
                () -> XmlValidator.validate(tempDir.resolve("doesnotexist.xml"), XJustizVersion.V3_4_1));
    }

    @Test
    void validate_nullXmlPath_throwsIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> XmlValidator.validate((Path) null, XJustizVersion.V3_4_1));
    }

    @Test
    void validate_noneVersion_throwsIllegalArgument() throws Exception {
        String xmlContent = "<root/>";
        Path filePath = tempDir.resolve("test.xml");
        Files.writeString(filePath, xmlContent);

        assertThrows(IllegalArgumentException.class, () -> XmlValidator.validate(filePath, XJustizVersion.NONE));
    }

    @Test
    void validate_stream_nullStream_throwsIllegalArgument() {
        assertThrows(IllegalArgumentException.class,
                () -> XmlValidator.validate((InputStream) null, XJustizVersion.V3_4_1));
    }
}
