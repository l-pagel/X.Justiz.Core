package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.time.OffsetDateTime;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert ein Dokument.<br/>
/// <u><b>Document:</b></u> Represents a document.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Dokument {

    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    private Identifikation identifikation;

    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    private XjustizFachspezifischeDaten fachspezifischeDaten;

    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    @Nullable
    private OffsetDateTime erstellungszeitpunkt;

    public Dokument() {
    }

    public Identifikation getIdentifikation() {
        return identifikation;
    }

    public void setIdentifikation(Identifikation identifikation) {
        this.identifikation = identifikation;
    }

    public XjustizFachspezifischeDaten getFachspezifischeDaten() {
        return fachspezifischeDaten;
    }

    public void setFachspezifischeDaten(XjustizFachspezifischeDaten fachspezifischeDaten) {
        this.fachspezifischeDaten = fachspezifischeDaten;
    }

    @Nullable
    public OffsetDateTime getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    public void setErstellungszeitpunkt(@Nullable OffsetDateTime erstellungszeitpunkt) {
        this.erstellungszeitpunkt = erstellungszeitpunkt;
    }

}
