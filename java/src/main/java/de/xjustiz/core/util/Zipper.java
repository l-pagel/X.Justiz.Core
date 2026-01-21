package de.xjustiz.core.util;

import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;
import de.xjustiz.core.serialization.Format;
import de.xjustiz.core.serialization.XJustizSerializer;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Stellt Hilfsmethoden zum Erstellen von XJustiz-ZIP-Dateien bereit.<br/>
 * <u><b>Zipper:</b></u> Provides utility methods for creating XJustiz ZIP
 * files.
 */
public final class Zipper {

    private static final String DOCUMENTS_FOLDER = "Dokumente";

    private Zipper() {
        // Utility class
    }

    /**
     * Erstellt eine ZIP-Datei mit den XJustiz-Daten und optionalen Anhängen und
     * speichert sie am angegebenen Pfad.<br/>
     * <u><b>Archive to ZIP file:</b></u> Creates a ZIP file containing the XJustiz
     * data and optional attachments
     * and saves it at the specified path.
     * 
     * @param message            Die XJustiz-Nachricht. / The XJustiz message.
     * @param destinationZipPath Der Pfad, an dem die ZIP-Datei erstellt werden
     *                           soll. / The path where the ZIP file should be
     *                           created.
     * @param exportFiles        Eine Liste von Dateipfaden, die als Anhänge
     *                           hinzugefügt werden sollen. / A list of file paths
     *                           to be added as attachments.
     * @return Der Pfad zur erstellten ZIP-Datei. / The path to the created ZIP
     *         file.
     * @throws IOException if an I/O error occurs
     */
    public static Path archiveToZipFile(UebermittlungSchriftgutobjekteNachricht message,
            Path destinationZipPath, List<Path> exportFiles) throws IOException {

        String fileName = getFileName(message);

        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(destinationZipPath))) {
            addXJustizXmlToZip(zos, message, fileName);
            if (exportFiles != null) {
                addFilesToZip(zos, exportFiles);
            }
        }

        return destinationZipPath;
    }

    /**
     * Erstellt eine ZIP-Datei mit den XJustiz-Daten und speichert sie am
     * angegebenen Pfad.<br/>
     * <u><b>Archive to ZIP file:</b></u> Creates a ZIP file containing the XJustiz
     * data and saves it at the specified path.
     * 
     * @param message            Die XJustiz-Nachricht. / The XJustiz message.
     * @param destinationZipPath Der Pfad, an dem die ZIP-Datei erstellt werden
     *                           soll. / The path where the ZIP file should be
     *                           created.
     * @return Der Pfad zur erstellten ZIP-Datei. / The path to the created ZIP
     *         file.
     * @throws IOException if an I/O error occurs
     */
    public static Path archiveToZipFile(UebermittlungSchriftgutobjekteNachricht message,
            Path destinationZipPath) throws IOException {
        return archiveToZipFile(message, destinationZipPath, null);
    }

    /**
     * Erstellt eine ZIP-Datei mit den XJustiz-Daten und optionalen Anhängen als
     * String-Pfade.<br/>
     * <u><b>Archive to ZIP file:</b></u> Creates a ZIP file with string paths.
     * 
     * @param message            Die XJustiz-Nachricht. / The XJustiz message.
     * @param destinationZipPath Der Pfad als String. / The path as String.
     * @param exportFilePaths    Eine Liste von Dateipfaden als Strings. / A list of
     *                           file paths as Strings.
     * @return Der Pfad zur erstellten ZIP-Datei. / The path to the created ZIP
     *         file.
     * @throws IOException if an I/O error occurs
     */
    public static Path archiveToZipFile(UebermittlungSchriftgutobjekteNachricht message,
            String destinationZipPath, List<String> exportFilePaths) throws IOException {
        List<Path> paths = exportFilePaths != null
                ? exportFilePaths.stream().map(Path::of).toList()
                : null;
        return archiveToZipFile(message, Path.of(destinationZipPath), paths);
    }

    /**
     * Erstellt einen ByteArrayOutputStream, der das ZIP-Archiv mit den
     * XJustiz-Daten und optionalen Anhängen enthält.<br/>
     * <u><b>Archive to ZIP stream:</b></u> Creates a ByteArrayOutputStream
     * containing the ZIP archive
     * with the XJustiz data and optional attachments.
     * 
     * @param message     Die XJustiz-Nachricht. / The XJustiz message.
     * @param exportFiles Eine Liste von Dateipfaden, die als Anhänge hinzugefügt
     *                    werden sollen. / A list of file paths to be added as
     *                    attachments.
     * @return Ein ByteArrayOutputStream, der das ZIP-Archiv enthält. / A
     *         ByteArrayOutputStream containing the ZIP archive.
     * @throws IOException if an I/O error occurs
     */
    public static ByteArrayOutputStream archiveToZipStream(UebermittlungSchriftgutobjekteNachricht message,
            List<Path> exportFiles) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String fileName = getFileName(message);

        try (ZipOutputStream zos = new ZipOutputStream(baos)) {
            addXJustizXmlToZip(zos, message, fileName);
            if (exportFiles != null) {
                addFilesToZip(zos, exportFiles);
            }
        }

        return baos;
    }

    /**
     * Erstellt einen ByteArrayOutputStream, der das ZIP-Archiv enthält.<br/>
     * <u><b>Archive to ZIP stream:</b></u> Creates a ByteArrayOutputStream
     * containing the ZIP archive.
     * 
     * @param message Die XJustiz-Nachricht. / The XJustiz message.
     * @return Ein ByteArrayOutputStream, der das ZIP-Archiv enthält. / A
     *         ByteArrayOutputStream containing the ZIP archive.
     * @throws IOException if an I/O error occurs
     */
    public static ByteArrayOutputStream archiveToZipStream(UebermittlungSchriftgutobjekteNachricht message)
            throws IOException {
        return archiveToZipStream(message, null);
    }

    /**
     * Converts the ByteArrayOutputStream to a byte array for further use.
     * 
     * @param message     Die XJustiz-Nachricht. / The XJustiz message.
     * @param exportFiles Eine Liste von Dateipfaden. / A list of file paths.
     * @return The ZIP archive as byte array.
     * @throws IOException if an I/O error occurs
     */
    public static byte[] archiveToZipBytes(UebermittlungSchriftgutobjekteNachricht message,
            List<Path> exportFiles) throws IOException {
        return archiveToZipStream(message, exportFiles).toByteArray();
    }

    private static String getFileName(UebermittlungSchriftgutobjekteNachricht message) {
        String aktenzeichen = getAktenzeichen(message);
        return "akte_" + (aktenzeichen != null ? aktenzeichen : UUID.randomUUID().toString()) + ".xml";
    }

    private static String getAktenzeichen(UebermittlungSchriftgutobjekteNachricht message) {
        if (message.getKopf() != null
                && message.getKopf().getAktenzeichenAbsender() != null
                && !message.getKopf().getAktenzeichenAbsender().isEmpty()) {
            return message.getKopf().getAktenzeichenAbsender().get(0);
        }
        return null;
    }

    private static void addXJustizXmlToZip(ZipOutputStream zos,
            UebermittlungSchriftgutobjekteNachricht message, String fileName) throws IOException {

        XJustizSerializer serializer = XJustizSerializer.builder()
                .format(Format.XML)
                .build();

        String xml = serializer.serializePretty(message);

        ZipEntry entry = new ZipEntry(fileName);
        zos.putNextEntry(entry);
        zos.write(xml.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        zos.closeEntry();
    }

    private static void addFilesToZip(ZipOutputStream zos, List<Path> filePaths) throws IOException {
        for (Path filePath : filePaths) {
            String targetPath = DOCUMENTS_FOLDER + "/" + filePath.getFileName().toString();
            ZipEntry entry = new ZipEntry(targetPath);
            zos.putNextEntry(entry);
            Files.copy(filePath, zos);
            zos.closeEntry();
        }
    }
}
