package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Daten zum Verfahren.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Verfahrensdaten {

    @XmlElement(name = "verfahrensnummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verfahrensnummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verfahrensnummer")
    @Nullable
    private String verfahrensnummer;

    @XmlElement(name = "instanzdaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "instanzdaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Instanzdaten")
    @Nullable
    private Instanzdaten instanzdaten;

    @XmlElement(name = "beteiligung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligung", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Beteiligungen")
    @Nullable
    private List<Beteiligung> beteiligungen;

    public Verfahrensdaten() {
    }

    @Nullable
    public String getVerfahrensnummer() {
        return verfahrensnummer;
    }

    public void setVerfahrensnummer(@Nullable String verfahrensnummer) {
        this.verfahrensnummer = verfahrensnummer;
    }

    @Nullable
    public Instanzdaten getInstanzdaten() {
        return instanzdaten;
    }

    public void setInstanzdaten(@Nullable Instanzdaten instanzdaten) {
        this.instanzdaten = instanzdaten;
    }

    @Nullable
    public List<Beteiligung> getBeteiligungen() {
        return beteiligungen;
    }

    public void setBeteiligungen(@Nullable List<Beteiligung> beteiligungen) {
        this.beteiligungen = beteiligungen;
    }
}
