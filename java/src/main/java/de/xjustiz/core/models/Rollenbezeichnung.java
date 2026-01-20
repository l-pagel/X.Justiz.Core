package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Ermöglicht die Angabe einer Rollenbezeichnung als Code.
 * <p>
 * <u><b>Role name:</b></u> Enables the specification of a role name as a code.
 */
@XmlType(name = "Rollenbezeichnung", propOrder = { "listVersionId", "listUri", "code" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Rollenbezeichnung {

    /**
     * Ermöglicht die Angabe einer Rollenbezeichnung als Code.
     * <p>
     * <u><b>Role name:</b></u> Enables the specification of a role name as a code.
     */
    @XmlAttribute(name = "listVersionID")
    @JacksonXmlProperty(isAttribute = true, localName = "listVersionID")
    @JsonProperty("ListVersionId")
    @JsonAlias({ "listVersionId" })
    private String listVersionId;

    /**
     * Ermöglicht die Angabe einer Rollenbezeichnung als Code.
     * <p>
     * <u><b>Role name:</b></u> Enables the specification of a role name as a code.
     */
    @XmlAttribute(name = "listURI")
    @JacksonXmlProperty(isAttribute = true, localName = "listURI")
    @JsonProperty("ListUri")
    @JsonAlias({ "listUri" })
    @Nullable
    private String listUri;

    /**
     * Ruft den Rollenbezeichnung-Code ab oder legt diesen fest.
     * <p>
     * <u><b>Code:</b></u> Gets or sets the role name code.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonProperty("code")
    @JsonAlias({ "Code", "code" })
    private RollenCode code;

    public Rollenbezeichnung() {}

    public String getListVersionId() { return listVersionId; }
    public void setListVersionId(String listVersionId) { this.listVersionId = listVersionId; }

    public String getListUri() { return listUri; }
    public void setListUri(String listUri) { this.listUri = listUri; }

    public RollenCode getCode() { return code; }
    public void setCode(RollenCode code) { this.code = code; }

}