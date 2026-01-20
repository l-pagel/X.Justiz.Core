package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Informationen zur Telekommunikation (Telefon, Email, etc.).<br/>
/// <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Telekommunikation {

    @XmlElement(name = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JsonProperty("Telekommunikationsart")
    @Nullable
    private Telekommunikationsart telekommunikationsart;

    @XmlElement(name = "verbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verbindung")
    @Nullable
    private String verbindung;

    public Telekommunikation() {
    }

    @Nullable
    public Telekommunikationsart getTelekommunikationsart() {
        return telekommunikationsart;
    }

    public void setTelekommunikationsart(@Nullable Telekommunikationsart telekommunikationsart) {
        this.telekommunikationsart = telekommunikationsart;
    }

    @Nullable
    public String getVerbindung() {
        return verbindung;
    }

    public void setVerbindung(@Nullable String verbindung) {
        this.verbindung = verbindung;
    }

}
