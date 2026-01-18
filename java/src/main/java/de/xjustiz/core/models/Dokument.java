package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Repräsentiert ein Dokument.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Dokument {

    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    private Identifikation identifikation;

    public Dokument() {
    }

    public Identifikation getIdentifikation() {
        return identifikation;
    }

    public void setIdentifikation(Identifikation identifikation) {
        this.identifikation = identifikation;
    }
}
