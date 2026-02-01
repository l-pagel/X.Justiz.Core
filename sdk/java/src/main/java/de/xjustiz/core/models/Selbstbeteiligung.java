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
 * Selbstbeteiligung.
 * <p>
 * <u><b>Deductible:</b></u> Deductible.
 */
@XmlType(name = "Selbstbeteiligung", propOrder = { "selbstbehaltBeteiligung", "teilweiseUmfassendeSelbstbeteiligung", "umfassendeSelbstbeteiligung" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Selbstbeteiligung {

    /**
     * Selbstbehalt.
     * <p>
     * <u><b>Deductible amount:</b></u> Deductible amount.
     */
    @XmlElement(name = "selbstbehaltbeteiligung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "selbstbehaltbeteiligung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("SelbstbehaltBeteiligung")
    @JsonAlias({ "selbstbehaltBeteiligung" })
    @Nullable
    private String selbstbehaltBeteiligung;

    /**
     * Teilweise umfassende Selbstbeteiligung.
     * <p>
     * <u><b>Partially comprehensive deductible:</b></u> Partially comprehensive deductible.
     */
    @XmlElement(name = "teilweiseumfassendeSelbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "teilweiseumfassendeSelbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("TeilweiseUmfassendeSelbstbeteiligung")
    @JsonAlias({ "teilweiseUmfassendeSelbstbeteiligung" })
    @Nullable
    private String teilweiseUmfassendeSelbstbeteiligung;

    /**
     * Umfassende Selbstbeteiligung.
     * <p>
     * <u><b>Comprehensive deductible:</b></u> Comprehensive deductible.
     */
    @XmlElement(name = "eumfassendeSelbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "eumfassendeSelbstbeteiligung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("UmfassendeSelbstbeteiligung")
    @JsonAlias({ "umfassendeSelbstbeteiligung" })
    @Nullable
    private String umfassendeSelbstbeteiligung;

    /**
     * Default constructor.
     */
    public Selbstbeteiligung() {}

    /**
     * Gets the value of the SelbstbehaltBeteiligung property.
     * @return the value of the SelbstbehaltBeteiligung property
     */
    public String getSelbstbehaltBeteiligung() { return selbstbehaltBeteiligung; }
    /**
     * Sets the value of the SelbstbehaltBeteiligung property.
     * @param selbstbehaltBeteiligung the value to set
     */
    public void setSelbstbehaltBeteiligung(String selbstbehaltBeteiligung) { this.selbstbehaltBeteiligung = selbstbehaltBeteiligung; }

    /**
     * Gets the value of the TeilweiseUmfassendeSelbstbeteiligung property.
     * @return the value of the TeilweiseUmfassendeSelbstbeteiligung property
     */
    public String getTeilweiseUmfassendeSelbstbeteiligung() { return teilweiseUmfassendeSelbstbeteiligung; }
    /**
     * Sets the value of the TeilweiseUmfassendeSelbstbeteiligung property.
     * @param teilweiseUmfassendeSelbstbeteiligung the value to set
     */
    public void setTeilweiseUmfassendeSelbstbeteiligung(String teilweiseUmfassendeSelbstbeteiligung) { this.teilweiseUmfassendeSelbstbeteiligung = teilweiseUmfassendeSelbstbeteiligung; }

    /**
     * Gets the value of the UmfassendeSelbstbeteiligung property.
     * @return the value of the UmfassendeSelbstbeteiligung property
     */
    public String getUmfassendeSelbstbeteiligung() { return umfassendeSelbstbeteiligung; }
    /**
     * Sets the value of the UmfassendeSelbstbeteiligung property.
     * @param umfassendeSelbstbeteiligung the value to set
     */
    public void setUmfassendeSelbstbeteiligung(String umfassendeSelbstbeteiligung) { this.umfassendeSelbstbeteiligung = umfassendeSelbstbeteiligung; }

}