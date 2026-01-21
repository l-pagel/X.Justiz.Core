package de.xjustiz.core.util;

import de.xjustiz.core.util.versioning.XJustizVersion;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

/**
 * Validiert XML-Dateien gegen X.Justiz XSD-Schemata für die angegebene
 * Version.<br/>
 * <u><b>XML Validator:</b></u> Validates XML files against the X.Justiz XSD
 * schemas for the specified version.
 */
public final class XmlValidator {

    private static final Map<XJustizVersion, Schema> SCHEMA_CACHE = new ConcurrentHashMap<>();

    private XmlValidator() {
        // Utility class
    }

    /**
     * Validiert eine XML-Datei gegen die X.Justiz XSD-Schemata für die angegebene
     * Version.<br/>
     * <u><b>Validate:</b></u> Validates an XML file against the X.Justiz XSD
     * schemas for the specified version.
     * 
     * @param xmlPath The absolute path to the XML file.
     * @param version The X.Justiz version to validate against.
     * @return A list of validation errors. Returns an empty list if the XML is
     *         valid.
     * @throws FileNotFoundException    if the XML file does not exist.
     * @throws IllegalArgumentException if version is NONE.
     */
    public static List<String> validate(Path xmlPath, XJustizVersion version) throws IOException {
        if (xmlPath == null) {
            throw new IllegalArgumentException("xmlPath cannot be null");
        }
        if (!Files.exists(xmlPath)) {
            throw new FileNotFoundException("XML file not found: " + xmlPath);
        }

        try (InputStream stream = Files.newInputStream(xmlPath)) {
            return validate(stream, version);
        }
    }

    /**
     * Validiert eine XML-Datei gegen die X.Justiz XSD-Schemata für die angegebene
     * Version.<br/>
     * <u><b>Validate:</b></u> Validates an XML file against the X.Justiz XSD
     * schemas for the specified version.
     * 
     * @param xmlPath The absolute path to the XML file as String.
     * @param version The X.Justiz version to validate against.
     * @return A list of validation errors. Returns an empty list if the XML is
     *         valid.
     * @throws FileNotFoundException if the XML file does not exist.
     */
    public static List<String> validate(String xmlPath, XJustizVersion version) throws IOException {
        return validate(Path.of(xmlPath), version);
    }

    /**
     * Validiert einen XML-Stream gegen die X.Justiz XSD-Schemata für die angegebene
     * Version.<br/>
     * <u><b>Validate:</b></u> Validates an XML stream against the X.Justiz XSD
     * schemas for the specified version.
     * 
     * @param xmlStream The stream containing the XML data. Can be a
     *                  ByteArrayInputStream.
     * @param version   The X.Justiz version to validate against.
     * @return A list of validation errors. Returns an empty list if the XML is
     *         valid.
     */
    public static List<String> validate(InputStream xmlStream, XJustizVersion version) {
        if (xmlStream == null) {
            throw new IllegalArgumentException("xmlStream cannot be null");
        }
        if (version == XJustizVersion.NONE) {
            throw new IllegalArgumentException("Version cannot be NONE");
        }

        List<String> errors = new ArrayList<>();

        try {
            Schema schema = getOrLoadSchema(version);
            Validator validator = schema.newValidator();

            // Collect validation errors
            validator.setErrorHandler(new org.xml.sax.ErrorHandler() {
                @Override
                public void warning(org.xml.sax.SAXParseException e) {
                    errors.add(String.format("[Warning] Line %d, Pos %d: %s",
                            e.getLineNumber(), e.getColumnNumber(), e.getMessage()));
                }

                @Override
                public void error(org.xml.sax.SAXParseException e) {
                    errors.add(String.format("[Error] Line %d, Pos %d: %s",
                            e.getLineNumber(), e.getColumnNumber(), e.getMessage()));
                }

                @Override
                public void fatalError(org.xml.sax.SAXParseException e) {
                    errors.add(String.format("[Fatal] Line %d, Pos %d: %s",
                            e.getLineNumber(), e.getColumnNumber(), e.getMessage()));
                }
            });

            validator.validate(new StreamSource(xmlStream));
        } catch (org.xml.sax.SAXException e) {
            errors.add("[Error] XML Parsing failed: " + e.getMessage());
        } catch (IOException e) {
            errors.add("[Error] IO error during validation: " + e.getMessage());
        } catch (Exception e) {
            errors.add("[Error] Unexpected error during validation: " + e.getMessage());
        }

        return errors;
    }

    private static Schema getOrLoadSchema(XJustizVersion version) throws Exception {
        return SCHEMA_CACHE.computeIfAbsent(version, v -> {
            try {
                return loadSchema(v);
            } catch (Exception e) {
                throw new RuntimeException("Failed to load schema for version " + v, e);
            }
        });
    }

    private static Schema loadSchema(XJustizVersion version) throws Exception {
        Path xsdDir = getXsdDirectory(version);

        if (xsdDir == null || !Files.exists(xsdDir)) {
            throw new FileNotFoundException("Could not find XSD directory for version " + version +
                    ". Checked path: " + (xsdDir != null ? xsdDir : "null"));
        }

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // Find all XSD files
        List<StreamSource> sources = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(xsdDir)) {
            paths.filter(p -> p.toString().endsWith(".xsd"))
                    .forEach(p -> sources.add(new StreamSource(p.toFile())));
        }

        if (sources.isEmpty()) {
            throw new FileNotFoundException("No XSD files found in directory: " + xsdDir);
        }

        return factory.newSchema(sources.toArray(new StreamSource[0]));
    }

    private static Path getXsdDirectory(XJustizVersion version) {
        // Convert Enum V3_4_1 -> 3.4.1
        String versionStr = version.toVersionString();

        // Find the X.Justiz-Versions directory by traversing up from the current
        // directory
        Path currentDir = Path.of(System.getProperty("user.dir"));
        Path xjustizVersionsRoot = null;

        while (currentDir != null) {
            Path check = currentDir.resolve("X.Justiz-Versions");
            if (Files.exists(check)) {
                xjustizVersionsRoot = check;
                break;
            }
            currentDir = currentDir.getParent();
        }

        if (xjustizVersionsRoot == null) {
            return null;
        }

        Path versionSpecificDir = xjustizVersionsRoot.resolve(versionStr);
        if (!Files.exists(versionSpecificDir)) {
            return null;
        }

        // Inside the version directory, find the folder that contains "XSD"
        try (Stream<Path> dirs = Files.list(versionSpecificDir)) {
            return dirs.filter(p -> Files.isDirectory(p) && p.getFileName().toString().contains("XSD"))
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            return null;
        }
    }
}
