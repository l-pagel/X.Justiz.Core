package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für Aktenzeichen.
 * <p>
 * <u><b>File reference selection:</b></u> Selection structure for file
 * references.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlAktenzeichen {

    /**
     * Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext
     * übermittelt werden.
     * <p>
     * <u><b>Free text:</b></u> The complete file reference can be transmitted here
     * as unstructured free text.
     */
    @XmlElement(name = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JsonProperty("aktenzeichen.freitext")
    @JsonAlias("Freitext")
    @Nullable
    private String freitext;

    /**
     * Default constructor.
     */
    public AuswahlAktenzeichen() {
    }

    /**
     * Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext
     * übermittelt werden.
     *
     * @return the freitext
     */
    @Nullable
    public String getFreitext() {
        return freitext;
    }

    /**
     * Sets the freitext.
     *
     * @param freitext the freitext to set
     */
    public void setFreitext(@Nullable String freitext) {
        this.freitext = freitext;
    }

}
