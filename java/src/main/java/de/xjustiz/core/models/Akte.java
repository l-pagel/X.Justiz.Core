package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Akte.<br/>
/// <u><b>File:</b></u> Represents a file / case.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Akte {

    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    private Identifikation identifikation;

    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    private XjustizAkteFachspezifischeDaten fachspezifischeDaten;

    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    public Akte() {
    }

    public Identifikation getIdentifikation() {
        return identifikation;
    }

    public void setIdentifikation(Identifikation identifikation) {
        this.identifikation = identifikation;
    }

    public XjustizAkteFachspezifischeDaten getFachspezifischeDaten() {
        return fachspezifischeDaten;
    }

    public void setFachspezifischeDaten(XjustizAkteFachspezifischeDaten fachspezifischeDaten) {
        this.fachspezifischeDaten = fachspezifischeDaten;
    }

    @Nullable
    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() {
        return anwendungsspezifischeErweiterung;
    }

    public void setAnwendungsspezifischeErweiterung(@Nullable AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) {
        this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung;
    }

}
