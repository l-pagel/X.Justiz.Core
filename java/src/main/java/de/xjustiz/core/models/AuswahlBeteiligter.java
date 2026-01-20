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
 * Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
 * <p>
 * <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
 */
@XmlType(name = "AuswahlBeteiligter", propOrder = { "nP", "org" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuswahlBeteiligter {

    /**
     * Eine natürliche Person.
     * <p>
     * <u><b>Natural person:</b></u> A natural person.
     */
    @XmlElement(name = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JsonProperty("natuerlichePerson")
    @JsonAlias({ "NP", "nP" })
    @Nullable
    private NatuerlichePerson nP;

    /**
     * Hier werden alle Beteiligten aufgeführt, die nicht mit dem Type.GDS.NatuerlichePerson abgedeckt werden können: Gesellschaften, Vereine, Bruchteilsgemeinschaften etc. Die Abgrenzung erfolgt nicht nach juristischen Kategorien, sondern nach datentechnischer Zweckmäßigkeit.
     * <p>
     * <u><b>Organization:</b></u> All participants who cannot be covered by Type.GDS.NatuerlichePerson are listed here: companies, associations, fractional communities, etc. The distinction is not based on legal categories but on data technical expediency.
     */
    @XmlElement(name = "organisation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "organisation", namespace = "http://www.xjustiz.de")
    @JsonProperty("organisation")
    @JsonAlias({ "Org", "org" })
    @Nullable
    private Organisation org;

    public AuswahlBeteiligter() {}

    public NatuerlichePerson getNP() { return nP; }
    public void setNP(NatuerlichePerson nP) { this.nP = nP; }

    public Organisation getOrg() { return org; }
    public void setOrg(Organisation org) { this.org = org; }

}