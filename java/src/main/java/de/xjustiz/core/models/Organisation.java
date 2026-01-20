package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine Organisation (juristische Person).<br/>
/// <u><b>Organization:</b></u> An organization (legal entity).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Organisation {

    @XmlElement(name = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bezeichnung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bezeichnung")
    @Nullable
    private Bezeichnung bezeichnung;

    @XmlElement(name = "anschrift", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anschrift", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anschrift")
    @Nullable
    private Anschrift anschrift;

    @XmlElement(name = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "telekommunikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Telekommunikation")
    @Nullable
    private List<Telekommunikation> telekommunikation;

    @XmlElement(name = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bankverbindung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bankverbindung")
    @Nullable
    private Bankverbindung bankverbindung;

    public Organisation() {
    }

    @Nullable
    public Bezeichnung getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(@Nullable Bezeichnung bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Nullable
    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(@Nullable Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    @Nullable
    public List<Telekommunikation> getTelekommunikation() {
        return telekommunikation;
    }

    public void setTelekommunikation(@Nullable List<Telekommunikation> telekommunikation) {
        this.telekommunikation = telekommunikation;
    }

    @Nullable
    public Bankverbindung getBankverbindung() {
        return bankverbindung;
    }

    public void setBankverbindung(@Nullable Bankverbindung bankverbindung) {
        this.bankverbindung = bankverbindung;
    }

}
