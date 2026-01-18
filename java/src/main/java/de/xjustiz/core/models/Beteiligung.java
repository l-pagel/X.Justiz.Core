package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Repräsentiert eine Beteiligung am Verfahren.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Beteiligung {

    @XmlElement(name = "beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beteiligter")
    private Beteiligter beteiligter;

    public Beteiligung() {
    }

    public Beteiligter getBeteiligter() {
        return beteiligter;
    }

    public void setBeteiligter(Beteiligter beteiligter) {
        this.beteiligter = beteiligter;
    }
}
