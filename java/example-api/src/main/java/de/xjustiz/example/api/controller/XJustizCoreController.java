package de.xjustiz.example.api.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import de.xjustiz.example.api.models.CompatibilityResult;
import de.xjustiz.example.api.models.DatasetType;
import de.xjustiz.example.api.models.UebermittlungSchriftgutobjekteNachricht;
import de.xjustiz.example.api.models.XJustizCoreVersion;
import de.xjustiz.example.api.util.XJustizConverter;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/XJustizCore")
public class XJustizCoreController {

    private final ObjectMapper jsonMapper = new ObjectMapper();
    private final XmlMapper xmlMapper = new XmlMapper();

    public XJustizCoreController() {
        jsonMapper.findAndRegisterModules();
        jsonMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        jsonMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        xmlMapper.findAndRegisterModules();
        xmlMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @PostMapping(value = "/json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in JSON format.")
    public ResponseEntity<CompatibilityResult> sendXJustizCoreJson(
            @RequestBody UebermittlungSchriftgutobjekteNachricht message) {
        return ResponseEntity.ok(message.getCompatibility());
    }

    @PostMapping(value = "/xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in XML format.")
    public ResponseEntity<CompatibilityResult> sendXJustizCoreXml(
            @RequestBody UebermittlungSchriftgutobjekteNachricht message) {
        return ResponseEntity.ok(message.getCompatibility());
    }

    @PostMapping(value = "/json-file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht from a JSON file.")
    public ResponseEntity<CompatibilityResult> sendXJustizCoreJsonFile(@RequestParam("file") MultipartFile file)
            throws IOException {
        if (file.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "File is empty");
        }
        UebermittlungSchriftgutobjekteNachricht message = jsonMapper.readValue(file.getInputStream(),
                UebermittlungSchriftgutobjekteNachricht.class);
        return ResponseEntity.ok(message.getCompatibility());
    }

    @PostMapping(value = "/xml-file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht from an XML file.")
    public ResponseEntity<CompatibilityResult> sendXJustizCoreXmlFile(@RequestParam("file") MultipartFile file)
            throws IOException {
        if (file.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "File is empty");
        }
        UebermittlungSchriftgutobjekteNachricht message = xmlMapper.readValue(file.getInputStream(),
                UebermittlungSchriftgutobjekteNachricht.class);
        return ResponseEntity.ok(message.getCompatibility());
    }

    @PostMapping("/json/generate-file")
    @Operation(summary = "Generates a JSON file in the specified XJustiz Core version from the provided body.")
    public ResponseEntity<Resource> generateJsonFile(@RequestParam XJustizCoreVersion version,
            @RequestBody UebermittlungSchriftgutobjekteNachricht message) throws IOException {
        UebermittlungSchriftgutobjekteNachricht converted = XJustizConverter.convert(message, version);
        byte[] bytes = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(converted);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"akte_" + version + ".json\"")
                .contentType(MediaType.APPLICATION_JSON)
                .body(new ByteArrayResource(bytes));
    }

    @PostMapping(value = "/xml/generate-file", consumes = { MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
    @Operation(summary = "Generates an XML file in the specified X.Justiz Core version from the provided body.")
    public ResponseEntity<Resource> generateXmlFile(@RequestParam XJustizCoreVersion version,
            @RequestBody UebermittlungSchriftgutobjekteNachricht message) throws IOException {
        UebermittlungSchriftgutobjekteNachricht converted = XJustizConverter.convert(message, version);
        byte[] bytes = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(converted);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"akte_" + version + ".xml\"")
                .contentType(MediaType.APPLICATION_XML)
                .body(new ByteArrayResource(bytes));
    }

    @GetMapping("/json/generate-file/sample/{dataset}")
    @Operation(summary = "Generates a JSON file in the specified X.Justiz Core version from a sample dataset.")
    public ResponseEntity<Resource> generateJsonSampleFile(@PathVariable DatasetType dataset,
            @RequestParam XJustizCoreVersion version) throws IOException {
        UebermittlungSchriftgutobjekteNachricht message = getSampleMessage(dataset, false);
        if (message == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sample dataset not found");
        }
        return generateJsonFile(version, message);
    }

    @GetMapping("/xml/generate-file/sample/{dataset}")
    @Operation(summary = "Generates an XML file in the specified X.Justiz Core version from a sample dataset.")
    public ResponseEntity<Resource> generateXmlSampleFile(@PathVariable DatasetType dataset,
            @RequestParam XJustizCoreVersion version) throws IOException {
        UebermittlungSchriftgutobjekteNachricht message = getSampleMessage(dataset, true);
        if (message == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sample dataset not found");
        }
        return generateXmlFile(version, message);
    }

    private UebermittlungSchriftgutobjekteNachricht getSampleMessage(DatasetType dataset, boolean isXml) {
        String datasetName = dataset.toString().toLowerCase();
        String ext = isXml ? "xml" : "json";
        // Check local or relative path
        Path path = Paths.get("example-datasets", datasetName + "." + ext); // Relative to run dir
        if (!Files.exists(path)) {
            // Try to locate in repo root based on assumption we are in repo
            path = Paths.get("../../example-datasets", datasetName + "." + ext);
        }
        if (!Files.exists(path)) {
            // Fallback absolute path attempt
            path = Paths
                    .get("c:/Users/LukasPagel/source/repos/X.Justiz.Core/example-datasets/" + datasetName + "." + ext);
        }

        if (Files.exists(path)) {
            try {
                if (isXml) {
                    return xmlMapper.readValue(path.toFile(), UebermittlungSchriftgutobjekteNachricht.class);
                } else {
                    return jsonMapper.readValue(path.toFile(), UebermittlungSchriftgutobjekteNachricht.class);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null; // Simplified error handling
    }
}
