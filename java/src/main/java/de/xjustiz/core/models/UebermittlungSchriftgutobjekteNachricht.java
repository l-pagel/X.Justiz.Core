package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.jetbrains.annotations.Nullable;

/**
 * Hauptnachricht für die Übermittlung von Schriftgutobjekten.
 * <p>
 * <b>Document Transmission Message:</b> Main message for transmitting document
 * objects.
 * </p>
 */
@XmlRootElement(name = "nachricht.uebermittlung.schriftgutobjekte", namespace = "http://www.xjustiz.de")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "nachricht.uebermittlung.schriftgutobjekte", namespace = "http://www.xjustiz.de")
public class UebermittlungSchriftgutobjekteNachricht {

    /**
     * Der Kopf der Nachricht.
     */
    @XmlElement(name = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kopf")
    private Nachrichtenkopf kopf;

    /**
     * Die Grunddaten der Nachricht.
     */
    @XmlElement(name = "grunddaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "grunddaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Grunddaten")
    @Nullable
    private Grunddaten grunddaten;

    /**
     * Die Schriftgutobjekte der Nachricht.
     */
    @XmlElement(name = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JsonProperty("Schriftgutobjekte")
    @Nullable
    private Schriftgutobjekte schriftgutobjekte;

    public UebermittlungSchriftgutobjekteNachricht() {
    }

    public Nachrichtenkopf getKopf() {
        return kopf;
    }

    public void setKopf(Nachrichtenkopf kopf) {
        this.kopf = kopf;
    }

    @Nullable
    public Grunddaten getGrunddaten() {
        return grunddaten;
    }

    public void setGrunddaten(@Nullable Grunddaten grunddaten) {
        this.grunddaten = grunddaten;
    }

    @Nullable
    public Schriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    public void setSchriftgutobjekte(@Nullable Schriftgutobjekte schriftgutobjekte) {
        this.schriftgutobjekte = schriftgutobjekte;
    }
}
