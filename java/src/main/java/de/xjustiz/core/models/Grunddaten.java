package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Grunddaten der Nachricht.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Grunddaten {

    @XmlElement(name = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verfahrensdaten")
    @Nullable
    private Verfahrensdaten verfahrensdaten;

    public Grunddaten() {
    }

    @Nullable
    public Verfahrensdaten getVerfahrensdaten() {
        return verfahrensdaten;
    }

    public void setVerfahrensdaten(@Nullable Verfahrensdaten verfahrensdaten) {
        this.verfahrensdaten = verfahrensdaten;
    }
}
