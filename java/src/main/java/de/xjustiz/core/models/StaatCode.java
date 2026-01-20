package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Staat Codes aus <a href="https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat">XRepository: Codeliste Staat aus der Staats- und Gebietssystematik des Statistischen Bundesamtes</a>.
 *  * <p>
 *  *  <u><b>Country codes:</b></u> from <a href="https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat">XRepository: State code list from the State and Territorial Classification of the Federal Statistical Office</a>.
 */
@XmlType
@XmlEnum
public enum StaatCode {

    /**
     * <b>Deutschland / Germany</b>
     *  * <p>
     *  *  Staatenname-kurz: Deutschland
     *  * <p>
     *  *  Staatenname-voll: die Bundesrepublik Deutschland
     *  * <p>
     *  *  Schluessel-Staat: 000
     *  * <p>
     *  *  ISO-3: DEU
     *  * <p>
     *  *  ISO-2: DE
     *  * <p>
     *  * 
     */
    @JsonProperty("000")
    @XmlEnumValue("000")
    Deutschland("000"),

    /**
     * <b>Albanien / Albania</b>
     *  * <p>
     *  *  Staatenname-kurz: Albanien
     *  * <p>
     *  *  Staatenname-voll: die Republik Albanien
     *  * <p>
     *  *  Schluessel-Staat: 121
     *  * <p>
     *  *  ISO-3: ALB
     *  * <p>
     *  *  ISO-2: AL
     *  * <p>
     *  * 
     */
    @JsonProperty("121")
    @XmlEnumValue("121")
    Albanien("121"),

    /**
     * <b>Bosnien und Herzegowina / Bosnia &amp; Herzegovina</b>
     *  * <p>
     *  *  Staatenname-kurz: Bosnien und Herzegowina
     *  * <p>
     *  *  Staatenname-voll: Bosnien und Herzegowina
     *  * <p>
     *  *  Schluessel-Staat: 122
     *  * <p>
     *  *  ISO-3: BIH
     *  * <p>
     *  *  ISO-2: BA
     *  * <p>
     *  * 
     */
    @JsonProperty("122")
    @XmlEnumValue("122")
    Bosnien_und_Herzegowina("122"),

    /**
     * <b>Andorra</b>
     *  * <p>
     *  *  Staatenname-kurz: Andorra
     *  * <p>
     *  *  Staatenname-voll: das F&#252;rstentum Andorra
     *  * <p>
     *  *  Schluessel-Staat: 123
     *  * <p>
     *  *  ISO-3: AND
     *  * <p>
     *  *  ISO-2: AD
     *  * <p>
     *  * 
     */
    @JsonProperty("123")
    @XmlEnumValue("123")
    Andorra("123"),

    /**
     * <b>Belgien / Belgium</b>
     *  * <p>
     *  *  Staatenname-kurz: Belgien
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Belgien
     *  * <p>
     *  *  Schluessel-Staat: 124
     *  * <p>
     *  *  ISO-3: BEL
     *  * <p>
     *  *  ISO-2: BE
     *  * <p>
     *  * 
     */
    @JsonProperty("124")
    @XmlEnumValue("124")
    Belgien("124"),

    /**
     * <b>Bulgarien / Bulgaria</b>
     *  * <p>
     *  *  Staatenname-kurz: Bulgarien
     *  * <p>
     *  *  Staatenname-voll: die Republik Bulgarien
     *  * <p>
     *  *  Schluessel-Staat: 125
     *  * <p>
     *  *  ISO-3: BGR
     *  * <p>
     *  *  ISO-2: BG
     *  * <p>
     *  * 
     */
    @JsonProperty("125")
    @XmlEnumValue("125")
    Bulgarien("125"),

    /**
     * <b>D&#228;nemark / Denmark</b>
     *  * <p>
     *  *  Staatenname-kurz: D&#228;nemark
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich D&#228;nemark
     *  * <p>
     *  *  Schluessel-Staat: 126
     *  * <p>
     *  *  ISO-3: DNK
     *  * <p>
     *  *  ISO-2: DK
     *  * <p>
     *  * 
     */
    @JsonProperty("126")
    @XmlEnumValue("126")
    Daenemark("126"),

    /**
     * <b>Estland / Estonia</b>
     *  * <p>
     *  *  Staatenname-kurz: Estland
     *  * <p>
     *  *  Staatenname-voll: die Republik Estland
     *  * <p>
     *  *  Schluessel-Staat: 127
     *  * <p>
     *  *  ISO-3: EST
     *  * <p>
     *  *  ISO-2: EE
     *  * <p>
     *  * 
     */
    @JsonProperty("127")
    @XmlEnumValue("127")
    Estland("127"),

    /**
     * <b>Finnland / Finland</b>
     *  * <p>
     *  *  Staatenname-kurz: Finnland
     *  * <p>
     *  *  Staatenname-voll: die Republik Finnland
     *  * <p>
     *  *  Schluessel-Staat: 128
     *  * <p>
     *  *  ISO-3: FIN
     *  * <p>
     *  *  ISO-2: FI
     *  * <p>
     *  * 
     */
    @JsonProperty("128")
    @XmlEnumValue("128")
    Finnland("128"),

    /**
     * <b>Frankreich / France</b>
     *  * <p>
     *  *  Staatenname-kurz: Frankreich
     *  * <p>
     *  *  Staatenname-voll: die Franz&#246;sische Republik
     *  * <p>
     *  *  Schluessel-Staat: 129
     *  * <p>
     *  *  ISO-3: FRA
     *  * <p>
     *  *  ISO-2: FR
     *  * <p>
     *  * 
     */
    @JsonProperty("129")
    @XmlEnumValue("129")
    Frankreich("129"),

    /**
     * <b>Kroatien / Croatia</b>
     *  * <p>
     *  *  Staatenname-kurz: Kroatien
     *  * <p>
     *  *  Staatenname-voll: die Republik Kroatien
     *  * <p>
     *  *  Schluessel-Staat: 130
     *  * <p>
     *  *  ISO-3: HRV
     *  * <p>
     *  *  ISO-2: HR
     *  * <p>
     *  * 
     */
    @JsonProperty("130")
    @XmlEnumValue("130")
    Kroatien("130"),

    /**
     * <b>Slowenien / Slovenia</b>
     *  * <p>
     *  *  Staatenname-kurz: Slowenien
     *  * <p>
     *  *  Staatenname-voll: die Republik Slowenien
     *  * <p>
     *  *  Schluessel-Staat: 131
     *  * <p>
     *  *  ISO-3: SVN
     *  * <p>
     *  *  ISO-2: SI
     *  * <p>
     *  * 
     */
    @JsonProperty("131")
    @XmlEnumValue("131")
    Slowenien("131"),

    /**
     * <b>Griechenland / Greece</b>
     *  * <p>
     *  *  Staatenname-kurz: Griechenland
     *  * <p>
     *  *  Staatenname-voll: die Hellenische Republik
     *  * <p>
     *  *  Schluessel-Staat: 134
     *  * <p>
     *  *  ISO-3: GRC
     *  * <p>
     *  *  ISO-2: GR
     *  * <p>
     *  * 
     */
    @JsonProperty("134")
    @XmlEnumValue("134")
    Griechenland("134"),

    /**
     * <b>Irland / Ireland</b>
     *  * <p>
     *  *  Staatenname-kurz: Irland
     *  * <p>
     *  *  Staatenname-voll: Irland
     *  * <p>
     *  *  Schluessel-Staat: 135
     *  * <p>
     *  *  ISO-3: IRL
     *  * <p>
     *  *  ISO-2: IE
     *  * <p>
     *  * 
     */
    @JsonProperty("135")
    @XmlEnumValue("135")
    Irland("135"),

    /**
     * <b>Island / Iceland</b>
     *  * <p>
     *  *  Staatenname-kurz: Island
     *  * <p>
     *  *  Staatenname-voll: Island
     *  * <p>
     *  *  Schluessel-Staat: 136
     *  * <p>
     *  *  ISO-3: ISL
     *  * <p>
     *  *  ISO-2: IS
     *  * <p>
     *  * 
     */
    @JsonProperty("136")
    @XmlEnumValue("136")
    Island("136"),

    /**
     * <b>Italien / Italy</b>
     *  * <p>
     *  *  Staatenname-kurz: Italien
     *  * <p>
     *  *  Staatenname-voll: die Italienische Republik
     *  * <p>
     *  *  Schluessel-Staat: 137
     *  * <p>
     *  *  ISO-3: ITA
     *  * <p>
     *  *  ISO-2: IT
     *  * <p>
     *  * 
     */
    @JsonProperty("137")
    @XmlEnumValue("137")
    Italien("137"),

    /**
     * <b>Lettland / Latvia</b>
     *  * <p>
     *  *  Staatenname-kurz: Lettland
     *  * <p>
     *  *  Staatenname-voll: die Republik Lettland
     *  * <p>
     *  *  Schluessel-Staat: 139
     *  * <p>
     *  *  ISO-3: LVA
     *  * <p>
     *  *  ISO-2: LV
     *  * <p>
     *  * 
     */
    @JsonProperty("139")
    @XmlEnumValue("139")
    Lettland("139"),

    /**
     * <b>Montenegro</b>
     *  * <p>
     *  *  Staatenname-kurz: Montenegro
     *  * <p>
     *  *  Staatenname-voll: Montenegro
     *  * <p>
     *  *  Schluessel-Staat: 140
     *  * <p>
     *  *  ISO-3: MNE
     *  * <p>
     *  *  ISO-2: ME
     *  * <p>
     *  * 
     */
    @JsonProperty("140")
    @XmlEnumValue("140")
    Montenegro("140"),

    /**
     * <b>Liechtenstein</b>
     *  * <p>
     *  *  Staatenname-kurz: Liechtenstein
     *  * <p>
     *  *  Staatenname-voll: das F&#252;rstentum Liechtenstein
     *  * <p>
     *  *  Schluessel-Staat: 141
     *  * <p>
     *  *  ISO-3: LIE
     *  * <p>
     *  *  ISO-2: LI
     *  * <p>
     *  * 
     */
    @JsonProperty("141")
    @XmlEnumValue("141")
    Liechtenstein("141"),

    /**
     * <b>Litauen / Lithuania</b>
     *  * <p>
     *  *  Staatenname-kurz: Litauen
     *  * <p>
     *  *  Staatenname-voll: die Republik Litauen
     *  * <p>
     *  *  Schluessel-Staat: 142
     *  * <p>
     *  *  ISO-3: LTU
     *  * <p>
     *  *  ISO-2: LT
     *  * <p>
     *  * 
     */
    @JsonProperty("142")
    @XmlEnumValue("142")
    Litauen("142"),

    /**
     * <b>Luxemburg / Luxembourg</b>
     *  * <p>
     *  *  Staatenname-kurz: Luxemburg
     *  * <p>
     *  *  Staatenname-voll: das Gro&#223;herzogtum Luxemburg
     *  * <p>
     *  *  Schluessel-Staat: 143
     *  * <p>
     *  *  ISO-3: LUX
     *  * <p>
     *  *  ISO-2: LU
     *  * <p>
     *  * 
     */
    @JsonProperty("143")
    @XmlEnumValue("143")
    Luxemburg("143"),

    /**
     * <b>Nordmazedonien / North Macedonia</b>
     *  * <p>
     *  *  Staatenname-kurz: Nordmazedonien
     *  * <p>
     *  *  Staatenname-voll: die Republik Nordmazedonien
     *  * <p>
     *  *  Schluessel-Staat: 144
     *  * <p>
     *  *  ISO-3: MKD
     *  * <p>
     *  *  ISO-2: MK
     *  * <p>
     *  * 
     */
    @JsonProperty("144")
    @XmlEnumValue("144")
    Nordmazedonien("144"),

    /**
     * <b>Malta</b>
     *  * <p>
     *  *  Staatenname-kurz: Malta
     *  * <p>
     *  *  Staatenname-voll: die Republik Malta
     *  * <p>
     *  *  Schluessel-Staat: 145
     *  * <p>
     *  *  ISO-3: MLT
     *  * <p>
     *  *  ISO-2: MT
     *  * <p>
     *  * 
     */
    @JsonProperty("145")
    @XmlEnumValue("145")
    Malta("145"),

    /**
     * <b>Republik Moldau / Moldova</b>
     *  * <p>
     *  *  Staatenname-kurz: Republik Moldau
     *  * <p>
     *  *  Staatenname-voll: die Republik Moldau
     *  * <p>
     *  *  Schluessel-Staat: 146
     *  * <p>
     *  *  ISO-3: MDA
     *  * <p>
     *  *  ISO-2: MD
     *  * <p>
     *  * 
     */
    @JsonProperty("146")
    @XmlEnumValue("146")
    Republik_Moldau("146"),

    /**
     * <b>Monaco</b>
     *  * <p>
     *  *  Staatenname-kurz: Monaco
     *  * <p>
     *  *  Staatenname-voll: das F&#252;rstentum Monaco
     *  * <p>
     *  *  Schluessel-Staat: 147
     *  * <p>
     *  *  ISO-3: MCO
     *  * <p>
     *  *  ISO-2: MC
     *  * <p>
     *  * 
     */
    @JsonProperty("147")
    @XmlEnumValue("147")
    Monaco("147"),

    /**
     * <b>K&#246;nigreich der Niederlande / Netherlands</b>
     *  * <p>
     *  *  Staatenname-kurz: K&#246;nigreich der Niederlande
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich der Niederlande
     *  * <p>
     *  *  Schluessel-Staat: 148
     *  * <p>
     *  *  ISO-3: NLD
     *  * <p>
     *  *  ISO-2: NL
     *  * <p>
     *  * 
     */
    @JsonProperty("148")
    @XmlEnumValue("148")
    Koenigreich_der_Niederlande("148"),

    /**
     * <b>Norwegen / Norway</b>
     *  * <p>
     *  *  Staatenname-kurz: Norwegen
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Norwegen
     *  * <p>
     *  *  Schluessel-Staat: 149
     *  * <p>
     *  *  ISO-3: NOR
     *  * <p>
     *  *  ISO-2: NO
     *  * <p>
     *  * 
     */
    @JsonProperty("149")
    @XmlEnumValue("149")
    Norwegen("149"),

    /**
     * <b>Kosovo</b>
     *  * <p>
     *  *  Staatenname-kurz: Kosovo
     *  * <p>
     *  *  Staatenname-voll: die Republik Kosovo
     *  * <p>
     *  *  Schluessel-Staat: 150
     *  * <p>
     *  *  ISO-3: XXK
     *  * <p>
     *  *  ISO-2: XK
     *  * <p>
     *  * 
     */
    @JsonProperty("150")
    @XmlEnumValue("150")
    Kosovo("150"),

