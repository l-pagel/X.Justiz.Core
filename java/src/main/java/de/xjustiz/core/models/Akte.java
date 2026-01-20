package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Akte.
 * <p>
 * <u><b>File:</b></u> Represents a file / case.
 */
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
    private Identifikation identifikation;

    /**
     * Daten einer Akte, die bereits durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Case file data:</b></u> Data of a case file that can already be represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    private XjustizAkteFachspezifischeDaten fachspezifischeDaten;

    /**
     * Daten einer Akte, die <u>nicht</u> durch in X.Justiz oder X.Justiz Core definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Custom case file data:</b></u> Data of a case file that can <u>not</u> be represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    public Akte() {}

    public Identifikation getIdentifikation() { return identifikation; }
    public void setIdentifikation(Identifikation identifikation) { this.identifikation = identifikation; }

    public XjustizAkteFachspezifischeDaten getFachspezifischeDaten() { return fachspezifischeDaten; }
    public void setFachspezifischeDaten(XjustizAkteFachspezifischeDaten fachspezifischeDaten) { this.fachspezifischeDaten = fachspezifischeDaten; }

    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() { return anwendungsspezifischeErweiterung; }
    public void setAnwendungsspezifischeErweiterung(AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) { this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung; }

}