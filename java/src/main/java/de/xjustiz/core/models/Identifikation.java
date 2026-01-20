package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Identifiziert ein Objekt eindeutig.<br/>
/// <u><b>Identification:</b></u> Uniquely identifies an object.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Identifikation {

    @XmlElement(name = "id", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "id", namespace = "http://www.xjustiz.de")
    @JsonProperty("Id")
    private String id;

    @XmlElement(name = "nummerImUebergeordnetenContainer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nummerImUebergeordnetenContainer", namespace = "http://www.xjustiz.de")
    @JsonProperty("NummerImUebergeordnetenContainer")
    private String nummerImUebergeordnetenContainer;

    public Identifikation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNummerImUebergeordnetenContainer() {
        return nummerImUebergeordnetenContainer;
    }

    public void setNummerImUebergeordnetenContainer(String nummerImUebergeordnetenContainer) {
        this.nummerImUebergeordnetenContainer = nummerImUebergeordnetenContainer;
    }

}
