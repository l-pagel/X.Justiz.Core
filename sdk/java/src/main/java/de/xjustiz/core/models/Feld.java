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
 * Repräsentiert ein allgemeines Feld (Key-Value-Paar).
 * <p>
 * <u><b>Field:</b></u> Represents a generic field (key-value pair).
 */
@XmlType(name = "Feld", propOrder = { "name", "beschreibung", "datentyp", "wert" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Feld {

    /**
     * Der Name des Feldes.
     * <p>
     * <u><b>Name:</b></u> The name of the field.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @JsonAlias({ "name" })
    @Nullable
    private String name;

    /**
     * Die Hinweise und Erläuterungen zu einem Feld.
     * <p>
     * <u><b>Description:</b></u> The notes and explanations for a field.
     */
    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @JsonAlias({ "beschreibung" })
    @Nullable
    private String beschreibung;

    /**
     * Der Datentyp des Feldwertes. Gültige Angaben sind die W3C-Datentypen.
     * <p>
     * <u><b>Data type:</b></u> The data type of the field value. Valid entries are the W3C data types.
     */
    @XmlElement(name = "datentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "datentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Datentyp")
    @JsonAlias({ "datentyp" })
    @Nullable
    private String datentyp;

    /**
     * Der Wert des Feldes.
     * <p>
     * <u><b>Value:</b></u> The value of the field.
     */
    @XmlElement(name = "wert", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustiz.de")
    @JsonProperty("Wert")
    @JsonAlias({ "wert" })
    @Nullable
    private String wert;

    /**
     * Default constructor.
     */
    public Feld() {}

    /**
     * Gets the value of the Name property.
     * @return the value of the Name property
     */
    public String getName() { return name; }
    /**
     * Sets the value of the Name property.
     * @param name the value to set
     */
    public void setName(String name) { this.name = name; }

    /**
     * Gets the value of the Beschreibung property.
     * @return the value of the Beschreibung property
     */
    public String getBeschreibung() { return beschreibung; }
    /**
     * Sets the value of the Beschreibung property.
     * @param beschreibung the value to set
     */
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    /**
     * Gets the value of the Datentyp property.
     * @return the value of the Datentyp property
     */
    public String getDatentyp() { return datentyp; }
    /**
     * Sets the value of the Datentyp property.
     * @param datentyp the value to set
     */
    public void setDatentyp(String datentyp) { this.datentyp = datentyp; }

    /**
     * Gets the value of the Wert property.
     * @return the value of the Wert property
     */
    public String getWert() { return wert; }
    /**
     * Sets the value of the Wert property.
     * @param wert the value to set
     */
    public void setWert(String wert) { this.wert = wert; }

}