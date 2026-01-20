package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Fachspezifische Daten einer Akte.<br/>
/// <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class XjustizAkteFachspezifischeDaten {

    @XmlElement(name = "aktentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktentyp")
    private Aktentyp aktentyp;

    @XmlElement(name = "anzeigename", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anzeigename", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anzeigename")
    @Nullable
    private String anzeigename;

    @XmlElement(name = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktenzeichen")
    private Aktenzeichen aktenzeichen;

    public XjustizAkteFachspezifischeDaten() {
    }

    public Aktentyp getAktentyp() {
        return aktentyp;
    }

    public void setAktentyp(Aktentyp aktentyp) {
        this.aktentyp = aktentyp;
    }

    @Nullable
    public String getAnzeigename() {
        return anzeigename;
    }

    public void setAnzeigename(@Nullable String anzeigename) {
        this.anzeigename = anzeigename;
    }

    public Aktenzeichen getAktenzeichen() {
        return aktenzeichen;
    }

    public void setAktenzeichen(Aktenzeichen aktenzeichen) {
        this.aktenzeichen = aktenzeichen;
    }

}
