package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Fachspezifische Daten einer Akte. Ergänzt um Felder für die Mandatsannahme
 * <p>
 * <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
 */
@XmlType(name = "XjustizAkteFachspezifischeDatenCore", propOrder = { "ziel", "nachricht", "sendungsmitteilung", "notizen", "anliegen", "sachverhalt", "notarpraeferenz", "terminpraeferenz" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XjustizAkteFachspezifischeDatenCore extends XjustizAkteFachspezifischeDaten {

    /**
     * Fachspezifische Daten einer Akte. Ergänzt um Felder für die Mandatsannahme
     * <p>
     * <u><b>Subject-specific data of a file:</b></u> Specialized data of a file/case.
     */
    @XmlElement(name = "ziel", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "ziel", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Ziel")
    @JsonAlias({ "ziel" })
    @Nullable
    private String ziel;

    /**
     * Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
     */
    @XmlElement(name = "nachricht", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "nachricht", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Nachricht")
    @JsonAlias({ "nachricht" })
    @Nullable
    private String nachricht;

    /**
     * Freitext für Zusatznachricht zu Akte (Nachricht des Mandanten an den Anwalt/Notar)
     */
    @XmlElement(name = "sendungsmitteilung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "sendungsmitteilung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Sendungsmitteilung")
    @JsonAlias({ "sendungsmitteilung" })
    @Nullable
    private String sendungsmitteilung;

    /**
     * Freitext für Notizen zur Akte
     */
    @XmlElement(name = "notizen", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "notizen", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Notizen")
    @JsonAlias({ "notizen" })
    @Nullable
    private String notizen;

    /**
     * Rechgebiet (AreaOfLaw)
     */
    @XmlElement(name = "anliegen", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "anliegen", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Anliegen")
    @JsonAlias({ "anliegen" })
    @Nullable
    private String anliegen;

    /**
     * Aktentyp (CaseType)
     */
    @XmlElement(name = "sachverhalt", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "sachverhalt", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Sachverhalt")
    @JsonAlias({ "sachverhalt" })
    @Nullable
    private String sachverhalt;

    /**
     * Aktentyp (CaseType)
     */
    @XmlElement(name = "notarpraeferenz", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "notarpraeferenz", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Notarpraeferenz")
    @JsonAlias({ "notarpraeferenz" })
    @Nullable
    private String notarpraeferenz;

    /**
     * Aktentyp (CaseType)
     */
    @XmlElement(name = "terminpraeferenz", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "terminpraeferenz", namespace = "http://www.xjustizcore.de")
    @JsonProperty("Terminpraeferenz")
    @JsonAlias({ "terminpraeferenz" })
    @Nullable
    private String terminpraeferenz;

    /**
     * Default constructor.
     */
    public XjustizAkteFachspezifischeDatenCore() {}

    /**
     * Gets the value of the Ziel property.
     * @return the value of the Ziel property
     */
    public String getZiel() { return ziel; }
    /**
     * Sets the value of the Ziel property.
     * @param ziel the value to set
     */
    public void setZiel(String ziel) { this.ziel = ziel; }

    /**
     * Gets the value of the Nachricht property.
     * @return the value of the Nachricht property
     */
    public String getNachricht() { return nachricht; }
    /**
     * Sets the value of the Nachricht property.
     * @param nachricht the value to set
     */
    public void setNachricht(String nachricht) { this.nachricht = nachricht; }

    /**
     * Gets the value of the Sendungsmitteilung property.
     * @return the value of the Sendungsmitteilung property
     */
    public String getSendungsmitteilung() { return sendungsmitteilung; }
    /**
     * Sets the value of the Sendungsmitteilung property.
     * @param sendungsmitteilung the value to set
     */
    public void setSendungsmitteilung(String sendungsmitteilung) { this.sendungsmitteilung = sendungsmitteilung; }

    /**
     * Gets the value of the Notizen property.
     * @return the value of the Notizen property
     */
    public String getNotizen() { return notizen; }
    /**
     * Sets the value of the Notizen property.
     * @param notizen the value to set
     */
    public void setNotizen(String notizen) { this.notizen = notizen; }

    /**
     * Gets the value of the Anliegen property.
     * @return the value of the Anliegen property
     */
    public String getAnliegen() { return anliegen; }
    /**
     * Sets the value of the Anliegen property.
     * @param anliegen the value to set
     */
    public void setAnliegen(String anliegen) { this.anliegen = anliegen; }

    /**
     * Gets the value of the Sachverhalt property.
     * @return the value of the Sachverhalt property
     */
    public String getSachverhalt() { return sachverhalt; }
    /**
     * Sets the value of the Sachverhalt property.
     * @param sachverhalt the value to set
     */
    public void setSachverhalt(String sachverhalt) { this.sachverhalt = sachverhalt; }

    /**
     * Gets the value of the Notarpraeferenz property.
     * @return the value of the Notarpraeferenz property
     */
    public String getNotarpraeferenz() { return notarpraeferenz; }
    /**
     * Sets the value of the Notarpraeferenz property.
     * @param notarpraeferenz the value to set
     */
    public void setNotarpraeferenz(String notarpraeferenz) { this.notarpraeferenz = notarpraeferenz; }

    /**
     * Gets the value of the Terminpraeferenz property.
     * @return the value of the Terminpraeferenz property
     */
    public String getTerminpraeferenz() { return terminpraeferenz; }
    /**
     * Sets the value of the Terminpraeferenz property.
     * @param terminpraeferenz the value to set
     */
    public void setTerminpraeferenz(String terminpraeferenz) { this.terminpraeferenz = terminpraeferenz; }

}