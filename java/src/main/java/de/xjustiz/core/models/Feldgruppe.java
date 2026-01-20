package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine Gruppe von Feldern.<br/>
/// <u><b>Field group:</b></u> A group of fields.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Feldgruppe {

    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @Nullable
    private String name;

    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    private String beschreibung;

    @XmlElement(name = "unterfeldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "unterfeldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("UnterFeldgruppen")
    @Nullable
    private List<Feldgruppe> unterFeldgruppen;

    @XmlElement(name = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Felder")
    @Nullable
    private List<Feld> felder;

    public Feldgruppe() {
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Nullable
    public List<Feldgruppe> getUnterFeldgruppen() {
        return unterFeldgruppen;
    }

    public void setUnterFeldgruppen(@Nullable List<Feldgruppe> unterFeldgruppen) {
        this.unterFeldgruppen = unterFeldgruppen;
    }

    @Nullable
    public List<Feld> getFelder() {
        return felder;
    }

    public void setFelder(@Nullable List<Feld> felder) {
        this.felder = felder;
    }

}
