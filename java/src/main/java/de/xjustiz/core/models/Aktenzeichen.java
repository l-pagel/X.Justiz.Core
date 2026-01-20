package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Repräsentiert ein Aktenzeichen.<br/>
/// <u><b>File reference:</b></u> Represents a file reference / case number.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Aktenzeichen {

    @XmlElement(name = "auswahl_aktenzeichen", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_aktenzeichen", namespace = "http://www.xjustiz.de")
    @JsonProperty("Auswahl")
    private AuswahlAktenzeichen auswahl;

    public Aktenzeichen() {
    }

    public AuswahlAktenzeichen getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(AuswahlAktenzeichen auswahl) {
        this.auswahl = auswahl;
    }

}
