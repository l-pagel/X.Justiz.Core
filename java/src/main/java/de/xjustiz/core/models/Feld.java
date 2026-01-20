package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert ein allgemeines Feld (Key-Value-Paar).
 * <p>
 *  <u><b>Field:</b></u> Represents a generic field (key-value pair).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Feld {

    /**
     * Der Name des Feldes.
     * <p>
     *  <u><b>Name:</b></u> The name of the field.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @Nullable
    private String name;

    /**
     * Die Hinweise und Erläuterungen zu einem Feld.
     * <p>
     *  <u><b>Description:</b></u> The notes and explanations for a field.
     */
    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @Nullable
    private String beschreibung;

    /**
     * Der Datentyp des Feldwertes. Gültige Angaben sind die W3C-Datentypen.
     * <p>
     *  <u><b>Data type:</b></u> The data type of the field value. Valid entries are the W3C data types.
     */
    @XmlElement(name = "datentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "datentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Datentyp")
    @Nullable
    private String datentyp;

    /**
     * Der Wert des Feldes.
     * <p>
     *  <u><b>Value:</b></u> The value of the field.
     */
    @XmlElement(name = "wert", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustiz.de")
    @JsonProperty("Wert")
    @Nullable
    private String wert;

    /**
     * Default constructor.
     */
    public Feld() {
    }

    /**
     * Der Name des Feldes.
     *
     * @return the name
     */
    @Nullable
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Die Hinweise und Erläuterungen zu einem Feld.
     *
     * @return the beschreibung
     */
    @Nullable
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the beschreibung.
     *
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(@Nullable String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Der Datentyp des Feldwertes. Gültige Angaben sind die W3C-Datentypen.
     *
     * @return the datentyp
     */
    @Nullable
    public String getDatentyp() {
        return datentyp;
    }

    /**
     * Sets the datentyp.
     *
     * @param datentyp the datentyp to set
     */
    public void setDatentyp(@Nullable String datentyp) {
        this.datentyp = datentyp;
    }

    /**
     * Der Wert des Feldes.
     *
     * @return the wert
     */
    @Nullable
    public String getWert() {
        return wert;
    }

    /**
     * Sets the wert.
     *
     * @param wert the wert to set
     */
    public void setWert(@Nullable String wert) {
        this.wert = wert;
    }

}
