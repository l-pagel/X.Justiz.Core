package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Basiselement zur Übermittlung von Daten im X.Justiz Format.
 * <p>
 * <u><b>Document Object Transmission Message:</b></u> Root element for the transmission of data in the X.Justiz format.
 */
@XmlRootElement(name = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@JacksonXmlRootElement(localName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@XmlType(name = "UebermittlungSchriftgutobjekteNachricht", propOrder = { "kopf", "grunddaten", "schriftgutobjekte", "schemaLocation" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UebermittlungSchriftgutobjekteNachricht {

    /**
     * Der Kopf der Nachricht.
     * <p>
     * <u><b>Message header:</b></u> The header of the message.
     */
    @XmlElement(name = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kopf")
    @JsonAlias({ "kopf" })
    private Nachrichtenkopf kopf;

    /**
     * Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
     * <p>
     * <u><b>Basic data:</b></u> The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
     */
    @XmlElement(name = "grunddaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "grunddaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Grunddaten")
    @JsonAlias({ "grunddaten" })
    @Nullable
    private Grunddaten grunddaten;

    /**
     * Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
     * <p>
     * <u><b>Document objects:</b></u> This element is only used for communication with the electronic file repository for bailiffs.
     */
    @XmlElement(name = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JsonProperty("Schriftgutobjekte")
    @JsonAlias({ "schriftgutobjekte" })
    @Nullable
    private Schriftgutobjekte schriftgutobjekte;

    /**
     * Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
     * <p>
     * <u><b>Schema location:</b></u> Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace-URI / schema-URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
     */
    @XmlAttribute(name = "schemaLocation", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    @JacksonXmlProperty(isAttribute = true, localName = "schemaLocation", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    @JsonProperty("SchemaLocation")
    @JsonAlias({ "schemaLocation" })
    private String schemaLocation;

    /**
     * Default constructor.
     */
    public UebermittlungSchriftgutobjekteNachricht() {}

    /**
     * Gets the value of the Kopf property.
     * @return the value of the Kopf property
     */
    public Nachrichtenkopf getKopf() { return kopf; }
    /**
     * Sets the value of the Kopf property.
     * @param kopf the value to set
     */
    public void setKopf(Nachrichtenkopf kopf) { this.kopf = kopf; }

    /**
     * Gets the value of the Grunddaten property.
     * @return the value of the Grunddaten property
     */
    public Grunddaten getGrunddaten() { return grunddaten; }
    /**
     * Sets the value of the Grunddaten property.
     * @param grunddaten the value to set
     */
    public void setGrunddaten(Grunddaten grunddaten) { this.grunddaten = grunddaten; }

    /**
     * Gets the value of the Schriftgutobjekte property.
     * @return the value of the Schriftgutobjekte property
     */
    public Schriftgutobjekte getSchriftgutobjekte() { return schriftgutobjekte; }
    /**
     * Sets the value of the Schriftgutobjekte property.
     * @param schriftgutobjekte the value to set
     */
    public void setSchriftgutobjekte(Schriftgutobjekte schriftgutobjekte) { this.schriftgutobjekte = schriftgutobjekte; }

    /**
     * Gets the value of the SchemaLocation property.
     * @return the value of the SchemaLocation property
     */
    public String getSchemaLocation() { return schemaLocation; }
    /**
     * Sets the value of the SchemaLocation property.
     * @param schemaLocation the value to set
     */
    public void setSchemaLocation(String schemaLocation) { this.schemaLocation = schemaLocation; }

}