package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Verknüpft eine Rolle mit einem Beteiligten.
 * <p>
 * <u><b>Participation:</b></u> Associates a role with a participant.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Beteiligung {

    /**
     * Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter,
     * Zeuge, Dolmetscher, Rechtsanwalt.
     * <p>
     * <u><b>Role:</b></u> Each participant can have one or more roles, e.g.,
     * plaintiff, defendant, witness, interpreter, lawyer.
     */
    @XmlElement(name = "rolle", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "rolle", namespace = "http://www.xjustiz.de")
    @JsonProperty("Rolle")
    private Rolle rolle;

    /**
     * Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder
     * eine Organisation sein.
     * <p>
     * <u><b>Participant:</b></u> A participant can be a natural person, a law firm,
     * or an organization.
     */
    @XmlElement(name = "beteiligter", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligter", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beteiligter")
    private Beteiligter beteiligter;

    /**
     * Default constructor.
     */
    public Beteiligung() {
    }

    /**
     * Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter,
     * Zeuge, Dolmetscher, Rechtsanwalt.
     *
     * @return the rolle
     */
    public Rolle getRolle() {
        return rolle;
    }

    /**
     * Sets the rolle.
     *
     * @param rolle the rolle to set
     */
    public void setRolle(Rolle rolle) {
        this.rolle = rolle;
    }

    /**
     * Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder
     * eine Organisation sein.
     *
     * @return the beteiligter
     */
    public Beteiligter getBeteiligter() {
        return beteiligter;
    }

    /**
     * Sets the beteiligter.
     *
     * @param beteiligter the beteiligter to set
     */
    public void setBeteiligter(Beteiligter beteiligter) {
        this.beteiligter = beteiligter;
    }

}
