package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Verknüpft eine Rolle mit einem Beteiligten.<br/>
/// <u><b>Participation:</b></u> Associates a role with a participant.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Beteiligung {

    @XmlElement(name = "rolle", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "rolle", namespace = "http://www.xjustiz.de")
    @JsonProperty("Rolle")
    private Rolle rolle;

    @XmlElement(name = "beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beteiligter")
    private Beteiligter beteiligter;

    public Beteiligung() {
    }

    public Rolle getRolle() {
        return rolle;
    }

    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    public Beteiligter getBeteiligter() {
        return beteiligter;
    }

    public void setBeteiligter(Beteiligter beteiligter) {
        this.beteiligter = beteiligter;
    }

}
