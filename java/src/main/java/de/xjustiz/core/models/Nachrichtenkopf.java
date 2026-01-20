package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Der Kopf der Nachricht.
 * <p>
 * <u><b>Message header:</b></u> The header of the message.
 */
@XmlType(name = "Nachrichtenkopf", propOrder = { "aktenzeichenAbsender", "aktenzeichenEmpfaenger", "erstellungszeitpunkt", "absender", "empfaenger", "eigeneNachrichtenId", "version" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Nachrichtenkopf {

    /**
     * Aktenzeichen des Absenders. Der Wert wird aus {@link Nachrichtenkopf#aktenzeichenAbsender} übernommen
     * <p>
     * <u><b>Sender file reference:</b></u> File reference of the sender. The value of {@link Nachrichtenkopf#aktenzeichenAbsender} will be taken.
     */
    @XmlElement(name = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AktenzeichenAbsender")
    @JsonAlias({ "aktenzeichenAbsender" })
    @Nullable
    private List<String> aktenzeichenAbsender;

    /**
     * Aktenzeichen des Empfängers.
     * <p>
     * <u><b>Recipient file reference:</b></u> File reference of the recipient.
     */
    @XmlElement(name = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AktenzeichenEmpfaenger")
    @JsonAlias({ "aktenzeichenEmpfaenger" })
    @Nullable
    private List<String> aktenzeichenEmpfaenger;

    /**
     * Hier ist der Erstellungszeitpunkt der XJustiz-Nachricht einzutragen.
     * <p>
     * <u><b>Creation time:</b></u> The creation time of the XJustiz message must be entered here.
     */
    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    @JsonAlias({ "erstellungszeitpunkt" })
    private OffsetDateTime erstellungszeitpunkt;

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     * <p>
     * <u><b>Sender:</b></u> Selection structure for addresses (sender or receiver).
     */
    @XmlElement(name = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JsonProperty("Absender")
    @JsonAlias({ "absender" })
    private AuswahlAdresse absender;

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     * <p>
     * <u><b>Recipient:</b></u> Selection structure for addresses (sender or receiver).
     */
    @XmlElement(name = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JsonProperty("Empfaenger")
    @JsonAlias({ "empfaenger" })
    private AuswahlAdresse empfaenger;

    /**
     * Hier ist eine eindeutige Identifikation der bei diesem Übermittlungsvorgang erstellten Nachricht anzugeben, um spätere Referenzen zu ermöglichen.
     * <p>
     * <u><b>Own message ID:</b></u> A unique identification of the message created during this transmission process must be specified here to enable later references.
     */
    @XmlElement(name = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JsonProperty("EigeneNachrichtenId")
    @JsonAlias({ "eigeneNachrichtenId" })
    @Nullable
    private String eigeneNachrichtenId;

    /**
     * Verwendete X.Justiz-Version für diese Nachricht.
     * <p>
     * <u><b>XJustiz version:</b></u> Used X.Justiz version for this message.
     */
    @XmlAttribute(name = "xjustizVersion")
    @JacksonXmlProperty(isAttribute = true, localName = "xjustizVersion")
    @JsonProperty("Version")
    @JsonAlias({ "version" })
    private String version;

    public Nachrichtenkopf() {}

    public List<String> getAktenzeichenAbsender() { return aktenzeichenAbsender; }
    public void setAktenzeichenAbsender(List<String> aktenzeichenAbsender) { this.aktenzeichenAbsender = aktenzeichenAbsender; }

    public List<String> getAktenzeichenEmpfaenger() { return aktenzeichenEmpfaenger; }
    public void setAktenzeichenEmpfaenger(List<String> aktenzeichenEmpfaenger) { this.aktenzeichenEmpfaenger = aktenzeichenEmpfaenger; }

    public OffsetDateTime getErstellungszeitpunkt() { return erstellungszeitpunkt; }
    public void setErstellungszeitpunkt(OffsetDateTime erstellungszeitpunkt) { this.erstellungszeitpunkt = erstellungszeitpunkt; }

    public AuswahlAdresse getAbsender() { return absender; }
    public void setAbsender(AuswahlAdresse absender) { this.absender = absender; }

    public AuswahlAdresse getEmpfaenger() { return empfaenger; }
    public void setEmpfaenger(AuswahlAdresse empfaenger) { this.empfaenger = empfaenger; }

    public String getEigeneNachrichtenId() { return eigeneNachrichtenId; }
    public void setEigeneNachrichtenId(String eigeneNachrichtenId) { this.eigeneNachrichtenId = eigeneNachrichtenId; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

}