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
 * Enthält Listen von Schriftgutobjekten (Akten und Dokumente).<br/>
/// <u><b>Document objects:</b></u> Contains lists of document objects (files/cases and documents).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Schriftgutobjekte {

    @XmlElement(name = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Akte")
    @Nullable
    private List<Akte> akte;

    @XmlElement(name = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Dokumente")
    @Nullable
    private List<Dokument> dokumente;

    public Schriftgutobjekte() {
    }

    @Nullable
    public List<Akte> getAkte() {
        return akte;
    }

    public void setAkte(@Nullable List<Akte> akte) {
        this.akte = akte;
    }

    @Nullable
    public List<Dokument> getDokumente() {
        return dokumente;
    }

    public void setDokumente(@Nullable List<Dokument> dokumente) {
        this.dokumente = dokumente;
    }

}
