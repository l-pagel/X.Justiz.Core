package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Gericht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte">XRepository: Codeliste GDS.Gerichte</a>.
 *  * <p>
 *  *  <u><b>Court codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte">XRepository: Code list GDS.Courts</a>.
 */
@XmlType
@XmlEnum
public enum GerichtCode {

    /**
     * <b>ZZ Test-Bund</b>
     *  * <p>
     *  *  Code: 9A0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9A0000")
    @XmlEnumValue("9A0000")
    ZZ_Test_Bund("9A0000"),

    /**
     * <b>ZZ Test-Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: 9B0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9B0000")
    @XmlEnumValue("9B0000")
    ZZ_Test_Baden_Wuerttemberg("9B0000"),

    /**
     * <b>ZZ Test-Bayern</b>
     *  * <p>
     *  *  Code: 9D0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9D0000")
    @XmlEnumValue("9D0000")
    ZZ_Test_Bayern("9D0000"),

    /**
     * <b>ZZ Test-Berlin</b>
     *  * <p>
     *  *  Code: 9F0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9F0000")
    @XmlEnumValue("9F0000")
    ZZ_Test_Berlin("9F0000"),

    /**
     * <b>ZZ Test-Brandenburg</b>
     *  * <p>
     *  *  Code: 9G0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9G0000")
    @XmlEnumValue("9G0000")
    ZZ_Test_Brandenburg("9G0000"),

    /**
     * <b>ZZ Test-Bremen</b>
     *  * <p>
     *  *  Code: 9H0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9H0000")
    @XmlEnumValue("9H0000")
    ZZ_Test_Bremen("9H0000"),

    /**
     * <b>ZZ Test-Hamburg</b>
     *  * <p>
     *  *  Code: 9K0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9K0000")
    @XmlEnumValue("9K0000")
    ZZ_Test_Hamburg("9K0000"),

    /**
     * <b>ZZ Test-Hessen</b>
     *  * <p>
     *  *  Code: 9M0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9M0000")
    @XmlEnumValue("9M0000")
    ZZ_Test_Hessen("9M0000"),

    /**
     * <b>ZZ Test-Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: 9N0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9N0000")
    @XmlEnumValue("9N0000")
    ZZ_Test_Mecklenburg_Vorpommern("9N0000"),

    /**
     * <b>ZZ Test-Niedersachsen</b>
     *  * <p>
     *  *  Code: 9P0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9P0000")
    @XmlEnumValue("9P0000")
    ZZ_Test_Niedersachsen("9P0000"),

    /**
     * <b>ZZ Test-Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: 9R0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9R0000")
    @XmlEnumValue("9R0000")
    ZZ_Test_Nordrhein_Westfalen("9R0000"),

    /**
     * <b>ZZ Test-Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: 9T0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9T0000")
    @XmlEnumValue("9T0000")
    ZZ_Test_Rheinland_Pfalz("9T0000"),

    /**
     * <b>ZZ Test-Sachsen</b>
     *  * <p>
     *  *  Code: 9U0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9U0000")
    @XmlEnumValue("9U0000")
    ZZ_Test_Sachsen("9U0000"),

    /**
     * <b>ZZ Test-Saarland</b>
     *  * <p>
     *  *  Code: 9V0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9V0000")
    @XmlEnumValue("9V0000")
    ZZ_Test_Saarland("9V0000"),

    /**
     * <b>ZZ Test-Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: 9W0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9W0000")
    @XmlEnumValue("9W0000")
    ZZ_Test_Sachsen_Anhalt("9W0000"),

    /**
     * <b>ZZ Test-Schleswig-Holstein</b>
     *  * <p>
     *  *  Code: 9X0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9X0000")
    @XmlEnumValue("9X0000")
    ZZ_Test_Schleswig_Holstein("9X0000"),

    /**
     * <b>ZZ Test-Th&#252;ringen</b>
     *  * <p>
     *  *  Code: 9Y0000
     *  * <p>
     *  * 
     */
    @JsonProperty("9Y0000")
    @XmlEnumValue("9Y0000")
    ZZ_Test_Thueringen("9Y0000"),

    /**
     * <b>Bundesgerichtshof Karlsruhe</b>
     *  * <p>
     *  *  Code: A1000
     *  * <p>
     *  * 
     */
    @JsonProperty("A1000")
    @XmlEnumValue("A1000")
    Bundesgerichtshof_Karlsruhe("A1000"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof</b>
     *  * <p>
     *  *  Code: A1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("A1000S")
    @XmlEnumValue("A1000S")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof("A1000S"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof 5. Strafsenat</b>
     *  * <p>
     *  *  Code: A1001S
     *  * <p>
     *  * 
     */
    @JsonProperty("A1001S")
    @XmlEnumValue("A1001S")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_5_Strafsenat("A1001S"),

    /**
     * <b>Oberlandesgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B1000
     *  * <p>
     *  * 
     */
    @JsonProperty("B1000")
    @XmlEnumValue("B1000")
    Oberlandesgericht_Karlsruhe("B1000"),

    /**
     * <b>Staatsanwaltschaften beim Oberlandesgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1000S")
    @XmlEnumValue("B1000S")
    Staatsanwaltschaften_beim_Oberlandesgericht_Karlsruhe("B1000S"),

    /**
     * <b>Oberlandesgericht Karlsruhe Au&#223;enstelle Freiburg</b>
     *  * <p>
     *  *  Code: B1001
     *  * <p>
     *  * 
     */
    @JsonProperty("B1001")
    @XmlEnumValue("B1001")
    Oberlandesgericht_Karlsruhe_Aussenstelle_Freiburg("B1001"),

    /**
     * <b>Landgericht Baden-Baden</b>
     *  * <p>
     *  *  Code: B1100
     *  * <p>
     *  * 
     */
    @JsonProperty("B1100")
    @XmlEnumValue("B1100")
    Landgericht_Baden_Baden("B1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Baden-Baden</b>
     *  * <p>
     *  *  Code: B1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1100S")
    @XmlEnumValue("B1100S")
    Staatsanwaltschaft_beim_Landgericht_Baden_Baden("B1100S"),

    /**
     * <b>Amtsgericht Achern</b>
     *  * <p>
     *  *  Code: B1101
     *  * <p>
     *  * 
     */
    @JsonProperty("B1101")
    @XmlEnumValue("B1101")
    Amtsgericht_Achern("B1101"),

    /**
     * <b>Grundbuchamt Achern</b>
     *  * <p>
     *  *  Code: B1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("B1101G")
    @XmlEnumValue("B1101G")
    Grundbuchamt_Achern("B1101G"),

    /**
     * <b>Amtsgericht Baden-Baden</b>
     *  * <p>
     *  *  Code: B1102
     *  * <p>
     *  * 
     */
    @JsonProperty("B1102")
    @XmlEnumValue("B1102")
    Amtsgericht_Baden_Baden("B1102"),

    /**
     * <b>Amtsgericht B&#252;hl</b>
     *  * <p>
     *  *  Code: B1103
     *  * <p>
     *  * 
     */
    @JsonProperty("B1103")
    @XmlEnumValue("B1103")
    Amtsgericht_Buehl("B1103"),

    /**
     * <b>Amtsgericht Gernsbach</b>
     *  * <p>
     *  *  Code: B1104
     *  * <p>
     *  * 
     */
    @JsonProperty("B1104")
    @XmlEnumValue("B1104")
    Amtsgericht_Gernsbach("B1104"),

    /**
     * <b>Amtsgericht Rastatt</b>
     *  * <p>
     *  *  Code: B1105
     *  * <p>
     *  * 
     */
    @JsonProperty("B1105")
    @XmlEnumValue("B1105")
    Amtsgericht_Rastatt("B1105"),

    /**
     * <b>Landgericht Freiburg i. Br.</b>
     *  * <p>
     *  *  Code: B1200
     *  * <p>
     *  * 
     */
    @JsonProperty("B1200")
    @XmlEnumValue("B1200")
    Landgericht_Freiburg_i_Br("B1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Freiburg im Breisgau</b>
     *  * <p>
     *  *  Code: B1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1200S")
    @XmlEnumValue("B1200S")
    Staatsanwaltschaft_beim_Landgericht_Freiburg_im_Breisgau("B1200S"),

    /**
     * <b>Amtsgericht Breisach</b>
     *  * <p>
     *  *  Code: B1201
     *  * <p>
     *  * 
     */
    @JsonProperty("B1201")
    @XmlEnumValue("B1201")
    Amtsgericht_Breisach("B1201"),

    /**
     * <b>Amtsgericht Emmendingen</b>
     *  * <p>
     *  *  Code: B1202
     *  * <p>
     *  * 
     */
    @JsonProperty("B1202")
    @XmlEnumValue("B1202")
    Amtsgericht_Emmendingen("B1202"),

    /**
     * <b>Grundbuchamt Emmendingen</b>
     *  * <p>
     *  *  Code: B1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("B1202G")
    @XmlEnumValue("B1202G")
    Grundbuchamt_Emmendingen("B1202G"),

    /**
     * <b>Amtsgericht Ettenheim</b>
     *  * <p>
     *  *  Code: B1203
     *  * <p>
     *  * 
     */
    @JsonProperty("B1203")
    @XmlEnumValue("B1203")
    Amtsgericht_Ettenheim("B1203"),

    /**
     * <b>Amtsgericht Freiburg</b>
     *  * <p>
     *  *  Code: B1204
     *  * <p>
     *  * 
     */
    @JsonProperty("B1204")
    @XmlEnumValue("B1204")
    Amtsgericht_Freiburg("B1204"),

    /**
     * <b>Amtsgericht Kenzingen</b>
     *  * <p>
     *  *  Code: B1205
     *  * <p>
     *  * 
     */
    @JsonProperty("B1205")
    @XmlEnumValue("B1205")
    Amtsgericht_Kenzingen("B1205"),

    /**
     * <b>Amtsgericht L&#246;rrach</b>
     *  * <p>
     *  *  Code: B1206
     *  * <p>
     *  * 
     */
    @JsonProperty("B1206")
    @XmlEnumValue("B1206")
    Amtsgericht_Loerrach("B1206"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht L&#246;rrach, Zwst. der StA Freiburg im Breisgau</b>
     *  * <p>
     *  *  Code: B1206S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1206S")
    @XmlEnumValue("B1206S")
    Staatsanwaltschaft_beim_Landgericht_Loerrach_Zwst_der_StA_Freiburg_im_Breisgau("B1206S"),

    /**
     * <b>Amtsgericht M&#252;llheim</b>
     *  * <p>
     *  *  Code: B1207
     *  * <p>
     *  * 
     */
    @JsonProperty("B1207")
    @XmlEnumValue("B1207")
    Amtsgericht_Muellheim("B1207"),

    /**
     * <b>Amtsgericht Titisee-Neustadt</b>
     *  * <p>
     *  *  Code: B1208
     *  * <p>
     *  * 
     */
    @JsonProperty("B1208")
    @XmlEnumValue("B1208")
    Amtsgericht_Titisee_Neustadt("B1208"),

    /**
     * <b>Amtsgericht Staufen</b>
     *  * <p>
     *  *  Code: B1209
     *  * <p>
     *  * 
     */
    @JsonProperty("B1209")
    @XmlEnumValue("B1209")
    Amtsgericht_Staufen("B1209"),

    /**
     * <b>Amtsgericht Waldkirch</b>
     *  * <p>
     *  *  Code: B1210
     *  * <p>
     *  * 
     */
    @JsonProperty("B1210")
    @XmlEnumValue("B1210")
    Amtsgericht_Waldkirch("B1210"),

    /**
     * <b>Landgericht Heidelberg</b>
     *  * <p>
     *  *  Code: B1300
     *  * <p>
     *  * 
     */
    @JsonProperty("B1300")
    @XmlEnumValue("B1300")
    Landgericht_Heidelberg("B1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Heidelberg</b>
     *  * <p>
     *  *  Code: B1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1300S")
    @XmlEnumValue("B1300S")
    Staatsanwaltschaft_beim_Landgericht_Heidelberg("B1300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eppingen</b>
     *  * <p>
     *  *  Code: B1301
     *  * <p>
     *  * 
     */
    @JsonProperty("B1301")
    @XmlEnumValue("B1301")
    aufgeloest_Amtsgericht_Eppingen("B1301"),

    /**
     * <b>Amtsgericht Heidelberg</b>
     *  * <p>
     *  *  Code: B1302
     *  * <p>
     *  * 
     */
    @JsonProperty("B1302")
    @XmlEnumValue("B1302")
    Amtsgericht_Heidelberg("B1302"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sinsheim, Zwst. Neckarbischofsheim</b>
     *  * <p>
     *  *  Code: B1303
     *  * <p>
     *  * 
     */
    @JsonProperty("B1303")
    @XmlEnumValue("B1303")
    aufgeloest_Amtsgericht_Sinsheim_Zwst_Neckarbischofsheim("B1303"),

    /**
     * <b>Amtsgericht Sinsheim</b>
     *  * <p>
     *  *  Code: B1304
     *  * <p>
     *  * 
     */
    @JsonProperty("B1304")
    @XmlEnumValue("B1304")
    Amtsgericht_Sinsheim("B1304"),

    /**
     * <b>Amtsgericht Wiesloch</b>
     *  * <p>
     *  *  Code: B1305
     *  * <p>
     *  * 
     */
    @JsonProperty("B1305")
    @XmlEnumValue("B1305")
    Amtsgericht_Wiesloch("B1305"),

    /**
     * <b>Landgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B1400
     *  * <p>
     *  * 
     */
    @JsonProperty("B1400")
    @XmlEnumValue("B1400")
    Landgericht_Karlsruhe("B1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1400S")
    @XmlEnumValue("B1400S")
    Staatsanwaltschaft_beim_Landgericht_Karlsruhe("B1400S"),

    /**
     * <b>Amtsgericht Bretten</b>
     *  * <p>
     *  *  Code: B1401
     *  * <p>
     *  * 
     */
    @JsonProperty("B1401")
    @XmlEnumValue("B1401")
    Amtsgericht_Bretten("B1401"),

    /**
     * <b>Amtsgericht Bruchsal</b>
     *  * <p>
     *  *  Code: B1402
     *  * <p>
     *  * 
     */
    @JsonProperty("B1402")
    @XmlEnumValue("B1402")
    Amtsgericht_Bruchsal("B1402"),

    /**
     * <b>Amtsgericht Ettlingen</b>
     *  * <p>
     *  *  Code: B1403
     *  * <p>
     *  * 
     */
    @JsonProperty("B1403")
    @XmlEnumValue("B1403")
    Amtsgericht_Ettlingen("B1403"),

    /**
     * <b>Amtsgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B1404
     *  * <p>
     *  * 
     */
    @JsonProperty("B1404")
    @XmlEnumValue("B1404")
    Amtsgericht_Karlsruhe("B1404"),

    /**
     * <b>Amtsgericht Karlsruhe, Zentrales Vollstreckungsgericht Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B1404R
     *  * <p>
     *  * 
     */
    @JsonProperty("B1404R")
    @XmlEnumValue("B1404R")
    Amtsgericht_Karlsruhe_Zentrales_Vollstreckungsgericht_Baden_Wuerttemberg("B1404R"),

    /**
     * <b>Amtsgericht Karlsruhe-Durlach</b>
     *  * <p>
     *  *  Code: B1405
     *  * <p>
     *  * 
     */
    @JsonProperty("B1405")
    @XmlEnumValue("B1405")
    Amtsgericht_Karlsruhe_Durlach("B1405"),

    /**
     * <b>Amtsgericht Pforzheim</b>
     *  * <p>
     *  *  Code: B1406
     *  * <p>
     *  * 
     */
    @JsonProperty("B1406")
    @XmlEnumValue("B1406")
    Amtsgericht_Pforzheim("B1406"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Pforzheim, Zwst. der StA Karlsruhe</b>
     *  * <p>
     *  *  Code: B1406S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1406S")
    @XmlEnumValue("B1406S")
    Staatsanwaltschaft_beim_Landgericht_Pforzheim_Zwst_der_StA_Karlsruhe("B1406S"),

    /**
     * <b>Amtsgericht Philippsburg</b>
     *  * <p>
     *  *  Code: B1407
     *  * <p>
     *  * 
     */
    @JsonProperty("B1407")
    @XmlEnumValue("B1407")
    Amtsgericht_Philippsburg("B1407"),

    /**
     * <b>Amtsgericht Pforzheim Zweigstelle Neuenb&#252;rg</b>
     *  * <p>
     *  *  Code: B1408
     *  * <p>
     *  * 
     */
    @JsonProperty("B1408")
    @XmlEnumValue("B1408")
    Amtsgericht_Pforzheim_Zweigstelle_Neuenbuerg("B1408"),

    /**
     * <b>Landgericht Konstanz</b>
     *  * <p>
     *  *  Code: B1500
     *  * <p>
     *  * 
     */
    @JsonProperty("B1500")
    @XmlEnumValue("B1500")
    Landgericht_Konstanz("B1500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Konstanz</b>
     *  * <p>
     *  *  Code: B1500S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1500S")
    @XmlEnumValue("B1500S")
    Staatsanwaltschaft_beim_Landgericht_Konstanz("B1500S"),

    /**
     * <b>Amtsgericht Donaueschingen</b>
     *  * <p>
     *  *  Code: B1501
     *  * <p>
     *  * 
     */
    @JsonProperty("B1501")
    @XmlEnumValue("B1501")
    Amtsgericht_Donaueschingen("B1501"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Engen</b>
     *  * <p>
     *  *  Code: B1502
     *  * <p>
     *  * 
     */
    @JsonProperty("B1502")
    @XmlEnumValue("B1502")
    aufgeloest_Amtsgericht_Engen("B1502"),

    /**
     * <b>Amtsgericht Konstanz</b>
     *  * <p>
     *  *  Code: B1503
     *  * <p>
     *  * 
     */
    @JsonProperty("B1503")
    @XmlEnumValue("B1503")
    Amtsgericht_Konstanz("B1503"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Me&#223;kirch</b>
     *  * <p>
     *  *  Code: B1504
     *  * <p>
     *  * 
     */
    @JsonProperty("B1504")
    @XmlEnumValue("B1504")
    aufgeloest_Amtsgericht_Messkirch("B1504"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sigmaringen, Zwst. Pfullendorf</b>
     *  * <p>
     *  *  Code: B1505
     *  * <p>
     *  * 
     */
    @JsonProperty("B1505")
    @XmlEnumValue("B1505")
    aufgeloest_Amtsgericht_Sigmaringen_Zwst_Pfullendorf("B1505"),

    /**
     * <b>Amtsgericht Radolfzell</b>
     *  * <p>
     *  *  Code: B1506
     *  * <p>
     *  * 
     */
    @JsonProperty("B1506")
    @XmlEnumValue("B1506")
    Amtsgericht_Radolfzell("B1506"),

    /**
     * <b>Amtsgericht Singen</b>
     *  * <p>
     *  *  Code: B1507
     *  * <p>
     *  * 
     */
    @JsonProperty("B1507")
    @XmlEnumValue("B1507")
    Amtsgericht_Singen("B1507"),

    /**
     * <b>Amtsgericht Stockach</b>
     *  * <p>
     *  *  Code: B1508
     *  * <p>
     *  * 
     */
    @JsonProperty("B1508")
    @XmlEnumValue("B1508")
    Amtsgericht_Stockach("B1508"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Triberg im Schwarzwald</b>
     *  * <p>
     *  *  Code: B1509
     *  * <p>
     *  * 
     */
    @JsonProperty("B1509")
    @XmlEnumValue("B1509")
    aufgeloest_Amtsgericht_Triberg_im_Schwarzwald("B1509"),

    /**
     * <b>Amtsgericht &#220;berlingen</b>
     *  * <p>
     *  *  Code: B1510
     *  * <p>
     *  * 
     */
    @JsonProperty("B1510")
    @XmlEnumValue("B1510")
    Amtsgericht_Ueberlingen("B1510"),

    /**
     * <b>Amtsgericht Villingen-Schwenningen</b>
     *  * <p>
     *  *  Code: B1511
     *  * <p>
     *  * 
     */
    @JsonProperty("B1511")
    @XmlEnumValue("B1511")
    Amtsgericht_Villingen_Schwenningen("B1511"),

    /**
     * <b>Grundbuchamt Villingen-Schwenningen</b>
     *  * <p>
     *  *  Code: B1511G
     *  * <p>
     *  * 
     */
    @JsonProperty("B1511G")
    @XmlEnumValue("B1511G")
    Grundbuchamt_Villingen_Schwenningen("B1511G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Villingen-Schwenningen, Zwst. der StA Konstanz</b>
     *  * <p>
     *  *  Code: B1511S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1511S")
    @XmlEnumValue("B1511S")
    Staatsanwaltschaft_beim_Landgericht_Villingen_Schwenningen_Zwst_der_StA_Konstanz("B1511S"),

    /**
     * <b>Landgericht Konstanz Au&#223;enstelle Villingen-Schwenningen</b>
     *  * <p>
     *  *  Code: B1512
     *  * <p>
     *  * 
     */
    @JsonProperty("B1512")
    @XmlEnumValue("B1512")
    Landgericht_Konstanz_Aussenstelle_Villingen_Schwenningen("B1512"),

    /**
     * <b>Landgericht Mannheim</b>
     *  * <p>
     *  *  Code: B1600
     *  * <p>
     *  * 
     */
    @JsonProperty("B1600")
    @XmlEnumValue("B1600")
    Landgericht_Mannheim("B1600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Mannheim</b>
     *  * <p>
     *  *  Code: B1600S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1600S")
    @XmlEnumValue("B1600S")
    Staatsanwaltschaft_beim_Landgericht_Mannheim("B1600S"),

    /**
     * <b>Amtsgericht Mannheim</b>
     *  * <p>
     *  *  Code: B1601
     *  * <p>
     *  * 
     */
    @JsonProperty("B1601")
    @XmlEnumValue("B1601")
    Amtsgericht_Mannheim("B1601"),

    /**
     * <b>Grundbuchamt Mannheim</b>
     *  * <p>
     *  *  Code: B1601G
     *  * <p>
     *  * 
     */
    @JsonProperty("B1601G")
    @XmlEnumValue("B1601G")
    Grundbuchamt_Mannheim("B1601G"),

    /**
     * <b>Amtsgericht Schwetzingen</b>
     *  * <p>
     *  *  Code: B1602
     *  * <p>
     *  * 
     */
    @JsonProperty("B1602")
    @XmlEnumValue("B1602")
    Amtsgericht_Schwetzingen("B1602"),

    /**
     * <b>Amtsgericht Weinheim</b>
     *  * <p>
     *  *  Code: B1603
     *  * <p>
     *  * 
     */
    @JsonProperty("B1603")
    @XmlEnumValue("B1603")
    Amtsgericht_Weinheim("B1603"),

    /**
     * <b>Landgericht Mosbach</b>
     *  * <p>
     *  *  Code: B1700
     *  * <p>
     *  * 
     */
    @JsonProperty("B1700")
    @XmlEnumValue("B1700")
    Landgericht_Mosbach("B1700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Mosbach</b>
     *  * <p>
     *  *  Code: B1700S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1700S")
    @XmlEnumValue("B1700S")
    Staatsanwaltschaft_beim_Landgericht_Mosbach("B1700S"),

    /**
     * <b>Amtsgericht Adelsheim</b>
     *  * <p>
     *  *  Code: B1701
     *  * <p>
     *  * 
     */
    @JsonProperty("B1701")
    @XmlEnumValue("B1701")
    Amtsgericht_Adelsheim("B1701"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Boxberg</b>
     *  * <p>
     *  *  Code: B1702
     *  * <p>
     *  * 
     */
    @JsonProperty("B1702")
    @XmlEnumValue("B1702")
    aufgeloest_Amtsgericht_Boxberg("B1702"),

    /**
     * <b>Amtsgericht Buchen</b>
     *  * <p>
     *  *  Code: B1703
     *  * <p>
     *  * 
     */
    @JsonProperty("B1703")
    @XmlEnumValue("B1703")
    Amtsgericht_Buchen("B1703"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eberbach</b>
     *  * <p>
     *  *  Code: B1704
     *  * <p>
     *  * 
     */
    @JsonProperty("B1704")
    @XmlEnumValue("B1704")
    aufgeloest_Amtsgericht_Eberbach("B1704"),

    /**
     * <b>Amtsgericht Mosbach</b>
     *  * <p>
     *  *  Code: B1705
     *  * <p>
     *  * 
     */
    @JsonProperty("B1705")
    @XmlEnumValue("B1705")
    Amtsgericht_Mosbach("B1705"),

    /**
     * <b>Amtsgericht Tauberbischofsheim</b>
     *  * <p>
     *  *  Code: B1706
     *  * <p>
     *  * 
     */
    @JsonProperty("B1706")
    @XmlEnumValue("B1706")
    Amtsgericht_Tauberbischofsheim("B1706"),

    /**
     * <b>Grundbuchamt Tauberbischofsheim</b>
     *  * <p>
     *  *  Code: B1706G
     *  * <p>
     *  * 
     */
    @JsonProperty("B1706G")
    @XmlEnumValue("B1706G")
    Grundbuchamt_Tauberbischofsheim("B1706G"),

    /**
     * <b>Amtsgericht Wertheim</b>
     *  * <p>
     *  *  Code: B1707
     *  * <p>
     *  * 
     */
    @JsonProperty("B1707")
    @XmlEnumValue("B1707")
    Amtsgericht_Wertheim("B1707"),

    /**
     * <b>Landgericht Offenburg</b>
     *  * <p>
     *  *  Code: B1800
     *  * <p>
     *  * 
     */
    @JsonProperty("B1800")
    @XmlEnumValue("B1800")
    Landgericht_Offenburg("B1800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Offenburg</b>
     *  * <p>
     *  *  Code: B1800S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1800S")
    @XmlEnumValue("B1800S")
    Staatsanwaltschaft_beim_Landgericht_Offenburg("B1800S"),

    /**
     * <b>Amtsgericht Gengenbach</b>
     *  * <p>
     *  *  Code: B1801
     *  * <p>
     *  * 
     */
    @JsonProperty("B1801")
    @XmlEnumValue("B1801")
    Amtsgericht_Gengenbach("B1801"),

    /**
     * <b>Amtsgericht Kehl</b>
     *  * <p>
     *  *  Code: B1802
     *  * <p>
     *  * 
     */
    @JsonProperty("B1802")
    @XmlEnumValue("B1802")
    Amtsgericht_Kehl("B1802"),

    /**
     * <b>Amtsgericht Lahr</b>
     *  * <p>
     *  *  Code: B1803
     *  * <p>
     *  * 
     */
    @JsonProperty("B1803")
    @XmlEnumValue("B1803")
    Amtsgericht_Lahr("B1803"),

    /**
     * <b>Amtsgericht Oberkirch</b>
     *  * <p>
     *  *  Code: B1804
     *  * <p>
     *  * 
     */
    @JsonProperty("B1804")
    @XmlEnumValue("B1804")
    Amtsgericht_Oberkirch("B1804"),

    /**
     * <b>Amtsgericht Offenburg</b>
     *  * <p>
     *  *  Code: B1805
     *  * <p>
     *  * 
     */
    @JsonProperty("B1805")
    @XmlEnumValue("B1805")
    Amtsgericht_Offenburg("B1805"),

    /**
     * <b>Amtsgericht Wolfach</b>
     *  * <p>
     *  *  Code: B1806
     *  * <p>
     *  * 
     */
    @JsonProperty("B1806")
    @XmlEnumValue("B1806")
    Amtsgericht_Wolfach("B1806"),

    /**
     * <b>Landgericht Waldshut-Tiengen</b>
     *  * <p>
     *  *  Code: B1900
     *  * <p>
     *  * 
     */
    @JsonProperty("B1900")
    @XmlEnumValue("B1900")
    Landgericht_Waldshut_Tiengen("B1900"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Waldshut-Tiengen (fr&#252;her: Waldshut)</b>
     *  * <p>
     *  *  Code: B1900S
     *  * <p>
     *  * 
     */
    @JsonProperty("B1900S")
    @XmlEnumValue("B1900S")
    Staatsanwaltschaft_beim_Landgericht_Waldshut_Tiengen_frueher_Waldshut("B1900S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bonndorf im Schwarzwald</b>
     *  * <p>
     *  *  Code: B1901
     *  * <p>
     *  * 
     */
    @JsonProperty("B1901")
    @XmlEnumValue("B1901")
    aufgeloest_Amtsgericht_Bonndorf_im_Schwarzwald("B1901"),

    /**
     * <b>Amtsgericht Bad S&#228;ckingen</b>
     *  * <p>
     *  *  Code: B1902
     *  * <p>
     *  * 
     */
    @JsonProperty("B1902")
    @XmlEnumValue("B1902")
    Amtsgericht_Bad_Saeckingen("B1902"),

    /**
     * <b>Amtsgericht St. Blasien</b>
     *  * <p>
     *  *  Code: B1903
     *  * <p>
     *  * 
     */
    @JsonProperty("B1903")
    @XmlEnumValue("B1903")
    Amtsgericht_St_Blasien("B1903"),

    /**
     * <b>Amtsgericht Sch&#246;nau</b>
     *  * <p>
     *  *  Code: B1904
     *  * <p>
     *  * 
     */
    @JsonProperty("B1904")
    @XmlEnumValue("B1904")
    Amtsgericht_Schoenau("B1904"),

    /**
     * <b>Amtsgericht Schopfheim</b>
     *  * <p>
     *  *  Code: B1905
     *  * <p>
     *  * 
     */
    @JsonProperty("B1905")
    @XmlEnumValue("B1905")
    Amtsgericht_Schopfheim("B1905"),

    /**
     * <b>Amtsgericht Waldshut-Tiengen</b>
     *  * <p>
     *  *  Code: B1906
     *  * <p>
     *  * 
     */
    @JsonProperty("B1906")
    @XmlEnumValue("B1906")
    Amtsgericht_Waldshut_Tiengen("B1906"),

    /**
     * <b>Oberlandesgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B2000
     *  * <p>
     *  * 
     */
    @JsonProperty("B2000")
    @XmlEnumValue("B2000")
    Oberlandesgericht_Stuttgart("B2000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B2000S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2000S")
    @XmlEnumValue("B2000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Stuttgart("B2000S"),

    /**
     * <b>Landgericht Ellwangen</b>
     *  * <p>
     *  *  Code: B2100
     *  * <p>
     *  * 
     */
    @JsonProperty("B2100")
    @XmlEnumValue("B2100")
    Landgericht_Ellwangen("B2100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Ellwangen (Jagst)</b>
     *  * <p>
     *  *  Code: B2100S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2100S")
    @XmlEnumValue("B2100S")
    Staatsanwaltschaft_beim_Landgericht_Ellwangen_Jagst("B2100S"),

    /**
     * <b>Amtsgericht Aalen</b>
     *  * <p>
     *  *  Code: B2101
     *  * <p>
     *  * 
     */
    @JsonProperty("B2101")
    @XmlEnumValue("B2101")
    Amtsgericht_Aalen("B2101"),

    /**
     * <b>Amtsgericht Bad Mergentheim</b>
     *  * <p>
     *  *  Code: B2102
     *  * <p>
     *  * 
     */
    @JsonProperty("B2102")
    @XmlEnumValue("B2102")
    Amtsgericht_Bad_Mergentheim("B2102"),

    /**
     * <b>Amtsgericht Crailsheim</b>
     *  * <p>
     *  *  Code: B2103
     *  * <p>
     *  * 
     */
    @JsonProperty("B2103")
    @XmlEnumValue("B2103")
    Amtsgericht_Crailsheim("B2103"),

    /**
     * <b>Amtsgericht Ellwangen</b>
     *  * <p>
     *  *  Code: B2104
     *  * <p>
     *  * 
     */
    @JsonProperty("B2104")
    @XmlEnumValue("B2104")
    Amtsgericht_Ellwangen("B2104"),

    /**
     * <b>Amtsgericht Heidenheim</b>
     *  * <p>
     *  *  Code: B2105
     *  * <p>
     *  * 
     */
    @JsonProperty("B2105")
    @XmlEnumValue("B2105")
    Amtsgericht_Heidenheim("B2105"),

    /**
     * <b>Amtsgericht Langenburg</b>
     *  * <p>
     *  *  Code: B2106
     *  * <p>
     *  * 
     */
    @JsonProperty("B2106")
    @XmlEnumValue("B2106")
    Amtsgericht_Langenburg("B2106"),

    /**
     * <b>Amtsgericht Neresheim</b>
     *  * <p>
     *  *  Code: B2107
     *  * <p>
     *  * 
     */
    @JsonProperty("B2107")
    @XmlEnumValue("B2107")
    Amtsgericht_Neresheim("B2107"),

    /**
     * <b>Amtsgericht Schw&#228;bisch Gm&#252;nd</b>
     *  * <p>
     *  *  Code: B2108
     *  * <p>
     *  * 
     */
    @JsonProperty("B2108")
    @XmlEnumValue("B2108")
    Amtsgericht_Schwaebisch_Gmuend("B2108"),

    /**
     * <b>Grundbuchamt Schw&#228;bisch-Gm&#252;nd</b>
     *  * <p>
     *  *  Code: B2108G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2108G")
    @XmlEnumValue("B2108G")
    Grundbuchamt_Schwaebisch_Gmuend("B2108G"),

    /**
     * <b>Landgericht Hechingen</b>
     *  * <p>
     *  *  Code: B2200
     *  * <p>
     *  * 
     */
    @JsonProperty("B2200")
    @XmlEnumValue("B2200")
    Landgericht_Hechingen("B2200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hechingen</b>
     *  * <p>
     *  *  Code: B2200S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2200S")
    @XmlEnumValue("B2200S")
    Staatsanwaltschaft_beim_Landgericht_Hechingen("B2200S"),

    /**
     * <b>Amtsgericht Balingen</b>
     *  * <p>
     *  *  Code: B2201
     *  * <p>
     *  * 
     */
    @JsonProperty("B2201")
    @XmlEnumValue("B2201")
    Amtsgericht_Balingen("B2201"),

    /**
     * <b>Amtsgericht Albstadt</b>
     *  * <p>
     *  *  Code: B2202
     *  * <p>
     *  * 
     */
    @JsonProperty("B2202")
    @XmlEnumValue("B2202")
    Amtsgericht_Albstadt("B2202"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Haigerloch</b>
     *  * <p>
     *  *  Code: B2203
     *  * <p>
     *  * 
     */
    @JsonProperty("B2203")
    @XmlEnumValue("B2203")
    aufgeloest_Amtsgericht_Haigerloch("B2203"),

    /**
     * <b>Amtsgericht Hechingen</b>
     *  * <p>
     *  *  Code: B2204
     *  * <p>
     *  * 
     */
    @JsonProperty("B2204")
    @XmlEnumValue("B2204")
    Amtsgericht_Hechingen("B2204"),

    /**
     * <b>Amtsgericht Sigmaringen</b>
     *  * <p>
     *  *  Code: B2205
     *  * <p>
     *  * 
     */
    @JsonProperty("B2205")
    @XmlEnumValue("B2205")
    Amtsgericht_Sigmaringen("B2205"),

    /**
     * <b>Grundbuchamt Sigmaringen</b>
     *  * <p>
     *  *  Code: B2205G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2205G")
    @XmlEnumValue("B2205G")
    Grundbuchamt_Sigmaringen("B2205G"),

    /**
     * <b>Landgericht Heilbronn</b>
     *  * <p>
     *  *  Code: B2300
     *  * <p>
     *  * 
     */
    @JsonProperty("B2300")
    @XmlEnumValue("B2300")
    Landgericht_Heilbronn("B2300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Heilbronn</b>
     *  * <p>
     *  *  Code: B2300S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2300S")
    @XmlEnumValue("B2300S")
    Staatsanwaltschaft_beim_Landgericht_Heilbronn("B2300S"),

    /**
     * <b>Amtsgericht Besigheim</b>
     *  * <p>
     *  *  Code: B2301
     *  * <p>
     *  * 
     */
    @JsonProperty("B2301")
    @XmlEnumValue("B2301")
    Amtsgericht_Besigheim("B2301"),

    /**
     * <b>Amtsgericht Brackenheim</b>
     *  * <p>
     *  *  Code: B2302
     *  * <p>
     *  * 
     */
    @JsonProperty("B2302")
    @XmlEnumValue("B2302")
    Amtsgericht_Brackenheim("B2302"),

    /**
     * <b>Amtsgericht Heilbronn</b>
     *  * <p>
     *  *  Code: B2303
     *  * <p>
     *  * 
     */
    @JsonProperty("B2303")
    @XmlEnumValue("B2303")
    Amtsgericht_Heilbronn("B2303"),

    /**
     * <b>Grundbuchamt Heilbronn</b>
     *  * <p>
     *  *  Code: B2303G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2303G")
    @XmlEnumValue("B2303G")
    Grundbuchamt_Heilbronn("B2303G"),

    /**
     * <b>Amtsgericht K&#252;nzelsau</b>
     *  * <p>
     *  *  Code: B2304
     *  * <p>
     *  * 
     */
    @JsonProperty("B2304")
    @XmlEnumValue("B2304")
    Amtsgericht_Kuenzelsau("B2304"),

    /**
     * <b>Amtsgericht Marbach a. N.</b>
     *  * <p>
     *  *  Code: B2305
     *  * <p>
     *  * 
     */
    @JsonProperty("B2305")
    @XmlEnumValue("B2305")
    Amtsgericht_Marbach_a_N("B2305"),

    /**
     * <b>Amtsgericht Maulbronn</b>
     *  * <p>
     *  *  Code: B2306
     *  * <p>
     *  * 
     */
    @JsonProperty("B2306")
    @XmlEnumValue("B2306")
    Amtsgericht_Maulbronn("B2306"),

    /**
     * <b>Grundbuchamt Maulbronn</b>
     *  * <p>
     *  *  Code: B2306G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2306G")
    @XmlEnumValue("B2306G")
    Grundbuchamt_Maulbronn("B2306G"),

    /**
     * <b>Amtsgericht &#214;hringen</b>
     *  * <p>
     *  *  Code: B2307
     *  * <p>
     *  * 
     */
    @JsonProperty("B2307")
    @XmlEnumValue("B2307")
    Amtsgericht_Oehringen("B2307"),

    /**
     * <b>Amtsgericht Schw&#228;bisch Hall</b>
     *  * <p>
     *  *  Code: B2308
     *  * <p>
     *  * 
     */
    @JsonProperty("B2308")
    @XmlEnumValue("B2308")
    Amtsgericht_Schwaebisch_Hall("B2308"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Schw&#228;bisch Hall, Zwst. der StA Heilbronn</b>
     *  * <p>
     *  *  Code: B2308S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2308S")
    @XmlEnumValue("B2308S")
    Staatsanwaltschaft_beim_Landgericht_Schwaebisch_Hall_Zwst_der_StA_Heilbronn("B2308S"),

    /**
     * <b>Amtsgericht Vaihingen</b>
     *  * <p>
     *  *  Code: B2309
     *  * <p>
     *  * 
     */
    @JsonProperty("B2309")
    @XmlEnumValue("B2309")
    Amtsgericht_Vaihingen("B2309"),

    /**
     * <b>Landgericht Ravensburg</b>
     *  * <p>
     *  *  Code: B2400
     *  * <p>
     *  * 
     */
    @JsonProperty("B2400")
    @XmlEnumValue("B2400")
    Landgericht_Ravensburg("B2400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Ravensburg</b>
     *  * <p>
     *  *  Code: B2400S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2400S")
    @XmlEnumValue("B2400S")
    Staatsanwaltschaft_beim_Landgericht_Ravensburg("B2400S"),

    /**
     * <b>Amtsgericht Bad Waldsee</b>
     *  * <p>
     *  *  Code: B2401
     *  * <p>
     *  * 
     */
    @JsonProperty("B2401")
    @XmlEnumValue("B2401")
    Amtsgericht_Bad_Waldsee("B2401"),

    /**
     * <b>Amtsgericht Biberach</b>
     *  * <p>
     *  *  Code: B2402
     *  * <p>
     *  * 
     */
    @JsonProperty("B2402")
    @XmlEnumValue("B2402")
    Amtsgericht_Biberach("B2402"),

    /**
     * <b>Amtsgericht Leutkirch</b>
     *  * <p>
     *  *  Code: B2403
     *  * <p>
     *  * 
     */
    @JsonProperty("B2403")
    @XmlEnumValue("B2403")
    Amtsgericht_Leutkirch("B2403"),

    /**
     * <b>Amtsgericht Ravensburg</b>
     *  * <p>
     *  *  Code: B2404
     *  * <p>
     *  * 
     */
    @JsonProperty("B2404")
    @XmlEnumValue("B2404")
    Amtsgericht_Ravensburg("B2404"),

    /**
     * <b>Grundbuchamt Ravensburg</b>
     *  * <p>
     *  *  Code: B2404G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2404G")
    @XmlEnumValue("B2404G")
    Grundbuchamt_Ravensburg("B2404G"),

    /**
     * <b>Amtsgericht Riedlingen</b>
     *  * <p>
     *  *  Code: B2405
     *  * <p>
     *  * 
     */
    @JsonProperty("B2405")
    @XmlEnumValue("B2405")
    Amtsgericht_Riedlingen("B2405"),

    /**
     * <b>Amtsgericht Bad Saulgau</b>
     *  * <p>
     *  *  Code: B2406
     *  * <p>
     *  * 
     */
    @JsonProperty("B2406")
    @XmlEnumValue("B2406")
    Amtsgericht_Bad_Saulgau("B2406"),

    /**
     * <b>Amtsgericht Tettnang</b>
     *  * <p>
     *  *  Code: B2407
     *  * <p>
     *  * 
     */
    @JsonProperty("B2407")
    @XmlEnumValue("B2407")
    Amtsgericht_Tettnang("B2407"),

    /**
     * <b>Amtsgericht Wangen</b>
     *  * <p>
     *  *  Code: B2408
     *  * <p>
     *  * 
     */
    @JsonProperty("B2408")
    @XmlEnumValue("B2408")
    Amtsgericht_Wangen("B2408"),

    /**
     * <b>Landgericht Rottweil</b>
     *  * <p>
     *  *  Code: B2500
     *  * <p>
     *  * 
     */
    @JsonProperty("B2500")
    @XmlEnumValue("B2500")
    Landgericht_Rottweil("B2500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Rottweil</b>
     *  * <p>
     *  *  Code: B2500S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2500S")
    @XmlEnumValue("B2500S")
    Staatsanwaltschaft_beim_Landgericht_Rottweil("B2500S"),

    /**
     * <b>Amtsgericht Freudenstadt</b>
     *  * <p>
     *  *  Code: B2501
     *  * <p>
     *  * 
     */
    @JsonProperty("B2501")
    @XmlEnumValue("B2501")
    Amtsgericht_Freudenstadt("B2501"),

    /**
     * <b>Amtsgericht Horb</b>
     *  * <p>
     *  *  Code: B2502
     *  * <p>
     *  * 
     */
    @JsonProperty("B2502")
    @XmlEnumValue("B2502")
    Amtsgericht_Horb("B2502"),

    /**
     * <b>Amtsgericht Oberndorf</b>
     *  * <p>
     *  *  Code: B2503
     *  * <p>
     *  * 
     */
    @JsonProperty("B2503")
    @XmlEnumValue("B2503")
    Amtsgericht_Oberndorf("B2503"),

    /**
     * <b>Amtsgericht Rottweil</b>
     *  * <p>
     *  *  Code: B2504
     *  * <p>
     *  * 
     */
    @JsonProperty("B2504")
    @XmlEnumValue("B2504")
    Amtsgericht_Rottweil("B2504"),

    /**
     * <b>Amtsgericht Spaichingen</b>
     *  * <p>
     *  *  Code: B2505
     *  * <p>
     *  * 
     */
    @JsonProperty("B2505")
    @XmlEnumValue("B2505")
    Amtsgericht_Spaichingen("B2505"),

    /**
     * <b>Amtsgericht Tuttlingen</b>
     *  * <p>
     *  *  Code: B2506
     *  * <p>
     *  * 
     */
    @JsonProperty("B2506")
    @XmlEnumValue("B2506")
    Amtsgericht_Tuttlingen("B2506"),

    /**
     * <b>Landgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B2600
     *  * <p>
     *  * 
     */
    @JsonProperty("B2600")
    @XmlEnumValue("B2600")
    Landgericht_Stuttgart("B2600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B2600S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2600S")
    @XmlEnumValue("B2600S")
    Staatsanwaltschaft_beim_Landgericht_Stuttgart("B2600S"),

    /**
     * <b>Amtsgericht Backnang</b>
     *  * <p>
     *  *  Code: B2601
     *  * <p>
     *  * 
     */
    @JsonProperty("B2601")
    @XmlEnumValue("B2601")
    Amtsgericht_Backnang("B2601"),

    /**
     * <b>Amtsgericht B&#246;blingen</b>
     *  * <p>
     *  *  Code: B2602
     *  * <p>
     *  * 
     */
    @JsonProperty("B2602")
    @XmlEnumValue("B2602")
    Amtsgericht_Boeblingen("B2602"),

    /**
     * <b>Grundbuchamt B&#246;blingen</b>
     *  * <p>
     *  *  Code: B2602G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2602G")
    @XmlEnumValue("B2602G")
    Grundbuchamt_Boeblingen("B2602G"),

    /**
     * <b>Amtsgericht Esslingen</b>
     *  * <p>
     *  *  Code: B2603
     *  * <p>
     *  * 
     */
    @JsonProperty("B2603")
    @XmlEnumValue("B2603")
    Amtsgericht_Esslingen("B2603"),

    /**
     * <b>Amtsgericht Kirchheim</b>
     *  * <p>
     *  *  Code: B2604
     *  * <p>
     *  * 
     */
    @JsonProperty("B2604")
    @XmlEnumValue("B2604")
    Amtsgericht_Kirchheim("B2604"),

    /**
     * <b>Amtsgericht Leonberg</b>
     *  * <p>
     *  *  Code: B2605
     *  * <p>
     *  * 
     */
    @JsonProperty("B2605")
    @XmlEnumValue("B2605")
    Amtsgericht_Leonberg("B2605"),

    /**
     * <b>Amtsgericht Ludwigsburg</b>
     *  * <p>
     *  *  Code: B2606
     *  * <p>
     *  * 
     */
    @JsonProperty("B2606")
    @XmlEnumValue("B2606")
    Amtsgericht_Ludwigsburg("B2606"),

    /**
     * <b>Amtsgericht N&#252;rtingen</b>
     *  * <p>
     *  *  Code: B2607
     *  * <p>
     *  * 
     */
    @JsonProperty("B2607")
    @XmlEnumValue("B2607")
    Amtsgericht_Nuertingen("B2607"),

    /**
     * <b>Amtsgericht Schorndorf</b>
     *  * <p>
     *  *  Code: B2608
     *  * <p>
     *  * 
     */
    @JsonProperty("B2608")
    @XmlEnumValue("B2608")
    Amtsgericht_Schorndorf("B2608"),

    /**
     * <b>Amtsgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B2609
     *  * <p>
     *  * 
     */
    @JsonProperty("B2609")
    @XmlEnumValue("B2609")
    Amtsgericht_Stuttgart("B2609"),

    /**
     * <b>Amtsgericht Stuttgart, Zentrales Mahngericht f&#252;r Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B2609M
     *  * <p>
     *  * 
     */
    @JsonProperty("B2609M")
    @XmlEnumValue("B2609M")
    Amtsgericht_Stuttgart_Zentrales_Mahngericht_fuer_Baden_Wuerttemberg("B2609M"),

    /**
     * <b>Amtsgericht Stuttgart-Bad Cannstatt</b>
     *  * <p>
     *  *  Code: B2610
     *  * <p>
     *  * 
     */
    @JsonProperty("B2610")
    @XmlEnumValue("B2610")
    Amtsgericht_Stuttgart_Bad_Cannstatt("B2610"),

    /**
     * <b>Amtsgericht Waiblingen</b>
     *  * <p>
     *  *  Code: B2611
     *  * <p>
     *  * 
     */
    @JsonProperty("B2611")
    @XmlEnumValue("B2611")
    Amtsgericht_Waiblingen("B2611"),

    /**
     * <b>Grundbuchamt Waiblingen</b>
     *  * <p>
     *  *  Code: B2611G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2611G")
    @XmlEnumValue("B2611G")
    Grundbuchamt_Waiblingen("B2611G"),

    /**
     * <b>Landgericht T&#252;bingen</b>
     *  * <p>
     *  *  Code: B2700
     *  * <p>
     *  * 
     */
    @JsonProperty("B2700")
    @XmlEnumValue("B2700")
    Landgericht_Tuebingen("B2700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht T&#252;bingen</b>
     *  * <p>
     *  *  Code: B2700S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2700S")
    @XmlEnumValue("B2700S")
    Staatsanwaltschaft_beim_Landgericht_Tuebingen("B2700S"),

    /**
     * <b>Amtsgericht Calw</b>
     *  * <p>
     *  *  Code: B2701
     *  * <p>
     *  * 
     */
    @JsonProperty("B2701")
    @XmlEnumValue("B2701")
    Amtsgericht_Calw("B2701"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Calw, Au&#223;enstelle der StA T&#252;bingen</b>
     *  * <p>
     *  *  Code: B2701S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2701S")
    @XmlEnumValue("B2701S")
    Staatsanwaltschaft_beim_Landgericht_Calw_Aussenstelle_der_StA_Tuebingen("B2701S"),

    /**
     * <b>Amtsgericht M&#252;nsingen</b>
     *  * <p>
     *  *  Code: B2702
     *  * <p>
     *  * 
     */
    @JsonProperty("B2702")
    @XmlEnumValue("B2702")
    Amtsgericht_Muensingen("B2702"),

    /**
     * <b>Amtsgericht Nagold</b>
     *  * <p>
     *  *  Code: B2703
     *  * <p>
     *  * 
     */
    @JsonProperty("B2703")
    @XmlEnumValue("B2703")
    Amtsgericht_Nagold("B2703"),

    /**
     * <b>Amtsgericht Reutlingen</b>
     *  * <p>
     *  *  Code: B2705
     *  * <p>
     *  * 
     */
    @JsonProperty("B2705")
    @XmlEnumValue("B2705")
    Amtsgericht_Reutlingen("B2705"),

    /**
     * <b>Amtsgericht Rottenburg</b>
     *  * <p>
     *  *  Code: B2706
     *  * <p>
     *  * 
     */
    @JsonProperty("B2706")
    @XmlEnumValue("B2706")
    Amtsgericht_Rottenburg("B2706"),

    /**
     * <b>Amtsgericht T&#252;bingen</b>
     *  * <p>
     *  *  Code: B2707
     *  * <p>
     *  * 
     */
    @JsonProperty("B2707")
    @XmlEnumValue("B2707")
    Amtsgericht_Tuebingen("B2707"),

    /**
     * <b>Amtsgericht Bad Urach</b>
     *  * <p>
     *  *  Code: B2708
     *  * <p>
     *  * 
     */
    @JsonProperty("B2708")
    @XmlEnumValue("B2708")
    Amtsgericht_Bad_Urach("B2708"),

    /**
     * <b>Landgericht Ulm</b>
     *  * <p>
     *  *  Code: B2800
     *  * <p>
     *  * 
     */
    @JsonProperty("B2800")
    @XmlEnumValue("B2800")
    Landgericht_Ulm("B2800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Ulm</b>
     *  * <p>
     *  *  Code: B2800S
     *  * <p>
     *  * 
     */
    @JsonProperty("B2800S")
    @XmlEnumValue("B2800S")
    Staatsanwaltschaft_beim_Landgericht_Ulm("B2800S"),

    /**
     * <b>Amtsgericht Ehingen</b>
     *  * <p>
     *  *  Code: B2801
     *  * <p>
     *  * 
     */
    @JsonProperty("B2801")
    @XmlEnumValue("B2801")
    Amtsgericht_Ehingen("B2801"),

    /**
     * <b>Amtsgericht Geislingen</b>
     *  * <p>
     *  *  Code: B2802
     *  * <p>
     *  * 
     */
    @JsonProperty("B2802")
    @XmlEnumValue("B2802")
    Amtsgericht_Geislingen("B2802"),

    /**
     * <b>Amtsgericht G&#246;ppingen</b>
     *  * <p>
     *  *  Code: B2803
     *  * <p>
     *  * 
     */
    @JsonProperty("B2803")
    @XmlEnumValue("B2803")
    Amtsgericht_Goeppingen("B2803"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Laupheim</b>
     *  * <p>
     *  *  Code: B2804
     *  * <p>
     *  * 
     */
    @JsonProperty("B2804")
    @XmlEnumValue("B2804")
    aufgeloest_Amtsgericht_Laupheim("B2804"),

    /**
     * <b>Amtsgericht Ulm</b>
     *  * <p>
     *  *  Code: B2805
     *  * <p>
     *  * 
     */
    @JsonProperty("B2805")
    @XmlEnumValue("B2805")
    Amtsgericht_Ulm("B2805"),

    /**
     * <b>Grundbuchamt Ulm</b>
     *  * <p>
     *  *  Code: B2805G
     *  * <p>
     *  * 
     */
    @JsonProperty("B2805G")
    @XmlEnumValue("B2805G")
    Grundbuchamt_Ulm("B2805G"),

    /**
     * <b>Landgericht Karlsruhe Ausw&#228;rtige Strafkammer Pforzheim</b>
     *  * <p>
     *  *  Code: B2900
     *  * <p>
     *  * 
     */
    @JsonProperty("B2900")
    @XmlEnumValue("B2900")
    Landgericht_Karlsruhe_Auswaertige_Strafkammer_Pforzheim("B2900"),

    /**
     * <b>Justizvollzugsanstalt Stuttgart</b>
     *  * <p>
     *  *  Code: B6099
     *  * <p>
     *  * 
     */
    @JsonProperty("B6099")
    @XmlEnumValue("B6099")
    Justizvollzugsanstalt_Stuttgart("B6099"),

    /**
     * <b>Finanzgericht Baden-W&#252;rttemberg, Senate in Stuttgart</b>
     *  * <p>
     *  *  Code: B6103
     *  * <p>
     *  * 
     */
    @JsonProperty("B6103")
    @XmlEnumValue("B6103")
    Finanzgericht_Baden_Wuerttemberg_Senate_in_Stuttgart("B6103"),

    /**
     * <b>Justizvollzugskrankenhaus Hohenasperg</b>
     *  * <p>
     *  *  Code: B6149
     *  * <p>
     *  * 
     */
    @JsonProperty("B6149")
    @XmlEnumValue("B6149")
    Justizvollzugskrankenhaus_Hohenasperg("B6149"),

    /**
     * <b>Finanzgericht Baden-W&#252;rttemberg, Au&#223;ensenate in Freiburg</b>
     *  * <p>
     *  *  Code: B6155
     *  * <p>
     *  * 
     */
    @JsonProperty("B6155")
    @XmlEnumValue("B6155")
    Finanzgericht_Baden_Wuerttemberg_Aussensenate_in_Freiburg("B6155"),

    /**
     * <b>Justizvollzugsanstalt Adelsheim</b>
     *  * <p>
     *  *  Code: B6183
     *  * <p>
     *  * 
     */
    @JsonProperty("B6183")
    @XmlEnumValue("B6183")
    Justizvollzugsanstalt_Adelsheim("B6183"),

    /**
     * <b>Sozialgericht Freiburg</b>
     *  * <p>
     *  *  Code: B6225
     *  * <p>
     *  * 
     */
    @JsonProperty("B6225")
    @XmlEnumValue("B6225")
    Sozialgericht_Freiburg("B6225"),

    /**
     * <b>Verwaltungsgericht Freiburg</b>
     *  * <p>
     *  *  Code: B6226
     *  * <p>
     *  * 
     */
    @JsonProperty("B6226")
    @XmlEnumValue("B6226")
    Verwaltungsgericht_Freiburg("B6226"),

    /**
     * <b>Arbeitsgericht Freiburg -Kammern Freiburg-</b>
     *  * <p>
     *  *  Code: B6227
     *  * <p>
     *  * 
     */
    @JsonProperty("B6227")
    @XmlEnumValue("B6227")
    Arbeitsgericht_Freiburg_Kammern_Freiburg("B6227"),

    /**
     * <b>Arbeitsgericht Heilbronn</b>
     *  * <p>
     *  *  Code: B6228
     *  * <p>
     *  * 
     */
    @JsonProperty("B6228")
    @XmlEnumValue("B6228")
    Arbeitsgericht_Heilbronn("B6228"),

    /**
     * <b>Sozialgericht Heilbronn</b>
     *  * <p>
     *  *  Code: B6229
     *  * <p>
     *  * 
     */
    @JsonProperty("B6229")
    @XmlEnumValue("B6229")
    Sozialgericht_Heilbronn("B6229"),

    /**
     * <b>Verwaltungsgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B6230
     *  * <p>
     *  * 
     */
    @JsonProperty("B6230")
    @XmlEnumValue("B6230")
    Verwaltungsgericht_Karlsruhe("B6230"),

    /**
     * <b>Verwaltungsgericht Karlsruhe Au&#223;enstelle</b>
     *  * <p>
     *  *  Code: B6231
     *  * <p>
     *  * 
     */
    @JsonProperty("B6231")
    @XmlEnumValue("B6231")
    Verwaltungsgericht_Karlsruhe_Aussenstelle("B6231"),

    /**
     * <b>Bundesverfassungsgericht</b>
     *  * <p>
     *  *  Code: B6232
     *  * <p>
     *  * 
     */
    @JsonProperty("B6232")
    @XmlEnumValue("B6232")
    Bundesverfassungsgericht("B6232"),

    /**
     * <b>aufgel&#246;st-Finanzgericht Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6233
     *  * <p>
     *  * 
     */
    @JsonProperty("B6233")
    @XmlEnumValue("B6233")
    aufgeloest_Finanzgericht_Baden_Wuerttemberg("B6233"),

    /**
     * <b>Sozialgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B6234
     *  * <p>
     *  * 
     */
    @JsonProperty("B6234")
    @XmlEnumValue("B6234")
    Sozialgericht_Karlsruhe("B6234"),

    /**
     * <b>Sozialgericht Konstanz</b>
     *  * <p>
     *  *  Code: B6235
     *  * <p>
     *  * 
     */
    @JsonProperty("B6235")
    @XmlEnumValue("B6235")
    Sozialgericht_Konstanz("B6235"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht L&#246;rrach</b>
     *  * <p>
     *  *  Code: B6236
     *  * <p>
     *  * 
     */
    @JsonProperty("B6236")
    @XmlEnumValue("B6236")
    aufgeloest_Arbeitsgericht_Loerrach("B6236"),

    /**
     * <b>Arbeitsgericht Mannheim</b>
     *  * <p>
     *  *  Code: B6237
     *  * <p>
     *  * 
     */
    @JsonProperty("B6237")
    @XmlEnumValue("B6237")
    Arbeitsgericht_Mannheim("B6237"),

    /**
     * <b>Verwaltungsgerichtshof Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6238
     *  * <p>
     *  * 
     */
    @JsonProperty("B6238")
    @XmlEnumValue("B6238")
    Verwaltungsgerichtshof_Baden_Wuerttemberg("B6238"),

    /**
     * <b>Arbeitsgericht Pforzheim</b>
     *  * <p>
     *  *  Code: B6239
     *  * <p>
     *  * 
     */
    @JsonProperty("B6239")
    @XmlEnumValue("B6239")
    Arbeitsgericht_Pforzheim("B6239"),

    /**
     * <b>Sozialgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B6240
     *  * <p>
     *  * 
     */
    @JsonProperty("B6240")
    @XmlEnumValue("B6240")
    Sozialgericht_Stuttgart("B6240"),

    /**
     * <b>Arbeitsgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B6241
     *  * <p>
     *  * 
     */
    @JsonProperty("B6241")
    @XmlEnumValue("B6241")
    Arbeitsgericht_Stuttgart("B6241"),

    /**
     * <b>Verwaltungsgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B6242
     *  * <p>
     *  * 
     */
    @JsonProperty("B6242")
    @XmlEnumValue("B6242")
    Verwaltungsgericht_Stuttgart("B6242"),

    /**
     * <b>Verfassungsgerichtshof f&#252;r das Land Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6243
     *  * <p>
     *  * 
     */
    @JsonProperty("B6243")
    @XmlEnumValue("B6243")
    Verfassungsgerichtshof_fuer_das_Land_Baden_Wuerttemberg("B6243"),

    /**
     * <b>Landesarbeitsgericht Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6244
     *  * <p>
     *  * 
     */
    @JsonProperty("B6244")
    @XmlEnumValue("B6244")
    Landesarbeitsgericht_Baden_Wuerttemberg("B6244"),

    /**
     * <b>Arbeitsgericht Ulm</b>
     *  * <p>
     *  *  Code: B6245
     *  * <p>
     *  * 
     */
    @JsonProperty("B6245")
    @XmlEnumValue("B6245")
    Arbeitsgericht_Ulm("B6245"),

    /**
     * <b>Landessozialgericht Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6246
     *  * <p>
     *  * 
     */
    @JsonProperty("B6246")
    @XmlEnumValue("B6246")
    Landessozialgericht_Baden_Wuerttemberg("B6246"),

    /**
     * <b>Sozialgericht Ulm</b>
     *  * <p>
     *  *  Code: B6250
     *  * <p>
     *  * 
     */
    @JsonProperty("B6250")
    @XmlEnumValue("B6250")
    Sozialgericht_Ulm("B6250"),

    /**
     * <b>Arbeitsgericht Reutlingen</b>
     *  * <p>
     *  *  Code: B6461
     *  * <p>
     *  * 
     */
    @JsonProperty("B6461")
    @XmlEnumValue("B6461")
    Arbeitsgericht_Reutlingen("B6461"),

    /**
     * <b>Sozialgericht Mannheim</b>
     *  * <p>
     *  *  Code: B6518
     *  * <p>
     *  * 
     */
    @JsonProperty("B6518")
    @XmlEnumValue("B6518")
    Sozialgericht_Mannheim("B6518"),

    /**
     * <b>Sozialgericht Reutlingen</b>
     *  * <p>
     *  *  Code: B6519
     *  * <p>
     *  * 
     */
    @JsonProperty("B6519")
    @XmlEnumValue("B6519")
    Sozialgericht_Reutlingen("B6519"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Freiburg</b>
     *  * <p>
     *  *  Code: B6547
     *  * <p>
     *  * 
     */
    @JsonProperty("B6547")
    @XmlEnumValue("B6547")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Freiburg("B6547"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Karlsruhe</b>
     *  * <p>
     *  *  Code: B6550
     *  * <p>
     *  * 
     */
    @JsonProperty("B6550")
    @XmlEnumValue("B6550")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Karlsruhe("B6550"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Stuttgart</b>
     *  * <p>
     *  *  Code: B6551
     *  * <p>
     *  * 
     */
    @JsonProperty("B6551")
    @XmlEnumValue("B6551")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Stuttgart("B6551"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer T&#252;bingen</b>
     *  * <p>
     *  *  Code: B6577
     *  * <p>
     *  * 
     */
    @JsonProperty("B6577")
    @XmlEnumValue("B6577")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Tuebingen("B6577"),

    /**
     * <b>Anwaltsgerichtshof Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B6579
     *  * <p>
     *  * 
     */
    @JsonProperty("B6579")
    @XmlEnumValue("B6579")
    Anwaltsgerichtshof_Baden_Wuerttemberg("B6579"),

    /**
     * <b>Sozialtherapeutische Anstalt Baden-W&#252;rttemberg Asperg</b>
     *  * <p>
     *  *  Code: B6704
     *  * <p>
     *  * 
     */
    @JsonProperty("B6704")
    @XmlEnumValue("B6704")
    Sozialtherapeutische_Anstalt_Baden_Wuerttemberg_Asperg("B6704"),

    /**
     * <b>Jugendarrestanstalt G&#246;ppingen</b>
     *  * <p>
     *  *  Code: B7423
     *  * <p>
     *  * 
     */
    @JsonProperty("B7423")
    @XmlEnumValue("B7423")
    Jugendarrestanstalt_Goeppingen("B7423"),

    /**
     * <b>Notariat VII Mannheim -Nachlassgericht-</b>
     *  * <p>
     *  *  Code: B7554
     *  * <p>
     *  * 
     */
    @JsonProperty("B7554")
    @XmlEnumValue("B7554")
    Notariat_VII_Mannheim_Nachlassgericht("B7554"),

    /**
     * <b>Justizvollzugsanstalt Bruchsal</b>
     *  * <p>
     *  *  Code: B7645
     *  * <p>
     *  * 
     */
    @JsonProperty("B7645")
    @XmlEnumValue("B7645")
    Justizvollzugsanstalt_Bruchsal("B7645"),

    /**
     * <b>Landesarbeitsgericht Baden-W&#252;rttemberg Kammern Freiburg</b>
     *  * <p>
     *  *  Code: B7691
     *  * <p>
     *  * 
     */
    @JsonProperty("B7691")
    @XmlEnumValue("B7691")
    Landesarbeitsgericht_Baden_Wuerttemberg_Kammern_Freiburg("B7691"),

    /**
     * <b>Landesarbeitsgericht Baden-W&#252;rttemberg Kammern Mannheim</b>
     *  * <p>
     *  *  Code: B7692
     *  * <p>
     *  * 
     */
    @JsonProperty("B7692")
    @XmlEnumValue("B7692")
    Landesarbeitsgericht_Baden_Wuerttemberg_Kammern_Mannheim("B7692"),

    /**
     * <b>Arbeitsgericht Karlsruhe</b>
     *  * <p>
     *  *  Code: B7696
     *  * <p>
     *  * 
     */
    @JsonProperty("B7696")
    @XmlEnumValue("B7696")
    Arbeitsgericht_Karlsruhe("B7696"),

    /**
     * <b>Justizvollzugsanstalt Schw&#228;bisch Gm&#252;nd</b>
     *  * <p>
     *  *  Code: B7761
     *  * <p>
     *  * 
     */
    @JsonProperty("B7761")
    @XmlEnumValue("B7761")
    Justizvollzugsanstalt_Schwaebisch_Gmuend("B7761"),

    /**
     * <b>Verwaltungsgericht Sigmaringen</b>
     *  * <p>
     *  *  Code: B7820
     *  * <p>
     *  * 
     */
    @JsonProperty("B7820")
    @XmlEnumValue("B7820")
    Verwaltungsgericht_Sigmaringen("B7820"),

    /**
     * <b>Justizvollzugsanstalt Freiburg</b>
     *  * <p>
     *  *  Code: B7841
     *  * <p>
     *  * 
     */
    @JsonProperty("B7841")
    @XmlEnumValue("B7841")
    Justizvollzugsanstalt_Freiburg("B7841"),

    /**
     * <b>Justizvollzugsanstalt Ulm</b>
     *  * <p>
     *  *  Code: B7846
     *  * <p>
     *  * 
     */
    @JsonProperty("B7846")
    @XmlEnumValue("B7846")
    Justizvollzugsanstalt_Ulm("B7846"),

    /**
     * <b>Justizvollzugsanstalt Mannheim</b>
     *  * <p>
     *  *  Code: B8322
     *  * <p>
     *  * 
     */
    @JsonProperty("B8322")
    @XmlEnumValue("B8322")
    Justizvollzugsanstalt_Mannheim("B8322"),

    /**
     * <b>Justizvollzugsanstalt Heilbronn</b>
     *  * <p>
     *  *  Code: B8375
     *  * <p>
     *  * 
     */
    @JsonProperty("B8375")
    @XmlEnumValue("B8375")
    Justizvollzugsanstalt_Heilbronn("B8375"),

    /**
     * <b>Justizvollzugsanstalt Heimsheim</b>
     *  * <p>
     *  *  Code: B8376
     *  * <p>
     *  * 
     */
    @JsonProperty("B8376")
    @XmlEnumValue("B8376")
    Justizvollzugsanstalt_Heimsheim("B8376"),

    /**
     * <b>Justizvollzugsanstalt Karlsruhe</b>
     *  * <p>
     *  *  Code: B8377
     *  * <p>
     *  * 
     */
    @JsonProperty("B8377")
    @XmlEnumValue("B8377")
    Justizvollzugsanstalt_Karlsruhe("B8377"),

    /**
     * <b>Justizvollzugsanstalt Konstanz</b>
     *  * <p>
     *  *  Code: B8378
     *  * <p>
     *  * 
     */
    @JsonProperty("B8378")
    @XmlEnumValue("B8378")
    Justizvollzugsanstalt_Konstanz("B8378"),

    /**
     * <b>Justizvollzugsanstalt Ravensburg</b>
     *  * <p>
     *  *  Code: B8379
     *  * <p>
     *  * 
     */
    @JsonProperty("B8379")
    @XmlEnumValue("B8379")
    Justizvollzugsanstalt_Ravensburg("B8379"),

    /**
     * <b>Justizvollzugsanstalt Rottweil</b>
     *  * <p>
     *  *  Code: B8380
     *  * <p>
     *  * 
     */
    @JsonProperty("B8380")
    @XmlEnumValue("B8380")
    Justizvollzugsanstalt_Rottweil("B8380"),

    /**
     * <b>Justizvollzugsanstalt Waldshut-Tiengen</b>
     *  * <p>
     *  *  Code: B8381
     *  * <p>
     *  * 
     */
    @JsonProperty("B8381")
    @XmlEnumValue("B8381")
    Justizvollzugsanstalt_Waldshut_Tiengen("B8381"),

    /**
     * <b>Justizvollzugsanstalt Schw&#228;bisch-Hall</b>
     *  * <p>
     *  *  Code: B8392
     *  * <p>
     *  * 
     */
    @JsonProperty("B8392")
    @XmlEnumValue("B8392")
    Justizvollzugsanstalt_Schwaebisch_Hall("B8392"),

    /**
     * <b>Registergericht Amtsgericht Stuttgart</b>
     *  * <p>
     *  *  Code: B8534
     *  * <p>
     *  * 
     */
    @JsonProperty("B8534")
    @XmlEnumValue("B8534")
    Registergericht_Amtsgericht_Stuttgart("B8534"),

    /**
     * <b>Registergericht Amtsgericht Mannheim</b>
     *  * <p>
     *  *  Code: B8535
     *  * <p>
     *  * 
     */
    @JsonProperty("B8535")
    @XmlEnumValue("B8535")
    Registergericht_Amtsgericht_Mannheim("B8535"),

    /**
     * <b>Registergericht Amtsgericht Freiburg i. Br.</b>
     *  * <p>
     *  *  Code: B8536
     *  * <p>
     *  * 
     */
    @JsonProperty("B8536")
    @XmlEnumValue("B8536")
    Registergericht_Amtsgericht_Freiburg_i_Br("B8536"),

    /**
     * <b>Registergericht Amtsgericht Ulm</b>
     *  * <p>
     *  *  Code: B8537
     *  * <p>
     *  * 
     */
    @JsonProperty("B8537")
    @XmlEnumValue("B8537")
    Registergericht_Amtsgericht_Ulm("B8537"),

    /**
     * <b>Justizvollzugsanstalt Offenburg</b>
     *  * <p>
     *  *  Code: B8559
     *  * <p>
     *  * 
     */
    @JsonProperty("B8559")
    @XmlEnumValue("B8559")
    Justizvollzugsanstalt_Offenburg("B8559"),

    /**
     * <b>Grundbuchzentralarchiv Baden-W&#252;rttemberg</b>
     *  * <p>
     *  *  Code: B8721G
     *  * <p>
     *  * 
     */
    @JsonProperty("B8721G")
    @XmlEnumValue("B8721G")
    Grundbuchzentralarchiv_Baden_Wuerttemberg("B8721G"),

    /**
     * <b>Arbeitsgericht Stuttgart, Au&#223;enstelle Aalen</b>
     *  * <p>
     *  *  Code: B8940
     *  * <p>
     *  * 
     */
    @JsonProperty("B8940")
    @XmlEnumValue("B8940")
    Arbeitsgericht_Stuttgart_Aussenstelle_Aalen("B8940"),

    /**
     * <b>Arbeitsgericht Stuttgart, Au&#223;enstelle Ludwigsburg</b>
     *  * <p>
     *  *  Code: B8941
     *  * <p>
     *  * 
     */
    @JsonProperty("B8941")
    @XmlEnumValue("B8941")
    Arbeitsgericht_Stuttgart_Aussenstelle_Ludwigsburg("B8941"),

    /**
     * <b>Arbeitsgericht Freiburg, Kammern Offenburg, Offenburg</b>
     *  * <p>
     *  *  Code: B9023
     *  * <p>
     *  * 
     */
    @JsonProperty("B9023")
    @XmlEnumValue("B9023")
    Arbeitsgericht_Freiburg_Kammern_Offenburg_Offenburg("B9023"),

    /**
     * <b>Arbeitsgericht Heilbronn, Kammern Crailsheim, Crailsheim</b>
     *  * <p>
     *  *  Code: B9024
     *  * <p>
     *  * 
     */
    @JsonProperty("B9024")
    @XmlEnumValue("B9024")
    Arbeitsgericht_Heilbronn_Kammern_Crailsheim_Crailsheim("B9024"),

    /**
     * <b>Arbeitsgericht Ulm, Kammern Ravensburg, Ravensburg</b>
     *  * <p>
     *  *  Code: B9025
     *  * <p>
     *  * 
     */
    @JsonProperty("B9025")
    @XmlEnumValue("B9025")
    Arbeitsgericht_Ulm_Kammern_Ravensburg_Ravensburg("B9025"),

    /**
     * <b>Arbeitsgericht Villingen-Schwenningen,Villingen-Schwenningen</b>
     *  * <p>
     *  *  Code: B9026
     *  * <p>
     *  * 
     */
    @JsonProperty("B9026")
    @XmlEnumValue("B9026")
    Arbeitsgericht_Villingen_Schwenningen_Villingen_Schwenningen("B9026"),

    /**
     * <b>Arbeitsgericht Villingen-Schwenningen, Kammern Radolfzell, Radolfzell</b>
     *  * <p>
     *  *  Code: B9027
     *  * <p>
     *  * 
     */
    @JsonProperty("B9027")
    @XmlEnumValue("B9027")
    Arbeitsgericht_Villingen_Schwenningen_Kammern_Radolfzell_Radolfzell("B9027"),

    /**
     * <b>Arbeitsgericht Mannheim, Kammern Heidelberg, Heidelberg</b>
     *  * <p>
     *  *  Code: B9028
     *  * <p>
     *  * 
     */
    @JsonProperty("B9028")
    @XmlEnumValue("B9028")
    Arbeitsgericht_Mannheim_Kammern_Heidelberg_Heidelberg("B9028"),

    /**
     * <b>Arbeitsgericht Freiburg, Kammern L&#246;rrach</b>
     *  * <p>
     *  *  Code: B9029
     *  * <p>
     *  * 
     */
    @JsonProperty("B9029")
    @XmlEnumValue("B9029")
    Arbeitsgericht_Freiburg_Kammern_Loerrach("B9029"),

    /**
     * <b>Justizvollzugsanstalt Rottenburg</b>
     *  * <p>
     *  *  Code: B9162
     *  * <p>
     *  * 
     */
    @JsonProperty("B9162")
    @XmlEnumValue("B9162")
    Justizvollzugsanstalt_Rottenburg("B9162"),

    /**
     * <b>Europ&#228;ische Staatsanwaltschaft (EPPO/EUStA)</b>
     *  * <p>
     *  *  Code: C6087
     *  * <p>
     *  * 
     */
    @JsonProperty("C6087")
    @XmlEnumValue("C6087")
    Europaeische_Staatsanwaltschaft_EPPO_EUStA("C6087"),

    /**
     * <b>Bayerisches Oberstes Landesgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D1000
     *  * <p>
     *  * 
     */
    @JsonProperty("D1000")
    @XmlEnumValue("D1000")
    Bayerisches_Oberstes_Landesgericht_Muenchen("D1000"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft bei dem Bayerischen Obersten Landesgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("D1000S")
    @XmlEnumValue("D1000S")
    aufgeloest_Staatsanwaltschaft_bei_dem_Bayerischen_Obersten_Landesgericht_Muenchen("D1000S"),

    /**
     * <b>Oberlandesgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D2000
     *  * <p>
     *  * 
     */
    @JsonProperty("D2000")
    @XmlEnumValue("D2000")
    Oberlandesgericht_Muenchen("D2000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D2000S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2000S")
    @XmlEnumValue("D2000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Muenchen("D2000S"),

    /**
     * <b>Landgericht Augsburg</b>
     *  * <p>
     *  *  Code: D2100
     *  * <p>
     *  * 
     */
    @JsonProperty("D2100")
    @XmlEnumValue("D2100")
    Landgericht_Augsburg("D2100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Augsburg</b>
     *  * <p>
     *  *  Code: D2100S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2100S")
    @XmlEnumValue("D2100S")
    Staatsanwaltschaft_beim_Landgericht_Augsburg("D2100S"),

    /**
     * <b>Amtsgericht Aichach</b>
     *  * <p>
     *  *  Code: D2101
     *  * <p>
     *  * 
     */
    @JsonProperty("D2101")
    @XmlEnumValue("D2101")
    Amtsgericht_Aichach("D2101"),

    /**
     * <b>Grundbuchamt Aichach</b>
     *  * <p>
     *  *  Code: D2101G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2101G")
    @XmlEnumValue("D2101G")
    Grundbuchamt_Aichach("D2101G"),

    /**
     * <b>Amtsgericht Augsburg</b>
     *  * <p>
     *  *  Code: D2102
     *  * <p>
     *  * 
     */
    @JsonProperty("D2102")
    @XmlEnumValue("D2102")
    Amtsgericht_Augsburg("D2102"),

    /**
     * <b>Grundbuchamt Augsburg</b>
     *  * <p>
     *  *  Code: D2102G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2102G")
    @XmlEnumValue("D2102G")
    Grundbuchamt_Augsburg("D2102G"),

    /**
     * <b>Registergericht Amtsgericht Augsburg</b>
     *  * <p>
     *  *  Code: D2102V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2102V")
    @XmlEnumValue("D2102V")
    Registergericht_Amtsgericht_Augsburg("D2102V"),

    /**
     * <b>Amtsgericht Dillingen</b>
     *  * <p>
     *  *  Code: D2103
     *  * <p>
     *  * 
     */
    @JsonProperty("D2103")
    @XmlEnumValue("D2103")
    Amtsgericht_Dillingen("D2103"),

    /**
     * <b>Grundbuchamt Dillingen</b>
     *  * <p>
     *  *  Code: D2103G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2103G")
    @XmlEnumValue("D2103G")
    Grundbuchamt_Dillingen("D2103G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht N&#246;rdlingen, Zweigstelle Donauw&#246;rth</b>
     *  * <p>
     *  *  Code: D2104
     *  * <p>
     *  * 
     */
    @JsonProperty("D2104")
    @XmlEnumValue("D2104")
    aufgeloest_Amtsgericht_Noerdlingen_Zweigstelle_Donauwoerth("D2104"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Friedberg (Bayern)</b>
     *  * <p>
     *  *  Code: D2105
     *  * <p>
     *  * 
     */
    @JsonProperty("D2105")
    @XmlEnumValue("D2105")
    aufgeloest_Amtsgericht_Friedberg_Bayern("D2105"),

    /**
     * <b>Amtsgericht Landsberg</b>
     *  * <p>
     *  *  Code: D2106
     *  * <p>
     *  * 
     */
    @JsonProperty("D2106")
    @XmlEnumValue("D2106")
    Amtsgericht_Landsberg("D2106"),

    /**
     * <b>Grundbuchamt Landsberg</b>
     *  * <p>
     *  *  Code: D2106G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2106G")
    @XmlEnumValue("D2106G")
    Grundbuchamt_Landsberg("D2106G"),

    /**
     * <b>Amtsgericht N&#246;rdlingen</b>
     *  * <p>
     *  *  Code: D2108
     *  * <p>
     *  * 
     */
    @JsonProperty("D2108")
    @XmlEnumValue("D2108")
    Amtsgericht_Noerdlingen("D2108"),

    /**
     * <b>Grundbuchamt N&#246;rdlingen</b>
     *  * <p>
     *  *  Code: D2108G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2108G")
    @XmlEnumValue("D2108G")
    Grundbuchamt_Noerdlingen("D2108G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schrobenhausen</b>
     *  * <p>
     *  *  Code: D2109
     *  * <p>
     *  * 
     */
    @JsonProperty("D2109")
    @XmlEnumValue("D2109")
    aufgeloest_Amtsgericht_Schrobenhausen("D2109"),

    /**
     * <b>Amtsgericht Augsburg Zweigstelle Schwabm&#252;nchen</b>
     *  * <p>
     *  *  Code: D2110
     *  * <p>
     *  * 
     */
    @JsonProperty("D2110")
    @XmlEnumValue("D2110")
    Amtsgericht_Augsburg_Zweigstelle_Schwabmuenchen("D2110"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wertingen</b>
     *  * <p>
     *  *  Code: D2111
     *  * <p>
     *  * 
     */
    @JsonProperty("D2111")
    @XmlEnumValue("D2111")
    aufgeloest_Amtsgericht_Wertingen("D2111"),

    /**
     * <b>Landgericht Augsburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Aichach</b>
     *  * <p>
     *  *  Code: D2120
     *  * <p>
     *  * 
     */
    @JsonProperty("D2120")
    @XmlEnumValue("D2120")
    Landgericht_Augsburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Aichach("D2120"),

    /**
     * <b>Landgericht Augsburg Strafvollstreckungskammer N&#246;rdlingen</b>
     *  * <p>
     *  *  Code: D2130
     *  * <p>
     *  * 
     */
    @JsonProperty("D2130")
    @XmlEnumValue("D2130")
    Landgericht_Augsburg_Strafvollstreckungskammer_Noerdlingen("D2130"),

    /**
     * <b>Landgericht Augsburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Landsberg</b>
     *  * <p>
     *  *  Code: D2140
     *  * <p>
     *  * 
     */
    @JsonProperty("D2140")
    @XmlEnumValue("D2140")
    Landgericht_Augsburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Landsberg("D2140"),

    /**
     * <b>Landgericht Deggendorf</b>
     *  * <p>
     *  *  Code: D2200
     *  * <p>
     *  * 
     */
    @JsonProperty("D2200")
    @XmlEnumValue("D2200")
    Landgericht_Deggendorf("D2200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Deggendorf</b>
     *  * <p>
     *  *  Code: D2200S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2200S")
    @XmlEnumValue("D2200S")
    Staatsanwaltschaft_beim_Landgericht_Deggendorf("D2200S"),

    /**
     * <b>Amtsgericht Deggendorf</b>
     *  * <p>
     *  *  Code: D2201
     *  * <p>
     *  * 
     */
    @JsonProperty("D2201")
    @XmlEnumValue("D2201")
    Amtsgericht_Deggendorf("D2201"),

    /**
     * <b>Grundbuchamt Deggendorf</b>
     *  * <p>
     *  *  Code: D2201G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2201G")
    @XmlEnumValue("D2201G")
    Grundbuchamt_Deggendorf("D2201G"),

    /**
     * <b>Registergericht Amtsgericht Deggendorf</b>
     *  * <p>
     *  *  Code: D2201V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2201V")
    @XmlEnumValue("D2201V")
    Registergericht_Amtsgericht_Deggendorf("D2201V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Grafenau</b>
     *  * <p>
     *  *  Code: D2202
     *  * <p>
     *  * 
     */
    @JsonProperty("D2202")
    @XmlEnumValue("D2202")
    aufgeloest_Amtsgericht_Grafenau("D2202"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hengersberg</b>
     *  * <p>
     *  *  Code: D2203
     *  * <p>
     *  * 
     */
    @JsonProperty("D2203")
    @XmlEnumValue("D2203")
    aufgeloest_Amtsgericht_Hengersberg("D2203"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Regen</b>
     *  * <p>
     *  *  Code: D2204
     *  * <p>
     *  * 
     */
    @JsonProperty("D2204")
    @XmlEnumValue("D2204")
    aufgeloest_Amtsgericht_Regen("D2204"),

    /**
     * <b>Amtsgericht Viechtach</b>
     *  * <p>
     *  *  Code: D2205
     *  * <p>
     *  * 
     */
    @JsonProperty("D2205")
    @XmlEnumValue("D2205")
    Amtsgericht_Viechtach("D2205"),

    /**
     * <b>Grundbuchamt Viechtach</b>
     *  * <p>
     *  *  Code: D2205G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2205G")
    @XmlEnumValue("D2205G")
    Grundbuchamt_Viechtach("D2205G"),

    /**
     * <b>Landgericht Kempten</b>
     *  * <p>
     *  *  Code: D2300
     *  * <p>
     *  * 
     */
    @JsonProperty("D2300")
    @XmlEnumValue("D2300")
    Landgericht_Kempten("D2300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Kempten (Allg&#228;u)</b>
     *  * <p>
     *  *  Code: D2300S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2300S")
    @XmlEnumValue("D2300S")
    Staatsanwaltschaft_beim_Landgericht_Kempten_Allgaeu("D2300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kaufbeuren, Zweigstelle F&#252;ssen</b>
     *  * <p>
     *  *  Code: D2301
     *  * <p>
     *  * 
     */
    @JsonProperty("D2301")
    @XmlEnumValue("D2301")
    aufgeloest_Amtsgericht_Kaufbeuren_Zweigstelle_Fuessen("D2301"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Immenstadt i. Allg&#228;u</b>
     *  * <p>
     *  *  Code: D2302
     *  * <p>
     *  * 
     */
    @JsonProperty("D2302")
    @XmlEnumValue("D2302")
    aufgeloest_Amtsgericht_Immenstadt_i_Allgaeu("D2302"),

    /**
     * <b>Amtsgericht Kaufbeuren</b>
     *  * <p>
     *  *  Code: D2303
     *  * <p>
     *  * 
     */
    @JsonProperty("D2303")
    @XmlEnumValue("D2303")
    Amtsgericht_Kaufbeuren("D2303"),

    /**
     * <b>Grundbuchamt Kaufbeuren</b>
     *  * <p>
     *  *  Code: D2303G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2303G")
    @XmlEnumValue("D2303G")
    Grundbuchamt_Kaufbeuren("D2303G"),

    /**
     * <b>Amtsgericht Kempten</b>
     *  * <p>
     *  *  Code: D2304
     *  * <p>
     *  * 
     */
    @JsonProperty("D2304")
    @XmlEnumValue("D2304")
    Amtsgericht_Kempten("D2304"),

    /**
     * <b>Grundbuchamt Kempten</b>
     *  * <p>
     *  *  Code: D2304G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2304G")
    @XmlEnumValue("D2304G")
    Grundbuchamt_Kempten("D2304G"),

    /**
     * <b>Registergericht Amtsgericht Kempten</b>
     *  * <p>
     *  *  Code: D2304V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2304V")
    @XmlEnumValue("D2304V")
    Registergericht_Amtsgericht_Kempten("D2304V"),

    /**
     * <b>Amtsgericht Lindau</b>
     *  * <p>
     *  *  Code: D2305
     *  * <p>
     *  * 
     */
    @JsonProperty("D2305")
    @XmlEnumValue("D2305")
    Amtsgericht_Lindau("D2305"),

    /**
     * <b>Grundbuchamt Lindau</b>
     *  * <p>
     *  *  Code: D2305G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2305G")
    @XmlEnumValue("D2305G")
    Grundbuchamt_Lindau("D2305G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kaufbeuren, Zwst. Marktoberdorf</b>
     *  * <p>
     *  *  Code: D2306
     *  * <p>
     *  * 
     */
    @JsonProperty("D2306")
    @XmlEnumValue("D2306")
    aufgeloest_Amtsgericht_Kaufbeuren_Zwst_Marktoberdorf("D2306"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Weilheim Zweigstelle Schongau</b>
     *  * <p>
     *  *  Code: D2307
     *  * <p>
     *  * 
     */
    @JsonProperty("D2307")
    @XmlEnumValue("D2307")
    aufgeloest_Amtsgericht_Weilheim_Zweigstelle_Schongau("D2307"),

    /**
     * <b>Amtsgericht Sonthofen</b>
     *  * <p>
     *  *  Code: D2308
     *  * <p>
     *  * 
     */
    @JsonProperty("D2308")
    @XmlEnumValue("D2308")
    Amtsgericht_Sonthofen("D2308"),

    /**
     * <b>Grundbuchamt Sonthofen</b>
     *  * <p>
     *  *  Code: D2308G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2308G")
    @XmlEnumValue("D2308G")
    Grundbuchamt_Sonthofen("D2308G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Weiler-Lindenberg</b>
     *  * <p>
     *  *  Code: D2309
     *  * <p>
     *  * 
     */
    @JsonProperty("D2309")
    @XmlEnumValue("D2309")
    aufgeloest_Amtsgericht_Weiler_Lindenberg("D2309"),

    /**
     * <b>Landgericht Landshut</b>
     *  * <p>
     *  *  Code: D2400
     *  * <p>
     *  * 
     */
    @JsonProperty("D2400")
    @XmlEnumValue("D2400")
    Landgericht_Landshut("D2400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Landshut</b>
     *  * <p>
     *  *  Code: D2400S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2400S")
    @XmlEnumValue("D2400S")
    Staatsanwaltschaft_beim_Landgericht_Landshut("D2400S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dingolfing</b>
     *  * <p>
     *  *  Code: D2401
     *  * <p>
     *  * 
     */
    @JsonProperty("D2401")
    @XmlEnumValue("D2401")
    aufgeloest_Amtsgericht_Dingolfing("D2401"),

    /**
     * <b>Amtsgericht Eggenfelden</b>
     *  * <p>
     *  *  Code: D2402
     *  * <p>
     *  * 
     */
    @JsonProperty("D2402")
    @XmlEnumValue("D2402")
    Amtsgericht_Eggenfelden("D2402"),

    /**
     * <b>Grundbuchamt Eggenfelden</b>
     *  * <p>
     *  *  Code: D2402G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2402G")
    @XmlEnumValue("D2402G")
    Grundbuchamt_Eggenfelden("D2402G"),

    /**
     * <b>Amtsgericht Landau (Bay)</b>
     *  * <p>
     *  *  Code: D2403
     *  * <p>
     *  * 
     */
    @JsonProperty("D2403")
    @XmlEnumValue("D2403")
    Amtsgericht_Landau_Bay("D2403"),

    /**
     * <b>Grundbuchamt Landau</b>
     *  * <p>
     *  *  Code: D2403G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2403G")
    @XmlEnumValue("D2403G")
    Grundbuchamt_Landau("D2403G"),

    /**
     * <b>Amtsgericht Landshut</b>
     *  * <p>
     *  *  Code: D2404
     *  * <p>
     *  * 
     */
    @JsonProperty("D2404")
    @XmlEnumValue("D2404")
    Amtsgericht_Landshut("D2404"),

    /**
     * <b>Grundbuchamt Landshut</b>
     *  * <p>
     *  *  Code: D2404G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2404G")
    @XmlEnumValue("D2404G")
    Grundbuchamt_Landshut("D2404G"),

    /**
     * <b>Registergericht Amtsgericht Landshut</b>
     *  * <p>
     *  *  Code: D2404V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2404V")
    @XmlEnumValue("D2404V")
    Registergericht_Amtsgericht_Landshut("D2404V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kelheim Zweigstelle Mainburg</b>
     *  * <p>
     *  *  Code: D2405
     *  * <p>
     *  * 
     */
    @JsonProperty("D2405")
    @XmlEnumValue("D2405")
    aufgeloest_Amtsgericht_Kelheim_Zweigstelle_Mainburg("D2405"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Mallersdorf</b>
     *  * <p>
     *  *  Code: D2406
     *  * <p>
     *  * 
     */
    @JsonProperty("D2406")
    @XmlEnumValue("D2406")
    aufgeloest_Amtsgericht_Mallersdorf("D2406"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freising Zweigstelle Moosburg</b>
     *  * <p>
     *  *  Code: D2407
     *  * <p>
     *  * 
     */
    @JsonProperty("D2407")
    @XmlEnumValue("D2407")
    aufgeloest_Amtsgericht_Freising_Zweigstelle_Moosburg("D2407"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neumarkt-St. Veit</b>
     *  * <p>
     *  *  Code: D2408
     *  * <p>
     *  * 
     */
    @JsonProperty("D2408")
    @XmlEnumValue("D2408")
    aufgeloest_Amtsgericht_Neumarkt_St_Veit("D2408"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rottenburg a. d. Laaber</b>
     *  * <p>
     *  *  Code: D2409
     *  * <p>
     *  * 
     */
    @JsonProperty("D2409")
    @XmlEnumValue("D2409")
    aufgeloest_Amtsgericht_Rottenburg_a_d_Laaber("D2409"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Vilsbiburg</b>
     *  * <p>
     *  *  Code: D2410
     *  * <p>
     *  * 
     */
    @JsonProperty("D2410")
    @XmlEnumValue("D2410")
    aufgeloest_Amtsgericht_Vilsbiburg("D2410"),

    /**
     * <b>Amtsgericht Erding</b>
     *  * <p>
     *  *  Code: D2411
     *  * <p>
     *  * 
     */
    @JsonProperty("D2411")
    @XmlEnumValue("D2411")
    Amtsgericht_Erding("D2411"),

    /**
     * <b>Grundbuchamt Erding</b>
     *  * <p>
     *  *  Code: D2411G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2411G")
    @XmlEnumValue("D2411G")
    Grundbuchamt_Erding("D2411G"),

    /**
     * <b>Amtsgericht Freising</b>
     *  * <p>
     *  *  Code: D2412
     *  * <p>
     *  * 
     */
    @JsonProperty("D2412")
    @XmlEnumValue("D2412")
    Amtsgericht_Freising("D2412"),

    /**
     * <b>Grundbuchamt Freising</b>
     *  * <p>
     *  *  Code: D2412G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2412G")
    @XmlEnumValue("D2412G")
    Grundbuchamt_Freising("D2412G"),

    /**
     * <b>Landgericht Landshut Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Erding</b>
     *  * <p>
     *  *  Code: D2420
     *  * <p>
     *  * 
     */
    @JsonProperty("D2420")
    @XmlEnumValue("D2420")
    Landgericht_Landshut_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Erding("D2420"),

    /**
     * <b>Landgericht Memmingen</b>
     *  * <p>
     *  *  Code: D2500
     *  * <p>
     *  * 
     */
    @JsonProperty("D2500")
    @XmlEnumValue("D2500")
    Landgericht_Memmingen("D2500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Memmingen</b>
     *  * <p>
     *  *  Code: D2500S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2500S")
    @XmlEnumValue("D2500S")
    Staatsanwaltschaft_beim_Landgericht_Memmingen("D2500S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Buchloe</b>
     *  * <p>
     *  *  Code: D2501
     *  * <p>
     *  * 
     */
    @JsonProperty("D2501")
    @XmlEnumValue("D2501")
    aufgeloest_Amtsgericht_Buchloe("D2501"),

    /**
     * <b>Amtsgericht G&#252;nzburg</b>
     *  * <p>
     *  *  Code: D2502
     *  * <p>
     *  * 
     */
    @JsonProperty("D2502")
    @XmlEnumValue("D2502")
    Amtsgericht_Guenzburg("D2502"),

    /**
     * <b>Grundbuchamt G&#252;nzburg</b>
     *  * <p>
     *  *  Code: D2502G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2502G")
    @XmlEnumValue("D2502G")
    Grundbuchamt_Guenzburg("D2502G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neu-Ulm Zweigstelle Illertissen</b>
     *  * <p>
     *  *  Code: D2503
     *  * <p>
     *  * 
     */
    @JsonProperty("D2503")
    @XmlEnumValue("D2503")
    aufgeloest_Amtsgericht_Neu_Ulm_Zweigstelle_Illertissen("D2503"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Krumbach (Schwaben)</b>
     *  * <p>
     *  *  Code: D2504
     *  * <p>
     *  * 
     */
    @JsonProperty("D2504")
    @XmlEnumValue("D2504")
    aufgeloest_Amtsgericht_Krumbach_Schwaben("D2504"),

    /**
     * <b>Amtsgericht Memmingen</b>
     *  * <p>
     *  *  Code: D2505
     *  * <p>
     *  * 
     */
    @JsonProperty("D2505")
    @XmlEnumValue("D2505")
    Amtsgericht_Memmingen("D2505"),

    /**
     * <b>Grundbuchamt Memmingen</b>
     *  * <p>
     *  *  Code: D2505G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2505G")
    @XmlEnumValue("D2505G")
    Grundbuchamt_Memmingen("D2505G"),

    /**
     * <b>Registergericht Amtsgericht Memmingen</b>
     *  * <p>
     *  *  Code: D2505V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2505V")
    @XmlEnumValue("D2505V")
    Registergericht_Amtsgericht_Memmingen("D2505V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Mindelheim</b>
     *  * <p>
     *  *  Code: D2506
     *  * <p>
     *  * 
     */
    @JsonProperty("D2506")
    @XmlEnumValue("D2506")
    aufgeloest_Amtsgericht_Mindelheim("D2506"),

    /**
     * <b>Amtsgericht Neu-Ulm</b>
     *  * <p>
     *  *  Code: D2507
     *  * <p>
     *  * 
     */
    @JsonProperty("D2507")
    @XmlEnumValue("D2507")
    Amtsgericht_Neu_Ulm("D2507"),

    /**
     * <b>Grundbuchamt Neu-Ulm</b>
     *  * <p>
     *  *  Code: D2507G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2507G")
    @XmlEnumValue("D2507G")
    Grundbuchamt_Neu_Ulm("D2507G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht T&#252;rkheim</b>
     *  * <p>
     *  *  Code: D2508
     *  * <p>
     *  * 
     */
    @JsonProperty("D2508")
    @XmlEnumValue("D2508")
    aufgeloest_Amtsgericht_Tuerkheim("D2508"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wei&#223;enhorn</b>
     *  * <p>
     *  *  Code: D2509
     *  * <p>
     *  * 
     */
    @JsonProperty("D2509")
    @XmlEnumValue("D2509")
    aufgeloest_Amtsgericht_Weissenhorn("D2509"),

    /**
     * <b>Landgericht Memmingen Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Neu-Ulm</b>
     *  * <p>
     *  *  Code: D2520
     *  * <p>
     *  * 
     */
    @JsonProperty("D2520")
    @XmlEnumValue("D2520")
    Landgericht_Memmingen_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Neu_Ulm("D2520"),

    /**
     * <b>Landgericht M&#252;nchen I</b>
     *  * <p>
     *  *  Code: D2600
     *  * <p>
     *  * 
     */
    @JsonProperty("D2600")
    @XmlEnumValue("D2600")
    Landgericht_Muenchen_I("D2600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht M&#252;nchen I</b>
     *  * <p>
     *  *  Code: D2600S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2600S")
    @XmlEnumValue("D2600S")
    Staatsanwaltschaft_beim_Landgericht_Muenchen_I("D2600S"),

    /**
     * <b>Amtsgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D2601
     *  * <p>
     *  * 
     */
    @JsonProperty("D2601")
    @XmlEnumValue("D2601")
    Amtsgericht_Muenchen("D2601"),

    /**
     * <b>Grundbuchamt M&#252;nchen</b>
     *  * <p>
     *  *  Code: D2601G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2601G")
    @XmlEnumValue("D2601G")
    Grundbuchamt_Muenchen("D2601G"),

    /**
     * <b>Registergericht Amtsgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D2601V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2601V")
    @XmlEnumValue("D2601V")
    Registergericht_Amtsgericht_Muenchen("D2601V"),

    /**
     * <b>Landgericht M&#252;nchen II</b>
     *  * <p>
     *  *  Code: D2700
     *  * <p>
     *  * 
     */
    @JsonProperty("D2700")
    @XmlEnumValue("D2700")
    Landgericht_Muenchen_II("D2700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht M&#252;nchen II</b>
     *  * <p>
     *  *  Code: D2700S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2700S")
    @XmlEnumValue("D2700S")
    Staatsanwaltschaft_beim_Landgericht_Muenchen_II("D2700S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wolfratshausen, Zwst. Bad T&#246;lz</b>
     *  * <p>
     *  *  Code: D2701
     *  * <p>
     *  * 
     */
    @JsonProperty("D2701")
    @XmlEnumValue("D2701")
    aufgeloest_Amtsgericht_Wolfratshausen_Zwst_Bad_Toelz("D2701"),

    /**
     * <b>Amtsgericht Dachau</b>
     *  * <p>
     *  *  Code: D2702
     *  * <p>
     *  * 
     */
    @JsonProperty("D2702")
    @XmlEnumValue("D2702")
    Amtsgericht_Dachau("D2702"),

    /**
     * <b>Grundbuchamt Dachau</b>
     *  * <p>
     *  *  Code: D2702G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2702G")
    @XmlEnumValue("D2702G")
    Grundbuchamt_Dachau("D2702G"),

    /**
     * <b>Amtsgericht Ebersberg</b>
     *  * <p>
     *  *  Code: D2703
     *  * <p>
     *  * 
     */
    @JsonProperty("D2703")
    @XmlEnumValue("D2703")
    Amtsgericht_Ebersberg("D2703"),

    /**
     * <b>Grundbuchamt Ebersberg</b>
     *  * <p>
     *  *  Code: D2703G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2703G")
    @XmlEnumValue("D2703G")
    Grundbuchamt_Ebersberg("D2703G"),

    /**
     * <b>Amtsgericht F&#252;rstenfeldbruck</b>
     *  * <p>
     *  *  Code: D2706
     *  * <p>
     *  * 
     */
    @JsonProperty("D2706")
    @XmlEnumValue("D2706")
    Amtsgericht_Fuerstenfeldbruck("D2706"),

    /**
     * <b>Grundbuchamt F&#252;rstenfeldbruck</b>
     *  * <p>
     *  *  Code: D2706G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2706G")
    @XmlEnumValue("D2706G")
    Grundbuchamt_Fuerstenfeldbruck("D2706G"),

    /**
     * <b>Amtsgericht Garmisch-Partenkirchen</b>
     *  * <p>
     *  *  Code: D2707
     *  * <p>
     *  * 
     */
    @JsonProperty("D2707")
    @XmlEnumValue("D2707")
    Amtsgericht_Garmisch_Partenkirchen("D2707"),

    /**
     * <b>Grundbuchamt Garmisch-Partenkirchen</b>
     *  * <p>
     *  *  Code: D2707G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2707G")
    @XmlEnumValue("D2707G")
    Grundbuchamt_Garmisch_Partenkirchen("D2707G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Geisenfeld</b>
     *  * <p>
     *  *  Code: D2708
     *  * <p>
     *  * 
     */
    @JsonProperty("D2708")
    @XmlEnumValue("D2708")
    aufgeloest_Amtsgericht_Geisenfeld("D2708"),

    /**
     * <b>Amtsgericht Miesbach</b>
     *  * <p>
     *  *  Code: D2710
     *  * <p>
     *  * 
     */
    @JsonProperty("D2710")
    @XmlEnumValue("D2710")
    Amtsgericht_Miesbach("D2710"),

    /**
     * <b>Grundbuchamt Miesbach</b>
     *  * <p>
     *  *  Code: D2710G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2710G")
    @XmlEnumValue("D2710G")
    Grundbuchamt_Miesbach("D2710G"),

    /**
     * <b>Amtsgericht Starnberg</b>
     *  * <p>
     *  *  Code: D2712
     *  * <p>
     *  * 
     */
    @JsonProperty("D2712")
    @XmlEnumValue("D2712")
    Amtsgericht_Starnberg("D2712"),

    /**
     * <b>Grundbuchamt Starnberg</b>
     *  * <p>
     *  *  Code: D2712G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2712G")
    @XmlEnumValue("D2712G")
    Grundbuchamt_Starnberg("D2712G"),

    /**
     * <b>Amtsgericht Weilheim</b>
     *  * <p>
     *  *  Code: D2713
     *  * <p>
     *  * 
     */
    @JsonProperty("D2713")
    @XmlEnumValue("D2713")
    Amtsgericht_Weilheim("D2713"),

    /**
     * <b>Grundbuchamt Weilheim</b>
     *  * <p>
     *  *  Code: D2713G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2713G")
    @XmlEnumValue("D2713G")
    Grundbuchamt_Weilheim("D2713G"),

    /**
     * <b>Amtsgericht Wolfratshausen</b>
     *  * <p>
     *  *  Code: D2714
     *  * <p>
     *  * 
     */
    @JsonProperty("D2714")
    @XmlEnumValue("D2714")
    Amtsgericht_Wolfratshausen("D2714"),

    /**
     * <b>Grundbuchamt Wolfratshausen</b>
     *  * <p>
     *  *  Code: D2714G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2714G")
    @XmlEnumValue("D2714G")
    Grundbuchamt_Wolfratshausen("D2714G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Miesbach, Zwst. Tegernsee</b>
     *  * <p>
     *  *  Code: D2715
     *  * <p>
     *  * 
     */
    @JsonProperty("D2715")
    @XmlEnumValue("D2715")
    aufgeloest_Amtsgericht_Miesbach_Zwst_Tegernsee("D2715"),

    /**
     * <b>Landgericht M&#252;nchen II Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsger. Garmisch-Partenkirchen</b>
     *  * <p>
     *  *  Code: D2720
     *  * <p>
     *  * 
     */
    @JsonProperty("D2720")
    @XmlEnumValue("D2720")
    Landgericht_Muenchen_II_Auswaertige_Strafvollstreckungskammer_b_d_Amtsger_Garmisch_Partenkirchen("D2720"),

    /**
     * <b>Landgericht Passau</b>
     *  * <p>
     *  *  Code: D2800
     *  * <p>
     *  * 
     */
    @JsonProperty("D2800")
    @XmlEnumValue("D2800")
    Landgericht_Passau("D2800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Passau</b>
     *  * <p>
     *  *  Code: D2800S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2800S")
    @XmlEnumValue("D2800S")
    Staatsanwaltschaft_beim_Landgericht_Passau("D2800S"),

    /**
     * <b>Amtsgericht Freyung</b>
     *  * <p>
     *  *  Code: D2801
     *  * <p>
     *  * 
     */
    @JsonProperty("D2801")
    @XmlEnumValue("D2801")
    Amtsgericht_Freyung("D2801"),

    /**
     * <b>Grundbuchamt Freyung</b>
     *  * <p>
     *  *  Code: D2801G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2801G")
    @XmlEnumValue("D2801G")
    Grundbuchamt_Freyung("D2801G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Passau, Zwst. Griesbach i. Rottal</b>
     *  * <p>
     *  *  Code: D2802
     *  * <p>
     *  * 
     */
    @JsonProperty("D2802")
    @XmlEnumValue("D2802")
    aufgeloest_Amtsgericht_Passau_Zwst_Griesbach_i_Rottal("D2802"),

    /**
     * <b>Amtsgericht Passau</b>
     *  * <p>
     *  *  Code: D2803
     *  * <p>
     *  * 
     */
    @JsonProperty("D2803")
    @XmlEnumValue("D2803")
    Amtsgericht_Passau("D2803"),

    /**
     * <b>Grundbuchamt Passau</b>
     *  * <p>
     *  *  Code: D2803G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2803G")
    @XmlEnumValue("D2803G")
    Grundbuchamt_Passau("D2803G"),

    /**
     * <b>Registergericht Amtsgericht Passau</b>
     *  * <p>
     *  *  Code: D2803V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2803V")
    @XmlEnumValue("D2803V")
    Registergericht_Amtsgericht_Passau("D2803V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Pfarrkirchen</b>
     *  * <p>
     *  *  Code: D2804
     *  * <p>
     *  * 
     */
    @JsonProperty("D2804")
    @XmlEnumValue("D2804")
    aufgeloest_Amtsgericht_Pfarrkirchen("D2804"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Passau Zweigstelle Rotthalm&#252;nster</b>
     *  * <p>
     *  *  Code: D2805
     *  * <p>
     *  * 
     */
    @JsonProperty("D2805")
    @XmlEnumValue("D2805")
    aufgeloest_Amtsgericht_Passau_Zweigstelle_Rotthalmuenster("D2805"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Simbach a. Inn</b>
     *  * <p>
     *  *  Code: D2806
     *  * <p>
     *  * 
     */
    @JsonProperty("D2806")
    @XmlEnumValue("D2806")
    aufgeloest_Amtsgericht_Simbach_a_Inn("D2806"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Passau, Zweigstelle Vilshofen</b>
     *  * <p>
     *  *  Code: D2807
     *  * <p>
     *  * 
     */
    @JsonProperty("D2807")
    @XmlEnumValue("D2807")
    aufgeloest_Amtsgericht_Passau_Zweigstelle_Vilshofen("D2807"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freyung, Zwst. Waldkirchen</b>
     *  * <p>
     *  *  Code: D2808
     *  * <p>
     *  * 
     */
    @JsonProperty("D2808")
    @XmlEnumValue("D2808")
    aufgeloest_Amtsgericht_Freyung_Zwst_Waldkirchen("D2808"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Passau, Zwst. Wegscheid</b>
     *  * <p>
     *  *  Code: D2809
     *  * <p>
     *  * 
     */
    @JsonProperty("D2809")
    @XmlEnumValue("D2809")
    aufgeloest_Amtsgericht_Passau_Zwst_Wegscheid("D2809"),

    /**
     * <b>Landgericht Traunstein</b>
     *  * <p>
     *  *  Code: D2900
     *  * <p>
     *  * 
     */
    @JsonProperty("D2900")
    @XmlEnumValue("D2900")
    Landgericht_Traunstein("D2900"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Traunstein</b>
     *  * <p>
     *  *  Code: D2900S
     *  * <p>
     *  * 
     */
    @JsonProperty("D2900S")
    @XmlEnumValue("D2900S")
    Staatsanwaltschaft_beim_Landgericht_Traunstein("D2900S"),

    /**
     * <b>Amtsgericht Alt&#246;tting</b>
     *  * <p>
     *  *  Code: D2901
     *  * <p>
     *  * 
     */
    @JsonProperty("D2901")
    @XmlEnumValue("D2901")
    Amtsgericht_Altoetting("D2901"),

    /**
     * <b>Grundbuchamt Alt&#246;tting</b>
     *  * <p>
     *  *  Code: D2901G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2901G")
    @XmlEnumValue("D2901G")
    Grundbuchamt_Altoetting("D2901G"),

    /**
     * <b>Amtsgericht Rosenheim Zweigstelle Bad Aibling</b>
     *  * <p>
     *  *  Code: D2902
     *  * <p>
     *  * 
     */
    @JsonProperty("D2902")
    @XmlEnumValue("D2902")
    Amtsgericht_Rosenheim_Zweigstelle_Bad_Aibling("D2902"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Reichenhall</b>
     *  * <p>
     *  *  Code: D2903
     *  * <p>
     *  * 
     */
    @JsonProperty("D2903")
    @XmlEnumValue("D2903")
    aufgeloest_Amtsgericht_Bad_Reichenhall("D2903"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Berchtesgaden</b>
     *  * <p>
     *  *  Code: D2904
     *  * <p>
     *  * 
     */
    @JsonProperty("D2904")
    @XmlEnumValue("D2904")
    aufgeloest_Amtsgericht_Berchtesgaden("D2904"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Alt&#246;tting Zweigstelle Burghausen/Obb.</b>
     *  * <p>
     *  *  Code: D2905
     *  * <p>
     *  * 
     */
    @JsonProperty("D2905")
    @XmlEnumValue("D2905")
    aufgeloest_Amtsgericht_Altoetting_Zweigstelle_Burghausen_Obb("D2905"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Haag i. OB</b>
     *  * <p>
     *  *  Code: D2906
     *  * <p>
     *  * 
     */
    @JsonProperty("D2906")
    @XmlEnumValue("D2906")
    aufgeloest_Amtsgericht_Haag_i_OB("D2906"),

    /**
     * <b>Amtsgericht Laufen</b>
     *  * <p>
     *  *  Code: D2907
     *  * <p>
     *  * 
     */
    @JsonProperty("D2907")
    @XmlEnumValue("D2907")
    Amtsgericht_Laufen("D2907"),

    /**
     * <b>Grundbuchamt Laufen</b>
     *  * <p>
     *  *  Code: D2907G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2907G")
    @XmlEnumValue("D2907G")
    Grundbuchamt_Laufen("D2907G"),

    /**
     * <b>Amtsgericht M&#252;hldorf</b>
     *  * <p>
     *  *  Code: D2908
     *  * <p>
     *  * 
     */
    @JsonProperty("D2908")
    @XmlEnumValue("D2908")
    Amtsgericht_Muehldorf("D2908"),

    /**
     * <b>Grundbuchamt M&#252;hldorf</b>
     *  * <p>
     *  *  Code: D2908G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2908G")
    @XmlEnumValue("D2908G")
    Grundbuchamt_Muehldorf("D2908G"),

    /**
     * <b>Amtsgericht Rosenheim</b>
     *  * <p>
     *  *  Code: D2909
     *  * <p>
     *  * 
     */
    @JsonProperty("D2909")
    @XmlEnumValue("D2909")
    Amtsgericht_Rosenheim("D2909"),

    /**
     * <b>Grundbuchamt Rosenheim</b>
     *  * <p>
     *  *  Code: D2909G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2909G")
    @XmlEnumValue("D2909G")
    Grundbuchamt_Rosenheim("D2909G"),

    /**
     * <b>Amtsgericht Traunstein</b>
     *  * <p>
     *  *  Code: D2910
     *  * <p>
     *  * 
     */
    @JsonProperty("D2910")
    @XmlEnumValue("D2910")
    Amtsgericht_Traunstein("D2910"),

    /**
     * <b>Grundbuchamt Traunstein</b>
     *  * <p>
     *  *  Code: D2910G
     *  * <p>
     *  * 
     */
    @JsonProperty("D2910G")
    @XmlEnumValue("D2910G")
    Grundbuchamt_Traunstein("D2910G"),

    /**
     * <b>Registergericht Amtsgericht Traunstein</b>
     *  * <p>
     *  *  Code: D2910V
     *  * <p>
     *  * 
     */
    @JsonProperty("D2910V")
    @XmlEnumValue("D2910V")
    Registergericht_Amtsgericht_Traunstein("D2910V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Trostberg</b>
     *  * <p>
     *  *  Code: D2911
     *  * <p>
     *  * 
     */
    @JsonProperty("D2911")
    @XmlEnumValue("D2911")
    aufgeloest_Amtsgericht_Trostberg("D2911"),

    /**
     * <b>Amtsgericht Rosenheim Zweigstelle Wasserburg a. Inn</b>
     *  * <p>
     *  *  Code: D2912
     *  * <p>
     *  * 
     */
    @JsonProperty("D2912")
    @XmlEnumValue("D2912")
    Amtsgericht_Rosenheim_Zweigstelle_Wasserburg_a_Inn("D2912"),

    /**
     * <b>Landgericht Traunstein Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht M&#252;hldorf</b>
     *  * <p>
     *  *  Code: D2920
     *  * <p>
     *  * 
     */
    @JsonProperty("D2920")
    @XmlEnumValue("D2920")
    Landgericht_Traunstein_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Muehldorf("D2920"),

    /**
     * <b>Oberlandesgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D3000
     *  * <p>
     *  * 
     */
    @JsonProperty("D3000")
    @XmlEnumValue("D3000")
    Oberlandesgericht_Nuernberg("D3000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D3000S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3000S")
    @XmlEnumValue("D3000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Nuernberg("D3000S"),

    /**
     * <b>Landgericht Amberg</b>
     *  * <p>
     *  *  Code: D3100
     *  * <p>
     *  * 
     */
    @JsonProperty("D3100")
    @XmlEnumValue("D3100")
    Landgericht_Amberg("D3100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Amberg</b>
     *  * <p>
     *  *  Code: D3100S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3100S")
    @XmlEnumValue("D3100S")
    Staatsanwaltschaft_beim_Landgericht_Amberg("D3100S"),

    /**
     * <b>Amtsgericht Amberg</b>
     *  * <p>
     *  *  Code: D3101
     *  * <p>
     *  * 
     */
    @JsonProperty("D3101")
    @XmlEnumValue("D3101")
    Amtsgericht_Amberg("D3101"),

    /**
     * <b>Grundbuchamt Amberg</b>
     *  * <p>
     *  *  Code: D3101G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3101G")
    @XmlEnumValue("D3101G")
    Grundbuchamt_Amberg("D3101G"),

    /**
     * <b>Registergericht Amtsgericht Amberg</b>
     *  * <p>
     *  *  Code: D3101V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3101V")
    @XmlEnumValue("D3101V")
    Registergericht_Amtsgericht_Amberg("D3101V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle Furth i. Wald</b>
     *  * <p>
     *  *  Code: D3103
     *  * <p>
     *  * 
     */
    @JsonProperty("D3103")
    @XmlEnumValue("D3103")
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Furth_i_Wald("D3103"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schwandorf, Zweigstelle Nabburg</b>
     *  * <p>
     *  *  Code: D3104
     *  * <p>
     *  * 
     */
    @JsonProperty("D3104")
    @XmlEnumValue("D3104")
    aufgeloest_Amtsgericht_Schwandorf_Zweigstelle_Nabburg("D3104"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neunburg vorm Wald</b>
     *  * <p>
     *  *  Code: D3105
     *  * <p>
     *  * 
     */
    @JsonProperty("D3105")
    @XmlEnumValue("D3105")
    aufgeloest_Amtsgericht_Neunburg_vorm_Wald("D3105"),

    /**
     * <b>Amtsgericht Schwandorf</b>
     *  * <p>
     *  *  Code: D3106
     *  * <p>
     *  * 
     */
    @JsonProperty("D3106")
    @XmlEnumValue("D3106")
    Amtsgericht_Schwandorf("D3106"),

    /**
     * <b>Grundbuchamt Schwandorf</b>
     *  * <p>
     *  *  Code: D3106G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3106G")
    @XmlEnumValue("D3106G")
    Grundbuchamt_Schwandorf("D3106G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sulzbach-Rosenberg</b>
     *  * <p>
     *  *  Code: D3107
     *  * <p>
     *  * 
     */
    @JsonProperty("D3107")
    @XmlEnumValue("D3107")
    aufgeloest_Amtsgericht_Sulzbach_Rosenberg("D3107"),

    /**
     * <b>Amtsgericht Cham Zweigstelle Waldm&#252;nchen</b>
     *  * <p>
     *  *  Code: D3108
     *  * <p>
     *  * 
     */
    @JsonProperty("D3108")
    @XmlEnumValue("D3108")
    Amtsgericht_Cham_Zweigstelle_Waldmuenchen("D3108"),

    /**
     * <b>Landgericht Ansbach</b>
     *  * <p>
     *  *  Code: D3200
     *  * <p>
     *  * 
     */
    @JsonProperty("D3200")
    @XmlEnumValue("D3200")
    Landgericht_Ansbach("D3200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Ansbach</b>
     *  * <p>
     *  *  Code: D3200S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3200S")
    @XmlEnumValue("D3200S")
    Staatsanwaltschaft_beim_Landgericht_Ansbach("D3200S"),

    /**
     * <b>Amtsgericht Ansbach</b>
     *  * <p>
     *  *  Code: D3201
     *  * <p>
     *  * 
     */
    @JsonProperty("D3201")
    @XmlEnumValue("D3201")
    Amtsgericht_Ansbach("D3201"),

    /**
     * <b>Grundbuchamt Ansbach</b>
     *  * <p>
     *  *  Code: D3201G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3201G")
    @XmlEnumValue("D3201G")
    Grundbuchamt_Ansbach("D3201G"),

    /**
     * <b>Registergericht Amtsgericht Ansbach</b>
     *  * <p>
     *  *  Code: D3201V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3201V")
    @XmlEnumValue("D3201V")
    Registergericht_Amtsgericht_Ansbach("D3201V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ansbach Zweigstelle Dinkelsb&#252;hl</b>
     *  * <p>
     *  *  Code: D3202
     *  * <p>
     *  * 
     */
    @JsonProperty("D3202")
    @XmlEnumValue("D3202")
    aufgeloest_Amtsgericht_Ansbach_Zweigstelle_Dinkelsbuehl("D3202"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wei&#223;enburg i. Bay., Zwst. Gunzenhausen</b>
     *  * <p>
     *  *  Code: D3203
     *  * <p>
     *  * 
     */
    @JsonProperty("D3203")
    @XmlEnumValue("D3203")
    aufgeloest_Amtsgericht_Weissenburg_i_Bay_Zwst_Gunzenhausen("D3203"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ansbach Zweigstelle Rothenburg o.d. Tauber</b>
     *  * <p>
     *  *  Code: D3204
     *  * <p>
     *  * 
     */
    @JsonProperty("D3204")
    @XmlEnumValue("D3204")
    aufgeloest_Amtsgericht_Ansbach_Zweigstelle_Rothenburg_o_d_Tauber("D3204"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Uffenheim</b>
     *  * <p>
     *  *  Code: D3205
     *  * <p>
     *  * 
     */
    @JsonProperty("D3205")
    @XmlEnumValue("D3205")
    aufgeloest_Amtsgericht_Uffenheim("D3205"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dinkelsb&#252;hl, Zwst. Feuchtwangen</b>
     *  * <p>
     *  *  Code: D3206
     *  * <p>
     *  * 
     */
    @JsonProperty("D3206")
    @XmlEnumValue("D3206")
    aufgeloest_Amtsgericht_Dinkelsbuehl_Zwst_Feuchtwangen("D3206"),

    /**
     * <b>Amtsgericht Wei&#223;enburg i. Bay.</b>
     *  * <p>
     *  *  Code: D3208
     *  * <p>
     *  * 
     */
    @JsonProperty("D3208")
    @XmlEnumValue("D3208")
    Amtsgericht_Weissenburg_i_Bay("D3208"),

    /**
     * <b>Grundbuchamt Wei&#223;enburg</b>
     *  * <p>
     *  *  Code: D3208G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3208G")
    @XmlEnumValue("D3208G")
    Grundbuchamt_Weissenburg("D3208G"),

    /**
     * <b>Landgericht N&#252;rnberg-F&#252;rth</b>
     *  * <p>
     *  *  Code: D3300
     *  * <p>
     *  * 
     */
    @JsonProperty("D3300")
    @XmlEnumValue("D3300")
    Landgericht_Nuernberg_Fuerth("D3300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht N&#252;rnberg-F&#252;rth</b>
     *  * <p>
     *  *  Code: D3300S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3300S")
    @XmlEnumValue("D3300S")
    Staatsanwaltschaft_beim_Landgericht_Nuernberg_Fuerth("D3300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Beilngries</b>
     *  * <p>
     *  *  Code: D3301
     *  * <p>
     *  * 
     */
    @JsonProperty("D3301")
    @XmlEnumValue("D3301")
    aufgeloest_Amtsgericht_Beilngries("D3301"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ingolstadt, Zwst. Eichst&#228;tt</b>
     *  * <p>
     *  *  Code: D3302
     *  * <p>
     *  * 
     */
    @JsonProperty("D3302")
    @XmlEnumValue("D3302")
    aufgeloest_Amtsgericht_Ingolstadt_Zwst_Eichstaett("D3302"),

    /**
     * <b>Amtsgericht Erlangen</b>
     *  * <p>
     *  *  Code: D3303
     *  * <p>
     *  * 
     */
    @JsonProperty("D3303")
    @XmlEnumValue("D3303")
    Amtsgericht_Erlangen("D3303"),

    /**
     * <b>Grundbuchamt Erlangen</b>
     *  * <p>
     *  *  Code: D3303G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3303G")
    @XmlEnumValue("D3303G")
    Grundbuchamt_Erlangen("D3303G"),

    /**
     * <b>Amtsgericht F&#252;rth (Bayern)</b>
     *  * <p>
     *  *  Code: D3304
     *  * <p>
     *  * 
     */
    @JsonProperty("D3304")
    @XmlEnumValue("D3304")
    Amtsgericht_Fuerth_Bayern("D3304"),

    /**
     * <b>Grundbuchamt F&#252;rth (Bayern)</b>
     *  * <p>
     *  *  Code: D3304G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3304G")
    @XmlEnumValue("D3304G")
    Grundbuchamt_Fuerth_Bayern("D3304G"),

    /**
     * <b>Registergericht Amtsgericht F&#252;rth</b>
     *  * <p>
     *  *  Code: D3304V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3304V")
    @XmlEnumValue("D3304V")
    Registergericht_Amtsgericht_Fuerth("D3304V"),

    /**
     * <b>Amtsgericht Hersbruck</b>
     *  * <p>
     *  *  Code: D3305
     *  * <p>
     *  * 
     */
    @JsonProperty("D3305")
    @XmlEnumValue("D3305")
    Amtsgericht_Hersbruck("D3305"),

    /**
     * <b>Grundbuchamt Hersbruck</b>
     *  * <p>
     *  *  Code: D3305G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3305G")
    @XmlEnumValue("D3305G")
    Grundbuchamt_Hersbruck("D3305G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schwabach Zweigstelle Hilpoltstein</b>
     *  * <p>
     *  *  Code: D3306
     *  * <p>
     *  * 
     */
    @JsonProperty("D3306")
    @XmlEnumValue("D3306")
    aufgeloest_Amtsgericht_Schwabach_Zweigstelle_Hilpoltstein("D3306"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hersbruck, Zwst. Lauf (Pegnitz)</b>
     *  * <p>
     *  *  Code: D3307
     *  * <p>
     *  * 
     */
    @JsonProperty("D3307")
    @XmlEnumValue("D3307")
    aufgeloest_Amtsgericht_Hersbruck_Zwst_Lauf_Pegnitz("D3307"),

    /**
     * <b>Amtsgericht Neumarkt</b>
     *  * <p>
     *  *  Code: D3308
     *  * <p>
     *  * 
     */
    @JsonProperty("D3308")
    @XmlEnumValue("D3308")
    Amtsgericht_Neumarkt("D3308"),

    /**
     * <b>Grundbuchamt Neumarkt</b>
     *  * <p>
     *  *  Code: D3308G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3308G")
    @XmlEnumValue("D3308G")
    Grundbuchamt_Neumarkt("D3308G"),

    /**
     * <b>Amtsgericht Neustadt (an der Aisch)</b>
     *  * <p>
     *  *  Code: D3309
     *  * <p>
     *  * 
     */
    @JsonProperty("D3309")
    @XmlEnumValue("D3309")
    Amtsgericht_Neustadt_an_der_Aisch("D3309"),

    /**
     * <b>Grundbuchamt Neustadt</b>
     *  * <p>
     *  *  Code: D3309G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3309G")
    @XmlEnumValue("D3309G")
    Grundbuchamt_Neustadt("D3309G"),

    /**
     * <b>Amtsgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D3310
     *  * <p>
     *  * 
     */
    @JsonProperty("D3310")
    @XmlEnumValue("D3310")
    Amtsgericht_Nuernberg("D3310"),

    /**
     * <b>Grundbuchamt N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D3310G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3310G")
    @XmlEnumValue("D3310G")
    Grundbuchamt_Nuernberg("D3310G"),

    /**
     * <b>Registergericht Amtsgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D3310V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3310V")
    @XmlEnumValue("D3310V")
    Registergericht_Amtsgericht_Nuernberg("D3310V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Roth</b>
     *  * <p>
     *  *  Code: D3311
     *  * <p>
     *  * 
     */
    @JsonProperty("D3311")
    @XmlEnumValue("D3311")
    aufgeloest_Amtsgericht_Roth("D3311"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neustadt a. d. Aisch, Zwst. Scheinfeld</b>
     *  * <p>
     *  *  Code: D3312
     *  * <p>
     *  * 
     */
    @JsonProperty("D3312")
    @XmlEnumValue("D3312")
    aufgeloest_Amtsgericht_Neustadt_a_d_Aisch_Zwst_Scheinfeld("D3312"),

    /**
     * <b>Amtsgericht Schwabach</b>
     *  * <p>
     *  *  Code: D3313
     *  * <p>
     *  * 
     */
    @JsonProperty("D3313")
    @XmlEnumValue("D3313")
    Amtsgericht_Schwabach("D3313"),

    /**
     * <b>Grundbuchamt Schwabach</b>
     *  * <p>
     *  *  Code: D3313G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3313G")
    @XmlEnumValue("D3313G")
    Grundbuchamt_Schwabach("D3313G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Windsheim</b>
     *  * <p>
     *  *  Code: D3315
     *  * <p>
     *  * 
     */
    @JsonProperty("D3315")
    @XmlEnumValue("D3315")
    aufgeloest_Amtsgericht_Windsheim("D3315"),

    /**
     * <b>aufgel&#246;st-Amtsgericht N&#252;rnberg, Zwst. Altdorf</b>
     *  * <p>
     *  *  Code: D3316
     *  * <p>
     *  * 
     */
    @JsonProperty("D3316")
    @XmlEnumValue("D3316")
    aufgeloest_Amtsgericht_Nuernberg_Zwst_Altdorf("D3316"),

    /**
     * <b>Landgericht Regensburg</b>
     *  * <p>
     *  *  Code: D3400
     *  * <p>
     *  * 
     */
    @JsonProperty("D3400")
    @XmlEnumValue("D3400")
    Landgericht_Regensburg("D3400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Regensburg</b>
     *  * <p>
     *  *  Code: D3400S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3400S")
    @XmlEnumValue("D3400S")
    Staatsanwaltschaft_beim_Landgericht_Regensburg("D3400S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Abensberg</b>
     *  * <p>
     *  *  Code: D3401
     *  * <p>
     *  * 
     */
    @JsonProperty("D3401")
    @XmlEnumValue("D3401")
    aufgeloest_Amtsgericht_Abensberg("D3401"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Straubing, Zwst. Bogen</b>
     *  * <p>
     *  *  Code: D3402
     *  * <p>
     *  * 
     */
    @JsonProperty("D3402")
    @XmlEnumValue("D3402")
    aufgeloest_Amtsgericht_Straubing_Zwst_Bogen("D3402"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schwandorf Zweigstelle Burglengenfeld</b>
     *  * <p>
     *  *  Code: D3403
     *  * <p>
     *  * 
     */
    @JsonProperty("D3403")
    @XmlEnumValue("D3403")
    aufgeloest_Amtsgericht_Schwandorf_Zweigstelle_Burglengenfeld("D3403"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hemau</b>
     *  * <p>
     *  *  Code: D3404
     *  * <p>
     *  * 
     */
    @JsonProperty("D3404")
    @XmlEnumValue("D3404")
    aufgeloest_Amtsgericht_Hemau("D3404"),

    /**
     * <b>Amtsgericht Kelheim</b>
     *  * <p>
     *  *  Code: D3405
     *  * <p>
     *  * 
     */
    @JsonProperty("D3405")
    @XmlEnumValue("D3405")
    Amtsgericht_Kelheim("D3405"),

    /**
     * <b>Grundbuchamt Kelheim</b>
     *  * <p>
     *  *  Code: D3405G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3405G")
    @XmlEnumValue("D3405G")
    Grundbuchamt_Kelheim("D3405G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle K&#246;tzting</b>
     *  * <p>
     *  *  Code: D3406
     *  * <p>
     *  * 
     */
    @JsonProperty("D3406")
    @XmlEnumValue("D3406")
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Koetzting("D3406"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Mitterfels</b>
     *  * <p>
     *  *  Code: D3407
     *  * <p>
     *  * 
     */
    @JsonProperty("D3407")
    @XmlEnumValue("D3407")
    aufgeloest_Amtsgericht_Mitterfels("D3407"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neukirchen b. Hl. Blut</b>
     *  * <p>
     *  *  Code: D3408
     *  * <p>
     *  * 
     */
    @JsonProperty("D3408")
    @XmlEnumValue("D3408")
    aufgeloest_Amtsgericht_Neukirchen_b_Hl_Blut("D3408"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Parsberg</b>
     *  * <p>
     *  *  Code: D3409
     *  * <p>
     *  * 
     */
    @JsonProperty("D3409")
    @XmlEnumValue("D3409")
    aufgeloest_Amtsgericht_Parsberg("D3409"),

    /**
     * <b>Amtsgericht Regensburg</b>
     *  * <p>
     *  *  Code: D3410
     *  * <p>
     *  * 
     */
    @JsonProperty("D3410")
    @XmlEnumValue("D3410")
    Amtsgericht_Regensburg("D3410"),

    /**
     * <b>Grundbuchamt Regensburg</b>
     *  * <p>
     *  *  Code: D3410G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3410G")
    @XmlEnumValue("D3410G")
    Grundbuchamt_Regensburg("D3410G"),

    /**
     * <b>Registergericht Amtsgericht Regensburg</b>
     *  * <p>
     *  *  Code: D3410V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3410V")
    @XmlEnumValue("D3410V")
    Registergericht_Amtsgericht_Regensburg("D3410V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Riedenburg</b>
     *  * <p>
     *  *  Code: D3411
     *  * <p>
     *  * 
     */
    @JsonProperty("D3411")
    @XmlEnumValue("D3411")
    aufgeloest_Amtsgericht_Riedenburg("D3411"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle Roding</b>
     *  * <p>
     *  *  Code: D3412
     *  * <p>
     *  * 
     */
    @JsonProperty("D3412")
    @XmlEnumValue("D3412")
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Roding("D3412"),

    /**
     * <b>Amtsgericht Straubing</b>
     *  * <p>
     *  *  Code: D3413
     *  * <p>
     *  * 
     */
    @JsonProperty("D3413")
    @XmlEnumValue("D3413")
    Amtsgericht_Straubing("D3413"),

    /**
     * <b>Grundbuchamt Straubing</b>
     *  * <p>
     *  *  Code: D3413G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3413G")
    @XmlEnumValue("D3413G")
    Grundbuchamt_Straubing("D3413G"),

    /**
     * <b>Registergericht Amtsgericht Straubing</b>
     *  * <p>
     *  *  Code: D3413V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3413V")
    @XmlEnumValue("D3413V")
    Registergericht_Amtsgericht_Straubing("D3413V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Roding, Zwst. Nittenau</b>
     *  * <p>
     *  *  Code: D3414
     *  * <p>
     *  * 
     */
    @JsonProperty("D3414")
    @XmlEnumValue("D3414")
    aufgeloest_Amtsgericht_Roding_Zwst_Nittenau("D3414"),

    /**
     * <b>Amtsgericht Cham</b>
     *  * <p>
     *  *  Code: D3415
     *  * <p>
     *  * 
     */
    @JsonProperty("D3415")
    @XmlEnumValue("D3415")
    Amtsgericht_Cham("D3415"),

    /**
     * <b>Grundbuchamt Cham</b>
     *  * <p>
     *  *  Code: D3415G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3415G")
    @XmlEnumValue("D3415G")
    Grundbuchamt_Cham("D3415G"),

    /**
     * <b>Landgericht Regensburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Straubing</b>
     *  * <p>
     *  *  Code: D3420
     *  * <p>
     *  * 
     */
    @JsonProperty("D3420")
    @XmlEnumValue("D3420")
    Landgericht_Regensburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Straubing("D3420"),

    /**
     * <b>Landgericht Weiden i. d. OPf.</b>
     *  * <p>
     *  *  Code: D3500
     *  * <p>
     *  * 
     */
    @JsonProperty("D3500")
    @XmlEnumValue("D3500")
    Landgericht_Weiden_i_d_OPf("D3500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Weiden i. d. Opf.</b>
     *  * <p>
     *  *  Code: D3500S
     *  * <p>
     *  * 
     */
    @JsonProperty("D3500S")
    @XmlEnumValue("D3500S")
    Staatsanwaltschaft_beim_Landgericht_Weiden_i_d_Opf("D3500S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Weiden i. d. OPf., Zwst. Eschenbach i. d. OPf.</b>
     *  * <p>
     *  *  Code: D3501
     *  * <p>
     *  * 
     */
    @JsonProperty("D3501")
    @XmlEnumValue("D3501")
    aufgeloest_Amtsgericht_Weiden_i_d_OPf_Zwst_Eschenbach_i_d_OPf("D3501"),

    /**
     * <b>Amtsgericht Tirschenreuth Zweigstelle Kemnath</b>
     *  * <p>
     *  *  Code: D3502
     *  * <p>
     *  * 
     */
    @JsonProperty("D3502")
    @XmlEnumValue("D3502")
    Amtsgericht_Tirschenreuth_Zweigstelle_Kemnath("D3502"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neustadt a. d. Waldnaab</b>
     *  * <p>
     *  *  Code: D3503
     *  * <p>
     *  * 
     */
    @JsonProperty("D3503")
    @XmlEnumValue("D3503")
    aufgeloest_Amtsgericht_Neustadt_a_d_Waldnaab("D3503"),

    /**
     * <b>Amtsgericht Schwandorf Zweigstelle Oberviechtach</b>
     *  * <p>
     *  *  Code: D3504
     *  * <p>
     *  * 
     */
    @JsonProperty("D3504")
    @XmlEnumValue("D3504")
    Amtsgericht_Schwandorf_Zweigstelle_Oberviechtach("D3504"),

    /**
     * <b>Amtsgericht Tirschenreuth</b>
     *  * <p>
     *  *  Code: D3505
     *  * <p>
     *  * 
     */
    @JsonProperty("D3505")
    @XmlEnumValue("D3505")
    Amtsgericht_Tirschenreuth("D3505"),

    /**
     * <b>Grundbuchamt Tirschenreuth</b>
     *  * <p>
     *  *  Code: D3505G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3505G")
    @XmlEnumValue("D3505G")
    Grundbuchamt_Tirschenreuth("D3505G"),

    /**
     * <b>Amtsgericht Weiden Zweigstelle Vohenstrau&#223;</b>
     *  * <p>
     *  *  Code: D3506
     *  * <p>
     *  * 
     */
    @JsonProperty("D3506")
    @XmlEnumValue("D3506")
    Amtsgericht_Weiden_Zweigstelle_Vohenstrauss("D3506"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Waldsassen</b>
     *  * <p>
     *  *  Code: D3507
     *  * <p>
     *  * 
     */
    @JsonProperty("D3507")
    @XmlEnumValue("D3507")
    aufgeloest_Amtsgericht_Waldsassen("D3507"),

    /**
     * <b>Amtsgericht Weiden i. d. OPf</b>
     *  * <p>
     *  *  Code: D3508
     *  * <p>
     *  * 
     */
    @JsonProperty("D3508")
    @XmlEnumValue("D3508")
    Amtsgericht_Weiden_i_d_OPf("D3508"),

    /**
     * <b>Grundbuchamt Weiden</b>
     *  * <p>
     *  *  Code: D3508G
     *  * <p>
     *  * 
     */
    @JsonProperty("D3508G")
    @XmlEnumValue("D3508G")
    Grundbuchamt_Weiden("D3508G"),

    /**
     * <b>Registergericht Amtsgericht Weiden</b>
     *  * <p>
     *  *  Code: D3508V
     *  * <p>
     *  * 
     */
    @JsonProperty("D3508V")
    @XmlEnumValue("D3508V")
    Registergericht_Amtsgericht_Weiden("D3508V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eschenbach/Opf., Au&#223;enstelle Auerbach</b>
     *  * <p>
     *  *  Code: D3509
     *  * <p>
     *  * 
     */
    @JsonProperty("D3509")
    @XmlEnumValue("D3509")
    aufgeloest_Amtsgericht_Eschenbach_Opf_Aussenstelle_Auerbach("D3509"),

    /**
     * <b>Oberlandesgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4000
     *  * <p>
     *  * 
     */
    @JsonProperty("D4000")
    @XmlEnumValue("D4000")
    Oberlandesgericht_Bamberg("D4000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4000S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4000S")
    @XmlEnumValue("D4000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Bamberg("D4000S"),

    /**
     * <b>Landgericht Aschaffenburg</b>
     *  * <p>
     *  *  Code: D4100
     *  * <p>
     *  * 
     */
    @JsonProperty("D4100")
    @XmlEnumValue("D4100")
    Landgericht_Aschaffenburg("D4100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Aschaffenburg</b>
     *  * <p>
     *  *  Code: D4100S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4100S")
    @XmlEnumValue("D4100S")
    Staatsanwaltschaft_beim_Landgericht_Aschaffenburg("D4100S"),

    /**
     * <b>Amtsgericht Aschaffenburg Zweigstelle Alzenau i.Ufr.</b>
     *  * <p>
     *  *  Code: D4101
     *  * <p>
     *  * 
     */
    @JsonProperty("D4101")
    @XmlEnumValue("D4101")
    Amtsgericht_Aschaffenburg_Zweigstelle_Alzenau_i_Ufr("D4101"),

    /**
     * <b>Amtsgericht Aschaffenburg</b>
     *  * <p>
     *  *  Code: D4102
     *  * <p>
     *  * 
     */
    @JsonProperty("D4102")
    @XmlEnumValue("D4102")
    Amtsgericht_Aschaffenburg("D4102"),

    /**
     * <b>Grundbuchamt Aschaffenburg</b>
     *  * <p>
     *  *  Code: D4102G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4102G")
    @XmlEnumValue("D4102G")
    Grundbuchamt_Aschaffenburg("D4102G"),

    /**
     * <b>Registergericht Amtsgericht Aschaffenburg</b>
     *  * <p>
     *  *  Code: D4102V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4102V")
    @XmlEnumValue("D4102V")
    Registergericht_Amtsgericht_Aschaffenburg("D4102V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gem&#252;nden a. Main, Zwst. Lohr a. Main</b>
     *  * <p>
     *  *  Code: D4103
     *  * <p>
     *  * 
     */
    @JsonProperty("D4103")
    @XmlEnumValue("D4103")
    aufgeloest_Amtsgericht_Gemuenden_a_Main_Zwst_Lohr_a_Main("D4103"),

    /**
     * <b>Amtsgericht Obernburg Zweigstelle Miltenberg</b>
     *  * <p>
     *  *  Code: D4104
     *  * <p>
     *  * 
     */
    @JsonProperty("D4104")
    @XmlEnumValue("D4104")
    Amtsgericht_Obernburg_Zweigstelle_Miltenberg("D4104"),

    /**
     * <b>Amtsgericht Obernburg</b>
     *  * <p>
     *  *  Code: D4105
     *  * <p>
     *  * 
     */
    @JsonProperty("D4105")
    @XmlEnumValue("D4105")
    Amtsgericht_Obernburg("D4105"),

    /**
     * <b>Grundbuchamt Obernburg</b>
     *  * <p>
     *  *  Code: D4105G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4105G")
    @XmlEnumValue("D4105G")
    Grundbuchamt_Obernburg("D4105G"),

    /**
     * <b>Landgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4200
     *  * <p>
     *  * 
     */
    @JsonProperty("D4200")
    @XmlEnumValue("D4200")
    Landgericht_Bamberg("D4200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4200S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4200S")
    @XmlEnumValue("D4200S")
    Staatsanwaltschaft_beim_Landgericht_Bamberg("D4200S"),

    /**
     * <b>Amtsgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4201
     *  * <p>
     *  * 
     */
    @JsonProperty("D4201")
    @XmlEnumValue("D4201")
    Amtsgericht_Bamberg("D4201"),

    /**
     * <b>Grundbuchamt Bamberg</b>
     *  * <p>
     *  *  Code: D4201G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4201G")
    @XmlEnumValue("D4201G")
    Grundbuchamt_Bamberg("D4201G"),

    /**
     * <b>Registergericht Amtsgericht Bamberg</b>
     *  * <p>
     *  *  Code: D4201V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4201V")
    @XmlEnumValue("D4201V")
    Registergericht_Amtsgericht_Bamberg("D4201V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ha&#223;furt, Zweigstelle Ebern</b>
     *  * <p>
     *  *  Code: D4202
     *  * <p>
     *  * 
     */
    @JsonProperty("D4202")
    @XmlEnumValue("D4202")
    aufgeloest_Amtsgericht_Hassfurt_Zweigstelle_Ebern("D4202"),

    /**
     * <b>Amtsgericht Forchheim</b>
     *  * <p>
     *  *  Code: D4203
     *  * <p>
     *  * 
     */
    @JsonProperty("D4203")
    @XmlEnumValue("D4203")
    Amtsgericht_Forchheim("D4203"),

    /**
     * <b>Grundbuchamt Forchheim</b>
     *  * <p>
     *  *  Code: D4203G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4203G")
    @XmlEnumValue("D4203G")
    Grundbuchamt_Forchheim("D4203G"),

    /**
     * <b>Amtsgericht Ha&#223;furt</b>
     *  * <p>
     *  *  Code: D4204
     *  * <p>
     *  * 
     */
    @JsonProperty("D4204")
    @XmlEnumValue("D4204")
    Amtsgericht_Hassfurt("D4204"),

    /**
     * <b>Grundbuchamt Ha&#223;furt</b>
     *  * <p>
     *  *  Code: D4204G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4204G")
    @XmlEnumValue("D4204G")
    Grundbuchamt_Hassfurt("D4204G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hofheim i. Ufr.</b>
     *  * <p>
     *  *  Code: D4205
     *  * <p>
     *  * 
     */
    @JsonProperty("D4205")
    @XmlEnumValue("D4205")
    aufgeloest_Amtsgericht_Hofheim_i_Ufr("D4205"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Forchheim, Zwst. H&#246;chstadt a. d. Aisch</b>
     *  * <p>
     *  *  Code: D4206
     *  * <p>
     *  * 
     */
    @JsonProperty("D4206")
    @XmlEnumValue("D4206")
    aufgeloest_Amtsgericht_Forchheim_Zwst_Hoechstadt_a_d_Aisch("D4206"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Forchheim, Au&#223;enstelle Ebermannstadt</b>
     *  * <p>
     *  *  Code: D4207
     *  * <p>
     *  * 
     */
    @JsonProperty("D4207")
    @XmlEnumValue("D4207")
    aufgeloest_Amtsgericht_Forchheim_Aussenstelle_Ebermannstadt("D4207"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ha&#223;furt, Au&#223;enstelle Eltmann</b>
     *  * <p>
     *  *  Code: D4208
     *  * <p>
     *  * 
     */
    @JsonProperty("D4208")
    @XmlEnumValue("D4208")
    aufgeloest_Amtsgericht_Hassfurt_Aussenstelle_Eltmann("D4208"),

    /**
     * <b>Landgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D4300
     *  * <p>
     *  * 
     */
    @JsonProperty("D4300")
    @XmlEnumValue("D4300")
    Landgericht_Bayreuth("D4300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D4300S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4300S")
    @XmlEnumValue("D4300S")
    Staatsanwaltschaft_beim_Landgericht_Bayreuth("D4300S"),

    /**
     * <b>Amtsgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D4301
     *  * <p>
     *  * 
     */
    @JsonProperty("D4301")
    @XmlEnumValue("D4301")
    Amtsgericht_Bayreuth("D4301"),

    /**
     * <b>Grundbuchamt Bayreuth</b>
     *  * <p>
     *  *  Code: D4301G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4301G")
    @XmlEnumValue("D4301G")
    Grundbuchamt_Bayreuth("D4301G"),

    /**
     * <b>Registergericht Amtsgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D4301V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4301V")
    @XmlEnumValue("D4301V")
    Registergericht_Amtsgericht_Bayreuth("D4301V"),

    /**
     * <b>Amtsgericht Kulmbach</b>
     *  * <p>
     *  *  Code: D4302
     *  * <p>
     *  * 
     */
    @JsonProperty("D4302")
    @XmlEnumValue("D4302")
    Amtsgericht_Kulmbach("D4302"),

    /**
     * <b>Grundbuchamt Kulmbach</b>
     *  * <p>
     *  *  Code: D4302G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4302G")
    @XmlEnumValue("D4302G")
    Grundbuchamt_Kulmbach("D4302G"),

    /**
     * <b>Amtsgericht Bayreuth Zweigstelle Pegnitz</b>
     *  * <p>
     *  *  Code: D4303
     *  * <p>
     *  * 
     */
    @JsonProperty("D4303")
    @XmlEnumValue("D4303")
    Amtsgericht_Bayreuth_Zweigstelle_Pegnitz("D4303"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stadtsteinach</b>
     *  * <p>
     *  *  Code: D4304
     *  * <p>
     *  * 
     */
    @JsonProperty("D4304")
    @XmlEnumValue("D4304")
    aufgeloest_Amtsgericht_Stadtsteinach("D4304"),

    /**
     * <b>Landgericht Coburg</b>
     *  * <p>
     *  *  Code: D4400
     *  * <p>
     *  * 
     */
    @JsonProperty("D4400")
    @XmlEnumValue("D4400")
    Landgericht_Coburg("D4400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Coburg</b>
     *  * <p>
     *  *  Code: D4400S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4400S")
    @XmlEnumValue("D4400S")
    Staatsanwaltschaft_beim_Landgericht_Coburg("D4400S"),

    /**
     * <b>Amtsgericht Coburg</b>
     *  * <p>
     *  *  Code: D4401
     *  * <p>
     *  * 
     */
    @JsonProperty("D4401")
    @XmlEnumValue("D4401")
    Amtsgericht_Coburg("D4401"),

    /**
     * <b>Grundbuchamt Coburg</b>
     *  * <p>
     *  *  Code: D4401G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4401G")
    @XmlEnumValue("D4401G")
    Grundbuchamt_Coburg("D4401G"),

    /**
     * <b>Amtsgericht Coburg, Zentrales Mahngericht</b>
     *  * <p>
     *  *  Code: D4401M
     *  * <p>
     *  * 
     */
    @JsonProperty("D4401M")
    @XmlEnumValue("D4401M")
    Amtsgericht_Coburg_Zentrales_Mahngericht("D4401M"),

    /**
     * <b>Registergericht Amtsgericht Coburg</b>
     *  * <p>
     *  *  Code: D4401V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4401V")
    @XmlEnumValue("D4401V")
    Registergericht_Amtsgericht_Coburg("D4401V"),

    /**
     * <b>Amtsgericht Kronach</b>
     *  * <p>
     *  *  Code: D4402
     *  * <p>
     *  * 
     */
    @JsonProperty("D4402")
    @XmlEnumValue("D4402")
    Amtsgericht_Kronach("D4402"),

    /**
     * <b>Grundbuchamt Kronach</b>
     *  * <p>
     *  *  Code: D4402G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4402G")
    @XmlEnumValue("D4402G")
    Grundbuchamt_Kronach("D4402G"),

    /**
     * <b>Amtsgericht Lichtenfels</b>
     *  * <p>
     *  *  Code: D4403
     *  * <p>
     *  * 
     */
    @JsonProperty("D4403")
    @XmlEnumValue("D4403")
    Amtsgericht_Lichtenfels("D4403"),

    /**
     * <b>Grundbuchamt Lichtenfels</b>
     *  * <p>
     *  *  Code: D4403G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4403G")
    @XmlEnumValue("D4403G")
    Grundbuchamt_Lichtenfels("D4403G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kronach, Zwst. Ludwigsstadt</b>
     *  * <p>
     *  *  Code: D4404
     *  * <p>
     *  * 
     */
    @JsonProperty("D4404")
    @XmlEnumValue("D4404")
    aufgeloest_Amtsgericht_Kronach_Zwst_Ludwigsstadt("D4404"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Coburg, Zwst. Neustadt b. Coburg</b>
     *  * <p>
     *  *  Code: D4405
     *  * <p>
     *  * 
     */
    @JsonProperty("D4405")
    @XmlEnumValue("D4405")
    aufgeloest_Amtsgericht_Coburg_Zwst_Neustadt_b_Coburg("D4405"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lichtenfels, Au&#223;enstelle Staffelstein</b>
     *  * <p>
     *  *  Code: D4406
     *  * <p>
     *  * 
     */
    @JsonProperty("D4406")
    @XmlEnumValue("D4406")
    aufgeloest_Amtsgericht_Lichtenfels_Aussenstelle_Staffelstein("D4406"),

    /**
     * <b>Landgericht Coburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Kronach</b>
     *  * <p>
     *  *  Code: D4420
     *  * <p>
     *  * 
     */
    @JsonProperty("D4420")
    @XmlEnumValue("D4420")
    Landgericht_Coburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Kronach("D4420"),

    /**
     * <b>Landgericht Hof</b>
     *  * <p>
     *  *  Code: D4500
     *  * <p>
     *  * 
     */
    @JsonProperty("D4500")
    @XmlEnumValue("D4500")
    Landgericht_Hof("D4500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hof</b>
     *  * <p>
     *  *  Code: D4500S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4500S")
    @XmlEnumValue("D4500S")
    Staatsanwaltschaft_beim_Landgericht_Hof("D4500S"),

    /**
     * <b>Amtsgericht Hof</b>
     *  * <p>
     *  *  Code: D4501
     *  * <p>
     *  * 
     */
    @JsonProperty("D4501")
    @XmlEnumValue("D4501")
    Amtsgericht_Hof("D4501"),

    /**
     * <b>Grundbuchamt Hof</b>
     *  * <p>
     *  *  Code: D4501G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4501G")
    @XmlEnumValue("D4501G")
    Grundbuchamt_Hof("D4501G"),

    /**
     * <b>Amtsgericht Hof, Zentrales Vollstreckungsgericht Bayern</b>
     *  * <p>
     *  *  Code: D4501R
     *  * <p>
     *  * 
     */
    @JsonProperty("D4501R")
    @XmlEnumValue("D4501R")
    Amtsgericht_Hof_Zentrales_Vollstreckungsgericht_Bayern("D4501R"),

    /**
     * <b>Registergericht Amtsgericht Hof</b>
     *  * <p>
     *  *  Code: D4501V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4501V")
    @XmlEnumValue("D4501V")
    Registergericht_Amtsgericht_Hof("D4501V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht M&#252;nchberg</b>
     *  * <p>
     *  *  Code: D4502
     *  * <p>
     *  * 
     */
    @JsonProperty("D4502")
    @XmlEnumValue("D4502")
    aufgeloest_Amtsgericht_Muenchberg("D4502"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Naila</b>
     *  * <p>
     *  *  Code: D4503
     *  * <p>
     *  * 
     */
    @JsonProperty("D4503")
    @XmlEnumValue("D4503")
    aufgeloest_Amtsgericht_Naila("D4503"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Selb</b>
     *  * <p>
     *  *  Code: D4504
     *  * <p>
     *  * 
     */
    @JsonProperty("D4504")
    @XmlEnumValue("D4504")
    aufgeloest_Amtsgericht_Selb("D4504"),

    /**
     * <b>Amtsgericht Wunsiedel</b>
     *  * <p>
     *  *  Code: D4505
     *  * <p>
     *  * 
     */
    @JsonProperty("D4505")
    @XmlEnumValue("D4505")
    Amtsgericht_Wunsiedel("D4505"),

    /**
     * <b>Grundbuchamt Wunsiedel</b>
     *  * <p>
     *  *  Code: D4505G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4505G")
    @XmlEnumValue("D4505G")
    Grundbuchamt_Wunsiedel("D4505G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hof, Zwst. Rehau</b>
     *  * <p>
     *  *  Code: D4506
     *  * <p>
     *  * 
     */
    @JsonProperty("D4506")
    @XmlEnumValue("D4506")
    aufgeloest_Amtsgericht_Hof_Zwst_Rehau("D4506"),

    /**
     * <b>Landgericht Schweinfurt</b>
     *  * <p>
     *  *  Code: D4600
     *  * <p>
     *  * 
     */
    @JsonProperty("D4600")
    @XmlEnumValue("D4600")
    Landgericht_Schweinfurt("D4600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Schweinfurt</b>
     *  * <p>
     *  *  Code: D4600S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4600S")
    @XmlEnumValue("D4600S")
    Staatsanwaltschaft_beim_Landgericht_Schweinfurt("D4600S"),

    /**
     * <b>Amtsgericht Bad Kissingen</b>
     *  * <p>
     *  *  Code: D4601
     *  * <p>
     *  * 
     */
    @JsonProperty("D4601")
    @XmlEnumValue("D4601")
    Amtsgericht_Bad_Kissingen("D4601"),

    /**
     * <b>Grundbuchamt Bad Kissingen</b>
     *  * <p>
     *  *  Code: D4601G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4601G")
    @XmlEnumValue("D4601G")
    Grundbuchamt_Bad_Kissingen("D4601G"),

    /**
     * <b>Amtsgericht Bad Neustadt</b>
     *  * <p>
     *  *  Code: D4602
     *  * <p>
     *  * 
     */
    @JsonProperty("D4602")
    @XmlEnumValue("D4602")
    Amtsgericht_Bad_Neustadt("D4602"),

    /**
     * <b>Grundbuchamt Bad Neustadt</b>
     *  * <p>
     *  *  Code: D4602G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4602G")
    @XmlEnumValue("D4602G")
    Grundbuchamt_Bad_Neustadt("D4602G"),

    /**
     * <b>Amtsgericht Schweinfurt Zweigstelle Gerolzhofen</b>
     *  * <p>
     *  *  Code: D4603
     *  * <p>
     *  * 
     */
    @JsonProperty("D4603")
    @XmlEnumValue("D4603")
    Amtsgericht_Schweinfurt_Zweigstelle_Gerolzhofen("D4603"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Kissingen Zweigstelle Hammelburg</b>
     *  * <p>
     *  *  Code: D4604
     *  * <p>
     *  * 
     */
    @JsonProperty("D4604")
    @XmlEnumValue("D4604")
    aufgeloest_Amtsgericht_Bad_Kissingen_Zweigstelle_Hammelburg("D4604"),

    /**
     * <b>aufgel&#246;st-Amtsgericht K&#246;nigshofen i. Grabfeld</b>
     *  * <p>
     *  *  Code: D4605
     *  * <p>
     *  * 
     */
    @JsonProperty("D4605")
    @XmlEnumValue("D4605")
    aufgeloest_Amtsgericht_Koenigshofen_i_Grabfeld("D4605"),

    /**
     * <b>Amtsgericht Bad Neustadt Zweigstelle Mellrichstadt</b>
     *  * <p>
     *  *  Code: D4606
     *  * <p>
     *  * 
     */
    @JsonProperty("D4606")
    @XmlEnumValue("D4606")
    Amtsgericht_Bad_Neustadt_Zweigstelle_Mellrichstadt("D4606"),

    /**
     * <b>aufgel&#246;st-Amtsgericht M&#252;nnerstadt</b>
     *  * <p>
     *  *  Code: D4607
     *  * <p>
     *  * 
     */
    @JsonProperty("D4607")
    @XmlEnumValue("D4607")
    aufgeloest_Amtsgericht_Muennerstadt("D4607"),

    /**
     * <b>Amtsgericht Schweinfurt</b>
     *  * <p>
     *  *  Code: D4608
     *  * <p>
     *  * 
     */
    @JsonProperty("D4608")
    @XmlEnumValue("D4608")
    Amtsgericht_Schweinfurt("D4608"),

    /**
     * <b>Grundbuchamt Schweinfurt</b>
     *  * <p>
     *  *  Code: D4608G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4608G")
    @XmlEnumValue("D4608G")
    Grundbuchamt_Schweinfurt("D4608G"),

    /**
     * <b>Registergericht Amtsgericht Schweinfurt</b>
     *  * <p>
     *  *  Code: D4608V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4608V")
    @XmlEnumValue("D4608V")
    Registergericht_Amtsgericht_Schweinfurt("D4608V"),

    /**
     * <b>Landgericht Schweinfurt Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Bad Neustadt</b>
     *  * <p>
     *  *  Code: D4620
     *  * <p>
     *  * 
     */
    @JsonProperty("D4620")
    @XmlEnumValue("D4620")
    Landgericht_Schweinfurt_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Bad_Neustadt("D4620"),

    /**
     * <b>Landgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D4700
     *  * <p>
     *  * 
     */
    @JsonProperty("D4700")
    @XmlEnumValue("D4700")
    Landgericht_Wuerzburg("D4700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D4700S
     *  * <p>
     *  * 
     */
    @JsonProperty("D4700S")
    @XmlEnumValue("D4700S")
    Staatsanwaltschaft_beim_Landgericht_Wuerzburg("D4700S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Arnstein</b>
     *  * <p>
     *  *  Code: D4701
     *  * <p>
     *  * 
     */
    @JsonProperty("D4701")
    @XmlEnumValue("D4701")
    aufgeloest_Amtsgericht_Arnstein("D4701"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Br&#252;ckenau</b>
     *  * <p>
     *  *  Code: D4702
     *  * <p>
     *  * 
     */
    @JsonProperty("D4702")
    @XmlEnumValue("D4702")
    aufgeloest_Amtsgericht_Brueckenau("D4702"),

    /**
     * <b>Amtsgericht Gem&#252;nden</b>
     *  * <p>
     *  *  Code: D4703
     *  * <p>
     *  * 
     */
    @JsonProperty("D4703")
    @XmlEnumValue("D4703")
    Amtsgericht_Gemuenden("D4703"),

    /**
     * <b>Grundbuchamt Gem&#252;nden</b>
     *  * <p>
     *  *  Code: D4703G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4703G")
    @XmlEnumValue("D4703G")
    Grundbuchamt_Gemuenden("D4703G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Karlstadt</b>
     *  * <p>
     *  *  Code: D4704
     *  * <p>
     *  * 
     */
    @JsonProperty("D4704")
    @XmlEnumValue("D4704")
    aufgeloest_Amtsgericht_Karlstadt("D4704"),

    /**
     * <b>Amtsgericht Kitzingen</b>
     *  * <p>
     *  *  Code: D4705
     *  * <p>
     *  * 
     */
    @JsonProperty("D4705")
    @XmlEnumValue("D4705")
    Amtsgericht_Kitzingen("D4705"),

    /**
     * <b>Grundbuchamt Kitzingen</b>
     *  * <p>
     *  *  Code: D4705G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4705G")
    @XmlEnumValue("D4705G")
    Grundbuchamt_Kitzingen("D4705G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gem&#252;nden a. Main, Zwst. Marktheidenfeld</b>
     *  * <p>
     *  *  Code: D4706
     *  * <p>
     *  * 
     */
    @JsonProperty("D4706")
    @XmlEnumValue("D4706")
    aufgeloest_Amtsgericht_Gemuenden_a_Main_Zwst_Marktheidenfeld("D4706"),

    /**
     * <b>aufgel&#246;st-Amtsgericht W&#252;rzburg, Zweigstelle Ochsenfurt</b>
     *  * <p>
     *  *  Code: D4707
     *  * <p>
     *  * 
     */
    @JsonProperty("D4707")
    @XmlEnumValue("D4707")
    aufgeloest_Amtsgericht_Wuerzburg_Zweigstelle_Ochsenfurt("D4707"),

    /**
     * <b>Amtsgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D4708
     *  * <p>
     *  * 
     */
    @JsonProperty("D4708")
    @XmlEnumValue("D4708")
    Amtsgericht_Wuerzburg("D4708"),

    /**
     * <b>Grundbuchamt W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D4708G
     *  * <p>
     *  * 
     */
    @JsonProperty("D4708G")
    @XmlEnumValue("D4708G")
    Grundbuchamt_Wuerzburg("D4708G"),

    /**
     * <b>Registergericht Amtsgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D4708V
     *  * <p>
     *  * 
     */
    @JsonProperty("D4708V")
    @XmlEnumValue("D4708V")
    Registergericht_Amtsgericht_Wuerzburg("D4708V"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Erlangen, Zwst. der StA N&#252;rnberg-F&#252;rth</b>
     *  * <p>
     *  *  Code: D5200S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5200S")
    @XmlEnumValue("D5200S")
    Staatsanwaltschaft_beim_Landgericht_Erlangen_Zwst_der_StA_Nuernberg_Fuerth("D5200S"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht F&#252;rth, Zwst. der StA N&#252;rnberg-F&#252;rth</b>
     *  * <p>
     *  *  Code: D5300S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5300S")
    @XmlEnumValue("D5300S")
    Staatsanwaltschaft_beim_Landgericht_Fuerth_Zwst_der_StA_Nuernberg_Fuerth("D5300S"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Straubing, Zwst. der StA Regensburg</b>
     *  * <p>
     *  *  Code: D5400S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5400S")
    @XmlEnumValue("D5400S")
    Staatsanwaltschaft_beim_Landgericht_Straubing_Zwst_der_StA_Regensburg("D5400S"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Neu-Ulm, Zwst. der StA Memmingen</b>
     *  * <p>
     *  *  Code: D5500S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5500S")
    @XmlEnumValue("D5500S")
    Staatsanwaltschaft_beim_Landgericht_Neu_Ulm_Zwst_der_StA_Memmingen("D5500S"),

    /**
     * <b>Landgericht Ingolstadt</b>
     *  * <p>
     *  *  Code: D5700
     *  * <p>
     *  * 
     */
    @JsonProperty("D5700")
    @XmlEnumValue("D5700")
    Landgericht_Ingolstadt("D5700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Ingolstadt</b>
     *  * <p>
     *  *  Code: D5700S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5700S")
    @XmlEnumValue("D5700S")
    Staatsanwaltschaft_beim_Landgericht_Ingolstadt("D5700S"),

    /**
     * <b>Amtsgericht Ingolstadt</b>
     *  * <p>
     *  *  Code: D5701
     *  * <p>
     *  * 
     */
    @JsonProperty("D5701")
    @XmlEnumValue("D5701")
    Amtsgericht_Ingolstadt("D5701"),

    /**
     * <b>Grundbuchamt Ingolstadt</b>
     *  * <p>
     *  *  Code: D5701G
     *  * <p>
     *  * 
     */
    @JsonProperty("D5701G")
    @XmlEnumValue("D5701G")
    Grundbuchamt_Ingolstadt("D5701G"),

    /**
     * <b>Registergericht Amtsgericht Ingolstadt</b>
     *  * <p>
     *  *  Code: D5701V
     *  * <p>
     *  * 
     */
    @JsonProperty("D5701V")
    @XmlEnumValue("D5701V")
    Registergericht_Amtsgericht_Ingolstadt("D5701V"),

    /**
     * <b>Amtsgericht Neuburg an der Donau</b>
     *  * <p>
     *  *  Code: D5702
     *  * <p>
     *  * 
     */
    @JsonProperty("D5702")
    @XmlEnumValue("D5702")
    Amtsgericht_Neuburg_an_der_Donau("D5702"),

    /**
     * <b>Grundbuchamt Neuburg</b>
     *  * <p>
     *  *  Code: D5702G
     *  * <p>
     *  * 
     */
    @JsonProperty("D5702G")
    @XmlEnumValue("D5702G")
    Grundbuchamt_Neuburg("D5702G"),

    /**
     * <b>Amtsgericht Pfaffenhofen a. d. Ilm</b>
     *  * <p>
     *  *  Code: D5703
     *  * <p>
     *  * 
     */
    @JsonProperty("D5703")
    @XmlEnumValue("D5703")
    Amtsgericht_Pfaffenhofen_a_d_Ilm("D5703"),

    /**
     * <b>Grundbuchamt Pfaffenhofen</b>
     *  * <p>
     *  *  Code: D5703G
     *  * <p>
     *  * 
     */
    @JsonProperty("D5703G")
    @XmlEnumValue("D5703G")
    Grundbuchamt_Pfaffenhofen("D5703G"),

    /**
     * <b>Landgericht Ingolstadt Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Neuburg a.d. Donau</b>
     *  * <p>
     *  *  Code: D5720
     *  * <p>
     *  * 
     */
    @JsonProperty("D5720")
    @XmlEnumValue("D5720")
    Landgericht_Ingolstadt_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Neuburg_a_d_Donau("D5720"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Rosenheim, Zwst. der StA Traunstein</b>
     *  * <p>
     *  *  Code: D5900S
     *  * <p>
     *  * 
     */
    @JsonProperty("D5900S")
    @XmlEnumValue("D5900S")
    Staatsanwaltschaft_beim_Landgericht_Rosenheim_Zwst_der_StA_Traunstein("D5900S"),

    /**
     * <b>Justizvollzugsanstalt Erlangen Sozialtherapeutische Anstalt</b>
     *  * <p>
     *  *  Code: D6082
     *  * <p>
     *  * 
     */
    @JsonProperty("D6082")
    @XmlEnumValue("D6082")
    Justizvollzugsanstalt_Erlangen_Sozialtherapeutische_Anstalt("D6082"),

    /**
     * <b>Bayerischer Verwaltungsgerichtshof</b>
     *  * <p>
     *  *  Code: D6122
     *  * <p>
     *  * 
     */
    @JsonProperty("D6122")
    @XmlEnumValue("D6122")
    Bayerischer_Verwaltungsgerichtshof("D6122"),

    /**
     * <b>Justizvollzugsanstalt Bernau</b>
     *  * <p>
     *  *  Code: D6190
     *  * <p>
     *  * 
     */
    @JsonProperty("D6190")
    @XmlEnumValue("D6190")
    Justizvollzugsanstalt_Bernau("D6190"),

    /**
     * <b>Verwaltungsgericht Ansbach</b>
     *  * <p>
     *  *  Code: D6248
     *  * <p>
     *  * 
     */
    @JsonProperty("D6248")
    @XmlEnumValue("D6248")
    Verwaltungsgericht_Ansbach("D6248"),

    /**
     * <b>Sozialgericht Augsburg</b>
     *  * <p>
     *  *  Code: D6249
     *  * <p>
     *  * 
     */
    @JsonProperty("D6249")
    @XmlEnumValue("D6249")
    Sozialgericht_Augsburg("D6249"),

    /**
     * <b>Arbeitsgericht Augsburg</b>
     *  * <p>
     *  *  Code: D6250
     *  * <p>
     *  * 
     */
    @JsonProperty("D6250")
    @XmlEnumValue("D6250")
    Arbeitsgericht_Augsburg("D6250"),

    /**
     * <b>Arbeitsgericht Bamberg</b>
     *  * <p>
     *  *  Code: D6251
     *  * <p>
     *  * 
     */
    @JsonProperty("D6251")
    @XmlEnumValue("D6251")
    Arbeitsgericht_Bamberg("D6251"),

    /**
     * <b>Arbeitsgericht Kempten/Allg&#228;u</b>
     *  * <p>
     *  *  Code: D6252
     *  * <p>
     *  * 
     */
    @JsonProperty("D6252")
    @XmlEnumValue("D6252")
    Arbeitsgericht_Kempten_Allgaeu("D6252"),

    /**
     * <b>Sozialgericht Landshut</b>
     *  * <p>
     *  *  Code: D6253
     *  * <p>
     *  * 
     */
    @JsonProperty("D6253")
    @XmlEnumValue("D6253")
    Sozialgericht_Landshut("D6253"),

    /**
     * <b>Bayerisches Landessozialgericht</b>
     *  * <p>
     *  *  Code: D6255
     *  * <p>
     *  * 
     */
    @JsonProperty("D6255")
    @XmlEnumValue("D6255")
    Bayerisches_Landessozialgericht("D6255"),

    /**
     * <b>Landesarbeitsgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6256
     *  * <p>
     *  * 
     */
    @JsonProperty("D6256")
    @XmlEnumValue("D6256")
    Landesarbeitsgericht_Muenchen("D6256"),

    /**
     * <b>Arbeitsgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6257
     *  * <p>
     *  * 
     */
    @JsonProperty("D6257")
    @XmlEnumValue("D6257")
    Arbeitsgericht_Muenchen("D6257"),

    /**
     * <b>Finanzgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6258
     *  * <p>
     *  * 
     */
    @JsonProperty("D6258")
    @XmlEnumValue("D6258")
    Finanzgericht_Muenchen("D6258"),

    /**
     * <b>Bayerischer Verfassungsgerichtshof</b>
     *  * <p>
     *  *  Code: D6259
     *  * <p>
     *  * 
     */
    @JsonProperty("D6259")
    @XmlEnumValue("D6259")
    Bayerischer_Verfassungsgerichtshof("D6259"),

    /**
     * <b>Sozialgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6260
     *  * <p>
     *  * 
     */
    @JsonProperty("D6260")
    @XmlEnumValue("D6260")
    Sozialgericht_Muenchen("D6260"),

    /**
     * <b>Bundespatentgericht</b>
     *  * <p>
     *  *  Code: D6261
     *  * <p>
     *  * 
     */
    @JsonProperty("D6261")
    @XmlEnumValue("D6261")
    Bundespatentgericht("D6261"),

    /**
     * <b>Verwaltungsgericht M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6262
     *  * <p>
     *  * 
     */
    @JsonProperty("D6262")
    @XmlEnumValue("D6262")
    Verwaltungsgericht_Muenchen("D6262"),

    /**
     * <b>Bundesfinanzhof</b>
     *  * <p>
     *  *  Code: D6263
     *  * <p>
     *  * 
     */
    @JsonProperty("D6263")
    @XmlEnumValue("D6263")
    Bundesfinanzhof("D6263"),

    /**
     * <b>Finanzgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D6264
     *  * <p>
     *  * 
     */
    @JsonProperty("D6264")
    @XmlEnumValue("D6264")
    Finanzgericht_Nuernberg("D6264"),

    /**
     * <b>Sozialgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D6265
     *  * <p>
     *  * 
     */
    @JsonProperty("D6265")
    @XmlEnumValue("D6265")
    Sozialgericht_Nuernberg("D6265"),

    /**
     * <b>Landesarbeitsgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D6266
     *  * <p>
     *  * 
     */
    @JsonProperty("D6266")
    @XmlEnumValue("D6266")
    Landesarbeitsgericht_Nuernberg("D6266"),

    /**
     * <b>Arbeitsgericht N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D6267
     *  * <p>
     *  * 
     */
    @JsonProperty("D6267")
    @XmlEnumValue("D6267")
    Arbeitsgericht_Nuernberg("D6267"),

    /**
     * <b>Sozialgericht Regensburg</b>
     *  * <p>
     *  *  Code: D6268
     *  * <p>
     *  * 
     */
    @JsonProperty("D6268")
    @XmlEnumValue("D6268")
    Sozialgericht_Regensburg("D6268"),

    /**
     * <b>Arbeitsgericht Rosenheim</b>
     *  * <p>
     *  *  Code: D6269
     *  * <p>
     *  * 
     */
    @JsonProperty("D6269")
    @XmlEnumValue("D6269")
    Arbeitsgericht_Rosenheim("D6269"),

    /**
     * <b>Arbeitsgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D6270
     *  * <p>
     *  * 
     */
    @JsonProperty("D6270")
    @XmlEnumValue("D6270")
    Arbeitsgericht_Wuerzburg("D6270"),

    /**
     * <b>Sozialgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D6271
     *  * <p>
     *  * 
     */
    @JsonProperty("D6271")
    @XmlEnumValue("D6271")
    Sozialgericht_Wuerzburg("D6271"),

    /**
     * <b>Verwaltungsgericht W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D6272
     *  * <p>
     *  * 
     */
    @JsonProperty("D6272")
    @XmlEnumValue("D6272")
    Verwaltungsgericht_Wuerzburg("D6272"),

    /**
     * <b>Justizvollzugsanstalt M&#252;nchen</b>
     *  * <p>
     *  *  Code: D6463
     *  * <p>
     *  * 
     */
    @JsonProperty("D6463")
    @XmlEnumValue("D6463")
    Justizvollzugsanstalt_Muenchen("D6463"),

    /**
     * <b>Arbeitsgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D6539
     *  * <p>
     *  * 
     */
    @JsonProperty("D6539")
    @XmlEnumValue("D6539")
    Arbeitsgericht_Bayreuth("D6539"),

    /**
     * <b>Arbeitsgericht Passau</b>
     *  * <p>
     *  *  Code: D6540
     *  * <p>
     *  * 
     */
    @JsonProperty("D6540")
    @XmlEnumValue("D6540")
    Arbeitsgericht_Passau("D6540"),

    /**
     * <b>Arbeitsgericht Regensburg</b>
     *  * <p>
     *  *  Code: D6541
     *  * <p>
     *  * 
     */
    @JsonProperty("D6541")
    @XmlEnumValue("D6541")
    Arbeitsgericht_Regensburg("D6541"),

    /**
     * <b>Arbeitsgericht Weiden</b>
     *  * <p>
     *  *  Code: D6542
     *  * <p>
     *  * 
     */
    @JsonProperty("D6542")
    @XmlEnumValue("D6542")
    Arbeitsgericht_Weiden("D6542"),

    /**
     * <b>Sozialgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D6575
     *  * <p>
     *  * 
     */
    @JsonProperty("D6575")
    @XmlEnumValue("D6575")
    Sozialgericht_Bayreuth("D6575"),

    /**
     * <b>Verwaltungsgericht Augsburg</b>
     *  * <p>
     *  *  Code: D6577
     *  * <p>
     *  * 
     */
    @JsonProperty("D6577")
    @XmlEnumValue("D6577")
    Verwaltungsgericht_Augsburg("D6577"),

    /**
     * <b>Verwaltungsgericht Bayreuth</b>
     *  * <p>
     *  *  Code: D6578
     *  * <p>
     *  * 
     */
    @JsonProperty("D6578")
    @XmlEnumValue("D6578")
    Verwaltungsgericht_Bayreuth("D6578"),

    /**
     * <b>Verwaltungsgericht Regensburg</b>
     *  * <p>
     *  *  Code: D6579
     *  * <p>
     *  * 
     */
    @JsonProperty("D6579")
    @XmlEnumValue("D6579")
    Verwaltungsgericht_Regensburg("D6579"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D6657
     *  * <p>
     *  * 
     */
    @JsonProperty("D6657")
    @XmlEnumValue("D6657")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Nuernberg("D6657"),

    /**
     * <b>Bayerischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: D6658
     *  * <p>
     *  * 
     */
    @JsonProperty("D6658")
    @XmlEnumValue("D6658")
    Bayerischer_Anwaltsgerichtshof("D6658"),

    /**
     * <b>Justizvollzugsanstalt Memmingen</b>
     *  * <p>
     *  *  Code: D7607
     *  * <p>
     *  * 
     */
    @JsonProperty("D7607")
    @XmlEnumValue("D7607")
    Justizvollzugsanstalt_Memmingen("D7607"),

    /**
     * <b>Justizvollzugsanstalt N&#252;rnberg</b>
     *  * <p>
     *  *  Code: D7870
     *  * <p>
     *  * 
     */
    @JsonProperty("D7870")
    @XmlEnumValue("D7870")
    Justizvollzugsanstalt_Nuernberg("D7870"),

    /**
     * <b>Justizvollzugsanstalt Kaisheim</b>
     *  * <p>
     *  *  Code: D7871
     *  * <p>
     *  * 
     */
    @JsonProperty("D7871")
    @XmlEnumValue("D7871")
    Justizvollzugsanstalt_Kaisheim("D7871"),

    /**
     * <b>Bayerisches Landessozialgericht Zweigstelle Schweinfurt</b>
     *  * <p>
     *  *  Code: D8047
     *  * <p>
     *  * 
     */
    @JsonProperty("D8047")
    @XmlEnumValue("D8047")
    Bayerisches_Landessozialgericht_Zweigstelle_Schweinfurt("D8047"),

    /**
     * <b>Justizvollzugsanstalt Landsberg</b>
     *  * <p>
     *  *  Code: D8419
     *  * <p>
     *  * 
     */
    @JsonProperty("D8419")
    @XmlEnumValue("D8419")
    Justizvollzugsanstalt_Landsberg("D8419"),

    /**
     * <b>Justizvollzugsanstalt W&#252;rzburg</b>
     *  * <p>
     *  *  Code: D8445
     *  * <p>
     *  * 
     */
    @JsonProperty("D8445")
    @XmlEnumValue("D8445")
    Justizvollzugsanstalt_Wuerzburg("D8445"),

    /**
     * <b>Justizvollzugsanstalt Neuburg an der Donau</b>
     *  * <p>
     *  *  Code: D8485
     *  * <p>
     *  * 
     */
    @JsonProperty("D8485")
    @XmlEnumValue("D8485")
    Justizvollzugsanstalt_Neuburg_an_der_Donau("D8485"),

    /**
     * <b>Justizvollzugsanstalt Kempten</b>
     *  * <p>
     *  *  Code: D8491
     *  * <p>
     *  * 
     */
    @JsonProperty("D8491")
    @XmlEnumValue("D8491")
    Justizvollzugsanstalt_Kempten("D8491"),

    /**
     * <b>Justizvollzugsanstalt Straubing</b>
     *  * <p>
     *  *  Code: D8517
     *  * <p>
     *  * 
     */
    @JsonProperty("D8517")
    @XmlEnumValue("D8517")
    Justizvollzugsanstalt_Straubing("D8517"),

    /**
     * <b>Justizvollzugsanstalt Aichach</b>
     *  * <p>
     *  *  Code: D8551
     *  * <p>
     *  * 
     */
    @JsonProperty("D8551")
    @XmlEnumValue("D8551")
    Justizvollzugsanstalt_Aichach("D8551"),

    /**
     * <b>Justizvollzugsanstalt Amberg</b>
     *  * <p>
     *  *  Code: D8552
     *  * <p>
     *  * 
     */
    @JsonProperty("D8552")
    @XmlEnumValue("D8552")
    Justizvollzugsanstalt_Amberg("D8552"),

    /**
     * <b>Justizvollzugsanstalt Ansbach</b>
     *  * <p>
     *  *  Code: D8553
     *  * <p>
     *  * 
     */
    @JsonProperty("D8553")
    @XmlEnumValue("D8553")
    Justizvollzugsanstalt_Ansbach("D8553"),

    /**
     * <b>Justizvollzugsanstalt Aschaffenburg</b>
     *  * <p>
     *  *  Code: D8554
     *  * <p>
     *  * 
     */
    @JsonProperty("D8554")
    @XmlEnumValue("D8554")
    Justizvollzugsanstalt_Aschaffenburg("D8554"),

    /**
     * <b>Justizvollzugsanstalt Bad Reichenhall</b>
     *  * <p>
     *  *  Code: D8555
     *  * <p>
     *  * 
     */
    @JsonProperty("D8555")
    @XmlEnumValue("D8555")
    Justizvollzugsanstalt_Bad_Reichenhall("D8555"),

    /**
     * <b>Justizvollzugsanstalt Bamberg</b>
     *  * <p>
     *  *  Code: D8556
     *  * <p>
     *  * 
     */
    @JsonProperty("D8556")
    @XmlEnumValue("D8556")
    Justizvollzugsanstalt_Bamberg("D8556"),

    /**
     * <b>Justizvollzugsanstalt St. Georgen-Bayreuth</b>
     *  * <p>
     *  *  Code: D8557
     *  * <p>
     *  * 
     */
    @JsonProperty("D8557")
    @XmlEnumValue("D8557")
    Justizvollzugsanstalt_St_Georgen_Bayreuth("D8557"),

    /**
     * <b>Justizvollzugsanstalt Ebrach</b>
     *  * <p>
     *  *  Code: D8558
     *  * <p>
     *  * 
     */
    @JsonProperty("D8558")
    @XmlEnumValue("D8558")
    Justizvollzugsanstalt_Ebrach("D8558"),

    /**
     * <b>Justizvollzugsanstalt Eichst&#228;tt</b>
     *  * <p>
     *  *  Code: D8559
     *  * <p>
     *  * 
     */
    @JsonProperty("D8559")
    @XmlEnumValue("D8559")
    Justizvollzugsanstalt_Eichstaett("D8559"),

    /**
     * <b>Justizvollzugsanstalt Erding</b>
     *  * <p>
     *  *  Code: D8560
     *  * <p>
     *  * 
     */
    @JsonProperty("D8560")
    @XmlEnumValue("D8560")
    Justizvollzugsanstalt_Erding("D8560"),

    /**
     * <b>Justizvollzugsanstalt Garmisch-Partenkirchen</b>
     *  * <p>
     *  *  Code: D8561
     *  * <p>
     *  * 
     */
    @JsonProperty("D8561")
    @XmlEnumValue("D8561")
    Justizvollzugsanstalt_Garmisch_Partenkirchen("D8561"),

    /**
     * <b>Justizvollzugsanstalt Hof</b>
     *  * <p>
     *  *  Code: D8562
     *  * <p>
     *  * 
     */
    @JsonProperty("D8562")
    @XmlEnumValue("D8562")
    Justizvollzugsanstalt_Hof("D8562"),

    /**
     * <b>Justizvollzugsanstalt Ingolstadt</b>
     *  * <p>
     *  *  Code: D8563
     *  * <p>
     *  * 
     */
    @JsonProperty("D8563")
    @XmlEnumValue("D8563")
    Justizvollzugsanstalt_Ingolstadt("D8563"),

    /**
     * <b>Justizvollzugsanstalt Kronach</b>
     *  * <p>
     *  *  Code: D8564
     *  * <p>
     *  * 
     */
    @JsonProperty("D8564")
    @XmlEnumValue("D8564")
    Justizvollzugsanstalt_Kronach("D8564"),

    /**
     * <b>Justizvollzugsanstalt Landshut</b>
     *  * <p>
     *  *  Code: D8566
     *  * <p>
     *  * 
     */
    @JsonProperty("D8566")
    @XmlEnumValue("D8566")
    Justizvollzugsanstalt_Landshut("D8566"),

    /**
     * <b>Justizvollzugsanstalt Passau</b>
     *  * <p>
     *  *  Code: D8567
     *  * <p>
     *  * 
     */
    @JsonProperty("D8567")
    @XmlEnumValue("D8567")
    Justizvollzugsanstalt_Passau("D8567"),

    /**
     * <b>Justizvollzugsanstalt Regensburg</b>
     *  * <p>
     *  *  Code: D8568
     *  * <p>
     *  * 
     */
    @JsonProperty("D8568")
    @XmlEnumValue("D8568")
    Justizvollzugsanstalt_Regensburg("D8568"),

    /**
     * <b>Justizvollzugsanstalt Schweinfurt</b>
     *  * <p>
     *  *  Code: D8569
     *  * <p>
     *  * 
     */
    @JsonProperty("D8569")
    @XmlEnumValue("D8569")
    Justizvollzugsanstalt_Schweinfurt("D8569"),

    /**
     * <b>Justizvollzugsanstalt Traunstein</b>
     *  * <p>
     *  *  Code: D8570
     *  * <p>
     *  * 
     */
    @JsonProperty("D8570")
    @XmlEnumValue("D8570")
    Justizvollzugsanstalt_Traunstein("D8570"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer M&#252;nchen</b>
     *  * <p>
     *  *  Code: D8642
     *  * <p>
     *  * 
     */
    @JsonProperty("D8642")
    @XmlEnumValue("D8642")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Muenchen("D8642"),

    /**
     * <b>Anwaltsgericht Bamberg</b>
     *  * <p>
     *  *  Code: D8686
     *  * <p>
     *  * 
     */
    @JsonProperty("D8686")
    @XmlEnumValue("D8686")
    Anwaltsgericht_Bamberg("D8686"),

    /**
     * <b>Justizvollzugsanstalt Niedersch&#246;nenfeld</b>
     *  * <p>
     *  *  Code: D8699
     *  * <p>
     *  * 
     */
    @JsonProperty("D8699")
    @XmlEnumValue("D8699")
    Justizvollzugsanstalt_Niederschoenenfeld("D8699"),

    /**
     * <b>Justizvollzugsanstalt M&#252;hldorf a.Inn</b>
     *  * <p>
     *  *  Code: D8793
     *  * <p>
     *  * 
     */
    @JsonProperty("D8793")
    @XmlEnumValue("D8793")
    Justizvollzugsanstalt_Muehldorf_a_Inn("D8793"),

    /**
     * <b>Justizvollzugsanstalt Laufen-Lebenau</b>
     *  * <p>
     *  *  Code: D8794
     *  * <p>
     *  * 
     */
    @JsonProperty("D8794")
    @XmlEnumValue("D8794")
    Justizvollzugsanstalt_Laufen_Lebenau("D8794"),

    /**
     * <b>Justizvollzugsanstalt Weiden</b>
     *  * <p>
     *  *  Code: D8821
     *  * <p>
     *  * 
     */
    @JsonProperty("D8821")
    @XmlEnumValue("D8821")
    Justizvollzugsanstalt_Weiden("D8821"),

    /**
     * <b>Finanzgericht Augsburg</b>
     *  * <p>
     *  *  Code: D8902
     *  * <p>
     *  * 
     */
    @JsonProperty("D8902")
    @XmlEnumValue("D8902")
    Finanzgericht_Augsburg("D8902"),

    /**
     * <b>Justizvollzugsanstalt Augsburg-Gablingen</b>
     *  * <p>
     *  *  Code: D9372
     *  * <p>
     *  * 
     */
    @JsonProperty("D9372")
    @XmlEnumValue("D9372")
    Justizvollzugsanstalt_Augsburg_Gablingen("D9372"),

    /**
     * <b>Arbeitsgericht Augsburg Kammer Neu-Ulm</b>
     *  * <p>
     *  *  Code: D9395
     *  * <p>
     *  * 
     */
    @JsonProperty("D9395")
    @XmlEnumValue("D9395")
    Arbeitsgericht_Augsburg_Kammer_Neu_Ulm("D9395"),

    /**
     * <b>Arbeitsgericht Bamberg Kammer Coburg</b>
     *  * <p>
     *  *  Code: D9396
     *  * <p>
     *  * 
     */
    @JsonProperty("D9396")
    @XmlEnumValue("D9396")
    Arbeitsgericht_Bamberg_Kammer_Coburg("D9396"),

    /**
     * <b>Arbeitsgericht Bayreuth Kammer Hof</b>
     *  * <p>
     *  *  Code: D9397
     *  * <p>
     *  * 
     */
    @JsonProperty("D9397")
    @XmlEnumValue("D9397")
    Arbeitsgericht_Bayreuth_Kammer_Hof("D9397"),

    /**
     * <b>Arbeitsgericht M&#252;nchen Kammer Ingolstadt</b>
     *  * <p>
     *  *  Code: D9398
     *  * <p>
     *  * 
     */
    @JsonProperty("D9398")
    @XmlEnumValue("D9398")
    Arbeitsgericht_Muenchen_Kammer_Ingolstadt("D9398"),

    /**
     * <b>Arbeitsgericht M&#252;nchen Kammer Weilheim</b>
     *  * <p>
     *  *  Code: D9399
     *  * <p>
     *  * 
     */
    @JsonProperty("D9399")
    @XmlEnumValue("D9399")
    Arbeitsgericht_Muenchen_Kammer_Weilheim("D9399"),

    /**
     * <b>Arbeitsgericht Passau Kammer Deggendorf</b>
     *  * <p>
     *  *  Code: D9400
     *  * <p>
     *  * 
     */
    @JsonProperty("D9400")
    @XmlEnumValue("D9400")
    Arbeitsgericht_Passau_Kammer_Deggendorf("D9400"),

    /**
     * <b>Arbeitsgericht Regensburg Kammer Landshut</b>
     *  * <p>
     *  *  Code: D9401
     *  * <p>
     *  * 
     */
    @JsonProperty("D9401")
    @XmlEnumValue("D9401")
    Arbeitsgericht_Regensburg_Kammer_Landshut("D9401"),

    /**
     * <b>Arbeitsgericht Rosenheim Kammer Traunstein</b>
     *  * <p>
     *  *  Code: D9402
     *  * <p>
     *  * 
     */
    @JsonProperty("D9402")
    @XmlEnumValue("D9402")
    Arbeitsgericht_Rosenheim_Kammer_Traunstein("D9402"),

    /**
     * <b>Arbeitsgericht Weiden Kammer Schwandorf</b>
     *  * <p>
     *  *  Code: D9403
     *  * <p>
     *  * 
     */
    @JsonProperty("D9403")
    @XmlEnumValue("D9403")
    Arbeitsgericht_Weiden_Kammer_Schwandorf("D9403"),

    /**
     * <b>Arbeitsgericht W&#252;rzburg Kammer Aschaffenburg</b>
     *  * <p>
     *  *  Code: D9404
     *  * <p>
     *  * 
     */
    @JsonProperty("D9404")
    @XmlEnumValue("D9404")
    Arbeitsgericht_Wuerzburg_Kammer_Aschaffenburg("D9404"),

    /**
     * <b>Arbeitsgericht W&#252;rzburg Kammer Schweinfurt</b>
     *  * <p>
     *  *  Code: D9405
     *  * <p>
     *  * 
     */
    @JsonProperty("D9405")
    @XmlEnumValue("D9405")
    Arbeitsgericht_Wuerzburg_Kammer_Schweinfurt("D9405"),

    /**
     * <b>Kammergericht Berlin</b>
     *  * <p>
     *  *  Code: F1000
     *  * <p>
     *  * 
     */
    @JsonProperty("F1000")
    @XmlEnumValue("F1000")
    Kammergericht_Berlin("F1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Berlin (Kammergericht)</b>
     *  * <p>
     *  *  Code: F1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("F1000S")
    @XmlEnumValue("F1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Berlin_Kammergericht("F1000S"),

    /**
     * <b>Staatsanwaltschaft bei dem Kammergericht -Dezernat Ausl. Einl.-</b>
     *  * <p>
     *  *  Code: F1001S
     *  * <p>
     *  * 
     */
    @JsonProperty("F1001S")
    @XmlEnumValue("F1001S")
    Staatsanwaltschaft_bei_dem_Kammergericht_Dezernat_Ausl_Einl("F1001S"),

    /**
     * <b>Landgericht Berlin Strafgerichtsbarkeit</b>
     *  * <p>
     *  *  Code: F1100
     *  * <p>
     *  * 
     */
    @JsonProperty("F1100")
    @XmlEnumValue("F1100")
    Landgericht_Berlin_Strafgerichtsbarkeit("F1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Berlin</b>
     *  * <p>
     *  *  Code: F1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("F1100S")
    @XmlEnumValue("F1100S")
    Staatsanwaltschaft_beim_Landgericht_Berlin("F1100S"),

    /**
     * <b>Amtsgericht Tiergarten</b>
     *  * <p>
     *  *  Code: F1101
     *  * <p>
     *  * 
     */
    @JsonProperty("F1101")
    @XmlEnumValue("F1101")
    Amtsgericht_Tiergarten("F1101"),

    /**
     * <b>Amtsgericht Tiergarten Zivilsachen</b>
     *  * <p>
     *  *  Code: F1101R
     *  * <p>
     *  * 
     */
    @JsonProperty("F1101R")
    @XmlEnumValue("F1101R")
    Amtsgericht_Tiergarten_Zivilsachen("F1101R"),

    /**
     * <b>Amtsgericht Wedding</b>
     *  * <p>
     *  *  Code: F1102
     *  * <p>
     *  * 
     */
    @JsonProperty("F1102")
    @XmlEnumValue("F1102")
    Amtsgericht_Wedding("F1102"),

    /**
     * <b>Amtsgericht Wedding, Mahngericht</b>
     *  * <p>
     *  *  Code: F1102M
     *  * <p>
     *  * 
     */
    @JsonProperty("F1102M")
    @XmlEnumValue("F1102M")
    Amtsgericht_Wedding_Mahngericht("F1102M"),

    /**
     * <b>Amtsgericht Charlottenburg</b>
     *  * <p>
     *  *  Code: F1103
     *  * <p>
     *  * 
     */
    @JsonProperty("F1103")
    @XmlEnumValue("F1103")
    Amtsgericht_Charlottenburg("F1103"),

    /**
     * <b>Amtsgericht Charlottenburg, Handels- und Genossenschaftsregister</b>
     *  * <p>
     *  *  Code: F1103R
     *  * <p>
     *  * 
     */
    @JsonProperty("F1103R")
    @XmlEnumValue("F1103R")
    Amtsgericht_Charlottenburg_Handels_und_Genossenschaftsregister("F1103R"),

    /**
     * <b>Amtsgericht Spandau</b>
     *  * <p>
     *  *  Code: F1104
     *  * <p>
     *  * 
     */
    @JsonProperty("F1104")
    @XmlEnumValue("F1104")
    Amtsgericht_Spandau("F1104"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Berlin-Zehlendorf</b>
     *  * <p>
     *  *  Code: F1105
     *  * <p>
     *  * 
     */
    @JsonProperty("F1105")
    @XmlEnumValue("F1105")
    aufgeloest_Amtsgericht_Berlin_Zehlendorf("F1105"),

    /**
     * <b>Amtsgericht Sch&#246;neberg</b>
     *  * <p>
     *  *  Code: F1106
     *  * <p>
     *  * 
     */
    @JsonProperty("F1106")
    @XmlEnumValue("F1106")
    Amtsgericht_Schoeneberg("F1106"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Berlin-Lichterfelde</b>
     *  * <p>
     *  *  Code: F1107
     *  * <p>
     *  * 
     */
    @JsonProperty("F1107")
    @XmlEnumValue("F1107")
    aufgeloest_Amtsgericht_Berlin_Lichterfelde("F1107"),

    /**
     * <b>Amtsgericht Kreuzberg</b>
     *  * <p>
     *  *  Code: F1108
     *  * <p>
     *  * 
     */
    @JsonProperty("F1108")
    @XmlEnumValue("F1108")
    Amtsgericht_Kreuzberg("F1108"),

    /**
     * <b>Amtsgericht Neuk&#246;lln</b>
     *  * <p>
     *  *  Code: F1109
     *  * <p>
     *  * 
     */
    @JsonProperty("F1109")
    @XmlEnumValue("F1109")
    Amtsgericht_Neukoelln("F1109"),

    /**
     * <b>Amtsgericht Pankow</b>
     *  * <p>
     *  *  Code: F1110
     *  * <p>
     *  * 
     */
    @JsonProperty("F1110")
    @XmlEnumValue("F1110")
    Amtsgericht_Pankow("F1110"),

    /**
     * <b>Amtsanwaltschaft Berlin</b>
     *  * <p>
     *  *  Code: F1110S
     *  * <p>
     *  * 
     */
    @JsonProperty("F1110S")
    @XmlEnumValue("F1110S")
    Amtsanwaltschaft_Berlin("F1110S"),

    /**
     * <b>Amtsgericht Lichtenberg</b>
     *  * <p>
     *  *  Code: F1111
     *  * <p>
     *  * 
     */
    @JsonProperty("F1111")
    @XmlEnumValue("F1111")
    Amtsgericht_Lichtenberg("F1111"),

    /**
     * <b>Amtsgericht Berlin Mitte</b>
     *  * <p>
     *  *  Code: F1112
     *  * <p>
     *  * 
     */
    @JsonProperty("F1112")
    @XmlEnumValue("F1112")
    Amtsgericht_Berlin_Mitte("F1112"),

    /**
     * <b>Amtsgericht Berlin Mitte, Zentrales Vollstreckungsgericht Berlin</b>
     *  * <p>
     *  *  Code: F1112R
     *  * <p>
     *  * 
     */
    @JsonProperty("F1112R")
    @XmlEnumValue("F1112R")
    Amtsgericht_Berlin_Mitte_Zentrales_Vollstreckungsgericht_Berlin("F1112R"),

    /**
     * <b>Amtsgericht K&#246;penick</b>
     *  * <p>
     *  *  Code: F1113
     *  * <p>
     *  * 
     */
    @JsonProperty("F1113")
    @XmlEnumValue("F1113")
    Amtsgericht_Koepenick("F1113"),

    /**
     * <b>Amtsgericht Hohensch&#246;nhausen</b>
     *  * <p>
     *  *  Code: F1114
     *  * <p>
     *  * 
     */
    @JsonProperty("F1114")
    @XmlEnumValue("F1114")
    Amtsgericht_Hohenschoenhausen("F1114"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Berlin II</b>
     *  * <p>
     *  *  Code: F1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("F1200S")
    @XmlEnumValue("F1200S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Berlin_II("F1200S"),

    /**
     * <b>Bereitschaftsgericht Berlin</b>
     *  * <p>
     *  *  Code: F6053
     *  * <p>
     *  * 
     */
    @JsonProperty("F6053")
    @XmlEnumValue("F6053")
    Bereitschaftsgericht_Berlin("F6053"),

    /**
     * <b>Sozialgericht Berlin</b>
     *  * <p>
     *  *  Code: F6061
     *  * <p>
     *  * 
     */
    @JsonProperty("F6061")
    @XmlEnumValue("F6061")
    Sozialgericht_Berlin("F6061"),

    /**
     * <b>Finanzgericht Berlin</b>
     *  * <p>
     *  *  Code: F6080
     *  * <p>
     *  * 
     */
    @JsonProperty("F6080")
    @XmlEnumValue("F6080")
    Finanzgericht_Berlin("F6080"),

    /**
     * <b>Landessozialgericht Berlin</b>
     *  * <p>
     *  *  Code: F6081
     *  * <p>
     *  * 
     */
    @JsonProperty("F6081")
    @XmlEnumValue("F6081")
    Landessozialgericht_Berlin("F6081"),

    /**
     * <b>Arbeitsgericht Berlin</b>
     *  * <p>
     *  *  Code: F6082
     *  * <p>
     *  * 
     */
    @JsonProperty("F6082")
    @XmlEnumValue("F6082")
    Arbeitsgericht_Berlin("F6082"),

    /**
     * <b>Landesarbeitsgericht Berlin</b>
     *  * <p>
     *  *  Code: F6083
     *  * <p>
     *  * 
     */
    @JsonProperty("F6083")
    @XmlEnumValue("F6083")
    Landesarbeitsgericht_Berlin("F6083"),

    /**
     * <b>Verwaltungsgericht Berlin</b>
     *  * <p>
     *  *  Code: F6084
     *  * <p>
     *  * 
     */
    @JsonProperty("F6084")
    @XmlEnumValue("F6084")
    Verwaltungsgericht_Berlin("F6084"),

    /**
     * <b>Justizbeitreibungsstelle des Bundesverwaltungsgerichts</b>
     *  * <p>
     *  *  Code: F6085
     *  * <p>
     *  * 
     */
    @JsonProperty("F6085")
    @XmlEnumValue("F6085")
    Justizbeitreibungsstelle_des_Bundesverwaltungsgerichts("F6085"),

    /**
     * <b>aufgel&#246;st-Bundesverwaltungsgericht</b>
     *  * <p>
     *  *  Code: F6087
     *  * <p>
     *  * 
     */
    @JsonProperty("F6087")
    @XmlEnumValue("F6087")
    aufgeloest_Bundesverwaltungsgericht("F6087"),

    /**
     * <b>Die Pr&#228;sidentin des Kammergerichts</b>
     *  * <p>
     *  *  Code: F6104
     *  * <p>
     *  * 
     */
    @JsonProperty("F6104")
    @XmlEnumValue("F6104")
    Die_Praesidentin_des_Kammergerichts("F6104"),

    /**
     * <b>Oberverwaltungsgericht Berlin-Brandenburg</b>
     *  * <p>
     *  *  Code: F6145
     *  * <p>
     *  * 
     */
    @JsonProperty("F6145")
    @XmlEnumValue("F6145")
    Oberverwaltungsgericht_Berlin_Brandenburg("F6145"),

    /**
     * <b>Anwaltsgericht im Bezirk der Rechtsanwaltskammer Berlin</b>
     *  * <p>
     *  *  Code: F6149
     *  * <p>
     *  * 
     */
    @JsonProperty("F6149")
    @XmlEnumValue("F6149")
    Anwaltsgericht_im_Bezirk_der_Rechtsanwaltskammer_Berlin("F6149"),

    /**
     * <b>Anwaltsgerichtshof Berlin</b>
     *  * <p>
     *  *  Code: F6185
     *  * <p>
     *  * 
     */
    @JsonProperty("F6185")
    @XmlEnumValue("F6185")
    Anwaltsgerichtshof_Berlin("F6185"),

    /**
     * <b>Jugendarrestanstalt Berlin-Brandenburg</b>
     *  * <p>
     *  *  Code: F6374
     *  * <p>
     *  * 
     */
    @JsonProperty("F6374")
    @XmlEnumValue("F6374")
    Jugendarrestanstalt_Berlin_Brandenburg("F6374"),

    /**
     * <b>Jugendstrafanstalt Berlin</b>
     *  * <p>
     *  *  Code: F6399
     *  * <p>
     *  * 
     */
    @JsonProperty("F6399")
    @XmlEnumValue("F6399")
    Jugendstrafanstalt_Berlin("F6399"),

    /**
     * <b>aufgel&#246;st-Landgericht Berlin Zivilgerichtsbarkeit 1. Instanz</b>
     *  * <p>
     *  *  Code: F6402
     *  * <p>
     *  * 
     */
    @JsonProperty("F6402")
    @XmlEnumValue("F6402")
    aufgeloest_Landgericht_Berlin_Zivilgerichtsbarkeit_1_Instanz("F6402"),

    /**
     * <b>Justizvollzugsanstalt Tegel</b>
     *  * <p>
     *  *  Code: F6491
     *  * <p>
     *  * 
     */
    @JsonProperty("F6491")
    @XmlEnumValue("F6491")
    Justizvollzugsanstalt_Tegel("F6491"),

    /**
     * <b>Die Pr&#228;sidentin des Verwaltungsgerichts Berlin</b>
     *  * <p>
     *  *  Code: F6496
     *  * <p>
     *  * 
     */
    @JsonProperty("F6496")
    @XmlEnumValue("F6496")
    Die_Praesidentin_des_Verwaltungsgerichts_Berlin("F6496"),

    /**
     * <b>Justizvollzugsanstalt Moabit</b>
     *  * <p>
     *  *  Code: F6525
     *  * <p>
     *  * 
     */
    @JsonProperty("F6525")
    @XmlEnumValue("F6525")
    Justizvollzugsanstalt_Moabit("F6525"),

    /**
     * <b>Landgericht Berlin Zivilgerichtsbarkeit</b>
     *  * <p>
     *  *  Code: F6529
     *  * <p>
     *  * 
     */
    @JsonProperty("F6529")
    @XmlEnumValue("F6529")
    Landgericht_Berlin_Zivilgerichtsbarkeit("F6529"),

    /**
     * <b>Verfassungsgerichtshof Berlin</b>
     *  * <p>
     *  *  Code: F6544
     *  * <p>
     *  * 
     */
    @JsonProperty("F6544")
    @XmlEnumValue("F6544")
    Verfassungsgerichtshof_Berlin("F6544"),

    /**
     * <b>Europ&#228;isches Mahngericht Deutschland</b>
     *  * <p>
     *  *  Code: F6545
     *  * <p>
     *  * 
     */
    @JsonProperty("F6545")
    @XmlEnumValue("F6545")
    Europaeisches_Mahngericht_Deutschland("F6545"),

    /**
     * <b>Amtsgericht Tiergarten, Verkehrs- und Wirtschaftsstrafsachen</b>
     *  * <p>
     *  *  Code: F6552
     *  * <p>
     *  * 
     */
    @JsonProperty("F6552")
    @XmlEnumValue("F6552")
    Amtsgericht_Tiergarten_Verkehrs_und_Wirtschaftsstrafsachen("F6552"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Pankow-Wei&#223;ensee, Familiengericht</b>
     *  * <p>
     *  *  Code: F6553
     *  * <p>
     *  * 
     */
    @JsonProperty("F6553")
    @XmlEnumValue("F6553")
    aufgeloest_Amtsgericht_Pankow_Weissensee_Familiengericht("F6553"),

    /**
     * <b>Justizvollzugsanstalt f&#252;r Frauen Berlin</b>
     *  * <p>
     *  *  Code: F7460
     *  * <p>
     *  * 
     */
    @JsonProperty("F7460")
    @XmlEnumValue("F7460")
    Justizvollzugsanstalt_fuer_Frauen_Berlin("F7460"),

    /**
     * <b>Justizvollzugsanstalt Pl&#246;tzensee</b>
     *  * <p>
     *  *  Code: F7464
     *  * <p>
     *  * 
     */
    @JsonProperty("F7464")
    @XmlEnumValue("F7464")
    Justizvollzugsanstalt_Ploetzensee("F7464"),

    /**
     * <b>Justizvollzugsanstalt des Offenen Vollzuges Berlin</b>
     *  * <p>
     *  *  Code: F7599
     *  * <p>
     *  * 
     */
    @JsonProperty("F7599")
    @XmlEnumValue("F7599")
    Justizvollzugsanstalt_des_Offenen_Vollzuges_Berlin("F7599"),

    /**
     * <b>Brandenburgisches Oberlandesgericht</b>
     *  * <p>
     *  *  Code: G1000
     *  * <p>
     *  * 
     */
    @JsonProperty("G1000")
    @XmlEnumValue("G1000")
    Brandenburgisches_Oberlandesgericht("G1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Brandenburg a. d. Havel</b>
     *  * <p>
     *  *  Code: G1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1000S")
    @XmlEnumValue("G1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Brandenburg_a_d_Havel("G1000S"),

    /**
     * <b>Generalstaatsanwaltschaft des Landes Brandenburg, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: G1001S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1001S")
    @XmlEnumValue("G1001S")
    Generalstaatsanwaltschaft_des_Landes_Brandenburg_Rechtshilfe("G1001S"),

    /**
     * <b>Landgericht Cottbus</b>
     *  * <p>
     *  *  Code: G1100
     *  * <p>
     *  * 
     */
    @JsonProperty("G1100")
    @XmlEnumValue("G1100")
    Landgericht_Cottbus("G1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Cottbus</b>
     *  * <p>
     *  *  Code: G1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1100S")
    @XmlEnumValue("G1100S")
    Staatsanwaltschaft_beim_Landgericht_Cottbus("G1100S"),

    /**
     * <b>Amtsgericht Bad Liebenwerda</b>
     *  * <p>
     *  *  Code: G1101
     *  * <p>
     *  * 
     */
    @JsonProperty("G1101")
    @XmlEnumValue("G1101")
    Amtsgericht_Bad_Liebenwerda("G1101"),

    /**
     * <b>Grundbuchamt Bad Liebenwerda</b>
     *  * <p>
     *  *  Code: G1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1101G")
    @XmlEnumValue("G1101G")
    Grundbuchamt_Bad_Liebenwerda("G1101G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Calau (in L&#252;bbenau)</b>
     *  * <p>
     *  *  Code: G1102
     *  * <p>
     *  * 
     */
    @JsonProperty("G1102")
    @XmlEnumValue("G1102")
    aufgeloest_Amtsgericht_Calau_in_Luebbenau("G1102"),

    /**
     * <b>Amtsgericht Cottbus</b>
     *  * <p>
     *  *  Code: G1103
     *  * <p>
     *  * 
     */
    @JsonProperty("G1103")
    @XmlEnumValue("G1103")
    Amtsgericht_Cottbus("G1103"),

    /**
     * <b>Grundbuchamt Cottbus</b>
     *  * <p>
     *  *  Code: G1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1103G")
    @XmlEnumValue("G1103G")
    Grundbuchamt_Cottbus("G1103G"),

    /**
     * <b>Amtsgericht Bad Liebenwerda Zweigstelle Finsterwalde</b>
     *  * <p>
     *  *  Code: G1105
     *  * <p>
     *  * 
     */
    @JsonProperty("G1105")
    @XmlEnumValue("G1105")
    Amtsgericht_Bad_Liebenwerda_Zweigstelle_Finsterwalde("G1105"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Forst/Lausitz</b>
     *  * <p>
     *  *  Code: G1106
     *  * <p>
     *  * 
     */
    @JsonProperty("G1106")
    @XmlEnumValue("G1106")
    aufgeloest_Amtsgericht_Forst_Lausitz("G1106"),

    /**
     * <b>Amtsgericht Guben</b>
     *  * <p>
     *  *  Code: G1107
     *  * <p>
     *  * 
     */
    @JsonProperty("G1107")
    @XmlEnumValue("G1107")
    Amtsgericht_Guben("G1107"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Herzberg/Elster</b>
     *  * <p>
     *  *  Code: G1108
     *  * <p>
     *  * 
     */
    @JsonProperty("G1108")
    @XmlEnumValue("G1108")
    aufgeloest_Amtsgericht_Herzberg_Elster("G1108"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Luckau</b>
     *  * <p>
     *  *  Code: G1109
     *  * <p>
     *  * 
     */
    @JsonProperty("G1109")
    @XmlEnumValue("G1109")
    aufgeloest_Amtsgericht_Luckau("G1109"),

    /**
     * <b>Amtsgericht L&#252;bben</b>
     *  * <p>
     *  *  Code: G1110
     *  * <p>
     *  * 
     */
    @JsonProperty("G1110")
    @XmlEnumValue("G1110")
    Amtsgericht_Luebben("G1110"),

    /**
     * <b>Grundbuchamt L&#252;bben (Spreewald)</b>
     *  * <p>
     *  *  Code: G1110G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1110G")
    @XmlEnumValue("G1110G")
    Grundbuchamt_Luebben_Spreewald("G1110G"),

    /**
     * <b>Amtsgericht Senftenberg</b>
     *  * <p>
     *  *  Code: G1111
     *  * <p>
     *  * 
     */
    @JsonProperty("G1111")
    @XmlEnumValue("G1111")
    Amtsgericht_Senftenberg("G1111"),

    /**
     * <b>Grundbuchamt Senftenberg</b>
     *  * <p>
     *  *  Code: G1111G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1111G")
    @XmlEnumValue("G1111G")
    Grundbuchamt_Senftenberg("G1111G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Spremberg</b>
     *  * <p>
     *  *  Code: G1112
     *  * <p>
     *  * 
     */
    @JsonProperty("G1112")
    @XmlEnumValue("G1112")
    aufgeloest_Amtsgericht_Spremberg("G1112"),

    /**
     * <b>Staatsanwaltschaft bei dem Landgericht Cottbus, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: G1113S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1113S")
    @XmlEnumValue("G1113S")
    Staatsanwaltschaft_bei_dem_Landgericht_Cottbus_Rechtshilfe("G1113S"),

    /**
     * <b>Landgericht Frankfurt/Oder</b>
     *  * <p>
     *  *  Code: G1200
     *  * <p>
     *  * 
     */
    @JsonProperty("G1200")
    @XmlEnumValue("G1200")
    Landgericht_Frankfurt_Oder("G1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Frankfurt/Oder</b>
     *  * <p>
     *  *  Code: G1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1200S")
    @XmlEnumValue("G1200S")
    Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder("G1200S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schwedt, Zwst. Angerm&#252;nde</b>
     *  * <p>
     *  *  Code: G1201
     *  * <p>
     *  * 
     */
    @JsonProperty("G1201")
    @XmlEnumValue("G1201")
    aufgeloest_Amtsgericht_Schwedt_Zwst_Angermuende("G1201"),

    /**
     * <b>Amtsgericht Bad Freienwalde</b>
     *  * <p>
     *  *  Code: G1202
     *  * <p>
     *  * 
     */
    @JsonProperty("G1202")
    @XmlEnumValue("G1202")
    Amtsgericht_Bad_Freienwalde("G1202"),

    /**
     * <b>Grundbuchamt Bad Freienwalde (Oder)</b>
     *  * <p>
     *  *  Code: G1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1202G")
    @XmlEnumValue("G1202G")
    Grundbuchamt_Bad_Freienwalde_Oder("G1202G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Beeskow</b>
     *  * <p>
     *  *  Code: G1203
     *  * <p>
     *  * 
     */
    @JsonProperty("G1203")
    @XmlEnumValue("G1203")
    aufgeloest_Amtsgericht_Beeskow("G1203"),

    /**
     * <b>Amtsgericht Bernau</b>
     *  * <p>
     *  *  Code: G1204
     *  * <p>
     *  * 
     */
    @JsonProperty("G1204")
    @XmlEnumValue("G1204")
    Amtsgericht_Bernau("G1204"),

    /**
     * <b>Grundbuchamt Bernau bei Berlin</b>
     *  * <p>
     *  *  Code: G1204G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1204G")
    @XmlEnumValue("G1204G")
    Grundbuchamt_Bernau_bei_Berlin("G1204G"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankfurt/Oder, Zwst. Bernau</b>
     *  * <p>
     *  *  Code: G1204S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1204S")
    @XmlEnumValue("G1204S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder_Zwst_Bernau("G1204S"),

    /**
     * <b>Amtsgericht Eberswalde</b>
     *  * <p>
     *  *  Code: G1205
     *  * <p>
     *  * 
     */
    @JsonProperty("G1205")
    @XmlEnumValue("G1205")
    Amtsgericht_Eberswalde("G1205"),

    /**
     * <b>Grundbuchamt Eberswalde</b>
     *  * <p>
     *  *  Code: G1205G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1205G")
    @XmlEnumValue("G1205G")
    Grundbuchamt_Eberswalde("G1205G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Eberswalde, Zwst. der StA Frankfurt/Oder</b>
     *  * <p>
     *  *  Code: G1205S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1205S")
    @XmlEnumValue("G1205S")
    Staatsanwaltschaft_beim_Landgericht_Eberswalde_Zwst_der_StA_Frankfurt_Oder("G1205S"),

    /**
     * <b>Amtsgericht Eisenh&#252;ttenstadt</b>
     *  * <p>
     *  *  Code: G1206
     *  * <p>
     *  * 
     */
    @JsonProperty("G1206")
    @XmlEnumValue("G1206")
    Amtsgericht_Eisenhuettenstadt("G1206"),

    /**
     * <b>Grundbuchamt Eisenh&#252;ttenstadt</b>
     *  * <p>
     *  *  Code: G1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1206G")
    @XmlEnumValue("G1206G")
    Grundbuchamt_Eisenhuettenstadt("G1206G"),

    /**
     * <b>Amtsgericht Frankfurt/Oder</b>
     *  * <p>
     *  *  Code: G1207
     *  * <p>
     *  * 
     */
    @JsonProperty("G1207")
    @XmlEnumValue("G1207")
    Amtsgericht_Frankfurt_Oder("G1207"),

    /**
     * <b>Grundbuchamt Frankfurt/Oder</b>
     *  * <p>
     *  *  Code: G1207G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1207G")
    @XmlEnumValue("G1207G")
    Grundbuchamt_Frankfurt_Oder("G1207G"),

    /**
     * <b>Amtsgericht F&#252;rstenwalde</b>
     *  * <p>
     *  *  Code: G1208
     *  * <p>
     *  * 
     */
    @JsonProperty("G1208")
    @XmlEnumValue("G1208")
    Amtsgericht_Fuerstenwalde("G1208"),

    /**
     * <b>Grundbuchamt F&#252;rstenwalde/Spree</b>
     *  * <p>
     *  *  Code: G1208G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1208G")
    @XmlEnumValue("G1208G")
    Grundbuchamt_Fuerstenwalde_Spree("G1208G"),

    /**
     * <b>Amtsgericht Prenzlau</b>
     *  * <p>
     *  *  Code: G1209
     *  * <p>
     *  * 
     */
    @JsonProperty("G1209")
    @XmlEnumValue("G1209")
    Amtsgericht_Prenzlau("G1209"),

    /**
     * <b>Grundbuchamt Prenzlau</b>
     *  * <p>
     *  *  Code: G1209G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1209G")
    @XmlEnumValue("G1209G")
    Grundbuchamt_Prenzlau("G1209G"),

    /**
     * <b>Amtsgericht Schwedt</b>
     *  * <p>
     *  *  Code: G1210
     *  * <p>
     *  * 
     */
    @JsonProperty("G1210")
    @XmlEnumValue("G1210")
    Amtsgericht_Schwedt("G1210"),

    /**
     * <b>Grundbuchamt Schwedt/Oder</b>
     *  * <p>
     *  *  Code: G1210G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1210G")
    @XmlEnumValue("G1210G")
    Grundbuchamt_Schwedt_Oder("G1210G"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankfurt/Oder, Zwst. Schwedt</b>
     *  * <p>
     *  *  Code: G1210S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1210S")
    @XmlEnumValue("G1210S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder_Zwst_Schwedt("G1210S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Seelow</b>
     *  * <p>
     *  *  Code: G1211
     *  * <p>
     *  * 
     */
    @JsonProperty("G1211")
    @XmlEnumValue("G1211")
    aufgeloest_Amtsgericht_Seelow("G1211"),

    /**
     * <b>Amtsgericht Strausberg</b>
     *  * <p>
     *  *  Code: G1212
     *  * <p>
     *  * 
     */
    @JsonProperty("G1212")
    @XmlEnumValue("G1212")
    Amtsgericht_Strausberg("G1212"),

    /**
     * <b>Grundbuchamt Strausberg</b>
     *  * <p>
     *  *  Code: G1212G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1212G")
    @XmlEnumValue("G1212G")
    Grundbuchamt_Strausberg("G1212G"),

    /**
     * <b>Amtsgericht Prenzlau Zweigstelle Templin</b>
     *  * <p>
     *  *  Code: G1213
     *  * <p>
     *  * 
     */
    @JsonProperty("G1213")
    @XmlEnumValue("G1213")
    Amtsgericht_Prenzlau_Zweigstelle_Templin("G1213"),

    /**
     * <b>Staatsanwaltschaft bei dem Landgericht Frankfurt/Oder, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: G1214S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1214S")
    @XmlEnumValue("G1214S")
    Staatsanwaltschaft_bei_dem_Landgericht_Frankfurt_Oder_Rechtshilfe("G1214S"),

    /**
     * <b>Landgericht Potsdam</b>
     *  * <p>
     *  *  Code: G1300
     *  * <p>
     *  * 
     */
    @JsonProperty("G1300")
    @XmlEnumValue("G1300")
    Landgericht_Potsdam("G1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Potsdam</b>
     *  * <p>
     *  *  Code: G1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1300S")
    @XmlEnumValue("G1300S")
    Staatsanwaltschaft_beim_Landgericht_Potsdam("G1300S"),

    /**
     * <b>Amtsgericht Brandenburg Zweigstelle Belzig</b>
     *  * <p>
     *  *  Code: G1301
     *  * <p>
     *  * 
     */
    @JsonProperty("G1301")
    @XmlEnumValue("G1301")
    Amtsgericht_Brandenburg_Zweigstelle_Belzig("G1301"),

    /**
     * <b>Amtsgericht Brandenburg an der Havel</b>
     *  * <p>
     *  *  Code: G1302
     *  * <p>
     *  * 
     */
    @JsonProperty("G1302")
    @XmlEnumValue("G1302")
    Amtsgericht_Brandenburg_an_der_Havel("G1302"),

    /**
     * <b>Grundbuchamt Brandenburg an der Havel</b>
     *  * <p>
     *  *  Code: G1302G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1302G")
    @XmlEnumValue("G1302G")
    Grundbuchamt_Brandenburg_an_der_Havel("G1302G"),

    /**
     * <b>Amtsgericht Zehdenick</b>
     *  * <p>
     *  *  Code: G1303
     *  * <p>
     *  * 
     */
    @JsonProperty("G1303")
    @XmlEnumValue("G1303")
    Amtsgericht_Zehdenick("G1303"),

    /**
     * <b>Grundbuchamt Zehdenick</b>
     *  * <p>
     *  *  Code: G1303G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1303G")
    @XmlEnumValue("G1303G")
    Grundbuchamt_Zehdenick("G1303G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht J&#252;terbog</b>
     *  * <p>
     *  *  Code: G1304
     *  * <p>
     *  * 
     */
    @JsonProperty("G1304")
    @XmlEnumValue("G1304")
    aufgeloest_Amtsgericht_Jueterbog("G1304"),

    /**
     * <b>Amtsgericht K&#246;nigs Wusterhausen</b>
     *  * <p>
     *  *  Code: G1305
     *  * <p>
     *  * 
     */
    @JsonProperty("G1305")
    @XmlEnumValue("G1305")
    Amtsgericht_Koenigs_Wusterhausen("G1305"),

    /**
     * <b>Grundbuchamt K&#246;nigs Wusterhausen</b>
     *  * <p>
     *  *  Code: G1305G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1305G")
    @XmlEnumValue("G1305G")
    Grundbuchamt_Koenigs_Wusterhausen("G1305G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kyritz</b>
     *  * <p>
     *  *  Code: G1306
     *  * <p>
     *  * 
     */
    @JsonProperty("G1306")
    @XmlEnumValue("G1306")
    aufgeloest_Amtsgericht_Kyritz("G1306"),

    /**
     * <b>Amtsgericht Luckenwalde</b>
     *  * <p>
     *  *  Code: G1307
     *  * <p>
     *  * 
     */
    @JsonProperty("G1307")
    @XmlEnumValue("G1307")
    Amtsgericht_Luckenwalde("G1307"),

    /**
     * <b>Grundbuchamt Luckenwalde</b>
     *  * <p>
     *  *  Code: G1307G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1307G")
    @XmlEnumValue("G1307G")
    Grundbuchamt_Luckenwalde("G1307G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Luckenwalde, Zwst. der StA Potsdam</b>
     *  * <p>
     *  *  Code: G1307S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1307S")
    @XmlEnumValue("G1307S")
    Staatsanwaltschaft_beim_Landgericht_Luckenwalde_Zwst_der_StA_Potsdam("G1307S"),

    /**
     * <b>Amtsgericht Nauen</b>
     *  * <p>
     *  *  Code: G1308
     *  * <p>
     *  * 
     */
    @JsonProperty("G1308")
    @XmlEnumValue("G1308")
    Amtsgericht_Nauen("G1308"),

    /**
     * <b>Grundbuchamt Nauen</b>
     *  * <p>
     *  *  Code: G1308G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1308G")
    @XmlEnumValue("G1308G")
    Grundbuchamt_Nauen("G1308G"),

    /**
     * <b>Amtsgericht Nauen, Zentrales Vollstreckungsgericht Brandenburg</b>
     *  * <p>
     *  *  Code: G1308R
     *  * <p>
     *  * 
     */
    @JsonProperty("G1308R")
    @XmlEnumValue("G1308R")
    Amtsgericht_Nauen_Zentrales_Vollstreckungsgericht_Brandenburg("G1308R"),

    /**
     * <b>Amtsgericht Neuruppin</b>
     *  * <p>
     *  *  Code: G1309
     *  * <p>
     *  * 
     */
    @JsonProperty("G1309")
    @XmlEnumValue("G1309")
    Amtsgericht_Neuruppin("G1309"),

    /**
     * <b>Grundbuchamt Neuruppin</b>
     *  * <p>
     *  *  Code: G1309G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1309G")
    @XmlEnumValue("G1309G")
    Grundbuchamt_Neuruppin("G1309G"),

    /**
     * <b>Amtsgericht Oranienburg</b>
     *  * <p>
     *  *  Code: G1310
     *  * <p>
     *  * 
     */
    @JsonProperty("G1310")
    @XmlEnumValue("G1310")
    Amtsgericht_Oranienburg("G1310"),

    /**
     * <b>Grundbuchamt Oranienburg</b>
     *  * <p>
     *  *  Code: G1310G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1310G")
    @XmlEnumValue("G1310G")
    Grundbuchamt_Oranienburg("G1310G"),

    /**
     * <b>Amtsgericht Perleberg</b>
     *  * <p>
     *  *  Code: G1311
     *  * <p>
     *  * 
     */
    @JsonProperty("G1311")
    @XmlEnumValue("G1311")
    Amtsgericht_Perleberg("G1311"),

    /**
     * <b>Grundbuchamt Perleberg</b>
     *  * <p>
     *  *  Code: G1311G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1311G")
    @XmlEnumValue("G1311G")
    Grundbuchamt_Perleberg("G1311G"),

    /**
     * <b>Amtsgericht Potsdam</b>
     *  * <p>
     *  *  Code: G1312
     *  * <p>
     *  * 
     */
    @JsonProperty("G1312")
    @XmlEnumValue("G1312")
    Amtsgericht_Potsdam("G1312"),

    /**
     * <b>Grundbuchamt Potsdam</b>
     *  * <p>
     *  *  Code: G1312G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1312G")
    @XmlEnumValue("G1312G")
    Grundbuchamt_Potsdam("G1312G"),

    /**
     * <b>Amtsgericht Perleberg Zweigstelle Pritzwalk</b>
     *  * <p>
     *  *  Code: G1314
     *  * <p>
     *  * 
     */
    @JsonProperty("G1314")
    @XmlEnumValue("G1314")
    Amtsgericht_Perleberg_Zweigstelle_Pritzwalk("G1314"),

    /**
     * <b>Amtsgericht Rathenow</b>
     *  * <p>
     *  *  Code: G1315
     *  * <p>
     *  * 
     */
    @JsonProperty("G1315")
    @XmlEnumValue("G1315")
    Amtsgericht_Rathenow("G1315"),

    /**
     * <b>Grundbuchamt Rathenow</b>
     *  * <p>
     *  *  Code: G1315G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1315G")
    @XmlEnumValue("G1315G")
    Grundbuchamt_Rathenow("G1315G"),

    /**
     * <b>Amtsgericht Neuruppin Zweigstelle Wittstock</b>
     *  * <p>
     *  *  Code: G1316
     *  * <p>
     *  * 
     */
    @JsonProperty("G1316")
    @XmlEnumValue("G1316")
    Amtsgericht_Neuruppin_Zweigstelle_Wittstock("G1316"),

    /**
     * <b>Amtsgericht Zossen</b>
     *  * <p>
     *  *  Code: G1317
     *  * <p>
     *  * 
     */
    @JsonProperty("G1317")
    @XmlEnumValue("G1317")
    Amtsgericht_Zossen("G1317"),

    /**
     * <b>Grundbuchamt Zossen</b>
     *  * <p>
     *  *  Code: G1317G
     *  * <p>
     *  * 
     */
    @JsonProperty("G1317G")
    @XmlEnumValue("G1317G")
    Grundbuchamt_Zossen("G1317G"),

    /**
     * <b>Amtsgericht Zehdenick Zweigstelle Gransee</b>
     *  * <p>
     *  *  Code: G1318
     *  * <p>
     *  * 
     */
    @JsonProperty("G1318")
    @XmlEnumValue("G1318")
    Amtsgericht_Zehdenick_Zweigstelle_Gransee("G1318"),

    /**
     * <b>Staatsanwaltschaft bei dem Landgericht Potsdam, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: G1319S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1319S")
    @XmlEnumValue("G1319S")
    Staatsanwaltschaft_bei_dem_Landgericht_Potsdam_Rechtshilfe("G1319S"),

    /**
     * <b>Landgericht Neuruppin</b>
     *  * <p>
     *  *  Code: G1400
     *  * <p>
     *  * 
     */
    @JsonProperty("G1400")
    @XmlEnumValue("G1400")
    Landgericht_Neuruppin("G1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Neuruppin</b>
     *  * <p>
     *  *  Code: G1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1400S")
    @XmlEnumValue("G1400S")
    Staatsanwaltschaft_beim_Landgericht_Neuruppin("G1400S"),

    /**
     * <b>Staatsanwaltschaft bei dem Landgericht Neuruppin, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: G1401S
     *  * <p>
     *  * 
     */
    @JsonProperty("G1401S")
    @XmlEnumValue("G1401S")
    Staatsanwaltschaft_bei_dem_Landgericht_Neuruppin_Rechtshilfe("G1401S"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Landes Brandenburg</b>
     *  * <p>
     *  *  Code: G6002
     *  * <p>
     *  * 
     */
    @JsonProperty("G6002")
    @XmlEnumValue("G6002")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Landes_Brandenburg("G6002"),

    /**
     * <b>Brandenburgischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: G6008
     *  * <p>
     *  * 
     */
    @JsonProperty("G6008")
    @XmlEnumValue("G6008")
    Brandenburgischer_Anwaltsgerichtshof("G6008"),

    /**
     * <b>Justizvollzugsanstalt Brandenburg an der Havel</b>
     *  * <p>
     *  *  Code: G6017
     *  * <p>
     *  * 
     */
    @JsonProperty("G6017")
    @XmlEnumValue("G6017")
    Justizvollzugsanstalt_Brandenburg_an_der_Havel("G6017"),

    /**
     * <b>Verwaltungsgericht Potsdam</b>
     *  * <p>
     *  *  Code: G6076
     *  * <p>
     *  * 
     */
    @JsonProperty("G6076")
    @XmlEnumValue("G6076")
    Verwaltungsgericht_Potsdam("G6076"),

    /**
     * <b>Verwaltungsgericht Cottbus</b>
     *  * <p>
     *  *  Code: G6590
     *  * <p>
     *  * 
     */
    @JsonProperty("G6590")
    @XmlEnumValue("G6590")
    Verwaltungsgericht_Cottbus("G6590"),

    /**
     * <b>Justizvollzugsanstalt Cottbus-Dissenchen</b>
     *  * <p>
     *  *  Code: G6630
     *  * <p>
     *  * 
     */
    @JsonProperty("G6630")
    @XmlEnumValue("G6630")
    Justizvollzugsanstalt_Cottbus_Dissenchen("G6630"),

    /**
     * <b>Finanzgericht Berlin-Brandenburg</b>
     *  * <p>
     *  *  Code: G6657
     *  * <p>
     *  * 
     */
    @JsonProperty("G6657")
    @XmlEnumValue("G6657")
    Finanzgericht_Berlin_Brandenburg("G6657"),

    /**
     * <b>Landessozialgericht Berlin-Brandenburg</b>
     *  * <p>
     *  *  Code: G6664
     *  * <p>
     *  * 
     */
    @JsonProperty("G6664")
    @XmlEnumValue("G6664")
    Landessozialgericht_Berlin_Brandenburg("G6664"),

    /**
     * <b>Verwaltungsgericht Frankfurt//Oder</b>
     *  * <p>
     *  *  Code: G6669
     *  * <p>
     *  * 
     */
    @JsonProperty("G6669")
    @XmlEnumValue("G6669")
    Verwaltungsgericht_Frankfurt_Oder("G6669"),

    /**
     * <b>Justizvollzugsanstalt Luckau-Duben</b>
     *  * <p>
     *  *  Code: G6671
     *  * <p>
     *  * 
     */
    @JsonProperty("G6671")
    @XmlEnumValue("G6671")
    Justizvollzugsanstalt_Luckau_Duben("G6671"),

    /**
     * <b>Sozialgericht Cottbus</b>
     *  * <p>
     *  *  Code: G6672
     *  * <p>
     *  * 
     */
    @JsonProperty("G6672")
    @XmlEnumValue("G6672")
    Sozialgericht_Cottbus("G6672"),

    /**
     * <b>Sozialgericht Frankfurt (Oder)</b>
     *  * <p>
     *  *  Code: G6673
     *  * <p>
     *  * 
     */
    @JsonProperty("G6673")
    @XmlEnumValue("G6673")
    Sozialgericht_Frankfurt_Oder("G6673"),

    /**
     * <b>Sozialgericht Neuruppin</b>
     *  * <p>
     *  *  Code: G6674
     *  * <p>
     *  * 
     */
    @JsonProperty("G6674")
    @XmlEnumValue("G6674")
    Sozialgericht_Neuruppin("G6674"),

    /**
     * <b>Sozialgericht Potsdam</b>
     *  * <p>
     *  *  Code: G6675
     *  * <p>
     *  * 
     */
    @JsonProperty("G6675")
    @XmlEnumValue("G6675")
    Sozialgericht_Potsdam("G6675"),

    /**
     * <b>Arbeitsgericht Brandenburg an der Havel</b>
     *  * <p>
     *  *  Code: G6676
     *  * <p>
     *  * 
     */
    @JsonProperty("G6676")
    @XmlEnumValue("G6676")
    Arbeitsgericht_Brandenburg_an_der_Havel("G6676"),

    /**
     * <b>Arbeitsgericht Cottbus</b>
     *  * <p>
     *  *  Code: G6677
     *  * <p>
     *  * 
     */
    @JsonProperty("G6677")
    @XmlEnumValue("G6677")
    Arbeitsgericht_Cottbus("G6677"),

    /**
     * <b>Arbeitsgericht Eberswalde</b>
     *  * <p>
     *  *  Code: G6678
     *  * <p>
     *  * 
     */
    @JsonProperty("G6678")
    @XmlEnumValue("G6678")
    Arbeitsgericht_Eberswalde("G6678"),

    /**
     * <b>Arbeitsgericht Frankfurt (Oder)</b>
     *  * <p>
     *  *  Code: G6679
     *  * <p>
     *  * 
     */
    @JsonProperty("G6679")
    @XmlEnumValue("G6679")
    Arbeitsgericht_Frankfurt_Oder("G6679"),

    /**
     * <b>Arbeitsgericht Neuruppin</b>
     *  * <p>
     *  *  Code: G6680
     *  * <p>
     *  * 
     */
    @JsonProperty("G6680")
    @XmlEnumValue("G6680")
    Arbeitsgericht_Neuruppin("G6680"),

    /**
     * <b>Arbeitsgericht Potsdam</b>
     *  * <p>
     *  *  Code: G6681
     *  * <p>
     *  * 
     */
    @JsonProperty("G6681")
    @XmlEnumValue("G6681")
    Arbeitsgericht_Potsdam("G6681"),

    /**
     * <b>Arbeitsgericht Senftenberg</b>
     *  * <p>
     *  *  Code: G6682
     *  * <p>
     *  * 
     */
    @JsonProperty("G6682")
    @XmlEnumValue("G6682")
    Arbeitsgericht_Senftenberg("G6682"),

    /**
     * <b>Verfassungsgericht Brandenburg</b>
     *  * <p>
     *  *  Code: G6696
     *  * <p>
     *  * 
     */
    @JsonProperty("G6696")
    @XmlEnumValue("G6696")
    Verfassungsgericht_Brandenburg("G6696"),

    /**
     * <b>Justizvollzugsanstalt Heidering</b>
     *  * <p>
     *  *  Code: G6726
     *  * <p>
     *  * 
     */
    @JsonProperty("G6726")
    @XmlEnumValue("G6726")
    Justizvollzugsanstalt_Heidering("G6726"),

    /**
     * <b>Hanseatisches Oberlandesgericht in Bremen</b>
     *  * <p>
     *  *  Code: H1000
     *  * <p>
     *  * 
     */
    @JsonProperty("H1000")
    @XmlEnumValue("H1000")
    Hanseatisches_Oberlandesgericht_in_Bremen("H1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Bremen</b>
     *  * <p>
     *  *  Code: H1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("H1000S")
    @XmlEnumValue("H1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Bremen("H1000S"),

    /**
     * <b>Landgericht Bremen</b>
     *  * <p>
     *  *  Code: H1100
     *  * <p>
     *  * 
     */
    @JsonProperty("H1100")
    @XmlEnumValue("H1100")
    Landgericht_Bremen("H1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bremen</b>
     *  * <p>
     *  *  Code: H1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("H1100S")
    @XmlEnumValue("H1100S")
    Staatsanwaltschaft_beim_Landgericht_Bremen("H1100S"),

    /**
     * <b>Amtsgericht Bremen</b>
     *  * <p>
     *  *  Code: H1101
     *  * <p>
     *  * 
     */
    @JsonProperty("H1101")
    @XmlEnumValue("H1101")
    Amtsgericht_Bremen("H1101"),

    /**
     * <b>Grundbuchamt Bremen</b>
     *  * <p>
     *  *  Code: H1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("H1101G")
    @XmlEnumValue("H1101G")
    Grundbuchamt_Bremen("H1101G"),

    /**
     * <b>Amtsgericht Bremerhaven</b>
     *  * <p>
     *  *  Code: H1102
     *  * <p>
     *  * 
     */
    @JsonProperty("H1102")
    @XmlEnumValue("H1102")
    Amtsgericht_Bremerhaven("H1102"),

    /**
     * <b>Grundbuchamt Bremerhaven</b>
     *  * <p>
     *  *  Code: H1102G
     *  * <p>
     *  * 
     */
    @JsonProperty("H1102G")
    @XmlEnumValue("H1102G")
    Grundbuchamt_Bremerhaven("H1102G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bremerhaven, Zwst. der StA Bremen</b>
     *  * <p>
     *  *  Code: H1102S
     *  * <p>
     *  * 
     */
    @JsonProperty("H1102S")
    @XmlEnumValue("H1102S")
    Staatsanwaltschaft_beim_Landgericht_Bremerhaven_Zwst_der_StA_Bremen("H1102S"),

    /**
     * <b>Amtsgericht Bremerhaven, zentrales Vollstreckungsgericht Bremen</b>
     *  * <p>
     *  *  Code: H1102V
     *  * <p>
     *  * 
     */
    @JsonProperty("H1102V")
    @XmlEnumValue("H1102V")
    Amtsgericht_Bremerhaven_zentrales_Vollstreckungsgericht_Bremen("H1102V"),

    /**
     * <b>Amtsgericht Bremen-Blumenthal</b>
     *  * <p>
     *  *  Code: H1103
     *  * <p>
     *  * 
     */
    @JsonProperty("H1103")
    @XmlEnumValue("H1103")
    Amtsgericht_Bremen_Blumenthal("H1103"),

    /**
     * <b>Grundbuchamt Bremen-Blumenthal</b>
     *  * <p>
     *  *  Code: H1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("H1103G")
    @XmlEnumValue("H1103G")
    Grundbuchamt_Bremen_Blumenthal("H1103G"),

    /**
     * <b>Anwaltsgerichtshof der Freien und Hansestadt Bremen</b>
     *  * <p>
     *  *  Code: H6026
     *  * <p>
     *  * 
     */
    @JsonProperty("H6026")
    @XmlEnumValue("H6026")
    Anwaltsgerichtshof_der_Freien_und_Hansestadt_Bremen("H6026"),

    /**
     * <b>Sozialgericht Bremen</b>
     *  * <p>
     *  *  Code: H6032
     *  * <p>
     *  * 
     */
    @JsonProperty("H6032")
    @XmlEnumValue("H6032")
    Sozialgericht_Bremen("H6032"),

    /**
     * <b>Landessozialgericht Bremen</b>
     *  * <p>
     *  *  Code: H6033
     *  * <p>
     *  * 
     */
    @JsonProperty("H6033")
    @XmlEnumValue("H6033")
    Landessozialgericht_Bremen("H6033"),

    /**
     * <b>Arbeitsgericht Bremen</b>
     *  * <p>
     *  *  Code: H6034
     *  * <p>
     *  * 
     */
    @JsonProperty("H6034")
    @XmlEnumValue("H6034")
    Arbeitsgericht_Bremen("H6034"),

    /**
     * <b>Landesarbeitsgericht Bremen</b>
     *  * <p>
     *  *  Code: H6035
     *  * <p>
     *  * 
     */
    @JsonProperty("H6035")
    @XmlEnumValue("H6035")
    Landesarbeitsgericht_Bremen("H6035"),

    /**
     * <b>Oberverwaltungsgericht der Freien Hansestadt Bremen</b>
     *  * <p>
     *  *  Code: H6036
     *  * <p>
     *  * 
     */
    @JsonProperty("H6036")
    @XmlEnumValue("H6036")
    Oberverwaltungsgericht_der_Freien_Hansestadt_Bremen("H6036"),

    /**
     * <b>Verwaltungsgericht der Freien Hansestadt Bremen</b>
     *  * <p>
     *  *  Code: H6037
     *  * <p>
     *  * 
     */
    @JsonProperty("H6037")
    @XmlEnumValue("H6037")
    Verwaltungsgericht_der_Freien_Hansestadt_Bremen("H6037"),

    /**
     * <b>Staatsgerichtshof der Freien Hansestadt Bremen</b>
     *  * <p>
     *  *  Code: H6038
     *  * <p>
     *  * 
     */
    @JsonProperty("H6038")
    @XmlEnumValue("H6038")
    Staatsgerichtshof_der_Freien_Hansestadt_Bremen("H6038"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Bremerhaven</b>
     *  * <p>
     *  *  Code: H6039
     *  * <p>
     *  * 
     */
    @JsonProperty("H6039")
    @XmlEnumValue("H6039")
    aufgeloest_Arbeitsgericht_Bremerhaven("H6039"),

    /**
     * <b>Finanzgericht Bremen</b>
     *  * <p>
     *  *  Code: H6040
     *  * <p>
     *  * 
     */
    @JsonProperty("H6040")
    @XmlEnumValue("H6040")
    Finanzgericht_Bremen("H6040"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Hanseatischen Rechtsanwaltskammer Bremen</b>
     *  * <p>
     *  *  Code: H6184
     *  * <p>
     *  * 
     */
    @JsonProperty("H6184")
    @XmlEnumValue("H6184")
    Anwaltsgericht_fuer_den_Bezirk_der_Hanseatischen_Rechtsanwaltskammer_Bremen("H6184"),

    /**
     * <b>Justizvollzugsanstalt Bremen</b>
     *  * <p>
     *  *  Code: H6220
     *  * <p>
     *  * 
     */
    @JsonProperty("H6220")
    @XmlEnumValue("H6220")
    Justizvollzugsanstalt_Bremen("H6220"),

    /**
     * <b>Justizvollzugsanstalt Bremen, Offener Vollzug/Frauenvollzug</b>
     *  * <p>
     *  *  Code: H6233
     *  * <p>
     *  * 
     */
    @JsonProperty("H6233")
    @XmlEnumValue("H6233")
    Justizvollzugsanstalt_Bremen_Offener_Vollzug_Frauenvollzug("H6233"),

    /**
     * <b>Soziale Dienste der Justiz im Lande Bremen</b>
     *  * <p>
     *  *  Code: H6234
     *  * <p>
     *  * 
     */
    @JsonProperty("H6234")
    @XmlEnumValue("H6234")
    Soziale_Dienste_der_Justiz_im_Lande_Bremen("H6234"),

    /**
     * <b>Hanseatisches Oberlandesgericht Hamburg</b>
     *  * <p>
     *  *  Code: K1000
     *  * <p>
     *  * 
     */
    @JsonProperty("K1000")
    @XmlEnumValue("K1000")
    Hanseatisches_Oberlandesgericht_Hamburg("K1000"),

    /**
     * <b>Generalstaatsanwaltschaft Hamburg</b>
     *  * <p>
     *  *  Code: K1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("K1000S")
    @XmlEnumValue("K1000S")
    Generalstaatsanwaltschaft_Hamburg("K1000S"),

    /**
     * <b>Landgericht Hamburg</b>
     *  * <p>
     *  *  Code: K1100
     *  * <p>
     *  * 
     */
    @JsonProperty("K1100")
    @XmlEnumValue("K1100")
    Landgericht_Hamburg("K1100"),

    /**
     * <b>Staatsanwaltschaft Hamburg</b>
     *  * <p>
     *  *  Code: K1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("K1100S")
    @XmlEnumValue("K1100S")
    Staatsanwaltschaft_Hamburg("K1100S"),

    /**
     * <b>Amtsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K1101
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101")
    @XmlEnumValue("K1101")
    Amtsgericht_Hamburg("K1101"),

    /**
     * <b>Grundbuchamt Hamburg</b>
     *  * <p>
     *  *  Code: K1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101G")
    @XmlEnumValue("K1101G")
    Grundbuchamt_Hamburg("K1101G"),

    /**
     * <b>Amtsgericht Hamburg, Zentralisierter Bereich Insolvenzgericht</b>
     *  * <p>
     *  *  Code: K1101I
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101I")
    @XmlEnumValue("K1101I")
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Insolvenzgericht("K1101I"),

    /**
     * <b>Amtsgericht Hamburg, Zentralisierter Bereich Mahnverfahren</b>
     *  * <p>
     *  *  Code: K1101M
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101M")
    @XmlEnumValue("K1101M")
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Mahnverfahren("K1101M"),

    /**
     * <b>Amtsgericht Hamburg, Zentralisierter Bereich Handelsregister</b>
     *  * <p>
     *  *  Code: K1101R
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101R")
    @XmlEnumValue("K1101R")
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Handelsregister("K1101R"),

    /**
     * <b>Amtsgericht Hamburg, Zentrales Vollstreckungsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K1101V
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101V")
    @XmlEnumValue("K1101V")
    Amtsgericht_Hamburg_Zentrales_Vollstreckungsgericht_Hamburg("K1101V"),

    /**
     * <b>Amtsgericht Hamburg, Schiffsregister</b>
     *  * <p>
     *  *  Code: K1101Z
     *  * <p>
     *  * 
     */
    @JsonProperty("K1101Z")
    @XmlEnumValue("K1101Z")
    Amtsgericht_Hamburg_Schiffsregister("K1101Z"),

    /**
     * <b>Amtsgericht Hamburg-Altona</b>
     *  * <p>
     *  *  Code: K1102
     *  * <p>
     *  * 
     */
    @JsonProperty("K1102")
    @XmlEnumValue("K1102")
    Amtsgericht_Hamburg_Altona("K1102"),

    /**
     * <b>Grundbuchamt Hamburg-Altona</b>
     *  * <p>
     *  *  Code: K1102G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1102G")
    @XmlEnumValue("K1102G")
    Grundbuchamt_Hamburg_Altona("K1102G"),

    /**
     * <b>Amtsgericht Hamburg-Bergedorf</b>
     *  * <p>
     *  *  Code: K1103
     *  * <p>
     *  * 
     */
    @JsonProperty("K1103")
    @XmlEnumValue("K1103")
    Amtsgericht_Hamburg_Bergedorf("K1103"),

    /**
     * <b>Grundbuchamt Hamburg-Bergedorf</b>
     *  * <p>
     *  *  Code: K1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1103G")
    @XmlEnumValue("K1103G")
    Grundbuchamt_Hamburg_Bergedorf("K1103G"),

    /**
     * <b>Amtsgericht Hamburg-Blankenese</b>
     *  * <p>
     *  *  Code: K1104
     *  * <p>
     *  * 
     */
    @JsonProperty("K1104")
    @XmlEnumValue("K1104")
    Amtsgericht_Hamburg_Blankenese("K1104"),

    /**
     * <b>Grundbuchamt Hamburg-Blankenese</b>
     *  * <p>
     *  *  Code: K1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1104G")
    @XmlEnumValue("K1104G")
    Grundbuchamt_Hamburg_Blankenese("K1104G"),

    /**
     * <b>Amtsgericht Hamburg-Harburg</b>
     *  * <p>
     *  *  Code: K1105
     *  * <p>
     *  * 
     */
    @JsonProperty("K1105")
    @XmlEnumValue("K1105")
    Amtsgericht_Hamburg_Harburg("K1105"),

    /**
     * <b>Grundbuchamt Hamburg-Harburg</b>
     *  * <p>
     *  *  Code: K1105G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1105G")
    @XmlEnumValue("K1105G")
    Grundbuchamt_Hamburg_Harburg("K1105G"),

    /**
     * <b>Amtsgericht Hamburg-Wandsbek</b>
     *  * <p>
     *  *  Code: K1106
     *  * <p>
     *  * 
     */
    @JsonProperty("K1106")
    @XmlEnumValue("K1106")
    Amtsgericht_Hamburg_Wandsbek("K1106"),

    /**
     * <b>Grundbuchamt Hamburg-Wandsbek</b>
     *  * <p>
     *  *  Code: K1106G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1106G")
    @XmlEnumValue("K1106G")
    Grundbuchamt_Hamburg_Wandsbek("K1106G"),

    /**
     * <b>Amtsgericht Hamburg-Barmbek</b>
     *  * <p>
     *  *  Code: K1107
     *  * <p>
     *  * 
     */
    @JsonProperty("K1107")
    @XmlEnumValue("K1107")
    Amtsgericht_Hamburg_Barmbek("K1107"),

    /**
     * <b>Grundbuchamt Hamburg-Barmbek</b>
     *  * <p>
     *  *  Code: K1107G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1107G")
    @XmlEnumValue("K1107G")
    Grundbuchamt_Hamburg_Barmbek("K1107G"),

    /**
     * <b>Amtsgericht Hamburg-St. Georg</b>
     *  * <p>
     *  *  Code: K1108
     *  * <p>
     *  * 
     */
    @JsonProperty("K1108")
    @XmlEnumValue("K1108")
    Amtsgericht_Hamburg_St_Georg("K1108"),

    /**
     * <b>Grundbuchamt Hamburg-St. Georg</b>
     *  * <p>
     *  *  Code: K1108G
     *  * <p>
     *  * 
     */
    @JsonProperty("K1108G")
    @XmlEnumValue("K1108G")
    Grundbuchamt_Hamburg_St_Georg("K1108G"),

    /**
     * <b>aufgel&#246;st-Verwaltungsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6046
     *  * <p>
     *  * 
     */
    @JsonProperty("K6046")
    @XmlEnumValue("K6046")
    aufgeloest_Verwaltungsgericht_Hamburg("K6046"),

    /**
     * <b>Hamburgisches Oberverwaltungsgericht</b>
     *  * <p>
     *  *  Code: K6051
     *  * <p>
     *  * 
     */
    @JsonProperty("K6051")
    @XmlEnumValue("K6051")
    Hamburgisches_Oberverwaltungsgericht("K6051"),

    /**
     * <b>Verwaltungsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6052
     *  * <p>
     *  * 
     */
    @JsonProperty("K6052")
    @XmlEnumValue("K6052")
    Verwaltungsgericht_Hamburg("K6052"),

    /**
     * <b>Hamburgisches Verfassungsgericht</b>
     *  * <p>
     *  *  Code: K6053
     *  * <p>
     *  * 
     */
    @JsonProperty("K6053")
    @XmlEnumValue("K6053")
    Hamburgisches_Verfassungsgericht("K6053"),

    /**
     * <b>Landesarbeitsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6054
     *  * <p>
     *  * 
     */
    @JsonProperty("K6054")
    @XmlEnumValue("K6054")
    Landesarbeitsgericht_Hamburg("K6054"),

    /**
     * <b>Arbeitsgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6055
     *  * <p>
     *  * 
     */
    @JsonProperty("K6055")
    @XmlEnumValue("K6055")
    Arbeitsgericht_Hamburg("K6055"),

    /**
     * <b>Landessozialgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6078
     *  * <p>
     *  * 
     */
    @JsonProperty("K6078")
    @XmlEnumValue("K6078")
    Landessozialgericht_Hamburg("K6078"),

    /**
     * <b>Finanzgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6079
     *  * <p>
     *  * 
     */
    @JsonProperty("K6079")
    @XmlEnumValue("K6079")
    Finanzgericht_Hamburg("K6079"),

    /**
     * <b>Sozialgericht Hamburg</b>
     *  * <p>
     *  *  Code: K6083
     *  * <p>
     *  * 
     */
    @JsonProperty("K6083")
    @XmlEnumValue("K6083")
    Sozialgericht_Hamburg("K6083"),

    /**
     * <b>Anwaltsgericht im Bezirk der Hanseatischen Rechtsanwaltskammer Hamburg</b>
     *  * <p>
     *  *  Code: K6165
     *  * <p>
     *  * 
     */
    @JsonProperty("K6165")
    @XmlEnumValue("K6165")
    Anwaltsgericht_im_Bezirk_der_Hanseatischen_Rechtsanwaltskammer_Hamburg("K6165"),

    /**
     * <b>Anwaltsgerichtshof in der Freien und Hansestadt Hamburg</b>
     *  * <p>
     *  *  Code: K6209
     *  * <p>
     *  * 
     */
    @JsonProperty("K6209")
    @XmlEnumValue("K6209")
    Anwaltsgerichtshof_in_der_Freien_und_Hansestadt_Hamburg("K6209"),

    /**
     * <b>Justizvollzugsanstalt Billwerder</b>
     *  * <p>
     *  *  Code: K6274
     *  * <p>
     *  * 
     */
    @JsonProperty("K6274")
    @XmlEnumValue("K6274")
    Justizvollzugsanstalt_Billwerder("K6274"),

    /**
     * <b>Justizvollzugsanstalt Fuhlsb&#252;ttel</b>
     *  * <p>
     *  *  Code: K6411
     *  * <p>
     *  * 
     */
    @JsonProperty("K6411")
    @XmlEnumValue("K6411")
    Justizvollzugsanstalt_Fuhlsbuettel("K6411"),

    /**
     * <b>Oberlandesgericht Frankfurt</b>
     *  * <p>
     *  *  Code: M1000
     *  * <p>
     *  * 
     */
    @JsonProperty("M1000")
    @XmlEnumValue("M1000")
    Oberlandesgericht_Frankfurt("M1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Frankfurt am Main</b>
     *  * <p>
     *  *  Code: M1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1000S")
    @XmlEnumValue("M1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Frankfurt_am_Main("M1000S"),

    /**
     * <b>Generalstaatsanwaltschaft Frankfurt am Main, -Rechtshilfe-</b>
     *  * <p>
     *  *  Code: M1001S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1001S")
    @XmlEnumValue("M1001S")
    Generalstaatsanwaltschaft_Frankfurt_am_Main_Rechtshilfe("M1001S"),

    /**
     * <b>Landgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M1100
     *  * <p>
     *  * 
     */
    @JsonProperty("M1100")
    @XmlEnumValue("M1100")
    Landgericht_Darmstadt("M1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1100S")
    @XmlEnumValue("M1100S")
    Staatsanwaltschaft_beim_Landgericht_Darmstadt("M1100S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Beerfelden</b>
     *  * <p>
     *  *  Code: M1101
     *  * <p>
     *  * 
     */
    @JsonProperty("M1101")
    @XmlEnumValue("M1101")
    aufgeloest_Amtsgericht_Beerfelden("M1101"),

    /**
     * <b>Amtsgericht Bensheim</b>
     *  * <p>
     *  *  Code: M1102
     *  * <p>
     *  * 
     */
    @JsonProperty("M1102")
    @XmlEnumValue("M1102")
    Amtsgericht_Bensheim("M1102"),

    /**
     * <b>Grundbuchamt Bensheim</b>
     *  * <p>
     *  *  Code: M1102G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1102G")
    @XmlEnumValue("M1102G")
    Grundbuchamt_Bensheim("M1102G"),

    /**
     * <b>Amtsgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M1103
     *  * <p>
     *  * 
     */
    @JsonProperty("M1103")
    @XmlEnumValue("M1103")
    Amtsgericht_Darmstadt("M1103"),

    /**
     * <b>Grundbuchamt Darmstadt</b>
     *  * <p>
     *  *  Code: M1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1103G")
    @XmlEnumValue("M1103G")
    Grundbuchamt_Darmstadt("M1103G"),

    /**
     * <b>Amtsgericht Dieburg</b>
     *  * <p>
     *  *  Code: M1104
     *  * <p>
     *  * 
     */
    @JsonProperty("M1104")
    @XmlEnumValue("M1104")
    Amtsgericht_Dieburg("M1104"),

    /**
     * <b>Grundbuchamt Dieburg</b>
     *  * <p>
     *  *  Code: M1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1104G")
    @XmlEnumValue("M1104G")
    Grundbuchamt_Dieburg("M1104G"),

    /**
     * <b>Amtsgericht F&#252;rth (Hessen)</b>
     *  * <p>
     *  *  Code: M1105
     *  * <p>
     *  * 
     */
    @JsonProperty("M1105")
    @XmlEnumValue("M1105")
    Amtsgericht_Fuerth_Hessen("M1105"),

    /**
     * <b>Grundbuchamt F&#252;rth (Hessen)</b>
     *  * <p>
     *  *  Code: M1105G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1105G")
    @XmlEnumValue("M1105G")
    Grundbuchamt_Fuerth_Hessen("M1105G"),

    /**
     * <b>Amtsgericht Gro&#223;-Gerau</b>
     *  * <p>
     *  *  Code: M1106
     *  * <p>
     *  * 
     */
    @JsonProperty("M1106")
    @XmlEnumValue("M1106")
    Amtsgericht_Gross_Gerau("M1106"),

    /**
     * <b>Grundbuchamt Gro&#223;-Gerau</b>
     *  * <p>
     *  *  Code: M1106G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1106G")
    @XmlEnumValue("M1106G")
    Grundbuchamt_Gross_Gerau("M1106G"),

    /**
     * <b>Amtsgericht R&#252;sselsheim</b>
     *  * <p>
     *  *  Code: M1107
     *  * <p>
     *  * 
     */
    @JsonProperty("M1107")
    @XmlEnumValue("M1107")
    Amtsgericht_Ruesselsheim("M1107"),

    /**
     * <b>Grundbuchamt R&#252;sselsheim</b>
     *  * <p>
     *  *  Code: M1107G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1107G")
    @XmlEnumValue("M1107G")
    Grundbuchamt_Ruesselsheim("M1107G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gro&#223;-Umstadt</b>
     *  * <p>
     *  *  Code: M1108
     *  * <p>
     *  * 
     */
    @JsonProperty("M1108")
    @XmlEnumValue("M1108")
    aufgeloest_Amtsgericht_Gross_Umstadt("M1108"),

    /**
     * <b>aufgel&#246;st-Amtsgericht F&#252;rth, Zwst. Hirschhorn (Neckar)</b>
     *  * <p>
     *  *  Code: M1109
     *  * <p>
     *  * 
     */
    @JsonProperty("M1109")
    @XmlEnumValue("M1109")
    aufgeloest_Amtsgericht_Fuerth_Zwst_Hirschhorn_Neckar("M1109"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Michelstadt, Zwst. H&#246;chst i. Odw.</b>
     *  * <p>
     *  *  Code: M1110
     *  * <p>
     *  * 
     */
    @JsonProperty("M1110")
    @XmlEnumValue("M1110")
    aufgeloest_Amtsgericht_Michelstadt_Zwst_Hoechst_i_Odw("M1110"),

    /**
     * <b>Amtsgericht Lampertheim</b>
     *  * <p>
     *  *  Code: M1111
     *  * <p>
     *  * 
     */
    @JsonProperty("M1111")
    @XmlEnumValue("M1111")
    Amtsgericht_Lampertheim("M1111"),

    /**
     * <b>Grundbuchamt Lampertheim</b>
     *  * <p>
     *  *  Code: M1111G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1111G")
    @XmlEnumValue("M1111G")
    Grundbuchamt_Lampertheim("M1111G"),

    /**
     * <b>Amtsgericht Langen</b>
     *  * <p>
     *  *  Code: M1112
     *  * <p>
     *  * 
     */
    @JsonProperty("M1112")
    @XmlEnumValue("M1112")
    Amtsgericht_Langen("M1112"),

    /**
     * <b>Grundbuchamt Langen</b>
     *  * <p>
     *  *  Code: M1112G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1112G")
    @XmlEnumValue("M1112G")
    Grundbuchamt_Langen("M1112G"),

    /**
     * <b>Amtsgericht Michelstadt</b>
     *  * <p>
     *  *  Code: M1113
     *  * <p>
     *  * 
     */
    @JsonProperty("M1113")
    @XmlEnumValue("M1113")
    Amtsgericht_Michelstadt("M1113"),

    /**
     * <b>Grundbuchamt Michelstadt</b>
     *  * <p>
     *  *  Code: M1113G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1113G")
    @XmlEnumValue("M1113G")
    Grundbuchamt_Michelstadt("M1113G"),

    /**
     * <b>Amtsgericht Offenbach am Main</b>
     *  * <p>
     *  *  Code: M1114
     *  * <p>
     *  * 
     */
    @JsonProperty("M1114")
    @XmlEnumValue("M1114")
    Amtsgericht_Offenbach_am_Main("M1114"),

    /**
     * <b>Grundbuchamt Offenbach am Main</b>
     *  * <p>
     *  *  Code: M1114G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1114G")
    @XmlEnumValue("M1114G")
    Grundbuchamt_Offenbach_am_Main("M1114G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Offenbach am Main, Zwst. der StA Darmstadt</b>
     *  * <p>
     *  *  Code: M1114S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1114S")
    @XmlEnumValue("M1114S")
    Staatsanwaltschaft_beim_Landgericht_Offenbach_am_Main_Zwst_der_StA_Darmstadt("M1114S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Reichelsheim (Odenwald)</b>
     *  * <p>
     *  *  Code: M1115
     *  * <p>
     *  * 
     */
    @JsonProperty("M1115")
    @XmlEnumValue("M1115")
    aufgeloest_Amtsgericht_Reichelsheim_Odenwald("M1115"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Reinheim</b>
     *  * <p>
     *  *  Code: M1116
     *  * <p>
     *  * 
     */
    @JsonProperty("M1116")
    @XmlEnumValue("M1116")
    aufgeloest_Amtsgericht_Reinheim("M1116"),

    /**
     * <b>Amtsgericht Seligenstadt</b>
     *  * <p>
     *  *  Code: M1117
     *  * <p>
     *  * 
     */
    @JsonProperty("M1117")
    @XmlEnumValue("M1117")
    Amtsgericht_Seligenstadt("M1117"),

    /**
     * <b>Grundbuchamt Seligenstadt</b>
     *  * <p>
     *  *  Code: M1117G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1117G")
    @XmlEnumValue("M1117G")
    Grundbuchamt_Seligenstadt("M1117G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wald-Michelbach</b>
     *  * <p>
     *  *  Code: M1118
     *  * <p>
     *  * 
     */
    @JsonProperty("M1118")
    @XmlEnumValue("M1118")
    aufgeloest_Amtsgericht_Wald_Michelbach("M1118"),

    /**
     * <b>Landgericht Frankfurt</b>
     *  * <p>
     *  *  Code: M1200
     *  * <p>
     *  * 
     */
    @JsonProperty("M1200")
    @XmlEnumValue("M1200")
    Landgericht_Frankfurt("M1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Frankfurt am Main</b>
     *  * <p>
     *  *  Code: M1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1200S")
    @XmlEnumValue("M1200S")
    Staatsanwaltschaft_beim_Landgericht_Frankfurt_am_Main("M1200S"),

    /**
     * <b>Amtsgericht Frankfurt</b>
     *  * <p>
     *  *  Code: M1201
     *  * <p>
     *  * 
     */
    @JsonProperty("M1201")
    @XmlEnumValue("M1201")
    Amtsgericht_Frankfurt("M1201"),

    /**
     * <b>Grundbuchamt Frankfurt am Main</b>
     *  * <p>
     *  *  Code: M1201G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1201G")
    @XmlEnumValue("M1201G")
    Grundbuchamt_Frankfurt_am_Main("M1201G"),

    /**
     * <b>Amtsanwaltschaft Frankfurt am Main</b>
     *  * <p>
     *  *  Code: M1201S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1201S")
    @XmlEnumValue("M1201S")
    Amtsanwaltschaft_Frankfurt_am_Main("M1201S"),

    /**
     * <b>Amtsgericht Bad Homburg</b>
     *  * <p>
     *  *  Code: M1202
     *  * <p>
     *  * 
     */
    @JsonProperty("M1202")
    @XmlEnumValue("M1202")
    Amtsgericht_Bad_Homburg("M1202"),

    /**
     * <b>Grundbuchamt Bad Homburg</b>
     *  * <p>
     *  *  Code: M1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1202G")
    @XmlEnumValue("M1202G")
    Grundbuchamt_Bad_Homburg("M1202G"),

    /**
     * <b>Amtsgericht K&#246;nigstein</b>
     *  * <p>
     *  *  Code: M1203
     *  * <p>
     *  * 
     */
    @JsonProperty("M1203")
    @XmlEnumValue("M1203")
    Amtsgericht_Koenigstein("M1203"),

    /**
     * <b>Grundbuchamt K&#246;nigstein</b>
     *  * <p>
     *  *  Code: M1203G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1203G")
    @XmlEnumValue("M1203G")
    Grundbuchamt_Koenigstein("M1203G"),

    /**
     * <b>Amtsgericht Usingen</b>
     *  * <p>
     *  *  Code: M1204
     *  * <p>
     *  * 
     */
    @JsonProperty("M1204")
    @XmlEnumValue("M1204")
    Amtsgericht_Usingen("M1204"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Vilbel</b>
     *  * <p>
     *  *  Code: M1205
     *  * <p>
     *  * 
     */
    @JsonProperty("M1205")
    @XmlEnumValue("M1205")
    aufgeloest_Amtsgericht_Bad_Vilbel("M1205"),

    /**
     * <b>Amtsgericht Frankfurt am Main Au&#223;enstelle H&#246;chst</b>
     *  * <p>
     *  *  Code: M1206
     *  * <p>
     *  * 
     */
    @JsonProperty("M1206")
    @XmlEnumValue("M1206")
    Amtsgericht_Frankfurt_am_Main_Aussenstelle_Hoechst("M1206"),

    /**
     * <b>Grundbuchamt Frankfurt am Main Au&#223;enstelle H&#246;chst</b>
     *  * <p>
     *  *  Code: M1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1206G")
    @XmlEnumValue("M1206G")
    Grundbuchamt_Frankfurt_am_Main_Aussenstelle_Hoechst("M1206G"),

    /**
     * <b>Landgericht Fulda</b>
     *  * <p>
     *  *  Code: M1300
     *  * <p>
     *  * 
     */
    @JsonProperty("M1300")
    @XmlEnumValue("M1300")
    Landgericht_Fulda("M1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Fulda</b>
     *  * <p>
     *  *  Code: M1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1300S")
    @XmlEnumValue("M1300S")
    Staatsanwaltschaft_beim_Landgericht_Fulda("M1300S"),

    /**
     * <b>Amtsgericht Fulda</b>
     *  * <p>
     *  *  Code: M1301
     *  * <p>
     *  * 
     */
    @JsonProperty("M1301")
    @XmlEnumValue("M1301")
    Amtsgericht_Fulda("M1301"),

    /**
     * <b>Grundbuchamt Fulda</b>
     *  * <p>
     *  *  Code: M1301G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1301G")
    @XmlEnumValue("M1301G")
    Grundbuchamt_Fulda("M1301G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Gersfeld</b>
     *  * <p>
     *  *  Code: M1302
     *  * <p>
     *  * 
     */
    @JsonProperty("M1302")
    @XmlEnumValue("M1302")
    aufgeloest_Amtsgericht_Fulda_Zwst_Gersfeld("M1302"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Hilders</b>
     *  * <p>
     *  *  Code: M1303
     *  * <p>
     *  * 
     */
    @JsonProperty("M1303")
    @XmlEnumValue("M1303")
    aufgeloest_Amtsgericht_Fulda_Zwst_Hilders("M1303"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Neuhof</b>
     *  * <p>
     *  *  Code: M1304
     *  * <p>
     *  * 
     */
    @JsonProperty("M1304")
    @XmlEnumValue("M1304")
    aufgeloest_Amtsgericht_Fulda_Zwst_Neuhof("M1304"),

    /**
     * <b>Amtsgericht Bad Hersfeld</b>
     *  * <p>
     *  *  Code: M1305
     *  * <p>
     *  * 
     */
    @JsonProperty("M1305")
    @XmlEnumValue("M1305")
    Amtsgericht_Bad_Hersfeld("M1305"),

    /**
     * <b>Grundbuchamt Bad Hersfeld</b>
     *  * <p>
     *  *  Code: M1305G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1305G")
    @XmlEnumValue("M1305G")
    Grundbuchamt_Bad_Hersfeld("M1305G"),

    /**
     * <b>Amtsgericht H&#252;nfeld</b>
     *  * <p>
     *  *  Code: M1307
     *  * <p>
     *  * 
     */
    @JsonProperty("M1307")
    @XmlEnumValue("M1307")
    Amtsgericht_Huenfeld("M1307"),

    /**
     * <b>Grundbuchamt H&#252;nfeld</b>
     *  * <p>
     *  *  Code: M1307G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1307G")
    @XmlEnumValue("M1307G")
    Grundbuchamt_Huenfeld("M1307G"),

    /**
     * <b>Amtsgericht H&#252;nfeld, Zentrales Vollstreckungsgericht Hessen</b>
     *  * <p>
     *  *  Code: M1307R
     *  * <p>
     *  * 
     */
    @JsonProperty("M1307R")
    @XmlEnumValue("M1307R")
    Amtsgericht_Huenfeld_Zentrales_Vollstreckungsgericht_Hessen("M1307R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lauterbach</b>
     *  * <p>
     *  *  Code: M1308
     *  * <p>
     *  * 
     */
    @JsonProperty("M1308")
    @XmlEnumValue("M1308")
    aufgeloest_Amtsgericht_Lauterbach("M1308"),

    /**
     * <b>Amtsgericht Rotenburg a.d. Fulda</b>
     *  * <p>
     *  *  Code: M1310
     *  * <p>
     *  * 
     */
    @JsonProperty("M1310")
    @XmlEnumValue("M1310")
    Amtsgericht_Rotenburg_a_d_Fulda("M1310"),

    /**
     * <b>Landgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M1400
     *  * <p>
     *  * 
     */
    @JsonProperty("M1400")
    @XmlEnumValue("M1400")
    Landgericht_Giessen("M1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1400S")
    @XmlEnumValue("M1400S")
    Staatsanwaltschaft_beim_Landgericht_Giessen("M1400S"),

    /**
     * <b>Amtsgericht Alsfeld</b>
     *  * <p>
     *  *  Code: M1401
     *  * <p>
     *  * 
     */
    @JsonProperty("M1401")
    @XmlEnumValue("M1401")
    Amtsgericht_Alsfeld("M1401"),

    /**
     * <b>Grundbuchamt Alsfeld</b>
     *  * <p>
     *  *  Code: M1401G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1401G")
    @XmlEnumValue("M1401G")
    Grundbuchamt_Alsfeld("M1401G"),

    /**
     * <b>Amtsgericht B&#252;dingen</b>
     *  * <p>
     *  *  Code: M1402
     *  * <p>
     *  * 
     */
    @JsonProperty("M1402")
    @XmlEnumValue("M1402")
    Amtsgericht_Buedingen("M1402"),

    /**
     * <b>Grundbuchamt B&#252;dingen</b>
     *  * <p>
     *  *  Code: M1402G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1402G")
    @XmlEnumValue("M1402G")
    Grundbuchamt_Buedingen("M1402G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Butzbach</b>
     *  * <p>
     *  *  Code: M1404
     *  * <p>
     *  * 
     */
    @JsonProperty("M1404")
    @XmlEnumValue("M1404")
    aufgeloest_Amtsgericht_Butzbach("M1404"),

    /**
     * <b>Amtsgericht Friedberg</b>
     *  * <p>
     *  *  Code: M1405
     *  * <p>
     *  * 
     */
    @JsonProperty("M1405")
    @XmlEnumValue("M1405")
    Amtsgericht_Friedberg("M1405"),

    /**
     * <b>Grundbuchamt Friedberg</b>
     *  * <p>
     *  *  Code: M1405G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1405G")
    @XmlEnumValue("M1405G")
    Grundbuchamt_Friedberg("M1405G"),

    /**
     * <b>Amtsgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M1406
     *  * <p>
     *  * 
     */
    @JsonProperty("M1406")
    @XmlEnumValue("M1406")
    Amtsgericht_Giessen("M1406"),

    /**
     * <b>Grundbuchamt Gie&#223;en</b>
     *  * <p>
     *  *  Code: M1406G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1406G")
    @XmlEnumValue("M1406G")
    Grundbuchamt_Giessen("M1406G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gr&#252;nberg</b>
     *  * <p>
     *  *  Code: M1407
     *  * <p>
     *  * 
     */
    @JsonProperty("M1407")
    @XmlEnumValue("M1407")
    aufgeloest_Amtsgericht_Gruenberg("M1407"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Homberg (Ohm)</b>
     *  * <p>
     *  *  Code: M1408
     *  * <p>
     *  * 
     */
    @JsonProperty("M1408")
    @XmlEnumValue("M1408")
    aufgeloest_Amtsgericht_Homberg_Ohm("M1408"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Laubach</b>
     *  * <p>
     *  *  Code: M1409
     *  * <p>
     *  * 
     */
    @JsonProperty("M1409")
    @XmlEnumValue("M1409")
    aufgeloest_Amtsgericht_Laubach("M1409"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Nauheim</b>
     *  * <p>
     *  *  Code: M1410
     *  * <p>
     *  * 
     */
    @JsonProperty("M1410")
    @XmlEnumValue("M1410")
    aufgeloest_Amtsgericht_Bad_Nauheim("M1410"),

    /**
     * <b>Amtsgericht Nidda</b>
     *  * <p>
     *  *  Code: M1411
     *  * <p>
     *  * 
     */
    @JsonProperty("M1411")
    @XmlEnumValue("M1411")
    Amtsgericht_Nidda("M1411"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ortenberg</b>
     *  * <p>
     *  *  Code: M1412
     *  * <p>
     *  * 
     */
    @JsonProperty("M1412")
    @XmlEnumValue("M1412")
    aufgeloest_Amtsgericht_Ortenberg("M1412"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schotten</b>
     *  * <p>
     *  *  Code: M1413
     *  * <p>
     *  * 
     */
    @JsonProperty("M1413")
    @XmlEnumValue("M1413")
    aufgeloest_Amtsgericht_Schotten("M1413"),

    /**
     * <b>Amtsgericht Alsfeld Zweigstelle Lauterbach</b>
     *  * <p>
     *  *  Code: M1420
     *  * <p>
     *  * 
     */
    @JsonProperty("M1420")
    @XmlEnumValue("M1420")
    Amtsgericht_Alsfeld_Zweigstelle_Lauterbach("M1420"),

    /**
     * <b>Landgericht Hanau</b>
     *  * <p>
     *  *  Code: M1500
     *  * <p>
     *  * 
     */
    @JsonProperty("M1500")
    @XmlEnumValue("M1500")
    Landgericht_Hanau("M1500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hanau</b>
     *  * <p>
     *  *  Code: M1500S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1500S")
    @XmlEnumValue("M1500S")
    Staatsanwaltschaft_beim_Landgericht_Hanau("M1500S"),

    /**
     * <b>Amtsgericht Gelnhausen</b>
     *  * <p>
     *  *  Code: M1501
     *  * <p>
     *  * 
     */
    @JsonProperty("M1501")
    @XmlEnumValue("M1501")
    Amtsgericht_Gelnhausen("M1501"),

    /**
     * <b>Grundbuchamt Gelnhausen</b>
     *  * <p>
     *  *  Code: M1501G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1501G")
    @XmlEnumValue("M1501G")
    Grundbuchamt_Gelnhausen("M1501G"),

    /**
     * <b>Amtsgericht Hanau</b>
     *  * <p>
     *  *  Code: M1502
     *  * <p>
     *  * 
     */
    @JsonProperty("M1502")
    @XmlEnumValue("M1502")
    Amtsgericht_Hanau("M1502"),

    /**
     * <b>Grundbuchamt Hanau</b>
     *  * <p>
     *  *  Code: M1502G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1502G")
    @XmlEnumValue("M1502G")
    Grundbuchamt_Hanau("M1502G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Langenselbold</b>
     *  * <p>
     *  *  Code: M1504
     *  * <p>
     *  * 
     */
    @JsonProperty("M1504")
    @XmlEnumValue("M1504")
    aufgeloest_Amtsgericht_Langenselbold("M1504"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Orb</b>
     *  * <p>
     *  *  Code: M1505
     *  * <p>
     *  * 
     */
    @JsonProperty("M1505")
    @XmlEnumValue("M1505")
    aufgeloest_Amtsgericht_Bad_Orb("M1505"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schl&#252;chtern, Zwst. Bad Soden-Salm&#252;nster</b>
     *  * <p>
     *  *  Code: M1506
     *  * <p>
     *  * 
     */
    @JsonProperty("M1506")
    @XmlEnumValue("M1506")
    aufgeloest_Amtsgericht_Schluechtern_Zwst_Bad_Soden_Salmuenster("M1506"),

    /**
     * <b>Amtsgericht Schl&#252;chtern</b>
     *  * <p>
     *  *  Code: M1507
     *  * <p>
     *  * 
     */
    @JsonProperty("M1507")
    @XmlEnumValue("M1507")
    Amtsgericht_Schluechtern("M1507"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schl&#252;chtern, Zwst. Steinau</b>
     *  * <p>
     *  *  Code: M1508
     *  * <p>
     *  * 
     */
    @JsonProperty("M1508")
    @XmlEnumValue("M1508")
    aufgeloest_Amtsgericht_Schluechtern_Zwst_Steinau("M1508"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gelnhausen, Zwst. W&#228;chtersbach</b>
     *  * <p>
     *  *  Code: M1509
     *  * <p>
     *  * 
     */
    @JsonProperty("M1509")
    @XmlEnumValue("M1509")
    aufgeloest_Amtsgericht_Gelnhausen_Zwst_Waechtersbach("M1509"),

    /**
     * <b>Landgericht Kassel</b>
     *  * <p>
     *  *  Code: M1600
     *  * <p>
     *  * 
     */
    @JsonProperty("M1600")
    @XmlEnumValue("M1600")
    Landgericht_Kassel("M1600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Kassel</b>
     *  * <p>
     *  *  Code: M1600S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1600S")
    @XmlEnumValue("M1600S")
    Staatsanwaltschaft_beim_Landgericht_Kassel("M1600S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Arolsen</b>
     *  * <p>
     *  *  Code: M1601
     *  * <p>
     *  * 
     */
    @JsonProperty("M1601")
    @XmlEnumValue("M1601")
    aufgeloest_Amtsgericht_Arolsen("M1601"),

    /**
     * <b>Amtsgericht Eschwege</b>
     *  * <p>
     *  *  Code: M1602
     *  * <p>
     *  * 
     */
    @JsonProperty("M1602")
    @XmlEnumValue("M1602")
    Amtsgericht_Eschwege("M1602"),

    /**
     * <b>Grundbuchamt Eschwege</b>
     *  * <p>
     *  *  Code: M1602G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1602G")
    @XmlEnumValue("M1602G")
    Grundbuchamt_Eschwege("M1602G"),

    /**
     * <b>Amtsgericht Fritzlar</b>
     *  * <p>
     *  *  Code: M1603
     *  * <p>
     *  * 
     */
    @JsonProperty("M1603")
    @XmlEnumValue("M1603")
    Amtsgericht_Fritzlar("M1603"),

    /**
     * <b>Grundbuchamt Fritzlar</b>
     *  * <p>
     *  *  Code: M1603G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1603G")
    @XmlEnumValue("M1603G")
    Grundbuchamt_Fritzlar("M1603G"),

    /**
     * <b>Amtsgericht Kassel Zweigstelle Hofgeismar</b>
     *  * <p>
     *  *  Code: M1605
     *  * <p>
     *  * 
     */
    @JsonProperty("M1605")
    @XmlEnumValue("M1605")
    Amtsgericht_Kassel_Zweigstelle_Hofgeismar("M1605"),

    /**
     * <b>Grundbuchamt Kassel Zweigstelle Hofgeismar</b>
     *  * <p>
     *  *  Code: M1605G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1605G")
    @XmlEnumValue("M1605G")
    Grundbuchamt_Kassel_Zweigstelle_Hofgeismar("M1605G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Karlshafen</b>
     *  * <p>
     *  *  Code: M1606
     *  * <p>
     *  * 
     */
    @JsonProperty("M1606")
    @XmlEnumValue("M1606")
    aufgeloest_Amtsgericht_Karlshafen("M1606"),

    /**
     * <b>Amtsgericht Kassel</b>
     *  * <p>
     *  *  Code: M1607
     *  * <p>
     *  * 
     */
    @JsonProperty("M1607")
    @XmlEnumValue("M1607")
    Amtsgericht_Kassel("M1607"),

    /**
     * <b>Grundbuchamt Kassel</b>
     *  * <p>
     *  *  Code: M1607G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1607G")
    @XmlEnumValue("M1607G")
    Grundbuchamt_Kassel("M1607G"),

    /**
     * <b>Amtsgericht Korbach</b>
     *  * <p>
     *  *  Code: M1608
     *  * <p>
     *  * 
     */
    @JsonProperty("M1608")
    @XmlEnumValue("M1608")
    Amtsgericht_Korbach("M1608"),

    /**
     * <b>Grundbuchamt Korbach</b>
     *  * <p>
     *  *  Code: M1608G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1608G")
    @XmlEnumValue("M1608G")
    Grundbuchamt_Korbach("M1608G"),

    /**
     * <b>Amtsgericht Melsungen</b>
     *  * <p>
     *  *  Code: M1609
     *  * <p>
     *  * 
     */
    @JsonProperty("M1609")
    @XmlEnumValue("M1609")
    Amtsgericht_Melsungen("M1609"),

    /**
     * <b>Grundbuchamt Melsungen</b>
     *  * <p>
     *  *  Code: M1609G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1609G")
    @XmlEnumValue("M1609G")
    Grundbuchamt_Melsungen("M1609G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rotenburg a. d. Fulda</b>
     *  * <p>
     *  *  Code: M1612
     *  * <p>
     *  * 
     */
    @JsonProperty("M1612")
    @XmlEnumValue("M1612")
    aufgeloest_Amtsgericht_Rotenburg_a_d_Fulda("M1612"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eschwege, Zwst. Sontra</b>
     *  * <p>
     *  *  Code: M1613
     *  * <p>
     *  * 
     */
    @JsonProperty("M1613")
    @XmlEnumValue("M1613")
    aufgeloest_Amtsgericht_Eschwege_Zwst_Sontra("M1613"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Wildungen</b>
     *  * <p>
     *  *  Code: M1614
     *  * <p>
     *  * 
     */
    @JsonProperty("M1614")
    @XmlEnumValue("M1614")
    aufgeloest_Amtsgericht_Bad_Wildungen("M1614"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Witzenhausen</b>
     *  * <p>
     *  *  Code: M1615
     *  * <p>
     *  * 
     */
    @JsonProperty("M1615")
    @XmlEnumValue("M1615")
    aufgeloest_Amtsgericht_Witzenhausen("M1615"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wolfhagen</b>
     *  * <p>
     *  *  Code: M1616
     *  * <p>
     *  * 
     */
    @JsonProperty("M1616")
    @XmlEnumValue("M1616")
    aufgeloest_Amtsgericht_Wolfhagen("M1616"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Homberg (Efze)</b>
     *  * <p>
     *  *  Code: M1619
     *  * <p>
     *  * 
     */
    @JsonProperty("M1619")
    @XmlEnumValue("M1619")
    aufgeloest_Amtsgericht_Homberg_Efze("M1619"),

    /**
     * <b>Landgericht Limburg</b>
     *  * <p>
     *  *  Code: M1700
     *  * <p>
     *  * 
     */
    @JsonProperty("M1700")
    @XmlEnumValue("M1700")
    Landgericht_Limburg("M1700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Limburg a. d. Lahn</b>
     *  * <p>
     *  *  Code: M1700S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1700S")
    @XmlEnumValue("M1700S")
    Staatsanwaltschaft_beim_Landgericht_Limburg_a_d_Lahn("M1700S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wetzlar, Zwst. Braunfels</b>
     *  * <p>
     *  *  Code: M1701
     *  * <p>
     *  * 
     */
    @JsonProperty("M1701")
    @XmlEnumValue("M1701")
    aufgeloest_Amtsgericht_Wetzlar_Zwst_Braunfels("M1701"),

    /**
     * <b>Amtsgericht Dillenburg</b>
     *  * <p>
     *  *  Code: M1702
     *  * <p>
     *  * 
     */
    @JsonProperty("M1702")
    @XmlEnumValue("M1702")
    Amtsgericht_Dillenburg("M1702"),

    /**
     * <b>Grundbuchamt Dillenburg</b>
     *  * <p>
     *  *  Code: M1702G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1702G")
    @XmlEnumValue("M1702G")
    Grundbuchamt_Dillenburg("M1702G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ehringshausen</b>
     *  * <p>
     *  *  Code: M1703
     *  * <p>
     *  * 
     */
    @JsonProperty("M1703")
    @XmlEnumValue("M1703")
    aufgeloest_Amtsgericht_Ehringshausen("M1703"),

    /**
     * <b>Amtsgericht Limburg/Lahn Zweigstelle Hadamar</b>
     *  * <p>
     *  *  Code: M1704
     *  * <p>
     *  * 
     */
    @JsonProperty("M1704")
    @XmlEnumValue("M1704")
    Amtsgericht_Limburg_Lahn_Zweigstelle_Hadamar("M1704"),

    /**
     * <b>Grundbuchamt Limburg Zweigstelle Hadamar</b>
     *  * <p>
     *  *  Code: M1704G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1704G")
    @XmlEnumValue("M1704G")
    Grundbuchamt_Limburg_Zweigstelle_Hadamar("M1704G"),

    /**
     * <b>Amtsgericht Dillenburg Zweigstelle Herborn</b>
     *  * <p>
     *  *  Code: M1705
     *  * <p>
     *  * 
     */
    @JsonProperty("M1705")
    @XmlEnumValue("M1705")
    Amtsgericht_Dillenburg_Zweigstelle_Herborn("M1705"),

    /**
     * <b>Grundbuchamt Dillenburg Zweigstelle Herborn</b>
     *  * <p>
     *  *  Code: M1705G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1705G")
    @XmlEnumValue("M1705G")
    Grundbuchamt_Dillenburg_Zweigstelle_Herborn("M1705G"),

    /**
     * <b>Amtsgericht Limburg</b>
     *  * <p>
     *  *  Code: M1706
     *  * <p>
     *  * 
     */
    @JsonProperty("M1706")
    @XmlEnumValue("M1706")
    Amtsgericht_Limburg("M1706"),

    /**
     * <b>Grundbuchamt Limburg</b>
     *  * <p>
     *  *  Code: M1706G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1706G")
    @XmlEnumValue("M1706G")
    Grundbuchamt_Limburg("M1706G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Runkel</b>
     *  * <p>
     *  *  Code: M1708
     *  * <p>
     *  * 
     */
    @JsonProperty("M1708")
    @XmlEnumValue("M1708")
    aufgeloest_Amtsgericht_Runkel("M1708"),

    /**
     * <b>Amtsgericht Weilburg</b>
     *  * <p>
     *  *  Code: M1709
     *  * <p>
     *  * 
     */
    @JsonProperty("M1709")
    @XmlEnumValue("M1709")
    Amtsgericht_Weilburg("M1709"),

    /**
     * <b>Grundbuchamt Weilburg</b>
     *  * <p>
     *  *  Code: M1709G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1709G")
    @XmlEnumValue("M1709G")
    Grundbuchamt_Weilburg("M1709G"),

    /**
     * <b>Amtsgericht Wetzlar</b>
     *  * <p>
     *  *  Code: M1710
     *  * <p>
     *  * 
     */
    @JsonProperty("M1710")
    @XmlEnumValue("M1710")
    Amtsgericht_Wetzlar("M1710"),

    /**
     * <b>Grundbuchamt Wetzlar</b>
     *  * <p>
     *  *  Code: M1710G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1710G")
    @XmlEnumValue("M1710G")
    Grundbuchamt_Wetzlar("M1710G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Wetzlar, Zwst. der StA Limburg a. d. Lahn</b>
     *  * <p>
     *  *  Code: M1710S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1710S")
    @XmlEnumValue("M1710S")
    Staatsanwaltschaft_beim_Landgericht_Wetzlar_Zwst_der_StA_Limburg_a_d_Lahn("M1710S"),

    /**
     * <b>Landgericht Marburg</b>
     *  * <p>
     *  *  Code: M1800
     *  * <p>
     *  * 
     */
    @JsonProperty("M1800")
    @XmlEnumValue("M1800")
    Landgericht_Marburg("M1800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Marburg</b>
     *  * <p>
     *  *  Code: M1800S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1800S")
    @XmlEnumValue("M1800S")
    Staatsanwaltschaft_beim_Landgericht_Marburg("M1800S"),

    /**
     * <b>Amtsgericht Biedenkopf</b>
     *  * <p>
     *  *  Code: M1801
     *  * <p>
     *  * 
     */
    @JsonProperty("M1801")
    @XmlEnumValue("M1801")
    Amtsgericht_Biedenkopf("M1801"),

    /**
     * <b>Grundbuchamt Biedenkopf</b>
     *  * <p>
     *  *  Code: M1801G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1801G")
    @XmlEnumValue("M1801G")
    Grundbuchamt_Biedenkopf("M1801G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Borken (Hessen)</b>
     *  * <p>
     *  *  Code: M1802
     *  * <p>
     *  * 
     */
    @JsonProperty("M1802")
    @XmlEnumValue("M1802")
    aufgeloest_Amtsgericht_Borken_Hessen("M1802"),

    /**
     * <b>Amtsgericht Frankenberg-Eder</b>
     *  * <p>
     *  *  Code: M1803
     *  * <p>
     *  * 
     */
    @JsonProperty("M1803")
    @XmlEnumValue("M1803")
    Amtsgericht_Frankenberg_Eder("M1803"),

    /**
     * <b>Grundbuchamt Frankenberg-Eder</b>
     *  * <p>
     *  *  Code: M1803G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1803G")
    @XmlEnumValue("M1803G")
    Grundbuchamt_Frankenberg_Eder("M1803G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Biedenkopf, Zwst. Gladenbach</b>
     *  * <p>
     *  *  Code: M1805
     *  * <p>
     *  * 
     */
    @JsonProperty("M1805")
    @XmlEnumValue("M1805")
    aufgeloest_Amtsgericht_Biedenkopf_Zwst_Gladenbach("M1805"),

    /**
     * <b>Amtsgericht Kirchhain</b>
     *  * <p>
     *  *  Code: M1807
     *  * <p>
     *  * 
     */
    @JsonProperty("M1807")
    @XmlEnumValue("M1807")
    Amtsgericht_Kirchhain("M1807"),

    /**
     * <b>Grundbuchamt Kirchhain</b>
     *  * <p>
     *  *  Code: M1807G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1807G")
    @XmlEnumValue("M1807G")
    Grundbuchamt_Kirchhain("M1807G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Frankenberg (Eder), Zwst. Gem&#252;nden (Wohra)</b>
     *  * <p>
     *  *  Code: M1808
     *  * <p>
     *  * 
     */
    @JsonProperty("M1808")
    @XmlEnumValue("M1808")
    aufgeloest_Amtsgericht_Frankenberg_Eder_Zwst_Gemuenden_Wohra("M1808"),

    /**
     * <b>Amtsgericht Marburg</b>
     *  * <p>
     *  *  Code: M1809
     *  * <p>
     *  * 
     */
    @JsonProperty("M1809")
    @XmlEnumValue("M1809")
    Amtsgericht_Marburg("M1809"),

    /**
     * <b>Grundbuchamt Marburg</b>
     *  * <p>
     *  *  Code: M1809G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1809G")
    @XmlEnumValue("M1809G")
    Grundbuchamt_Marburg("M1809G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neukirchen (Kreis Ziegenhain)</b>
     *  * <p>
     *  *  Code: M1810
     *  * <p>
     *  * 
     */
    @JsonProperty("M1810")
    @XmlEnumValue("M1810")
    aufgeloest_Amtsgericht_Neukirchen_Kreis_Ziegenhain("M1810"),

    /**
     * <b>Amtsgericht Schwalmstadt</b>
     *  * <p>
     *  *  Code: M1812
     *  * <p>
     *  * 
     */
    @JsonProperty("M1812")
    @XmlEnumValue("M1812")
    Amtsgericht_Schwalmstadt("M1812"),

    /**
     * <b>Grundbuchamt Schwalmstadt</b>
     *  * <p>
     *  *  Code: M1812G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1812G")
    @XmlEnumValue("M1812G")
    Grundbuchamt_Schwalmstadt("M1812G"),

    /**
     * <b>Landgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M1900
     *  * <p>
     *  * 
     */
    @JsonProperty("M1900")
    @XmlEnumValue("M1900")
    Landgericht_Wiesbaden("M1900"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M1900S
     *  * <p>
     *  * 
     */
    @JsonProperty("M1900S")
    @XmlEnumValue("M1900S")
    Staatsanwaltschaft_beim_Landgericht_Wiesbaden("M1900S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eltville am Rhein</b>
     *  * <p>
     *  *  Code: M1901
     *  * <p>
     *  * 
     */
    @JsonProperty("M1901")
    @XmlEnumValue("M1901")
    aufgeloest_Amtsgericht_Eltville_am_Rhein("M1901"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hochheim am Main</b>
     *  * <p>
     *  *  Code: M1902
     *  * <p>
     *  * 
     */
    @JsonProperty("M1902")
    @XmlEnumValue("M1902")
    aufgeloest_Amtsgericht_Hochheim_am_Main("M1902"),

    /**
     * <b>Amtsgericht Idstein</b>
     *  * <p>
     *  *  Code: M1903
     *  * <p>
     *  * 
     */
    @JsonProperty("M1903")
    @XmlEnumValue("M1903")
    Amtsgericht_Idstein("M1903"),

    /**
     * <b>Grundbuchamt Idstein</b>
     *  * <p>
     *  *  Code: M1903G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1903G")
    @XmlEnumValue("M1903G")
    Grundbuchamt_Idstein("M1903G"),

    /**
     * <b>Amtsgericht R&#252;desheim</b>
     *  * <p>
     *  *  Code: M1904
     *  * <p>
     *  * 
     */
    @JsonProperty("M1904")
    @XmlEnumValue("M1904")
    Amtsgericht_Ruedesheim("M1904"),

    /**
     * <b>Grundbuchamt R&#252;desheim</b>
     *  * <p>
     *  *  Code: M1904G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1904G")
    @XmlEnumValue("M1904G")
    Grundbuchamt_Ruedesheim("M1904G"),

    /**
     * <b>Amtsgericht Bad Schwalbach</b>
     *  * <p>
     *  *  Code: M1905
     *  * <p>
     *  * 
     */
    @JsonProperty("M1905")
    @XmlEnumValue("M1905")
    Amtsgericht_Bad_Schwalbach("M1905"),

    /**
     * <b>Grundbuchamt Bad Schwalbach</b>
     *  * <p>
     *  *  Code: M1905G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1905G")
    @XmlEnumValue("M1905G")
    Grundbuchamt_Bad_Schwalbach("M1905G"),

    /**
     * <b>Amtsgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M1906
     *  * <p>
     *  * 
     */
    @JsonProperty("M1906")
    @XmlEnumValue("M1906")
    Amtsgericht_Wiesbaden("M1906"),

    /**
     * <b>Grundbuchamt Wiesbaden</b>
     *  * <p>
     *  *  Code: M1906G
     *  * <p>
     *  * 
     */
    @JsonProperty("M1906G")
    @XmlEnumValue("M1906G")
    Grundbuchamt_Wiesbaden("M1906G"),

    /**
     * <b>Staatsanwaltschaft bei dem Landgericht Darmstadt Zweigstelle Offenbach a.Main</b>
     *  * <p>
     *  *  Code: M6036S
     *  * <p>
     *  * 
     */
    @JsonProperty("M6036S")
    @XmlEnumValue("M6036S")
    Staatsanwaltschaft_bei_dem_Landgericht_Darmstadt_Zweigstelle_Offenbach_a_Main("M6036S"),

    /**
     * <b>Sozialgericht Frankfurt</b>
     *  * <p>
     *  *  Code: M6057
     *  * <p>
     *  * 
     */
    @JsonProperty("M6057")
    @XmlEnumValue("M6057")
    Sozialgericht_Frankfurt("M6057"),

    /**
     * <b>Arbeitsgericht Bad Hersfeld</b>
     *  * <p>
     *  *  Code: M6086
     *  * <p>
     *  * 
     */
    @JsonProperty("M6086")
    @XmlEnumValue("M6086")
    Arbeitsgericht_Bad_Hersfeld("M6086"),

    /**
     * <b>Sozialgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M6087
     *  * <p>
     *  * 
     */
    @JsonProperty("M6087")
    @XmlEnumValue("M6087")
    Sozialgericht_Darmstadt("M6087"),

    /**
     * <b>Arbeitsgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M6088
     *  * <p>
     *  * 
     */
    @JsonProperty("M6088")
    @XmlEnumValue("M6088")
    Arbeitsgericht_Darmstadt("M6088"),

    /**
     * <b>Hessisches Landessozialgericht</b>
     *  * <p>
     *  *  Code: M6089
     *  * <p>
     *  * 
     */
    @JsonProperty("M6089")
    @XmlEnumValue("M6089")
    Hessisches_Landessozialgericht("M6089"),

    /**
     * <b>Verwaltungsgericht Darmstadt</b>
     *  * <p>
     *  *  Code: M6090
     *  * <p>
     *  * 
     */
    @JsonProperty("M6090")
    @XmlEnumValue("M6090")
    Verwaltungsgericht_Darmstadt("M6090"),

    /**
     * <b>Bundesdisziplinargericht</b>
     *  * <p>
     *  *  Code: M6091
     *  * <p>
     *  * 
     */
    @JsonProperty("M6091")
    @XmlEnumValue("M6091")
    Bundesdisziplinargericht("M6091"),

    /**
     * <b>Verwaltungsgericht Frankfurt am Main</b>
     *  * <p>
     *  *  Code: M6093
     *  * <p>
     *  * 
     */
    @JsonProperty("M6093")
    @XmlEnumValue("M6093")
    Verwaltungsgericht_Frankfurt_am_Main("M6093"),

    /**
     * <b>Landesarbeitsgericht Frankfurt a.M.</b>
     *  * <p>
     *  *  Code: M6094
     *  * <p>
     *  * 
     */
    @JsonProperty("M6094")
    @XmlEnumValue("M6094")
    Landesarbeitsgericht_Frankfurt_a_M("M6094"),

    /**
     * <b>Arbeitsgericht Frankfurt a.M.</b>
     *  * <p>
     *  *  Code: M6095
     *  * <p>
     *  * 
     */
    @JsonProperty("M6095")
    @XmlEnumValue("M6095")
    Arbeitsgericht_Frankfurt_a_M("M6095"),

    /**
     * <b>Arbeitsgericht Fulda</b>
     *  * <p>
     *  *  Code: M6096
     *  * <p>
     *  * 
     */
    @JsonProperty("M6096")
    @XmlEnumValue("M6096")
    Arbeitsgericht_Fulda("M6096"),

    /**
     * <b>Sozialgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M6097
     *  * <p>
     *  * 
     */
    @JsonProperty("M6097")
    @XmlEnumValue("M6097")
    Sozialgericht_Giessen("M6097"),

    /**
     * <b>Arbeitsgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M6098
     *  * <p>
     *  * 
     */
    @JsonProperty("M6098")
    @XmlEnumValue("M6098")
    Arbeitsgericht_Giessen("M6098"),

    /**
     * <b>Arbeitsgericht Hanau</b>
     *  * <p>
     *  *  Code: M6099
     *  * <p>
     *  * 
     */
    @JsonProperty("M6099")
    @XmlEnumValue("M6099")
    Arbeitsgericht_Hanau("M6099"),

    /**
     * <b>Sozialgericht Kassel</b>
     *  * <p>
     *  *  Code: M6100
     *  * <p>
     *  * 
     */
    @JsonProperty("M6100")
    @XmlEnumValue("M6100")
    Sozialgericht_Kassel("M6100"),

    /**
     * <b>Hessischer Verwaltungsgerichtshof</b>
     *  * <p>
     *  *  Code: M6102
     *  * <p>
     *  * 
     */
    @JsonProperty("M6102")
    @XmlEnumValue("M6102")
    Hessischer_Verwaltungsgerichtshof("M6102"),

    /**
     * <b>Hessisches Finanzgericht</b>
     *  * <p>
     *  *  Code: M6103
     *  * <p>
     *  * 
     */
    @JsonProperty("M6103")
    @XmlEnumValue("M6103")
    Hessisches_Finanzgericht("M6103"),

    /**
     * <b>Arbeitsgericht Kassel</b>
     *  * <p>
     *  *  Code: M6104
     *  * <p>
     *  * 
     */
    @JsonProperty("M6104")
    @XmlEnumValue("M6104")
    Arbeitsgericht_Kassel("M6104"),

    /**
     * <b>Verwaltungsgericht Kassel</b>
     *  * <p>
     *  *  Code: M6105
     *  * <p>
     *  * 
     */
    @JsonProperty("M6105")
    @XmlEnumValue("M6105")
    Verwaltungsgericht_Kassel("M6105"),

    /**
     * <b>Arbeitsgericht Limburg a. d. Lahn</b>
     *  * <p>
     *  *  Code: M6106
     *  * <p>
     *  * 
     */
    @JsonProperty("M6106")
    @XmlEnumValue("M6106")
    Arbeitsgericht_Limburg_a_d_Lahn("M6106"),

    /**
     * <b>Sozialgericht Marburg</b>
     *  * <p>
     *  *  Code: M6107
     *  * <p>
     *  * 
     */
    @JsonProperty("M6107")
    @XmlEnumValue("M6107")
    Sozialgericht_Marburg("M6107"),

    /**
     * <b>Arbeitsgericht Marburg</b>
     *  * <p>
     *  *  Code: M6108
     *  * <p>
     *  * 
     */
    @JsonProperty("M6108")
    @XmlEnumValue("M6108")
    Arbeitsgericht_Marburg("M6108"),

    /**
     * <b>Arbeitsgericht Offenbach a.M.</b>
     *  * <p>
     *  *  Code: M6230
     *  * <p>
     *  * 
     */
    @JsonProperty("M6230")
    @XmlEnumValue("M6230")
    Arbeitsgericht_Offenbach_a_M("M6230"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Wetzlar</b>
     *  * <p>
     *  *  Code: M6231
     *  * <p>
     *  * 
     */
    @JsonProperty("M6231")
    @XmlEnumValue("M6231")
    aufgeloest_Arbeitsgericht_Wetzlar("M6231"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Wetzlar</b>
     *  * <p>
     *  *  Code: M6232
     *  * <p>
     *  * 
     */
    @JsonProperty("M6232")
    @XmlEnumValue("M6232")
    aufgeloest_Arbeitsgericht_Wetzlar_M6232("M6232"),

    /**
     * <b>Arbeitsgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M6233
     *  * <p>
     *  * 
     */
    @JsonProperty("M6233")
    @XmlEnumValue("M6233")
    Arbeitsgericht_Wiesbaden("M6233"),

    /**
     * <b>Bundessozialgericht</b>
     *  * <p>
     *  *  Code: M6246
     *  * <p>
     *  * 
     */
    @JsonProperty("M6246")
    @XmlEnumValue("M6246")
    Bundessozialgericht("M6246"),

    /**
     * <b>Sozialgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M6265
     *  * <p>
     *  * 
     */
    @JsonProperty("M6265")
    @XmlEnumValue("M6265")
    Sozialgericht_Wiesbaden("M6265"),

    /**
     * <b>Verwaltungsgericht Wiesbaden</b>
     *  * <p>
     *  *  Code: M6276
     *  * <p>
     *  * 
     */
    @JsonProperty("M6276")
    @XmlEnumValue("M6276")
    Verwaltungsgericht_Wiesbaden("M6276"),

    /**
     * <b>Staatsgerichtshof des Landes Hessen</b>
     *  * <p>
     *  *  Code: M6279
     *  * <p>
     *  * 
     */
    @JsonProperty("M6279")
    @XmlEnumValue("M6279")
    Staatsgerichtshof_des_Landes_Hessen("M6279"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Frankfurt/Main</b>
     *  * <p>
     *  *  Code: M6300
     *  * <p>
     *  * 
     */
    @JsonProperty("M6300")
    @XmlEnumValue("M6300")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Frankfurt_Main("M6300"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Kassel</b>
     *  * <p>
     *  *  Code: M6318
     *  * <p>
     *  * 
     */
    @JsonProperty("M6318")
    @XmlEnumValue("M6318")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Kassel("M6318"),

    /**
     * <b>Hessischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: M6320
     *  * <p>
     *  * 
     */
    @JsonProperty("M6320")
    @XmlEnumValue("M6320")
    Hessischer_Anwaltsgerichtshof("M6320"),

    /**
     * <b>Sozialgericht Fulda</b>
     *  * <p>
     *  *  Code: M6361
     *  * <p>
     *  * 
     */
    @JsonProperty("M6361")
    @XmlEnumValue("M6361")
    Sozialgericht_Fulda("M6361"),

    /**
     * <b>Justizvollzugsanstalt Kassel II Sozialtherapeutische Anstalt</b>
     *  * <p>
     *  *  Code: M6516
     *  * <p>
     *  * 
     */
    @JsonProperty("M6516")
    @XmlEnumValue("M6516")
    Justizvollzugsanstalt_Kassel_II_Sozialtherapeutische_Anstalt("M6516"),

    /**
     * <b>Justizvollzugsanstalt Frankfurt am Main IV</b>
     *  * <p>
     *  *  Code: M6864
     *  * <p>
     *  * 
     */
    @JsonProperty("M6864")
    @XmlEnumValue("M6864")
    Justizvollzugsanstalt_Frankfurt_am_Main_IV("M6864"),

    /**
     * <b>Verwaltungsgericht Gie&#223;en</b>
     *  * <p>
     *  *  Code: M7095
     *  * <p>
     *  * 
     */
    @JsonProperty("M7095")
    @XmlEnumValue("M7095")
    Verwaltungsgericht_Giessen("M7095"),

    /**
     * <b>Justizvollzugsanstalt Frankfurt am Main III</b>
     *  * <p>
     *  *  Code: M7131
     *  * <p>
     *  * 
     */
    @JsonProperty("M7131")
    @XmlEnumValue("M7131")
    Justizvollzugsanstalt_Frankfurt_am_Main_III("M7131"),

    /**
     * <b>Zentrales elektronisches Schutzschriftenregister</b>
     *  * <p>
     *  *  Code: M7333
     *  * <p>
     *  * 
     */
    @JsonProperty("M7333")
    @XmlEnumValue("M7333")
    Zentrales_elektronisches_Schutzschriftenregister("M7333"),

    /**
     * <b>Jugendarresteinrichtung Gelnhausen</b>
     *  * <p>
     *  *  Code: M7348
     *  * <p>
     *  * 
     */
    @JsonProperty("M7348")
    @XmlEnumValue("M7348")
    Jugendarresteinrichtung_Gelnhausen("M7348"),

    /**
     * <b>Justizvollzugsanstalt Weiterstadt</b>
     *  * <p>
     *  *  Code: M8403
     *  * <p>
     *  * 
     */
    @JsonProperty("M8403")
    @XmlEnumValue("M8403")
    Justizvollzugsanstalt_Weiterstadt("M8403"),

    /**
     * <b>Justizvollzugsanstalt Frankfurt am Main I</b>
     *  * <p>
     *  *  Code: M8408
     *  * <p>
     *  * 
     */
    @JsonProperty("M8408")
    @XmlEnumValue("M8408")
    Justizvollzugsanstalt_Frankfurt_am_Main_I("M8408"),

    /**
     * <b>Justizvollzugsanstalt Schwalmstadt</b>
     *  * <p>
     *  *  Code: M8435
     *  * <p>
     *  * 
     */
    @JsonProperty("M8435")
    @XmlEnumValue("M8435")
    Justizvollzugsanstalt_Schwalmstadt("M8435"),

    /**
     * <b>Justizvollzugsanstalt Gie&#223;en</b>
     *  * <p>
     *  *  Code: M8440
     *  * <p>
     *  * 
     */
    @JsonProperty("M8440")
    @XmlEnumValue("M8440")
    Justizvollzugsanstalt_Giessen("M8440"),

    /**
     * <b>Justizvollzugsanstalt Butzbach</b>
     *  * <p>
     *  *  Code: M8447
     *  * <p>
     *  * 
     */
    @JsonProperty("M8447")
    @XmlEnumValue("M8447")
    Justizvollzugsanstalt_Butzbach("M8447"),

    /**
     * <b>Justizvollzugsanstalt Darmstadt</b>
     *  * <p>
     *  *  Code: M8448
     *  * <p>
     *  * 
     */
    @JsonProperty("M8448")
    @XmlEnumValue("M8448")
    Justizvollzugsanstalt_Darmstadt("M8448"),

    /**
     * <b>Justizvollzugsanstalt Dieburg</b>
     *  * <p>
     *  *  Code: M8449
     *  * <p>
     *  * 
     */
    @JsonProperty("M8449")
    @XmlEnumValue("M8449")
    Justizvollzugsanstalt_Dieburg("M8449"),

    /**
     * <b>Justizvollzugsanstalt Fulda</b>
     *  * <p>
     *  *  Code: M8450
     *  * <p>
     *  * 
     */
    @JsonProperty("M8450")
    @XmlEnumValue("M8450")
    Justizvollzugsanstalt_Fulda("M8450"),

    /**
     * <b>Justizvollzugsanstalt Kassel I</b>
     *  * <p>
     *  *  Code: M8451
     *  * <p>
     *  * 
     */
    @JsonProperty("M8451")
    @XmlEnumValue("M8451")
    Justizvollzugsanstalt_Kassel_I("M8451"),

    /**
     * <b>Justizvollzugsanstalt Wiesbaden</b>
     *  * <p>
     *  *  Code: M8500
     *  * <p>
     *  * 
     */
    @JsonProperty("M8500")
    @XmlEnumValue("M8500")
    Justizvollzugsanstalt_Wiesbaden("M8500"),

    /**
     * <b>Justizvollzugsanstalt Rockenberg</b>
     *  * <p>
     *  *  Code: M8611
     *  * <p>
     *  * 
     */
    @JsonProperty("M8611")
    @XmlEnumValue("M8611")
    Justizvollzugsanstalt_Rockenberg("M8611"),

    /**
     * <b>Justizvollzugsanstalt Limburg a. d. Lahn</b>
     *  * <p>
     *  *  Code: M8612
     *  * <p>
     *  * 
     */
    @JsonProperty("M8612")
    @XmlEnumValue("M8612")
    Justizvollzugsanstalt_Limburg_a_d_Lahn("M8612"),

    /**
     * <b>Justizvollzugsanstalt H&#252;nfeld</b>
     *  * <p>
     *  *  Code: M8668
     *  * <p>
     *  * 
     */
    @JsonProperty("M8668")
    @XmlEnumValue("M8668")
    Justizvollzugsanstalt_Huenfeld("M8668"),

    /**
     * <b>Oberlandesgericht Rostock</b>
     *  * <p>
     *  *  Code: N1000
     *  * <p>
     *  * 
     */
    @JsonProperty("N1000")
    @XmlEnumValue("N1000")
    Oberlandesgericht_Rostock("N1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Rostock</b>
     *  * <p>
     *  *  Code: N1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("N1000S")
    @XmlEnumValue("N1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Rostock("N1000S"),

    /**
     * <b>Landgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N1100
     *  * <p>
     *  * 
     */
    @JsonProperty("N1100")
    @XmlEnumValue("N1100")
    Landgericht_Neubrandenburg("N1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("N1100S")
    @XmlEnumValue("N1100S")
    Staatsanwaltschaft_beim_Landgericht_Neubrandenburg("N1100S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Altentreptow</b>
     *  * <p>
     *  *  Code: N1101
     *  * <p>
     *  * 
     */
    @JsonProperty("N1101")
    @XmlEnumValue("N1101")
    aufgeloest_Amtsgericht_Altentreptow("N1101"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Anklam</b>
     *  * <p>
     *  *  Code: N1102
     *  * <p>
     *  * 
     */
    @JsonProperty("N1102")
    @XmlEnumValue("N1102")
    aufgeloest_Amtsgericht_Anklam("N1102"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Demmin</b>
     *  * <p>
     *  *  Code: N1103
     *  * <p>
     *  * 
     */
    @JsonProperty("N1103")
    @XmlEnumValue("N1103")
    aufgeloest_Amtsgericht_Demmin("N1103"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Demmin Zweigstelle Malchin</b>
     *  * <p>
     *  *  Code: N1104
     *  * <p>
     *  * 
     */
    @JsonProperty("N1104")
    @XmlEnumValue("N1104")
    aufgeloest_Amtsgericht_Demmin_Zweigstelle_Malchin("N1104"),

    /**
     * <b>Amtsgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N1105
     *  * <p>
     *  * 
     */
    @JsonProperty("N1105")
    @XmlEnumValue("N1105")
    Amtsgericht_Neubrandenburg("N1105"),

    /**
     * <b>Amtsgericht Neubrandenburg, Zentrales Vollstreckungsgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N1105R
     *  * <p>
     *  * 
     */
    @JsonProperty("N1105R")
    @XmlEnumValue("N1105R")
    Amtsgericht_Neubrandenburg_Zentrales_Vollstreckungsgericht_Mecklenburg_Vorpommern("N1105R"),

    /**
     * <b>Registergericht Amtsgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N1105V
     *  * <p>
     *  * 
     */
    @JsonProperty("N1105V")
    @XmlEnumValue("N1105V")
    Registergericht_Amtsgericht_Neubrandenburg("N1105V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neustrelitz</b>
     *  * <p>
     *  *  Code: N1106
     *  * <p>
     *  * 
     */
    @JsonProperty("N1106")
    @XmlEnumValue("N1106")
    aufgeloest_Amtsgericht_Neustrelitz("N1106"),

    /**
     * <b>Amtsgericht Pasewalk</b>
     *  * <p>
     *  *  Code: N1107
     *  * <p>
     *  * 
     */
    @JsonProperty("N1107")
    @XmlEnumValue("N1107")
    Amtsgericht_Pasewalk("N1107"),

    /**
     * <b>aufgel&#246;st-Amtsgericht R&#246;bel/M&#252;ritz</b>
     *  * <p>
     *  *  Code: N1108
     *  * <p>
     *  * 
     */
    @JsonProperty("N1108")
    @XmlEnumValue("N1108")
    aufgeloest_Amtsgericht_Roebel_Mueritz("N1108"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Strasburg</b>
     *  * <p>
     *  *  Code: N1109
     *  * <p>
     *  * 
     */
    @JsonProperty("N1109")
    @XmlEnumValue("N1109")
    aufgeloest_Amtsgericht_Strasburg("N1109"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Teterow</b>
     *  * <p>
     *  *  Code: N1110
     *  * <p>
     *  * 
     */
    @JsonProperty("N1110")
    @XmlEnumValue("N1110")
    aufgeloest_Amtsgericht_Teterow("N1110"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ueckerm&#252;nde</b>
     *  * <p>
     *  *  Code: N1111
     *  * <p>
     *  * 
     */
    @JsonProperty("N1111")
    @XmlEnumValue("N1111")
    aufgeloest_Amtsgericht_Ueckermuende("N1111"),

    /**
     * <b>Amtsgericht Waren (M&#252;ritz)</b>
     *  * <p>
     *  *  Code: N1112
     *  * <p>
     *  * 
     */
    @JsonProperty("N1112")
    @XmlEnumValue("N1112")
    Amtsgericht_Waren_Mueritz("N1112"),

    /**
     * <b>Grundbuchamt Waren (M&#252;ritz)</b>
     *  * <p>
     *  *  Code: N1112G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1112G")
    @XmlEnumValue("N1112G")
    Grundbuchamt_Waren_Mueritz("N1112G"),

    /**
     * <b>Amtsgericht Pasewalk Zweigstelle Anklam</b>
     *  * <p>
     *  *  Code: N1113
     *  * <p>
     *  * 
     */
    @JsonProperty("N1113")
    @XmlEnumValue("N1113")
    Amtsgericht_Pasewalk_Zweigstelle_Anklam("N1113"),

    /**
     * <b>Grundbuchamt Pasewalk Zweigstelle Anklam</b>
     *  * <p>
     *  *  Code: N1113G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1113G")
    @XmlEnumValue("N1113G")
    Grundbuchamt_Pasewalk_Zweigstelle_Anklam("N1113G"),

    /**
     * <b>Amtsgericht Waren (M&#252;ritz) Zweigstelle Neustrelitz</b>
     *  * <p>
     *  *  Code: N1114
     *  * <p>
     *  * 
     */
    @JsonProperty("N1114")
    @XmlEnumValue("N1114")
    Amtsgericht_Waren_Mueritz_Zweigstelle_Neustrelitz("N1114"),

    /**
     * <b>Amtsgericht Neubrandenburg Zweigstelle Demmin</b>
     *  * <p>
     *  *  Code: N1115
     *  * <p>
     *  * 
     */
    @JsonProperty("N1115")
    @XmlEnumValue("N1115")
    Amtsgericht_Neubrandenburg_Zweigstelle_Demmin("N1115"),

    /**
     * <b>Grundbuchamt Neubrandenburg Zweigstelle Demmin</b>
     *  * <p>
     *  *  Code: N1115G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1115G")
    @XmlEnumValue("N1115G")
    Grundbuchamt_Neubrandenburg_Zweigstelle_Demmin("N1115G"),

    /**
     * <b>Landgericht Rostock</b>
     *  * <p>
     *  *  Code: N1200
     *  * <p>
     *  * 
     */
    @JsonProperty("N1200")
    @XmlEnumValue("N1200")
    Landgericht_Rostock("N1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Rostock</b>
     *  * <p>
     *  *  Code: N1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("N1200S")
    @XmlEnumValue("N1200S")
    Staatsanwaltschaft_beim_Landgericht_Rostock("N1200S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Doberan</b>
     *  * <p>
     *  *  Code: N1201
     *  * <p>
     *  * 
     */
    @JsonProperty("N1201")
    @XmlEnumValue("N1201")
    aufgeloest_Amtsgericht_Bad_Doberan("N1201"),

    /**
     * <b>Amtsgericht Greifswald</b>
     *  * <p>
     *  *  Code: N1202
     *  * <p>
     *  * 
     */
    @JsonProperty("N1202")
    @XmlEnumValue("N1202")
    Amtsgericht_Greifswald("N1202"),

    /**
     * <b>Grundbuchamt Greifswald</b>
     *  * <p>
     *  *  Code: N1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1202G")
    @XmlEnumValue("N1202G")
    Grundbuchamt_Greifswald("N1202G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Grevesm&#252;hlen</b>
     *  * <p>
     *  *  Code: N1203
     *  * <p>
     *  * 
     */
    @JsonProperty("N1203")
    @XmlEnumValue("N1203")
    aufgeloest_Amtsgericht_Grevesmuehlen("N1203"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stralsund Zweigstelle Grimmen</b>
     *  * <p>
     *  *  Code: N1204
     *  * <p>
     *  * 
     */
    @JsonProperty("N1204")
    @XmlEnumValue("N1204")
    aufgeloest_Amtsgericht_Stralsund_Zweigstelle_Grimmen("N1204"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ribnitz-Damgarten</b>
     *  * <p>
     *  *  Code: N1205
     *  * <p>
     *  * 
     */
    @JsonProperty("N1205")
    @XmlEnumValue("N1205")
    aufgeloest_Amtsgericht_Ribnitz_Damgarten("N1205"),

    /**
     * <b>aufgel&#246;st-Grundbuchamt Ribnitz-Damgarten</b>
     *  * <p>
     *  *  Code: N1205G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1205G")
    @XmlEnumValue("N1205G")
    aufgeloest_Grundbuchamt_Ribnitz_Damgarten("N1205G"),

    /**
     * <b>Amtsgericht Rostock</b>
     *  * <p>
     *  *  Code: N1206
     *  * <p>
     *  * 
     */
    @JsonProperty("N1206")
    @XmlEnumValue("N1206")
    Amtsgericht_Rostock("N1206"),

    /**
     * <b>Grundbuchamt Rostock</b>
     *  * <p>
     *  *  Code: N1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1206G")
    @XmlEnumValue("N1206G")
    Grundbuchamt_Rostock("N1206G"),

    /**
     * <b>Registergericht Amtsgericht Rostock</b>
     *  * <p>
     *  *  Code: N1206V
     *  * <p>
     *  * 
     */
    @JsonProperty("N1206V")
    @XmlEnumValue("N1206V")
    Registergericht_Amtsgericht_Rostock("N1206V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bergen</b>
     *  * <p>
     *  *  Code: N1208
     *  * <p>
     *  * 
     */
    @JsonProperty("N1208")
    @XmlEnumValue("N1208")
    aufgeloest_Amtsgericht_Bergen("N1208"),

    /**
     * <b>Amtsgericht Stralsund</b>
     *  * <p>
     *  *  Code: N1209
     *  * <p>
     *  * 
     */
    @JsonProperty("N1209")
    @XmlEnumValue("N1209")
    Amtsgericht_Stralsund("N1209"),

    /**
     * <b>Grundbuchamt Stralsund</b>
     *  * <p>
     *  *  Code: N1209G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1209G")
    @XmlEnumValue("N1209G")
    Grundbuchamt_Stralsund("N1209G"),

    /**
     * <b>Registergericht Amtsgericht Stralsund</b>
     *  * <p>
     *  *  Code: N1209V
     *  * <p>
     *  * 
     */
    @JsonProperty("N1209V")
    @XmlEnumValue("N1209V")
    Registergericht_Amtsgericht_Stralsund("N1209V"),

    /**
     * <b>Amtsgericht Wismar</b>
     *  * <p>
     *  *  Code: N1210
     *  * <p>
     *  * 
     */
    @JsonProperty("N1210")
    @XmlEnumValue("N1210")
    Amtsgericht_Wismar("N1210"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wolgast</b>
     *  * <p>
     *  *  Code: N1211
     *  * <p>
     *  * 
     */
    @JsonProperty("N1211")
    @XmlEnumValue("N1211")
    aufgeloest_Amtsgericht_Wolgast("N1211"),

    /**
     * <b>Landgericht Schwerin</b>
     *  * <p>
     *  *  Code: N1300
     *  * <p>
     *  * 
     */
    @JsonProperty("N1300")
    @XmlEnumValue("N1300")
    Landgericht_Schwerin("N1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Schwerin</b>
     *  * <p>
     *  *  Code: N1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("N1300S")
    @XmlEnumValue("N1300S")
    Staatsanwaltschaft_beim_Landgericht_Schwerin("N1300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht B&#252;tzow</b>
     *  * <p>
     *  *  Code: N1301
     *  * <p>
     *  * 
     */
    @JsonProperty("N1301")
    @XmlEnumValue("N1301")
    aufgeloest_Amtsgericht_Buetzow("N1301"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gadebusch</b>
     *  * <p>
     *  *  Code: N1302
     *  * <p>
     *  * 
     */
    @JsonProperty("N1302")
    @XmlEnumValue("N1302")
    aufgeloest_Amtsgericht_Gadebusch("N1302"),

    /**
     * <b>Amtsgericht G&#252;strow</b>
     *  * <p>
     *  *  Code: N1303
     *  * <p>
     *  * 
     */
    @JsonProperty("N1303")
    @XmlEnumValue("N1303")
    Amtsgericht_Guestrow("N1303"),

    /**
     * <b>Grundbuchamt G&#252;strow</b>
     *  * <p>
     *  *  Code: N1303G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1303G")
    @XmlEnumValue("N1303G")
    Grundbuchamt_Guestrow("N1303G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hagenow</b>
     *  * <p>
     *  *  Code: N1304
     *  * <p>
     *  * 
     */
    @JsonProperty("N1304")
    @XmlEnumValue("N1304")
    aufgeloest_Amtsgericht_Hagenow("N1304"),

    /**
     * <b>Amtsgericht Ludwigslust</b>
     *  * <p>
     *  *  Code: N1305
     *  * <p>
     *  * 
     */
    @JsonProperty("N1305")
    @XmlEnumValue("N1305")
    Amtsgericht_Ludwigslust("N1305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Plau am See</b>
     *  * <p>
     *  *  Code: N1306
     *  * <p>
     *  * 
     */
    @JsonProperty("N1306")
    @XmlEnumValue("N1306")
    aufgeloest_Amtsgericht_Plau_am_See("N1306"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Parchim</b>
     *  * <p>
     *  *  Code: N1307
     *  * <p>
     *  * 
     */
    @JsonProperty("N1307")
    @XmlEnumValue("N1307")
    aufgeloest_Amtsgericht_Parchim("N1307"),

    /**
     * <b>Amtsgericht Schwerin</b>
     *  * <p>
     *  *  Code: N1308
     *  * <p>
     *  * 
     */
    @JsonProperty("N1308")
    @XmlEnumValue("N1308")
    Amtsgericht_Schwerin("N1308"),

    /**
     * <b>Grundbuchamt Schwerin</b>
     *  * <p>
     *  *  Code: N1308G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1308G")
    @XmlEnumValue("N1308G")
    Grundbuchamt_Schwerin("N1308G"),

    /**
     * <b>Registergericht Amtsgericht Schwerin</b>
     *  * <p>
     *  *  Code: N1308V
     *  * <p>
     *  * 
     */
    @JsonProperty("N1308V")
    @XmlEnumValue("N1308V")
    Registergericht_Amtsgericht_Schwerin("N1308V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sternberg</b>
     *  * <p>
     *  *  Code: N1309
     *  * <p>
     *  * 
     */
    @JsonProperty("N1309")
    @XmlEnumValue("N1309")
    aufgeloest_Amtsgericht_Sternberg("N1309"),

    /**
     * <b>Amtsgericht Ludwigslust Zweigstelle Parchim</b>
     *  * <p>
     *  *  Code: N1310
     *  * <p>
     *  * 
     */
    @JsonProperty("N1310")
    @XmlEnumValue("N1310")
    Amtsgericht_Ludwigslust_Zweigstelle_Parchim("N1310"),

    /**
     * <b>Grundbuchamt Ludwigslust Zweigstelle Parchim</b>
     *  * <p>
     *  *  Code: N1310G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1310G")
    @XmlEnumValue("N1310G")
    Grundbuchamt_Ludwigslust_Zweigstelle_Parchim("N1310G"),

    /**
     * <b>Amtsgericht Wismar Zweigstelle Grevesm&#252;hlen</b>
     *  * <p>
     *  *  Code: N1311
     *  * <p>
     *  * 
     */
    @JsonProperty("N1311")
    @XmlEnumValue("N1311")
    Amtsgericht_Wismar_Zweigstelle_Grevesmuehlen("N1311"),

    /**
     * <b>Grundbuchamt Wismar Zweigstelle Grevesm&#252;hlen</b>
     *  * <p>
     *  *  Code: N1311G
     *  * <p>
     *  * 
     */
    @JsonProperty("N1311G")
    @XmlEnumValue("N1311G")
    Grundbuchamt_Wismar_Zweigstelle_Grevesmuehlen("N1311G"),

    /**
     * <b>Landgericht Stralsund</b>
     *  * <p>
     *  *  Code: N1400
     *  * <p>
     *  * 
     */
    @JsonProperty("N1400")
    @XmlEnumValue("N1400")
    Landgericht_Stralsund("N1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Stralsund</b>
     *  * <p>
     *  *  Code: N1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("N1400S")
    @XmlEnumValue("N1400S")
    Staatsanwaltschaft_beim_Landgericht_Stralsund("N1400S"),

    /**
     * <b>Amtsgericht Stralsund Zweigstelle Bergen auf R&#252;gen</b>
     *  * <p>
     *  *  Code: N1401
     *  * <p>
     *  * 
     */
    @JsonProperty("N1401")
    @XmlEnumValue("N1401")
    Amtsgericht_Stralsund_Zweigstelle_Bergen_auf_Ruegen("N1401"),

    /**
     * <b>Anwaltsgerichtshof Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6001
     *  * <p>
     *  * 
     */
    @JsonProperty("N6001")
    @XmlEnumValue("N6001")
    Anwaltsgerichtshof_Mecklenburg_Vorpommern("N6001"),

    /**
     * <b>Justizvollzugsanstalt B&#252;tzow</b>
     *  * <p>
     *  *  Code: N6059
     *  * <p>
     *  * 
     */
    @JsonProperty("N6059")
    @XmlEnumValue("N6059")
    Justizvollzugsanstalt_Buetzow("N6059"),

    /**
     * <b>Justizvollzugsanstalt Stralsund</b>
     *  * <p>
     *  *  Code: N6061
     *  * <p>
     *  * 
     */
    @JsonProperty("N6061")
    @XmlEnumValue("N6061")
    Justizvollzugsanstalt_Stralsund("N6061"),

    /**
     * <b>Justizvollzugsanstalt Neustrelitz</b>
     *  * <p>
     *  *  Code: N6062
     *  * <p>
     *  * 
     */
    @JsonProperty("N6062")
    @XmlEnumValue("N6062")
    Justizvollzugsanstalt_Neustrelitz("N6062"),

    /**
     * <b>Justizvollzugsanstalt Waldeck</b>
     *  * <p>
     *  *  Code: N6068
     *  * <p>
     *  * 
     */
    @JsonProperty("N6068")
    @XmlEnumValue("N6068")
    Justizvollzugsanstalt_Waldeck("N6068"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N6206
     *  * <p>
     *  * 
     */
    @JsonProperty("N6206")
    @XmlEnumValue("N6206")
    aufgeloest_Arbeitsgericht_Neubrandenburg("N6206"),

    /**
     * <b>Sozialgericht Schwerin</b>
     *  * <p>
     *  *  Code: N6208
     *  * <p>
     *  * 
     */
    @JsonProperty("N6208")
    @XmlEnumValue("N6208")
    Sozialgericht_Schwerin("N6208"),

    /**
     * <b>Oberverwaltungsgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6209
     *  * <p>
     *  * 
     */
    @JsonProperty("N6209")
    @XmlEnumValue("N6209")
    Oberverwaltungsgericht_Mecklenburg_Vorpommern("N6209"),

    /**
     * <b>Arbeitsgericht Schwerin</b>
     *  * <p>
     *  *  Code: N6212
     *  * <p>
     *  * 
     */
    @JsonProperty("N6212")
    @XmlEnumValue("N6212")
    Arbeitsgericht_Schwerin("N6212"),

    /**
     * <b>Arbeitsgericht Rostock</b>
     *  * <p>
     *  *  Code: N6224
     *  * <p>
     *  * 
     */
    @JsonProperty("N6224")
    @XmlEnumValue("N6224")
    Arbeitsgericht_Rostock("N6224"),

    /**
     * <b>Landesarbeitsgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6235
     *  * <p>
     *  * 
     */
    @JsonProperty("N6235")
    @XmlEnumValue("N6235")
    Landesarbeitsgericht_Mecklenburg_Vorpommern("N6235"),

    /**
     * <b>Arbeitsgericht Stralsund</b>
     *  * <p>
     *  *  Code: N6247
     *  * <p>
     *  * 
     */
    @JsonProperty("N6247")
    @XmlEnumValue("N6247")
    Arbeitsgericht_Stralsund("N6247"),

    /**
     * <b>Finanzgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6269
     *  * <p>
     *  * 
     */
    @JsonProperty("N6269")
    @XmlEnumValue("N6269")
    Finanzgericht_Mecklenburg_Vorpommern("N6269"),

    /**
     * <b>Landesverfassungsgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6298
     *  * <p>
     *  * 
     */
    @JsonProperty("N6298")
    @XmlEnumValue("N6298")
    Landesverfassungsgericht_Mecklenburg_Vorpommern("N6298"),

    /**
     * <b>Landessozialgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6312
     *  * <p>
     *  * 
     */
    @JsonProperty("N6312")
    @XmlEnumValue("N6312")
    Landessozialgericht_Mecklenburg_Vorpommern("N6312"),

    /**
     * <b>Sozialgericht Neubrandenburg</b>
     *  * <p>
     *  *  Code: N6313
     *  * <p>
     *  * 
     */
    @JsonProperty("N6313")
    @XmlEnumValue("N6313")
    Sozialgericht_Neubrandenburg("N6313"),

    /**
     * <b>Sozialgericht Stralsund</b>
     *  * <p>
     *  *  Code: N6325
     *  * <p>
     *  * 
     */
    @JsonProperty("N6325")
    @XmlEnumValue("N6325")
    Sozialgericht_Stralsund("N6325"),

    /**
     * <b>Sozialgericht Rostock</b>
     *  * <p>
     *  *  Code: N6326
     *  * <p>
     *  * 
     */
    @JsonProperty("N6326")
    @XmlEnumValue("N6326")
    Sozialgericht_Rostock("N6326"),

    /**
     * <b>Verwaltungsgericht Greifswald</b>
     *  * <p>
     *  *  Code: N6339
     *  * <p>
     *  * 
     */
    @JsonProperty("N6339")
    @XmlEnumValue("N6339")
    Verwaltungsgericht_Greifswald("N6339"),

    /**
     * <b>Verwaltungsgericht Schwerin</b>
     *  * <p>
     *  *  Code: N6441
     *  * <p>
     *  * 
     */
    @JsonProperty("N6441")
    @XmlEnumValue("N6441")
    Verwaltungsgericht_Schwerin("N6441"),

    /**
     * <b>Anwaltsgericht Mecklenburg-Vorpommern</b>
     *  * <p>
     *  *  Code: N6473
     *  * <p>
     *  * 
     */
    @JsonProperty("N6473")
    @XmlEnumValue("N6473")
    Anwaltsgericht_Mecklenburg_Vorpommern("N6473"),

    /**
     * <b>Arbeitsgericht Stralsund Kammer Neubrandenburg</b>
     *  * <p>
     *  *  Code: N6511
     *  * <p>
     *  * 
     */
    @JsonProperty("N6511")
    @XmlEnumValue("N6511")
    Arbeitsgericht_Stralsund_Kammer_Neubrandenburg("N6511"),

    /**
     * <b>Richterdienstgericht</b>
     *  * <p>
     *  *  Code: N6516
     *  * <p>
     *  * 
     */
    @JsonProperty("N6516")
    @XmlEnumValue("N6516")
    Richterdienstgericht("N6516"),

    /**
     * <b>Dienstgerichtshof</b>
     *  * <p>
     *  *  Code: N6517
     *  * <p>
     *  * 
     */
    @JsonProperty("N6517")
    @XmlEnumValue("N6517")
    Dienstgerichtshof("N6517"),

    /**
     * <b>Oberlandesgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P1000
     *  * <p>
     *  * 
     */
    @JsonProperty("P1000")
    @XmlEnumValue("P1000")
    Oberlandesgericht_Braunschweig("P1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("P1000S")
    @XmlEnumValue("P1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Braunschweig("P1000S"),

    /**
     * <b>Landgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P1100
     *  * <p>
     *  * 
     */
    @JsonProperty("P1100")
    @XmlEnumValue("P1100")
    Landgericht_Braunschweig("P1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("P1100S")
    @XmlEnumValue("P1100S")
    Staatsanwaltschaft_beim_Landgericht_Braunschweig("P1100S"),

    /**
     * <b>Amtsgericht Bad Gandersheim</b>
     *  * <p>
     *  *  Code: P1101
     *  * <p>
     *  * 
     */
    @JsonProperty("P1101")
    @XmlEnumValue("P1101")
    Amtsgericht_Bad_Gandersheim("P1101"),

    /**
     * <b>Grundbuchamt Bad Gandersheim</b>
     *  * <p>
     *  *  Code: P1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1101G")
    @XmlEnumValue("P1101G")
    Grundbuchamt_Bad_Gandersheim("P1101G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Harzburg</b>
     *  * <p>
     *  *  Code: P1102
     *  * <p>
     *  * 
     */
    @JsonProperty("P1102")
    @XmlEnumValue("P1102")
    aufgeloest_Amtsgericht_Bad_Harzburg("P1102"),

    /**
     * <b>Amtsgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P1103
     *  * <p>
     *  * 
     */
    @JsonProperty("P1103")
    @XmlEnumValue("P1103")
    Amtsgericht_Braunschweig("P1103"),

    /**
     * <b>Grundbuchamt Braunschweig</b>
     *  * <p>
     *  *  Code: P1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1103G")
    @XmlEnumValue("P1103G")
    Grundbuchamt_Braunschweig("P1103G"),

    /**
     * <b>Amtsgericht Goslar</b>
     *  * <p>
     *  *  Code: P1104
     *  * <p>
     *  * 
     */
    @JsonProperty("P1104")
    @XmlEnumValue("P1104")
    Amtsgericht_Goslar("P1104"),

    /**
     * <b>Grundbuchamt Goslar</b>
     *  * <p>
     *  *  Code: P1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1104G")
    @XmlEnumValue("P1104G")
    Grundbuchamt_Goslar("P1104G"),

    /**
     * <b>Amtsgericht Goslar, Zentrales Vollstreckungsgericht Niedersachsen</b>
     *  * <p>
     *  *  Code: P1104R
     *  * <p>
     *  * 
     */
    @JsonProperty("P1104R")
    @XmlEnumValue("P1104R")
    Amtsgericht_Goslar_Zentrales_Vollstreckungsgericht_Niedersachsen("P1104R"),

    /**
     * <b>Amtsgericht Helmstedt</b>
     *  * <p>
     *  *  Code: P1105
     *  * <p>
     *  * 
     */
    @JsonProperty("P1105")
    @XmlEnumValue("P1105")
    Amtsgericht_Helmstedt("P1105"),

    /**
     * <b>Grundbuchamt Helmstedt</b>
     *  * <p>
     *  *  Code: P1105G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1105G")
    @XmlEnumValue("P1105G")
    Grundbuchamt_Helmstedt("P1105G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht K&#246;nigslutter</b>
     *  * <p>
     *  *  Code: P1106
     *  * <p>
     *  * 
     */
    @JsonProperty("P1106")
    @XmlEnumValue("P1106")
    aufgeloest_Amtsgericht_Koenigslutter("P1106"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Salzgitter-Bad</b>
     *  * <p>
     *  *  Code: P1107
     *  * <p>
     *  * 
     */
    @JsonProperty("P1107")
    @XmlEnumValue("P1107")
    aufgeloest_Amtsgericht_Salzgitter_Bad("P1107"),

    /**
     * <b>Amtsgericht Salzgitter</b>
     *  * <p>
     *  *  Code: P1108
     *  * <p>
     *  * 
     */
    @JsonProperty("P1108")
    @XmlEnumValue("P1108")
    Amtsgericht_Salzgitter("P1108"),

    /**
     * <b>Grundbuchamt Salzgitter</b>
     *  * <p>
     *  *  Code: P1108G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1108G")
    @XmlEnumValue("P1108G")
    Grundbuchamt_Salzgitter("P1108G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sch&#246;ningen</b>
     *  * <p>
     *  *  Code: P1109
     *  * <p>
     *  * 
     */
    @JsonProperty("P1109")
    @XmlEnumValue("P1109")
    aufgeloest_Amtsgericht_Schoeningen("P1109"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sch&#246;ppenstedt</b>
     *  * <p>
     *  *  Code: P1110
     *  * <p>
     *  * 
     */
    @JsonProperty("P1110")
    @XmlEnumValue("P1110")
    aufgeloest_Amtsgericht_Schoeppenstedt("P1110"),

    /**
     * <b>Amtsgericht Seesen</b>
     *  * <p>
     *  *  Code: P1111
     *  * <p>
     *  * 
     */
    @JsonProperty("P1111")
    @XmlEnumValue("P1111")
    Amtsgericht_Seesen("P1111"),

    /**
     * <b>Grundbuchamt Seesen</b>
     *  * <p>
     *  *  Code: P1111G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1111G")
    @XmlEnumValue("P1111G")
    Grundbuchamt_Seesen("P1111G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Vechelde</b>
     *  * <p>
     *  *  Code: P1112
     *  * <p>
     *  * 
     */
    @JsonProperty("P1112")
    @XmlEnumValue("P1112")
    aufgeloest_Amtsgericht_Vechelde("P1112"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Vorsfelde</b>
     *  * <p>
     *  *  Code: P1113
     *  * <p>
     *  * 
     */
    @JsonProperty("P1113")
    @XmlEnumValue("P1113")
    aufgeloest_Amtsgericht_Vorsfelde("P1113"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Walkenried</b>
     *  * <p>
     *  *  Code: P1114
     *  * <p>
     *  * 
     */
    @JsonProperty("P1114")
    @XmlEnumValue("P1114")
    aufgeloest_Amtsgericht_Walkenried("P1114"),

    /**
     * <b>Amtsgericht Wolfenb&#252;ttel</b>
     *  * <p>
     *  *  Code: P1115
     *  * <p>
     *  * 
     */
    @JsonProperty("P1115")
    @XmlEnumValue("P1115")
    Amtsgericht_Wolfenbuettel("P1115"),

    /**
     * <b>Grundbuchamt Wolfenb&#252;ttel</b>
     *  * <p>
     *  *  Code: P1115G
     *  * <p>
     *  * 
     */
    @JsonProperty("P1115G")
    @XmlEnumValue("P1115G")
    Grundbuchamt_Wolfenbuettel("P1115G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Greene</b>
     *  * <p>
     *  *  Code: P1116
     *  * <p>
     *  * 
     */
    @JsonProperty("P1116")
    @XmlEnumValue("P1116")
    aufgeloest_Amtsgericht_Greene("P1116"),

    /**
     * <b>Oberlandesgericht Celle</b>
     *  * <p>
     *  *  Code: P2000
     *  * <p>
     *  * 
     */
    @JsonProperty("P2000")
    @XmlEnumValue("P2000")
    Oberlandesgericht_Celle("P2000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Celle</b>
     *  * <p>
     *  *  Code: P2000S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2000S")
    @XmlEnumValue("P2000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Celle("P2000S"),

    /**
     * <b>Landgericht B&#252;ckeburg</b>
     *  * <p>
     *  *  Code: P2100
     *  * <p>
     *  * 
     */
    @JsonProperty("P2100")
    @XmlEnumValue("P2100")
    Landgericht_Bueckeburg("P2100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht B&#252;ckeburg</b>
     *  * <p>
     *  *  Code: P2100S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2100S")
    @XmlEnumValue("P2100S")
    Staatsanwaltschaft_beim_Landgericht_Bueckeburg("P2100S"),

    /**
     * <b>Amtsgericht B&#252;ckeburg</b>
     *  * <p>
     *  *  Code: P2101
     *  * <p>
     *  * 
     */
    @JsonProperty("P2101")
    @XmlEnumValue("P2101")
    Amtsgericht_Bueckeburg("P2101"),

    /**
     * <b>Grundbuchamt B&#252;ckeburg</b>
     *  * <p>
     *  *  Code: P2101G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2101G")
    @XmlEnumValue("P2101G")
    Grundbuchamt_Bueckeburg("P2101G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hess. Oldendorf</b>
     *  * <p>
     *  *  Code: P2102
     *  * <p>
     *  * 
     */
    @JsonProperty("P2102")
    @XmlEnumValue("P2102")
    aufgeloest_Amtsgericht_Hess_Oldendorf("P2102"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Obernkirchen</b>
     *  * <p>
     *  *  Code: P2103
     *  * <p>
     *  * 
     */
    @JsonProperty("P2103")
    @XmlEnumValue("P2103")
    aufgeloest_Amtsgericht_Obernkirchen("P2103"),

    /**
     * <b>Amtsgericht Rinteln</b>
     *  * <p>
     *  *  Code: P2104
     *  * <p>
     *  * 
     */
    @JsonProperty("P2104")
    @XmlEnumValue("P2104")
    Amtsgericht_Rinteln("P2104"),

    /**
     * <b>Grundbuchamt Rinteln</b>
     *  * <p>
     *  *  Code: P2104G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2104G")
    @XmlEnumValue("P2104G")
    Grundbuchamt_Rinteln("P2104G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rodenberg</b>
     *  * <p>
     *  *  Code: P2105
     *  * <p>
     *  * 
     */
    @JsonProperty("P2105")
    @XmlEnumValue("P2105")
    aufgeloest_Amtsgericht_Rodenberg("P2105"),

    /**
     * <b>Amtsgericht Stadthagen</b>
     *  * <p>
     *  *  Code: P2106
     *  * <p>
     *  * 
     */
    @JsonProperty("P2106")
    @XmlEnumValue("P2106")
    Amtsgericht_Stadthagen("P2106"),

    /**
     * <b>Grundbuchamt Stadthagen</b>
     *  * <p>
     *  *  Code: P2106G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2106G")
    @XmlEnumValue("P2106G")
    Grundbuchamt_Stadthagen("P2106G"),

    /**
     * <b>Landgericht G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P2200
     *  * <p>
     *  * 
     */
    @JsonProperty("P2200")
    @XmlEnumValue("P2200")
    Landgericht_Goettingen("P2200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P2200S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2200S")
    @XmlEnumValue("P2200S")
    Staatsanwaltschaft_beim_Landgericht_Goettingen("P2200S"),

    /**
     * <b>Amtsgericht Clausthal-Zellerfeld</b>
     *  * <p>
     *  *  Code: P2201
     *  * <p>
     *  * 
     */
    @JsonProperty("P2201")
    @XmlEnumValue("P2201")
    Amtsgericht_Clausthal_Zellerfeld("P2201"),

    /**
     * <b>Grundbuchamt Clausthal-Zellerfeld</b>
     *  * <p>
     *  *  Code: P2201G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2201G")
    @XmlEnumValue("P2201G")
    Grundbuchamt_Clausthal_Zellerfeld("P2201G"),

    /**
     * <b>Amtsgericht Duderstadt</b>
     *  * <p>
     *  *  Code: P2202
     *  * <p>
     *  * 
     */
    @JsonProperty("P2202")
    @XmlEnumValue("P2202")
    Amtsgericht_Duderstadt("P2202"),

    /**
     * <b>Grundbuchamt Duderstadt</b>
     *  * <p>
     *  *  Code: P2202G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2202G")
    @XmlEnumValue("P2202G")
    Grundbuchamt_Duderstadt("P2202G"),

    /**
     * <b>Amtsgericht Einbeck</b>
     *  * <p>
     *  *  Code: P2203
     *  * <p>
     *  * 
     */
    @JsonProperty("P2203")
    @XmlEnumValue("P2203")
    Amtsgericht_Einbeck("P2203"),

    /**
     * <b>Grundbuchamt Einbeck</b>
     *  * <p>
     *  *  Code: P2203G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2203G")
    @XmlEnumValue("P2203G")
    Grundbuchamt_Einbeck("P2203G"),

    /**
     * <b>Amtsgericht G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P2204
     *  * <p>
     *  * 
     */
    @JsonProperty("P2204")
    @XmlEnumValue("P2204")
    Amtsgericht_Goettingen("P2204"),

    /**
     * <b>Grundbuchamt G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P2204G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2204G")
    @XmlEnumValue("P2204G")
    Grundbuchamt_Goettingen("P2204G"),

    /**
     * <b>Amtsgericht Hann. M&#252;nden</b>
     *  * <p>
     *  *  Code: P2205
     *  * <p>
     *  * 
     */
    @JsonProperty("P2205")
    @XmlEnumValue("P2205")
    Amtsgericht_Hann_Muenden("P2205"),

    /**
     * <b>Grundbuchamt Hann. M&#252;nden</b>
     *  * <p>
     *  *  Code: P2205G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2205G")
    @XmlEnumValue("P2205G")
    Grundbuchamt_Hann_Muenden("P2205G"),

    /**
     * <b>Amtsgericht Herzberg am Harz</b>
     *  * <p>
     *  *  Code: P2206
     *  * <p>
     *  * 
     */
    @JsonProperty("P2206")
    @XmlEnumValue("P2206")
    Amtsgericht_Herzberg_am_Harz("P2206"),

    /**
     * <b>Grundbuchamt Herzberg am Harz</b>
     *  * <p>
     *  *  Code: P2206G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2206G")
    @XmlEnumValue("P2206G")
    Grundbuchamt_Herzberg_am_Harz("P2206G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Moringen</b>
     *  * <p>
     *  *  Code: P2207
     *  * <p>
     *  * 
     */
    @JsonProperty("P2207")
    @XmlEnumValue("P2207")
    aufgeloest_Amtsgericht_Moringen("P2207"),

    /**
     * <b>Amtsgericht Northeim</b>
     *  * <p>
     *  *  Code: P2208
     *  * <p>
     *  * 
     */
    @JsonProperty("P2208")
    @XmlEnumValue("P2208")
    Amtsgericht_Northeim("P2208"),

    /**
     * <b>Grundbuchamt Northeim</b>
     *  * <p>
     *  *  Code: P2208G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2208G")
    @XmlEnumValue("P2208G")
    Grundbuchamt_Northeim("P2208G"),

    /**
     * <b>Amtsgericht Osterode</b>
     *  * <p>
     *  *  Code: P2209
     *  * <p>
     *  * 
     */
    @JsonProperty("P2209")
    @XmlEnumValue("P2209")
    Amtsgericht_Osterode("P2209"),

    /**
     * <b>Grundbuchamt Osterode</b>
     *  * <p>
     *  *  Code: P2209G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2209G")
    @XmlEnumValue("P2209G")
    Grundbuchamt_Osterode("P2209G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Reinhausen</b>
     *  * <p>
     *  *  Code: P2210
     *  * <p>
     *  * 
     */
    @JsonProperty("P2210")
    @XmlEnumValue("P2210")
    aufgeloest_Amtsgericht_Reinhausen("P2210"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Uslar</b>
     *  * <p>
     *  *  Code: P2211
     *  * <p>
     *  * 
     */
    @JsonProperty("P2211")
    @XmlEnumValue("P2211")
    aufgeloest_Amtsgericht_Uslar("P2211"),

    /**
     * <b>Landgericht Hannover</b>
     *  * <p>
     *  *  Code: P2300
     *  * <p>
     *  * 
     */
    @JsonProperty("P2300")
    @XmlEnumValue("P2300")
    Landgericht_Hannover("P2300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hannover</b>
     *  * <p>
     *  *  Code: P2300S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2300S")
    @XmlEnumValue("P2300S")
    Staatsanwaltschaft_beim_Landgericht_Hannover("P2300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad M&#252;nder am Deister</b>
     *  * <p>
     *  *  Code: P2301
     *  * <p>
     *  * 
     */
    @JsonProperty("P2301")
    @XmlEnumValue("P2301")
    aufgeloest_Amtsgericht_Bad_Muender_am_Deister("P2301"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Pyrmont</b>
     *  * <p>
     *  *  Code: P2302
     *  * <p>
     *  * 
     */
    @JsonProperty("P2302")
    @XmlEnumValue("P2302")
    aufgeloest_Amtsgericht_Bad_Pyrmont("P2302"),

    /**
     * <b>Amtsgericht Burgwedel</b>
     *  * <p>
     *  *  Code: P2303
     *  * <p>
     *  * 
     */
    @JsonProperty("P2303")
    @XmlEnumValue("P2303")
    Amtsgericht_Burgwedel("P2303"),

    /**
     * <b>Grundbuchamt Burgwedel</b>
     *  * <p>
     *  *  Code: P2303G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2303G")
    @XmlEnumValue("P2303G")
    Grundbuchamt_Burgwedel("P2303G"),

    /**
     * <b>Amtsgericht Hameln</b>
     *  * <p>
     *  *  Code: P2304
     *  * <p>
     *  * 
     */
    @JsonProperty("P2304")
    @XmlEnumValue("P2304")
    Amtsgericht_Hameln("P2304"),

    /**
     * <b>Grundbuchamt Hameln</b>
     *  * <p>
     *  *  Code: P2304G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2304G")
    @XmlEnumValue("P2304G")
    Grundbuchamt_Hameln("P2304G"),

    /**
     * <b>Amtsgericht Hannover</b>
     *  * <p>
     *  *  Code: P2305
     *  * <p>
     *  * 
     */
    @JsonProperty("P2305")
    @XmlEnumValue("P2305")
    Amtsgericht_Hannover("P2305"),

    /**
     * <b>Grundbuchamt Hannover</b>
     *  * <p>
     *  *  Code: P2305G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2305G")
    @XmlEnumValue("P2305G")
    Grundbuchamt_Hannover("P2305G"),

    /**
     * <b>Amtsgericht Neustadt a. Rbge.</b>
     *  * <p>
     *  *  Code: P2306
     *  * <p>
     *  * 
     */
    @JsonProperty("P2306")
    @XmlEnumValue("P2306")
    Amtsgericht_Neustadt_a_Rbge("P2306"),

    /**
     * <b>Grundbuchamt Neustadt a. Rbge.</b>
     *  * <p>
     *  *  Code: P2306G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2306G")
    @XmlEnumValue("P2306G")
    Grundbuchamt_Neustadt_a_Rbge("P2306G"),

    /**
     * <b>Amtsgericht Springe</b>
     *  * <p>
     *  *  Code: P2307
     *  * <p>
     *  * 
     */
    @JsonProperty("P2307")
    @XmlEnumValue("P2307")
    Amtsgericht_Springe("P2307"),

    /**
     * <b>Grundbuchamt Springe</b>
     *  * <p>
     *  *  Code: P2307G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2307G")
    @XmlEnumValue("P2307G")
    Grundbuchamt_Springe("P2307G"),

    /**
     * <b>Amtsgericht Wennigsen (Deister)</b>
     *  * <p>
     *  *  Code: P2308
     *  * <p>
     *  * 
     */
    @JsonProperty("P2308")
    @XmlEnumValue("P2308")
    Amtsgericht_Wennigsen_Deister("P2308"),

    /**
     * <b>Grundbuchamt Wennigsen (Deister)</b>
     *  * <p>
     *  *  Code: P2308G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2308G")
    @XmlEnumValue("P2308G")
    Grundbuchamt_Wennigsen_Deister("P2308G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lauenstein</b>
     *  * <p>
     *  *  Code: P2309
     *  * <p>
     *  * 
     */
    @JsonProperty("P2309")
    @XmlEnumValue("P2309")
    aufgeloest_Amtsgericht_Lauenstein("P2309"),

    /**
     * <b>Landgericht Hildesheim</b>
     *  * <p>
     *  *  Code: P2400
     *  * <p>
     *  * 
     */
    @JsonProperty("P2400")
    @XmlEnumValue("P2400")
    Landgericht_Hildesheim("P2400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hildesheim</b>
     *  * <p>
     *  *  Code: P2400S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2400S")
    @XmlEnumValue("P2400S")
    Staatsanwaltschaft_beim_Landgericht_Hildesheim("P2400S"),

    /**
     * <b>Amtsgericht Alfeld</b>
     *  * <p>
     *  *  Code: P2401
     *  * <p>
     *  * 
     */
    @JsonProperty("P2401")
    @XmlEnumValue("P2401")
    Amtsgericht_Alfeld("P2401"),

    /**
     * <b>Grundbuchamt Alfeld</b>
     *  * <p>
     *  *  Code: P2401G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2401G")
    @XmlEnumValue("P2401G")
    Grundbuchamt_Alfeld("P2401G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bockenem</b>
     *  * <p>
     *  *  Code: P2402
     *  * <p>
     *  * 
     */
    @JsonProperty("P2402")
    @XmlEnumValue("P2402")
    aufgeloest_Amtsgericht_Bockenem("P2402"),

    /**
     * <b>Amtsgericht Burgdorf</b>
     *  * <p>
     *  *  Code: P2403
     *  * <p>
     *  * 
     */
    @JsonProperty("P2403")
    @XmlEnumValue("P2403")
    Amtsgericht_Burgdorf("P2403"),

    /**
     * <b>Grundbuchamt Burgdorf</b>
     *  * <p>
     *  *  Code: P2403G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2403G")
    @XmlEnumValue("P2403G")
    Grundbuchamt_Burgdorf("P2403G"),

    /**
     * <b>Amtsgericht Elze</b>
     *  * <p>
     *  *  Code: P2404
     *  * <p>
     *  * 
     */
    @JsonProperty("P2404")
    @XmlEnumValue("P2404")
    Amtsgericht_Elze("P2404"),

    /**
     * <b>Grundbuchamt Elze</b>
     *  * <p>
     *  *  Code: P2404G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2404G")
    @XmlEnumValue("P2404G")
    Grundbuchamt_Elze("P2404G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eschershausen</b>
     *  * <p>
     *  *  Code: P2405
     *  * <p>
     *  * 
     */
    @JsonProperty("P2405")
    @XmlEnumValue("P2405")
    aufgeloest_Amtsgericht_Eschershausen("P2405"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Fallersleben</b>
     *  * <p>
     *  *  Code: P2406
     *  * <p>
     *  * 
     */
    @JsonProperty("P2406")
    @XmlEnumValue("P2406")
    aufgeloest_Amtsgericht_Fallersleben("P2406"),

    /**
     * <b>Amtsgericht Gifhorn</b>
     *  * <p>
     *  *  Code: P2407
     *  * <p>
     *  * 
     */
    @JsonProperty("P2407")
    @XmlEnumValue("P2407")
    Amtsgericht_Gifhorn("P2407"),

    /**
     * <b>Grundbuchamt Gifhorn</b>
     *  * <p>
     *  *  Code: P2407G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2407G")
    @XmlEnumValue("P2407G")
    Grundbuchamt_Gifhorn("P2407G"),

    /**
     * <b>Amtsgericht Hildesheim</b>
     *  * <p>
     *  *  Code: P2408
     *  * <p>
     *  * 
     */
    @JsonProperty("P2408")
    @XmlEnumValue("P2408")
    Amtsgericht_Hildesheim("P2408"),

    /**
     * <b>Grundbuchamt Hildesheim</b>
     *  * <p>
     *  *  Code: P2408G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2408G")
    @XmlEnumValue("P2408G")
    Grundbuchamt_Hildesheim("P2408G"),

    /**
     * <b>Amtsgericht Holzminden</b>
     *  * <p>
     *  *  Code: P2409
     *  * <p>
     *  * 
     */
    @JsonProperty("P2409")
    @XmlEnumValue("P2409")
    Amtsgericht_Holzminden("P2409"),

    /**
     * <b>Grundbuchamt Holzminden</b>
     *  * <p>
     *  *  Code: P2409G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2409G")
    @XmlEnumValue("P2409G")
    Grundbuchamt_Holzminden("P2409G"),

    /**
     * <b>Amtsgericht Lehrte</b>
     *  * <p>
     *  *  Code: P2410
     *  * <p>
     *  * 
     */
    @JsonProperty("P2410")
    @XmlEnumValue("P2410")
    Amtsgericht_Lehrte("P2410"),

    /**
     * <b>Grundbuchamt Lehrte</b>
     *  * <p>
     *  *  Code: P2410G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2410G")
    @XmlEnumValue("P2410G")
    Grundbuchamt_Lehrte("P2410G"),

    /**
     * <b>Amtsgericht Peine</b>
     *  * <p>
     *  *  Code: P2411
     *  * <p>
     *  * 
     */
    @JsonProperty("P2411")
    @XmlEnumValue("P2411")
    Amtsgericht_Peine("P2411"),

    /**
     * <b>Grundbuchamt Peine</b>
     *  * <p>
     *  *  Code: P2411G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2411G")
    @XmlEnumValue("P2411G")
    Grundbuchamt_Peine("P2411G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stadtoldendorf</b>
     *  * <p>
     *  *  Code: P2412
     *  * <p>
     *  * 
     */
    @JsonProperty("P2412")
    @XmlEnumValue("P2412")
    aufgeloest_Amtsgericht_Stadtoldendorf("P2412"),

    /**
     * <b>Amtsgericht Wolfsburg</b>
     *  * <p>
     *  *  Code: P2413
     *  * <p>
     *  * 
     */
    @JsonProperty("P2413")
    @XmlEnumValue("P2413")
    Amtsgericht_Wolfsburg("P2413"),

    /**
     * <b>Grundbuchamt Wolfsburg</b>
     *  * <p>
     *  *  Code: P2413G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2413G")
    @XmlEnumValue("P2413G")
    Grundbuchamt_Wolfsburg("P2413G"),

    /**
     * <b>Landgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P2500
     *  * <p>
     *  * 
     */
    @JsonProperty("P2500")
    @XmlEnumValue("P2500")
    Landgericht_Lueneburg("P2500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P2500S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2500S")
    @XmlEnumValue("P2500S")
    Staatsanwaltschaft_beim_Landgericht_Lueneburg("P2500S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bergen</b>
     *  * <p>
     *  *  Code: P2501
     *  * <p>
     *  * 
     */
    @JsonProperty("P2501")
    @XmlEnumValue("P2501")
    aufgeloest_Amtsgericht_Bergen_P2501("P2501"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bleckede</b>
     *  * <p>
     *  *  Code: P2502
     *  * <p>
     *  * 
     */
    @JsonProperty("P2502")
    @XmlEnumValue("P2502")
    aufgeloest_Amtsgericht_Bleckede("P2502"),

    /**
     * <b>Amtsgericht Celle</b>
     *  * <p>
     *  *  Code: P2503
     *  * <p>
     *  * 
     */
    @JsonProperty("P2503")
    @XmlEnumValue("P2503")
    Amtsgericht_Celle("P2503"),

    /**
     * <b>Grundbuchamt Celle</b>
     *  * <p>
     *  *  Code: P2503G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2503G")
    @XmlEnumValue("P2503G")
    Grundbuchamt_Celle("P2503G"),

    /**
     * <b>Amtsgericht Dannenberg (Elbe)</b>
     *  * <p>
     *  *  Code: P2504
     *  * <p>
     *  * 
     */
    @JsonProperty("P2504")
    @XmlEnumValue("P2504")
    Amtsgericht_Dannenberg_Elbe("P2504"),

    /**
     * <b>Grundbuchamt Dannenberg (Elbe)</b>
     *  * <p>
     *  *  Code: P2504G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2504G")
    @XmlEnumValue("P2504G")
    Grundbuchamt_Dannenberg_Elbe("P2504G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hankensb&#252;ttel</b>
     *  * <p>
     *  *  Code: P2505
     *  * <p>
     *  * 
     */
    @JsonProperty("P2505")
    @XmlEnumValue("P2505")
    aufgeloest_Amtsgericht_Hankensbuettel("P2505"),

    /**
     * <b>aufgel&#246;st-Amtsgericht L&#252;chow</b>
     *  * <p>
     *  *  Code: P2506
     *  * <p>
     *  * 
     */
    @JsonProperty("P2506")
    @XmlEnumValue("P2506")
    aufgeloest_Amtsgericht_Luechow("P2506"),

    /**
     * <b>Amtsgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P2507
     *  * <p>
     *  * 
     */
    @JsonProperty("P2507")
    @XmlEnumValue("P2507")
    Amtsgericht_Lueneburg("P2507"),

    /**
     * <b>Grundbuchamt L&#252;neburg</b>
     *  * <p>
     *  *  Code: P2507G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2507G")
    @XmlEnumValue("P2507G")
    Grundbuchamt_Lueneburg("P2507G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Medingen</b>
     *  * <p>
     *  *  Code: P2508
     *  * <p>
     *  * 
     */
    @JsonProperty("P2508")
    @XmlEnumValue("P2508")
    aufgeloest_Amtsgericht_Medingen("P2508"),

    /**
     * <b>Amtsgericht Soltau</b>
     *  * <p>
     *  *  Code: P2509
     *  * <p>
     *  * 
     */
    @JsonProperty("P2509")
    @XmlEnumValue("P2509")
    Amtsgericht_Soltau("P2509"),

    /**
     * <b>Grundbuchamt Soltau</b>
     *  * <p>
     *  *  Code: P2509G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2509G")
    @XmlEnumValue("P2509G")
    Grundbuchamt_Soltau("P2509G"),

    /**
     * <b>Amtsgericht Uelzen</b>
     *  * <p>
     *  *  Code: P2510
     *  * <p>
     *  * 
     */
    @JsonProperty("P2510")
    @XmlEnumValue("P2510")
    Amtsgericht_Uelzen("P2510"),

    /**
     * <b>Grundbuchamt Uelzen</b>
     *  * <p>
     *  *  Code: P2510G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2510G")
    @XmlEnumValue("P2510G")
    Grundbuchamt_Uelzen("P2510G"),

    /**
     * <b>Amtsgericht Uelzen, Zentrales Mahngericht</b>
     *  * <p>
     *  *  Code: P2510M
     *  * <p>
     *  * 
     */
    @JsonProperty("P2510M")
    @XmlEnumValue("P2510M")
    Amtsgericht_Uelzen_Zentrales_Mahngericht("P2510M"),

    /**
     * <b>Amtsgericht Winsen</b>
     *  * <p>
     *  *  Code: P2511
     *  * <p>
     *  * 
     */
    @JsonProperty("P2511")
    @XmlEnumValue("P2511")
    Amtsgericht_Winsen("P2511"),

    /**
     * <b>Grundbuchamt Winsen</b>
     *  * <p>
     *  *  Code: P2511G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2511G")
    @XmlEnumValue("P2511G")
    Grundbuchamt_Winsen("P2511G"),

    /**
     * <b>Landgericht Stade</b>
     *  * <p>
     *  *  Code: P2600
     *  * <p>
     *  * 
     */
    @JsonProperty("P2600")
    @XmlEnumValue("P2600")
    Landgericht_Stade("P2600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Stade</b>
     *  * <p>
     *  *  Code: P2600S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2600S")
    @XmlEnumValue("P2600S")
    Staatsanwaltschaft_beim_Landgericht_Stade("P2600S"),

    /**
     * <b>Amtsgericht Bremerv&#246;rde</b>
     *  * <p>
     *  *  Code: P2601
     *  * <p>
     *  * 
     */
    @JsonProperty("P2601")
    @XmlEnumValue("P2601")
    Amtsgericht_Bremervoerde("P2601"),

    /**
     * <b>Grundbuchamt Bremerv&#246;rde</b>
     *  * <p>
     *  *  Code: P2601G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2601G")
    @XmlEnumValue("P2601G")
    Grundbuchamt_Bremervoerde("P2601G"),

    /**
     * <b>Amtsgericht Buxtehude</b>
     *  * <p>
     *  *  Code: P2602
     *  * <p>
     *  * 
     */
    @JsonProperty("P2602")
    @XmlEnumValue("P2602")
    Amtsgericht_Buxtehude("P2602"),

    /**
     * <b>Grundbuchamt Buxtehude</b>
     *  * <p>
     *  *  Code: P2602G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2602G")
    @XmlEnumValue("P2602G")
    Grundbuchamt_Buxtehude("P2602G"),

    /**
     * <b>Amtsgericht Cuxhaven</b>
     *  * <p>
     *  *  Code: P2603
     *  * <p>
     *  * 
     */
    @JsonProperty("P2603")
    @XmlEnumValue("P2603")
    Amtsgericht_Cuxhaven("P2603"),

    /**
     * <b>Grundbuchamt Cuxhaven</b>
     *  * <p>
     *  *  Code: P2603G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2603G")
    @XmlEnumValue("P2603G")
    Grundbuchamt_Cuxhaven("P2603G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dorum</b>
     *  * <p>
     *  *  Code: P2604
     *  * <p>
     *  * 
     */
    @JsonProperty("P2604")
    @XmlEnumValue("P2604")
    aufgeloest_Amtsgericht_Dorum("P2604"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freiburg (Elbe)</b>
     *  * <p>
     *  *  Code: P2605
     *  * <p>
     *  * 
     */
    @JsonProperty("P2605")
    @XmlEnumValue("P2605")
    aufgeloest_Amtsgericht_Freiburg_Elbe("P2605"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hagen im Bremischen</b>
     *  * <p>
     *  *  Code: P2606
     *  * <p>
     *  * 
     */
    @JsonProperty("P2606")
    @XmlEnumValue("P2606")
    aufgeloest_Amtsgericht_Hagen_im_Bremischen("P2606"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Jork</b>
     *  * <p>
     *  *  Code: P2607
     *  * <p>
     *  * 
     */
    @JsonProperty("P2607")
    @XmlEnumValue("P2607")
    aufgeloest_Amtsgericht_Jork("P2607"),

    /**
     * <b>Amtsgericht Geestland</b>
     *  * <p>
     *  *  Code: P2608
     *  * <p>
     *  * 
     */
    @JsonProperty("P2608")
    @XmlEnumValue("P2608")
    Amtsgericht_Geestland("P2608"),

    /**
     * <b>Grundbuchamt Geestland</b>
     *  * <p>
     *  *  Code: P2608G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2608G")
    @XmlEnumValue("P2608G")
    Grundbuchamt_Geestland("P2608G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neuhaus (Oste)</b>
     *  * <p>
     *  *  Code: P2609
     *  * <p>
     *  * 
     */
    @JsonProperty("P2609")
    @XmlEnumValue("P2609")
    aufgeloest_Amtsgericht_Neuhaus_Oste("P2609"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Osten</b>
     *  * <p>
     *  *  Code: P2610
     *  * <p>
     *  * 
     */
    @JsonProperty("P2610")
    @XmlEnumValue("P2610")
    aufgeloest_Amtsgericht_Osten("P2610"),

    /**
     * <b>Amtsgericht Otterndorf</b>
     *  * <p>
     *  *  Code: P2611
     *  * <p>
     *  * 
     */
    @JsonProperty("P2611")
    @XmlEnumValue("P2611")
    Amtsgericht_Otterndorf("P2611"),

    /**
     * <b>Grundbuchamt Otterndorf</b>
     *  * <p>
     *  *  Code: P2611G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2611G")
    @XmlEnumValue("P2611G")
    Grundbuchamt_Otterndorf("P2611G"),

    /**
     * <b>Amtsgericht Stade</b>
     *  * <p>
     *  *  Code: P2612
     *  * <p>
     *  * 
     */
    @JsonProperty("P2612")
    @XmlEnumValue("P2612")
    Amtsgericht_Stade("P2612"),

    /**
     * <b>Grundbuchamt Stade</b>
     *  * <p>
     *  *  Code: P2612G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2612G")
    @XmlEnumValue("P2612G")
    Grundbuchamt_Stade("P2612G"),

    /**
     * <b>Amtsgericht Tostedt</b>
     *  * <p>
     *  *  Code: P2613
     *  * <p>
     *  * 
     */
    @JsonProperty("P2613")
    @XmlEnumValue("P2613")
    Amtsgericht_Tostedt("P2613"),

    /**
     * <b>Grundbuchamt Tostedt</b>
     *  * <p>
     *  *  Code: P2613G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2613G")
    @XmlEnumValue("P2613G")
    Grundbuchamt_Tostedt("P2613G"),

    /**
     * <b>Amtsgericht Zeven</b>
     *  * <p>
     *  *  Code: P2614
     *  * <p>
     *  * 
     */
    @JsonProperty("P2614")
    @XmlEnumValue("P2614")
    Amtsgericht_Zeven("P2614"),

    /**
     * <b>Grundbuchamt Zeven</b>
     *  * <p>
     *  *  Code: P2614G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2614G")
    @XmlEnumValue("P2614G")
    Grundbuchamt_Zeven("P2614G"),

    /**
     * <b>F&#252;hrungsaufsichtsstelle beim Landgericht Stade</b>
     *  * <p>
     *  *  Code: P2620
     *  * <p>
     *  * 
     */
    @JsonProperty("P2620")
    @XmlEnumValue("P2620")
    Fuehrungsaufsichtsstelle_beim_Landgericht_Stade("P2620"),

    /**
     * <b>Landgericht Verden</b>
     *  * <p>
     *  *  Code: P2700
     *  * <p>
     *  * 
     */
    @JsonProperty("P2700")
    @XmlEnumValue("P2700")
    Landgericht_Verden("P2700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Verden</b>
     *  * <p>
     *  *  Code: P2700S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2700S")
    @XmlEnumValue("P2700S")
    Staatsanwaltschaft_beim_Landgericht_Verden("P2700S"),

    /**
     * <b>Amtsgericht Achim</b>
     *  * <p>
     *  *  Code: P2701
     *  * <p>
     *  * 
     */
    @JsonProperty("P2701")
    @XmlEnumValue("P2701")
    Amtsgericht_Achim("P2701"),

    /**
     * <b>Grundbuchamt Achim</b>
     *  * <p>
     *  *  Code: P2701G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2701G")
    @XmlEnumValue("P2701G")
    Grundbuchamt_Achim("P2701G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ahlden</b>
     *  * <p>
     *  *  Code: P2702
     *  * <p>
     *  * 
     */
    @JsonProperty("P2702")
    @XmlEnumValue("P2702")
    aufgeloest_Amtsgericht_Ahlden("P2702"),

    /**
     * <b>Amtsgericht Syke Zweigstelle Bassum</b>
     *  * <p>
     *  *  Code: P2703
     *  * <p>
     *  * 
     */
    @JsonProperty("P2703")
    @XmlEnumValue("P2703")
    Amtsgericht_Syke_Zweigstelle_Bassum("P2703"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bruchhausen-Vilsen</b>
     *  * <p>
     *  *  Code: P2704
     *  * <p>
     *  * 
     */
    @JsonProperty("P2704")
    @XmlEnumValue("P2704")
    aufgeloest_Amtsgericht_Bruchhausen_Vilsen("P2704"),

    /**
     * <b>Amtsgericht Diepholz</b>
     *  * <p>
     *  *  Code: P2705
     *  * <p>
     *  * 
     */
    @JsonProperty("P2705")
    @XmlEnumValue("P2705")
    Amtsgericht_Diepholz("P2705"),

    /**
     * <b>Grundbuchamt Diepholz</b>
     *  * <p>
     *  *  Code: P2705G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2705G")
    @XmlEnumValue("P2705G")
    Grundbuchamt_Diepholz("P2705G"),

    /**
     * <b>Amtsgericht Nienburg Zweigstelle Hoya</b>
     *  * <p>
     *  *  Code: P2706
     *  * <p>
     *  * 
     */
    @JsonProperty("P2706")
    @XmlEnumValue("P2706")
    Amtsgericht_Nienburg_Zweigstelle_Hoya("P2706"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lilienthal</b>
     *  * <p>
     *  *  Code: P2707
     *  * <p>
     *  * 
     */
    @JsonProperty("P2707")
    @XmlEnumValue("P2707")
    aufgeloest_Amtsgericht_Lilienthal("P2707"),

    /**
     * <b>Amtsgericht Nienburg (Weser)</b>
     *  * <p>
     *  *  Code: P2708
     *  * <p>
     *  * 
     */
    @JsonProperty("P2708")
    @XmlEnumValue("P2708")
    Amtsgericht_Nienburg_Weser("P2708"),

    /**
     * <b>Grundbuchamt Nienburg (Weser)</b>
     *  * <p>
     *  *  Code: P2708G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2708G")
    @XmlEnumValue("P2708G")
    Grundbuchamt_Nienburg_Weser("P2708G"),

    /**
     * <b>Amtsgericht Osterholz-Scharmbeck</b>
     *  * <p>
     *  *  Code: P2709
     *  * <p>
     *  * 
     */
    @JsonProperty("P2709")
    @XmlEnumValue("P2709")
    Amtsgericht_Osterholz_Scharmbeck("P2709"),

    /**
     * <b>Grundbuchamt Osterholz-Scharmbeck</b>
     *  * <p>
     *  *  Code: P2709G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2709G")
    @XmlEnumValue("P2709G")
    Grundbuchamt_Osterholz_Scharmbeck("P2709G"),

    /**
     * <b>Amtsgericht Rotenburg (W&#252;mme)</b>
     *  * <p>
     *  *  Code: P2710
     *  * <p>
     *  * 
     */
    @JsonProperty("P2710")
    @XmlEnumValue("P2710")
    Amtsgericht_Rotenburg_Wuemme("P2710"),

    /**
     * <b>Grundbuchamt Rotenburg (W&#252;mme)</b>
     *  * <p>
     *  *  Code: P2710G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2710G")
    @XmlEnumValue("P2710G")
    Grundbuchamt_Rotenburg_Wuemme("P2710G"),

    /**
     * <b>Amtsgericht Stolzenau</b>
     *  * <p>
     *  *  Code: P2711
     *  * <p>
     *  * 
     */
    @JsonProperty("P2711")
    @XmlEnumValue("P2711")
    Amtsgericht_Stolzenau("P2711"),

    /**
     * <b>Grundbuchamt Stolzenau</b>
     *  * <p>
     *  *  Code: P2711G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2711G")
    @XmlEnumValue("P2711G")
    Grundbuchamt_Stolzenau("P2711G"),

    /**
     * <b>Amtsgericht Sulingen</b>
     *  * <p>
     *  *  Code: P2712
     *  * <p>
     *  * 
     */
    @JsonProperty("P2712")
    @XmlEnumValue("P2712")
    Amtsgericht_Sulingen("P2712"),

    /**
     * <b>Grundbuchamt Sulingen</b>
     *  * <p>
     *  *  Code: P2712G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2712G")
    @XmlEnumValue("P2712G")
    Grundbuchamt_Sulingen("P2712G"),

    /**
     * <b>Amtsgericht Syke</b>
     *  * <p>
     *  *  Code: P2713
     *  * <p>
     *  * 
     */
    @JsonProperty("P2713")
    @XmlEnumValue("P2713")
    Amtsgericht_Syke("P2713"),

    /**
     * <b>Grundbuchamt Syke</b>
     *  * <p>
     *  *  Code: P2713G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2713G")
    @XmlEnumValue("P2713G")
    Grundbuchamt_Syke("P2713G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Uchte</b>
     *  * <p>
     *  *  Code: P2714
     *  * <p>
     *  * 
     */
    @JsonProperty("P2714")
    @XmlEnumValue("P2714")
    aufgeloest_Amtsgericht_Uchte("P2714"),

    /**
     * <b>Amtsgericht Verden (Aller)</b>
     *  * <p>
     *  *  Code: P2715
     *  * <p>
     *  * 
     */
    @JsonProperty("P2715")
    @XmlEnumValue("P2715")
    Amtsgericht_Verden_Aller("P2715"),

    /**
     * <b>Grundbuchamt Verden (Aller)</b>
     *  * <p>
     *  *  Code: P2715G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2715G")
    @XmlEnumValue("P2715G")
    Grundbuchamt_Verden_Aller("P2715G"),

    /**
     * <b>Amtsgericht Walsrode</b>
     *  * <p>
     *  *  Code: P2716
     *  * <p>
     *  * 
     */
    @JsonProperty("P2716")
    @XmlEnumValue("P2716")
    Amtsgericht_Walsrode("P2716"),

    /**
     * <b>Grundbuchamt Walsrode</b>
     *  * <p>
     *  *  Code: P2716G
     *  * <p>
     *  * 
     */
    @JsonProperty("P2716G")
    @XmlEnumValue("P2716G")
    Grundbuchamt_Walsrode("P2716G"),

    /**
     * <b>Landgericht L&#252;neburg Zweigstelle Celle</b>
     *  * <p>
     *  *  Code: P2800
     *  * <p>
     *  * 
     */
    @JsonProperty("P2800")
    @XmlEnumValue("P2800")
    Landgericht_Lueneburg_Zweigstelle_Celle("P2800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Celle, Zwst. der StA L&#252;neburg</b>
     *  * <p>
     *  *  Code: P2800S
     *  * <p>
     *  * 
     */
    @JsonProperty("P2800S")
    @XmlEnumValue("P2800S")
    Staatsanwaltschaft_beim_Landgericht_Celle_Zwst_der_StA_Lueneburg("P2800S"),

    /**
     * <b>Oberlandesgericht Oldenburg</b>
     *  * <p>
     *  *  Code: P3000
     *  * <p>
     *  * 
     */
    @JsonProperty("P3000")
    @XmlEnumValue("P3000")
    Oberlandesgericht_Oldenburg("P3000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Oldenburg (Oldenburg)</b>
     *  * <p>
     *  *  Code: P3000S
     *  * <p>
     *  * 
     */
    @JsonProperty("P3000S")
    @XmlEnumValue("P3000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Oldenburg_Oldenburg("P3000S"),

    /**
     * <b>Landgericht Aurich</b>
     *  * <p>
     *  *  Code: P3100
     *  * <p>
     *  * 
     */
    @JsonProperty("P3100")
    @XmlEnumValue("P3100")
    Landgericht_Aurich("P3100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Aurich</b>
     *  * <p>
     *  *  Code: P3100S
     *  * <p>
     *  * 
     */
    @JsonProperty("P3100S")
    @XmlEnumValue("P3100S")
    Staatsanwaltschaft_beim_Landgericht_Aurich("P3100S"),

    /**
     * <b>Amtsgericht Aurich</b>
     *  * <p>
     *  *  Code: P3101
     *  * <p>
     *  * 
     */
    @JsonProperty("P3101")
    @XmlEnumValue("P3101")
    Amtsgericht_Aurich("P3101"),

    /**
     * <b>Grundbuchamt Aurich</b>
     *  * <p>
     *  *  Code: P3101G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3101G")
    @XmlEnumValue("P3101G")
    Grundbuchamt_Aurich("P3101G"),

    /**
     * <b>Amtsgericht Emden</b>
     *  * <p>
     *  *  Code: P3102
     *  * <p>
     *  * 
     */
    @JsonProperty("P3102")
    @XmlEnumValue("P3102")
    Amtsgericht_Emden("P3102"),

    /**
     * <b>Grundbuchamt Emden</b>
     *  * <p>
     *  *  Code: P3102G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3102G")
    @XmlEnumValue("P3102G")
    Grundbuchamt_Emden("P3102G"),

    /**
     * <b>Amtsgericht Wittmund Zweigstelle Esens</b>
     *  * <p>
     *  *  Code: P3103
     *  * <p>
     *  * 
     */
    @JsonProperty("P3103")
    @XmlEnumValue("P3103")
    Amtsgericht_Wittmund_Zweigstelle_Esens("P3103"),

    /**
     * <b>Amtsgericht Leer</b>
     *  * <p>
     *  *  Code: P3104
     *  * <p>
     *  * 
     */
    @JsonProperty("P3104")
    @XmlEnumValue("P3104")
    Amtsgericht_Leer("P3104"),

    /**
     * <b>Grundbuchamt Leer</b>
     *  * <p>
     *  *  Code: P3104G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3104G")
    @XmlEnumValue("P3104G")
    Grundbuchamt_Leer("P3104G"),

    /**
     * <b>Amtsgericht Norden</b>
     *  * <p>
     *  *  Code: P3105
     *  * <p>
     *  * 
     */
    @JsonProperty("P3105")
    @XmlEnumValue("P3105")
    Amtsgericht_Norden("P3105"),

    /**
     * <b>Grundbuchamt Norden</b>
     *  * <p>
     *  *  Code: P3105G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3105G")
    @XmlEnumValue("P3105G")
    Grundbuchamt_Norden("P3105G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Weener</b>
     *  * <p>
     *  *  Code: P3106
     *  * <p>
     *  * 
     */
    @JsonProperty("P3106")
    @XmlEnumValue("P3106")
    aufgeloest_Amtsgericht_Weener("P3106"),

    /**
     * <b>Amtsgericht Wittmund</b>
     *  * <p>
     *  *  Code: P3107
     *  * <p>
     *  * 
     */
    @JsonProperty("P3107")
    @XmlEnumValue("P3107")
    Amtsgericht_Wittmund("P3107"),

    /**
     * <b>Grundbuchamt Wittmund</b>
     *  * <p>
     *  *  Code: P3107G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3107G")
    @XmlEnumValue("P3107G")
    Grundbuchamt_Wittmund("P3107G"),

    /**
     * <b>F&#252;hrungsaufsichtsstelle beim Landgericht Aurich</b>
     *  * <p>
     *  *  Code: P3110
     *  * <p>
     *  * 
     */
    @JsonProperty("P3110")
    @XmlEnumValue("P3110")
    Fuehrungsaufsichtsstelle_beim_Landgericht_Aurich("P3110"),

    /**
     * <b>Landgericht Oldenburg</b>
     *  * <p>
     *  *  Code: P3200
     *  * <p>
     *  * 
     */
    @JsonProperty("P3200")
    @XmlEnumValue("P3200")
    Landgericht_Oldenburg("P3200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Oldenburg (Oldenburg)</b>
     *  * <p>
     *  *  Code: P3200S
     *  * <p>
     *  * 
     */
    @JsonProperty("P3200S")
    @XmlEnumValue("P3200S")
    Staatsanwaltschaft_beim_Landgericht_Oldenburg_Oldenburg("P3200S"),

    /**
     * <b>Amtsgericht Brake</b>
     *  * <p>
     *  *  Code: P3201
     *  * <p>
     *  * 
     */
    @JsonProperty("P3201")
    @XmlEnumValue("P3201")
    Amtsgericht_Brake("P3201"),

    /**
     * <b>Grundbuchamt Brake</b>
     *  * <p>
     *  *  Code: P3201G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3201G")
    @XmlEnumValue("P3201G")
    Grundbuchamt_Brake("P3201G"),

    /**
     * <b>Amtsgericht Cloppenburg</b>
     *  * <p>
     *  *  Code: P3202
     *  * <p>
     *  * 
     */
    @JsonProperty("P3202")
    @XmlEnumValue("P3202")
    Amtsgericht_Cloppenburg("P3202"),

    /**
     * <b>Grundbuchamt Cloppenburg</b>
     *  * <p>
     *  *  Code: P3202G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3202G")
    @XmlEnumValue("P3202G")
    Grundbuchamt_Cloppenburg("P3202G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Damme</b>
     *  * <p>
     *  *  Code: P3203
     *  * <p>
     *  * 
     */
    @JsonProperty("P3203")
    @XmlEnumValue("P3203")
    aufgeloest_Amtsgericht_Damme("P3203"),

    /**
     * <b>Amtsgericht Delmenhorst</b>
     *  * <p>
     *  *  Code: P3204
     *  * <p>
     *  * 
     */
    @JsonProperty("P3204")
    @XmlEnumValue("P3204")
    Amtsgericht_Delmenhorst("P3204"),

    /**
     * <b>Grundbuchamt Delmenhorst</b>
     *  * <p>
     *  *  Code: P3204G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3204G")
    @XmlEnumValue("P3204G")
    Grundbuchamt_Delmenhorst("P3204G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Elsfleth</b>
     *  * <p>
     *  *  Code: P3205
     *  * <p>
     *  * 
     */
    @JsonProperty("P3205")
    @XmlEnumValue("P3205")
    aufgeloest_Amtsgericht_Elsfleth("P3205"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Friesoythe</b>
     *  * <p>
     *  *  Code: P3206
     *  * <p>
     *  * 
     */
    @JsonProperty("P3206")
    @XmlEnumValue("P3206")
    aufgeloest_Amtsgericht_Friesoythe("P3206"),

    /**
     * <b>Amtsgericht Jever</b>
     *  * <p>
     *  *  Code: P3207
     *  * <p>
     *  * 
     */
    @JsonProperty("P3207")
    @XmlEnumValue("P3207")
    Amtsgericht_Jever("P3207"),

    /**
     * <b>Grundbuchamt Jever</b>
     *  * <p>
     *  *  Code: P3207G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3207G")
    @XmlEnumValue("P3207G")
    Grundbuchamt_Jever("P3207G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht L&#246;ningen</b>
     *  * <p>
     *  *  Code: P3208
     *  * <p>
     *  * 
     */
    @JsonProperty("P3208")
    @XmlEnumValue("P3208")
    aufgeloest_Amtsgericht_Loeningen("P3208"),

    /**
     * <b>Amtsgericht Nordenham</b>
     *  * <p>
     *  *  Code: P3209
     *  * <p>
     *  * 
     */
    @JsonProperty("P3209")
    @XmlEnumValue("P3209")
    Amtsgericht_Nordenham("P3209"),

    /**
     * <b>Grundbuchamt Nordenham</b>
     *  * <p>
     *  *  Code: P3209G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3209G")
    @XmlEnumValue("P3209G")
    Grundbuchamt_Nordenham("P3209G"),

    /**
     * <b>Amtsgericht Oldenburg (Oldenburg)</b>
     *  * <p>
     *  *  Code: P3210
     *  * <p>
     *  * 
     */
    @JsonProperty("P3210")
    @XmlEnumValue("P3210")
    Amtsgericht_Oldenburg_Oldenburg("P3210"),

    /**
     * <b>Grundbuchamt Oldenburg (Oldenburg)</b>
     *  * <p>
     *  *  Code: P3210G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3210G")
    @XmlEnumValue("P3210G")
    Grundbuchamt_Oldenburg_Oldenburg("P3210G"),

    /**
     * <b>Amtsgericht Varel</b>
     *  * <p>
     *  *  Code: P3211
     *  * <p>
     *  * 
     */
    @JsonProperty("P3211")
    @XmlEnumValue("P3211")
    Amtsgericht_Varel("P3211"),

    /**
     * <b>Grundbuchamt Varel</b>
     *  * <p>
     *  *  Code: P3211G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3211G")
    @XmlEnumValue("P3211G")
    Grundbuchamt_Varel("P3211G"),

    /**
     * <b>Amtsgericht Vechta</b>
     *  * <p>
     *  *  Code: P3212
     *  * <p>
     *  * 
     */
    @JsonProperty("P3212")
    @XmlEnumValue("P3212")
    Amtsgericht_Vechta("P3212"),

    /**
     * <b>Grundbuchamt Vechta</b>
     *  * <p>
     *  *  Code: P3212G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3212G")
    @XmlEnumValue("P3212G")
    Grundbuchamt_Vechta("P3212G"),

    /**
     * <b>Amtsgericht Westerstede</b>
     *  * <p>
     *  *  Code: P3213
     *  * <p>
     *  * 
     */
    @JsonProperty("P3213")
    @XmlEnumValue("P3213")
    Amtsgericht_Westerstede("P3213"),

    /**
     * <b>Grundbuchamt Westerstede</b>
     *  * <p>
     *  *  Code: P3213G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3213G")
    @XmlEnumValue("P3213G")
    Grundbuchamt_Westerstede("P3213G"),

    /**
     * <b>Amtsgericht Wildeshausen</b>
     *  * <p>
     *  *  Code: P3214
     *  * <p>
     *  * 
     */
    @JsonProperty("P3214")
    @XmlEnumValue("P3214")
    Amtsgericht_Wildeshausen("P3214"),

    /**
     * <b>Grundbuchamt Wildeshausen</b>
     *  * <p>
     *  *  Code: P3214G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3214G")
    @XmlEnumValue("P3214G")
    Grundbuchamt_Wildeshausen("P3214G"),

    /**
     * <b>Amtsgericht Wilhelmshaven</b>
     *  * <p>
     *  *  Code: P3215
     *  * <p>
     *  * 
     */
    @JsonProperty("P3215")
    @XmlEnumValue("P3215")
    Amtsgericht_Wilhelmshaven("P3215"),

    /**
     * <b>Grundbuchamt Wilhelmshaven</b>
     *  * <p>
     *  *  Code: P3215G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3215G")
    @XmlEnumValue("P3215G")
    Grundbuchamt_Wilhelmshaven("P3215G"),

    /**
     * <b>Landgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P3300
     *  * <p>
     *  * 
     */
    @JsonProperty("P3300")
    @XmlEnumValue("P3300")
    Landgericht_Osnabrueck("P3300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P3300S
     *  * <p>
     *  * 
     */
    @JsonProperty("P3300S")
    @XmlEnumValue("P3300S")
    Staatsanwaltschaft_beim_Landgericht_Osnabrueck("P3300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bentheim</b>
     *  * <p>
     *  *  Code: P3301
     *  * <p>
     *  * 
     */
    @JsonProperty("P3301")
    @XmlEnumValue("P3301")
    aufgeloest_Amtsgericht_Bentheim("P3301"),

    /**
     * <b>Amtsgericht Bersenbr&#252;ck</b>
     *  * <p>
     *  *  Code: P3302
     *  * <p>
     *  * 
     */
    @JsonProperty("P3302")
    @XmlEnumValue("P3302")
    Amtsgericht_Bersenbrueck("P3302"),

    /**
     * <b>Grundbuchamt Bersenbr&#252;ck</b>
     *  * <p>
     *  *  Code: P3302G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3302G")
    @XmlEnumValue("P3302G")
    Grundbuchamt_Bersenbrueck("P3302G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bramsche</b>
     *  * <p>
     *  *  Code: P3303
     *  * <p>
     *  * 
     */
    @JsonProperty("P3303")
    @XmlEnumValue("P3303")
    aufgeloest_Amtsgericht_Bramsche("P3303"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Essen</b>
     *  * <p>
     *  *  Code: P3304
     *  * <p>
     *  * 
     */
    @JsonProperty("P3304")
    @XmlEnumValue("P3304")
    aufgeloest_Amtsgericht_Bad_Essen("P3304"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freren</b>
     *  * <p>
     *  *  Code: P3305
     *  * <p>
     *  * 
     */
    @JsonProperty("P3305")
    @XmlEnumValue("P3305")
    aufgeloest_Amtsgericht_Freren("P3305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht F&#252;rstenau</b>
     *  * <p>
     *  *  Code: P3306
     *  * <p>
     *  * 
     */
    @JsonProperty("P3306")
    @XmlEnumValue("P3306")
    aufgeloest_Amtsgericht_Fuerstenau("P3306"),

    /**
     * <b>Amtsgericht Bad Iburg</b>
     *  * <p>
     *  *  Code: P3307
     *  * <p>
     *  * 
     */
    @JsonProperty("P3307")
    @XmlEnumValue("P3307")
    Amtsgericht_Bad_Iburg("P3307"),

    /**
     * <b>Grundbuchamt Bad Iburg</b>
     *  * <p>
     *  *  Code: P3307G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3307G")
    @XmlEnumValue("P3307G")
    Grundbuchamt_Bad_Iburg("P3307G"),

    /**
     * <b>Amtsgericht Lingen (Ems)</b>
     *  * <p>
     *  *  Code: P3308
     *  * <p>
     *  * 
     */
    @JsonProperty("P3308")
    @XmlEnumValue("P3308")
    Amtsgericht_Lingen_Ems("P3308"),

    /**
     * <b>Grundbuchamt Lingen (Ems)</b>
     *  * <p>
     *  *  Code: P3308G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3308G")
    @XmlEnumValue("P3308G")
    Grundbuchamt_Lingen_Ems("P3308G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Melle</b>
     *  * <p>
     *  *  Code: P3309
     *  * <p>
     *  * 
     */
    @JsonProperty("P3309")
    @XmlEnumValue("P3309")
    aufgeloest_Amtsgericht_Melle("P3309"),

    /**
     * <b>Amtsgericht Meppen</b>
     *  * <p>
     *  *  Code: P3310
     *  * <p>
     *  * 
     */
    @JsonProperty("P3310")
    @XmlEnumValue("P3310")
    Amtsgericht_Meppen("P3310"),

    /**
     * <b>Grundbuchamt Meppen</b>
     *  * <p>
     *  *  Code: P3310G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3310G")
    @XmlEnumValue("P3310G")
    Grundbuchamt_Meppen("P3310G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neuenhaus</b>
     *  * <p>
     *  *  Code: P3311
     *  * <p>
     *  * 
     */
    @JsonProperty("P3311")
    @XmlEnumValue("P3311")
    aufgeloest_Amtsgericht_Neuenhaus("P3311"),

    /**
     * <b>Amtsgericht Nordhorn</b>
     *  * <p>
     *  *  Code: P3312
     *  * <p>
     *  * 
     */
    @JsonProperty("P3312")
    @XmlEnumValue("P3312")
    Amtsgericht_Nordhorn("P3312"),

    /**
     * <b>Grundbuchamt Nordhorn</b>
     *  * <p>
     *  *  Code: P3312G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3312G")
    @XmlEnumValue("P3312G")
    Grundbuchamt_Nordhorn("P3312G"),

    /**
     * <b>Amtsgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P3313
     *  * <p>
     *  * 
     */
    @JsonProperty("P3313")
    @XmlEnumValue("P3313")
    Amtsgericht_Osnabrueck("P3313"),

    /**
     * <b>Grundbuchamt Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P3313G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3313G")
    @XmlEnumValue("P3313G")
    Grundbuchamt_Osnabrueck("P3313G"),

    /**
     * <b>Amtsgericht Papenburg</b>
     *  * <p>
     *  *  Code: P3314
     *  * <p>
     *  * 
     */
    @JsonProperty("P3314")
    @XmlEnumValue("P3314")
    Amtsgericht_Papenburg("P3314"),

    /**
     * <b>Grundbuchamt Papenburg</b>
     *  * <p>
     *  *  Code: P3314G
     *  * <p>
     *  * 
     */
    @JsonProperty("P3314G")
    @XmlEnumValue("P3314G")
    Grundbuchamt_Papenburg("P3314G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Quakenbr&#252;ck</b>
     *  * <p>
     *  *  Code: P3315
     *  * <p>
     *  * 
     */
    @JsonProperty("P3315")
    @XmlEnumValue("P3315")
    aufgeloest_Amtsgericht_Quakenbrueck("P3315"),

    /**
     * <b>aufgel&#246;st-Amtsgericht S&#246;gel</b>
     *  * <p>
     *  *  Code: P3316
     *  * <p>
     *  * 
     */
    @JsonProperty("P3316")
    @XmlEnumValue("P3316")
    aufgeloest_Amtsgericht_Soegel("P3316"),

    /**
     * <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Vechta</b>
     *  * <p>
     *  *  Code: P3400
     *  * <p>
     *  * 
     */
    @JsonProperty("P3400")
    @XmlEnumValue("P3400")
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Vechta("P3400"),

    /**
     * <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Nordenham</b>
     *  * <p>
     *  *  Code: P3500
     *  * <p>
     *  * 
     */
    @JsonProperty("P3500")
    @XmlEnumValue("P3500")
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Nordenham("P3500"),

    /**
     * <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Wilhelmshaven</b>
     *  * <p>
     *  *  Code: P3600
     *  * <p>
     *  * 
     */
    @JsonProperty("P3600")
    @XmlEnumValue("P3600")
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Wilhelmshaven("P3600"),

    /**
     * <b>Landgericht Osnabr&#252;ck Strafvollstreckungskammer b.d. Amtsgericht Lingen</b>
     *  * <p>
     *  *  Code: P3700
     *  * <p>
     *  * 
     */
    @JsonProperty("P3700")
    @XmlEnumValue("P3700")
    Landgericht_Osnabrueck_Strafvollstreckungskammer_b_d_Amtsgericht_Lingen("P3700"),

    /**
     * <b>Verwaltungsgericht Stade</b>
     *  * <p>
     *  *  Code: P6098
     *  * <p>
     *  * 
     */
    @JsonProperty("P6098")
    @XmlEnumValue("P6098")
    Verwaltungsgericht_Stade("P6098"),

    /**
     * <b>Sozialgericht Aurich</b>
     *  * <p>
     *  *  Code: P6117
     *  * <p>
     *  * 
     */
    @JsonProperty("P6117")
    @XmlEnumValue("P6117")
    Sozialgericht_Aurich("P6117"),

    /**
     * <b>Sozialgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P6118
     *  * <p>
     *  * 
     */
    @JsonProperty("P6118")
    @XmlEnumValue("P6118")
    Sozialgericht_Braunschweig("P6118"),

    /**
     * <b>Arbeitsgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P6119
     *  * <p>
     *  * 
     */
    @JsonProperty("P6119")
    @XmlEnumValue("P6119")
    Arbeitsgericht_Braunschweig("P6119"),

    /**
     * <b>Nieders&#228;chsischer Staatsgerichtshof</b>
     *  * <p>
     *  *  Code: P6120
     *  * <p>
     *  * 
     */
    @JsonProperty("P6120")
    @XmlEnumValue("P6120")
    Niedersaechsischer_Staatsgerichtshof("P6120"),

    /**
     * <b>Arbeitsgericht Celle</b>
     *  * <p>
     *  *  Code: P6121
     *  * <p>
     *  * 
     */
    @JsonProperty("P6121")
    @XmlEnumValue("P6121")
    Arbeitsgericht_Celle("P6121"),

    /**
     * <b>Landessozialgericht Niedersachsen-Bremen</b>
     *  * <p>
     *  *  Code: P6122
     *  * <p>
     *  * 
     */
    @JsonProperty("P6122")
    @XmlEnumValue("P6122")
    Landessozialgericht_Niedersachsen_Bremen("P6122"),

    /**
     * <b>Arbeitsgericht Emden</b>
     *  * <p>
     *  *  Code: P6123
     *  * <p>
     *  * 
     */
    @JsonProperty("P6123")
    @XmlEnumValue("P6123")
    Arbeitsgericht_Emden("P6123"),

    /**
     * <b>Arbeitsgericht G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P6124
     *  * <p>
     *  * 
     */
    @JsonProperty("P6124")
    @XmlEnumValue("P6124")
    Arbeitsgericht_Goettingen("P6124"),

    /**
     * <b>Arbeitsgericht Hameln</b>
     *  * <p>
     *  *  Code: P6125
     *  * <p>
     *  * 
     */
    @JsonProperty("P6125")
    @XmlEnumValue("P6125")
    Arbeitsgericht_Hameln("P6125"),

    /**
     * <b>Verwaltungsgericht Hannover</b>
     *  * <p>
     *  *  Code: P6126
     *  * <p>
     *  * 
     */
    @JsonProperty("P6126")
    @XmlEnumValue("P6126")
    Verwaltungsgericht_Hannover("P6126"),

    /**
     * <b>Nieders&#228;chsisches Finanzgericht</b>
     *  * <p>
     *  *  Code: P6127
     *  * <p>
     *  * 
     */
    @JsonProperty("P6127")
    @XmlEnumValue("P6127")
    Niedersaechsisches_Finanzgericht("P6127"),

    /**
     * <b>Sozialgericht Hannover</b>
     *  * <p>
     *  *  Code: P6128
     *  * <p>
     *  * 
     */
    @JsonProperty("P6128")
    @XmlEnumValue("P6128")
    Sozialgericht_Hannover("P6128"),

    /**
     * <b>Arbeitsgericht Hannover</b>
     *  * <p>
     *  *  Code: P6129
     *  * <p>
     *  * 
     */
    @JsonProperty("P6129")
    @XmlEnumValue("P6129")
    Arbeitsgericht_Hannover("P6129"),

    /**
     * <b>Landesarbeitsgericht Niedersachsen</b>
     *  * <p>
     *  *  Code: P6130
     *  * <p>
     *  * 
     */
    @JsonProperty("P6130")
    @XmlEnumValue("P6130")
    Landesarbeitsgericht_Niedersachsen("P6130"),

    /**
     * <b>Sozialgericht Hildesheim</b>
     *  * <p>
     *  *  Code: P6131
     *  * <p>
     *  * 
     */
    @JsonProperty("P6131")
    @XmlEnumValue("P6131")
    Sozialgericht_Hildesheim("P6131"),

    /**
     * <b>Arbeitsgericht Hildesheim</b>
     *  * <p>
     *  *  Code: P6132
     *  * <p>
     *  * 
     */
    @JsonProperty("P6132")
    @XmlEnumValue("P6132")
    Arbeitsgericht_Hildesheim("P6132"),

    /**
     * <b>Arbeitsgericht Lingen (Ems)</b>
     *  * <p>
     *  *  Code: P6133
     *  * <p>
     *  * 
     */
    @JsonProperty("P6133")
    @XmlEnumValue("P6133")
    Arbeitsgericht_Lingen_Ems("P6133"),

    /**
     * <b>Sozialgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P6134
     *  * <p>
     *  * 
     */
    @JsonProperty("P6134")
    @XmlEnumValue("P6134")
    Sozialgericht_Lueneburg("P6134"),

    /**
     * <b>Arbeitsgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P6135
     *  * <p>
     *  * 
     */
    @JsonProperty("P6135")
    @XmlEnumValue("P6135")
    Arbeitsgericht_Lueneburg("P6135"),

    /**
     * <b>Nieders&#228;chsisches Oberverwaltungsgericht</b>
     *  * <p>
     *  *  Code: P6136
     *  * <p>
     *  * 
     */
    @JsonProperty("P6136")
    @XmlEnumValue("P6136")
    Niedersaechsisches_Oberverwaltungsgericht("P6136"),

    /**
     * <b>Arbeitsgericht Nienburg</b>
     *  * <p>
     *  *  Code: P6137
     *  * <p>
     *  * 
     */
    @JsonProperty("P6137")
    @XmlEnumValue("P6137")
    Arbeitsgericht_Nienburg("P6137"),

    /**
     * <b>Sozialgericht Oldenburg</b>
     *  * <p>
     *  *  Code: P6138
     *  * <p>
     *  * 
     */
    @JsonProperty("P6138")
    @XmlEnumValue("P6138")
    Sozialgericht_Oldenburg("P6138"),

    /**
     * <b>Arbeitsgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P6139
     *  * <p>
     *  * 
     */
    @JsonProperty("P6139")
    @XmlEnumValue("P6139")
    Arbeitsgericht_Osnabrueck("P6139"),

    /**
     * <b>Sozialgericht Stade</b>
     *  * <p>
     *  *  Code: P6140
     *  * <p>
     *  * 
     */
    @JsonProperty("P6140")
    @XmlEnumValue("P6140")
    Sozialgericht_Stade("P6140"),

    /**
     * <b>Arbeitsgericht Stade</b>
     *  * <p>
     *  *  Code: P6141
     *  * <p>
     *  * 
     */
    @JsonProperty("P6141")
    @XmlEnumValue("P6141")
    Arbeitsgericht_Stade("P6141"),

    /**
     * <b>Arbeitsgericht Verden</b>
     *  * <p>
     *  *  Code: P6142
     *  * <p>
     *  * 
     */
    @JsonProperty("P6142")
    @XmlEnumValue("P6142")
    Arbeitsgericht_Verden("P6142"),

    /**
     * <b>Arbeitsgericht Wilhelmshaven</b>
     *  * <p>
     *  *  Code: P6143
     *  * <p>
     *  * 
     */
    @JsonProperty("P6143")
    @XmlEnumValue("P6143")
    Arbeitsgericht_Wilhelmshaven("P6143"),

    /**
     * <b>Arbeitsgericht Oldenburg</b>
     *  * <p>
     *  *  Code: P6296
     *  * <p>
     *  * 
     */
    @JsonProperty("P6296")
    @XmlEnumValue("P6296")
    Arbeitsgericht_Oldenburg("P6296"),

    /**
     * <b>Sozialgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P6330
     *  * <p>
     *  * 
     */
    @JsonProperty("P6330")
    @XmlEnumValue("P6330")
    Sozialgericht_Osnabrueck("P6330"),

    /**
     * <b>Verwaltungsgericht Oldenburg</b>
     *  * <p>
     *  *  Code: P6348
     *  * <p>
     *  * 
     */
    @JsonProperty("P6348")
    @XmlEnumValue("P6348")
    Verwaltungsgericht_Oldenburg("P6348"),

    /**
     * <b>Verwaltungsgericht Osnabr&#252;ck</b>
     *  * <p>
     *  *  Code: P6395
     *  * <p>
     *  * 
     */
    @JsonProperty("P6395")
    @XmlEnumValue("P6395")
    Verwaltungsgericht_Osnabrueck("P6395"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Braunschweig</b>
     *  * <p>
     *  *  Code: P6436
     *  * <p>
     *  * 
     */
    @JsonProperty("P6436")
    @XmlEnumValue("P6436")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Braunschweig("P6436"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Celle</b>
     *  * <p>
     *  *  Code: P6442
     *  * <p>
     *  * 
     */
    @JsonProperty("P6442")
    @XmlEnumValue("P6442")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Celle("P6442"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Oldenburg</b>
     *  * <p>
     *  *  Code: P6445
     *  * <p>
     *  * 
     */
    @JsonProperty("P6445")
    @XmlEnumValue("P6445")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Oldenburg("P6445"),

    /**
     * <b>Nieders&#228;chsischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: P6447
     *  * <p>
     *  * 
     */
    @JsonProperty("P6447")
    @XmlEnumValue("P6447")
    Niedersaechsischer_Anwaltsgerichtshof("P6447"),

    /**
     * <b>Justizvollzugsanstalt f&#252;r Frauen Vechta</b>
     *  * <p>
     *  *  Code: P6496
     *  * <p>
     *  * 
     */
    @JsonProperty("P6496")
    @XmlEnumValue("P6496")
    Justizvollzugsanstalt_fuer_Frauen_Vechta("P6496"),

    /**
     * <b>Justizvollzugsanstalt Wolfenb&#252;ttel</b>
     *  * <p>
     *  *  Code: P6717
     *  * <p>
     *  * 
     */
    @JsonProperty("P6717")
    @XmlEnumValue("P6717")
    Justizvollzugsanstalt_Wolfenbuettel("P6717"),

    /**
     * <b>Jugendanstalt Hameln</b>
     *  * <p>
     *  *  Code: P6951
     *  * <p>
     *  * 
     */
    @JsonProperty("P6951")
    @XmlEnumValue("P6951")
    Jugendanstalt_Hameln("P6951"),

    /**
     * <b>Justizvollzugsanstalt Vechta</b>
     *  * <p>
     *  *  Code: P7153
     *  * <p>
     *  * 
     */
    @JsonProperty("P7153")
    @XmlEnumValue("P7153")
    Justizvollzugsanstalt_Vechta("P7153"),

    /**
     * <b>Justizvollzugsanstalt Celle</b>
     *  * <p>
     *  *  Code: P7181
     *  * <p>
     *  * 
     */
    @JsonProperty("P7181")
    @XmlEnumValue("P7181")
    Justizvollzugsanstalt_Celle("P7181"),

    /**
     * <b>Justizvollzugsanstalt Hannover</b>
     *  * <p>
     *  *  Code: P7404
     *  * <p>
     *  * 
     */
    @JsonProperty("P7404")
    @XmlEnumValue("P7404")
    Justizvollzugsanstalt_Hannover("P7404"),

    /**
     * <b>Justizvollzugsanstalt Meppen</b>
     *  * <p>
     *  *  Code: P7480
     *  * <p>
     *  * 
     */
    @JsonProperty("P7480")
    @XmlEnumValue("P7480")
    Justizvollzugsanstalt_Meppen("P7480"),

    /**
     * <b>Justizvollzugsanstalt Uelzen</b>
     *  * <p>
     *  *  Code: P7575
     *  * <p>
     *  * 
     */
    @JsonProperty("P7575")
    @XmlEnumValue("P7575")
    Justizvollzugsanstalt_Uelzen("P7575"),

    /**
     * <b>Jugendarrestanstalt Verden</b>
     *  * <p>
     *  *  Code: P7581
     *  * <p>
     *  * 
     */
    @JsonProperty("P7581")
    @XmlEnumValue("P7581")
    Jugendarrestanstalt_Verden("P7581"),

    /**
     * <b>Justizvollzugsanstalt Rosdorf</b>
     *  * <p>
     *  *  Code: P7607
     *  * <p>
     *  * 
     */
    @JsonProperty("P7607")
    @XmlEnumValue("P7607")
    Justizvollzugsanstalt_Rosdorf("P7607"),

    /**
     * <b>Berufsgerichtshof der Ingenieurkammer Niedersachsen</b>
     *  * <p>
     *  *  Code: P7626
     *  * <p>
     *  * 
     */
    @JsonProperty("P7626")
    @XmlEnumValue("P7626")
    Berufsgerichtshof_der_Ingenieurkammer_Niedersachsen("P7626"),

    /**
     * <b>Justizvollzugsanstalt Sehnde</b>
     *  * <p>
     *  *  Code: P7683
     *  * <p>
     *  * 
     */
    @JsonProperty("P7683")
    @XmlEnumValue("P7683")
    Justizvollzugsanstalt_Sehnde("P7683"),

    /**
     * <b>Justizvollzugsanstalt Oldenburg</b>
     *  * <p>
     *  *  Code: P7698
     *  * <p>
     *  * 
     */
    @JsonProperty("P7698")
    @XmlEnumValue("P7698")
    Justizvollzugsanstalt_Oldenburg("P7698"),

    /**
     * <b>Justizvollzugsanstalt Lingen</b>
     *  * <p>
     *  *  Code: P7744
     *  * <p>
     *  * 
     */
    @JsonProperty("P7744")
    @XmlEnumValue("P7744")
    Justizvollzugsanstalt_Lingen("P7744"),

    /**
     * <b>Verwaltungsgericht Braunschweig</b>
     *  * <p>
     *  *  Code: P7771
     *  * <p>
     *  * 
     */
    @JsonProperty("P7771")
    @XmlEnumValue("P7771")
    Verwaltungsgericht_Braunschweig("P7771"),

    /**
     * <b>Verwaltungsgericht G&#246;ttingen</b>
     *  * <p>
     *  *  Code: P7772
     *  * <p>
     *  * 
     */
    @JsonProperty("P7772")
    @XmlEnumValue("P7772")
    Verwaltungsgericht_Goettingen("P7772"),

    /**
     * <b>Verwaltungsgericht L&#252;neburg</b>
     *  * <p>
     *  *  Code: P7773
     *  * <p>
     *  * 
     */
    @JsonProperty("P7773")
    @XmlEnumValue("P7773")
    Verwaltungsgericht_Lueneburg("P7773"),

    /**
     * <b>Justizvollzugsanstalt Hahn&#246;fersand</b>
     *  * <p>
     *  *  Code: P7904
     *  * <p>
     *  * 
     */
    @JsonProperty("P7904")
    @XmlEnumValue("P7904")
    Justizvollzugsanstalt_Hahnoefersand("P7904"),

    /**
     * <b>Ambulanter Justizsozialdienst Niedersachsen</b>
     *  * <p>
     *  *  Code: P7920
     *  * <p>
     *  * 
     */
    @JsonProperty("P7920")
    @XmlEnumValue("P7920")
    Ambulanter_Justizsozialdienst_Niedersachsen("P7920"),

    /**
     * <b>Justizvollzugsanstalt Bremerv&#246;rde</b>
     *  * <p>
     *  *  Code: P8050
     *  * <p>
     *  * 
     */
    @JsonProperty("P8050")
    @XmlEnumValue("P8050")
    Justizvollzugsanstalt_Bremervoerde("P8050"),

    /**
     * <b>Oberlandesgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1000
     *  * <p>
     *  * 
     */
    @JsonProperty("R1000")
    @XmlEnumValue("R1000")
    Oberlandesgericht_Duesseldorf("R1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1000S")
    @XmlEnumValue("R1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Duesseldorf("R1000S"),

    /**
     * <b>Strafkammer des LG M&#252;nster bei dem AG Bocholt</b>
     *  * <p>
     *  *  Code: R1001
     *  * <p>
     *  * 
     */
    @JsonProperty("R1001")
    @XmlEnumValue("R1001")
    Strafkammer_des_LG_Muenster_bei_dem_AG_Bocholt("R1001"),

    /**
     * <b>Landgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1100
     *  * <p>
     *  * 
     */
    @JsonProperty("R1100")
    @XmlEnumValue("R1100")
    Landgericht_Duesseldorf("R1100"),

    /**
     * <b>aufgel&#246;st-Landgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1100Q
     *  * <p>
     *  * 
     */
    @JsonProperty("R1100Q")
    @XmlEnumValue("R1100Q")
    aufgeloest_Landgericht_Duesseldorf("R1100Q"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1100S")
    @XmlEnumValue("R1100S")
    Staatsanwaltschaft_beim_Landgericht_Duesseldorf("R1100S"),

    /**
     * <b>Amtsgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1101
     *  * <p>
     *  * 
     */
    @JsonProperty("R1101")
    @XmlEnumValue("R1101")
    Amtsgericht_Duesseldorf("R1101"),

    /**
     * <b>Grundbuchamt D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1101G")
    @XmlEnumValue("R1101G")
    Grundbuchamt_Duesseldorf("R1101G"),

    /**
     * <b>Amtsgericht Neuss</b>
     *  * <p>
     *  *  Code: R1102
     *  * <p>
     *  * 
     */
    @JsonProperty("R1102")
    @XmlEnumValue("R1102")
    Amtsgericht_Neuss("R1102"),

    /**
     * <b>Grundbuchamt Neuss</b>
     *  * <p>
     *  *  Code: R1102G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1102G")
    @XmlEnumValue("R1102G")
    Grundbuchamt_Neuss("R1102G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Opladen</b>
     *  * <p>
     *  *  Code: R1103
     *  * <p>
     *  * 
     */
    @JsonProperty("R1103")
    @XmlEnumValue("R1103")
    aufgeloest_Amtsgericht_Opladen("R1103"),

    /**
     * <b>Amtsgericht Ratingen</b>
     *  * <p>
     *  *  Code: R1104
     *  * <p>
     *  * 
     */
    @JsonProperty("R1104")
    @XmlEnumValue("R1104")
    Amtsgericht_Ratingen("R1104"),

    /**
     * <b>Grundbuchamt Ratingen</b>
     *  * <p>
     *  *  Code: R1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1104G")
    @XmlEnumValue("R1104G")
    Grundbuchamt_Ratingen("R1104G"),

    /**
     * <b>Amtsgericht Langenfeld</b>
     *  * <p>
     *  *  Code: R1105
     *  * <p>
     *  * 
     */
    @JsonProperty("R1105")
    @XmlEnumValue("R1105")
    Amtsgericht_Langenfeld("R1105"),

    /**
     * <b>Grundbuchamt Langenfeld</b>
     *  * <p>
     *  *  Code: R1105G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1105G")
    @XmlEnumValue("R1105G")
    Grundbuchamt_Langenfeld("R1105G"),

    /**
     * <b>Landgericht Duisburg</b>
     *  * <p>
     *  *  Code: R1200
     *  * <p>
     *  * 
     */
    @JsonProperty("R1200")
    @XmlEnumValue("R1200")
    Landgericht_Duisburg("R1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Duisburg</b>
     *  * <p>
     *  *  Code: R1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1200S")
    @XmlEnumValue("R1200S")
    Staatsanwaltschaft_beim_Landgericht_Duisburg("R1200S"),

    /**
     * <b>Amtsgericht Dinslaken</b>
     *  * <p>
     *  *  Code: R1201
     *  * <p>
     *  * 
     */
    @JsonProperty("R1201")
    @XmlEnumValue("R1201")
    Amtsgericht_Dinslaken("R1201"),

    /**
     * <b>Grundbuchamt Dinslaken</b>
     *  * <p>
     *  *  Code: R1201G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1201G")
    @XmlEnumValue("R1201G")
    Grundbuchamt_Dinslaken("R1201G"),

    /**
     * <b>Amtsgericht Duisburg</b>
     *  * <p>
     *  *  Code: R1202
     *  * <p>
     *  * 
     */
    @JsonProperty("R1202")
    @XmlEnumValue("R1202")
    Amtsgericht_Duisburg("R1202"),

    /**
     * <b>Grundbuchamt Duisburg</b>
     *  * <p>
     *  *  Code: R1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1202G")
    @XmlEnumValue("R1202G")
    Grundbuchamt_Duisburg("R1202G"),

    /**
     * <b>Amtsgericht Duisburg-Hamborn</b>
     *  * <p>
     *  *  Code: R1203
     *  * <p>
     *  * 
     */
    @JsonProperty("R1203")
    @XmlEnumValue("R1203")
    Amtsgericht_Duisburg_Hamborn("R1203"),

    /**
     * <b>Grundbuchamt Duisburg-Hamborn</b>
     *  * <p>
     *  *  Code: R1203G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1203G")
    @XmlEnumValue("R1203G")
    Grundbuchamt_Duisburg_Hamborn("R1203G"),

    /**
     * <b>Amtsgericht Duisburg-Ruhrort</b>
     *  * <p>
     *  *  Code: R1204
     *  * <p>
     *  * 
     */
    @JsonProperty("R1204")
    @XmlEnumValue("R1204")
    Amtsgericht_Duisburg_Ruhrort("R1204"),

    /**
     * <b>Grundbuchamt Duisburg-Ruhrort</b>
     *  * <p>
     *  *  Code: R1204G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1204G")
    @XmlEnumValue("R1204G")
    Grundbuchamt_Duisburg_Ruhrort("R1204G"),

    /**
     * <b>Amtsgericht M&#252;lheim</b>
     *  * <p>
     *  *  Code: R1205
     *  * <p>
     *  * 
     */
    @JsonProperty("R1205")
    @XmlEnumValue("R1205")
    Amtsgericht_Muelheim("R1205"),

    /**
     * <b>Grundbuchamt M&#252;lheim an der Ruhr</b>
     *  * <p>
     *  *  Code: R1205G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1205G")
    @XmlEnumValue("R1205G")
    Grundbuchamt_Muelheim_an_der_Ruhr("R1205G"),

    /**
     * <b>Amtsgericht Oberhausen</b>
     *  * <p>
     *  *  Code: R1206
     *  * <p>
     *  * 
     */
    @JsonProperty("R1206")
    @XmlEnumValue("R1206")
    Amtsgericht_Oberhausen("R1206"),

    /**
     * <b>Grundbuchamt Oberhausen</b>
     *  * <p>
     *  *  Code: R1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1206G")
    @XmlEnumValue("R1206G")
    Grundbuchamt_Oberhausen("R1206G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rees</b>
     *  * <p>
     *  *  Code: R1207
     *  * <p>
     *  * 
     */
    @JsonProperty("R1207")
    @XmlEnumValue("R1207")
    aufgeloest_Amtsgericht_Rees("R1207"),

    /**
     * <b>Amtsgericht Wesel</b>
     *  * <p>
     *  *  Code: R1208
     *  * <p>
     *  * 
     */
    @JsonProperty("R1208")
    @XmlEnumValue("R1208")
    Amtsgericht_Wesel("R1208"),

    /**
     * <b>Grundbuchamt Wesel</b>
     *  * <p>
     *  *  Code: R1208G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1208G")
    @XmlEnumValue("R1208G")
    Grundbuchamt_Wesel("R1208G"),

    /**
     * <b>Landgericht Kleve</b>
     *  * <p>
     *  *  Code: R1300
     *  * <p>
     *  * 
     */
    @JsonProperty("R1300")
    @XmlEnumValue("R1300")
    Landgericht_Kleve("R1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Kleve</b>
     *  * <p>
     *  *  Code: R1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1300S")
    @XmlEnumValue("R1300S")
    Staatsanwaltschaft_beim_Landgericht_Kleve("R1300S"),

    /**
     * <b>Amtsgericht Emmerich</b>
     *  * <p>
     *  *  Code: R1301
     *  * <p>
     *  * 
     */
    @JsonProperty("R1301")
    @XmlEnumValue("R1301")
    Amtsgericht_Emmerich("R1301"),

    /**
     * <b>Grundbuchamt Emmerich am Rhein</b>
     *  * <p>
     *  *  Code: R1301G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1301G")
    @XmlEnumValue("R1301G")
    Grundbuchamt_Emmerich_am_Rhein("R1301G"),

    /**
     * <b>Amtsgericht Geldern</b>
     *  * <p>
     *  *  Code: R1302
     *  * <p>
     *  * 
     */
    @JsonProperty("R1302")
    @XmlEnumValue("R1302")
    Amtsgericht_Geldern("R1302"),

    /**
     * <b>Grundbuchamt Geldern</b>
     *  * <p>
     *  *  Code: R1302G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1302G")
    @XmlEnumValue("R1302G")
    Grundbuchamt_Geldern("R1302G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Goch</b>
     *  * <p>
     *  *  Code: R1303
     *  * <p>
     *  * 
     */
    @JsonProperty("R1303")
    @XmlEnumValue("R1303")
    aufgeloest_Amtsgericht_Goch("R1303"),

    /**
     * <b>Amtsgericht Kleve</b>
     *  * <p>
     *  *  Code: R1304
     *  * <p>
     *  * 
     */
    @JsonProperty("R1304")
    @XmlEnumValue("R1304")
    Amtsgericht_Kleve("R1304"),

    /**
     * <b>Grundbuchamt Kleve</b>
     *  * <p>
     *  *  Code: R1304G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1304G")
    @XmlEnumValue("R1304G")
    Grundbuchamt_Kleve("R1304G"),

    /**
     * <b>Amtsgericht Moers</b>
     *  * <p>
     *  *  Code: R1305
     *  * <p>
     *  * 
     */
    @JsonProperty("R1305")
    @XmlEnumValue("R1305")
    Amtsgericht_Moers("R1305"),

    /**
     * <b>Grundbuchamt Moers</b>
     *  * <p>
     *  *  Code: R1305G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1305G")
    @XmlEnumValue("R1305G")
    Grundbuchamt_Moers("R1305G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Moers, Zwst. der StA Kleve</b>
     *  * <p>
     *  *  Code: R1305S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1305S")
    @XmlEnumValue("R1305S")
    Staatsanwaltschaft_beim_Landgericht_Moers_Zwst_der_StA_Kleve("R1305S"),

    /**
     * <b>Amtsgericht Rheinberg</b>
     *  * <p>
     *  *  Code: R1306
     *  * <p>
     *  * 
     */
    @JsonProperty("R1306")
    @XmlEnumValue("R1306")
    Amtsgericht_Rheinberg("R1306"),

    /**
     * <b>Grundbuchamt Rheinberg</b>
     *  * <p>
     *  *  Code: R1306G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1306G")
    @XmlEnumValue("R1306G")
    Grundbuchamt_Rheinberg("R1306G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rheinberg, Zwst. Xanten</b>
     *  * <p>
     *  *  Code: R1307
     *  * <p>
     *  * 
     */
    @JsonProperty("R1307")
    @XmlEnumValue("R1307")
    aufgeloest_Amtsgericht_Rheinberg_Zwst_Xanten("R1307"),

    /**
     * <b>Ausw&#228;rtige Strafkammer des Landgerichts Kleve in Moers</b>
     *  * <p>
     *  *  Code: R1310
     *  * <p>
     *  * 
     */
    @JsonProperty("R1310")
    @XmlEnumValue("R1310")
    Auswaertige_Strafkammer_des_Landgerichts_Kleve_in_Moers("R1310"),

    /**
     * <b>Landgericht Krefeld</b>
     *  * <p>
     *  *  Code: R1400
     *  * <p>
     *  * 
     */
    @JsonProperty("R1400")
    @XmlEnumValue("R1400")
    Landgericht_Krefeld("R1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Krefeld</b>
     *  * <p>
     *  *  Code: R1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1400S")
    @XmlEnumValue("R1400S")
    Staatsanwaltschaft_beim_Landgericht_Krefeld("R1400S"),

    /**
     * <b>Amtsgericht Kempen</b>
     *  * <p>
     *  *  Code: R1401
     *  * <p>
     *  * 
     */
    @JsonProperty("R1401")
    @XmlEnumValue("R1401")
    Amtsgericht_Kempen("R1401"),

    /**
     * <b>Grundbuchamt Kempen</b>
     *  * <p>
     *  *  Code: R1401G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1401G")
    @XmlEnumValue("R1401G")
    Grundbuchamt_Kempen("R1401G"),

    /**
     * <b>Amtsgericht Krefeld</b>
     *  * <p>
     *  *  Code: R1402
     *  * <p>
     *  * 
     */
    @JsonProperty("R1402")
    @XmlEnumValue("R1402")
    Amtsgericht_Krefeld("R1402"),

    /**
     * <b>Grundbuchamt Krefeld</b>
     *  * <p>
     *  *  Code: R1402G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1402G")
    @XmlEnumValue("R1402G")
    Grundbuchamt_Krefeld("R1402G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Krefeld-Uerdingen</b>
     *  * <p>
     *  *  Code: R1403
     *  * <p>
     *  * 
     */
    @JsonProperty("R1403")
    @XmlEnumValue("R1403")
    aufgeloest_Amtsgericht_Krefeld_Uerdingen("R1403"),

    /**
     * <b>Amtsgericht Nettetal</b>
     *  * <p>
     *  *  Code: R1404
     *  * <p>
     *  * 
     */
    @JsonProperty("R1404")
    @XmlEnumValue("R1404")
    Amtsgericht_Nettetal("R1404"),

    /**
     * <b>Grundbuchamt Nettetal</b>
     *  * <p>
     *  *  Code: R1404G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1404G")
    @XmlEnumValue("R1404G")
    Grundbuchamt_Nettetal("R1404G"),

    /**
     * <b>Landgericht M&#246;nchengladbach</b>
     *  * <p>
     *  *  Code: R1500
     *  * <p>
     *  * 
     */
    @JsonProperty("R1500")
    @XmlEnumValue("R1500")
    Landgericht_Moenchengladbach("R1500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht M&#246;nchengladbach</b>
     *  * <p>
     *  *  Code: R1500S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1500S")
    @XmlEnumValue("R1500S")
    Staatsanwaltschaft_beim_Landgericht_Moenchengladbach("R1500S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht D&#252;lken</b>
     *  * <p>
     *  *  Code: R1501
     *  * <p>
     *  * 
     */
    @JsonProperty("R1501")
    @XmlEnumValue("R1501")
    aufgeloest_Amtsgericht_Duelken("R1501"),

    /**
     * <b>Amtsgericht Erkelenz</b>
     *  * <p>
     *  *  Code: R1502
     *  * <p>
     *  * 
     */
    @JsonProperty("R1502")
    @XmlEnumValue("R1502")
    Amtsgericht_Erkelenz("R1502"),

    /**
     * <b>Grundbuchamt Erkelenz</b>
     *  * <p>
     *  *  Code: R1502G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1502G")
    @XmlEnumValue("R1502G")
    Grundbuchamt_Erkelenz("R1502G"),

    /**
     * <b>Amtsgericht Grevenbroich</b>
     *  * <p>
     *  *  Code: R1503
     *  * <p>
     *  * 
     */
    @JsonProperty("R1503")
    @XmlEnumValue("R1503")
    Amtsgericht_Grevenbroich("R1503"),

    /**
     * <b>Grundbuchamt Grevenbroich</b>
     *  * <p>
     *  *  Code: R1503G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1503G")
    @XmlEnumValue("R1503G")
    Grundbuchamt_Grevenbroich("R1503G"),

    /**
     * <b>Amtsgericht M&#246;nchengladbach</b>
     *  * <p>
     *  *  Code: R1504
     *  * <p>
     *  * 
     */
    @JsonProperty("R1504")
    @XmlEnumValue("R1504")
    Amtsgericht_Moenchengladbach("R1504"),

    /**
     * <b>Grundbuchamt M&#246;nchengladbach</b>
     *  * <p>
     *  *  Code: R1504G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1504G")
    @XmlEnumValue("R1504G")
    Grundbuchamt_Moenchengladbach("R1504G"),

    /**
     * <b>Amtsgericht M&#246;nchengladbach-Rheydt</b>
     *  * <p>
     *  *  Code: R1505
     *  * <p>
     *  * 
     */
    @JsonProperty("R1505")
    @XmlEnumValue("R1505")
    Amtsgericht_Moenchengladbach_Rheydt("R1505"),

    /**
     * <b>Grundbuchamt M&#246;nchengladbach-Rheydt</b>
     *  * <p>
     *  *  Code: R1505G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1505G")
    @XmlEnumValue("R1505G")
    Grundbuchamt_Moenchengladbach_Rheydt("R1505G"),

    /**
     * <b>Amtsgericht Viersen</b>
     *  * <p>
     *  *  Code: R1506
     *  * <p>
     *  * 
     */
    @JsonProperty("R1506")
    @XmlEnumValue("R1506")
    Amtsgericht_Viersen("R1506"),

    /**
     * <b>Grundbuchamt Viersen</b>
     *  * <p>
     *  *  Code: R1506G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1506G")
    @XmlEnumValue("R1506G")
    Grundbuchamt_Viersen("R1506G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Erkelenz, Zwst. Wegberg</b>
     *  * <p>
     *  *  Code: R1507
     *  * <p>
     *  * 
     */
    @JsonProperty("R1507")
    @XmlEnumValue("R1507")
    aufgeloest_Amtsgericht_Erkelenz_Zwst_Wegberg("R1507"),

    /**
     * <b>Landgericht Wuppertal</b>
     *  * <p>
     *  *  Code: R1600
     *  * <p>
     *  * 
     */
    @JsonProperty("R1600")
    @XmlEnumValue("R1600")
    Landgericht_Wuppertal("R1600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Wuppertal</b>
     *  * <p>
     *  *  Code: R1600S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1600S")
    @XmlEnumValue("R1600S")
    Staatsanwaltschaft_beim_Landgericht_Wuppertal("R1600S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Langenberg</b>
     *  * <p>
     *  *  Code: R1601
     *  * <p>
     *  * 
     */
    @JsonProperty("R1601")
    @XmlEnumValue("R1601")
    aufgeloest_Amtsgericht_Langenberg("R1601"),

    /**
     * <b>Amtsgericht Mettmann</b>
     *  * <p>
     *  *  Code: R1602
     *  * <p>
     *  * 
     */
    @JsonProperty("R1602")
    @XmlEnumValue("R1602")
    Amtsgericht_Mettmann("R1602"),

    /**
     * <b>Grundbuchamt Mettmann</b>
     *  * <p>
     *  *  Code: R1602G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1602G")
    @XmlEnumValue("R1602G")
    Grundbuchamt_Mettmann("R1602G"),

    /**
     * <b>Amtsgericht Remscheid</b>
     *  * <p>
     *  *  Code: R1603
     *  * <p>
     *  * 
     */
    @JsonProperty("R1603")
    @XmlEnumValue("R1603")
    Amtsgericht_Remscheid("R1603"),

    /**
     * <b>Grundbuchamt Remscheid</b>
     *  * <p>
     *  *  Code: R1603G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1603G")
    @XmlEnumValue("R1603G")
    Grundbuchamt_Remscheid("R1603G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Remscheid-Lennep</b>
     *  * <p>
     *  *  Code: R1604
     *  * <p>
     *  * 
     */
    @JsonProperty("R1604")
    @XmlEnumValue("R1604")
    aufgeloest_Amtsgericht_Remscheid_Lennep("R1604"),

    /**
     * <b>Amtsgericht Solingen</b>
     *  * <p>
     *  *  Code: R1605
     *  * <p>
     *  * 
     */
    @JsonProperty("R1605")
    @XmlEnumValue("R1605")
    Amtsgericht_Solingen("R1605"),

    /**
     * <b>Grundbuchamt Solingen</b>
     *  * <p>
     *  *  Code: R1605G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1605G")
    @XmlEnumValue("R1605G")
    Grundbuchamt_Solingen("R1605G"),

    /**
     * <b>Amtsgericht Velbert</b>
     *  * <p>
     *  *  Code: R1606
     *  * <p>
     *  * 
     */
    @JsonProperty("R1606")
    @XmlEnumValue("R1606")
    Amtsgericht_Velbert("R1606"),

    /**
     * <b>Grundbuchamt Velbert</b>
     *  * <p>
     *  *  Code: R1606G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1606G")
    @XmlEnumValue("R1606G")
    Grundbuchamt_Velbert("R1606G"),

    /**
     * <b>Amtsgericht Wuppertal</b>
     *  * <p>
     *  *  Code: R1608
     *  * <p>
     *  * 
     */
    @JsonProperty("R1608")
    @XmlEnumValue("R1608")
    Amtsgericht_Wuppertal("R1608"),

    /**
     * <b>Grundbuchamt Wuppertal</b>
     *  * <p>
     *  *  Code: R1608G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1608G")
    @XmlEnumValue("R1608G")
    Grundbuchamt_Wuppertal("R1608G"),

    /**
     * <b>Landgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R1900
     *  * <p>
     *  * 
     */
    @JsonProperty("R1900")
    @XmlEnumValue("R1900")
    Landgericht_Arnsberg("R1900"),

    /**
     * <b>aufgel&#246;st-Landgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R1900Q
     *  * <p>
     *  * 
     */
    @JsonProperty("R1900Q")
    @XmlEnumValue("R1900Q")
    aufgeloest_Landgericht_Arnsberg("R1900Q"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R1900S
     *  * <p>
     *  * 
     */
    @JsonProperty("R1900S")
    @XmlEnumValue("R1900S")
    Staatsanwaltschaft_beim_Landgericht_Arnsberg("R1900S"),

    /**
     * <b>Amtsgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R1901
     *  * <p>
     *  * 
     */
    @JsonProperty("R1901")
    @XmlEnumValue("R1901")
    Amtsgericht_Arnsberg("R1901"),

    /**
     * <b>Grundbuchamt Arnsberg</b>
     *  * <p>
     *  *  Code: R1901G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1901G")
    @XmlEnumValue("R1901G")
    Grundbuchamt_Arnsberg("R1901G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Balve</b>
     *  * <p>
     *  *  Code: R1902
     *  * <p>
     *  * 
     */
    @JsonProperty("R1902")
    @XmlEnumValue("R1902")
    aufgeloest_Amtsgericht_Balve("R1902"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bigge</b>
     *  * <p>
     *  *  Code: R1903
     *  * <p>
     *  * 
     */
    @JsonProperty("R1903")
    @XmlEnumValue("R1903")
    aufgeloest_Amtsgericht_Bigge("R1903"),

    /**
     * <b>Amtsgericht Brilon</b>
     *  * <p>
     *  *  Code: R1904
     *  * <p>
     *  * 
     */
    @JsonProperty("R1904")
    @XmlEnumValue("R1904")
    Amtsgericht_Brilon("R1904"),

    /**
     * <b>Grundbuchamt Brilon</b>
     *  * <p>
     *  *  Code: R1904G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1904G")
    @XmlEnumValue("R1904G")
    Grundbuchamt_Brilon("R1904G"),

    /**
     * <b>Amtsgericht Schmallenberg</b>
     *  * <p>
     *  *  Code: R1905
     *  * <p>
     *  * 
     */
    @JsonProperty("R1905")
    @XmlEnumValue("R1905")
    Amtsgericht_Schmallenberg("R1905"),

    /**
     * <b>Grundbuchamt Schmallenberg</b>
     *  * <p>
     *  *  Code: R1905G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1905G")
    @XmlEnumValue("R1905G")
    Grundbuchamt_Schmallenberg("R1905G"),

    /**
     * <b>Amtsgericht Marsberg</b>
     *  * <p>
     *  *  Code: R1906
     *  * <p>
     *  * 
     */
    @JsonProperty("R1906")
    @XmlEnumValue("R1906")
    Amtsgericht_Marsberg("R1906"),

    /**
     * <b>Grundbuchamt Marsberg</b>
     *  * <p>
     *  *  Code: R1906G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1906G")
    @XmlEnumValue("R1906G")
    Grundbuchamt_Marsberg("R1906G"),

    /**
     * <b>Amtsgericht Medebach</b>
     *  * <p>
     *  *  Code: R1907
     *  * <p>
     *  * 
     */
    @JsonProperty("R1907")
    @XmlEnumValue("R1907")
    Amtsgericht_Medebach("R1907"),

    /**
     * <b>Grundbuchamt Medebach</b>
     *  * <p>
     *  *  Code: R1907G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1907G")
    @XmlEnumValue("R1907G")
    Grundbuchamt_Medebach("R1907G"),

    /**
     * <b>Amtsgericht Menden</b>
     *  * <p>
     *  *  Code: R1908
     *  * <p>
     *  * 
     */
    @JsonProperty("R1908")
    @XmlEnumValue("R1908")
    Amtsgericht_Menden("R1908"),

    /**
     * <b>Grundbuchamt Menden</b>
     *  * <p>
     *  *  Code: R1908G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1908G")
    @XmlEnumValue("R1908G")
    Grundbuchamt_Menden("R1908G"),

    /**
     * <b>Amtsgericht Meschede</b>
     *  * <p>
     *  *  Code: R1909
     *  * <p>
     *  * 
     */
    @JsonProperty("R1909")
    @XmlEnumValue("R1909")
    Amtsgericht_Meschede("R1909"),

    /**
     * <b>Grundbuchamt Meschede</b>
     *  * <p>
     *  *  Code: R1909G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1909G")
    @XmlEnumValue("R1909G")
    Grundbuchamt_Meschede("R1909G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neheim-H&#252;sten</b>
     *  * <p>
     *  *  Code: R1910
     *  * <p>
     *  * 
     */
    @JsonProperty("R1910")
    @XmlEnumValue("R1910")
    aufgeloest_Amtsgericht_Neheim_Huesten("R1910"),

    /**
     * <b>Amtsgericht Soest</b>
     *  * <p>
     *  *  Code: R1911
     *  * <p>
     *  * 
     */
    @JsonProperty("R1911")
    @XmlEnumValue("R1911")
    Amtsgericht_Soest("R1911"),

    /**
     * <b>Grundbuchamt Soest</b>
     *  * <p>
     *  *  Code: R1911G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1911G")
    @XmlEnumValue("R1911G")
    Grundbuchamt_Soest("R1911G"),

    /**
     * <b>Amtsgericht Warstein</b>
     *  * <p>
     *  *  Code: R1912
     *  * <p>
     *  * 
     */
    @JsonProperty("R1912")
    @XmlEnumValue("R1912")
    Amtsgericht_Warstein("R1912"),

    /**
     * <b>Grundbuchamt Warstein</b>
     *  * <p>
     *  *  Code: R1912G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1912G")
    @XmlEnumValue("R1912G")
    Grundbuchamt_Warstein("R1912G"),

    /**
     * <b>Amtsgericht Werl</b>
     *  * <p>
     *  *  Code: R1913
     *  * <p>
     *  * 
     */
    @JsonProperty("R1913")
    @XmlEnumValue("R1913")
    Amtsgericht_Werl("R1913"),

    /**
     * <b>Grundbuchamt Werl</b>
     *  * <p>
     *  *  Code: R1913G
     *  * <p>
     *  * 
     */
    @JsonProperty("R1913G")
    @XmlEnumValue("R1913G")
    Grundbuchamt_Werl("R1913G"),

    /**
     * <b>Oberlandesgericht Hamm</b>
     *  * <p>
     *  *  Code: R2000
     *  * <p>
     *  * 
     */
    @JsonProperty("R2000")
    @XmlEnumValue("R2000")
    Oberlandesgericht_Hamm("R2000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Hamm</b>
     *  * <p>
     *  *  Code: R2000S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2000S")
    @XmlEnumValue("R2000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Hamm("R2000S"),

    /**
     * <b>Landgericht Bielefeld</b>
     *  * <p>
     *  *  Code: R2100
     *  * <p>
     *  * 
     */
    @JsonProperty("R2100")
    @XmlEnumValue("R2100")
    Landgericht_Bielefeld("R2100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bielefeld</b>
     *  * <p>
     *  *  Code: R2100S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2100S")
    @XmlEnumValue("R2100S")
    Staatsanwaltschaft_beim_Landgericht_Bielefeld("R2100S"),

    /**
     * <b>Amtsgericht Bielefeld</b>
     *  * <p>
     *  *  Code: R2101
     *  * <p>
     *  * 
     */
    @JsonProperty("R2101")
    @XmlEnumValue("R2101")
    Amtsgericht_Bielefeld("R2101"),

    /**
     * <b>Grundbuchamt Bielefeld</b>
     *  * <p>
     *  *  Code: R2101G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2101G")
    @XmlEnumValue("R2101G")
    Grundbuchamt_Bielefeld("R2101G"),

    /**
     * <b>Amtsgericht B&#252;nde</b>
     *  * <p>
     *  *  Code: R2102
     *  * <p>
     *  * 
     */
    @JsonProperty("R2102")
    @XmlEnumValue("R2102")
    Amtsgericht_Buende("R2102"),

    /**
     * <b>Grundbuchamt B&#252;nde</b>
     *  * <p>
     *  *  Code: R2102G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2102G")
    @XmlEnumValue("R2102G")
    Grundbuchamt_Buende("R2102G"),

    /**
     * <b>Amtsgericht G&#252;tersloh</b>
     *  * <p>
     *  *  Code: R2103
     *  * <p>
     *  * 
     */
    @JsonProperty("R2103")
    @XmlEnumValue("R2103")
    Amtsgericht_Guetersloh("R2103"),

    /**
     * <b>Grundbuchamt G&#252;tersloh</b>
     *  * <p>
     *  *  Code: R2103G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2103G")
    @XmlEnumValue("R2103G")
    Grundbuchamt_Guetersloh("R2103G"),

    /**
     * <b>Amtsgericht Halle</b>
     *  * <p>
     *  *  Code: R2104
     *  * <p>
     *  * 
     */
    @JsonProperty("R2104")
    @XmlEnumValue("R2104")
    Amtsgericht_Halle("R2104"),

    /**
     * <b>Grundbuchamt Halle (Westf.)</b>
     *  * <p>
     *  *  Code: R2104G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2104G")
    @XmlEnumValue("R2104G")
    Grundbuchamt_Halle_Westf("R2104G"),

    /**
     * <b>Amtsgericht Herford</b>
     *  * <p>
     *  *  Code: R2105
     *  * <p>
     *  * 
     */
    @JsonProperty("R2105")
    @XmlEnumValue("R2105")
    Amtsgericht_Herford("R2105"),

    /**
     * <b>Grundbuchamt Herford</b>
     *  * <p>
     *  *  Code: R2105G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2105G")
    @XmlEnumValue("R2105G")
    Grundbuchamt_Herford("R2105G"),

    /**
     * <b>Amtsgericht L&#252;bbecke</b>
     *  * <p>
     *  *  Code: R2106
     *  * <p>
     *  * 
     */
    @JsonProperty("R2106")
    @XmlEnumValue("R2106")
    Amtsgericht_Luebbecke("R2106"),

    /**
     * <b>Grundbuchamt L&#252;bbecke</b>
     *  * <p>
     *  *  Code: R2106G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2106G")
    @XmlEnumValue("R2106G")
    Grundbuchamt_Luebbecke("R2106G"),

    /**
     * <b>Amtsgericht Minden</b>
     *  * <p>
     *  *  Code: R2107
     *  * <p>
     *  * 
     */
    @JsonProperty("R2107")
    @XmlEnumValue("R2107")
    Amtsgericht_Minden("R2107"),

    /**
     * <b>Grundbuchamt Minden</b>
     *  * <p>
     *  *  Code: R2107G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2107G")
    @XmlEnumValue("R2107G")
    Grundbuchamt_Minden("R2107G"),

    /**
     * <b>Amtsgericht Bad Oeynhausen</b>
     *  * <p>
     *  *  Code: R2108
     *  * <p>
     *  * 
     */
    @JsonProperty("R2108")
    @XmlEnumValue("R2108")
    Amtsgericht_Bad_Oeynhausen("R2108"),

    /**
     * <b>Grundbuchamt Bad Oeynhausen</b>
     *  * <p>
     *  *  Code: R2108G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2108G")
    @XmlEnumValue("R2108G")
    Grundbuchamt_Bad_Oeynhausen("R2108G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Petershagen</b>
     *  * <p>
     *  *  Code: R2109
     *  * <p>
     *  * 
     */
    @JsonProperty("R2109")
    @XmlEnumValue("R2109")
    aufgeloest_Amtsgericht_Petershagen("R2109"),

    /**
     * <b>Amtsgericht Rahden</b>
     *  * <p>
     *  *  Code: R2110
     *  * <p>
     *  * 
     */
    @JsonProperty("R2110")
    @XmlEnumValue("R2110")
    Amtsgericht_Rahden("R2110"),

    /**
     * <b>Grundbuchamt Rahden</b>
     *  * <p>
     *  *  Code: R2110G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2110G")
    @XmlEnumValue("R2110G")
    Grundbuchamt_Rahden("R2110G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rietberg</b>
     *  * <p>
     *  *  Code: R2111
     *  * <p>
     *  * 
     */
    @JsonProperty("R2111")
    @XmlEnumValue("R2111")
    aufgeloest_Amtsgericht_Rietberg("R2111"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Oeynhausen, Zwst. Vlotho</b>
     *  * <p>
     *  *  Code: R2112
     *  * <p>
     *  * 
     */
    @JsonProperty("R2112")
    @XmlEnumValue("R2112")
    aufgeloest_Amtsgericht_Bad_Oeynhausen_Zwst_Vlotho("R2112"),

    /**
     * <b>Amtsgericht Rheda-Wiedenbr&#252;ck</b>
     *  * <p>
     *  *  Code: R2113
     *  * <p>
     *  * 
     */
    @JsonProperty("R2113")
    @XmlEnumValue("R2113")
    Amtsgericht_Rheda_Wiedenbrueck("R2113"),

    /**
     * <b>Grundbuchamt Rheda-Wiedenbr&#252;ck</b>
     *  * <p>
     *  *  Code: R2113G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2113G")
    @XmlEnumValue("R2113G")
    Grundbuchamt_Rheda_Wiedenbrueck("R2113G"),

    /**
     * <b>Landgericht Bochum</b>
     *  * <p>
     *  *  Code: R2200
     *  * <p>
     *  * 
     */
    @JsonProperty("R2200")
    @XmlEnumValue("R2200")
    Landgericht_Bochum("R2200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bochum</b>
     *  * <p>
     *  *  Code: R2200S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2200S")
    @XmlEnumValue("R2200S")
    Staatsanwaltschaft_beim_Landgericht_Bochum("R2200S"),

    /**
     * <b>Amtsgericht Bochum</b>
     *  * <p>
     *  *  Code: R2201
     *  * <p>
     *  * 
     */
    @JsonProperty("R2201")
    @XmlEnumValue("R2201")
    Amtsgericht_Bochum("R2201"),

    /**
     * <b>Grundbuchamt Bochum</b>
     *  * <p>
     *  *  Code: R2201G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2201G")
    @XmlEnumValue("R2201G")
    Grundbuchamt_Bochum("R2201G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bochum-Langendreer</b>
     *  * <p>
     *  *  Code: R2202
     *  * <p>
     *  * 
     */
    @JsonProperty("R2202")
    @XmlEnumValue("R2202")
    aufgeloest_Amtsgericht_Bochum_Langendreer("R2202"),

    /**
     * <b>Amtsgericht Herne</b>
     *  * <p>
     *  *  Code: R2203
     *  * <p>
     *  * 
     */
    @JsonProperty("R2203")
    @XmlEnumValue("R2203")
    Amtsgericht_Herne("R2203"),

    /**
     * <b>Grundbuchamt Herne</b>
     *  * <p>
     *  *  Code: R2203G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2203G")
    @XmlEnumValue("R2203G")
    Grundbuchamt_Herne("R2203G"),

    /**
     * <b>Amtsgericht Recklinghausen</b>
     *  * <p>
     *  *  Code: R2204
     *  * <p>
     *  * 
     */
    @JsonProperty("R2204")
    @XmlEnumValue("R2204")
    Amtsgericht_Recklinghausen("R2204"),

    /**
     * <b>Grundbuchamt Recklinghausen</b>
     *  * <p>
     *  *  Code: R2204G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2204G")
    @XmlEnumValue("R2204G")
    Grundbuchamt_Recklinghausen("R2204G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Recklinghausen, Zwst. der StA Bochum</b>
     *  * <p>
     *  *  Code: R2204S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2204S")
    @XmlEnumValue("R2204S")
    Staatsanwaltschaft_beim_Landgericht_Recklinghausen_Zwst_der_StA_Bochum("R2204S"),

    /**
     * <b>Amtsgericht Herne-Wanne</b>
     *  * <p>
     *  *  Code: R2205
     *  * <p>
     *  * 
     */
    @JsonProperty("R2205")
    @XmlEnumValue("R2205")
    Amtsgericht_Herne_Wanne("R2205"),

    /**
     * <b>Grundbuchamt Herne-Wanne</b>
     *  * <p>
     *  *  Code: R2205G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2205G")
    @XmlEnumValue("R2205G")
    Grundbuchamt_Herne_Wanne("R2205G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wattenscheid</b>
     *  * <p>
     *  *  Code: R2206
     *  * <p>
     *  * 
     */
    @JsonProperty("R2206")
    @XmlEnumValue("R2206")
    aufgeloest_Amtsgericht_Wattenscheid("R2206"),

    /**
     * <b>Amtsgericht Witten</b>
     *  * <p>
     *  *  Code: R2207
     *  * <p>
     *  * 
     */
    @JsonProperty("R2207")
    @XmlEnumValue("R2207")
    Amtsgericht_Witten("R2207"),

    /**
     * <b>Grundbuchamt Witten</b>
     *  * <p>
     *  *  Code: R2207G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2207G")
    @XmlEnumValue("R2207G")
    Grundbuchamt_Witten("R2207G"),

    /**
     * <b>Landgericht Bochum Ausw&#228;rtige Strafkammer Recklinghsn.</b>
     *  * <p>
     *  *  Code: R2210
     *  * <p>
     *  * 
     */
    @JsonProperty("R2210")
    @XmlEnumValue("R2210")
    Landgericht_Bochum_Auswaertige_Strafkammer_Recklinghsn("R2210"),

    /**
     * <b>Landgericht Detmold</b>
     *  * <p>
     *  *  Code: R2300
     *  * <p>
     *  * 
     */
    @JsonProperty("R2300")
    @XmlEnumValue("R2300")
    Landgericht_Detmold("R2300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Detmold</b>
     *  * <p>
     *  *  Code: R2300S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2300S")
    @XmlEnumValue("R2300S")
    Staatsanwaltschaft_beim_Landgericht_Detmold("R2300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Alverdissen</b>
     *  * <p>
     *  *  Code: R2301
     *  * <p>
     *  * 
     */
    @JsonProperty("R2301")
    @XmlEnumValue("R2301")
    aufgeloest_Amtsgericht_Alverdissen("R2301"),

    /**
     * <b>Amtsgericht Blomberg</b>
     *  * <p>
     *  *  Code: R2302
     *  * <p>
     *  * 
     */
    @JsonProperty("R2302")
    @XmlEnumValue("R2302")
    Amtsgericht_Blomberg("R2302"),

    /**
     * <b>Grundbuchamt Blomberg</b>
     *  * <p>
     *  *  Code: R2302G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2302G")
    @XmlEnumValue("R2302G")
    Grundbuchamt_Blomberg("R2302G"),

    /**
     * <b>Amtsgericht Detmold</b>
     *  * <p>
     *  *  Code: R2303
     *  * <p>
     *  * 
     */
    @JsonProperty("R2303")
    @XmlEnumValue("R2303")
    Amtsgericht_Detmold("R2303"),

    /**
     * <b>Grundbuchamt Detmold</b>
     *  * <p>
     *  *  Code: R2303G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2303G")
    @XmlEnumValue("R2303G")
    Grundbuchamt_Detmold("R2303G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hohenhausen</b>
     *  * <p>
     *  *  Code: R2304
     *  * <p>
     *  * 
     */
    @JsonProperty("R2304")
    @XmlEnumValue("R2304")
    aufgeloest_Amtsgericht_Hohenhausen("R2304"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Horn</b>
     *  * <p>
     *  *  Code: R2305
     *  * <p>
     *  * 
     */
    @JsonProperty("R2305")
    @XmlEnumValue("R2305")
    aufgeloest_Amtsgericht_Horn("R2305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lage</b>
     *  * <p>
     *  *  Code: R2306
     *  * <p>
     *  * 
     */
    @JsonProperty("R2306")
    @XmlEnumValue("R2306")
    aufgeloest_Amtsgericht_Lage("R2306"),

    /**
     * <b>Amtsgericht Lemgo</b>
     *  * <p>
     *  *  Code: R2307
     *  * <p>
     *  * 
     */
    @JsonProperty("R2307")
    @XmlEnumValue("R2307")
    Amtsgericht_Lemgo("R2307"),

    /**
     * <b>Grundbuchamt Lemgo</b>
     *  * <p>
     *  *  Code: R2307G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2307G")
    @XmlEnumValue("R2307G")
    Grundbuchamt_Lemgo("R2307G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Oerlinghausen</b>
     *  * <p>
     *  *  Code: R2308
     *  * <p>
     *  * 
     */
    @JsonProperty("R2308")
    @XmlEnumValue("R2308")
    aufgeloest_Amtsgericht_Oerlinghausen("R2308"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Salzuflen</b>
     *  * <p>
     *  *  Code: R2309
     *  * <p>
     *  * 
     */
    @JsonProperty("R2309")
    @XmlEnumValue("R2309")
    aufgeloest_Amtsgericht_Bad_Salzuflen("R2309"),

    /**
     * <b>Landgericht Dortmund</b>
     *  * <p>
     *  *  Code: R2400
     *  * <p>
     *  * 
     */
    @JsonProperty("R2400")
    @XmlEnumValue("R2400")
    Landgericht_Dortmund("R2400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Dortmund</b>
     *  * <p>
     *  *  Code: R2400S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2400S")
    @XmlEnumValue("R2400S")
    Staatsanwaltschaft_beim_Landgericht_Dortmund("R2400S"),

    /**
     * <b>Amtsgericht Castrop-Rauxel</b>
     *  * <p>
     *  *  Code: R2401
     *  * <p>
     *  * 
     */
    @JsonProperty("R2401")
    @XmlEnumValue("R2401")
    Amtsgericht_Castrop_Rauxel("R2401"),

    /**
     * <b>Grundbuchamt Castrop-Rauxel</b>
     *  * <p>
     *  *  Code: R2401G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2401G")
    @XmlEnumValue("R2401G")
    Grundbuchamt_Castrop_Rauxel("R2401G"),

    /**
     * <b>Amtsgericht Dortmund</b>
     *  * <p>
     *  *  Code: R2402
     *  * <p>
     *  * 
     */
    @JsonProperty("R2402")
    @XmlEnumValue("R2402")
    Amtsgericht_Dortmund("R2402"),

    /**
     * <b>Grundbuchamt Dortmund</b>
     *  * <p>
     *  *  Code: R2402G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2402G")
    @XmlEnumValue("R2402G")
    Grundbuchamt_Dortmund("R2402G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dortmund-H&#246;rde</b>
     *  * <p>
     *  *  Code: R2403
     *  * <p>
     *  * 
     */
    @JsonProperty("R2403")
    @XmlEnumValue("R2403")
    aufgeloest_Amtsgericht_Dortmund_Hoerde("R2403"),

    /**
     * <b>Amtsgericht Hamm</b>
     *  * <p>
     *  *  Code: R2404
     *  * <p>
     *  * 
     */
    @JsonProperty("R2404")
    @XmlEnumValue("R2404")
    Amtsgericht_Hamm("R2404"),

    /**
     * <b>Grundbuchamt Hamm</b>
     *  * <p>
     *  *  Code: R2404G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2404G")
    @XmlEnumValue("R2404G")
    Grundbuchamt_Hamm("R2404G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hamm, Zwst. der StA Dortmund</b>
     *  * <p>
     *  *  Code: R2404S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2404S")
    @XmlEnumValue("R2404S")
    Staatsanwaltschaft_beim_Landgericht_Hamm_Zwst_der_StA_Dortmund("R2404S"),

    /**
     * <b>Amtsgericht Kamen</b>
     *  * <p>
     *  *  Code: R2405
     *  * <p>
     *  * 
     */
    @JsonProperty("R2405")
    @XmlEnumValue("R2405")
    Amtsgericht_Kamen("R2405"),

    /**
     * <b>Grundbuchamt Kamen</b>
     *  * <p>
     *  *  Code: R2405G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2405G")
    @XmlEnumValue("R2405G")
    Grundbuchamt_Kamen("R2405G"),

    /**
     * <b>Amtsgericht L&#252;nen</b>
     *  * <p>
     *  *  Code: R2406
     *  * <p>
     *  * 
     */
    @JsonProperty("R2406")
    @XmlEnumValue("R2406")
    Amtsgericht_Luenen("R2406"),

    /**
     * <b>Grundbuchamt L&#252;nen</b>
     *  * <p>
     *  *  Code: R2406G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2406G")
    @XmlEnumValue("R2406G")
    Grundbuchamt_Luenen("R2406G"),

    /**
     * <b>Amtsgericht Unna</b>
     *  * <p>
     *  *  Code: R2407
     *  * <p>
     *  * 
     */
    @JsonProperty("R2407")
    @XmlEnumValue("R2407")
    Amtsgericht_Unna("R2407"),

    /**
     * <b>Grundbuchamt Unna</b>
     *  * <p>
     *  *  Code: R2407G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2407G")
    @XmlEnumValue("R2407G")
    Grundbuchamt_Unna("R2407G"),

    /**
     * <b>Amtsgericht L&#252;nen Zweigstelle Werne</b>
     *  * <p>
     *  *  Code: R2408
     *  * <p>
     *  * 
     */
    @JsonProperty("R2408")
    @XmlEnumValue("R2408")
    Amtsgericht_Luenen_Zweigstelle_Werne("R2408"),

    /**
     * <b>Landgericht Essen</b>
     *  * <p>
     *  *  Code: R2500
     *  * <p>
     *  * 
     */
    @JsonProperty("R2500")
    @XmlEnumValue("R2500")
    Landgericht_Essen("R2500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Essen</b>
     *  * <p>
     *  *  Code: R2500S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2500S")
    @XmlEnumValue("R2500S")
    Staatsanwaltschaft_beim_Landgericht_Essen("R2500S"),

    /**
     * <b>Amtsgericht Bottrop</b>
     *  * <p>
     *  *  Code: R2501
     *  * <p>
     *  * 
     */
    @JsonProperty("R2501")
    @XmlEnumValue("R2501")
    Amtsgericht_Bottrop("R2501"),

    /**
     * <b>Grundbuchamt Bottrop</b>
     *  * <p>
     *  *  Code: R2501G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2501G")
    @XmlEnumValue("R2501G")
    Grundbuchamt_Bottrop("R2501G"),

    /**
     * <b>Amtsgericht Dorsten</b>
     *  * <p>
     *  *  Code: R2502
     *  * <p>
     *  * 
     */
    @JsonProperty("R2502")
    @XmlEnumValue("R2502")
    Amtsgericht_Dorsten("R2502"),

    /**
     * <b>Grundbuchamt Dorsten</b>
     *  * <p>
     *  *  Code: R2502G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2502G")
    @XmlEnumValue("R2502G")
    Grundbuchamt_Dorsten("R2502G"),

    /**
     * <b>Amtsgericht Essen</b>
     *  * <p>
     *  *  Code: R2503
     *  * <p>
     *  * 
     */
    @JsonProperty("R2503")
    @XmlEnumValue("R2503")
    Amtsgericht_Essen("R2503"),

    /**
     * <b>Grundbuchamt Essen</b>
     *  * <p>
     *  *  Code: R2503G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2503G")
    @XmlEnumValue("R2503G")
    Grundbuchamt_Essen("R2503G"),

    /**
     * <b>Amtsgericht Essen-Borbeck</b>
     *  * <p>
     *  *  Code: R2504
     *  * <p>
     *  * 
     */
    @JsonProperty("R2504")
    @XmlEnumValue("R2504")
    Amtsgericht_Essen_Borbeck("R2504"),

    /**
     * <b>Grundbuchamt Essen-Borbeck</b>
     *  * <p>
     *  *  Code: R2504G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2504G")
    @XmlEnumValue("R2504G")
    Grundbuchamt_Essen_Borbeck("R2504G"),

    /**
     * <b>Amtsgericht Essen-Steele</b>
     *  * <p>
     *  *  Code: R2505
     *  * <p>
     *  * 
     */
    @JsonProperty("R2505")
    @XmlEnumValue("R2505")
    Amtsgericht_Essen_Steele("R2505"),

    /**
     * <b>Grundbuchamt Essen-Steele</b>
     *  * <p>
     *  *  Code: R2505G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2505G")
    @XmlEnumValue("R2505G")
    Grundbuchamt_Essen_Steele("R2505G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Essen-Werden</b>
     *  * <p>
     *  *  Code: R2506
     *  * <p>
     *  * 
     */
    @JsonProperty("R2506")
    @XmlEnumValue("R2506")
    aufgeloest_Amtsgericht_Essen_Werden("R2506"),

    /**
     * <b>Amtsgericht Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R2507
     *  * <p>
     *  * 
     */
    @JsonProperty("R2507")
    @XmlEnumValue("R2507")
    Amtsgericht_Gelsenkirchen("R2507"),

    /**
     * <b>Grundbuchamt Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R2507G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2507G")
    @XmlEnumValue("R2507G")
    Grundbuchamt_Gelsenkirchen("R2507G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gelsenkirchen-Buer</b>
     *  * <p>
     *  *  Code: R2508
     *  * <p>
     *  * 
     */
    @JsonProperty("R2508")
    @XmlEnumValue("R2508")
    aufgeloest_Amtsgericht_Gelsenkirchen_Buer("R2508"),

    /**
     * <b>aufgel&#246;st-Grundbuchamt Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R2508G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2508G")
    @XmlEnumValue("R2508G")
    aufgeloest_Grundbuchamt_Gelsenkirchen("R2508G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Gelsenkirchen, Zwst. der StA Essen</b>
     *  * <p>
     *  *  Code: R2508S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2508S")
    @XmlEnumValue("R2508S")
    Staatsanwaltschaft_beim_Landgericht_Gelsenkirchen_Zwst_der_StA_Essen("R2508S"),

    /**
     * <b>Amtsgericht Gladbeck</b>
     *  * <p>
     *  *  Code: R2509
     *  * <p>
     *  * 
     */
    @JsonProperty("R2509")
    @XmlEnumValue("R2509")
    Amtsgericht_Gladbeck("R2509"),

    /**
     * <b>Grundbuchamt Gladbeck</b>
     *  * <p>
     *  *  Code: R2509G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2509G")
    @XmlEnumValue("R2509G")
    Grundbuchamt_Gladbeck("R2509G"),

    /**
     * <b>Amtsgericht Hattingen</b>
     *  * <p>
     *  *  Code: R2510
     *  * <p>
     *  * 
     */
    @JsonProperty("R2510")
    @XmlEnumValue("R2510")
    Amtsgericht_Hattingen("R2510"),

    /**
     * <b>Grundbuchamt Hattingen</b>
     *  * <p>
     *  *  Code: R2510G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2510G")
    @XmlEnumValue("R2510G")
    Grundbuchamt_Hattingen("R2510G"),

    /**
     * <b>Amtsgericht Marl</b>
     *  * <p>
     *  *  Code: R2511
     *  * <p>
     *  * 
     */
    @JsonProperty("R2511")
    @XmlEnumValue("R2511")
    Amtsgericht_Marl("R2511"),

    /**
     * <b>Grundbuchamt Marl</b>
     *  * <p>
     *  *  Code: R2511G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2511G")
    @XmlEnumValue("R2511G")
    Grundbuchamt_Marl("R2511G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Haltern</b>
     *  * <p>
     *  *  Code: R2512
     *  * <p>
     *  * 
     */
    @JsonProperty("R2512")
    @XmlEnumValue("R2512")
    aufgeloest_Amtsgericht_Haltern("R2512"),

    /**
     * <b>Landgericht Hagen</b>
     *  * <p>
     *  *  Code: R2600
     *  * <p>
     *  * 
     */
    @JsonProperty("R2600")
    @XmlEnumValue("R2600")
    Landgericht_Hagen("R2600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hagen</b>
     *  * <p>
     *  *  Code: R2600S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2600S")
    @XmlEnumValue("R2600S")
    Staatsanwaltschaft_beim_Landgericht_Hagen("R2600S"),

    /**
     * <b>Amtsgericht Altena</b>
     *  * <p>
     *  *  Code: R2601
     *  * <p>
     *  * 
     */
    @JsonProperty("R2601")
    @XmlEnumValue("R2601")
    Amtsgericht_Altena("R2601"),

    /**
     * <b>Grundbuchamt Altena</b>
     *  * <p>
     *  *  Code: R2601G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2601G")
    @XmlEnumValue("R2601G")
    Grundbuchamt_Altena("R2601G"),

    /**
     * <b>Amtsgericht Hagen</b>
     *  * <p>
     *  *  Code: R2602
     *  * <p>
     *  * 
     */
    @JsonProperty("R2602")
    @XmlEnumValue("R2602")
    Amtsgericht_Hagen("R2602"),

    /**
     * <b>Grundbuchamt Hagen</b>
     *  * <p>
     *  *  Code: R2602G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2602G")
    @XmlEnumValue("R2602G")
    Grundbuchamt_Hagen("R2602G"),

    /**
     * <b>Amtsgericht Hagen -Zentrale Mahnabteilung-</b>
     *  * <p>
     *  *  Code: R2602M
     *  * <p>
     *  * 
     */
    @JsonProperty("R2602M")
    @XmlEnumValue("R2602M")
    Amtsgericht_Hagen_Zentrale_Mahnabteilung("R2602M"),

    /**
     * <b>Amtsgericht Hagen, Zentrales Vollstreckungsgericht Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: R2602R
     *  * <p>
     *  * 
     */
    @JsonProperty("R2602R")
    @XmlEnumValue("R2602R")
    Amtsgericht_Hagen_Zentrales_Vollstreckungsgericht_Nordrhein_Westfalen("R2602R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hohenlimburg</b>
     *  * <p>
     *  *  Code: R2603
     *  * <p>
     *  * 
     */
    @JsonProperty("R2603")
    @XmlEnumValue("R2603")
    aufgeloest_Amtsgericht_Hohenlimburg("R2603"),

    /**
     * <b>Amtsgericht Iserlohn</b>
     *  * <p>
     *  *  Code: R2604
     *  * <p>
     *  * 
     */
    @JsonProperty("R2604")
    @XmlEnumValue("R2604")
    Amtsgericht_Iserlohn("R2604"),

    /**
     * <b>Grundbuchamt Iserlohn</b>
     *  * <p>
     *  *  Code: R2604G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2604G")
    @XmlEnumValue("R2604G")
    Grundbuchamt_Iserlohn("R2604G"),

    /**
     * <b>Amtsgericht L&#252;denscheid</b>
     *  * <p>
     *  *  Code: R2605
     *  * <p>
     *  * 
     */
    @JsonProperty("R2605")
    @XmlEnumValue("R2605")
    Amtsgericht_Luedenscheid("R2605"),

    /**
     * <b>Grundbuchamt L&#252;denscheid</b>
     *  * <p>
     *  *  Code: R2605G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2605G")
    @XmlEnumValue("R2605G")
    Grundbuchamt_Luedenscheid("R2605G"),

    /**
     * <b>Amtsgericht Meinerzhagen</b>
     *  * <p>
     *  *  Code: R2606
     *  * <p>
     *  * 
     */
    @JsonProperty("R2606")
    @XmlEnumValue("R2606")
    Amtsgericht_Meinerzhagen("R2606"),

    /**
     * <b>Grundbuchamt Meinerzhagen</b>
     *  * <p>
     *  *  Code: R2606G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2606G")
    @XmlEnumValue("R2606G")
    Grundbuchamt_Meinerzhagen("R2606G"),

    /**
     * <b>Amtsgericht Plettenberg</b>
     *  * <p>
     *  *  Code: R2607
     *  * <p>
     *  * 
     */
    @JsonProperty("R2607")
    @XmlEnumValue("R2607")
    Amtsgericht_Plettenberg("R2607"),

    /**
     * <b>Grundbuchamt Plettenberg</b>
     *  * <p>
     *  *  Code: R2607G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2607G")
    @XmlEnumValue("R2607G")
    Grundbuchamt_Plettenberg("R2607G"),

    /**
     * <b>Amtsgericht Schwelm</b>
     *  * <p>
     *  *  Code: R2608
     *  * <p>
     *  * 
     */
    @JsonProperty("R2608")
    @XmlEnumValue("R2608")
    Amtsgericht_Schwelm("R2608"),

    /**
     * <b>Grundbuchamt Schwelm</b>
     *  * <p>
     *  *  Code: R2608G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2608G")
    @XmlEnumValue("R2608G")
    Grundbuchamt_Schwelm("R2608G"),

    /**
     * <b>Amtsgericht Schwerte</b>
     *  * <p>
     *  *  Code: R2609
     *  * <p>
     *  * 
     */
    @JsonProperty("R2609")
    @XmlEnumValue("R2609")
    Amtsgericht_Schwerte("R2609"),

    /**
     * <b>Grundbuchamt Schwerte</b>
     *  * <p>
     *  *  Code: R2609G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2609G")
    @XmlEnumValue("R2609G")
    Grundbuchamt_Schwerte("R2609G"),

    /**
     * <b>Amtsgericht Wetter</b>
     *  * <p>
     *  *  Code: R2610
     *  * <p>
     *  * 
     */
    @JsonProperty("R2610")
    @XmlEnumValue("R2610")
    Amtsgericht_Wetter("R2610"),

    /**
     * <b>Grundbuchamt Wetter-Ruhr</b>
     *  * <p>
     *  *  Code: R2610G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2610G")
    @XmlEnumValue("R2610G")
    Grundbuchamt_Wetter_Ruhr("R2610G"),

    /**
     * <b>Landgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R2700
     *  * <p>
     *  * 
     */
    @JsonProperty("R2700")
    @XmlEnumValue("R2700")
    Landgericht_Muenster("R2700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R2700S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2700S")
    @XmlEnumValue("R2700S")
    Staatsanwaltschaft_beim_Landgericht_Muenster("R2700S"),

    /**
     * <b>Amtsgericht Ahaus</b>
     *  * <p>
     *  *  Code: R2701
     *  * <p>
     *  * 
     */
    @JsonProperty("R2701")
    @XmlEnumValue("R2701")
    Amtsgericht_Ahaus("R2701"),

    /**
     * <b>Grundbuchamt Ahaus</b>
     *  * <p>
     *  *  Code: R2701G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2701G")
    @XmlEnumValue("R2701G")
    Grundbuchamt_Ahaus("R2701G"),

    /**
     * <b>Amtsgericht Ahlen</b>
     *  * <p>
     *  *  Code: R2702
     *  * <p>
     *  * 
     */
    @JsonProperty("R2702")
    @XmlEnumValue("R2702")
    Amtsgericht_Ahlen("R2702"),

    /**
     * <b>Grundbuchamt Ahlen</b>
     *  * <p>
     *  *  Code: R2702G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2702G")
    @XmlEnumValue("R2702G")
    Grundbuchamt_Ahlen("R2702G"),

    /**
     * <b>Amtsgericht Beckum</b>
     *  * <p>
     *  *  Code: R2703
     *  * <p>
     *  * 
     */
    @JsonProperty("R2703")
    @XmlEnumValue("R2703")
    Amtsgericht_Beckum("R2703"),

    /**
     * <b>Grundbuchamt Beckum</b>
     *  * <p>
     *  *  Code: R2703G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2703G")
    @XmlEnumValue("R2703G")
    Grundbuchamt_Beckum("R2703G"),

    /**
     * <b>Amtsgericht Bocholt</b>
     *  * <p>
     *  *  Code: R2704
     *  * <p>
     *  * 
     */
    @JsonProperty("R2704")
    @XmlEnumValue("R2704")
    Amtsgericht_Bocholt("R2704"),

    /**
     * <b>Grundbuchamt Bocholt</b>
     *  * <p>
     *  *  Code: R2704G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2704G")
    @XmlEnumValue("R2704G")
    Grundbuchamt_Bocholt("R2704G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bocholt, Zwst. der StA M&#252;nster</b>
     *  * <p>
     *  *  Code: R2704S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2704S")
    @XmlEnumValue("R2704S")
    Staatsanwaltschaft_beim_Landgericht_Bocholt_Zwst_der_StA_Muenster("R2704S"),

    /**
     * <b>Amtsgericht Borken</b>
     *  * <p>
     *  *  Code: R2705
     *  * <p>
     *  * 
     */
    @JsonProperty("R2705")
    @XmlEnumValue("R2705")
    Amtsgericht_Borken("R2705"),

    /**
     * <b>Grundbuchamt Borken</b>
     *  * <p>
     *  *  Code: R2705G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2705G")
    @XmlEnumValue("R2705G")
    Grundbuchamt_Borken("R2705G"),

    /**
     * <b>Amtsgericht Steinfurt</b>
     *  * <p>
     *  *  Code: R2706
     *  * <p>
     *  * 
     */
    @JsonProperty("R2706")
    @XmlEnumValue("R2706")
    Amtsgericht_Steinfurt("R2706"),

    /**
     * <b>Grundbuchamt Steinfurt</b>
     *  * <p>
     *  *  Code: R2706G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2706G")
    @XmlEnumValue("R2706G")
    Grundbuchamt_Steinfurt("R2706G"),

    /**
     * <b>Amtsgericht Coesfeld</b>
     *  * <p>
     *  *  Code: R2707
     *  * <p>
     *  * 
     */
    @JsonProperty("R2707")
    @XmlEnumValue("R2707")
    Amtsgericht_Coesfeld("R2707"),

    /**
     * <b>Grundbuchamt Coesfeld</b>
     *  * <p>
     *  *  Code: R2707G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2707G")
    @XmlEnumValue("R2707G")
    Grundbuchamt_Coesfeld("R2707G"),

    /**
     * <b>Amtsgericht D&#252;lmen</b>
     *  * <p>
     *  *  Code: R2708
     *  * <p>
     *  * 
     */
    @JsonProperty("R2708")
    @XmlEnumValue("R2708")
    Amtsgericht_Duelmen("R2708"),

    /**
     * <b>Grundbuchamt D&#252;lmen</b>
     *  * <p>
     *  *  Code: R2708G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2708G")
    @XmlEnumValue("R2708G")
    Grundbuchamt_Duelmen("R2708G"),

    /**
     * <b>Amtsgericht Gronau</b>
     *  * <p>
     *  *  Code: R2709
     *  * <p>
     *  * 
     */
    @JsonProperty("R2709")
    @XmlEnumValue("R2709")
    Amtsgericht_Gronau("R2709"),

    /**
     * <b>Grundbuchamt Gronau</b>
     *  * <p>
     *  *  Code: R2709G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2709G")
    @XmlEnumValue("R2709G")
    Grundbuchamt_Gronau("R2709G"),

    /**
     * <b>Amtsgericht Haltern</b>
     *  * <p>
     *  *  Code: R2710
     *  * <p>
     *  * 
     */
    @JsonProperty("R2710")
    @XmlEnumValue("R2710")
    Amtsgericht_Haltern("R2710"),

    /**
     * <b>Amtsgericht Ibbenb&#252;ren</b>
     *  * <p>
     *  *  Code: R2711
     *  * <p>
     *  * 
     */
    @JsonProperty("R2711")
    @XmlEnumValue("R2711")
    Amtsgericht_Ibbenbueren("R2711"),

    /**
     * <b>Grundbuchamt Ibbenb&#252;ren</b>
     *  * <p>
     *  *  Code: R2711G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2711G")
    @XmlEnumValue("R2711G")
    Grundbuchamt_Ibbenbueren("R2711G"),

    /**
     * <b>Amtsgericht L&#252;dinghausen</b>
     *  * <p>
     *  *  Code: R2712
     *  * <p>
     *  * 
     */
    @JsonProperty("R2712")
    @XmlEnumValue("R2712")
    Amtsgericht_Luedinghausen("R2712"),

    /**
     * <b>Grundbuchamt L&#252;dinghausen</b>
     *  * <p>
     *  *  Code: R2712G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2712G")
    @XmlEnumValue("R2712G")
    Grundbuchamt_Luedinghausen("R2712G"),

    /**
     * <b>Amtsgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R2713
     *  * <p>
     *  * 
     */
    @JsonProperty("R2713")
    @XmlEnumValue("R2713")
    Amtsgericht_Muenster("R2713"),

    /**
     * <b>Grundbuchamt M&#252;nster</b>
     *  * <p>
     *  *  Code: R2713G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2713G")
    @XmlEnumValue("R2713G")
    Grundbuchamt_Muenster("R2713G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Oelde</b>
     *  * <p>
     *  *  Code: R2714
     *  * <p>
     *  * 
     */
    @JsonProperty("R2714")
    @XmlEnumValue("R2714")
    aufgeloest_Amtsgericht_Oelde("R2714"),

    /**
     * <b>Amtsgericht Rheine</b>
     *  * <p>
     *  *  Code: R2715
     *  * <p>
     *  * 
     */
    @JsonProperty("R2715")
    @XmlEnumValue("R2715")
    Amtsgericht_Rheine("R2715"),

    /**
     * <b>Grundbuchamt Rheine</b>
     *  * <p>
     *  *  Code: R2715G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2715G")
    @XmlEnumValue("R2715G")
    Grundbuchamt_Rheine("R2715G"),

    /**
     * <b>Amtsgericht Tecklenburg</b>
     *  * <p>
     *  *  Code: R2716
     *  * <p>
     *  * 
     */
    @JsonProperty("R2716")
    @XmlEnumValue("R2716")
    Amtsgericht_Tecklenburg("R2716"),

    /**
     * <b>Grundbuchamt Tecklenburg</b>
     *  * <p>
     *  *  Code: R2716G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2716G")
    @XmlEnumValue("R2716G")
    Grundbuchamt_Tecklenburg("R2716G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Vreden</b>
     *  * <p>
     *  *  Code: R2717
     *  * <p>
     *  * 
     */
    @JsonProperty("R2717")
    @XmlEnumValue("R2717")
    aufgeloest_Amtsgericht_Vreden("R2717"),

    /**
     * <b>Amtsgericht Warendorf</b>
     *  * <p>
     *  *  Code: R2718
     *  * <p>
     *  * 
     */
    @JsonProperty("R2718")
    @XmlEnumValue("R2718")
    Amtsgericht_Warendorf("R2718"),

    /**
     * <b>Grundbuchamt Warendorf</b>
     *  * <p>
     *  *  Code: R2718G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2718G")
    @XmlEnumValue("R2718G")
    Grundbuchamt_Warendorf("R2718G"),

    /**
     * <b>Landgericht Paderborn</b>
     *  * <p>
     *  *  Code: R2800
     *  * <p>
     *  * 
     */
    @JsonProperty("R2800")
    @XmlEnumValue("R2800")
    Landgericht_Paderborn("R2800"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Paderborn</b>
     *  * <p>
     *  *  Code: R2800S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2800S")
    @XmlEnumValue("R2800S")
    Staatsanwaltschaft_beim_Landgericht_Paderborn("R2800S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Beverungen</b>
     *  * <p>
     *  *  Code: R2801
     *  * <p>
     *  * 
     */
    @JsonProperty("R2801")
    @XmlEnumValue("R2801")
    aufgeloest_Amtsgericht_Beverungen("R2801"),

    /**
     * <b>Amtsgericht Brakel</b>
     *  * <p>
     *  *  Code: R2802
     *  * <p>
     *  * 
     */
    @JsonProperty("R2802")
    @XmlEnumValue("R2802")
    Amtsgericht_Brakel("R2802"),

    /**
     * <b>Grundbuchamt Brakel</b>
     *  * <p>
     *  *  Code: R2802G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2802G")
    @XmlEnumValue("R2802G")
    Grundbuchamt_Brakel("R2802G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht B&#252;ren</b>
     *  * <p>
     *  *  Code: R2803
     *  * <p>
     *  * 
     */
    @JsonProperty("R2803")
    @XmlEnumValue("R2803")
    aufgeloest_Amtsgericht_Bueren("R2803"),

    /**
     * <b>Amtsgericht Delbr&#252;ck</b>
     *  * <p>
     *  *  Code: R2804
     *  * <p>
     *  * 
     */
    @JsonProperty("R2804")
    @XmlEnumValue("R2804")
    Amtsgericht_Delbrueck("R2804"),

    /**
     * <b>Grundbuchamt Delbr&#252;ck</b>
     *  * <p>
     *  *  Code: R2804G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2804G")
    @XmlEnumValue("R2804G")
    Grundbuchamt_Delbrueck("R2804G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Erwitte</b>
     *  * <p>
     *  *  Code: R2805
     *  * <p>
     *  * 
     */
    @JsonProperty("R2805")
    @XmlEnumValue("R2805")
    aufgeloest_Amtsgericht_Erwitte("R2805"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Geseke</b>
     *  * <p>
     *  *  Code: R2806
     *  * <p>
     *  * 
     */
    @JsonProperty("R2806")
    @XmlEnumValue("R2806")
    aufgeloest_Amtsgericht_Geseke("R2806"),

    /**
     * <b>Amtsgericht H&#246;xter</b>
     *  * <p>
     *  *  Code: R2807
     *  * <p>
     *  * 
     */
    @JsonProperty("R2807")
    @XmlEnumValue("R2807")
    Amtsgericht_Hoexter("R2807"),

    /**
     * <b>Grundbuchamt H&#246;xter</b>
     *  * <p>
     *  *  Code: R2807G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2807G")
    @XmlEnumValue("R2807G")
    Grundbuchamt_Hoexter("R2807G"),

    /**
     * <b>Amtsgericht Lippstadt</b>
     *  * <p>
     *  *  Code: R2808
     *  * <p>
     *  * 
     */
    @JsonProperty("R2808")
    @XmlEnumValue("R2808")
    Amtsgericht_Lippstadt("R2808"),

    /**
     * <b>Grundbuchamt Lippstadt</b>
     *  * <p>
     *  *  Code: R2808G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2808G")
    @XmlEnumValue("R2808G")
    Grundbuchamt_Lippstadt("R2808G"),

    /**
     * <b>Amtsgericht Paderborn</b>
     *  * <p>
     *  *  Code: R2809
     *  * <p>
     *  * 
     */
    @JsonProperty("R2809")
    @XmlEnumValue("R2809")
    Amtsgericht_Paderborn("R2809"),

    /**
     * <b>Grundbuchamt Paderborn</b>
     *  * <p>
     *  *  Code: R2809G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2809G")
    @XmlEnumValue("R2809G")
    Grundbuchamt_Paderborn("R2809G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht R&#252;then</b>
     *  * <p>
     *  *  Code: R2810
     *  * <p>
     *  * 
     */
    @JsonProperty("R2810")
    @XmlEnumValue("R2810")
    aufgeloest_Amtsgericht_Ruethen("R2810"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Salzkotten</b>
     *  * <p>
     *  *  Code: R2811
     *  * <p>
     *  * 
     */
    @JsonProperty("R2811")
    @XmlEnumValue("R2811")
    aufgeloest_Amtsgericht_Salzkotten("R2811"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Steinheim</b>
     *  * <p>
     *  *  Code: R2812
     *  * <p>
     *  * 
     */
    @JsonProperty("R2812")
    @XmlEnumValue("R2812")
    aufgeloest_Amtsgericht_Steinheim("R2812"),

    /**
     * <b>Amtsgericht Warburg</b>
     *  * <p>
     *  *  Code: R2813
     *  * <p>
     *  * 
     */
    @JsonProperty("R2813")
    @XmlEnumValue("R2813")
    Amtsgericht_Warburg("R2813"),

    /**
     * <b>Grundbuchamt Warburg</b>
     *  * <p>
     *  *  Code: R2813G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2813G")
    @XmlEnumValue("R2813G")
    Grundbuchamt_Warburg("R2813G"),

    /**
     * <b>Landgericht Siegen</b>
     *  * <p>
     *  *  Code: R2900
     *  * <p>
     *  * 
     */
    @JsonProperty("R2900")
    @XmlEnumValue("R2900")
    Landgericht_Siegen("R2900"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Siegen</b>
     *  * <p>
     *  *  Code: R2900S
     *  * <p>
     *  * 
     */
    @JsonProperty("R2900S")
    @XmlEnumValue("R2900S")
    Staatsanwaltschaft_beim_Landgericht_Siegen("R2900S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Olpe, Zwst. Attendorn</b>
     *  * <p>
     *  *  Code: R2901
     *  * <p>
     *  * 
     */
    @JsonProperty("R2901")
    @XmlEnumValue("R2901")
    aufgeloest_Amtsgericht_Olpe_Zwst_Attendorn("R2901"),

    /**
     * <b>Amtsgericht Bad Berleburg</b>
     *  * <p>
     *  *  Code: R2902
     *  * <p>
     *  * 
     */
    @JsonProperty("R2902")
    @XmlEnumValue("R2902")
    Amtsgericht_Bad_Berleburg("R2902"),

    /**
     * <b>Grundbuchamt Bad Berleburg</b>
     *  * <p>
     *  *  Code: R2902G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2902G")
    @XmlEnumValue("R2902G")
    Grundbuchamt_Bad_Berleburg("R2902G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Burbach</b>
     *  * <p>
     *  *  Code: R2903
     *  * <p>
     *  * 
     */
    @JsonProperty("R2903")
    @XmlEnumValue("R2903")
    aufgeloest_Amtsgericht_Burbach("R2903"),

    /**
     * <b>Amtsgericht Lennestadt</b>
     *  * <p>
     *  *  Code: R2904
     *  * <p>
     *  * 
     */
    @JsonProperty("R2904")
    @XmlEnumValue("R2904")
    Amtsgericht_Lennestadt("R2904"),

    /**
     * <b>Grundbuchamt Lennestadt</b>
     *  * <p>
     *  *  Code: R2904G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2904G")
    @XmlEnumValue("R2904G")
    Grundbuchamt_Lennestadt("R2904G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hilchenbach</b>
     *  * <p>
     *  *  Code: R2905
     *  * <p>
     *  * 
     */
    @JsonProperty("R2905")
    @XmlEnumValue("R2905")
    aufgeloest_Amtsgericht_Hilchenbach("R2905"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kirchhundem</b>
     *  * <p>
     *  *  Code: R2906
     *  * <p>
     *  * 
     */
    @JsonProperty("R2906")
    @XmlEnumValue("R2906")
    aufgeloest_Amtsgericht_Kirchhundem("R2906"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Laasphe</b>
     *  * <p>
     *  *  Code: R2907
     *  * <p>
     *  * 
     */
    @JsonProperty("R2907")
    @XmlEnumValue("R2907")
    aufgeloest_Amtsgericht_Laasphe("R2907"),

    /**
     * <b>Amtsgericht Olpe</b>
     *  * <p>
     *  *  Code: R2908
     *  * <p>
     *  * 
     */
    @JsonProperty("R2908")
    @XmlEnumValue("R2908")
    Amtsgericht_Olpe("R2908"),

    /**
     * <b>Grundbuchamt Olpe</b>
     *  * <p>
     *  *  Code: R2908G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2908G")
    @XmlEnumValue("R2908G")
    Grundbuchamt_Olpe("R2908G"),

    /**
     * <b>Amtsgericht Siegen</b>
     *  * <p>
     *  *  Code: R2909
     *  * <p>
     *  * 
     */
    @JsonProperty("R2909")
    @XmlEnumValue("R2909")
    Amtsgericht_Siegen("R2909"),

    /**
     * <b>Grundbuchamt Siegen</b>
     *  * <p>
     *  *  Code: R2909G
     *  * <p>
     *  * 
     */
    @JsonProperty("R2909G")
    @XmlEnumValue("R2909G")
    Grundbuchamt_Siegen("R2909G"),

    /**
     * <b>Oberlandesgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R3000
     *  * <p>
     *  * 
     */
    @JsonProperty("R3000")
    @XmlEnumValue("R3000")
    Oberlandesgericht_Koeln("R3000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R3000S
     *  * <p>
     *  * 
     */
    @JsonProperty("R3000S")
    @XmlEnumValue("R3000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Koeln("R3000S"),

    /**
     * <b>Landgericht Aachen</b>
     *  * <p>
     *  *  Code: R3100
     *  * <p>
     *  * 
     */
    @JsonProperty("R3100")
    @XmlEnumValue("R3100")
    Landgericht_Aachen("R3100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Aachen</b>
     *  * <p>
     *  *  Code: R3100S
     *  * <p>
     *  * 
     */
    @JsonProperty("R3100S")
    @XmlEnumValue("R3100S")
    Staatsanwaltschaft_beim_Landgericht_Aachen("R3100S"),

    /**
     * <b>Amtsgericht Aachen</b>
     *  * <p>
     *  *  Code: R3101
     *  * <p>
     *  * 
     */
    @JsonProperty("R3101")
    @XmlEnumValue("R3101")
    Amtsgericht_Aachen("R3101"),

    /**
     * <b>Grundbuchamt Aachen</b>
     *  * <p>
     *  *  Code: R3101G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3101G")
    @XmlEnumValue("R3101G")
    Grundbuchamt_Aachen("R3101G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Blankenheim</b>
     *  * <p>
     *  *  Code: R3102
     *  * <p>
     *  * 
     */
    @JsonProperty("R3102")
    @XmlEnumValue("R3102")
    aufgeloest_Amtsgericht_Blankenheim("R3102"),

    /**
     * <b>Amtsgericht D&#252;ren</b>
     *  * <p>
     *  *  Code: R3103
     *  * <p>
     *  * 
     */
    @JsonProperty("R3103")
    @XmlEnumValue("R3103")
    Amtsgericht_Dueren("R3103"),

    /**
     * <b>Grundbuchamt D&#252;ren</b>
     *  * <p>
     *  *  Code: R3103G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3103G")
    @XmlEnumValue("R3103G")
    Grundbuchamt_Dueren("R3103G"),

    /**
     * <b>Amtsgericht Eschweiler</b>
     *  * <p>
     *  *  Code: R3104
     *  * <p>
     *  * 
     */
    @JsonProperty("R3104")
    @XmlEnumValue("R3104")
    Amtsgericht_Eschweiler("R3104"),

    /**
     * <b>Grundbuchamt Eschweiler</b>
     *  * <p>
     *  *  Code: R3104G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3104G")
    @XmlEnumValue("R3104G")
    Grundbuchamt_Eschweiler("R3104G"),

    /**
     * <b>Amtsgericht Geilenkirchen</b>
     *  * <p>
     *  *  Code: R3105
     *  * <p>
     *  * 
     */
    @JsonProperty("R3105")
    @XmlEnumValue("R3105")
    Amtsgericht_Geilenkirchen("R3105"),

    /**
     * <b>Grundbuchamt Geilenkirchen</b>
     *  * <p>
     *  *  Code: R3105G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3105G")
    @XmlEnumValue("R3105G")
    Grundbuchamt_Geilenkirchen("R3105G"),

    /**
     * <b>Amtsgericht Schleiden</b>
     *  * <p>
     *  *  Code: R3106
     *  * <p>
     *  * 
     */
    @JsonProperty("R3106")
    @XmlEnumValue("R3106")
    Amtsgericht_Schleiden("R3106"),

    /**
     * <b>Grundbuchamt Schleiden</b>
     *  * <p>
     *  *  Code: R3106G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3106G")
    @XmlEnumValue("R3106G")
    Grundbuchamt_Schleiden("R3106G"),

    /**
     * <b>Amtsgericht Heinsberg</b>
     *  * <p>
     *  *  Code: R3107
     *  * <p>
     *  * 
     */
    @JsonProperty("R3107")
    @XmlEnumValue("R3107")
    Amtsgericht_Heinsberg("R3107"),

    /**
     * <b>Grundbuchamt Heinsberg</b>
     *  * <p>
     *  *  Code: R3107G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3107G")
    @XmlEnumValue("R3107G")
    Grundbuchamt_Heinsberg("R3107G"),

    /**
     * <b>Amtsgericht J&#252;lich</b>
     *  * <p>
     *  *  Code: R3108
     *  * <p>
     *  * 
     */
    @JsonProperty("R3108")
    @XmlEnumValue("R3108")
    Amtsgericht_Juelich("R3108"),

    /**
     * <b>Grundbuchamt J&#252;lich</b>
     *  * <p>
     *  *  Code: R3108G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3108G")
    @XmlEnumValue("R3108G")
    Grundbuchamt_Juelich("R3108G"),

    /**
     * <b>Amtsgericht Monschau</b>
     *  * <p>
     *  *  Code: R3109
     *  * <p>
     *  * 
     */
    @JsonProperty("R3109")
    @XmlEnumValue("R3109")
    Amtsgericht_Monschau("R3109"),

    /**
     * <b>Grundbuchamt Monschau</b>
     *  * <p>
     *  *  Code: R3109G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3109G")
    @XmlEnumValue("R3109G")
    Grundbuchamt_Monschau("R3109G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stolberg</b>
     *  * <p>
     *  *  Code: R3110
     *  * <p>
     *  * 
     */
    @JsonProperty("R3110")
    @XmlEnumValue("R3110")
    aufgeloest_Amtsgericht_Stolberg("R3110"),

    /**
     * <b>Landgericht Bonn</b>
     *  * <p>
     *  *  Code: R3200
     *  * <p>
     *  * 
     */
    @JsonProperty("R3200")
    @XmlEnumValue("R3200")
    Landgericht_Bonn("R3200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bonn</b>
     *  * <p>
     *  *  Code: R3200S
     *  * <p>
     *  * 
     */
    @JsonProperty("R3200S")
    @XmlEnumValue("R3200S")
    Staatsanwaltschaft_beim_Landgericht_Bonn("R3200S"),

    /**
     * <b>Amtsgericht Bonn</b>
     *  * <p>
     *  *  Code: R3201
     *  * <p>
     *  * 
     */
    @JsonProperty("R3201")
    @XmlEnumValue("R3201")
    Amtsgericht_Bonn("R3201"),

    /**
     * <b>Grundbuchamt Bonn</b>
     *  * <p>
     *  *  Code: R3201G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3201G")
    @XmlEnumValue("R3201G")
    Grundbuchamt_Bonn("R3201G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eitorf</b>
     *  * <p>
     *  *  Code: R3202
     *  * <p>
     *  * 
     */
    @JsonProperty("R3202")
    @XmlEnumValue("R3202")
    aufgeloest_Amtsgericht_Eitorf("R3202"),

    /**
     * <b>Amtsgericht Euskirchen</b>
     *  * <p>
     *  *  Code: R3203
     *  * <p>
     *  * 
     */
    @JsonProperty("R3203")
    @XmlEnumValue("R3203")
    Amtsgericht_Euskirchen("R3203"),

    /**
     * <b>Grundbuchamt Euskirchen</b>
     *  * <p>
     *  *  Code: R3203G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3203G")
    @XmlEnumValue("R3203G")
    Grundbuchamt_Euskirchen("R3203G"),

    /**
     * <b>Amtsgericht Euskirchen -Zentrale Mahnabteilung-</b>
     *  * <p>
     *  *  Code: R3203M
     *  * <p>
     *  * 
     */
    @JsonProperty("R3203M")
    @XmlEnumValue("R3203M")
    Amtsgericht_Euskirchen_Zentrale_Mahnabteilung("R3203M"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Siegburg, Zwst. Hennef</b>
     *  * <p>
     *  *  Code: R3204
     *  * <p>
     *  * 
     */
    @JsonProperty("R3204")
    @XmlEnumValue("R3204")
    aufgeloest_Amtsgericht_Siegburg_Zwst_Hennef("R3204"),

    /**
     * <b>Amtsgericht K&#246;nigswinter</b>
     *  * <p>
     *  *  Code: R3205
     *  * <p>
     *  * 
     */
    @JsonProperty("R3205")
    @XmlEnumValue("R3205")
    Amtsgericht_Koenigswinter("R3205"),

    /**
     * <b>Grundbuchamt K&#246;nigswinter</b>
     *  * <p>
     *  *  Code: R3205G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3205G")
    @XmlEnumValue("R3205G")
    Grundbuchamt_Koenigswinter("R3205G"),

    /**
     * <b>Amtsgericht Rheinbach</b>
     *  * <p>
     *  *  Code: R3207
     *  * <p>
     *  * 
     */
    @JsonProperty("R3207")
    @XmlEnumValue("R3207")
    Amtsgericht_Rheinbach("R3207"),

    /**
     * <b>Grundbuchamt Rheinbach</b>
     *  * <p>
     *  *  Code: R3207G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3207G")
    @XmlEnumValue("R3207G")
    Grundbuchamt_Rheinbach("R3207G"),

    /**
     * <b>Amtsgericht Siegburg</b>
     *  * <p>
     *  *  Code: R3208
     *  * <p>
     *  * 
     */
    @JsonProperty("R3208")
    @XmlEnumValue("R3208")
    Amtsgericht_Siegburg("R3208"),

    /**
     * <b>Grundbuchamt Siegburg</b>
     *  * <p>
     *  *  Code: R3208G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3208G")
    @XmlEnumValue("R3208G")
    Grundbuchamt_Siegburg("R3208G"),

    /**
     * <b>Amtsgericht Waldbr&#246;l</b>
     *  * <p>
     *  *  Code: R3209
     *  * <p>
     *  * 
     */
    @JsonProperty("R3209")
    @XmlEnumValue("R3209")
    Amtsgericht_Waldbroel("R3209"),

    /**
     * <b>Grundbuchamt Waldbr&#246;l</b>
     *  * <p>
     *  *  Code: R3209G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3209G")
    @XmlEnumValue("R3209G")
    Grundbuchamt_Waldbroel("R3209G"),

    /**
     * <b>aufgel&#246;st-Landgericht Bonn</b>
     *  * <p>
     *  *  Code: R3299
     *  * <p>
     *  * 
     */
    @JsonProperty("R3299")
    @XmlEnumValue("R3299")
    aufgeloest_Landgericht_Bonn("R3299"),

    /**
     * <b>Landgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R3300
     *  * <p>
     *  * 
     */
    @JsonProperty("R3300")
    @XmlEnumValue("R3300")
    Landgericht_Koeln("R3300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R3300S
     *  * <p>
     *  * 
     */
    @JsonProperty("R3300S")
    @XmlEnumValue("R3300S")
    Staatsanwaltschaft_beim_Landgericht_Koeln("R3300S"),

    /**
     * <b>Amtsgericht Bergisch Gladbach</b>
     *  * <p>
     *  *  Code: R3301
     *  * <p>
     *  * 
     */
    @JsonProperty("R3301")
    @XmlEnumValue("R3301")
    Amtsgericht_Bergisch_Gladbach("R3301"),

    /**
     * <b>Grundbuchamt Bergisch Gladbach</b>
     *  * <p>
     *  *  Code: R3301G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3301G")
    @XmlEnumValue("R3301G")
    Grundbuchamt_Bergisch_Gladbach("R3301G"),

    /**
     * <b>Amtsgericht Bergheim</b>
     *  * <p>
     *  *  Code: R3302
     *  * <p>
     *  * 
     */
    @JsonProperty("R3302")
    @XmlEnumValue("R3302")
    Amtsgericht_Bergheim("R3302"),

    /**
     * <b>Grundbuchamt Bergheim</b>
     *  * <p>
     *  *  Code: R3302G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3302G")
    @XmlEnumValue("R3302G")
    Grundbuchamt_Bergheim("R3302G"),

    /**
     * <b>Amtsgericht Br&#252;hl</b>
     *  * <p>
     *  *  Code: R3303
     *  * <p>
     *  * 
     */
    @JsonProperty("R3303")
    @XmlEnumValue("R3303")
    Amtsgericht_Bruehl("R3303"),

    /**
     * <b>Grundbuchamt Br&#252;hl</b>
     *  * <p>
     *  *  Code: R3303G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3303G")
    @XmlEnumValue("R3303G")
    Grundbuchamt_Bruehl("R3303G"),

    /**
     * <b>Amtsgericht Gummersbach</b>
     *  * <p>
     *  *  Code: R3304
     *  * <p>
     *  * 
     */
    @JsonProperty("R3304")
    @XmlEnumValue("R3304")
    Amtsgericht_Gummersbach("R3304"),

    /**
     * <b>Grundbuchamt Gummersbach</b>
     *  * <p>
     *  *  Code: R3304G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3304G")
    @XmlEnumValue("R3304G")
    Grundbuchamt_Gummersbach("R3304G"),

    /**
     * <b>Amtsgericht Kerpen</b>
     *  * <p>
     *  *  Code: R3305
     *  * <p>
     *  * 
     */
    @JsonProperty("R3305")
    @XmlEnumValue("R3305")
    Amtsgericht_Kerpen("R3305"),

    /**
     * <b>Grundbuchamt Kerpen</b>
     *  * <p>
     *  *  Code: R3305G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3305G")
    @XmlEnumValue("R3305G")
    Grundbuchamt_Kerpen("R3305G"),

    /**
     * <b>Amtsgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R3306
     *  * <p>
     *  * 
     */
    @JsonProperty("R3306")
    @XmlEnumValue("R3306")
    Amtsgericht_Koeln("R3306"),

    /**
     * <b>Grundbuchamt K&#246;ln</b>
     *  * <p>
     *  *  Code: R3306G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3306G")
    @XmlEnumValue("R3306G")
    Grundbuchamt_Koeln("R3306G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lindlar</b>
     *  * <p>
     *  *  Code: R3307
     *  * <p>
     *  * 
     */
    @JsonProperty("R3307")
    @XmlEnumValue("R3307")
    aufgeloest_Amtsgericht_Lindlar("R3307"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wiehl</b>
     *  * <p>
     *  *  Code: R3308
     *  * <p>
     *  * 
     */
    @JsonProperty("R3308")
    @XmlEnumValue("R3308")
    aufgeloest_Amtsgericht_Wiehl("R3308"),

    /**
     * <b>Amtsgericht Wipperf&#252;rth</b>
     *  * <p>
     *  *  Code: R3309
     *  * <p>
     *  * 
     */
    @JsonProperty("R3309")
    @XmlEnumValue("R3309")
    Amtsgericht_Wipperfuerth("R3309"),

    /**
     * <b>Grundbuchamt Wipperf&#252;rth</b>
     *  * <p>
     *  *  Code: R3309G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3309G")
    @XmlEnumValue("R3309G")
    Grundbuchamt_Wipperfuerth("R3309G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Br&#252;hl, Zwst. Lechenich in Erftstadt</b>
     *  * <p>
     *  *  Code: R3310
     *  * <p>
     *  * 
     */
    @JsonProperty("R3310")
    @XmlEnumValue("R3310")
    aufgeloest_Amtsgericht_Bruehl_Zwst_Lechenich_in_Erftstadt("R3310"),

    /**
     * <b>Amtsgericht Leverkusen</b>
     *  * <p>
     *  *  Code: R3311
     *  * <p>
     *  * 
     */
    @JsonProperty("R3311")
    @XmlEnumValue("R3311")
    Amtsgericht_Leverkusen("R3311"),

    /**
     * <b>Grundbuchamt Leverkusen</b>
     *  * <p>
     *  *  Code: R3311G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3311G")
    @XmlEnumValue("R3311G")
    Grundbuchamt_Leverkusen("R3311G"),

    /**
     * <b>Amtsgericht Wermelskirchen</b>
     *  * <p>
     *  *  Code: R3312
     *  * <p>
     *  * 
     */
    @JsonProperty("R3312")
    @XmlEnumValue("R3312")
    Amtsgericht_Wermelskirchen("R3312"),

    /**
     * <b>Grundbuchamt Wermelskirchen</b>
     *  * <p>
     *  *  Code: R3312G
     *  * <p>
     *  * 
     */
    @JsonProperty("R3312G")
    @XmlEnumValue("R3312G")
    Grundbuchamt_Wermelskirchen("R3312G"),

    /**
     * <b>Justizvollzugsanstalt Siegburg</b>
     *  * <p>
     *  *  Code: R6109
     *  * <p>
     *  * 
     */
    @JsonProperty("R6109")
    @XmlEnumValue("R6109")
    Justizvollzugsanstalt_Siegburg("R6109"),

    /**
     * <b>Sozialgericht Dortmund</b>
     *  * <p>
     *  *  Code: R6205
     *  * <p>
     *  * 
     */
    @JsonProperty("R6205")
    @XmlEnumValue("R6205")
    Sozialgericht_Dortmund("R6205"),

    /**
     * <b>Finanzgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R6254
     *  * <p>
     *  * 
     */
    @JsonProperty("R6254")
    @XmlEnumValue("R6254")
    Finanzgericht_Duesseldorf("R6254"),

    /**
     * <b>Arbeitsgericht Aachen</b>
     *  * <p>
     *  *  Code: R6293
     *  * <p>
     *  * 
     */
    @JsonProperty("R6293")
    @XmlEnumValue("R6293")
    Arbeitsgericht_Aachen("R6293"),

    /**
     * <b>Sozialgericht Aachen</b>
     *  * <p>
     *  *  Code: R6294
     *  * <p>
     *  * 
     */
    @JsonProperty("R6294")
    @XmlEnumValue("R6294")
    Sozialgericht_Aachen("R6294"),

    /**
     * <b>Verwaltungsgericht Aachen</b>
     *  * <p>
     *  *  Code: R6295
     *  * <p>
     *  * 
     */
    @JsonProperty("R6295")
    @XmlEnumValue("R6295")
    Verwaltungsgericht_Aachen("R6295"),

    /**
     * <b>Arbeitsgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R6296
     *  * <p>
     *  * 
     */
    @JsonProperty("R6296")
    @XmlEnumValue("R6296")
    Arbeitsgericht_Arnsberg("R6296"),

    /**
     * <b>Arbeitsgericht Bocholt</b>
     *  * <p>
     *  *  Code: R6297
     *  * <p>
     *  * 
     */
    @JsonProperty("R6297")
    @XmlEnumValue("R6297")
    Arbeitsgericht_Bocholt("R6297"),

    /**
     * <b>Sozialgericht Detmold</b>
     *  * <p>
     *  *  Code: R6298
     *  * <p>
     *  * 
     */
    @JsonProperty("R6298")
    @XmlEnumValue("R6298")
    Sozialgericht_Detmold("R6298"),

    /**
     * <b>Arbeitsgericht Detmold</b>
     *  * <p>
     *  *  Code: R6299
     *  * <p>
     *  * 
     */
    @JsonProperty("R6299")
    @XmlEnumValue("R6299")
    Arbeitsgericht_Detmold("R6299"),

    /**
     * <b>Landesarbeitsgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R6300
     *  * <p>
     *  * 
     */
    @JsonProperty("R6300")
    @XmlEnumValue("R6300")
    Landesarbeitsgericht_Duesseldorf("R6300"),

    /**
     * <b>Verwaltungsgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R6301
     *  * <p>
     *  * 
     */
    @JsonProperty("R6301")
    @XmlEnumValue("R6301")
    Verwaltungsgericht_Duesseldorf("R6301"),

    /**
     * <b>Arbeitsgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R6302
     *  * <p>
     *  * 
     */
    @JsonProperty("R6302")
    @XmlEnumValue("R6302")
    Arbeitsgericht_Duesseldorf("R6302"),

    /**
     * <b>Arbeitsgericht Duisburg</b>
     *  * <p>
     *  *  Code: R6303
     *  * <p>
     *  * 
     */
    @JsonProperty("R6303")
    @XmlEnumValue("R6303")
    Arbeitsgericht_Duisburg("R6303"),

    /**
     * <b>Sozialgericht Duisburg</b>
     *  * <p>
     *  *  Code: R6304
     *  * <p>
     *  * 
     */
    @JsonProperty("R6304")
    @XmlEnumValue("R6304")
    Sozialgericht_Duisburg("R6304"),

    /**
     * <b>Arbeitsgericht Essen</b>
     *  * <p>
     *  *  Code: R6305
     *  * <p>
     *  * 
     */
    @JsonProperty("R6305")
    @XmlEnumValue("R6305")
    Arbeitsgericht_Essen("R6305"),

    /**
     * <b>Landessozialgericht f&#252;r das Land Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: R6306
     *  * <p>
     *  * 
     */
    @JsonProperty("R6306")
    @XmlEnumValue("R6306")
    Landessozialgericht_fuer_das_Land_Nordrhein_Westfalen("R6306"),

    /**
     * <b>Arbeitsgericht Herford</b>
     *  * <p>
     *  *  Code: R6307
     *  * <p>
     *  * 
     */
    @JsonProperty("R6307")
    @XmlEnumValue("R6307")
    Arbeitsgericht_Herford("R6307"),

    /**
     * <b>Arbeitsgericht Iserlohn</b>
     *  * <p>
     *  *  Code: R6308
     *  * <p>
     *  * 
     */
    @JsonProperty("R6308")
    @XmlEnumValue("R6308")
    Arbeitsgericht_Iserlohn("R6308"),

    /**
     * <b>Verwaltungsgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R6309
     *  * <p>
     *  * 
     */
    @JsonProperty("R6309")
    @XmlEnumValue("R6309")
    Verwaltungsgericht_Koeln("R6309"),

    /**
     * <b>Sozialgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R6310
     *  * <p>
     *  * 
     */
    @JsonProperty("R6310")
    @XmlEnumValue("R6310")
    Sozialgericht_Koeln("R6310"),

    /**
     * <b>Finanzgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R6311
     *  * <p>
     *  * 
     */
    @JsonProperty("R6311")
    @XmlEnumValue("R6311")
    Finanzgericht_Koeln("R6311"),

    /**
     * <b>Arbeitsgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R6312
     *  * <p>
     *  * 
     */
    @JsonProperty("R6312")
    @XmlEnumValue("R6312")
    Arbeitsgericht_Koeln("R6312"),

    /**
     * <b>Landesarbeitsgericht K&#246;ln</b>
     *  * <p>
     *  *  Code: R6313
     *  * <p>
     *  * 
     */
    @JsonProperty("R6313")
    @XmlEnumValue("R6313")
    Landesarbeitsgericht_Koeln("R6313"),

    /**
     * <b>Verwaltungsgericht Minden</b>
     *  * <p>
     *  *  Code: R6314
     *  * <p>
     *  * 
     */
    @JsonProperty("R6314")
    @XmlEnumValue("R6314")
    Verwaltungsgericht_Minden("R6314"),

    /**
     * <b>Arbeitsgericht Minden</b>
     *  * <p>
     *  *  Code: R6315
     *  * <p>
     *  * 
     */
    @JsonProperty("R6315")
    @XmlEnumValue("R6315")
    Arbeitsgericht_Minden("R6315"),

    /**
     * <b>Arbeitsgericht M&#246;nchengladbach</b>
     *  * <p>
     *  *  Code: R6316
     *  * <p>
     *  * 
     */
    @JsonProperty("R6316")
    @XmlEnumValue("R6316")
    Arbeitsgericht_Moenchengladbach("R6316"),

    /**
     * <b>Arbeitsgericht Bonn</b>
     *  * <p>
     *  *  Code: R6317
     *  * <p>
     *  * 
     */
    @JsonProperty("R6317")
    @XmlEnumValue("R6317")
    Arbeitsgericht_Bonn("R6317"),

    /**
     * <b>Finanzgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R6318
     *  * <p>
     *  * 
     */
    @JsonProperty("R6318")
    @XmlEnumValue("R6318")
    Finanzgericht_Muenster("R6318"),

    /**
     * <b>Verwaltungsgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R6319
     *  * <p>
     *  * 
     */
    @JsonProperty("R6319")
    @XmlEnumValue("R6319")
    Verwaltungsgericht_Muenster("R6319"),

    /**
     * <b>Arbeitsgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R6320
     *  * <p>
     *  * 
     */
    @JsonProperty("R6320")
    @XmlEnumValue("R6320")
    Arbeitsgericht_Muenster("R6320"),

    /**
     * <b>Oberverwaltungsgericht f&#252;r das Land Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: R6321
     *  * <p>
     *  * 
     */
    @JsonProperty("R6321")
    @XmlEnumValue("R6321")
    Oberverwaltungsgericht_fuer_das_Land_Nordrhein_Westfalen("R6321"),

    /**
     * <b>Verfassungsgerichtshof f&#252;r das Land Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: R6322
     *  * <p>
     *  * 
     */
    @JsonProperty("R6322")
    @XmlEnumValue("R6322")
    Verfassungsgerichtshof_fuer_das_Land_Nordrhein_Westfalen("R6322"),

    /**
     * <b>Sozialgericht M&#252;nster</b>
     *  * <p>
     *  *  Code: R6323
     *  * <p>
     *  * 
     */
    @JsonProperty("R6323")
    @XmlEnumValue("R6323")
    Sozialgericht_Muenster("R6323"),

    /**
     * <b>Arbeitsgericht Oberhausen</b>
     *  * <p>
     *  *  Code: R6324
     *  * <p>
     *  * 
     */
    @JsonProperty("R6324")
    @XmlEnumValue("R6324")
    Arbeitsgericht_Oberhausen("R6324"),

    /**
     * <b>Arbeitsgericht Siegburg</b>
     *  * <p>
     *  *  Code: R6325
     *  * <p>
     *  * 
     */
    @JsonProperty("R6325")
    @XmlEnumValue("R6325")
    Arbeitsgericht_Siegburg("R6325"),

    /**
     * <b>Arbeitsgericht Siegen</b>
     *  * <p>
     *  *  Code: R6326
     *  * <p>
     *  * 
     */
    @JsonProperty("R6326")
    @XmlEnumValue("R6326")
    Arbeitsgericht_Siegen("R6326"),

    /**
     * <b>Arbeitsgericht Solingen</b>
     *  * <p>
     *  *  Code: R6327
     *  * <p>
     *  * 
     */
    @JsonProperty("R6327")
    @XmlEnumValue("R6327")
    Arbeitsgericht_Solingen("R6327"),

    /**
     * <b>Arbeitsgericht Wesel</b>
     *  * <p>
     *  *  Code: R6328
     *  * <p>
     *  * 
     */
    @JsonProperty("R6328")
    @XmlEnumValue("R6328")
    Arbeitsgericht_Wesel("R6328"),

    /**
     * <b>Arbeitsgericht Wuppertal</b>
     *  * <p>
     *  *  Code: R6329
     *  * <p>
     *  * 
     */
    @JsonProperty("R6329")
    @XmlEnumValue("R6329")
    Arbeitsgericht_Wuppertal("R6329"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R6568
     *  * <p>
     *  * 
     */
    @JsonProperty("R6568")
    @XmlEnumValue("R6568")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Duesseldorf("R6568"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Hamm</b>
     *  * <p>
     *  *  Code: R6578
     *  * <p>
     *  * 
     */
    @JsonProperty("R6578")
    @XmlEnumValue("R6578")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Hamm("R6578"),

    /**
     * <b>Justizvollzugsanstalt M&#252;nster</b>
     *  * <p>
     *  *  Code: R6636
     *  * <p>
     *  * 
     */
    @JsonProperty("R6636")
    @XmlEnumValue("R6636")
    Justizvollzugsanstalt_Muenster("R6636"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer K&#246;ln</b>
     *  * <p>
     *  *  Code: R6657
     *  * <p>
     *  * 
     */
    @JsonProperty("R6657")
    @XmlEnumValue("R6657")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Koeln("R6657"),

    /**
     * <b>Anwaltsgerichtshof des Landes Nordrhein-Westfalen</b>
     *  * <p>
     *  *  Code: R6675
     *  * <p>
     *  * 
     */
    @JsonProperty("R6675")
    @XmlEnumValue("R6675")
    Anwaltsgerichtshof_des_Landes_Nordrhein_Westfalen("R6675"),

    /**
     * <b>Arbeitsgericht Bielefeld</b>
     *  * <p>
     *  *  Code: R6725
     *  * <p>
     *  * 
     */
    @JsonProperty("R6725")
    @XmlEnumValue("R6725")
    Arbeitsgericht_Bielefeld("R6725"),

    /**
     * <b>Arbeitsgericht Bochum</b>
     *  * <p>
     *  *  Code: R6726
     *  * <p>
     *  * 
     */
    @JsonProperty("R6726")
    @XmlEnumValue("R6726")
    Arbeitsgericht_Bochum("R6726"),

    /**
     * <b>Arbeitsgericht Dortmund</b>
     *  * <p>
     *  *  Code: R6727
     *  * <p>
     *  * 
     */
    @JsonProperty("R6727")
    @XmlEnumValue("R6727")
    Arbeitsgericht_Dortmund("R6727"),

    /**
     * <b>Arbeitsgericht Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R6728
     *  * <p>
     *  * 
     */
    @JsonProperty("R6728")
    @XmlEnumValue("R6728")
    Arbeitsgericht_Gelsenkirchen("R6728"),

    /**
     * <b>Arbeitsgericht Hagen</b>
     *  * <p>
     *  *  Code: R6729
     *  * <p>
     *  * 
     */
    @JsonProperty("R6729")
    @XmlEnumValue("R6729")
    Arbeitsgericht_Hagen("R6729"),

    /**
     * <b>Arbeitsgericht Hamm</b>
     *  * <p>
     *  *  Code: R6730
     *  * <p>
     *  * 
     */
    @JsonProperty("R6730")
    @XmlEnumValue("R6730")
    Arbeitsgericht_Hamm("R6730"),

    /**
     * <b>Arbeitsgericht Herne</b>
     *  * <p>
     *  *  Code: R6731
     *  * <p>
     *  * 
     */
    @JsonProperty("R6731")
    @XmlEnumValue("R6731")
    Arbeitsgericht_Herne("R6731"),

    /**
     * <b>Arbeitsgericht Krefeld</b>
     *  * <p>
     *  *  Code: R6732
     *  * <p>
     *  * 
     */
    @JsonProperty("R6732")
    @XmlEnumValue("R6732")
    Arbeitsgericht_Krefeld("R6732"),

    /**
     * <b>Arbeitsgericht Paderborn</b>
     *  * <p>
     *  *  Code: R6733
     *  * <p>
     *  * 
     */
    @JsonProperty("R6733")
    @XmlEnumValue("R6733")
    Arbeitsgericht_Paderborn("R6733"),

    /**
     * <b>Arbeitsgericht Rheine</b>
     *  * <p>
     *  *  Code: R6734
     *  * <p>
     *  * 
     */
    @JsonProperty("R6734")
    @XmlEnumValue("R6734")
    Arbeitsgericht_Rheine("R6734"),

    /**
     * <b>Landesarbeitsgericht Hamm</b>
     *  * <p>
     *  *  Code: R6757
     *  * <p>
     *  * 
     */
    @JsonProperty("R6757")
    @XmlEnumValue("R6757")
    Landesarbeitsgericht_Hamm("R6757"),

    /**
     * <b>Justizvollzugsanstalt Attendorn</b>
     *  * <p>
     *  *  Code: R6767
     *  * <p>
     *  * 
     */
    @JsonProperty("R6767")
    @XmlEnumValue("R6767")
    Justizvollzugsanstalt_Attendorn("R6767"),

    /**
     * <b>Justizvollzugskrankenhaus NRW</b>
     *  * <p>
     *  *  Code: R6781
     *  * <p>
     *  * 
     */
    @JsonProperty("R6781")
    @XmlEnumValue("R6781")
    Justizvollzugskrankenhaus_NRW("R6781"),

    /**
     * <b>aufgel&#246;st-Sozialgericht Dortmund</b>
     *  * <p>
     *  *  Code: R6802
     *  * <p>
     *  * 
     */
    @JsonProperty("R6802")
    @XmlEnumValue("R6802")
    aufgeloest_Sozialgericht_Dortmund("R6802"),

    /**
     * <b>Sozialgericht D&#252;sseldorf Der Pr&#228;sident o.V.i.A. pers.</b>
     *  * <p>
     *  *  Code: R6803
     *  * <p>
     *  * 
     */
    @JsonProperty("R6803")
    @XmlEnumValue("R6803")
    Sozialgericht_Duesseldorf_Der_Praesident_o_V_i_A_pers("R6803"),

    /**
     * <b>Sozialgericht Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R6804
     *  * <p>
     *  * 
     */
    @JsonProperty("R6804")
    @XmlEnumValue("R6804")
    Sozialgericht_Gelsenkirchen("R6804"),

    /**
     * <b>Verwaltungsgericht Arnsberg</b>
     *  * <p>
     *  *  Code: R6835
     *  * <p>
     *  * 
     */
    @JsonProperty("R6835")
    @XmlEnumValue("R6835")
    Verwaltungsgericht_Arnsberg("R6835"),

    /**
     * <b>Verwaltungsgericht Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R6836
     *  * <p>
     *  * 
     */
    @JsonProperty("R6836")
    @XmlEnumValue("R6836")
    Verwaltungsgericht_Gelsenkirchen("R6836"),

    /**
     * <b>Justizvollzugsanstalt Willich II</b>
     *  * <p>
     *  *  Code: R6913
     *  * <p>
     *  * 
     */
    @JsonProperty("R6913")
    @XmlEnumValue("R6913")
    Justizvollzugsanstalt_Willich_II("R6913"),

    /**
     * <b>Justizvollzugsanstalt Bielefeld-Senne</b>
     *  * <p>
     *  *  Code: R7093
     *  * <p>
     *  * 
     */
    @JsonProperty("R7093")
    @XmlEnumValue("R7093")
    Justizvollzugsanstalt_Bielefeld_Senne("R7093"),

    /**
     * <b>Justizvollzugsanstalt Bochum-Langendreer</b>
     *  * <p>
     *  *  Code: R7156
     *  * <p>
     *  * 
     */
    @JsonProperty("R7156")
    @XmlEnumValue("R7156")
    Justizvollzugsanstalt_Bochum_Langendreer("R7156"),

    /**
     * <b>Jugendarrestanstalt Remscheid</b>
     *  * <p>
     *  *  Code: R7725
     *  * <p>
     *  * 
     */
    @JsonProperty("R7725")
    @XmlEnumValue("R7725")
    Jugendarrestanstalt_Remscheid("R7725"),

    /**
     * <b>Jugendarrestanstalt Bottrop</b>
     *  * <p>
     *  *  Code: R7728
     *  * <p>
     *  * 
     */
    @JsonProperty("R7728")
    @XmlEnumValue("R7728")
    Jugendarrestanstalt_Bottrop("R7728"),

    /**
     * <b>Justizvollzugsanstalt Bielefeld-Brackwede</b>
     *  * <p>
     *  *  Code: R7738
     *  * <p>
     *  * 
     */
    @JsonProperty("R7738")
    @XmlEnumValue("R7738")
    Justizvollzugsanstalt_Bielefeld_Brackwede("R7738"),

    /**
     * <b>Justizvollzugsanstalt Hamm</b>
     *  * <p>
     *  *  Code: R7763
     *  * <p>
     *  * 
     */
    @JsonProperty("R7763")
    @XmlEnumValue("R7763")
    Justizvollzugsanstalt_Hamm("R7763"),

    /**
     * <b>Jugendarrestanstalt Wetter</b>
     *  * <p>
     *  *  Code: R7787
     *  * <p>
     *  * 
     */
    @JsonProperty("R7787")
    @XmlEnumValue("R7787")
    Jugendarrestanstalt_Wetter("R7787"),

    /**
     * <b>Justizvollzugsanstalt Duisburg-Hamborn</b>
     *  * <p>
     *  *  Code: R8080
     *  * <p>
     *  * 
     */
    @JsonProperty("R8080")
    @XmlEnumValue("R8080")
    Justizvollzugsanstalt_Duisburg_Hamborn("R8080"),

    /**
     * <b>Justizvollzugsanstalt K&#246;ln</b>
     *  * <p>
     *  *  Code: R8088
     *  * <p>
     *  * 
     */
    @JsonProperty("R8088")
    @XmlEnumValue("R8088")
    Justizvollzugsanstalt_Koeln("R8088"),

    /**
     * <b>Justizvollzugsanstalt Rheinbach</b>
     *  * <p>
     *  *  Code: R8367
     *  * <p>
     *  * 
     */
    @JsonProperty("R8367")
    @XmlEnumValue("R8367")
    Justizvollzugsanstalt_Rheinbach("R8367"),

    /**
     * <b>Justizvollzugsanstalt Euskirchen</b>
     *  * <p>
     *  *  Code: R8371
     *  * <p>
     *  * 
     */
    @JsonProperty("R8371")
    @XmlEnumValue("R8371")
    Justizvollzugsanstalt_Euskirchen("R8371"),

    /**
     * <b>Sozialtherapeutische Anstalt Bochum</b>
     *  * <p>
     *  *  Code: R8998
     *  * <p>
     *  * 
     */
    @JsonProperty("R8998")
    @XmlEnumValue("R8998")
    Sozialtherapeutische_Anstalt_Bochum("R8998"),

    /**
     * <b>Justizvollzugsanstalt D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R9071
     *  * <p>
     *  * 
     */
    @JsonProperty("R9071")
    @XmlEnumValue("R9071")
    Justizvollzugsanstalt_Duesseldorf("R9071"),

    /**
     * <b>Justizvollzugsanstalt Moers-Kapellen</b>
     *  * <p>
     *  *  Code: R9090
     *  * <p>
     *  * 
     */
    @JsonProperty("R9090")
    @XmlEnumValue("R9090")
    Justizvollzugsanstalt_Moers_Kapellen("R9090"),

    /**
     * <b>Justizvollzugsanstalt Aachen</b>
     *  * <p>
     *  *  Code: R9099
     *  * <p>
     *  * 
     */
    @JsonProperty("R9099")
    @XmlEnumValue("R9099")
    Justizvollzugsanstalt_Aachen("R9099"),

    /**
     * <b>Justizvollzugsanstalt Werl</b>
     *  * <p>
     *  *  Code: R9162
     *  * <p>
     *  * 
     */
    @JsonProperty("R9162")
    @XmlEnumValue("R9162")
    Justizvollzugsanstalt_Werl("R9162"),

    /**
     * <b>Justizvollzugsanstalt Hagen</b>
     *  * <p>
     *  *  Code: R9165
     *  * <p>
     *  * 
     */
    @JsonProperty("R9165")
    @XmlEnumValue("R9165")
    Justizvollzugsanstalt_Hagen("R9165"),

    /**
     * <b>Justizvollzugsanstalt Bochum</b>
     *  * <p>
     *  *  Code: R9167
     *  * <p>
     *  * 
     */
    @JsonProperty("R9167")
    @XmlEnumValue("R9167")
    Justizvollzugsanstalt_Bochum("R9167"),

    /**
     * <b>Justizvollzugsanstalt Castrop-Rauxel</b>
     *  * <p>
     *  *  Code: R9169
     *  * <p>
     *  * 
     */
    @JsonProperty("R9169")
    @XmlEnumValue("R9169")
    Justizvollzugsanstalt_Castrop_Rauxel("R9169"),

    /**
     * <b>Justizvollzugsanstalt Detmold</b>
     *  * <p>
     *  *  Code: R9170
     *  * <p>
     *  * 
     */
    @JsonProperty("R9170")
    @XmlEnumValue("R9170")
    Justizvollzugsanstalt_Detmold("R9170"),

    /**
     * <b>Justizvollzugsanstalt Dortmund</b>
     *  * <p>
     *  *  Code: R9171
     *  * <p>
     *  * 
     */
    @JsonProperty("R9171")
    @XmlEnumValue("R9171")
    Justizvollzugsanstalt_Dortmund("R9171"),

    /**
     * <b>Justizvollzugsanstalt Essen</b>
     *  * <p>
     *  *  Code: R9172
     *  * <p>
     *  * 
     */
    @JsonProperty("R9172")
    @XmlEnumValue("R9172")
    Justizvollzugsanstalt_Essen("R9172"),

    /**
     * <b>Justizvollzugsanstalt Geldern</b>
     *  * <p>
     *  *  Code: R9173
     *  * <p>
     *  * 
     */
    @JsonProperty("R9173")
    @XmlEnumValue("R9173")
    Justizvollzugsanstalt_Geldern("R9173"),

    /**
     * <b>Justizvollzugsanstalt Gelsenkirchen</b>
     *  * <p>
     *  *  Code: R9174
     *  * <p>
     *  * 
     */
    @JsonProperty("R9174")
    @XmlEnumValue("R9174")
    Justizvollzugsanstalt_Gelsenkirchen("R9174"),

    /**
     * <b>Justizvollzugsanstalt Heinsberg</b>
     *  * <p>
     *  *  Code: R9175
     *  * <p>
     *  * 
     */
    @JsonProperty("R9175")
    @XmlEnumValue("R9175")
    Justizvollzugsanstalt_Heinsberg("R9175"),

    /**
     * <b>Justizvollzugsanstalt Herford</b>
     *  * <p>
     *  *  Code: R9176
     *  * <p>
     *  * 
     */
    @JsonProperty("R9176")
    @XmlEnumValue("R9176")
    Justizvollzugsanstalt_Herford("R9176"),

    /**
     * <b>Justizvollzugsanstalt H&#246;velhof</b>
     *  * <p>
     *  *  Code: R9177
     *  * <p>
     *  * 
     */
    @JsonProperty("R9177")
    @XmlEnumValue("R9177")
    Justizvollzugsanstalt_Hoevelhof("R9177"),

    /**
     * <b>Justizvollzugsanstalt Iserlohn</b>
     *  * <p>
     *  *  Code: R9178
     *  * <p>
     *  * 
     */
    @JsonProperty("R9178")
    @XmlEnumValue("R9178")
    Justizvollzugsanstalt_Iserlohn("R9178"),

    /**
     * <b>Justizvollzugsanstalt Kleve</b>
     *  * <p>
     *  *  Code: R9179
     *  * <p>
     *  * 
     */
    @JsonProperty("R9179")
    @XmlEnumValue("R9179")
    Justizvollzugsanstalt_Kleve("R9179"),

    /**
     * <b>Justizvollzugsanstalt Remscheid</b>
     *  * <p>
     *  *  Code: R9180
     *  * <p>
     *  * 
     */
    @JsonProperty("R9180")
    @XmlEnumValue("R9180")
    Justizvollzugsanstalt_Remscheid("R9180"),

    /**
     * <b>Justizvollzugsanstalt Schwerte</b>
     *  * <p>
     *  *  Code: R9181
     *  * <p>
     *  * 
     */
    @JsonProperty("R9181")
    @XmlEnumValue("R9181")
    Justizvollzugsanstalt_Schwerte("R9181"),

    /**
     * <b>Justizvollzugsanstalt Wuppertal-Vohwinkel</b>
     *  * <p>
     *  *  Code: R9182
     *  * <p>
     *  * 
     */
    @JsonProperty("R9182")
    @XmlEnumValue("R9182")
    Justizvollzugsanstalt_Wuppertal_Vohwinkel("R9182"),

    /**
     * <b>Justizvollzugsanstalt Willich I</b>
     *  * <p>
     *  *  Code: R9288
     *  * <p>
     *  * 
     */
    @JsonProperty("R9288")
    @XmlEnumValue("R9288")
    Justizvollzugsanstalt_Willich_I("R9288"),

    /**
     * <b>Justizvollzugsanstalt Wuppertal-Ronsdorf</b>
     *  * <p>
     *  *  Code: R9483
     *  * <p>
     *  * 
     */
    @JsonProperty("R9483")
    @XmlEnumValue("R9483")
    Justizvollzugsanstalt_Wuppertal_Ronsdorf("R9483"),

    /**
     * <b>Jugendarrestanstalt D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R9565
     *  * <p>
     *  * 
     */
    @JsonProperty("R9565")
    @XmlEnumValue("R9565")
    Jugendarrestanstalt_Duesseldorf("R9565"),

    /**
     * <b>Test-Amtsgericht D&#252;sseldorf</b>
     *  * <p>
     *  *  Code: R9999
     *  * <p>
     *  * 
     */
    @JsonProperty("R9999")
    @XmlEnumValue("R9999")
    Test_Amtsgericht_Duesseldorf("R9999"),

    /**
     * <b>Oberlandesgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2000
     *  * <p>
     *  * 
     */
    @JsonProperty("T2000")
    @XmlEnumValue("T2000")
    Oberlandesgericht_Koblenz("T2000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2000S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2000S")
    @XmlEnumValue("T2000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Koblenz("T2000S"),

    /**
     * <b>Landgericht Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T2100
     *  * <p>
     *  * 
     */
    @JsonProperty("T2100")
    @XmlEnumValue("T2100")
    Landgericht_Bad_Kreuznach("T2100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T2100S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2100S")
    @XmlEnumValue("T2100S")
    Staatsanwaltschaft_beim_Landgericht_Bad_Kreuznach("T2100S"),

    /**
     * <b>Amtsgericht Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T2101
     *  * <p>
     *  * 
     */
    @JsonProperty("T2101")
    @XmlEnumValue("T2101")
    Amtsgericht_Bad_Kreuznach("T2101"),

    /**
     * <b>Grundbuchamt Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T2101G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2101G")
    @XmlEnumValue("T2101G")
    Grundbuchamt_Bad_Kreuznach("T2101G"),

    /**
     * <b>Amtsgericht Bad Kreuznach, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2101I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2101I")
    @XmlEnumValue("T2101I")
    Amtsgericht_Bad_Kreuznach_Insolvenzgericht("T2101I"),

    /**
     * <b>Registergericht Amtsgericht Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T2101V
     *  * <p>
     *  * 
     */
    @JsonProperty("T2101V")
    @XmlEnumValue("T2101V")
    Registergericht_Amtsgericht_Bad_Kreuznach("T2101V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Birkenfeld</b>
     *  * <p>
     *  *  Code: T2102
     *  * <p>
     *  * 
     */
    @JsonProperty("T2102")
    @XmlEnumValue("T2102")
    aufgeloest_Amtsgericht_Birkenfeld("T2102"),

    /**
     * <b>Amtsgericht Idar-Oberstein</b>
     *  * <p>
     *  *  Code: T2103
     *  * <p>
     *  * 
     */
    @JsonProperty("T2103")
    @XmlEnumValue("T2103")
    Amtsgericht_Idar_Oberstein("T2103"),

    /**
     * <b>Grundbuchamt Idar-Oberstein</b>
     *  * <p>
     *  *  Code: T2103G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2103G")
    @XmlEnumValue("T2103G")
    Grundbuchamt_Idar_Oberstein("T2103G"),

    /**
     * <b>Amtsgericht Idar-Oberstein, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2103I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2103I")
    @XmlEnumValue("T2103I")
    Amtsgericht_Idar_Oberstein_Insolvenzgericht("T2103I"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kirn</b>
     *  * <p>
     *  *  Code: T2104
     *  * <p>
     *  * 
     */
    @JsonProperty("T2104")
    @XmlEnumValue("T2104")
    aufgeloest_Amtsgericht_Kirn("T2104"),

    /**
     * <b>Amtsgericht Simmern</b>
     *  * <p>
     *  *  Code: T2105
     *  * <p>
     *  * 
     */
    @JsonProperty("T2105")
    @XmlEnumValue("T2105")
    Amtsgericht_Simmern("T2105"),

    /**
     * <b>Grundbuchamt Simmern/Hunsr&#252;ck</b>
     *  * <p>
     *  *  Code: T2105G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2105G")
    @XmlEnumValue("T2105G")
    Grundbuchamt_Simmern_Hunsrueck("T2105G"),

    /**
     * <b>Amtsgericht Bad Sobernheim</b>
     *  * <p>
     *  *  Code: T2106
     *  * <p>
     *  * 
     */
    @JsonProperty("T2106")
    @XmlEnumValue("T2106")
    Amtsgericht_Bad_Sobernheim("T2106"),

    /**
     * <b>Grundbuchamt Bad Sobernheim</b>
     *  * <p>
     *  *  Code: T2106G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2106G")
    @XmlEnumValue("T2106G")
    Grundbuchamt_Bad_Sobernheim("T2106G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Baumholder</b>
     *  * <p>
     *  *  Code: T2107
     *  * <p>
     *  * 
     */
    @JsonProperty("T2107")
    @XmlEnumValue("T2107")
    aufgeloest_Amtsgericht_Baumholder("T2107"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kirchberg</b>
     *  * <p>
     *  *  Code: T2108
     *  * <p>
     *  * 
     */
    @JsonProperty("T2108")
    @XmlEnumValue("T2108")
    aufgeloest_Amtsgericht_Kirchberg("T2108"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Meisenheim</b>
     *  * <p>
     *  *  Code: T2109
     *  * <p>
     *  * 
     */
    @JsonProperty("T2109")
    @XmlEnumValue("T2109")
    aufgeloest_Amtsgericht_Meisenheim("T2109"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stromberg</b>
     *  * <p>
     *  *  Code: T2110
     *  * <p>
     *  * 
     */
    @JsonProperty("T2110")
    @XmlEnumValue("T2110")
    aufgeloest_Amtsgericht_Stromberg("T2110"),

    /**
     * <b>Landgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2200
     *  * <p>
     *  * 
     */
    @JsonProperty("T2200")
    @XmlEnumValue("T2200")
    Landgericht_Koblenz("T2200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2200S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2200S")
    @XmlEnumValue("T2200S")
    Staatsanwaltschaft_beim_Landgericht_Koblenz("T2200S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Neuenahr-Ahrweiler, Zwst. Adenau</b>
     *  * <p>
     *  *  Code: T2201
     *  * <p>
     *  * 
     */
    @JsonProperty("T2201")
    @XmlEnumValue("T2201")
    aufgeloest_Amtsgericht_Bad_Neuenahr_Ahrweiler_Zwst_Adenau("T2201"),

    /**
     * <b>Amtsgericht Altenkirchen</b>
     *  * <p>
     *  *  Code: T2202
     *  * <p>
     *  * 
     */
    @JsonProperty("T2202")
    @XmlEnumValue("T2202")
    Amtsgericht_Altenkirchen("T2202"),

    /**
     * <b>Grundbuchamt Altenkirchen (Westerwald)</b>
     *  * <p>
     *  *  Code: T2202G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2202G")
    @XmlEnumValue("T2202G")
    Grundbuchamt_Altenkirchen_Westerwald("T2202G"),

    /**
     * <b>Amtsgericht Andernach</b>
     *  * <p>
     *  *  Code: T2203
     *  * <p>
     *  * 
     */
    @JsonProperty("T2203")
    @XmlEnumValue("T2203")
    Amtsgericht_Andernach("T2203"),

    /**
     * <b>Grundbuchamt Andernach</b>
     *  * <p>
     *  *  Code: T2203G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2203G")
    @XmlEnumValue("T2203G")
    Grundbuchamt_Andernach("T2203G"),

    /**
     * <b>Amtsgericht Bad Neuenahr-Ahrweiler</b>
     *  * <p>
     *  *  Code: T2204
     *  * <p>
     *  * 
     */
    @JsonProperty("T2204")
    @XmlEnumValue("T2204")
    Amtsgericht_Bad_Neuenahr_Ahrweiler("T2204"),

    /**
     * <b>Grundbuchamt Bad Neuenahr-Ahrweiler</b>
     *  * <p>
     *  *  Code: T2204G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2204G")
    @XmlEnumValue("T2204G")
    Grundbuchamt_Bad_Neuenahr_Ahrweiler("T2204G"),

    /**
     * <b>Amtsgericht Bad Neuenahr-Ahrweiler, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2204I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2204I")
    @XmlEnumValue("T2204I")
    Amtsgericht_Bad_Neuenahr_Ahrweiler_Insolvenzgericht("T2204I"),

    /**
     * <b>Amtsgericht Betzdorf</b>
     *  * <p>
     *  *  Code: T2205
     *  * <p>
     *  * 
     */
    @JsonProperty("T2205")
    @XmlEnumValue("T2205")
    Amtsgericht_Betzdorf("T2205"),

    /**
     * <b>Grundbuchamt Betzdorf</b>
     *  * <p>
     *  *  Code: T2205G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2205G")
    @XmlEnumValue("T2205G")
    Grundbuchamt_Betzdorf("T2205G"),

    /**
     * <b>Amtsgericht Betzdorf, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2205I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2205I")
    @XmlEnumValue("T2205I")
    Amtsgericht_Betzdorf_Insolvenzgericht("T2205I"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Boppard</b>
     *  * <p>
     *  *  Code: T2206
     *  * <p>
     *  * 
     */
    @JsonProperty("T2206")
    @XmlEnumValue("T2206")
    aufgeloest_Amtsgericht_Boppard("T2206"),

    /**
     * <b>Amtsgericht Cochem</b>
     *  * <p>
     *  *  Code: T2207
     *  * <p>
     *  * 
     */
    @JsonProperty("T2207")
    @XmlEnumValue("T2207")
    Amtsgericht_Cochem("T2207"),

    /**
     * <b>Grundbuchamt Cochem</b>
     *  * <p>
     *  *  Code: T2207G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2207G")
    @XmlEnumValue("T2207G")
    Grundbuchamt_Cochem("T2207G"),

    /**
     * <b>Amtsgericht Cochem, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2207I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2207I")
    @XmlEnumValue("T2207I")
    Amtsgericht_Cochem_Insolvenzgericht("T2207I"),

    /**
     * <b>Amtsgericht Diez</b>
     *  * <p>
     *  *  Code: T2208
     *  * <p>
     *  * 
     */
    @JsonProperty("T2208")
    @XmlEnumValue("T2208")
    Amtsgericht_Diez("T2208"),

    /**
     * <b>Grundbuchamt Diez</b>
     *  * <p>
     *  *  Code: T2208G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2208G")
    @XmlEnumValue("T2208G")
    Grundbuchamt_Diez("T2208G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hachenburg</b>
     *  * <p>
     *  *  Code: T2209
     *  * <p>
     *  * 
     */
    @JsonProperty("T2209")
    @XmlEnumValue("T2209")
    aufgeloest_Amtsgericht_Hachenburg("T2209"),

    /**
     * <b>Amtsgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2210
     *  * <p>
     *  * 
     */
    @JsonProperty("T2210")
    @XmlEnumValue("T2210")
    Amtsgericht_Koblenz("T2210"),

    /**
     * <b>Grundbuchamt Koblenz</b>
     *  * <p>
     *  *  Code: T2210G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2210G")
    @XmlEnumValue("T2210G")
    Grundbuchamt_Koblenz("T2210G"),

    /**
     * <b>Amtsgericht Koblenz, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2210I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2210I")
    @XmlEnumValue("T2210I")
    Amtsgericht_Koblenz_Insolvenzgericht("T2210I"),

    /**
     * <b>Registergericht Amtsgericht Koblenz</b>
     *  * <p>
     *  *  Code: T2210V
     *  * <p>
     *  * 
     */
    @JsonProperty("T2210V")
    @XmlEnumValue("T2210V")
    Registergericht_Amtsgericht_Koblenz("T2210V"),

    /**
     * <b>Amtsgericht Lahnstein</b>
     *  * <p>
     *  *  Code: T2211
     *  * <p>
     *  * 
     */
    @JsonProperty("T2211")
    @XmlEnumValue("T2211")
    Amtsgericht_Lahnstein("T2211"),

    /**
     * <b>Grundbuchamt Lahnstein</b>
     *  * <p>
     *  *  Code: T2211G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2211G")
    @XmlEnumValue("T2211G")
    Grundbuchamt_Lahnstein("T2211G"),

    /**
     * <b>Amtsgericht Linz am Rhein</b>
     *  * <p>
     *  *  Code: T2212
     *  * <p>
     *  * 
     */
    @JsonProperty("T2212")
    @XmlEnumValue("T2212")
    Amtsgericht_Linz_am_Rhein("T2212"),

    /**
     * <b>Grundbuchamt Linz am Rhein</b>
     *  * <p>
     *  *  Code: T2212G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2212G")
    @XmlEnumValue("T2212G")
    Grundbuchamt_Linz_am_Rhein("T2212G"),

    /**
     * <b>Amtsgericht Mayen</b>
     *  * <p>
     *  *  Code: T2213
     *  * <p>
     *  * 
     */
    @JsonProperty("T2213")
    @XmlEnumValue("T2213")
    Amtsgericht_Mayen("T2213"),

    /**
     * <b>Grundbuchamt Mayen</b>
     *  * <p>
     *  *  Code: T2213G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2213G")
    @XmlEnumValue("T2213G")
    Grundbuchamt_Mayen("T2213G"),

    /**
     * <b>Amtsgericht Mayen, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2213I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2213I")
    @XmlEnumValue("T2213I")
    Amtsgericht_Mayen_Insolvenzgericht("T2213I"),

    /**
     * <b>Amtsgericht Mayen, Gemeinsames Mahngericht der L&#228;nder Rheinland-Pfalz und Saarland</b>
     *  * <p>
     *  *  Code: T2213M
     *  * <p>
     *  * 
     */
    @JsonProperty("T2213M")
    @XmlEnumValue("T2213M")
    Amtsgericht_Mayen_Gemeinsames_Mahngericht_der_Laender_Rheinland_Pfalz_und_Saarland("T2213M"),

    /**
     * <b>Amtsgericht Montabaur</b>
     *  * <p>
     *  *  Code: T2214
     *  * <p>
     *  * 
     */
    @JsonProperty("T2214")
    @XmlEnumValue("T2214")
    Amtsgericht_Montabaur("T2214"),

    /**
     * <b>Grundbuchamt Montabaur</b>
     *  * <p>
     *  *  Code: T2214G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2214G")
    @XmlEnumValue("T2214G")
    Grundbuchamt_Montabaur("T2214G"),

    /**
     * <b>Amtsgericht Montabaur, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2214I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2214I")
    @XmlEnumValue("T2214I")
    Amtsgericht_Montabaur_Insolvenzgericht("T2214I"),

    /**
     * <b>Registergericht Amtsgericht Montabaur</b>
     *  * <p>
     *  *  Code: T2214V
     *  * <p>
     *  * 
     */
    @JsonProperty("T2214V")
    @XmlEnumValue("T2214V")
    Registergericht_Amtsgericht_Montabaur("T2214V"),

    /**
     * <b>Amtsgericht Neuwied</b>
     *  * <p>
     *  *  Code: T2215
     *  * <p>
     *  * 
     */
    @JsonProperty("T2215")
    @XmlEnumValue("T2215")
    Amtsgericht_Neuwied("T2215"),

    /**
     * <b>Grundbuchamt Neuwied</b>
     *  * <p>
     *  *  Code: T2215G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2215G")
    @XmlEnumValue("T2215G")
    Grundbuchamt_Neuwied("T2215G"),

    /**
     * <b>Amtsgericht Neuwied, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2215I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2215I")
    @XmlEnumValue("T2215I")
    Amtsgericht_Neuwied_Insolvenzgericht("T2215I"),

    /**
     * <b>Amtsgericht St. Goar</b>
     *  * <p>
     *  *  Code: T2216
     *  * <p>
     *  * 
     */
    @JsonProperty("T2216")
    @XmlEnumValue("T2216")
    Amtsgericht_St_Goar("T2216"),

    /**
     * <b>Grundbuchamt Sankt Goar</b>
     *  * <p>
     *  *  Code: T2216G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2216G")
    @XmlEnumValue("T2216G")
    Grundbuchamt_Sankt_Goar("T2216G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht St. Goarshausen</b>
     *  * <p>
     *  *  Code: T2217
     *  * <p>
     *  * 
     */
    @JsonProperty("T2217")
    @XmlEnumValue("T2217")
    aufgeloest_Amtsgericht_St_Goarshausen("T2217"),

    /**
     * <b>Amtsgericht Sinzig</b>
     *  * <p>
     *  *  Code: T2218
     *  * <p>
     *  * 
     */
    @JsonProperty("T2218")
    @XmlEnumValue("T2218")
    Amtsgericht_Sinzig("T2218"),

    /**
     * <b>Grundbuchamt Sinzig</b>
     *  * <p>
     *  *  Code: T2218G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2218G")
    @XmlEnumValue("T2218G")
    Grundbuchamt_Sinzig("T2218G"),

    /**
     * <b>Amtsgericht Westerburg</b>
     *  * <p>
     *  *  Code: T2219
     *  * <p>
     *  * 
     */
    @JsonProperty("T2219")
    @XmlEnumValue("T2219")
    Amtsgericht_Westerburg("T2219"),

    /**
     * <b>Grundbuchamt Westerburg</b>
     *  * <p>
     *  *  Code: T2219G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2219G")
    @XmlEnumValue("T2219G")
    Grundbuchamt_Westerburg("T2219G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Asbach</b>
     *  * <p>
     *  *  Code: T2220
     *  * <p>
     *  * 
     */
    @JsonProperty("T2220")
    @XmlEnumValue("T2220")
    aufgeloest_Amtsgericht_Asbach("T2220"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Ems</b>
     *  * <p>
     *  *  Code: T2221
     *  * <p>
     *  * 
     */
    @JsonProperty("T2221")
    @XmlEnumValue("T2221")
    aufgeloest_Amtsgericht_Bad_Ems("T2221"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Daaden</b>
     *  * <p>
     *  *  Code: T2222
     *  * <p>
     *  * 
     */
    @JsonProperty("T2222")
    @XmlEnumValue("T2222")
    aufgeloest_Amtsgericht_Daaden("T2222"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dierdorf</b>
     *  * <p>
     *  *  Code: T2223
     *  * <p>
     *  * 
     */
    @JsonProperty("T2223")
    @XmlEnumValue("T2223")
    aufgeloest_Amtsgericht_Dierdorf("T2223"),

    /**
     * <b>aufgel&#246;st-Amtsgericht H&#246;hr-Grenzhausen</b>
     *  * <p>
     *  *  Code: T2224
     *  * <p>
     *  * 
     */
    @JsonProperty("T2224")
    @XmlEnumValue("T2224")
    aufgeloest_Amtsgericht_Hoehr_Grenzhausen("T2224"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kastellaun</b>
     *  * <p>
     *  *  Code: T2225
     *  * <p>
     *  * 
     */
    @JsonProperty("T2225")
    @XmlEnumValue("T2225")
    aufgeloest_Amtsgericht_Kastellaun("T2225"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kirchen</b>
     *  * <p>
     *  *  Code: T2226
     *  * <p>
     *  * 
     */
    @JsonProperty("T2226")
    @XmlEnumValue("T2226")
    aufgeloest_Amtsgericht_Kirchen("T2226"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Marienberg</b>
     *  * <p>
     *  *  Code: T2227
     *  * <p>
     *  * 
     */
    @JsonProperty("T2227")
    @XmlEnumValue("T2227")
    aufgeloest_Amtsgericht_Marienberg("T2227"),

    /**
     * <b>aufgel&#246;st-Amtsgericht M&#252;nstermaifeld</b>
     *  * <p>
     *  *  Code: T2228
     *  * <p>
     *  * 
     */
    @JsonProperty("T2228")
    @XmlEnumValue("T2228")
    aufgeloest_Amtsgericht_Muenstermaifeld("T2228"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Nassau</b>
     *  * <p>
     *  *  Code: T2229
     *  * <p>
     *  * 
     */
    @JsonProperty("T2229")
    @XmlEnumValue("T2229")
    aufgeloest_Amtsgericht_Nassau("T2229"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Nast&#228;tten</b>
     *  * <p>
     *  *  Code: T2230
     *  * <p>
     *  * 
     */
    @JsonProperty("T2230")
    @XmlEnumValue("T2230")
    aufgeloest_Amtsgericht_Nastaetten("T2230"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rennerod</b>
     *  * <p>
     *  *  Code: T2231
     *  * <p>
     *  * 
     */
    @JsonProperty("T2231")
    @XmlEnumValue("T2231")
    aufgeloest_Amtsgericht_Rennerod("T2231"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Selters</b>
     *  * <p>
     *  *  Code: T2232
     *  * <p>
     *  * 
     */
    @JsonProperty("T2232")
    @XmlEnumValue("T2232")
    aufgeloest_Amtsgericht_Selters("T2232"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Traben-Trarbach</b>
     *  * <p>
     *  *  Code: T2233
     *  * <p>
     *  * 
     */
    @JsonProperty("T2233")
    @XmlEnumValue("T2233")
    aufgeloest_Amtsgericht_Traben_Trarbach("T2233"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wallmerod</b>
     *  * <p>
     *  *  Code: T2234
     *  * <p>
     *  * 
     */
    @JsonProperty("T2234")
    @XmlEnumValue("T2234")
    aufgeloest_Amtsgericht_Wallmerod("T2234"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wissen</b>
     *  * <p>
     *  *  Code: T2235
     *  * <p>
     *  * 
     */
    @JsonProperty("T2235")
    @XmlEnumValue("T2235")
    aufgeloest_Amtsgericht_Wissen("T2235"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Zell</b>
     *  * <p>
     *  *  Code: T2236
     *  * <p>
     *  * 
     */
    @JsonProperty("T2236")
    @XmlEnumValue("T2236")
    aufgeloest_Amtsgericht_Zell("T2236"),

    /**
     * <b>Landgericht Mainz</b>
     *  * <p>
     *  *  Code: T2300
     *  * <p>
     *  * 
     */
    @JsonProperty("T2300")
    @XmlEnumValue("T2300")
    Landgericht_Mainz("T2300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Mainz</b>
     *  * <p>
     *  *  Code: T2300S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2300S")
    @XmlEnumValue("T2300S")
    Staatsanwaltschaft_beim_Landgericht_Mainz("T2300S"),

    /**
     * <b>Amtsgericht Alzey</b>
     *  * <p>
     *  *  Code: T2301
     *  * <p>
     *  * 
     */
    @JsonProperty("T2301")
    @XmlEnumValue("T2301")
    Amtsgericht_Alzey("T2301"),

    /**
     * <b>Grundbuchamt Alzey</b>
     *  * <p>
     *  *  Code: T2301G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2301G")
    @XmlEnumValue("T2301G")
    Grundbuchamt_Alzey("T2301G"),

    /**
     * <b>Amtsgericht Alzey, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2301I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2301I")
    @XmlEnumValue("T2301I")
    Amtsgericht_Alzey_Insolvenzgericht("T2301I"),

    /**
     * <b>Amtsgericht Bingen</b>
     *  * <p>
     *  *  Code: T2302
     *  * <p>
     *  * 
     */
    @JsonProperty("T2302")
    @XmlEnumValue("T2302")
    Amtsgericht_Bingen("T2302"),

    /**
     * <b>Grundbuchamt Bingen am Rhein</b>
     *  * <p>
     *  *  Code: T2302G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2302G")
    @XmlEnumValue("T2302G")
    Grundbuchamt_Bingen_am_Rhein("T2302G"),

    /**
     * <b>Amtsgericht Bingen am Rhein, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2302I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2302I")
    @XmlEnumValue("T2302I")
    Amtsgericht_Bingen_am_Rhein_Insolvenzgericht("T2302I"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bingen, Zwst. Ingelheim am Rhein</b>
     *  * <p>
     *  *  Code: T2303
     *  * <p>
     *  * 
     */
    @JsonProperty("T2303")
    @XmlEnumValue("T2303")
    aufgeloest_Amtsgericht_Bingen_Zwst_Ingelheim_am_Rhein("T2303"),

    /**
     * <b>Amtsgericht Mainz</b>
     *  * <p>
     *  *  Code: T2304
     *  * <p>
     *  * 
     */
    @JsonProperty("T2304")
    @XmlEnumValue("T2304")
    Amtsgericht_Mainz("T2304"),

    /**
     * <b>Grundbuchamt Mainz</b>
     *  * <p>
     *  *  Code: T2304G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2304G")
    @XmlEnumValue("T2304G")
    Grundbuchamt_Mainz("T2304G"),

    /**
     * <b>Amtsgericht Mainz, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2304I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2304I")
    @XmlEnumValue("T2304I")
    Amtsgericht_Mainz_Insolvenzgericht("T2304I"),

    /**
     * <b>Registergericht Amtsgericht Mainz</b>
     *  * <p>
     *  *  Code: T2304V
     *  * <p>
     *  * 
     */
    @JsonProperty("T2304V")
    @XmlEnumValue("T2304V")
    Registergericht_Amtsgericht_Mainz("T2304V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Oppenheim</b>
     *  * <p>
     *  *  Code: T2305
     *  * <p>
     *  * 
     */
    @JsonProperty("T2305")
    @XmlEnumValue("T2305")
    aufgeloest_Amtsgericht_Oppenheim("T2305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht W&#246;llstein</b>
     *  * <p>
     *  *  Code: T2306
     *  * <p>
     *  * 
     */
    @JsonProperty("T2306")
    @XmlEnumValue("T2306")
    aufgeloest_Amtsgericht_Woellstein("T2306"),

    /**
     * <b>Amtsgericht Worms</b>
     *  * <p>
     *  *  Code: T2307
     *  * <p>
     *  * 
     */
    @JsonProperty("T2307")
    @XmlEnumValue("T2307")
    Amtsgericht_Worms("T2307"),

    /**
     * <b>Grundbuchamt Worms</b>
     *  * <p>
     *  *  Code: T2307G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2307G")
    @XmlEnumValue("T2307G")
    Grundbuchamt_Worms("T2307G"),

    /**
     * <b>Amtsgericht Worms, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2307I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2307I")
    @XmlEnumValue("T2307I")
    Amtsgericht_Worms_Insolvenzgericht("T2307I"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Mainz, Zwst. Worms</b>
     *  * <p>
     *  *  Code: T2307S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2307S")
    @XmlEnumValue("T2307S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Mainz_Zwst_Worms("T2307S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht W&#246;rrstadt</b>
     *  * <p>
     *  *  Code: T2308
     *  * <p>
     *  * 
     */
    @JsonProperty("T2308")
    @XmlEnumValue("T2308")
    aufgeloest_Amtsgericht_Woerrstadt("T2308"),

    /**
     * <b>Landgericht Trier</b>
     *  * <p>
     *  *  Code: T2400
     *  * <p>
     *  * 
     */
    @JsonProperty("T2400")
    @XmlEnumValue("T2400")
    Landgericht_Trier("T2400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Trier</b>
     *  * <p>
     *  *  Code: T2400S
     *  * <p>
     *  * 
     */
    @JsonProperty("T2400S")
    @XmlEnumValue("T2400S")
    Staatsanwaltschaft_beim_Landgericht_Trier("T2400S"),

    /**
     * <b>Amtsgericht Bernkastel-Kues</b>
     *  * <p>
     *  *  Code: T2401
     *  * <p>
     *  * 
     */
    @JsonProperty("T2401")
    @XmlEnumValue("T2401")
    Amtsgericht_Bernkastel_Kues("T2401"),

    /**
     * <b>Grundbuchamt Bernkastel-Kues</b>
     *  * <p>
     *  *  Code: T2401G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2401G")
    @XmlEnumValue("T2401G")
    Grundbuchamt_Bernkastel_Kues("T2401G"),

    /**
     * <b>Amtsgericht Bitburg</b>
     *  * <p>
     *  *  Code: T2402
     *  * <p>
     *  * 
     */
    @JsonProperty("T2402")
    @XmlEnumValue("T2402")
    Amtsgericht_Bitburg("T2402"),

    /**
     * <b>Grundbuchamt Bitburg</b>
     *  * <p>
     *  *  Code: T2402G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2402G")
    @XmlEnumValue("T2402G")
    Grundbuchamt_Bitburg("T2402G"),

    /**
     * <b>Amtsgericht Bitburg, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2402I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2402I")
    @XmlEnumValue("T2402I")
    Amtsgericht_Bitburg_Insolvenzgericht("T2402I"),

    /**
     * <b>Amtsgericht Daun</b>
     *  * <p>
     *  *  Code: T2403
     *  * <p>
     *  * 
     */
    @JsonProperty("T2403")
    @XmlEnumValue("T2403")
    Amtsgericht_Daun("T2403"),

    /**
     * <b>Grundbuchamt Daun</b>
     *  * <p>
     *  *  Code: T2403G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2403G")
    @XmlEnumValue("T2403G")
    Grundbuchamt_Daun("T2403G"),

    /**
     * <b>Amtsgericht Hermeskeil</b>
     *  * <p>
     *  *  Code: T2404
     *  * <p>
     *  * 
     */
    @JsonProperty("T2404")
    @XmlEnumValue("T2404")
    Amtsgericht_Hermeskeil("T2404"),

    /**
     * <b>Grundbuchamt Hermeskeil</b>
     *  * <p>
     *  *  Code: T2404G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2404G")
    @XmlEnumValue("T2404G")
    Grundbuchamt_Hermeskeil("T2404G"),

    /**
     * <b>Amtsgericht Pr&#252;m</b>
     *  * <p>
     *  *  Code: T2405
     *  * <p>
     *  * 
     */
    @JsonProperty("T2405")
    @XmlEnumValue("T2405")
    Amtsgericht_Pruem("T2405"),

    /**
     * <b>Grundbuchamt Pr&#252;m</b>
     *  * <p>
     *  *  Code: T2405G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2405G")
    @XmlEnumValue("T2405G")
    Grundbuchamt_Pruem("T2405G"),

    /**
     * <b>Amtsgericht Saarburg</b>
     *  * <p>
     *  *  Code: T2406
     *  * <p>
     *  * 
     */
    @JsonProperty("T2406")
    @XmlEnumValue("T2406")
    Amtsgericht_Saarburg("T2406"),

    /**
     * <b>Grundbuchamt Saarburg</b>
     *  * <p>
     *  *  Code: T2406G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2406G")
    @XmlEnumValue("T2406G")
    Grundbuchamt_Saarburg("T2406G"),

    /**
     * <b>Amtsgericht Trier</b>
     *  * <p>
     *  *  Code: T2407
     *  * <p>
     *  * 
     */
    @JsonProperty("T2407")
    @XmlEnumValue("T2407")
    Amtsgericht_Trier("T2407"),

    /**
     * <b>Grundbuchamt Trier</b>
     *  * <p>
     *  *  Code: T2407G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2407G")
    @XmlEnumValue("T2407G")
    Grundbuchamt_Trier("T2407G"),

    /**
     * <b>Amtsgericht Trier, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2407I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2407I")
    @XmlEnumValue("T2407I")
    Amtsgericht_Trier_Insolvenzgericht("T2407I"),

    /**
     * <b>Amtsgericht Wittlich</b>
     *  * <p>
     *  *  Code: T2408
     *  * <p>
     *  * 
     */
    @JsonProperty("T2408")
    @XmlEnumValue("T2408")
    Amtsgericht_Wittlich("T2408"),

    /**
     * <b>Grundbuchamt Wittlich</b>
     *  * <p>
     *  *  Code: T2408G
     *  * <p>
     *  * 
     */
    @JsonProperty("T2408G")
    @XmlEnumValue("T2408G")
    Grundbuchamt_Wittlich("T2408G"),

    /**
     * <b>Amtsgericht Wittlich, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T2408I
     *  * <p>
     *  * 
     */
    @JsonProperty("T2408I")
    @XmlEnumValue("T2408I")
    Amtsgericht_Wittlich_Insolvenzgericht("T2408I"),

    /**
     * <b>Registergericht Amtsgericht Wittlich</b>
     *  * <p>
     *  *  Code: T2408V
     *  * <p>
     *  * 
     */
    @JsonProperty("T2408V")
    @XmlEnumValue("T2408V")
    Registergericht_Amtsgericht_Wittlich("T2408V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hillesheim</b>
     *  * <p>
     *  *  Code: T2409
     *  * <p>
     *  * 
     */
    @JsonProperty("T2409")
    @XmlEnumValue("T2409")
    aufgeloest_Amtsgericht_Hillesheim("T2409"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neuerburg</b>
     *  * <p>
     *  *  Code: T2410
     *  * <p>
     *  * 
     */
    @JsonProperty("T2410")
    @XmlEnumValue("T2410")
    aufgeloest_Amtsgericht_Neuerburg("T2410"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neumagen</b>
     *  * <p>
     *  *  Code: T2411
     *  * <p>
     *  * 
     */
    @JsonProperty("T2411")
    @XmlEnumValue("T2411")
    aufgeloest_Amtsgericht_Neumagen("T2411"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rhaunen</b>
     *  * <p>
     *  *  Code: T2412
     *  * <p>
     *  * 
     */
    @JsonProperty("T2412")
    @XmlEnumValue("T2412")
    aufgeloest_Amtsgericht_Rhaunen("T2412"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Waxweiler</b>
     *  * <p>
     *  *  Code: T2413
     *  * <p>
     *  * 
     */
    @JsonProperty("T2413")
    @XmlEnumValue("T2413")
    aufgeloest_Amtsgericht_Waxweiler("T2413"),

    /**
     * <b>Oberlandesgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3000
     *  * <p>
     *  * 
     */
    @JsonProperty("T3000")
    @XmlEnumValue("T3000")
    Oberlandesgericht_Zweibruecken("T3000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3000S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3000S")
    @XmlEnumValue("T3000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Zweibruecken("T3000S"),

    /**
     * <b>Landgericht Frankenthal</b>
     *  * <p>
     *  *  Code: T3100
     *  * <p>
     *  * 
     */
    @JsonProperty("T3100")
    @XmlEnumValue("T3100")
    Landgericht_Frankenthal("T3100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Frankenthal (Pfalz)</b>
     *  * <p>
     *  *  Code: T3100S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3100S")
    @XmlEnumValue("T3100S")
    Staatsanwaltschaft_beim_Landgericht_Frankenthal_Pfalz("T3100S"),

    /**
     * <b>Amtsgericht Bad D&#252;rkheim</b>
     *  * <p>
     *  *  Code: T3101
     *  * <p>
     *  * 
     */
    @JsonProperty("T3101")
    @XmlEnumValue("T3101")
    Amtsgericht_Bad_Duerkheim("T3101"),

    /**
     * <b>Grundbuchamt Bad D&#252;rkheim</b>
     *  * <p>
     *  *  Code: T3101G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3101G")
    @XmlEnumValue("T3101G")
    Grundbuchamt_Bad_Duerkheim("T3101G"),

    /**
     * <b>Amtsgericht Frankenthal</b>
     *  * <p>
     *  *  Code: T3102
     *  * <p>
     *  * 
     */
    @JsonProperty("T3102")
    @XmlEnumValue("T3102")
    Amtsgericht_Frankenthal("T3102"),

    /**
     * <b>Grundbuchamt Frankenthal (Pfalz)</b>
     *  * <p>
     *  *  Code: T3102G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3102G")
    @XmlEnumValue("T3102G")
    Grundbuchamt_Frankenthal_Pfalz("T3102G"),

    /**
     * <b>Amtsgericht Gr&#252;nstadt</b>
     *  * <p>
     *  *  Code: T3103
     *  * <p>
     *  * 
     */
    @JsonProperty("T3103")
    @XmlEnumValue("T3103")
    Amtsgericht_Gruenstadt("T3103"),

    /**
     * <b>Grundbuchamt Gr&#252;nstadt</b>
     *  * <p>
     *  *  Code: T3103G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3103G")
    @XmlEnumValue("T3103G")
    Grundbuchamt_Gruenstadt("T3103G"),

    /**
     * <b>Amtsgericht Ludwigshafen a.Rhein</b>
     *  * <p>
     *  *  Code: T3104
     *  * <p>
     *  * 
     */
    @JsonProperty("T3104")
    @XmlEnumValue("T3104")
    Amtsgericht_Ludwigshafen_a_Rhein("T3104"),

    /**
     * <b>Grundbuchamt Ludwigshafen am Rhein</b>
     *  * <p>
     *  *  Code: T3104G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3104G")
    @XmlEnumValue("T3104G")
    Grundbuchamt_Ludwigshafen_am_Rhein("T3104G"),

    /**
     * <b>Amtsgericht Ludwigshafen am Rhein, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3104I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3104I")
    @XmlEnumValue("T3104I")
    Amtsgericht_Ludwigshafen_am_Rhein_Insolvenzgericht("T3104I"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankenthal (Pfalz), Zwst. Ludwigshafen/Rhein</b>
     *  * <p>
     *  *  Code: T3104S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3104S")
    @XmlEnumValue("T3104S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankenthal_Pfalz_Zwst_Ludwigshafen_Rhein("T3104S"),

    /**
     * <b>Registergericht Amtsgericht Ludwigshafen am Rhein</b>
     *  * <p>
     *  *  Code: T3104V
     *  * <p>
     *  * 
     */
    @JsonProperty("T3104V")
    @XmlEnumValue("T3104V")
    Registergericht_Amtsgericht_Ludwigshafen_am_Rhein("T3104V"),

    /**
     * <b>Amtsgericht Neustadt (an der Weinstra&#223;e)</b>
     *  * <p>
     *  *  Code: T3105
     *  * <p>
     *  * 
     */
    @JsonProperty("T3105")
    @XmlEnumValue("T3105")
    Amtsgericht_Neustadt_an_der_Weinstrasse("T3105"),

    /**
     * <b>Grundbuchamt Neustadt an der Weinstra&#223;e</b>
     *  * <p>
     *  *  Code: T3105G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3105G")
    @XmlEnumValue("T3105G")
    Grundbuchamt_Neustadt_an_der_Weinstrasse("T3105G"),

    /**
     * <b>Amtsgericht Neustadt an der Weinstra&#223;e, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3105I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3105I")
    @XmlEnumValue("T3105I")
    Amtsgericht_Neustadt_an_der_Weinstrasse_Insolvenzgericht("T3105I"),

    /**
     * <b>Amtsgericht Speyer</b>
     *  * <p>
     *  *  Code: T3106
     *  * <p>
     *  * 
     */
    @JsonProperty("T3106")
    @XmlEnumValue("T3106")
    Amtsgericht_Speyer("T3106"),

    /**
     * <b>Grundbuchamt Speyer</b>
     *  * <p>
     *  *  Code: T3106G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3106G")
    @XmlEnumValue("T3106G")
    Grundbuchamt_Speyer("T3106G"),

    /**
     * <b>Landgericht Kaiserslautern</b>
     *  * <p>
     *  *  Code: T3200
     *  * <p>
     *  * 
     */
    @JsonProperty("T3200")
    @XmlEnumValue("T3200")
    Landgericht_Kaiserslautern("T3200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Kaiserslautern</b>
     *  * <p>
     *  *  Code: T3200S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3200S")
    @XmlEnumValue("T3200S")
    Staatsanwaltschaft_beim_Landgericht_Kaiserslautern("T3200S"),

    /**
     * <b>Amtsgericht Kaiserslautern</b>
     *  * <p>
     *  *  Code: T3201
     *  * <p>
     *  * 
     */
    @JsonProperty("T3201")
    @XmlEnumValue("T3201")
    Amtsgericht_Kaiserslautern("T3201"),

    /**
     * <b>Grundbuchamt Kaiserslautern</b>
     *  * <p>
     *  *  Code: T3201G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3201G")
    @XmlEnumValue("T3201G")
    Grundbuchamt_Kaiserslautern("T3201G"),

    /**
     * <b>Amtsgericht Kaiserslautern, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3201I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3201I")
    @XmlEnumValue("T3201I")
    Amtsgericht_Kaiserslautern_Insolvenzgericht("T3201I"),

    /**
     * <b>Amtsgericht Kaiserslautern, Zentrales Vollstreckungsgericht Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T3201R
     *  * <p>
     *  * 
     */
    @JsonProperty("T3201R")
    @XmlEnumValue("T3201R")
    Amtsgericht_Kaiserslautern_Zentrales_Vollstreckungsgericht_Rheinland_Pfalz("T3201R"),

    /**
     * <b>Registergericht Amtsgericht Kaiserslautern</b>
     *  * <p>
     *  *  Code: T3201V
     *  * <p>
     *  * 
     */
    @JsonProperty("T3201V")
    @XmlEnumValue("T3201V")
    Registergericht_Amtsgericht_Kaiserslautern("T3201V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kirchheimbolanden</b>
     *  * <p>
     *  *  Code: T3202
     *  * <p>
     *  * 
     */
    @JsonProperty("T3202")
    @XmlEnumValue("T3202")
    aufgeloest_Amtsgericht_Kirchheimbolanden("T3202"),

    /**
     * <b>Amtsgericht Kusel</b>
     *  * <p>
     *  *  Code: T3203
     *  * <p>
     *  * 
     */
    @JsonProperty("T3203")
    @XmlEnumValue("T3203")
    Amtsgericht_Kusel("T3203"),

    /**
     * <b>Grundbuchamt Kusel</b>
     *  * <p>
     *  *  Code: T3203G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3203G")
    @XmlEnumValue("T3203G")
    Grundbuchamt_Kusel("T3203G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lauterecken</b>
     *  * <p>
     *  *  Code: T3204
     *  * <p>
     *  * 
     */
    @JsonProperty("T3204")
    @XmlEnumValue("T3204")
    aufgeloest_Amtsgericht_Lauterecken("T3204"),

    /**
     * <b>Amtsgericht Rockenhausen</b>
     *  * <p>
     *  *  Code: T3205
     *  * <p>
     *  * 
     */
    @JsonProperty("T3205")
    @XmlEnumValue("T3205")
    Amtsgericht_Rockenhausen("T3205"),

    /**
     * <b>Grundbuchamt Rockenhausen</b>
     *  * <p>
     *  *  Code: T3205G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3205G")
    @XmlEnumValue("T3205G")
    Grundbuchamt_Rockenhausen("T3205G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Obermoschel</b>
     *  * <p>
     *  *  Code: T3206
     *  * <p>
     *  * 
     */
    @JsonProperty("T3206")
    @XmlEnumValue("T3206")
    aufgeloest_Amtsgericht_Obermoschel("T3206"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Winnweiler</b>
     *  * <p>
     *  *  Code: T3207
     *  * <p>
     *  * 
     */
    @JsonProperty("T3207")
    @XmlEnumValue("T3207")
    aufgeloest_Amtsgericht_Winnweiler("T3207"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wolfstein</b>
     *  * <p>
     *  *  Code: T3208
     *  * <p>
     *  * 
     */
    @JsonProperty("T3208")
    @XmlEnumValue("T3208")
    aufgeloest_Amtsgericht_Wolfstein("T3208"),

    /**
     * <b>Landgericht Landau (Pfalz)</b>
     *  * <p>
     *  *  Code: T3300
     *  * <p>
     *  * 
     */
    @JsonProperty("T3300")
    @XmlEnumValue("T3300")
    Landgericht_Landau_Pfalz("T3300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Landau in der Pfalz</b>
     *  * <p>
     *  *  Code: T3300S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3300S")
    @XmlEnumValue("T3300S")
    Staatsanwaltschaft_beim_Landgericht_Landau_in_der_Pfalz("T3300S"),

    /**
     * <b>Amtsgericht Landau Zweigstelle Bad Bergzabern</b>
     *  * <p>
     *  *  Code: T3301
     *  * <p>
     *  * 
     */
    @JsonProperty("T3301")
    @XmlEnumValue("T3301")
    Amtsgericht_Landau_Zweigstelle_Bad_Bergzabern("T3301"),

    /**
     * <b>Grundbuchamt Bad Bergzabern</b>
     *  * <p>
     *  *  Code: T3301G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3301G")
    @XmlEnumValue("T3301G")
    Grundbuchamt_Bad_Bergzabern("T3301G"),

    /**
     * <b>Amtsgericht Germersheim</b>
     *  * <p>
     *  *  Code: T3302
     *  * <p>
     *  * 
     */
    @JsonProperty("T3302")
    @XmlEnumValue("T3302")
    Amtsgericht_Germersheim("T3302"),

    /**
     * <b>Grundbuchamt Germersheim</b>
     *  * <p>
     *  *  Code: T3302G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3302G")
    @XmlEnumValue("T3302G")
    Grundbuchamt_Germersheim("T3302G"),

    /**
     * <b>Amtsgericht Kandel</b>
     *  * <p>
     *  *  Code: T3303
     *  * <p>
     *  * 
     */
    @JsonProperty("T3303")
    @XmlEnumValue("T3303")
    Amtsgericht_Kandel("T3303"),

    /**
     * <b>Grundbuchamt Kandel</b>
     *  * <p>
     *  *  Code: T3303G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3303G")
    @XmlEnumValue("T3303G")
    Grundbuchamt_Kandel("T3303G"),

    /**
     * <b>Amtsgericht Landau (Pfalz)</b>
     *  * <p>
     *  *  Code: T3304
     *  * <p>
     *  * 
     */
    @JsonProperty("T3304")
    @XmlEnumValue("T3304")
    Amtsgericht_Landau_Pfalz("T3304"),

    /**
     * <b>Grundbuchamt Landau in der Pfalz</b>
     *  * <p>
     *  *  Code: T3304G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3304G")
    @XmlEnumValue("T3304G")
    Grundbuchamt_Landau_in_der_Pfalz("T3304G"),

    /**
     * <b>Amtsgericht Landau in der Pfalz, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3304I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3304I")
    @XmlEnumValue("T3304I")
    Amtsgericht_Landau_in_der_Pfalz_Insolvenzgericht("T3304I"),

    /**
     * <b>Registergericht Amtsgericht Landau in der Pfalz</b>
     *  * <p>
     *  *  Code: T3304V
     *  * <p>
     *  * 
     */
    @JsonProperty("T3304V")
    @XmlEnumValue("T3304V")
    Registergericht_Amtsgericht_Landau_in_der_Pfalz("T3304V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Annweiler</b>
     *  * <p>
     *  *  Code: T3305
     *  * <p>
     *  * 
     */
    @JsonProperty("T3305")
    @XmlEnumValue("T3305")
    aufgeloest_Amtsgericht_Annweiler("T3305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Edenkoben</b>
     *  * <p>
     *  *  Code: T3306
     *  * <p>
     *  * 
     */
    @JsonProperty("T3306")
    @XmlEnumValue("T3306")
    aufgeloest_Amtsgericht_Edenkoben("T3306"),

    /**
     * <b>Landgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3400
     *  * <p>
     *  * 
     */
    @JsonProperty("T3400")
    @XmlEnumValue("T3400")
    Landgericht_Zweibruecken("T3400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3400S
     *  * <p>
     *  * 
     */
    @JsonProperty("T3400S")
    @XmlEnumValue("T3400S")
    Staatsanwaltschaft_beim_Landgericht_Zweibruecken("T3400S"),

    /**
     * <b>Amtsgericht Landstuhl</b>
     *  * <p>
     *  *  Code: T3401
     *  * <p>
     *  * 
     */
    @JsonProperty("T3401")
    @XmlEnumValue("T3401")
    Amtsgericht_Landstuhl("T3401"),

    /**
     * <b>Grundbuchamt Landstuhl</b>
     *  * <p>
     *  *  Code: T3401G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3401G")
    @XmlEnumValue("T3401G")
    Grundbuchamt_Landstuhl("T3401G"),

    /**
     * <b>Amtsgericht Pirmasens</b>
     *  * <p>
     *  *  Code: T3402
     *  * <p>
     *  * 
     */
    @JsonProperty("T3402")
    @XmlEnumValue("T3402")
    Amtsgericht_Pirmasens("T3402"),

    /**
     * <b>Grundbuchamt Pirmasens</b>
     *  * <p>
     *  *  Code: T3402G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3402G")
    @XmlEnumValue("T3402G")
    Grundbuchamt_Pirmasens("T3402G"),

    /**
     * <b>Amtsgericht Pirmasens, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3402I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3402I")
    @XmlEnumValue("T3402I")
    Amtsgericht_Pirmasens_Insolvenzgericht("T3402I"),

    /**
     * <b>Amtsgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3403
     *  * <p>
     *  * 
     */
    @JsonProperty("T3403")
    @XmlEnumValue("T3403")
    Amtsgericht_Zweibruecken("T3403"),

    /**
     * <b>Grundbuchamt Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3403G
     *  * <p>
     *  * 
     */
    @JsonProperty("T3403G")
    @XmlEnumValue("T3403G")
    Grundbuchamt_Zweibruecken("T3403G"),

    /**
     * <b>Amtsgericht Zweibr&#252;cken, Insolvenzgericht</b>
     *  * <p>
     *  *  Code: T3403I
     *  * <p>
     *  * 
     */
    @JsonProperty("T3403I")
    @XmlEnumValue("T3403I")
    Amtsgericht_Zweibruecken_Insolvenzgericht("T3403I"),

    /**
     * <b>Registergericht Amtsgericht Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T3403V
     *  * <p>
     *  * 
     */
    @JsonProperty("T3403V")
    @XmlEnumValue("T3403V")
    Registergericht_Amtsgericht_Zweibruecken("T3403V"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dahn</b>
     *  * <p>
     *  *  Code: T3404
     *  * <p>
     *  * 
     */
    @JsonProperty("T3404")
    @XmlEnumValue("T3404")
    aufgeloest_Amtsgericht_Dahn("T3404"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Waldfischbach</b>
     *  * <p>
     *  *  Code: T3405
     *  * <p>
     *  * 
     */
    @JsonProperty("T3405")
    @XmlEnumValue("T3405")
    aufgeloest_Amtsgericht_Waldfischbach("T3405"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Waldmohr</b>
     *  * <p>
     *  *  Code: T3406
     *  * <p>
     *  * 
     */
    @JsonProperty("T3406")
    @XmlEnumValue("T3406")
    aufgeloest_Amtsgericht_Waldmohr("T3406"),

    /**
     * <b>Arbeitsgericht Kaiserslautern</b>
     *  * <p>
     *  *  Code: T6072
     *  * <p>
     *  * 
     */
    @JsonProperty("T6072")
    @XmlEnumValue("T6072")
    Arbeitsgericht_Kaiserslautern("T6072"),

    /**
     * <b>Sozialgericht Koblenz</b>
     *  * <p>
     *  *  Code: T6073
     *  * <p>
     *  * 
     */
    @JsonProperty("T6073")
    @XmlEnumValue("T6073")
    Sozialgericht_Koblenz("T6073"),

    /**
     * <b>Oberverwaltungsgericht Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6074
     *  * <p>
     *  * 
     */
    @JsonProperty("T6074")
    @XmlEnumValue("T6074")
    Oberverwaltungsgericht_Rheinland_Pfalz("T6074"),

    /**
     * <b>Verfassungsgerichtshof Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6075
     *  * <p>
     *  * 
     */
    @JsonProperty("T6075")
    @XmlEnumValue("T6075")
    Verfassungsgerichtshof_Rheinland_Pfalz("T6075"),

    /**
     * <b>Verwaltungsgericht Koblenz</b>
     *  * <p>
     *  *  Code: T6076
     *  * <p>
     *  * 
     */
    @JsonProperty("T6076")
    @XmlEnumValue("T6076")
    Verwaltungsgericht_Koblenz("T6076"),

    /**
     * <b>Arbeitsgericht Koblenz</b>
     *  * <p>
     *  *  Code: T6077
     *  * <p>
     *  * 
     */
    @JsonProperty("T6077")
    @XmlEnumValue("T6077")
    Arbeitsgericht_Koblenz("T6077"),

    /**
     * <b>Arbeitsgericht Ludwigshafen</b>
     *  * <p>
     *  *  Code: T6078
     *  * <p>
     *  * 
     */
    @JsonProperty("T6078")
    @XmlEnumValue("T6078")
    Arbeitsgericht_Ludwigshafen("T6078"),

    /**
     * <b>Landessozialgericht Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6079
     *  * <p>
     *  * 
     */
    @JsonProperty("T6079")
    @XmlEnumValue("T6079")
    Landessozialgericht_Rheinland_Pfalz("T6079"),

    /**
     * <b>Arbeitsgericht Mainz</b>
     *  * <p>
     *  *  Code: T6080
     *  * <p>
     *  * 
     */
    @JsonProperty("T6080")
    @XmlEnumValue("T6080")
    Arbeitsgericht_Mainz("T6080"),

    /**
     * <b>Landesarbeitsgericht Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6081
     *  * <p>
     *  * 
     */
    @JsonProperty("T6081")
    @XmlEnumValue("T6081")
    Landesarbeitsgericht_Rheinland_Pfalz("T6081"),

    /**
     * <b>Verwaltungsgericht Mainz</b>
     *  * <p>
     *  *  Code: T6082
     *  * <p>
     *  * 
     */
    @JsonProperty("T6082")
    @XmlEnumValue("T6082")
    Verwaltungsgericht_Mainz("T6082"),

    /**
     * <b>Verwaltungsgericht Neustadt an der Weinstra&#223;e</b>
     *  * <p>
     *  *  Code: T6083
     *  * <p>
     *  * 
     */
    @JsonProperty("T6083")
    @XmlEnumValue("T6083")
    Verwaltungsgericht_Neustadt_an_der_Weinstrasse("T6083"),

    /**
     * <b>Finanzgericht Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6084
     *  * <p>
     *  * 
     */
    @JsonProperty("T6084")
    @XmlEnumValue("T6084")
    Finanzgericht_Rheinland_Pfalz("T6084"),

    /**
     * <b>Verwaltungsgericht Trier</b>
     *  * <p>
     *  *  Code: T6085
     *  * <p>
     *  * 
     */
    @JsonProperty("T6085")
    @XmlEnumValue("T6085")
    Verwaltungsgericht_Trier("T6085"),

    /**
     * <b>Sozialgericht Trier</b>
     *  * <p>
     *  *  Code: T6086
     *  * <p>
     *  * 
     */
    @JsonProperty("T6086")
    @XmlEnumValue("T6086")
    Sozialgericht_Trier("T6086"),

    /**
     * <b>Arbeitsgericht Trier</b>
     *  * <p>
     *  *  Code: T6121
     *  * <p>
     *  * 
     */
    @JsonProperty("T6121")
    @XmlEnumValue("T6121")
    Arbeitsgericht_Trier("T6121"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Koblenz</b>
     *  * <p>
     *  *  Code: T6176
     *  * <p>
     *  * 
     */
    @JsonProperty("T6176")
    @XmlEnumValue("T6176")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Koblenz("T6176"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Pf&#228;lzischen Rechtsanwaltskammer</b>
     *  * <p>
     *  *  Code: T6182
     *  * <p>
     *  * 
     */
    @JsonProperty("T6182")
    @XmlEnumValue("T6182")
    Anwaltsgericht_fuer_den_Bezirk_der_Pfaelzischen_Rechtsanwaltskammer("T6182"),

    /**
     * <b>Anwaltsgerichtshof Rheinland-Pfalz</b>
     *  * <p>
     *  *  Code: T6183
     *  * <p>
     *  * 
     */
    @JsonProperty("T6183")
    @XmlEnumValue("T6183")
    Anwaltsgerichtshof_Rheinland_Pfalz("T6183"),

    /**
     * <b>Sozialgericht Mainz</b>
     *  * <p>
     *  *  Code: T6221
     *  * <p>
     *  * 
     */
    @JsonProperty("T6221")
    @XmlEnumValue("T6221")
    Sozialgericht_Mainz("T6221"),

    /**
     * <b>Sozialgericht Speyer</b>
     *  * <p>
     *  *  Code: T6252
     *  * <p>
     *  * 
     */
    @JsonProperty("T6252")
    @XmlEnumValue("T6252")
    Sozialgericht_Speyer("T6252"),

    /**
     * <b>Jugendstrafanstalt Schifferstadt</b>
     *  * <p>
     *  *  Code: T6311
     *  * <p>
     *  * 
     */
    @JsonProperty("T6311")
    @XmlEnumValue("T6311")
    Jugendstrafanstalt_Schifferstadt("T6311"),

    /**
     * <b>Jugendarrestanstalt Worms</b>
     *  * <p>
     *  *  Code: T6347
     *  * <p>
     *  * 
     */
    @JsonProperty("T6347")
    @XmlEnumValue("T6347")
    Jugendarrestanstalt_Worms("T6347"),

    /**
     * <b>Arbeitsgericht Kaiserslautern - Ausw&#228;rtige Kammern Pirmasens</b>
     *  * <p>
     *  *  Code: T6840
     *  * <p>
     *  * 
     */
    @JsonProperty("T6840")
    @XmlEnumValue("T6840")
    Arbeitsgericht_Kaiserslautern_Auswaertige_Kammern_Pirmasens("T6840"),

    /**
     * <b>Arbeitsgericht Ludwigshafen am Rhein - Ausw&#228;rtige Kammern Landau i. d. Pfalz</b>
     *  * <p>
     *  *  Code: T6841
     *  * <p>
     *  * 
     */
    @JsonProperty("T6841")
    @XmlEnumValue("T6841")
    Arbeitsgericht_Ludwigshafen_am_Rhein_Auswaertige_Kammern_Landau_i_d_Pfalz("T6841"),

    /**
     * <b>Arbeitsgericht Mainz - Ausw&#228;rtige Kammern Bad Kreuznach</b>
     *  * <p>
     *  *  Code: T6842
     *  * <p>
     *  * 
     */
    @JsonProperty("T6842")
    @XmlEnumValue("T6842")
    Arbeitsgericht_Mainz_Auswaertige_Kammern_Bad_Kreuznach("T6842"),

    /**
     * <b>Justizvollzugsanstalt Frankenthal</b>
     *  * <p>
     *  *  Code: T7894
     *  * <p>
     *  * 
     */
    @JsonProperty("T7894")
    @XmlEnumValue("T7894")
    Justizvollzugsanstalt_Frankenthal("T7894"),

    /**
     * <b>Justizvollzugsanstalt Koblenz</b>
     *  * <p>
     *  *  Code: T7895
     *  * <p>
     *  * 
     */
    @JsonProperty("T7895")
    @XmlEnumValue("T7895")
    Justizvollzugsanstalt_Koblenz("T7895"),

    /**
     * <b>Justizvollzugsanstalt Wittlich</b>
     *  * <p>
     *  *  Code: T7913
     *  * <p>
     *  * 
     */
    @JsonProperty("T7913")
    @XmlEnumValue("T7913")
    Justizvollzugsanstalt_Wittlich("T7913"),

    /**
     * <b>Justizvollzugsanstalt Diez</b>
     *  * <p>
     *  *  Code: T7929
     *  * <p>
     *  * 
     */
    @JsonProperty("T7929")
    @XmlEnumValue("T7929")
    Justizvollzugsanstalt_Diez("T7929"),

    /**
     * <b>Justizvollzugsanstalt Trier</b>
     *  * <p>
     *  *  Code: T7945
     *  * <p>
     *  * 
     */
    @JsonProperty("T7945")
    @XmlEnumValue("T7945")
    Justizvollzugsanstalt_Trier("T7945"),

    /**
     * <b>Justizvollzugsanstalt Ludwigshafen -Sozialtherapeutische Anstalt-</b>
     *  * <p>
     *  *  Code: T7946
     *  * <p>
     *  * 
     */
    @JsonProperty("T7946")
    @XmlEnumValue("T7946")
    Justizvollzugsanstalt_Ludwigshafen_Sozialtherapeutische_Anstalt("T7946"),

    /**
     * <b>Justizvollzugsanstalt Rohrbach</b>
     *  * <p>
     *  *  Code: T7947
     *  * <p>
     *  * 
     */
    @JsonProperty("T7947")
    @XmlEnumValue("T7947")
    Justizvollzugsanstalt_Rohrbach("T7947"),

    /**
     * <b>Justizvollzugsanstalt Zweibr&#252;cken</b>
     *  * <p>
     *  *  Code: T7948
     *  * <p>
     *  * 
     */
    @JsonProperty("T7948")
    @XmlEnumValue("T7948")
    Justizvollzugsanstalt_Zweibruecken("T7948"),

    /**
     * <b>Jugendstrafanstalt Wittlich</b>
     *  * <p>
     *  *  Code: T7966
     *  * <p>
     *  * 
     */
    @JsonProperty("T7966")
    @XmlEnumValue("T7966")
    Jugendstrafanstalt_Wittlich("T7966"),

    /**
     * <b>Oberlandesgericht Dresden</b>
     *  * <p>
     *  *  Code: U1000
     *  * <p>
     *  * 
     */
    @JsonProperty("U1000")
    @XmlEnumValue("U1000")
    Oberlandesgericht_Dresden("U1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Dresden</b>
     *  * <p>
     *  *  Code: U1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1000S")
    @XmlEnumValue("U1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Dresden("U1000S"),

    /**
     * <b>Justizvollzugsanstalt Zwickau</b>
     *  * <p>
     *  *  Code: U1001
     *  * <p>
     *  * 
     */
    @JsonProperty("U1001")
    @XmlEnumValue("U1001")
    Justizvollzugsanstalt_Zwickau("U1001"),

    /**
     * <b>Landgericht Dresden</b>
     *  * <p>
     *  *  Code: U1100
     *  * <p>
     *  * 
     */
    @JsonProperty("U1100")
    @XmlEnumValue("U1100")
    Landgericht_Dresden("U1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Dresden</b>
     *  * <p>
     *  *  Code: U1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1100S")
    @XmlEnumValue("U1100S")
    Staatsanwaltschaft_beim_Landgericht_Dresden("U1100S"),

    /**
     * <b>Amtsgericht Bautzen</b>
     *  * <p>
     *  *  Code: U1101
     *  * <p>
     *  * 
     */
    @JsonProperty("U1101")
    @XmlEnumValue("U1101")
    Amtsgericht_Bautzen("U1101"),

    /**
     * <b>Grundbuchamt Bautzen</b>
     *  * <p>
     *  *  Code: U1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1101G")
    @XmlEnumValue("U1101G")
    Grundbuchamt_Bautzen("U1101G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bischofswerda</b>
     *  * <p>
     *  *  Code: U1102
     *  * <p>
     *  * 
     */
    @JsonProperty("U1102")
    @XmlEnumValue("U1102")
    aufgeloest_Amtsgericht_Bischofswerda("U1102"),

    /**
     * <b>Amtsgericht Dippoldiswalde</b>
     *  * <p>
     *  *  Code: U1103
     *  * <p>
     *  * 
     */
    @JsonProperty("U1103")
    @XmlEnumValue("U1103")
    Amtsgericht_Dippoldiswalde("U1103"),

    /**
     * <b>Grundbuchamt Dippoldiswalde</b>
     *  * <p>
     *  *  Code: U1103G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1103G")
    @XmlEnumValue("U1103G")
    Grundbuchamt_Dippoldiswalde("U1103G"),

    /**
     * <b>Amtsgericht Dresden</b>
     *  * <p>
     *  *  Code: U1104
     *  * <p>
     *  * 
     */
    @JsonProperty("U1104")
    @XmlEnumValue("U1104")
    Amtsgericht_Dresden("U1104"),

    /**
     * <b>Grundbuchamt Dresden</b>
     *  * <p>
     *  *  Code: U1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1104G")
    @XmlEnumValue("U1104G")
    Grundbuchamt_Dresden("U1104G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dresden (Land)</b>
     *  * <p>
     *  *  Code: U1105
     *  * <p>
     *  * 
     */
    @JsonProperty("U1105")
    @XmlEnumValue("U1105")
    aufgeloest_Amtsgericht_Dresden_Land("U1105"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Dippoldiswalde, Zwst. Freital</b>
     *  * <p>
     *  *  Code: U1106
     *  * <p>
     *  * 
     */
    @JsonProperty("U1106")
    @XmlEnumValue("U1106")
    aufgeloest_Amtsgericht_Dippoldiswalde_Zwst_Freital("U1106"),

    /**
     * <b>Amtsgericht G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1107
     *  * <p>
     *  * 
     */
    @JsonProperty("U1107")
    @XmlEnumValue("U1107")
    Amtsgericht_Goerlitz("U1107"),

    /**
     * <b>Grundbuchamt G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1107G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1107G")
    @XmlEnumValue("U1107G")
    Grundbuchamt_Goerlitz("U1107G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gro&#223;enhain</b>
     *  * <p>
     *  *  Code: U1108
     *  * <p>
     *  * 
     */
    @JsonProperty("U1108")
    @XmlEnumValue("U1108")
    aufgeloest_Amtsgericht_Grossenhain("U1108"),

    /**
     * <b>Amtsgericht Hoyerswerda</b>
     *  * <p>
     *  *  Code: U1109
     *  * <p>
     *  * 
     */
    @JsonProperty("U1109")
    @XmlEnumValue("U1109")
    Amtsgericht_Hoyerswerda("U1109"),

    /**
     * <b>Grundbuchamt Hoyerswerda</b>
     *  * <p>
     *  *  Code: U1109G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1109G")
    @XmlEnumValue("U1109G")
    Grundbuchamt_Hoyerswerda("U1109G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Hoyerswerda (Zwst. der StA Bautzen)</b>
     *  * <p>
     *  *  Code: U1109S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1109S")
    @XmlEnumValue("U1109S")
    Staatsanwaltschaft_beim_Landgericht_Hoyerswerda_Zwst_der_StA_Bautzen("U1109S"),

    /**
     * <b>Amtsgericht Kamenz</b>
     *  * <p>
     *  *  Code: U1110
     *  * <p>
     *  * 
     */
    @JsonProperty("U1110")
    @XmlEnumValue("U1110")
    Amtsgericht_Kamenz("U1110"),

    /**
     * <b>Grundbuchamt Kamenz</b>
     *  * <p>
     *  *  Code: U1110G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1110G")
    @XmlEnumValue("U1110G")
    Grundbuchamt_Kamenz("U1110G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Zittau Zweigstelle L&#246;bau</b>
     *  * <p>
     *  *  Code: U1111
     *  * <p>
     *  * 
     */
    @JsonProperty("U1111")
    @XmlEnumValue("U1111")
    aufgeloest_Amtsgericht_Zittau_Zweigstelle_Loebau("U1111"),

    /**
     * <b>Amtsgericht Mei&#223;en</b>
     *  * <p>
     *  *  Code: U1112
     *  * <p>
     *  * 
     */
    @JsonProperty("U1112")
    @XmlEnumValue("U1112")
    Amtsgericht_Meissen("U1112"),

    /**
     * <b>Grundbuchamt Mei&#223;en</b>
     *  * <p>
     *  *  Code: U1112G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1112G")
    @XmlEnumValue("U1112G")
    Grundbuchamt_Meissen("U1112G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Mei&#223;en, Zwst. der StA Dresden</b>
     *  * <p>
     *  *  Code: U1112S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1112S")
    @XmlEnumValue("U1112S")
    Staatsanwaltschaft_beim_Landgericht_Meissen_Zwst_der_StA_Dresden("U1112S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wei&#223;wasser, Zwst. Niesky</b>
     *  * <p>
     *  *  Code: U1113
     *  * <p>
     *  * 
     */
    @JsonProperty("U1113")
    @XmlEnumValue("U1113")
    aufgeloest_Amtsgericht_Weisswasser_Zwst_Niesky("U1113"),

    /**
     * <b>Amtsgericht Pirna</b>
     *  * <p>
     *  *  Code: U1114
     *  * <p>
     *  * 
     */
    @JsonProperty("U1114")
    @XmlEnumValue("U1114")
    Amtsgericht_Pirna("U1114"),

    /**
     * <b>Grundbuchamt Pirna</b>
     *  * <p>
     *  *  Code: U1114G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1114G")
    @XmlEnumValue("U1114G")
    Grundbuchamt_Pirna("U1114G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Pirna, Zwst. der StA Dresden</b>
     *  * <p>
     *  *  Code: U1114S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1114S")
    @XmlEnumValue("U1114S")
    Staatsanwaltschaft_beim_Landgericht_Pirna_Zwst_der_StA_Dresden("U1114S"),

    /**
     * <b>Amtsgericht Riesa</b>
     *  * <p>
     *  *  Code: U1115
     *  * <p>
     *  * 
     */
    @JsonProperty("U1115")
    @XmlEnumValue("U1115")
    Amtsgericht_Riesa("U1115"),

    /**
     * <b>Grundbuchamt Riesa</b>
     *  * <p>
     *  *  Code: U1115G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1115G")
    @XmlEnumValue("U1115G")
    Grundbuchamt_Riesa("U1115G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Pirna, Zwst. Neustadt (in Sachsen)</b>
     *  * <p>
     *  *  Code: U1116
     *  * <p>
     *  * 
     */
    @JsonProperty("U1116")
    @XmlEnumValue("U1116")
    aufgeloest_Amtsgericht_Pirna_Zwst_Neustadt_in_Sachsen("U1116"),

    /**
     * <b>Amtsgericht Wei&#223;wasser</b>
     *  * <p>
     *  *  Code: U1117
     *  * <p>
     *  * 
     */
    @JsonProperty("U1117")
    @XmlEnumValue("U1117")
    Amtsgericht_Weisswasser("U1117"),

    /**
     * <b>Grundbuchamt Wei&#223;wasser</b>
     *  * <p>
     *  *  Code: U1117G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1117G")
    @XmlEnumValue("U1117G")
    Grundbuchamt_Weisswasser("U1117G"),

    /**
     * <b>Amtsgericht Zittau</b>
     *  * <p>
     *  *  Code: U1118
     *  * <p>
     *  * 
     */
    @JsonProperty("U1118")
    @XmlEnumValue("U1118")
    Amtsgericht_Zittau("U1118"),

    /**
     * <b>Grundbuchamt Zittau</b>
     *  * <p>
     *  *  Code: U1118G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1118G")
    @XmlEnumValue("U1118G")
    Grundbuchamt_Zittau("U1118G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Zittau, Zwst. der StA G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1118S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1118S")
    @XmlEnumValue("U1118S")
    Staatsanwaltschaft_beim_Landgericht_Zittau_Zwst_der_StA_Goerlitz("U1118S"),

    /**
     * <b>Amtsgericht Zittau, Zweigstelle L&#246;bau</b>
     *  * <p>
     *  *  Code: U1119
     *  * <p>
     *  * 
     */
    @JsonProperty("U1119")
    @XmlEnumValue("U1119")
    Amtsgericht_Zittau_Zweigstelle_Loebau("U1119"),

    /**
     * <b>Landgericht Dresden Ausw&#228;rtige Strafvollstreckungskammer</b>
     *  * <p>
     *  *  Code: U1130
     *  * <p>
     *  * 
     */
    @JsonProperty("U1130")
    @XmlEnumValue("U1130")
    Landgericht_Dresden_Auswaertige_Strafvollstreckungskammer("U1130"),

    /**
     * <b>Landgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U1200
     *  * <p>
     *  * 
     */
    @JsonProperty("U1200")
    @XmlEnumValue("U1200")
    Landgericht_Chemnitz("U1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1200S")
    @XmlEnumValue("U1200S")
    Staatsanwaltschaft_beim_Landgericht_Chemnitz("U1200S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Marienberg Zweigstelle Annaberg-Buchholz</b>
     *  * <p>
     *  *  Code: U1201
     *  * <p>
     *  * 
     */
    @JsonProperty("U1201")
    @XmlEnumValue("U1201")
    aufgeloest_Amtsgericht_Marienberg_Zweigstelle_Annaberg_Buchholz("U1201"),

    /**
     * <b>Amtsgericht Aue-Bad Schlema</b>
     *  * <p>
     *  *  Code: U1202
     *  * <p>
     *  * 
     */
    @JsonProperty("U1202")
    @XmlEnumValue("U1202")
    Amtsgericht_Aue_Bad_Schlema("U1202"),

    /**
     * <b>Grundbuchamt Aue-Bad Schlema</b>
     *  * <p>
     *  *  Code: U1202G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1202G")
    @XmlEnumValue("U1202G")
    Grundbuchamt_Aue_Bad_Schlema("U1202G"),

    /**
     * <b>Amtsgericht Auerbach</b>
     *  * <p>
     *  *  Code: U1203
     *  * <p>
     *  * 
     */
    @JsonProperty("U1203")
    @XmlEnumValue("U1203")
    Amtsgericht_Auerbach("U1203"),

    /**
     * <b>Grundbuchamt Auerbach</b>
     *  * <p>
     *  *  Code: U1203G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1203G")
    @XmlEnumValue("U1203G")
    Grundbuchamt_Auerbach("U1203G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freiberg, Zwst. Brand-Erbisdorf</b>
     *  * <p>
     *  *  Code: U1204
     *  * <p>
     *  * 
     */
    @JsonProperty("U1204")
    @XmlEnumValue("U1204")
    aufgeloest_Amtsgericht_Freiberg_Zwst_Brand_Erbisdorf("U1204"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Chemnitz/Stadt</b>
     *  * <p>
     *  *  Code: U1205
     *  * <p>
     *  * 
     */
    @JsonProperty("U1205")
    @XmlEnumValue("U1205")
    aufgeloest_Amtsgericht_Chemnitz_Stadt("U1205"),

    /**
     * <b>Amtsgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U1206
     *  * <p>
     *  * 
     */
    @JsonProperty("U1206")
    @XmlEnumValue("U1206")
    Amtsgericht_Chemnitz("U1206"),

    /**
     * <b>Grundbuchamt Chemnitz</b>
     *  * <p>
     *  *  Code: U1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1206G")
    @XmlEnumValue("U1206G")
    Grundbuchamt_Chemnitz("U1206G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Freiberg Zweigstelle Oederan</b>
     *  * <p>
     *  *  Code: U1207
     *  * <p>
     *  * 
     */
    @JsonProperty("U1207")
    @XmlEnumValue("U1207")
    aufgeloest_Amtsgericht_Freiberg_Zweigstelle_Oederan("U1207"),

    /**
     * <b>Amtsgericht Freiberg</b>
     *  * <p>
     *  *  Code: U1208
     *  * <p>
     *  * 
     */
    @JsonProperty("U1208")
    @XmlEnumValue("U1208")
    Amtsgericht_Freiberg("U1208"),

    /**
     * <b>Grundbuchamt Freiberg</b>
     *  * <p>
     *  *  Code: U1208G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1208G")
    @XmlEnumValue("U1208G")
    Grundbuchamt_Freiberg("U1208G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hohenstein-Ernstthal, Zwst. des AG Glauchau</b>
     *  * <p>
     *  *  Code: U1209
     *  * <p>
     *  * 
     */
    @JsonProperty("U1209")
    @XmlEnumValue("U1209")
    aufgeloest_Amtsgericht_Hohenstein_Ernstthal_Zwst_des_AG_Glauchau("U1209"),

    /**
     * <b>aufgel&#246;st-Amtsgericht D&#246;beln Zweigstelle Hainichen</b>
     *  * <p>
     *  *  Code: U1210
     *  * <p>
     *  * 
     */
    @JsonProperty("U1210")
    @XmlEnumValue("U1210")
    aufgeloest_Amtsgericht_Doebeln_Zweigstelle_Hainichen("U1210"),

    /**
     * <b>Amtsgericht Hohenstein-Ernstthal</b>
     *  * <p>
     *  *  Code: U1211
     *  * <p>
     *  * 
     */
    @JsonProperty("U1211")
    @XmlEnumValue("U1211")
    Amtsgericht_Hohenstein_Ernstthal("U1211"),

    /**
     * <b>Grundbuchamt Hohenstein-Ernstthal</b>
     *  * <p>
     *  *  Code: U1211G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1211G")
    @XmlEnumValue("U1211G")
    Grundbuchamt_Hohenstein_Ernstthal("U1211G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Auerbach, Zwst. Klingenthal</b>
     *  * <p>
     *  *  Code: U1212
     *  * <p>
     *  * 
     */
    @JsonProperty("U1212")
    @XmlEnumValue("U1212")
    aufgeloest_Amtsgericht_Auerbach_Zwst_Klingenthal("U1212"),

    /**
     * <b>Amtsgericht Marienberg</b>
     *  * <p>
     *  *  Code: U1213
     *  * <p>
     *  * 
     */
    @JsonProperty("U1213")
    @XmlEnumValue("U1213")
    Amtsgericht_Marienberg("U1213"),

    /**
     * <b>Grundbuchamt Marienberg</b>
     *  * <p>
     *  *  Code: U1213G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1213G")
    @XmlEnumValue("U1213G")
    Grundbuchamt_Marienberg("U1213G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Plauen, Zwst. Oelsnitz</b>
     *  * <p>
     *  *  Code: U1214
     *  * <p>
     *  * 
     */
    @JsonProperty("U1214")
    @XmlEnumValue("U1214")
    aufgeloest_Amtsgericht_Plauen_Zwst_Oelsnitz("U1214"),

    /**
     * <b>Amtsgericht Plauen</b>
     *  * <p>
     *  *  Code: U1215
     *  * <p>
     *  * 
     */
    @JsonProperty("U1215")
    @XmlEnumValue("U1215")
    Amtsgericht_Plauen("U1215"),

    /**
     * <b>Grundbuchamt Plauen</b>
     *  * <p>
     *  *  Code: U1215G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1215G")
    @XmlEnumValue("U1215G")
    Grundbuchamt_Plauen("U1215G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Reichenbach</b>
     *  * <p>
     *  *  Code: U1216
     *  * <p>
     *  * 
     */
    @JsonProperty("U1216")
    @XmlEnumValue("U1216")
    aufgeloest_Amtsgericht_Reichenbach("U1216"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rochlitz</b>
     *  * <p>
     *  *  Code: U1217
     *  * <p>
     *  * 
     */
    @JsonProperty("U1217")
    @XmlEnumValue("U1217")
    aufgeloest_Amtsgericht_Rochlitz("U1217"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schwarzenberg/Erzgebirge</b>
     *  * <p>
     *  *  Code: U1218
     *  * <p>
     *  * 
     */
    @JsonProperty("U1218")
    @XmlEnumValue("U1218")
    aufgeloest_Amtsgericht_Schwarzenberg_Erzgebirge("U1218"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Aue Zweigstelle Stollberg</b>
     *  * <p>
     *  *  Code: U1219
     *  * <p>
     *  * 
     */
    @JsonProperty("U1219")
    @XmlEnumValue("U1219")
    aufgeloest_Amtsgericht_Aue_Zweigstelle_Stollberg("U1219"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Zwickau, Zwst. Werdau</b>
     *  * <p>
     *  *  Code: U1220
     *  * <p>
     *  * 
     */
    @JsonProperty("U1220")
    @XmlEnumValue("U1220")
    aufgeloest_Amtsgericht_Zwickau_Zwst_Werdau("U1220"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Zschopau</b>
     *  * <p>
     *  *  Code: U1221
     *  * <p>
     *  * 
     */
    @JsonProperty("U1221")
    @XmlEnumValue("U1221")
    aufgeloest_Amtsgericht_Zschopau("U1221"),

    /**
     * <b>Amtsgericht Zwickau</b>
     *  * <p>
     *  *  Code: U1222
     *  * <p>
     *  * 
     */
    @JsonProperty("U1222")
    @XmlEnumValue("U1222")
    Amtsgericht_Zwickau("U1222"),

    /**
     * <b>Grundbuchamt Zwickau</b>
     *  * <p>
     *  *  Code: U1222G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1222G")
    @XmlEnumValue("U1222G")
    Grundbuchamt_Zwickau("U1222G"),

    /**
     * <b>Amtsgericht Zwickau, Zentrales Vollstreckungsgericht Sachsen</b>
     *  * <p>
     *  *  Code: U1222R
     *  * <p>
     *  * 
     */
    @JsonProperty("U1222R")
    @XmlEnumValue("U1222R")
    Amtsgericht_Zwickau_Zentrales_Vollstreckungsgericht_Sachsen("U1222R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Zwickau-Land</b>
     *  * <p>
     *  *  Code: U1223
     *  * <p>
     *  * 
     */
    @JsonProperty("U1223")
    @XmlEnumValue("U1223")
    aufgeloest_Amtsgericht_Zwickau_Land("U1223"),

    /**
     * <b>Amtsgericht Aue-Bad Schlema, Zweigstelle Stollberg</b>
     *  * <p>
     *  *  Code: U1225
     *  * <p>
     *  * 
     */
    @JsonProperty("U1225")
    @XmlEnumValue("U1225")
    Amtsgericht_Aue_Bad_Schlema_Zweigstelle_Stollberg("U1225"),

    /**
     * <b>Grundbuchamt Aue-Bad Schlema, Zweigstelle Stollberg</b>
     *  * <p>
     *  *  Code: U1225G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1225G")
    @XmlEnumValue("U1225G")
    Grundbuchamt_Aue_Bad_Schlema_Zweigstelle_Stollberg("U1225G"),

    /**
     * <b>Amtsgericht D&#246;beln, Zweigstelle Hainichen</b>
     *  * <p>
     *  *  Code: U1226
     *  * <p>
     *  * 
     */
    @JsonProperty("U1226")
    @XmlEnumValue("U1226")
    Amtsgericht_Doebeln_Zweigstelle_Hainichen("U1226"),

    /**
     * <b>Amtsgericht Marienberg, Zweigstelle Annaberg-Buchholz</b>
     *  * <p>
     *  *  Code: U1227
     *  * <p>
     *  * 
     */
    @JsonProperty("U1227")
    @XmlEnumValue("U1227")
    Amtsgericht_Marienberg_Zweigstelle_Annaberg_Buchholz("U1227"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Stollberg Ausw. Strafvollstreckungskammer des Landgerichts Chemnitz</b>
     *  * <p>
     *  *  Code: U1230
     *  * <p>
     *  * 
     */
    @JsonProperty("U1230")
    @XmlEnumValue("U1230")
    aufgeloest_Amtsgericht_Stollberg_Ausw_Strafvollstreckungskammer_des_Landgerichts_Chemnitz("U1230"),

    /**
     * <b>Landgericht Leipzig</b>
     *  * <p>
     *  *  Code: U1300
     *  * <p>
     *  * 
     */
    @JsonProperty("U1300")
    @XmlEnumValue("U1300")
    Landgericht_Leipzig("U1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Leipzig</b>
     *  * <p>
     *  *  Code: U1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1300S")
    @XmlEnumValue("U1300S")
    Staatsanwaltschaft_beim_Landgericht_Leipzig("U1300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Geithain (in Bad Lausick)</b>
     *  * <p>
     *  *  Code: U1301
     *  * <p>
     *  * 
     */
    @JsonProperty("U1301")
    @XmlEnumValue("U1301")
    aufgeloest_Amtsgericht_Geithain_in_Bad_Lausick("U1301"),

    /**
     * <b>Amtsgericht Borna</b>
     *  * <p>
     *  *  Code: U1302
     *  * <p>
     *  * 
     */
    @JsonProperty("U1302")
    @XmlEnumValue("U1302")
    Amtsgericht_Borna("U1302"),

    /**
     * <b>Grundbuchamt Borna</b>
     *  * <p>
     *  *  Code: U1302G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1302G")
    @XmlEnumValue("U1302G")
    Grundbuchamt_Borna("U1302G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eilenburg Zweigstelle Delitzsch</b>
     *  * <p>
     *  *  Code: U1303
     *  * <p>
     *  * 
     */
    @JsonProperty("U1303")
    @XmlEnumValue("U1303")
    aufgeloest_Amtsgericht_Eilenburg_Zweigstelle_Delitzsch("U1303"),

    /**
     * <b>Amtsgericht D&#246;beln</b>
     *  * <p>
     *  *  Code: U1304
     *  * <p>
     *  * 
     */
    @JsonProperty("U1304")
    @XmlEnumValue("U1304")
    Amtsgericht_Doebeln("U1304"),

    /**
     * <b>Grundbuchamt D&#246;beln</b>
     *  * <p>
     *  *  Code: U1304G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1304G")
    @XmlEnumValue("U1304G")
    Grundbuchamt_Doebeln("U1304G"),

    /**
     * <b>Amtsgericht Eilenburg</b>
     *  * <p>
     *  *  Code: U1305
     *  * <p>
     *  * 
     */
    @JsonProperty("U1305")
    @XmlEnumValue("U1305")
    Amtsgericht_Eilenburg("U1305"),

    /**
     * <b>Grundbuchamt Eilenburg</b>
     *  * <p>
     *  *  Code: U1305G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1305G")
    @XmlEnumValue("U1305G")
    Grundbuchamt_Eilenburg("U1305G"),

    /**
     * <b>Amtsgericht Grimma</b>
     *  * <p>
     *  *  Code: U1306
     *  * <p>
     *  * 
     */
    @JsonProperty("U1306")
    @XmlEnumValue("U1306")
    Amtsgericht_Grimma("U1306"),

    /**
     * <b>Grundbuchamt Grimma</b>
     *  * <p>
     *  *  Code: U1306G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1306G")
    @XmlEnumValue("U1306G")
    Grundbuchamt_Grimma("U1306G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Grimma (Zwst. der StA Leipzig)</b>
     *  * <p>
     *  *  Code: U1306S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1306S")
    @XmlEnumValue("U1306S")
    Staatsanwaltschaft_beim_Landgericht_Grimma_Zwst_der_StA_Leipzig("U1306S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht der Stadt Leipzig</b>
     *  * <p>
     *  *  Code: U1307
     *  * <p>
     *  * 
     */
    @JsonProperty("U1307")
    @XmlEnumValue("U1307")
    aufgeloest_Amtsgericht_der_Stadt_Leipzig("U1307"),

    /**
     * <b>Amtsgericht Leipzig</b>
     *  * <p>
     *  *  Code: U1308
     *  * <p>
     *  * 
     */
    @JsonProperty("U1308")
    @XmlEnumValue("U1308")
    Amtsgericht_Leipzig("U1308"),

    /**
     * <b>Grundbuchamt Leipzig</b>
     *  * <p>
     *  *  Code: U1308G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1308G")
    @XmlEnumValue("U1308G")
    Grundbuchamt_Leipzig("U1308G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Torgau Zweigstelle Oschatz</b>
     *  * <p>
     *  *  Code: U1309
     *  * <p>
     *  * 
     */
    @JsonProperty("U1309")
    @XmlEnumValue("U1309")
    aufgeloest_Amtsgericht_Torgau_Zweigstelle_Oschatz("U1309"),

    /**
     * <b>Amtsgericht Torgau</b>
     *  * <p>
     *  *  Code: U1310
     *  * <p>
     *  * 
     */
    @JsonProperty("U1310")
    @XmlEnumValue("U1310")
    Amtsgericht_Torgau("U1310"),

    /**
     * <b>Grundbuchamt Torgau</b>
     *  * <p>
     *  *  Code: U1310G
     *  * <p>
     *  * 
     */
    @JsonProperty("U1310G")
    @XmlEnumValue("U1310G")
    Grundbuchamt_Torgau("U1310G"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Torgau, Zwst. der StA Leipzig</b>
     *  * <p>
     *  *  Code: U1310S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1310S")
    @XmlEnumValue("U1310S")
    Staatsanwaltschaft_beim_Landgericht_Torgau_Zwst_der_StA_Leipzig("U1310S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Grimma Zweigstelle Wurzen</b>
     *  * <p>
     *  *  Code: U1311
     *  * <p>
     *  * 
     */
    @JsonProperty("U1311")
    @XmlEnumValue("U1311")
    aufgeloest_Amtsgericht_Grimma_Zweigstelle_Wurzen("U1311"),

    /**
     * <b>Amtsgericht Torgau, Zweigstelle Oschatz</b>
     *  * <p>
     *  *  Code: U1312
     *  * <p>
     *  * 
     */
    @JsonProperty("U1312")
    @XmlEnumValue("U1312")
    Amtsgericht_Torgau_Zweigstelle_Oschatz("U1312"),

    /**
     * <b>Landgericht Leipzig Strafvollstreckungskammer in Torgau</b>
     *  * <p>
     *  *  Code: U1330
     *  * <p>
     *  * 
     */
    @JsonProperty("U1330")
    @XmlEnumValue("U1330")
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Torgau("U1330"),

    /**
     * <b>Landgericht Leipzig Strafvollstreckungskammer in D&#246;beln</b>
     *  * <p>
     *  *  Code: U1340
     *  * <p>
     *  * 
     */
    @JsonProperty("U1340")
    @XmlEnumValue("U1340")
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Doebeln("U1340"),

    /**
     * <b>Landgericht Leipzig Strafvollstreckungskammer in Borna</b>
     *  * <p>
     *  *  Code: U1350
     *  * <p>
     *  * 
     */
    @JsonProperty("U1350")
    @XmlEnumValue("U1350")
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Borna("U1350"),

    /**
     * <b>aufgel&#246;st-Landgericht Bautzen Au&#223;enstelle des Landgerichts G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1400
     *  * <p>
     *  * 
     */
    @JsonProperty("U1400")
    @XmlEnumValue("U1400")
    aufgeloest_Landgericht_Bautzen_Aussenstelle_des_Landgerichts_Goerlitz("U1400"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft G&#246;rlitz, Zweigstelle Bautzen</b>
     *  * <p>
     *  *  Code: U1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1400S")
    @XmlEnumValue("U1400S")
    aufgeloest_Staatsanwaltschaft_Goerlitz_Zweigstelle_Bautzen("U1400S"),

    /**
     * <b>Landgericht G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1500
     *  * <p>
     *  * 
     */
    @JsonProperty("U1500")
    @XmlEnumValue("U1500")
    Landgericht_Goerlitz("U1500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1500S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1500S")
    @XmlEnumValue("U1500S")
    Staatsanwaltschaft_beim_Landgericht_Goerlitz("U1500S"),

    /**
     * <b>Landgericht Bautzen, Au&#223;enstelle Landgericht G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U1510
     *  * <p>
     *  * 
     */
    @JsonProperty("U1510")
    @XmlEnumValue("U1510")
    Landgericht_Bautzen_Aussenstelle_Landgericht_Goerlitz("U1510"),

    /**
     * <b>Staatsanwaltschaft G&#246;rlitz, Zweigstelle Bautzen</b>
     *  * <p>
     *  *  Code: U1510S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1510S")
    @XmlEnumValue("U1510S")
    Staatsanwaltschaft_Goerlitz_Zweigstelle_Bautzen("U1510S"),

    /**
     * <b>Landgericht Zwickau</b>
     *  * <p>
     *  *  Code: U1600
     *  * <p>
     *  * 
     */
    @JsonProperty("U1600")
    @XmlEnumValue("U1600")
    Landgericht_Zwickau("U1600"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Zwickau</b>
     *  * <p>
     *  *  Code: U1600S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1600S")
    @XmlEnumValue("U1600S")
    Staatsanwaltschaft_beim_Landgericht_Zwickau("U1600S"),

    /**
     * <b>Landgericht Zwickau Zweigstelle Plauen</b>
     *  * <p>
     *  *  Code: U1601
     *  * <p>
     *  * 
     */
    @JsonProperty("U1601")
    @XmlEnumValue("U1601")
    Landgericht_Zwickau_Zweigstelle_Plauen("U1601"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Plauen (Zwst. der StA Zwickau)</b>
     *  * <p>
     *  *  Code: U1601S
     *  * <p>
     *  * 
     */
    @JsonProperty("U1601S")
    @XmlEnumValue("U1601S")
    Staatsanwaltschaft_beim_Landgericht_Plauen_Zwst_der_StA_Zwickau("U1601S"),

    /**
     * <b>Justizvollzugsanstalt Leipzig mit Krankenhaus</b>
     *  * <p>
     *  *  Code: U6001
     *  * <p>
     *  * 
     */
    @JsonProperty("U6001")
    @XmlEnumValue("U6001")
    Justizvollzugsanstalt_Leipzig_mit_Krankenhaus("U6001"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Freistaates Sachsen</b>
     *  * <p>
     *  *  Code: U6008
     *  * <p>
     *  * 
     */
    @JsonProperty("U6008")
    @XmlEnumValue("U6008")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Freistaates_Sachsen("U6008"),

    /**
     * <b>Sozialgericht Dresden</b>
     *  * <p>
     *  *  Code: U6027
     *  * <p>
     *  * 
     */
    @JsonProperty("U6027")
    @XmlEnumValue("U6027")
    Sozialgericht_Dresden("U6027"),

    /**
     * <b>Jugendstrafvollzugsanstalt Regis-Breitingen</b>
     *  * <p>
     *  *  Code: U6269
     *  * <p>
     *  * 
     */
    @JsonProperty("U6269")
    @XmlEnumValue("U6269")
    Jugendstrafvollzugsanstalt_Regis_Breitingen("U6269"),

    /**
     * <b>Justizvollzugsanstalt Zeithain</b>
     *  * <p>
     *  *  Code: U6346
     *  * <p>
     *  * 
     */
    @JsonProperty("U6346")
    @XmlEnumValue("U6346")
    Justizvollzugsanstalt_Zeithain("U6346"),

    /**
     * <b>Justizvollzugsanstalt G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U6348
     *  * <p>
     *  * 
     */
    @JsonProperty("U6348")
    @XmlEnumValue("U6348")
    Justizvollzugsanstalt_Goerlitz("U6348"),

    /**
     * <b>Justizvollzugsanstalt Torgau</b>
     *  * <p>
     *  *  Code: U6350
     *  * <p>
     *  * 
     */
    @JsonProperty("U6350")
    @XmlEnumValue("U6350")
    Justizvollzugsanstalt_Torgau("U6350"),

    /**
     * <b>Arbeitsgericht Bautzen</b>
     *  * <p>
     *  *  Code: U6385
     *  * <p>
     *  * 
     */
    @JsonProperty("U6385")
    @XmlEnumValue("U6385")
    Arbeitsgericht_Bautzen("U6385"),

    /**
     * <b>Arbeitsgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U6386
     *  * <p>
     *  * 
     */
    @JsonProperty("U6386")
    @XmlEnumValue("U6386")
    Arbeitsgericht_Chemnitz("U6386"),

    /**
     * <b>Arbeitsgericht Dresden</b>
     *  * <p>
     *  *  Code: U6387
     *  * <p>
     *  * 
     */
    @JsonProperty("U6387")
    @XmlEnumValue("U6387")
    Arbeitsgericht_Dresden("U6387"),

    /**
     * <b>Arbeitsgericht Leipzig</b>
     *  * <p>
     *  *  Code: U6388
     *  * <p>
     *  * 
     */
    @JsonProperty("U6388")
    @XmlEnumValue("U6388")
    Arbeitsgericht_Leipzig("U6388"),

    /**
     * <b>Arbeitsgericht Zwickau</b>
     *  * <p>
     *  *  Code: U6389
     *  * <p>
     *  * 
     */
    @JsonProperty("U6389")
    @XmlEnumValue("U6389")
    Arbeitsgericht_Zwickau("U6389"),

    /**
     * <b>Arbeitsgericht Bautzen Au&#223;enkammern G&#246;rlitz</b>
     *  * <p>
     *  *  Code: U6390
     *  * <p>
     *  * 
     */
    @JsonProperty("U6390")
    @XmlEnumValue("U6390")
    Arbeitsgericht_Bautzen_Aussenkammern_Goerlitz("U6390"),

    /**
     * <b>S&#228;chsisches Oberverwaltungsgericht</b>
     *  * <p>
     *  *  Code: U6400
     *  * <p>
     *  * 
     */
    @JsonProperty("U6400")
    @XmlEnumValue("U6400")
    Saechsisches_Oberverwaltungsgericht("U6400"),

    /**
     * <b>Verwaltungsgericht Dresden Fachgerichtszentrum</b>
     *  * <p>
     *  *  Code: U6401
     *  * <p>
     *  * 
     */
    @JsonProperty("U6401")
    @XmlEnumValue("U6401")
    Verwaltungsgericht_Dresden_Fachgerichtszentrum("U6401"),

    /**
     * <b>Sozialgericht Leipzig</b>
     *  * <p>
     *  *  Code: U6409
     *  * <p>
     *  * 
     */
    @JsonProperty("U6409")
    @XmlEnumValue("U6409")
    Sozialgericht_Leipzig("U6409"),

    /**
     * <b>Sozialgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U6418
     *  * <p>
     *  * 
     */
    @JsonProperty("U6418")
    @XmlEnumValue("U6418")
    Sozialgericht_Chemnitz("U6418"),

    /**
     * <b>Verfassungsgerichtshof Sachsen</b>
     *  * <p>
     *  *  Code: U6435
     *  * <p>
     *  * 
     */
    @JsonProperty("U6435")
    @XmlEnumValue("U6435")
    Verfassungsgerichtshof_Sachsen("U6435"),

    /**
     * <b>Justizvollzugsanstalt Dresden</b>
     *  * <p>
     *  *  Code: U6862
     *  * <p>
     *  * 
     */
    @JsonProperty("U6862")
    @XmlEnumValue("U6862")
    Justizvollzugsanstalt_Dresden("U6862"),

    /**
     * <b>Verwaltungsgericht Chemnitz</b>
     *  * <p>
     *  *  Code: U8517
     *  * <p>
     *  * 
     */
    @JsonProperty("U8517")
    @XmlEnumValue("U8517")
    Verwaltungsgericht_Chemnitz("U8517"),

    /**
     * <b>S&#228;chsisches Landesarbeitsgericht</b>
     *  * <p>
     *  *  Code: U8550
     *  * <p>
     *  * 
     */
    @JsonProperty("U8550")
    @XmlEnumValue("U8550")
    Saechsisches_Landesarbeitsgericht("U8550"),

    /**
     * <b>Landessozialgericht Sachsen</b>
     *  * <p>
     *  *  Code: U8563
     *  * <p>
     *  * 
     */
    @JsonProperty("U8563")
    @XmlEnumValue("U8563")
    Landessozialgericht_Sachsen("U8563"),

    /**
     * <b>Bundesverwaltungsgericht</b>
     *  * <p>
     *  *  Code: U8572
     *  * <p>
     *  * 
     */
    @JsonProperty("U8572")
    @XmlEnumValue("U8572")
    Bundesverwaltungsgericht("U8572"),

    /**
     * <b>Justizvollzugsanstalt Bautzen</b>
     *  * <p>
     *  *  Code: U8594
     *  * <p>
     *  * 
     */
    @JsonProperty("U8594")
    @XmlEnumValue("U8594")
    Justizvollzugsanstalt_Bautzen("U8594"),

    /**
     * <b>Justizvollzugsanstalt Waldheim</b>
     *  * <p>
     *  *  Code: U8598
     *  * <p>
     *  * 
     */
    @JsonProperty("U8598")
    @XmlEnumValue("U8598")
    Justizvollzugsanstalt_Waldheim("U8598"),

    /**
     * <b>Verwaltungsgericht Leipzig</b>
     *  * <p>
     *  *  Code: U8613
     *  * <p>
     *  * 
     */
    @JsonProperty("U8613")
    @XmlEnumValue("U8613")
    Verwaltungsgericht_Leipzig("U8613"),

    /**
     * <b>S&#228;chsischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: U8616
     *  * <p>
     *  * 
     */
    @JsonProperty("U8616")
    @XmlEnumValue("U8616")
    Saechsischer_Anwaltsgerichtshof("U8616"),

    /**
     * <b>Justizvollzugsanstalt Chemnitz</b>
     *  * <p>
     *  *  Code: U8617
     *  * <p>
     *  * 
     */
    @JsonProperty("U8617")
    @XmlEnumValue("U8617")
    Justizvollzugsanstalt_Chemnitz("U8617"),

    /**
     * <b>S&#228;chsisches Finanzgericht</b>
     *  * <p>
     *  *  Code: U8647
     *  * <p>
     *  * 
     */
    @JsonProperty("U8647")
    @XmlEnumValue("U8647")
    Saechsisches_Finanzgericht("U8647"),

    /**
     * <b>Oberlandesgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V1000
     *  * <p>
     *  * 
     */
    @JsonProperty("V1000")
    @XmlEnumValue("V1000")
    Oberlandesgericht_Saarbruecken("V1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("V1000S")
    @XmlEnumValue("V1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Saarbruecken("V1000S"),

    /**
     * <b>Landgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V1100
     *  * <p>
     *  * 
     */
    @JsonProperty("V1100")
    @XmlEnumValue("V1100")
    Landgericht_Saarbruecken("V1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("V1100S")
    @XmlEnumValue("V1100S")
    Staatsanwaltschaft_beim_Landgericht_Saarbruecken("V1100S"),

    /**
     * <b>Amtsgericht Homburg Zweigstelle Blieskastel</b>
     *  * <p>
     *  *  Code: V1101
     *  * <p>
     *  * 
     */
    @JsonProperty("V1101")
    @XmlEnumValue("V1101")
    Amtsgericht_Homburg_Zweigstelle_Blieskastel("V1101"),

    /**
     * <b>Amtsgericht Homburg</b>
     *  * <p>
     *  *  Code: V1102
     *  * <p>
     *  * 
     */
    @JsonProperty("V1102")
    @XmlEnumValue("V1102")
    Amtsgericht_Homburg("V1102"),

    /**
     * <b>Amtsgericht Lebach</b>
     *  * <p>
     *  *  Code: V1103
     *  * <p>
     *  * 
     */
    @JsonProperty("V1103")
    @XmlEnumValue("V1103")
    Amtsgericht_Lebach("V1103"),

    /**
     * <b>Amtsgericht Merzig</b>
     *  * <p>
     *  *  Code: V1104
     *  * <p>
     *  * 
     */
    @JsonProperty("V1104")
    @XmlEnumValue("V1104")
    Amtsgericht_Merzig("V1104"),

    /**
     * <b>Amtsgericht Neunkirchen</b>
     *  * <p>
     *  *  Code: V1105
     *  * <p>
     *  * 
     */
    @JsonProperty("V1105")
    @XmlEnumValue("V1105")
    Amtsgericht_Neunkirchen("V1105"),

    /**
     * <b>aufgel&#246;st-Amtsgericht St. Wendel, Zwst. Nohfelden</b>
     *  * <p>
     *  *  Code: V1106
     *  * <p>
     *  * 
     */
    @JsonProperty("V1106")
    @XmlEnumValue("V1106")
    aufgeloest_Amtsgericht_St_Wendel_Zwst_Nohfelden("V1106"),

    /**
     * <b>Amtsgericht Ottweiler</b>
     *  * <p>
     *  *  Code: V1107
     *  * <p>
     *  * 
     */
    @JsonProperty("V1107")
    @XmlEnumValue("V1107")
    Amtsgericht_Ottweiler("V1107"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Perl</b>
     *  * <p>
     *  *  Code: V1108
     *  * <p>
     *  * 
     */
    @JsonProperty("V1108")
    @XmlEnumValue("V1108")
    aufgeloest_Amtsgericht_Perl("V1108"),

    /**
     * <b>Amtsgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V1109
     *  * <p>
     *  * 
     */
    @JsonProperty("V1109")
    @XmlEnumValue("V1109")
    Amtsgericht_Saarbruecken("V1109"),

    /**
     * <b>Amtsgericht Saarbr&#252;cken, Zentrales Vollstreckungsgericht Saarland</b>
     *  * <p>
     *  *  Code: V1109R
     *  * <p>
     *  * 
     */
    @JsonProperty("V1109R")
    @XmlEnumValue("V1109R")
    Amtsgericht_Saarbruecken_Zentrales_Vollstreckungsgericht_Saarland("V1109R"),

    /**
     * <b>Amtsgericht Saarbr&#252;cken Registergericht und Zwangsversteigerungsgericht</b>
     *  * <p>
     *  *  Code: V1109V
     *  * <p>
     *  * 
     */
    @JsonProperty("V1109V")
    @XmlEnumValue("V1109V")
    Amtsgericht_Saarbruecken_Registergericht_und_Zwangsversteigerungsgericht("V1109V"),

    /**
     * <b>Amtsgericht Saarlouis</b>
     *  * <p>
     *  *  Code: V1110
     *  * <p>
     *  * 
     */
    @JsonProperty("V1110")
    @XmlEnumValue("V1110")
    Amtsgericht_Saarlouis("V1110"),

    /**
     * <b>Amtsgericht St. Ingbert</b>
     *  * <p>
     *  *  Code: V1111
     *  * <p>
     *  * 
     */
    @JsonProperty("V1111")
    @XmlEnumValue("V1111")
    Amtsgericht_St_Ingbert("V1111"),

    /**
     * <b>Amtsgericht St. Wendel</b>
     *  * <p>
     *  *  Code: V1112
     *  * <p>
     *  * 
     */
    @JsonProperty("V1112")
    @XmlEnumValue("V1112")
    Amtsgericht_St_Wendel("V1112"),

    /**
     * <b>Amtsgericht Sulzbach</b>
     *  * <p>
     *  *  Code: V1113
     *  * <p>
     *  * 
     */
    @JsonProperty("V1113")
    @XmlEnumValue("V1113")
    Amtsgericht_Sulzbach("V1113"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Tholey</b>
     *  * <p>
     *  *  Code: V1114
     *  * <p>
     *  * 
     */
    @JsonProperty("V1114")
    @XmlEnumValue("V1114")
    aufgeloest_Amtsgericht_Tholey("V1114"),

    /**
     * <b>Amtsgericht V&#246;lklingen</b>
     *  * <p>
     *  *  Code: V1115
     *  * <p>
     *  * 
     */
    @JsonProperty("V1115")
    @XmlEnumValue("V1115")
    Amtsgericht_Voelklingen("V1115"),

    /**
     * <b>Amtsgericht Merzig Zweigstelle Wadern</b>
     *  * <p>
     *  *  Code: V1116
     *  * <p>
     *  * 
     */
    @JsonProperty("V1116")
    @XmlEnumValue("V1116")
    Amtsgericht_Merzig_Zweigstelle_Wadern("V1116"),

    /**
     * <b>Amtsgericht Neunkirchen Vereinsregister</b>
     *  * <p>
     *  *  Code: V1120
     *  * <p>
     *  * 
     */
    @JsonProperty("V1120")
    @XmlEnumValue("V1120")
    Amtsgericht_Neunkirchen_Vereinsregister("V1120"),

    /**
     * <b>Amtsgericht Saarlouis Vereinsregister</b>
     *  * <p>
     *  *  Code: V1121
     *  * <p>
     *  * 
     */
    @JsonProperty("V1121")
    @XmlEnumValue("V1121")
    Amtsgericht_Saarlouis_Vereinsregister("V1121"),

    /**
     * <b>Amtsgericht Homburg Vereinsregister</b>
     *  * <p>
     *  *  Code: V1122
     *  * <p>
     *  * 
     */
    @JsonProperty("V1122")
    @XmlEnumValue("V1122")
    Amtsgericht_Homburg_Vereinsregister("V1122"),

    /**
     * <b>Amtsgericht St. Ingbert Vereinsregister</b>
     *  * <p>
     *  *  Code: V1123
     *  * <p>
     *  * 
     */
    @JsonProperty("V1123")
    @XmlEnumValue("V1123")
    Amtsgericht_St_Ingbert_Vereinsregister("V1123"),

    /**
     * <b>Amtsgericht Ottweiler Vereinsregister</b>
     *  * <p>
     *  *  Code: V1124
     *  * <p>
     *  * 
     */
    @JsonProperty("V1124")
    @XmlEnumValue("V1124")
    Amtsgericht_Ottweiler_Vereinsregister("V1124"),

    /**
     * <b>Amtsgericht Lebach Vereinsregister</b>
     *  * <p>
     *  *  Code: V1125
     *  * <p>
     *  * 
     */
    @JsonProperty("V1125")
    @XmlEnumValue("V1125")
    Amtsgericht_Lebach_Vereinsregister("V1125"),

    /**
     * <b>Amtsgericht St. Wendel Vereinsregister</b>
     *  * <p>
     *  *  Code: V1126
     *  * <p>
     *  * 
     */
    @JsonProperty("V1126")
    @XmlEnumValue("V1126")
    Amtsgericht_St_Wendel_Vereinsregister("V1126"),

    /**
     * <b>Amtsgericht Merzig Vereinsregister</b>
     *  * <p>
     *  *  Code: V1127
     *  * <p>
     *  * 
     */
    @JsonProperty("V1127")
    @XmlEnumValue("V1127")
    Amtsgericht_Merzig_Vereinsregister("V1127"),

    /**
     * <b>Amtsgericht V&#246;lklingen Vereinsregister</b>
     *  * <p>
     *  *  Code: V1128
     *  * <p>
     *  * 
     */
    @JsonProperty("V1128")
    @XmlEnumValue("V1128")
    Amtsgericht_Voelklingen_Vereinsregister("V1128"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Neunkirchen</b>
     *  * <p>
     *  *  Code: V6011
     *  * <p>
     *  * 
     */
    @JsonProperty("V6011")
    @XmlEnumValue("V6011")
    aufgeloest_Arbeitsgericht_Neunkirchen("V6011"),

    /**
     * <b>Finanzgericht des Saarlandes</b>
     *  * <p>
     *  *  Code: V6012
     *  * <p>
     *  * 
     */
    @JsonProperty("V6012")
    @XmlEnumValue("V6012")
    Finanzgericht_des_Saarlandes("V6012"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Saarlouis</b>
     *  * <p>
     *  *  Code: V6013
     *  * <p>
     *  * 
     */
    @JsonProperty("V6013")
    @XmlEnumValue("V6013")
    aufgeloest_Arbeitsgericht_Saarlouis("V6013"),

    /**
     * <b>Verfassungsgerichtshof des Saarlandes</b>
     *  * <p>
     *  *  Code: V6014
     *  * <p>
     *  * 
     */
    @JsonProperty("V6014")
    @XmlEnumValue("V6014")
    Verfassungsgerichtshof_des_Saarlandes("V6014"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V6033
     *  * <p>
     *  * 
     */
    @JsonProperty("V6033")
    @XmlEnumValue("V6033")
    aufgeloest_Arbeitsgericht_Saarbruecken("V6033"),

    /**
     * <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Saarlandes</b>
     *  * <p>
     *  *  Code: V6040
     *  * <p>
     *  * 
     */
    @JsonProperty("V6040")
    @XmlEnumValue("V6040")
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Saarlandes("V6040"),

    /**
     * <b>Landessozialgericht f&#252;r das Saarland</b>
     *  * <p>
     *  *  Code: V6042
     *  * <p>
     *  * 
     */
    @JsonProperty("V6042")
    @XmlEnumValue("V6042")
    Landessozialgericht_fuer_das_Saarland("V6042"),

    /**
     * <b>Landesarbeitsgericht Saarland</b>
     *  * <p>
     *  *  Code: V6043
     *  * <p>
     *  * 
     */
    @JsonProperty("V6043")
    @XmlEnumValue("V6043")
    Landesarbeitsgericht_Saarland("V6043"),

    /**
     * <b>Oberverwaltungsgericht des Saarlandes</b>
     *  * <p>
     *  *  Code: V6045
     *  * <p>
     *  * 
     */
    @JsonProperty("V6045")
    @XmlEnumValue("V6045")
    Oberverwaltungsgericht_des_Saarlandes("V6045"),

    /**
     * <b>Sozialgericht f&#252;r das Saarland</b>
     *  * <p>
     *  *  Code: V6046
     *  * <p>
     *  * 
     */
    @JsonProperty("V6046")
    @XmlEnumValue("V6046")
    Sozialgericht_fuer_das_Saarland("V6046"),

    /**
     * <b>Verwaltungsgericht des Saarlandes Saarlouis</b>
     *  * <p>
     *  *  Code: V6051
     *  * <p>
     *  * 
     */
    @JsonProperty("V6051")
    @XmlEnumValue("V6051")
    Verwaltungsgericht_des_Saarlandes_Saarlouis("V6051"),

    /**
     * <b>Saarl&#228;ndischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: V6054
     *  * <p>
     *  * 
     */
    @JsonProperty("V6054")
    @XmlEnumValue("V6054")
    Saarlaendischer_Anwaltsgerichtshof("V6054"),

    /**
     * <b>Justizvollzugsanstalt Saarbr&#252;cken</b>
     *  * <p>
     *  *  Code: V6067
     *  * <p>
     *  * 
     */
    @JsonProperty("V6067")
    @XmlEnumValue("V6067")
    Justizvollzugsanstalt_Saarbruecken("V6067"),

    /**
     * <b>Jugendarrestanstalt Lebach</b>
     *  * <p>
     *  *  Code: V6080
     *  * <p>
     *  * 
     */
    @JsonProperty("V6080")
    @XmlEnumValue("V6080")
    Jugendarrestanstalt_Lebach("V6080"),

    /**
     * <b>Justizvollzugsanstalt Ottweiler</b>
     *  * <p>
     *  *  Code: V6216
     *  * <p>
     *  * 
     */
    @JsonProperty("V6216")
    @XmlEnumValue("V6216")
    Justizvollzugsanstalt_Ottweiler("V6216"),

    /**
     * <b>Arbeitsgericht Saarland</b>
     *  * <p>
     *  *  Code: V6234
     *  * <p>
     *  * 
     */
    @JsonProperty("V6234")
    @XmlEnumValue("V6234")
    Arbeitsgericht_Saarland("V6234"),

    /**
     * <b>Kompetenzzentrum der Justiz f&#252;r ambulante Resozialisierung und Opferhilfe</b>
     *  * <p>
     *  *  Code: V6240
     *  * <p>
     *  * 
     */
    @JsonProperty("V6240")
    @XmlEnumValue("V6240")
    Kompetenzzentrum_der_Justiz_fuer_ambulante_Resozialisierung_und_Opferhilfe("V6240"),

    /**
     * <b>Oberlandesgericht Naumburg</b>
     *  * <p>
     *  *  Code: W1000
     *  * <p>
     *  * 
     */
    @JsonProperty("W1000")
    @XmlEnumValue("W1000")
    Oberlandesgericht_Naumburg("W1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Naumburg</b>
     *  * <p>
     *  *  Code: W1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1000S")
    @XmlEnumValue("W1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Naumburg("W1000S"),

    /**
     * <b>Landgericht Halle</b>
     *  * <p>
     *  *  Code: W1100
     *  * <p>
     *  * 
     */
    @JsonProperty("W1100")
    @XmlEnumValue("W1100")
    Landgericht_Halle("W1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Halle</b>
     *  * <p>
     *  *  Code: W1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1100S")
    @XmlEnumValue("W1100S")
    Staatsanwaltschaft_beim_Landgericht_Halle("W1100S"),

    /**
     * <b>Amtsgericht Aschersleben</b>
     *  * <p>
     *  *  Code: W1101
     *  * <p>
     *  * 
     */
    @JsonProperty("W1101")
    @XmlEnumValue("W1101")
    Amtsgericht_Aschersleben("W1101"),

    /**
     * <b>Amtsgericht Bernburg</b>
     *  * <p>
     *  *  Code: W1102
     *  * <p>
     *  * 
     */
    @JsonProperty("W1102")
    @XmlEnumValue("W1102")
    Amtsgericht_Bernburg("W1102"),

    /**
     * <b>Amtsgericht Bitterfeld-Wolfen</b>
     *  * <p>
     *  *  Code: W1103
     *  * <p>
     *  * 
     */
    @JsonProperty("W1103")
    @XmlEnumValue("W1103")
    Amtsgericht_Bitterfeld_Wolfen("W1103"),

    /**
     * <b>Amtsgericht Dessau-Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W1104
     *  * <p>
     *  * 
     */
    @JsonProperty("W1104")
    @XmlEnumValue("W1104")
    Amtsgericht_Dessau_Rosslau("W1104"),

    /**
     * <b>Amtsgericht Dessau-Ro&#223;lau, Zentrales Vollstreckungsgericht Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W1104R
     *  * <p>
     *  * 
     */
    @JsonProperty("W1104R")
    @XmlEnumValue("W1104R")
    Amtsgericht_Dessau_Rosslau_Zentrales_Vollstreckungsgericht_Sachsen_Anhalt("W1104R"),

    /**
     * <b>Amtsgericht Eisleben</b>
     *  * <p>
     *  *  Code: W1105
     *  * <p>
     *  * 
     */
    @JsonProperty("W1105")
    @XmlEnumValue("W1105")
    Amtsgericht_Eisleben("W1105"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gr&#228;fenhainichen</b>
     *  * <p>
     *  *  Code: W1106
     *  * <p>
     *  * 
     */
    @JsonProperty("W1106")
    @XmlEnumValue("W1106")
    aufgeloest_Amtsgericht_Graefenhainichen("W1106"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Halle, Stadt</b>
     *  * <p>
     *  *  Code: W1107
     *  * <p>
     *  * 
     */
    @JsonProperty("W1107")
    @XmlEnumValue("W1107")
    aufgeloest_Amtsgericht_Halle_Stadt("W1107"),

    /**
     * <b>Amtsgericht Halle (Saale)</b>
     *  * <p>
     *  *  Code: W1109
     *  * <p>
     *  * 
     */
    @JsonProperty("W1109")
    @XmlEnumValue("W1109")
    Amtsgericht_Halle_Saale("W1109"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hettstedt</b>
     *  * <p>
     *  *  Code: W1110
     *  * <p>
     *  * 
     */
    @JsonProperty("W1110")
    @XmlEnumValue("W1110")
    aufgeloest_Amtsgericht_Hettstedt("W1110"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hohenm&#246;lsen</b>
     *  * <p>
     *  *  Code: W1111
     *  * <p>
     *  * 
     */
    @JsonProperty("W1111")
    @XmlEnumValue("W1111")
    aufgeloest_Amtsgericht_Hohenmoelsen("W1111"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Jessen (in Annaburg)</b>
     *  * <p>
     *  *  Code: W1112
     *  * <p>
     *  * 
     */
    @JsonProperty("W1112")
    @XmlEnumValue("W1112")
    aufgeloest_Amtsgericht_Jessen_in_Annaburg("W1112"),

    /**
     * <b>Amtsgericht K&#246;then</b>
     *  * <p>
     *  *  Code: W1113
     *  * <p>
     *  * 
     */
    @JsonProperty("W1113")
    @XmlEnumValue("W1113")
    Amtsgericht_Koethen("W1113"),

    /**
     * <b>Amtsgericht Merseburg</b>
     *  * <p>
     *  *  Code: W1114
     *  * <p>
     *  * 
     */
    @JsonProperty("W1114")
    @XmlEnumValue("W1114")
    Amtsgericht_Merseburg("W1114"),

    /**
     * <b>Amtsgericht Naumburg</b>
     *  * <p>
     *  *  Code: W1115
     *  * <p>
     *  * 
     */
    @JsonProperty("W1115")
    @XmlEnumValue("W1115")
    Amtsgericht_Naumburg("W1115"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Naumburg, Zwst. der StA Halle</b>
     *  * <p>
     *  *  Code: W1115S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1115S")
    @XmlEnumValue("W1115S")
    Staatsanwaltschaft_beim_Landgericht_Naumburg_Zwst_der_StA_Halle("W1115S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Nebra</b>
     *  * <p>
     *  *  Code: W1116
     *  * <p>
     *  * 
     */
    @JsonProperty("W1116")
    @XmlEnumValue("W1116")
    aufgeloest_Amtsgericht_Nebra("W1116"),

    /**
     * <b>Amtsgericht Quedlinburg</b>
     *  * <p>
     *  *  Code: W1117
     *  * <p>
     *  * 
     */
    @JsonProperty("W1117")
    @XmlEnumValue("W1117")
    Amtsgericht_Quedlinburg("W1117"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Querfurt</b>
     *  * <p>
     *  *  Code: W1118
     *  * <p>
     *  * 
     */
    @JsonProperty("W1118")
    @XmlEnumValue("W1118")
    aufgeloest_Amtsgericht_Querfurt("W1118"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W1119
     *  * <p>
     *  * 
     */
    @JsonProperty("W1119")
    @XmlEnumValue("W1119")
    aufgeloest_Amtsgericht_Rosslau("W1119"),

    /**
     * <b>Amtsgericht Sangerhausen</b>
     *  * <p>
     *  *  Code: W1120
     *  * <p>
     *  * 
     */
    @JsonProperty("W1120")
    @XmlEnumValue("W1120")
    Amtsgericht_Sangerhausen("W1120"),

    /**
     * <b>Amtsgericht Wei&#223;enfels</b>
     *  * <p>
     *  *  Code: W1121
     *  * <p>
     *  * 
     */
    @JsonProperty("W1121")
    @XmlEnumValue("W1121")
    Amtsgericht_Weissenfels("W1121"),

    /**
     * <b>Amtsgericht Wittenberg</b>
     *  * <p>
     *  *  Code: W1122
     *  * <p>
     *  * 
     */
    @JsonProperty("W1122")
    @XmlEnumValue("W1122")
    Amtsgericht_Wittenberg("W1122"),

    /**
     * <b>Amtsgericht Zeitz</b>
     *  * <p>
     *  *  Code: W1123
     *  * <p>
     *  * 
     */
    @JsonProperty("W1123")
    @XmlEnumValue("W1123")
    Amtsgericht_Zeitz("W1123"),

    /**
     * <b>Amtsgericht Aschersleben Dienstgeb&#228;ude Sta&#223;furt</b>
     *  * <p>
     *  *  Code: W1124
     *  * <p>
     *  * 
     */
    @JsonProperty("W1124")
    @XmlEnumValue("W1124")
    Amtsgericht_Aschersleben_Dienstgebaeude_Stassfurt("W1124"),

    /**
     * <b>Landgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W1200
     *  * <p>
     *  * 
     */
    @JsonProperty("W1200")
    @XmlEnumValue("W1200")
    Landgericht_Magdeburg("W1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1200S")
    @XmlEnumValue("W1200S")
    Staatsanwaltschaft_beim_Landgericht_Magdeburg("W1200S"),

    /**
     * <b>Amtsgericht Burg</b>
     *  * <p>
     *  *  Code: W1201
     *  * <p>
     *  * 
     */
    @JsonProperty("W1201")
    @XmlEnumValue("W1201")
    Amtsgericht_Burg("W1201"),

    /**
     * <b>Amtsgericht Gardelegen</b>
     *  * <p>
     *  *  Code: W1202
     *  * <p>
     *  * 
     */
    @JsonProperty("W1202")
    @XmlEnumValue("W1202")
    Amtsgericht_Gardelegen("W1202"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Genthin</b>
     *  * <p>
     *  *  Code: W1203
     *  * <p>
     *  * 
     */
    @JsonProperty("W1203")
    @XmlEnumValue("W1203")
    aufgeloest_Amtsgericht_Genthin("W1203"),

    /**
     * <b>Amtsgericht Halberstadt</b>
     *  * <p>
     *  *  Code: W1204
     *  * <p>
     *  * 
     */
    @JsonProperty("W1204")
    @XmlEnumValue("W1204")
    Amtsgericht_Halberstadt("W1204"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Halberstadt, Zwst. der StA Magdeburg</b>
     *  * <p>
     *  *  Code: W1204S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1204S")
    @XmlEnumValue("W1204S")
    Staatsanwaltschaft_beim_Landgericht_Halberstadt_Zwst_der_StA_Magdeburg("W1204S"),

    /**
     * <b>Amtsgericht Haldensleben</b>
     *  * <p>
     *  *  Code: W1205
     *  * <p>
     *  * 
     */
    @JsonProperty("W1205")
    @XmlEnumValue("W1205")
    Amtsgericht_Haldensleben("W1205"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Havelberg</b>
     *  * <p>
     *  *  Code: W1206
     *  * <p>
     *  * 
     */
    @JsonProperty("W1206")
    @XmlEnumValue("W1206")
    aufgeloest_Amtsgericht_Havelberg("W1206"),

    /**
     * <b>aufgel&#246;st-Kreisgericht Gardelegen (vormals Kalbe/Milde)</b>
     *  * <p>
     *  *  Code: W1207
     *  * <p>
     *  * 
     */
    @JsonProperty("W1207")
    @XmlEnumValue("W1207")
    aufgeloest_Kreisgericht_Gardelegen_vormals_Kalbe_Milde("W1207"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kl&#246;tze</b>
     *  * <p>
     *  *  Code: W1208
     *  * <p>
     *  * 
     */
    @JsonProperty("W1208")
    @XmlEnumValue("W1208")
    aufgeloest_Amtsgericht_Kloetze("W1208"),

    /**
     * <b>Amtsgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W1209
     *  * <p>
     *  * 
     */
    @JsonProperty("W1209")
    @XmlEnumValue("W1209")
    Amtsgericht_Magdeburg("W1209"),

    /**
     * <b>Amtsgericht Oschersleben</b>
     *  * <p>
     *  *  Code: W1210
     *  * <p>
     *  * 
     */
    @JsonProperty("W1210")
    @XmlEnumValue("W1210")
    Amtsgericht_Oschersleben("W1210"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Osterburg</b>
     *  * <p>
     *  *  Code: W1211
     *  * <p>
     *  * 
     */
    @JsonProperty("W1211")
    @XmlEnumValue("W1211")
    aufgeloest_Amtsgericht_Osterburg("W1211"),

    /**
     * <b>Amtsgericht Salzwedel</b>
     *  * <p>
     *  *  Code: W1212
     *  * <p>
     *  * 
     */
    @JsonProperty("W1212")
    @XmlEnumValue("W1212")
    Amtsgericht_Salzwedel("W1212"),

    /**
     * <b>Amtsgericht Sch&#246;nebeck</b>
     *  * <p>
     *  *  Code: W1213
     *  * <p>
     *  * 
     */
    @JsonProperty("W1213")
    @XmlEnumValue("W1213")
    Amtsgericht_Schoenebeck("W1213"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sta&#223;furt</b>
     *  * <p>
     *  *  Code: W1214
     *  * <p>
     *  * 
     */
    @JsonProperty("W1214")
    @XmlEnumValue("W1214")
    aufgeloest_Amtsgericht_Stassfurt("W1214"),

    /**
     * <b>Amtsgericht Stendal</b>
     *  * <p>
     *  *  Code: W1215
     *  * <p>
     *  * 
     */
    @JsonProperty("W1215")
    @XmlEnumValue("W1215")
    Amtsgericht_Stendal("W1215"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wanzleben</b>
     *  * <p>
     *  *  Code: W1217
     *  * <p>
     *  * 
     */
    @JsonProperty("W1217")
    @XmlEnumValue("W1217")
    aufgeloest_Amtsgericht_Wanzleben("W1217"),

    /**
     * <b>Amtsgericht Wernigerode</b>
     *  * <p>
     *  *  Code: W1218
     *  * <p>
     *  * 
     */
    @JsonProperty("W1218")
    @XmlEnumValue("W1218")
    Amtsgericht_Wernigerode("W1218"),

    /**
     * <b>Amtsgericht Haldensleben Zweigstelle Wolmirstedt</b>
     *  * <p>
     *  *  Code: W1219
     *  * <p>
     *  * 
     */
    @JsonProperty("W1219")
    @XmlEnumValue("W1219")
    Amtsgericht_Haldensleben_Zweigstelle_Wolmirstedt("W1219"),

    /**
     * <b>Amtsgericht Zerbst</b>
     *  * <p>
     *  *  Code: W1220
     *  * <p>
     *  * 
     */
    @JsonProperty("W1220")
    @XmlEnumValue("W1220")
    Amtsgericht_Zerbst("W1220"),

    /**
     * <b>Landgericht Dessau-Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W1300
     *  * <p>
     *  * 
     */
    @JsonProperty("W1300")
    @XmlEnumValue("W1300")
    Landgericht_Dessau_Rosslau("W1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Dessau-Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1300S")
    @XmlEnumValue("W1300S")
    Staatsanwaltschaft_beim_Landgericht_Dessau_Rosslau("W1300S"),

    /**
     * <b>Landgericht Stendal</b>
     *  * <p>
     *  *  Code: W1400
     *  * <p>
     *  * 
     */
    @JsonProperty("W1400")
    @XmlEnumValue("W1400")
    Landgericht_Stendal("W1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Stendal</b>
     *  * <p>
     *  *  Code: W1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("W1400S")
    @XmlEnumValue("W1400S")
    Staatsanwaltschaft_beim_Landgericht_Stendal("W1400S"),

    /**
     * <b>Landgericht Stendal Ausw&#228;rtige Strafvollstreckungskammer</b>
     *  * <p>
     *  *  Code: W1430
     *  * <p>
     *  * 
     */
    @JsonProperty("W1430")
    @XmlEnumValue("W1430")
    Landgericht_Stendal_Auswaertige_Strafvollstreckungskammer("W1430"),

    /**
     * <b>Landgericht Halle Ausw&#228;rtige Strafvollstreckungskammer bei dem Amtsgericht Naumburg</b>
     *  * <p>
     *  *  Code: W1500
     *  * <p>
     *  * 
     */
    @JsonProperty("W1500")
    @XmlEnumValue("W1500")
    Landgericht_Halle_Auswaertige_Strafvollstreckungskammer_bei_dem_Amtsgericht_Naumburg("W1500"),

    /**
     * <b>Anwaltsgericht im Bezirk der Rechtsanwaltskammer des Landes Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6008
     *  * <p>
     *  * 
     */
    @JsonProperty("W6008")
    @XmlEnumValue("W6008")
    Anwaltsgericht_im_Bezirk_der_Rechtsanwaltskammer_des_Landes_Sachsen_Anhalt("W6008"),

    /**
     * <b>Anwaltsgerichtshof des Landes Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6009
     *  * <p>
     *  * 
     */
    @JsonProperty("W6009")
    @XmlEnumValue("W6009")
    Anwaltsgerichtshof_des_Landes_Sachsen_Anhalt("W6009"),

    /**
     * <b>Ministerium f&#252;r Justiz und Gleichstellung des Landes Sachsen-Anhalt, Magdeburg</b>
     *  * <p>
     *  *  Code: W6118
     *  * <p>
     *  * 
     */
    @JsonProperty("W6118")
    @XmlEnumValue("W6118")
    Ministerium_fuer_Justiz_und_Gleichstellung_des_Landes_Sachsen_Anhalt_Magdeburg("W6118"),

    /**
     * <b>Justizvollzugsanstalt Volkstedt</b>
     *  * <p>
     *  *  Code: W6235
     *  * <p>
     *  * 
     */
    @JsonProperty("W6235")
    @XmlEnumValue("W6235")
    Justizvollzugsanstalt_Volkstedt("W6235"),

    /**
     * <b>aufgel&#246;st-Verwaltungsgericht Dessau</b>
     *  * <p>
     *  *  Code: W6289
     *  * <p>
     *  * 
     */
    @JsonProperty("W6289")
    @XmlEnumValue("W6289")
    aufgeloest_Verwaltungsgericht_Dessau("W6289"),

    /**
     * <b>Verwaltungsgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W6294
     *  * <p>
     *  * 
     */
    @JsonProperty("W6294")
    @XmlEnumValue("W6294")
    Verwaltungsgericht_Magdeburg("W6294"),

    /**
     * <b>Justizvollzugsanstalt Halle</b>
     *  * <p>
     *  *  Code: W6373
     *  * <p>
     *  * 
     */
    @JsonProperty("W6373")
    @XmlEnumValue("W6373")
    Justizvollzugsanstalt_Halle("W6373"),

    /**
     * <b>Arbeitsgericht Halle</b>
     *  * <p>
     *  *  Code: W6377
     *  * <p>
     *  * 
     */
    @JsonProperty("W6377")
    @XmlEnumValue("W6377")
    Arbeitsgericht_Halle("W6377"),

    /**
     * <b>Jugendanstalt Ra&#223;nitz</b>
     *  * <p>
     *  *  Code: W6424
     *  * <p>
     *  * 
     */
    @JsonProperty("W6424")
    @XmlEnumValue("W6424")
    Jugendanstalt_Rassnitz("W6424"),

    /**
     * <b>Oberverwaltungsgericht des Landes Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6438
     *  * <p>
     *  * 
     */
    @JsonProperty("W6438")
    @XmlEnumValue("W6438")
    Oberverwaltungsgericht_des_Landes_Sachsen_Anhalt("W6438"),

    /**
     * <b>Justizvollzugsanstalt Burg</b>
     *  * <p>
     *  *  Code: W6445
     *  * <p>
     *  * 
     */
    @JsonProperty("W6445")
    @XmlEnumValue("W6445")
    Justizvollzugsanstalt_Burg("W6445"),

    /**
     * <b>Landesarbeitsgericht Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6453
     *  * <p>
     *  * 
     */
    @JsonProperty("W6453")
    @XmlEnumValue("W6453")
    Landesarbeitsgericht_Sachsen_Anhalt("W6453"),

    /**
     * <b>Arbeitsgericht Dessau-Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W6454
     *  * <p>
     *  * 
     */
    @JsonProperty("W6454")
    @XmlEnumValue("W6454")
    Arbeitsgericht_Dessau_Rosslau("W6454"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Halberstadt</b>
     *  * <p>
     *  *  Code: W6455
     *  * <p>
     *  * 
     */
    @JsonProperty("W6455")
    @XmlEnumValue("W6455")
    aufgeloest_Arbeitsgericht_Halberstadt("W6455"),

    /**
     * <b>Arbeitsgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W6458
     *  * <p>
     *  * 
     */
    @JsonProperty("W6458")
    @XmlEnumValue("W6458")
    Arbeitsgericht_Magdeburg("W6458"),

    /**
     * <b>aufgel&#246;st-Arbeitsgericht Naumburg</b>
     *  * <p>
     *  *  Code: W6459
     *  * <p>
     *  * 
     */
    @JsonProperty("W6459")
    @XmlEnumValue("W6459")
    aufgeloest_Arbeitsgericht_Naumburg("W6459"),

    /**
     * <b>Arbeitsgericht Stendal</b>
     *  * <p>
     *  *  Code: W6460
     *  * <p>
     *  * 
     */
    @JsonProperty("W6460")
    @XmlEnumValue("W6460")
    Arbeitsgericht_Stendal("W6460"),

    /**
     * <b>Verwaltungsgericht Halle</b>
     *  * <p>
     *  *  Code: W6464
     *  * <p>
     *  * 
     */
    @JsonProperty("W6464")
    @XmlEnumValue("W6464")
    Verwaltungsgericht_Halle("W6464"),

    /**
     * <b>Finanzgericht des Landes Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6467
     *  * <p>
     *  * 
     */
    @JsonProperty("W6467")
    @XmlEnumValue("W6467")
    Finanzgericht_des_Landes_Sachsen_Anhalt("W6467"),

    /**
     * <b>Landessozialgericht Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6468
     *  * <p>
     *  * 
     */
    @JsonProperty("W6468")
    @XmlEnumValue("W6468")
    Landessozialgericht_Sachsen_Anhalt("W6468"),

    /**
     * <b>Sozialgericht Dessau-Ro&#223;lau</b>
     *  * <p>
     *  *  Code: W6469
     *  * <p>
     *  * 
     */
    @JsonProperty("W6469")
    @XmlEnumValue("W6469")
    Sozialgericht_Dessau_Rosslau("W6469"),

    /**
     * <b>Sozialgericht Halle</b>
     *  * <p>
     *  *  Code: W6470
     *  * <p>
     *  * 
     */
    @JsonProperty("W6470")
    @XmlEnumValue("W6470")
    Sozialgericht_Halle("W6470"),

    /**
     * <b>Sozialgericht Magdeburg</b>
     *  * <p>
     *  *  Code: W6471
     *  * <p>
     *  * 
     */
    @JsonProperty("W6471")
    @XmlEnumValue("W6471")
    Sozialgericht_Magdeburg("W6471"),

    /**
     * <b>aufgel&#246;st-Sozialgericht Stendal</b>
     *  * <p>
     *  *  Code: W6472
     *  * <p>
     *  * 
     */
    @JsonProperty("W6472")
    @XmlEnumValue("W6472")
    aufgeloest_Sozialgericht_Stendal("W6472"),

    /**
     * <b>Landesverfassungsgericht Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6488
     *  * <p>
     *  * 
     */
    @JsonProperty("W6488")
    @XmlEnumValue("W6488")
    Landesverfassungsgericht_Sachsen_Anhalt("W6488"),

    /**
     * <b>Dienstgericht f&#252;r Richter Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6632
     *  * <p>
     *  * 
     */
    @JsonProperty("W6632")
    @XmlEnumValue("W6632")
    Dienstgericht_fuer_Richter_Sachsen_Anhalt("W6632"),

    /**
     * <b>Landesberufsgericht f&#252;r Heilberufe Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6633
     *  * <p>
     *  * 
     */
    @JsonProperty("W6633")
    @XmlEnumValue("W6633")
    Landesberufsgericht_fuer_Heilberufe_Sachsen_Anhalt("W6633"),

    /**
     * <b>Berufsgerichtshof der Ingenieurkammer Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6634
     *  * <p>
     *  * 
     */
    @JsonProperty("W6634")
    @XmlEnumValue("W6634")
    Berufsgerichtshof_der_Ingenieurkammer_Sachsen_Anhalt("W6634"),

    /**
     * <b>Richterdienstgericht Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6635
     *  * <p>
     *  * 
     */
    @JsonProperty("W6635")
    @XmlEnumValue("W6635")
    Richterdienstgericht_Sachsen_Anhalt("W6635"),

    /**
     * <b>Berufsgericht f&#252;r Heilberufe Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6636
     *  * <p>
     *  * 
     */
    @JsonProperty("W6636")
    @XmlEnumValue("W6636")
    Berufsgericht_fuer_Heilberufe_Sachsen_Anhalt("W6636"),

    /**
     * <b>Berufsgericht der Ingenieurkammer Sachsen-Anhalt</b>
     *  * <p>
     *  *  Code: W6637
     *  * <p>
     *  * 
     */
    @JsonProperty("W6637")
    @XmlEnumValue("W6637")
    Berufsgericht_der_Ingenieurkammer_Sachsen_Anhalt("W6637"),

    /**
     * <b>Oberlandesgericht Schleswig</b>
     *  * <p>
     *  *  Code: X1000
     *  * <p>
     *  * 
     */
    @JsonProperty("X1000")
    @XmlEnumValue("X1000")
    Oberlandesgericht_Schleswig("X1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Schleswig</b>
     *  * <p>
     *  *  Code: X1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("X1000S")
    @XmlEnumValue("X1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Schleswig("X1000S"),

    /**
     * <b>Landgericht Flensburg</b>
     *  * <p>
     *  *  Code: X1100
     *  * <p>
     *  * 
     */
    @JsonProperty("X1100")
    @XmlEnumValue("X1100")
    Landgericht_Flensburg("X1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Flensburg</b>
     *  * <p>
     *  *  Code: X1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("X1100S")
    @XmlEnumValue("X1100S")
    Staatsanwaltschaft_beim_Landgericht_Flensburg("X1100S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bredstedt</b>
     *  * <p>
     *  *  Code: X1111
     *  * <p>
     *  * 
     */
    @JsonProperty("X1111")
    @XmlEnumValue("X1111")
    aufgeloest_Amtsgericht_Bredstedt("X1111"),

    /**
     * <b>Amtsgericht Flensburg</b>
     *  * <p>
     *  *  Code: X1112
     *  * <p>
     *  * 
     */
    @JsonProperty("X1112")
    @XmlEnumValue("X1112")
    Amtsgericht_Flensburg("X1112"),

    /**
     * <b>Grundbuchamt Flensburg</b>
     *  * <p>
     *  *  Code: X1112G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1112G")
    @XmlEnumValue("X1112G")
    Grundbuchamt_Flensburg("X1112G"),

    /**
     * <b>Registergericht Amtsgericht Flensburg</b>
     *  * <p>
     *  *  Code: X1112R
     *  * <p>
     *  * 
     */
    @JsonProperty("X1112R")
    @XmlEnumValue("X1112R")
    Registergericht_Amtsgericht_Flensburg("X1112R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Friedrichstadt</b>
     *  * <p>
     *  *  Code: X1113
     *  * <p>
     *  * 
     */
    @JsonProperty("X1113")
    @XmlEnumValue("X1113")
    aufgeloest_Amtsgericht_Friedrichstadt("X1113"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Heide</b>
     *  * <p>
     *  *  Code: X1114
     *  * <p>
     *  * 
     */
    @JsonProperty("X1114")
    @XmlEnumValue("X1114")
    aufgeloest_Amtsgericht_Heide("X1114"),

    /**
     * <b>Amtsgericht Husum</b>
     *  * <p>
     *  *  Code: X1115
     *  * <p>
     *  * 
     */
    @JsonProperty("X1115")
    @XmlEnumValue("X1115")
    Amtsgericht_Husum("X1115"),

    /**
     * <b>Grundbuchamt Husum</b>
     *  * <p>
     *  *  Code: X1115G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1115G")
    @XmlEnumValue("X1115G")
    Grundbuchamt_Husum("X1115G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kappeln</b>
     *  * <p>
     *  *  Code: X1116
     *  * <p>
     *  * 
     */
    @JsonProperty("X1116")
    @XmlEnumValue("X1116")
    aufgeloest_Amtsgericht_Kappeln("X1116"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Leck</b>
     *  * <p>
     *  *  Code: X1117
     *  * <p>
     *  * 
     */
    @JsonProperty("X1117")
    @XmlEnumValue("X1117")
    aufgeloest_Amtsgericht_Leck("X1117"),

    /**
     * <b>Amtsgericht Nieb&#252;ll</b>
     *  * <p>
     *  *  Code: X1118
     *  * <p>
     *  * 
     */
    @JsonProperty("X1118")
    @XmlEnumValue("X1118")
    Amtsgericht_Niebuell("X1118"),

    /**
     * <b>Grundbuchamt Nieb&#252;ll</b>
     *  * <p>
     *  *  Code: X1118G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1118G")
    @XmlEnumValue("X1118G")
    Grundbuchamt_Niebuell("X1118G"),

    /**
     * <b>Amtsgericht Schleswig</b>
     *  * <p>
     *  *  Code: X1119
     *  * <p>
     *  * 
     */
    @JsonProperty("X1119")
    @XmlEnumValue("X1119")
    Amtsgericht_Schleswig("X1119"),

    /**
     * <b>Grundbuchamt Schleswig</b>
     *  * <p>
     *  *  Code: X1119G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1119G")
    @XmlEnumValue("X1119G")
    Grundbuchamt_Schleswig("X1119G"),

    /**
     * <b>Amtsgericht Schleswig, Zentrales Mahngericht f&#252;r Schleswig-Holstein</b>
     *  * <p>
     *  *  Code: X1119M
     *  * <p>
     *  * 
     */
    @JsonProperty("X1119M")
    @XmlEnumValue("X1119M")
    Amtsgericht_Schleswig_Zentrales_Mahngericht_fuer_Schleswig_Holstein("X1119M"),

    /**
     * <b>Amtsgericht Schleswig, Zentrales Vollstreckungsgericht Schleswig-Holstein</b>
     *  * <p>
     *  *  Code: X1119R
     *  * <p>
     *  * 
     */
    @JsonProperty("X1119R")
    @XmlEnumValue("X1119R")
    Amtsgericht_Schleswig_Zentrales_Vollstreckungsgericht_Schleswig_Holstein("X1119R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht T&#246;nning</b>
     *  * <p>
     *  *  Code: X1121
     *  * <p>
     *  * 
     */
    @JsonProperty("X1121")
    @XmlEnumValue("X1121")
    aufgeloest_Amtsgericht_Toenning("X1121"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wesselburen</b>
     *  * <p>
     *  *  Code: X1122
     *  * <p>
     *  * 
     */
    @JsonProperty("X1122")
    @XmlEnumValue("X1122")
    aufgeloest_Amtsgericht_Wesselburen("X1122"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Westerland</b>
     *  * <p>
     *  *  Code: X1123
     *  * <p>
     *  * 
     */
    @JsonProperty("X1123")
    @XmlEnumValue("X1123")
    aufgeloest_Amtsgericht_Westerland("X1123"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wyk a. F&#246;hr</b>
     *  * <p>
     *  *  Code: X1124
     *  * <p>
     *  * 
     */
    @JsonProperty("X1124")
    @XmlEnumValue("X1124")
    aufgeloest_Amtsgericht_Wyk_a_Foehr("X1124"),

    /**
     * <b>Landgericht Itzehoe</b>
     *  * <p>
     *  *  Code: X1300
     *  * <p>
     *  * 
     */
    @JsonProperty("X1300")
    @XmlEnumValue("X1300")
    Landgericht_Itzehoe("X1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Itzehoe</b>
     *  * <p>
     *  *  Code: X1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("X1300S")
    @XmlEnumValue("X1300S")
    Staatsanwaltschaft_beim_Landgericht_Itzehoe("X1300S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Brunsb&#252;ttelkoog</b>
     *  * <p>
     *  *  Code: X1311
     *  * <p>
     *  * 
     */
    @JsonProperty("X1311")
    @XmlEnumValue("X1311")
    aufgeloest_Amtsgericht_Brunsbuettelkoog("X1311"),

    /**
     * <b>Amtsgericht Elmshorn</b>
     *  * <p>
     *  *  Code: X1312
     *  * <p>
     *  * 
     */
    @JsonProperty("X1312")
    @XmlEnumValue("X1312")
    Amtsgericht_Elmshorn("X1312"),

    /**
     * <b>Grundbuchamt Elmshorn</b>
     *  * <p>
     *  *  Code: X1312G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1312G")
    @XmlEnumValue("X1312G")
    Grundbuchamt_Elmshorn("X1312G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gl&#252;ckstadt</b>
     *  * <p>
     *  *  Code: X1314
     *  * <p>
     *  * 
     */
    @JsonProperty("X1314")
    @XmlEnumValue("X1314")
    aufgeloest_Amtsgericht_Glueckstadt("X1314"),

    /**
     * <b>Amtsgericht Itzehoe</b>
     *  * <p>
     *  *  Code: X1315
     *  * <p>
     *  * 
     */
    @JsonProperty("X1315")
    @XmlEnumValue("X1315")
    Amtsgericht_Itzehoe("X1315"),

    /**
     * <b>Grundbuchamt Itzehoe</b>
     *  * <p>
     *  *  Code: X1315G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1315G")
    @XmlEnumValue("X1315G")
    Grundbuchamt_Itzehoe("X1315G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Kellinghusen</b>
     *  * <p>
     *  *  Code: X1316
     *  * <p>
     *  * 
     */
    @JsonProperty("X1316")
    @XmlEnumValue("X1316")
    aufgeloest_Amtsgericht_Kellinghusen("X1316"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Krempe</b>
     *  * <p>
     *  *  Code: X1317
     *  * <p>
     *  * 
     */
    @JsonProperty("X1317")
    @XmlEnumValue("X1317")
    aufgeloest_Amtsgericht_Krempe("X1317"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Marne</b>
     *  * <p>
     *  *  Code: X1318
     *  * <p>
     *  * 
     */
    @JsonProperty("X1318")
    @XmlEnumValue("X1318")
    aufgeloest_Amtsgericht_Marne("X1318"),

    /**
     * <b>Amtsgericht Meldorf</b>
     *  * <p>
     *  *  Code: X1319
     *  * <p>
     *  * 
     */
    @JsonProperty("X1319")
    @XmlEnumValue("X1319")
    Amtsgericht_Meldorf("X1319"),

    /**
     * <b>Grundbuchamt Meldorf</b>
     *  * <p>
     *  *  Code: X1319G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1319G")
    @XmlEnumValue("X1319G")
    Grundbuchamt_Meldorf("X1319G"),

    /**
     * <b>Amtsgericht Pinneberg</b>
     *  * <p>
     *  *  Code: X1321
     *  * <p>
     *  * 
     */
    @JsonProperty("X1321")
    @XmlEnumValue("X1321")
    Amtsgericht_Pinneberg("X1321"),

    /**
     * <b>Grundbuchamt Pinneberg</b>
     *  * <p>
     *  *  Code: X1321G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1321G")
    @XmlEnumValue("X1321G")
    Grundbuchamt_Pinneberg("X1321G"),

    /**
     * <b>Registergericht Amtsgericht Pinneberg</b>
     *  * <p>
     *  *  Code: X1321R
     *  * <p>
     *  * 
     */
    @JsonProperty("X1321R")
    @XmlEnumValue("X1321R")
    Registergericht_Amtsgericht_Pinneberg("X1321R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Rantzau, Post Barmstedt</b>
     *  * <p>
     *  *  Code: X1322
     *  * <p>
     *  * 
     */
    @JsonProperty("X1322")
    @XmlEnumValue("X1322")
    aufgeloest_Amtsgericht_Rantzau_Post_Barmstedt("X1322"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Schenefeld</b>
     *  * <p>
     *  *  Code: X1323
     *  * <p>
     *  * 
     */
    @JsonProperty("X1323")
    @XmlEnumValue("X1323")
    aufgeloest_Amtsgericht_Schenefeld("X1323"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Uetersen</b>
     *  * <p>
     *  *  Code: X1324
     *  * <p>
     *  * 
     */
    @JsonProperty("X1324")
    @XmlEnumValue("X1324")
    aufgeloest_Amtsgericht_Uetersen("X1324"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wedel (Holstein)</b>
     *  * <p>
     *  *  Code: X1325
     *  * <p>
     *  * 
     */
    @JsonProperty("X1325")
    @XmlEnumValue("X1325")
    aufgeloest_Amtsgericht_Wedel_Holstein("X1325"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Wilster</b>
     *  * <p>
     *  *  Code: X1326
     *  * <p>
     *  * 
     */
    @JsonProperty("X1326")
    @XmlEnumValue("X1326")
    aufgeloest_Amtsgericht_Wilster("X1326"),

    /**
     * <b>Landgericht Kiel</b>
     *  * <p>
     *  *  Code: X1500
     *  * <p>
     *  * 
     */
    @JsonProperty("X1500")
    @XmlEnumValue("X1500")
    Landgericht_Kiel("X1500"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Kiel</b>
     *  * <p>
     *  *  Code: X1500S
     *  * <p>
     *  * 
     */
    @JsonProperty("X1500S")
    @XmlEnumValue("X1500S")
    Staatsanwaltschaft_beim_Landgericht_Kiel("X1500S"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Bramstedt</b>
     *  * <p>
     *  *  Code: X1511
     *  * <p>
     *  * 
     */
    @JsonProperty("X1511")
    @XmlEnumValue("X1511")
    aufgeloest_Amtsgericht_Bad_Bramstedt("X1511"),

    /**
     * <b>Amtsgericht Bad Segeberg</b>
     *  * <p>
     *  *  Code: X1512
     *  * <p>
     *  * 
     */
    @JsonProperty("X1512")
    @XmlEnumValue("X1512")
    Amtsgericht_Bad_Segeberg("X1512"),

    /**
     * <b>Grundbuchamt Bad Segeberg</b>
     *  * <p>
     *  *  Code: X1512G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1512G")
    @XmlEnumValue("X1512G")
    Grundbuchamt_Bad_Segeberg("X1512G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bordesholm</b>
     *  * <p>
     *  *  Code: X1513
     *  * <p>
     *  * 
     */
    @JsonProperty("X1513")
    @XmlEnumValue("X1513")
    aufgeloest_Amtsgericht_Bordesholm("X1513"),

    /**
     * <b>Amtsgericht Eckernf&#246;rde</b>
     *  * <p>
     *  *  Code: X1514
     *  * <p>
     *  * 
     */
    @JsonProperty("X1514")
    @XmlEnumValue("X1514")
    Amtsgericht_Eckernfoerde("X1514"),

    /**
     * <b>Grundbuchamt Eckernf&#246;rde</b>
     *  * <p>
     *  *  Code: X1514G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1514G")
    @XmlEnumValue("X1514G")
    Grundbuchamt_Eckernfoerde("X1514G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Gettorf</b>
     *  * <p>
     *  *  Code: X1515
     *  * <p>
     *  * 
     */
    @JsonProperty("X1515")
    @XmlEnumValue("X1515")
    aufgeloest_Amtsgericht_Gettorf("X1515"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Hohenwestedt</b>
     *  * <p>
     *  *  Code: X1516
     *  * <p>
     *  * 
     */
    @JsonProperty("X1516")
    @XmlEnumValue("X1516")
    aufgeloest_Amtsgericht_Hohenwestedt("X1516"),

    /**
     * <b>Amtsgericht Kiel</b>
     *  * <p>
     *  *  Code: X1517
     *  * <p>
     *  * 
     */
    @JsonProperty("X1517")
    @XmlEnumValue("X1517")
    Amtsgericht_Kiel("X1517"),

    /**
     * <b>Grundbuchamt Kiel</b>
     *  * <p>
     *  *  Code: X1517G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1517G")
    @XmlEnumValue("X1517G")
    Grundbuchamt_Kiel("X1517G"),

    /**
     * <b>Registergericht Amtsgericht Kiel</b>
     *  * <p>
     *  *  Code: X1517R
     *  * <p>
     *  * 
     */
    @JsonProperty("X1517R")
    @XmlEnumValue("X1517R")
    Registergericht_Amtsgericht_Kiel("X1517R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht L&#252;tjenburg</b>
     *  * <p>
     *  *  Code: X1518
     *  * <p>
     *  * 
     */
    @JsonProperty("X1518")
    @XmlEnumValue("X1518")
    aufgeloest_Amtsgericht_Luetjenburg("X1518"),

    /**
     * <b>Amtsgericht Neum&#252;nster</b>
     *  * <p>
     *  *  Code: X1519
     *  * <p>
     *  * 
     */
    @JsonProperty("X1519")
    @XmlEnumValue("X1519")
    Amtsgericht_Neumuenster("X1519"),

    /**
     * <b>Grundbuchamt Neum&#252;nster</b>
     *  * <p>
     *  *  Code: X1519G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1519G")
    @XmlEnumValue("X1519G")
    Grundbuchamt_Neumuenster("X1519G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Nortorf</b>
     *  * <p>
     *  *  Code: X1521
     *  * <p>
     *  * 
     */
    @JsonProperty("X1521")
    @XmlEnumValue("X1521")
    aufgeloest_Amtsgericht_Nortorf("X1521"),

    /**
     * <b>Amtsgericht Pl&#246;n</b>
     *  * <p>
     *  *  Code: X1522
     *  * <p>
     *  * 
     */
    @JsonProperty("X1522")
    @XmlEnumValue("X1522")
    Amtsgericht_Ploen("X1522"),

    /**
     * <b>Grundbuchamt Pl&#246;n</b>
     *  * <p>
     *  *  Code: X1522G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1522G")
    @XmlEnumValue("X1522G")
    Grundbuchamt_Ploen("X1522G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Preetz</b>
     *  * <p>
     *  *  Code: X1523
     *  * <p>
     *  * 
     */
    @JsonProperty("X1523")
    @XmlEnumValue("X1523")
    aufgeloest_Amtsgericht_Preetz("X1523"),

    /**
     * <b>Amtsgericht Rendsburg</b>
     *  * <p>
     *  *  Code: X1524
     *  * <p>
     *  * 
     */
    @JsonProperty("X1524")
    @XmlEnumValue("X1524")
    Amtsgericht_Rendsburg("X1524"),

    /**
     * <b>Grundbuchamt Rendsburg</b>
     *  * <p>
     *  *  Code: X1524G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1524G")
    @XmlEnumValue("X1524G")
    Grundbuchamt_Rendsburg("X1524G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sch&#246;nberg (Holstein)</b>
     *  * <p>
     *  *  Code: X1525
     *  * <p>
     *  * 
     */
    @JsonProperty("X1525")
    @XmlEnumValue("X1525")
    aufgeloest_Amtsgericht_Schoenberg_Holstein("X1525"),

    /**
     * <b>Amtsgericht Norderstedt</b>
     *  * <p>
     *  *  Code: X1526
     *  * <p>
     *  * 
     */
    @JsonProperty("X1526")
    @XmlEnumValue("X1526")
    Amtsgericht_Norderstedt("X1526"),

    /**
     * <b>Grundbuchamt Norderstedt</b>
     *  * <p>
     *  *  Code: X1526G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1526G")
    @XmlEnumValue("X1526G")
    Grundbuchamt_Norderstedt("X1526G"),

    /**
     * <b>Landgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X1700
     *  * <p>
     *  * 
     */
    @JsonProperty("X1700")
    @XmlEnumValue("X1700")
    Landgericht_Luebeck("X1700"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X1700S
     *  * <p>
     *  * 
     */
    @JsonProperty("X1700S")
    @XmlEnumValue("X1700S")
    Staatsanwaltschaft_beim_Landgericht_Luebeck("X1700S"),

    /**
     * <b>Amtsgericht Ahrensburg</b>
     *  * <p>
     *  *  Code: X1711
     *  * <p>
     *  * 
     */
    @JsonProperty("X1711")
    @XmlEnumValue("X1711")
    Amtsgericht_Ahrensburg("X1711"),

    /**
     * <b>Grundbuchamt Ahrensburg</b>
     *  * <p>
     *  *  Code: X1711G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1711G")
    @XmlEnumValue("X1711G")
    Grundbuchamt_Ahrensburg("X1711G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Oldesloe</b>
     *  * <p>
     *  *  Code: X1712
     *  * <p>
     *  * 
     */
    @JsonProperty("X1712")
    @XmlEnumValue("X1712")
    aufgeloest_Amtsgericht_Bad_Oldesloe("X1712"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bad Schwartau</b>
     *  * <p>
     *  *  Code: X1713
     *  * <p>
     *  * 
     */
    @JsonProperty("X1713")
    @XmlEnumValue("X1713")
    aufgeloest_Amtsgericht_Bad_Schwartau("X1713"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Bargteheide</b>
     *  * <p>
     *  *  Code: X1714
     *  * <p>
     *  * 
     */
    @JsonProperty("X1714")
    @XmlEnumValue("X1714")
    aufgeloest_Amtsgericht_Bargteheide("X1714"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Burg a. F.</b>
     *  * <p>
     *  *  Code: X1715
     *  * <p>
     *  * 
     */
    @JsonProperty("X1715")
    @XmlEnumValue("X1715")
    aufgeloest_Amtsgericht_Burg_a_F("X1715"),

    /**
     * <b>Amtsgericht Eutin</b>
     *  * <p>
     *  *  Code: X1716
     *  * <p>
     *  * 
     */
    @JsonProperty("X1716")
    @XmlEnumValue("X1716")
    Amtsgericht_Eutin("X1716"),

    /**
     * <b>Grundbuchamt Eutin</b>
     *  * <p>
     *  *  Code: X1716G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1716G")
    @XmlEnumValue("X1716G")
    Grundbuchamt_Eutin("X1716G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Geesthacht</b>
     *  * <p>
     *  *  Code: X1717
     *  * <p>
     *  * 
     */
    @JsonProperty("X1717")
    @XmlEnumValue("X1717")
    aufgeloest_Amtsgericht_Geesthacht("X1717"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Heiligenhafen</b>
     *  * <p>
     *  *  Code: X1718
     *  * <p>
     *  * 
     */
    @JsonProperty("X1718")
    @XmlEnumValue("X1718")
    aufgeloest_Amtsgericht_Heiligenhafen("X1718"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lauenburg (Elbe)</b>
     *  * <p>
     *  *  Code: X1719
     *  * <p>
     *  * 
     */
    @JsonProperty("X1719")
    @XmlEnumValue("X1719")
    aufgeloest_Amtsgericht_Lauenburg_Elbe("X1719"),

    /**
     * <b>Amtsgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X1721
     *  * <p>
     *  * 
     */
    @JsonProperty("X1721")
    @XmlEnumValue("X1721")
    Amtsgericht_Luebeck("X1721"),

    /**
     * <b>Grundbuchamt L&#252;beck</b>
     *  * <p>
     *  *  Code: X1721G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1721G")
    @XmlEnumValue("X1721G")
    Grundbuchamt_Luebeck("X1721G"),

    /**
     * <b>Registergericht Amtsgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X1721R
     *  * <p>
     *  * 
     */
    @JsonProperty("X1721R")
    @XmlEnumValue("X1721R")
    Registergericht_Amtsgericht_Luebeck("X1721R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht M&#246;lln</b>
     *  * <p>
     *  *  Code: X1722
     *  * <p>
     *  * 
     */
    @JsonProperty("X1722")
    @XmlEnumValue("X1722")
    aufgeloest_Amtsgericht_Moelln("X1722"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neustadt in Holstein</b>
     *  * <p>
     *  *  Code: X1723
     *  * <p>
     *  * 
     */
    @JsonProperty("X1723")
    @XmlEnumValue("X1723")
    aufgeloest_Amtsgericht_Neustadt_in_Holstein("X1723"),

    /**
     * <b>Amtsgericht Oldenburg (Holstein)</b>
     *  * <p>
     *  *  Code: X1724
     *  * <p>
     *  * 
     */
    @JsonProperty("X1724")
    @XmlEnumValue("X1724")
    Amtsgericht_Oldenburg_Holstein("X1724"),

    /**
     * <b>Grundbuchamt Oldenburg (Holstein)</b>
     *  * <p>
     *  *  Code: X1724G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1724G")
    @XmlEnumValue("X1724G")
    Grundbuchamt_Oldenburg_Holstein("X1724G"),

    /**
     * <b>Amtsgericht Ratzeburg</b>
     *  * <p>
     *  *  Code: X1725
     *  * <p>
     *  * 
     */
    @JsonProperty("X1725")
    @XmlEnumValue("X1725")
    Amtsgericht_Ratzeburg("X1725"),

    /**
     * <b>Grundbuchamt Ratzeburg</b>
     *  * <p>
     *  *  Code: X1725G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1725G")
    @XmlEnumValue("X1725G")
    Grundbuchamt_Ratzeburg("X1725G"),

    /**
     * <b>Amtsgericht Reinbek</b>
     *  * <p>
     *  *  Code: X1726
     *  * <p>
     *  * 
     */
    @JsonProperty("X1726")
    @XmlEnumValue("X1726")
    Amtsgericht_Reinbek("X1726"),

    /**
     * <b>Grundbuchamt Reinbek</b>
     *  * <p>
     *  *  Code: X1726G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1726G")
    @XmlEnumValue("X1726G")
    Grundbuchamt_Reinbek("X1726G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Reinfeld</b>
     *  * <p>
     *  *  Code: X1727
     *  * <p>
     *  * 
     */
    @JsonProperty("X1727")
    @XmlEnumValue("X1727")
    aufgeloest_Amtsgericht_Reinfeld("X1727"),

    /**
     * <b>Amtsgericht Schwarzenbek</b>
     *  * <p>
     *  *  Code: X1728
     *  * <p>
     *  * 
     */
    @JsonProperty("X1728")
    @XmlEnumValue("X1728")
    Amtsgericht_Schwarzenbek("X1728"),

    /**
     * <b>Grundbuchamt Schwarzenbek</b>
     *  * <p>
     *  *  Code: X1728G
     *  * <p>
     *  * 
     */
    @JsonProperty("X1728G")
    @XmlEnumValue("X1728G")
    Grundbuchamt_Schwarzenbek("X1728G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Trittau</b>
     *  * <p>
     *  *  Code: X1729
     *  * <p>
     *  * 
     */
    @JsonProperty("X1729")
    @XmlEnumValue("X1729")
    aufgeloest_Amtsgericht_Trittau("X1729"),

    /**
     * <b>Arbeitsgericht Elmshorn</b>
     *  * <p>
     *  *  Code: X6070
     *  * <p>
     *  * 
     */
    @JsonProperty("X6070")
    @XmlEnumValue("X6070")
    Arbeitsgericht_Elmshorn("X6070"),

    /**
     * <b>Arbeitsgericht Flensburg</b>
     *  * <p>
     *  *  Code: X6071
     *  * <p>
     *  * 
     */
    @JsonProperty("X6071")
    @XmlEnumValue("X6071")
    Arbeitsgericht_Flensburg("X6071"),

    /**
     * <b>Sozialgericht Itzehoe</b>
     *  * <p>
     *  *  Code: X6073
     *  * <p>
     *  * 
     */
    @JsonProperty("X6073")
    @XmlEnumValue("X6073")
    Sozialgericht_Itzehoe("X6073"),

    /**
     * <b>Schleswig-Holsteinisches Finanzgericht</b>
     *  * <p>
     *  *  Code: X6074
     *  * <p>
     *  * 
     */
    @JsonProperty("X6074")
    @XmlEnumValue("X6074")
    Schleswig_Holsteinisches_Finanzgericht("X6074"),

    /**
     * <b>Sozialgericht Kiel</b>
     *  * <p>
     *  *  Code: X6075
     *  * <p>
     *  * 
     */
    @JsonProperty("X6075")
    @XmlEnumValue("X6075")
    Sozialgericht_Kiel("X6075"),

    /**
     * <b>Landesarbeitsgericht Schleswig-Holstein</b>
     *  * <p>
     *  *  Code: X6076
     *  * <p>
     *  * 
     */
    @JsonProperty("X6076")
    @XmlEnumValue("X6076")
    Landesarbeitsgericht_Schleswig_Holstein("X6076"),

    /**
     * <b>Arbeitsgericht Neum&#252;nster</b>
     *  * <p>
     *  *  Code: X6077
     *  * <p>
     *  * 
     */
    @JsonProperty("X6077")
    @XmlEnumValue("X6077")
    Arbeitsgericht_Neumuenster("X6077"),

    /**
     * <b>Sozialgericht Schleswig</b>
     *  * <p>
     *  *  Code: X6078
     *  * <p>
     *  * 
     */
    @JsonProperty("X6078")
    @XmlEnumValue("X6078")
    Sozialgericht_Schleswig("X6078"),

    /**
     * <b>Schleswig-Holsteinisches Landessozialgericht</b>
     *  * <p>
     *  *  Code: X6079
     *  * <p>
     *  * 
     */
    @JsonProperty("X6079")
    @XmlEnumValue("X6079")
    Schleswig_Holsteinisches_Landessozialgericht("X6079"),

    /**
     * <b>Schleswig-Holsteinisches Verwaltungsgericht</b>
     *  * <p>
     *  *  Code: X6080
     *  * <p>
     *  * 
     */
    @JsonProperty("X6080")
    @XmlEnumValue("X6080")
    Schleswig_Holsteinisches_Verwaltungsgericht("X6080"),

    /**
     * <b>Schleswig-Holsteinischer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: X6111
     *  * <p>
     *  * 
     */
    @JsonProperty("X6111")
    @XmlEnumValue("X6111")
    Schleswig_Holsteinischer_Anwaltsgerichtshof("X6111"),

    /**
     * <b>Arbeitsgericht Kiel</b>
     *  * <p>
     *  *  Code: X6165
     *  * <p>
     *  * 
     */
    @JsonProperty("X6165")
    @XmlEnumValue("X6165")
    Arbeitsgericht_Kiel("X6165"),

    /**
     * <b>Arbeitsgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X6166
     *  * <p>
     *  * 
     */
    @JsonProperty("X6166")
    @XmlEnumValue("X6166")
    Arbeitsgericht_Luebeck("X6166"),

    /**
     * <b>Sozialgericht L&#252;beck</b>
     *  * <p>
     *  *  Code: X6188
     *  * <p>
     *  * 
     */
    @JsonProperty("X6188")
    @XmlEnumValue("X6188")
    Sozialgericht_Luebeck("X6188"),

    /**
     * <b>Justizvollzugsanstalt L&#252;beck</b>
     *  * <p>
     *  *  Code: X6240
     *  * <p>
     *  * 
     */
    @JsonProperty("X6240")
    @XmlEnumValue("X6240")
    Justizvollzugsanstalt_Luebeck("X6240"),

    /**
     * <b>Justizvollzugsanstalt Glasmoor</b>
     *  * <p>
     *  *  Code: X6313
     *  * <p>
     *  * 
     */
    @JsonProperty("X6313")
    @XmlEnumValue("X6313")
    Justizvollzugsanstalt_Glasmoor("X6313"),

    /**
     * <b>Justizvollzugsanstalt Itzehoe</b>
     *  * <p>
     *  *  Code: X6315
     *  * <p>
     *  * 
     */
    @JsonProperty("X6315")
    @XmlEnumValue("X6315")
    Justizvollzugsanstalt_Itzehoe("X6315"),

    /**
     * <b>Jugendanstalt Schleswig</b>
     *  * <p>
     *  *  Code: X6321
     *  * <p>
     *  * 
     */
    @JsonProperty("X6321")
    @XmlEnumValue("X6321")
    Jugendanstalt_Schleswig("X6321"),

    /**
     * <b>Justizvollzugsanstalt Neum&#252;nster</b>
     *  * <p>
     *  *  Code: X6323
     *  * <p>
     *  * 
     */
    @JsonProperty("X6323")
    @XmlEnumValue("X6323")
    Justizvollzugsanstalt_Neumuenster("X6323"),

    /**
     * <b>Schleswig-Holsteinisches Oberverwaltungsgericht</b>
     *  * <p>
     *  *  Code: X6387
     *  * <p>
     *  * 
     */
    @JsonProperty("X6387")
    @XmlEnumValue("X6387")
    Schleswig_Holsteinisches_Oberverwaltungsgericht("X6387"),

    /**
     * <b>Schleswig-Holsteinisches Landesverfassungsgericht</b>
     *  * <p>
     *  *  Code: X6433
     *  * <p>
     *  * 
     */
    @JsonProperty("X6433")
    @XmlEnumValue("X6433")
    Schleswig_Holsteinisches_Landesverfassungsgericht("X6433"),

    /**
     * <b>Justizvollzugsanstalt Kiel</b>
     *  * <p>
     *  *  Code: X6747
     *  * <p>
     *  * 
     */
    @JsonProperty("X6747")
    @XmlEnumValue("X6747")
    Justizvollzugsanstalt_Kiel("X6747"),

    /**
     * <b>Justizvollzugsanstalt Flensburg</b>
     *  * <p>
     *  *  Code: X6756
     *  * <p>
     *  * 
     */
    @JsonProperty("X6756")
    @XmlEnumValue("X6756")
    Justizvollzugsanstalt_Flensburg("X6756"),

    /**
     * <b>Schleswig-Holsteinisches Anwaltsgericht</b>
     *  * <p>
     *  *  Code: X6776
     *  * <p>
     *  * 
     */
    @JsonProperty("X6776")
    @XmlEnumValue("X6776")
    Schleswig_Holsteinisches_Anwaltsgericht("X6776"),

    /**
     * <b>Th&#252;ringer Oberlandesgericht</b>
     *  * <p>
     *  *  Code: Y1000
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1000")
    @XmlEnumValue("Y1000")
    Thueringer_Oberlandesgericht("Y1000"),

    /**
     * <b>Staatsanwaltschaft beim Oberlandesgericht Jena</b>
     *  * <p>
     *  *  Code: Y1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1000S")
    @XmlEnumValue("Y1000S")
    Staatsanwaltschaft_beim_Oberlandesgericht_Jena("Y1000S"),

    /**
     * <b>Landgericht Erfurt</b>
     *  * <p>
     *  *  Code: Y1100
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1100")
    @XmlEnumValue("Y1100")
    Landgericht_Erfurt("Y1100"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Erfurt</b>
     *  * <p>
     *  *  Code: Y1100S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1100S")
    @XmlEnumValue("Y1100S")
    Staatsanwaltschaft_beim_Landgericht_Erfurt("Y1100S"),

    /**
     * <b>Amtsgericht Apolda</b>
     *  * <p>
     *  *  Code: Y1101
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1101")
    @XmlEnumValue("Y1101")
    Amtsgericht_Apolda("Y1101"),

    /**
     * <b>Grundbuchamt Apolda</b>
     *  * <p>
     *  *  Code: Y1101G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1101G")
    @XmlEnumValue("Y1101G")
    Grundbuchamt_Apolda("Y1101G"),

    /**
     * <b>Amtsgericht Arnstadt</b>
     *  * <p>
     *  *  Code: Y1102
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1102")
    @XmlEnumValue("Y1102")
    Amtsgericht_Arnstadt("Y1102"),

    /**
     * <b>Grundbuchamt Arnstadt</b>
     *  * <p>
     *  *  Code: Y1102G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1102G")
    @XmlEnumValue("Y1102G")
    Grundbuchamt_Arnstadt("Y1102G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Sondershausen Zweigstelle Artern</b>
     *  * <p>
     *  *  Code: Y1103
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1103")
    @XmlEnumValue("Y1103")
    aufgeloest_Amtsgericht_Sondershausen_Zweigstelle_Artern("Y1103"),

    /**
     * <b>aufgel&#246;st-Amtsgericht M&#252;hlhausen Zweigstelle Bad Langensalza</b>
     *  * <p>
     *  *  Code: Y1104
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1104")
    @XmlEnumValue("Y1104")
    aufgeloest_Amtsgericht_Muehlhausen_Zweigstelle_Bad_Langensalza("Y1104"),

    /**
     * <b>aufgel&#246;st-Grundbuchamt M&#252;hlhausen Zweigstelle Bad Langensalza</b>
     *  * <p>
     *  *  Code: Y1104G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1104G")
    @XmlEnumValue("Y1104G")
    aufgeloest_Grundbuchamt_Muehlhausen_Zweigstelle_Bad_Langensalza("Y1104G"),

    /**
     * <b>Amtsgericht Eisenach</b>
     *  * <p>
     *  *  Code: Y1105
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1105")
    @XmlEnumValue("Y1105")
    Amtsgericht_Eisenach("Y1105"),

    /**
     * <b>Grundbuchamt Eisenach</b>
     *  * <p>
     *  *  Code: Y1105G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1105G")
    @XmlEnumValue("Y1105G")
    Grundbuchamt_Eisenach("Y1105G"),

    /**
     * <b>Amtsgericht Erfurt</b>
     *  * <p>
     *  *  Code: Y1106
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1106")
    @XmlEnumValue("Y1106")
    Amtsgericht_Erfurt("Y1106"),

    /**
     * <b>Grundbuchamt Erfurt</b>
     *  * <p>
     *  *  Code: Y1106G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1106G")
    @XmlEnumValue("Y1106G")
    Grundbuchamt_Erfurt("Y1106G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Erfurt (Land)</b>
     *  * <p>
     *  *  Code: Y1107
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1107")
    @XmlEnumValue("Y1107")
    aufgeloest_Amtsgericht_Erfurt_Land("Y1107"),

    /**
     * <b>Amtsgericht Gotha</b>
     *  * <p>
     *  *  Code: Y1108
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1108")
    @XmlEnumValue("Y1108")
    Amtsgericht_Gotha("Y1108"),

    /**
     * <b>Grundbuchamt Gotha</b>
     *  * <p>
     *  *  Code: Y1108G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1108G")
    @XmlEnumValue("Y1108G")
    Grundbuchamt_Gotha("Y1108G"),

    /**
     * <b>Amtsgericht Heiligenstadt</b>
     *  * <p>
     *  *  Code: Y1109
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1109")
    @XmlEnumValue("Y1109")
    Amtsgericht_Heiligenstadt("Y1109"),

    /**
     * <b>Grundbuchamt Heilbad Heiligenstadt</b>
     *  * <p>
     *  *  Code: Y1109G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1109G")
    @XmlEnumValue("Y1109G")
    Grundbuchamt_Heilbad_Heiligenstadt("Y1109G"),

    /**
     * <b>Amtsgericht M&#252;hlhausen</b>
     *  * <p>
     *  *  Code: Y1110
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1110")
    @XmlEnumValue("Y1110")
    Amtsgericht_Muehlhausen("Y1110"),

    /**
     * <b>Grundbuchamt M&#252;hlhausen</b>
     *  * <p>
     *  *  Code: Y1110G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1110G")
    @XmlEnumValue("Y1110G")
    Grundbuchamt_Muehlhausen("Y1110G"),

    /**
     * <b>Amtsgericht Nordhausen</b>
     *  * <p>
     *  *  Code: Y1111
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1111")
    @XmlEnumValue("Y1111")
    Amtsgericht_Nordhausen("Y1111"),

    /**
     * <b>Grundbuchamt Nordhausen</b>
     *  * <p>
     *  *  Code: Y1111G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1111G")
    @XmlEnumValue("Y1111G")
    Grundbuchamt_Nordhausen("Y1111G"),

    /**
     * <b>Amtsgericht S&#246;mmerda</b>
     *  * <p>
     *  *  Code: Y1112
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1112")
    @XmlEnumValue("Y1112")
    Amtsgericht_Soemmerda("Y1112"),

    /**
     * <b>Grundbuchamt S&#246;mmerda</b>
     *  * <p>
     *  *  Code: Y1112G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1112G")
    @XmlEnumValue("Y1112G")
    Grundbuchamt_Soemmerda("Y1112G"),

    /**
     * <b>Amtsgericht Sondershausen</b>
     *  * <p>
     *  *  Code: Y1113
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1113")
    @XmlEnumValue("Y1113")
    Amtsgericht_Sondershausen("Y1113"),

    /**
     * <b>Grundbuchamt Sondershausen</b>
     *  * <p>
     *  *  Code: Y1113G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1113G")
    @XmlEnumValue("Y1113G")
    Grundbuchamt_Sondershausen("Y1113G"),

    /**
     * <b>Amtsgericht Weimar</b>
     *  * <p>
     *  *  Code: Y1114
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1114")
    @XmlEnumValue("Y1114")
    Amtsgericht_Weimar("Y1114"),

    /**
     * <b>Grundbuchamt Weimar</b>
     *  * <p>
     *  *  Code: Y1114G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1114G")
    @XmlEnumValue("Y1114G")
    Grundbuchamt_Weimar("Y1114G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Heilbad Heiligenstadt Zweigstelle Leinefelde-Worbis</b>
     *  * <p>
     *  *  Code: Y1115
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1115")
    @XmlEnumValue("Y1115")
    aufgeloest_Amtsgericht_Heilbad_Heiligenstadt_Zweigstelle_Leinefelde_Worbis("Y1115"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Gotha, Au&#223;enstelle der StA Erfurt</b>
     *  * <p>
     *  *  Code: Y1116S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1116S")
    @XmlEnumValue("Y1116S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Gotha_Aussenstelle_der_StA_Erfurt("Y1116S"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Erfurt, Au&#223;enstelle Erfurt</b>
     *  * <p>
     *  *  Code: Y1117S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1117S")
    @XmlEnumValue("Y1117S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Erfurt_Aussenstelle_Erfurt("Y1117S"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Weimar, Au&#223;enstelle der StA Erfurt</b>
     *  * <p>
     *  *  Code: Y1118S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1118S")
    @XmlEnumValue("Y1118S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Weimar_Aussenstelle_der_StA_Erfurt("Y1118S"),

    /**
     * <b>Landgericht Gera</b>
     *  * <p>
     *  *  Code: Y1200
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1200")
    @XmlEnumValue("Y1200")
    Landgericht_Gera("Y1200"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Gera</b>
     *  * <p>
     *  *  Code: Y1200S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1200S")
    @XmlEnumValue("Y1200S")
    Staatsanwaltschaft_beim_Landgericht_Gera("Y1200S"),

    /**
     * <b>Amtsgericht Altenburg</b>
     *  * <p>
     *  *  Code: Y1201
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1201")
    @XmlEnumValue("Y1201")
    Amtsgericht_Altenburg("Y1201"),

    /**
     * <b>Grundbuchamt Altenburg</b>
     *  * <p>
     *  *  Code: Y1201G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1201G")
    @XmlEnumValue("Y1201G")
    Grundbuchamt_Altenburg("Y1201G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Eisenberg</b>
     *  * <p>
     *  *  Code: Y1202
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1202")
    @XmlEnumValue("Y1202")
    aufgeloest_Amtsgericht_Eisenberg("Y1202"),

    /**
     * <b>Amtsgericht Gera</b>
     *  * <p>
     *  *  Code: Y1203
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1203")
    @XmlEnumValue("Y1203")
    Amtsgericht_Gera("Y1203"),

    /**
     * <b>Grundbuchamt Gera</b>
     *  * <p>
     *  *  Code: Y1203G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1203G")
    @XmlEnumValue("Y1203G")
    Grundbuchamt_Gera("Y1203G"),

    /**
     * <b>aufgel&#246;st-Kreisgericht Gera-Land</b>
     *  * <p>
     *  *  Code: Y1204
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1204")
    @XmlEnumValue("Y1204")
    aufgeloest_Kreisgericht_Gera_Land("Y1204"),

    /**
     * <b>Amtsgericht Greiz</b>
     *  * <p>
     *  *  Code: Y1205
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1205")
    @XmlEnumValue("Y1205")
    Amtsgericht_Greiz("Y1205"),

    /**
     * <b>Grundbuchamt Greiz</b>
     *  * <p>
     *  *  Code: Y1205G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1205G")
    @XmlEnumValue("Y1205G")
    Grundbuchamt_Greiz("Y1205G"),

    /**
     * <b>Amtsgericht Jena</b>
     *  * <p>
     *  *  Code: Y1206
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1206")
    @XmlEnumValue("Y1206")
    Amtsgericht_Jena("Y1206"),

    /**
     * <b>Grundbuchamt Jena</b>
     *  * <p>
     *  *  Code: Y1206G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1206G")
    @XmlEnumValue("Y1206G")
    Grundbuchamt_Jena("Y1206G"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Jena, Zwst. der StA Gera</b>
     *  * <p>
     *  *  Code: Y1206S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1206S")
    @XmlEnumValue("Y1206S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Jena_Zwst_der_StA_Gera("Y1206S"),

    /**
     * <b>Amtsgericht Jena - Handels-, Genossenschafts- und Partnerschaftsregister</b>
     *  * <p>
     *  *  Code: Y1206V
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1206V")
    @XmlEnumValue("Y1206V")
    Amtsgericht_Jena_Handels_Genossenschafts_und_Partnerschaftsregister("Y1206V"),

    /**
     * <b>Amtsgericht P&#246;&#223;neck Zweigstelle Bad Lobenstein</b>
     *  * <p>
     *  *  Code: Y1208
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1208")
    @XmlEnumValue("Y1208")
    Amtsgericht_Poessneck_Zweigstelle_Bad_Lobenstein("Y1208"),

    /**
     * <b>Grundbuchamt P&#246;&#223;neck Zweigstelle Bad Lobenstein</b>
     *  * <p>
     *  *  Code: Y1208G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1208G")
    @XmlEnumValue("Y1208G")
    Grundbuchamt_Poessneck_Zweigstelle_Bad_Lobenstein("Y1208G"),

    /**
     * <b>Amtsgericht P&#246;&#223;neck</b>
     *  * <p>
     *  *  Code: Y1209
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1209")
    @XmlEnumValue("Y1209")
    Amtsgericht_Poessneck("Y1209"),

    /**
     * <b>Grundbuchamt P&#246;&#223;neck</b>
     *  * <p>
     *  *  Code: Y1209G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1209G")
    @XmlEnumValue("Y1209G")
    Grundbuchamt_Poessneck("Y1209G"),

    /**
     * <b>Amtsgericht Rudolstadt</b>
     *  * <p>
     *  *  Code: Y1210
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1210")
    @XmlEnumValue("Y1210")
    Amtsgericht_Rudolstadt("Y1210"),

    /**
     * <b>Grundbuchamt Rudolstadt</b>
     *  * <p>
     *  *  Code: Y1210G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1210G")
    @XmlEnumValue("Y1210G")
    Grundbuchamt_Rudolstadt("Y1210G"),

    /**
     * <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Rudolstadt, Zwst. der StA Gera</b>
     *  * <p>
     *  *  Code: Y1210S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1210S")
    @XmlEnumValue("Y1210S")
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Rudolstadt_Zwst_der_StA_Gera("Y1210S"),

    /**
     * <b>Amtsgericht Rudolstadt Zweigstelle Saalfeld</b>
     *  * <p>
     *  *  Code: Y1211
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1211")
    @XmlEnumValue("Y1211")
    Amtsgericht_Rudolstadt_Zweigstelle_Saalfeld("Y1211"),

    /**
     * <b>Grundbuchamt Rudolstadt Zweigstelle Saalfeld</b>
     *  * <p>
     *  *  Code: Y1211G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1211G")
    @XmlEnumValue("Y1211G")
    Grundbuchamt_Rudolstadt_Zweigstelle_Saalfeld("Y1211G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Lobenstein, Zwst. Schleiz</b>
     *  * <p>
     *  *  Code: Y1212
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1212")
    @XmlEnumValue("Y1212")
    aufgeloest_Amtsgericht_Lobenstein_Zwst_Schleiz("Y1212"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Altenburg, Zwst. Schm&#246;lln</b>
     *  * <p>
     *  *  Code: Y1213
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1213")
    @XmlEnumValue("Y1213")
    aufgeloest_Amtsgericht_Altenburg_Zwst_Schmoelln("Y1213"),

    /**
     * <b>Amtsgericht Stadtroda</b>
     *  * <p>
     *  *  Code: Y1214
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1214")
    @XmlEnumValue("Y1214")
    Amtsgericht_Stadtroda("Y1214"),

    /**
     * <b>Grundbuchamt Stadtroda</b>
     *  * <p>
     *  *  Code: Y1214G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1214G")
    @XmlEnumValue("Y1214G")
    Grundbuchamt_Stadtroda("Y1214G"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Greiz, Zwst. Zeulenroda</b>
     *  * <p>
     *  *  Code: Y1215
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1215")
    @XmlEnumValue("Y1215")
    aufgeloest_Amtsgericht_Greiz_Zwst_Zeulenroda("Y1215"),

    /**
     * <b>Landgericht Meiningen</b>
     *  * <p>
     *  *  Code: Y1300
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1300")
    @XmlEnumValue("Y1300")
    Landgericht_Meiningen("Y1300"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht Meiningen</b>
     *  * <p>
     *  *  Code: Y1300S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1300S")
    @XmlEnumValue("Y1300S")
    Staatsanwaltschaft_beim_Landgericht_Meiningen("Y1300S"),

    /**
     * <b>Amtsgericht Bad Salzungen</b>
     *  * <p>
     *  *  Code: Y1301
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1301")
    @XmlEnumValue("Y1301")
    Amtsgericht_Bad_Salzungen("Y1301"),

    /**
     * <b>Grundbuchamt Bad Salzungen</b>
     *  * <p>
     *  *  Code: Y1301G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1301G")
    @XmlEnumValue("Y1301G")
    Grundbuchamt_Bad_Salzungen("Y1301G"),

    /**
     * <b>Amtsgericht Hildburghausen</b>
     *  * <p>
     *  *  Code: Y1302
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1302")
    @XmlEnumValue("Y1302")
    Amtsgericht_Hildburghausen("Y1302"),

    /**
     * <b>Grundbuchamt Hildburghausen</b>
     *  * <p>
     *  *  Code: Y1302G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1302G")
    @XmlEnumValue("Y1302G")
    Grundbuchamt_Hildburghausen("Y1302G"),

    /**
     * <b>Amtsgericht Arnstadt Zweigstelle Ilmenau</b>
     *  * <p>
     *  *  Code: Y1303
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1303")
    @XmlEnumValue("Y1303")
    Amtsgericht_Arnstadt_Zweigstelle_Ilmenau("Y1303"),

    /**
     * <b>Grundbuchamt Arnstadt Zweigstelle Ilmenau</b>
     *  * <p>
     *  *  Code: Y1303G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1303G")
    @XmlEnumValue("Y1303G")
    Grundbuchamt_Arnstadt_Zweigstelle_Ilmenau("Y1303G"),

    /**
     * <b>Amtsgericht Meiningen</b>
     *  * <p>
     *  *  Code: Y1304
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1304")
    @XmlEnumValue("Y1304")
    Amtsgericht_Meiningen("Y1304"),

    /**
     * <b>Grundbuchamt Meiningen</b>
     *  * <p>
     *  *  Code: Y1304G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1304G")
    @XmlEnumValue("Y1304G")
    Grundbuchamt_Meiningen("Y1304G"),

    /**
     * <b>Amtsgericht Meiningen, Zentrales Vollstreckungsgericht Th&#252;ringen</b>
     *  * <p>
     *  *  Code: Y1304R
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1304R")
    @XmlEnumValue("Y1304R")
    Amtsgericht_Meiningen_Zentrales_Vollstreckungsgericht_Thueringen("Y1304R"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Neuhaus/Rwg.</b>
     *  * <p>
     *  *  Code: Y1305
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1305")
    @XmlEnumValue("Y1305")
    aufgeloest_Amtsgericht_Neuhaus_Rwg("Y1305"),

    /**
     * <b>aufgel&#246;st-Amtsgericht Meiningen Zweigstelle Schmalkalden</b>
     *  * <p>
     *  *  Code: Y1306
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1306")
    @XmlEnumValue("Y1306")
    aufgeloest_Amtsgericht_Meiningen_Zweigstelle_Schmalkalden("Y1306"),

    /**
     * <b>Amtsgericht Sonneberg</b>
     *  * <p>
     *  *  Code: Y1307
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1307")
    @XmlEnumValue("Y1307")
    Amtsgericht_Sonneberg("Y1307"),

    /**
     * <b>Grundbuchamt Sonneberg</b>
     *  * <p>
     *  *  Code: Y1307G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1307G")
    @XmlEnumValue("Y1307G")
    Grundbuchamt_Sonneberg("Y1307G"),

    /**
     * <b>Amtsgericht Suhl</b>
     *  * <p>
     *  *  Code: Y1308
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1308")
    @XmlEnumValue("Y1308")
    Amtsgericht_Suhl("Y1308"),

    /**
     * <b>Grundbuchamt Suhl</b>
     *  * <p>
     *  *  Code: Y1308G
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1308G")
    @XmlEnumValue("Y1308G")
    Grundbuchamt_Suhl("Y1308G"),

    /**
     * <b>Landgericht M&#252;hlhausen</b>
     *  * <p>
     *  *  Code: Y1400
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1400")
    @XmlEnumValue("Y1400")
    Landgericht_Muehlhausen("Y1400"),

    /**
     * <b>Staatsanwaltschaft beim Landgericht M&#252;hlhausen</b>
     *  * <p>
     *  *  Code: Y1400S
     *  * <p>
     *  * 
     */
    @JsonProperty("Y1400S")
    @XmlEnumValue("Y1400S")
    Staatsanwaltschaft_beim_Landgericht_Muehlhausen("Y1400S"),

    /**
     * <b>Th&#252;ringer Finanzgericht</b>
     *  * <p>
     *  *  Code: Y6003
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6003")
    @XmlEnumValue("Y6003")
    Thueringer_Finanzgericht("Y6003"),

    /**
     * <b>Th&#252;ringer Anwaltsgerichtshof</b>
     *  * <p>
     *  *  Code: Y6004
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6004")
    @XmlEnumValue("Y6004")
    Thueringer_Anwaltsgerichtshof("Y6004"),

    /**
     * <b>Bundesarbeitsgericht</b>
     *  * <p>
     *  *  Code: Y6010
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6010")
    @XmlEnumValue("Y6010")
    Bundesarbeitsgericht("Y6010"),

    /**
     * <b>Arbeitsgericht Gera</b>
     *  * <p>
     *  *  Code: Y6060
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6060")
    @XmlEnumValue("Y6060")
    Arbeitsgericht_Gera("Y6060"),

    /**
     * <b>Verwaltungsgericht Gera</b>
     *  * <p>
     *  *  Code: Y6061
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6061")
    @XmlEnumValue("Y6061")
    Verwaltungsgericht_Gera("Y6061"),

    /**
     * <b>Th&#252;ringer Verfassungsgerichtshof</b>
     *  * <p>
     *  *  Code: Y6149
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6149")
    @XmlEnumValue("Y6149")
    Thueringer_Verfassungsgerichtshof("Y6149"),

    /**
     * <b>Justizvollzugsanstalt Suhl-Goldlauter</b>
     *  * <p>
     *  *  Code: Y6319
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6319")
    @XmlEnumValue("Y6319")
    Justizvollzugsanstalt_Suhl_Goldlauter("Y6319"),

    /**
     * <b>Justizvollzugsanstalt Hohenleuben</b>
     *  * <p>
     *  *  Code: Y6320
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6320")
    @XmlEnumValue("Y6320")
    Justizvollzugsanstalt_Hohenleuben("Y6320"),

    /**
     * <b>Justizvollzugsanstalt Unterma&#223;feld</b>
     *  * <p>
     *  *  Code: Y6322
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6322")
    @XmlEnumValue("Y6322")
    Justizvollzugsanstalt_Untermassfeld("Y6322"),

    /**
     * <b>Justizvollzugsanstalt Tonna</b>
     *  * <p>
     *  *  Code: Y6323
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6323")
    @XmlEnumValue("Y6323")
    Justizvollzugsanstalt_Tonna("Y6323"),

    /**
     * <b>Verwaltungsgericht Weimar</b>
     *  * <p>
     *  *  Code: Y6325
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6325")
    @XmlEnumValue("Y6325")
    Verwaltungsgericht_Weimar("Y6325"),

    /**
     * <b>Th&#252;ringer Anwaltsgericht</b>
     *  * <p>
     *  *  Code: Y6342
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6342")
    @XmlEnumValue("Y6342")
    Thueringer_Anwaltsgericht("Y6342"),

    /**
     * <b>Th&#252;ringer Landesarbeitsgericht</b>
     *  * <p>
     *  *  Code: Y6388
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6388")
    @XmlEnumValue("Y6388")
    Thueringer_Landesarbeitsgericht("Y6388"),

    /**
     * <b>Arbeitsgericht Eisenach</b>
     *  * <p>
     *  *  Code: Y6389
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6389")
    @XmlEnumValue("Y6389")
    Arbeitsgericht_Eisenach("Y6389"),

    /**
     * <b>Arbeitsgericht Erfurt</b>
     *  * <p>
     *  *  Code: Y6390
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6390")
    @XmlEnumValue("Y6390")
    Arbeitsgericht_Erfurt("Y6390"),

    /**
     * <b>Arbeitsgericht Jena</b>
     *  * <p>
     *  *  Code: Y6391
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6391")
    @XmlEnumValue("Y6391")
    Arbeitsgericht_Jena("Y6391"),

    /**
     * <b>Arbeitsgericht Nordhausen</b>
     *  * <p>
     *  *  Code: Y6392
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6392")
    @XmlEnumValue("Y6392")
    Arbeitsgericht_Nordhausen("Y6392"),

    /**
     * <b>Arbeitsgericht Suhl</b>
     *  * <p>
     *  *  Code: Y6393
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6393")
    @XmlEnumValue("Y6393")
    Arbeitsgericht_Suhl("Y6393"),

    /**
     * <b>Th&#252;ringer Oberverwaltungsgericht</b>
     *  * <p>
     *  *  Code: Y6397
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6397")
    @XmlEnumValue("Y6397")
    Thueringer_Oberverwaltungsgericht("Y6397"),

    /**
     * <b>Verwaltungsgericht Meiningen</b>
     *  * <p>
     *  *  Code: Y6398
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6398")
    @XmlEnumValue("Y6398")
    Verwaltungsgericht_Meiningen("Y6398"),

    /**
     * <b>Th&#252;ringer Landessozialgericht</b>
     *  * <p>
     *  *  Code: Y6402
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6402")
    @XmlEnumValue("Y6402")
    Thueringer_Landessozialgericht("Y6402"),

    /**
     * <b>Sozialgericht Altenburg</b>
     *  * <p>
     *  *  Code: Y6403
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6403")
    @XmlEnumValue("Y6403")
    Sozialgericht_Altenburg("Y6403"),

    /**
     * <b>Sozialgericht Gotha</b>
     *  * <p>
     *  *  Code: Y6404
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6404")
    @XmlEnumValue("Y6404")
    Sozialgericht_Gotha("Y6404"),

    /**
     * <b>Sozialgericht Meiningen</b>
     *  * <p>
     *  *  Code: Y6405
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6405")
    @XmlEnumValue("Y6405")
    Sozialgericht_Meiningen("Y6405"),

    /**
     * <b>Sozialgericht Nordhausen</b>
     *  * <p>
     *  *  Code: Y6406
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6406")
    @XmlEnumValue("Y6406")
    Sozialgericht_Nordhausen("Y6406"),

    /**
     * <b>Jugendstrafanstalt Arnstadt</b>
     *  * <p>
     *  *  Code: Y6508
     *  * <p>
     *  * 
     */
    @JsonProperty("Y6508")
    @XmlEnumValue("Y6508")
    Jugendstrafanstalt_Arnstadt("Y6508"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof -Ref. BZR 3 / SB 31-</b>
     *  * <p>
     *  *  Code: Z1000
     *  * <p>
     *  * 
     */
    @JsonProperty("Z1000")
    @XmlEnumValue("Z1000")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Ref_BZR_3_SB_31("Z1000"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof -Testanfragen-</b>
     *  * <p>
     *  *  Code: Z1000S
     *  * <p>
     *  * 
     */
    @JsonProperty("Z1000S")
    @XmlEnumValue("Z1000S")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Testanfragen("Z1000S"),

    /**
     * <b>Der Generalbundesanwalt b. BGH Dienststelle Bundeszentralreg. Arbeitsgruppe &quot;Wahlen&quot;</b>
     *  * <p>
     *  *  Code: Z1007
     *  * <p>
     *  * 
     */
    @JsonProperty("Z1007")
    @XmlEnumValue("Z1007")
    Der_Generalbundesanwalt_b_BGH_Dienststelle_Bundeszentralreg_Arbeitsgruppe_Wahlen("Z1007"),

    /**
     * <b>aufgel&#246;st-Der Generalbundesanwalt beim Bundesgerichtshof -Bundeszentralregister-</b>
     *  * <p>
     *  *  Code: Z1100
     *  * <p>
     *  * 
     */
    @JsonProperty("Z1100")
    @XmlEnumValue("Z1100")
    aufgeloest_Der_Generalbundesanwalt_beim_Bundesgerichtshof_Bundeszentralregister("Z1100"),

    /**
     * <b>Bundesamt f&#252;r Justiz, Internationaler Strafnachrichtenaustausch</b>
     *  * <p>
     *  *  Code: Z1200
     *  * <p>
     *  * 
     */
    @JsonProperty("Z1200")
    @XmlEnumValue("Z1200")
    Bundesamt_fuer_Justiz_Internationaler_Strafnachrichtenaustausch("Z1200"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof Zentrale Beh&#246;rde / SorgeR&#220;bkAG</b>
     *  * <p>
     *  *  Code: Z6108
     *  * <p>
     *  * 
     */
    @JsonProperty("Z6108")
    @XmlEnumValue("Z6108")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Zentrale_Behoerde_SorgeRUebkAG("Z6108"),

    /**
     * <b>Der Generalbundesanwalt beim Bundesgerichtshof Ref. IV 3 AZ. IV 29 H 2/90</b>
     *  * <p>
     *  *  Code: Z7350
     *  * <p>
     *  * 
     */
    @JsonProperty("Z7350")
    @XmlEnumValue("Z7350")
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Ref_IV_3_AZ_IV_29_H_2_90("Z7350");

    private final String value;
    GerichtCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GerichtCode fromValue(String value) {
        for (GerichtCode e : GerichtCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}