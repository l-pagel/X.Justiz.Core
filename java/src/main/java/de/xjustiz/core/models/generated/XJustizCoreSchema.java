
package de.xjustiz.core.models.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * X.Justiz Core Schema
 * <p>
 * JSON Schema for X.Justiz Core document transmission messages. Generated from .NET project.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Kopf",
    "Grunddaten",
    "Schriftgutobjekte",
    "SchemaLocation"
})
public class XJustizCoreSchema {

    /**
     * Der Kopf der Nachricht.
     * Message header: The header of the message.
     * 
     */
    @JsonProperty("Kopf")
    @JsonPropertyDescription("Der Kopf der Nachricht.\nMessage header: The header of the message.")
    private Object kopf;
    /**
     * Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
     * Basic data: The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
     * 
     */
    @JsonProperty("Grunddaten")
    @JsonPropertyDescription("Der Type.GDS.Grunddaten enth\u00e4lt Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.\nBasic data: The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.")
    private Object grunddaten;
    /**
     * Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
     * Document objects: This element is only used for communication with the electronic file repository for bailiffs.
     * 
     */
    @JsonProperty("Schriftgutobjekte")
    @JsonPropertyDescription("Dieses Element wird nur f\u00fcr die Kommunikation mit der elektronischen Aktenablage f\u00fcr Gerichtsvollzieher verwendet.\nDocument objects: This element is only used for communication with the electronic file repository for bailiffs.")
    private Object schriftgutobjekte;
    /**
     * Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
     * Schema location: Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
     * 
     */
    @JsonProperty("SchemaLocation")
    @JsonPropertyDescription("Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugeh\u00f6rigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.\nSchema location: Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace\u2013URI / schema\u2010URL pairs, it acts as a hint to validators and parsers where the schemas can be found.")
    private String schemaLocation;

    /**
     * Der Kopf der Nachricht.
     * Message header: The header of the message.
     * 
     */
    @JsonProperty("Kopf")
    public Object getKopf() {
        return kopf;
    }

    /**
     * Der Kopf der Nachricht.
     * Message header: The header of the message.
     * 
     */
    @JsonProperty("Kopf")
    public void setKopf(Object kopf) {
        this.kopf = kopf;
    }

    /**
     * Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
     * Basic data: The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
     * 
     */
    @JsonProperty("Grunddaten")
    public Object getGrunddaten() {
        return grunddaten;
    }

    /**
     * Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
     * Basic data: The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
     * 
     */
    @JsonProperty("Grunddaten")
    public void setGrunddaten(Object grunddaten) {
        this.grunddaten = grunddaten;
    }

    /**
     * Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
     * Document objects: This element is only used for communication with the electronic file repository for bailiffs.
     * 
     */
    @JsonProperty("Schriftgutobjekte")
    public Object getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
     * Document objects: This element is only used for communication with the electronic file repository for bailiffs.
     * 
     */
    @JsonProperty("Schriftgutobjekte")
    public void setSchriftgutobjekte(Object schriftgutobjekte) {
        this.schriftgutobjekte = schriftgutobjekte;
    }

    /**
     * Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
     * Schema location: Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
     * 
     */
    @JsonProperty("SchemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
     * Schema location: Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
     * 
     */
    @JsonProperty("SchemaLocation")
    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(XJustizCoreSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("kopf");
        sb.append('=');
        sb.append(((this.kopf == null)?"<null>":this.kopf));
        sb.append(',');
        sb.append("grunddaten");
        sb.append('=');
        sb.append(((this.grunddaten == null)?"<null>":this.grunddaten));
        sb.append(',');
        sb.append("schriftgutobjekte");
        sb.append('=');
        sb.append(((this.schriftgutobjekte == null)?"<null>":this.schriftgutobjekte));
        sb.append(',');
        sb.append("schemaLocation");
        sb.append('=');
        sb.append(((this.schemaLocation == null)?"<null>":this.schemaLocation));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.kopf == null)? 0 :this.kopf.hashCode()));
        result = ((result* 31)+((this.grunddaten == null)? 0 :this.grunddaten.hashCode()));
        result = ((result* 31)+((this.schriftgutobjekte == null)? 0 :this.schriftgutobjekte.hashCode()));
        result = ((result* 31)+((this.schemaLocation == null)? 0 :this.schemaLocation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XJustizCoreSchema) == false) {
            return false;
        }
        XJustizCoreSchema rhs = ((XJustizCoreSchema) other);
        return (((((this.kopf == rhs.kopf)||((this.kopf!= null)&&this.kopf.equals(rhs.kopf)))&&((this.grunddaten == rhs.grunddaten)||((this.grunddaten!= null)&&this.grunddaten.equals(rhs.grunddaten))))&&((this.schriftgutobjekte == rhs.schriftgutobjekte)||((this.schriftgutobjekte!= null)&&this.schriftgutobjekte.equals(rhs.schriftgutobjekte))))&&((this.schemaLocation == rhs.schemaLocation)||((this.schemaLocation!= null)&&this.schemaLocation.equals(rhs.schemaLocation))));
    }

}
