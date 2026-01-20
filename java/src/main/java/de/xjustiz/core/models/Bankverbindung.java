package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Bankverbindung.
 * <p>
 *  <u><b>Bank details:</b></u> Represents a bank account connection.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bankverbindung {

    /**
     * Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
     * <p>
     *  <u><b>Account holder:</b></u> The name only needs to be specified if the account holder is not identical to the participant.
     */
    @XmlElement(name = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kontoinhaber")
    @Nullable
    private String kontoinhaber;

    /**
     * IBAN der Bankverbindung
     * <p>
     *  <u><b>IBAN:</b></u> IBAN of the bank details.
     */
    @XmlElement(name = "iban", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "iban", namespace = "http://www.xjustiz.de")
    @JsonProperty("Iban")
    @Nullable
    private String iban;

    /**
     * BIC der Bankverbindung
     * <p>
     *  <u><b>BIC:</b></u> BIC of the bank details.
     */
    @XmlElement(name = "bic", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bic", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bic")
    @Nullable
    private String bic;

    /**
     * Default constructor.
     */
    public Bankverbindung() {
    }

    /**
     * Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
     *
     * @return the kontoinhaber
     */
    @Nullable
    public String getKontoinhaber() {
        return kontoinhaber;
    }

    /**
     * Sets the kontoinhaber.
     *
     * @param kontoinhaber the kontoinhaber to set
     */
    public void setKontoinhaber(@Nullable String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    /**
     * IBAN der Bankverbindung
     *
     * @return the iban
     */
    @Nullable
    public String getIban() {
        return iban;
    }

    /**
     * Sets the iban.
     *
     * @param iban the iban to set
     */
    public void setIban(@Nullable String iban) {
        this.iban = iban;
    }

    /**
     * BIC der Bankverbindung
     *
     * @return the bic
     */
    @Nullable
    public String getBic() {
        return bic;
    }

    /**
     * Sets the bic.
     *
     * @param bic the bic to set
     */
    public void setBic(@Nullable String bic) {
        this.bic = bic;
    }

}
