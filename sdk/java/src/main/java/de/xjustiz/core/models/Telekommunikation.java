package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Informationen zur Telekommunikation (Telefon, Email, etc.).
 * <p>
 * <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
 */
@XmlType(name = "Telekommunikation", propOrder = { "telekommunikationsart", "verbindung" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Telekommunikation {

    /**
     * Art der Telekommunikation als CodeValue.
     * <p>
     * <u><b>Telecommunication type:</b></u> Type of telecommunication as a code.
     */
    @XmlElement(name = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikationsart", namespace = "http://www.xjustiz.de")
    @JsonProperty("Telekommunikationsart")
    @JsonAlias({ "telekommunikationsart" })
    @Nullable
    private Telekommunikationsart telekommunikationsart;

    /**
     * Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
     * <p>
     * <u><b>Connection:</b></u> The telephone number, fax number, e-mail address, Safe-ID, or similar is communicated here.
     */
    @XmlElement(name = "verbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verbindung")
    @JsonAlias({ "verbindung" })
    @Nullable
    private String verbindung;

    /**
     * Default constructor.
     */
    public Telekommunikation() {}

    /**
     * Gets the value of the Telekommunikationsart property.
     * @return the value of the Telekommunikationsart property
     */
    public Telekommunikationsart getTelekommunikationsart() { return telekommunikationsart; }
    /**
     * Sets the value of the Telekommunikationsart property.
     * @param telekommunikationsart the value to set
     */
    public void setTelekommunikationsart(Telekommunikationsart telekommunikationsart) { this.telekommunikationsart = telekommunikationsart; }

    /**
     * Gets the value of the Verbindung property.
     * @return the value of the Verbindung property
     */
    public String getVerbindung() { return verbindung; }
    /**
     * Sets the value of the Verbindung property.
     * @param verbindung the value to set
     */
    public void setVerbindung(String verbindung) { this.verbindung = verbindung; }

}