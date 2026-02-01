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
 * Auswahlstruktur für Aktenzeichen.
 * <p>
 * <u><b>File reference selection:</b></u> Selection structure for file references.
 */
@XmlType(name = "AuswahlAktenzeichen", propOrder = { "freitext" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuswahlAktenzeichen {

    /**
     * Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.
     * <p>
     * <u><b>Free text:</b></u> The complete file reference can be transmitted here as unstructured free text.
     */
    @XmlElement(name = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.freitext", namespace = "http://www.xjustiz.de")
    @JsonProperty("aktenzeichen.freitext")
    @JsonAlias({ "Freitext", "freitext" })
    @Nullable
    private String freitext;

    /**
     * Default constructor.
     */
    public AuswahlAktenzeichen() {}

    /**
     * Gets the value of the Freitext property.
     * @return the value of the Freitext property
     */
    public String getFreitext() { return freitext; }
    /**
     * Sets the value of the Freitext property.
     * @param freitext the value to set
     */
    public void setFreitext(String freitext) { this.freitext = freitext; }

}