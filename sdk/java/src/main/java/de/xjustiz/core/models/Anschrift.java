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
 * Repräsentiert eine Anschrift.
 * <p>
 * <u><b>Address:</b></u> Represents an address.
 */
@XmlType(name = "Anschrift", propOrder = { "strasse", "hausnummer", "postleitzahl", "ort", "staat" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Anschrift {

    /**
     * Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.
     * <p>
     * <u><b>Street:</b></u> Data type B was designed primarily for other names, such as place names and street names with house numbers.
     */
    @XmlElement(name = "strasse", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "strasse", namespace = "http://www.xjustiz.de")
    @JsonProperty("Strasse")
    @JsonAlias({ "strasse" })
    @Nullable
    private String strasse;

    /**
     * Die Hausnummer ist ggf. einschliesslich Buchstaben oder dergleichen anzugeben.
     * <p>
     * <u><b>House number:</b></u> The house number must be specified, including letters or similar if applicable.
     */
    @XmlElement(name = "hausnummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "hausnummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Hausnummer")
    @JsonAlias({ "hausnummer" })
    @Nullable
    private String hausnummer;

    /**
     * Bei einer ausländischen PLZ ist das Element "staat" zwingend anzugeben.
     * <p>
     * <u><b>Postal code:</b></u> For a foreign postal code, the element 'staat' (country) must be specified.
     */
    @XmlElement(name = "postleitzahl", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "postleitzahl", namespace = "http://www.xjustiz.de")
    @JsonProperty("Postleitzahl")
    @JsonAlias({ "postleitzahl" })
    @Nullable
    private String postleitzahl;

    /**
     * Bei postalischen Anschriften kann der hier angegebene Ort von der politischen Gemeinde abweichen. In diesem Fall sollten die postalische und die Lieferadresse separat mitgeteilt werden. Bei ausländischen Adressen empfiehlt die Deutsche Post AG, den Ort möglichst in der Landessprache zu schreiben. Dies erscheint auch im vorliegenden Zusammenhang sinnvoll.
     * <p>
     * <u><b>City:</b></u> For postal addresses, the city specified here may differ from the political municipality. In this case, the postal and delivery addresses should be communicated separately. For foreign addresses, Deutsche Post AG recommends writing the city in the local language if possible. This also seems appropriate in the present context.
     */
    @XmlElement(name = "ort", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "ort", namespace = "http://www.xjustiz.de")
    @JsonProperty("Ort")
    @JsonAlias({ "ort" })
    @Nullable
    private String ort;

    /**
     * Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     * <p>
     * <u><b>Country:</b></u> The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'CodeValue lists of code type 3'.
     */
    @XmlElement(name = "staat", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "staat", namespace = "http://www.xjustiz.de")
    @JsonProperty("Staat")
    @JsonAlias({ "staat" })
    @Nullable
    private Staat staat;

    /**
     * Default constructor.
     */
    public Anschrift() {}

    /**
     * Gets the value of the Strasse property.
     * @return the value of the Strasse property
     */
    public String getStrasse() { return strasse; }
    /**
     * Sets the value of the Strasse property.
     * @param strasse the value to set
     */
    public void setStrasse(String strasse) { this.strasse = strasse; }

    /**
     * Gets the value of the Hausnummer property.
     * @return the value of the Hausnummer property
     */
    public String getHausnummer() { return hausnummer; }
    /**
     * Sets the value of the Hausnummer property.
     * @param hausnummer the value to set
     */
    public void setHausnummer(String hausnummer) { this.hausnummer = hausnummer; }

    /**
     * Gets the value of the Postleitzahl property.
     * @return the value of the Postleitzahl property
     */
    public String getPostleitzahl() { return postleitzahl; }
    /**
     * Sets the value of the Postleitzahl property.
     * @param postleitzahl the value to set
     */
    public void setPostleitzahl(String postleitzahl) { this.postleitzahl = postleitzahl; }

    /**
     * Gets the value of the Ort property.
     * @return the value of the Ort property
     */
    public String getOrt() { return ort; }
    /**
     * Sets the value of the Ort property.
     * @param ort the value to set
     */
    public void setOrt(String ort) { this.ort = ort; }

    /**
     * Gets the value of the Staat property.
     * @return the value of the Staat property
     */
    public Staat getStaat() { return staat; }
    /**
     * Sets the value of the Staat property.
     * @param staat the value to set
     */
    public void setStaat(Staat staat) { this.staat = staat; }

}