package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine Organisation (juristische Person).
 * <p>
 * <u><b>Organization:</b></u> An organization (legal entity).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Organisation {

    /**
     * Bezeichnung / Name der Organisation.
     * <p>
     * <u><b>Designation:</b></u> Name of the organization.
     */
    @XmlElement(name = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bezeichnung")
    @Nullable
    private Bezeichnung bezeichnung;

    /**
     * Auch Postfach-Anschriften fallen hierunter.
     * <p>
     * <u><b>Address:</b></u> Post office box addresses also fall under this.
     */
    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
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
    @Nullable
    private Bankverbindung bankverbindung;

    public Organisation() {}

    public Bezeichnung getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(Bezeichnung bezeichnung) { this.bezeichnung = bezeichnung; }

    public Anschrift getAnschrift() { return anschrift; }
    public void setAnschrift(Anschrift anschrift) { this.anschrift = anschrift; }

    public List<Telekommunikation> getTelekommunikation() { return telekommunikation; }
    public void setTelekommunikation(List<Telekommunikation> telekommunikation) { this.telekommunikation = telekommunikation; }

    public Bankverbindung getBankverbindung() { return bankverbindung; }
    public void setBankverbindung(Bankverbindung bankverbindung) { this.bankverbindung = bankverbindung; }

}