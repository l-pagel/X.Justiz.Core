package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für eine Instanzbehörde.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlInstanzbehoerde {

    @XmlElement(name = "gericht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "gericht", namespace = "http://www.xjustiz.de")
    @JsonProperty("Gericht")
    @Nullable
    private Gericht gericht;

    public AuswahlInstanzbehoerde() {
    }

    @Nullable
    public Gericht getGericht() {
        return gericht;
    }

    public void setGericht(@Nullable Gericht gericht) {
        this.gericht = gericht;
    }
}
