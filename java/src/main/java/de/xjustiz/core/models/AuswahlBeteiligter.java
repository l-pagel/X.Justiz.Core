package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
 * <p>
 *  <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlBeteiligter {

    /**
     * Eine natürliche Person.
     * <p>
     *  <u><b>Natural person:</b></u> A natural person.
     */
    @XmlElement(name = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JsonProperty("NP")
    @Nullable
    private NatuerlichePerson nP;

    /**
     * Hier werden alle Beteiligten aufgeführt, die nicht mit dem Type.GDS.NatuerlichePerson abgedeckt werden können: Gesellschaften, Vereine, Bruchteilsgemeinschaften etc. Die Abgrenzung erfolgt nicht nach juristischen Kategorien, sondern nach datentechnischer Zweckmäßigkeit.
     * <p>
     *  <u><b>Organization:</b></u> All participants who cannot be covered by Type.GDS.NatuerlichePerson are listed here: companies, associations, fractional communities, etc. The distinction is not based on legal categories but on data technical expediency.
     */
    @XmlElement(name = "organisation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "organisation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Org")
    @Nullable
    private Organisation org;

    /**
     * Default constructor.
     */
    public AuswahlBeteiligter() {
    }

    /**
     * Eine natürliche Person.
     *
     * @return the nP
     */
    @Nullable
    public NatuerlichePerson getNP() {
        return nP;
    }

    /**
     * Sets the nP.
     *
     * @param nP the nP to set
     */
    public void setNP(@Nullable NatuerlichePerson nP) {
        this.nP = nP;
    }

    /**
     * Hier werden alle Beteiligten aufgeführt, die nicht mit dem Type.GDS.NatuerlichePerson abgedeckt werden können: Gesellschaften, Vereine, Bruchteilsgemeinschaften etc. Die Abgrenzung erfolgt nicht nach juristischen Kategorien, sondern nach datentechnischer Zweckmäßigkeit.
     *
     * @return the org
     */
    @Nullable
    public Organisation getOrg() {
        return org;
    }

    /**
     * Sets the org.
     *
     * @param org the org to set
     */
    public void setOrg(@Nullable Organisation org) {
        this.org = org;
    }

}
