package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Enthält Listen von Schriftgutobjekten (Akten und Dokumente).
 * <p>
 * <u><b>Document objects:</b></u> Contains lists of document objects (files/cases and documents).
 */
@XmlType(name = "Schriftgutobjekte", propOrder = { "akte", "dokumente" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Schriftgutobjekte {

    /**
     * Repräsentiert eine Akte.
     * <p>
     * <u><b>File:</b></u> Represents a file / case.
     */
    @XmlElement(name = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "akte", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Akte")
    @JsonAlias({ "akte" })
    @Nullable
    private List<Akte> akte;

    /**
     * In diesem Element sollen alle Dokumente aufgeführt werden, die im Rahmen des konkreten Kommunikationsanlasses übermittelt werden. Die XJustiz-Nachricht selbst soll nicht aufgeführt werden, da sie lediglich der Beschreibung des Inhalts der Übermittlung dient.
     * <p>
     * <u><b>Documents:</b></u> All documents transmitted in the context of the specific communication occasion should be listed in this element. The XJustiz message itself should not be listed, as it only serves to describe the content of the transmission.
     */
    @XmlElement(name = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dokument", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Dokumente")
    @JsonAlias({ "dokumente" })
    @Nullable
    private List<Dokument> dokumente;

    /**
     * Default constructor.
     */
    public Schriftgutobjekte() {}

    /**
     * Gets the value of the Akte property.
     * @return the value of the Akte property
     */
    public List<Akte> getAkte() { return akte; }
    /**
     * Sets the value of the Akte property.
     * @param akte the value to set
     */
    public void setAkte(List<Akte> akte) { this.akte = akte; }

    /**
     * Gets the value of the Dokumente property.
     * @return the value of the Dokumente property
     */
    public List<Dokument> getDokumente() { return dokumente; }
    /**
     * Sets the value of the Dokumente property.
     * @param dokumente the value to set
     */
    public void setDokumente(List<Dokument> dokumente) { this.dokumente = dokumente; }

}