    /**
     * <b>&#214;sterreich / Austria</b>
     *  * <p>
     *  *  Staatenname-kurz: &#214;sterreich
     *  * <p>
     *  *  Staatenname-voll: die Republik &#214;sterreich
     *  * <p>
     *  *  Schluessel-Staat: 151
     *  * <p>
     *  *  ISO-3: AUT
     *  * <p>
     *  *  ISO-2: AT
     *  * <p>
     *  * 
     */
    @JsonProperty("151")
    @XmlEnumValue("151")
    Oesterreich("151"),

    /**
     * <b>Polen / Poland</b>
     *  * <p>
     *  *  Staatenname-kurz: Polen
     *  * <p>
     *  *  Staatenname-voll: die Republik Polen
     *  * <p>
     *  *  Schluessel-Staat: 152
     *  * <p>
     *  *  ISO-3: POL
     *  * <p>
     *  *  ISO-2: PL
     *  * <p>
     *  * 
     */
    @JsonProperty("152")
    @XmlEnumValue("152")
    Polen("152"),

    /**
     * <b>Portugal</b>
     *  * <p>
     *  *  Staatenname-kurz: Portugal
     *  * <p>
     *  *  Staatenname-voll: die Portugiesische Republik
     *  * <p>
     *  *  Schluessel-Staat: 153
     *  * <p>
     *  *  ISO-3: PRT
     *  * <p>
     *  *  ISO-2: PT
     *  * <p>
     *  * 
     */
    @JsonProperty("153")
    @XmlEnumValue("153")
    Portugal("153"),

    /**
     * <b>Rum&#228;nien / Romania</b>
     *  * <p>
     *  *  Staatenname-kurz: Rum&#228;nien
     *  * <p>
     *  *  Staatenname-voll: Rum&#228;nien
     *  * <p>
     *  *  Schluessel-Staat: 154
     *  * <p>
     *  *  ISO-3: ROU
     *  * <p>
     *  *  ISO-2: RO
     *  * <p>
     *  * 
     */
    @JsonProperty("154")
    @XmlEnumValue("154")
    Rumaenien("154"),

    /**
     * <b>Slowakei / Slovakia</b>
     *  * <p>
     *  *  Staatenname-kurz: Slowakei
     *  * <p>
     *  *  Staatenname-voll: die Slowakische Republik
     *  * <p>
     *  *  Schluessel-Staat: 155
     *  * <p>
     *  *  ISO-3: SVK
     *  * <p>
     *  *  ISO-2: SK
     *  * <p>
     *  * 
     */
    @JsonProperty("155")
    @XmlEnumValue("155")
    Slowakei("155"),

    /**
     * <b>San Marino</b>
     *  * <p>
     *  *  Staatenname-kurz: San Marino
     *  * <p>
     *  *  Staatenname-voll: die Republik San Marino
     *  * <p>
     *  *  Schluessel-Staat: 156
     *  * <p>
     *  *  ISO-3: SMR
     *  * <p>
     *  *  ISO-2: SM
     *  * <p>
     *  * 
     */
    @JsonProperty("156")
    @XmlEnumValue("156")
    San_Marino("156"),

    /**
     * <b>Schweden / Sweden</b>
     *  * <p>
     *  *  Staatenname-kurz: Schweden
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Schweden
     *  * <p>
     *  *  Schluessel-Staat: 157
     *  * <p>
     *  *  ISO-3: SWE
     *  * <p>
     *  *  ISO-2: SE
     *  * <p>
     *  * 
     */
    @JsonProperty("157")
    @XmlEnumValue("157")
    Schweden("157"),

    /**
     * <b>Schweiz / Switzerland</b>
     *  * <p>
     *  *  Staatenname-kurz: Schweiz
     *  * <p>
     *  *  Staatenname-voll: die Schweizerische Eidgenossenschaft
     *  * <p>
     *  *  Schluessel-Staat: 158
     *  * <p>
     *  *  ISO-3: CHE
     *  * <p>
     *  *  ISO-2: CH
     *  * <p>
     *  * 
     */
    @JsonProperty("158")
    @XmlEnumValue("158")
    Schweiz("158"),

    /**
     * <b>Russische F&#246;deration / Russia</b>
     *  * <p>
     *  *  Staatenname-kurz: Russische F&#246;deration
     *  * <p>
     *  *  Staatenname-voll: die Russische F&#246;deration
     *  * <p>
     *  *  Schluessel-Staat: 160
     *  * <p>
     *  *  ISO-3: RUS
     *  * <p>
     *  *  ISO-2: RU
     *  * <p>
     *  * 
     */
    @JsonProperty("160")
    @XmlEnumValue("160")
    Russische_Foederation("160"),

    /**
     * <b>Spanien / Spain</b>
     *  * <p>
     *  *  Staatenname-kurz: Spanien
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Spanien
     *  * <p>
     *  *  Schluessel-Staat: 161
     *  * <p>
     *  *  ISO-3: ESP
     *  * <p>
     *  *  ISO-2: ES
     *  * <p>
     *  * 
     */
    @JsonProperty("161")
    @XmlEnumValue("161")
    Spanien("161"),

    /**
     * <b>T&#252;rkei / T&#252;rkiye</b>
     *  * <p>
     *  *  Staatenname-kurz: T&#252;rkei
     *  * <p>
     *  *  Staatenname-voll: die Republik T&#252;rkei
     *  * <p>
     *  *  Schluessel-Staat: 163
     *  * <p>
     *  *  ISO-3: TUR
     *  * <p>
     *  *  ISO-2: TR
     *  * <p>
     *  * 
     */
    @JsonProperty("163")
    @XmlEnumValue("163")
    Tuerkei("163"),

    /**
     * <b>Tschechien / Czechia</b>
     *  * <p>
     *  *  Staatenname-kurz: Tschechien
     *  * <p>
     *  *  Staatenname-voll: die Tschechische Republik
     *  * <p>
     *  *  Schluessel-Staat: 164
     *  * <p>
     *  *  ISO-3: CZE
     *  * <p>
     *  *  ISO-2: CZ
     *  * <p>
     *  * 
     */
    @JsonProperty("164")
    @XmlEnumValue("164")
    Tschechien("164"),

    /**
     * <b>Ungarn / Hungary</b>
     *  * <p>
     *  *  Staatenname-kurz: Ungarn
     *  * <p>
     *  *  Staatenname-voll: Ungarn
     *  * <p>
     *  *  Schluessel-Staat: 165
     *  * <p>
     *  *  ISO-3: HUN
     *  * <p>
     *  *  ISO-2: HU
     *  * <p>
     *  * 
     */
    @JsonProperty("165")
    @XmlEnumValue("165")
    Ungarn("165"),

    /**
     * <b>Ukraine</b>
     *  * <p>
     *  *  Staatenname-kurz: Ukraine
     *  * <p>
     *  *  Staatenname-voll: die Ukraine
     *  * <p>
     *  *  Schluessel-Staat: 166
     *  * <p>
     *  *  ISO-3: UKR
     *  * <p>
     *  *  ISO-2: UA
     *  * <p>
     *  * 
     */
    @JsonProperty("166")
    @XmlEnumValue("166")
    Ukraine("166"),

    /**
     * <b>Vatikanstadt / Vatican City</b>
     *  * <p>
     *  *  Staatenname-kurz: Vatikanstadt
     *  * <p>
     *  *  Staatenname-voll: der Staat Vatikanstadt
     *  * <p>
     *  *  Schluessel-Staat: 167
     *  * <p>
     *  *  ISO-3: VAT
     *  * <p>
     *  *  ISO-2: VA
     *  * <p>
     *  * 
     */
    @JsonProperty("167")
    @XmlEnumValue("167")
    Vatikanstadt("167"),

    /**
     * <b>Vereinigtes K&#246;nigreich / United Kingdom</b>
     *  * <p>
     *  *  Staatenname-kurz: Vereinigtes K&#246;nigreich
     *  * <p>
     *  *  Staatenname-voll: das Vereinigte K&#246;nigreich Gro&#223;britannien und Nordirland
     *  * <p>
     *  *  Schluessel-Staat: 168
     *  * <p>
     *  *  ISO-3: GBR
     *  * <p>
     *  *  ISO-2: GB
     *  * <p>
     *  * 
     */
    @JsonProperty("168")
    @XmlEnumValue("168")
    Vereinigtes_Koenigreich("168"),

    /**
     * <b>Belarus</b>
     *  * <p>
     *  *  Staatenname-kurz: Belarus
     *  * <p>
     *  *  Staatenname-voll: die Republik Belarus
     *  * <p>
     *  *  Schluessel-Staat: 169
     *  * <p>
     *  *  ISO-3: BLR
     *  * <p>
     *  *  ISO-2: BY
     *  * <p>
     *  * 
     */
    @JsonProperty("169")
    @XmlEnumValue("169")
    Belarus("169"),

    /**
     * <b>Serbien / Serbia</b>
     *  * <p>
     *  *  Staatenname-kurz: Serbien
     *  * <p>
     *  *  Staatenname-voll: die Republik Serbien
     *  * <p>
     *  *  Schluessel-Staat: 170
     *  * <p>
     *  *  ISO-3: SRB
     *  * <p>
     *  *  ISO-2: RS
     *  * <p>
     *  * 
     */
    @JsonProperty("170")
    @XmlEnumValue("170")
    Serbien("170"),

    /**
     * <b>Zypern / Cyprus</b>
     *  * <p>
     *  *  Staatenname-kurz: Zypern
     *  * <p>
     *  *  Staatenname-voll: die Republik Zypern
     *  * <p>
     *  *  Schluessel-Staat: 181
     *  * <p>
     *  *  ISO-3: CYP
     *  * <p>
     *  *  ISO-2: CY
     *  * <p>
     *  * 
     */
    @JsonProperty("181")
    @XmlEnumValue("181")
    Zypern("181"),

    /**
     * <b>Algerien / Algeria</b>
     *  * <p>
     *  *  Staatenname-kurz: Algerien
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Volksrepublik Algerien
     *  * <p>
     *  *  Schluessel-Staat: 221
     *  * <p>
     *  *  ISO-3: DZA
     *  * <p>
     *  *  ISO-2: DZ
     *  * <p>
     *  * 
     */
    @JsonProperty("221")
    @XmlEnumValue("221")
    Algerien("221"),

    /**
     * <b>Angola</b>
     *  * <p>
     *  *  Staatenname-kurz: Angola
     *  * <p>
     *  *  Staatenname-voll: die Republik Angola
     *  * <p>
     *  *  Schluessel-Staat: 223
     *  * <p>
     *  *  ISO-3: AGO
     *  * <p>
     *  *  ISO-2: AO
     *  * <p>
     *  * 
     */
    @JsonProperty("223")
    @XmlEnumValue("223")
    Angola("223"),

    /**
     * <b>Eritrea</b>
     *  * <p>
     *  *  Staatenname-kurz: Eritrea
     *  * <p>
     *  *  Staatenname-voll: der Staat Eritrea
     *  * <p>
     *  *  Schluessel-Staat: 224
     *  * <p>
     *  *  ISO-3: ERI
     *  * <p>
     *  *  ISO-2: ER
     *  * <p>
     *  * 
     */
    @JsonProperty("224")
    @XmlEnumValue("224")
    Eritrea("224"),

    /**
     * <b>&#196;thiopien / Ethiopia</b>
     *  * <p>
     *  *  Staatenname-kurz: &#196;thiopien
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Bundesrepublik &#196;thiopien
     *  * <p>
     *  *  Schluessel-Staat: 225
     *  * <p>
     *  *  ISO-3: ETH
     *  * <p>
     *  *  ISO-2: ET
     *  * <p>
     *  * 
     */
    @JsonProperty("225")
    @XmlEnumValue("225")
    Aethiopien("225"),

    /**
     * <b>Lesotho</b>
     *  * <p>
     *  *  Staatenname-kurz: Lesotho
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Lesotho
     *  * <p>
     *  *  Schluessel-Staat: 226
     *  * <p>
     *  *  ISO-3: LSO
     *  * <p>
     *  *  ISO-2: LS
     *  * <p>
     *  * 
     */
    @JsonProperty("226")
    @XmlEnumValue("226")
    Lesotho("226"),

    /**
     * <b>Botsuana / Botswana</b>
     *  * <p>
     *  *  Staatenname-kurz: Botsuana
     *  * <p>
     *  *  Staatenname-voll: die Republik Botsuana
     *  * <p>
     *  *  Schluessel-Staat: 227
     *  * <p>
     *  *  ISO-3: BWA
     *  * <p>
     *  *  ISO-2: BW
     *  * <p>
     *  * 
     */
    @JsonProperty("227")
    @XmlEnumValue("227")
    Botsuana("227"),

    /**
     * <b>Benin</b>
     *  * <p>
     *  *  Staatenname-kurz: Benin
     *  * <p>
     *  *  Staatenname-voll: die Republik Benin
     *  * <p>
     *  *  Schluessel-Staat: 229
     *  * <p>
     *  *  ISO-3: BEN
     *  * <p>
     *  *  ISO-2: BJ
     *  * <p>
     *  * 
     */
    @JsonProperty("229")
    @XmlEnumValue("229")
    Benin("229"),

    /**
     * <b>Dschibuti / Djibouti</b>
     *  * <p>
     *  *  Staatenname-kurz: Dschibuti
     *  * <p>
     *  *  Staatenname-voll: die Republik Dschibuti
     *  * <p>
     *  *  Schluessel-Staat: 230
     *  * <p>
     *  *  ISO-3: DJI
     *  * <p>
     *  *  ISO-2: DJ
     *  * <p>
     *  * 
     */
    @JsonProperty("230")
    @XmlEnumValue("230")
    Dschibuti("230"),

    /**
     * <b>C&#244;te d’Ivoire</b>
     *  * <p>
     *  *  Staatenname-kurz: C&#244;te d’Ivoire
     *  * <p>
     *  *  Staatenname-voll: die Republik C&#244;te d’Ivoire
     *  * <p>
     *  *  Schluessel-Staat: 231
     *  * <p>
     *  *  ISO-3: CIV
     *  * <p>
     *  *  ISO-2: CI
     *  * <p>
     *  * 
     */
    @JsonProperty("231")
    @XmlEnumValue("231")
    C_te_d_Ivoire("231"),

    /**
     * <b>Nigeria</b>
     *  * <p>
     *  *  Staatenname-kurz: Nigeria
     *  * <p>
     *  *  Staatenname-voll: die Bundesrepublik Nigeria
     *  * <p>
     *  *  Schluessel-Staat: 232
     *  * <p>
     *  *  ISO-3: NGA
     *  * <p>
     *  *  ISO-2: NG
     *  * <p>
     *  * 
     */
    @JsonProperty("232")
    @XmlEnumValue("232")
    Nigeria("232"),

