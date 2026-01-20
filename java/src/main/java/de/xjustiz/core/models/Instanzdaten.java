package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Daten zur Instanz.
 * <p>
 *  <u><b>Instance data:</b></u> Data regarding the instance.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Instanzdaten {

    /**
     * Das Element dient als Schlüsselfeld für interne Referenzierungen. Die Instanznummer muss für das aktuelle XML-Instanzdokument eindeutig sein und identifiziert die jeweiligen Instanzdaten.
     * <p>
     *  <u><b>Instance number:</b></u> The element serves as a key field for internal referencing. The instance number must be unique for the current XML instance document and identifies the respective instance data.
     */
    @XmlElement(name = "instanznummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "instanznummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Instanznummer")
    @Nullable
    private String instanznummer;

    /**
     * Möglichkeit für zusätzliche Angaben bezüglich des Sachgebiets.
     * <p>
     *  <u><b>Subject area addition:</b></u> Opportunity for additional information regarding the subject area.
     */
    @XmlElement(name = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "sachgebietszusatz", namespace = "http://www.xjustiz.de")
    @JsonProperty("Sachgebietszusatz")
    @Nullable
    private String sachgebietszusatz;

    /**
     * Die auszuwählende Instanzbehörde ist eine Station, die der Vorgang durchlaufen hat. Dies kann ein Gericht oder eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein. Meist entspricht es dem Gericht (der Staatsanwaltschaft), an das (die) die Nachricht adressiert wird. Darüber hinaus können weitere Behörden (z.B. Gericht der Vorinstanz, Polizei in Strafverfahren), die den Vorgang/das Verfahren bereits bearbeitet haben, angegeben werden.
     * <p>
     *  <u><b>Instance authority selection:</b></u> The instance authority to be selected is a station that the process has passed through. This can be a court or a public prosecutor's office, a judicial authority, but also another authority. Usually, it corresponds to the court (public prosecutor's office) to which the message is addressed. Furthermore, other authorities (e.g., court of the previous instance, police in criminal proceedings) that have already processed the process/proceeding can be specified.
     */
    @XmlElement(name = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "auswahl_instanzbehoerde", namespace = "http://www.xjustiz.de")
    @JsonProperty("AuswahlInstanzbehoerde")
    @Nullable
    private AuswahlInstanzbehoerde auswahlInstanzbehoerde;

    /**
     * Default constructor.
     */
    public Instanzdaten() {
    }

    /**
     * Das Element dient als Schlüsselfeld für interne Referenzierungen. Die Instanznummer muss für das aktuelle XML-Instanzdokument eindeutig sein und identifiziert die jeweiligen Instanzdaten.
     *
     * @return the instanznummer
     */
    @Nullable
    public String getInstanznummer() {
        return instanznummer;
    }

    /**
     * Sets the instanznummer.
     *
     * @param instanznummer the instanznummer to set
     */
    public void setInstanznummer(@Nullable String instanznummer) {
        this.instanznummer = instanznummer;
    }

    /**
     * Möglichkeit für zusätzliche Angaben bezüglich des Sachgebiets.
     *
     * @return the sachgebietszusatz
     */
    @Nullable
    public String getSachgebietszusatz() {
        return sachgebietszusatz;
    }

    /**
     * Sets the sachgebietszusatz.
     *
     * @param sachgebietszusatz the sachgebietszusatz to set
     */
    public void setSachgebietszusatz(@Nullable String sachgebietszusatz) {
        this.sachgebietszusatz = sachgebietszusatz;
    }

    /**
     * Die auszuwählende Instanzbehörde ist eine Station, die der Vorgang durchlaufen hat. Dies kann ein Gericht oder eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein. Meist entspricht es dem Gericht (der Staatsanwaltschaft), an das (die) die Nachricht adressiert wird. Darüber hinaus können weitere Behörden (z.B. Gericht der Vorinstanz, Polizei in Strafverfahren), die den Vorgang/das Verfahren bereits bearbeitet haben, angegeben werden.
     *
     * @return the auswahlInstanzbehoerde
     */
    @Nullable
    public AuswahlInstanzbehoerde getAuswahlInstanzbehoerde() {
        return auswahlInstanzbehoerde;
    }

    /**
     * Sets the auswahlInstanzbehoerde.
     *
     * @param auswahlInstanzbehoerde the auswahlInstanzbehoerde to set
     */
    public void setAuswahlInstanzbehoerde(@Nullable AuswahlInstanzbehoerde auswahlInstanzbehoerde) {
        this.auswahlInstanzbehoerde = auswahlInstanzbehoerde;
    }

}
