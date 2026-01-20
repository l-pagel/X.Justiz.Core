package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Fachspezifische Daten eines Dokuments.<br/>
/// <u><b>Subject-specific data:</b></u> Specialized data of a document.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class XjustizFachspezifischeDaten {

    @XmlElement(name = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokumentklasse", namespace = "http://www.xjustiz.de")
    @JsonProperty("Dokumentklasse")
    @Nullable
    private Dokumentklasse dokumentklasse;

    @XmlElement(name = "datei", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "datei", namespace = "http://www.xjustiz.de")
    @JsonProperty("Datei")
    private Datei datei;

    public XjustizFachspezifischeDaten() {
    }

    @Nullable
    public Dokumentklasse getDokumentklasse() {
        return dokumentklasse;
    }

    public void setDokumentklasse(@Nullable Dokumentklasse dokumentklasse) {
        this.dokumentklasse = dokumentklasse;
    }

    public Datei getDatei() {
        return datei;
    }

    public void setDatei(Datei datei) {
        this.datei = datei;
    }

}