    /**
     * <b>Simbabwe / Zimbabwe</b>
     *  * <p>
     *  *  Staatenname-kurz: Simbabwe
     *  * <p>
     *  *  Staatenname-voll: die Republik Simbabwe
     *  * <p>
     *  *  Schluessel-Staat: 233
     *  * <p>
     *  *  ISO-3: ZWE
     *  * <p>
     *  *  ISO-2: ZW
     *  * <p>
     *  * 
     */
    @JsonProperty("233")
    @XmlEnumValue("233")
    Simbabwe("233"),

    /**
     * <b>Gabun / Gabon</b>
     *  * <p>
     *  *  Staatenname-kurz: Gabun
     *  * <p>
     *  *  Staatenname-voll: die Gabunische Republik
     *  * <p>
     *  *  Schluessel-Staat: 236
     *  * <p>
     *  *  ISO-3: GAB
     *  * <p>
     *  *  ISO-2: GA
     *  * <p>
     *  * 
     */
    @JsonProperty("236")
    @XmlEnumValue("236")
    Gabun("236"),

    /**
     * <b>Gambia</b>
     *  * <p>
     *  *  Staatenname-kurz: Gambia
     *  * <p>
     *  *  Staatenname-voll: die Republik Gambia
     *  * <p>
     *  *  Schluessel-Staat: 237
     *  * <p>
     *  *  ISO-3: GMB
     *  * <p>
     *  *  ISO-2: GM
     *  * <p>
     *  * 
     */
    @JsonProperty("237")
    @XmlEnumValue("237")
    Gambia("237"),

    /**
     * <b>Ghana</b>
     *  * <p>
     *  *  Staatenname-kurz: Ghana
     *  * <p>
     *  *  Staatenname-voll: die Republik Ghana
     *  * <p>
     *  *  Schluessel-Staat: 238
     *  * <p>
     *  *  ISO-3: GHA
     *  * <p>
     *  *  ISO-2: GH
     *  * <p>
     *  * 
     */
    @JsonProperty("238")
    @XmlEnumValue("238")
    Ghana("238"),

    /**
     * <b>Mauretanien / Mauritania</b>
     *  * <p>
     *  *  Staatenname-kurz: Mauretanien
     *  * <p>
     *  *  Staatenname-voll: die Islamische Republik Mauretanien
     *  * <p>
     *  *  Schluessel-Staat: 239
     *  * <p>
     *  *  ISO-3: MRT
     *  * <p>
     *  *  ISO-2: MR
     *  * <p>
     *  * 
     */
    @JsonProperty("239")
    @XmlEnumValue("239")
    Mauretanien("239"),

    /**
     * <b>Cabo Verde</b>
     *  * <p>
     *  *  Staatenname-kurz: Cabo Verde
     *  * <p>
     *  *  Staatenname-voll: die Republik Cabo Verde
     *  * <p>
     *  *  Schluessel-Staat: 242
     *  * <p>
     *  *  ISO-3: CPV
     *  * <p>
     *  *  ISO-2: CV
     *  * <p>
     *  * 
     */
    @JsonProperty("242")
    @XmlEnumValue("242")
    Cabo_Verde("242"),

    /**
     * <b>Kenia / Kenya</b>
     *  * <p>
     *  *  Staatenname-kurz: Kenia
     *  * <p>
     *  *  Staatenname-voll: die Republik Kenia
     *  * <p>
     *  *  Schluessel-Staat: 243
     *  * <p>
     *  *  ISO-3: KEN
     *  * <p>
     *  *  ISO-2: KE
     *  * <p>
     *  * 
     */
    @JsonProperty("243")
    @XmlEnumValue("243")
    Kenia("243"),

    /**
     * <b>Komoren / Comoros</b>
     *  * <p>
     *  *  Staatenname-kurz: Komoren
     *  * <p>
     *  *  Staatenname-voll: die Union der Komoren
     *  * <p>
     *  *  Schluessel-Staat: 244
     *  * <p>
     *  *  ISO-3: COM
     *  * <p>
     *  *  ISO-2: KM
     *  * <p>
     *  * 
     */
    @JsonProperty("244")
    @XmlEnumValue("244")
    Komoren("244"),

    /**
     * <b>Kongo / Congo</b>
     *  * <p>
     *  *  Staatenname-kurz: Kongo
     *  * <p>
     *  *  Staatenname-voll: die Republik Kongo
     *  * <p>
     *  *  Schluessel-Staat: 245
     *  * <p>
     *  *  ISO-3: COG
     *  * <p>
     *  *  ISO-2: CG
     *  * <p>
     *  * 
     */
    @JsonProperty("245")
    @XmlEnumValue("245")
    Kongo("245"),

    /**
     * <b>Demokratische Republik Kongo / Congo (DRC)</b>
     *  * <p>
     *  *  Staatenname-kurz: Demokratische Republik Kongo
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Republik Kongo
     *  * <p>
     *  *  Schluessel-Staat: 246
     *  * <p>
     *  *  ISO-3: COD
     *  * <p>
     *  *  ISO-2: CD
     *  * <p>
     *  * 
     */
    @JsonProperty("246")
    @XmlEnumValue("246")
    Demokratische_Republik_Kongo("246"),

    /**
     * <b>Liberia</b>
     *  * <p>
     *  *  Staatenname-kurz: Liberia
     *  * <p>
     *  *  Staatenname-voll: die Republik Liberia
     *  * <p>
     *  *  Schluessel-Staat: 247
     *  * <p>
     *  *  ISO-3: LBR
     *  * <p>
     *  *  ISO-2: LR
     *  * <p>
     *  * 
     */
    @JsonProperty("247")
    @XmlEnumValue("247")
    Liberia("247"),

    /**
     * <b>Libyen / Libya</b>
     *  * <p>
     *  *  Staatenname-kurz: Libyen
     *  * <p>
     *  *  Staatenname-voll: der Staat Libyen
     *  * <p>
     *  *  Schluessel-Staat: 248
     *  * <p>
     *  *  ISO-3: LBY
     *  * <p>
     *  *  ISO-2: LY
     *  * <p>
     *  * 
     */
    @JsonProperty("248")
    @XmlEnumValue("248")
    Libyen("248"),

    /**
     * <b>Madagaskar / Madagascar</b>
     *  * <p>
     *  *  Staatenname-kurz: Madagaskar
     *  * <p>
     *  *  Staatenname-voll: die Republik Madagaskar
     *  * <p>
     *  *  Schluessel-Staat: 249
     *  * <p>
     *  *  ISO-3: MDG
     *  * <p>
     *  *  ISO-2: MG
     *  * <p>
     *  * 
     */
    @JsonProperty("249")
    @XmlEnumValue("249")
    Madagaskar("249"),

    /**
     * <b>Mali</b>
     *  * <p>
     *  *  Staatenname-kurz: Mali
     *  * <p>
     *  *  Staatenname-voll: die Republik Mali
     *  * <p>
     *  *  Schluessel-Staat: 251
     *  * <p>
     *  *  ISO-3: MLI
     *  * <p>
     *  *  ISO-2: ML
     *  * <p>
     *  * 
     */
    @JsonProperty("251")
    @XmlEnumValue("251")
    Mali("251"),

    /**
     * <b>Marokko / Morocco</b>
     *  * <p>
     *  *  Staatenname-kurz: Marokko
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Marokko
     *  * <p>
     *  *  Schluessel-Staat: 252
     *  * <p>
     *  *  ISO-3: MAR
     *  * <p>
     *  *  ISO-2: MA
     *  * <p>
     *  * 
     */
    @JsonProperty("252")
    @XmlEnumValue("252")
    Marokko("252"),

    /**
     * <b>Mauritius</b>
     *  * <p>
     *  *  Staatenname-kurz: Mauritius
     *  * <p>
     *  *  Staatenname-voll: die Republik Mauritius
     *  * <p>
     *  *  Schluessel-Staat: 253
     *  * <p>
     *  *  ISO-3: MUS
     *  * <p>
     *  *  ISO-2: MU
     *  * <p>
     *  * 
     */
    @JsonProperty("253")
    @XmlEnumValue("253")
    Mauritius("253"),

    /**
     * <b>Mosambik / Mozambique</b>
     *  * <p>
     *  *  Staatenname-kurz: Mosambik
     *  * <p>
     *  *  Staatenname-voll: die Republik Mosambik
     *  * <p>
     *  *  Schluessel-Staat: 254
     *  * <p>
     *  *  ISO-3: MOZ
     *  * <p>
     *  *  ISO-2: MZ
     *  * <p>
     *  * 
     */
    @JsonProperty("254")
    @XmlEnumValue("254")
    Mosambik("254"),

    /**
     * <b>Niger</b>
     *  * <p>
     *  *  Staatenname-kurz: Niger
     *  * <p>
     *  *  Staatenname-voll: die Republik Niger
     *  * <p>
     *  *  Schluessel-Staat: 255
     *  * <p>
     *  *  ISO-3: NER
     *  * <p>
     *  *  ISO-2: NE
     *  * <p>
     *  * 
     */
    @JsonProperty("255")
    @XmlEnumValue("255")
    Niger("255"),

    /**
     * <b>Malawi</b>
     *  * <p>
     *  *  Staatenname-kurz: Malawi
     *  * <p>
     *  *  Staatenname-voll: die Republik Malawi
     *  * <p>
     *  *  Schluessel-Staat: 256
     *  * <p>
     *  *  ISO-3: MWI
     *  * <p>
     *  *  ISO-2: MW
     *  * <p>
     *  * 
     */
    @JsonProperty("256")
    @XmlEnumValue("256")
    Malawi("256"),

    /**
     * <b>Sambia / Zambia</b>
     *  * <p>
     *  *  Staatenname-kurz: Sambia
     *  * <p>
     *  *  Staatenname-voll: die Republik Sambia
     *  * <p>
     *  *  Schluessel-Staat: 257
     *  * <p>
     *  *  ISO-3: ZMB
     *  * <p>
     *  *  ISO-2: ZM
     *  * <p>
     *  * 
     */
    @JsonProperty("257")
    @XmlEnumValue("257")
    Sambia("257"),

    /**
     * <b>Burkina Faso</b>
     *  * <p>
     *  *  Staatenname-kurz: Burkina Faso
     *  * <p>
     *  *  Staatenname-voll: Burkina Faso
     *  * <p>
     *  *  Schluessel-Staat: 258
     *  * <p>
     *  *  ISO-3: BFA
     *  * <p>
     *  *  ISO-2: BF
     *  * <p>
     *  * 
     */
    @JsonProperty("258")
    @XmlEnumValue("258")
    Burkina_Faso("258"),

    /**
     * <b>Guinea-Bissau</b>
     *  * <p>
     *  *  Staatenname-kurz: Guinea-Bissau
     *  * <p>
     *  *  Staatenname-voll: die Republik Guinea-Bissau
     *  * <p>
     *  *  Schluessel-Staat: 259
     *  * <p>
     *  *  ISO-3: GNB
     *  * <p>
     *  *  ISO-2: GW
     *  * <p>
     *  * 
     */
    @JsonProperty("259")
    @XmlEnumValue("259")
    Guinea_Bissau("259"),

    /**
     * <b>Guinea</b>
     *  * <p>
     *  *  Staatenname-kurz: Guinea
     *  * <p>
     *  *  Staatenname-voll: die Republik Guinea
     *  * <p>
     *  *  Schluessel-Staat: 261
     *  * <p>
     *  *  ISO-3: GIN
     *  * <p>
     *  *  ISO-2: GN
     *  * <p>
     *  * 
     */
    @JsonProperty("261")
    @XmlEnumValue("261")
    Guinea("261"),

    /**
     * <b>Kamerun / Cameroon</b>
     *  * <p>
     *  *  Staatenname-kurz: Kamerun
     *  * <p>
     *  *  Staatenname-voll: die Republik Kamerun
     *  * <p>
     *  *  Schluessel-Staat: 262
     *  * <p>
     *  *  ISO-3: CMR
     *  * <p>
     *  *  ISO-2: CM
     *  * <p>
     *  * 
     */
    @JsonProperty("262")
    @XmlEnumValue("262")
    Kamerun("262"),

    /**
     * <b>S&#252;dafrika / South Africa</b>
     *  * <p>
     *  *  Staatenname-kurz: S&#252;dafrika
     *  * <p>
     *  *  Staatenname-voll: die Republik S&#252;dafrika
     *  * <p>
     *  *  Schluessel-Staat: 263
     *  * <p>
     *  *  ISO-3: ZAF
     *  * <p>
     *  *  ISO-2: ZA
     *  * <p>
     *  * 
     */
    @JsonProperty("263")
    @XmlEnumValue("263")
    Suedafrika("263"),

    /**
     * <b>Ruanda / Rwanda</b>
     *  * <p>
     *  *  Staatenname-kurz: Ruanda
     *  * <p>
     *  *  Staatenname-voll: die Republik Ruanda
     *  * <p>
     *  *  Schluessel-Staat: 265
     *  * <p>
     *  *  ISO-3: RWA
     *  * <p>
     *  *  ISO-2: RW
     *  * <p>
     *  * 
     */
    @JsonProperty("265")
    @XmlEnumValue("265")
    Ruanda("265"),

    /**
     * <b>Namibia</b>
     *  * <p>
     *  *  Staatenname-kurz: Namibia
     *  * <p>
     *  *  Staatenname-voll: die Republik Namibia
     *  * <p>
     *  *  Schluessel-Staat: 267
     *  * <p>
     *  *  ISO-3: NAM
     *  * <p>
     *  *  ISO-2: NA
     *  * <p>
     *  * 
     */
    @JsonProperty("267")
    @XmlEnumValue("267")
    Namibia("267"),

    /**
     * <b>S&#227;o Tom&#233; und Pr&#237;ncipe / S&#227;o Tom&#233; &amp; Pr&#237;ncipe</b>
     *  * <p>
     *  *  Staatenname-kurz: S&#227;o Tom&#233; und Pr&#237;ncipe
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Republik S&#227;o Tom&#233; und Pr&#237;ncipe
     *  * <p>
     *  *  Schluessel-Staat: 268
     *  * <p>
     *  *  ISO-3: STP
     *  * <p>
     *  *  ISO-2: ST
     *  * <p>
     *  * 
     */
    @JsonProperty("268")
    @XmlEnumValue("268")
    S_o_Tom_und_Pr_ncipe("268"),

