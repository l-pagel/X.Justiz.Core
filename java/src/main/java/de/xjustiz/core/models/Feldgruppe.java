package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Eine Gruppe von Feldern.
 * <p>
 * <u><b>Field group:</b></u> A group of fields.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Feldgruppe {

    /**
     * Der Name der Feldgruppe.
     * <p>
     * <u><b>Name:</b></u> The name of the field group.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustiz.de")
    @JsonProperty("Name")
    @Nullable
    private String name;

    /**
     * Die Hinweise und Erläuterungen zu einer Feldgruppe.
     * <p>
     * <u><b>Description:</b></u> Notes and explanations for a field group.
     */
    @XmlElement(name = "beschreibung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beschreibung", namespace = "http://www.xjustiz.de")
    @JsonProperty("Beschreibung")
    private String beschreibung;

    /**
     * Über Unterfeldgruppe erfolgt die hierarchische Unterteilung einer Feldgruppe in weitere Feldgruppen.
     * <p>
     * <u><b>Sub-field groups:</b></u> The hierarchical subdivision of a field group into further field groups takes place via 'Unterfeldgruppe'.
     */
    @XmlElement(name = "unterfeldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "unterfeldgruppe", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("UnterFeldgruppen")
    @Nullable
    private List<Feldgruppe> unterFeldgruppen;

    /**
     * Über Feld erfolgt die Unterteilung einer Feldgruppe in konkrete Felder.
     * <p>
     * <u><b>Fields:</b></u> The fields subdivision of a field group into concrete fields happens via 'Feld'.
     */
    @XmlElement(name = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "feld", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Felder")
    @Nullable
    private List<Feld> felder;

    public Feldgruppe() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }

    public List<Feldgruppe> getUnterFeldgruppen() { return unterFeldgruppen; }
    public void setUnterFeldgruppen(List<Feldgruppe> unterFeldgruppen) { this.unterFeldgruppen = unterFeldgruppen; }

    public List<Feld> getFelder() { return felder; }
    public void setFelder(List<Feld> felder) { this.felder = felder; }

}