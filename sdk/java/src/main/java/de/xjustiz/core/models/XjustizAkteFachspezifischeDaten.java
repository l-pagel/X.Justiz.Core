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
 * Fachspezifische Daten einer Akte.
 * <p>
 * <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
 */
@XmlType(name = "XjustizAkteFachspezifischeDaten", propOrder = { "aktentyp", "anzeigename", "aktenzeichen" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XjustizAkteFachspezifischeDaten {

    /**
     * Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.
     * <p>
     * <u><b>File type:</b></u> Designates the file type based on the predefined value list. This is deliberately kept concise for smooth exchange. For a more specific designation, the field 'anzeigename' (display name) can be used.
     */
    @XmlElement(name = "aktentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktentyp")
    @JsonAlias({ "aktentyp" })
    private Aktentyp aktentyp;

    /**
     * Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird, bspw. als <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
     * <p>
     * <u><b>Display name:</b></u> The display name allows the transmission of the designation of the file as it is displayed in the sending system as free text, e.g. as <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
     */
    @XmlElement(name = "anzeigename", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anzeigename", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anzeigename")
    @JsonAlias({ "anzeigename" })
    @Nullable
    private String anzeigename;

    /**
     * Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.
     * <p>
     * <u><b>File reference:</b></u> Here is the file reference under which the station (see above) conducts the proceeding.
     */
    @XmlElement(name = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktenzeichen")
    @JsonAlias({ "aktenzeichen" })
    private Aktenzeichen aktenzeichen;

    /**
     * Default constructor.
     */
    public XjustizAkteFachspezifischeDaten() {}

    /**
     * Gets the value of the Aktentyp property.
     * @return the value of the Aktentyp property
     */
    public Aktentyp getAktentyp() { return aktentyp; }
    /**
     * Sets the value of the Aktentyp property.
     * @param aktentyp the value to set
     */
    public void setAktentyp(Aktentyp aktentyp) { this.aktentyp = aktentyp; }

    /**
     * Gets the value of the Anzeigename property.
     * @return the value of the Anzeigename property
     */
    public String getAnzeigename() { return anzeigename; }
    /**
     * Sets the value of the Anzeigename property.
     * @param anzeigename the value to set
     */
    public void setAnzeigename(String anzeigename) { this.anzeigename = anzeigename; }

    /**
     * Gets the value of the Aktenzeichen property.
     * @return the value of the Aktenzeichen property
     */
    public Aktenzeichen getAktenzeichen() { return aktenzeichen; }
    /**
     * Sets the value of the Aktenzeichen property.
     * @param aktenzeichen the value to set
     */
    public void setAktenzeichen(Aktenzeichen aktenzeichen) { this.aktenzeichen = aktenzeichen; }

}