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
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine VersicherungCore.
 * <p>
 * <u><b>Insurance:</b></u> Represents an insurance.
 */
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
    private List<Organisation> versicherungsunternehmen;

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

    public VersicherungCore() {}

    public String getVersicherungsnummer() { return versicherungsnummer; }
    public void setVersicherungsnummer(String versicherungsnummer) { this.versicherungsnummer = versicherungsnummer; }

    public List<Organisation> getVersicherungsunternehmen() { return versicherungsunternehmen; }
    public void setVersicherungsunternehmen(List<Organisation> versicherungsunternehmen) { this.versicherungsunternehmen = versicherungsunternehmen; }

    public Anschrift getAnschrift() { return anschrift; }
    public void setAnschrift(Anschrift anschrift) { this.anschrift = anschrift; }

    public UUID getReferenzId() { return referenzId; }
    public void setReferenzId(UUID referenzId) { this.referenzId = referenzId; }

    public AuswahlBeteiligter getVersicherter() { return versicherter; }
    public void setVersicherter(AuswahlBeteiligter versicherter) { this.versicherter = versicherter; }

    public String getSchadensnummer() { return schadensnummer; }
    public void setSchadensnummer(String schadensnummer) { this.schadensnummer = schadensnummer; }

    public VersicherungsTyp getVersicherungstyp() { return versicherungstyp; }
    public void setVersicherungstyp(VersicherungsTyp versicherungstyp) { this.versicherungstyp = versicherungstyp; }

    public Selbstbeteiligung getSelbstbeteiligung() { return selbstbeteiligung; }
    public void setSelbstbeteiligung(Selbstbeteiligung selbstbeteiligung) { this.selbstbeteiligung = selbstbeteiligung; }

    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() { return anwendungsspezifischeErweiterung; }
    public void setAnwendungsspezifischeErweiterung(AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) { this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung; }

}