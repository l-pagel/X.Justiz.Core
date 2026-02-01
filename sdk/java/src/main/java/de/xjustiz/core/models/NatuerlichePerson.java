package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine natürliche Person.
 * <p>
 * <u><b>Natural person:</b></u> A natural person.
 */
@XmlType(name = "NatuerlichePerson", propOrder = { "vollerName", "geschlecht", "anschrift", "telekommunikation", "bankverbindung" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NatuerlichePerson {

    /**
     * Der volle Name einer natürlichen Person.
     * <p>
     * <u><b>Full name:</b></u> The full name of a natural person.
     */
    @XmlElement(name = "vollerName", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "vollerName", namespace = "http://www.xjustiz.de")
    @JsonProperty("VollerName")
    @JsonAlias({ "vollerName" })
    private VollerName vollerName;

    /**
     * Hier kann ein biologisches oder grammatikalisches Geschlecht angegeben werden. So wird den Fachsystemen ermöglicht eine Anrede zu generieren.
     * <p>
     * <u><b>Gender:</b></u> A biological or grammatical gender can be specified here. This allows specialized systems to generate a salutation.
     */
    @XmlElement(name = "geschlecht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "geschlecht", namespace = "http://www.xjustiz.de")
    @JsonProperty("Geschlecht")
    @JsonAlias({ "geschlecht" })
    private Geschlecht geschlecht;

    /**
     * Auch Postfach-Anschriften fallen hierunter.
     * <p>
     * <u><b>Address:</b></u> Post office box addresses also fall under this.
     */
    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
    @JsonAlias({ "anschrift" })
    @Nullable
    private Anschrift anschrift;

    /**
     * Informationen zur Telekommunikation (Telefon, Email, etc.).
     * <p>
     * <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
     */
    @XmlElement(name = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Telekommunikation")
    @JsonAlias({ "telekommunikation" })
    @Nullable
    private List<Telekommunikation> telekommunikation;

    /**
     * Hier steht die allgemeine Bankverbindung.
     * <p>
     * <u><b>Bank details:</b></u> Here is the general bank connection.
     */
    @XmlElement(name = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bankverbindung")
    @JsonAlias({ "bankverbindung" })
    @Nullable
    private Bankverbindung bankverbindung;

    /**
     * Default constructor.
     */
    public NatuerlichePerson() {}

    /**
     * Gets the value of the VollerName property.
     * @return the value of the VollerName property
     */
    public VollerName getVollerName() { return vollerName; }
    /**
     * Sets the value of the VollerName property.
     * @param vollerName the value to set
     */
    public void setVollerName(VollerName vollerName) { this.vollerName = vollerName; }

    /**
     * Gets the value of the Geschlecht property.
     * @return the value of the Geschlecht property
     */
    public Geschlecht getGeschlecht() { return geschlecht; }
    /**
     * Sets the value of the Geschlecht property.
     * @param geschlecht the value to set
     */
    public void setGeschlecht(Geschlecht geschlecht) { this.geschlecht = geschlecht; }

    /**
     * Gets the value of the Anschrift property.
     * @return the value of the Anschrift property
     */
    public Anschrift getAnschrift() { return anschrift; }
    /**
     * Sets the value of the Anschrift property.
     * @param anschrift the value to set
     */
    public void setAnschrift(Anschrift anschrift) { this.anschrift = anschrift; }

    /**
     * Gets the value of the Telekommunikation property.
     * @return the value of the Telekommunikation property
     */
    public List<Telekommunikation> getTelekommunikation() { return telekommunikation; }
    /**
     * Sets the value of the Telekommunikation property.
     * @param telekommunikation the value to set
     */
    public void setTelekommunikation(List<Telekommunikation> telekommunikation) { this.telekommunikation = telekommunikation; }

    /**
     * Gets the value of the Bankverbindung property.
     * @return the value of the Bankverbindung property
     */
    public Bankverbindung getBankverbindung() { return bankverbindung; }
    /**
     * Sets the value of the Bankverbindung property.
     * @param bankverbindung the value to set
     */
    public void setBankverbindung(Bankverbindung bankverbindung) { this.bankverbindung = bankverbindung; }

}