    /**
     * <b>Senegal</b>
     *  * <p>
     *  *  Staatenname-kurz: Senegal
     *  * <p>
     *  *  Staatenname-voll: die Republik Senegal
     *  * <p>
     *  *  Schluessel-Staat: 269
     *  * <p>
     *  *  ISO-3: SEN
     *  * <p>
     *  *  ISO-2: SN
     *  * <p>
     *  * 
     */
    @JsonProperty("269")
    @XmlEnumValue("269")
    Senegal("269"),

    /**
     * <b>Seychellen / Seychelles</b>
     *  * <p>
     *  *  Staatenname-kurz: Seychellen
     *  * <p>
     *  *  Staatenname-voll: die Republik Seychellen
     *  * <p>
     *  *  Schluessel-Staat: 271
     *  * <p>
     *  *  ISO-3: SYC
     *  * <p>
     *  *  ISO-2: SC
     *  * <p>
     *  * 
     */
    @JsonProperty("271")
    @XmlEnumValue("271")
    Seychellen("271"),

    /**
     * <b>Sierra Leone</b>
     *  * <p>
     *  *  Staatenname-kurz: Sierra Leone
     *  * <p>
     *  *  Staatenname-voll: die Republik Sierra Leone
     *  * <p>
     *  *  Schluessel-Staat: 272
     *  * <p>
     *  *  ISO-3: SLE
     *  * <p>
     *  *  ISO-2: SL
     *  * <p>
     *  * 
     */
    @JsonProperty("272")
    @XmlEnumValue("272")
    Sierra_Leone("272"),

    /**
     * <b>Somalia</b>
     *  * <p>
     *  *  Staatenname-kurz: Somalia
     *  * <p>
     *  *  Staatenname-voll: die Bundesrepublik Somalia
     *  * <p>
     *  *  Schluessel-Staat: 273
     *  * <p>
     *  *  ISO-3: SOM
     *  * <p>
     *  *  ISO-2: SO
     *  * <p>
     *  * 
     */
    @JsonProperty("273")
    @XmlEnumValue("273")
    Somalia("273"),

    /**
     * <b>&#196;quatorialguinea / Equatorial Guinea</b>
     *  * <p>
     *  *  Staatenname-kurz: &#196;quatorialguinea
     *  * <p>
     *  *  Staatenname-voll: die Republik &#196;quatorialguinea
     *  * <p>
     *  *  Schluessel-Staat: 274
     *  * <p>
     *  *  ISO-3: GNQ
     *  * <p>
     *  *  ISO-2: GQ
     *  * <p>
     *  * 
     */
    @JsonProperty("274")
    @XmlEnumValue("274")
    Aequatorialguinea("274"),

    /**
     * <b>Sudan</b>
     *  * <p>
     *  *  Staatenname-kurz: Sudan
     *  * <p>
     *  *  Staatenname-voll: die Republik Sudan
     *  * <p>
     *  *  Schluessel-Staat: 277
     *  * <p>
     *  *  ISO-3: SDN
     *  * <p>
     *  *  ISO-2: SD
     *  * <p>
     *  * 
     */
    @JsonProperty("277")
    @XmlEnumValue("277")
    Sudan("277"),

    /**
     * <b>S&#252;dsudan / South Sudan</b>
     *  * <p>
     *  *  Staatenname-kurz: S&#252;dsudan
     *  * <p>
     *  *  Staatenname-voll: die Republik S&#252;dsudan
     *  * <p>
     *  *  Schluessel-Staat: 278
     *  * <p>
     *  *  ISO-3: SSD
     *  * <p>
     *  *  ISO-2: SS
     *  * <p>
     *  * 
     */
    @JsonProperty("278")
    @XmlEnumValue("278")
    Suedsudan("278"),

    /**
     * <b>Eswatini</b>
     *  * <p>
     *  *  Staatenname-kurz: Eswatini
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Eswatini
     *  * <p>
     *  *  Schluessel-Staat: 281
     *  * <p>
     *  *  ISO-3: SWZ
     *  * <p>
     *  *  ISO-2: SZ
     *  * <p>
     *  * 
     */
    @JsonProperty("281")
    @XmlEnumValue("281")
    Eswatini("281"),

    /**
     * <b>Vereinigte Republik Tansania / Tanzania</b>
     *  * <p>
     *  *  Staatenname-kurz: Vereinigte Republik Tansania
     *  * <p>
     *  *  Staatenname-voll: die Vereinigte Republik Tansania
     *  * <p>
     *  *  Schluessel-Staat: 282
     *  * <p>
     *  *  ISO-3: TZA
     *  * <p>
     *  *  ISO-2: TZ
     *  * <p>
     *  * 
     */
    @JsonProperty("282")
    @XmlEnumValue("282")
    Vereinigte_Republik_Tansania("282"),

    /**
     * <b>Togo</b>
     *  * <p>
     *  *  Staatenname-kurz: Togo
     *  * <p>
     *  *  Staatenname-voll: die Republik Togo
     *  * <p>
     *  *  Schluessel-Staat: 283
     *  * <p>
     *  *  ISO-3: TGO
     *  * <p>
     *  *  ISO-2: TG
     *  * <p>
     *  * 
     */
    @JsonProperty("283")
    @XmlEnumValue("283")
    Togo("283"),

    /**
     * <b>Tschad / Chad</b>
     *  * <p>
     *  *  Staatenname-kurz: Tschad
     *  * <p>
     *  *  Staatenname-voll: die Republik Tschad
     *  * <p>
     *  *  Schluessel-Staat: 284
     *  * <p>
     *  *  ISO-3: TCD
     *  * <p>
     *  *  ISO-2: TD
     *  * <p>
     *  * 
     */
    @JsonProperty("284")
    @XmlEnumValue("284")
    Tschad("284"),

    /**
     * <b>Tunesien / Tunisia</b>
     *  * <p>
     *  *  Staatenname-kurz: Tunesien
     *  * <p>
     *  *  Staatenname-voll: die Tunesische Republik
     *  * <p>
     *  *  Schluessel-Staat: 285
     *  * <p>
     *  *  ISO-3: TUN
     *  * <p>
     *  *  ISO-2: TN
     *  * <p>
     *  * 
     */
    @JsonProperty("285")
    @XmlEnumValue("285")
    Tunesien("285"),

    /**
     * <b>Uganda</b>
     *  * <p>
     *  *  Staatenname-kurz: Uganda
     *  * <p>
     *  *  Staatenname-voll: die Republik Uganda
     *  * <p>
     *  *  Schluessel-Staat: 286
     *  * <p>
     *  *  ISO-3: UGA
     *  * <p>
     *  *  ISO-2: UG
     *  * <p>
     *  * 
     */
    @JsonProperty("286")
    @XmlEnumValue("286")
    Uganda("286"),

    /**
     * <b>&#196;gypten / Egypt</b>
     *  * <p>
     *  *  Staatenname-kurz: &#196;gypten
     *  * <p>
     *  *  Staatenname-voll: die Arabische Republik &#196;gypten
     *  * <p>
     *  *  Schluessel-Staat: 287
     *  * <p>
     *  *  ISO-3: EGY
     *  * <p>
     *  *  ISO-2: EG
     *  * <p>
     *  * 
     */
    @JsonProperty("287")
    @XmlEnumValue("287")
    Aegypten("287"),

    /**
     * <b>Zentralafrikanische Republik / Central African Republic</b>
     *  * <p>
     *  *  Staatenname-kurz: Zentralafrikanische Republik
     *  * <p>
     *  *  Staatenname-voll: die Zentralafrikanische Republik
     *  * <p>
     *  *  Schluessel-Staat: 289
     *  * <p>
     *  *  ISO-3: CAF
     *  * <p>
     *  *  ISO-2: CF
     *  * <p>
     *  * 
     */
    @JsonProperty("289")
    @XmlEnumValue("289")
    Zentralafrikanische_Republik("289"),

    /**
     * <b>Burundi</b>
     *  * <p>
     *  *  Staatenname-kurz: Burundi
     *  * <p>
     *  *  Staatenname-voll: die Republik Burundi
     *  * <p>
     *  *  Schluessel-Staat: 291
     *  * <p>
     *  *  ISO-3: BDI
     *  * <p>
     *  *  ISO-2: BI
     *  * <p>
     *  * 
     */
    @JsonProperty("291")
    @XmlEnumValue("291")
    Burundi("291"),

    /**
     * <b>Antigua und Barbuda / Antigua &amp; Barbuda</b>
     *  * <p>
     *  *  Staatenname-kurz: Antigua und Barbuda
     *  * <p>
     *  *  Staatenname-voll: Antigua und Barbuda
     *  * <p>
     *  *  Schluessel-Staat: 320
     *  * <p>
     *  *  ISO-3: ATG
     *  * <p>
     *  *  ISO-2: AG
     *  * <p>
     *  * 
     */
    @JsonProperty("320")
    @XmlEnumValue("320")
    Antigua_und_Barbuda("320"),

    /**
     * <b>Barbados</b>
     *  * <p>
     *  *  Staatenname-kurz: Barbados
     *  * <p>
     *  *  Staatenname-voll: Barbados
     *  * <p>
     *  *  Schluessel-Staat: 322
     *  * <p>
     *  *  ISO-3: BRB
     *  * <p>
     *  *  ISO-2: BB
     *  * <p>
     *  * 
     */
    @JsonProperty("322")
    @XmlEnumValue("322")
    Barbados("322"),

    /**
     * <b>Argentinien / Argentina</b>
     *  * <p>
     *  *  Staatenname-kurz: Argentinien
     *  * <p>
     *  *  Staatenname-voll: die Argentinische Republik
     *  * <p>
     *  *  Schluessel-Staat: 323
     *  * <p>
     *  *  ISO-3: ARG
     *  * <p>
     *  *  ISO-2: AR
     *  * <p>
     *  * 
     */
    @JsonProperty("323")
    @XmlEnumValue("323")
    Argentinien("323"),

    /**
     * <b>Bahamas</b>
     *  * <p>
     *  *  Staatenname-kurz: Bahamas
     *  * <p>
     *  *  Staatenname-voll: das Commonwealth der Bahamas
     *  * <p>
     *  *  Schluessel-Staat: 324
     *  * <p>
     *  *  ISO-3: BHS
     *  * <p>
     *  *  ISO-2: BS
     *  * <p>
     *  * 
     */
    @JsonProperty("324")
    @XmlEnumValue("324")
    Bahamas("324"),

    /**
     * <b>Plurinationaler Staat Bolivien / Bolivia</b>
     *  * <p>
     *  *  Staatenname-kurz: Plurinationaler Staat Bolivien
     *  * <p>
     *  *  Staatenname-voll: der Plurinationale Staat Bolivien
     *  * <p>
     *  *  Schluessel-Staat: 326
     *  * <p>
     *  *  ISO-3: BOL
     *  * <p>
     *  *  ISO-2: BO
     *  * <p>
     *  * 
     */
    @JsonProperty("326")
    @XmlEnumValue("326")
    Plurinationaler_Staat_Bolivien("326"),

    /**
     * <b>Brasilien / Brazil</b>
     *  * <p>
     *  *  Staatenname-kurz: Brasilien
     *  * <p>
     *  *  Staatenname-voll: die F&#246;derative Republik Brasilien
     *  * <p>
     *  *  Schluessel-Staat: 327
     *  * <p>
     *  *  ISO-3: BRA
     *  * <p>
     *  *  ISO-2: BR
     *  * <p>
     *  * 
     */
    @JsonProperty("327")
    @XmlEnumValue("327")
    Brasilien("327"),

    /**
     * <b>Guyana</b>
     *  * <p>
     *  *  Staatenname-kurz: Guyana
     *  * <p>
     *  *  Staatenname-voll: die Kooperative Republik Guyana
     *  * <p>
     *  *  Schluessel-Staat: 328
     *  * <p>
     *  *  ISO-3: GUY
     *  * <p>
     *  *  ISO-2: GY
     *  * <p>
     *  * 
     */
    @JsonProperty("328")
    @XmlEnumValue("328")
    Guyana("328"),

    /**
     * <b>Belize</b>
     *  * <p>
     *  *  Staatenname-kurz: Belize
     *  * <p>
     *  *  Staatenname-voll: Belize
     *  * <p>
     *  *  Schluessel-Staat: 330
     *  * <p>
     *  *  ISO-3: BLZ
     *  * <p>
     *  *  ISO-2: BZ
     *  * <p>
     *  * 
     */
    @JsonProperty("330")
    @XmlEnumValue("330")
    Belize("330"),

    /**
     * <b>Chile</b>
     *  * <p>
     *  *  Staatenname-kurz: Chile
     *  * <p>
     *  *  Staatenname-voll: die Republik Chile
     *  * <p>
     *  *  Schluessel-Staat: 332
     *  * <p>
     *  *  ISO-3: CHL
     *  * <p>
     *  *  ISO-2: CL
     *  * <p>
     *  * 
     */
    @JsonProperty("332")
    @XmlEnumValue("332")
    Chile("332"),

    /**
     * <b>Dominica</b>
     *  * <p>
     *  *  Staatenname-kurz: Dominica
     *  * <p>
     *  *  Staatenname-voll: das Commonwealth Dominica
     *  * <p>
     *  *  Schluessel-Staat: 333
     *  * <p>
     *  *  ISO-3: DMA
     *  * <p>
     *  *  ISO-2: DM
     *  * <p>
     *  * 
     */
    @JsonProperty("333")
    @XmlEnumValue("333")
    Dominica("333"),

    /**
     * <b>Costa Rica</b>
     *  * <p>
     *  *  Staatenname-kurz: Costa Rica
     *  * <p>
     *  *  Staatenname-voll: die Republik Costa Rica
     *  * <p>
     *  *  Schluessel-Staat: 334
     *  * <p>
     *  *  ISO-3: CRI
     *  * <p>
     *  *  ISO-2: CR
     *  * <p>
     *  * 
     */
    @JsonProperty("334")
    @XmlEnumValue("334")
    Costa_Rica("334"),

    /**
     * <b>Dominikanische Republik / Dominican Republic</b>
     *  * <p>
     *  *  Staatenname-kurz: Dominikanische Republik
     *  * <p>
     *  *  Staatenname-voll: die Dominikanische Republik
     *  * <p>
     *  *  Schluessel-Staat: 335
     *  * <p>
     *  *  ISO-3: DOM
     *  * <p>
     *  *  ISO-2: DO
     *  * <p>
     *  * 
     */
    @JsonProperty("335")
    @XmlEnumValue("335")
    Dominikanische_Republik("335"),

    /**
     * <b>Ecuador</b>
     *  * <p>
     *  *  Staatenname-kurz: Ecuador
     *  * <p>
     *  *  Staatenname-voll: die Republik Ecuador
     *  * <p>
     *  *  Schluessel-Staat: 336
     *  * <p>
     *  *  ISO-3: ECU
     *  * <p>
     *  *  ISO-2: EC
     *  * <p>
     *  * 
     */
    @JsonProperty("336")
    @XmlEnumValue("336")
    Ecuador("336"),

