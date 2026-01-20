package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Fachspezifische Daten einer Akte.
 * <p>
 *  <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class XjustizAkteFachspezifischeDaten {

    /**
     * Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.
     * <p>
     *  <u><b>File type:</b></u> Designates the file type based on the predefined value list. This is deliberately kept concise for smooth exchange. For a more specific designation, the field 'anzeigename' (display name) can be used.
     */
    @XmlElement(name = "aktentyp", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktentyp", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktentyp")
    private Aktentyp aktentyp;

    /**
     * Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird, bspw. als <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
     * <p>
     *  <u><b>Display name:</b></u> The display name allows the transmission of the designation of the file as it is displayed in the sending system as free text, e.g. as <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
     */
    @XmlElement(name = "anzeigename", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anzeigename", namespace = "http://www.xjustiz.de")
    @JsonProperty("Anzeigename")
    @Nullable
    private String anzeigename;

    /**
     * Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.
     * <p>
     *  <u><b>File reference:</b></u> Here is the file reference under which the station (see above) conducts the proceeding.
     */
    @XmlElement(name = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktenzeichen")
    private Aktenzeichen aktenzeichen;

    /**
     * Default constructor.
     */
    public XjustizAkteFachspezifischeDaten() {
    }

    /**
     * Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.
     *
     * @return the aktentyp
     */
    public Aktentyp getAktentyp() {
        return aktentyp;
    }

    /**
     * Sets the aktentyp.
     *
     * @param aktentyp the aktentyp to set
     */
    public void setAktentyp(Aktentyp aktentyp) {
        this.aktentyp = aktentyp;
    }

    /**
     * Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird, bspw. als <a href='https://de.wikipedia.org/wiki/Rubrum'>Rubrum</a> (Max Muster ./. Sabine Schmidt).
     *
     * @return the anzeigename
     */
    @Nullable
    public String getAnzeigename() {
        return anzeigename;
    }

    /**
     * Sets the anzeigename.
     *
     * @param anzeigename the anzeigename to set
     */
    public void setAnzeigename(@Nullable String anzeigename) {
        this.anzeigename = anzeigename;
    }

    /**
     * Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.
     *
     * @return the aktenzeichen
     */
    public Aktenzeichen getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the aktenzeichen.
     *
     * @param aktenzeichen the aktenzeichen to set
     */
    public void setAktenzeichen(Aktenzeichen aktenzeichen) {
        this.aktenzeichen = aktenzeichen;
    }

}
