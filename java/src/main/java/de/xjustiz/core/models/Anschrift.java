package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Anschrift.
 * <p>
 * <u><b>Address:</b></u> Represents an address.
 */
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
    @Nullable
    private Staat staat;

    public Anschrift() {}

    public String getStrasse() { return strasse; }
    public void setStrasse(String strasse) { this.strasse = strasse; }

    public String getHausnummer() { return hausnummer; }
    public void setHausnummer(String hausnummer) { this.hausnummer = hausnummer; }

    public String getPostleitzahl() { return postleitzahl; }
    public void setPostleitzahl(String postleitzahl) { this.postleitzahl = postleitzahl; }

    public String getOrt() { return ort; }
    public void setOrt(String ort) { this.ort = ort; }

    public Staat getStaat() { return staat; }
    public void setStaat(Staat staat) { this.staat = staat; }

}