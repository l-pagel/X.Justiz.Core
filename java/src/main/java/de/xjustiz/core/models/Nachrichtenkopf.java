package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import java.time.OffsetDateTime;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Der Kopf der Nachricht.
 * <p>
 * <u><b>Message header:</b></u> The header of the message.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Nachrichtenkopf {

    /**
     * Verwendete X.Justiz-Version für diese Nachricht.
     * <p>
     * <u><b>XJustiz version:</b></u> Used X.Justiz version for this message.
     */
    @XmlAttribute(name = "xjustizVersion")
    @JacksonXmlProperty(isAttribute = true, localName = "xjustizVersion")
    @JsonProperty("Version")
    private String version;

    /**
     * Aktenzeichen des Absenders. Der Wert wird aus
     * {@link Nachrichtenkopf#aktenzeichenAbsender} übernommen
     * <p>
     * <u><b>Sender file reference:</b></u> File reference of the sender. The value
     * of {@link Nachrichtenkopf#aktenzeichenAbsender} will be taken.
     */
    @XmlElement(name = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AktenzeichenAbsender")
    @Nullable
    private List<String> aktenzeichenAbsender;

    /**
     * Aktenzeichen des Empfängers.
     * <p>
     * <u><b>Recipient file reference:</b></u> File reference of the recipient.
     */
    @XmlElement(name = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "aktenzeichen.empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("AktenzeichenEmpfaenger")
    @Nullable
    private List<String> aktenzeichenEmpfaenger;

    /**
     * Hier ist der Erstellungszeitpunkt der XJustiz-Nachricht einzutragen.
     * <p>
     * <u><b>Creation time:</b></u> The creation time of the XJustiz message must be
     * entered here.
     */
    @XmlElement(name = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "erstellungszeitpunkt", namespace = "http://www.xjustiz.de")
    @JsonProperty("Erstellungszeitpunkt")
    private OffsetDateTime erstellungszeitpunkt;

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     * <p>
     * <u><b>Sender:</b></u> Selection structure for addresses (sender or receiver).
     */
    @XmlElement(name = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_absender", namespace = "http://www.xjustiz.de")
    @JsonProperty("Absender")
    private AuswahlAdresse absender;

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     * <p>
     * <u><b>Recipient:</b></u> Selection structure for addresses (sender or
     * receiver).
     */
    @XmlElement(name = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_empfaenger", namespace = "http://www.xjustiz.de")
    @JsonProperty("Empfaenger")
    private AuswahlAdresse empfaenger;

    /**
     * Hier ist eine eindeutige Identifikation der bei diesem Übermittlungsvorgang
     * erstellten Nachricht anzugeben, um spätere Referenzen zu ermöglichen.
     * <p>
     * <u><b>Own message ID:</b></u> A unique identification of the message created
     * during this transmission process must be specified here to enable later
     * references.
     */
    @XmlElement(name = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "eigeneNachrichtenID", namespace = "http://www.xjustiz.de")
    @JsonProperty("EigeneNachrichtenId")
    @Nullable
    private String eigeneNachrichtenId;

    /**
     * Default constructor.
     */
    public Nachrichtenkopf() {
    }

    /**
     * Verwendete X.Justiz-Version für diese Nachricht.
     *
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Aktenzeichen des Absenders. Der Wert wird aus
     * {@link Nachrichtenkopf#aktenzeichenAbsender} übernommen
     *
     * @return the aktenzeichenAbsender
     */
    @Nullable
    public List<String> getAktenzeichenAbsender() {
        return aktenzeichenAbsender;
    }

    /**
     * Sets the aktenzeichenAbsender.
     *
     * @param aktenzeichenAbsender the aktenzeichenAbsender to set
     */
    public void setAktenzeichenAbsender(@Nullable List<String> aktenzeichenAbsender) {
        this.aktenzeichenAbsender = aktenzeichenAbsender;
    }

    /**
     * Aktenzeichen des Empfängers.
     *
     * @return the aktenzeichenEmpfaenger
     */
    @Nullable
    public List<String> getAktenzeichenEmpfaenger() {
        return aktenzeichenEmpfaenger;
    }

    /**
     * Sets the aktenzeichenEmpfaenger.
     *
     * @param aktenzeichenEmpfaenger the aktenzeichenEmpfaenger to set
     */
    public void setAktenzeichenEmpfaenger(@Nullable List<String> aktenzeichenEmpfaenger) {
        this.aktenzeichenEmpfaenger = aktenzeichenEmpfaenger;
    }

    /**
     * Hier ist der Erstellungszeitpunkt der XJustiz-Nachricht einzutragen.
     *
     * @return the erstellungszeitpunkt
     */
    public OffsetDateTime getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    /**
     * Sets the erstellungszeitpunkt.
     *
     * @param erstellungszeitpunkt the erstellungszeitpunkt to set
     */
    public void setErstellungszeitpunkt(OffsetDateTime erstellungszeitpunkt) {
        this.erstellungszeitpunkt = erstellungszeitpunkt;
    }

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     *
     * @return the absender
     */
    public AuswahlAdresse getAbsender() {
        return absender;
    }

    /**
     * Sets the absender.
     *
     * @param absender the absender to set
     */
    public void setAbsender(AuswahlAdresse absender) {
        this.absender = absender;
    }

    /**
     * Auswahlstruktur für Adressen (Absender oder Empfänger).
     *
     * @return the empfaenger
     */
    public AuswahlAdresse getEmpfaenger() {
        return empfaenger;
    }

    /**
     * Sets the empfaenger.
     *
     * @param empfaenger the empfaenger to set
     */
    public void setEmpfaenger(AuswahlAdresse empfaenger) {
        this.empfaenger = empfaenger;
    }

    /**
     * Hier ist eine eindeutige Identifikation der bei diesem Übermittlungsvorgang
     * erstellten Nachricht anzugeben, um spätere Referenzen zu ermöglichen.
     *
     * @return the eigeneNachrichtenId
     */
    @Nullable
    public String getEigeneNachrichtenId() {
        return eigeneNachrichtenId;
    }

    /**
     * Sets the eigeneNachrichtenId.
     *
     * @param eigeneNachrichtenId the eigeneNachrichtenId to set
     */
    public void setEigeneNachrichtenId(@Nullable String eigeneNachrichtenId) {
        this.eigeneNachrichtenId = eigeneNachrichtenId;
    }

}
