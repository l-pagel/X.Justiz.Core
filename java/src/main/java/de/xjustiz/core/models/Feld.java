package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert ein allgemeines Feld (Key-Value-Paar).<br/>
/// <u><b>Field:</b></u> Represents a generic field (key-value pair).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Feld {

    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @Nullable
    private String name;

    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @Nullable
    private String beschreibung;

    @XmlElement(name = "datentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "datentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Datentyp")
    @Nullable
    private String datentyp;

    @XmlElement(name = "wert", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustiz.de")
    @JsonProperty("Wert")
    @Nullable
    private String wert;

    public Feld() {
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(@Nullable String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Nullable
    public String getDatentyp() {
        return datentyp;
    }

    public void setDatentyp(@Nullable String datentyp) {
        this.datentyp = datentyp;
    }

    @Nullable
    public String getWert() {
        return wert;
    }

    public void setWert(@Nullable String wert) {
        this.wert = wert;
    }

}
