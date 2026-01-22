package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Repräsentiert einen Beteiligten im Verfahren.
 * <p>
 * <u><b>Participant:</b></u> Represents a participant in the proceeding.
 */
@XmlType(name = "Beteiligter", propOrder = { "auswahl" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Beteiligter {

    /**
     * Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
     * <p>
     * <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
     */
    @XmlElement(name = "auswahl_beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Auswahl")
    @JsonAlias({ "auswahl" })
    private AuswahlBeteiligter auswahl;

    /**
     * Default constructor.
     */
    public Beteiligter() {}

    /**
     * Gets the value of the Auswahl property.
     * @return the value of the Auswahl property
     */
    public AuswahlBeteiligter getAuswahl() { return auswahl; }
    /**
     * Sets the value of the Auswahl property.
     * @param auswahl the value to set
     */
    public void setAuswahl(AuswahlBeteiligter auswahl) { this.auswahl = auswahl; }

}