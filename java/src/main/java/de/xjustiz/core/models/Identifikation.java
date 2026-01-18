package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Identifikation eines Schriftgutobjekts.
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
    @Nullable
    private String nummerImUebergeordnetenContainer;

    public Identifikation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Nullable
    public String getNummerImUebergeordnetenContainer() {
        return nummerImUebergeordnetenContainer;
    }

    public void setNummerImUebergeordnetenContainer(@Nullable String nummerImUebergeordnetenContainer) {
        this.nummerImUebergeordnetenContainer = nummerImUebergeordnetenContainer;
    }
}
