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
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Akte.
 * <p>
 * <u><b>File:</b></u> Represents a file / case.
 */
@XmlType(name = "Akte", propOrder = { "identifikation", "anwendungsspezifischeErweiterung", "fachspezifischeDaten" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Akte {

    /**
     * Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und entspricht dem xdomea-Typ 'IdentifikationObjektType'.
     * <p>
     * <u><b>Identification:</b></u> The type serves to uniquely identify document objects and corresponds to the xdomea type 'IdentifikationObjektType'.
     */
    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    @JsonAlias({ "identifikation" })
    private Identifikation identifikation;

    /**
     * Daten einer Akte, die <u>nicht</u> durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Custom case file data:</b></u> Data of a case file that can <u>not</u> be represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @JsonAlias({ "anwendungsspezifischeErweiterung" })
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    /**
     * Daten einer Akte, die bereits durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Case file data:</b></u> Data of a case file that can already be represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    @JsonAlias({ "fachspezifischeDaten" })
    private XjustizAkteFachspezifischeDaten fachspezifischeDaten;

    public Akte() {}

    public Identifikation getIdentifikation() { return identifikation; }
    public void setIdentifikation(Identifikation identifikation) { this.identifikation = identifikation; }

    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() { return anwendungsspezifischeErweiterung; }
    public void setAnwendungsspezifischeErweiterung(AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) { this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung; }

    public XjustizAkteFachspezifischeDaten getFachspezifischeDaten() { return fachspezifischeDaten; }
    public void setFachspezifischeDaten(XjustizAkteFachspezifischeDaten fachspezifischeDaten) { this.fachspezifischeDaten = fachspezifischeDaten; }

}