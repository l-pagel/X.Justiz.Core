package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Repräsentiert einen Beteiligten im Verfahren.<br/>
/// <u><b>Participant:</b></u> Represents a participant in the proceeding.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Beteiligter {

    @XmlElement(name = "auswahl_beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Auswahl")
    private AuswahlBeteiligter auswahl;

    public Beteiligter() {
    }

    public AuswahlBeteiligter getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(AuswahlBeteiligter auswahl) {
        this.auswahl = auswahl;
    }

}
