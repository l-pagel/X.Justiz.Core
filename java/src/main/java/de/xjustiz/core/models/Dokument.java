package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.time.OffsetDateTime;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert ein Dokument.
 * <p>
 *  <u><b>Document:</b></u> Represents a document.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Dokument {

    /**
     * Sofern zu einem Dokument, z.B. bei der Übersendung einer inzwischen fortgeschriebenen Behördenakte, erneut Dateien übermittelt werden, soll für das Dokument im Element 'identifikation/id' die gleiche UUID wie bei der ersten Übermittlung angegeben werden. Auf diese Weise kann der Empfänger durch Vergleich der UUIDs erkennen, ob zu diesem Dokument bereits Dateien übermittelt wurden.
     * <p>
     *  <u><b>Identification:</b></u> If files are transmitted again for a document, e.g., when sending a now updated authority file, the same UUID should be specified for the document in the element 'identifikation/id' as for the first transmission. In this way, the recipient can recognize by comparing the UUIDs whether files have already been transmitted for this document.
     */
    @XmlElement(name = "identifikation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "identifikation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Identifikation")
    private Identifikation identifikation;

    /**
     * Fachspezifische Daten eines Dokuments.
     * <p>
     *  <u><b>Subject-specific data:</b></u> Specialized data of a document.
     */
    @XmlElement(name = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustiz.fachspezifischeDaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("FachspezifischeDaten")
    private XjustizFachspezifischeDaten fachspezifischeDaten;

    /**
     * Dieses Element gibt Auskunft darüber, zu welchem Zeitpunkt das Dokument im System erstellt wurde.
     * <p>
     *  <u><b>Creation time:</b></u> This element provides information about when the document was created in the system.
     */
    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    @Nullable
    private OffsetDateTime erstellungszeitpunkt;

    /**
     * Default constructor.
     */
    public Dokument() {
    }

    /**
     * Sofern zu einem Dokument, z.B. bei der Übersendung einer inzwischen fortgeschriebenen Behördenakte, erneut Dateien übermittelt werden, soll für das Dokument im Element 'identifikation/id' die gleiche UUID wie bei der ersten Übermittlung angegeben werden. Auf diese Weise kann der Empfänger durch Vergleich der UUIDs erkennen, ob zu diesem Dokument bereits Dateien übermittelt wurden.
     *
     * @return the identifikation
     */
    public Identifikation getIdentifikation() {
        return identifikation;
    }

    /**
     * Sets the identifikation.
     *
     * @param identifikation the identifikation to set
     */
    public void setIdentifikation(Identifikation identifikation) {
        this.identifikation = identifikation;
    }

    /**
     * Fachspezifische Daten eines Dokuments.
     *
     * @return the fachspezifischeDaten
     */
    public XjustizFachspezifischeDaten getFachspezifischeDaten() {
        return fachspezifischeDaten;
    }

    /**
     * Sets the fachspezifischeDaten.
     *
     * @param fachspezifischeDaten the fachspezifischeDaten to set
     */
    public void setFachspezifischeDaten(XjustizFachspezifischeDaten fachspezifischeDaten) {
        this.fachspezifischeDaten = fachspezifischeDaten;
    }

    /**
     * Dieses Element gibt Auskunft darüber, zu welchem Zeitpunkt das Dokument im System erstellt wurde.
     *
     * @return the erstellungszeitpunkt
     */
    @Nullable
    public OffsetDateTime getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    /**
     * Sets the erstellungszeitpunkt.
     *
     * @param erstellungszeitpunkt the erstellungszeitpunkt to set
     */
    public void setErstellungszeitpunkt(@Nullable OffsetDateTime erstellungszeitpunkt) {
        this.erstellungszeitpunkt = erstellungszeitpunkt;
    }

}
