package de.xjustiz.core;

import de.xjustiz.core.models.*;
import de.xjustiz.core.serialization.Format;
import de.xjustiz.core.serialization.XJustizSerializer;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for serialization and deserialization.
 */
class SerializerTest {

    @Test
    void testJsonSerialization() {
        // Arrange
        var message = createSampleMessage();
        var serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        // Act
        String json = serializer.serializePretty(message);

        // Assert
        assertNotNull(json);
        assertTrue(json.contains("Kopf"));
        assertTrue(json.contains("AktenzeichenAbsender"));
    }

    @Test
    void testXmlSerialization() {
        // Arrange
        var message = createSampleMessage();
        var serializer = XJustizSerializer.builder()
                .format(Format.XML)
                .build();

        // Act
        String xml = serializer.serializePretty(message);

        // Assert
        assertNotNull(xml);
        assertTrue(xml.contains("<nachrichtenkopf"));
        assertTrue(xml.contains("xjustizVersion"));
        assertTrue(xml.contains("<aktenzeichen.absender"));
    }

    @Test
    void testJsonDeserialization() {
        // Arrange
        String json = """
                {
                    "Kopf": {
                        "Version": "3.5.1",
                        "AktenzeichenAbsender": ["123 O 456/24"],
                        "Erstellungszeitpunkt": "2024-01-15T10:30:00Z"
                    }
                }
                """;
        var serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        // Act
        var message = serializer.deserialize(json, UebermittlungSchriftgutobjekteNachricht.class);

        // Assert
        assertNotNull(message);
        assertNotNull(message.getKopf());
        assertEquals("3.5.1", message.getKopf().getVersion());
        assertEquals(1, message.getKopf().getAktenzeichenAbsender().size());
        assertEquals("123 O 456/24", message.getKopf().getAktenzeichenAbsender().get(0));
    }

    @Test
    void testRoundTrip_Json() {
        // Arrange
        var original = createSampleMessage();
        var serializer = XJustizSerializer.builder()
                .format(Format.JSON)
                .build();

        // Act
        String json = serializer.serialize(original);
        var restored = serializer.deserialize(json, UebermittlungSchriftgutobjekteNachricht.class);

        // Assert
        assertNotNull(restored);
        assertNotNull(restored.getKopf());
        assertEquals(original.getKopf().getVersion(), restored.getKopf().getVersion());
        assertEquals(
                original.getKopf().getAktenzeichenAbsender(),
                restored.getKopf().getAktenzeichenAbsender());
    }

    private UebermittlungSchriftgutobjekteNachricht createSampleMessage() {
        var message = new UebermittlungSchriftgutobjekteNachricht();

        var kopf = new Nachrichtenkopf();
        kopf.setVersion("3.5.1");
        kopf.setAktenzeichenAbsender(List.of("123 O 456/24"));
        kopf.setAktenzeichenEmpfaenger(List.of("789 O 012/24"));
        kopf.setErstellungszeitpunkt(OffsetDateTime.now());
        kopf.setEigeneNachrichtenId("msg-12345");

        var absender = new AuswahlAdresse();
        absender.setAbsenderSonstige("Testgericht Berlin");
        kopf.setAbsender(absender);

        var empfaenger = new AuswahlAdresse();
        empfaenger.setEmpfaengerGericht("1234");
        kopf.setEmpfaenger(empfaenger);

        message.setKopf(kopf);

        return message;
    }
}
