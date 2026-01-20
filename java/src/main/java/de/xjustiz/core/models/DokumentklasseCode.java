package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Dokumentklasse Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codeliste GDS.Dokumentklasse</a>.
 *  * <p>
 *  *  <u><b>Document class codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code list GDS.DocumentClass</a>.
 */
@XmlType
@XmlEnum
public enum DokumentklasseCode {

    /**
     * Dokumentklasse Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codeliste GDS.Dokumentklasse</a>.
     *  * <p>
     *  *  <u><b>Document class codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code list GDS.DocumentClass</a>.
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Andere_Sonstige("001"),

    /**
     * Dokumentklasse Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codeliste GDS.Dokumentklasse</a>.
     *  * <p>
     *  *  <u><b>Document class codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code list GDS.DocumentClass</a>.
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Klage_Antrag("003"),

    /**
     * Dokumentklasse Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codeliste GDS.Dokumentklasse</a>.
     *  * <p>
     *  *  <u><b>Document class codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code list GDS.DocumentClass</a>.
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Anlage("005"),

    /**
     * <b>Andere / Sonstige / Other / Miscellaneous</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Urteil("006"),

    /**
     * <b>Andere / Sonstige / Other / Miscellaneous</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Beschluss("007"),

    /**
     * <b>Andere / Sonstige / Other / Miscellaneous</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    Verfuegung("008"),

    /**
     * <b>Andere / Sonstige / Other / Miscellaneous</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("009")
    @XmlEnumValue("009")
    Vermerk("009"),

    /**
     * <b>Klage / Antrag / Complaint / Application</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Protokoll("010"),

    /**
     * <b>Klage / Antrag / Complaint / Application</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Fehlblatt("011"),

    /**
     * <b>Klage / Antrag / Complaint / Application</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Zustellungsdokument("012"),

    /**
     * <b>Anlage</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Gutachten("013"),

    /**
     * <b>Anlage</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Technische_Information("014"),

    /**
     * <b>Anlage</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Schreiben("015"),

    /**
     * <b>Urteil / Judgment</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("016")
    @XmlEnumValue("016")
    Antrag_Behoerde("016"),

    /**
     * <b>Urteil / Judgment</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("017")
    @XmlEnumValue("017")
    Bescheid("017"),

    /**
     * <b>Urteil / Judgment</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("018")
    @XmlEnumValue("018")
    Einspruch_Widerspruch_Behoerde("018"),

    /**
     * <b>Beschluss / Resolution / Order</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("019")
    @XmlEnumValue("019")
    Einspruchs_Widerspruchsbescheid("019"),

    /**
     * <b>Beschluss / Resolution / Order</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("020")
    @XmlEnumValue("020")
    Kostendokument("020"),

    /**
     * <b>Beschluss / Resolution / Order</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Gerichtsbescheid("021");

    private final String value;
    DokumentklasseCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @Override
    public String toString() { return value; }
}