package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Container für anwendungsspezifische Erweiterungen.
 * <p>
 *  <u><b>Application-specific extension:</b></u> Container for application-specific extensions.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AnwendungsspezifischeErweiterung {

    /**
     * Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.
     * <p>
     *  <u><b>Identifier:</b></u> The identification tag of the application-specific extension.
     */
    @XmlElement(name = "kennung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kennung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kennung")
    private String kennung;

    /**
     * Der Name der anwendungsspezifischen Erweiterung.
     * <p>
     *  <u><b>Name:</b></u> The name of the application-specific extension.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    private String name;

    /**
     * Die textuelle Erläuterung zu einer anwendungsspezifischen Erweiterung.
     * <p>
     *  <u><b>Description:</b></u> The textual explanation of an application-specific extension.
     */
    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @Nullable
    private String beschreibung;

    /**
     * Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.
     * <p>
     *  <u><b>Field groups:</b></u> A field group assigned to the application-specific extension.
     */
    @XmlElement(name = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Feldgruppen")
    @Nullable
    private List<Feldgruppe> feldgruppen;

    /**
     * Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.
     * <p>
     *  <u><b>Fields:</b></u> A field assigned to the application-specific extension.
     */
    @XmlElement(name = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Felder")
    @Nullable
    private List<Feld> felder;

    /**
     * Default constructor.
     */
    public AnwendungsspezifischeErweiterung() {
    }

    /**
     * Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.
     *
     * @return the kennung
     */
    public String getKennung() {
        return kennung;
    }

    /**
     * Sets the kennung.
     *
     * @param kennung the kennung to set
     */
    public void setKennung(String kennung) {
        this.kennung = kennung;
    }

    /**
     * Der Name der anwendungsspezifischen Erweiterung.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Die textuelle Erläuterung zu einer anwendungsspezifischen Erweiterung.
     *
     * @return the beschreibung
     */
    @Nullable
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the beschreibung.
     *
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(@Nullable String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.
     *
     * @return the feldgruppen
     */
    @Nullable
    public List<Feldgruppe> getFeldgruppen() {
        return feldgruppen;
    }

    /**
     * Sets the feldgruppen.
     *
     * @param feldgruppen the feldgruppen to set
     */
    public void setFeldgruppen(@Nullable List<Feldgruppe> feldgruppen) {
        this.feldgruppen = feldgruppen;
    }

    /**
     * Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.
     *
     * @return the felder
     */
    @Nullable
    public List<Feld> getFelder() {
        return felder;
    }

    /**
     * Sets the felder.
     *
     * @param felder the felder to set
     */
    public void setFelder(@Nullable List<Feld> felder) {
        this.felder = felder;
    }

}
