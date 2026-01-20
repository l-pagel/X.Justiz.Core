package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HttpHeader {

    @XmlElement(name = "name", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustizcore.de")
    @JsonProperty("name")
    private String name;

    @XmlElement(name = "wert", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustizcore.de")
    @JsonProperty("value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