    /**
     * <b>El Salvador</b>
     *  * <p>
     *  *  Staatenname-kurz: El Salvador
     *  * <p>
     *  *  Staatenname-voll: die Republik El Salvador
     *  * <p>
     *  *  Schluessel-Staat: 337
     *  * <p>
     *  *  ISO-3: SLV
     *  * <p>
     *  *  ISO-2: SV
     *  * <p>
     *  * 
     */
    @JsonProperty("337")
    @XmlEnumValue("337")
    El_Salvador("337"),

    /**
     * <b>Grenada</b>
     *  * <p>
     *  *  Staatenname-kurz: Grenada
     *  * <p>
     *  *  Staatenname-voll: Grenada
     *  * <p>
     *  *  Schluessel-Staat: 340
     *  * <p>
     *  *  ISO-3: GRD
     *  * <p>
     *  *  ISO-2: GD
     *  * <p>
     *  * 
     */
    @JsonProperty("340")
    @XmlEnumValue("340")
    Grenada("340"),

    /**
     * <b>Guatemala</b>
     *  * <p>
     *  *  Staatenname-kurz: Guatemala
     *  * <p>
     *  *  Staatenname-voll: die Republik Guatemala
     *  * <p>
     *  *  Schluessel-Staat: 345
     *  * <p>
     *  *  ISO-3: GTM
     *  * <p>
     *  *  ISO-2: GT
     *  * <p>
     *  * 
     */
    @JsonProperty("345")
    @XmlEnumValue("345")
    Guatemala("345"),

    /**
     * <b>Haiti</b>
     *  * <p>
     *  *  Staatenname-kurz: Haiti
     *  * <p>
     *  *  Staatenname-voll: die Republik Haiti
     *  * <p>
     *  *  Schluessel-Staat: 346
     *  * <p>
     *  *  ISO-3: HTI
     *  * <p>
     *  *  ISO-2: HT
     *  * <p>
     *  * 
     */
    @JsonProperty("346")
    @XmlEnumValue("346")
    Haiti("346"),

    /**
     * <b>Honduras</b>
     *  * <p>
     *  *  Staatenname-kurz: Honduras
     *  * <p>
     *  *  Staatenname-voll: die Republik Honduras
     *  * <p>
     *  *  Schluessel-Staat: 347
     *  * <p>
     *  *  ISO-3: HND
     *  * <p>
     *  *  ISO-2: HN
     *  * <p>
     *  * 
     */
    @JsonProperty("347")
    @XmlEnumValue("347")
    Honduras("347"),

    /**
     * <b>Kanada / Canada</b>
     *  * <p>
     *  *  Staatenname-kurz: Kanada
     *  * <p>
     *  *  Staatenname-voll: Kanada
     *  * <p>
     *  *  Schluessel-Staat: 348
     *  * <p>
     *  *  ISO-3: CAN
     *  * <p>
     *  *  ISO-2: CA
     *  * <p>
     *  * 
     */
    @JsonProperty("348")
    @XmlEnumValue("348")
    Kanada("348"),

    /**
     * <b>Kolumbien / Colombia</b>
     *  * <p>
     *  *  Staatenname-kurz: Kolumbien
     *  * <p>
     *  *  Staatenname-voll: die Republik Kolumbien
     *  * <p>
     *  *  Schluessel-Staat: 349
     *  * <p>
     *  *  ISO-3: COL
     *  * <p>
     *  *  ISO-2: CO
     *  * <p>
     *  * 
     */
    @JsonProperty("349")
    @XmlEnumValue("349")
    Kolumbien("349"),

    /**
     * <b>Kuba / Cuba</b>
     *  * <p>
     *  *  Staatenname-kurz: Kuba
     *  * <p>
     *  *  Staatenname-voll: die Republik Kuba
     *  * <p>
     *  *  Schluessel-Staat: 351
     *  * <p>
     *  *  ISO-3: CUB
     *  * <p>
     *  *  ISO-2: CU
     *  * <p>
     *  * 
     */
    @JsonProperty("351")
    @XmlEnumValue("351")
    Kuba("351"),

    /**
     * <b>Mexiko / Mexico</b>
     *  * <p>
     *  *  Staatenname-kurz: Mexiko
     *  * <p>
     *  *  Staatenname-voll: die Vereinigten Mexikanischen Staaten
     *  * <p>
     *  *  Schluessel-Staat: 353
     *  * <p>
     *  *  ISO-3: MEX
     *  * <p>
     *  *  ISO-2: MX
     *  * <p>
     *  * 
     */
    @JsonProperty("353")
    @XmlEnumValue("353")
    Mexiko("353"),

    /**
     * <b>Nicaragua</b>
     *  * <p>
     *  *  Staatenname-kurz: Nicaragua
     *  * <p>
     *  *  Staatenname-voll: die Republik Nicaragua
     *  * <p>
     *  *  Schluessel-Staat: 354
     *  * <p>
     *  *  ISO-3: NIC
     *  * <p>
     *  *  ISO-2: NI
     *  * <p>
     *  * 
     */
    @JsonProperty("354")
    @XmlEnumValue("354")
    Nicaragua("354"),

    /**
     * <b>Jamaika / Jamaica</b>
     *  * <p>
     *  *  Staatenname-kurz: Jamaika
     *  * <p>
     *  *  Staatenname-voll: Jamaika
     *  * <p>
     *  *  Schluessel-Staat: 355
     *  * <p>
     *  *  ISO-3: JAM
     *  * <p>
     *  *  ISO-2: JM
     *  * <p>
     *  * 
     */
    @JsonProperty("355")
    @XmlEnumValue("355")
    Jamaika("355"),

    /**
     * <b>Panama</b>
     *  * <p>
     *  *  Staatenname-kurz: Panama
     *  * <p>
     *  *  Staatenname-voll: die Republik Panama
     *  * <p>
     *  *  Schluessel-Staat: 357
     *  * <p>
     *  *  ISO-3: PAN
     *  * <p>
     *  *  ISO-2: PA
     *  * <p>
     *  * 
     */
    @JsonProperty("357")
    @XmlEnumValue("357")
    Panama("357"),

    /**
     * <b>Paraguay</b>
     *  * <p>
     *  *  Staatenname-kurz: Paraguay
     *  * <p>
     *  *  Staatenname-voll: die Republik Paraguay
     *  * <p>
     *  *  Schluessel-Staat: 359
     *  * <p>
     *  *  ISO-3: PRY
     *  * <p>
     *  *  ISO-2: PY
     *  * <p>
     *  * 
     */
    @JsonProperty("359")
    @XmlEnumValue("359")
    Paraguay("359"),

    /**
     * <b>Peru</b>
     *  * <p>
     *  *  Staatenname-kurz: Peru
     *  * <p>
     *  *  Staatenname-voll: die Republik Peru
     *  * <p>
     *  *  Schluessel-Staat: 361
     *  * <p>
     *  *  ISO-3: PER
     *  * <p>
     *  *  ISO-2: PE
     *  * <p>
     *  * 
     */
    @JsonProperty("361")
    @XmlEnumValue("361")
    Peru("361"),

    /**
     * <b>Suriname</b>
     *  * <p>
     *  *  Staatenname-kurz: Suriname
     *  * <p>
     *  *  Staatenname-voll: die Republik Suriname
     *  * <p>
     *  *  Schluessel-Staat: 364
     *  * <p>
     *  *  ISO-3: SUR
     *  * <p>
     *  *  ISO-2: SR
     *  * <p>
     *  * 
     */
    @JsonProperty("364")
    @XmlEnumValue("364")
    Suriname("364"),

    /**
     * <b>Uruguay</b>
     *  * <p>
     *  *  Staatenname-kurz: Uruguay
     *  * <p>
     *  *  Staatenname-voll: die Republik &#214;stlich des Uruguay
     *  * <p>
     *  *  Schluessel-Staat: 365
     *  * <p>
     *  *  ISO-3: URY
     *  * <p>
     *  *  ISO-2: UY
     *  * <p>
     *  * 
     */
    @JsonProperty("365")
    @XmlEnumValue("365")
    Uruguay("365"),

    /**
     * <b>St. Lucia</b>
     *  * <p>
     *  *  Staatenname-kurz: St. Lucia
     *  * <p>
     *  *  Staatenname-voll: St. Lucia
     *  * <p>
     *  *  Schluessel-Staat: 366
     *  * <p>
     *  *  ISO-3: LCA
     *  * <p>
     *  *  ISO-2: LC
     *  * <p>
     *  * 
     */
    @JsonProperty("366")
    @XmlEnumValue("366")
    St_Lucia("366"),

    /**
     * <b>Bolivarische Republik Venezuela / Venezuela</b>
     *  * <p>
     *  *  Staatenname-kurz: Bolivarische Republik Venezuela
     *  * <p>
     *  *  Staatenname-voll: die Bolivarische Republik Venezuela
     *  * <p>
     *  *  Schluessel-Staat: 367
     *  * <p>
     *  *  ISO-3: VEN
     *  * <p>
     *  *  ISO-2: VE
     *  * <p>
     *  * 
     */
    @JsonProperty("367")
    @XmlEnumValue("367")
    Bolivarische_Republik_Venezuela("367"),

    /**
     * <b>Vereinigte Staaten / United States</b>
     *  * <p>
     *  *  Staatenname-kurz: Vereinigte Staaten
     *  * <p>
     *  *  Staatenname-voll: die Vereinigten Staaten von Amerika
     *  * <p>
     *  *  Schluessel-Staat: 368
     *  * <p>
     *  *  ISO-3: USA
     *  * <p>
     *  *  ISO-2: US
     *  * <p>
     *  * 
     */
    @JsonProperty("368")
    @XmlEnumValue("368")
    Vereinigte_Staaten("368"),

    /**
     * <b>St. Vincent und die Grenadinen / St. Vincent &amp; Grenadines</b>
     *  * <p>
     *  *  Staatenname-kurz: St. Vincent und die Grenadinen
     *  * <p>
     *  *  Staatenname-voll: St. Vincent und die Grenadinen
     *  * <p>
     *  *  Schluessel-Staat: 369
     *  * <p>
     *  *  ISO-3: VCT
     *  * <p>
     *  *  ISO-2: VC
     *  * <p>
     *  * 
     */
    @JsonProperty("369")
    @XmlEnumValue("369")
    St_Vincent_und_die_Grenadinen("369"),

    /**
     * <b>St. Kitts und Nevis / St. Kitts &amp; Nevis</b>
     *  * <p>
     *  *  Staatenname-kurz: St. Kitts und Nevis
     *  * <p>
     *  *  Staatenname-voll: die F&#246;deration St. Kitts und Nevis
     *  * <p>
     *  *  Schluessel-Staat: 370
     *  * <p>
     *  *  ISO-3: KNA
     *  * <p>
     *  *  ISO-2: KN
     *  * <p>
     *  * 
     */
    @JsonProperty("370")
    @XmlEnumValue("370")
    St_Kitts_und_Nevis("370"),

    /**
     * <b>Trinidad und Tobago / Trinidad &amp; Tobago</b>
     *  * <p>
     *  *  Staatenname-kurz: Trinidad und Tobago
     *  * <p>
     *  *  Staatenname-voll: die Republik Trinidad und Tobago
     *  * <p>
     *  *  Schluessel-Staat: 371
     *  * <p>
     *  *  ISO-3: TTO
     *  * <p>
     *  *  ISO-2: TT
     *  * <p>
     *  * 
     */
    @JsonProperty("371")
    @XmlEnumValue("371")
    Trinidad_und_Tobago("371"),

    /**
     * <b>Jemen / Yemen</b>
     *  * <p>
     *  *  Staatenname-kurz: Jemen
     *  * <p>
     *  *  Staatenname-voll: die Republik Jemen
     *  * <p>
     *  *  Schluessel-Staat: 421
     *  * <p>
     *  *  ISO-3: YEM
     *  * <p>
     *  *  ISO-2: YE
     *  * <p>
     *  * 
     */
    @JsonProperty("421")
    @XmlEnumValue("421")
    Jemen("421"),

    /**
     * <b>Armenien / Armenia</b>
     *  * <p>
     *  *  Staatenname-kurz: Armenien
     *  * <p>
     *  *  Staatenname-voll: die Republik Armenien
     *  * <p>
     *  *  Schluessel-Staat: 422
     *  * <p>
     *  *  ISO-3: ARM
     *  * <p>
     *  *  ISO-2: AM
     *  * <p>
     *  * 
     */
    @JsonProperty("422")
    @XmlEnumValue("422")
    Armenien("422"),

    /**
     * <b>Afghanistan</b>
     *  * <p>
     *  *  Staatenname-kurz: Afghanistan
     *  * <p>
     *  *  Staatenname-voll: die Islamische Republik Afghanistan
     *  * <p>
     *  *  Schluessel-Staat: 423
     *  * <p>
     *  *  ISO-3: AFG
     *  * <p>
     *  *  ISO-2: AF
     *  * <p>
     *  * 
     */
    @JsonProperty("423")
    @XmlEnumValue("423")
    Afghanistan("423"),

    /**
     * <b>Bahrain</b>
     *  * <p>
     *  *  Staatenname-kurz: Bahrain
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Bahrain
     *  * <p>
     *  *  Schluessel-Staat: 424
     *  * <p>
     *  *  ISO-3: BHR
     *  * <p>
     *  *  ISO-2: BH
     *  * <p>
     *  * 
     */
    @JsonProperty("424")
    @XmlEnumValue("424")
    Bahrain("424"),

    /**
     * <b>Aserbaidschan / Azerbaijan</b>
     *  * <p>
     *  *  Staatenname-kurz: Aserbaidschan
     *  * <p>
     *  *  Staatenname-voll: die Republik Aserbaidschan
     *  * <p>
     *  *  Schluessel-Staat: 425
     *  * <p>
     *  *  ISO-3: AZE
     *  * <p>
     *  *  ISO-2: AZ
     *  * <p>
     *  * 
     */
    @JsonProperty("425")
    @XmlEnumValue("425")
    Aserbaidschan("425"),

    /**
     * <b>Bhutan</b>
     *  * <p>
     *  *  Staatenname-kurz: Bhutan
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Bhutan
     *  * <p>
     *  *  Schluessel-Staat: 426
     *  * <p>
     *  *  ISO-3: BTN
     *  * <p>
     *  *  ISO-2: BT
     *  * <p>
     *  * 
     */
    @JsonProperty("426")
    @XmlEnumValue("426")
    Bhutan("426"),

