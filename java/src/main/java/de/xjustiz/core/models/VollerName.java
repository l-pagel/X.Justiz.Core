package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Der volle Name einer natürlichen Person.<br/>
/// <u><b>Full name:</b></u> The full name of a natural person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class VollerName {

    @XmlElement(name = "vorname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "vorname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Vorname")
    @Nullable
    private String vorname;

    @XmlElement(name = "rufname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "rufname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Rufname")
    @Nullable
    private String rufname;

    @XmlElement(name = "titel", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "titel", namespace = "http://www.xjustiz.de")
    @JsonProperty("Titel")
    @Nullable
    private String titel;

    @XmlElement(name = "namensvorsatz", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "namensvorsatz", namespace = "http://www.xjustiz.de")
    @JsonProperty("Namensvorsatz")
    @Nullable
    private String namensvorsatz;

    @XmlElement(name = "nachname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nachname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Nachname")
    @Nullable
    private String nachname;

    public VollerName() {
    }

    @Nullable
    public String getVorname() {
        return vorname;
    }

    public void setVorname(@Nullable String vorname) {
        this.vorname = vorname;
    }

    @Nullable
    public String getRufname() {
        return rufname;
    }

    public void setRufname(@Nullable String rufname) {
        this.rufname = rufname;
    }

    @Nullable
    public String getTitel() {
        return titel;
    }

    public void setTitel(@Nullable String titel) {
        this.titel = titel;
    }

    @Nullable
    public String getNamensvorsatz() {
        return namensvorsatz;
    }

    public void setNamensvorsatz(@Nullable String namensvorsatz) {
        this.namensvorsatz = namensvorsatz;
    }

    @Nullable
    public String getNachname() {
        return nachname;
    }

    public void setNachname(@Nullable String nachname) {
        this.nachname = nachname;
    }

}
