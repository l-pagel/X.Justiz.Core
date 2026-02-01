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
 * Repräsentiert eine Bankverbindung.
 * <p>
 * <u><b>Bank details:</b></u> Represents a bank account connection.
 */
@XmlType(name = "Bankverbindung", propOrder = { "kontoinhaber", "iban", "bic" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Bankverbindung {

    /**
     * Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
     * <p>
     * <u><b>Account holder:</b></u> The name only needs to be specified if the account holder is not identical to the participant.
     */
    @XmlElement(name = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kontoinhaber")
    @JsonAlias({ "kontoinhaber" })
    @Nullable
    private String kontoinhaber;

    /**
     * IBAN der Bankverbindung
     * <p>
     * <u><b>IBAN:</b></u> IBAN of the bank details.
     */
    @XmlElement(name = "iban", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "iban", namespace = "http://www.xjustiz.de")
    @JsonProperty("Iban")
    @JsonAlias({ "iban" })
    @Nullable
    private String iban;

    /**
     * BIC der Bankverbindung
     * <p>
     * <u><b>BIC:</b></u> BIC of the bank details.
     */
    @XmlElement(name = "bic", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bic", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bic")
    @JsonAlias({ "bic" })
    @Nullable
    private String bic;

    /**
     * Default constructor.
     */
    public Bankverbindung() {}

    /**
     * Gets the value of the Kontoinhaber property.
     * @return the value of the Kontoinhaber property
     */
    public String getKontoinhaber() { return kontoinhaber; }
    /**
     * Sets the value of the Kontoinhaber property.
     * @param kontoinhaber the value to set
     */
    public void setKontoinhaber(String kontoinhaber) { this.kontoinhaber = kontoinhaber; }

    /**
     * Gets the value of the Iban property.
     * @return the value of the Iban property
     */
    public String getIban() { return iban; }
    /**
     * Sets the value of the Iban property.
     * @param iban the value to set
     */
    public void setIban(String iban) { this.iban = iban; }

    /**
     * Gets the value of the Bic property.
     * @return the value of the Bic property
     */
    public String getBic() { return bic; }
    /**
     * Sets the value of the Bic property.
     * @param bic the value to set
     */
    public void setBic(String bic) { this.bic = bic; }

}