package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Informationen zur Telekommunikation (Telefon, Email, etc.).
 * <p>
 *  <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Telekommunikation {

    /**
     * Art der Telekommunikation als CodeValue.
     * <p>
     *  <u><b>Telecommunication type:</b></u> Type of telecommunication as a code.
     */
    @XmlElement(name = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JsonProperty("Telekommunikationsart")
    @Nullable
    private Telekommunikationsart telekommunikationsart;

    /**
     * Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
     * <p>
     *  <u><b>Connection:</b></u> The telephone number, fax number, e-mail address, Safe-ID, or similar is communicated here.
     */
    @XmlElement(name = "verbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verbindung")
    @Nullable
    private String verbindung;

    /**
     * Default constructor.
     */
    public Telekommunikation() {
    }

    /**
     * Art der Telekommunikation als CodeValue.
     *
     * @return the telekommunikationsart
     */
    @Nullable
    public Telekommunikationsart getTelekommunikationsart() {
        return telekommunikationsart;
    }

    /**
     * Sets the telekommunikationsart.
     *
     * @param telekommunikationsart the telekommunikationsart to set
     */
    public void setTelekommunikationsart(@Nullable Telekommunikationsart telekommunikationsart) {
        this.telekommunikationsart = telekommunikationsart;
    }

    /**
     * Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
     *
     * @return the verbindung
     */
    @Nullable
    public String getVerbindung() {
        return verbindung;
    }

    /**
     * Sets the verbindung.
     *
     * @param verbindung the verbindung to set
     */
    public void setVerbindung(@Nullable String verbindung) {
        this.verbindung = verbindung;
    }

}
