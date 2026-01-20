package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).<br/>
/// <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlBeteiligter {

    @XmlElement(name = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JsonProperty("NP")
    @Nullable
    private NatuerlichePerson nP;

    @XmlElement(name = "organisation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "organisation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Org")
    @Nullable
    private Organisation org;

    public AuswahlBeteiligter() {
    }

    @Nullable
    public NatuerlichePerson getNP() {
        return nP;
    }

    public void setNP(@Nullable NatuerlichePerson nP) {
        this.nP = nP;
    }

    @Nullable
    public Organisation getOrg() {
        return org;
    }

    public void setOrg(@Nullable Organisation org) {
        this.org = org;
    }

}
