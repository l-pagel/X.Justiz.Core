package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Eine Organisation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Organisation {

    @XmlElement(name = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bezeichnung")
    @Nullable
    private Bezeichnung bezeichnung;

    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
    @Nullable
    private Anschrift anschrift;

    public Organisation() {
    }

    @Nullable
    public Bezeichnung getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(@Nullable Bezeichnung bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Nullable
    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(@Nullable Anschrift anschrift) {
        this.anschrift = anschrift;
    }
}
