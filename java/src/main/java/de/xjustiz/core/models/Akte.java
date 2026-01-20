package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
     * Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und
     * entspricht dem xdomea-Typ 'IdentifikationObjektType'.
     * <p>
     * <u><b>Identification:</b></u> The type serves to uniquely identify document
     * objects and corresponds to the xdomea type 'IdentifikationObjektType'.
     */
    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    private Identifikation identifikation;

    /**
     * Daten einer Akte, die <u>nicht</u> durch in X.Justiz oder X.Justiz Core
     * definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Custom case file data:</b></u> Data of a case file that can <u>not</u>
     * be represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    /**
     * Daten einer Akte, die bereits durch in X.Justiz oder X.Justiz Core
     * definierten Datenfeldern abbildbar sind.
     * <p>
     * <u><b>Case file data:</b></u> Data of a case file that can already be
     * represented by data fields defined in X.Justiz or X.Justiz Core.
     */
    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    private XjustizAkteFachspezifischeDaten fachspezifischeDaten;

    /**
     * Default constructor.
     */
    public Akte() {
    }

    /**
     * Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und
     * entspricht dem xdomea-Typ 'IdentifikationObjektType'.
     *
     * @return the identifikation
     */
    public Identifikation getIdentifikation() {
        return identifikation;
    }

    /**
     * Sets the identifikation.
     *
     * @param identifikation the identifikation to set
     */
    public void setIdentifikation(Identifikation identifikation) {
        this.identifikation = identifikation;
    }

    /**
     * Daten einer Akte, die bereits durch in X.Justiz oder X.Justiz Core
     * definierten Datenfeldern abbildbar sind.
     *
     * @return the fachspezifischeDaten
     */
    public XjustizAkteFachspezifischeDaten getFachspezifischeDaten() {
        return fachspezifischeDaten;
    }

    /**
     * Sets the fachspezifischeDaten.
     *
     * @param fachspezifischeDaten the fachspezifischeDaten to set
     */
    public void setFachspezifischeDaten(XjustizAkteFachspezifischeDaten fachspezifischeDaten) {
        this.fachspezifischeDaten = fachspezifischeDaten;
    }

    /**
     * Daten einer Akte, die <u>nicht</u> durch in X.Justiz oder X.Justiz Core
     * definierten Datenfeldern abbildbar sind.
     *
     * @return the anwendungsspezifischeErweiterung
     */
    @Nullable
    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() {
        return anwendungsspezifischeErweiterung;
    }

    /**
     * Sets the anwendungsspezifischeErweiterung.
     *
     * @param anwendungsspezifischeErweiterung the anwendungsspezifischeErweiterung
     *                                         to set
     */
    public void setAnwendungsspezifischeErweiterung(
            @Nullable AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) {
        this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung;
    }

}
