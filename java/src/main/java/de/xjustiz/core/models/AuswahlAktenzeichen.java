package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für Aktenzeichen.<br/>
/// <u><b>File reference selection:</b></u> Selection structure for file references.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlAktenzeichen {

    @XmlElement(name = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JsonProperty("Freitext")
    @Nullable
    private String freitext;

    public AuswahlAktenzeichen() {
    }

    @Nullable
    public String getFreitext() {
        return freitext;
    }

    public void setFreitext(@Nullable String freitext) {
        this.freitext = freitext;
    }

}
