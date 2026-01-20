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
 * Fachspezifische Daten eines Dokuments.
 * <p>
 * <u><b>Subject-specific data:</b></u> Specialized data of a document.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XjustizFachspezifischeDaten {

    /**
     * Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist
     * für einen reibungslosen, systemübergreifenden Austausch bewusst
     * knappgehalten. Für eine spezifischere Bezeichnung kann das Element
     * 'dokumententyp' verwendet werden.
     * <p>
     * <u><b>Document class:</b></u> Designates the document class based on the
     * predefined value list. This is deliberately kept concise for smooth,
     * cross-system exchange. For a more specific designation, the element
     * 'dokumententyp' (document type) can be used.
     */
    @XmlElement(name = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JsonProperty("Dokumentklasse")
    @Nullable
    private Dokumentklasse dokumentklasse;

    /**
     * Repräsentiert eine Datei.
     * <p>
     * <u><b>File:</b></u> Represents a file.
     */
    @XmlElement(name = "datei", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "datei", namespace = "http://www.xjustiz.de")
    @JsonProperty("Datei")
    private Datei datei;

    /**
     * Default constructor.
     */
    public XjustizFachspezifischeDaten() {
    }

    /**
     * Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist
     * für einen reibungslosen, systemübergreifenden Austausch bewusst
     * knappgehalten. Für eine spezifischere Bezeichnung kann das Element
     * 'dokumententyp' verwendet werden.
     *
     * @return the dokumentklasse
     */
    @Nullable
    public Dokumentklasse getDokumentklasse() {
        return dokumentklasse;
    }

    /**
     * Sets the dokumentklasse.
     *
     * @param dokumentklasse the dokumentklasse to set
     */
    public void setDokumentklasse(@Nullable Dokumentklasse dokumentklasse) {
        this.dokumentklasse = dokumentklasse;
    }

    /**
     * Repräsentiert eine Datei.
     *
     * @return the datei
     */
    public Datei getDatei() {
        return datei;
    }

    /**
     * Sets the datei.
     *
     * @param datei the datei to set
     */
    public void setDatei(Datei datei) {
        this.datei = datei;
    }

}
