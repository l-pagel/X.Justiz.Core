package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Eine natürliche Person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class NatuerlichePerson {

    @XmlElement(name = "vollerName", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "vollerName", namespace = "http://www.xjustiz.de")
    @JsonProperty("VollerName")
    private VollerName vollerName;

    @XmlElement(name = "geschlecht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "geschlecht", namespace = "http://www.xjustiz.de")
    @JsonProperty("Geschlecht")
    @Nullable
    private Geschlecht geschlecht;

    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
    @Nullable
    private Anschrift anschrift;

    public NatuerlichePerson() {
    }

    public VollerName getVollerName() {
        return vollerName;
    }

    public void setVollerName(VollerName vollerName) {
        this.vollerName = vollerName;
    }

    @Nullable
    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(@Nullable Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
    }

    @Nullable
    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(@Nullable Anschrift anschrift) {
        this.anschrift = anschrift;
    }
}
