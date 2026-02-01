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
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Daten zum Verfahren.
 * <p>
 * <u><b>Procedural data:</b></u> Data regarding the proceeding.
 */
@XmlType(name = "Verfahrensdaten", propOrder = { "verfahrensnummer", "instanzdaten", "beteiligungen" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Verfahrensdaten {

    /**
     * Die Verfahrensnummer ist eine eindeutige Kennzeichnung, die für das Verfahren über alle Stationen hinweg gelten soll und neben dem Aktenzeichen übermittelt werden kann. Sie kann beispielsweise in einem Fachverfahren zur eindeutigen Identifikation des Verfahrens verwendet werden.
     * <p>
     * <u><b>Proceeding number:</b></u> The proceeding number is a unique identifier that is intended to apply to the proceeding across all stations and can be transmitted alongside the file reference. It can be used, for example, in a specialized procedure for the unique identification of the proceeding.
     */
    @XmlElement(name = "verfahrensnummer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "verfahrensnummer", namespace = "http://www.xjustiz.de")
    @JsonProperty("Verfahrensnummer")
    @JsonAlias({ "verfahrensnummer" })
    @Nullable
    private String verfahrensnummer;

    /**
     * Die Instanzdaten enthalten Informationen zu den Stationen, die ein Vorgang durchlaufen hat. Dies kann ein Gericht, eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein.
     * <p>
     * <u><b>Instance data:</b></u> The instance data contains information about the stations that a process has passed through. This can be a court, a public prosecutor's office, a judicial authority, but also another authority.
     */
    @XmlElement(name = "instanzdaten", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "instanzdaten", namespace = "http://www.xjustiz.de")
    @JsonProperty("Instanzdaten")
    @JsonAlias({ "instanzdaten" })
    @Nullable
    private Instanzdaten instanzdaten;

    /**
     * Für jede Beteiligung gibt es genau einen Beteiligten. Dieser kann mehrere Rollen haben.
     * <p>
     * <u><b>Participations:</b></u> For each participation, there is exactly one participant. This participant can have multiple roles.
     */
    @XmlElement(name = "beteiligung", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "beteiligung", namespace = "http://www.xjustiz.de")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Beteiligungen")
    @JsonAlias({ "beteiligungen" })
    @Nullable
    private List<Beteiligung> beteiligungen;

    /**
     * Default constructor.
     */
    public Verfahrensdaten() {}

    /**
     * Gets the value of the Verfahrensnummer property.
     * @return the value of the Verfahrensnummer property
     */
    public String getVerfahrensnummer() { return verfahrensnummer; }
    /**
     * Sets the value of the Verfahrensnummer property.
     * @param verfahrensnummer the value to set
     */
    public void setVerfahrensnummer(String verfahrensnummer) { this.verfahrensnummer = verfahrensnummer; }

    /**
     * Gets the value of the Instanzdaten property.
     * @return the value of the Instanzdaten property
     */
    public Instanzdaten getInstanzdaten() { return instanzdaten; }
    /**
     * Sets the value of the Instanzdaten property.
     * @param instanzdaten the value to set
     */
    public void setInstanzdaten(Instanzdaten instanzdaten) { this.instanzdaten = instanzdaten; }

    /**
     * Gets the value of the Beteiligungen property.
     * @return the value of the Beteiligungen property
     */
    public List<Beteiligung> getBeteiligungen() { return beteiligungen; }
    /**
     * Sets the value of the Beteiligungen property.
     * @param beteiligungen the value to set
     */
    public void setBeteiligungen(List<Beteiligung> beteiligungen) { this.beteiligungen = beteiligungen; }

}