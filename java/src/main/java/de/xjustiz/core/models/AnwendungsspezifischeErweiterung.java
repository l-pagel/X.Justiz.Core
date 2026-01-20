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
 * Container für anwendungsspezifische Erweiterungen.<br/>
/// <u><b>Application-specific extension:</b></u> Container for application-specific extensions.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AnwendungsspezifischeErweiterung {

    @XmlElement(name = "kennung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kennung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kennung")
    private String kennung;

    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    private String name;

    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @Nullable
    private String beschreibung;

    @XmlElement(name = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Feldgruppen")
    @Nullable
    private List<Feldgruppe> feldgruppen;

    @XmlElement(name = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Felder")
    @Nullable
    private List<Feld> felder;

    public AnwendungsspezifischeErweiterung() {
    }

    public String getKennung() {
        return kennung;
    }

    public void setKennung(String kennung) {
        this.kennung = kennung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
    public List<Feldgruppe> getFeldgruppen() {
        return feldgruppen;
    }

    public void setFeldgruppen(@Nullable List<Feldgruppe> feldgruppen) {
        this.feldgruppen = feldgruppen;
    }

    @Nullable
    public List<Feld> getFelder() {
        return felder;
    }

    public void setFelder(@Nullable List<Feld> felder) {
        this.felder = felder;
    }

}
