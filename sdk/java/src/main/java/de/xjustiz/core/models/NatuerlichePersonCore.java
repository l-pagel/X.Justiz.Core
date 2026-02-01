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
 * Eine natürliche Person inklusive X.Justiz Core Erweiterungen.
 * <p>
 * <u><b>Natural person:</b></u> A natural person with X-Justiz Core additons.
 */
@XmlType(name = "NatuerlichePersonCore", propOrder = { "anwendungsspezifischeErweiterung" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NatuerlichePersonCore extends NatuerlichePerson {

    /**
     * In dieser Elementgruppe können Felder und/oder Feldgruppen, in denen mehrere Felder zusammengefasst sind, übermittelt werden. Da es hierfür keine festen Schema-Vorgaben gibt, darf diese Elementgruppe nur verwendet werden, wenn mit dem jeweiligen Kommunikationspartner Name und Inhalt der Felder und/oder Feldgruppen abgestimmt wurden. Es kann nicht davon ausgegangen werden, dass die hier hinterlegten Metadaten von Kommunikationspartnern, mit denen keine Absprachen erfolgten, ausgelesen werden können.
     * <p>
     * <u><b>Application-specific extension:</b></u> In this element group, fields and/or field groups in which several fields are summarized can be transmitted. Since there are no fixed schema specifications for this, this element group may only be used if the name and content of the fields and/or field groups have been agreed with the respective communication partner. It cannot be assumed that the metadata deposited here can be read by communication partners with whom no agreements have been made.
     */
    @XmlElement(name = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "anwendungsspezifischeErweiterung", namespace = "http://www.xjustiz.de")
    @JsonProperty("AnwendungsspezifischeErweiterung")
    @JsonAlias({ "anwendungsspezifischeErweiterung" })
    @Nullable
    private AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung;

    /**
     * Default constructor.
     */
    public NatuerlichePersonCore() {}

    /**
     * Gets the value of the AnwendungsspezifischeErweiterung property.
     * @return the value of the AnwendungsspezifischeErweiterung property
     */
    public AnwendungsspezifischeErweiterung getAnwendungsspezifischeErweiterung() { return anwendungsspezifischeErweiterung; }
    /**
     * Sets the value of the AnwendungsspezifischeErweiterung property.
     * @param anwendungsspezifischeErweiterung the value to set
     */
    public void setAnwendungsspezifischeErweiterung(AnwendungsspezifischeErweiterung anwendungsspezifischeErweiterung) { this.anwendungsspezifischeErweiterung = anwendungsspezifischeErweiterung; }

}