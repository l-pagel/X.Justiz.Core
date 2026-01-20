package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine natürliche Person.
 * <p>
 *  <u><b>Natural person:</b></u> A natural person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class NatuerlichePerson {

    /**
     * Der volle Name einer natürlichen Person.
     * <p>
     *  <u><b>Full name:</b></u> The full name of a natural person.
     */
    @XmlElement(name = "vollerName", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "vollerName", namespace = "http://www.xjustiz.de")
    @JsonProperty("VollerName")
    private VollerName vollerName;

    /**
     * Hier kann ein biologisches oder grammatikalisches Geschlecht angegeben werden. So wird den Fachsystemen ermöglicht eine Anrede zu generieren.
     * <p>
     *  <u><b>Gender:</b></u> A biological or grammatical gender can be specified here. This allows specialized systems to generate a salutation.
     */
    @XmlElement(name = "geschlecht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "geschlecht", namespace = "http://www.xjustiz.de")
    @JsonProperty("Geschlecht")
    private Geschlecht geschlecht;

    /**
     * Auch Postfach-Anschriften fallen hierunter.
     * <p>
     *  <u><b>Address:</b></u> Post office box addresses also fall under this.
     */
    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
    @Nullable
    private Anschrift anschrift;

    /**
     * Informationen zur Telekommunikation (Telefon, Email, etc.).
     * <p>
     *  <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
     */
    @XmlElement(name = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Telekommunikation")
    @Nullable
    private List<Telekommunikation> telekommunikation;

    /**
     * Hier steht die allgemeine Bankverbindung.
     * <p>
     *  <u><b>Bank details:</b></u> Here is the general bank connection.
     */
    @XmlElement(name = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bankverbindung")
    @Nullable
    private Bankverbindung bankverbindung;

    /**
     * Default constructor.
     */
    public NatuerlichePerson() {
    }

    /**
     * Der volle Name einer natürlichen Person.
     *
     * @return the vollerName
     */
    public VollerName getVollerName() {
        return vollerName;
    }

    /**
     * Sets the vollerName.
     *
     * @param vollerName the vollerName to set
     */
    public void setVollerName(VollerName vollerName) {
        this.vollerName = vollerName;
    }

    /**
     * Hier kann ein biologisches oder grammatikalisches Geschlecht angegeben werden. So wird den Fachsystemen ermöglicht eine Anrede zu generieren.
     *
     * @return the geschlecht
     */
    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the geschlecht.
     *
     * @param geschlecht the geschlecht to set
     */
    public void setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     * Auch Postfach-Anschriften fallen hierunter.
     *
     * @return the anschrift
     */
    @Nullable
    public Anschrift getAnschrift() {
        return anschrift;
    }

    /**
     * Sets the anschrift.
     *
     * @param anschrift the anschrift to set
     */
    public void setAnschrift(@Nullable Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    /**
     * Informationen zur Telekommunikation (Telefon, Email, etc.).
     *
     * @return the telekommunikation
     */
    @Nullable
    public List<Telekommunikation> getTelekommunikation() {
        return telekommunikation;
    }

    /**
     * Sets the telekommunikation.
     *
     * @param telekommunikation the telekommunikation to set
     */
    public void setTelekommunikation(@Nullable List<Telekommunikation> telekommunikation) {
        this.telekommunikation = telekommunikation;
    }

    /**
     * Hier steht die allgemeine Bankverbindung.
     *
     * @return the bankverbindung
     */
    @Nullable
    public Bankverbindung getBankverbindung() {
        return bankverbindung;
    }

    /**
     * Sets the bankverbindung.
     *
     * @param bankverbindung the bankverbindung to set
     */
    public void setBankverbindung(@Nullable Bankverbindung bankverbindung) {
        this.bankverbindung = bankverbindung;
    }

}
