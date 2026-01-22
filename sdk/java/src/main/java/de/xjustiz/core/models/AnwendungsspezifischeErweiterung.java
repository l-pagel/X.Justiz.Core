package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Container für anwendungsspezifische Erweiterungen.
 * <p>
 * <u><b>Application-specific extension:</b></u> Container for application-specific extensions.
 */
@XmlType(name = "AnwendungsspezifischeErweiterung", propOrder = { "kennung", "name", "beschreibung", "feldgruppen", "felder" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AnwendungsspezifischeErweiterung {

    /**
     * Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.
     * <p>
     * <u><b>Identifier:</b></u> The identification tag of the application-specific extension.
     */
    @XmlElement(name = "kennung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kennung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kennung")
    @JsonAlias({ "kennung" })
    private String kennung;

    /**
     * Der Name der anwendungsspezifischen Erweiterung.
     * <p>
     * <u><b>Name:</b></u> The name of the application-specific extension.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @JsonAlias({ "name" })
    private String name;

    /**
     * Die textuelle Erläuterung zu einer anwendungsspezifischen Erweiterung.
     * <p>
     * <u><b>Description:</b></u> The textual explanation of an application-specific extension.
     */
    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    @JsonAlias({ "beschreibung" })
    @Nullable
    private String beschreibung;

    /**
     * Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.
     * <p>
     * <u><b>Field groups:</b></u> A field group assigned to the application-specific extension.
     */
    @XmlElement(name = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Feldgruppen")
    @JsonAlias({ "feldgruppen" })
    @Nullable
    private List<Feldgruppe> feldgruppen;

    /**
     * Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.
     * <p>
     * <u><b>Fields:</b></u> A field assigned to the application-specific extension.
     */
    @XmlElement(name = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Felder")
    @JsonAlias({ "felder" })
    @Nullable
    private List<Feld> felder;

    /**
     * Default constructor.
     */
    public AnwendungsspezifischeErweiterung() {}

    /**
     * Gets the value of the Kennung property.
     * @return the value of the Kennung property
     */
    public String getKennung() { return kennung; }
    /**
     * Sets the value of the Kennung property.
     * @param kennung the value to set
     */
    public void setKennung(String kennung) { this.kennung = kennung; }

    /**
     * Gets the value of the Name property.
     * @return the value of the Name property
     */
    public String getName() { return name; }
    /**
     * Sets the value of the Name property.
     * @param name the value to set
     */
    public void setName(String name) { this.name = name; }

    /**
     * Gets the value of the Beschreibung property.
     * @return the value of the Beschreibung property
     */
    public String getBeschreibung() { return beschreibung; }
    /**
     * Sets the value of the Beschreibung property.
     * @param beschreibung the value to set
     */
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    /**
     * Gets the value of the Feldgruppen property.
     * @return the value of the Feldgruppen property
     */
    public List<Feldgruppe> getFeldgruppen() { return feldgruppen; }
    /**
     * Sets the value of the Feldgruppen property.
     * @param feldgruppen the value to set
     */
    public void setFeldgruppen(List<Feldgruppe> feldgruppen) { this.feldgruppen = feldgruppen; }

    /**
     * Gets the value of the Felder property.
     * @return the value of the Felder property
     */
    public List<Feld> getFelder() { return felder; }
    /**
     * Sets the value of the Felder property.
     * @param felder the value to set
     */
    public void setFelder(List<Feld> felder) { this.felder = felder; }

}