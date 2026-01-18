package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für einen Beteiligten.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlBeteiligter {

    @XmlElement(name = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "natuerlichePerson", namespace = "http://www.xjustiz.de")
    @JsonProperty("NatuerlichePerson")
    @Nullable
    private NatuerlichePerson natuerlichePerson;

    @XmlElement(name = "organisation", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "organisation", namespace = "http://www.xjustiz.de")
    @JsonProperty("Organisation")
    @Nullable
    private Organisation organisation;

    public AuswahlBeteiligter() {
    }

    @Nullable
    public NatuerlichePerson getNatuerlichePerson() {
        return natuerlichePerson;
    }

    public void setNatuerlichePerson(@Nullable NatuerlichePerson natuerlichePerson) {
        this.natuerlichePerson = natuerlichePerson;
    }

    @Nullable
    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(@Nullable Organisation organisation) {
        this.organisation = organisation;
    }
}
