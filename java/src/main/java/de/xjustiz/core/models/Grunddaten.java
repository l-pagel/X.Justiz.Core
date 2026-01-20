package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Grunddaten der Nachricht.
 * <p>
 * <u><b>Basic data:</b></u> Basic data of the message.
 */
@XmlType(name = "Grunddaten", propOrder = { "verfahrensdaten" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Grunddaten {

    /**
     * Verfahrensdaten nehmen alle Informationen auf, die das jeweilige Verfahren mit sich bringt.
     * <p>
     * <u><b>Procedural data:</b></u> Procedures data captures all information that the respective procedure entails.
     */
    @XmlElement(name = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verfahrensdaten")
    @JsonAlias({ "verfahrensdaten" })
    @Nullable
    private Verfahrensdaten verfahrensdaten;

    public Grunddaten() {}

    public Verfahrensdaten getVerfahrensdaten() { return verfahrensdaten; }
    public void setVerfahrensdaten(Verfahrensdaten verfahrensdaten) { this.verfahrensdaten = verfahrensdaten; }

}