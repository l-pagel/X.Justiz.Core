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
 * Fachspezifische Daten eines Dokuments.
 * <p>
 * <u><b>Subject-specific data:</b></u> Specialized data of a document.
 */
@XmlType(name = "XjustizFachspezifischeDaten", propOrder = { "dokumentklasse", "datei" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XjustizFachspezifischeDaten {

    /**
     * Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen, systemübergreifenden Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Element 'dokumententyp' verwendet werden.
     * <p>
     * <u><b>Document class:</b></u> Designates the document class based on the predefined value list. This is deliberately kept concise for smooth, cross-system exchange. For a more specific designation, the element 'dokumententyp' (document type) can be used.
     */
    @XmlElement(name = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JsonProperty("Dokumentklasse")
    @JsonAlias({ "dokumentklasse" })
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
    @JsonAlias({ "datei" })
    private Datei datei;

    /**
     * Default constructor.
     */
    public XjustizFachspezifischeDaten() {}

    /**
     * Gets the value of the Dokumentklasse property.
     * @return the value of the Dokumentklasse property
     */
    public Dokumentklasse getDokumentklasse() { return dokumentklasse; }
    /**
     * Sets the value of the Dokumentklasse property.
     * @param dokumentklasse the value to set
     */
    public void setDokumentklasse(Dokumentklasse dokumentklasse) { this.dokumentklasse = dokumentklasse; }

    /**
     * Gets the value of the Datei property.
     * @return the value of the Datei property
     */
    public Datei getDatei() { return datei; }
    /**
     * Sets the value of the Datei property.
     * @param datei the value to set
     */
    public void setDatei(Datei datei) { this.datei = datei; }

}