package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine VersicherungCore.
 * <p>
 * <u><b>Insurance:</b></u> Represents an insurance.
 */
@XmlRootElement(name = "VersicherungCore", namespace = "http://www.xjustizcore.de")
@JacksonXmlRootElement(localName = "VersicherungCore", namespace = "http://www.xjustizcore.de")
@XmlType(name = "VersicherungCore", propOrder = { "versicherungsnummer", "versicherungsunternehmen", "anschrift", "referenzId", "versicherter", "schadensnummer", "versicherungstyp", "selbstbeteiligung", "anwendungsspezifischeErweiterung" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VersicherungCore {

    /**
     * Die Versicherungsnummer.
     * <p>
     * <u><b>Insurance number:</b></u> The insurance number.
     */
    @XmlElement(name = "versicherungsnummer", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "versicherungsnummer", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Versicherungsnummer")
    @JsonAlias({ "versicherungsnummer" })
    @Nullable
    private String versicherungsnummer;

    /**
     * Liste der Versicherungsunternehmen.
     * <p>
     * <u><b>Insurance companies:</b></u> List of insurance companies.
     */
    @XmlElement(name = "versicherungsunternehmen", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "versicherungsunternehmen", namespace = "http://www.xjustizcore.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Versicherungsunternehmen")
    @JsonAlias({ "versicherungsunternehmen" })
    @Nullable
    private List<Versicherer> versicherungsunternehmen;

    /**
     * Die Anschrift der VersicherungCore.
     * <p>
     * <u><b>Address:</b></u> The address of the insurance.
     */
    @XmlElement(name = "anschrift", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Anschrift")
    @JsonAlias({ "anschrift" })
    @Nullable
    private Anschrift anschrift;

    /**
     * Die Referenz-ID.
     * <p>
     * <u><b>Reference ID:</b></u> The reference ID.
     */
    @XmlElement(name = "referenzid", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "referenzid", namespace = "http://www.xjustizcore.de")
    @JsonProperty("ReferenzId")
    @JsonAlias({ "referenzId" })
    @Nullable
    private UUID referenzId;

    /**
     * Der Versicherte.
     * <p>
     * <u><b>Insured person:</b></u> The insured person.
     */
    @XmlElement(name = "versicherter", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "versicherter", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Versicherter")
    @JsonAlias({ "versicherter" })
    @Nullable
    private AuswahlBeteiligter versicherter;

    /**
     * Die Schadensnummer.
     * <p>
     * <u><b>Claim number:</b></u> The claim number.
     */
    @XmlElement(name = "schadensnummer", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "schadensnummer", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Schadensnummer")
    @JsonAlias({ "schadensnummer" })
    @Nullable
    private String schadensnummer;

    /**
     * Der Typ der VersicherungCore.
     * <p>
     * <u><b>Insurance type:</b></u> The type of insurance.
     */
    @XmlElement(name = "versicherungstyp", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "versicherungstyp", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Versicherungstyp")
    @JsonAlias({ "versicherungstyp" })
    @Nullable
    private VersicherungsTyp versicherungstyp;

    /**
     * Informationen zur Selbstbeteiligung.
     * <p>
     * <u><b>Deductible:</b></u> Information about the deductible.
     */
    @XmlElement(name = "selbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "selbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Selbstbeteiligung")
    @JsonAlias({ "selbstbeteiligung" })
    @Nullable
    private Selbstbeteiligung selbstbeteiligung;

    /**
     * Anwendungsspezifische Erweiterungen.
     * <p>
     * <u><b>Application-specific extensions:</b></u> Application-specific extensions.
     */
    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @JsonAlias({ "anwendungsspezifischeErweiterung" })
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    /**
     * Default constructor.
     */
    public VersicherungCore() {}

    /**
     * Gets the value of the Versicherungsnummer property.
     * @return the value of the Versicherungsnummer property
     */
    public String getVersicherungsnummer() { return versicherungsnummer; }
    /**
     * Sets the value of the Versicherungsnummer property.
     * @param versicherungsnummer the value to set
     */
    public void setVersicherungsnummer(String versicherungsnummer) { this.versicherungsnummer = versicherungsnummer; }

    /**
     * Gets the value of the Versicherungsunternehmen property.
     * @return the value of the Versicherungsunternehmen property
     */
    public List<Versicherer> getVersicherungsunternehmen() { return versicherungsunternehmen; }
    /**
     * Sets the value of the Versicherungsunternehmen property.
     * @param versicherungsunternehmen the value to set
     */
    public void setVersicherungsunternehmen(List<Versicherer> versicherungsunternehmen) { this.versicherungsunternehmen = versicherungsunternehmen; }

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
     * Gets the value of the ReferenzId property.
     * @return the value of the ReferenzId property
     */
    public UUID getReferenzId() { return referenzId; }
    /**
     * Sets the value of the ReferenzId property.
     * @param referenzId the value to set
     */
    public void setReferenzId(UUID referenzId) { this.referenzId = referenzId; }

    /**
     * Gets the value of the Versicherter property.
     * @return the value of the Versicherter property
     */
    public AuswahlBeteiligter getVersicherter() { return versicherter; }
    /**
     * Sets the value of the Versicherter property.
     * @param versicherter the value to set
     */
    public void setVersicherter(AuswahlBeteiligter versicherter) { this.versicherter = versicherter; }

    /**
     * Gets the value of the Schadensnummer property.
     * @return the value of the Schadensnummer property
     */
    public String getSchadensnummer() { return schadensnummer; }
    /**
     * Sets the value of the Schadensnummer property.
     * @param schadensnummer the value to set
     */
    public void setSchadensnummer(String schadensnummer) { this.schadensnummer = schadensnummer; }

    /**
     * Gets the value of the Versicherungstyp property.
     * @return the value of the Versicherungstyp property
     */
    public VersicherungsTyp getVersicherungstyp() { return versicherungstyp; }
    /**
     * Sets the value of the Versicherungstyp property.
     * @param versicherungstyp the value to set
     */
    public void setVersicherungstyp(VersicherungsTyp versicherungstyp) { this.versicherungstyp = versicherungstyp; }

    /**
     * Gets the value of the Selbstbeteiligung property.
     * @return the value of the Selbstbeteiligung property
     */
    public Selbstbeteiligung getSelbstbeteiligung() { return selbstbeteiligung; }
    /**
     * Sets the value of the Selbstbeteiligung property.
     * @param selbstbeteiligung the value to set
     */
    public void setSelbstbeteiligung(Selbstbeteiligung selbstbeteiligung) { this.selbstbeteiligung = selbstbeteiligung; }

    /**
     * Gets the value of the AnwendungsspezifischeErweiterung property.
     * @return the value of the AnwendungsspezifischeErweiterung property
     */
    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() { return anwendungsspezifischeErweiterung; }
    /**
     * Sets the value of the AnwendungsspezifischeErweiterung property.
     * @param anwendungsspezifischeErweiterung the value to set
     */
    public void setAnwendungsspezifischeErweiterung(AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) { this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung; }

}