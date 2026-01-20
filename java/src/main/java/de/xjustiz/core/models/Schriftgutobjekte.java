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
 * Enthält Listen von Schriftgutobjekten (Akten und Dokumente).
 * <p>
 *  <u><b>Document objects:</b></u> Contains lists of document objects (files/cases and documents).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Schriftgutobjekte {

    /**
     * Repräsentiert eine Akte.
     * <p>
     *  <u><b>File:</b></u> Represents a file / case.
     */
    @XmlElement(name = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Akte")
    @Nullable
    private List<Akte> akte;

    /**
     * In diesem Element sollen alle Dokumente aufgeführt werden, die im Rahmen des konkreten Kommunikationsanlasses übermittelt werden. Die XJustiz-Nachricht selbst soll nicht aufgeführt werden, da sie lediglich der Beschreibung des Inhalts der Übermittlung dient.
     * <p>
     *  <u><b>Documents:</b></u> All documents transmitted in the context of the specific communication occasion should be listed in this element. The XJustiz message itself should not be listed, as it only serves to describe the content of the transmission.
     */
    @XmlElement(name = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Dokumente")
    @Nullable
    private List<Dokument> dokumente;

    /**
     * Default constructor.
     */
    public Schriftgutobjekte() {
    }

    /**
     * Repräsentiert eine Akte.
     *
     * @return the akte
     */
    @Nullable
    public List<Akte> getAkte() {
        return akte;
    }

    /**
     * Sets the akte.
     *
     * @param akte the akte to set
     */
    public void setAkte(@Nullable List<Akte> akte) {
        this.akte = akte;
    }

    /**
     * In diesem Element sollen alle Dokumente aufgeführt werden, die im Rahmen des konkreten Kommunikationsanlasses übermittelt werden. Die XJustiz-Nachricht selbst soll nicht aufgeführt werden, da sie lediglich der Beschreibung des Inhalts der Übermittlung dient.
     *
     * @return the dokumente
     */
    @Nullable
    public List<Dokument> getDokumente() {
        return dokumente;
    }

    /**
     * Sets the dokumente.
     *
     * @param dokumente the dokumente to set
     */
    public void setDokumente(@Nullable List<Dokument> dokumente) {
        this.dokumente = dokumente;
    }

}
