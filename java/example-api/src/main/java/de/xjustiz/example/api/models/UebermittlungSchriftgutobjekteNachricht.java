package de.xjustiz.example.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import de.xjustiz.core.models.Grunddaten;
import de.xjustiz.core.models.Nachrichtenkopf;
import de.xjustiz.core.models.Schriftgutobjekte;
import de.xjustiz.example.api.util.CompatibilityChecker;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.jetbrains.annotations.Nullable;

@XmlRootElement(name = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@JacksonXmlRootElement(localName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@XmlAccessorType(XmlAccessType.FIELD)
public class UebermittlungSchriftgutobjekteNachricht {

    @XmlElement(name = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nachrichtenkopf", namespace = "http://www.xjustiz.de")
    @JsonProperty("nachrichtenkopf")
    private Nachrichtenkopf kopf;

    @XmlElement(name = "grunddaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "grunddaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("grunddaten")
    @Nullable
    private Grunddaten grunddaten;

    @XmlElement(name = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "schriftgutobjekte", namespace = "http://www.xjustiz.de")
    @JsonProperty("schriftgutobjekte")
    @Nullable
    private Schriftgutobjekte schriftgutobjekte;

    @XmlAttribute(name = "schemaLocation", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    @JacksonXmlProperty(isAttribute = true, localName = "schemaLocation", namespace = "http://www.w3.org/2001/XMLSchema-instance")
    private String schemaLocation = "http://www.xjustiz.de xjustiz_0005_nachrichten_3_1.xsd";

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

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public CompatibilityResult getCompatibility() {
        return CompatibilityChecker.check(this);
    }
}
