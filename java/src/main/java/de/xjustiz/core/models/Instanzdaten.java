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
 * Daten zur Instanz.
 * <p>
 * <u><b>Instance data:</b></u> Data regarding the instance.
 */
@XmlType(name = "Instanzdaten", propOrder = { "instanznummer", "sachgebietszusatz", "auswahlInstanzbehoerde" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Instanzdaten {

    /**
     * Das Element dient als Schlüsselfeld für interne Referenzierungen. Die Instanznummer muss für das aktuelle XML-Instanzdokument eindeutig sein und identifiziert die jeweiligen Instanzdaten.
     * <p>
     * <u><b>Instance number:</b></u> The element serves as a key field for internal referencing. The instance number must be unique for the current XML instance document and identifies the respective instance data.
     */
    @XmlElement(name = "instanznummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "instanznummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Instanznummer")
    @JsonAlias({ "instanznummer" })
    @Nullable
    private String instanznummer;

    /**
     * Möglichkeit für zusätzliche Angaben bezüglich des Sachgebiets.
     * <p>
     * <u><b>Subject area addition:</b></u> Opportunity for additional information regarding the subject area.
     */
    @XmlElement(name = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JsonProperty("Sachgebietszusatz")
    @JsonAlias({ "sachgebietszusatz" })
    @Nullable
    private String sachgebietszusatz;

    /**
     * Die auszuwählende Instanzbehörde ist eine Station, die der Vorgang durchlaufen hat. Dies kann ein Gericht oder eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein. Meist entspricht es dem Gericht (der Staatsanwaltschaft), an das (die) die Nachricht adressiert wird. Darüber hinaus können weitere Behörden (z.B. Gericht der Vorinstanz, Polizei in Strafverfahren), die den Vorgang/das Verfahren bereits bearbeitet haben, angegeben werden.
     * <p>
     * <u><b>Instance authority selection:</b></u> The instance authority to be selected is a station that the process has passed through. This can be a court or a public prosecutor's office, a judicial authority, but also another authority. Usually, it corresponds to the court (public prosecutor's office) to which the message is addressed. Furthermore, other authorities (e.g., court of the previous instance, police in criminal proceedings) that have already processed the process/proceeding can be specified.
     */
    @XmlElement(name = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JsonProperty("AuswahlInstanzbehoerde")
    @JsonAlias({ "auswahlInstanzbehoerde" })
    @Nullable
    private AuswahlInstanzbehoerde auswahlInstanzbehoerde;

    public Instanzdaten() {}

    public String getInstanznummer() { return instanznummer; }
    public void setInstanznummer(String instanznummer) { this.instanznummer = instanznummer; }

    public String getSachgebietszusatz() { return sachgebietszusatz; }
    public void setSachgebietszusatz(String sachgebietszusatz) { this.sachgebietszusatz = sachgebietszusatz; }

    public AuswahlInstanzbehoerde getAuswahlInstanzbehoerde() { return auswahlInstanzbehoerde; }
    public void setAuswahlInstanzbehoerde(AuswahlInstanzbehoerde auswahlInstanzbehoerde) { this.auswahlInstanzbehoerde = auswahlInstanzbehoerde; }

}