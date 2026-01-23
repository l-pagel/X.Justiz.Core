package de.xjustiz.core;

import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;
import de.xjustiz.core.serialization.XJustizSerializer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class E2ESampleFileTest {

    private final Path datasetsPath;

    E2ESampleFileTest() {
        this.datasetsPath = findDatasetsPath();
    }

    private Path findDatasetsPath() {
        // Try to find sdk/test-data by walking up from the current working directory
        Path current = Paths.get(".").toAbsolutePath();
        while (current != null) {
            Path candidate = current.resolve("sdk/test-data");
            if (Files.exists(candidate)) {
                return candidate;
            }
            // Also check if we are AT the root (X.Justiz.Core) and it is right here
            candidate = current.resolve("test-data"); // In case we are in sdk? No, structure is sdk/test-data
            // If we are in X.Justiz.Core, sdk/test-data works.

            current = current.getParent();
        }

        throw new RuntimeException(
                "Could not find sdk/test-data directory. Current dir: " + Paths.get(".").toAbsolutePath());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "arbeitsrecht",
            "erbrecht",
            "mietrecht",
            "fluggastrecht",
            "verkehrsunfall",
            "scenarios/arbeitsrecht_complex",
            "scenarios/erbrecht_complex",
            "scenarios/mietrecht_complex",
            "scenarios/fluggastrecht_complex",
            "scenarios/verkehrsunfall_complex"
    })
    void validateJsonSampleFiles(String datasetName) throws IOException {
        Path jsonPath = datasetsPath.resolve(datasetName + ".json");
        assertTrue(Files.exists(jsonPath), "JSON file not found: " + jsonPath);

        String jsonContent = Files.readString(jsonPath);
        // Strip comments (lines starting with //)
        jsonContent = jsonContent.replaceAll("(?m)^\\s*//.*$", "");

        var serializer = XJustizSerializer.createJson();

        var message = serializer.deserialize(jsonContent, UebermittlungSchriftgutobjekteNachricht.class);

        assertNotNull(message);

        // Verify XML serialization (round trip capability check)
        var xmlSerializer = XJustizSerializer.createDefault();
        String xml = xmlSerializer.serialize(message);
        assertNotNull(xml);
        assertTrue(xml.length() > 0);
    }
}
