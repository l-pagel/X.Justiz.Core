package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für eine Instanzbehörde.
 * <p>
 * <u><b>Instance authority selection:</b></u> Selection structure for an instance authority.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuswahlInstanzbehoerde {

    /**
     * Hier ist die jeweilige XJustiz-ID des Gerichts oder der Staatsanwaltschaft aus der Codeliste anzugeben.
     * <p>
     * <u><b>Court:</b></u> The respective XJustiz ID of the court or public prosecutor's office from the code list must be specified here.
     */
    @XmlElement(name = "gericht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "gericht", namespace = "http://www.xjustiz.de")
    @JsonProperty("Gericht")
    @Nullable
    private Gericht gericht;

    public AuswahlInstanzbehoerde() {}

    public Gericht getGericht() { return gericht; }
    public void setGericht(Gericht gericht) { this.gericht = gericht; }

}