    /**
     * <b>Myanmar</b>
     *  * <p>
     *  *  Staatenname-kurz: Myanmar
     *  * <p>
     *  *  Staatenname-voll: die Republik der Union Myanmar
     *  * <p>
     *  *  Schluessel-Staat: 427
     *  * <p>
     *  *  ISO-3: MMR
     *  * <p>
     *  *  ISO-2: MM
     *  * <p>
     *  * 
     */
    @JsonProperty("427")
    @XmlEnumValue("427")
    Myanmar("427"),

    /**
     * <b>Brunei Darussalam / Brunei</b>
     *  * <p>
     *  *  Staatenname-kurz: Brunei Darussalam
     *  * <p>
     *  *  Staatenname-voll: Brunei Darussalam
     *  * <p>
     *  *  Schluessel-Staat: 429
     *  * <p>
     *  *  ISO-3: BRN
     *  * <p>
     *  *  ISO-2: BN
     *  * <p>
     *  * 
     */
    @JsonProperty("429")
    @XmlEnumValue("429")
    Brunei_Darussalam("429"),

    /**
     * <b>Georgien / Georgia</b>
     *  * <p>
     *  *  Staatenname-kurz: Georgien
     *  * <p>
     *  *  Staatenname-voll: Georgien
     *  * <p>
     *  *  Schluessel-Staat: 430
     *  * <p>
     *  *  ISO-3: GEO
     *  * <p>
     *  *  ISO-2: GE
     *  * <p>
     *  * 
     */
    @JsonProperty("430")
    @XmlEnumValue("430")
    Georgien("430"),

    /**
     * <b>Sri Lanka</b>
     *  * <p>
     *  *  Staatenname-kurz: Sri Lanka
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Sozialistische Republik Sri Lanka
     *  * <p>
     *  *  Schluessel-Staat: 431
     *  * <p>
     *  *  ISO-3: LKA
     *  * <p>
     *  *  ISO-2: LK
     *  * <p>
     *  * 
     */
    @JsonProperty("431")
    @XmlEnumValue("431")
    Sri_Lanka("431"),

    /**
     * <b>Vietnam</b>
     *  * <p>
     *  *  Staatenname-kurz: Vietnam
     *  * <p>
     *  *  Staatenname-voll: die Sozialistische Republik Vietnam
     *  * <p>
     *  *  Schluessel-Staat: 432
     *  * <p>
     *  *  ISO-3: VNM
     *  * <p>
     *  *  ISO-2: VN
     *  * <p>
     *  * 
     */
    @JsonProperty("432")
    @XmlEnumValue("432")
    Vietnam("432"),

    /**
     * <b>Demokratische Volksrepublik Korea / North Korea</b>
     *  * <p>
     *  *  Staatenname-kurz: Demokratische Volksrepublik Korea
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Volksrepublik Korea
     *  * <p>
     *  *  Schluessel-Staat: 434
     *  * <p>
     *  *  ISO-3: PRK
     *  * <p>
     *  *  ISO-2: KP
     *  * <p>
     *  * 
     */
    @JsonProperty("434")
    @XmlEnumValue("434")
    Demokratische_Volksrepublik_Korea("434"),

    /**
     * <b>Indien / India</b>
     *  * <p>
     *  *  Staatenname-kurz: Indien
     *  * <p>
     *  *  Staatenname-voll: die Republik Indien
     *  * <p>
     *  *  Schluessel-Staat: 436
     *  * <p>
     *  *  ISO-3: IND
     *  * <p>
     *  *  ISO-2: IN
     *  * <p>
     *  * 
     */
    @JsonProperty("436")
    @XmlEnumValue("436")
    Indien("436"),

    /**
     * <b>Indonesien / Indonesia</b>
     *  * <p>
     *  *  Staatenname-kurz: Indonesien
     *  * <p>
     *  *  Staatenname-voll: die Republik Indonesien
     *  * <p>
     *  *  Schluessel-Staat: 437
     *  * <p>
     *  *  ISO-3: IDN
     *  * <p>
     *  *  ISO-2: ID
     *  * <p>
     *  * 
     */
    @JsonProperty("437")
    @XmlEnumValue("437")
    Indonesien("437"),

    /**
     * <b>Irak / Iraq</b>
     *  * <p>
     *  *  Staatenname-kurz: Irak
     *  * <p>
     *  *  Staatenname-voll: die Republik Irak
     *  * <p>
     *  *  Schluessel-Staat: 438
     *  * <p>
     *  *  ISO-3: IRQ
     *  * <p>
     *  *  ISO-2: IQ
     *  * <p>
     *  * 
     */
    @JsonProperty("438")
    @XmlEnumValue("438")
    Irak("438"),

    /**
     * <b>Islamische Republik Iran / Iran</b>
     *  * <p>
     *  *  Staatenname-kurz: Islamische Republik Iran
     *  * <p>
     *  *  Staatenname-voll: die Islamische Republik Iran
     *  * <p>
     *  *  Schluessel-Staat: 439
     *  * <p>
     *  *  ISO-3: IRN
     *  * <p>
     *  *  ISO-2: IR
     *  * <p>
     *  * 
     */
    @JsonProperty("439")
    @XmlEnumValue("439")
    Islamische_Republik_Iran("439"),

    /**
     * <b>Israel</b>
     *  * <p>
     *  *  Staatenname-kurz: Israel
     *  * <p>
     *  *  Staatenname-voll: der Staat Israel
     *  * <p>
     *  *  Schluessel-Staat: 441
     *  * <p>
     *  *  ISO-3: ISR
     *  * <p>
     *  *  ISO-2: IL
     *  * <p>
     *  * 
     */
    @JsonProperty("441")
    @XmlEnumValue("441")
    Israel("441"),

    /**
     * <b>Japan</b>
     *  * <p>
     *  *  Staatenname-kurz: Japan
     *  * <p>
     *  *  Staatenname-voll: Japan
     *  * <p>
     *  *  Schluessel-Staat: 442
     *  * <p>
     *  *  ISO-3: JPN
     *  * <p>
     *  *  ISO-2: JP
     *  * <p>
     *  * 
     */
    @JsonProperty("442")
    @XmlEnumValue("442")
    Japan("442"),

    /**
     * <b>Kasachstan / Kazakhstan</b>
     *  * <p>
     *  *  Staatenname-kurz: Kasachstan
     *  * <p>
     *  *  Staatenname-voll: die Republik Kasachstan
     *  * <p>
     *  *  Schluessel-Staat: 444
     *  * <p>
     *  *  ISO-3: KAZ
     *  * <p>
     *  *  ISO-2: KZ
     *  * <p>
     *  * 
     */
    @JsonProperty("444")
    @XmlEnumValue("444")
    Kasachstan("444"),

    /**
     * <b>Jordanien / Jordan</b>
     *  * <p>
     *  *  Staatenname-kurz: Jordanien
     *  * <p>
     *  *  Staatenname-voll: das Haschemitische K&#246;nigreich Jordanien
     *  * <p>
     *  *  Schluessel-Staat: 445
     *  * <p>
     *  *  ISO-3: JOR
     *  * <p>
     *  *  ISO-2: JO
     *  * <p>
     *  * 
     */
    @JsonProperty("445")
    @XmlEnumValue("445")
    Jordanien("445"),

    /**
     * <b>Kambodscha / Cambodia</b>
     *  * <p>
     *  *  Staatenname-kurz: Kambodscha
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Kambodscha
     *  * <p>
     *  *  Schluessel-Staat: 446
     *  * <p>
     *  *  ISO-3: KHM
     *  * <p>
     *  *  ISO-2: KH
     *  * <p>
     *  * 
     */
    @JsonProperty("446")
    @XmlEnumValue("446")
    Kambodscha("446"),

    /**
     * <b>Katar / Qatar</b>
     *  * <p>
     *  *  Staatenname-kurz: Katar
     *  * <p>
     *  *  Staatenname-voll: der Staat Katar
     *  * <p>
     *  *  Schluessel-Staat: 447
     *  * <p>
     *  *  ISO-3: QAT
     *  * <p>
     *  *  ISO-2: QA
     *  * <p>
     *  * 
     */
    @JsonProperty("447")
    @XmlEnumValue("447")
    Katar("447"),

    /**
     * <b>Kuwait</b>
     *  * <p>
     *  *  Staatenname-kurz: Kuwait
     *  * <p>
     *  *  Staatenname-voll: der Staat Kuwait
     *  * <p>
     *  *  Schluessel-Staat: 448
     *  * <p>
     *  *  ISO-3: KWT
     *  * <p>
     *  *  ISO-2: KW
     *  * <p>
     *  * 
     */
    @JsonProperty("448")
    @XmlEnumValue("448")
    Kuwait("448"),

    /**
     * <b>Demokratische Volksrepublik Laos / Laos</b>
     *  * <p>
     *  *  Staatenname-kurz: Demokratische Volksrepublik Laos
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Volksrepublik Laos
     *  * <p>
     *  *  Schluessel-Staat: 449
     *  * <p>
     *  *  ISO-3: LAO
     *  * <p>
     *  *  ISO-2: LA
     *  * <p>
     *  * 
     */
    @JsonProperty("449")
    @XmlEnumValue("449")
    Demokratische_Volksrepublik_Laos("449"),

    /**
     * <b>Kirgisistan / Kyrgyzstan</b>
     *  * <p>
     *  *  Staatenname-kurz: Kirgisistan
     *  * <p>
     *  *  Staatenname-voll: die Kirgisische Republik
     *  * <p>
     *  *  Schluessel-Staat: 450
     *  * <p>
     *  *  ISO-3: KGZ
     *  * <p>
     *  *  ISO-2: KG
     *  * <p>
     *  * 
     */
    @JsonProperty("450")
    @XmlEnumValue("450")
    Kirgisistan("450"),

    /**
     * <b>Libanon / Lebanon</b>
     *  * <p>
     *  *  Staatenname-kurz: Libanon
     *  * <p>
     *  *  Staatenname-voll: die Libanesische Republik
     *  * <p>
     *  *  Schluessel-Staat: 451
     *  * <p>
     *  *  ISO-3: LBN
     *  * <p>
     *  *  ISO-2: LB
     *  * <p>
     *  * 
     */
    @JsonProperty("451")
    @XmlEnumValue("451")
    Libanon("451"),

    /**
     * <b>Malediven / Maldives</b>
     *  * <p>
     *  *  Staatenname-kurz: Malediven
     *  * <p>
     *  *  Staatenname-voll: die Republik Malediven
     *  * <p>
     *  *  Schluessel-Staat: 454
     *  * <p>
     *  *  ISO-3: MDV
     *  * <p>
     *  *  ISO-2: MV
     *  * <p>
     *  * 
     */
    @JsonProperty("454")
    @XmlEnumValue("454")
    Malediven("454"),

    /**
     * <b>Oman</b>
     *  * <p>
     *  *  Staatenname-kurz: Oman
     *  * <p>
     *  *  Staatenname-voll: das Sultanat Oman
     *  * <p>
     *  *  Schluessel-Staat: 456
     *  * <p>
     *  *  ISO-3: OMN
     *  * <p>
     *  *  ISO-2: OM
     *  * <p>
     *  * 
     */
    @JsonProperty("456")
    @XmlEnumValue("456")
    Oman("456"),

    /**
     * <b>Mongolei / Mongolia</b>
     *  * <p>
     *  *  Staatenname-kurz: Mongolei
     *  * <p>
     *  *  Staatenname-voll: die Mongolei
     *  * <p>
     *  *  Schluessel-Staat: 457
     *  * <p>
     *  *  ISO-3: MNG
     *  * <p>
     *  *  ISO-2: MN
     *  * <p>
     *  * 
     */
    @JsonProperty("457")
    @XmlEnumValue("457")
    Mongolei("457"),

    /**
     * <b>Nepal</b>
     *  * <p>
     *  *  Staatenname-kurz: Nepal
     *  * <p>
     *  *  Staatenname-voll: Nepal
     *  * <p>
     *  *  Schluessel-Staat: 458
     *  * <p>
     *  *  ISO-3: NPL
     *  * <p>
     *  *  ISO-2: NP
     *  * <p>
     *  * 
     */
    @JsonProperty("458")
    @XmlEnumValue("458")
    Nepal("458"),

    /**
     * <b>Bangladesch / Bangladesh</b>
     *  * <p>
     *  *  Staatenname-kurz: Bangladesch
     *  * <p>
     *  *  Staatenname-voll: die Volksrepublik Bangladesch
     *  * <p>
     *  *  Schluessel-Staat: 460
     *  * <p>
     *  *  ISO-3: BGD
     *  * <p>
     *  *  ISO-2: BD
     *  * <p>
     *  * 
     */
    @JsonProperty("460")
    @XmlEnumValue("460")
    Bangladesch("460"),

    /**
     * <b>Pakistan</b>
     *  * <p>
     *  *  Staatenname-kurz: Pakistan
     *  * <p>
     *  *  Staatenname-voll: die Islamische Republik Pakistan
     *  * <p>
     *  *  Schluessel-Staat: 461
     *  * <p>
     *  *  ISO-3: PAK
     *  * <p>
     *  *  ISO-2: PK
     *  * <p>
     *  * 
     */
    @JsonProperty("461")
    @XmlEnumValue("461")
    Pakistan("461"),

    /**
     * <b>Philippinen / Philippines</b>
     *  * <p>
     *  *  Staatenname-kurz: Philippinen
     *  * <p>
     *  *  Staatenname-voll: die Republik der Philippinen
     *  * <p>
     *  *  Schluessel-Staat: 462
     *  * <p>
     *  *  ISO-3: PHL
     *  * <p>
     *  *  ISO-2: PH
     *  * <p>
     *  * 
     */
    @JsonProperty("462")
    @XmlEnumValue("462")
    Philippinen("462"),

    /**
     * <b>Republik Korea / Korea</b>
     *  * <p>
     *  *  Staatenname-kurz: Republik Korea
     *  * <p>
     *  *  Staatenname-voll: die Republik Korea
     *  * <p>
     *  *  Schluessel-Staat: 467
     *  * <p>
     *  *  ISO-3: KOR
     *  * <p>
     *  *  ISO-2: KR
     *  * <p>
     *  * 
     */
    @JsonProperty("467")
    @XmlEnumValue("467")
    Republik_Korea("467"),

    /**
     * <b>Vereinigte Arabische Emirate / United Arab Emirates</b>
     *  * <p>
     *  *  Staatenname-kurz: Vereinigte Arabische Emirate
     *  * <p>
     *  *  Staatenname-voll: die Vereinigten Arabischen Emirate (Abu Dhabi, Adschman, Dubai, Fudschaira, Ras al Chaima, Schardscha, Umm al Kaiwain)
     *  * <p>
     *  *  Schluessel-Staat: 469
     *  * <p>
     *  *  ISO-3: ARE
     *  * <p>
     *  *  ISO-2: AE
     *  * <p>
     *  * 
     */
    @JsonProperty("469")
    @XmlEnumValue("469")
    Vereinigte_Arabische_Emirate("469"),

