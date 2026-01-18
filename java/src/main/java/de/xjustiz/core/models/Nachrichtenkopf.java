package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Der Kopf der Nachricht.
 * <p>
 * <b>Message Header:</b> The header of the message.
 * </p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Nachrichtenkopf {

    /**
     * Verwendete X.Justiz-Version für diese Nachricht.
     */
    @XmlAttribute(name = "xjustizVersion")
    @JacksonXmlProperty(isAttribute = true, localName = "xjustizVersion")
    @JsonProperty("Version")
    private String version = "3.5.1";

    /**
     * Aktenzeichen des Absenders.
     */
    @XmlElement(name = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JsonProperty("AktenzeichenAbsender")
    @Nullable
    private List<String> aktenzeichenAbsender;

    /**
     * Aktenzeichen des Empfängers.
     */
    @XmlElement(name = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JsonProperty("AktenzeichenEmpfaenger")
    @Nullable
    private List<String> aktenzeichenEmpfaenger;

    /**
     * Der Erstellungszeitpunkt der XJustiz-Nachricht.
     */
    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    private OffsetDateTime erstellungszeitpunkt;

    /**
     * Auswahlstruktur für den Absender.
     */
    @XmlElement(name = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JsonProperty("Absender")
    private AuswahlAdresse absender;

    /**
     * Auswahlstruktur für den Empfänger.
     */
    @XmlElement(name = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JsonProperty("Empfaenger")
    private AuswahlAdresse empfaenger;

    /**
     * Eindeutige Identifikation der Nachricht.
     */
    @XmlElement(name = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JsonProperty("EigeneNachrichtenId")
    @Nullable
    private String eigeneNachrichtenId;

    public Nachrichtenkopf() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Nullable
    public List<String> getAktenzeichenAbsender() {
        return aktenzeichenAbsender;
    }

    public void setAktenzeichenAbsender(@Nullable List<String> aktenzeichenAbsender) {
        this.aktenzeichenAbsender = aktenzeichenAbsender;
    }

    @Nullable
    public List<String> getAktenzeichenEmpfaenger() {
        return aktenzeichenEmpfaenger;
    }

    public void setAktenzeichenEmpfaenger(@Nullable List<String> aktenzeichenEmpfaenger) {
        this.aktenzeichenEmpfaenger = aktenzeichenEmpfaenger;
    }

    public OffsetDateTime getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    public void setErstellungszeitpunkt(OffsetDateTime erstellungszeitpunkt) {
        this.erstellungszeitpunkt = erstellungszeitpunkt;
    }

    public AuswahlAdresse getAbsender() {
        return absender;
    }

    public void setAbsender(AuswahlAdresse absender) {
        this.absender = absender;
    }

    public AuswahlAdresse getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(AuswahlAdresse empfaenger) {
        this.empfaenger = empfaenger;
    }

    @Nullable
    public String getEigeneNachrichtenId() {
        return eigeneNachrichtenId;
    }

    public void setEigeneNachrichtenId(@Nullable String eigeneNachrichtenId) {
        this.eigeneNachrichtenId = eigeneNachrichtenId;
    }
}
