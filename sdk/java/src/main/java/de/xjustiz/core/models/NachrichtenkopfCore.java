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

/**
 * Der Kopf der Nachricht für X.Justiz Core.
 * <p>
 * <u><b>Message header:</b></u> The header of the message for X.Justiz Core.
 */
@XmlType(name = "NachrichtenkopfCore", propOrder = { "version_XJustizCore", "version_XJustizReferenz" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NachrichtenkopfCore extends Nachrichtenkopf {

    /**
     * Verwendete X.Justiz Core Version für diese Nachricht. Redundant zu {@link Version}
     * <p>
     * <u><b>XJustiz Core version:</b></u> Used X.Justiz Core version for this message. Redundant to {@link Version}
     */
    @XmlElement(name = "xjustizCoreVersion", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustizCoreVersion", namespace = "http://www.xjustiz.de")
    @JsonProperty("Version_XJustizCore")
    @JsonAlias({ "version_XJustizCore" })
    private String version_XJustizCore;

    /**
     * Verwendete X.Justiz Core Version für diese Nachricht als String.
     * <p>
     * <u><b>XJustiz Core version:</b></u> Used X.Justiz Core version for this message as string.
     */
    @XmlElement(name = "xjustizReferenzVersion", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "xjustizReferenzVersion", namespace = "http://www.xjustiz.de")
    @JsonProperty("Version_XJustizReferenz")
    @JsonAlias({ "version_XJustizReferenz" })
    private String version_XJustizReferenz;

    /**
     * Default constructor.
     */
    public NachrichtenkopfCore() {}

    /**
     * Gets the value of the Version_XJustizCore property.
     * @return the value of the Version_XJustizCore property
     */
    public String getVersion_XJustizCore() { return version_XJustizCore; }
    /**
     * Sets the value of the Version_XJustizCore property.
     * @param version_XJustizCore the value to set
     */
    public void setVersion_XJustizCore(String version_XJustizCore) { this.version_XJustizCore = version_XJustizCore; }

    /**
     * Gets the value of the Version_XJustizReferenz property.
     * @return the value of the Version_XJustizReferenz property
     */
    public String getVersion_XJustizReferenz() { return version_XJustizReferenz; }
    /**
     * Sets the value of the Version_XJustizReferenz property.
     * @param version_XJustizReferenz the value to set
     */
    public void setVersion_XJustizReferenz(String version_XJustizReferenz) { this.version_XJustizReferenz = version_XJustizReferenz; }

}