    /**
     * <b>Tadschikistan / Tajikistan</b>
     *  * <p>
     *  *  Staatenname-kurz: Tadschikistan
     *  * <p>
     *  *  Staatenname-voll: die Republik Tadschikistan
     *  * <p>
     *  *  Schluessel-Staat: 470
     *  * <p>
     *  *  ISO-3: TJK
     *  * <p>
     *  *  ISO-2: TJ
     *  * <p>
     *  * 
     */
    @JsonProperty("470")
    @XmlEnumValue("470")
    Tadschikistan("470"),

    /**
     * <b>Turkmenistan</b>
     *  * <p>
     *  *  Staatenname-kurz: Turkmenistan
     *  * <p>
     *  *  Staatenname-voll: Turkmenistan
     *  * <p>
     *  *  Schluessel-Staat: 471
     *  * <p>
     *  *  ISO-3: TKM
     *  * <p>
     *  *  ISO-2: TM
     *  * <p>
     *  * 
     */
    @JsonProperty("471")
    @XmlEnumValue("471")
    Turkmenistan("471"),

    /**
     * <b>Saudi-Arabien / Saudi Arabia</b>
     *  * <p>
     *  *  Staatenname-kurz: Saudi-Arabien
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Saudi-Arabien
     *  * <p>
     *  *  Schluessel-Staat: 472
     *  * <p>
     *  *  ISO-3: SAU
     *  * <p>
     *  *  ISO-2: SA
     *  * <p>
     *  * 
     */
    @JsonProperty("472")
    @XmlEnumValue("472")
    Saudi_Arabien("472"),

    /**
     * <b>Singapur / Singapore</b>
     *  * <p>
     *  *  Staatenname-kurz: Singapur
     *  * <p>
     *  *  Staatenname-voll: die Republik Singapur
     *  * <p>
     *  *  Schluessel-Staat: 474
     *  * <p>
     *  *  ISO-3: SGP
     *  * <p>
     *  *  ISO-2: SG
     *  * <p>
     *  * 
     */
    @JsonProperty("474")
    @XmlEnumValue("474")
    Singapur("474"),

    /**
     * <b>Arabische Republik Syrien / Syria</b>
     *  * <p>
     *  *  Staatenname-kurz: Arabische Republik Syrien
     *  * <p>
     *  *  Staatenname-voll: die Arabische Republik Syrien
     *  * <p>
     *  *  Schluessel-Staat: 475
     *  * <p>
     *  *  ISO-3: SYR
     *  * <p>
     *  *  ISO-2: SY
     *  * <p>
     *  * 
     */
    @JsonProperty("475")
    @XmlEnumValue("475")
    Arabische_Republik_Syrien("475"),

    /**
     * <b>Thailand</b>
     *  * <p>
     *  *  Staatenname-kurz: Thailand
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Thailand
     *  * <p>
     *  *  Schluessel-Staat: 476
     *  * <p>
     *  *  ISO-3: THA
     *  * <p>
     *  *  ISO-2: TH
     *  * <p>
     *  * 
     */
    @JsonProperty("476")
    @XmlEnumValue("476")
    Thailand("476"),

    /**
     * <b>Usbekistan / Uzbekistan</b>
     *  * <p>
     *  *  Staatenname-kurz: Usbekistan
     *  * <p>
     *  *  Staatenname-voll: die Republik Usbekistan
     *  * <p>
     *  *  Schluessel-Staat: 477
     *  * <p>
     *  *  ISO-3: UZB
     *  * <p>
     *  *  ISO-2: UZ
     *  * <p>
     *  * 
     */
    @JsonProperty("477")
    @XmlEnumValue("477")
    Usbekistan("477"),

    /**
     * <b>China</b>
     *  * <p>
     *  *  Staatenname-kurz: China
     *  * <p>
     *  *  Staatenname-voll: die Volksrepublik China
     *  * <p>
     *  *  Schluessel-Staat: 479
     *  * <p>
     *  *  ISO-3: CHN
     *  * <p>
     *  *  ISO-2: CN
     *  * <p>
     *  * 
     */
    @JsonProperty("479")
    @XmlEnumValue("479")
    China("479"),

    /**
     * <b>Malaysia</b>
     *  * <p>
     *  *  Staatenname-kurz: Malaysia
     *  * <p>
     *  *  Staatenname-voll: Malaysia
     *  * <p>
     *  *  Schluessel-Staat: 482
     *  * <p>
     *  *  ISO-3: MYS
     *  * <p>
     *  *  ISO-2: MY
     *  * <p>
     *  * 
     */
    @JsonProperty("482")
    @XmlEnumValue("482")
    Malaysia("482"),

    /**
     * <b>Timor-Leste</b>
     *  * <p>
     *  *  Staatenname-kurz: Timor-Leste
     *  * <p>
     *  *  Staatenname-voll: die Demokratische Republik Timor-Leste
     *  * <p>
     *  *  Schluessel-Staat: 483
     *  * <p>
     *  *  ISO-3: TLS
     *  * <p>
     *  *  ISO-2: TL
     *  * <p>
     *  * 
     */
    @JsonProperty("483")
    @XmlEnumValue("483")
    Timor_Leste("483"),

    /**
     * <b>Australien / Australia</b>
     *  * <p>
     *  *  Staatenname-kurz: Australien
     *  * <p>
     *  *  Staatenname-voll: Australien
     *  * <p>
     *  *  Schluessel-Staat: 523
     *  * <p>
     *  *  ISO-3: AUS
     *  * <p>
     *  *  ISO-2: AU
     *  * <p>
     *  * 
     */
    @JsonProperty("523")
    @XmlEnumValue("523")
    Australien("523"),

    /**
     * <b>Salomonen / Solomon Islands</b>
     *  * <p>
     *  *  Staatenname-kurz: Salomonen
     *  * <p>
     *  *  Staatenname-voll: die Salomonen
     *  * <p>
     *  *  Schluessel-Staat: 524
     *  * <p>
     *  *  ISO-3: SLB
     *  * <p>
     *  *  ISO-2: SB
     *  * <p>
     *  * 
     */
    @JsonProperty("524")
    @XmlEnumValue("524")
    Salomonen("524"),

    /**
     * <b>Fidschi / Fiji</b>
     *  * <p>
     *  *  Staatenname-kurz: Fidschi
     *  * <p>
     *  *  Staatenname-voll: die Republik Fidschi
     *  * <p>
     *  *  Schluessel-Staat: 526
     *  * <p>
     *  *  ISO-3: FJI
     *  * <p>
     *  *  ISO-2: FJ
     *  * <p>
     *  * 
     */
    @JsonProperty("526")
    @XmlEnumValue("526")
    Fidschi("526"),

    /**
     * <b>Cookinseln / Cook Islands</b>
     *  * <p>
     *  *  Staatenname-kurz: Cookinseln
     *  * <p>
     *  *  Staatenname-voll: die Cookinseln
     *  * <p>
     *  *  Schluessel-Staat: 527
     *  * <p>
     *  *  ISO-3: COK
     *  * <p>
     *  *  ISO-2: CK
     *  * <p>
     *  * 
     */
    @JsonProperty("527")
    @XmlEnumValue("527")
    Cookinseln("527"),

    /**
     * <b>Kiribati</b>
     *  * <p>
     *  *  Staatenname-kurz: Kiribati
     *  * <p>
     *  *  Staatenname-voll: die Republik Kiribati
     *  * <p>
     *  *  Schluessel-Staat: 530
     *  * <p>
     *  *  ISO-3: KIR
     *  * <p>
     *  *  ISO-2: KI
     *  * <p>
     *  * 
     */
    @JsonProperty("530")
    @XmlEnumValue("530")
    Kiribati("530"),

    /**
     * <b>Nauru</b>
     *  * <p>
     *  *  Staatenname-kurz: Nauru
     *  * <p>
     *  *  Staatenname-voll: die Republik Nauru
     *  * <p>
     *  *  Schluessel-Staat: 531
     *  * <p>
     *  *  ISO-3: NRU
     *  * <p>
     *  *  ISO-2: NR
     *  * <p>
     *  * 
     */
    @JsonProperty("531")
    @XmlEnumValue("531")
    Nauru("531"),

    /**
     * <b>Vanuatu</b>
     *  * <p>
     *  *  Staatenname-kurz: Vanuatu
     *  * <p>
     *  *  Staatenname-voll: die Republik Vanuatu
     *  * <p>
     *  *  Schluessel-Staat: 532
     *  * <p>
     *  *  ISO-3: VUT
     *  * <p>
     *  *  ISO-2: VU
     *  * <p>
     *  * 
     */
    @JsonProperty("532")
    @XmlEnumValue("532")
    Vanuatu("532"),

    /**
     * <b>Niue</b>
     *  * <p>
     *  *  Staatenname-kurz: Niue
     *  * <p>
     *  *  Staatenname-voll: Niue
     *  * <p>
     *  *  Schluessel-Staat: 533
     *  * <p>
     *  *  ISO-3: NIU
     *  * <p>
     *  *  ISO-2: NU
     *  * <p>
     *  * 
     */
    @JsonProperty("533")
    @XmlEnumValue("533")
    Niue("533"),

    /**
     * <b>Neuseeland / New Zealand</b>
     *  * <p>
     *  *  Staatenname-kurz: Neuseeland
     *  * <p>
     *  *  Staatenname-voll: Neuseeland
     *  * <p>
     *  *  Schluessel-Staat: 536
     *  * <p>
     *  *  ISO-3: NZL
     *  * <p>
     *  *  ISO-2: NZ
     *  * <p>
     *  * 
     */
    @JsonProperty("536")
    @XmlEnumValue("536")
    Neuseeland("536"),

    /**
     * <b>Palau</b>
     *  * <p>
     *  *  Staatenname-kurz: Palau
     *  * <p>
     *  *  Staatenname-voll: die Republik Palau
     *  * <p>
     *  *  Schluessel-Staat: 537
     *  * <p>
     *  *  ISO-3: PLW
     *  * <p>
     *  *  ISO-2: PW
     *  * <p>
     *  * 
     */
    @JsonProperty("537")
    @XmlEnumValue("537")
    Palau("537"),

    /**
     * <b>Papua-Neuguinea / Papua New Guinea</b>
     *  * <p>
     *  *  Staatenname-kurz: Papua-Neuguinea
     *  * <p>
     *  *  Staatenname-voll: der Unabh&#228;ngige Staat Papua-Neuguinea
     *  * <p>
     *  *  Schluessel-Staat: 538
     *  * <p>
     *  *  ISO-3: PNG
     *  * <p>
     *  *  ISO-2: PG
     *  * <p>
     *  * 
     */
    @JsonProperty("538")
    @XmlEnumValue("538")
    Papua_Neuguinea("538"),

    /**
     * <b>Tuvalu</b>
     *  * <p>
     *  *  Staatenname-kurz: Tuvalu
     *  * <p>
     *  *  Staatenname-voll: Tuvalu
     *  * <p>
     *  *  Schluessel-Staat: 540
     *  * <p>
     *  *  ISO-3: TUV
     *  * <p>
     *  *  ISO-2: TV
     *  * <p>
     *  * 
     */
    @JsonProperty("540")
    @XmlEnumValue("540")
    Tuvalu("540"),

    /**
     * <b>Tonga</b>
     *  * <p>
     *  *  Staatenname-kurz: Tonga
     *  * <p>
     *  *  Staatenname-voll: das K&#246;nigreich Tonga
     *  * <p>
     *  *  Schluessel-Staat: 541
     *  * <p>
     *  *  ISO-3: TON
     *  * <p>
     *  *  ISO-2: TO
     *  * <p>
     *  * 
     */
    @JsonProperty("541")
    @XmlEnumValue("541")
    Tonga("541"),

    /**
     * <b>Samoa</b>
     *  * <p>
     *  *  Staatenname-kurz: Samoa
     *  * <p>
     *  *  Staatenname-voll: der Unabh&#228;ngige Staat Samoa
     *  * <p>
     *  *  Schluessel-Staat: 543
     *  * <p>
     *  *  ISO-3: WSM
     *  * <p>
     *  *  ISO-2: WS
     *  * <p>
     *  * 
     */
    @JsonProperty("543")
    @XmlEnumValue("543")
    Samoa("543"),

    /**
     * <b>Marshallinseln / Marshall Islands</b>
     *  * <p>
     *  *  Staatenname-kurz: Marshallinseln
     *  * <p>
     *  *  Staatenname-voll: die Republik Marshallinseln
     *  * <p>
     *  *  Schluessel-Staat: 544
     *  * <p>
     *  *  ISO-3: MHL
     *  * <p>
     *  *  ISO-2: MH
     *  * <p>
     *  * 
     */
    @JsonProperty("544")
    @XmlEnumValue("544")
    Marshallinseln("544"),

    /**
     * <b>F&#246;derierte Staaten von Mikronesien / Micronesia</b>
     *  * <p>
     *  *  Staatenname-kurz: F&#246;derierte Staaten von Mikronesien
     *  * <p>
     *  *  Staatenname-voll: die F&#246;derierten Staaten von Mikronesien
     *  * <p>
     *  *  Schluessel-Staat: 545
     *  * <p>
     *  *  ISO-3: FSM
     *  * <p>
     *  *  ISO-2: FM
     *  * <p>
     *  * 
     */
    @JsonProperty("545")
    @XmlEnumValue("545")
    Foederierte_Staaten_von_Mikronesien("545");

