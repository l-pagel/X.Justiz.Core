package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Daten zur Instanz.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Instanzdaten {

    @XmlElement(name = "instanznummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "instanznummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Instanznummer")
    @Nullable
    private String instanznummer;

    @XmlElement(name = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JsonProperty("Sachgebietszusatz")
    @Nullable
    private String sachgebietszusatz;

    @XmlElement(name = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JsonProperty("AuswahlInstanzbehoerde")
    @Nullable
    private AuswahlInstanzbehoerde auswahlInstanzbehoerde;

    public Instanzdaten() {
    }

    @Nullable
    public String getInstanznummer() {
        return instanznummer;
    }

    public void setInstanznummer(@Nullable String instanznummer) {
        this.instanznummer = instanznummer;
    }

    @Nullable
    public String getSachgebietszusatz() {
        return sachgebietszusatz;
    }

    public void setSachgebietszusatz(@Nullable String sachgebietszusatz) {
        this.sachgebietszusatz = sachgebietszusatz;
    }

    @Nullable
    public AuswahlInstanzbehoerde getAuswahlInstanzbehoerde() {
        return auswahlInstanzbehoerde;
    }

    public void setAuswahlInstanzbehoerde(@Nullable AuswahlInstanzbehoerde auswahlInstanzbehoerde) {
        this.auswahlInstanzbehoerde = auswahlInstanzbehoerde;
    }
}
