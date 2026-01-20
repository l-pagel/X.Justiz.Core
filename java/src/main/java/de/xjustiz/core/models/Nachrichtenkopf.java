package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.time.OffsetDateTime;
import org.jetbrains.annotations.Nullable;

/**
 * Der Kopf der Nachricht.<br/>
/// <u><b>Message header:</b></u> The header of the message.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Nachrichtenkopf {

    @XmlElement(name = "xjustizVersion", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustizVersion", namespace = "http://www.xjustiz.de")
    @JsonProperty("Version")
    private String version;

    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    private OffsetDateTime erstellungszeitpunkt;

    @XmlElement(name = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JsonProperty("Absender")
    private AuswahlAdresse absender;

    @XmlElement(name = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JsonProperty("Empfaenger")
    private AuswahlAdresse empfaenger;

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
