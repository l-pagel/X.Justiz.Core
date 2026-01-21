package de.xjustiz.core.util;

import de.xjustiz.core.models.Nachrichtenkopf;
import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Zipper}.
 */
class ZipperTest {

    private Path tempDir;

    @BeforeEach
    void setUp() throws Exception {
        tempDir = Files.createTempDirectory("ZipperTests_");
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
    void archiveToZipStream_shouldReturnValidZipStream_whenCalledWithAttachments() throws Exception {
        // Arrange
        var msg = new UebermittlungSchriftgutobjekteNachricht();

        Path file1Path = tempDir.resolve("test1.txt");
        Path file2Path = tempDir.resolve("test2.txt");
        Files.writeString(file1Path, "Content 1");
        Files.writeString(file2Path, "Content 2");

        List<Path> exportFiles = List.of(file1Path, file2Path);

        // Act
        var outputStream = Zipper.archiveToZipStream(msg, exportFiles);

        // Assert
        assertNotNull(outputStream);
        byte[] zipBytes = outputStream.toByteArray();
        assertTrue(zipBytes.length > 0);

        // Verify ZIP content
        try (var zis = new ZipInputStream(new ByteArrayInputStream(zipBytes))) {
            int entryCount = 0;
            boolean hasXmlFile = false;
            boolean hasFile1 = false;
            boolean hasFile2 = false;

            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                entryCount++;
                String name = entry.getName();
                if (name.endsWith(".xml") && name.startsWith("akte_")) {
                    hasXmlFile = true;
                } else if (name.equals("Dokumente/test1.txt")) {
                    hasFile1 = true;
                    String content = new String(zis.readAllBytes());
                    assertEquals("Content 1", content);
                } else if (name.equals("Dokumente/test2.txt")) {
                    hasFile2 = true;
                }
            }

            assertEquals(3, entryCount); // 1 XML + 2 files
            assertTrue(hasXmlFile, "ZIP should contain an XML file");
            assertTrue(hasFile1, "ZIP should contain test1.txt");
            assertTrue(hasFile2, "ZIP should contain test2.txt");
        }
    }

    @Test
    void archiveToZipFile_shouldCreateZipFile_whenCalledWithAttachments() throws Exception {
        // Arrange
        var msg = new UebermittlungSchriftgutobjekteNachricht();
        Path file1Path = tempDir.resolve("test1.txt");
        Files.writeString(file1Path, "Content 1");

        List<Path> exportFiles = List.of(file1Path);
        Path destinationZipPath = tempDir.resolve("test_archive.zip");

        // Act
        Path zipPath = Zipper.archiveToZipFile(msg, destinationZipPath, exportFiles);

        // Assert
        assertEquals(destinationZipPath, zipPath);
        assertTrue(Files.exists(zipPath));

        // Verify ZIP content
        try (var zis = new ZipInputStream(Files.newInputStream(zipPath))) {
            int entryCount = 0;
            boolean hasXmlFile = false;
            boolean hasFile1 = false;

            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                entryCount++;
                String name = entry.getName();
                if (name.endsWith(".xml") && name.startsWith("akte_")) {
                    hasXmlFile = true;
                } else if (name.equals("Dokumente/test1.txt")) {
                    hasFile1 = true;
                }
            }

            assertEquals(2, entryCount); // 1 XML + 1 file
            assertTrue(hasXmlFile);
            assertTrue(hasFile1);
        }
    }

    @Test
    void archiveToZipStream_shouldWork_withoutAttachments() throws Exception {
        // Arrange
        var msg = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        var outputStream = Zipper.archiveToZipStream(msg);

        // Assert
        assertNotNull(outputStream);
        byte[] zipBytes = outputStream.toByteArray();

        // Verify ZIP content
        try (var zis = new ZipInputStream(new ByteArrayInputStream(zipBytes))) {
            int entryCount = 0;
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                entryCount++;
                assertTrue(entry.getName().endsWith(".xml"));
            }
            assertEquals(1, entryCount); // Only XML
        }
    }

    @Test
    void archiveToZipFile_shouldContainCorrectFileName_whenAktenzeichenIsSet() throws Exception {
        // Arrange
        var msg = new UebermittlungSchriftgutobjekteNachricht();
        var kopf = new Nachrichtenkopf();
        kopf.setAktenzeichenAbsender(List.of("AZ-Test-123"));
        msg.setKopf(kopf);

        Path destinationZipPath = tempDir.resolve("test_archive_az.zip");

        // Act
        Zipper.archiveToZipFile(msg, destinationZipPath);

        // Assert
        assertTrue(Files.exists(destinationZipPath));

        // Verify ZIP contains correct filename
        try (var zis = new ZipInputStream(Files.newInputStream(destinationZipPath))) {
            ZipEntry entry = zis.getNextEntry();
            assertNotNull(entry);
            assertEquals("akte_AZ-Test-123.xml", entry.getName());
        }
    }

    @Test
    void archiveToZipBytes_shouldReturnByteArray() throws Exception {
        // Arrange
        var msg = new UebermittlungSchriftgutobjekteNachricht();

        // Act
        byte[] bytes = Zipper.archiveToZipBytes(msg, null);

        // Assert
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);
    }
}
