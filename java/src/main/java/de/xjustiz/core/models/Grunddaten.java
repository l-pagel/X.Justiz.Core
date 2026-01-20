package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Grunddaten der Nachricht.
 * <p>
 * <u><b>Basic data:</b></u> Basic data of the message.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Grunddaten {

    /**
     * Verfahrensdaten nehmen alle Informationen auf, die das jeweilige Verfahren
     * mit sich bringt.
     * <p>
     * <u><b>Procedural data:</b></u> Procedures data captures all information that
     * the respective procedure entails.
     */
    @XmlElement(name = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verfahrensdaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verfahrensdaten")
    @Nullable
    private Verfahrensdaten verfahrensdaten;

    /**
     * Default constructor.
     */
    public Grunddaten() {
    }

    /**
     * Verfahrensdaten nehmen alle Informationen auf, die das jeweilige Verfahren
     * mit sich bringt.
     *
     * @return the verfahrensdaten
     */
    @Nullable
    public Verfahrensdaten getVerfahrensdaten() {
        return verfahrensdaten;
    }

    /**
     * Sets the verfahrensdaten.
     *
     * @param verfahrensdaten the verfahrensdaten to set
     */
    public void setVerfahrensdaten(@Nullable Verfahrensdaten verfahrensdaten) {
        this.verfahrensdaten = verfahrensdaten;
    }

}
