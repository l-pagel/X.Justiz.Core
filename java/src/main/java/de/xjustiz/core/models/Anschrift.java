package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Anschrift.<br/>
/// <u><b>Address:</b></u> Represents an address.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Anschrift {

    @XmlElement(name = "strasse", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "strasse", namespace = "http://www.xjustiz.de")
    @JsonProperty("Strasse")
    @Nullable
    private String strasse;

    @XmlElement(name = "hausnummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "hausnummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Hausnummer")
    @Nullable
    private String hausnummer;

    @XmlElement(name = "postleitzahl", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "postleitzahl", namespace = "http://www.xjustiz.de")
    @JsonProperty("Postleitzahl")
    @Nullable
    private String postleitzahl;

    @XmlElement(name = "ort", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "ort", namespace = "http://www.xjustiz.de")
    @JsonProperty("Ort")
    @Nullable
    private String ort;

    @XmlElement(name = "staat", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "staat", namespace = "http://www.xjustiz.de")
    @JsonProperty("Staat")
    @Nullable
    private Staat staat;

    public Anschrift() {
    }

    @Nullable
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(@Nullable String strasse) {
        this.strasse = strasse;
    }

    @Nullable
    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(@Nullable String hausnummer) {
        this.hausnummer = hausnummer;
    }

    @Nullable
    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(@Nullable String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    @Nullable
    public String getOrt() {
        return ort;
    }

    public void setOrt(@Nullable String ort) {
        this.ort = ort;
    }

    @Nullable
    public Staat getStaat() {
        return staat;
    }

    public void setStaat(@Nullable Staat staat) {
        this.staat = staat;
    }

}
