package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Bankverbindung.<br/>
/// <u><b>Bank details:</b></u> Represents a bank account connection.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bankverbindung {

    @XmlElement(name = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kontoinhaber", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kontoinhaber")
    @Nullable
    private String kontoinhaber;

    @XmlElement(name = "iban", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "iban", namespace = "http://www.xjustiz.de")
    @JsonProperty("Iban")
    @Nullable
    private String iban;

    @XmlElement(name = "bic", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bic", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bic")
    @Nullable
    private String bic;

    public Bankverbindung() {
    }

    @Nullable
    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(@Nullable String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    @Nullable
    public String getIban() {
        return iban;
    }

    public void setIban(@Nullable String iban) {
        this.iban = iban;
    }

    @Nullable
    public String getBic() {
        return bic;
    }

    public void setBic(@Nullable String bic) {
        this.bic = bic;
    }

}
