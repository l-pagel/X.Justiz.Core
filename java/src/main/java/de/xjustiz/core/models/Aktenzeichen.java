package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Repräsentiert ein Aktenzeichen.
 * <p>
 * <u><b>File reference:</b></u> Represents a file reference / case number.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Aktenzeichen {

    /**
     * Auswahlstruktur für Aktenzeichen.
     * <p>
     * <u><b>Selection:</b></u> Selection structure for file references.
     */
    @XmlElement(name = "auswahl_aktenzeichen", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_aktenzeichen", namespace = "http://www.xjustiz.de")
    @JsonProperty("Auswahl")
    private AuswahlAktenzeichen auswahl;

    public Aktenzeichen() {}

    public AuswahlAktenzeichen getAuswahl() { return auswahl; }
    public void setAuswahl(AuswahlAktenzeichen auswahl) { this.auswahl = auswahl; }

}