    private final String value;
    StaatCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StaatCode fromValue(String value) {
        for (StaatCode e : StaatCode.values()) {
            if (e.name().equals("Deutschland")) {
                for (String alias : new String[]{ "DE", "DEU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Albanien")) {
                for (String alias : new String[]{ "AL", "ALB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bosnien_und_Herzegowina")) {
                for (String alias : new String[]{ "BA", "BIH" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Andorra")) {
                for (String alias : new String[]{ "AD", "AND" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Belgien")) {
                for (String alias : new String[]{ "BE", "BEL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bulgarien")) {
                for (String alias : new String[]{ "BG", "BGR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Daenemark")) {
                for (String alias : new String[]{ "DK", "DNK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Estland")) {
                for (String alias : new String[]{ "EE", "EST" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Finnland")) {
                for (String alias : new String[]{ "FI", "FIN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Frankreich")) {
                for (String alias : new String[]{ "FR", "FRA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kroatien")) {
                for (String alias : new String[]{ "HR", "HRV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Slowenien")) {
                for (String alias : new String[]{ "SI", "SVN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Griechenland")) {
                for (String alias : new String[]{ "GR", "GRC" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Irland")) {
                for (String alias : new String[]{ "IE", "IRL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Island")) {
                for (String alias : new String[]{ "IS", "ISL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Italien")) {
                for (String alias : new String[]{ "IT", "ITA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Lettland")) {
                for (String alias : new String[]{ "LV", "LVA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Montenegro")) {
                for (String alias : new String[]{ "ME", "MNE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Liechtenstein")) {
                for (String alias : new String[]{ "LI", "LIE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Litauen")) {
                for (String alias : new String[]{ "LT", "LTU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Luxemburg")) {
                for (String alias : new String[]{ "LU", "LUX" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Nordmazedonien")) {
                for (String alias : new String[]{ "MK", "MKD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Malta")) {
                for (String alias : new String[]{ "MT", "MLT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Republik_Moldau")) {
                for (String alias : new String[]{ "MD", "MDA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Monaco")) {
                for (String alias : new String[]{ "MC", "MCO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Koenigreich_der_Niederlande")) {
                for (String alias : new String[]{ "NL", "NLD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Norwegen")) {
                for (String alias : new String[]{ "NO", "NOR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kosovo")) {
                for (String alias : new String[]{ "XK", "XXK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Oesterreich")) {
                for (String alias : new String[]{ "AT", "AUT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Polen")) {
                for (String alias : new String[]{ "PL", "POL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Portugal")) {
                for (String alias : new String[]{ "PT", "PRT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Rumaenien")) {
                for (String alias : new String[]{ "RO", "ROU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Slowakei")) {
                for (String alias : new String[]{ "SK", "SVK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("San_Marino")) {
                for (String alias : new String[]{ "SM", "SMR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Schweden")) {
                for (String alias : new String[]{ "SE", "SWE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Schweiz")) {
                for (String alias : new String[]{ "CH", "CHE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Russische_Foederation")) {
                for (String alias : new String[]{ "RU", "RUS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Spanien")) {
                for (String alias : new String[]{ "ES", "ESP" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tuerkei")) {
                for (String alias : new String[]{ "TR", "TUR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tschechien")) {
                for (String alias : new String[]{ "CZ", "CZE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Ungarn")) {
                for (String alias : new String[]{ "HU", "HUN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Ukraine")) {
                for (String alias : new String[]{ "UA", "UKR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vatikanstadt")) {
                for (String alias : new String[]{ "VA", "VAT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vereinigtes_Koenigreich")) {
                for (String alias : new String[]{ "GB", "GBR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Belarus")) {
                for (String alias : new String[]{ "BY", "BLR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Serbien")) {
                for (String alias : new String[]{ "RS", "SRB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Zypern")) {
                for (String alias : new String[]{ "CY", "CYP" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Algerien")) {
                for (String alias : new String[]{ "DZ", "DZA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Angola")) {
                for (String alias : new String[]{ "AO", "AGO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Eritrea")) {
                for (String alias : new String[]{ "ER", "ERI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Aethiopien")) {
                for (String alias : new String[]{ "ET", "ETH" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Lesotho")) {
                for (String alias : new String[]{ "LS", "LSO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Botsuana")) {
                for (String alias : new String[]{ "BW", "BWA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Benin")) {
                for (String alias : new String[]{ "BJ", "BEN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Dschibuti")) {
                for (String alias : new String[]{ "DJ", "DJI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("C_te_d_Ivoire")) {
                for (String alias : new String[]{ "CI", "CIV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Nigeria")) {
                for (String alias : new String[]{ "NG", "NGA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Simbabwe")) {
                for (String alias : new String[]{ "ZW", "ZWE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Gabun")) {
                for (String alias : new String[]{ "GA", "GAB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Gambia")) {
                for (String alias : new String[]{ "GM", "GMB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Ghana")) {
                for (String alias : new String[]{ "GH", "GHA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mauretanien")) {
                for (String alias : new String[]{ "MR", "MRT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Cabo_Verde")) {
                for (String alias : new String[]{ "CV", "CPV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kenia")) {
                for (String alias : new String[]{ "KE", "KEN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Komoren")) {
                for (String alias : new String[]{ "KM", "COM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kongo")) {
                for (String alias : new String[]{ "CG", "COG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Demokratische_Republik_Kongo")) {
                for (String alias : new String[]{ "CD", "COD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Liberia")) {
                for (String alias : new String[]{ "LR", "LBR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Libyen")) {
                for (String alias : new String[]{ "LY", "LBY" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Madagaskar")) {
                for (String alias : new String[]{ "MG", "MDG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mali")) {
                for (String alias : new String[]{ "ML", "MLI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Marokko")) {
                for (String alias : new String[]{ "MA", "MAR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mauritius")) {
                for (String alias : new String[]{ "MU", "MUS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mosambik")) {
                for (String alias : new String[]{ "MZ", "MOZ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Niger")) {
                for (String alias : new String[]{ "NE", "NER" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Malawi")) {
                for (String alias : new String[]{ "MW", "MWI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Sambia")) {
                for (String alias : new String[]{ "ZM", "ZMB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Burkina_Faso")) {
                for (String alias : new String[]{ "BF", "BFA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Guinea_Bissau")) {
                for (String alias : new String[]{ "GW", "GNB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Guinea")) {
                for (String alias : new String[]{ "GN", "GIN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kamerun")) {
                for (String alias : new String[]{ "CM", "CMR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Suedafrika")) {
                for (String alias : new String[]{ "ZA", "ZAF" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Ruanda")) {
                for (String alias : new String[]{ "RW", "RWA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Namibia")) {
                for (String alias : new String[]{ "NA", "NAM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("S_o_Tom_und_Pr_ncipe")) {
                for (String alias : new String[]{ "ST", "STP" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Senegal")) {
                for (String alias : new String[]{ "SN", "SEN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Seychellen")) {
                for (String alias : new String[]{ "SC", "SYC" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Sierra_Leone")) {
                for (String alias : new String[]{ "SL", "SLE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Somalia")) {
                for (String alias : new String[]{ "SO", "SOM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Aequatorialguinea")) {
                for (String alias : new String[]{ "GQ", "GNQ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Sudan")) {
                for (String alias : new String[]{ "SD", "SDN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Suedsudan")) {
                for (String alias : new String[]{ "SS", "SSD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Eswatini")) {
                for (String alias : new String[]{ "SZ", "SWZ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vereinigte_Republik_Tansania")) {
                for (String alias : new String[]{ "TZ", "TZA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Togo")) {
                for (String alias : new String[]{ "TG", "TGO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tschad")) {
                for (String alias : new String[]{ "TD", "TCD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tunesien")) {
                for (String alias : new String[]{ "TN", "TUN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Uganda")) {
                for (String alias : new String[]{ "UG", "UGA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Aegypten")) {
                for (String alias : new String[]{ "EG", "EGY" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Zentralafrikanische_Republik")) {
                for (String alias : new String[]{ "CF", "CAF" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Burundi")) {
                for (String alias : new String[]{ "BI", "BDI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Antigua_und_Barbuda")) {
                for (String alias : new String[]{ "AG", "ATG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Barbados")) {
                for (String alias : new String[]{ "BB", "BRB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Argentinien")) {
                for (String alias : new String[]{ "AR", "ARG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bahamas")) {
                for (String alias : new String[]{ "BS", "BHS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Plurinationaler_Staat_Bolivien")) {
                for (String alias : new String[]{ "BO", "BOL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Brasilien")) {
                for (String alias : new String[]{ "BR", "BRA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Guyana")) {
                for (String alias : new String[]{ "GY", "GUY" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Belize")) {
                for (String alias : new String[]{ "BZ", "BLZ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Chile")) {
                for (String alias : new String[]{ "CL", "CHL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Dominica")) {
                for (String alias : new String[]{ "DM", "DMA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Costa_Rica")) {
                for (String alias : new String[]{ "CR", "CRI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Dominikanische_Republik")) {
                for (String alias : new String[]{ "DO", "DOM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Ecuador")) {
                for (String alias : new String[]{ "EC", "ECU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("El_Salvador")) {
                for (String alias : new String[]{ "SV", "SLV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Grenada")) {
                for (String alias : new String[]{ "GD", "GRD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Guatemala")) {
                for (String alias : new String[]{ "GT", "GTM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Haiti")) {
                for (String alias : new String[]{ "HT", "HTI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Honduras")) {
                for (String alias : new String[]{ "HN", "HND" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kanada")) {
                for (String alias : new String[]{ "CA", "CAN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kolumbien")) {
                for (String alias : new String[]{ "CO", "COL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kuba")) {
                for (String alias : new String[]{ "CU", "CUB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mexiko")) {
                for (String alias : new String[]{ "MX", "MEX" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Nicaragua")) {
                for (String alias : new String[]{ "NI", "NIC" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Jamaika")) {
                for (String alias : new String[]{ "JM", "JAM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Panama")) {
                for (String alias : new String[]{ "PA", "PAN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Paraguay")) {
                for (String alias : new String[]{ "PY", "PRY" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Peru")) {
                for (String alias : new String[]{ "PE", "PER" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Suriname")) {
                for (String alias : new String[]{ "SR", "SUR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Uruguay")) {
                for (String alias : new String[]{ "UY", "URY" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("St_Lucia")) {
                for (String alias : new String[]{ "LC", "LCA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bolivarische_Republik_Venezuela")) {
                for (String alias : new String[]{ "VE", "VEN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vereinigte_Staaten")) {
                for (String alias : new String[]{ "US", "USA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("St_Vincent_und_die_Grenadinen")) {
                for (String alias : new String[]{ "VC", "VCT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("St_Kitts_und_Nevis")) {
                for (String alias : new String[]{ "KN", "KNA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Trinidad_und_Tobago")) {
                for (String alias : new String[]{ "TT", "TTO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Jemen")) {
                for (String alias : new String[]{ "YE", "YEM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Armenien")) {
                for (String alias : new String[]{ "AM", "ARM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Afghanistan")) {
                for (String alias : new String[]{ "AF", "AFG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bahrain")) {
                for (String alias : new String[]{ "BH", "BHR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Aserbaidschan")) {
                for (String alias : new String[]{ "AZ", "AZE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bhutan")) {
                for (String alias : new String[]{ "BT", "BTN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Myanmar")) {
                for (String alias : new String[]{ "MM", "MMR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Brunei_Darussalam")) {
                for (String alias : new String[]{ "BN", "BRN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Georgien")) {
                for (String alias : new String[]{ "GE", "GEO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Sri_Lanka")) {
                for (String alias : new String[]{ "LK", "LKA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vietnam")) {
                for (String alias : new String[]{ "VN", "VNM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Demokratische_Volksrepublik_Korea")) {
                for (String alias : new String[]{ "KP", "PRK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Indien")) {
                for (String alias : new String[]{ "IN", "IND" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Indonesien")) {
                for (String alias : new String[]{ "ID", "IDN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Irak")) {
                for (String alias : new String[]{ "IQ", "IRQ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Islamische_Republik_Iran")) {
                for (String alias : new String[]{ "IR", "IRN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Israel")) {
                for (String alias : new String[]{ "IL", "ISR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Japan")) {
                for (String alias : new String[]{ "JP", "JPN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kasachstan")) {
                for (String alias : new String[]{ "KZ", "KAZ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Jordanien")) {
                for (String alias : new String[]{ "JO", "JOR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kambodscha")) {
                for (String alias : new String[]{ "KH", "KHM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Katar")) {
                for (String alias : new String[]{ "QA", "QAT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kuwait")) {
                for (String alias : new String[]{ "KW", "KWT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Demokratische_Volksrepublik_Laos")) {
                for (String alias : new String[]{ "LA", "LAO" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kirgisistan")) {
                for (String alias : new String[]{ "KG", "KGZ" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Libanon")) {
                for (String alias : new String[]{ "LB", "LBN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Malediven")) {
                for (String alias : new String[]{ "MV", "MDV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Oman")) {
                for (String alias : new String[]{ "OM", "OMN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Mongolei")) {
                for (String alias : new String[]{ "MN", "MNG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Nepal")) {
                for (String alias : new String[]{ "NP", "NPL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Bangladesch")) {
                for (String alias : new String[]{ "BD", "BGD" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Pakistan")) {
                for (String alias : new String[]{ "PK", "PAK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Philippinen")) {
                for (String alias : new String[]{ "PH", "PHL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Republik_Korea")) {
                for (String alias : new String[]{ "KR", "KOR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vereinigte_Arabische_Emirate")) {
                for (String alias : new String[]{ "AE", "ARE" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tadschikistan")) {
                for (String alias : new String[]{ "TJ", "TJK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Turkmenistan")) {
                for (String alias : new String[]{ "TM", "TKM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Saudi_Arabien")) {
                for (String alias : new String[]{ "SA", "SAU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Singapur")) {
                for (String alias : new String[]{ "SG", "SGP" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Arabische_Republik_Syrien")) {
                for (String alias : new String[]{ "SY", "SYR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Thailand")) {
                for (String alias : new String[]{ "TH", "THA" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Usbekistan")) {
                for (String alias : new String[]{ "UZ", "UZB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("China")) {
                for (String alias : new String[]{ "CN", "CHN" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Malaysia")) {
                for (String alias : new String[]{ "MY", "MYS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Timor_Leste")) {
                for (String alias : new String[]{ "TL", "TLS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Australien")) {
                for (String alias : new String[]{ "AU", "AUS" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Salomonen")) {
                for (String alias : new String[]{ "SB", "SLB" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Fidschi")) {
                for (String alias : new String[]{ "FJ", "FJI" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Cookinseln")) {
                for (String alias : new String[]{ "CK", "COK" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Kiribati")) {
                for (String alias : new String[]{ "KI", "KIR" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Nauru")) {
                for (String alias : new String[]{ "NR", "NRU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Vanuatu")) {
                for (String alias : new String[]{ "VU", "VUT" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Niue")) {
                for (String alias : new String[]{ "NU", "NIU" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Neuseeland")) {
                for (String alias : new String[]{ "NZ", "NZL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Palau")) {
                for (String alias : new String[]{ "PW", "PLW" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Papua_Neuguinea")) {
                for (String alias : new String[]{ "PG", "PNG" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tuvalu")) {
                for (String alias : new String[]{ "TV", "TUV" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Tonga")) {
                for (String alias : new String[]{ "TO", "TON" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Samoa")) {
                for (String alias : new String[]{ "WS", "WSM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Marshallinseln")) {
                for (String alias : new String[]{ "MH", "MHL" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.name().equals("Foederierte_Staaten_von_Mikronesien")) {
                for (String alias : new String[]{ "FM", "FSM" }) {
                    if (alias.equalsIgnoreCase(value)) return e;
                }
            }
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}