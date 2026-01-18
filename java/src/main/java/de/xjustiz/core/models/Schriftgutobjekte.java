package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Schriftgutobjekte der Nachricht.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Schriftgutobjekte {

    @XmlElement(name = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Akten")
    @Nullable
    private List<Akte> akten;

    @XmlElement(name = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Dokumente")
    @Nullable
    private List<Dokument> dokumente;

    public Schriftgutobjekte() {
    }

    @Nullable
    public List<Akte> getAkten() {
        return akten;
    }

    public void setAkten(@Nullable List<Akte> akten) {
        this.akten = akten;
    }

    @Nullable
    public List<Dokument> getDokumente() {
        return dokumente;
    }

    public void setDokumente(@Nullable List<Dokument> dokumente) {
        this.dokumente = dokumente;
    }
}
