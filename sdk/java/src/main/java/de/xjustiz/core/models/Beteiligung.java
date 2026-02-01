package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Verknüpft eine Rolle mit einem Beteiligten.
 * <p>
 * <u><b>Participation:</b></u> Associates a role with a participant.
 */
@XmlType(name = "Beteiligung", propOrder = { "rolle", "beteiligter" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Beteiligung {

    /**
     * Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter, Zeuge, Dolmetscher, Rechtsanwalt.
     * <p>
     * <u><b>Role:</b></u> Each participant can have one or more roles, e.g., plaintiff, defendant, witness, interpreter, lawyer.
     */
    @XmlElement(name = "rolle", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "rolle", namespace = "http://www.xjustiz.de")
    @JsonProperty("Rolle")
    @JsonAlias({ "rolle" })
    private Rolle rolle;

    /**
     * Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder eine Organisation sein.
     * <p>
     * <u><b>Participant:</b></u> A participant can be a natural person, a law firm, or an organization.
     */
    @XmlElement(name = "beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beteiligter")
    @JsonAlias({ "beteiligter" })
    private Beteiligter beteiligter;

    /**
     * Default constructor.
     */
    public Beteiligung() {}

    /**
     * Gets the value of the Rolle property.
     * @return the value of the Rolle property
     */
    public Rolle getRolle() { return rolle; }
    /**
     * Sets the value of the Rolle property.
     * @param rolle the value to set
     */
    public void setRolle(Rolle rolle) { this.rolle = rolle; }

    /**
     * Gets the value of the Beteiligter property.
     * @return the value of the Beteiligter property
     */
    public Beteiligter getBeteiligter() { return beteiligter; }
    /**
     * Sets the value of the Beteiligter property.
     * @param beteiligter the value to set
     */
    public void setBeteiligter(Beteiligter beteiligter) { this.beteiligter = beteiligter; }

}