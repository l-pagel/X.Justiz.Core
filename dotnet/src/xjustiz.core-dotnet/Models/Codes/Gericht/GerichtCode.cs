namespace xjustiz.core_dotnet.Models.Codes.Gericht;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Gericht Codes from <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte'>XRepository: Codeliste GDS.Gerichte</a>.<br/>
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(GerichtCodeJsonConverter))]
public enum GerichtCode
{
    /// <summary>
    /// <b>ZZ Test-Bund</b><br/>
    /// Code: 9A0000<br/>
    /// </summary>
    [XmlEnum("9A0000")]
    ZZ_Test_Bund,

    /// <summary>
    /// <b>ZZ Test-Baden-W&#252;rttemberg</b><br/>
    /// Code: 9B0000<br/>
    /// </summary>
    [XmlEnum("9B0000")]
    ZZ_Test_Baden_Wuerttemberg,

    /// <summary>
    /// <b>ZZ Test-Bayern</b><br/>
    /// Code: 9D0000<br/>
    /// </summary>
    [XmlEnum("9D0000")]
    ZZ_Test_Bayern,

    /// <summary>
    /// <b>ZZ Test-Berlin</b><br/>
    /// Code: 9F0000<br/>
    /// </summary>
    [XmlEnum("9F0000")]
    ZZ_Test_Berlin,

    /// <summary>
    /// <b>ZZ Test-Brandenburg</b><br/>
    /// Code: 9G0000<br/>
    /// </summary>
    [XmlEnum("9G0000")]
    ZZ_Test_Brandenburg,

    /// <summary>
    /// <b>ZZ Test-Bremen</b><br/>
    /// Code: 9H0000<br/>
    /// </summary>
    [XmlEnum("9H0000")]
    ZZ_Test_Bremen,

    /// <summary>
    /// <b>ZZ Test-Hamburg</b><br/>
    /// Code: 9K0000<br/>
    /// </summary>
    [XmlEnum("9K0000")]
    ZZ_Test_Hamburg,

    /// <summary>
    /// <b>ZZ Test-Hessen</b><br/>
    /// Code: 9M0000<br/>
    /// </summary>
    [XmlEnum("9M0000")]
    ZZ_Test_Hessen,

    /// <summary>
    /// <b>ZZ Test-Mecklenburg-Vorpommern</b><br/>
    /// Code: 9N0000<br/>
    /// </summary>
    [XmlEnum("9N0000")]
    ZZ_Test_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>ZZ Test-Niedersachsen</b><br/>
    /// Code: 9P0000<br/>
    /// </summary>
    [XmlEnum("9P0000")]
    ZZ_Test_Niedersachsen,

    /// <summary>
    /// <b>ZZ Test-Nordrhein-Westfalen</b><br/>
    /// Code: 9R0000<br/>
    /// </summary>
    [XmlEnum("9R0000")]
    ZZ_Test_Nordrhein_Westfalen,

    /// <summary>
    /// <b>ZZ Test-Rheinland-Pfalz</b><br/>
    /// Code: 9T0000<br/>
    /// </summary>
    [XmlEnum("9T0000")]
    ZZ_Test_Rheinland_Pfalz,

    /// <summary>
    /// <b>ZZ Test-Sachsen</b><br/>
    /// Code: 9U0000<br/>
    /// </summary>
    [XmlEnum("9U0000")]
    ZZ_Test_Sachsen,

    /// <summary>
    /// <b>ZZ Test-Saarland</b><br/>
    /// Code: 9V0000<br/>
    /// </summary>
    [XmlEnum("9V0000")]
    ZZ_Test_Saarland,

    /// <summary>
    /// <b>ZZ Test-Sachsen-Anhalt</b><br/>
    /// Code: 9W0000<br/>
    /// </summary>
    [XmlEnum("9W0000")]
    ZZ_Test_Sachsen_Anhalt,

    /// <summary>
    /// <b>ZZ Test-Schleswig-Holstein</b><br/>
    /// Code: 9X0000<br/>
    /// </summary>
    [XmlEnum("9X0000")]
    ZZ_Test_Schleswig_Holstein,

    /// <summary>
    /// <b>ZZ Test-Th&#252;ringen</b><br/>
    /// Code: 9Y0000<br/>
    /// </summary>
    [XmlEnum("9Y0000")]
    ZZ_Test_Thueringen,

    /// <summary>
    /// <b>Bundesgerichtshof Karlsruhe</b><br/>
    /// Code: A1000<br/>
    /// </summary>
    [XmlEnum("A1000")]
    Bundesgerichtshof_Karlsruhe,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof</b><br/>
    /// Code: A1000S<br/>
    /// </summary>
    [XmlEnum("A1000S")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof 5. Strafsenat</b><br/>
    /// Code: A1001S<br/>
    /// </summary>
    [XmlEnum("A1001S")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_5_Strafsenat,

    /// <summary>
    /// <b>Oberlandesgericht Karlsruhe</b><br/>
    /// Code: B1000<br/>
    /// </summary>
    [XmlEnum("B1000")]
    Oberlandesgericht_Karlsruhe,

    /// <summary>
    /// <b>Staatsanwaltschaften beim Oberlandesgericht Karlsruhe</b><br/>
    /// Code: B1000S<br/>
    /// </summary>
    [XmlEnum("B1000S")]
    Staatsanwaltschaften_beim_Oberlandesgericht_Karlsruhe,

    /// <summary>
    /// <b>Oberlandesgericht Karlsruhe Au&#223;enstelle Freiburg</b><br/>
    /// Code: B1001<br/>
    /// </summary>
    [XmlEnum("B1001")]
    Oberlandesgericht_Karlsruhe_Aussenstelle_Freiburg,

    /// <summary>
    /// <b>Landgericht Baden-Baden</b><br/>
    /// Code: B1100<br/>
    /// </summary>
    [XmlEnum("B1100")]
    Landgericht_Baden_Baden,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Baden-Baden</b><br/>
    /// Code: B1100S<br/>
    /// </summary>
    [XmlEnum("B1100S")]
    Staatsanwaltschaft_beim_Landgericht_Baden_Baden,

    /// <summary>
    /// <b>Amtsgericht Achern</b><br/>
    /// Code: B1101<br/>
    /// </summary>
    [XmlEnum("B1101")]
    Amtsgericht_Achern,

    /// <summary>
    /// <b>Grundbuchamt Achern</b><br/>
    /// Code: B1101G<br/>
    /// </summary>
    [XmlEnum("B1101G")]
    Grundbuchamt_Achern,

    /// <summary>
    /// <b>Amtsgericht Baden-Baden</b><br/>
    /// Code: B1102<br/>
    /// </summary>
    [XmlEnum("B1102")]
    Amtsgericht_Baden_Baden,

    /// <summary>
    /// <b>Amtsgericht B&#252;hl</b><br/>
    /// Code: B1103<br/>
    /// </summary>
    [XmlEnum("B1103")]
    Amtsgericht_Buehl,

    /// <summary>
    /// <b>Amtsgericht Gernsbach</b><br/>
    /// Code: B1104<br/>
    /// </summary>
    [XmlEnum("B1104")]
    Amtsgericht_Gernsbach,

    /// <summary>
    /// <b>Amtsgericht Rastatt</b><br/>
    /// Code: B1105<br/>
    /// </summary>
    [XmlEnum("B1105")]
    Amtsgericht_Rastatt,

    /// <summary>
    /// <b>Landgericht Freiburg i. Br.</b><br/>
    /// Code: B1200<br/>
    /// </summary>
    [XmlEnum("B1200")]
    Landgericht_Freiburg_i_Br,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Freiburg im Breisgau</b><br/>
    /// Code: B1200S<br/>
    /// </summary>
    [XmlEnum("B1200S")]
    Staatsanwaltschaft_beim_Landgericht_Freiburg_im_Breisgau,

    /// <summary>
    /// <b>Amtsgericht Breisach</b><br/>
    /// Code: B1201<br/>
    /// </summary>
    [XmlEnum("B1201")]
    Amtsgericht_Breisach,

    /// <summary>
    /// <b>Amtsgericht Emmendingen</b><br/>
    /// Code: B1202<br/>
    /// </summary>
    [XmlEnum("B1202")]
    Amtsgericht_Emmendingen,

    /// <summary>
    /// <b>Grundbuchamt Emmendingen</b><br/>
    /// Code: B1202G<br/>
    /// </summary>
    [XmlEnum("B1202G")]
    Grundbuchamt_Emmendingen,

    /// <summary>
    /// <b>Amtsgericht Ettenheim</b><br/>
    /// Code: B1203<br/>
    /// </summary>
    [XmlEnum("B1203")]
    Amtsgericht_Ettenheim,

    /// <summary>
    /// <b>Amtsgericht Freiburg</b><br/>
    /// Code: B1204<br/>
    /// </summary>
    [XmlEnum("B1204")]
    Amtsgericht_Freiburg,

    /// <summary>
    /// <b>Amtsgericht Kenzingen</b><br/>
    /// Code: B1205<br/>
    /// </summary>
    [XmlEnum("B1205")]
    Amtsgericht_Kenzingen,

    /// <summary>
    /// <b>Amtsgericht L&#246;rrach</b><br/>
    /// Code: B1206<br/>
    /// </summary>
    [XmlEnum("B1206")]
    Amtsgericht_Loerrach,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht L&#246;rrach, Zwst. der StA Freiburg im Breisgau</b><br/>
    /// Code: B1206S<br/>
    /// </summary>
    [XmlEnum("B1206S")]
    Staatsanwaltschaft_beim_Landgericht_Loerrach_Zwst_der_StA_Freiburg_im_Breisgau,

    /// <summary>
    /// <b>Amtsgericht M&#252;llheim</b><br/>
    /// Code: B1207<br/>
    /// </summary>
    [XmlEnum("B1207")]
    Amtsgericht_Muellheim,

    /// <summary>
    /// <b>Amtsgericht Titisee-Neustadt</b><br/>
    /// Code: B1208<br/>
    /// </summary>
    [XmlEnum("B1208")]
    Amtsgericht_Titisee_Neustadt,

    /// <summary>
    /// <b>Amtsgericht Staufen</b><br/>
    /// Code: B1209<br/>
    /// </summary>
    [XmlEnum("B1209")]
    Amtsgericht_Staufen,

    /// <summary>
    /// <b>Amtsgericht Waldkirch</b><br/>
    /// Code: B1210<br/>
    /// </summary>
    [XmlEnum("B1210")]
    Amtsgericht_Waldkirch,

    /// <summary>
    /// <b>Landgericht Heidelberg</b><br/>
    /// Code: B1300<br/>
    /// </summary>
    [XmlEnum("B1300")]
    Landgericht_Heidelberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Heidelberg</b><br/>
    /// Code: B1300S<br/>
    /// </summary>
    [XmlEnum("B1300S")]
    Staatsanwaltschaft_beim_Landgericht_Heidelberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eppingen</b><br/>
    /// Code: B1301<br/>
    /// </summary>
    [XmlEnum("B1301")]
    aufgeloest_Amtsgericht_Eppingen,

    /// <summary>
    /// <b>Amtsgericht Heidelberg</b><br/>
    /// Code: B1302<br/>
    /// </summary>
    [XmlEnum("B1302")]
    Amtsgericht_Heidelberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sinsheim, Zwst. Neckarbischofsheim</b><br/>
    /// Code: B1303<br/>
    /// </summary>
    [XmlEnum("B1303")]
    aufgeloest_Amtsgericht_Sinsheim_Zwst_Neckarbischofsheim,

    /// <summary>
    /// <b>Amtsgericht Sinsheim</b><br/>
    /// Code: B1304<br/>
    /// </summary>
    [XmlEnum("B1304")]
    Amtsgericht_Sinsheim,

    /// <summary>
    /// <b>Amtsgericht Wiesloch</b><br/>
    /// Code: B1305<br/>
    /// </summary>
    [XmlEnum("B1305")]
    Amtsgericht_Wiesloch,

    /// <summary>
    /// <b>Landgericht Karlsruhe</b><br/>
    /// Code: B1400<br/>
    /// </summary>
    [XmlEnum("B1400")]
    Landgericht_Karlsruhe,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Karlsruhe</b><br/>
    /// Code: B1400S<br/>
    /// </summary>
    [XmlEnum("B1400S")]
    Staatsanwaltschaft_beim_Landgericht_Karlsruhe,

    /// <summary>
    /// <b>Amtsgericht Bretten</b><br/>
    /// Code: B1401<br/>
    /// </summary>
    [XmlEnum("B1401")]
    Amtsgericht_Bretten,

    /// <summary>
    /// <b>Amtsgericht Bruchsal</b><br/>
    /// Code: B1402<br/>
    /// </summary>
    [XmlEnum("B1402")]
    Amtsgericht_Bruchsal,

    /// <summary>
    /// <b>Amtsgericht Ettlingen</b><br/>
    /// Code: B1403<br/>
    /// </summary>
    [XmlEnum("B1403")]
    Amtsgericht_Ettlingen,

    /// <summary>
    /// <b>Amtsgericht Karlsruhe</b><br/>
    /// Code: B1404<br/>
    /// </summary>
    [XmlEnum("B1404")]
    Amtsgericht_Karlsruhe,

    /// <summary>
    /// <b>Amtsgericht Karlsruhe, Zentrales Vollstreckungsgericht Baden-W&#252;rttemberg</b><br/>
    /// Code: B1404R<br/>
    /// </summary>
    [XmlEnum("B1404R")]
    Amtsgericht_Karlsruhe_Zentrales_Vollstreckungsgericht_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Amtsgericht Karlsruhe-Durlach</b><br/>
    /// Code: B1405<br/>
    /// </summary>
    [XmlEnum("B1405")]
    Amtsgericht_Karlsruhe_Durlach,

    /// <summary>
    /// <b>Amtsgericht Pforzheim</b><br/>
    /// Code: B1406<br/>
    /// </summary>
    [XmlEnum("B1406")]
    Amtsgericht_Pforzheim,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Pforzheim, Zwst. der StA Karlsruhe</b><br/>
    /// Code: B1406S<br/>
    /// </summary>
    [XmlEnum("B1406S")]
    Staatsanwaltschaft_beim_Landgericht_Pforzheim_Zwst_der_StA_Karlsruhe,

    /// <summary>
    /// <b>Amtsgericht Philippsburg</b><br/>
    /// Code: B1407<br/>
    /// </summary>
    [XmlEnum("B1407")]
    Amtsgericht_Philippsburg,

    /// <summary>
    /// <b>Amtsgericht Pforzheim Zweigstelle Neuenb&#252;rg</b><br/>
    /// Code: B1408<br/>
    /// </summary>
    [XmlEnum("B1408")]
    Amtsgericht_Pforzheim_Zweigstelle_Neuenbuerg,

    /// <summary>
    /// <b>Landgericht Konstanz</b><br/>
    /// Code: B1500<br/>
    /// </summary>
    [XmlEnum("B1500")]
    Landgericht_Konstanz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Konstanz</b><br/>
    /// Code: B1500S<br/>
    /// </summary>
    [XmlEnum("B1500S")]
    Staatsanwaltschaft_beim_Landgericht_Konstanz,

    /// <summary>
    /// <b>Amtsgericht Donaueschingen</b><br/>
    /// Code: B1501<br/>
    /// </summary>
    [XmlEnum("B1501")]
    Amtsgericht_Donaueschingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Engen</b><br/>
    /// Code: B1502<br/>
    /// </summary>
    [XmlEnum("B1502")]
    aufgeloest_Amtsgericht_Engen,

    /// <summary>
    /// <b>Amtsgericht Konstanz</b><br/>
    /// Code: B1503<br/>
    /// </summary>
    [XmlEnum("B1503")]
    Amtsgericht_Konstanz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Me&#223;kirch</b><br/>
    /// Code: B1504<br/>
    /// </summary>
    [XmlEnum("B1504")]
    aufgeloest_Amtsgericht_Messkirch,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sigmaringen, Zwst. Pfullendorf</b><br/>
    /// Code: B1505<br/>
    /// </summary>
    [XmlEnum("B1505")]
    aufgeloest_Amtsgericht_Sigmaringen_Zwst_Pfullendorf,

    /// <summary>
    /// <b>Amtsgericht Radolfzell</b><br/>
    /// Code: B1506<br/>
    /// </summary>
    [XmlEnum("B1506")]
    Amtsgericht_Radolfzell,

    /// <summary>
    /// <b>Amtsgericht Singen</b><br/>
    /// Code: B1507<br/>
    /// </summary>
    [XmlEnum("B1507")]
    Amtsgericht_Singen,

    /// <summary>
    /// <b>Amtsgericht Stockach</b><br/>
    /// Code: B1508<br/>
    /// </summary>
    [XmlEnum("B1508")]
    Amtsgericht_Stockach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Triberg im Schwarzwald</b><br/>
    /// Code: B1509<br/>
    /// </summary>
    [XmlEnum("B1509")]
    aufgeloest_Amtsgericht_Triberg_im_Schwarzwald,

    /// <summary>
    /// <b>Amtsgericht &#220;berlingen</b><br/>
    /// Code: B1510<br/>
    /// </summary>
    [XmlEnum("B1510")]
    Amtsgericht_Ueberlingen,

    /// <summary>
    /// <b>Amtsgericht Villingen-Schwenningen</b><br/>
    /// Code: B1511<br/>
    /// </summary>
    [XmlEnum("B1511")]
    Amtsgericht_Villingen_Schwenningen,

    /// <summary>
    /// <b>Grundbuchamt Villingen-Schwenningen</b><br/>
    /// Code: B1511G<br/>
    /// </summary>
    [XmlEnum("B1511G")]
    Grundbuchamt_Villingen_Schwenningen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Villingen-Schwenningen, Zwst. der StA Konstanz</b><br/>
    /// Code: B1511S<br/>
    /// </summary>
    [XmlEnum("B1511S")]
    Staatsanwaltschaft_beim_Landgericht_Villingen_Schwenningen_Zwst_der_StA_Konstanz,

    /// <summary>
    /// <b>Landgericht Konstanz Au&#223;enstelle Villingen-Schwenningen</b><br/>
    /// Code: B1512<br/>
    /// </summary>
    [XmlEnum("B1512")]
    Landgericht_Konstanz_Aussenstelle_Villingen_Schwenningen,

    /// <summary>
    /// <b>Landgericht Mannheim</b><br/>
    /// Code: B1600<br/>
    /// </summary>
    [XmlEnum("B1600")]
    Landgericht_Mannheim,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Mannheim</b><br/>
    /// Code: B1600S<br/>
    /// </summary>
    [XmlEnum("B1600S")]
    Staatsanwaltschaft_beim_Landgericht_Mannheim,

    /// <summary>
    /// <b>Amtsgericht Mannheim</b><br/>
    /// Code: B1601<br/>
    /// </summary>
    [XmlEnum("B1601")]
    Amtsgericht_Mannheim,

    /// <summary>
    /// <b>Grundbuchamt Mannheim</b><br/>
    /// Code: B1601G<br/>
    /// </summary>
    [XmlEnum("B1601G")]
    Grundbuchamt_Mannheim,

    /// <summary>
    /// <b>Amtsgericht Schwetzingen</b><br/>
    /// Code: B1602<br/>
    /// </summary>
    [XmlEnum("B1602")]
    Amtsgericht_Schwetzingen,

    /// <summary>
    /// <b>Amtsgericht Weinheim</b><br/>
    /// Code: B1603<br/>
    /// </summary>
    [XmlEnum("B1603")]
    Amtsgericht_Weinheim,

    /// <summary>
    /// <b>Landgericht Mosbach</b><br/>
    /// Code: B1700<br/>
    /// </summary>
    [XmlEnum("B1700")]
    Landgericht_Mosbach,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Mosbach</b><br/>
    /// Code: B1700S<br/>
    /// </summary>
    [XmlEnum("B1700S")]
    Staatsanwaltschaft_beim_Landgericht_Mosbach,

    /// <summary>
    /// <b>Amtsgericht Adelsheim</b><br/>
    /// Code: B1701<br/>
    /// </summary>
    [XmlEnum("B1701")]
    Amtsgericht_Adelsheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Boxberg</b><br/>
    /// Code: B1702<br/>
    /// </summary>
    [XmlEnum("B1702")]
    aufgeloest_Amtsgericht_Boxberg,

    /// <summary>
    /// <b>Amtsgericht Buchen</b><br/>
    /// Code: B1703<br/>
    /// </summary>
    [XmlEnum("B1703")]
    Amtsgericht_Buchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eberbach</b><br/>
    /// Code: B1704<br/>
    /// </summary>
    [XmlEnum("B1704")]
    aufgeloest_Amtsgericht_Eberbach,

    /// <summary>
    /// <b>Amtsgericht Mosbach</b><br/>
    /// Code: B1705<br/>
    /// </summary>
    [XmlEnum("B1705")]
    Amtsgericht_Mosbach,

    /// <summary>
    /// <b>Amtsgericht Tauberbischofsheim</b><br/>
    /// Code: B1706<br/>
    /// </summary>
    [XmlEnum("B1706")]
    Amtsgericht_Tauberbischofsheim,

    /// <summary>
    /// <b>Grundbuchamt Tauberbischofsheim</b><br/>
    /// Code: B1706G<br/>
    /// </summary>
    [XmlEnum("B1706G")]
    Grundbuchamt_Tauberbischofsheim,

    /// <summary>
    /// <b>Amtsgericht Wertheim</b><br/>
    /// Code: B1707<br/>
    /// </summary>
    [XmlEnum("B1707")]
    Amtsgericht_Wertheim,

    /// <summary>
    /// <b>Landgericht Offenburg</b><br/>
    /// Code: B1800<br/>
    /// </summary>
    [XmlEnum("B1800")]
    Landgericht_Offenburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Offenburg</b><br/>
    /// Code: B1800S<br/>
    /// </summary>
    [XmlEnum("B1800S")]
    Staatsanwaltschaft_beim_Landgericht_Offenburg,

    /// <summary>
    /// <b>Amtsgericht Gengenbach</b><br/>
    /// Code: B1801<br/>
    /// </summary>
    [XmlEnum("B1801")]
    Amtsgericht_Gengenbach,

    /// <summary>
    /// <b>Amtsgericht Kehl</b><br/>
    /// Code: B1802<br/>
    /// </summary>
    [XmlEnum("B1802")]
    Amtsgericht_Kehl,

    /// <summary>
    /// <b>Amtsgericht Lahr</b><br/>
    /// Code: B1803<br/>
    /// </summary>
    [XmlEnum("B1803")]
    Amtsgericht_Lahr,

    /// <summary>
    /// <b>Amtsgericht Oberkirch</b><br/>
    /// Code: B1804<br/>
    /// </summary>
    [XmlEnum("B1804")]
    Amtsgericht_Oberkirch,

    /// <summary>
    /// <b>Amtsgericht Offenburg</b><br/>
    /// Code: B1805<br/>
    /// </summary>
    [XmlEnum("B1805")]
    Amtsgericht_Offenburg,

    /// <summary>
    /// <b>Amtsgericht Wolfach</b><br/>
    /// Code: B1806<br/>
    /// </summary>
    [XmlEnum("B1806")]
    Amtsgericht_Wolfach,

    /// <summary>
    /// <b>Landgericht Waldshut-Tiengen</b><br/>
    /// Code: B1900<br/>
    /// </summary>
    [XmlEnum("B1900")]
    Landgericht_Waldshut_Tiengen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Waldshut-Tiengen (fr&#252;her: Waldshut)</b><br/>
    /// Code: B1900S<br/>
    /// </summary>
    [XmlEnum("B1900S")]
    Staatsanwaltschaft_beim_Landgericht_Waldshut_Tiengen_frueher_Waldshut,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bonndorf im Schwarzwald</b><br/>
    /// Code: B1901<br/>
    /// </summary>
    [XmlEnum("B1901")]
    aufgeloest_Amtsgericht_Bonndorf_im_Schwarzwald,

    /// <summary>
    /// <b>Amtsgericht Bad S&#228;ckingen</b><br/>
    /// Code: B1902<br/>
    /// </summary>
    [XmlEnum("B1902")]
    Amtsgericht_Bad_Saeckingen,

    /// <summary>
    /// <b>Amtsgericht St. Blasien</b><br/>
    /// Code: B1903<br/>
    /// </summary>
    [XmlEnum("B1903")]
    Amtsgericht_St_Blasien,

    /// <summary>
    /// <b>Amtsgericht Sch&#246;nau</b><br/>
    /// Code: B1904<br/>
    /// </summary>
    [XmlEnum("B1904")]
    Amtsgericht_Schoenau,

    /// <summary>
    /// <b>Amtsgericht Schopfheim</b><br/>
    /// Code: B1905<br/>
    /// </summary>
    [XmlEnum("B1905")]
    Amtsgericht_Schopfheim,

    /// <summary>
    /// <b>Amtsgericht Waldshut-Tiengen</b><br/>
    /// Code: B1906<br/>
    /// </summary>
    [XmlEnum("B1906")]
    Amtsgericht_Waldshut_Tiengen,

    /// <summary>
    /// <b>Oberlandesgericht Stuttgart</b><br/>
    /// Code: B2000<br/>
    /// </summary>
    [XmlEnum("B2000")]
    Oberlandesgericht_Stuttgart,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Stuttgart</b><br/>
    /// Code: B2000S<br/>
    /// </summary>
    [XmlEnum("B2000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Stuttgart,

    /// <summary>
    /// <b>Landgericht Ellwangen</b><br/>
    /// Code: B2100<br/>
    /// </summary>
    [XmlEnum("B2100")]
    Landgericht_Ellwangen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Ellwangen (Jagst)</b><br/>
    /// Code: B2100S<br/>
    /// </summary>
    [XmlEnum("B2100S")]
    Staatsanwaltschaft_beim_Landgericht_Ellwangen_Jagst,

    /// <summary>
    /// <b>Amtsgericht Aalen</b><br/>
    /// Code: B2101<br/>
    /// </summary>
    [XmlEnum("B2101")]
    Amtsgericht_Aalen,

    /// <summary>
    /// <b>Amtsgericht Bad Mergentheim</b><br/>
    /// Code: B2102<br/>
    /// </summary>
    [XmlEnum("B2102")]
    Amtsgericht_Bad_Mergentheim,

    /// <summary>
    /// <b>Amtsgericht Crailsheim</b><br/>
    /// Code: B2103<br/>
    /// </summary>
    [XmlEnum("B2103")]
    Amtsgericht_Crailsheim,

    /// <summary>
    /// <b>Amtsgericht Ellwangen</b><br/>
    /// Code: B2104<br/>
    /// </summary>
    [XmlEnum("B2104")]
    Amtsgericht_Ellwangen,

    /// <summary>
    /// <b>Amtsgericht Heidenheim</b><br/>
    /// Code: B2105<br/>
    /// </summary>
    [XmlEnum("B2105")]
    Amtsgericht_Heidenheim,

    /// <summary>
    /// <b>Amtsgericht Langenburg</b><br/>
    /// Code: B2106<br/>
    /// </summary>
    [XmlEnum("B2106")]
    Amtsgericht_Langenburg,

    /// <summary>
    /// <b>Amtsgericht Neresheim</b><br/>
    /// Code: B2107<br/>
    /// </summary>
    [XmlEnum("B2107")]
    Amtsgericht_Neresheim,

    /// <summary>
    /// <b>Amtsgericht Schw&#228;bisch Gm&#252;nd</b><br/>
    /// Code: B2108<br/>
    /// </summary>
    [XmlEnum("B2108")]
    Amtsgericht_Schwaebisch_Gmuend,

    /// <summary>
    /// <b>Grundbuchamt Schw&#228;bisch-Gm&#252;nd</b><br/>
    /// Code: B2108G<br/>
    /// </summary>
    [XmlEnum("B2108G")]
    Grundbuchamt_Schwaebisch_Gmuend,

    /// <summary>
    /// <b>Landgericht Hechingen</b><br/>
    /// Code: B2200<br/>
    /// </summary>
    [XmlEnum("B2200")]
    Landgericht_Hechingen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hechingen</b><br/>
    /// Code: B2200S<br/>
    /// </summary>
    [XmlEnum("B2200S")]
    Staatsanwaltschaft_beim_Landgericht_Hechingen,

    /// <summary>
    /// <b>Amtsgericht Balingen</b><br/>
    /// Code: B2201<br/>
    /// </summary>
    [XmlEnum("B2201")]
    Amtsgericht_Balingen,

    /// <summary>
    /// <b>Amtsgericht Albstadt</b><br/>
    /// Code: B2202<br/>
    /// </summary>
    [XmlEnum("B2202")]
    Amtsgericht_Albstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Haigerloch</b><br/>
    /// Code: B2203<br/>
    /// </summary>
    [XmlEnum("B2203")]
    aufgeloest_Amtsgericht_Haigerloch,

    /// <summary>
    /// <b>Amtsgericht Hechingen</b><br/>
    /// Code: B2204<br/>
    /// </summary>
    [XmlEnum("B2204")]
    Amtsgericht_Hechingen,

    /// <summary>
    /// <b>Amtsgericht Sigmaringen</b><br/>
    /// Code: B2205<br/>
    /// </summary>
    [XmlEnum("B2205")]
    Amtsgericht_Sigmaringen,

    /// <summary>
    /// <b>Grundbuchamt Sigmaringen</b><br/>
    /// Code: B2205G<br/>
    /// </summary>
    [XmlEnum("B2205G")]
    Grundbuchamt_Sigmaringen,

    /// <summary>
    /// <b>Landgericht Heilbronn</b><br/>
    /// Code: B2300<br/>
    /// </summary>
    [XmlEnum("B2300")]
    Landgericht_Heilbronn,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Heilbronn</b><br/>
    /// Code: B2300S<br/>
    /// </summary>
    [XmlEnum("B2300S")]
    Staatsanwaltschaft_beim_Landgericht_Heilbronn,

    /// <summary>
    /// <b>Amtsgericht Besigheim</b><br/>
    /// Code: B2301<br/>
    /// </summary>
    [XmlEnum("B2301")]
    Amtsgericht_Besigheim,

    /// <summary>
    /// <b>Amtsgericht Brackenheim</b><br/>
    /// Code: B2302<br/>
    /// </summary>
    [XmlEnum("B2302")]
    Amtsgericht_Brackenheim,

    /// <summary>
    /// <b>Amtsgericht Heilbronn</b><br/>
    /// Code: B2303<br/>
    /// </summary>
    [XmlEnum("B2303")]
    Amtsgericht_Heilbronn,

    /// <summary>
    /// <b>Grundbuchamt Heilbronn</b><br/>
    /// Code: B2303G<br/>
    /// </summary>
    [XmlEnum("B2303G")]
    Grundbuchamt_Heilbronn,

    /// <summary>
    /// <b>Amtsgericht K&#252;nzelsau</b><br/>
    /// Code: B2304<br/>
    /// </summary>
    [XmlEnum("B2304")]
    Amtsgericht_Kuenzelsau,

    /// <summary>
    /// <b>Amtsgericht Marbach a. N.</b><br/>
    /// Code: B2305<br/>
    /// </summary>
    [XmlEnum("B2305")]
    Amtsgericht_Marbach_a_N,

    /// <summary>
    /// <b>Amtsgericht Maulbronn</b><br/>
    /// Code: B2306<br/>
    /// </summary>
    [XmlEnum("B2306")]
    Amtsgericht_Maulbronn,

    /// <summary>
    /// <b>Grundbuchamt Maulbronn</b><br/>
    /// Code: B2306G<br/>
    /// </summary>
    [XmlEnum("B2306G")]
    Grundbuchamt_Maulbronn,

    /// <summary>
    /// <b>Amtsgericht &#214;hringen</b><br/>
    /// Code: B2307<br/>
    /// </summary>
    [XmlEnum("B2307")]
    Amtsgericht_Oehringen,

    /// <summary>
    /// <b>Amtsgericht Schw&#228;bisch Hall</b><br/>
    /// Code: B2308<br/>
    /// </summary>
    [XmlEnum("B2308")]
    Amtsgericht_Schwaebisch_Hall,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Schw&#228;bisch Hall, Zwst. der StA Heilbronn</b><br/>
    /// Code: B2308S<br/>
    /// </summary>
    [XmlEnum("B2308S")]
    Staatsanwaltschaft_beim_Landgericht_Schwaebisch_Hall_Zwst_der_StA_Heilbronn,

    /// <summary>
    /// <b>Amtsgericht Vaihingen</b><br/>
    /// Code: B2309<br/>
    /// </summary>
    [XmlEnum("B2309")]
    Amtsgericht_Vaihingen,

    /// <summary>
    /// <b>Landgericht Ravensburg</b><br/>
    /// Code: B2400<br/>
    /// </summary>
    [XmlEnum("B2400")]
    Landgericht_Ravensburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Ravensburg</b><br/>
    /// Code: B2400S<br/>
    /// </summary>
    [XmlEnum("B2400S")]
    Staatsanwaltschaft_beim_Landgericht_Ravensburg,

    /// <summary>
    /// <b>Amtsgericht Bad Waldsee</b><br/>
    /// Code: B2401<br/>
    /// </summary>
    [XmlEnum("B2401")]
    Amtsgericht_Bad_Waldsee,

    /// <summary>
    /// <b>Amtsgericht Biberach</b><br/>
    /// Code: B2402<br/>
    /// </summary>
    [XmlEnum("B2402")]
    Amtsgericht_Biberach,

    /// <summary>
    /// <b>Amtsgericht Leutkirch</b><br/>
    /// Code: B2403<br/>
    /// </summary>
    [XmlEnum("B2403")]
    Amtsgericht_Leutkirch,

    /// <summary>
    /// <b>Amtsgericht Ravensburg</b><br/>
    /// Code: B2404<br/>
    /// </summary>
    [XmlEnum("B2404")]
    Amtsgericht_Ravensburg,

    /// <summary>
    /// <b>Grundbuchamt Ravensburg</b><br/>
    /// Code: B2404G<br/>
    /// </summary>
    [XmlEnum("B2404G")]
    Grundbuchamt_Ravensburg,

    /// <summary>
    /// <b>Amtsgericht Riedlingen</b><br/>
    /// Code: B2405<br/>
    /// </summary>
    [XmlEnum("B2405")]
    Amtsgericht_Riedlingen,

    /// <summary>
    /// <b>Amtsgericht Bad Saulgau</b><br/>
    /// Code: B2406<br/>
    /// </summary>
    [XmlEnum("B2406")]
    Amtsgericht_Bad_Saulgau,

    /// <summary>
    /// <b>Amtsgericht Tettnang</b><br/>
    /// Code: B2407<br/>
    /// </summary>
    [XmlEnum("B2407")]
    Amtsgericht_Tettnang,

    /// <summary>
    /// <b>Amtsgericht Wangen</b><br/>
    /// Code: B2408<br/>
    /// </summary>
    [XmlEnum("B2408")]
    Amtsgericht_Wangen,

    /// <summary>
    /// <b>Landgericht Rottweil</b><br/>
    /// Code: B2500<br/>
    /// </summary>
    [XmlEnum("B2500")]
    Landgericht_Rottweil,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Rottweil</b><br/>
    /// Code: B2500S<br/>
    /// </summary>
    [XmlEnum("B2500S")]
    Staatsanwaltschaft_beim_Landgericht_Rottweil,

    /// <summary>
    /// <b>Amtsgericht Freudenstadt</b><br/>
    /// Code: B2501<br/>
    /// </summary>
    [XmlEnum("B2501")]
    Amtsgericht_Freudenstadt,

    /// <summary>
    /// <b>Amtsgericht Horb</b><br/>
    /// Code: B2502<br/>
    /// </summary>
    [XmlEnum("B2502")]
    Amtsgericht_Horb,

    /// <summary>
    /// <b>Amtsgericht Oberndorf</b><br/>
    /// Code: B2503<br/>
    /// </summary>
    [XmlEnum("B2503")]
    Amtsgericht_Oberndorf,

    /// <summary>
    /// <b>Amtsgericht Rottweil</b><br/>
    /// Code: B2504<br/>
    /// </summary>
    [XmlEnum("B2504")]
    Amtsgericht_Rottweil,

    /// <summary>
    /// <b>Amtsgericht Spaichingen</b><br/>
    /// Code: B2505<br/>
    /// </summary>
    [XmlEnum("B2505")]
    Amtsgericht_Spaichingen,

    /// <summary>
    /// <b>Amtsgericht Tuttlingen</b><br/>
    /// Code: B2506<br/>
    /// </summary>
    [XmlEnum("B2506")]
    Amtsgericht_Tuttlingen,

    /// <summary>
    /// <b>Landgericht Stuttgart</b><br/>
    /// Code: B2600<br/>
    /// </summary>
    [XmlEnum("B2600")]
    Landgericht_Stuttgart,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Stuttgart</b><br/>
    /// Code: B2600S<br/>
    /// </summary>
    [XmlEnum("B2600S")]
    Staatsanwaltschaft_beim_Landgericht_Stuttgart,

    /// <summary>
    /// <b>Amtsgericht Backnang</b><br/>
    /// Code: B2601<br/>
    /// </summary>
    [XmlEnum("B2601")]
    Amtsgericht_Backnang,

    /// <summary>
    /// <b>Amtsgericht B&#246;blingen</b><br/>
    /// Code: B2602<br/>
    /// </summary>
    [XmlEnum("B2602")]
    Amtsgericht_Boeblingen,

    /// <summary>
    /// <b>Grundbuchamt B&#246;blingen</b><br/>
    /// Code: B2602G<br/>
    /// </summary>
    [XmlEnum("B2602G")]
    Grundbuchamt_Boeblingen,

    /// <summary>
    /// <b>Amtsgericht Esslingen</b><br/>
    /// Code: B2603<br/>
    /// </summary>
    [XmlEnum("B2603")]
    Amtsgericht_Esslingen,

    /// <summary>
    /// <b>Amtsgericht Kirchheim</b><br/>
    /// Code: B2604<br/>
    /// </summary>
    [XmlEnum("B2604")]
    Amtsgericht_Kirchheim,

    /// <summary>
    /// <b>Amtsgericht Leonberg</b><br/>
    /// Code: B2605<br/>
    /// </summary>
    [XmlEnum("B2605")]
    Amtsgericht_Leonberg,

    /// <summary>
    /// <b>Amtsgericht Ludwigsburg</b><br/>
    /// Code: B2606<br/>
    /// </summary>
    [XmlEnum("B2606")]
    Amtsgericht_Ludwigsburg,

    /// <summary>
    /// <b>Amtsgericht N&#252;rtingen</b><br/>
    /// Code: B2607<br/>
    /// </summary>
    [XmlEnum("B2607")]
    Amtsgericht_Nuertingen,

    /// <summary>
    /// <b>Amtsgericht Schorndorf</b><br/>
    /// Code: B2608<br/>
    /// </summary>
    [XmlEnum("B2608")]
    Amtsgericht_Schorndorf,

    /// <summary>
    /// <b>Amtsgericht Stuttgart</b><br/>
    /// Code: B2609<br/>
    /// </summary>
    [XmlEnum("B2609")]
    Amtsgericht_Stuttgart,

    /// <summary>
    /// <b>Amtsgericht Stuttgart, Zentrales Mahngericht f&#252;r Baden-W&#252;rttemberg</b><br/>
    /// Code: B2609M<br/>
    /// </summary>
    [XmlEnum("B2609M")]
    Amtsgericht_Stuttgart_Zentrales_Mahngericht_fuer_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Amtsgericht Stuttgart-Bad Cannstatt</b><br/>
    /// Code: B2610<br/>
    /// </summary>
    [XmlEnum("B2610")]
    Amtsgericht_Stuttgart_Bad_Cannstatt,

    /// <summary>
    /// <b>Amtsgericht Waiblingen</b><br/>
    /// Code: B2611<br/>
    /// </summary>
    [XmlEnum("B2611")]
    Amtsgericht_Waiblingen,

    /// <summary>
    /// <b>Grundbuchamt Waiblingen</b><br/>
    /// Code: B2611G<br/>
    /// </summary>
    [XmlEnum("B2611G")]
    Grundbuchamt_Waiblingen,

    /// <summary>
    /// <b>Landgericht T&#252;bingen</b><br/>
    /// Code: B2700<br/>
    /// </summary>
    [XmlEnum("B2700")]
    Landgericht_Tuebingen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht T&#252;bingen</b><br/>
    /// Code: B2700S<br/>
    /// </summary>
    [XmlEnum("B2700S")]
    Staatsanwaltschaft_beim_Landgericht_Tuebingen,

    /// <summary>
    /// <b>Amtsgericht Calw</b><br/>
    /// Code: B2701<br/>
    /// </summary>
    [XmlEnum("B2701")]
    Amtsgericht_Calw,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Calw, Au&#223;enstelle der StA T&#252;bingen</b><br/>
    /// Code: B2701S<br/>
    /// </summary>
    [XmlEnum("B2701S")]
    Staatsanwaltschaft_beim_Landgericht_Calw_Aussenstelle_der_StA_Tuebingen,

    /// <summary>
    /// <b>Amtsgericht M&#252;nsingen</b><br/>
    /// Code: B2702<br/>
    /// </summary>
    [XmlEnum("B2702")]
    Amtsgericht_Muensingen,

    /// <summary>
    /// <b>Amtsgericht Nagold</b><br/>
    /// Code: B2703<br/>
    /// </summary>
    [XmlEnum("B2703")]
    Amtsgericht_Nagold,

    /// <summary>
    /// <b>Amtsgericht Reutlingen</b><br/>
    /// Code: B2705<br/>
    /// </summary>
    [XmlEnum("B2705")]
    Amtsgericht_Reutlingen,

    /// <summary>
    /// <b>Amtsgericht Rottenburg</b><br/>
    /// Code: B2706<br/>
    /// </summary>
    [XmlEnum("B2706")]
    Amtsgericht_Rottenburg,

    /// <summary>
    /// <b>Amtsgericht T&#252;bingen</b><br/>
    /// Code: B2707<br/>
    /// </summary>
    [XmlEnum("B2707")]
    Amtsgericht_Tuebingen,

    /// <summary>
    /// <b>Amtsgericht Bad Urach</b><br/>
    /// Code: B2708<br/>
    /// </summary>
    [XmlEnum("B2708")]
    Amtsgericht_Bad_Urach,

    /// <summary>
    /// <b>Landgericht Ulm</b><br/>
    /// Code: B2800<br/>
    /// </summary>
    [XmlEnum("B2800")]
    Landgericht_Ulm,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Ulm</b><br/>
    /// Code: B2800S<br/>
    /// </summary>
    [XmlEnum("B2800S")]
    Staatsanwaltschaft_beim_Landgericht_Ulm,

    /// <summary>
    /// <b>Amtsgericht Ehingen</b><br/>
    /// Code: B2801<br/>
    /// </summary>
    [XmlEnum("B2801")]
    Amtsgericht_Ehingen,

    /// <summary>
    /// <b>Amtsgericht Geislingen</b><br/>
    /// Code: B2802<br/>
    /// </summary>
    [XmlEnum("B2802")]
    Amtsgericht_Geislingen,

    /// <summary>
    /// <b>Amtsgericht G&#246;ppingen</b><br/>
    /// Code: B2803<br/>
    /// </summary>
    [XmlEnum("B2803")]
    Amtsgericht_Goeppingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Laupheim</b><br/>
    /// Code: B2804<br/>
    /// </summary>
    [XmlEnum("B2804")]
    aufgeloest_Amtsgericht_Laupheim,

    /// <summary>
    /// <b>Amtsgericht Ulm</b><br/>
    /// Code: B2805<br/>
    /// </summary>
    [XmlEnum("B2805")]
    Amtsgericht_Ulm,

    /// <summary>
    /// <b>Grundbuchamt Ulm</b><br/>
    /// Code: B2805G<br/>
    /// </summary>
    [XmlEnum("B2805G")]
    Grundbuchamt_Ulm,

    /// <summary>
    /// <b>Landgericht Karlsruhe Ausw&#228;rtige Strafkammer Pforzheim</b><br/>
    /// Code: B2900<br/>
    /// </summary>
    [XmlEnum("B2900")]
    Landgericht_Karlsruhe_Auswaertige_Strafkammer_Pforzheim,

    /// <summary>
    /// <b>Justizvollzugsanstalt Stuttgart</b><br/>
    /// Code: B6099<br/>
    /// </summary>
    [XmlEnum("B6099")]
    Justizvollzugsanstalt_Stuttgart,

    /// <summary>
    /// <b>Finanzgericht Baden-W&#252;rttemberg, Senate in Stuttgart</b><br/>
    /// Code: B6103<br/>
    /// </summary>
    [XmlEnum("B6103")]
    Finanzgericht_Baden_Wuerttemberg_Senate_in_Stuttgart,

    /// <summary>
    /// <b>Justizvollzugskrankenhaus Hohenasperg</b><br/>
    /// Code: B6149<br/>
    /// </summary>
    [XmlEnum("B6149")]
    Justizvollzugskrankenhaus_Hohenasperg,

    /// <summary>
    /// <b>Finanzgericht Baden-W&#252;rttemberg, Au&#223;ensenate in Freiburg</b><br/>
    /// Code: B6155<br/>
    /// </summary>
    [XmlEnum("B6155")]
    Finanzgericht_Baden_Wuerttemberg_Aussensenate_in_Freiburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Adelsheim</b><br/>
    /// Code: B6183<br/>
    /// </summary>
    [XmlEnum("B6183")]
    Justizvollzugsanstalt_Adelsheim,

    /// <summary>
    /// <b>Sozialgericht Freiburg</b><br/>
    /// Code: B6225<br/>
    /// </summary>
    [XmlEnum("B6225")]
    Sozialgericht_Freiburg,

    /// <summary>
    /// <b>Verwaltungsgericht Freiburg</b><br/>
    /// Code: B6226<br/>
    /// </summary>
    [XmlEnum("B6226")]
    Verwaltungsgericht_Freiburg,

    /// <summary>
    /// <b>Arbeitsgericht Freiburg -Kammern Freiburg-</b><br/>
    /// Code: B6227<br/>
    /// </summary>
    [XmlEnum("B6227")]
    Arbeitsgericht_Freiburg_Kammern_Freiburg,

    /// <summary>
    /// <b>Arbeitsgericht Heilbronn</b><br/>
    /// Code: B6228<br/>
    /// </summary>
    [XmlEnum("B6228")]
    Arbeitsgericht_Heilbronn,

    /// <summary>
    /// <b>Sozialgericht Heilbronn</b><br/>
    /// Code: B6229<br/>
    /// </summary>
    [XmlEnum("B6229")]
    Sozialgericht_Heilbronn,

    /// <summary>
    /// <b>Verwaltungsgericht Karlsruhe</b><br/>
    /// Code: B6230<br/>
    /// </summary>
    [XmlEnum("B6230")]
    Verwaltungsgericht_Karlsruhe,

    /// <summary>
    /// <b>Verwaltungsgericht Karlsruhe Au&#223;enstelle</b><br/>
    /// Code: B6231<br/>
    /// </summary>
    [XmlEnum("B6231")]
    Verwaltungsgericht_Karlsruhe_Aussenstelle,

    /// <summary>
    /// <b>Bundesverfassungsgericht</b><br/>
    /// Code: B6232<br/>
    /// </summary>
    [XmlEnum("B6232")]
    Bundesverfassungsgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Finanzgericht Baden-W&#252;rttemberg</b><br/>
    /// Code: B6233<br/>
    /// </summary>
    [XmlEnum("B6233")]
    aufgeloest_Finanzgericht_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Sozialgericht Karlsruhe</b><br/>
    /// Code: B6234<br/>
    /// </summary>
    [XmlEnum("B6234")]
    Sozialgericht_Karlsruhe,

    /// <summary>
    /// <b>Sozialgericht Konstanz</b><br/>
    /// Code: B6235<br/>
    /// </summary>
    [XmlEnum("B6235")]
    Sozialgericht_Konstanz,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht L&#246;rrach</b><br/>
    /// Code: B6236<br/>
    /// </summary>
    [XmlEnum("B6236")]
    aufgeloest_Arbeitsgericht_Loerrach,

    /// <summary>
    /// <b>Arbeitsgericht Mannheim</b><br/>
    /// Code: B6237<br/>
    /// </summary>
    [XmlEnum("B6237")]
    Arbeitsgericht_Mannheim,

    /// <summary>
    /// <b>Verwaltungsgerichtshof Baden-W&#252;rttemberg</b><br/>
    /// Code: B6238<br/>
    /// </summary>
    [XmlEnum("B6238")]
    Verwaltungsgerichtshof_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Arbeitsgericht Pforzheim</b><br/>
    /// Code: B6239<br/>
    /// </summary>
    [XmlEnum("B6239")]
    Arbeitsgericht_Pforzheim,

    /// <summary>
    /// <b>Sozialgericht Stuttgart</b><br/>
    /// Code: B6240<br/>
    /// </summary>
    [XmlEnum("B6240")]
    Sozialgericht_Stuttgart,

    /// <summary>
    /// <b>Arbeitsgericht Stuttgart</b><br/>
    /// Code: B6241<br/>
    /// </summary>
    [XmlEnum("B6241")]
    Arbeitsgericht_Stuttgart,

    /// <summary>
    /// <b>Verwaltungsgericht Stuttgart</b><br/>
    /// Code: B6242<br/>
    /// </summary>
    [XmlEnum("B6242")]
    Verwaltungsgericht_Stuttgart,

    /// <summary>
    /// <b>Verfassungsgerichtshof f&#252;r das Land Baden-W&#252;rttemberg</b><br/>
    /// Code: B6243<br/>
    /// </summary>
    [XmlEnum("B6243")]
    Verfassungsgerichtshof_fuer_das_Land_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Landesarbeitsgericht Baden-W&#252;rttemberg</b><br/>
    /// Code: B6244<br/>
    /// </summary>
    [XmlEnum("B6244")]
    Landesarbeitsgericht_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Arbeitsgericht Ulm</b><br/>
    /// Code: B6245<br/>
    /// </summary>
    [XmlEnum("B6245")]
    Arbeitsgericht_Ulm,

    /// <summary>
    /// <b>Landessozialgericht Baden-W&#252;rttemberg</b><br/>
    /// Code: B6246<br/>
    /// </summary>
    [XmlEnum("B6246")]
    Landessozialgericht_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Sozialgericht Ulm</b><br/>
    /// Code: B6250<br/>
    /// </summary>
    [XmlEnum("B6250")]
    Sozialgericht_Ulm,

    /// <summary>
    /// <b>Arbeitsgericht Reutlingen</b><br/>
    /// Code: B6461<br/>
    /// </summary>
    [XmlEnum("B6461")]
    Arbeitsgericht_Reutlingen,

    /// <summary>
    /// <b>Sozialgericht Mannheim</b><br/>
    /// Code: B6518<br/>
    /// </summary>
    [XmlEnum("B6518")]
    Sozialgericht_Mannheim,

    /// <summary>
    /// <b>Sozialgericht Reutlingen</b><br/>
    /// Code: B6519<br/>
    /// </summary>
    [XmlEnum("B6519")]
    Sozialgericht_Reutlingen,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Freiburg</b><br/>
    /// Code: B6547<br/>
    /// </summary>
    [XmlEnum("B6547")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Freiburg,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Karlsruhe</b><br/>
    /// Code: B6550<br/>
    /// </summary>
    [XmlEnum("B6550")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Karlsruhe,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Stuttgart</b><br/>
    /// Code: B6551<br/>
    /// </summary>
    [XmlEnum("B6551")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Stuttgart,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer T&#252;bingen</b><br/>
    /// Code: B6577<br/>
    /// </summary>
    [XmlEnum("B6577")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Tuebingen,

    /// <summary>
    /// <b>Anwaltsgerichtshof Baden-W&#252;rttemberg</b><br/>
    /// Code: B6579<br/>
    /// </summary>
    [XmlEnum("B6579")]
    Anwaltsgerichtshof_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Sozialtherapeutische Anstalt Baden-W&#252;rttemberg Asperg</b><br/>
    /// Code: B6704<br/>
    /// </summary>
    [XmlEnum("B6704")]
    Sozialtherapeutische_Anstalt_Baden_Wuerttemberg_Asperg,

    /// <summary>
    /// <b>Jugendarrestanstalt G&#246;ppingen</b><br/>
    /// Code: B7423<br/>
    /// </summary>
    [XmlEnum("B7423")]
    Jugendarrestanstalt_Goeppingen,

    /// <summary>
    /// <b>Notariat VII Mannheim -Nachlassgericht-</b><br/>
    /// Code: B7554<br/>
    /// </summary>
    [XmlEnum("B7554")]
    Notariat_VII_Mannheim_Nachlassgericht,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bruchsal</b><br/>
    /// Code: B7645<br/>
    /// </summary>
    [XmlEnum("B7645")]
    Justizvollzugsanstalt_Bruchsal,

    /// <summary>
    /// <b>Landesarbeitsgericht Baden-W&#252;rttemberg Kammern Freiburg</b><br/>
    /// Code: B7691<br/>
    /// </summary>
    [XmlEnum("B7691")]
    Landesarbeitsgericht_Baden_Wuerttemberg_Kammern_Freiburg,

    /// <summary>
    /// <b>Landesarbeitsgericht Baden-W&#252;rttemberg Kammern Mannheim</b><br/>
    /// Code: B7692<br/>
    /// </summary>
    [XmlEnum("B7692")]
    Landesarbeitsgericht_Baden_Wuerttemberg_Kammern_Mannheim,

    /// <summary>
    /// <b>Arbeitsgericht Karlsruhe</b><br/>
    /// Code: B7696<br/>
    /// </summary>
    [XmlEnum("B7696")]
    Arbeitsgericht_Karlsruhe,

    /// <summary>
    /// <b>Justizvollzugsanstalt Schw&#228;bisch Gm&#252;nd</b><br/>
    /// Code: B7761<br/>
    /// </summary>
    [XmlEnum("B7761")]
    Justizvollzugsanstalt_Schwaebisch_Gmuend,

    /// <summary>
    /// <b>Verwaltungsgericht Sigmaringen</b><br/>
    /// Code: B7820<br/>
    /// </summary>
    [XmlEnum("B7820")]
    Verwaltungsgericht_Sigmaringen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Freiburg</b><br/>
    /// Code: B7841<br/>
    /// </summary>
    [XmlEnum("B7841")]
    Justizvollzugsanstalt_Freiburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ulm</b><br/>
    /// Code: B7846<br/>
    /// </summary>
    [XmlEnum("B7846")]
    Justizvollzugsanstalt_Ulm,

    /// <summary>
    /// <b>Justizvollzugsanstalt Mannheim</b><br/>
    /// Code: B8322<br/>
    /// </summary>
    [XmlEnum("B8322")]
    Justizvollzugsanstalt_Mannheim,

    /// <summary>
    /// <b>Justizvollzugsanstalt Heilbronn</b><br/>
    /// Code: B8375<br/>
    /// </summary>
    [XmlEnum("B8375")]
    Justizvollzugsanstalt_Heilbronn,

    /// <summary>
    /// <b>Justizvollzugsanstalt Heimsheim</b><br/>
    /// Code: B8376<br/>
    /// </summary>
    [XmlEnum("B8376")]
    Justizvollzugsanstalt_Heimsheim,

    /// <summary>
    /// <b>Justizvollzugsanstalt Karlsruhe</b><br/>
    /// Code: B8377<br/>
    /// </summary>
    [XmlEnum("B8377")]
    Justizvollzugsanstalt_Karlsruhe,

    /// <summary>
    /// <b>Justizvollzugsanstalt Konstanz</b><br/>
    /// Code: B8378<br/>
    /// </summary>
    [XmlEnum("B8378")]
    Justizvollzugsanstalt_Konstanz,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ravensburg</b><br/>
    /// Code: B8379<br/>
    /// </summary>
    [XmlEnum("B8379")]
    Justizvollzugsanstalt_Ravensburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rottweil</b><br/>
    /// Code: B8380<br/>
    /// </summary>
    [XmlEnum("B8380")]
    Justizvollzugsanstalt_Rottweil,

    /// <summary>
    /// <b>Justizvollzugsanstalt Waldshut-Tiengen</b><br/>
    /// Code: B8381<br/>
    /// </summary>
    [XmlEnum("B8381")]
    Justizvollzugsanstalt_Waldshut_Tiengen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Schw&#228;bisch-Hall</b><br/>
    /// Code: B8392<br/>
    /// </summary>
    [XmlEnum("B8392")]
    Justizvollzugsanstalt_Schwaebisch_Hall,

    /// <summary>
    /// <b>Registergericht Amtsgericht Stuttgart</b><br/>
    /// Code: B8534<br/>
    /// </summary>
    [XmlEnum("B8534")]
    Registergericht_Amtsgericht_Stuttgart,

    /// <summary>
    /// <b>Registergericht Amtsgericht Mannheim</b><br/>
    /// Code: B8535<br/>
    /// </summary>
    [XmlEnum("B8535")]
    Registergericht_Amtsgericht_Mannheim,

    /// <summary>
    /// <b>Registergericht Amtsgericht Freiburg i. Br.</b><br/>
    /// Code: B8536<br/>
    /// </summary>
    [XmlEnum("B8536")]
    Registergericht_Amtsgericht_Freiburg_i_Br,

    /// <summary>
    /// <b>Registergericht Amtsgericht Ulm</b><br/>
    /// Code: B8537<br/>
    /// </summary>
    [XmlEnum("B8537")]
    Registergericht_Amtsgericht_Ulm,

    /// <summary>
    /// <b>Justizvollzugsanstalt Offenburg</b><br/>
    /// Code: B8559<br/>
    /// </summary>
    [XmlEnum("B8559")]
    Justizvollzugsanstalt_Offenburg,

    /// <summary>
    /// <b>Grundbuchzentralarchiv Baden-W&#252;rttemberg</b><br/>
    /// Code: B8721G<br/>
    /// </summary>
    [XmlEnum("B8721G")]
    Grundbuchzentralarchiv_Baden_Wuerttemberg,

    /// <summary>
    /// <b>Arbeitsgericht Stuttgart, Au&#223;enstelle Aalen</b><br/>
    /// Code: B8940<br/>
    /// </summary>
    [XmlEnum("B8940")]
    Arbeitsgericht_Stuttgart_Aussenstelle_Aalen,

    /// <summary>
    /// <b>Arbeitsgericht Stuttgart, Au&#223;enstelle Ludwigsburg</b><br/>
    /// Code: B8941<br/>
    /// </summary>
    [XmlEnum("B8941")]
    Arbeitsgericht_Stuttgart_Aussenstelle_Ludwigsburg,

    /// <summary>
    /// <b>Arbeitsgericht Freiburg, Kammern Offenburg, Offenburg</b><br/>
    /// Code: B9023<br/>
    /// </summary>
    [XmlEnum("B9023")]
    Arbeitsgericht_Freiburg_Kammern_Offenburg_Offenburg,

    /// <summary>
    /// <b>Arbeitsgericht Heilbronn, Kammern Crailsheim, Crailsheim</b><br/>
    /// Code: B9024<br/>
    /// </summary>
    [XmlEnum("B9024")]
    Arbeitsgericht_Heilbronn_Kammern_Crailsheim_Crailsheim,

    /// <summary>
    /// <b>Arbeitsgericht Ulm, Kammern Ravensburg, Ravensburg</b><br/>
    /// Code: B9025<br/>
    /// </summary>
    [XmlEnum("B9025")]
    Arbeitsgericht_Ulm_Kammern_Ravensburg_Ravensburg,

    /// <summary>
    /// <b>Arbeitsgericht Villingen-Schwenningen,Villingen-Schwenningen</b><br/>
    /// Code: B9026<br/>
    /// </summary>
    [XmlEnum("B9026")]
    Arbeitsgericht_Villingen_Schwenningen_Villingen_Schwenningen,

    /// <summary>
    /// <b>Arbeitsgericht Villingen-Schwenningen, Kammern Radolfzell, Radolfzell</b><br/>
    /// Code: B9027<br/>
    /// </summary>
    [XmlEnum("B9027")]
    Arbeitsgericht_Villingen_Schwenningen_Kammern_Radolfzell_Radolfzell,

    /// <summary>
    /// <b>Arbeitsgericht Mannheim, Kammern Heidelberg, Heidelberg</b><br/>
    /// Code: B9028<br/>
    /// </summary>
    [XmlEnum("B9028")]
    Arbeitsgericht_Mannheim_Kammern_Heidelberg_Heidelberg,

    /// <summary>
    /// <b>Arbeitsgericht Freiburg, Kammern L&#246;rrach</b><br/>
    /// Code: B9029<br/>
    /// </summary>
    [XmlEnum("B9029")]
    Arbeitsgericht_Freiburg_Kammern_Loerrach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rottenburg</b><br/>
    /// Code: B9162<br/>
    /// </summary>
    [XmlEnum("B9162")]
    Justizvollzugsanstalt_Rottenburg,

    /// <summary>
    /// <b>Europ&#228;ische Staatsanwaltschaft (EPPO/EUStA)</b><br/>
    /// Code: C6087<br/>
    /// </summary>
    [XmlEnum("C6087")]
    Europaeische_Staatsanwaltschaft_EPPO_EUStA,

    /// <summary>
    /// <b>Bayerisches Oberstes Landesgericht M&#252;nchen</b><br/>
    /// Code: D1000<br/>
    /// </summary>
    [XmlEnum("D1000")]
    Bayerisches_Oberstes_Landesgericht_Muenchen,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft bei dem Bayerischen Obersten Landesgericht M&#252;nchen</b><br/>
    /// Code: D1000S<br/>
    /// </summary>
    [XmlEnum("D1000S")]
    aufgeloest_Staatsanwaltschaft_bei_dem_Bayerischen_Obersten_Landesgericht_Muenchen,

    /// <summary>
    /// <b>Oberlandesgericht M&#252;nchen</b><br/>
    /// Code: D2000<br/>
    /// </summary>
    [XmlEnum("D2000")]
    Oberlandesgericht_Muenchen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht M&#252;nchen</b><br/>
    /// Code: D2000S<br/>
    /// </summary>
    [XmlEnum("D2000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Muenchen,

    /// <summary>
    /// <b>Landgericht Augsburg</b><br/>
    /// Code: D2100<br/>
    /// </summary>
    [XmlEnum("D2100")]
    Landgericht_Augsburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Augsburg</b><br/>
    /// Code: D2100S<br/>
    /// </summary>
    [XmlEnum("D2100S")]
    Staatsanwaltschaft_beim_Landgericht_Augsburg,

    /// <summary>
    /// <b>Amtsgericht Aichach</b><br/>
    /// Code: D2101<br/>
    /// </summary>
    [XmlEnum("D2101")]
    Amtsgericht_Aichach,

    /// <summary>
    /// <b>Grundbuchamt Aichach</b><br/>
    /// Code: D2101G<br/>
    /// </summary>
    [XmlEnum("D2101G")]
    Grundbuchamt_Aichach,

    /// <summary>
    /// <b>Amtsgericht Augsburg</b><br/>
    /// Code: D2102<br/>
    /// </summary>
    [XmlEnum("D2102")]
    Amtsgericht_Augsburg,

    /// <summary>
    /// <b>Grundbuchamt Augsburg</b><br/>
    /// Code: D2102G<br/>
    /// </summary>
    [XmlEnum("D2102G")]
    Grundbuchamt_Augsburg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Augsburg</b><br/>
    /// Code: D2102V<br/>
    /// </summary>
    [XmlEnum("D2102V")]
    Registergericht_Amtsgericht_Augsburg,

    /// <summary>
    /// <b>Amtsgericht Dillingen</b><br/>
    /// Code: D2103<br/>
    /// </summary>
    [XmlEnum("D2103")]
    Amtsgericht_Dillingen,

    /// <summary>
    /// <b>Grundbuchamt Dillingen</b><br/>
    /// Code: D2103G<br/>
    /// </summary>
    [XmlEnum("D2103G")]
    Grundbuchamt_Dillingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht N&#246;rdlingen, Zweigstelle Donauw&#246;rth</b><br/>
    /// Code: D2104<br/>
    /// </summary>
    [XmlEnum("D2104")]
    aufgeloest_Amtsgericht_Noerdlingen_Zweigstelle_Donauwoerth,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Friedberg (Bayern)</b><br/>
    /// Code: D2105<br/>
    /// </summary>
    [XmlEnum("D2105")]
    aufgeloest_Amtsgericht_Friedberg_Bayern,

    /// <summary>
    /// <b>Amtsgericht Landsberg</b><br/>
    /// Code: D2106<br/>
    /// </summary>
    [XmlEnum("D2106")]
    Amtsgericht_Landsberg,

    /// <summary>
    /// <b>Grundbuchamt Landsberg</b><br/>
    /// Code: D2106G<br/>
    /// </summary>
    [XmlEnum("D2106G")]
    Grundbuchamt_Landsberg,

    /// <summary>
    /// <b>Amtsgericht N&#246;rdlingen</b><br/>
    /// Code: D2108<br/>
    /// </summary>
    [XmlEnum("D2108")]
    Amtsgericht_Noerdlingen,

    /// <summary>
    /// <b>Grundbuchamt N&#246;rdlingen</b><br/>
    /// Code: D2108G<br/>
    /// </summary>
    [XmlEnum("D2108G")]
    Grundbuchamt_Noerdlingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schrobenhausen</b><br/>
    /// Code: D2109<br/>
    /// </summary>
    [XmlEnum("D2109")]
    aufgeloest_Amtsgericht_Schrobenhausen,

    /// <summary>
    /// <b>Amtsgericht Augsburg Zweigstelle Schwabm&#252;nchen</b><br/>
    /// Code: D2110<br/>
    /// </summary>
    [XmlEnum("D2110")]
    Amtsgericht_Augsburg_Zweigstelle_Schwabmuenchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wertingen</b><br/>
    /// Code: D2111<br/>
    /// </summary>
    [XmlEnum("D2111")]
    aufgeloest_Amtsgericht_Wertingen,

    /// <summary>
    /// <b>Landgericht Augsburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Aichach</b><br/>
    /// Code: D2120<br/>
    /// </summary>
    [XmlEnum("D2120")]
    Landgericht_Augsburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Aichach,

    /// <summary>
    /// <b>Landgericht Augsburg Strafvollstreckungskammer N&#246;rdlingen</b><br/>
    /// Code: D2130<br/>
    /// </summary>
    [XmlEnum("D2130")]
    Landgericht_Augsburg_Strafvollstreckungskammer_Noerdlingen,

    /// <summary>
    /// <b>Landgericht Augsburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Landsberg</b><br/>
    /// Code: D2140<br/>
    /// </summary>
    [XmlEnum("D2140")]
    Landgericht_Augsburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Landsberg,

    /// <summary>
    /// <b>Landgericht Deggendorf</b><br/>
    /// Code: D2200<br/>
    /// </summary>
    [XmlEnum("D2200")]
    Landgericht_Deggendorf,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Deggendorf</b><br/>
    /// Code: D2200S<br/>
    /// </summary>
    [XmlEnum("D2200S")]
    Staatsanwaltschaft_beim_Landgericht_Deggendorf,

    /// <summary>
    /// <b>Amtsgericht Deggendorf</b><br/>
    /// Code: D2201<br/>
    /// </summary>
    [XmlEnum("D2201")]
    Amtsgericht_Deggendorf,

    /// <summary>
    /// <b>Grundbuchamt Deggendorf</b><br/>
    /// Code: D2201G<br/>
    /// </summary>
    [XmlEnum("D2201G")]
    Grundbuchamt_Deggendorf,

    /// <summary>
    /// <b>Registergericht Amtsgericht Deggendorf</b><br/>
    /// Code: D2201V<br/>
    /// </summary>
    [XmlEnum("D2201V")]
    Registergericht_Amtsgericht_Deggendorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Grafenau</b><br/>
    /// Code: D2202<br/>
    /// </summary>
    [XmlEnum("D2202")]
    aufgeloest_Amtsgericht_Grafenau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hengersberg</b><br/>
    /// Code: D2203<br/>
    /// </summary>
    [XmlEnum("D2203")]
    aufgeloest_Amtsgericht_Hengersberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Regen</b><br/>
    /// Code: D2204<br/>
    /// </summary>
    [XmlEnum("D2204")]
    aufgeloest_Amtsgericht_Regen,

    /// <summary>
    /// <b>Amtsgericht Viechtach</b><br/>
    /// Code: D2205<br/>
    /// </summary>
    [XmlEnum("D2205")]
    Amtsgericht_Viechtach,

    /// <summary>
    /// <b>Grundbuchamt Viechtach</b><br/>
    /// Code: D2205G<br/>
    /// </summary>
    [XmlEnum("D2205G")]
    Grundbuchamt_Viechtach,

    /// <summary>
    /// <b>Landgericht Kempten</b><br/>
    /// Code: D2300<br/>
    /// </summary>
    [XmlEnum("D2300")]
    Landgericht_Kempten,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Kempten (Allg&#228;u)</b><br/>
    /// Code: D2300S<br/>
    /// </summary>
    [XmlEnum("D2300S")]
    Staatsanwaltschaft_beim_Landgericht_Kempten_Allgaeu,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kaufbeuren, Zweigstelle F&#252;ssen</b><br/>
    /// Code: D2301<br/>
    /// </summary>
    [XmlEnum("D2301")]
    aufgeloest_Amtsgericht_Kaufbeuren_Zweigstelle_Fuessen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Immenstadt i. Allg&#228;u</b><br/>
    /// Code: D2302<br/>
    /// </summary>
    [XmlEnum("D2302")]
    aufgeloest_Amtsgericht_Immenstadt_i_Allgaeu,

    /// <summary>
    /// <b>Amtsgericht Kaufbeuren</b><br/>
    /// Code: D2303<br/>
    /// </summary>
    [XmlEnum("D2303")]
    Amtsgericht_Kaufbeuren,

    /// <summary>
    /// <b>Grundbuchamt Kaufbeuren</b><br/>
    /// Code: D2303G<br/>
    /// </summary>
    [XmlEnum("D2303G")]
    Grundbuchamt_Kaufbeuren,

    /// <summary>
    /// <b>Amtsgericht Kempten</b><br/>
    /// Code: D2304<br/>
    /// </summary>
    [XmlEnum("D2304")]
    Amtsgericht_Kempten,

    /// <summary>
    /// <b>Grundbuchamt Kempten</b><br/>
    /// Code: D2304G<br/>
    /// </summary>
    [XmlEnum("D2304G")]
    Grundbuchamt_Kempten,

    /// <summary>
    /// <b>Registergericht Amtsgericht Kempten</b><br/>
    /// Code: D2304V<br/>
    /// </summary>
    [XmlEnum("D2304V")]
    Registergericht_Amtsgericht_Kempten,

    /// <summary>
    /// <b>Amtsgericht Lindau</b><br/>
    /// Code: D2305<br/>
    /// </summary>
    [XmlEnum("D2305")]
    Amtsgericht_Lindau,

    /// <summary>
    /// <b>Grundbuchamt Lindau</b><br/>
    /// Code: D2305G<br/>
    /// </summary>
    [XmlEnum("D2305G")]
    Grundbuchamt_Lindau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kaufbeuren, Zwst. Marktoberdorf</b><br/>
    /// Code: D2306<br/>
    /// </summary>
    [XmlEnum("D2306")]
    aufgeloest_Amtsgericht_Kaufbeuren_Zwst_Marktoberdorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Weilheim Zweigstelle Schongau</b><br/>
    /// Code: D2307<br/>
    /// </summary>
    [XmlEnum("D2307")]
    aufgeloest_Amtsgericht_Weilheim_Zweigstelle_Schongau,

    /// <summary>
    /// <b>Amtsgericht Sonthofen</b><br/>
    /// Code: D2308<br/>
    /// </summary>
    [XmlEnum("D2308")]
    Amtsgericht_Sonthofen,

    /// <summary>
    /// <b>Grundbuchamt Sonthofen</b><br/>
    /// Code: D2308G<br/>
    /// </summary>
    [XmlEnum("D2308G")]
    Grundbuchamt_Sonthofen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Weiler-Lindenberg</b><br/>
    /// Code: D2309<br/>
    /// </summary>
    [XmlEnum("D2309")]
    aufgeloest_Amtsgericht_Weiler_Lindenberg,

    /// <summary>
    /// <b>Landgericht Landshut</b><br/>
    /// Code: D2400<br/>
    /// </summary>
    [XmlEnum("D2400")]
    Landgericht_Landshut,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Landshut</b><br/>
    /// Code: D2400S<br/>
    /// </summary>
    [XmlEnum("D2400S")]
    Staatsanwaltschaft_beim_Landgericht_Landshut,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dingolfing</b><br/>
    /// Code: D2401<br/>
    /// </summary>
    [XmlEnum("D2401")]
    aufgeloest_Amtsgericht_Dingolfing,

    /// <summary>
    /// <b>Amtsgericht Eggenfelden</b><br/>
    /// Code: D2402<br/>
    /// </summary>
    [XmlEnum("D2402")]
    Amtsgericht_Eggenfelden,

    /// <summary>
    /// <b>Grundbuchamt Eggenfelden</b><br/>
    /// Code: D2402G<br/>
    /// </summary>
    [XmlEnum("D2402G")]
    Grundbuchamt_Eggenfelden,

    /// <summary>
    /// <b>Amtsgericht Landau (Bay)</b><br/>
    /// Code: D2403<br/>
    /// </summary>
    [XmlEnum("D2403")]
    Amtsgericht_Landau_Bay,

    /// <summary>
    /// <b>Grundbuchamt Landau</b><br/>
    /// Code: D2403G<br/>
    /// </summary>
    [XmlEnum("D2403G")]
    Grundbuchamt_Landau,

    /// <summary>
    /// <b>Amtsgericht Landshut</b><br/>
    /// Code: D2404<br/>
    /// </summary>
    [XmlEnum("D2404")]
    Amtsgericht_Landshut,

    /// <summary>
    /// <b>Grundbuchamt Landshut</b><br/>
    /// Code: D2404G<br/>
    /// </summary>
    [XmlEnum("D2404G")]
    Grundbuchamt_Landshut,

    /// <summary>
    /// <b>Registergericht Amtsgericht Landshut</b><br/>
    /// Code: D2404V<br/>
    /// </summary>
    [XmlEnum("D2404V")]
    Registergericht_Amtsgericht_Landshut,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kelheim Zweigstelle Mainburg</b><br/>
    /// Code: D2405<br/>
    /// </summary>
    [XmlEnum("D2405")]
    aufgeloest_Amtsgericht_Kelheim_Zweigstelle_Mainburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Mallersdorf</b><br/>
    /// Code: D2406<br/>
    /// </summary>
    [XmlEnum("D2406")]
    aufgeloest_Amtsgericht_Mallersdorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freising Zweigstelle Moosburg</b><br/>
    /// Code: D2407<br/>
    /// </summary>
    [XmlEnum("D2407")]
    aufgeloest_Amtsgericht_Freising_Zweigstelle_Moosburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neumarkt-St. Veit</b><br/>
    /// Code: D2408<br/>
    /// </summary>
    [XmlEnum("D2408")]
    aufgeloest_Amtsgericht_Neumarkt_St_Veit,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rottenburg a. d. Laaber</b><br/>
    /// Code: D2409<br/>
    /// </summary>
    [XmlEnum("D2409")]
    aufgeloest_Amtsgericht_Rottenburg_a_d_Laaber,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Vilsbiburg</b><br/>
    /// Code: D2410<br/>
    /// </summary>
    [XmlEnum("D2410")]
    aufgeloest_Amtsgericht_Vilsbiburg,

    /// <summary>
    /// <b>Amtsgericht Erding</b><br/>
    /// Code: D2411<br/>
    /// </summary>
    [XmlEnum("D2411")]
    Amtsgericht_Erding,

    /// <summary>
    /// <b>Grundbuchamt Erding</b><br/>
    /// Code: D2411G<br/>
    /// </summary>
    [XmlEnum("D2411G")]
    Grundbuchamt_Erding,

    /// <summary>
    /// <b>Amtsgericht Freising</b><br/>
    /// Code: D2412<br/>
    /// </summary>
    [XmlEnum("D2412")]
    Amtsgericht_Freising,

    /// <summary>
    /// <b>Grundbuchamt Freising</b><br/>
    /// Code: D2412G<br/>
    /// </summary>
    [XmlEnum("D2412G")]
    Grundbuchamt_Freising,

    /// <summary>
    /// <b>Landgericht Landshut Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Erding</b><br/>
    /// Code: D2420<br/>
    /// </summary>
    [XmlEnum("D2420")]
    Landgericht_Landshut_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Erding,

    /// <summary>
    /// <b>Landgericht Memmingen</b><br/>
    /// Code: D2500<br/>
    /// </summary>
    [XmlEnum("D2500")]
    Landgericht_Memmingen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Memmingen</b><br/>
    /// Code: D2500S<br/>
    /// </summary>
    [XmlEnum("D2500S")]
    Staatsanwaltschaft_beim_Landgericht_Memmingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Buchloe</b><br/>
    /// Code: D2501<br/>
    /// </summary>
    [XmlEnum("D2501")]
    aufgeloest_Amtsgericht_Buchloe,

    /// <summary>
    /// <b>Amtsgericht G&#252;nzburg</b><br/>
    /// Code: D2502<br/>
    /// </summary>
    [XmlEnum("D2502")]
    Amtsgericht_Guenzburg,

    /// <summary>
    /// <b>Grundbuchamt G&#252;nzburg</b><br/>
    /// Code: D2502G<br/>
    /// </summary>
    [XmlEnum("D2502G")]
    Grundbuchamt_Guenzburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neu-Ulm Zweigstelle Illertissen</b><br/>
    /// Code: D2503<br/>
    /// </summary>
    [XmlEnum("D2503")]
    aufgeloest_Amtsgericht_Neu_Ulm_Zweigstelle_Illertissen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Krumbach (Schwaben)</b><br/>
    /// Code: D2504<br/>
    /// </summary>
    [XmlEnum("D2504")]
    aufgeloest_Amtsgericht_Krumbach_Schwaben,

    /// <summary>
    /// <b>Amtsgericht Memmingen</b><br/>
    /// Code: D2505<br/>
    /// </summary>
    [XmlEnum("D2505")]
    Amtsgericht_Memmingen,

    /// <summary>
    /// <b>Grundbuchamt Memmingen</b><br/>
    /// Code: D2505G<br/>
    /// </summary>
    [XmlEnum("D2505G")]
    Grundbuchamt_Memmingen,

    /// <summary>
    /// <b>Registergericht Amtsgericht Memmingen</b><br/>
    /// Code: D2505V<br/>
    /// </summary>
    [XmlEnum("D2505V")]
    Registergericht_Amtsgericht_Memmingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Mindelheim</b><br/>
    /// Code: D2506<br/>
    /// </summary>
    [XmlEnum("D2506")]
    aufgeloest_Amtsgericht_Mindelheim,

    /// <summary>
    /// <b>Amtsgericht Neu-Ulm</b><br/>
    /// Code: D2507<br/>
    /// </summary>
    [XmlEnum("D2507")]
    Amtsgericht_Neu_Ulm,

    /// <summary>
    /// <b>Grundbuchamt Neu-Ulm</b><br/>
    /// Code: D2507G<br/>
    /// </summary>
    [XmlEnum("D2507G")]
    Grundbuchamt_Neu_Ulm,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht T&#252;rkheim</b><br/>
    /// Code: D2508<br/>
    /// </summary>
    [XmlEnum("D2508")]
    aufgeloest_Amtsgericht_Tuerkheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wei&#223;enhorn</b><br/>
    /// Code: D2509<br/>
    /// </summary>
    [XmlEnum("D2509")]
    aufgeloest_Amtsgericht_Weissenhorn,

    /// <summary>
    /// <b>Landgericht Memmingen Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Neu-Ulm</b><br/>
    /// Code: D2520<br/>
    /// </summary>
    [XmlEnum("D2520")]
    Landgericht_Memmingen_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Neu_Ulm,

    /// <summary>
    /// <b>Landgericht M&#252;nchen I</b><br/>
    /// Code: D2600<br/>
    /// </summary>
    [XmlEnum("D2600")]
    Landgericht_Muenchen_I,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht M&#252;nchen I</b><br/>
    /// Code: D2600S<br/>
    /// </summary>
    [XmlEnum("D2600S")]
    Staatsanwaltschaft_beim_Landgericht_Muenchen_I,

    /// <summary>
    /// <b>Amtsgericht M&#252;nchen</b><br/>
    /// Code: D2601<br/>
    /// </summary>
    [XmlEnum("D2601")]
    Amtsgericht_Muenchen,

    /// <summary>
    /// <b>Grundbuchamt M&#252;nchen</b><br/>
    /// Code: D2601G<br/>
    /// </summary>
    [XmlEnum("D2601G")]
    Grundbuchamt_Muenchen,

    /// <summary>
    /// <b>Registergericht Amtsgericht M&#252;nchen</b><br/>
    /// Code: D2601V<br/>
    /// </summary>
    [XmlEnum("D2601V")]
    Registergericht_Amtsgericht_Muenchen,

    /// <summary>
    /// <b>Landgericht M&#252;nchen II</b><br/>
    /// Code: D2700<br/>
    /// </summary>
    [XmlEnum("D2700")]
    Landgericht_Muenchen_II,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht M&#252;nchen II</b><br/>
    /// Code: D2700S<br/>
    /// </summary>
    [XmlEnum("D2700S")]
    Staatsanwaltschaft_beim_Landgericht_Muenchen_II,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wolfratshausen, Zwst. Bad T&#246;lz</b><br/>
    /// Code: D2701<br/>
    /// </summary>
    [XmlEnum("D2701")]
    aufgeloest_Amtsgericht_Wolfratshausen_Zwst_Bad_Toelz,

    /// <summary>
    /// <b>Amtsgericht Dachau</b><br/>
    /// Code: D2702<br/>
    /// </summary>
    [XmlEnum("D2702")]
    Amtsgericht_Dachau,

    /// <summary>
    /// <b>Grundbuchamt Dachau</b><br/>
    /// Code: D2702G<br/>
    /// </summary>
    [XmlEnum("D2702G")]
    Grundbuchamt_Dachau,

    /// <summary>
    /// <b>Amtsgericht Ebersberg</b><br/>
    /// Code: D2703<br/>
    /// </summary>
    [XmlEnum("D2703")]
    Amtsgericht_Ebersberg,

    /// <summary>
    /// <b>Grundbuchamt Ebersberg</b><br/>
    /// Code: D2703G<br/>
    /// </summary>
    [XmlEnum("D2703G")]
    Grundbuchamt_Ebersberg,

    /// <summary>
    /// <b>Amtsgericht F&#252;rstenfeldbruck</b><br/>
    /// Code: D2706<br/>
    /// </summary>
    [XmlEnum("D2706")]
    Amtsgericht_Fuerstenfeldbruck,

    /// <summary>
    /// <b>Grundbuchamt F&#252;rstenfeldbruck</b><br/>
    /// Code: D2706G<br/>
    /// </summary>
    [XmlEnum("D2706G")]
    Grundbuchamt_Fuerstenfeldbruck,

    /// <summary>
    /// <b>Amtsgericht Garmisch-Partenkirchen</b><br/>
    /// Code: D2707<br/>
    /// </summary>
    [XmlEnum("D2707")]
    Amtsgericht_Garmisch_Partenkirchen,

    /// <summary>
    /// <b>Grundbuchamt Garmisch-Partenkirchen</b><br/>
    /// Code: D2707G<br/>
    /// </summary>
    [XmlEnum("D2707G")]
    Grundbuchamt_Garmisch_Partenkirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Geisenfeld</b><br/>
    /// Code: D2708<br/>
    /// </summary>
    [XmlEnum("D2708")]
    aufgeloest_Amtsgericht_Geisenfeld,

    /// <summary>
    /// <b>Amtsgericht Miesbach</b><br/>
    /// Code: D2710<br/>
    /// </summary>
    [XmlEnum("D2710")]
    Amtsgericht_Miesbach,

    /// <summary>
    /// <b>Grundbuchamt Miesbach</b><br/>
    /// Code: D2710G<br/>
    /// </summary>
    [XmlEnum("D2710G")]
    Grundbuchamt_Miesbach,

    /// <summary>
    /// <b>Amtsgericht Starnberg</b><br/>
    /// Code: D2712<br/>
    /// </summary>
    [XmlEnum("D2712")]
    Amtsgericht_Starnberg,

    /// <summary>
    /// <b>Grundbuchamt Starnberg</b><br/>
    /// Code: D2712G<br/>
    /// </summary>
    [XmlEnum("D2712G")]
    Grundbuchamt_Starnberg,

    /// <summary>
    /// <b>Amtsgericht Weilheim</b><br/>
    /// Code: D2713<br/>
    /// </summary>
    [XmlEnum("D2713")]
    Amtsgericht_Weilheim,

    /// <summary>
    /// <b>Grundbuchamt Weilheim</b><br/>
    /// Code: D2713G<br/>
    /// </summary>
    [XmlEnum("D2713G")]
    Grundbuchamt_Weilheim,

    /// <summary>
    /// <b>Amtsgericht Wolfratshausen</b><br/>
    /// Code: D2714<br/>
    /// </summary>
    [XmlEnum("D2714")]
    Amtsgericht_Wolfratshausen,

    /// <summary>
    /// <b>Grundbuchamt Wolfratshausen</b><br/>
    /// Code: D2714G<br/>
    /// </summary>
    [XmlEnum("D2714G")]
    Grundbuchamt_Wolfratshausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Miesbach, Zwst. Tegernsee</b><br/>
    /// Code: D2715<br/>
    /// </summary>
    [XmlEnum("D2715")]
    aufgeloest_Amtsgericht_Miesbach_Zwst_Tegernsee,

    /// <summary>
    /// <b>Landgericht M&#252;nchen II Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsger. Garmisch-Partenkirchen</b><br/>
    /// Code: D2720<br/>
    /// </summary>
    [XmlEnum("D2720")]
    Landgericht_Muenchen_II_Auswaertige_Strafvollstreckungskammer_b_d_Amtsger_Garmisch_Partenkirchen,

    /// <summary>
    /// <b>Landgericht Passau</b><br/>
    /// Code: D2800<br/>
    /// </summary>
    [XmlEnum("D2800")]
    Landgericht_Passau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Passau</b><br/>
    /// Code: D2800S<br/>
    /// </summary>
    [XmlEnum("D2800S")]
    Staatsanwaltschaft_beim_Landgericht_Passau,

    /// <summary>
    /// <b>Amtsgericht Freyung</b><br/>
    /// Code: D2801<br/>
    /// </summary>
    [XmlEnum("D2801")]
    Amtsgericht_Freyung,

    /// <summary>
    /// <b>Grundbuchamt Freyung</b><br/>
    /// Code: D2801G<br/>
    /// </summary>
    [XmlEnum("D2801G")]
    Grundbuchamt_Freyung,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Passau, Zwst. Griesbach i. Rottal</b><br/>
    /// Code: D2802<br/>
    /// </summary>
    [XmlEnum("D2802")]
    aufgeloest_Amtsgericht_Passau_Zwst_Griesbach_i_Rottal,

    /// <summary>
    /// <b>Amtsgericht Passau</b><br/>
    /// Code: D2803<br/>
    /// </summary>
    [XmlEnum("D2803")]
    Amtsgericht_Passau,

    /// <summary>
    /// <b>Grundbuchamt Passau</b><br/>
    /// Code: D2803G<br/>
    /// </summary>
    [XmlEnum("D2803G")]
    Grundbuchamt_Passau,

    /// <summary>
    /// <b>Registergericht Amtsgericht Passau</b><br/>
    /// Code: D2803V<br/>
    /// </summary>
    [XmlEnum("D2803V")]
    Registergericht_Amtsgericht_Passau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Pfarrkirchen</b><br/>
    /// Code: D2804<br/>
    /// </summary>
    [XmlEnum("D2804")]
    aufgeloest_Amtsgericht_Pfarrkirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Passau Zweigstelle Rotthalm&#252;nster</b><br/>
    /// Code: D2805<br/>
    /// </summary>
    [XmlEnum("D2805")]
    aufgeloest_Amtsgericht_Passau_Zweigstelle_Rotthalmuenster,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Simbach a. Inn</b><br/>
    /// Code: D2806<br/>
    /// </summary>
    [XmlEnum("D2806")]
    aufgeloest_Amtsgericht_Simbach_a_Inn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Passau, Zweigstelle Vilshofen</b><br/>
    /// Code: D2807<br/>
    /// </summary>
    [XmlEnum("D2807")]
    aufgeloest_Amtsgericht_Passau_Zweigstelle_Vilshofen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freyung, Zwst. Waldkirchen</b><br/>
    /// Code: D2808<br/>
    /// </summary>
    [XmlEnum("D2808")]
    aufgeloest_Amtsgericht_Freyung_Zwst_Waldkirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Passau, Zwst. Wegscheid</b><br/>
    /// Code: D2809<br/>
    /// </summary>
    [XmlEnum("D2809")]
    aufgeloest_Amtsgericht_Passau_Zwst_Wegscheid,

    /// <summary>
    /// <b>Landgericht Traunstein</b><br/>
    /// Code: D2900<br/>
    /// </summary>
    [XmlEnum("D2900")]
    Landgericht_Traunstein,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Traunstein</b><br/>
    /// Code: D2900S<br/>
    /// </summary>
    [XmlEnum("D2900S")]
    Staatsanwaltschaft_beim_Landgericht_Traunstein,

    /// <summary>
    /// <b>Amtsgericht Alt&#246;tting</b><br/>
    /// Code: D2901<br/>
    /// </summary>
    [XmlEnum("D2901")]
    Amtsgericht_Altoetting,

    /// <summary>
    /// <b>Grundbuchamt Alt&#246;tting</b><br/>
    /// Code: D2901G<br/>
    /// </summary>
    [XmlEnum("D2901G")]
    Grundbuchamt_Altoetting,

    /// <summary>
    /// <b>Amtsgericht Rosenheim Zweigstelle Bad Aibling</b><br/>
    /// Code: D2902<br/>
    /// </summary>
    [XmlEnum("D2902")]
    Amtsgericht_Rosenheim_Zweigstelle_Bad_Aibling,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Reichenhall</b><br/>
    /// Code: D2903<br/>
    /// </summary>
    [XmlEnum("D2903")]
    aufgeloest_Amtsgericht_Bad_Reichenhall,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Berchtesgaden</b><br/>
    /// Code: D2904<br/>
    /// </summary>
    [XmlEnum("D2904")]
    aufgeloest_Amtsgericht_Berchtesgaden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Alt&#246;tting Zweigstelle Burghausen/Obb.</b><br/>
    /// Code: D2905<br/>
    /// </summary>
    [XmlEnum("D2905")]
    aufgeloest_Amtsgericht_Altoetting_Zweigstelle_Burghausen_Obb,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Haag i. OB</b><br/>
    /// Code: D2906<br/>
    /// </summary>
    [XmlEnum("D2906")]
    aufgeloest_Amtsgericht_Haag_i_OB,

    /// <summary>
    /// <b>Amtsgericht Laufen</b><br/>
    /// Code: D2907<br/>
    /// </summary>
    [XmlEnum("D2907")]
    Amtsgericht_Laufen,

    /// <summary>
    /// <b>Grundbuchamt Laufen</b><br/>
    /// Code: D2907G<br/>
    /// </summary>
    [XmlEnum("D2907G")]
    Grundbuchamt_Laufen,

    /// <summary>
    /// <b>Amtsgericht M&#252;hldorf</b><br/>
    /// Code: D2908<br/>
    /// </summary>
    [XmlEnum("D2908")]
    Amtsgericht_Muehldorf,

    /// <summary>
    /// <b>Grundbuchamt M&#252;hldorf</b><br/>
    /// Code: D2908G<br/>
    /// </summary>
    [XmlEnum("D2908G")]
    Grundbuchamt_Muehldorf,

    /// <summary>
    /// <b>Amtsgericht Rosenheim</b><br/>
    /// Code: D2909<br/>
    /// </summary>
    [XmlEnum("D2909")]
    Amtsgericht_Rosenheim,

    /// <summary>
    /// <b>Grundbuchamt Rosenheim</b><br/>
    /// Code: D2909G<br/>
    /// </summary>
    [XmlEnum("D2909G")]
    Grundbuchamt_Rosenheim,

    /// <summary>
    /// <b>Amtsgericht Traunstein</b><br/>
    /// Code: D2910<br/>
    /// </summary>
    [XmlEnum("D2910")]
    Amtsgericht_Traunstein,

    /// <summary>
    /// <b>Grundbuchamt Traunstein</b><br/>
    /// Code: D2910G<br/>
    /// </summary>
    [XmlEnum("D2910G")]
    Grundbuchamt_Traunstein,

    /// <summary>
    /// <b>Registergericht Amtsgericht Traunstein</b><br/>
    /// Code: D2910V<br/>
    /// </summary>
    [XmlEnum("D2910V")]
    Registergericht_Amtsgericht_Traunstein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Trostberg</b><br/>
    /// Code: D2911<br/>
    /// </summary>
    [XmlEnum("D2911")]
    aufgeloest_Amtsgericht_Trostberg,

    /// <summary>
    /// <b>Amtsgericht Rosenheim Zweigstelle Wasserburg a. Inn</b><br/>
    /// Code: D2912<br/>
    /// </summary>
    [XmlEnum("D2912")]
    Amtsgericht_Rosenheim_Zweigstelle_Wasserburg_a_Inn,

    /// <summary>
    /// <b>Landgericht Traunstein Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht M&#252;hldorf</b><br/>
    /// Code: D2920<br/>
    /// </summary>
    [XmlEnum("D2920")]
    Landgericht_Traunstein_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Muehldorf,

    /// <summary>
    /// <b>Oberlandesgericht N&#252;rnberg</b><br/>
    /// Code: D3000<br/>
    /// </summary>
    [XmlEnum("D3000")]
    Oberlandesgericht_Nuernberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht N&#252;rnberg</b><br/>
    /// Code: D3000S<br/>
    /// </summary>
    [XmlEnum("D3000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Nuernberg,

    /// <summary>
    /// <b>Landgericht Amberg</b><br/>
    /// Code: D3100<br/>
    /// </summary>
    [XmlEnum("D3100")]
    Landgericht_Amberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Amberg</b><br/>
    /// Code: D3100S<br/>
    /// </summary>
    [XmlEnum("D3100S")]
    Staatsanwaltschaft_beim_Landgericht_Amberg,

    /// <summary>
    /// <b>Amtsgericht Amberg</b><br/>
    /// Code: D3101<br/>
    /// </summary>
    [XmlEnum("D3101")]
    Amtsgericht_Amberg,

    /// <summary>
    /// <b>Grundbuchamt Amberg</b><br/>
    /// Code: D3101G<br/>
    /// </summary>
    [XmlEnum("D3101G")]
    Grundbuchamt_Amberg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Amberg</b><br/>
    /// Code: D3101V<br/>
    /// </summary>
    [XmlEnum("D3101V")]
    Registergericht_Amtsgericht_Amberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle Furth i. Wald</b><br/>
    /// Code: D3103<br/>
    /// </summary>
    [XmlEnum("D3103")]
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Furth_i_Wald,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schwandorf, Zweigstelle Nabburg</b><br/>
    /// Code: D3104<br/>
    /// </summary>
    [XmlEnum("D3104")]
    aufgeloest_Amtsgericht_Schwandorf_Zweigstelle_Nabburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neunburg vorm Wald</b><br/>
    /// Code: D3105<br/>
    /// </summary>
    [XmlEnum("D3105")]
    aufgeloest_Amtsgericht_Neunburg_vorm_Wald,

    /// <summary>
    /// <b>Amtsgericht Schwandorf</b><br/>
    /// Code: D3106<br/>
    /// </summary>
    [XmlEnum("D3106")]
    Amtsgericht_Schwandorf,

    /// <summary>
    /// <b>Grundbuchamt Schwandorf</b><br/>
    /// Code: D3106G<br/>
    /// </summary>
    [XmlEnum("D3106G")]
    Grundbuchamt_Schwandorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sulzbach-Rosenberg</b><br/>
    /// Code: D3107<br/>
    /// </summary>
    [XmlEnum("D3107")]
    aufgeloest_Amtsgericht_Sulzbach_Rosenberg,

    /// <summary>
    /// <b>Amtsgericht Cham Zweigstelle Waldm&#252;nchen</b><br/>
    /// Code: D3108<br/>
    /// </summary>
    [XmlEnum("D3108")]
    Amtsgericht_Cham_Zweigstelle_Waldmuenchen,

    /// <summary>
    /// <b>Landgericht Ansbach</b><br/>
    /// Code: D3200<br/>
    /// </summary>
    [XmlEnum("D3200")]
    Landgericht_Ansbach,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Ansbach</b><br/>
    /// Code: D3200S<br/>
    /// </summary>
    [XmlEnum("D3200S")]
    Staatsanwaltschaft_beim_Landgericht_Ansbach,

    /// <summary>
    /// <b>Amtsgericht Ansbach</b><br/>
    /// Code: D3201<br/>
    /// </summary>
    [XmlEnum("D3201")]
    Amtsgericht_Ansbach,

    /// <summary>
    /// <b>Grundbuchamt Ansbach</b><br/>
    /// Code: D3201G<br/>
    /// </summary>
    [XmlEnum("D3201G")]
    Grundbuchamt_Ansbach,

    /// <summary>
    /// <b>Registergericht Amtsgericht Ansbach</b><br/>
    /// Code: D3201V<br/>
    /// </summary>
    [XmlEnum("D3201V")]
    Registergericht_Amtsgericht_Ansbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ansbach Zweigstelle Dinkelsb&#252;hl</b><br/>
    /// Code: D3202<br/>
    /// </summary>
    [XmlEnum("D3202")]
    aufgeloest_Amtsgericht_Ansbach_Zweigstelle_Dinkelsbuehl,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wei&#223;enburg i. Bay., Zwst. Gunzenhausen</b><br/>
    /// Code: D3203<br/>
    /// </summary>
    [XmlEnum("D3203")]
    aufgeloest_Amtsgericht_Weissenburg_i_Bay_Zwst_Gunzenhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ansbach Zweigstelle Rothenburg o.d. Tauber</b><br/>
    /// Code: D3204<br/>
    /// </summary>
    [XmlEnum("D3204")]
    aufgeloest_Amtsgericht_Ansbach_Zweigstelle_Rothenburg_o_d_Tauber,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Uffenheim</b><br/>
    /// Code: D3205<br/>
    /// </summary>
    [XmlEnum("D3205")]
    aufgeloest_Amtsgericht_Uffenheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dinkelsb&#252;hl, Zwst. Feuchtwangen</b><br/>
    /// Code: D3206<br/>
    /// </summary>
    [XmlEnum("D3206")]
    aufgeloest_Amtsgericht_Dinkelsbuehl_Zwst_Feuchtwangen,

    /// <summary>
    /// <b>Amtsgericht Wei&#223;enburg i. Bay.</b><br/>
    /// Code: D3208<br/>
    /// </summary>
    [XmlEnum("D3208")]
    Amtsgericht_Weissenburg_i_Bay,

    /// <summary>
    /// <b>Grundbuchamt Wei&#223;enburg</b><br/>
    /// Code: D3208G<br/>
    /// </summary>
    [XmlEnum("D3208G")]
    Grundbuchamt_Weissenburg,

    /// <summary>
    /// <b>Landgericht N&#252;rnberg-F&#252;rth</b><br/>
    /// Code: D3300<br/>
    /// </summary>
    [XmlEnum("D3300")]
    Landgericht_Nuernberg_Fuerth,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht N&#252;rnberg-F&#252;rth</b><br/>
    /// Code: D3300S<br/>
    /// </summary>
    [XmlEnum("D3300S")]
    Staatsanwaltschaft_beim_Landgericht_Nuernberg_Fuerth,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Beilngries</b><br/>
    /// Code: D3301<br/>
    /// </summary>
    [XmlEnum("D3301")]
    aufgeloest_Amtsgericht_Beilngries,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ingolstadt, Zwst. Eichst&#228;tt</b><br/>
    /// Code: D3302<br/>
    /// </summary>
    [XmlEnum("D3302")]
    aufgeloest_Amtsgericht_Ingolstadt_Zwst_Eichstaett,

    /// <summary>
    /// <b>Amtsgericht Erlangen</b><br/>
    /// Code: D3303<br/>
    /// </summary>
    [XmlEnum("D3303")]
    Amtsgericht_Erlangen,

    /// <summary>
    /// <b>Grundbuchamt Erlangen</b><br/>
    /// Code: D3303G<br/>
    /// </summary>
    [XmlEnum("D3303G")]
    Grundbuchamt_Erlangen,

    /// <summary>
    /// <b>Amtsgericht F&#252;rth (Bayern)</b><br/>
    /// Code: D3304<br/>
    /// </summary>
    [XmlEnum("D3304")]
    Amtsgericht_Fuerth_Bayern,

    /// <summary>
    /// <b>Grundbuchamt F&#252;rth (Bayern)</b><br/>
    /// Code: D3304G<br/>
    /// </summary>
    [XmlEnum("D3304G")]
    Grundbuchamt_Fuerth_Bayern,

    /// <summary>
    /// <b>Registergericht Amtsgericht F&#252;rth</b><br/>
    /// Code: D3304V<br/>
    /// </summary>
    [XmlEnum("D3304V")]
    Registergericht_Amtsgericht_Fuerth,

    /// <summary>
    /// <b>Amtsgericht Hersbruck</b><br/>
    /// Code: D3305<br/>
    /// </summary>
    [XmlEnum("D3305")]
    Amtsgericht_Hersbruck,

    /// <summary>
    /// <b>Grundbuchamt Hersbruck</b><br/>
    /// Code: D3305G<br/>
    /// </summary>
    [XmlEnum("D3305G")]
    Grundbuchamt_Hersbruck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schwabach Zweigstelle Hilpoltstein</b><br/>
    /// Code: D3306<br/>
    /// </summary>
    [XmlEnum("D3306")]
    aufgeloest_Amtsgericht_Schwabach_Zweigstelle_Hilpoltstein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hersbruck, Zwst. Lauf (Pegnitz)</b><br/>
    /// Code: D3307<br/>
    /// </summary>
    [XmlEnum("D3307")]
    aufgeloest_Amtsgericht_Hersbruck_Zwst_Lauf_Pegnitz,

    /// <summary>
    /// <b>Amtsgericht Neumarkt</b><br/>
    /// Code: D3308<br/>
    /// </summary>
    [XmlEnum("D3308")]
    Amtsgericht_Neumarkt,

    /// <summary>
    /// <b>Grundbuchamt Neumarkt</b><br/>
    /// Code: D3308G<br/>
    /// </summary>
    [XmlEnum("D3308G")]
    Grundbuchamt_Neumarkt,

    /// <summary>
    /// <b>Amtsgericht Neustadt (an der Aisch)</b><br/>
    /// Code: D3309<br/>
    /// </summary>
    [XmlEnum("D3309")]
    Amtsgericht_Neustadt_an_der_Aisch,

    /// <summary>
    /// <b>Grundbuchamt Neustadt</b><br/>
    /// Code: D3309G<br/>
    /// </summary>
    [XmlEnum("D3309G")]
    Grundbuchamt_Neustadt,

    /// <summary>
    /// <b>Amtsgericht N&#252;rnberg</b><br/>
    /// Code: D3310<br/>
    /// </summary>
    [XmlEnum("D3310")]
    Amtsgericht_Nuernberg,

    /// <summary>
    /// <b>Grundbuchamt N&#252;rnberg</b><br/>
    /// Code: D3310G<br/>
    /// </summary>
    [XmlEnum("D3310G")]
    Grundbuchamt_Nuernberg,

    /// <summary>
    /// <b>Registergericht Amtsgericht N&#252;rnberg</b><br/>
    /// Code: D3310V<br/>
    /// </summary>
    [XmlEnum("D3310V")]
    Registergericht_Amtsgericht_Nuernberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Roth</b><br/>
    /// Code: D3311<br/>
    /// </summary>
    [XmlEnum("D3311")]
    aufgeloest_Amtsgericht_Roth,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neustadt a. d. Aisch, Zwst. Scheinfeld</b><br/>
    /// Code: D3312<br/>
    /// </summary>
    [XmlEnum("D3312")]
    aufgeloest_Amtsgericht_Neustadt_a_d_Aisch_Zwst_Scheinfeld,

    /// <summary>
    /// <b>Amtsgericht Schwabach</b><br/>
    /// Code: D3313<br/>
    /// </summary>
    [XmlEnum("D3313")]
    Amtsgericht_Schwabach,

    /// <summary>
    /// <b>Grundbuchamt Schwabach</b><br/>
    /// Code: D3313G<br/>
    /// </summary>
    [XmlEnum("D3313G")]
    Grundbuchamt_Schwabach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Windsheim</b><br/>
    /// Code: D3315<br/>
    /// </summary>
    [XmlEnum("D3315")]
    aufgeloest_Amtsgericht_Windsheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht N&#252;rnberg, Zwst. Altdorf</b><br/>
    /// Code: D3316<br/>
    /// </summary>
    [XmlEnum("D3316")]
    aufgeloest_Amtsgericht_Nuernberg_Zwst_Altdorf,

    /// <summary>
    /// <b>Landgericht Regensburg</b><br/>
    /// Code: D3400<br/>
    /// </summary>
    [XmlEnum("D3400")]
    Landgericht_Regensburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Regensburg</b><br/>
    /// Code: D3400S<br/>
    /// </summary>
    [XmlEnum("D3400S")]
    Staatsanwaltschaft_beim_Landgericht_Regensburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Abensberg</b><br/>
    /// Code: D3401<br/>
    /// </summary>
    [XmlEnum("D3401")]
    aufgeloest_Amtsgericht_Abensberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Straubing, Zwst. Bogen</b><br/>
    /// Code: D3402<br/>
    /// </summary>
    [XmlEnum("D3402")]
    aufgeloest_Amtsgericht_Straubing_Zwst_Bogen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schwandorf Zweigstelle Burglengenfeld</b><br/>
    /// Code: D3403<br/>
    /// </summary>
    [XmlEnum("D3403")]
    aufgeloest_Amtsgericht_Schwandorf_Zweigstelle_Burglengenfeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hemau</b><br/>
    /// Code: D3404<br/>
    /// </summary>
    [XmlEnum("D3404")]
    aufgeloest_Amtsgericht_Hemau,

    /// <summary>
    /// <b>Amtsgericht Kelheim</b><br/>
    /// Code: D3405<br/>
    /// </summary>
    [XmlEnum("D3405")]
    Amtsgericht_Kelheim,

    /// <summary>
    /// <b>Grundbuchamt Kelheim</b><br/>
    /// Code: D3405G<br/>
    /// </summary>
    [XmlEnum("D3405G")]
    Grundbuchamt_Kelheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle K&#246;tzting</b><br/>
    /// Code: D3406<br/>
    /// </summary>
    [XmlEnum("D3406")]
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Koetzting,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Mitterfels</b><br/>
    /// Code: D3407<br/>
    /// </summary>
    [XmlEnum("D3407")]
    aufgeloest_Amtsgericht_Mitterfels,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neukirchen b. Hl. Blut</b><br/>
    /// Code: D3408<br/>
    /// </summary>
    [XmlEnum("D3408")]
    aufgeloest_Amtsgericht_Neukirchen_b_Hl_Blut,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Parsberg</b><br/>
    /// Code: D3409<br/>
    /// </summary>
    [XmlEnum("D3409")]
    aufgeloest_Amtsgericht_Parsberg,

    /// <summary>
    /// <b>Amtsgericht Regensburg</b><br/>
    /// Code: D3410<br/>
    /// </summary>
    [XmlEnum("D3410")]
    Amtsgericht_Regensburg,

    /// <summary>
    /// <b>Grundbuchamt Regensburg</b><br/>
    /// Code: D3410G<br/>
    /// </summary>
    [XmlEnum("D3410G")]
    Grundbuchamt_Regensburg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Regensburg</b><br/>
    /// Code: D3410V<br/>
    /// </summary>
    [XmlEnum("D3410V")]
    Registergericht_Amtsgericht_Regensburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Riedenburg</b><br/>
    /// Code: D3411<br/>
    /// </summary>
    [XmlEnum("D3411")]
    aufgeloest_Amtsgericht_Riedenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Cham Zweigstelle Roding</b><br/>
    /// Code: D3412<br/>
    /// </summary>
    [XmlEnum("D3412")]
    aufgeloest_Amtsgericht_Cham_Zweigstelle_Roding,

    /// <summary>
    /// <b>Amtsgericht Straubing</b><br/>
    /// Code: D3413<br/>
    /// </summary>
    [XmlEnum("D3413")]
    Amtsgericht_Straubing,

    /// <summary>
    /// <b>Grundbuchamt Straubing</b><br/>
    /// Code: D3413G<br/>
    /// </summary>
    [XmlEnum("D3413G")]
    Grundbuchamt_Straubing,

    /// <summary>
    /// <b>Registergericht Amtsgericht Straubing</b><br/>
    /// Code: D3413V<br/>
    /// </summary>
    [XmlEnum("D3413V")]
    Registergericht_Amtsgericht_Straubing,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Roding, Zwst. Nittenau</b><br/>
    /// Code: D3414<br/>
    /// </summary>
    [XmlEnum("D3414")]
    aufgeloest_Amtsgericht_Roding_Zwst_Nittenau,

    /// <summary>
    /// <b>Amtsgericht Cham</b><br/>
    /// Code: D3415<br/>
    /// </summary>
    [XmlEnum("D3415")]
    Amtsgericht_Cham,

    /// <summary>
    /// <b>Grundbuchamt Cham</b><br/>
    /// Code: D3415G<br/>
    /// </summary>
    [XmlEnum("D3415G")]
    Grundbuchamt_Cham,

    /// <summary>
    /// <b>Landgericht Regensburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Straubing</b><br/>
    /// Code: D3420<br/>
    /// </summary>
    [XmlEnum("D3420")]
    Landgericht_Regensburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Straubing,

    /// <summary>
    /// <b>Landgericht Weiden i. d. OPf.</b><br/>
    /// Code: D3500<br/>
    /// </summary>
    [XmlEnum("D3500")]
    Landgericht_Weiden_i_d_OPf,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Weiden i. d. Opf.</b><br/>
    /// Code: D3500S<br/>
    /// </summary>
    [XmlEnum("D3500S")]
    Staatsanwaltschaft_beim_Landgericht_Weiden_i_d_Opf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Weiden i. d. OPf., Zwst. Eschenbach i. d. OPf.</b><br/>
    /// Code: D3501<br/>
    /// </summary>
    [XmlEnum("D3501")]
    aufgeloest_Amtsgericht_Weiden_i_d_OPf_Zwst_Eschenbach_i_d_OPf,

    /// <summary>
    /// <b>Amtsgericht Tirschenreuth Zweigstelle Kemnath</b><br/>
    /// Code: D3502<br/>
    /// </summary>
    [XmlEnum("D3502")]
    Amtsgericht_Tirschenreuth_Zweigstelle_Kemnath,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neustadt a. d. Waldnaab</b><br/>
    /// Code: D3503<br/>
    /// </summary>
    [XmlEnum("D3503")]
    aufgeloest_Amtsgericht_Neustadt_a_d_Waldnaab,

    /// <summary>
    /// <b>Amtsgericht Schwandorf Zweigstelle Oberviechtach</b><br/>
    /// Code: D3504<br/>
    /// </summary>
    [XmlEnum("D3504")]
    Amtsgericht_Schwandorf_Zweigstelle_Oberviechtach,

    /// <summary>
    /// <b>Amtsgericht Tirschenreuth</b><br/>
    /// Code: D3505<br/>
    /// </summary>
    [XmlEnum("D3505")]
    Amtsgericht_Tirschenreuth,

    /// <summary>
    /// <b>Grundbuchamt Tirschenreuth</b><br/>
    /// Code: D3505G<br/>
    /// </summary>
    [XmlEnum("D3505G")]
    Grundbuchamt_Tirschenreuth,

    /// <summary>
    /// <b>Amtsgericht Weiden Zweigstelle Vohenstrau&#223;</b><br/>
    /// Code: D3506<br/>
    /// </summary>
    [XmlEnum("D3506")]
    Amtsgericht_Weiden_Zweigstelle_Vohenstrauss,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Waldsassen</b><br/>
    /// Code: D3507<br/>
    /// </summary>
    [XmlEnum("D3507")]
    aufgeloest_Amtsgericht_Waldsassen,

    /// <summary>
    /// <b>Amtsgericht Weiden i. d. OPf</b><br/>
    /// Code: D3508<br/>
    /// </summary>
    [XmlEnum("D3508")]
    Amtsgericht_Weiden_i_d_OPf,

    /// <summary>
    /// <b>Grundbuchamt Weiden</b><br/>
    /// Code: D3508G<br/>
    /// </summary>
    [XmlEnum("D3508G")]
    Grundbuchamt_Weiden,

    /// <summary>
    /// <b>Registergericht Amtsgericht Weiden</b><br/>
    /// Code: D3508V<br/>
    /// </summary>
    [XmlEnum("D3508V")]
    Registergericht_Amtsgericht_Weiden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eschenbach/Opf., Au&#223;enstelle Auerbach</b><br/>
    /// Code: D3509<br/>
    /// </summary>
    [XmlEnum("D3509")]
    aufgeloest_Amtsgericht_Eschenbach_Opf_Aussenstelle_Auerbach,

    /// <summary>
    /// <b>Oberlandesgericht Bamberg</b><br/>
    /// Code: D4000<br/>
    /// </summary>
    [XmlEnum("D4000")]
    Oberlandesgericht_Bamberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Bamberg</b><br/>
    /// Code: D4000S<br/>
    /// </summary>
    [XmlEnum("D4000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Bamberg,

    /// <summary>
    /// <b>Landgericht Aschaffenburg</b><br/>
    /// Code: D4100<br/>
    /// </summary>
    [XmlEnum("D4100")]
    Landgericht_Aschaffenburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Aschaffenburg</b><br/>
    /// Code: D4100S<br/>
    /// </summary>
    [XmlEnum("D4100S")]
    Staatsanwaltschaft_beim_Landgericht_Aschaffenburg,

    /// <summary>
    /// <b>Amtsgericht Aschaffenburg Zweigstelle Alzenau i.Ufr.</b><br/>
    /// Code: D4101<br/>
    /// </summary>
    [XmlEnum("D4101")]
    Amtsgericht_Aschaffenburg_Zweigstelle_Alzenau_i_Ufr,

    /// <summary>
    /// <b>Amtsgericht Aschaffenburg</b><br/>
    /// Code: D4102<br/>
    /// </summary>
    [XmlEnum("D4102")]
    Amtsgericht_Aschaffenburg,

    /// <summary>
    /// <b>Grundbuchamt Aschaffenburg</b><br/>
    /// Code: D4102G<br/>
    /// </summary>
    [XmlEnum("D4102G")]
    Grundbuchamt_Aschaffenburg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Aschaffenburg</b><br/>
    /// Code: D4102V<br/>
    /// </summary>
    [XmlEnum("D4102V")]
    Registergericht_Amtsgericht_Aschaffenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gem&#252;nden a. Main, Zwst. Lohr a. Main</b><br/>
    /// Code: D4103<br/>
    /// </summary>
    [XmlEnum("D4103")]
    aufgeloest_Amtsgericht_Gemuenden_a_Main_Zwst_Lohr_a_Main,

    /// <summary>
    /// <b>Amtsgericht Obernburg Zweigstelle Miltenberg</b><br/>
    /// Code: D4104<br/>
    /// </summary>
    [XmlEnum("D4104")]
    Amtsgericht_Obernburg_Zweigstelle_Miltenberg,

    /// <summary>
    /// <b>Amtsgericht Obernburg</b><br/>
    /// Code: D4105<br/>
    /// </summary>
    [XmlEnum("D4105")]
    Amtsgericht_Obernburg,

    /// <summary>
    /// <b>Grundbuchamt Obernburg</b><br/>
    /// Code: D4105G<br/>
    /// </summary>
    [XmlEnum("D4105G")]
    Grundbuchamt_Obernburg,

    /// <summary>
    /// <b>Landgericht Bamberg</b><br/>
    /// Code: D4200<br/>
    /// </summary>
    [XmlEnum("D4200")]
    Landgericht_Bamberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bamberg</b><br/>
    /// Code: D4200S<br/>
    /// </summary>
    [XmlEnum("D4200S")]
    Staatsanwaltschaft_beim_Landgericht_Bamberg,

    /// <summary>
    /// <b>Amtsgericht Bamberg</b><br/>
    /// Code: D4201<br/>
    /// </summary>
    [XmlEnum("D4201")]
    Amtsgericht_Bamberg,

    /// <summary>
    /// <b>Grundbuchamt Bamberg</b><br/>
    /// Code: D4201G<br/>
    /// </summary>
    [XmlEnum("D4201G")]
    Grundbuchamt_Bamberg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Bamberg</b><br/>
    /// Code: D4201V<br/>
    /// </summary>
    [XmlEnum("D4201V")]
    Registergericht_Amtsgericht_Bamberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ha&#223;furt, Zweigstelle Ebern</b><br/>
    /// Code: D4202<br/>
    /// </summary>
    [XmlEnum("D4202")]
    aufgeloest_Amtsgericht_Hassfurt_Zweigstelle_Ebern,

    /// <summary>
    /// <b>Amtsgericht Forchheim</b><br/>
    /// Code: D4203<br/>
    /// </summary>
    [XmlEnum("D4203")]
    Amtsgericht_Forchheim,

    /// <summary>
    /// <b>Grundbuchamt Forchheim</b><br/>
    /// Code: D4203G<br/>
    /// </summary>
    [XmlEnum("D4203G")]
    Grundbuchamt_Forchheim,

    /// <summary>
    /// <b>Amtsgericht Ha&#223;furt</b><br/>
    /// Code: D4204<br/>
    /// </summary>
    [XmlEnum("D4204")]
    Amtsgericht_Hassfurt,

    /// <summary>
    /// <b>Grundbuchamt Ha&#223;furt</b><br/>
    /// Code: D4204G<br/>
    /// </summary>
    [XmlEnum("D4204G")]
    Grundbuchamt_Hassfurt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hofheim i. Ufr.</b><br/>
    /// Code: D4205<br/>
    /// </summary>
    [XmlEnum("D4205")]
    aufgeloest_Amtsgericht_Hofheim_i_Ufr,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Forchheim, Zwst. H&#246;chstadt a. d. Aisch</b><br/>
    /// Code: D4206<br/>
    /// </summary>
    [XmlEnum("D4206")]
    aufgeloest_Amtsgericht_Forchheim_Zwst_Hoechstadt_a_d_Aisch,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Forchheim, Au&#223;enstelle Ebermannstadt</b><br/>
    /// Code: D4207<br/>
    /// </summary>
    [XmlEnum("D4207")]
    aufgeloest_Amtsgericht_Forchheim_Aussenstelle_Ebermannstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ha&#223;furt, Au&#223;enstelle Eltmann</b><br/>
    /// Code: D4208<br/>
    /// </summary>
    [XmlEnum("D4208")]
    aufgeloest_Amtsgericht_Hassfurt_Aussenstelle_Eltmann,

    /// <summary>
    /// <b>Landgericht Bayreuth</b><br/>
    /// Code: D4300<br/>
    /// </summary>
    [XmlEnum("D4300")]
    Landgericht_Bayreuth,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bayreuth</b><br/>
    /// Code: D4300S<br/>
    /// </summary>
    [XmlEnum("D4300S")]
    Staatsanwaltschaft_beim_Landgericht_Bayreuth,

    /// <summary>
    /// <b>Amtsgericht Bayreuth</b><br/>
    /// Code: D4301<br/>
    /// </summary>
    [XmlEnum("D4301")]
    Amtsgericht_Bayreuth,

    /// <summary>
    /// <b>Grundbuchamt Bayreuth</b><br/>
    /// Code: D4301G<br/>
    /// </summary>
    [XmlEnum("D4301G")]
    Grundbuchamt_Bayreuth,

    /// <summary>
    /// <b>Registergericht Amtsgericht Bayreuth</b><br/>
    /// Code: D4301V<br/>
    /// </summary>
    [XmlEnum("D4301V")]
    Registergericht_Amtsgericht_Bayreuth,

    /// <summary>
    /// <b>Amtsgericht Kulmbach</b><br/>
    /// Code: D4302<br/>
    /// </summary>
    [XmlEnum("D4302")]
    Amtsgericht_Kulmbach,

    /// <summary>
    /// <b>Grundbuchamt Kulmbach</b><br/>
    /// Code: D4302G<br/>
    /// </summary>
    [XmlEnum("D4302G")]
    Grundbuchamt_Kulmbach,

    /// <summary>
    /// <b>Amtsgericht Bayreuth Zweigstelle Pegnitz</b><br/>
    /// Code: D4303<br/>
    /// </summary>
    [XmlEnum("D4303")]
    Amtsgericht_Bayreuth_Zweigstelle_Pegnitz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stadtsteinach</b><br/>
    /// Code: D4304<br/>
    /// </summary>
    [XmlEnum("D4304")]
    aufgeloest_Amtsgericht_Stadtsteinach,

    /// <summary>
    /// <b>Landgericht Coburg</b><br/>
    /// Code: D4400<br/>
    /// </summary>
    [XmlEnum("D4400")]
    Landgericht_Coburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Coburg</b><br/>
    /// Code: D4400S<br/>
    /// </summary>
    [XmlEnum("D4400S")]
    Staatsanwaltschaft_beim_Landgericht_Coburg,

    /// <summary>
    /// <b>Amtsgericht Coburg</b><br/>
    /// Code: D4401<br/>
    /// </summary>
    [XmlEnum("D4401")]
    Amtsgericht_Coburg,

    /// <summary>
    /// <b>Grundbuchamt Coburg</b><br/>
    /// Code: D4401G<br/>
    /// </summary>
    [XmlEnum("D4401G")]
    Grundbuchamt_Coburg,

    /// <summary>
    /// <b>Amtsgericht Coburg, Zentrales Mahngericht</b><br/>
    /// Code: D4401M<br/>
    /// </summary>
    [XmlEnum("D4401M")]
    Amtsgericht_Coburg_Zentrales_Mahngericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Coburg</b><br/>
    /// Code: D4401V<br/>
    /// </summary>
    [XmlEnum("D4401V")]
    Registergericht_Amtsgericht_Coburg,

    /// <summary>
    /// <b>Amtsgericht Kronach</b><br/>
    /// Code: D4402<br/>
    /// </summary>
    [XmlEnum("D4402")]
    Amtsgericht_Kronach,

    /// <summary>
    /// <b>Grundbuchamt Kronach</b><br/>
    /// Code: D4402G<br/>
    /// </summary>
    [XmlEnum("D4402G")]
    Grundbuchamt_Kronach,

    /// <summary>
    /// <b>Amtsgericht Lichtenfels</b><br/>
    /// Code: D4403<br/>
    /// </summary>
    [XmlEnum("D4403")]
    Amtsgericht_Lichtenfels,

    /// <summary>
    /// <b>Grundbuchamt Lichtenfels</b><br/>
    /// Code: D4403G<br/>
    /// </summary>
    [XmlEnum("D4403G")]
    Grundbuchamt_Lichtenfels,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kronach, Zwst. Ludwigsstadt</b><br/>
    /// Code: D4404<br/>
    /// </summary>
    [XmlEnum("D4404")]
    aufgeloest_Amtsgericht_Kronach_Zwst_Ludwigsstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Coburg, Zwst. Neustadt b. Coburg</b><br/>
    /// Code: D4405<br/>
    /// </summary>
    [XmlEnum("D4405")]
    aufgeloest_Amtsgericht_Coburg_Zwst_Neustadt_b_Coburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lichtenfels, Au&#223;enstelle Staffelstein</b><br/>
    /// Code: D4406<br/>
    /// </summary>
    [XmlEnum("D4406")]
    aufgeloest_Amtsgericht_Lichtenfels_Aussenstelle_Staffelstein,

    /// <summary>
    /// <b>Landgericht Coburg Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Kronach</b><br/>
    /// Code: D4420<br/>
    /// </summary>
    [XmlEnum("D4420")]
    Landgericht_Coburg_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Kronach,

    /// <summary>
    /// <b>Landgericht Hof</b><br/>
    /// Code: D4500<br/>
    /// </summary>
    [XmlEnum("D4500")]
    Landgericht_Hof,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hof</b><br/>
    /// Code: D4500S<br/>
    /// </summary>
    [XmlEnum("D4500S")]
    Staatsanwaltschaft_beim_Landgericht_Hof,

    /// <summary>
    /// <b>Amtsgericht Hof</b><br/>
    /// Code: D4501<br/>
    /// </summary>
    [XmlEnum("D4501")]
    Amtsgericht_Hof,

    /// <summary>
    /// <b>Grundbuchamt Hof</b><br/>
    /// Code: D4501G<br/>
    /// </summary>
    [XmlEnum("D4501G")]
    Grundbuchamt_Hof,

    /// <summary>
    /// <b>Amtsgericht Hof, Zentrales Vollstreckungsgericht Bayern</b><br/>
    /// Code: D4501R<br/>
    /// </summary>
    [XmlEnum("D4501R")]
    Amtsgericht_Hof_Zentrales_Vollstreckungsgericht_Bayern,

    /// <summary>
    /// <b>Registergericht Amtsgericht Hof</b><br/>
    /// Code: D4501V<br/>
    /// </summary>
    [XmlEnum("D4501V")]
    Registergericht_Amtsgericht_Hof,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht M&#252;nchberg</b><br/>
    /// Code: D4502<br/>
    /// </summary>
    [XmlEnum("D4502")]
    aufgeloest_Amtsgericht_Muenchberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Naila</b><br/>
    /// Code: D4503<br/>
    /// </summary>
    [XmlEnum("D4503")]
    aufgeloest_Amtsgericht_Naila,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Selb</b><br/>
    /// Code: D4504<br/>
    /// </summary>
    [XmlEnum("D4504")]
    aufgeloest_Amtsgericht_Selb,

    /// <summary>
    /// <b>Amtsgericht Wunsiedel</b><br/>
    /// Code: D4505<br/>
    /// </summary>
    [XmlEnum("D4505")]
    Amtsgericht_Wunsiedel,

    /// <summary>
    /// <b>Grundbuchamt Wunsiedel</b><br/>
    /// Code: D4505G<br/>
    /// </summary>
    [XmlEnum("D4505G")]
    Grundbuchamt_Wunsiedel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hof, Zwst. Rehau</b><br/>
    /// Code: D4506<br/>
    /// </summary>
    [XmlEnum("D4506")]
    aufgeloest_Amtsgericht_Hof_Zwst_Rehau,

    /// <summary>
    /// <b>Landgericht Schweinfurt</b><br/>
    /// Code: D4600<br/>
    /// </summary>
    [XmlEnum("D4600")]
    Landgericht_Schweinfurt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Schweinfurt</b><br/>
    /// Code: D4600S<br/>
    /// </summary>
    [XmlEnum("D4600S")]
    Staatsanwaltschaft_beim_Landgericht_Schweinfurt,

    /// <summary>
    /// <b>Amtsgericht Bad Kissingen</b><br/>
    /// Code: D4601<br/>
    /// </summary>
    [XmlEnum("D4601")]
    Amtsgericht_Bad_Kissingen,

    /// <summary>
    /// <b>Grundbuchamt Bad Kissingen</b><br/>
    /// Code: D4601G<br/>
    /// </summary>
    [XmlEnum("D4601G")]
    Grundbuchamt_Bad_Kissingen,

    /// <summary>
    /// <b>Amtsgericht Bad Neustadt</b><br/>
    /// Code: D4602<br/>
    /// </summary>
    [XmlEnum("D4602")]
    Amtsgericht_Bad_Neustadt,

    /// <summary>
    /// <b>Grundbuchamt Bad Neustadt</b><br/>
    /// Code: D4602G<br/>
    /// </summary>
    [XmlEnum("D4602G")]
    Grundbuchamt_Bad_Neustadt,

    /// <summary>
    /// <b>Amtsgericht Schweinfurt Zweigstelle Gerolzhofen</b><br/>
    /// Code: D4603<br/>
    /// </summary>
    [XmlEnum("D4603")]
    Amtsgericht_Schweinfurt_Zweigstelle_Gerolzhofen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Kissingen Zweigstelle Hammelburg</b><br/>
    /// Code: D4604<br/>
    /// </summary>
    [XmlEnum("D4604")]
    aufgeloest_Amtsgericht_Bad_Kissingen_Zweigstelle_Hammelburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht K&#246;nigshofen i. Grabfeld</b><br/>
    /// Code: D4605<br/>
    /// </summary>
    [XmlEnum("D4605")]
    aufgeloest_Amtsgericht_Koenigshofen_i_Grabfeld,

    /// <summary>
    /// <b>Amtsgericht Bad Neustadt Zweigstelle Mellrichstadt</b><br/>
    /// Code: D4606<br/>
    /// </summary>
    [XmlEnum("D4606")]
    Amtsgericht_Bad_Neustadt_Zweigstelle_Mellrichstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht M&#252;nnerstadt</b><br/>
    /// Code: D4607<br/>
    /// </summary>
    [XmlEnum("D4607")]
    aufgeloest_Amtsgericht_Muennerstadt,

    /// <summary>
    /// <b>Amtsgericht Schweinfurt</b><br/>
    /// Code: D4608<br/>
    /// </summary>
    [XmlEnum("D4608")]
    Amtsgericht_Schweinfurt,

    /// <summary>
    /// <b>Grundbuchamt Schweinfurt</b><br/>
    /// Code: D4608G<br/>
    /// </summary>
    [XmlEnum("D4608G")]
    Grundbuchamt_Schweinfurt,

    /// <summary>
    /// <b>Registergericht Amtsgericht Schweinfurt</b><br/>
    /// Code: D4608V<br/>
    /// </summary>
    [XmlEnum("D4608V")]
    Registergericht_Amtsgericht_Schweinfurt,

    /// <summary>
    /// <b>Landgericht Schweinfurt Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Bad Neustadt</b><br/>
    /// Code: D4620<br/>
    /// </summary>
    [XmlEnum("D4620")]
    Landgericht_Schweinfurt_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Bad_Neustadt,

    /// <summary>
    /// <b>Landgericht W&#252;rzburg</b><br/>
    /// Code: D4700<br/>
    /// </summary>
    [XmlEnum("D4700")]
    Landgericht_Wuerzburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht W&#252;rzburg</b><br/>
    /// Code: D4700S<br/>
    /// </summary>
    [XmlEnum("D4700S")]
    Staatsanwaltschaft_beim_Landgericht_Wuerzburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Arnstein</b><br/>
    /// Code: D4701<br/>
    /// </summary>
    [XmlEnum("D4701")]
    aufgeloest_Amtsgericht_Arnstein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Br&#252;ckenau</b><br/>
    /// Code: D4702<br/>
    /// </summary>
    [XmlEnum("D4702")]
    aufgeloest_Amtsgericht_Brueckenau,

    /// <summary>
    /// <b>Amtsgericht Gem&#252;nden</b><br/>
    /// Code: D4703<br/>
    /// </summary>
    [XmlEnum("D4703")]
    Amtsgericht_Gemuenden,

    /// <summary>
    /// <b>Grundbuchamt Gem&#252;nden</b><br/>
    /// Code: D4703G<br/>
    /// </summary>
    [XmlEnum("D4703G")]
    Grundbuchamt_Gemuenden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Karlstadt</b><br/>
    /// Code: D4704<br/>
    /// </summary>
    [XmlEnum("D4704")]
    aufgeloest_Amtsgericht_Karlstadt,

    /// <summary>
    /// <b>Amtsgericht Kitzingen</b><br/>
    /// Code: D4705<br/>
    /// </summary>
    [XmlEnum("D4705")]
    Amtsgericht_Kitzingen,

    /// <summary>
    /// <b>Grundbuchamt Kitzingen</b><br/>
    /// Code: D4705G<br/>
    /// </summary>
    [XmlEnum("D4705G")]
    Grundbuchamt_Kitzingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gem&#252;nden a. Main, Zwst. Marktheidenfeld</b><br/>
    /// Code: D4706<br/>
    /// </summary>
    [XmlEnum("D4706")]
    aufgeloest_Amtsgericht_Gemuenden_a_Main_Zwst_Marktheidenfeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht W&#252;rzburg, Zweigstelle Ochsenfurt</b><br/>
    /// Code: D4707<br/>
    /// </summary>
    [XmlEnum("D4707")]
    aufgeloest_Amtsgericht_Wuerzburg_Zweigstelle_Ochsenfurt,

    /// <summary>
    /// <b>Amtsgericht W&#252;rzburg</b><br/>
    /// Code: D4708<br/>
    /// </summary>
    [XmlEnum("D4708")]
    Amtsgericht_Wuerzburg,

    /// <summary>
    /// <b>Grundbuchamt W&#252;rzburg</b><br/>
    /// Code: D4708G<br/>
    /// </summary>
    [XmlEnum("D4708G")]
    Grundbuchamt_Wuerzburg,

    /// <summary>
    /// <b>Registergericht Amtsgericht W&#252;rzburg</b><br/>
    /// Code: D4708V<br/>
    /// </summary>
    [XmlEnum("D4708V")]
    Registergericht_Amtsgericht_Wuerzburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Erlangen, Zwst. der StA N&#252;rnberg-F&#252;rth</b><br/>
    /// Code: D5200S<br/>
    /// </summary>
    [XmlEnum("D5200S")]
    Staatsanwaltschaft_beim_Landgericht_Erlangen_Zwst_der_StA_Nuernberg_Fuerth,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht F&#252;rth, Zwst. der StA N&#252;rnberg-F&#252;rth</b><br/>
    /// Code: D5300S<br/>
    /// </summary>
    [XmlEnum("D5300S")]
    Staatsanwaltschaft_beim_Landgericht_Fuerth_Zwst_der_StA_Nuernberg_Fuerth,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Straubing, Zwst. der StA Regensburg</b><br/>
    /// Code: D5400S<br/>
    /// </summary>
    [XmlEnum("D5400S")]
    Staatsanwaltschaft_beim_Landgericht_Straubing_Zwst_der_StA_Regensburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Neu-Ulm, Zwst. der StA Memmingen</b><br/>
    /// Code: D5500S<br/>
    /// </summary>
    [XmlEnum("D5500S")]
    Staatsanwaltschaft_beim_Landgericht_Neu_Ulm_Zwst_der_StA_Memmingen,

    /// <summary>
    /// <b>Landgericht Ingolstadt</b><br/>
    /// Code: D5700<br/>
    /// </summary>
    [XmlEnum("D5700")]
    Landgericht_Ingolstadt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Ingolstadt</b><br/>
    /// Code: D5700S<br/>
    /// </summary>
    [XmlEnum("D5700S")]
    Staatsanwaltschaft_beim_Landgericht_Ingolstadt,

    /// <summary>
    /// <b>Amtsgericht Ingolstadt</b><br/>
    /// Code: D5701<br/>
    /// </summary>
    [XmlEnum("D5701")]
    Amtsgericht_Ingolstadt,

    /// <summary>
    /// <b>Grundbuchamt Ingolstadt</b><br/>
    /// Code: D5701G<br/>
    /// </summary>
    [XmlEnum("D5701G")]
    Grundbuchamt_Ingolstadt,

    /// <summary>
    /// <b>Registergericht Amtsgericht Ingolstadt</b><br/>
    /// Code: D5701V<br/>
    /// </summary>
    [XmlEnum("D5701V")]
    Registergericht_Amtsgericht_Ingolstadt,

    /// <summary>
    /// <b>Amtsgericht Neuburg an der Donau</b><br/>
    /// Code: D5702<br/>
    /// </summary>
    [XmlEnum("D5702")]
    Amtsgericht_Neuburg_an_der_Donau,

    /// <summary>
    /// <b>Grundbuchamt Neuburg</b><br/>
    /// Code: D5702G<br/>
    /// </summary>
    [XmlEnum("D5702G")]
    Grundbuchamt_Neuburg,

    /// <summary>
    /// <b>Amtsgericht Pfaffenhofen a. d. Ilm</b><br/>
    /// Code: D5703<br/>
    /// </summary>
    [XmlEnum("D5703")]
    Amtsgericht_Pfaffenhofen_a_d_Ilm,

    /// <summary>
    /// <b>Grundbuchamt Pfaffenhofen</b><br/>
    /// Code: D5703G<br/>
    /// </summary>
    [XmlEnum("D5703G")]
    Grundbuchamt_Pfaffenhofen,

    /// <summary>
    /// <b>Landgericht Ingolstadt Ausw&#228;rtige Strafvollstreckungskammer b.d. Amtsgericht Neuburg a.d. Donau</b><br/>
    /// Code: D5720<br/>
    /// </summary>
    [XmlEnum("D5720")]
    Landgericht_Ingolstadt_Auswaertige_Strafvollstreckungskammer_b_d_Amtsgericht_Neuburg_a_d_Donau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Rosenheim, Zwst. der StA Traunstein</b><br/>
    /// Code: D5900S<br/>
    /// </summary>
    [XmlEnum("D5900S")]
    Staatsanwaltschaft_beim_Landgericht_Rosenheim_Zwst_der_StA_Traunstein,

    /// <summary>
    /// <b>Justizvollzugsanstalt Erlangen Sozialtherapeutische Anstalt</b><br/>
    /// Code: D6082<br/>
    /// </summary>
    [XmlEnum("D6082")]
    Justizvollzugsanstalt_Erlangen_Sozialtherapeutische_Anstalt,

    /// <summary>
    /// <b>Bayerischer Verwaltungsgerichtshof</b><br/>
    /// Code: D6122<br/>
    /// </summary>
    [XmlEnum("D6122")]
    Bayerischer_Verwaltungsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bernau</b><br/>
    /// Code: D6190<br/>
    /// </summary>
    [XmlEnum("D6190")]
    Justizvollzugsanstalt_Bernau,

    /// <summary>
    /// <b>Verwaltungsgericht Ansbach</b><br/>
    /// Code: D6248<br/>
    /// </summary>
    [XmlEnum("D6248")]
    Verwaltungsgericht_Ansbach,

    /// <summary>
    /// <b>Sozialgericht Augsburg</b><br/>
    /// Code: D6249<br/>
    /// </summary>
    [XmlEnum("D6249")]
    Sozialgericht_Augsburg,

    /// <summary>
    /// <b>Arbeitsgericht Augsburg</b><br/>
    /// Code: D6250<br/>
    /// </summary>
    [XmlEnum("D6250")]
    Arbeitsgericht_Augsburg,

    /// <summary>
    /// <b>Arbeitsgericht Bamberg</b><br/>
    /// Code: D6251<br/>
    /// </summary>
    [XmlEnum("D6251")]
    Arbeitsgericht_Bamberg,

    /// <summary>
    /// <b>Arbeitsgericht Kempten/Allg&#228;u</b><br/>
    /// Code: D6252<br/>
    /// </summary>
    [XmlEnum("D6252")]
    Arbeitsgericht_Kempten_Allgaeu,

    /// <summary>
    /// <b>Sozialgericht Landshut</b><br/>
    /// Code: D6253<br/>
    /// </summary>
    [XmlEnum("D6253")]
    Sozialgericht_Landshut,

    /// <summary>
    /// <b>Bayerisches Landessozialgericht</b><br/>
    /// Code: D6255<br/>
    /// </summary>
    [XmlEnum("D6255")]
    Bayerisches_Landessozialgericht,

    /// <summary>
    /// <b>Landesarbeitsgericht M&#252;nchen</b><br/>
    /// Code: D6256<br/>
    /// </summary>
    [XmlEnum("D6256")]
    Landesarbeitsgericht_Muenchen,

    /// <summary>
    /// <b>Arbeitsgericht M&#252;nchen</b><br/>
    /// Code: D6257<br/>
    /// </summary>
    [XmlEnum("D6257")]
    Arbeitsgericht_Muenchen,

    /// <summary>
    /// <b>Finanzgericht M&#252;nchen</b><br/>
    /// Code: D6258<br/>
    /// </summary>
    [XmlEnum("D6258")]
    Finanzgericht_Muenchen,

    /// <summary>
    /// <b>Bayerischer Verfassungsgerichtshof</b><br/>
    /// Code: D6259<br/>
    /// </summary>
    [XmlEnum("D6259")]
    Bayerischer_Verfassungsgerichtshof,

    /// <summary>
    /// <b>Sozialgericht M&#252;nchen</b><br/>
    /// Code: D6260<br/>
    /// </summary>
    [XmlEnum("D6260")]
    Sozialgericht_Muenchen,

    /// <summary>
    /// <b>Bundespatentgericht</b><br/>
    /// Code: D6261<br/>
    /// </summary>
    [XmlEnum("D6261")]
    Bundespatentgericht,

    /// <summary>
    /// <b>Verwaltungsgericht M&#252;nchen</b><br/>
    /// Code: D6262<br/>
    /// </summary>
    [XmlEnum("D6262")]
    Verwaltungsgericht_Muenchen,

    /// <summary>
    /// <b>Bundesfinanzhof</b><br/>
    /// Code: D6263<br/>
    /// </summary>
    [XmlEnum("D6263")]
    Bundesfinanzhof,

    /// <summary>
    /// <b>Finanzgericht N&#252;rnberg</b><br/>
    /// Code: D6264<br/>
    /// </summary>
    [XmlEnum("D6264")]
    Finanzgericht_Nuernberg,

    /// <summary>
    /// <b>Sozialgericht N&#252;rnberg</b><br/>
    /// Code: D6265<br/>
    /// </summary>
    [XmlEnum("D6265")]
    Sozialgericht_Nuernberg,

    /// <summary>
    /// <b>Landesarbeitsgericht N&#252;rnberg</b><br/>
    /// Code: D6266<br/>
    /// </summary>
    [XmlEnum("D6266")]
    Landesarbeitsgericht_Nuernberg,

    /// <summary>
    /// <b>Arbeitsgericht N&#252;rnberg</b><br/>
    /// Code: D6267<br/>
    /// </summary>
    [XmlEnum("D6267")]
    Arbeitsgericht_Nuernberg,

    /// <summary>
    /// <b>Sozialgericht Regensburg</b><br/>
    /// Code: D6268<br/>
    /// </summary>
    [XmlEnum("D6268")]
    Sozialgericht_Regensburg,

    /// <summary>
    /// <b>Arbeitsgericht Rosenheim</b><br/>
    /// Code: D6269<br/>
    /// </summary>
    [XmlEnum("D6269")]
    Arbeitsgericht_Rosenheim,

    /// <summary>
    /// <b>Arbeitsgericht W&#252;rzburg</b><br/>
    /// Code: D6270<br/>
    /// </summary>
    [XmlEnum("D6270")]
    Arbeitsgericht_Wuerzburg,

    /// <summary>
    /// <b>Sozialgericht W&#252;rzburg</b><br/>
    /// Code: D6271<br/>
    /// </summary>
    [XmlEnum("D6271")]
    Sozialgericht_Wuerzburg,

    /// <summary>
    /// <b>Verwaltungsgericht W&#252;rzburg</b><br/>
    /// Code: D6272<br/>
    /// </summary>
    [XmlEnum("D6272")]
    Verwaltungsgericht_Wuerzburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt M&#252;nchen</b><br/>
    /// Code: D6463<br/>
    /// </summary>
    [XmlEnum("D6463")]
    Justizvollzugsanstalt_Muenchen,

    /// <summary>
    /// <b>Arbeitsgericht Bayreuth</b><br/>
    /// Code: D6539<br/>
    /// </summary>
    [XmlEnum("D6539")]
    Arbeitsgericht_Bayreuth,

    /// <summary>
    /// <b>Arbeitsgericht Passau</b><br/>
    /// Code: D6540<br/>
    /// </summary>
    [XmlEnum("D6540")]
    Arbeitsgericht_Passau,

    /// <summary>
    /// <b>Arbeitsgericht Regensburg</b><br/>
    /// Code: D6541<br/>
    /// </summary>
    [XmlEnum("D6541")]
    Arbeitsgericht_Regensburg,

    /// <summary>
    /// <b>Arbeitsgericht Weiden</b><br/>
    /// Code: D6542<br/>
    /// </summary>
    [XmlEnum("D6542")]
    Arbeitsgericht_Weiden,

    /// <summary>
    /// <b>Sozialgericht Bayreuth</b><br/>
    /// Code: D6575<br/>
    /// </summary>
    [XmlEnum("D6575")]
    Sozialgericht_Bayreuth,

    /// <summary>
    /// <b>Verwaltungsgericht Augsburg</b><br/>
    /// Code: D6577<br/>
    /// </summary>
    [XmlEnum("D6577")]
    Verwaltungsgericht_Augsburg,

    /// <summary>
    /// <b>Verwaltungsgericht Bayreuth</b><br/>
    /// Code: D6578<br/>
    /// </summary>
    [XmlEnum("D6578")]
    Verwaltungsgericht_Bayreuth,

    /// <summary>
    /// <b>Verwaltungsgericht Regensburg</b><br/>
    /// Code: D6579<br/>
    /// </summary>
    [XmlEnum("D6579")]
    Verwaltungsgericht_Regensburg,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer N&#252;rnberg</b><br/>
    /// Code: D6657<br/>
    /// </summary>
    [XmlEnum("D6657")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Nuernberg,

    /// <summary>
    /// <b>Bayerischer Anwaltsgerichtshof</b><br/>
    /// Code: D6658<br/>
    /// </summary>
    [XmlEnum("D6658")]
    Bayerischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Memmingen</b><br/>
    /// Code: D7607<br/>
    /// </summary>
    [XmlEnum("D7607")]
    Justizvollzugsanstalt_Memmingen,

    /// <summary>
    /// <b>Justizvollzugsanstalt N&#252;rnberg</b><br/>
    /// Code: D7870<br/>
    /// </summary>
    [XmlEnum("D7870")]
    Justizvollzugsanstalt_Nuernberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kaisheim</b><br/>
    /// Code: D7871<br/>
    /// </summary>
    [XmlEnum("D7871")]
    Justizvollzugsanstalt_Kaisheim,

    /// <summary>
    /// <b>Bayerisches Landessozialgericht Zweigstelle Schweinfurt</b><br/>
    /// Code: D8047<br/>
    /// </summary>
    [XmlEnum("D8047")]
    Bayerisches_Landessozialgericht_Zweigstelle_Schweinfurt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Landsberg</b><br/>
    /// Code: D8419<br/>
    /// </summary>
    [XmlEnum("D8419")]
    Justizvollzugsanstalt_Landsberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt W&#252;rzburg</b><br/>
    /// Code: D8445<br/>
    /// </summary>
    [XmlEnum("D8445")]
    Justizvollzugsanstalt_Wuerzburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Neuburg an der Donau</b><br/>
    /// Code: D8485<br/>
    /// </summary>
    [XmlEnum("D8485")]
    Justizvollzugsanstalt_Neuburg_an_der_Donau,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kempten</b><br/>
    /// Code: D8491<br/>
    /// </summary>
    [XmlEnum("D8491")]
    Justizvollzugsanstalt_Kempten,

    /// <summary>
    /// <b>Justizvollzugsanstalt Straubing</b><br/>
    /// Code: D8517<br/>
    /// </summary>
    [XmlEnum("D8517")]
    Justizvollzugsanstalt_Straubing,

    /// <summary>
    /// <b>Justizvollzugsanstalt Aichach</b><br/>
    /// Code: D8551<br/>
    /// </summary>
    [XmlEnum("D8551")]
    Justizvollzugsanstalt_Aichach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Amberg</b><br/>
    /// Code: D8552<br/>
    /// </summary>
    [XmlEnum("D8552")]
    Justizvollzugsanstalt_Amberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ansbach</b><br/>
    /// Code: D8553<br/>
    /// </summary>
    [XmlEnum("D8553")]
    Justizvollzugsanstalt_Ansbach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Aschaffenburg</b><br/>
    /// Code: D8554<br/>
    /// </summary>
    [XmlEnum("D8554")]
    Justizvollzugsanstalt_Aschaffenburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bad Reichenhall</b><br/>
    /// Code: D8555<br/>
    /// </summary>
    [XmlEnum("D8555")]
    Justizvollzugsanstalt_Bad_Reichenhall,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bamberg</b><br/>
    /// Code: D8556<br/>
    /// </summary>
    [XmlEnum("D8556")]
    Justizvollzugsanstalt_Bamberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt St. Georgen-Bayreuth</b><br/>
    /// Code: D8557<br/>
    /// </summary>
    [XmlEnum("D8557")]
    Justizvollzugsanstalt_St_Georgen_Bayreuth,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ebrach</b><br/>
    /// Code: D8558<br/>
    /// </summary>
    [XmlEnum("D8558")]
    Justizvollzugsanstalt_Ebrach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Eichst&#228;tt</b><br/>
    /// Code: D8559<br/>
    /// </summary>
    [XmlEnum("D8559")]
    Justizvollzugsanstalt_Eichstaett,

    /// <summary>
    /// <b>Justizvollzugsanstalt Erding</b><br/>
    /// Code: D8560<br/>
    /// </summary>
    [XmlEnum("D8560")]
    Justizvollzugsanstalt_Erding,

    /// <summary>
    /// <b>Justizvollzugsanstalt Garmisch-Partenkirchen</b><br/>
    /// Code: D8561<br/>
    /// </summary>
    [XmlEnum("D8561")]
    Justizvollzugsanstalt_Garmisch_Partenkirchen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hof</b><br/>
    /// Code: D8562<br/>
    /// </summary>
    [XmlEnum("D8562")]
    Justizvollzugsanstalt_Hof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ingolstadt</b><br/>
    /// Code: D8563<br/>
    /// </summary>
    [XmlEnum("D8563")]
    Justizvollzugsanstalt_Ingolstadt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kronach</b><br/>
    /// Code: D8564<br/>
    /// </summary>
    [XmlEnum("D8564")]
    Justizvollzugsanstalt_Kronach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Landshut</b><br/>
    /// Code: D8566<br/>
    /// </summary>
    [XmlEnum("D8566")]
    Justizvollzugsanstalt_Landshut,

    /// <summary>
    /// <b>Justizvollzugsanstalt Passau</b><br/>
    /// Code: D8567<br/>
    /// </summary>
    [XmlEnum("D8567")]
    Justizvollzugsanstalt_Passau,

    /// <summary>
    /// <b>Justizvollzugsanstalt Regensburg</b><br/>
    /// Code: D8568<br/>
    /// </summary>
    [XmlEnum("D8568")]
    Justizvollzugsanstalt_Regensburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Schweinfurt</b><br/>
    /// Code: D8569<br/>
    /// </summary>
    [XmlEnum("D8569")]
    Justizvollzugsanstalt_Schweinfurt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Traunstein</b><br/>
    /// Code: D8570<br/>
    /// </summary>
    [XmlEnum("D8570")]
    Justizvollzugsanstalt_Traunstein,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer M&#252;nchen</b><br/>
    /// Code: D8642<br/>
    /// </summary>
    [XmlEnum("D8642")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Muenchen,

    /// <summary>
    /// <b>Anwaltsgericht Bamberg</b><br/>
    /// Code: D8686<br/>
    /// </summary>
    [XmlEnum("D8686")]
    Anwaltsgericht_Bamberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Niedersch&#246;nenfeld</b><br/>
    /// Code: D8699<br/>
    /// </summary>
    [XmlEnum("D8699")]
    Justizvollzugsanstalt_Niederschoenenfeld,

    /// <summary>
    /// <b>Justizvollzugsanstalt M&#252;hldorf a.Inn</b><br/>
    /// Code: D8793<br/>
    /// </summary>
    [XmlEnum("D8793")]
    Justizvollzugsanstalt_Muehldorf_a_Inn,

    /// <summary>
    /// <b>Justizvollzugsanstalt Laufen-Lebenau</b><br/>
    /// Code: D8794<br/>
    /// </summary>
    [XmlEnum("D8794")]
    Justizvollzugsanstalt_Laufen_Lebenau,

    /// <summary>
    /// <b>Justizvollzugsanstalt Weiden</b><br/>
    /// Code: D8821<br/>
    /// </summary>
    [XmlEnum("D8821")]
    Justizvollzugsanstalt_Weiden,

    /// <summary>
    /// <b>Finanzgericht Augsburg</b><br/>
    /// Code: D8902<br/>
    /// </summary>
    [XmlEnum("D8902")]
    Finanzgericht_Augsburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Augsburg-Gablingen</b><br/>
    /// Code: D9372<br/>
    /// </summary>
    [XmlEnum("D9372")]
    Justizvollzugsanstalt_Augsburg_Gablingen,

    /// <summary>
    /// <b>Arbeitsgericht Augsburg Kammer Neu-Ulm</b><br/>
    /// Code: D9395<br/>
    /// </summary>
    [XmlEnum("D9395")]
    Arbeitsgericht_Augsburg_Kammer_Neu_Ulm,

    /// <summary>
    /// <b>Arbeitsgericht Bamberg Kammer Coburg</b><br/>
    /// Code: D9396<br/>
    /// </summary>
    [XmlEnum("D9396")]
    Arbeitsgericht_Bamberg_Kammer_Coburg,

    /// <summary>
    /// <b>Arbeitsgericht Bayreuth Kammer Hof</b><br/>
    /// Code: D9397<br/>
    /// </summary>
    [XmlEnum("D9397")]
    Arbeitsgericht_Bayreuth_Kammer_Hof,

    /// <summary>
    /// <b>Arbeitsgericht M&#252;nchen Kammer Ingolstadt</b><br/>
    /// Code: D9398<br/>
    /// </summary>
    [XmlEnum("D9398")]
    Arbeitsgericht_Muenchen_Kammer_Ingolstadt,

    /// <summary>
    /// <b>Arbeitsgericht M&#252;nchen Kammer Weilheim</b><br/>
    /// Code: D9399<br/>
    /// </summary>
    [XmlEnum("D9399")]
    Arbeitsgericht_Muenchen_Kammer_Weilheim,

    /// <summary>
    /// <b>Arbeitsgericht Passau Kammer Deggendorf</b><br/>
    /// Code: D9400<br/>
    /// </summary>
    [XmlEnum("D9400")]
    Arbeitsgericht_Passau_Kammer_Deggendorf,

    /// <summary>
    /// <b>Arbeitsgericht Regensburg Kammer Landshut</b><br/>
    /// Code: D9401<br/>
    /// </summary>
    [XmlEnum("D9401")]
    Arbeitsgericht_Regensburg_Kammer_Landshut,

    /// <summary>
    /// <b>Arbeitsgericht Rosenheim Kammer Traunstein</b><br/>
    /// Code: D9402<br/>
    /// </summary>
    [XmlEnum("D9402")]
    Arbeitsgericht_Rosenheim_Kammer_Traunstein,

    /// <summary>
    /// <b>Arbeitsgericht Weiden Kammer Schwandorf</b><br/>
    /// Code: D9403<br/>
    /// </summary>
    [XmlEnum("D9403")]
    Arbeitsgericht_Weiden_Kammer_Schwandorf,

    /// <summary>
    /// <b>Arbeitsgericht W&#252;rzburg Kammer Aschaffenburg</b><br/>
    /// Code: D9404<br/>
    /// </summary>
    [XmlEnum("D9404")]
    Arbeitsgericht_Wuerzburg_Kammer_Aschaffenburg,

    /// <summary>
    /// <b>Arbeitsgericht W&#252;rzburg Kammer Schweinfurt</b><br/>
    /// Code: D9405<br/>
    /// </summary>
    [XmlEnum("D9405")]
    Arbeitsgericht_Wuerzburg_Kammer_Schweinfurt,

    /// <summary>
    /// <b>Kammergericht Berlin</b><br/>
    /// Code: F1000<br/>
    /// </summary>
    [XmlEnum("F1000")]
    Kammergericht_Berlin,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Berlin (Kammergericht)</b><br/>
    /// Code: F1000S<br/>
    /// </summary>
    [XmlEnum("F1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Berlin_Kammergericht,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Kammergericht -Dezernat Ausl. Einl.-</b><br/>
    /// Code: F1001S<br/>
    /// </summary>
    [XmlEnum("F1001S")]
    Staatsanwaltschaft_bei_dem_Kammergericht_Dezernat_Ausl_Einl,

    /// <summary>
    /// <b>Landgericht Berlin Strafgerichtsbarkeit</b><br/>
    /// Code: F1100<br/>
    /// </summary>
    [XmlEnum("F1100")]
    Landgericht_Berlin_Strafgerichtsbarkeit,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Berlin</b><br/>
    /// Code: F1100S<br/>
    /// </summary>
    [XmlEnum("F1100S")]
    Staatsanwaltschaft_beim_Landgericht_Berlin,

    /// <summary>
    /// <b>Amtsgericht Tiergarten</b><br/>
    /// Code: F1101<br/>
    /// </summary>
    [XmlEnum("F1101")]
    Amtsgericht_Tiergarten,

    /// <summary>
    /// <b>Amtsgericht Tiergarten Zivilsachen</b><br/>
    /// Code: F1101R<br/>
    /// </summary>
    [XmlEnum("F1101R")]
    Amtsgericht_Tiergarten_Zivilsachen,

    /// <summary>
    /// <b>Amtsgericht Wedding</b><br/>
    /// Code: F1102<br/>
    /// </summary>
    [XmlEnum("F1102")]
    Amtsgericht_Wedding,

    /// <summary>
    /// <b>Amtsgericht Wedding, Mahngericht</b><br/>
    /// Code: F1102M<br/>
    /// </summary>
    [XmlEnum("F1102M")]
    Amtsgericht_Wedding_Mahngericht,

    /// <summary>
    /// <b>Amtsgericht Charlottenburg</b><br/>
    /// Code: F1103<br/>
    /// </summary>
    [XmlEnum("F1103")]
    Amtsgericht_Charlottenburg,

    /// <summary>
    /// <b>Amtsgericht Charlottenburg, Handels- und Genossenschaftsregister</b><br/>
    /// Code: F1103R<br/>
    /// </summary>
    [XmlEnum("F1103R")]
    Amtsgericht_Charlottenburg_Handels_und_Genossenschaftsregister,

    /// <summary>
    /// <b>Amtsgericht Spandau</b><br/>
    /// Code: F1104<br/>
    /// </summary>
    [XmlEnum("F1104")]
    Amtsgericht_Spandau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Berlin-Zehlendorf</b><br/>
    /// Code: F1105<br/>
    /// </summary>
    [XmlEnum("F1105")]
    aufgeloest_Amtsgericht_Berlin_Zehlendorf,

    /// <summary>
    /// <b>Amtsgericht Sch&#246;neberg</b><br/>
    /// Code: F1106<br/>
    /// </summary>
    [XmlEnum("F1106")]
    Amtsgericht_Schoeneberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Berlin-Lichterfelde</b><br/>
    /// Code: F1107<br/>
    /// </summary>
    [XmlEnum("F1107")]
    aufgeloest_Amtsgericht_Berlin_Lichterfelde,

    /// <summary>
    /// <b>Amtsgericht Kreuzberg</b><br/>
    /// Code: F1108<br/>
    /// </summary>
    [XmlEnum("F1108")]
    Amtsgericht_Kreuzberg,

    /// <summary>
    /// <b>Amtsgericht Neuk&#246;lln</b><br/>
    /// Code: F1109<br/>
    /// </summary>
    [XmlEnum("F1109")]
    Amtsgericht_Neukoelln,

    /// <summary>
    /// <b>Amtsgericht Pankow</b><br/>
    /// Code: F1110<br/>
    /// </summary>
    [XmlEnum("F1110")]
    Amtsgericht_Pankow,

    /// <summary>
    /// <b>Amtsanwaltschaft Berlin</b><br/>
    /// Code: F1110S<br/>
    /// </summary>
    [XmlEnum("F1110S")]
    Amtsanwaltschaft_Berlin,

    /// <summary>
    /// <b>Amtsgericht Lichtenberg</b><br/>
    /// Code: F1111<br/>
    /// </summary>
    [XmlEnum("F1111")]
    Amtsgericht_Lichtenberg,

    /// <summary>
    /// <b>Amtsgericht Berlin Mitte</b><br/>
    /// Code: F1112<br/>
    /// </summary>
    [XmlEnum("F1112")]
    Amtsgericht_Berlin_Mitte,

    /// <summary>
    /// <b>Amtsgericht Berlin Mitte, Zentrales Vollstreckungsgericht Berlin</b><br/>
    /// Code: F1112R<br/>
    /// </summary>
    [XmlEnum("F1112R")]
    Amtsgericht_Berlin_Mitte_Zentrales_Vollstreckungsgericht_Berlin,

    /// <summary>
    /// <b>Amtsgericht K&#246;penick</b><br/>
    /// Code: F1113<br/>
    /// </summary>
    [XmlEnum("F1113")]
    Amtsgericht_Koepenick,

    /// <summary>
    /// <b>Amtsgericht Hohensch&#246;nhausen</b><br/>
    /// Code: F1114<br/>
    /// </summary>
    [XmlEnum("F1114")]
    Amtsgericht_Hohenschoenhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Berlin II</b><br/>
    /// Code: F1200S<br/>
    /// </summary>
    [XmlEnum("F1200S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Berlin_II,

    /// <summary>
    /// <b>Bereitschaftsgericht Berlin</b><br/>
    /// Code: F6053<br/>
    /// </summary>
    [XmlEnum("F6053")]
    Bereitschaftsgericht_Berlin,

    /// <summary>
    /// <b>Sozialgericht Berlin</b><br/>
    /// Code: F6061<br/>
    /// </summary>
    [XmlEnum("F6061")]
    Sozialgericht_Berlin,

    /// <summary>
    /// <b>Finanzgericht Berlin</b><br/>
    /// Code: F6080<br/>
    /// </summary>
    [XmlEnum("F6080")]
    Finanzgericht_Berlin,

    /// <summary>
    /// <b>Landessozialgericht Berlin</b><br/>
    /// Code: F6081<br/>
    /// </summary>
    [XmlEnum("F6081")]
    Landessozialgericht_Berlin,

    /// <summary>
    /// <b>Arbeitsgericht Berlin</b><br/>
    /// Code: F6082<br/>
    /// </summary>
    [XmlEnum("F6082")]
    Arbeitsgericht_Berlin,

    /// <summary>
    /// <b>Landesarbeitsgericht Berlin</b><br/>
    /// Code: F6083<br/>
    /// </summary>
    [XmlEnum("F6083")]
    Landesarbeitsgericht_Berlin,

    /// <summary>
    /// <b>Verwaltungsgericht Berlin</b><br/>
    /// Code: F6084<br/>
    /// </summary>
    [XmlEnum("F6084")]
    Verwaltungsgericht_Berlin,

    /// <summary>
    /// <b>Justizbeitreibungsstelle des Bundesverwaltungsgerichts</b><br/>
    /// Code: F6085<br/>
    /// </summary>
    [XmlEnum("F6085")]
    Justizbeitreibungsstelle_des_Bundesverwaltungsgerichts,

    /// <summary>
    /// <b>aufgel&#246;st-Bundesverwaltungsgericht</b><br/>
    /// Code: F6087<br/>
    /// </summary>
    [XmlEnum("F6087")]
    aufgeloest_Bundesverwaltungsgericht,

    /// <summary>
    /// <b>Die Pr&#228;sidentin des Kammergerichts</b><br/>
    /// Code: F6104<br/>
    /// </summary>
    [XmlEnum("F6104")]
    Die_Praesidentin_des_Kammergerichts,

    /// <summary>
    /// <b>Oberverwaltungsgericht Berlin-Brandenburg</b><br/>
    /// Code: F6145<br/>
    /// </summary>
    [XmlEnum("F6145")]
    Oberverwaltungsgericht_Berlin_Brandenburg,

    /// <summary>
    /// <b>Anwaltsgericht im Bezirk der Rechtsanwaltskammer Berlin</b><br/>
    /// Code: F6149<br/>
    /// </summary>
    [XmlEnum("F6149")]
    Anwaltsgericht_im_Bezirk_der_Rechtsanwaltskammer_Berlin,

    /// <summary>
    /// <b>Anwaltsgerichtshof Berlin</b><br/>
    /// Code: F6185<br/>
    /// </summary>
    [XmlEnum("F6185")]
    Anwaltsgerichtshof_Berlin,

    /// <summary>
    /// <b>Jugendarrestanstalt Berlin-Brandenburg</b><br/>
    /// Code: F6374<br/>
    /// </summary>
    [XmlEnum("F6374")]
    Jugendarrestanstalt_Berlin_Brandenburg,

    /// <summary>
    /// <b>Jugendstrafanstalt Berlin</b><br/>
    /// Code: F6399<br/>
    /// </summary>
    [XmlEnum("F6399")]
    Jugendstrafanstalt_Berlin,

    /// <summary>
    /// <b>aufgel&#246;st-Landgericht Berlin Zivilgerichtsbarkeit 1. Instanz</b><br/>
    /// Code: F6402<br/>
    /// </summary>
    [XmlEnum("F6402")]
    aufgeloest_Landgericht_Berlin_Zivilgerichtsbarkeit_1_Instanz,

    /// <summary>
    /// <b>Justizvollzugsanstalt Tegel</b><br/>
    /// Code: F6491<br/>
    /// </summary>
    [XmlEnum("F6491")]
    Justizvollzugsanstalt_Tegel,

    /// <summary>
    /// <b>Die Pr&#228;sidentin des Verwaltungsgerichts Berlin</b><br/>
    /// Code: F6496<br/>
    /// </summary>
    [XmlEnum("F6496")]
    Die_Praesidentin_des_Verwaltungsgerichts_Berlin,

    /// <summary>
    /// <b>Justizvollzugsanstalt Moabit</b><br/>
    /// Code: F6525<br/>
    /// </summary>
    [XmlEnum("F6525")]
    Justizvollzugsanstalt_Moabit,

    /// <summary>
    /// <b>Landgericht Berlin Zivilgerichtsbarkeit</b><br/>
    /// Code: F6529<br/>
    /// </summary>
    [XmlEnum("F6529")]
    Landgericht_Berlin_Zivilgerichtsbarkeit,

    /// <summary>
    /// <b>Verfassungsgerichtshof Berlin</b><br/>
    /// Code: F6544<br/>
    /// </summary>
    [XmlEnum("F6544")]
    Verfassungsgerichtshof_Berlin,

    /// <summary>
    /// <b>Europ&#228;isches Mahngericht Deutschland</b><br/>
    /// Code: F6545<br/>
    /// </summary>
    [XmlEnum("F6545")]
    Europaeisches_Mahngericht_Deutschland,

    /// <summary>
    /// <b>Amtsgericht Tiergarten, Verkehrs- und Wirtschaftsstrafsachen</b><br/>
    /// Code: F6552<br/>
    /// </summary>
    [XmlEnum("F6552")]
    Amtsgericht_Tiergarten_Verkehrs_und_Wirtschaftsstrafsachen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Pankow-Wei&#223;ensee, Familiengericht</b><br/>
    /// Code: F6553<br/>
    /// </summary>
    [XmlEnum("F6553")]
    aufgeloest_Amtsgericht_Pankow_Weissensee_Familiengericht,

    /// <summary>
    /// <b>Justizvollzugsanstalt f&#252;r Frauen Berlin</b><br/>
    /// Code: F7460<br/>
    /// </summary>
    [XmlEnum("F7460")]
    Justizvollzugsanstalt_fuer_Frauen_Berlin,

    /// <summary>
    /// <b>Justizvollzugsanstalt Pl&#246;tzensee</b><br/>
    /// Code: F7464<br/>
    /// </summary>
    [XmlEnum("F7464")]
    Justizvollzugsanstalt_Ploetzensee,

    /// <summary>
    /// <b>Justizvollzugsanstalt des Offenen Vollzuges Berlin</b><br/>
    /// Code: F7599<br/>
    /// </summary>
    [XmlEnum("F7599")]
    Justizvollzugsanstalt_des_Offenen_Vollzuges_Berlin,

    /// <summary>
    /// <b>Brandenburgisches Oberlandesgericht</b><br/>
    /// Code: G1000<br/>
    /// </summary>
    [XmlEnum("G1000")]
    Brandenburgisches_Oberlandesgericht,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Brandenburg a. d. Havel</b><br/>
    /// Code: G1000S<br/>
    /// </summary>
    [XmlEnum("G1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Brandenburg_a_d_Havel,

    /// <summary>
    /// <b>Generalstaatsanwaltschaft des Landes Brandenburg, -Rechtshilfe-</b><br/>
    /// Code: G1001S<br/>
    /// </summary>
    [XmlEnum("G1001S")]
    Generalstaatsanwaltschaft_des_Landes_Brandenburg_Rechtshilfe,

    /// <summary>
    /// <b>Landgericht Cottbus</b><br/>
    /// Code: G1100<br/>
    /// </summary>
    [XmlEnum("G1100")]
    Landgericht_Cottbus,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Cottbus</b><br/>
    /// Code: G1100S<br/>
    /// </summary>
    [XmlEnum("G1100S")]
    Staatsanwaltschaft_beim_Landgericht_Cottbus,

    /// <summary>
    /// <b>Amtsgericht Bad Liebenwerda</b><br/>
    /// Code: G1101<br/>
    /// </summary>
    [XmlEnum("G1101")]
    Amtsgericht_Bad_Liebenwerda,

    /// <summary>
    /// <b>Grundbuchamt Bad Liebenwerda</b><br/>
    /// Code: G1101G<br/>
    /// </summary>
    [XmlEnum("G1101G")]
    Grundbuchamt_Bad_Liebenwerda,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Calau (in L&#252;bbenau)</b><br/>
    /// Code: G1102<br/>
    /// </summary>
    [XmlEnum("G1102")]
    aufgeloest_Amtsgericht_Calau_in_Luebbenau,

    /// <summary>
    /// <b>Amtsgericht Cottbus</b><br/>
    /// Code: G1103<br/>
    /// </summary>
    [XmlEnum("G1103")]
    Amtsgericht_Cottbus,

    /// <summary>
    /// <b>Grundbuchamt Cottbus</b><br/>
    /// Code: G1103G<br/>
    /// </summary>
    [XmlEnum("G1103G")]
    Grundbuchamt_Cottbus,

    /// <summary>
    /// <b>Amtsgericht Bad Liebenwerda Zweigstelle Finsterwalde</b><br/>
    /// Code: G1105<br/>
    /// </summary>
    [XmlEnum("G1105")]
    Amtsgericht_Bad_Liebenwerda_Zweigstelle_Finsterwalde,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Forst/Lausitz</b><br/>
    /// Code: G1106<br/>
    /// </summary>
    [XmlEnum("G1106")]
    aufgeloest_Amtsgericht_Forst_Lausitz,

    /// <summary>
    /// <b>Amtsgericht Guben</b><br/>
    /// Code: G1107<br/>
    /// </summary>
    [XmlEnum("G1107")]
    Amtsgericht_Guben,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Herzberg/Elster</b><br/>
    /// Code: G1108<br/>
    /// </summary>
    [XmlEnum("G1108")]
    aufgeloest_Amtsgericht_Herzberg_Elster,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Luckau</b><br/>
    /// Code: G1109<br/>
    /// </summary>
    [XmlEnum("G1109")]
    aufgeloest_Amtsgericht_Luckau,

    /// <summary>
    /// <b>Amtsgericht L&#252;bben</b><br/>
    /// Code: G1110<br/>
    /// </summary>
    [XmlEnum("G1110")]
    Amtsgericht_Luebben,

    /// <summary>
    /// <b>Grundbuchamt L&#252;bben (Spreewald)</b><br/>
    /// Code: G1110G<br/>
    /// </summary>
    [XmlEnum("G1110G")]
    Grundbuchamt_Luebben_Spreewald,

    /// <summary>
    /// <b>Amtsgericht Senftenberg</b><br/>
    /// Code: G1111<br/>
    /// </summary>
    [XmlEnum("G1111")]
    Amtsgericht_Senftenberg,

    /// <summary>
    /// <b>Grundbuchamt Senftenberg</b><br/>
    /// Code: G1111G<br/>
    /// </summary>
    [XmlEnum("G1111G")]
    Grundbuchamt_Senftenberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Spremberg</b><br/>
    /// Code: G1112<br/>
    /// </summary>
    [XmlEnum("G1112")]
    aufgeloest_Amtsgericht_Spremberg,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Landgericht Cottbus, -Rechtshilfe-</b><br/>
    /// Code: G1113S<br/>
    /// </summary>
    [XmlEnum("G1113S")]
    Staatsanwaltschaft_bei_dem_Landgericht_Cottbus_Rechtshilfe,

    /// <summary>
    /// <b>Landgericht Frankfurt/Oder</b><br/>
    /// Code: G1200<br/>
    /// </summary>
    [XmlEnum("G1200")]
    Landgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Frankfurt/Oder</b><br/>
    /// Code: G1200S<br/>
    /// </summary>
    [XmlEnum("G1200S")]
    Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schwedt, Zwst. Angerm&#252;nde</b><br/>
    /// Code: G1201<br/>
    /// </summary>
    [XmlEnum("G1201")]
    aufgeloest_Amtsgericht_Schwedt_Zwst_Angermuende,

    /// <summary>
    /// <b>Amtsgericht Bad Freienwalde</b><br/>
    /// Code: G1202<br/>
    /// </summary>
    [XmlEnum("G1202")]
    Amtsgericht_Bad_Freienwalde,

    /// <summary>
    /// <b>Grundbuchamt Bad Freienwalde (Oder)</b><br/>
    /// Code: G1202G<br/>
    /// </summary>
    [XmlEnum("G1202G")]
    Grundbuchamt_Bad_Freienwalde_Oder,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Beeskow</b><br/>
    /// Code: G1203<br/>
    /// </summary>
    [XmlEnum("G1203")]
    aufgeloest_Amtsgericht_Beeskow,

    /// <summary>
    /// <b>Amtsgericht Bernau</b><br/>
    /// Code: G1204<br/>
    /// </summary>
    [XmlEnum("G1204")]
    Amtsgericht_Bernau,

    /// <summary>
    /// <b>Grundbuchamt Bernau bei Berlin</b><br/>
    /// Code: G1204G<br/>
    /// </summary>
    [XmlEnum("G1204G")]
    Grundbuchamt_Bernau_bei_Berlin,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankfurt/Oder, Zwst. Bernau</b><br/>
    /// Code: G1204S<br/>
    /// </summary>
    [XmlEnum("G1204S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder_Zwst_Bernau,

    /// <summary>
    /// <b>Amtsgericht Eberswalde</b><br/>
    /// Code: G1205<br/>
    /// </summary>
    [XmlEnum("G1205")]
    Amtsgericht_Eberswalde,

    /// <summary>
    /// <b>Grundbuchamt Eberswalde</b><br/>
    /// Code: G1205G<br/>
    /// </summary>
    [XmlEnum("G1205G")]
    Grundbuchamt_Eberswalde,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Eberswalde, Zwst. der StA Frankfurt/Oder</b><br/>
    /// Code: G1205S<br/>
    /// </summary>
    [XmlEnum("G1205S")]
    Staatsanwaltschaft_beim_Landgericht_Eberswalde_Zwst_der_StA_Frankfurt_Oder,

    /// <summary>
    /// <b>Amtsgericht Eisenh&#252;ttenstadt</b><br/>
    /// Code: G1206<br/>
    /// </summary>
    [XmlEnum("G1206")]
    Amtsgericht_Eisenhuettenstadt,

    /// <summary>
    /// <b>Grundbuchamt Eisenh&#252;ttenstadt</b><br/>
    /// Code: G1206G<br/>
    /// </summary>
    [XmlEnum("G1206G")]
    Grundbuchamt_Eisenhuettenstadt,

    /// <summary>
    /// <b>Amtsgericht Frankfurt/Oder</b><br/>
    /// Code: G1207<br/>
    /// </summary>
    [XmlEnum("G1207")]
    Amtsgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>Grundbuchamt Frankfurt/Oder</b><br/>
    /// Code: G1207G<br/>
    /// </summary>
    [XmlEnum("G1207G")]
    Grundbuchamt_Frankfurt_Oder,

    /// <summary>
    /// <b>Amtsgericht F&#252;rstenwalde</b><br/>
    /// Code: G1208<br/>
    /// </summary>
    [XmlEnum("G1208")]
    Amtsgericht_Fuerstenwalde,

    /// <summary>
    /// <b>Grundbuchamt F&#252;rstenwalde/Spree</b><br/>
    /// Code: G1208G<br/>
    /// </summary>
    [XmlEnum("G1208G")]
    Grundbuchamt_Fuerstenwalde_Spree,

    /// <summary>
    /// <b>Amtsgericht Prenzlau</b><br/>
    /// Code: G1209<br/>
    /// </summary>
    [XmlEnum("G1209")]
    Amtsgericht_Prenzlau,

    /// <summary>
    /// <b>Grundbuchamt Prenzlau</b><br/>
    /// Code: G1209G<br/>
    /// </summary>
    [XmlEnum("G1209G")]
    Grundbuchamt_Prenzlau,

    /// <summary>
    /// <b>Amtsgericht Schwedt</b><br/>
    /// Code: G1210<br/>
    /// </summary>
    [XmlEnum("G1210")]
    Amtsgericht_Schwedt,

    /// <summary>
    /// <b>Grundbuchamt Schwedt/Oder</b><br/>
    /// Code: G1210G<br/>
    /// </summary>
    [XmlEnum("G1210G")]
    Grundbuchamt_Schwedt_Oder,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankfurt/Oder, Zwst. Schwedt</b><br/>
    /// Code: G1210S<br/>
    /// </summary>
    [XmlEnum("G1210S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankfurt_Oder_Zwst_Schwedt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Seelow</b><br/>
    /// Code: G1211<br/>
    /// </summary>
    [XmlEnum("G1211")]
    aufgeloest_Amtsgericht_Seelow,

    /// <summary>
    /// <b>Amtsgericht Strausberg</b><br/>
    /// Code: G1212<br/>
    /// </summary>
    [XmlEnum("G1212")]
    Amtsgericht_Strausberg,

    /// <summary>
    /// <b>Grundbuchamt Strausberg</b><br/>
    /// Code: G1212G<br/>
    /// </summary>
    [XmlEnum("G1212G")]
    Grundbuchamt_Strausberg,

    /// <summary>
    /// <b>Amtsgericht Prenzlau Zweigstelle Templin</b><br/>
    /// Code: G1213<br/>
    /// </summary>
    [XmlEnum("G1213")]
    Amtsgericht_Prenzlau_Zweigstelle_Templin,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Landgericht Frankfurt/Oder, -Rechtshilfe-</b><br/>
    /// Code: G1214S<br/>
    /// </summary>
    [XmlEnum("G1214S")]
    Staatsanwaltschaft_bei_dem_Landgericht_Frankfurt_Oder_Rechtshilfe,

    /// <summary>
    /// <b>Landgericht Potsdam</b><br/>
    /// Code: G1300<br/>
    /// </summary>
    [XmlEnum("G1300")]
    Landgericht_Potsdam,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Potsdam</b><br/>
    /// Code: G1300S<br/>
    /// </summary>
    [XmlEnum("G1300S")]
    Staatsanwaltschaft_beim_Landgericht_Potsdam,

    /// <summary>
    /// <b>Amtsgericht Brandenburg Zweigstelle Belzig</b><br/>
    /// Code: G1301<br/>
    /// </summary>
    [XmlEnum("G1301")]
    Amtsgericht_Brandenburg_Zweigstelle_Belzig,

    /// <summary>
    /// <b>Amtsgericht Brandenburg an der Havel</b><br/>
    /// Code: G1302<br/>
    /// </summary>
    [XmlEnum("G1302")]
    Amtsgericht_Brandenburg_an_der_Havel,

    /// <summary>
    /// <b>Grundbuchamt Brandenburg an der Havel</b><br/>
    /// Code: G1302G<br/>
    /// </summary>
    [XmlEnum("G1302G")]
    Grundbuchamt_Brandenburg_an_der_Havel,

    /// <summary>
    /// <b>Amtsgericht Zehdenick</b><br/>
    /// Code: G1303<br/>
    /// </summary>
    [XmlEnum("G1303")]
    Amtsgericht_Zehdenick,

    /// <summary>
    /// <b>Grundbuchamt Zehdenick</b><br/>
    /// Code: G1303G<br/>
    /// </summary>
    [XmlEnum("G1303G")]
    Grundbuchamt_Zehdenick,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht J&#252;terbog</b><br/>
    /// Code: G1304<br/>
    /// </summary>
    [XmlEnum("G1304")]
    aufgeloest_Amtsgericht_Jueterbog,

    /// <summary>
    /// <b>Amtsgericht K&#246;nigs Wusterhausen</b><br/>
    /// Code: G1305<br/>
    /// </summary>
    [XmlEnum("G1305")]
    Amtsgericht_Koenigs_Wusterhausen,

    /// <summary>
    /// <b>Grundbuchamt K&#246;nigs Wusterhausen</b><br/>
    /// Code: G1305G<br/>
    /// </summary>
    [XmlEnum("G1305G")]
    Grundbuchamt_Koenigs_Wusterhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kyritz</b><br/>
    /// Code: G1306<br/>
    /// </summary>
    [XmlEnum("G1306")]
    aufgeloest_Amtsgericht_Kyritz,

    /// <summary>
    /// <b>Amtsgericht Luckenwalde</b><br/>
    /// Code: G1307<br/>
    /// </summary>
    [XmlEnum("G1307")]
    Amtsgericht_Luckenwalde,

    /// <summary>
    /// <b>Grundbuchamt Luckenwalde</b><br/>
    /// Code: G1307G<br/>
    /// </summary>
    [XmlEnum("G1307G")]
    Grundbuchamt_Luckenwalde,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Luckenwalde, Zwst. der StA Potsdam</b><br/>
    /// Code: G1307S<br/>
    /// </summary>
    [XmlEnum("G1307S")]
    Staatsanwaltschaft_beim_Landgericht_Luckenwalde_Zwst_der_StA_Potsdam,

    /// <summary>
    /// <b>Amtsgericht Nauen</b><br/>
    /// Code: G1308<br/>
    /// </summary>
    [XmlEnum("G1308")]
    Amtsgericht_Nauen,

    /// <summary>
    /// <b>Grundbuchamt Nauen</b><br/>
    /// Code: G1308G<br/>
    /// </summary>
    [XmlEnum("G1308G")]
    Grundbuchamt_Nauen,

    /// <summary>
    /// <b>Amtsgericht Nauen, Zentrales Vollstreckungsgericht Brandenburg</b><br/>
    /// Code: G1308R<br/>
    /// </summary>
    [XmlEnum("G1308R")]
    Amtsgericht_Nauen_Zentrales_Vollstreckungsgericht_Brandenburg,

    /// <summary>
    /// <b>Amtsgericht Neuruppin</b><br/>
    /// Code: G1309<br/>
    /// </summary>
    [XmlEnum("G1309")]
    Amtsgericht_Neuruppin,

    /// <summary>
    /// <b>Grundbuchamt Neuruppin</b><br/>
    /// Code: G1309G<br/>
    /// </summary>
    [XmlEnum("G1309G")]
    Grundbuchamt_Neuruppin,

    /// <summary>
    /// <b>Amtsgericht Oranienburg</b><br/>
    /// Code: G1310<br/>
    /// </summary>
    [XmlEnum("G1310")]
    Amtsgericht_Oranienburg,

    /// <summary>
    /// <b>Grundbuchamt Oranienburg</b><br/>
    /// Code: G1310G<br/>
    /// </summary>
    [XmlEnum("G1310G")]
    Grundbuchamt_Oranienburg,

    /// <summary>
    /// <b>Amtsgericht Perleberg</b><br/>
    /// Code: G1311<br/>
    /// </summary>
    [XmlEnum("G1311")]
    Amtsgericht_Perleberg,

    /// <summary>
    /// <b>Grundbuchamt Perleberg</b><br/>
    /// Code: G1311G<br/>
    /// </summary>
    [XmlEnum("G1311G")]
    Grundbuchamt_Perleberg,

    /// <summary>
    /// <b>Amtsgericht Potsdam</b><br/>
    /// Code: G1312<br/>
    /// </summary>
    [XmlEnum("G1312")]
    Amtsgericht_Potsdam,

    /// <summary>
    /// <b>Grundbuchamt Potsdam</b><br/>
    /// Code: G1312G<br/>
    /// </summary>
    [XmlEnum("G1312G")]
    Grundbuchamt_Potsdam,

    /// <summary>
    /// <b>Amtsgericht Perleberg Zweigstelle Pritzwalk</b><br/>
    /// Code: G1314<br/>
    /// </summary>
    [XmlEnum("G1314")]
    Amtsgericht_Perleberg_Zweigstelle_Pritzwalk,

    /// <summary>
    /// <b>Amtsgericht Rathenow</b><br/>
    /// Code: G1315<br/>
    /// </summary>
    [XmlEnum("G1315")]
    Amtsgericht_Rathenow,

    /// <summary>
    /// <b>Grundbuchamt Rathenow</b><br/>
    /// Code: G1315G<br/>
    /// </summary>
    [XmlEnum("G1315G")]
    Grundbuchamt_Rathenow,

    /// <summary>
    /// <b>Amtsgericht Neuruppin Zweigstelle Wittstock</b><br/>
    /// Code: G1316<br/>
    /// </summary>
    [XmlEnum("G1316")]
    Amtsgericht_Neuruppin_Zweigstelle_Wittstock,

    /// <summary>
    /// <b>Amtsgericht Zossen</b><br/>
    /// Code: G1317<br/>
    /// </summary>
    [XmlEnum("G1317")]
    Amtsgericht_Zossen,

    /// <summary>
    /// <b>Grundbuchamt Zossen</b><br/>
    /// Code: G1317G<br/>
    /// </summary>
    [XmlEnum("G1317G")]
    Grundbuchamt_Zossen,

    /// <summary>
    /// <b>Amtsgericht Zehdenick Zweigstelle Gransee</b><br/>
    /// Code: G1318<br/>
    /// </summary>
    [XmlEnum("G1318")]
    Amtsgericht_Zehdenick_Zweigstelle_Gransee,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Landgericht Potsdam, -Rechtshilfe-</b><br/>
    /// Code: G1319S<br/>
    /// </summary>
    [XmlEnum("G1319S")]
    Staatsanwaltschaft_bei_dem_Landgericht_Potsdam_Rechtshilfe,

    /// <summary>
    /// <b>Landgericht Neuruppin</b><br/>
    /// Code: G1400<br/>
    /// </summary>
    [XmlEnum("G1400")]
    Landgericht_Neuruppin,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Neuruppin</b><br/>
    /// Code: G1400S<br/>
    /// </summary>
    [XmlEnum("G1400S")]
    Staatsanwaltschaft_beim_Landgericht_Neuruppin,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Landgericht Neuruppin, -Rechtshilfe-</b><br/>
    /// Code: G1401S<br/>
    /// </summary>
    [XmlEnum("G1401S")]
    Staatsanwaltschaft_bei_dem_Landgericht_Neuruppin_Rechtshilfe,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Landes Brandenburg</b><br/>
    /// Code: G6002<br/>
    /// </summary>
    [XmlEnum("G6002")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Landes_Brandenburg,

    /// <summary>
    /// <b>Brandenburgischer Anwaltsgerichtshof</b><br/>
    /// Code: G6008<br/>
    /// </summary>
    [XmlEnum("G6008")]
    Brandenburgischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Brandenburg an der Havel</b><br/>
    /// Code: G6017<br/>
    /// </summary>
    [XmlEnum("G6017")]
    Justizvollzugsanstalt_Brandenburg_an_der_Havel,

    /// <summary>
    /// <b>Verwaltungsgericht Potsdam</b><br/>
    /// Code: G6076<br/>
    /// </summary>
    [XmlEnum("G6076")]
    Verwaltungsgericht_Potsdam,

    /// <summary>
    /// <b>Verwaltungsgericht Cottbus</b><br/>
    /// Code: G6590<br/>
    /// </summary>
    [XmlEnum("G6590")]
    Verwaltungsgericht_Cottbus,

    /// <summary>
    /// <b>Justizvollzugsanstalt Cottbus-Dissenchen</b><br/>
    /// Code: G6630<br/>
    /// </summary>
    [XmlEnum("G6630")]
    Justizvollzugsanstalt_Cottbus_Dissenchen,

    /// <summary>
    /// <b>Finanzgericht Berlin-Brandenburg</b><br/>
    /// Code: G6657<br/>
    /// </summary>
    [XmlEnum("G6657")]
    Finanzgericht_Berlin_Brandenburg,

    /// <summary>
    /// <b>Landessozialgericht Berlin-Brandenburg</b><br/>
    /// Code: G6664<br/>
    /// </summary>
    [XmlEnum("G6664")]
    Landessozialgericht_Berlin_Brandenburg,

    /// <summary>
    /// <b>Verwaltungsgericht Frankfurt//Oder</b><br/>
    /// Code: G6669<br/>
    /// </summary>
    [XmlEnum("G6669")]
    Verwaltungsgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>Justizvollzugsanstalt Luckau-Duben</b><br/>
    /// Code: G6671<br/>
    /// </summary>
    [XmlEnum("G6671")]
    Justizvollzugsanstalt_Luckau_Duben,

    /// <summary>
    /// <b>Sozialgericht Cottbus</b><br/>
    /// Code: G6672<br/>
    /// </summary>
    [XmlEnum("G6672")]
    Sozialgericht_Cottbus,

    /// <summary>
    /// <b>Sozialgericht Frankfurt (Oder)</b><br/>
    /// Code: G6673<br/>
    /// </summary>
    [XmlEnum("G6673")]
    Sozialgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>Sozialgericht Neuruppin</b><br/>
    /// Code: G6674<br/>
    /// </summary>
    [XmlEnum("G6674")]
    Sozialgericht_Neuruppin,

    /// <summary>
    /// <b>Sozialgericht Potsdam</b><br/>
    /// Code: G6675<br/>
    /// </summary>
    [XmlEnum("G6675")]
    Sozialgericht_Potsdam,

    /// <summary>
    /// <b>Arbeitsgericht Brandenburg an der Havel</b><br/>
    /// Code: G6676<br/>
    /// </summary>
    [XmlEnum("G6676")]
    Arbeitsgericht_Brandenburg_an_der_Havel,

    /// <summary>
    /// <b>Arbeitsgericht Cottbus</b><br/>
    /// Code: G6677<br/>
    /// </summary>
    [XmlEnum("G6677")]
    Arbeitsgericht_Cottbus,

    /// <summary>
    /// <b>Arbeitsgericht Eberswalde</b><br/>
    /// Code: G6678<br/>
    /// </summary>
    [XmlEnum("G6678")]
    Arbeitsgericht_Eberswalde,

    /// <summary>
    /// <b>Arbeitsgericht Frankfurt (Oder)</b><br/>
    /// Code: G6679<br/>
    /// </summary>
    [XmlEnum("G6679")]
    Arbeitsgericht_Frankfurt_Oder,

    /// <summary>
    /// <b>Arbeitsgericht Neuruppin</b><br/>
    /// Code: G6680<br/>
    /// </summary>
    [XmlEnum("G6680")]
    Arbeitsgericht_Neuruppin,

    /// <summary>
    /// <b>Arbeitsgericht Potsdam</b><br/>
    /// Code: G6681<br/>
    /// </summary>
    [XmlEnum("G6681")]
    Arbeitsgericht_Potsdam,

    /// <summary>
    /// <b>Arbeitsgericht Senftenberg</b><br/>
    /// Code: G6682<br/>
    /// </summary>
    [XmlEnum("G6682")]
    Arbeitsgericht_Senftenberg,

    /// <summary>
    /// <b>Verfassungsgericht Brandenburg</b><br/>
    /// Code: G6696<br/>
    /// </summary>
    [XmlEnum("G6696")]
    Verfassungsgericht_Brandenburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Heidering</b><br/>
    /// Code: G6726<br/>
    /// </summary>
    [XmlEnum("G6726")]
    Justizvollzugsanstalt_Heidering,

    /// <summary>
    /// <b>Hanseatisches Oberlandesgericht in Bremen</b><br/>
    /// Code: H1000<br/>
    /// </summary>
    [XmlEnum("H1000")]
    Hanseatisches_Oberlandesgericht_in_Bremen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Bremen</b><br/>
    /// Code: H1000S<br/>
    /// </summary>
    [XmlEnum("H1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Bremen,

    /// <summary>
    /// <b>Landgericht Bremen</b><br/>
    /// Code: H1100<br/>
    /// </summary>
    [XmlEnum("H1100")]
    Landgericht_Bremen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bremen</b><br/>
    /// Code: H1100S<br/>
    /// </summary>
    [XmlEnum("H1100S")]
    Staatsanwaltschaft_beim_Landgericht_Bremen,

    /// <summary>
    /// <b>Amtsgericht Bremen</b><br/>
    /// Code: H1101<br/>
    /// </summary>
    [XmlEnum("H1101")]
    Amtsgericht_Bremen,

    /// <summary>
    /// <b>Grundbuchamt Bremen</b><br/>
    /// Code: H1101G<br/>
    /// </summary>
    [XmlEnum("H1101G")]
    Grundbuchamt_Bremen,

    /// <summary>
    /// <b>Amtsgericht Bremerhaven</b><br/>
    /// Code: H1102<br/>
    /// </summary>
    [XmlEnum("H1102")]
    Amtsgericht_Bremerhaven,

    /// <summary>
    /// <b>Grundbuchamt Bremerhaven</b><br/>
    /// Code: H1102G<br/>
    /// </summary>
    [XmlEnum("H1102G")]
    Grundbuchamt_Bremerhaven,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bremerhaven, Zwst. der StA Bremen</b><br/>
    /// Code: H1102S<br/>
    /// </summary>
    [XmlEnum("H1102S")]
    Staatsanwaltschaft_beim_Landgericht_Bremerhaven_Zwst_der_StA_Bremen,

    /// <summary>
    /// <b>Amtsgericht Bremerhaven, zentrales Vollstreckungsgericht Bremen</b><br/>
    /// Code: H1102V<br/>
    /// </summary>
    [XmlEnum("H1102V")]
    Amtsgericht_Bremerhaven_zentrales_Vollstreckungsgericht_Bremen,

    /// <summary>
    /// <b>Amtsgericht Bremen-Blumenthal</b><br/>
    /// Code: H1103<br/>
    /// </summary>
    [XmlEnum("H1103")]
    Amtsgericht_Bremen_Blumenthal,

    /// <summary>
    /// <b>Grundbuchamt Bremen-Blumenthal</b><br/>
    /// Code: H1103G<br/>
    /// </summary>
    [XmlEnum("H1103G")]
    Grundbuchamt_Bremen_Blumenthal,

    /// <summary>
    /// <b>Anwaltsgerichtshof der Freien und Hansestadt Bremen</b><br/>
    /// Code: H6026<br/>
    /// </summary>
    [XmlEnum("H6026")]
    Anwaltsgerichtshof_der_Freien_und_Hansestadt_Bremen,

    /// <summary>
    /// <b>Sozialgericht Bremen</b><br/>
    /// Code: H6032<br/>
    /// </summary>
    [XmlEnum("H6032")]
    Sozialgericht_Bremen,

    /// <summary>
    /// <b>Landessozialgericht Bremen</b><br/>
    /// Code: H6033<br/>
    /// </summary>
    [XmlEnum("H6033")]
    Landessozialgericht_Bremen,

    /// <summary>
    /// <b>Arbeitsgericht Bremen</b><br/>
    /// Code: H6034<br/>
    /// </summary>
    [XmlEnum("H6034")]
    Arbeitsgericht_Bremen,

    /// <summary>
    /// <b>Landesarbeitsgericht Bremen</b><br/>
    /// Code: H6035<br/>
    /// </summary>
    [XmlEnum("H6035")]
    Landesarbeitsgericht_Bremen,

    /// <summary>
    /// <b>Oberverwaltungsgericht der Freien Hansestadt Bremen</b><br/>
    /// Code: H6036<br/>
    /// </summary>
    [XmlEnum("H6036")]
    Oberverwaltungsgericht_der_Freien_Hansestadt_Bremen,

    /// <summary>
    /// <b>Verwaltungsgericht der Freien Hansestadt Bremen</b><br/>
    /// Code: H6037<br/>
    /// </summary>
    [XmlEnum("H6037")]
    Verwaltungsgericht_der_Freien_Hansestadt_Bremen,

    /// <summary>
    /// <b>Staatsgerichtshof der Freien Hansestadt Bremen</b><br/>
    /// Code: H6038<br/>
    /// </summary>
    [XmlEnum("H6038")]
    Staatsgerichtshof_der_Freien_Hansestadt_Bremen,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Bremerhaven</b><br/>
    /// Code: H6039<br/>
    /// </summary>
    [XmlEnum("H6039")]
    aufgeloest_Arbeitsgericht_Bremerhaven,

    /// <summary>
    /// <b>Finanzgericht Bremen</b><br/>
    /// Code: H6040<br/>
    /// </summary>
    [XmlEnum("H6040")]
    Finanzgericht_Bremen,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Hanseatischen Rechtsanwaltskammer Bremen</b><br/>
    /// Code: H6184<br/>
    /// </summary>
    [XmlEnum("H6184")]
    Anwaltsgericht_fuer_den_Bezirk_der_Hanseatischen_Rechtsanwaltskammer_Bremen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bremen</b><br/>
    /// Code: H6220<br/>
    /// </summary>
    [XmlEnum("H6220")]
    Justizvollzugsanstalt_Bremen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bremen, Offener Vollzug/Frauenvollzug</b><br/>
    /// Code: H6233<br/>
    /// </summary>
    [XmlEnum("H6233")]
    Justizvollzugsanstalt_Bremen_Offener_Vollzug_Frauenvollzug,

    /// <summary>
    /// <b>Soziale Dienste der Justiz im Lande Bremen</b><br/>
    /// Code: H6234<br/>
    /// </summary>
    [XmlEnum("H6234")]
    Soziale_Dienste_der_Justiz_im_Lande_Bremen,

    /// <summary>
    /// <b>Hanseatisches Oberlandesgericht Hamburg</b><br/>
    /// Code: K1000<br/>
    /// </summary>
    [XmlEnum("K1000")]
    Hanseatisches_Oberlandesgericht_Hamburg,

    /// <summary>
    /// <b>Generalstaatsanwaltschaft Hamburg</b><br/>
    /// Code: K1000S<br/>
    /// </summary>
    [XmlEnum("K1000S")]
    Generalstaatsanwaltschaft_Hamburg,

    /// <summary>
    /// <b>Landgericht Hamburg</b><br/>
    /// Code: K1100<br/>
    /// </summary>
    [XmlEnum("K1100")]
    Landgericht_Hamburg,

    /// <summary>
    /// <b>Staatsanwaltschaft Hamburg</b><br/>
    /// Code: K1100S<br/>
    /// </summary>
    [XmlEnum("K1100S")]
    Staatsanwaltschaft_Hamburg,

    /// <summary>
    /// <b>Amtsgericht Hamburg</b><br/>
    /// Code: K1101<br/>
    /// </summary>
    [XmlEnum("K1101")]
    Amtsgericht_Hamburg,

    /// <summary>
    /// <b>Grundbuchamt Hamburg</b><br/>
    /// Code: K1101G<br/>
    /// </summary>
    [XmlEnum("K1101G")]
    Grundbuchamt_Hamburg,

    /// <summary>
    /// <b>Amtsgericht Hamburg, Zentralisierter Bereich Insolvenzgericht</b><br/>
    /// Code: K1101I<br/>
    /// </summary>
    [XmlEnum("K1101I")]
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Hamburg, Zentralisierter Bereich Mahnverfahren</b><br/>
    /// Code: K1101M<br/>
    /// </summary>
    [XmlEnum("K1101M")]
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Mahnverfahren,

    /// <summary>
    /// <b>Amtsgericht Hamburg, Zentralisierter Bereich Handelsregister</b><br/>
    /// Code: K1101R<br/>
    /// </summary>
    [XmlEnum("K1101R")]
    Amtsgericht_Hamburg_Zentralisierter_Bereich_Handelsregister,

    /// <summary>
    /// <b>Amtsgericht Hamburg, Zentrales Vollstreckungsgericht Hamburg</b><br/>
    /// Code: K1101V<br/>
    /// </summary>
    [XmlEnum("K1101V")]
    Amtsgericht_Hamburg_Zentrales_Vollstreckungsgericht_Hamburg,

    /// <summary>
    /// <b>Amtsgericht Hamburg, Schiffsregister</b><br/>
    /// Code: K1101Z<br/>
    /// </summary>
    [XmlEnum("K1101Z")]
    Amtsgericht_Hamburg_Schiffsregister,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Altona</b><br/>
    /// Code: K1102<br/>
    /// </summary>
    [XmlEnum("K1102")]
    Amtsgericht_Hamburg_Altona,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Altona</b><br/>
    /// Code: K1102G<br/>
    /// </summary>
    [XmlEnum("K1102G")]
    Grundbuchamt_Hamburg_Altona,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Bergedorf</b><br/>
    /// Code: K1103<br/>
    /// </summary>
    [XmlEnum("K1103")]
    Amtsgericht_Hamburg_Bergedorf,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Bergedorf</b><br/>
    /// Code: K1103G<br/>
    /// </summary>
    [XmlEnum("K1103G")]
    Grundbuchamt_Hamburg_Bergedorf,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Blankenese</b><br/>
    /// Code: K1104<br/>
    /// </summary>
    [XmlEnum("K1104")]
    Amtsgericht_Hamburg_Blankenese,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Blankenese</b><br/>
    /// Code: K1104G<br/>
    /// </summary>
    [XmlEnum("K1104G")]
    Grundbuchamt_Hamburg_Blankenese,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Harburg</b><br/>
    /// Code: K1105<br/>
    /// </summary>
    [XmlEnum("K1105")]
    Amtsgericht_Hamburg_Harburg,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Harburg</b><br/>
    /// Code: K1105G<br/>
    /// </summary>
    [XmlEnum("K1105G")]
    Grundbuchamt_Hamburg_Harburg,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Wandsbek</b><br/>
    /// Code: K1106<br/>
    /// </summary>
    [XmlEnum("K1106")]
    Amtsgericht_Hamburg_Wandsbek,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Wandsbek</b><br/>
    /// Code: K1106G<br/>
    /// </summary>
    [XmlEnum("K1106G")]
    Grundbuchamt_Hamburg_Wandsbek,

    /// <summary>
    /// <b>Amtsgericht Hamburg-Barmbek</b><br/>
    /// Code: K1107<br/>
    /// </summary>
    [XmlEnum("K1107")]
    Amtsgericht_Hamburg_Barmbek,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-Barmbek</b><br/>
    /// Code: K1107G<br/>
    /// </summary>
    [XmlEnum("K1107G")]
    Grundbuchamt_Hamburg_Barmbek,

    /// <summary>
    /// <b>Amtsgericht Hamburg-St. Georg</b><br/>
    /// Code: K1108<br/>
    /// </summary>
    [XmlEnum("K1108")]
    Amtsgericht_Hamburg_St_Georg,

    /// <summary>
    /// <b>Grundbuchamt Hamburg-St. Georg</b><br/>
    /// Code: K1108G<br/>
    /// </summary>
    [XmlEnum("K1108G")]
    Grundbuchamt_Hamburg_St_Georg,

    /// <summary>
    /// <b>aufgel&#246;st-Verwaltungsgericht Hamburg</b><br/>
    /// Code: K6046<br/>
    /// </summary>
    [XmlEnum("K6046")]
    aufgeloest_Verwaltungsgericht_Hamburg,

    /// <summary>
    /// <b>Hamburgisches Oberverwaltungsgericht</b><br/>
    /// Code: K6051<br/>
    /// </summary>
    [XmlEnum("K6051")]
    Hamburgisches_Oberverwaltungsgericht,

    /// <summary>
    /// <b>Verwaltungsgericht Hamburg</b><br/>
    /// Code: K6052<br/>
    /// </summary>
    [XmlEnum("K6052")]
    Verwaltungsgericht_Hamburg,

    /// <summary>
    /// <b>Hamburgisches Verfassungsgericht</b><br/>
    /// Code: K6053<br/>
    /// </summary>
    [XmlEnum("K6053")]
    Hamburgisches_Verfassungsgericht,

    /// <summary>
    /// <b>Landesarbeitsgericht Hamburg</b><br/>
    /// Code: K6054<br/>
    /// </summary>
    [XmlEnum("K6054")]
    Landesarbeitsgericht_Hamburg,

    /// <summary>
    /// <b>Arbeitsgericht Hamburg</b><br/>
    /// Code: K6055<br/>
    /// </summary>
    [XmlEnum("K6055")]
    Arbeitsgericht_Hamburg,

    /// <summary>
    /// <b>Landessozialgericht Hamburg</b><br/>
    /// Code: K6078<br/>
    /// </summary>
    [XmlEnum("K6078")]
    Landessozialgericht_Hamburg,

    /// <summary>
    /// <b>Finanzgericht Hamburg</b><br/>
    /// Code: K6079<br/>
    /// </summary>
    [XmlEnum("K6079")]
    Finanzgericht_Hamburg,

    /// <summary>
    /// <b>Sozialgericht Hamburg</b><br/>
    /// Code: K6083<br/>
    /// </summary>
    [XmlEnum("K6083")]
    Sozialgericht_Hamburg,

    /// <summary>
    /// <b>Anwaltsgericht im Bezirk der Hanseatischen Rechtsanwaltskammer Hamburg</b><br/>
    /// Code: K6165<br/>
    /// </summary>
    [XmlEnum("K6165")]
    Anwaltsgericht_im_Bezirk_der_Hanseatischen_Rechtsanwaltskammer_Hamburg,

    /// <summary>
    /// <b>Anwaltsgerichtshof in der Freien und Hansestadt Hamburg</b><br/>
    /// Code: K6209<br/>
    /// </summary>
    [XmlEnum("K6209")]
    Anwaltsgerichtshof_in_der_Freien_und_Hansestadt_Hamburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Billwerder</b><br/>
    /// Code: K6274<br/>
    /// </summary>
    [XmlEnum("K6274")]
    Justizvollzugsanstalt_Billwerder,

    /// <summary>
    /// <b>Justizvollzugsanstalt Fuhlsb&#252;ttel</b><br/>
    /// Code: K6411<br/>
    /// </summary>
    [XmlEnum("K6411")]
    Justizvollzugsanstalt_Fuhlsbuettel,

    /// <summary>
    /// <b>Oberlandesgericht Frankfurt</b><br/>
    /// Code: M1000<br/>
    /// </summary>
    [XmlEnum("M1000")]
    Oberlandesgericht_Frankfurt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Frankfurt am Main</b><br/>
    /// Code: M1000S<br/>
    /// </summary>
    [XmlEnum("M1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Frankfurt_am_Main,

    /// <summary>
    /// <b>Generalstaatsanwaltschaft Frankfurt am Main, -Rechtshilfe-</b><br/>
    /// Code: M1001S<br/>
    /// </summary>
    [XmlEnum("M1001S")]
    Generalstaatsanwaltschaft_Frankfurt_am_Main_Rechtshilfe,

    /// <summary>
    /// <b>Landgericht Darmstadt</b><br/>
    /// Code: M1100<br/>
    /// </summary>
    [XmlEnum("M1100")]
    Landgericht_Darmstadt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Darmstadt</b><br/>
    /// Code: M1100S<br/>
    /// </summary>
    [XmlEnum("M1100S")]
    Staatsanwaltschaft_beim_Landgericht_Darmstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Beerfelden</b><br/>
    /// Code: M1101<br/>
    /// </summary>
    [XmlEnum("M1101")]
    aufgeloest_Amtsgericht_Beerfelden,

    /// <summary>
    /// <b>Amtsgericht Bensheim</b><br/>
    /// Code: M1102<br/>
    /// </summary>
    [XmlEnum("M1102")]
    Amtsgericht_Bensheim,

    /// <summary>
    /// <b>Grundbuchamt Bensheim</b><br/>
    /// Code: M1102G<br/>
    /// </summary>
    [XmlEnum("M1102G")]
    Grundbuchamt_Bensheim,

    /// <summary>
    /// <b>Amtsgericht Darmstadt</b><br/>
    /// Code: M1103<br/>
    /// </summary>
    [XmlEnum("M1103")]
    Amtsgericht_Darmstadt,

    /// <summary>
    /// <b>Grundbuchamt Darmstadt</b><br/>
    /// Code: M1103G<br/>
    /// </summary>
    [XmlEnum("M1103G")]
    Grundbuchamt_Darmstadt,

    /// <summary>
    /// <b>Amtsgericht Dieburg</b><br/>
    /// Code: M1104<br/>
    /// </summary>
    [XmlEnum("M1104")]
    Amtsgericht_Dieburg,

    /// <summary>
    /// <b>Grundbuchamt Dieburg</b><br/>
    /// Code: M1104G<br/>
    /// </summary>
    [XmlEnum("M1104G")]
    Grundbuchamt_Dieburg,

    /// <summary>
    /// <b>Amtsgericht F&#252;rth (Hessen)</b><br/>
    /// Code: M1105<br/>
    /// </summary>
    [XmlEnum("M1105")]
    Amtsgericht_Fuerth_Hessen,

    /// <summary>
    /// <b>Grundbuchamt F&#252;rth (Hessen)</b><br/>
    /// Code: M1105G<br/>
    /// </summary>
    [XmlEnum("M1105G")]
    Grundbuchamt_Fuerth_Hessen,

    /// <summary>
    /// <b>Amtsgericht Gro&#223;-Gerau</b><br/>
    /// Code: M1106<br/>
    /// </summary>
    [XmlEnum("M1106")]
    Amtsgericht_Gross_Gerau,

    /// <summary>
    /// <b>Grundbuchamt Gro&#223;-Gerau</b><br/>
    /// Code: M1106G<br/>
    /// </summary>
    [XmlEnum("M1106G")]
    Grundbuchamt_Gross_Gerau,

    /// <summary>
    /// <b>Amtsgericht R&#252;sselsheim</b><br/>
    /// Code: M1107<br/>
    /// </summary>
    [XmlEnum("M1107")]
    Amtsgericht_Ruesselsheim,

    /// <summary>
    /// <b>Grundbuchamt R&#252;sselsheim</b><br/>
    /// Code: M1107G<br/>
    /// </summary>
    [XmlEnum("M1107G")]
    Grundbuchamt_Ruesselsheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gro&#223;-Umstadt</b><br/>
    /// Code: M1108<br/>
    /// </summary>
    [XmlEnum("M1108")]
    aufgeloest_Amtsgericht_Gross_Umstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht F&#252;rth, Zwst. Hirschhorn (Neckar)</b><br/>
    /// Code: M1109<br/>
    /// </summary>
    [XmlEnum("M1109")]
    aufgeloest_Amtsgericht_Fuerth_Zwst_Hirschhorn_Neckar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Michelstadt, Zwst. H&#246;chst i. Odw.</b><br/>
    /// Code: M1110<br/>
    /// </summary>
    [XmlEnum("M1110")]
    aufgeloest_Amtsgericht_Michelstadt_Zwst_Hoechst_i_Odw,

    /// <summary>
    /// <b>Amtsgericht Lampertheim</b><br/>
    /// Code: M1111<br/>
    /// </summary>
    [XmlEnum("M1111")]
    Amtsgericht_Lampertheim,

    /// <summary>
    /// <b>Grundbuchamt Lampertheim</b><br/>
    /// Code: M1111G<br/>
    /// </summary>
    [XmlEnum("M1111G")]
    Grundbuchamt_Lampertheim,

    /// <summary>
    /// <b>Amtsgericht Langen</b><br/>
    /// Code: M1112<br/>
    /// </summary>
    [XmlEnum("M1112")]
    Amtsgericht_Langen,

    /// <summary>
    /// <b>Grundbuchamt Langen</b><br/>
    /// Code: M1112G<br/>
    /// </summary>
    [XmlEnum("M1112G")]
    Grundbuchamt_Langen,

    /// <summary>
    /// <b>Amtsgericht Michelstadt</b><br/>
    /// Code: M1113<br/>
    /// </summary>
    [XmlEnum("M1113")]
    Amtsgericht_Michelstadt,

    /// <summary>
    /// <b>Grundbuchamt Michelstadt</b><br/>
    /// Code: M1113G<br/>
    /// </summary>
    [XmlEnum("M1113G")]
    Grundbuchamt_Michelstadt,

    /// <summary>
    /// <b>Amtsgericht Offenbach am Main</b><br/>
    /// Code: M1114<br/>
    /// </summary>
    [XmlEnum("M1114")]
    Amtsgericht_Offenbach_am_Main,

    /// <summary>
    /// <b>Grundbuchamt Offenbach am Main</b><br/>
    /// Code: M1114G<br/>
    /// </summary>
    [XmlEnum("M1114G")]
    Grundbuchamt_Offenbach_am_Main,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Offenbach am Main, Zwst. der StA Darmstadt</b><br/>
    /// Code: M1114S<br/>
    /// </summary>
    [XmlEnum("M1114S")]
    Staatsanwaltschaft_beim_Landgericht_Offenbach_am_Main_Zwst_der_StA_Darmstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Reichelsheim (Odenwald)</b><br/>
    /// Code: M1115<br/>
    /// </summary>
    [XmlEnum("M1115")]
    aufgeloest_Amtsgericht_Reichelsheim_Odenwald,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Reinheim</b><br/>
    /// Code: M1116<br/>
    /// </summary>
    [XmlEnum("M1116")]
    aufgeloest_Amtsgericht_Reinheim,

    /// <summary>
    /// <b>Amtsgericht Seligenstadt</b><br/>
    /// Code: M1117<br/>
    /// </summary>
    [XmlEnum("M1117")]
    Amtsgericht_Seligenstadt,

    /// <summary>
    /// <b>Grundbuchamt Seligenstadt</b><br/>
    /// Code: M1117G<br/>
    /// </summary>
    [XmlEnum("M1117G")]
    Grundbuchamt_Seligenstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wald-Michelbach</b><br/>
    /// Code: M1118<br/>
    /// </summary>
    [XmlEnum("M1118")]
    aufgeloest_Amtsgericht_Wald_Michelbach,

    /// <summary>
    /// <b>Landgericht Frankfurt</b><br/>
    /// Code: M1200<br/>
    /// </summary>
    [XmlEnum("M1200")]
    Landgericht_Frankfurt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Frankfurt am Main</b><br/>
    /// Code: M1200S<br/>
    /// </summary>
    [XmlEnum("M1200S")]
    Staatsanwaltschaft_beim_Landgericht_Frankfurt_am_Main,

    /// <summary>
    /// <b>Amtsgericht Frankfurt</b><br/>
    /// Code: M1201<br/>
    /// </summary>
    [XmlEnum("M1201")]
    Amtsgericht_Frankfurt,

    /// <summary>
    /// <b>Grundbuchamt Frankfurt am Main</b><br/>
    /// Code: M1201G<br/>
    /// </summary>
    [XmlEnum("M1201G")]
    Grundbuchamt_Frankfurt_am_Main,

    /// <summary>
    /// <b>Amtsanwaltschaft Frankfurt am Main</b><br/>
    /// Code: M1201S<br/>
    /// </summary>
    [XmlEnum("M1201S")]
    Amtsanwaltschaft_Frankfurt_am_Main,

    /// <summary>
    /// <b>Amtsgericht Bad Homburg</b><br/>
    /// Code: M1202<br/>
    /// </summary>
    [XmlEnum("M1202")]
    Amtsgericht_Bad_Homburg,

    /// <summary>
    /// <b>Grundbuchamt Bad Homburg</b><br/>
    /// Code: M1202G<br/>
    /// </summary>
    [XmlEnum("M1202G")]
    Grundbuchamt_Bad_Homburg,

    /// <summary>
    /// <b>Amtsgericht K&#246;nigstein</b><br/>
    /// Code: M1203<br/>
    /// </summary>
    [XmlEnum("M1203")]
    Amtsgericht_Koenigstein,

    /// <summary>
    /// <b>Grundbuchamt K&#246;nigstein</b><br/>
    /// Code: M1203G<br/>
    /// </summary>
    [XmlEnum("M1203G")]
    Grundbuchamt_Koenigstein,

    /// <summary>
    /// <b>Amtsgericht Usingen</b><br/>
    /// Code: M1204<br/>
    /// </summary>
    [XmlEnum("M1204")]
    Amtsgericht_Usingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Vilbel</b><br/>
    /// Code: M1205<br/>
    /// </summary>
    [XmlEnum("M1205")]
    aufgeloest_Amtsgericht_Bad_Vilbel,

    /// <summary>
    /// <b>Amtsgericht Frankfurt am Main Au&#223;enstelle H&#246;chst</b><br/>
    /// Code: M1206<br/>
    /// </summary>
    [XmlEnum("M1206")]
    Amtsgericht_Frankfurt_am_Main_Aussenstelle_Hoechst,

    /// <summary>
    /// <b>Grundbuchamt Frankfurt am Main Au&#223;enstelle H&#246;chst</b><br/>
    /// Code: M1206G<br/>
    /// </summary>
    [XmlEnum("M1206G")]
    Grundbuchamt_Frankfurt_am_Main_Aussenstelle_Hoechst,

    /// <summary>
    /// <b>Landgericht Fulda</b><br/>
    /// Code: M1300<br/>
    /// </summary>
    [XmlEnum("M1300")]
    Landgericht_Fulda,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Fulda</b><br/>
    /// Code: M1300S<br/>
    /// </summary>
    [XmlEnum("M1300S")]
    Staatsanwaltschaft_beim_Landgericht_Fulda,

    /// <summary>
    /// <b>Amtsgericht Fulda</b><br/>
    /// Code: M1301<br/>
    /// </summary>
    [XmlEnum("M1301")]
    Amtsgericht_Fulda,

    /// <summary>
    /// <b>Grundbuchamt Fulda</b><br/>
    /// Code: M1301G<br/>
    /// </summary>
    [XmlEnum("M1301G")]
    Grundbuchamt_Fulda,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Gersfeld</b><br/>
    /// Code: M1302<br/>
    /// </summary>
    [XmlEnum("M1302")]
    aufgeloest_Amtsgericht_Fulda_Zwst_Gersfeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Hilders</b><br/>
    /// Code: M1303<br/>
    /// </summary>
    [XmlEnum("M1303")]
    aufgeloest_Amtsgericht_Fulda_Zwst_Hilders,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Fulda, Zwst. Neuhof</b><br/>
    /// Code: M1304<br/>
    /// </summary>
    [XmlEnum("M1304")]
    aufgeloest_Amtsgericht_Fulda_Zwst_Neuhof,

    /// <summary>
    /// <b>Amtsgericht Bad Hersfeld</b><br/>
    /// Code: M1305<br/>
    /// </summary>
    [XmlEnum("M1305")]
    Amtsgericht_Bad_Hersfeld,

    /// <summary>
    /// <b>Grundbuchamt Bad Hersfeld</b><br/>
    /// Code: M1305G<br/>
    /// </summary>
    [XmlEnum("M1305G")]
    Grundbuchamt_Bad_Hersfeld,

    /// <summary>
    /// <b>Amtsgericht H&#252;nfeld</b><br/>
    /// Code: M1307<br/>
    /// </summary>
    [XmlEnum("M1307")]
    Amtsgericht_Huenfeld,

    /// <summary>
    /// <b>Grundbuchamt H&#252;nfeld</b><br/>
    /// Code: M1307G<br/>
    /// </summary>
    [XmlEnum("M1307G")]
    Grundbuchamt_Huenfeld,

    /// <summary>
    /// <b>Amtsgericht H&#252;nfeld, Zentrales Vollstreckungsgericht Hessen</b><br/>
    /// Code: M1307R<br/>
    /// </summary>
    [XmlEnum("M1307R")]
    Amtsgericht_Huenfeld_Zentrales_Vollstreckungsgericht_Hessen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lauterbach</b><br/>
    /// Code: M1308<br/>
    /// </summary>
    [XmlEnum("M1308")]
    aufgeloest_Amtsgericht_Lauterbach,

    /// <summary>
    /// <b>Amtsgericht Rotenburg a.d. Fulda</b><br/>
    /// Code: M1310<br/>
    /// </summary>
    [XmlEnum("M1310")]
    Amtsgericht_Rotenburg_a_d_Fulda,

    /// <summary>
    /// <b>Landgericht Gie&#223;en</b><br/>
    /// Code: M1400<br/>
    /// </summary>
    [XmlEnum("M1400")]
    Landgericht_Giessen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Gie&#223;en</b><br/>
    /// Code: M1400S<br/>
    /// </summary>
    [XmlEnum("M1400S")]
    Staatsanwaltschaft_beim_Landgericht_Giessen,

    /// <summary>
    /// <b>Amtsgericht Alsfeld</b><br/>
    /// Code: M1401<br/>
    /// </summary>
    [XmlEnum("M1401")]
    Amtsgericht_Alsfeld,

    /// <summary>
    /// <b>Grundbuchamt Alsfeld</b><br/>
    /// Code: M1401G<br/>
    /// </summary>
    [XmlEnum("M1401G")]
    Grundbuchamt_Alsfeld,

    /// <summary>
    /// <b>Amtsgericht B&#252;dingen</b><br/>
    /// Code: M1402<br/>
    /// </summary>
    [XmlEnum("M1402")]
    Amtsgericht_Buedingen,

    /// <summary>
    /// <b>Grundbuchamt B&#252;dingen</b><br/>
    /// Code: M1402G<br/>
    /// </summary>
    [XmlEnum("M1402G")]
    Grundbuchamt_Buedingen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Butzbach</b><br/>
    /// Code: M1404<br/>
    /// </summary>
    [XmlEnum("M1404")]
    aufgeloest_Amtsgericht_Butzbach,

    /// <summary>
    /// <b>Amtsgericht Friedberg</b><br/>
    /// Code: M1405<br/>
    /// </summary>
    [XmlEnum("M1405")]
    Amtsgericht_Friedberg,

    /// <summary>
    /// <b>Grundbuchamt Friedberg</b><br/>
    /// Code: M1405G<br/>
    /// </summary>
    [XmlEnum("M1405G")]
    Grundbuchamt_Friedberg,

    /// <summary>
    /// <b>Amtsgericht Gie&#223;en</b><br/>
    /// Code: M1406<br/>
    /// </summary>
    [XmlEnum("M1406")]
    Amtsgericht_Giessen,

    /// <summary>
    /// <b>Grundbuchamt Gie&#223;en</b><br/>
    /// Code: M1406G<br/>
    /// </summary>
    [XmlEnum("M1406G")]
    Grundbuchamt_Giessen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gr&#252;nberg</b><br/>
    /// Code: M1407<br/>
    /// </summary>
    [XmlEnum("M1407")]
    aufgeloest_Amtsgericht_Gruenberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Homberg (Ohm)</b><br/>
    /// Code: M1408<br/>
    /// </summary>
    [XmlEnum("M1408")]
    aufgeloest_Amtsgericht_Homberg_Ohm,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Laubach</b><br/>
    /// Code: M1409<br/>
    /// </summary>
    [XmlEnum("M1409")]
    aufgeloest_Amtsgericht_Laubach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Nauheim</b><br/>
    /// Code: M1410<br/>
    /// </summary>
    [XmlEnum("M1410")]
    aufgeloest_Amtsgericht_Bad_Nauheim,

    /// <summary>
    /// <b>Amtsgericht Nidda</b><br/>
    /// Code: M1411<br/>
    /// </summary>
    [XmlEnum("M1411")]
    Amtsgericht_Nidda,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ortenberg</b><br/>
    /// Code: M1412<br/>
    /// </summary>
    [XmlEnum("M1412")]
    aufgeloest_Amtsgericht_Ortenberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schotten</b><br/>
    /// Code: M1413<br/>
    /// </summary>
    [XmlEnum("M1413")]
    aufgeloest_Amtsgericht_Schotten,

    /// <summary>
    /// <b>Amtsgericht Alsfeld Zweigstelle Lauterbach</b><br/>
    /// Code: M1420<br/>
    /// </summary>
    [XmlEnum("M1420")]
    Amtsgericht_Alsfeld_Zweigstelle_Lauterbach,

    /// <summary>
    /// <b>Landgericht Hanau</b><br/>
    /// Code: M1500<br/>
    /// </summary>
    [XmlEnum("M1500")]
    Landgericht_Hanau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hanau</b><br/>
    /// Code: M1500S<br/>
    /// </summary>
    [XmlEnum("M1500S")]
    Staatsanwaltschaft_beim_Landgericht_Hanau,

    /// <summary>
    /// <b>Amtsgericht Gelnhausen</b><br/>
    /// Code: M1501<br/>
    /// </summary>
    [XmlEnum("M1501")]
    Amtsgericht_Gelnhausen,

    /// <summary>
    /// <b>Grundbuchamt Gelnhausen</b><br/>
    /// Code: M1501G<br/>
    /// </summary>
    [XmlEnum("M1501G")]
    Grundbuchamt_Gelnhausen,

    /// <summary>
    /// <b>Amtsgericht Hanau</b><br/>
    /// Code: M1502<br/>
    /// </summary>
    [XmlEnum("M1502")]
    Amtsgericht_Hanau,

    /// <summary>
    /// <b>Grundbuchamt Hanau</b><br/>
    /// Code: M1502G<br/>
    /// </summary>
    [XmlEnum("M1502G")]
    Grundbuchamt_Hanau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Langenselbold</b><br/>
    /// Code: M1504<br/>
    /// </summary>
    [XmlEnum("M1504")]
    aufgeloest_Amtsgericht_Langenselbold,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Orb</b><br/>
    /// Code: M1505<br/>
    /// </summary>
    [XmlEnum("M1505")]
    aufgeloest_Amtsgericht_Bad_Orb,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schl&#252;chtern, Zwst. Bad Soden-Salm&#252;nster</b><br/>
    /// Code: M1506<br/>
    /// </summary>
    [XmlEnum("M1506")]
    aufgeloest_Amtsgericht_Schluechtern_Zwst_Bad_Soden_Salmuenster,

    /// <summary>
    /// <b>Amtsgericht Schl&#252;chtern</b><br/>
    /// Code: M1507<br/>
    /// </summary>
    [XmlEnum("M1507")]
    Amtsgericht_Schluechtern,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schl&#252;chtern, Zwst. Steinau</b><br/>
    /// Code: M1508<br/>
    /// </summary>
    [XmlEnum("M1508")]
    aufgeloest_Amtsgericht_Schluechtern_Zwst_Steinau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gelnhausen, Zwst. W&#228;chtersbach</b><br/>
    /// Code: M1509<br/>
    /// </summary>
    [XmlEnum("M1509")]
    aufgeloest_Amtsgericht_Gelnhausen_Zwst_Waechtersbach,

    /// <summary>
    /// <b>Landgericht Kassel</b><br/>
    /// Code: M1600<br/>
    /// </summary>
    [XmlEnum("M1600")]
    Landgericht_Kassel,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Kassel</b><br/>
    /// Code: M1600S<br/>
    /// </summary>
    [XmlEnum("M1600S")]
    Staatsanwaltschaft_beim_Landgericht_Kassel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Arolsen</b><br/>
    /// Code: M1601<br/>
    /// </summary>
    [XmlEnum("M1601")]
    aufgeloest_Amtsgericht_Arolsen,

    /// <summary>
    /// <b>Amtsgericht Eschwege</b><br/>
    /// Code: M1602<br/>
    /// </summary>
    [XmlEnum("M1602")]
    Amtsgericht_Eschwege,

    /// <summary>
    /// <b>Grundbuchamt Eschwege</b><br/>
    /// Code: M1602G<br/>
    /// </summary>
    [XmlEnum("M1602G")]
    Grundbuchamt_Eschwege,

    /// <summary>
    /// <b>Amtsgericht Fritzlar</b><br/>
    /// Code: M1603<br/>
    /// </summary>
    [XmlEnum("M1603")]
    Amtsgericht_Fritzlar,

    /// <summary>
    /// <b>Grundbuchamt Fritzlar</b><br/>
    /// Code: M1603G<br/>
    /// </summary>
    [XmlEnum("M1603G")]
    Grundbuchamt_Fritzlar,

    /// <summary>
    /// <b>Amtsgericht Kassel Zweigstelle Hofgeismar</b><br/>
    /// Code: M1605<br/>
    /// </summary>
    [XmlEnum("M1605")]
    Amtsgericht_Kassel_Zweigstelle_Hofgeismar,

    /// <summary>
    /// <b>Grundbuchamt Kassel Zweigstelle Hofgeismar</b><br/>
    /// Code: M1605G<br/>
    /// </summary>
    [XmlEnum("M1605G")]
    Grundbuchamt_Kassel_Zweigstelle_Hofgeismar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Karlshafen</b><br/>
    /// Code: M1606<br/>
    /// </summary>
    [XmlEnum("M1606")]
    aufgeloest_Amtsgericht_Karlshafen,

    /// <summary>
    /// <b>Amtsgericht Kassel</b><br/>
    /// Code: M1607<br/>
    /// </summary>
    [XmlEnum("M1607")]
    Amtsgericht_Kassel,

    /// <summary>
    /// <b>Grundbuchamt Kassel</b><br/>
    /// Code: M1607G<br/>
    /// </summary>
    [XmlEnum("M1607G")]
    Grundbuchamt_Kassel,

    /// <summary>
    /// <b>Amtsgericht Korbach</b><br/>
    /// Code: M1608<br/>
    /// </summary>
    [XmlEnum("M1608")]
    Amtsgericht_Korbach,

    /// <summary>
    /// <b>Grundbuchamt Korbach</b><br/>
    /// Code: M1608G<br/>
    /// </summary>
    [XmlEnum("M1608G")]
    Grundbuchamt_Korbach,

    /// <summary>
    /// <b>Amtsgericht Melsungen</b><br/>
    /// Code: M1609<br/>
    /// </summary>
    [XmlEnum("M1609")]
    Amtsgericht_Melsungen,

    /// <summary>
    /// <b>Grundbuchamt Melsungen</b><br/>
    /// Code: M1609G<br/>
    /// </summary>
    [XmlEnum("M1609G")]
    Grundbuchamt_Melsungen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rotenburg a. d. Fulda</b><br/>
    /// Code: M1612<br/>
    /// </summary>
    [XmlEnum("M1612")]
    aufgeloest_Amtsgericht_Rotenburg_a_d_Fulda,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eschwege, Zwst. Sontra</b><br/>
    /// Code: M1613<br/>
    /// </summary>
    [XmlEnum("M1613")]
    aufgeloest_Amtsgericht_Eschwege_Zwst_Sontra,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Wildungen</b><br/>
    /// Code: M1614<br/>
    /// </summary>
    [XmlEnum("M1614")]
    aufgeloest_Amtsgericht_Bad_Wildungen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Witzenhausen</b><br/>
    /// Code: M1615<br/>
    /// </summary>
    [XmlEnum("M1615")]
    aufgeloest_Amtsgericht_Witzenhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wolfhagen</b><br/>
    /// Code: M1616<br/>
    /// </summary>
    [XmlEnum("M1616")]
    aufgeloest_Amtsgericht_Wolfhagen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Homberg (Efze)</b><br/>
    /// Code: M1619<br/>
    /// </summary>
    [XmlEnum("M1619")]
    aufgeloest_Amtsgericht_Homberg_Efze,

    /// <summary>
    /// <b>Landgericht Limburg</b><br/>
    /// Code: M1700<br/>
    /// </summary>
    [XmlEnum("M1700")]
    Landgericht_Limburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Limburg a. d. Lahn</b><br/>
    /// Code: M1700S<br/>
    /// </summary>
    [XmlEnum("M1700S")]
    Staatsanwaltschaft_beim_Landgericht_Limburg_a_d_Lahn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wetzlar, Zwst. Braunfels</b><br/>
    /// Code: M1701<br/>
    /// </summary>
    [XmlEnum("M1701")]
    aufgeloest_Amtsgericht_Wetzlar_Zwst_Braunfels,

    /// <summary>
    /// <b>Amtsgericht Dillenburg</b><br/>
    /// Code: M1702<br/>
    /// </summary>
    [XmlEnum("M1702")]
    Amtsgericht_Dillenburg,

    /// <summary>
    /// <b>Grundbuchamt Dillenburg</b><br/>
    /// Code: M1702G<br/>
    /// </summary>
    [XmlEnum("M1702G")]
    Grundbuchamt_Dillenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ehringshausen</b><br/>
    /// Code: M1703<br/>
    /// </summary>
    [XmlEnum("M1703")]
    aufgeloest_Amtsgericht_Ehringshausen,

    /// <summary>
    /// <b>Amtsgericht Limburg/Lahn Zweigstelle Hadamar</b><br/>
    /// Code: M1704<br/>
    /// </summary>
    [XmlEnum("M1704")]
    Amtsgericht_Limburg_Lahn_Zweigstelle_Hadamar,

    /// <summary>
    /// <b>Grundbuchamt Limburg Zweigstelle Hadamar</b><br/>
    /// Code: M1704G<br/>
    /// </summary>
    [XmlEnum("M1704G")]
    Grundbuchamt_Limburg_Zweigstelle_Hadamar,

    /// <summary>
    /// <b>Amtsgericht Dillenburg Zweigstelle Herborn</b><br/>
    /// Code: M1705<br/>
    /// </summary>
    [XmlEnum("M1705")]
    Amtsgericht_Dillenburg_Zweigstelle_Herborn,

    /// <summary>
    /// <b>Grundbuchamt Dillenburg Zweigstelle Herborn</b><br/>
    /// Code: M1705G<br/>
    /// </summary>
    [XmlEnum("M1705G")]
    Grundbuchamt_Dillenburg_Zweigstelle_Herborn,

    /// <summary>
    /// <b>Amtsgericht Limburg</b><br/>
    /// Code: M1706<br/>
    /// </summary>
    [XmlEnum("M1706")]
    Amtsgericht_Limburg,

    /// <summary>
    /// <b>Grundbuchamt Limburg</b><br/>
    /// Code: M1706G<br/>
    /// </summary>
    [XmlEnum("M1706G")]
    Grundbuchamt_Limburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Runkel</b><br/>
    /// Code: M1708<br/>
    /// </summary>
    [XmlEnum("M1708")]
    aufgeloest_Amtsgericht_Runkel,

    /// <summary>
    /// <b>Amtsgericht Weilburg</b><br/>
    /// Code: M1709<br/>
    /// </summary>
    [XmlEnum("M1709")]
    Amtsgericht_Weilburg,

    /// <summary>
    /// <b>Grundbuchamt Weilburg</b><br/>
    /// Code: M1709G<br/>
    /// </summary>
    [XmlEnum("M1709G")]
    Grundbuchamt_Weilburg,

    /// <summary>
    /// <b>Amtsgericht Wetzlar</b><br/>
    /// Code: M1710<br/>
    /// </summary>
    [XmlEnum("M1710")]
    Amtsgericht_Wetzlar,

    /// <summary>
    /// <b>Grundbuchamt Wetzlar</b><br/>
    /// Code: M1710G<br/>
    /// </summary>
    [XmlEnum("M1710G")]
    Grundbuchamt_Wetzlar,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Wetzlar, Zwst. der StA Limburg a. d. Lahn</b><br/>
    /// Code: M1710S<br/>
    /// </summary>
    [XmlEnum("M1710S")]
    Staatsanwaltschaft_beim_Landgericht_Wetzlar_Zwst_der_StA_Limburg_a_d_Lahn,

    /// <summary>
    /// <b>Landgericht Marburg</b><br/>
    /// Code: M1800<br/>
    /// </summary>
    [XmlEnum("M1800")]
    Landgericht_Marburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Marburg</b><br/>
    /// Code: M1800S<br/>
    /// </summary>
    [XmlEnum("M1800S")]
    Staatsanwaltschaft_beim_Landgericht_Marburg,

    /// <summary>
    /// <b>Amtsgericht Biedenkopf</b><br/>
    /// Code: M1801<br/>
    /// </summary>
    [XmlEnum("M1801")]
    Amtsgericht_Biedenkopf,

    /// <summary>
    /// <b>Grundbuchamt Biedenkopf</b><br/>
    /// Code: M1801G<br/>
    /// </summary>
    [XmlEnum("M1801G")]
    Grundbuchamt_Biedenkopf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Borken (Hessen)</b><br/>
    /// Code: M1802<br/>
    /// </summary>
    [XmlEnum("M1802")]
    aufgeloest_Amtsgericht_Borken_Hessen,

    /// <summary>
    /// <b>Amtsgericht Frankenberg-Eder</b><br/>
    /// Code: M1803<br/>
    /// </summary>
    [XmlEnum("M1803")]
    Amtsgericht_Frankenberg_Eder,

    /// <summary>
    /// <b>Grundbuchamt Frankenberg-Eder</b><br/>
    /// Code: M1803G<br/>
    /// </summary>
    [XmlEnum("M1803G")]
    Grundbuchamt_Frankenberg_Eder,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Biedenkopf, Zwst. Gladenbach</b><br/>
    /// Code: M1805<br/>
    /// </summary>
    [XmlEnum("M1805")]
    aufgeloest_Amtsgericht_Biedenkopf_Zwst_Gladenbach,

    /// <summary>
    /// <b>Amtsgericht Kirchhain</b><br/>
    /// Code: M1807<br/>
    /// </summary>
    [XmlEnum("M1807")]
    Amtsgericht_Kirchhain,

    /// <summary>
    /// <b>Grundbuchamt Kirchhain</b><br/>
    /// Code: M1807G<br/>
    /// </summary>
    [XmlEnum("M1807G")]
    Grundbuchamt_Kirchhain,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Frankenberg (Eder), Zwst. Gem&#252;nden (Wohra)</b><br/>
    /// Code: M1808<br/>
    /// </summary>
    [XmlEnum("M1808")]
    aufgeloest_Amtsgericht_Frankenberg_Eder_Zwst_Gemuenden_Wohra,

    /// <summary>
    /// <b>Amtsgericht Marburg</b><br/>
    /// Code: M1809<br/>
    /// </summary>
    [XmlEnum("M1809")]
    Amtsgericht_Marburg,

    /// <summary>
    /// <b>Grundbuchamt Marburg</b><br/>
    /// Code: M1809G<br/>
    /// </summary>
    [XmlEnum("M1809G")]
    Grundbuchamt_Marburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neukirchen (Kreis Ziegenhain)</b><br/>
    /// Code: M1810<br/>
    /// </summary>
    [XmlEnum("M1810")]
    aufgeloest_Amtsgericht_Neukirchen_Kreis_Ziegenhain,

    /// <summary>
    /// <b>Amtsgericht Schwalmstadt</b><br/>
    /// Code: M1812<br/>
    /// </summary>
    [XmlEnum("M1812")]
    Amtsgericht_Schwalmstadt,

    /// <summary>
    /// <b>Grundbuchamt Schwalmstadt</b><br/>
    /// Code: M1812G<br/>
    /// </summary>
    [XmlEnum("M1812G")]
    Grundbuchamt_Schwalmstadt,

    /// <summary>
    /// <b>Landgericht Wiesbaden</b><br/>
    /// Code: M1900<br/>
    /// </summary>
    [XmlEnum("M1900")]
    Landgericht_Wiesbaden,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Wiesbaden</b><br/>
    /// Code: M1900S<br/>
    /// </summary>
    [XmlEnum("M1900S")]
    Staatsanwaltschaft_beim_Landgericht_Wiesbaden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eltville am Rhein</b><br/>
    /// Code: M1901<br/>
    /// </summary>
    [XmlEnum("M1901")]
    aufgeloest_Amtsgericht_Eltville_am_Rhein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hochheim am Main</b><br/>
    /// Code: M1902<br/>
    /// </summary>
    [XmlEnum("M1902")]
    aufgeloest_Amtsgericht_Hochheim_am_Main,

    /// <summary>
    /// <b>Amtsgericht Idstein</b><br/>
    /// Code: M1903<br/>
    /// </summary>
    [XmlEnum("M1903")]
    Amtsgericht_Idstein,

    /// <summary>
    /// <b>Grundbuchamt Idstein</b><br/>
    /// Code: M1903G<br/>
    /// </summary>
    [XmlEnum("M1903G")]
    Grundbuchamt_Idstein,

    /// <summary>
    /// <b>Amtsgericht R&#252;desheim</b><br/>
    /// Code: M1904<br/>
    /// </summary>
    [XmlEnum("M1904")]
    Amtsgericht_Ruedesheim,

    /// <summary>
    /// <b>Grundbuchamt R&#252;desheim</b><br/>
    /// Code: M1904G<br/>
    /// </summary>
    [XmlEnum("M1904G")]
    Grundbuchamt_Ruedesheim,

    /// <summary>
    /// <b>Amtsgericht Bad Schwalbach</b><br/>
    /// Code: M1905<br/>
    /// </summary>
    [XmlEnum("M1905")]
    Amtsgericht_Bad_Schwalbach,

    /// <summary>
    /// <b>Grundbuchamt Bad Schwalbach</b><br/>
    /// Code: M1905G<br/>
    /// </summary>
    [XmlEnum("M1905G")]
    Grundbuchamt_Bad_Schwalbach,

    /// <summary>
    /// <b>Amtsgericht Wiesbaden</b><br/>
    /// Code: M1906<br/>
    /// </summary>
    [XmlEnum("M1906")]
    Amtsgericht_Wiesbaden,

    /// <summary>
    /// <b>Grundbuchamt Wiesbaden</b><br/>
    /// Code: M1906G<br/>
    /// </summary>
    [XmlEnum("M1906G")]
    Grundbuchamt_Wiesbaden,

    /// <summary>
    /// <b>Staatsanwaltschaft bei dem Landgericht Darmstadt Zweigstelle Offenbach a.Main</b><br/>
    /// Code: M6036S<br/>
    /// </summary>
    [XmlEnum("M6036S")]
    Staatsanwaltschaft_bei_dem_Landgericht_Darmstadt_Zweigstelle_Offenbach_a_Main,

    /// <summary>
    /// <b>Sozialgericht Frankfurt</b><br/>
    /// Code: M6057<br/>
    /// </summary>
    [XmlEnum("M6057")]
    Sozialgericht_Frankfurt,

    /// <summary>
    /// <b>Arbeitsgericht Bad Hersfeld</b><br/>
    /// Code: M6086<br/>
    /// </summary>
    [XmlEnum("M6086")]
    Arbeitsgericht_Bad_Hersfeld,

    /// <summary>
    /// <b>Sozialgericht Darmstadt</b><br/>
    /// Code: M6087<br/>
    /// </summary>
    [XmlEnum("M6087")]
    Sozialgericht_Darmstadt,

    /// <summary>
    /// <b>Arbeitsgericht Darmstadt</b><br/>
    /// Code: M6088<br/>
    /// </summary>
    [XmlEnum("M6088")]
    Arbeitsgericht_Darmstadt,

    /// <summary>
    /// <b>Hessisches Landessozialgericht</b><br/>
    /// Code: M6089<br/>
    /// </summary>
    [XmlEnum("M6089")]
    Hessisches_Landessozialgericht,

    /// <summary>
    /// <b>Verwaltungsgericht Darmstadt</b><br/>
    /// Code: M6090<br/>
    /// </summary>
    [XmlEnum("M6090")]
    Verwaltungsgericht_Darmstadt,

    /// <summary>
    /// <b>Bundesdisziplinargericht</b><br/>
    /// Code: M6091<br/>
    /// </summary>
    [XmlEnum("M6091")]
    Bundesdisziplinargericht,

    /// <summary>
    /// <b>Verwaltungsgericht Frankfurt am Main</b><br/>
    /// Code: M6093<br/>
    /// </summary>
    [XmlEnum("M6093")]
    Verwaltungsgericht_Frankfurt_am_Main,

    /// <summary>
    /// <b>Landesarbeitsgericht Frankfurt a.M.</b><br/>
    /// Code: M6094<br/>
    /// </summary>
    [XmlEnum("M6094")]
    Landesarbeitsgericht_Frankfurt_a_M,

    /// <summary>
    /// <b>Arbeitsgericht Frankfurt a.M.</b><br/>
    /// Code: M6095<br/>
    /// </summary>
    [XmlEnum("M6095")]
    Arbeitsgericht_Frankfurt_a_M,

    /// <summary>
    /// <b>Arbeitsgericht Fulda</b><br/>
    /// Code: M6096<br/>
    /// </summary>
    [XmlEnum("M6096")]
    Arbeitsgericht_Fulda,

    /// <summary>
    /// <b>Sozialgericht Gie&#223;en</b><br/>
    /// Code: M6097<br/>
    /// </summary>
    [XmlEnum("M6097")]
    Sozialgericht_Giessen,

    /// <summary>
    /// <b>Arbeitsgericht Gie&#223;en</b><br/>
    /// Code: M6098<br/>
    /// </summary>
    [XmlEnum("M6098")]
    Arbeitsgericht_Giessen,

    /// <summary>
    /// <b>Arbeitsgericht Hanau</b><br/>
    /// Code: M6099<br/>
    /// </summary>
    [XmlEnum("M6099")]
    Arbeitsgericht_Hanau,

    /// <summary>
    /// <b>Sozialgericht Kassel</b><br/>
    /// Code: M6100<br/>
    /// </summary>
    [XmlEnum("M6100")]
    Sozialgericht_Kassel,

    /// <summary>
    /// <b>Hessischer Verwaltungsgerichtshof</b><br/>
    /// Code: M6102<br/>
    /// </summary>
    [XmlEnum("M6102")]
    Hessischer_Verwaltungsgerichtshof,

    /// <summary>
    /// <b>Hessisches Finanzgericht</b><br/>
    /// Code: M6103<br/>
    /// </summary>
    [XmlEnum("M6103")]
    Hessisches_Finanzgericht,

    /// <summary>
    /// <b>Arbeitsgericht Kassel</b><br/>
    /// Code: M6104<br/>
    /// </summary>
    [XmlEnum("M6104")]
    Arbeitsgericht_Kassel,

    /// <summary>
    /// <b>Verwaltungsgericht Kassel</b><br/>
    /// Code: M6105<br/>
    /// </summary>
    [XmlEnum("M6105")]
    Verwaltungsgericht_Kassel,

    /// <summary>
    /// <b>Arbeitsgericht Limburg a. d. Lahn</b><br/>
    /// Code: M6106<br/>
    /// </summary>
    [XmlEnum("M6106")]
    Arbeitsgericht_Limburg_a_d_Lahn,

    /// <summary>
    /// <b>Sozialgericht Marburg</b><br/>
    /// Code: M6107<br/>
    /// </summary>
    [XmlEnum("M6107")]
    Sozialgericht_Marburg,

    /// <summary>
    /// <b>Arbeitsgericht Marburg</b><br/>
    /// Code: M6108<br/>
    /// </summary>
    [XmlEnum("M6108")]
    Arbeitsgericht_Marburg,

    /// <summary>
    /// <b>Arbeitsgericht Offenbach a.M.</b><br/>
    /// Code: M6230<br/>
    /// </summary>
    [XmlEnum("M6230")]
    Arbeitsgericht_Offenbach_a_M,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Wetzlar</b><br/>
    /// Code: M6231<br/>
    /// </summary>
    [XmlEnum("M6231")]
    aufgeloest_Arbeitsgericht_Wetzlar,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Wetzlar</b><br/>
    /// Code: M6232<br/>
    /// </summary>
    [XmlEnum("M6232")]
    aufgeloest_Arbeitsgericht_Wetzlar_M6232,

    /// <summary>
    /// <b>Arbeitsgericht Wiesbaden</b><br/>
    /// Code: M6233<br/>
    /// </summary>
    [XmlEnum("M6233")]
    Arbeitsgericht_Wiesbaden,

    /// <summary>
    /// <b>Bundessozialgericht</b><br/>
    /// Code: M6246<br/>
    /// </summary>
    [XmlEnum("M6246")]
    Bundessozialgericht,

    /// <summary>
    /// <b>Sozialgericht Wiesbaden</b><br/>
    /// Code: M6265<br/>
    /// </summary>
    [XmlEnum("M6265")]
    Sozialgericht_Wiesbaden,

    /// <summary>
    /// <b>Verwaltungsgericht Wiesbaden</b><br/>
    /// Code: M6276<br/>
    /// </summary>
    [XmlEnum("M6276")]
    Verwaltungsgericht_Wiesbaden,

    /// <summary>
    /// <b>Staatsgerichtshof des Landes Hessen</b><br/>
    /// Code: M6279<br/>
    /// </summary>
    [XmlEnum("M6279")]
    Staatsgerichtshof_des_Landes_Hessen,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Frankfurt/Main</b><br/>
    /// Code: M6300<br/>
    /// </summary>
    [XmlEnum("M6300")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Frankfurt_Main,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Kassel</b><br/>
    /// Code: M6318<br/>
    /// </summary>
    [XmlEnum("M6318")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Kassel,

    /// <summary>
    /// <b>Hessischer Anwaltsgerichtshof</b><br/>
    /// Code: M6320<br/>
    /// </summary>
    [XmlEnum("M6320")]
    Hessischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Sozialgericht Fulda</b><br/>
    /// Code: M6361<br/>
    /// </summary>
    [XmlEnum("M6361")]
    Sozialgericht_Fulda,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kassel II Sozialtherapeutische Anstalt</b><br/>
    /// Code: M6516<br/>
    /// </summary>
    [XmlEnum("M6516")]
    Justizvollzugsanstalt_Kassel_II_Sozialtherapeutische_Anstalt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Frankfurt am Main IV</b><br/>
    /// Code: M6864<br/>
    /// </summary>
    [XmlEnum("M6864")]
    Justizvollzugsanstalt_Frankfurt_am_Main_IV,

    /// <summary>
    /// <b>Verwaltungsgericht Gie&#223;en</b><br/>
    /// Code: M7095<br/>
    /// </summary>
    [XmlEnum("M7095")]
    Verwaltungsgericht_Giessen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Frankfurt am Main III</b><br/>
    /// Code: M7131<br/>
    /// </summary>
    [XmlEnum("M7131")]
    Justizvollzugsanstalt_Frankfurt_am_Main_III,

    /// <summary>
    /// <b>Zentrales elektronisches Schutzschriftenregister</b><br/>
    /// Code: M7333<br/>
    /// </summary>
    [XmlEnum("M7333")]
    Zentrales_elektronisches_Schutzschriftenregister,

    /// <summary>
    /// <b>Jugendarresteinrichtung Gelnhausen</b><br/>
    /// Code: M7348<br/>
    /// </summary>
    [XmlEnum("M7348")]
    Jugendarresteinrichtung_Gelnhausen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Weiterstadt</b><br/>
    /// Code: M8403<br/>
    /// </summary>
    [XmlEnum("M8403")]
    Justizvollzugsanstalt_Weiterstadt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Frankfurt am Main I</b><br/>
    /// Code: M8408<br/>
    /// </summary>
    [XmlEnum("M8408")]
    Justizvollzugsanstalt_Frankfurt_am_Main_I,

    /// <summary>
    /// <b>Justizvollzugsanstalt Schwalmstadt</b><br/>
    /// Code: M8435<br/>
    /// </summary>
    [XmlEnum("M8435")]
    Justizvollzugsanstalt_Schwalmstadt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Gie&#223;en</b><br/>
    /// Code: M8440<br/>
    /// </summary>
    [XmlEnum("M8440")]
    Justizvollzugsanstalt_Giessen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Butzbach</b><br/>
    /// Code: M8447<br/>
    /// </summary>
    [XmlEnum("M8447")]
    Justizvollzugsanstalt_Butzbach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Darmstadt</b><br/>
    /// Code: M8448<br/>
    /// </summary>
    [XmlEnum("M8448")]
    Justizvollzugsanstalt_Darmstadt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Dieburg</b><br/>
    /// Code: M8449<br/>
    /// </summary>
    [XmlEnum("M8449")]
    Justizvollzugsanstalt_Dieburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Fulda</b><br/>
    /// Code: M8450<br/>
    /// </summary>
    [XmlEnum("M8450")]
    Justizvollzugsanstalt_Fulda,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kassel I</b><br/>
    /// Code: M8451<br/>
    /// </summary>
    [XmlEnum("M8451")]
    Justizvollzugsanstalt_Kassel_I,

    /// <summary>
    /// <b>Justizvollzugsanstalt Wiesbaden</b><br/>
    /// Code: M8500<br/>
    /// </summary>
    [XmlEnum("M8500")]
    Justizvollzugsanstalt_Wiesbaden,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rockenberg</b><br/>
    /// Code: M8611<br/>
    /// </summary>
    [XmlEnum("M8611")]
    Justizvollzugsanstalt_Rockenberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Limburg a. d. Lahn</b><br/>
    /// Code: M8612<br/>
    /// </summary>
    [XmlEnum("M8612")]
    Justizvollzugsanstalt_Limburg_a_d_Lahn,

    /// <summary>
    /// <b>Justizvollzugsanstalt H&#252;nfeld</b><br/>
    /// Code: M8668<br/>
    /// </summary>
    [XmlEnum("M8668")]
    Justizvollzugsanstalt_Huenfeld,

    /// <summary>
    /// <b>Oberlandesgericht Rostock</b><br/>
    /// Code: N1000<br/>
    /// </summary>
    [XmlEnum("N1000")]
    Oberlandesgericht_Rostock,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Rostock</b><br/>
    /// Code: N1000S<br/>
    /// </summary>
    [XmlEnum("N1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Rostock,

    /// <summary>
    /// <b>Landgericht Neubrandenburg</b><br/>
    /// Code: N1100<br/>
    /// </summary>
    [XmlEnum("N1100")]
    Landgericht_Neubrandenburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Neubrandenburg</b><br/>
    /// Code: N1100S<br/>
    /// </summary>
    [XmlEnum("N1100S")]
    Staatsanwaltschaft_beim_Landgericht_Neubrandenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Altentreptow</b><br/>
    /// Code: N1101<br/>
    /// </summary>
    [XmlEnum("N1101")]
    aufgeloest_Amtsgericht_Altentreptow,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Anklam</b><br/>
    /// Code: N1102<br/>
    /// </summary>
    [XmlEnum("N1102")]
    aufgeloest_Amtsgericht_Anklam,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Demmin</b><br/>
    /// Code: N1103<br/>
    /// </summary>
    [XmlEnum("N1103")]
    aufgeloest_Amtsgericht_Demmin,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Demmin Zweigstelle Malchin</b><br/>
    /// Code: N1104<br/>
    /// </summary>
    [XmlEnum("N1104")]
    aufgeloest_Amtsgericht_Demmin_Zweigstelle_Malchin,

    /// <summary>
    /// <b>Amtsgericht Neubrandenburg</b><br/>
    /// Code: N1105<br/>
    /// </summary>
    [XmlEnum("N1105")]
    Amtsgericht_Neubrandenburg,

    /// <summary>
    /// <b>Amtsgericht Neubrandenburg, Zentrales Vollstreckungsgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N1105R<br/>
    /// </summary>
    [XmlEnum("N1105R")]
    Amtsgericht_Neubrandenburg_Zentrales_Vollstreckungsgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Registergericht Amtsgericht Neubrandenburg</b><br/>
    /// Code: N1105V<br/>
    /// </summary>
    [XmlEnum("N1105V")]
    Registergericht_Amtsgericht_Neubrandenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neustrelitz</b><br/>
    /// Code: N1106<br/>
    /// </summary>
    [XmlEnum("N1106")]
    aufgeloest_Amtsgericht_Neustrelitz,

    /// <summary>
    /// <b>Amtsgericht Pasewalk</b><br/>
    /// Code: N1107<br/>
    /// </summary>
    [XmlEnum("N1107")]
    Amtsgericht_Pasewalk,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht R&#246;bel/M&#252;ritz</b><br/>
    /// Code: N1108<br/>
    /// </summary>
    [XmlEnum("N1108")]
    aufgeloest_Amtsgericht_Roebel_Mueritz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Strasburg</b><br/>
    /// Code: N1109<br/>
    /// </summary>
    [XmlEnum("N1109")]
    aufgeloest_Amtsgericht_Strasburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Teterow</b><br/>
    /// Code: N1110<br/>
    /// </summary>
    [XmlEnum("N1110")]
    aufgeloest_Amtsgericht_Teterow,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ueckerm&#252;nde</b><br/>
    /// Code: N1111<br/>
    /// </summary>
    [XmlEnum("N1111")]
    aufgeloest_Amtsgericht_Ueckermuende,

    /// <summary>
    /// <b>Amtsgericht Waren (M&#252;ritz)</b><br/>
    /// Code: N1112<br/>
    /// </summary>
    [XmlEnum("N1112")]
    Amtsgericht_Waren_Mueritz,

    /// <summary>
    /// <b>Grundbuchamt Waren (M&#252;ritz)</b><br/>
    /// Code: N1112G<br/>
    /// </summary>
    [XmlEnum("N1112G")]
    Grundbuchamt_Waren_Mueritz,

    /// <summary>
    /// <b>Amtsgericht Pasewalk Zweigstelle Anklam</b><br/>
    /// Code: N1113<br/>
    /// </summary>
    [XmlEnum("N1113")]
    Amtsgericht_Pasewalk_Zweigstelle_Anklam,

    /// <summary>
    /// <b>Grundbuchamt Pasewalk Zweigstelle Anklam</b><br/>
    /// Code: N1113G<br/>
    /// </summary>
    [XmlEnum("N1113G")]
    Grundbuchamt_Pasewalk_Zweigstelle_Anklam,

    /// <summary>
    /// <b>Amtsgericht Waren (M&#252;ritz) Zweigstelle Neustrelitz</b><br/>
    /// Code: N1114<br/>
    /// </summary>
    [XmlEnum("N1114")]
    Amtsgericht_Waren_Mueritz_Zweigstelle_Neustrelitz,

    /// <summary>
    /// <b>Amtsgericht Neubrandenburg Zweigstelle Demmin</b><br/>
    /// Code: N1115<br/>
    /// </summary>
    [XmlEnum("N1115")]
    Amtsgericht_Neubrandenburg_Zweigstelle_Demmin,

    /// <summary>
    /// <b>Grundbuchamt Neubrandenburg Zweigstelle Demmin</b><br/>
    /// Code: N1115G<br/>
    /// </summary>
    [XmlEnum("N1115G")]
    Grundbuchamt_Neubrandenburg_Zweigstelle_Demmin,

    /// <summary>
    /// <b>Landgericht Rostock</b><br/>
    /// Code: N1200<br/>
    /// </summary>
    [XmlEnum("N1200")]
    Landgericht_Rostock,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Rostock</b><br/>
    /// Code: N1200S<br/>
    /// </summary>
    [XmlEnum("N1200S")]
    Staatsanwaltschaft_beim_Landgericht_Rostock,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Doberan</b><br/>
    /// Code: N1201<br/>
    /// </summary>
    [XmlEnum("N1201")]
    aufgeloest_Amtsgericht_Bad_Doberan,

    /// <summary>
    /// <b>Amtsgericht Greifswald</b><br/>
    /// Code: N1202<br/>
    /// </summary>
    [XmlEnum("N1202")]
    Amtsgericht_Greifswald,

    /// <summary>
    /// <b>Grundbuchamt Greifswald</b><br/>
    /// Code: N1202G<br/>
    /// </summary>
    [XmlEnum("N1202G")]
    Grundbuchamt_Greifswald,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Grevesm&#252;hlen</b><br/>
    /// Code: N1203<br/>
    /// </summary>
    [XmlEnum("N1203")]
    aufgeloest_Amtsgericht_Grevesmuehlen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stralsund Zweigstelle Grimmen</b><br/>
    /// Code: N1204<br/>
    /// </summary>
    [XmlEnum("N1204")]
    aufgeloest_Amtsgericht_Stralsund_Zweigstelle_Grimmen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ribnitz-Damgarten</b><br/>
    /// Code: N1205<br/>
    /// </summary>
    [XmlEnum("N1205")]
    aufgeloest_Amtsgericht_Ribnitz_Damgarten,

    /// <summary>
    /// <b>aufgel&#246;st-Grundbuchamt Ribnitz-Damgarten</b><br/>
    /// Code: N1205G<br/>
    /// </summary>
    [XmlEnum("N1205G")]
    aufgeloest_Grundbuchamt_Ribnitz_Damgarten,

    /// <summary>
    /// <b>Amtsgericht Rostock</b><br/>
    /// Code: N1206<br/>
    /// </summary>
    [XmlEnum("N1206")]
    Amtsgericht_Rostock,

    /// <summary>
    /// <b>Grundbuchamt Rostock</b><br/>
    /// Code: N1206G<br/>
    /// </summary>
    [XmlEnum("N1206G")]
    Grundbuchamt_Rostock,

    /// <summary>
    /// <b>Registergericht Amtsgericht Rostock</b><br/>
    /// Code: N1206V<br/>
    /// </summary>
    [XmlEnum("N1206V")]
    Registergericht_Amtsgericht_Rostock,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bergen</b><br/>
    /// Code: N1208<br/>
    /// </summary>
    [XmlEnum("N1208")]
    aufgeloest_Amtsgericht_Bergen,

    /// <summary>
    /// <b>Amtsgericht Stralsund</b><br/>
    /// Code: N1209<br/>
    /// </summary>
    [XmlEnum("N1209")]
    Amtsgericht_Stralsund,

    /// <summary>
    /// <b>Grundbuchamt Stralsund</b><br/>
    /// Code: N1209G<br/>
    /// </summary>
    [XmlEnum("N1209G")]
    Grundbuchamt_Stralsund,

    /// <summary>
    /// <b>Registergericht Amtsgericht Stralsund</b><br/>
    /// Code: N1209V<br/>
    /// </summary>
    [XmlEnum("N1209V")]
    Registergericht_Amtsgericht_Stralsund,

    /// <summary>
    /// <b>Amtsgericht Wismar</b><br/>
    /// Code: N1210<br/>
    /// </summary>
    [XmlEnum("N1210")]
    Amtsgericht_Wismar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wolgast</b><br/>
    /// Code: N1211<br/>
    /// </summary>
    [XmlEnum("N1211")]
    aufgeloest_Amtsgericht_Wolgast,

    /// <summary>
    /// <b>Landgericht Schwerin</b><br/>
    /// Code: N1300<br/>
    /// </summary>
    [XmlEnum("N1300")]
    Landgericht_Schwerin,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Schwerin</b><br/>
    /// Code: N1300S<br/>
    /// </summary>
    [XmlEnum("N1300S")]
    Staatsanwaltschaft_beim_Landgericht_Schwerin,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht B&#252;tzow</b><br/>
    /// Code: N1301<br/>
    /// </summary>
    [XmlEnum("N1301")]
    aufgeloest_Amtsgericht_Buetzow,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gadebusch</b><br/>
    /// Code: N1302<br/>
    /// </summary>
    [XmlEnum("N1302")]
    aufgeloest_Amtsgericht_Gadebusch,

    /// <summary>
    /// <b>Amtsgericht G&#252;strow</b><br/>
    /// Code: N1303<br/>
    /// </summary>
    [XmlEnum("N1303")]
    Amtsgericht_Guestrow,

    /// <summary>
    /// <b>Grundbuchamt G&#252;strow</b><br/>
    /// Code: N1303G<br/>
    /// </summary>
    [XmlEnum("N1303G")]
    Grundbuchamt_Guestrow,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hagenow</b><br/>
    /// Code: N1304<br/>
    /// </summary>
    [XmlEnum("N1304")]
    aufgeloest_Amtsgericht_Hagenow,

    /// <summary>
    /// <b>Amtsgericht Ludwigslust</b><br/>
    /// Code: N1305<br/>
    /// </summary>
    [XmlEnum("N1305")]
    Amtsgericht_Ludwigslust,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Plau am See</b><br/>
    /// Code: N1306<br/>
    /// </summary>
    [XmlEnum("N1306")]
    aufgeloest_Amtsgericht_Plau_am_See,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Parchim</b><br/>
    /// Code: N1307<br/>
    /// </summary>
    [XmlEnum("N1307")]
    aufgeloest_Amtsgericht_Parchim,

    /// <summary>
    /// <b>Amtsgericht Schwerin</b><br/>
    /// Code: N1308<br/>
    /// </summary>
    [XmlEnum("N1308")]
    Amtsgericht_Schwerin,

    /// <summary>
    /// <b>Grundbuchamt Schwerin</b><br/>
    /// Code: N1308G<br/>
    /// </summary>
    [XmlEnum("N1308G")]
    Grundbuchamt_Schwerin,

    /// <summary>
    /// <b>Registergericht Amtsgericht Schwerin</b><br/>
    /// Code: N1308V<br/>
    /// </summary>
    [XmlEnum("N1308V")]
    Registergericht_Amtsgericht_Schwerin,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sternberg</b><br/>
    /// Code: N1309<br/>
    /// </summary>
    [XmlEnum("N1309")]
    aufgeloest_Amtsgericht_Sternberg,

    /// <summary>
    /// <b>Amtsgericht Ludwigslust Zweigstelle Parchim</b><br/>
    /// Code: N1310<br/>
    /// </summary>
    [XmlEnum("N1310")]
    Amtsgericht_Ludwigslust_Zweigstelle_Parchim,

    /// <summary>
    /// <b>Grundbuchamt Ludwigslust Zweigstelle Parchim</b><br/>
    /// Code: N1310G<br/>
    /// </summary>
    [XmlEnum("N1310G")]
    Grundbuchamt_Ludwigslust_Zweigstelle_Parchim,

    /// <summary>
    /// <b>Amtsgericht Wismar Zweigstelle Grevesm&#252;hlen</b><br/>
    /// Code: N1311<br/>
    /// </summary>
    [XmlEnum("N1311")]
    Amtsgericht_Wismar_Zweigstelle_Grevesmuehlen,

    /// <summary>
    /// <b>Grundbuchamt Wismar Zweigstelle Grevesm&#252;hlen</b><br/>
    /// Code: N1311G<br/>
    /// </summary>
    [XmlEnum("N1311G")]
    Grundbuchamt_Wismar_Zweigstelle_Grevesmuehlen,

    /// <summary>
    /// <b>Landgericht Stralsund</b><br/>
    /// Code: N1400<br/>
    /// </summary>
    [XmlEnum("N1400")]
    Landgericht_Stralsund,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Stralsund</b><br/>
    /// Code: N1400S<br/>
    /// </summary>
    [XmlEnum("N1400S")]
    Staatsanwaltschaft_beim_Landgericht_Stralsund,

    /// <summary>
    /// <b>Amtsgericht Stralsund Zweigstelle Bergen auf R&#252;gen</b><br/>
    /// Code: N1401<br/>
    /// </summary>
    [XmlEnum("N1401")]
    Amtsgericht_Stralsund_Zweigstelle_Bergen_auf_Ruegen,

    /// <summary>
    /// <b>Anwaltsgerichtshof Mecklenburg-Vorpommern</b><br/>
    /// Code: N6001<br/>
    /// </summary>
    [XmlEnum("N6001")]
    Anwaltsgerichtshof_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Justizvollzugsanstalt B&#252;tzow</b><br/>
    /// Code: N6059<br/>
    /// </summary>
    [XmlEnum("N6059")]
    Justizvollzugsanstalt_Buetzow,

    /// <summary>
    /// <b>Justizvollzugsanstalt Stralsund</b><br/>
    /// Code: N6061<br/>
    /// </summary>
    [XmlEnum("N6061")]
    Justizvollzugsanstalt_Stralsund,

    /// <summary>
    /// <b>Justizvollzugsanstalt Neustrelitz</b><br/>
    /// Code: N6062<br/>
    /// </summary>
    [XmlEnum("N6062")]
    Justizvollzugsanstalt_Neustrelitz,

    /// <summary>
    /// <b>Justizvollzugsanstalt Waldeck</b><br/>
    /// Code: N6068<br/>
    /// </summary>
    [XmlEnum("N6068")]
    Justizvollzugsanstalt_Waldeck,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Neubrandenburg</b><br/>
    /// Code: N6206<br/>
    /// </summary>
    [XmlEnum("N6206")]
    aufgeloest_Arbeitsgericht_Neubrandenburg,

    /// <summary>
    /// <b>Sozialgericht Schwerin</b><br/>
    /// Code: N6208<br/>
    /// </summary>
    [XmlEnum("N6208")]
    Sozialgericht_Schwerin,

    /// <summary>
    /// <b>Oberverwaltungsgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6209<br/>
    /// </summary>
    [XmlEnum("N6209")]
    Oberverwaltungsgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Arbeitsgericht Schwerin</b><br/>
    /// Code: N6212<br/>
    /// </summary>
    [XmlEnum("N6212")]
    Arbeitsgericht_Schwerin,

    /// <summary>
    /// <b>Arbeitsgericht Rostock</b><br/>
    /// Code: N6224<br/>
    /// </summary>
    [XmlEnum("N6224")]
    Arbeitsgericht_Rostock,

    /// <summary>
    /// <b>Landesarbeitsgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6235<br/>
    /// </summary>
    [XmlEnum("N6235")]
    Landesarbeitsgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Arbeitsgericht Stralsund</b><br/>
    /// Code: N6247<br/>
    /// </summary>
    [XmlEnum("N6247")]
    Arbeitsgericht_Stralsund,

    /// <summary>
    /// <b>Finanzgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6269<br/>
    /// </summary>
    [XmlEnum("N6269")]
    Finanzgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Landesverfassungsgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6298<br/>
    /// </summary>
    [XmlEnum("N6298")]
    Landesverfassungsgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Landessozialgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6312<br/>
    /// </summary>
    [XmlEnum("N6312")]
    Landessozialgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Sozialgericht Neubrandenburg</b><br/>
    /// Code: N6313<br/>
    /// </summary>
    [XmlEnum("N6313")]
    Sozialgericht_Neubrandenburg,

    /// <summary>
    /// <b>Sozialgericht Stralsund</b><br/>
    /// Code: N6325<br/>
    /// </summary>
    [XmlEnum("N6325")]
    Sozialgericht_Stralsund,

    /// <summary>
    /// <b>Sozialgericht Rostock</b><br/>
    /// Code: N6326<br/>
    /// </summary>
    [XmlEnum("N6326")]
    Sozialgericht_Rostock,

    /// <summary>
    /// <b>Verwaltungsgericht Greifswald</b><br/>
    /// Code: N6339<br/>
    /// </summary>
    [XmlEnum("N6339")]
    Verwaltungsgericht_Greifswald,

    /// <summary>
    /// <b>Verwaltungsgericht Schwerin</b><br/>
    /// Code: N6441<br/>
    /// </summary>
    [XmlEnum("N6441")]
    Verwaltungsgericht_Schwerin,

    /// <summary>
    /// <b>Anwaltsgericht Mecklenburg-Vorpommern</b><br/>
    /// Code: N6473<br/>
    /// </summary>
    [XmlEnum("N6473")]
    Anwaltsgericht_Mecklenburg_Vorpommern,

    /// <summary>
    /// <b>Arbeitsgericht Stralsund Kammer Neubrandenburg</b><br/>
    /// Code: N6511<br/>
    /// </summary>
    [XmlEnum("N6511")]
    Arbeitsgericht_Stralsund_Kammer_Neubrandenburg,

    /// <summary>
    /// <b>Richterdienstgericht</b><br/>
    /// Code: N6516<br/>
    /// </summary>
    [XmlEnum("N6516")]
    Richterdienstgericht,

    /// <summary>
    /// <b>Dienstgerichtshof</b><br/>
    /// Code: N6517<br/>
    /// </summary>
    [XmlEnum("N6517")]
    Dienstgerichtshof,

    /// <summary>
    /// <b>Oberlandesgericht Braunschweig</b><br/>
    /// Code: P1000<br/>
    /// </summary>
    [XmlEnum("P1000")]
    Oberlandesgericht_Braunschweig,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Braunschweig</b><br/>
    /// Code: P1000S<br/>
    /// </summary>
    [XmlEnum("P1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Braunschweig,

    /// <summary>
    /// <b>Landgericht Braunschweig</b><br/>
    /// Code: P1100<br/>
    /// </summary>
    [XmlEnum("P1100")]
    Landgericht_Braunschweig,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Braunschweig</b><br/>
    /// Code: P1100S<br/>
    /// </summary>
    [XmlEnum("P1100S")]
    Staatsanwaltschaft_beim_Landgericht_Braunschweig,

    /// <summary>
    /// <b>Amtsgericht Bad Gandersheim</b><br/>
    /// Code: P1101<br/>
    /// </summary>
    [XmlEnum("P1101")]
    Amtsgericht_Bad_Gandersheim,

    /// <summary>
    /// <b>Grundbuchamt Bad Gandersheim</b><br/>
    /// Code: P1101G<br/>
    /// </summary>
    [XmlEnum("P1101G")]
    Grundbuchamt_Bad_Gandersheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Harzburg</b><br/>
    /// Code: P1102<br/>
    /// </summary>
    [XmlEnum("P1102")]
    aufgeloest_Amtsgericht_Bad_Harzburg,

    /// <summary>
    /// <b>Amtsgericht Braunschweig</b><br/>
    /// Code: P1103<br/>
    /// </summary>
    [XmlEnum("P1103")]
    Amtsgericht_Braunschweig,

    /// <summary>
    /// <b>Grundbuchamt Braunschweig</b><br/>
    /// Code: P1103G<br/>
    /// </summary>
    [XmlEnum("P1103G")]
    Grundbuchamt_Braunschweig,

    /// <summary>
    /// <b>Amtsgericht Goslar</b><br/>
    /// Code: P1104<br/>
    /// </summary>
    [XmlEnum("P1104")]
    Amtsgericht_Goslar,

    /// <summary>
    /// <b>Grundbuchamt Goslar</b><br/>
    /// Code: P1104G<br/>
    /// </summary>
    [XmlEnum("P1104G")]
    Grundbuchamt_Goslar,

    /// <summary>
    /// <b>Amtsgericht Goslar, Zentrales Vollstreckungsgericht Niedersachsen</b><br/>
    /// Code: P1104R<br/>
    /// </summary>
    [XmlEnum("P1104R")]
    Amtsgericht_Goslar_Zentrales_Vollstreckungsgericht_Niedersachsen,

    /// <summary>
    /// <b>Amtsgericht Helmstedt</b><br/>
    /// Code: P1105<br/>
    /// </summary>
    [XmlEnum("P1105")]
    Amtsgericht_Helmstedt,

    /// <summary>
    /// <b>Grundbuchamt Helmstedt</b><br/>
    /// Code: P1105G<br/>
    /// </summary>
    [XmlEnum("P1105G")]
    Grundbuchamt_Helmstedt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht K&#246;nigslutter</b><br/>
    /// Code: P1106<br/>
    /// </summary>
    [XmlEnum("P1106")]
    aufgeloest_Amtsgericht_Koenigslutter,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Salzgitter-Bad</b><br/>
    /// Code: P1107<br/>
    /// </summary>
    [XmlEnum("P1107")]
    aufgeloest_Amtsgericht_Salzgitter_Bad,

    /// <summary>
    /// <b>Amtsgericht Salzgitter</b><br/>
    /// Code: P1108<br/>
    /// </summary>
    [XmlEnum("P1108")]
    Amtsgericht_Salzgitter,

    /// <summary>
    /// <b>Grundbuchamt Salzgitter</b><br/>
    /// Code: P1108G<br/>
    /// </summary>
    [XmlEnum("P1108G")]
    Grundbuchamt_Salzgitter,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sch&#246;ningen</b><br/>
    /// Code: P1109<br/>
    /// </summary>
    [XmlEnum("P1109")]
    aufgeloest_Amtsgericht_Schoeningen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sch&#246;ppenstedt</b><br/>
    /// Code: P1110<br/>
    /// </summary>
    [XmlEnum("P1110")]
    aufgeloest_Amtsgericht_Schoeppenstedt,

    /// <summary>
    /// <b>Amtsgericht Seesen</b><br/>
    /// Code: P1111<br/>
    /// </summary>
    [XmlEnum("P1111")]
    Amtsgericht_Seesen,

    /// <summary>
    /// <b>Grundbuchamt Seesen</b><br/>
    /// Code: P1111G<br/>
    /// </summary>
    [XmlEnum("P1111G")]
    Grundbuchamt_Seesen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Vechelde</b><br/>
    /// Code: P1112<br/>
    /// </summary>
    [XmlEnum("P1112")]
    aufgeloest_Amtsgericht_Vechelde,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Vorsfelde</b><br/>
    /// Code: P1113<br/>
    /// </summary>
    [XmlEnum("P1113")]
    aufgeloest_Amtsgericht_Vorsfelde,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Walkenried</b><br/>
    /// Code: P1114<br/>
    /// </summary>
    [XmlEnum("P1114")]
    aufgeloest_Amtsgericht_Walkenried,

    /// <summary>
    /// <b>Amtsgericht Wolfenb&#252;ttel</b><br/>
    /// Code: P1115<br/>
    /// </summary>
    [XmlEnum("P1115")]
    Amtsgericht_Wolfenbuettel,

    /// <summary>
    /// <b>Grundbuchamt Wolfenb&#252;ttel</b><br/>
    /// Code: P1115G<br/>
    /// </summary>
    [XmlEnum("P1115G")]
    Grundbuchamt_Wolfenbuettel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Greene</b><br/>
    /// Code: P1116<br/>
    /// </summary>
    [XmlEnum("P1116")]
    aufgeloest_Amtsgericht_Greene,

    /// <summary>
    /// <b>Oberlandesgericht Celle</b><br/>
    /// Code: P2000<br/>
    /// </summary>
    [XmlEnum("P2000")]
    Oberlandesgericht_Celle,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Celle</b><br/>
    /// Code: P2000S<br/>
    /// </summary>
    [XmlEnum("P2000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Celle,

    /// <summary>
    /// <b>Landgericht B&#252;ckeburg</b><br/>
    /// Code: P2100<br/>
    /// </summary>
    [XmlEnum("P2100")]
    Landgericht_Bueckeburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht B&#252;ckeburg</b><br/>
    /// Code: P2100S<br/>
    /// </summary>
    [XmlEnum("P2100S")]
    Staatsanwaltschaft_beim_Landgericht_Bueckeburg,

    /// <summary>
    /// <b>Amtsgericht B&#252;ckeburg</b><br/>
    /// Code: P2101<br/>
    /// </summary>
    [XmlEnum("P2101")]
    Amtsgericht_Bueckeburg,

    /// <summary>
    /// <b>Grundbuchamt B&#252;ckeburg</b><br/>
    /// Code: P2101G<br/>
    /// </summary>
    [XmlEnum("P2101G")]
    Grundbuchamt_Bueckeburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hess. Oldendorf</b><br/>
    /// Code: P2102<br/>
    /// </summary>
    [XmlEnum("P2102")]
    aufgeloest_Amtsgericht_Hess_Oldendorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Obernkirchen</b><br/>
    /// Code: P2103<br/>
    /// </summary>
    [XmlEnum("P2103")]
    aufgeloest_Amtsgericht_Obernkirchen,

    /// <summary>
    /// <b>Amtsgericht Rinteln</b><br/>
    /// Code: P2104<br/>
    /// </summary>
    [XmlEnum("P2104")]
    Amtsgericht_Rinteln,

    /// <summary>
    /// <b>Grundbuchamt Rinteln</b><br/>
    /// Code: P2104G<br/>
    /// </summary>
    [XmlEnum("P2104G")]
    Grundbuchamt_Rinteln,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rodenberg</b><br/>
    /// Code: P2105<br/>
    /// </summary>
    [XmlEnum("P2105")]
    aufgeloest_Amtsgericht_Rodenberg,

    /// <summary>
    /// <b>Amtsgericht Stadthagen</b><br/>
    /// Code: P2106<br/>
    /// </summary>
    [XmlEnum("P2106")]
    Amtsgericht_Stadthagen,

    /// <summary>
    /// <b>Grundbuchamt Stadthagen</b><br/>
    /// Code: P2106G<br/>
    /// </summary>
    [XmlEnum("P2106G")]
    Grundbuchamt_Stadthagen,

    /// <summary>
    /// <b>Landgericht G&#246;ttingen</b><br/>
    /// Code: P2200<br/>
    /// </summary>
    [XmlEnum("P2200")]
    Landgericht_Goettingen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht G&#246;ttingen</b><br/>
    /// Code: P2200S<br/>
    /// </summary>
    [XmlEnum("P2200S")]
    Staatsanwaltschaft_beim_Landgericht_Goettingen,

    /// <summary>
    /// <b>Amtsgericht Clausthal-Zellerfeld</b><br/>
    /// Code: P2201<br/>
    /// </summary>
    [XmlEnum("P2201")]
    Amtsgericht_Clausthal_Zellerfeld,

    /// <summary>
    /// <b>Grundbuchamt Clausthal-Zellerfeld</b><br/>
    /// Code: P2201G<br/>
    /// </summary>
    [XmlEnum("P2201G")]
    Grundbuchamt_Clausthal_Zellerfeld,

    /// <summary>
    /// <b>Amtsgericht Duderstadt</b><br/>
    /// Code: P2202<br/>
    /// </summary>
    [XmlEnum("P2202")]
    Amtsgericht_Duderstadt,

    /// <summary>
    /// <b>Grundbuchamt Duderstadt</b><br/>
    /// Code: P2202G<br/>
    /// </summary>
    [XmlEnum("P2202G")]
    Grundbuchamt_Duderstadt,

    /// <summary>
    /// <b>Amtsgericht Einbeck</b><br/>
    /// Code: P2203<br/>
    /// </summary>
    [XmlEnum("P2203")]
    Amtsgericht_Einbeck,

    /// <summary>
    /// <b>Grundbuchamt Einbeck</b><br/>
    /// Code: P2203G<br/>
    /// </summary>
    [XmlEnum("P2203G")]
    Grundbuchamt_Einbeck,

    /// <summary>
    /// <b>Amtsgericht G&#246;ttingen</b><br/>
    /// Code: P2204<br/>
    /// </summary>
    [XmlEnum("P2204")]
    Amtsgericht_Goettingen,

    /// <summary>
    /// <b>Grundbuchamt G&#246;ttingen</b><br/>
    /// Code: P2204G<br/>
    /// </summary>
    [XmlEnum("P2204G")]
    Grundbuchamt_Goettingen,

    /// <summary>
    /// <b>Amtsgericht Hann. M&#252;nden</b><br/>
    /// Code: P2205<br/>
    /// </summary>
    [XmlEnum("P2205")]
    Amtsgericht_Hann_Muenden,

    /// <summary>
    /// <b>Grundbuchamt Hann. M&#252;nden</b><br/>
    /// Code: P2205G<br/>
    /// </summary>
    [XmlEnum("P2205G")]
    Grundbuchamt_Hann_Muenden,

    /// <summary>
    /// <b>Amtsgericht Herzberg am Harz</b><br/>
    /// Code: P2206<br/>
    /// </summary>
    [XmlEnum("P2206")]
    Amtsgericht_Herzberg_am_Harz,

    /// <summary>
    /// <b>Grundbuchamt Herzberg am Harz</b><br/>
    /// Code: P2206G<br/>
    /// </summary>
    [XmlEnum("P2206G")]
    Grundbuchamt_Herzberg_am_Harz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Moringen</b><br/>
    /// Code: P2207<br/>
    /// </summary>
    [XmlEnum("P2207")]
    aufgeloest_Amtsgericht_Moringen,

    /// <summary>
    /// <b>Amtsgericht Northeim</b><br/>
    /// Code: P2208<br/>
    /// </summary>
    [XmlEnum("P2208")]
    Amtsgericht_Northeim,

    /// <summary>
    /// <b>Grundbuchamt Northeim</b><br/>
    /// Code: P2208G<br/>
    /// </summary>
    [XmlEnum("P2208G")]
    Grundbuchamt_Northeim,

    /// <summary>
    /// <b>Amtsgericht Osterode</b><br/>
    /// Code: P2209<br/>
    /// </summary>
    [XmlEnum("P2209")]
    Amtsgericht_Osterode,

    /// <summary>
    /// <b>Grundbuchamt Osterode</b><br/>
    /// Code: P2209G<br/>
    /// </summary>
    [XmlEnum("P2209G")]
    Grundbuchamt_Osterode,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Reinhausen</b><br/>
    /// Code: P2210<br/>
    /// </summary>
    [XmlEnum("P2210")]
    aufgeloest_Amtsgericht_Reinhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Uslar</b><br/>
    /// Code: P2211<br/>
    /// </summary>
    [XmlEnum("P2211")]
    aufgeloest_Amtsgericht_Uslar,

    /// <summary>
    /// <b>Landgericht Hannover</b><br/>
    /// Code: P2300<br/>
    /// </summary>
    [XmlEnum("P2300")]
    Landgericht_Hannover,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hannover</b><br/>
    /// Code: P2300S<br/>
    /// </summary>
    [XmlEnum("P2300S")]
    Staatsanwaltschaft_beim_Landgericht_Hannover,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad M&#252;nder am Deister</b><br/>
    /// Code: P2301<br/>
    /// </summary>
    [XmlEnum("P2301")]
    aufgeloest_Amtsgericht_Bad_Muender_am_Deister,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Pyrmont</b><br/>
    /// Code: P2302<br/>
    /// </summary>
    [XmlEnum("P2302")]
    aufgeloest_Amtsgericht_Bad_Pyrmont,

    /// <summary>
    /// <b>Amtsgericht Burgwedel</b><br/>
    /// Code: P2303<br/>
    /// </summary>
    [XmlEnum("P2303")]
    Amtsgericht_Burgwedel,

    /// <summary>
    /// <b>Grundbuchamt Burgwedel</b><br/>
    /// Code: P2303G<br/>
    /// </summary>
    [XmlEnum("P2303G")]
    Grundbuchamt_Burgwedel,

    /// <summary>
    /// <b>Amtsgericht Hameln</b><br/>
    /// Code: P2304<br/>
    /// </summary>
    [XmlEnum("P2304")]
    Amtsgericht_Hameln,

    /// <summary>
    /// <b>Grundbuchamt Hameln</b><br/>
    /// Code: P2304G<br/>
    /// </summary>
    [XmlEnum("P2304G")]
    Grundbuchamt_Hameln,

    /// <summary>
    /// <b>Amtsgericht Hannover</b><br/>
    /// Code: P2305<br/>
    /// </summary>
    [XmlEnum("P2305")]
    Amtsgericht_Hannover,

    /// <summary>
    /// <b>Grundbuchamt Hannover</b><br/>
    /// Code: P2305G<br/>
    /// </summary>
    [XmlEnum("P2305G")]
    Grundbuchamt_Hannover,

    /// <summary>
    /// <b>Amtsgericht Neustadt a. Rbge.</b><br/>
    /// Code: P2306<br/>
    /// </summary>
    [XmlEnum("P2306")]
    Amtsgericht_Neustadt_a_Rbge,

    /// <summary>
    /// <b>Grundbuchamt Neustadt a. Rbge.</b><br/>
    /// Code: P2306G<br/>
    /// </summary>
    [XmlEnum("P2306G")]
    Grundbuchamt_Neustadt_a_Rbge,

    /// <summary>
    /// <b>Amtsgericht Springe</b><br/>
    /// Code: P2307<br/>
    /// </summary>
    [XmlEnum("P2307")]
    Amtsgericht_Springe,

    /// <summary>
    /// <b>Grundbuchamt Springe</b><br/>
    /// Code: P2307G<br/>
    /// </summary>
    [XmlEnum("P2307G")]
    Grundbuchamt_Springe,

    /// <summary>
    /// <b>Amtsgericht Wennigsen (Deister)</b><br/>
    /// Code: P2308<br/>
    /// </summary>
    [XmlEnum("P2308")]
    Amtsgericht_Wennigsen_Deister,

    /// <summary>
    /// <b>Grundbuchamt Wennigsen (Deister)</b><br/>
    /// Code: P2308G<br/>
    /// </summary>
    [XmlEnum("P2308G")]
    Grundbuchamt_Wennigsen_Deister,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lauenstein</b><br/>
    /// Code: P2309<br/>
    /// </summary>
    [XmlEnum("P2309")]
    aufgeloest_Amtsgericht_Lauenstein,

    /// <summary>
    /// <b>Landgericht Hildesheim</b><br/>
    /// Code: P2400<br/>
    /// </summary>
    [XmlEnum("P2400")]
    Landgericht_Hildesheim,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hildesheim</b><br/>
    /// Code: P2400S<br/>
    /// </summary>
    [XmlEnum("P2400S")]
    Staatsanwaltschaft_beim_Landgericht_Hildesheim,

    /// <summary>
    /// <b>Amtsgericht Alfeld</b><br/>
    /// Code: P2401<br/>
    /// </summary>
    [XmlEnum("P2401")]
    Amtsgericht_Alfeld,

    /// <summary>
    /// <b>Grundbuchamt Alfeld</b><br/>
    /// Code: P2401G<br/>
    /// </summary>
    [XmlEnum("P2401G")]
    Grundbuchamt_Alfeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bockenem</b><br/>
    /// Code: P2402<br/>
    /// </summary>
    [XmlEnum("P2402")]
    aufgeloest_Amtsgericht_Bockenem,

    /// <summary>
    /// <b>Amtsgericht Burgdorf</b><br/>
    /// Code: P2403<br/>
    /// </summary>
    [XmlEnum("P2403")]
    Amtsgericht_Burgdorf,

    /// <summary>
    /// <b>Grundbuchamt Burgdorf</b><br/>
    /// Code: P2403G<br/>
    /// </summary>
    [XmlEnum("P2403G")]
    Grundbuchamt_Burgdorf,

    /// <summary>
    /// <b>Amtsgericht Elze</b><br/>
    /// Code: P2404<br/>
    /// </summary>
    [XmlEnum("P2404")]
    Amtsgericht_Elze,

    /// <summary>
    /// <b>Grundbuchamt Elze</b><br/>
    /// Code: P2404G<br/>
    /// </summary>
    [XmlEnum("P2404G")]
    Grundbuchamt_Elze,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eschershausen</b><br/>
    /// Code: P2405<br/>
    /// </summary>
    [XmlEnum("P2405")]
    aufgeloest_Amtsgericht_Eschershausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Fallersleben</b><br/>
    /// Code: P2406<br/>
    /// </summary>
    [XmlEnum("P2406")]
    aufgeloest_Amtsgericht_Fallersleben,

    /// <summary>
    /// <b>Amtsgericht Gifhorn</b><br/>
    /// Code: P2407<br/>
    /// </summary>
    [XmlEnum("P2407")]
    Amtsgericht_Gifhorn,

    /// <summary>
    /// <b>Grundbuchamt Gifhorn</b><br/>
    /// Code: P2407G<br/>
    /// </summary>
    [XmlEnum("P2407G")]
    Grundbuchamt_Gifhorn,

    /// <summary>
    /// <b>Amtsgericht Hildesheim</b><br/>
    /// Code: P2408<br/>
    /// </summary>
    [XmlEnum("P2408")]
    Amtsgericht_Hildesheim,

    /// <summary>
    /// <b>Grundbuchamt Hildesheim</b><br/>
    /// Code: P2408G<br/>
    /// </summary>
    [XmlEnum("P2408G")]
    Grundbuchamt_Hildesheim,

    /// <summary>
    /// <b>Amtsgericht Holzminden</b><br/>
    /// Code: P2409<br/>
    /// </summary>
    [XmlEnum("P2409")]
    Amtsgericht_Holzminden,

    /// <summary>
    /// <b>Grundbuchamt Holzminden</b><br/>
    /// Code: P2409G<br/>
    /// </summary>
    [XmlEnum("P2409G")]
    Grundbuchamt_Holzminden,

    /// <summary>
    /// <b>Amtsgericht Lehrte</b><br/>
    /// Code: P2410<br/>
    /// </summary>
    [XmlEnum("P2410")]
    Amtsgericht_Lehrte,

    /// <summary>
    /// <b>Grundbuchamt Lehrte</b><br/>
    /// Code: P2410G<br/>
    /// </summary>
    [XmlEnum("P2410G")]
    Grundbuchamt_Lehrte,

    /// <summary>
    /// <b>Amtsgericht Peine</b><br/>
    /// Code: P2411<br/>
    /// </summary>
    [XmlEnum("P2411")]
    Amtsgericht_Peine,

    /// <summary>
    /// <b>Grundbuchamt Peine</b><br/>
    /// Code: P2411G<br/>
    /// </summary>
    [XmlEnum("P2411G")]
    Grundbuchamt_Peine,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stadtoldendorf</b><br/>
    /// Code: P2412<br/>
    /// </summary>
    [XmlEnum("P2412")]
    aufgeloest_Amtsgericht_Stadtoldendorf,

    /// <summary>
    /// <b>Amtsgericht Wolfsburg</b><br/>
    /// Code: P2413<br/>
    /// </summary>
    [XmlEnum("P2413")]
    Amtsgericht_Wolfsburg,

    /// <summary>
    /// <b>Grundbuchamt Wolfsburg</b><br/>
    /// Code: P2413G<br/>
    /// </summary>
    [XmlEnum("P2413G")]
    Grundbuchamt_Wolfsburg,

    /// <summary>
    /// <b>Landgericht L&#252;neburg</b><br/>
    /// Code: P2500<br/>
    /// </summary>
    [XmlEnum("P2500")]
    Landgericht_Lueneburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht L&#252;neburg</b><br/>
    /// Code: P2500S<br/>
    /// </summary>
    [XmlEnum("P2500S")]
    Staatsanwaltschaft_beim_Landgericht_Lueneburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bergen</b><br/>
    /// Code: P2501<br/>
    /// </summary>
    [XmlEnum("P2501")]
    aufgeloest_Amtsgericht_Bergen_P2501,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bleckede</b><br/>
    /// Code: P2502<br/>
    /// </summary>
    [XmlEnum("P2502")]
    aufgeloest_Amtsgericht_Bleckede,

    /// <summary>
    /// <b>Amtsgericht Celle</b><br/>
    /// Code: P2503<br/>
    /// </summary>
    [XmlEnum("P2503")]
    Amtsgericht_Celle,

    /// <summary>
    /// <b>Grundbuchamt Celle</b><br/>
    /// Code: P2503G<br/>
    /// </summary>
    [XmlEnum("P2503G")]
    Grundbuchamt_Celle,

    /// <summary>
    /// <b>Amtsgericht Dannenberg (Elbe)</b><br/>
    /// Code: P2504<br/>
    /// </summary>
    [XmlEnum("P2504")]
    Amtsgericht_Dannenberg_Elbe,

    /// <summary>
    /// <b>Grundbuchamt Dannenberg (Elbe)</b><br/>
    /// Code: P2504G<br/>
    /// </summary>
    [XmlEnum("P2504G")]
    Grundbuchamt_Dannenberg_Elbe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hankensb&#252;ttel</b><br/>
    /// Code: P2505<br/>
    /// </summary>
    [XmlEnum("P2505")]
    aufgeloest_Amtsgericht_Hankensbuettel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht L&#252;chow</b><br/>
    /// Code: P2506<br/>
    /// </summary>
    [XmlEnum("P2506")]
    aufgeloest_Amtsgericht_Luechow,

    /// <summary>
    /// <b>Amtsgericht L&#252;neburg</b><br/>
    /// Code: P2507<br/>
    /// </summary>
    [XmlEnum("P2507")]
    Amtsgericht_Lueneburg,

    /// <summary>
    /// <b>Grundbuchamt L&#252;neburg</b><br/>
    /// Code: P2507G<br/>
    /// </summary>
    [XmlEnum("P2507G")]
    Grundbuchamt_Lueneburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Medingen</b><br/>
    /// Code: P2508<br/>
    /// </summary>
    [XmlEnum("P2508")]
    aufgeloest_Amtsgericht_Medingen,

    /// <summary>
    /// <b>Amtsgericht Soltau</b><br/>
    /// Code: P2509<br/>
    /// </summary>
    [XmlEnum("P2509")]
    Amtsgericht_Soltau,

    /// <summary>
    /// <b>Grundbuchamt Soltau</b><br/>
    /// Code: P2509G<br/>
    /// </summary>
    [XmlEnum("P2509G")]
    Grundbuchamt_Soltau,

    /// <summary>
    /// <b>Amtsgericht Uelzen</b><br/>
    /// Code: P2510<br/>
    /// </summary>
    [XmlEnum("P2510")]
    Amtsgericht_Uelzen,

    /// <summary>
    /// <b>Grundbuchamt Uelzen</b><br/>
    /// Code: P2510G<br/>
    /// </summary>
    [XmlEnum("P2510G")]
    Grundbuchamt_Uelzen,

    /// <summary>
    /// <b>Amtsgericht Uelzen, Zentrales Mahngericht</b><br/>
    /// Code: P2510M<br/>
    /// </summary>
    [XmlEnum("P2510M")]
    Amtsgericht_Uelzen_Zentrales_Mahngericht,

    /// <summary>
    /// <b>Amtsgericht Winsen</b><br/>
    /// Code: P2511<br/>
    /// </summary>
    [XmlEnum("P2511")]
    Amtsgericht_Winsen,

    /// <summary>
    /// <b>Grundbuchamt Winsen</b><br/>
    /// Code: P2511G<br/>
    /// </summary>
    [XmlEnum("P2511G")]
    Grundbuchamt_Winsen,

    /// <summary>
    /// <b>Landgericht Stade</b><br/>
    /// Code: P2600<br/>
    /// </summary>
    [XmlEnum("P2600")]
    Landgericht_Stade,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Stade</b><br/>
    /// Code: P2600S<br/>
    /// </summary>
    [XmlEnum("P2600S")]
    Staatsanwaltschaft_beim_Landgericht_Stade,

    /// <summary>
    /// <b>Amtsgericht Bremerv&#246;rde</b><br/>
    /// Code: P2601<br/>
    /// </summary>
    [XmlEnum("P2601")]
    Amtsgericht_Bremervoerde,

    /// <summary>
    /// <b>Grundbuchamt Bremerv&#246;rde</b><br/>
    /// Code: P2601G<br/>
    /// </summary>
    [XmlEnum("P2601G")]
    Grundbuchamt_Bremervoerde,

    /// <summary>
    /// <b>Amtsgericht Buxtehude</b><br/>
    /// Code: P2602<br/>
    /// </summary>
    [XmlEnum("P2602")]
    Amtsgericht_Buxtehude,

    /// <summary>
    /// <b>Grundbuchamt Buxtehude</b><br/>
    /// Code: P2602G<br/>
    /// </summary>
    [XmlEnum("P2602G")]
    Grundbuchamt_Buxtehude,

    /// <summary>
    /// <b>Amtsgericht Cuxhaven</b><br/>
    /// Code: P2603<br/>
    /// </summary>
    [XmlEnum("P2603")]
    Amtsgericht_Cuxhaven,

    /// <summary>
    /// <b>Grundbuchamt Cuxhaven</b><br/>
    /// Code: P2603G<br/>
    /// </summary>
    [XmlEnum("P2603G")]
    Grundbuchamt_Cuxhaven,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dorum</b><br/>
    /// Code: P2604<br/>
    /// </summary>
    [XmlEnum("P2604")]
    aufgeloest_Amtsgericht_Dorum,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freiburg (Elbe)</b><br/>
    /// Code: P2605<br/>
    /// </summary>
    [XmlEnum("P2605")]
    aufgeloest_Amtsgericht_Freiburg_Elbe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hagen im Bremischen</b><br/>
    /// Code: P2606<br/>
    /// </summary>
    [XmlEnum("P2606")]
    aufgeloest_Amtsgericht_Hagen_im_Bremischen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Jork</b><br/>
    /// Code: P2607<br/>
    /// </summary>
    [XmlEnum("P2607")]
    aufgeloest_Amtsgericht_Jork,

    /// <summary>
    /// <b>Amtsgericht Geestland</b><br/>
    /// Code: P2608<br/>
    /// </summary>
    [XmlEnum("P2608")]
    Amtsgericht_Geestland,

    /// <summary>
    /// <b>Grundbuchamt Geestland</b><br/>
    /// Code: P2608G<br/>
    /// </summary>
    [XmlEnum("P2608G")]
    Grundbuchamt_Geestland,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neuhaus (Oste)</b><br/>
    /// Code: P2609<br/>
    /// </summary>
    [XmlEnum("P2609")]
    aufgeloest_Amtsgericht_Neuhaus_Oste,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Osten</b><br/>
    /// Code: P2610<br/>
    /// </summary>
    [XmlEnum("P2610")]
    aufgeloest_Amtsgericht_Osten,

    /// <summary>
    /// <b>Amtsgericht Otterndorf</b><br/>
    /// Code: P2611<br/>
    /// </summary>
    [XmlEnum("P2611")]
    Amtsgericht_Otterndorf,

    /// <summary>
    /// <b>Grundbuchamt Otterndorf</b><br/>
    /// Code: P2611G<br/>
    /// </summary>
    [XmlEnum("P2611G")]
    Grundbuchamt_Otterndorf,

    /// <summary>
    /// <b>Amtsgericht Stade</b><br/>
    /// Code: P2612<br/>
    /// </summary>
    [XmlEnum("P2612")]
    Amtsgericht_Stade,

    /// <summary>
    /// <b>Grundbuchamt Stade</b><br/>
    /// Code: P2612G<br/>
    /// </summary>
    [XmlEnum("P2612G")]
    Grundbuchamt_Stade,

    /// <summary>
    /// <b>Amtsgericht Tostedt</b><br/>
    /// Code: P2613<br/>
    /// </summary>
    [XmlEnum("P2613")]
    Amtsgericht_Tostedt,

    /// <summary>
    /// <b>Grundbuchamt Tostedt</b><br/>
    /// Code: P2613G<br/>
    /// </summary>
    [XmlEnum("P2613G")]
    Grundbuchamt_Tostedt,

    /// <summary>
    /// <b>Amtsgericht Zeven</b><br/>
    /// Code: P2614<br/>
    /// </summary>
    [XmlEnum("P2614")]
    Amtsgericht_Zeven,

    /// <summary>
    /// <b>Grundbuchamt Zeven</b><br/>
    /// Code: P2614G<br/>
    /// </summary>
    [XmlEnum("P2614G")]
    Grundbuchamt_Zeven,

    /// <summary>
    /// <b>F&#252;hrungsaufsichtsstelle beim Landgericht Stade</b><br/>
    /// Code: P2620<br/>
    /// </summary>
    [XmlEnum("P2620")]
    Fuehrungsaufsichtsstelle_beim_Landgericht_Stade,

    /// <summary>
    /// <b>Landgericht Verden</b><br/>
    /// Code: P2700<br/>
    /// </summary>
    [XmlEnum("P2700")]
    Landgericht_Verden,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Verden</b><br/>
    /// Code: P2700S<br/>
    /// </summary>
    [XmlEnum("P2700S")]
    Staatsanwaltschaft_beim_Landgericht_Verden,

    /// <summary>
    /// <b>Amtsgericht Achim</b><br/>
    /// Code: P2701<br/>
    /// </summary>
    [XmlEnum("P2701")]
    Amtsgericht_Achim,

    /// <summary>
    /// <b>Grundbuchamt Achim</b><br/>
    /// Code: P2701G<br/>
    /// </summary>
    [XmlEnum("P2701G")]
    Grundbuchamt_Achim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ahlden</b><br/>
    /// Code: P2702<br/>
    /// </summary>
    [XmlEnum("P2702")]
    aufgeloest_Amtsgericht_Ahlden,

    /// <summary>
    /// <b>Amtsgericht Syke Zweigstelle Bassum</b><br/>
    /// Code: P2703<br/>
    /// </summary>
    [XmlEnum("P2703")]
    Amtsgericht_Syke_Zweigstelle_Bassum,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bruchhausen-Vilsen</b><br/>
    /// Code: P2704<br/>
    /// </summary>
    [XmlEnum("P2704")]
    aufgeloest_Amtsgericht_Bruchhausen_Vilsen,

    /// <summary>
    /// <b>Amtsgericht Diepholz</b><br/>
    /// Code: P2705<br/>
    /// </summary>
    [XmlEnum("P2705")]
    Amtsgericht_Diepholz,

    /// <summary>
    /// <b>Grundbuchamt Diepholz</b><br/>
    /// Code: P2705G<br/>
    /// </summary>
    [XmlEnum("P2705G")]
    Grundbuchamt_Diepholz,

    /// <summary>
    /// <b>Amtsgericht Nienburg Zweigstelle Hoya</b><br/>
    /// Code: P2706<br/>
    /// </summary>
    [XmlEnum("P2706")]
    Amtsgericht_Nienburg_Zweigstelle_Hoya,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lilienthal</b><br/>
    /// Code: P2707<br/>
    /// </summary>
    [XmlEnum("P2707")]
    aufgeloest_Amtsgericht_Lilienthal,

    /// <summary>
    /// <b>Amtsgericht Nienburg (Weser)</b><br/>
    /// Code: P2708<br/>
    /// </summary>
    [XmlEnum("P2708")]
    Amtsgericht_Nienburg_Weser,

    /// <summary>
    /// <b>Grundbuchamt Nienburg (Weser)</b><br/>
    /// Code: P2708G<br/>
    /// </summary>
    [XmlEnum("P2708G")]
    Grundbuchamt_Nienburg_Weser,

    /// <summary>
    /// <b>Amtsgericht Osterholz-Scharmbeck</b><br/>
    /// Code: P2709<br/>
    /// </summary>
    [XmlEnum("P2709")]
    Amtsgericht_Osterholz_Scharmbeck,

    /// <summary>
    /// <b>Grundbuchamt Osterholz-Scharmbeck</b><br/>
    /// Code: P2709G<br/>
    /// </summary>
    [XmlEnum("P2709G")]
    Grundbuchamt_Osterholz_Scharmbeck,

    /// <summary>
    /// <b>Amtsgericht Rotenburg (W&#252;mme)</b><br/>
    /// Code: P2710<br/>
    /// </summary>
    [XmlEnum("P2710")]
    Amtsgericht_Rotenburg_Wuemme,

    /// <summary>
    /// <b>Grundbuchamt Rotenburg (W&#252;mme)</b><br/>
    /// Code: P2710G<br/>
    /// </summary>
    [XmlEnum("P2710G")]
    Grundbuchamt_Rotenburg_Wuemme,

    /// <summary>
    /// <b>Amtsgericht Stolzenau</b><br/>
    /// Code: P2711<br/>
    /// </summary>
    [XmlEnum("P2711")]
    Amtsgericht_Stolzenau,

    /// <summary>
    /// <b>Grundbuchamt Stolzenau</b><br/>
    /// Code: P2711G<br/>
    /// </summary>
    [XmlEnum("P2711G")]
    Grundbuchamt_Stolzenau,

    /// <summary>
    /// <b>Amtsgericht Sulingen</b><br/>
    /// Code: P2712<br/>
    /// </summary>
    [XmlEnum("P2712")]
    Amtsgericht_Sulingen,

    /// <summary>
    /// <b>Grundbuchamt Sulingen</b><br/>
    /// Code: P2712G<br/>
    /// </summary>
    [XmlEnum("P2712G")]
    Grundbuchamt_Sulingen,

    /// <summary>
    /// <b>Amtsgericht Syke</b><br/>
    /// Code: P2713<br/>
    /// </summary>
    [XmlEnum("P2713")]
    Amtsgericht_Syke,

    /// <summary>
    /// <b>Grundbuchamt Syke</b><br/>
    /// Code: P2713G<br/>
    /// </summary>
    [XmlEnum("P2713G")]
    Grundbuchamt_Syke,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Uchte</b><br/>
    /// Code: P2714<br/>
    /// </summary>
    [XmlEnum("P2714")]
    aufgeloest_Amtsgericht_Uchte,

    /// <summary>
    /// <b>Amtsgericht Verden (Aller)</b><br/>
    /// Code: P2715<br/>
    /// </summary>
    [XmlEnum("P2715")]
    Amtsgericht_Verden_Aller,

    /// <summary>
    /// <b>Grundbuchamt Verden (Aller)</b><br/>
    /// Code: P2715G<br/>
    /// </summary>
    [XmlEnum("P2715G")]
    Grundbuchamt_Verden_Aller,

    /// <summary>
    /// <b>Amtsgericht Walsrode</b><br/>
    /// Code: P2716<br/>
    /// </summary>
    [XmlEnum("P2716")]
    Amtsgericht_Walsrode,

    /// <summary>
    /// <b>Grundbuchamt Walsrode</b><br/>
    /// Code: P2716G<br/>
    /// </summary>
    [XmlEnum("P2716G")]
    Grundbuchamt_Walsrode,

    /// <summary>
    /// <b>Landgericht L&#252;neburg Zweigstelle Celle</b><br/>
    /// Code: P2800<br/>
    /// </summary>
    [XmlEnum("P2800")]
    Landgericht_Lueneburg_Zweigstelle_Celle,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Celle, Zwst. der StA L&#252;neburg</b><br/>
    /// Code: P2800S<br/>
    /// </summary>
    [XmlEnum("P2800S")]
    Staatsanwaltschaft_beim_Landgericht_Celle_Zwst_der_StA_Lueneburg,

    /// <summary>
    /// <b>Oberlandesgericht Oldenburg</b><br/>
    /// Code: P3000<br/>
    /// </summary>
    [XmlEnum("P3000")]
    Oberlandesgericht_Oldenburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Oldenburg (Oldenburg)</b><br/>
    /// Code: P3000S<br/>
    /// </summary>
    [XmlEnum("P3000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Oldenburg_Oldenburg,

    /// <summary>
    /// <b>Landgericht Aurich</b><br/>
    /// Code: P3100<br/>
    /// </summary>
    [XmlEnum("P3100")]
    Landgericht_Aurich,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Aurich</b><br/>
    /// Code: P3100S<br/>
    /// </summary>
    [XmlEnum("P3100S")]
    Staatsanwaltschaft_beim_Landgericht_Aurich,

    /// <summary>
    /// <b>Amtsgericht Aurich</b><br/>
    /// Code: P3101<br/>
    /// </summary>
    [XmlEnum("P3101")]
    Amtsgericht_Aurich,

    /// <summary>
    /// <b>Grundbuchamt Aurich</b><br/>
    /// Code: P3101G<br/>
    /// </summary>
    [XmlEnum("P3101G")]
    Grundbuchamt_Aurich,

    /// <summary>
    /// <b>Amtsgericht Emden</b><br/>
    /// Code: P3102<br/>
    /// </summary>
    [XmlEnum("P3102")]
    Amtsgericht_Emden,

    /// <summary>
    /// <b>Grundbuchamt Emden</b><br/>
    /// Code: P3102G<br/>
    /// </summary>
    [XmlEnum("P3102G")]
    Grundbuchamt_Emden,

    /// <summary>
    /// <b>Amtsgericht Wittmund Zweigstelle Esens</b><br/>
    /// Code: P3103<br/>
    /// </summary>
    [XmlEnum("P3103")]
    Amtsgericht_Wittmund_Zweigstelle_Esens,

    /// <summary>
    /// <b>Amtsgericht Leer</b><br/>
    /// Code: P3104<br/>
    /// </summary>
    [XmlEnum("P3104")]
    Amtsgericht_Leer,

    /// <summary>
    /// <b>Grundbuchamt Leer</b><br/>
    /// Code: P3104G<br/>
    /// </summary>
    [XmlEnum("P3104G")]
    Grundbuchamt_Leer,

    /// <summary>
    /// <b>Amtsgericht Norden</b><br/>
    /// Code: P3105<br/>
    /// </summary>
    [XmlEnum("P3105")]
    Amtsgericht_Norden,

    /// <summary>
    /// <b>Grundbuchamt Norden</b><br/>
    /// Code: P3105G<br/>
    /// </summary>
    [XmlEnum("P3105G")]
    Grundbuchamt_Norden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Weener</b><br/>
    /// Code: P3106<br/>
    /// </summary>
    [XmlEnum("P3106")]
    aufgeloest_Amtsgericht_Weener,

    /// <summary>
    /// <b>Amtsgericht Wittmund</b><br/>
    /// Code: P3107<br/>
    /// </summary>
    [XmlEnum("P3107")]
    Amtsgericht_Wittmund,

    /// <summary>
    /// <b>Grundbuchamt Wittmund</b><br/>
    /// Code: P3107G<br/>
    /// </summary>
    [XmlEnum("P3107G")]
    Grundbuchamt_Wittmund,

    /// <summary>
    /// <b>F&#252;hrungsaufsichtsstelle beim Landgericht Aurich</b><br/>
    /// Code: P3110<br/>
    /// </summary>
    [XmlEnum("P3110")]
    Fuehrungsaufsichtsstelle_beim_Landgericht_Aurich,

    /// <summary>
    /// <b>Landgericht Oldenburg</b><br/>
    /// Code: P3200<br/>
    /// </summary>
    [XmlEnum("P3200")]
    Landgericht_Oldenburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Oldenburg (Oldenburg)</b><br/>
    /// Code: P3200S<br/>
    /// </summary>
    [XmlEnum("P3200S")]
    Staatsanwaltschaft_beim_Landgericht_Oldenburg_Oldenburg,

    /// <summary>
    /// <b>Amtsgericht Brake</b><br/>
    /// Code: P3201<br/>
    /// </summary>
    [XmlEnum("P3201")]
    Amtsgericht_Brake,

    /// <summary>
    /// <b>Grundbuchamt Brake</b><br/>
    /// Code: P3201G<br/>
    /// </summary>
    [XmlEnum("P3201G")]
    Grundbuchamt_Brake,

    /// <summary>
    /// <b>Amtsgericht Cloppenburg</b><br/>
    /// Code: P3202<br/>
    /// </summary>
    [XmlEnum("P3202")]
    Amtsgericht_Cloppenburg,

    /// <summary>
    /// <b>Grundbuchamt Cloppenburg</b><br/>
    /// Code: P3202G<br/>
    /// </summary>
    [XmlEnum("P3202G")]
    Grundbuchamt_Cloppenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Damme</b><br/>
    /// Code: P3203<br/>
    /// </summary>
    [XmlEnum("P3203")]
    aufgeloest_Amtsgericht_Damme,

    /// <summary>
    /// <b>Amtsgericht Delmenhorst</b><br/>
    /// Code: P3204<br/>
    /// </summary>
    [XmlEnum("P3204")]
    Amtsgericht_Delmenhorst,

    /// <summary>
    /// <b>Grundbuchamt Delmenhorst</b><br/>
    /// Code: P3204G<br/>
    /// </summary>
    [XmlEnum("P3204G")]
    Grundbuchamt_Delmenhorst,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Elsfleth</b><br/>
    /// Code: P3205<br/>
    /// </summary>
    [XmlEnum("P3205")]
    aufgeloest_Amtsgericht_Elsfleth,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Friesoythe</b><br/>
    /// Code: P3206<br/>
    /// </summary>
    [XmlEnum("P3206")]
    aufgeloest_Amtsgericht_Friesoythe,

    /// <summary>
    /// <b>Amtsgericht Jever</b><br/>
    /// Code: P3207<br/>
    /// </summary>
    [XmlEnum("P3207")]
    Amtsgericht_Jever,

    /// <summary>
    /// <b>Grundbuchamt Jever</b><br/>
    /// Code: P3207G<br/>
    /// </summary>
    [XmlEnum("P3207G")]
    Grundbuchamt_Jever,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht L&#246;ningen</b><br/>
    /// Code: P3208<br/>
    /// </summary>
    [XmlEnum("P3208")]
    aufgeloest_Amtsgericht_Loeningen,

    /// <summary>
    /// <b>Amtsgericht Nordenham</b><br/>
    /// Code: P3209<br/>
    /// </summary>
    [XmlEnum("P3209")]
    Amtsgericht_Nordenham,

    /// <summary>
    /// <b>Grundbuchamt Nordenham</b><br/>
    /// Code: P3209G<br/>
    /// </summary>
    [XmlEnum("P3209G")]
    Grundbuchamt_Nordenham,

    /// <summary>
    /// <b>Amtsgericht Oldenburg (Oldenburg)</b><br/>
    /// Code: P3210<br/>
    /// </summary>
    [XmlEnum("P3210")]
    Amtsgericht_Oldenburg_Oldenburg,

    /// <summary>
    /// <b>Grundbuchamt Oldenburg (Oldenburg)</b><br/>
    /// Code: P3210G<br/>
    /// </summary>
    [XmlEnum("P3210G")]
    Grundbuchamt_Oldenburg_Oldenburg,

    /// <summary>
    /// <b>Amtsgericht Varel</b><br/>
    /// Code: P3211<br/>
    /// </summary>
    [XmlEnum("P3211")]
    Amtsgericht_Varel,

    /// <summary>
    /// <b>Grundbuchamt Varel</b><br/>
    /// Code: P3211G<br/>
    /// </summary>
    [XmlEnum("P3211G")]
    Grundbuchamt_Varel,

    /// <summary>
    /// <b>Amtsgericht Vechta</b><br/>
    /// Code: P3212<br/>
    /// </summary>
    [XmlEnum("P3212")]
    Amtsgericht_Vechta,

    /// <summary>
    /// <b>Grundbuchamt Vechta</b><br/>
    /// Code: P3212G<br/>
    /// </summary>
    [XmlEnum("P3212G")]
    Grundbuchamt_Vechta,

    /// <summary>
    /// <b>Amtsgericht Westerstede</b><br/>
    /// Code: P3213<br/>
    /// </summary>
    [XmlEnum("P3213")]
    Amtsgericht_Westerstede,

    /// <summary>
    /// <b>Grundbuchamt Westerstede</b><br/>
    /// Code: P3213G<br/>
    /// </summary>
    [XmlEnum("P3213G")]
    Grundbuchamt_Westerstede,

    /// <summary>
    /// <b>Amtsgericht Wildeshausen</b><br/>
    /// Code: P3214<br/>
    /// </summary>
    [XmlEnum("P3214")]
    Amtsgericht_Wildeshausen,

    /// <summary>
    /// <b>Grundbuchamt Wildeshausen</b><br/>
    /// Code: P3214G<br/>
    /// </summary>
    [XmlEnum("P3214G")]
    Grundbuchamt_Wildeshausen,

    /// <summary>
    /// <b>Amtsgericht Wilhelmshaven</b><br/>
    /// Code: P3215<br/>
    /// </summary>
    [XmlEnum("P3215")]
    Amtsgericht_Wilhelmshaven,

    /// <summary>
    /// <b>Grundbuchamt Wilhelmshaven</b><br/>
    /// Code: P3215G<br/>
    /// </summary>
    [XmlEnum("P3215G")]
    Grundbuchamt_Wilhelmshaven,

    /// <summary>
    /// <b>Landgericht Osnabr&#252;ck</b><br/>
    /// Code: P3300<br/>
    /// </summary>
    [XmlEnum("P3300")]
    Landgericht_Osnabrueck,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Osnabr&#252;ck</b><br/>
    /// Code: P3300S<br/>
    /// </summary>
    [XmlEnum("P3300S")]
    Staatsanwaltschaft_beim_Landgericht_Osnabrueck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bentheim</b><br/>
    /// Code: P3301<br/>
    /// </summary>
    [XmlEnum("P3301")]
    aufgeloest_Amtsgericht_Bentheim,

    /// <summary>
    /// <b>Amtsgericht Bersenbr&#252;ck</b><br/>
    /// Code: P3302<br/>
    /// </summary>
    [XmlEnum("P3302")]
    Amtsgericht_Bersenbrueck,

    /// <summary>
    /// <b>Grundbuchamt Bersenbr&#252;ck</b><br/>
    /// Code: P3302G<br/>
    /// </summary>
    [XmlEnum("P3302G")]
    Grundbuchamt_Bersenbrueck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bramsche</b><br/>
    /// Code: P3303<br/>
    /// </summary>
    [XmlEnum("P3303")]
    aufgeloest_Amtsgericht_Bramsche,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Essen</b><br/>
    /// Code: P3304<br/>
    /// </summary>
    [XmlEnum("P3304")]
    aufgeloest_Amtsgericht_Bad_Essen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freren</b><br/>
    /// Code: P3305<br/>
    /// </summary>
    [XmlEnum("P3305")]
    aufgeloest_Amtsgericht_Freren,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht F&#252;rstenau</b><br/>
    /// Code: P3306<br/>
    /// </summary>
    [XmlEnum("P3306")]
    aufgeloest_Amtsgericht_Fuerstenau,

    /// <summary>
    /// <b>Amtsgericht Bad Iburg</b><br/>
    /// Code: P3307<br/>
    /// </summary>
    [XmlEnum("P3307")]
    Amtsgericht_Bad_Iburg,

    /// <summary>
    /// <b>Grundbuchamt Bad Iburg</b><br/>
    /// Code: P3307G<br/>
    /// </summary>
    [XmlEnum("P3307G")]
    Grundbuchamt_Bad_Iburg,

    /// <summary>
    /// <b>Amtsgericht Lingen (Ems)</b><br/>
    /// Code: P3308<br/>
    /// </summary>
    [XmlEnum("P3308")]
    Amtsgericht_Lingen_Ems,

    /// <summary>
    /// <b>Grundbuchamt Lingen (Ems)</b><br/>
    /// Code: P3308G<br/>
    /// </summary>
    [XmlEnum("P3308G")]
    Grundbuchamt_Lingen_Ems,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Melle</b><br/>
    /// Code: P3309<br/>
    /// </summary>
    [XmlEnum("P3309")]
    aufgeloest_Amtsgericht_Melle,

    /// <summary>
    /// <b>Amtsgericht Meppen</b><br/>
    /// Code: P3310<br/>
    /// </summary>
    [XmlEnum("P3310")]
    Amtsgericht_Meppen,

    /// <summary>
    /// <b>Grundbuchamt Meppen</b><br/>
    /// Code: P3310G<br/>
    /// </summary>
    [XmlEnum("P3310G")]
    Grundbuchamt_Meppen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neuenhaus</b><br/>
    /// Code: P3311<br/>
    /// </summary>
    [XmlEnum("P3311")]
    aufgeloest_Amtsgericht_Neuenhaus,

    /// <summary>
    /// <b>Amtsgericht Nordhorn</b><br/>
    /// Code: P3312<br/>
    /// </summary>
    [XmlEnum("P3312")]
    Amtsgericht_Nordhorn,

    /// <summary>
    /// <b>Grundbuchamt Nordhorn</b><br/>
    /// Code: P3312G<br/>
    /// </summary>
    [XmlEnum("P3312G")]
    Grundbuchamt_Nordhorn,

    /// <summary>
    /// <b>Amtsgericht Osnabr&#252;ck</b><br/>
    /// Code: P3313<br/>
    /// </summary>
    [XmlEnum("P3313")]
    Amtsgericht_Osnabrueck,

    /// <summary>
    /// <b>Grundbuchamt Osnabr&#252;ck</b><br/>
    /// Code: P3313G<br/>
    /// </summary>
    [XmlEnum("P3313G")]
    Grundbuchamt_Osnabrueck,

    /// <summary>
    /// <b>Amtsgericht Papenburg</b><br/>
    /// Code: P3314<br/>
    /// </summary>
    [XmlEnum("P3314")]
    Amtsgericht_Papenburg,

    /// <summary>
    /// <b>Grundbuchamt Papenburg</b><br/>
    /// Code: P3314G<br/>
    /// </summary>
    [XmlEnum("P3314G")]
    Grundbuchamt_Papenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Quakenbr&#252;ck</b><br/>
    /// Code: P3315<br/>
    /// </summary>
    [XmlEnum("P3315")]
    aufgeloest_Amtsgericht_Quakenbrueck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht S&#246;gel</b><br/>
    /// Code: P3316<br/>
    /// </summary>
    [XmlEnum("P3316")]
    aufgeloest_Amtsgericht_Soegel,

    /// <summary>
    /// <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Vechta</b><br/>
    /// Code: P3400<br/>
    /// </summary>
    [XmlEnum("P3400")]
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Vechta,

    /// <summary>
    /// <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Nordenham</b><br/>
    /// Code: P3500<br/>
    /// </summary>
    [XmlEnum("P3500")]
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Nordenham,

    /// <summary>
    /// <b>Landgericht Oldenburg (Oldbg.) Strafvollstreckungskammer b.d. Amtsgericht Wilhelmshaven</b><br/>
    /// Code: P3600<br/>
    /// </summary>
    [XmlEnum("P3600")]
    Landgericht_Oldenburg_Oldbg_Strafvollstreckungskammer_b_d_Amtsgericht_Wilhelmshaven,

    /// <summary>
    /// <b>Landgericht Osnabr&#252;ck Strafvollstreckungskammer b.d. Amtsgericht Lingen</b><br/>
    /// Code: P3700<br/>
    /// </summary>
    [XmlEnum("P3700")]
    Landgericht_Osnabrueck_Strafvollstreckungskammer_b_d_Amtsgericht_Lingen,

    /// <summary>
    /// <b>Verwaltungsgericht Stade</b><br/>
    /// Code: P6098<br/>
    /// </summary>
    [XmlEnum("P6098")]
    Verwaltungsgericht_Stade,

    /// <summary>
    /// <b>Sozialgericht Aurich</b><br/>
    /// Code: P6117<br/>
    /// </summary>
    [XmlEnum("P6117")]
    Sozialgericht_Aurich,

    /// <summary>
    /// <b>Sozialgericht Braunschweig</b><br/>
    /// Code: P6118<br/>
    /// </summary>
    [XmlEnum("P6118")]
    Sozialgericht_Braunschweig,

    /// <summary>
    /// <b>Arbeitsgericht Braunschweig</b><br/>
    /// Code: P6119<br/>
    /// </summary>
    [XmlEnum("P6119")]
    Arbeitsgericht_Braunschweig,

    /// <summary>
    /// <b>Nieders&#228;chsischer Staatsgerichtshof</b><br/>
    /// Code: P6120<br/>
    /// </summary>
    [XmlEnum("P6120")]
    Niedersaechsischer_Staatsgerichtshof,

    /// <summary>
    /// <b>Arbeitsgericht Celle</b><br/>
    /// Code: P6121<br/>
    /// </summary>
    [XmlEnum("P6121")]
    Arbeitsgericht_Celle,

    /// <summary>
    /// <b>Landessozialgericht Niedersachsen-Bremen</b><br/>
    /// Code: P6122<br/>
    /// </summary>
    [XmlEnum("P6122")]
    Landessozialgericht_Niedersachsen_Bremen,

    /// <summary>
    /// <b>Arbeitsgericht Emden</b><br/>
    /// Code: P6123<br/>
    /// </summary>
    [XmlEnum("P6123")]
    Arbeitsgericht_Emden,

    /// <summary>
    /// <b>Arbeitsgericht G&#246;ttingen</b><br/>
    /// Code: P6124<br/>
    /// </summary>
    [XmlEnum("P6124")]
    Arbeitsgericht_Goettingen,

    /// <summary>
    /// <b>Arbeitsgericht Hameln</b><br/>
    /// Code: P6125<br/>
    /// </summary>
    [XmlEnum("P6125")]
    Arbeitsgericht_Hameln,

    /// <summary>
    /// <b>Verwaltungsgericht Hannover</b><br/>
    /// Code: P6126<br/>
    /// </summary>
    [XmlEnum("P6126")]
    Verwaltungsgericht_Hannover,

    /// <summary>
    /// <b>Nieders&#228;chsisches Finanzgericht</b><br/>
    /// Code: P6127<br/>
    /// </summary>
    [XmlEnum("P6127")]
    Niedersaechsisches_Finanzgericht,

    /// <summary>
    /// <b>Sozialgericht Hannover</b><br/>
    /// Code: P6128<br/>
    /// </summary>
    [XmlEnum("P6128")]
    Sozialgericht_Hannover,

    /// <summary>
    /// <b>Arbeitsgericht Hannover</b><br/>
    /// Code: P6129<br/>
    /// </summary>
    [XmlEnum("P6129")]
    Arbeitsgericht_Hannover,

    /// <summary>
    /// <b>Landesarbeitsgericht Niedersachsen</b><br/>
    /// Code: P6130<br/>
    /// </summary>
    [XmlEnum("P6130")]
    Landesarbeitsgericht_Niedersachsen,

    /// <summary>
    /// <b>Sozialgericht Hildesheim</b><br/>
    /// Code: P6131<br/>
    /// </summary>
    [XmlEnum("P6131")]
    Sozialgericht_Hildesheim,

    /// <summary>
    /// <b>Arbeitsgericht Hildesheim</b><br/>
    /// Code: P6132<br/>
    /// </summary>
    [XmlEnum("P6132")]
    Arbeitsgericht_Hildesheim,

    /// <summary>
    /// <b>Arbeitsgericht Lingen (Ems)</b><br/>
    /// Code: P6133<br/>
    /// </summary>
    [XmlEnum("P6133")]
    Arbeitsgericht_Lingen_Ems,

    /// <summary>
    /// <b>Sozialgericht L&#252;neburg</b><br/>
    /// Code: P6134<br/>
    /// </summary>
    [XmlEnum("P6134")]
    Sozialgericht_Lueneburg,

    /// <summary>
    /// <b>Arbeitsgericht L&#252;neburg</b><br/>
    /// Code: P6135<br/>
    /// </summary>
    [XmlEnum("P6135")]
    Arbeitsgericht_Lueneburg,

    /// <summary>
    /// <b>Nieders&#228;chsisches Oberverwaltungsgericht</b><br/>
    /// Code: P6136<br/>
    /// </summary>
    [XmlEnum("P6136")]
    Niedersaechsisches_Oberverwaltungsgericht,

    /// <summary>
    /// <b>Arbeitsgericht Nienburg</b><br/>
    /// Code: P6137<br/>
    /// </summary>
    [XmlEnum("P6137")]
    Arbeitsgericht_Nienburg,

    /// <summary>
    /// <b>Sozialgericht Oldenburg</b><br/>
    /// Code: P6138<br/>
    /// </summary>
    [XmlEnum("P6138")]
    Sozialgericht_Oldenburg,

    /// <summary>
    /// <b>Arbeitsgericht Osnabr&#252;ck</b><br/>
    /// Code: P6139<br/>
    /// </summary>
    [XmlEnum("P6139")]
    Arbeitsgericht_Osnabrueck,

    /// <summary>
    /// <b>Sozialgericht Stade</b><br/>
    /// Code: P6140<br/>
    /// </summary>
    [XmlEnum("P6140")]
    Sozialgericht_Stade,

    /// <summary>
    /// <b>Arbeitsgericht Stade</b><br/>
    /// Code: P6141<br/>
    /// </summary>
    [XmlEnum("P6141")]
    Arbeitsgericht_Stade,

    /// <summary>
    /// <b>Arbeitsgericht Verden</b><br/>
    /// Code: P6142<br/>
    /// </summary>
    [XmlEnum("P6142")]
    Arbeitsgericht_Verden,

    /// <summary>
    /// <b>Arbeitsgericht Wilhelmshaven</b><br/>
    /// Code: P6143<br/>
    /// </summary>
    [XmlEnum("P6143")]
    Arbeitsgericht_Wilhelmshaven,

    /// <summary>
    /// <b>Arbeitsgericht Oldenburg</b><br/>
    /// Code: P6296<br/>
    /// </summary>
    [XmlEnum("P6296")]
    Arbeitsgericht_Oldenburg,

    /// <summary>
    /// <b>Sozialgericht Osnabr&#252;ck</b><br/>
    /// Code: P6330<br/>
    /// </summary>
    [XmlEnum("P6330")]
    Sozialgericht_Osnabrueck,

    /// <summary>
    /// <b>Verwaltungsgericht Oldenburg</b><br/>
    /// Code: P6348<br/>
    /// </summary>
    [XmlEnum("P6348")]
    Verwaltungsgericht_Oldenburg,

    /// <summary>
    /// <b>Verwaltungsgericht Osnabr&#252;ck</b><br/>
    /// Code: P6395<br/>
    /// </summary>
    [XmlEnum("P6395")]
    Verwaltungsgericht_Osnabrueck,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Braunschweig</b><br/>
    /// Code: P6436<br/>
    /// </summary>
    [XmlEnum("P6436")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Braunschweig,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Celle</b><br/>
    /// Code: P6442<br/>
    /// </summary>
    [XmlEnum("P6442")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Celle,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Oldenburg</b><br/>
    /// Code: P6445<br/>
    /// </summary>
    [XmlEnum("P6445")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Oldenburg,

    /// <summary>
    /// <b>Nieders&#228;chsischer Anwaltsgerichtshof</b><br/>
    /// Code: P6447<br/>
    /// </summary>
    [XmlEnum("P6447")]
    Niedersaechsischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt f&#252;r Frauen Vechta</b><br/>
    /// Code: P6496<br/>
    /// </summary>
    [XmlEnum("P6496")]
    Justizvollzugsanstalt_fuer_Frauen_Vechta,

    /// <summary>
    /// <b>Justizvollzugsanstalt Wolfenb&#252;ttel</b><br/>
    /// Code: P6717<br/>
    /// </summary>
    [XmlEnum("P6717")]
    Justizvollzugsanstalt_Wolfenbuettel,

    /// <summary>
    /// <b>Jugendanstalt Hameln</b><br/>
    /// Code: P6951<br/>
    /// </summary>
    [XmlEnum("P6951")]
    Jugendanstalt_Hameln,

    /// <summary>
    /// <b>Justizvollzugsanstalt Vechta</b><br/>
    /// Code: P7153<br/>
    /// </summary>
    [XmlEnum("P7153")]
    Justizvollzugsanstalt_Vechta,

    /// <summary>
    /// <b>Justizvollzugsanstalt Celle</b><br/>
    /// Code: P7181<br/>
    /// </summary>
    [XmlEnum("P7181")]
    Justizvollzugsanstalt_Celle,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hannover</b><br/>
    /// Code: P7404<br/>
    /// </summary>
    [XmlEnum("P7404")]
    Justizvollzugsanstalt_Hannover,

    /// <summary>
    /// <b>Justizvollzugsanstalt Meppen</b><br/>
    /// Code: P7480<br/>
    /// </summary>
    [XmlEnum("P7480")]
    Justizvollzugsanstalt_Meppen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Uelzen</b><br/>
    /// Code: P7575<br/>
    /// </summary>
    [XmlEnum("P7575")]
    Justizvollzugsanstalt_Uelzen,

    /// <summary>
    /// <b>Jugendarrestanstalt Verden</b><br/>
    /// Code: P7581<br/>
    /// </summary>
    [XmlEnum("P7581")]
    Jugendarrestanstalt_Verden,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rosdorf</b><br/>
    /// Code: P7607<br/>
    /// </summary>
    [XmlEnum("P7607")]
    Justizvollzugsanstalt_Rosdorf,

    /// <summary>
    /// <b>Berufsgerichtshof der Ingenieurkammer Niedersachsen</b><br/>
    /// Code: P7626<br/>
    /// </summary>
    [XmlEnum("P7626")]
    Berufsgerichtshof_der_Ingenieurkammer_Niedersachsen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Sehnde</b><br/>
    /// Code: P7683<br/>
    /// </summary>
    [XmlEnum("P7683")]
    Justizvollzugsanstalt_Sehnde,

    /// <summary>
    /// <b>Justizvollzugsanstalt Oldenburg</b><br/>
    /// Code: P7698<br/>
    /// </summary>
    [XmlEnum("P7698")]
    Justizvollzugsanstalt_Oldenburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Lingen</b><br/>
    /// Code: P7744<br/>
    /// </summary>
    [XmlEnum("P7744")]
    Justizvollzugsanstalt_Lingen,

    /// <summary>
    /// <b>Verwaltungsgericht Braunschweig</b><br/>
    /// Code: P7771<br/>
    /// </summary>
    [XmlEnum("P7771")]
    Verwaltungsgericht_Braunschweig,

    /// <summary>
    /// <b>Verwaltungsgericht G&#246;ttingen</b><br/>
    /// Code: P7772<br/>
    /// </summary>
    [XmlEnum("P7772")]
    Verwaltungsgericht_Goettingen,

    /// <summary>
    /// <b>Verwaltungsgericht L&#252;neburg</b><br/>
    /// Code: P7773<br/>
    /// </summary>
    [XmlEnum("P7773")]
    Verwaltungsgericht_Lueneburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hahn&#246;fersand</b><br/>
    /// Code: P7904<br/>
    /// </summary>
    [XmlEnum("P7904")]
    Justizvollzugsanstalt_Hahnoefersand,

    /// <summary>
    /// <b>Ambulanter Justizsozialdienst Niedersachsen</b><br/>
    /// Code: P7920<br/>
    /// </summary>
    [XmlEnum("P7920")]
    Ambulanter_Justizsozialdienst_Niedersachsen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bremerv&#246;rde</b><br/>
    /// Code: P8050<br/>
    /// </summary>
    [XmlEnum("P8050")]
    Justizvollzugsanstalt_Bremervoerde,

    /// <summary>
    /// <b>Oberlandesgericht D&#252;sseldorf</b><br/>
    /// Code: R1000<br/>
    /// </summary>
    [XmlEnum("R1000")]
    Oberlandesgericht_Duesseldorf,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht D&#252;sseldorf</b><br/>
    /// Code: R1000S<br/>
    /// </summary>
    [XmlEnum("R1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Duesseldorf,

    /// <summary>
    /// <b>Strafkammer des LG M&#252;nster bei dem AG Bocholt</b><br/>
    /// Code: R1001<br/>
    /// </summary>
    [XmlEnum("R1001")]
    Strafkammer_des_LG_Muenster_bei_dem_AG_Bocholt,

    /// <summary>
    /// <b>Landgericht D&#252;sseldorf</b><br/>
    /// Code: R1100<br/>
    /// </summary>
    [XmlEnum("R1100")]
    Landgericht_Duesseldorf,

    /// <summary>
    /// <b>aufgel&#246;st-Landgericht D&#252;sseldorf</b><br/>
    /// Code: R1100Q<br/>
    /// </summary>
    [XmlEnum("R1100Q")]
    aufgeloest_Landgericht_Duesseldorf,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht D&#252;sseldorf</b><br/>
    /// Code: R1100S<br/>
    /// </summary>
    [XmlEnum("R1100S")]
    Staatsanwaltschaft_beim_Landgericht_Duesseldorf,

    /// <summary>
    /// <b>Amtsgericht D&#252;sseldorf</b><br/>
    /// Code: R1101<br/>
    /// </summary>
    [XmlEnum("R1101")]
    Amtsgericht_Duesseldorf,

    /// <summary>
    /// <b>Grundbuchamt D&#252;sseldorf</b><br/>
    /// Code: R1101G<br/>
    /// </summary>
    [XmlEnum("R1101G")]
    Grundbuchamt_Duesseldorf,

    /// <summary>
    /// <b>Amtsgericht Neuss</b><br/>
    /// Code: R1102<br/>
    /// </summary>
    [XmlEnum("R1102")]
    Amtsgericht_Neuss,

    /// <summary>
    /// <b>Grundbuchamt Neuss</b><br/>
    /// Code: R1102G<br/>
    /// </summary>
    [XmlEnum("R1102G")]
    Grundbuchamt_Neuss,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Opladen</b><br/>
    /// Code: R1103<br/>
    /// </summary>
    [XmlEnum("R1103")]
    aufgeloest_Amtsgericht_Opladen,

    /// <summary>
    /// <b>Amtsgericht Ratingen</b><br/>
    /// Code: R1104<br/>
    /// </summary>
    [XmlEnum("R1104")]
    Amtsgericht_Ratingen,

    /// <summary>
    /// <b>Grundbuchamt Ratingen</b><br/>
    /// Code: R1104G<br/>
    /// </summary>
    [XmlEnum("R1104G")]
    Grundbuchamt_Ratingen,

    /// <summary>
    /// <b>Amtsgericht Langenfeld</b><br/>
    /// Code: R1105<br/>
    /// </summary>
    [XmlEnum("R1105")]
    Amtsgericht_Langenfeld,

    /// <summary>
    /// <b>Grundbuchamt Langenfeld</b><br/>
    /// Code: R1105G<br/>
    /// </summary>
    [XmlEnum("R1105G")]
    Grundbuchamt_Langenfeld,

    /// <summary>
    /// <b>Landgericht Duisburg</b><br/>
    /// Code: R1200<br/>
    /// </summary>
    [XmlEnum("R1200")]
    Landgericht_Duisburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Duisburg</b><br/>
    /// Code: R1200S<br/>
    /// </summary>
    [XmlEnum("R1200S")]
    Staatsanwaltschaft_beim_Landgericht_Duisburg,

    /// <summary>
    /// <b>Amtsgericht Dinslaken</b><br/>
    /// Code: R1201<br/>
    /// </summary>
    [XmlEnum("R1201")]
    Amtsgericht_Dinslaken,

    /// <summary>
    /// <b>Grundbuchamt Dinslaken</b><br/>
    /// Code: R1201G<br/>
    /// </summary>
    [XmlEnum("R1201G")]
    Grundbuchamt_Dinslaken,

    /// <summary>
    /// <b>Amtsgericht Duisburg</b><br/>
    /// Code: R1202<br/>
    /// </summary>
    [XmlEnum("R1202")]
    Amtsgericht_Duisburg,

    /// <summary>
    /// <b>Grundbuchamt Duisburg</b><br/>
    /// Code: R1202G<br/>
    /// </summary>
    [XmlEnum("R1202G")]
    Grundbuchamt_Duisburg,

    /// <summary>
    /// <b>Amtsgericht Duisburg-Hamborn</b><br/>
    /// Code: R1203<br/>
    /// </summary>
    [XmlEnum("R1203")]
    Amtsgericht_Duisburg_Hamborn,

    /// <summary>
    /// <b>Grundbuchamt Duisburg-Hamborn</b><br/>
    /// Code: R1203G<br/>
    /// </summary>
    [XmlEnum("R1203G")]
    Grundbuchamt_Duisburg_Hamborn,

    /// <summary>
    /// <b>Amtsgericht Duisburg-Ruhrort</b><br/>
    /// Code: R1204<br/>
    /// </summary>
    [XmlEnum("R1204")]
    Amtsgericht_Duisburg_Ruhrort,

    /// <summary>
    /// <b>Grundbuchamt Duisburg-Ruhrort</b><br/>
    /// Code: R1204G<br/>
    /// </summary>
    [XmlEnum("R1204G")]
    Grundbuchamt_Duisburg_Ruhrort,

    /// <summary>
    /// <b>Amtsgericht M&#252;lheim</b><br/>
    /// Code: R1205<br/>
    /// </summary>
    [XmlEnum("R1205")]
    Amtsgericht_Muelheim,

    /// <summary>
    /// <b>Grundbuchamt M&#252;lheim an der Ruhr</b><br/>
    /// Code: R1205G<br/>
    /// </summary>
    [XmlEnum("R1205G")]
    Grundbuchamt_Muelheim_an_der_Ruhr,

    /// <summary>
    /// <b>Amtsgericht Oberhausen</b><br/>
    /// Code: R1206<br/>
    /// </summary>
    [XmlEnum("R1206")]
    Amtsgericht_Oberhausen,

    /// <summary>
    /// <b>Grundbuchamt Oberhausen</b><br/>
    /// Code: R1206G<br/>
    /// </summary>
    [XmlEnum("R1206G")]
    Grundbuchamt_Oberhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rees</b><br/>
    /// Code: R1207<br/>
    /// </summary>
    [XmlEnum("R1207")]
    aufgeloest_Amtsgericht_Rees,

    /// <summary>
    /// <b>Amtsgericht Wesel</b><br/>
    /// Code: R1208<br/>
    /// </summary>
    [XmlEnum("R1208")]
    Amtsgericht_Wesel,

    /// <summary>
    /// <b>Grundbuchamt Wesel</b><br/>
    /// Code: R1208G<br/>
    /// </summary>
    [XmlEnum("R1208G")]
    Grundbuchamt_Wesel,

    /// <summary>
    /// <b>Landgericht Kleve</b><br/>
    /// Code: R1300<br/>
    /// </summary>
    [XmlEnum("R1300")]
    Landgericht_Kleve,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Kleve</b><br/>
    /// Code: R1300S<br/>
    /// </summary>
    [XmlEnum("R1300S")]
    Staatsanwaltschaft_beim_Landgericht_Kleve,

    /// <summary>
    /// <b>Amtsgericht Emmerich</b><br/>
    /// Code: R1301<br/>
    /// </summary>
    [XmlEnum("R1301")]
    Amtsgericht_Emmerich,

    /// <summary>
    /// <b>Grundbuchamt Emmerich am Rhein</b><br/>
    /// Code: R1301G<br/>
    /// </summary>
    [XmlEnum("R1301G")]
    Grundbuchamt_Emmerich_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Geldern</b><br/>
    /// Code: R1302<br/>
    /// </summary>
    [XmlEnum("R1302")]
    Amtsgericht_Geldern,

    /// <summary>
    /// <b>Grundbuchamt Geldern</b><br/>
    /// Code: R1302G<br/>
    /// </summary>
    [XmlEnum("R1302G")]
    Grundbuchamt_Geldern,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Goch</b><br/>
    /// Code: R1303<br/>
    /// </summary>
    [XmlEnum("R1303")]
    aufgeloest_Amtsgericht_Goch,

    /// <summary>
    /// <b>Amtsgericht Kleve</b><br/>
    /// Code: R1304<br/>
    /// </summary>
    [XmlEnum("R1304")]
    Amtsgericht_Kleve,

    /// <summary>
    /// <b>Grundbuchamt Kleve</b><br/>
    /// Code: R1304G<br/>
    /// </summary>
    [XmlEnum("R1304G")]
    Grundbuchamt_Kleve,

    /// <summary>
    /// <b>Amtsgericht Moers</b><br/>
    /// Code: R1305<br/>
    /// </summary>
    [XmlEnum("R1305")]
    Amtsgericht_Moers,

    /// <summary>
    /// <b>Grundbuchamt Moers</b><br/>
    /// Code: R1305G<br/>
    /// </summary>
    [XmlEnum("R1305G")]
    Grundbuchamt_Moers,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Moers, Zwst. der StA Kleve</b><br/>
    /// Code: R1305S<br/>
    /// </summary>
    [XmlEnum("R1305S")]
    Staatsanwaltschaft_beim_Landgericht_Moers_Zwst_der_StA_Kleve,

    /// <summary>
    /// <b>Amtsgericht Rheinberg</b><br/>
    /// Code: R1306<br/>
    /// </summary>
    [XmlEnum("R1306")]
    Amtsgericht_Rheinberg,

    /// <summary>
    /// <b>Grundbuchamt Rheinberg</b><br/>
    /// Code: R1306G<br/>
    /// </summary>
    [XmlEnum("R1306G")]
    Grundbuchamt_Rheinberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rheinberg, Zwst. Xanten</b><br/>
    /// Code: R1307<br/>
    /// </summary>
    [XmlEnum("R1307")]
    aufgeloest_Amtsgericht_Rheinberg_Zwst_Xanten,

    /// <summary>
    /// <b>Ausw&#228;rtige Strafkammer des Landgerichts Kleve in Moers</b><br/>
    /// Code: R1310<br/>
    /// </summary>
    [XmlEnum("R1310")]
    Auswaertige_Strafkammer_des_Landgerichts_Kleve_in_Moers,

    /// <summary>
    /// <b>Landgericht Krefeld</b><br/>
    /// Code: R1400<br/>
    /// </summary>
    [XmlEnum("R1400")]
    Landgericht_Krefeld,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Krefeld</b><br/>
    /// Code: R1400S<br/>
    /// </summary>
    [XmlEnum("R1400S")]
    Staatsanwaltschaft_beim_Landgericht_Krefeld,

    /// <summary>
    /// <b>Amtsgericht Kempen</b><br/>
    /// Code: R1401<br/>
    /// </summary>
    [XmlEnum("R1401")]
    Amtsgericht_Kempen,

    /// <summary>
    /// <b>Grundbuchamt Kempen</b><br/>
    /// Code: R1401G<br/>
    /// </summary>
    [XmlEnum("R1401G")]
    Grundbuchamt_Kempen,

    /// <summary>
    /// <b>Amtsgericht Krefeld</b><br/>
    /// Code: R1402<br/>
    /// </summary>
    [XmlEnum("R1402")]
    Amtsgericht_Krefeld,

    /// <summary>
    /// <b>Grundbuchamt Krefeld</b><br/>
    /// Code: R1402G<br/>
    /// </summary>
    [XmlEnum("R1402G")]
    Grundbuchamt_Krefeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Krefeld-Uerdingen</b><br/>
    /// Code: R1403<br/>
    /// </summary>
    [XmlEnum("R1403")]
    aufgeloest_Amtsgericht_Krefeld_Uerdingen,

    /// <summary>
    /// <b>Amtsgericht Nettetal</b><br/>
    /// Code: R1404<br/>
    /// </summary>
    [XmlEnum("R1404")]
    Amtsgericht_Nettetal,

    /// <summary>
    /// <b>Grundbuchamt Nettetal</b><br/>
    /// Code: R1404G<br/>
    /// </summary>
    [XmlEnum("R1404G")]
    Grundbuchamt_Nettetal,

    /// <summary>
    /// <b>Landgericht M&#246;nchengladbach</b><br/>
    /// Code: R1500<br/>
    /// </summary>
    [XmlEnum("R1500")]
    Landgericht_Moenchengladbach,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht M&#246;nchengladbach</b><br/>
    /// Code: R1500S<br/>
    /// </summary>
    [XmlEnum("R1500S")]
    Staatsanwaltschaft_beim_Landgericht_Moenchengladbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht D&#252;lken</b><br/>
    /// Code: R1501<br/>
    /// </summary>
    [XmlEnum("R1501")]
    aufgeloest_Amtsgericht_Duelken,

    /// <summary>
    /// <b>Amtsgericht Erkelenz</b><br/>
    /// Code: R1502<br/>
    /// </summary>
    [XmlEnum("R1502")]
    Amtsgericht_Erkelenz,

    /// <summary>
    /// <b>Grundbuchamt Erkelenz</b><br/>
    /// Code: R1502G<br/>
    /// </summary>
    [XmlEnum("R1502G")]
    Grundbuchamt_Erkelenz,

    /// <summary>
    /// <b>Amtsgericht Grevenbroich</b><br/>
    /// Code: R1503<br/>
    /// </summary>
    [XmlEnum("R1503")]
    Amtsgericht_Grevenbroich,

    /// <summary>
    /// <b>Grundbuchamt Grevenbroich</b><br/>
    /// Code: R1503G<br/>
    /// </summary>
    [XmlEnum("R1503G")]
    Grundbuchamt_Grevenbroich,

    /// <summary>
    /// <b>Amtsgericht M&#246;nchengladbach</b><br/>
    /// Code: R1504<br/>
    /// </summary>
    [XmlEnum("R1504")]
    Amtsgericht_Moenchengladbach,

    /// <summary>
    /// <b>Grundbuchamt M&#246;nchengladbach</b><br/>
    /// Code: R1504G<br/>
    /// </summary>
    [XmlEnum("R1504G")]
    Grundbuchamt_Moenchengladbach,

    /// <summary>
    /// <b>Amtsgericht M&#246;nchengladbach-Rheydt</b><br/>
    /// Code: R1505<br/>
    /// </summary>
    [XmlEnum("R1505")]
    Amtsgericht_Moenchengladbach_Rheydt,

    /// <summary>
    /// <b>Grundbuchamt M&#246;nchengladbach-Rheydt</b><br/>
    /// Code: R1505G<br/>
    /// </summary>
    [XmlEnum("R1505G")]
    Grundbuchamt_Moenchengladbach_Rheydt,

    /// <summary>
    /// <b>Amtsgericht Viersen</b><br/>
    /// Code: R1506<br/>
    /// </summary>
    [XmlEnum("R1506")]
    Amtsgericht_Viersen,

    /// <summary>
    /// <b>Grundbuchamt Viersen</b><br/>
    /// Code: R1506G<br/>
    /// </summary>
    [XmlEnum("R1506G")]
    Grundbuchamt_Viersen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Erkelenz, Zwst. Wegberg</b><br/>
    /// Code: R1507<br/>
    /// </summary>
    [XmlEnum("R1507")]
    aufgeloest_Amtsgericht_Erkelenz_Zwst_Wegberg,

    /// <summary>
    /// <b>Landgericht Wuppertal</b><br/>
    /// Code: R1600<br/>
    /// </summary>
    [XmlEnum("R1600")]
    Landgericht_Wuppertal,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Wuppertal</b><br/>
    /// Code: R1600S<br/>
    /// </summary>
    [XmlEnum("R1600S")]
    Staatsanwaltschaft_beim_Landgericht_Wuppertal,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Langenberg</b><br/>
    /// Code: R1601<br/>
    /// </summary>
    [XmlEnum("R1601")]
    aufgeloest_Amtsgericht_Langenberg,

    /// <summary>
    /// <b>Amtsgericht Mettmann</b><br/>
    /// Code: R1602<br/>
    /// </summary>
    [XmlEnum("R1602")]
    Amtsgericht_Mettmann,

    /// <summary>
    /// <b>Grundbuchamt Mettmann</b><br/>
    /// Code: R1602G<br/>
    /// </summary>
    [XmlEnum("R1602G")]
    Grundbuchamt_Mettmann,

    /// <summary>
    /// <b>Amtsgericht Remscheid</b><br/>
    /// Code: R1603<br/>
    /// </summary>
    [XmlEnum("R1603")]
    Amtsgericht_Remscheid,

    /// <summary>
    /// <b>Grundbuchamt Remscheid</b><br/>
    /// Code: R1603G<br/>
    /// </summary>
    [XmlEnum("R1603G")]
    Grundbuchamt_Remscheid,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Remscheid-Lennep</b><br/>
    /// Code: R1604<br/>
    /// </summary>
    [XmlEnum("R1604")]
    aufgeloest_Amtsgericht_Remscheid_Lennep,

    /// <summary>
    /// <b>Amtsgericht Solingen</b><br/>
    /// Code: R1605<br/>
    /// </summary>
    [XmlEnum("R1605")]
    Amtsgericht_Solingen,

    /// <summary>
    /// <b>Grundbuchamt Solingen</b><br/>
    /// Code: R1605G<br/>
    /// </summary>
    [XmlEnum("R1605G")]
    Grundbuchamt_Solingen,

    /// <summary>
    /// <b>Amtsgericht Velbert</b><br/>
    /// Code: R1606<br/>
    /// </summary>
    [XmlEnum("R1606")]
    Amtsgericht_Velbert,

    /// <summary>
    /// <b>Grundbuchamt Velbert</b><br/>
    /// Code: R1606G<br/>
    /// </summary>
    [XmlEnum("R1606G")]
    Grundbuchamt_Velbert,

    /// <summary>
    /// <b>Amtsgericht Wuppertal</b><br/>
    /// Code: R1608<br/>
    /// </summary>
    [XmlEnum("R1608")]
    Amtsgericht_Wuppertal,

    /// <summary>
    /// <b>Grundbuchamt Wuppertal</b><br/>
    /// Code: R1608G<br/>
    /// </summary>
    [XmlEnum("R1608G")]
    Grundbuchamt_Wuppertal,

    /// <summary>
    /// <b>Landgericht Arnsberg</b><br/>
    /// Code: R1900<br/>
    /// </summary>
    [XmlEnum("R1900")]
    Landgericht_Arnsberg,

    /// <summary>
    /// <b>aufgel&#246;st-Landgericht Arnsberg</b><br/>
    /// Code: R1900Q<br/>
    /// </summary>
    [XmlEnum("R1900Q")]
    aufgeloest_Landgericht_Arnsberg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Arnsberg</b><br/>
    /// Code: R1900S<br/>
    /// </summary>
    [XmlEnum("R1900S")]
    Staatsanwaltschaft_beim_Landgericht_Arnsberg,

    /// <summary>
    /// <b>Amtsgericht Arnsberg</b><br/>
    /// Code: R1901<br/>
    /// </summary>
    [XmlEnum("R1901")]
    Amtsgericht_Arnsberg,

    /// <summary>
    /// <b>Grundbuchamt Arnsberg</b><br/>
    /// Code: R1901G<br/>
    /// </summary>
    [XmlEnum("R1901G")]
    Grundbuchamt_Arnsberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Balve</b><br/>
    /// Code: R1902<br/>
    /// </summary>
    [XmlEnum("R1902")]
    aufgeloest_Amtsgericht_Balve,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bigge</b><br/>
    /// Code: R1903<br/>
    /// </summary>
    [XmlEnum("R1903")]
    aufgeloest_Amtsgericht_Bigge,

    /// <summary>
    /// <b>Amtsgericht Brilon</b><br/>
    /// Code: R1904<br/>
    /// </summary>
    [XmlEnum("R1904")]
    Amtsgericht_Brilon,

    /// <summary>
    /// <b>Grundbuchamt Brilon</b><br/>
    /// Code: R1904G<br/>
    /// </summary>
    [XmlEnum("R1904G")]
    Grundbuchamt_Brilon,

    /// <summary>
    /// <b>Amtsgericht Schmallenberg</b><br/>
    /// Code: R1905<br/>
    /// </summary>
    [XmlEnum("R1905")]
    Amtsgericht_Schmallenberg,

    /// <summary>
    /// <b>Grundbuchamt Schmallenberg</b><br/>
    /// Code: R1905G<br/>
    /// </summary>
    [XmlEnum("R1905G")]
    Grundbuchamt_Schmallenberg,

    /// <summary>
    /// <b>Amtsgericht Marsberg</b><br/>
    /// Code: R1906<br/>
    /// </summary>
    [XmlEnum("R1906")]
    Amtsgericht_Marsberg,

    /// <summary>
    /// <b>Grundbuchamt Marsberg</b><br/>
    /// Code: R1906G<br/>
    /// </summary>
    [XmlEnum("R1906G")]
    Grundbuchamt_Marsberg,

    /// <summary>
    /// <b>Amtsgericht Medebach</b><br/>
    /// Code: R1907<br/>
    /// </summary>
    [XmlEnum("R1907")]
    Amtsgericht_Medebach,

    /// <summary>
    /// <b>Grundbuchamt Medebach</b><br/>
    /// Code: R1907G<br/>
    /// </summary>
    [XmlEnum("R1907G")]
    Grundbuchamt_Medebach,

    /// <summary>
    /// <b>Amtsgericht Menden</b><br/>
    /// Code: R1908<br/>
    /// </summary>
    [XmlEnum("R1908")]
    Amtsgericht_Menden,

    /// <summary>
    /// <b>Grundbuchamt Menden</b><br/>
    /// Code: R1908G<br/>
    /// </summary>
    [XmlEnum("R1908G")]
    Grundbuchamt_Menden,

    /// <summary>
    /// <b>Amtsgericht Meschede</b><br/>
    /// Code: R1909<br/>
    /// </summary>
    [XmlEnum("R1909")]
    Amtsgericht_Meschede,

    /// <summary>
    /// <b>Grundbuchamt Meschede</b><br/>
    /// Code: R1909G<br/>
    /// </summary>
    [XmlEnum("R1909G")]
    Grundbuchamt_Meschede,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neheim-H&#252;sten</b><br/>
    /// Code: R1910<br/>
    /// </summary>
    [XmlEnum("R1910")]
    aufgeloest_Amtsgericht_Neheim_Huesten,

    /// <summary>
    /// <b>Amtsgericht Soest</b><br/>
    /// Code: R1911<br/>
    /// </summary>
    [XmlEnum("R1911")]
    Amtsgericht_Soest,

    /// <summary>
    /// <b>Grundbuchamt Soest</b><br/>
    /// Code: R1911G<br/>
    /// </summary>
    [XmlEnum("R1911G")]
    Grundbuchamt_Soest,

    /// <summary>
    /// <b>Amtsgericht Warstein</b><br/>
    /// Code: R1912<br/>
    /// </summary>
    [XmlEnum("R1912")]
    Amtsgericht_Warstein,

    /// <summary>
    /// <b>Grundbuchamt Warstein</b><br/>
    /// Code: R1912G<br/>
    /// </summary>
    [XmlEnum("R1912G")]
    Grundbuchamt_Warstein,

    /// <summary>
    /// <b>Amtsgericht Werl</b><br/>
    /// Code: R1913<br/>
    /// </summary>
    [XmlEnum("R1913")]
    Amtsgericht_Werl,

    /// <summary>
    /// <b>Grundbuchamt Werl</b><br/>
    /// Code: R1913G<br/>
    /// </summary>
    [XmlEnum("R1913G")]
    Grundbuchamt_Werl,

    /// <summary>
    /// <b>Oberlandesgericht Hamm</b><br/>
    /// Code: R2000<br/>
    /// </summary>
    [XmlEnum("R2000")]
    Oberlandesgericht_Hamm,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Hamm</b><br/>
    /// Code: R2000S<br/>
    /// </summary>
    [XmlEnum("R2000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Hamm,

    /// <summary>
    /// <b>Landgericht Bielefeld</b><br/>
    /// Code: R2100<br/>
    /// </summary>
    [XmlEnum("R2100")]
    Landgericht_Bielefeld,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bielefeld</b><br/>
    /// Code: R2100S<br/>
    /// </summary>
    [XmlEnum("R2100S")]
    Staatsanwaltschaft_beim_Landgericht_Bielefeld,

    /// <summary>
    /// <b>Amtsgericht Bielefeld</b><br/>
    /// Code: R2101<br/>
    /// </summary>
    [XmlEnum("R2101")]
    Amtsgericht_Bielefeld,

    /// <summary>
    /// <b>Grundbuchamt Bielefeld</b><br/>
    /// Code: R2101G<br/>
    /// </summary>
    [XmlEnum("R2101G")]
    Grundbuchamt_Bielefeld,

    /// <summary>
    /// <b>Amtsgericht B&#252;nde</b><br/>
    /// Code: R2102<br/>
    /// </summary>
    [XmlEnum("R2102")]
    Amtsgericht_Buende,

    /// <summary>
    /// <b>Grundbuchamt B&#252;nde</b><br/>
    /// Code: R2102G<br/>
    /// </summary>
    [XmlEnum("R2102G")]
    Grundbuchamt_Buende,

    /// <summary>
    /// <b>Amtsgericht G&#252;tersloh</b><br/>
    /// Code: R2103<br/>
    /// </summary>
    [XmlEnum("R2103")]
    Amtsgericht_Guetersloh,

    /// <summary>
    /// <b>Grundbuchamt G&#252;tersloh</b><br/>
    /// Code: R2103G<br/>
    /// </summary>
    [XmlEnum("R2103G")]
    Grundbuchamt_Guetersloh,

    /// <summary>
    /// <b>Amtsgericht Halle</b><br/>
    /// Code: R2104<br/>
    /// </summary>
    [XmlEnum("R2104")]
    Amtsgericht_Halle,

    /// <summary>
    /// <b>Grundbuchamt Halle (Westf.)</b><br/>
    /// Code: R2104G<br/>
    /// </summary>
    [XmlEnum("R2104G")]
    Grundbuchamt_Halle_Westf,

    /// <summary>
    /// <b>Amtsgericht Herford</b><br/>
    /// Code: R2105<br/>
    /// </summary>
    [XmlEnum("R2105")]
    Amtsgericht_Herford,

    /// <summary>
    /// <b>Grundbuchamt Herford</b><br/>
    /// Code: R2105G<br/>
    /// </summary>
    [XmlEnum("R2105G")]
    Grundbuchamt_Herford,

    /// <summary>
    /// <b>Amtsgericht L&#252;bbecke</b><br/>
    /// Code: R2106<br/>
    /// </summary>
    [XmlEnum("R2106")]
    Amtsgericht_Luebbecke,

    /// <summary>
    /// <b>Grundbuchamt L&#252;bbecke</b><br/>
    /// Code: R2106G<br/>
    /// </summary>
    [XmlEnum("R2106G")]
    Grundbuchamt_Luebbecke,

    /// <summary>
    /// <b>Amtsgericht Minden</b><br/>
    /// Code: R2107<br/>
    /// </summary>
    [XmlEnum("R2107")]
    Amtsgericht_Minden,

    /// <summary>
    /// <b>Grundbuchamt Minden</b><br/>
    /// Code: R2107G<br/>
    /// </summary>
    [XmlEnum("R2107G")]
    Grundbuchamt_Minden,

    /// <summary>
    /// <b>Amtsgericht Bad Oeynhausen</b><br/>
    /// Code: R2108<br/>
    /// </summary>
    [XmlEnum("R2108")]
    Amtsgericht_Bad_Oeynhausen,

    /// <summary>
    /// <b>Grundbuchamt Bad Oeynhausen</b><br/>
    /// Code: R2108G<br/>
    /// </summary>
    [XmlEnum("R2108G")]
    Grundbuchamt_Bad_Oeynhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Petershagen</b><br/>
    /// Code: R2109<br/>
    /// </summary>
    [XmlEnum("R2109")]
    aufgeloest_Amtsgericht_Petershagen,

    /// <summary>
    /// <b>Amtsgericht Rahden</b><br/>
    /// Code: R2110<br/>
    /// </summary>
    [XmlEnum("R2110")]
    Amtsgericht_Rahden,

    /// <summary>
    /// <b>Grundbuchamt Rahden</b><br/>
    /// Code: R2110G<br/>
    /// </summary>
    [XmlEnum("R2110G")]
    Grundbuchamt_Rahden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rietberg</b><br/>
    /// Code: R2111<br/>
    /// </summary>
    [XmlEnum("R2111")]
    aufgeloest_Amtsgericht_Rietberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Oeynhausen, Zwst. Vlotho</b><br/>
    /// Code: R2112<br/>
    /// </summary>
    [XmlEnum("R2112")]
    aufgeloest_Amtsgericht_Bad_Oeynhausen_Zwst_Vlotho,

    /// <summary>
    /// <b>Amtsgericht Rheda-Wiedenbr&#252;ck</b><br/>
    /// Code: R2113<br/>
    /// </summary>
    [XmlEnum("R2113")]
    Amtsgericht_Rheda_Wiedenbrueck,

    /// <summary>
    /// <b>Grundbuchamt Rheda-Wiedenbr&#252;ck</b><br/>
    /// Code: R2113G<br/>
    /// </summary>
    [XmlEnum("R2113G")]
    Grundbuchamt_Rheda_Wiedenbrueck,

    /// <summary>
    /// <b>Landgericht Bochum</b><br/>
    /// Code: R2200<br/>
    /// </summary>
    [XmlEnum("R2200")]
    Landgericht_Bochum,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bochum</b><br/>
    /// Code: R2200S<br/>
    /// </summary>
    [XmlEnum("R2200S")]
    Staatsanwaltschaft_beim_Landgericht_Bochum,

    /// <summary>
    /// <b>Amtsgericht Bochum</b><br/>
    /// Code: R2201<br/>
    /// </summary>
    [XmlEnum("R2201")]
    Amtsgericht_Bochum,

    /// <summary>
    /// <b>Grundbuchamt Bochum</b><br/>
    /// Code: R2201G<br/>
    /// </summary>
    [XmlEnum("R2201G")]
    Grundbuchamt_Bochum,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bochum-Langendreer</b><br/>
    /// Code: R2202<br/>
    /// </summary>
    [XmlEnum("R2202")]
    aufgeloest_Amtsgericht_Bochum_Langendreer,

    /// <summary>
    /// <b>Amtsgericht Herne</b><br/>
    /// Code: R2203<br/>
    /// </summary>
    [XmlEnum("R2203")]
    Amtsgericht_Herne,

    /// <summary>
    /// <b>Grundbuchamt Herne</b><br/>
    /// Code: R2203G<br/>
    /// </summary>
    [XmlEnum("R2203G")]
    Grundbuchamt_Herne,

    /// <summary>
    /// <b>Amtsgericht Recklinghausen</b><br/>
    /// Code: R2204<br/>
    /// </summary>
    [XmlEnum("R2204")]
    Amtsgericht_Recklinghausen,

    /// <summary>
    /// <b>Grundbuchamt Recklinghausen</b><br/>
    /// Code: R2204G<br/>
    /// </summary>
    [XmlEnum("R2204G")]
    Grundbuchamt_Recklinghausen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Recklinghausen, Zwst. der StA Bochum</b><br/>
    /// Code: R2204S<br/>
    /// </summary>
    [XmlEnum("R2204S")]
    Staatsanwaltschaft_beim_Landgericht_Recklinghausen_Zwst_der_StA_Bochum,

    /// <summary>
    /// <b>Amtsgericht Herne-Wanne</b><br/>
    /// Code: R2205<br/>
    /// </summary>
    [XmlEnum("R2205")]
    Amtsgericht_Herne_Wanne,

    /// <summary>
    /// <b>Grundbuchamt Herne-Wanne</b><br/>
    /// Code: R2205G<br/>
    /// </summary>
    [XmlEnum("R2205G")]
    Grundbuchamt_Herne_Wanne,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wattenscheid</b><br/>
    /// Code: R2206<br/>
    /// </summary>
    [XmlEnum("R2206")]
    aufgeloest_Amtsgericht_Wattenscheid,

    /// <summary>
    /// <b>Amtsgericht Witten</b><br/>
    /// Code: R2207<br/>
    /// </summary>
    [XmlEnum("R2207")]
    Amtsgericht_Witten,

    /// <summary>
    /// <b>Grundbuchamt Witten</b><br/>
    /// Code: R2207G<br/>
    /// </summary>
    [XmlEnum("R2207G")]
    Grundbuchamt_Witten,

    /// <summary>
    /// <b>Landgericht Bochum Ausw&#228;rtige Strafkammer Recklinghsn.</b><br/>
    /// Code: R2210<br/>
    /// </summary>
    [XmlEnum("R2210")]
    Landgericht_Bochum_Auswaertige_Strafkammer_Recklinghsn,

    /// <summary>
    /// <b>Landgericht Detmold</b><br/>
    /// Code: R2300<br/>
    /// </summary>
    [XmlEnum("R2300")]
    Landgericht_Detmold,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Detmold</b><br/>
    /// Code: R2300S<br/>
    /// </summary>
    [XmlEnum("R2300S")]
    Staatsanwaltschaft_beim_Landgericht_Detmold,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Alverdissen</b><br/>
    /// Code: R2301<br/>
    /// </summary>
    [XmlEnum("R2301")]
    aufgeloest_Amtsgericht_Alverdissen,

    /// <summary>
    /// <b>Amtsgericht Blomberg</b><br/>
    /// Code: R2302<br/>
    /// </summary>
    [XmlEnum("R2302")]
    Amtsgericht_Blomberg,

    /// <summary>
    /// <b>Grundbuchamt Blomberg</b><br/>
    /// Code: R2302G<br/>
    /// </summary>
    [XmlEnum("R2302G")]
    Grundbuchamt_Blomberg,

    /// <summary>
    /// <b>Amtsgericht Detmold</b><br/>
    /// Code: R2303<br/>
    /// </summary>
    [XmlEnum("R2303")]
    Amtsgericht_Detmold,

    /// <summary>
    /// <b>Grundbuchamt Detmold</b><br/>
    /// Code: R2303G<br/>
    /// </summary>
    [XmlEnum("R2303G")]
    Grundbuchamt_Detmold,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hohenhausen</b><br/>
    /// Code: R2304<br/>
    /// </summary>
    [XmlEnum("R2304")]
    aufgeloest_Amtsgericht_Hohenhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Horn</b><br/>
    /// Code: R2305<br/>
    /// </summary>
    [XmlEnum("R2305")]
    aufgeloest_Amtsgericht_Horn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lage</b><br/>
    /// Code: R2306<br/>
    /// </summary>
    [XmlEnum("R2306")]
    aufgeloest_Amtsgericht_Lage,

    /// <summary>
    /// <b>Amtsgericht Lemgo</b><br/>
    /// Code: R2307<br/>
    /// </summary>
    [XmlEnum("R2307")]
    Amtsgericht_Lemgo,

    /// <summary>
    /// <b>Grundbuchamt Lemgo</b><br/>
    /// Code: R2307G<br/>
    /// </summary>
    [XmlEnum("R2307G")]
    Grundbuchamt_Lemgo,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Oerlinghausen</b><br/>
    /// Code: R2308<br/>
    /// </summary>
    [XmlEnum("R2308")]
    aufgeloest_Amtsgericht_Oerlinghausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Salzuflen</b><br/>
    /// Code: R2309<br/>
    /// </summary>
    [XmlEnum("R2309")]
    aufgeloest_Amtsgericht_Bad_Salzuflen,

    /// <summary>
    /// <b>Landgericht Dortmund</b><br/>
    /// Code: R2400<br/>
    /// </summary>
    [XmlEnum("R2400")]
    Landgericht_Dortmund,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Dortmund</b><br/>
    /// Code: R2400S<br/>
    /// </summary>
    [XmlEnum("R2400S")]
    Staatsanwaltschaft_beim_Landgericht_Dortmund,

    /// <summary>
    /// <b>Amtsgericht Castrop-Rauxel</b><br/>
    /// Code: R2401<br/>
    /// </summary>
    [XmlEnum("R2401")]
    Amtsgericht_Castrop_Rauxel,

    /// <summary>
    /// <b>Grundbuchamt Castrop-Rauxel</b><br/>
    /// Code: R2401G<br/>
    /// </summary>
    [XmlEnum("R2401G")]
    Grundbuchamt_Castrop_Rauxel,

    /// <summary>
    /// <b>Amtsgericht Dortmund</b><br/>
    /// Code: R2402<br/>
    /// </summary>
    [XmlEnum("R2402")]
    Amtsgericht_Dortmund,

    /// <summary>
    /// <b>Grundbuchamt Dortmund</b><br/>
    /// Code: R2402G<br/>
    /// </summary>
    [XmlEnum("R2402G")]
    Grundbuchamt_Dortmund,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dortmund-H&#246;rde</b><br/>
    /// Code: R2403<br/>
    /// </summary>
    [XmlEnum("R2403")]
    aufgeloest_Amtsgericht_Dortmund_Hoerde,

    /// <summary>
    /// <b>Amtsgericht Hamm</b><br/>
    /// Code: R2404<br/>
    /// </summary>
    [XmlEnum("R2404")]
    Amtsgericht_Hamm,

    /// <summary>
    /// <b>Grundbuchamt Hamm</b><br/>
    /// Code: R2404G<br/>
    /// </summary>
    [XmlEnum("R2404G")]
    Grundbuchamt_Hamm,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hamm, Zwst. der StA Dortmund</b><br/>
    /// Code: R2404S<br/>
    /// </summary>
    [XmlEnum("R2404S")]
    Staatsanwaltschaft_beim_Landgericht_Hamm_Zwst_der_StA_Dortmund,

    /// <summary>
    /// <b>Amtsgericht Kamen</b><br/>
    /// Code: R2405<br/>
    /// </summary>
    [XmlEnum("R2405")]
    Amtsgericht_Kamen,

    /// <summary>
    /// <b>Grundbuchamt Kamen</b><br/>
    /// Code: R2405G<br/>
    /// </summary>
    [XmlEnum("R2405G")]
    Grundbuchamt_Kamen,

    /// <summary>
    /// <b>Amtsgericht L&#252;nen</b><br/>
    /// Code: R2406<br/>
    /// </summary>
    [XmlEnum("R2406")]
    Amtsgericht_Luenen,

    /// <summary>
    /// <b>Grundbuchamt L&#252;nen</b><br/>
    /// Code: R2406G<br/>
    /// </summary>
    [XmlEnum("R2406G")]
    Grundbuchamt_Luenen,

    /// <summary>
    /// <b>Amtsgericht Unna</b><br/>
    /// Code: R2407<br/>
    /// </summary>
    [XmlEnum("R2407")]
    Amtsgericht_Unna,

    /// <summary>
    /// <b>Grundbuchamt Unna</b><br/>
    /// Code: R2407G<br/>
    /// </summary>
    [XmlEnum("R2407G")]
    Grundbuchamt_Unna,

    /// <summary>
    /// <b>Amtsgericht L&#252;nen Zweigstelle Werne</b><br/>
    /// Code: R2408<br/>
    /// </summary>
    [XmlEnum("R2408")]
    Amtsgericht_Luenen_Zweigstelle_Werne,

    /// <summary>
    /// <b>Landgericht Essen</b><br/>
    /// Code: R2500<br/>
    /// </summary>
    [XmlEnum("R2500")]
    Landgericht_Essen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Essen</b><br/>
    /// Code: R2500S<br/>
    /// </summary>
    [XmlEnum("R2500S")]
    Staatsanwaltschaft_beim_Landgericht_Essen,

    /// <summary>
    /// <b>Amtsgericht Bottrop</b><br/>
    /// Code: R2501<br/>
    /// </summary>
    [XmlEnum("R2501")]
    Amtsgericht_Bottrop,

    /// <summary>
    /// <b>Grundbuchamt Bottrop</b><br/>
    /// Code: R2501G<br/>
    /// </summary>
    [XmlEnum("R2501G")]
    Grundbuchamt_Bottrop,

    /// <summary>
    /// <b>Amtsgericht Dorsten</b><br/>
    /// Code: R2502<br/>
    /// </summary>
    [XmlEnum("R2502")]
    Amtsgericht_Dorsten,

    /// <summary>
    /// <b>Grundbuchamt Dorsten</b><br/>
    /// Code: R2502G<br/>
    /// </summary>
    [XmlEnum("R2502G")]
    Grundbuchamt_Dorsten,

    /// <summary>
    /// <b>Amtsgericht Essen</b><br/>
    /// Code: R2503<br/>
    /// </summary>
    [XmlEnum("R2503")]
    Amtsgericht_Essen,

    /// <summary>
    /// <b>Grundbuchamt Essen</b><br/>
    /// Code: R2503G<br/>
    /// </summary>
    [XmlEnum("R2503G")]
    Grundbuchamt_Essen,

    /// <summary>
    /// <b>Amtsgericht Essen-Borbeck</b><br/>
    /// Code: R2504<br/>
    /// </summary>
    [XmlEnum("R2504")]
    Amtsgericht_Essen_Borbeck,

    /// <summary>
    /// <b>Grundbuchamt Essen-Borbeck</b><br/>
    /// Code: R2504G<br/>
    /// </summary>
    [XmlEnum("R2504G")]
    Grundbuchamt_Essen_Borbeck,

    /// <summary>
    /// <b>Amtsgericht Essen-Steele</b><br/>
    /// Code: R2505<br/>
    /// </summary>
    [XmlEnum("R2505")]
    Amtsgericht_Essen_Steele,

    /// <summary>
    /// <b>Grundbuchamt Essen-Steele</b><br/>
    /// Code: R2505G<br/>
    /// </summary>
    [XmlEnum("R2505G")]
    Grundbuchamt_Essen_Steele,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Essen-Werden</b><br/>
    /// Code: R2506<br/>
    /// </summary>
    [XmlEnum("R2506")]
    aufgeloest_Amtsgericht_Essen_Werden,

    /// <summary>
    /// <b>Amtsgericht Gelsenkirchen</b><br/>
    /// Code: R2507<br/>
    /// </summary>
    [XmlEnum("R2507")]
    Amtsgericht_Gelsenkirchen,

    /// <summary>
    /// <b>Grundbuchamt Gelsenkirchen</b><br/>
    /// Code: R2507G<br/>
    /// </summary>
    [XmlEnum("R2507G")]
    Grundbuchamt_Gelsenkirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gelsenkirchen-Buer</b><br/>
    /// Code: R2508<br/>
    /// </summary>
    [XmlEnum("R2508")]
    aufgeloest_Amtsgericht_Gelsenkirchen_Buer,

    /// <summary>
    /// <b>aufgel&#246;st-Grundbuchamt Gelsenkirchen</b><br/>
    /// Code: R2508G<br/>
    /// </summary>
    [XmlEnum("R2508G")]
    aufgeloest_Grundbuchamt_Gelsenkirchen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Gelsenkirchen, Zwst. der StA Essen</b><br/>
    /// Code: R2508S<br/>
    /// </summary>
    [XmlEnum("R2508S")]
    Staatsanwaltschaft_beim_Landgericht_Gelsenkirchen_Zwst_der_StA_Essen,

    /// <summary>
    /// <b>Amtsgericht Gladbeck</b><br/>
    /// Code: R2509<br/>
    /// </summary>
    [XmlEnum("R2509")]
    Amtsgericht_Gladbeck,

    /// <summary>
    /// <b>Grundbuchamt Gladbeck</b><br/>
    /// Code: R2509G<br/>
    /// </summary>
    [XmlEnum("R2509G")]
    Grundbuchamt_Gladbeck,

    /// <summary>
    /// <b>Amtsgericht Hattingen</b><br/>
    /// Code: R2510<br/>
    /// </summary>
    [XmlEnum("R2510")]
    Amtsgericht_Hattingen,

    /// <summary>
    /// <b>Grundbuchamt Hattingen</b><br/>
    /// Code: R2510G<br/>
    /// </summary>
    [XmlEnum("R2510G")]
    Grundbuchamt_Hattingen,

    /// <summary>
    /// <b>Amtsgericht Marl</b><br/>
    /// Code: R2511<br/>
    /// </summary>
    [XmlEnum("R2511")]
    Amtsgericht_Marl,

    /// <summary>
    /// <b>Grundbuchamt Marl</b><br/>
    /// Code: R2511G<br/>
    /// </summary>
    [XmlEnum("R2511G")]
    Grundbuchamt_Marl,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Haltern</b><br/>
    /// Code: R2512<br/>
    /// </summary>
    [XmlEnum("R2512")]
    aufgeloest_Amtsgericht_Haltern,

    /// <summary>
    /// <b>Landgericht Hagen</b><br/>
    /// Code: R2600<br/>
    /// </summary>
    [XmlEnum("R2600")]
    Landgericht_Hagen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hagen</b><br/>
    /// Code: R2600S<br/>
    /// </summary>
    [XmlEnum("R2600S")]
    Staatsanwaltschaft_beim_Landgericht_Hagen,

    /// <summary>
    /// <b>Amtsgericht Altena</b><br/>
    /// Code: R2601<br/>
    /// </summary>
    [XmlEnum("R2601")]
    Amtsgericht_Altena,

    /// <summary>
    /// <b>Grundbuchamt Altena</b><br/>
    /// Code: R2601G<br/>
    /// </summary>
    [XmlEnum("R2601G")]
    Grundbuchamt_Altena,

    /// <summary>
    /// <b>Amtsgericht Hagen</b><br/>
    /// Code: R2602<br/>
    /// </summary>
    [XmlEnum("R2602")]
    Amtsgericht_Hagen,

    /// <summary>
    /// <b>Grundbuchamt Hagen</b><br/>
    /// Code: R2602G<br/>
    /// </summary>
    [XmlEnum("R2602G")]
    Grundbuchamt_Hagen,

    /// <summary>
    /// <b>Amtsgericht Hagen -Zentrale Mahnabteilung-</b><br/>
    /// Code: R2602M<br/>
    /// </summary>
    [XmlEnum("R2602M")]
    Amtsgericht_Hagen_Zentrale_Mahnabteilung,

    /// <summary>
    /// <b>Amtsgericht Hagen, Zentrales Vollstreckungsgericht Nordrhein-Westfalen</b><br/>
    /// Code: R2602R<br/>
    /// </summary>
    [XmlEnum("R2602R")]
    Amtsgericht_Hagen_Zentrales_Vollstreckungsgericht_Nordrhein_Westfalen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hohenlimburg</b><br/>
    /// Code: R2603<br/>
    /// </summary>
    [XmlEnum("R2603")]
    aufgeloest_Amtsgericht_Hohenlimburg,

    /// <summary>
    /// <b>Amtsgericht Iserlohn</b><br/>
    /// Code: R2604<br/>
    /// </summary>
    [XmlEnum("R2604")]
    Amtsgericht_Iserlohn,

    /// <summary>
    /// <b>Grundbuchamt Iserlohn</b><br/>
    /// Code: R2604G<br/>
    /// </summary>
    [XmlEnum("R2604G")]
    Grundbuchamt_Iserlohn,

    /// <summary>
    /// <b>Amtsgericht L&#252;denscheid</b><br/>
    /// Code: R2605<br/>
    /// </summary>
    [XmlEnum("R2605")]
    Amtsgericht_Luedenscheid,

    /// <summary>
    /// <b>Grundbuchamt L&#252;denscheid</b><br/>
    /// Code: R2605G<br/>
    /// </summary>
    [XmlEnum("R2605G")]
    Grundbuchamt_Luedenscheid,

    /// <summary>
    /// <b>Amtsgericht Meinerzhagen</b><br/>
    /// Code: R2606<br/>
    /// </summary>
    [XmlEnum("R2606")]
    Amtsgericht_Meinerzhagen,

    /// <summary>
    /// <b>Grundbuchamt Meinerzhagen</b><br/>
    /// Code: R2606G<br/>
    /// </summary>
    [XmlEnum("R2606G")]
    Grundbuchamt_Meinerzhagen,

    /// <summary>
    /// <b>Amtsgericht Plettenberg</b><br/>
    /// Code: R2607<br/>
    /// </summary>
    [XmlEnum("R2607")]
    Amtsgericht_Plettenberg,

    /// <summary>
    /// <b>Grundbuchamt Plettenberg</b><br/>
    /// Code: R2607G<br/>
    /// </summary>
    [XmlEnum("R2607G")]
    Grundbuchamt_Plettenberg,

    /// <summary>
    /// <b>Amtsgericht Schwelm</b><br/>
    /// Code: R2608<br/>
    /// </summary>
    [XmlEnum("R2608")]
    Amtsgericht_Schwelm,

    /// <summary>
    /// <b>Grundbuchamt Schwelm</b><br/>
    /// Code: R2608G<br/>
    /// </summary>
    [XmlEnum("R2608G")]
    Grundbuchamt_Schwelm,

    /// <summary>
    /// <b>Amtsgericht Schwerte</b><br/>
    /// Code: R2609<br/>
    /// </summary>
    [XmlEnum("R2609")]
    Amtsgericht_Schwerte,

    /// <summary>
    /// <b>Grundbuchamt Schwerte</b><br/>
    /// Code: R2609G<br/>
    /// </summary>
    [XmlEnum("R2609G")]
    Grundbuchamt_Schwerte,

    /// <summary>
    /// <b>Amtsgericht Wetter</b><br/>
    /// Code: R2610<br/>
    /// </summary>
    [XmlEnum("R2610")]
    Amtsgericht_Wetter,

    /// <summary>
    /// <b>Grundbuchamt Wetter-Ruhr</b><br/>
    /// Code: R2610G<br/>
    /// </summary>
    [XmlEnum("R2610G")]
    Grundbuchamt_Wetter_Ruhr,

    /// <summary>
    /// <b>Landgericht M&#252;nster</b><br/>
    /// Code: R2700<br/>
    /// </summary>
    [XmlEnum("R2700")]
    Landgericht_Muenster,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht M&#252;nster</b><br/>
    /// Code: R2700S<br/>
    /// </summary>
    [XmlEnum("R2700S")]
    Staatsanwaltschaft_beim_Landgericht_Muenster,

    /// <summary>
    /// <b>Amtsgericht Ahaus</b><br/>
    /// Code: R2701<br/>
    /// </summary>
    [XmlEnum("R2701")]
    Amtsgericht_Ahaus,

    /// <summary>
    /// <b>Grundbuchamt Ahaus</b><br/>
    /// Code: R2701G<br/>
    /// </summary>
    [XmlEnum("R2701G")]
    Grundbuchamt_Ahaus,

    /// <summary>
    /// <b>Amtsgericht Ahlen</b><br/>
    /// Code: R2702<br/>
    /// </summary>
    [XmlEnum("R2702")]
    Amtsgericht_Ahlen,

    /// <summary>
    /// <b>Grundbuchamt Ahlen</b><br/>
    /// Code: R2702G<br/>
    /// </summary>
    [XmlEnum("R2702G")]
    Grundbuchamt_Ahlen,

    /// <summary>
    /// <b>Amtsgericht Beckum</b><br/>
    /// Code: R2703<br/>
    /// </summary>
    [XmlEnum("R2703")]
    Amtsgericht_Beckum,

    /// <summary>
    /// <b>Grundbuchamt Beckum</b><br/>
    /// Code: R2703G<br/>
    /// </summary>
    [XmlEnum("R2703G")]
    Grundbuchamt_Beckum,

    /// <summary>
    /// <b>Amtsgericht Bocholt</b><br/>
    /// Code: R2704<br/>
    /// </summary>
    [XmlEnum("R2704")]
    Amtsgericht_Bocholt,

    /// <summary>
    /// <b>Grundbuchamt Bocholt</b><br/>
    /// Code: R2704G<br/>
    /// </summary>
    [XmlEnum("R2704G")]
    Grundbuchamt_Bocholt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bocholt, Zwst. der StA M&#252;nster</b><br/>
    /// Code: R2704S<br/>
    /// </summary>
    [XmlEnum("R2704S")]
    Staatsanwaltschaft_beim_Landgericht_Bocholt_Zwst_der_StA_Muenster,

    /// <summary>
    /// <b>Amtsgericht Borken</b><br/>
    /// Code: R2705<br/>
    /// </summary>
    [XmlEnum("R2705")]
    Amtsgericht_Borken,

    /// <summary>
    /// <b>Grundbuchamt Borken</b><br/>
    /// Code: R2705G<br/>
    /// </summary>
    [XmlEnum("R2705G")]
    Grundbuchamt_Borken,

    /// <summary>
    /// <b>Amtsgericht Steinfurt</b><br/>
    /// Code: R2706<br/>
    /// </summary>
    [XmlEnum("R2706")]
    Amtsgericht_Steinfurt,

    /// <summary>
    /// <b>Grundbuchamt Steinfurt</b><br/>
    /// Code: R2706G<br/>
    /// </summary>
    [XmlEnum("R2706G")]
    Grundbuchamt_Steinfurt,

    /// <summary>
    /// <b>Amtsgericht Coesfeld</b><br/>
    /// Code: R2707<br/>
    /// </summary>
    [XmlEnum("R2707")]
    Amtsgericht_Coesfeld,

    /// <summary>
    /// <b>Grundbuchamt Coesfeld</b><br/>
    /// Code: R2707G<br/>
    /// </summary>
    [XmlEnum("R2707G")]
    Grundbuchamt_Coesfeld,

    /// <summary>
    /// <b>Amtsgericht D&#252;lmen</b><br/>
    /// Code: R2708<br/>
    /// </summary>
    [XmlEnum("R2708")]
    Amtsgericht_Duelmen,

    /// <summary>
    /// <b>Grundbuchamt D&#252;lmen</b><br/>
    /// Code: R2708G<br/>
    /// </summary>
    [XmlEnum("R2708G")]
    Grundbuchamt_Duelmen,

    /// <summary>
    /// <b>Amtsgericht Gronau</b><br/>
    /// Code: R2709<br/>
    /// </summary>
    [XmlEnum("R2709")]
    Amtsgericht_Gronau,

    /// <summary>
    /// <b>Grundbuchamt Gronau</b><br/>
    /// Code: R2709G<br/>
    /// </summary>
    [XmlEnum("R2709G")]
    Grundbuchamt_Gronau,

    /// <summary>
    /// <b>Amtsgericht Haltern</b><br/>
    /// Code: R2710<br/>
    /// </summary>
    [XmlEnum("R2710")]
    Amtsgericht_Haltern,

    /// <summary>
    /// <b>Amtsgericht Ibbenb&#252;ren</b><br/>
    /// Code: R2711<br/>
    /// </summary>
    [XmlEnum("R2711")]
    Amtsgericht_Ibbenbueren,

    /// <summary>
    /// <b>Grundbuchamt Ibbenb&#252;ren</b><br/>
    /// Code: R2711G<br/>
    /// </summary>
    [XmlEnum("R2711G")]
    Grundbuchamt_Ibbenbueren,

    /// <summary>
    /// <b>Amtsgericht L&#252;dinghausen</b><br/>
    /// Code: R2712<br/>
    /// </summary>
    [XmlEnum("R2712")]
    Amtsgericht_Luedinghausen,

    /// <summary>
    /// <b>Grundbuchamt L&#252;dinghausen</b><br/>
    /// Code: R2712G<br/>
    /// </summary>
    [XmlEnum("R2712G")]
    Grundbuchamt_Luedinghausen,

    /// <summary>
    /// <b>Amtsgericht M&#252;nster</b><br/>
    /// Code: R2713<br/>
    /// </summary>
    [XmlEnum("R2713")]
    Amtsgericht_Muenster,

    /// <summary>
    /// <b>Grundbuchamt M&#252;nster</b><br/>
    /// Code: R2713G<br/>
    /// </summary>
    [XmlEnum("R2713G")]
    Grundbuchamt_Muenster,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Oelde</b><br/>
    /// Code: R2714<br/>
    /// </summary>
    [XmlEnum("R2714")]
    aufgeloest_Amtsgericht_Oelde,

    /// <summary>
    /// <b>Amtsgericht Rheine</b><br/>
    /// Code: R2715<br/>
    /// </summary>
    [XmlEnum("R2715")]
    Amtsgericht_Rheine,

    /// <summary>
    /// <b>Grundbuchamt Rheine</b><br/>
    /// Code: R2715G<br/>
    /// </summary>
    [XmlEnum("R2715G")]
    Grundbuchamt_Rheine,

    /// <summary>
    /// <b>Amtsgericht Tecklenburg</b><br/>
    /// Code: R2716<br/>
    /// </summary>
    [XmlEnum("R2716")]
    Amtsgericht_Tecklenburg,

    /// <summary>
    /// <b>Grundbuchamt Tecklenburg</b><br/>
    /// Code: R2716G<br/>
    /// </summary>
    [XmlEnum("R2716G")]
    Grundbuchamt_Tecklenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Vreden</b><br/>
    /// Code: R2717<br/>
    /// </summary>
    [XmlEnum("R2717")]
    aufgeloest_Amtsgericht_Vreden,

    /// <summary>
    /// <b>Amtsgericht Warendorf</b><br/>
    /// Code: R2718<br/>
    /// </summary>
    [XmlEnum("R2718")]
    Amtsgericht_Warendorf,

    /// <summary>
    /// <b>Grundbuchamt Warendorf</b><br/>
    /// Code: R2718G<br/>
    /// </summary>
    [XmlEnum("R2718G")]
    Grundbuchamt_Warendorf,

    /// <summary>
    /// <b>Landgericht Paderborn</b><br/>
    /// Code: R2800<br/>
    /// </summary>
    [XmlEnum("R2800")]
    Landgericht_Paderborn,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Paderborn</b><br/>
    /// Code: R2800S<br/>
    /// </summary>
    [XmlEnum("R2800S")]
    Staatsanwaltschaft_beim_Landgericht_Paderborn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Beverungen</b><br/>
    /// Code: R2801<br/>
    /// </summary>
    [XmlEnum("R2801")]
    aufgeloest_Amtsgericht_Beverungen,

    /// <summary>
    /// <b>Amtsgericht Brakel</b><br/>
    /// Code: R2802<br/>
    /// </summary>
    [XmlEnum("R2802")]
    Amtsgericht_Brakel,

    /// <summary>
    /// <b>Grundbuchamt Brakel</b><br/>
    /// Code: R2802G<br/>
    /// </summary>
    [XmlEnum("R2802G")]
    Grundbuchamt_Brakel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht B&#252;ren</b><br/>
    /// Code: R2803<br/>
    /// </summary>
    [XmlEnum("R2803")]
    aufgeloest_Amtsgericht_Bueren,

    /// <summary>
    /// <b>Amtsgericht Delbr&#252;ck</b><br/>
    /// Code: R2804<br/>
    /// </summary>
    [XmlEnum("R2804")]
    Amtsgericht_Delbrueck,

    /// <summary>
    /// <b>Grundbuchamt Delbr&#252;ck</b><br/>
    /// Code: R2804G<br/>
    /// </summary>
    [XmlEnum("R2804G")]
    Grundbuchamt_Delbrueck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Erwitte</b><br/>
    /// Code: R2805<br/>
    /// </summary>
    [XmlEnum("R2805")]
    aufgeloest_Amtsgericht_Erwitte,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Geseke</b><br/>
    /// Code: R2806<br/>
    /// </summary>
    [XmlEnum("R2806")]
    aufgeloest_Amtsgericht_Geseke,

    /// <summary>
    /// <b>Amtsgericht H&#246;xter</b><br/>
    /// Code: R2807<br/>
    /// </summary>
    [XmlEnum("R2807")]
    Amtsgericht_Hoexter,

    /// <summary>
    /// <b>Grundbuchamt H&#246;xter</b><br/>
    /// Code: R2807G<br/>
    /// </summary>
    [XmlEnum("R2807G")]
    Grundbuchamt_Hoexter,

    /// <summary>
    /// <b>Amtsgericht Lippstadt</b><br/>
    /// Code: R2808<br/>
    /// </summary>
    [XmlEnum("R2808")]
    Amtsgericht_Lippstadt,

    /// <summary>
    /// <b>Grundbuchamt Lippstadt</b><br/>
    /// Code: R2808G<br/>
    /// </summary>
    [XmlEnum("R2808G")]
    Grundbuchamt_Lippstadt,

    /// <summary>
    /// <b>Amtsgericht Paderborn</b><br/>
    /// Code: R2809<br/>
    /// </summary>
    [XmlEnum("R2809")]
    Amtsgericht_Paderborn,

    /// <summary>
    /// <b>Grundbuchamt Paderborn</b><br/>
    /// Code: R2809G<br/>
    /// </summary>
    [XmlEnum("R2809G")]
    Grundbuchamt_Paderborn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht R&#252;then</b><br/>
    /// Code: R2810<br/>
    /// </summary>
    [XmlEnum("R2810")]
    aufgeloest_Amtsgericht_Ruethen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Salzkotten</b><br/>
    /// Code: R2811<br/>
    /// </summary>
    [XmlEnum("R2811")]
    aufgeloest_Amtsgericht_Salzkotten,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Steinheim</b><br/>
    /// Code: R2812<br/>
    /// </summary>
    [XmlEnum("R2812")]
    aufgeloest_Amtsgericht_Steinheim,

    /// <summary>
    /// <b>Amtsgericht Warburg</b><br/>
    /// Code: R2813<br/>
    /// </summary>
    [XmlEnum("R2813")]
    Amtsgericht_Warburg,

    /// <summary>
    /// <b>Grundbuchamt Warburg</b><br/>
    /// Code: R2813G<br/>
    /// </summary>
    [XmlEnum("R2813G")]
    Grundbuchamt_Warburg,

    /// <summary>
    /// <b>Landgericht Siegen</b><br/>
    /// Code: R2900<br/>
    /// </summary>
    [XmlEnum("R2900")]
    Landgericht_Siegen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Siegen</b><br/>
    /// Code: R2900S<br/>
    /// </summary>
    [XmlEnum("R2900S")]
    Staatsanwaltschaft_beim_Landgericht_Siegen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Olpe, Zwst. Attendorn</b><br/>
    /// Code: R2901<br/>
    /// </summary>
    [XmlEnum("R2901")]
    aufgeloest_Amtsgericht_Olpe_Zwst_Attendorn,

    /// <summary>
    /// <b>Amtsgericht Bad Berleburg</b><br/>
    /// Code: R2902<br/>
    /// </summary>
    [XmlEnum("R2902")]
    Amtsgericht_Bad_Berleburg,

    /// <summary>
    /// <b>Grundbuchamt Bad Berleburg</b><br/>
    /// Code: R2902G<br/>
    /// </summary>
    [XmlEnum("R2902G")]
    Grundbuchamt_Bad_Berleburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Burbach</b><br/>
    /// Code: R2903<br/>
    /// </summary>
    [XmlEnum("R2903")]
    aufgeloest_Amtsgericht_Burbach,

    /// <summary>
    /// <b>Amtsgericht Lennestadt</b><br/>
    /// Code: R2904<br/>
    /// </summary>
    [XmlEnum("R2904")]
    Amtsgericht_Lennestadt,

    /// <summary>
    /// <b>Grundbuchamt Lennestadt</b><br/>
    /// Code: R2904G<br/>
    /// </summary>
    [XmlEnum("R2904G")]
    Grundbuchamt_Lennestadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hilchenbach</b><br/>
    /// Code: R2905<br/>
    /// </summary>
    [XmlEnum("R2905")]
    aufgeloest_Amtsgericht_Hilchenbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kirchhundem</b><br/>
    /// Code: R2906<br/>
    /// </summary>
    [XmlEnum("R2906")]
    aufgeloest_Amtsgericht_Kirchhundem,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Laasphe</b><br/>
    /// Code: R2907<br/>
    /// </summary>
    [XmlEnum("R2907")]
    aufgeloest_Amtsgericht_Laasphe,

    /// <summary>
    /// <b>Amtsgericht Olpe</b><br/>
    /// Code: R2908<br/>
    /// </summary>
    [XmlEnum("R2908")]
    Amtsgericht_Olpe,

    /// <summary>
    /// <b>Grundbuchamt Olpe</b><br/>
    /// Code: R2908G<br/>
    /// </summary>
    [XmlEnum("R2908G")]
    Grundbuchamt_Olpe,

    /// <summary>
    /// <b>Amtsgericht Siegen</b><br/>
    /// Code: R2909<br/>
    /// </summary>
    [XmlEnum("R2909")]
    Amtsgericht_Siegen,

    /// <summary>
    /// <b>Grundbuchamt Siegen</b><br/>
    /// Code: R2909G<br/>
    /// </summary>
    [XmlEnum("R2909G")]
    Grundbuchamt_Siegen,

    /// <summary>
    /// <b>Oberlandesgericht K&#246;ln</b><br/>
    /// Code: R3000<br/>
    /// </summary>
    [XmlEnum("R3000")]
    Oberlandesgericht_Koeln,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht K&#246;ln</b><br/>
    /// Code: R3000S<br/>
    /// </summary>
    [XmlEnum("R3000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Koeln,

    /// <summary>
    /// <b>Landgericht Aachen</b><br/>
    /// Code: R3100<br/>
    /// </summary>
    [XmlEnum("R3100")]
    Landgericht_Aachen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Aachen</b><br/>
    /// Code: R3100S<br/>
    /// </summary>
    [XmlEnum("R3100S")]
    Staatsanwaltschaft_beim_Landgericht_Aachen,

    /// <summary>
    /// <b>Amtsgericht Aachen</b><br/>
    /// Code: R3101<br/>
    /// </summary>
    [XmlEnum("R3101")]
    Amtsgericht_Aachen,

    /// <summary>
    /// <b>Grundbuchamt Aachen</b><br/>
    /// Code: R3101G<br/>
    /// </summary>
    [XmlEnum("R3101G")]
    Grundbuchamt_Aachen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Blankenheim</b><br/>
    /// Code: R3102<br/>
    /// </summary>
    [XmlEnum("R3102")]
    aufgeloest_Amtsgericht_Blankenheim,

    /// <summary>
    /// <b>Amtsgericht D&#252;ren</b><br/>
    /// Code: R3103<br/>
    /// </summary>
    [XmlEnum("R3103")]
    Amtsgericht_Dueren,

    /// <summary>
    /// <b>Grundbuchamt D&#252;ren</b><br/>
    /// Code: R3103G<br/>
    /// </summary>
    [XmlEnum("R3103G")]
    Grundbuchamt_Dueren,

    /// <summary>
    /// <b>Amtsgericht Eschweiler</b><br/>
    /// Code: R3104<br/>
    /// </summary>
    [XmlEnum("R3104")]
    Amtsgericht_Eschweiler,

    /// <summary>
    /// <b>Grundbuchamt Eschweiler</b><br/>
    /// Code: R3104G<br/>
    /// </summary>
    [XmlEnum("R3104G")]
    Grundbuchamt_Eschweiler,

    /// <summary>
    /// <b>Amtsgericht Geilenkirchen</b><br/>
    /// Code: R3105<br/>
    /// </summary>
    [XmlEnum("R3105")]
    Amtsgericht_Geilenkirchen,

    /// <summary>
    /// <b>Grundbuchamt Geilenkirchen</b><br/>
    /// Code: R3105G<br/>
    /// </summary>
    [XmlEnum("R3105G")]
    Grundbuchamt_Geilenkirchen,

    /// <summary>
    /// <b>Amtsgericht Schleiden</b><br/>
    /// Code: R3106<br/>
    /// </summary>
    [XmlEnum("R3106")]
    Amtsgericht_Schleiden,

    /// <summary>
    /// <b>Grundbuchamt Schleiden</b><br/>
    /// Code: R3106G<br/>
    /// </summary>
    [XmlEnum("R3106G")]
    Grundbuchamt_Schleiden,

    /// <summary>
    /// <b>Amtsgericht Heinsberg</b><br/>
    /// Code: R3107<br/>
    /// </summary>
    [XmlEnum("R3107")]
    Amtsgericht_Heinsberg,

    /// <summary>
    /// <b>Grundbuchamt Heinsberg</b><br/>
    /// Code: R3107G<br/>
    /// </summary>
    [XmlEnum("R3107G")]
    Grundbuchamt_Heinsberg,

    /// <summary>
    /// <b>Amtsgericht J&#252;lich</b><br/>
    /// Code: R3108<br/>
    /// </summary>
    [XmlEnum("R3108")]
    Amtsgericht_Juelich,

    /// <summary>
    /// <b>Grundbuchamt J&#252;lich</b><br/>
    /// Code: R3108G<br/>
    /// </summary>
    [XmlEnum("R3108G")]
    Grundbuchamt_Juelich,

    /// <summary>
    /// <b>Amtsgericht Monschau</b><br/>
    /// Code: R3109<br/>
    /// </summary>
    [XmlEnum("R3109")]
    Amtsgericht_Monschau,

    /// <summary>
    /// <b>Grundbuchamt Monschau</b><br/>
    /// Code: R3109G<br/>
    /// </summary>
    [XmlEnum("R3109G")]
    Grundbuchamt_Monschau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stolberg</b><br/>
    /// Code: R3110<br/>
    /// </summary>
    [XmlEnum("R3110")]
    aufgeloest_Amtsgericht_Stolberg,

    /// <summary>
    /// <b>Landgericht Bonn</b><br/>
    /// Code: R3200<br/>
    /// </summary>
    [XmlEnum("R3200")]
    Landgericht_Bonn,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bonn</b><br/>
    /// Code: R3200S<br/>
    /// </summary>
    [XmlEnum("R3200S")]
    Staatsanwaltschaft_beim_Landgericht_Bonn,

    /// <summary>
    /// <b>Amtsgericht Bonn</b><br/>
    /// Code: R3201<br/>
    /// </summary>
    [XmlEnum("R3201")]
    Amtsgericht_Bonn,

    /// <summary>
    /// <b>Grundbuchamt Bonn</b><br/>
    /// Code: R3201G<br/>
    /// </summary>
    [XmlEnum("R3201G")]
    Grundbuchamt_Bonn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eitorf</b><br/>
    /// Code: R3202<br/>
    /// </summary>
    [XmlEnum("R3202")]
    aufgeloest_Amtsgericht_Eitorf,

    /// <summary>
    /// <b>Amtsgericht Euskirchen</b><br/>
    /// Code: R3203<br/>
    /// </summary>
    [XmlEnum("R3203")]
    Amtsgericht_Euskirchen,

    /// <summary>
    /// <b>Grundbuchamt Euskirchen</b><br/>
    /// Code: R3203G<br/>
    /// </summary>
    [XmlEnum("R3203G")]
    Grundbuchamt_Euskirchen,

    /// <summary>
    /// <b>Amtsgericht Euskirchen -Zentrale Mahnabteilung-</b><br/>
    /// Code: R3203M<br/>
    /// </summary>
    [XmlEnum("R3203M")]
    Amtsgericht_Euskirchen_Zentrale_Mahnabteilung,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Siegburg, Zwst. Hennef</b><br/>
    /// Code: R3204<br/>
    /// </summary>
    [XmlEnum("R3204")]
    aufgeloest_Amtsgericht_Siegburg_Zwst_Hennef,

    /// <summary>
    /// <b>Amtsgericht K&#246;nigswinter</b><br/>
    /// Code: R3205<br/>
    /// </summary>
    [XmlEnum("R3205")]
    Amtsgericht_Koenigswinter,

    /// <summary>
    /// <b>Grundbuchamt K&#246;nigswinter</b><br/>
    /// Code: R3205G<br/>
    /// </summary>
    [XmlEnum("R3205G")]
    Grundbuchamt_Koenigswinter,

    /// <summary>
    /// <b>Amtsgericht Rheinbach</b><br/>
    /// Code: R3207<br/>
    /// </summary>
    [XmlEnum("R3207")]
    Amtsgericht_Rheinbach,

    /// <summary>
    /// <b>Grundbuchamt Rheinbach</b><br/>
    /// Code: R3207G<br/>
    /// </summary>
    [XmlEnum("R3207G")]
    Grundbuchamt_Rheinbach,

    /// <summary>
    /// <b>Amtsgericht Siegburg</b><br/>
    /// Code: R3208<br/>
    /// </summary>
    [XmlEnum("R3208")]
    Amtsgericht_Siegburg,

    /// <summary>
    /// <b>Grundbuchamt Siegburg</b><br/>
    /// Code: R3208G<br/>
    /// </summary>
    [XmlEnum("R3208G")]
    Grundbuchamt_Siegburg,

    /// <summary>
    /// <b>Amtsgericht Waldbr&#246;l</b><br/>
    /// Code: R3209<br/>
    /// </summary>
    [XmlEnum("R3209")]
    Amtsgericht_Waldbroel,

    /// <summary>
    /// <b>Grundbuchamt Waldbr&#246;l</b><br/>
    /// Code: R3209G<br/>
    /// </summary>
    [XmlEnum("R3209G")]
    Grundbuchamt_Waldbroel,

    /// <summary>
    /// <b>aufgel&#246;st-Landgericht Bonn</b><br/>
    /// Code: R3299<br/>
    /// </summary>
    [XmlEnum("R3299")]
    aufgeloest_Landgericht_Bonn,

    /// <summary>
    /// <b>Landgericht K&#246;ln</b><br/>
    /// Code: R3300<br/>
    /// </summary>
    [XmlEnum("R3300")]
    Landgericht_Koeln,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht K&#246;ln</b><br/>
    /// Code: R3300S<br/>
    /// </summary>
    [XmlEnum("R3300S")]
    Staatsanwaltschaft_beim_Landgericht_Koeln,

    /// <summary>
    /// <b>Amtsgericht Bergisch Gladbach</b><br/>
    /// Code: R3301<br/>
    /// </summary>
    [XmlEnum("R3301")]
    Amtsgericht_Bergisch_Gladbach,

    /// <summary>
    /// <b>Grundbuchamt Bergisch Gladbach</b><br/>
    /// Code: R3301G<br/>
    /// </summary>
    [XmlEnum("R3301G")]
    Grundbuchamt_Bergisch_Gladbach,

    /// <summary>
    /// <b>Amtsgericht Bergheim</b><br/>
    /// Code: R3302<br/>
    /// </summary>
    [XmlEnum("R3302")]
    Amtsgericht_Bergheim,

    /// <summary>
    /// <b>Grundbuchamt Bergheim</b><br/>
    /// Code: R3302G<br/>
    /// </summary>
    [XmlEnum("R3302G")]
    Grundbuchamt_Bergheim,

    /// <summary>
    /// <b>Amtsgericht Br&#252;hl</b><br/>
    /// Code: R3303<br/>
    /// </summary>
    [XmlEnum("R3303")]
    Amtsgericht_Bruehl,

    /// <summary>
    /// <b>Grundbuchamt Br&#252;hl</b><br/>
    /// Code: R3303G<br/>
    /// </summary>
    [XmlEnum("R3303G")]
    Grundbuchamt_Bruehl,

    /// <summary>
    /// <b>Amtsgericht Gummersbach</b><br/>
    /// Code: R3304<br/>
    /// </summary>
    [XmlEnum("R3304")]
    Amtsgericht_Gummersbach,

    /// <summary>
    /// <b>Grundbuchamt Gummersbach</b><br/>
    /// Code: R3304G<br/>
    /// </summary>
    [XmlEnum("R3304G")]
    Grundbuchamt_Gummersbach,

    /// <summary>
    /// <b>Amtsgericht Kerpen</b><br/>
    /// Code: R3305<br/>
    /// </summary>
    [XmlEnum("R3305")]
    Amtsgericht_Kerpen,

    /// <summary>
    /// <b>Grundbuchamt Kerpen</b><br/>
    /// Code: R3305G<br/>
    /// </summary>
    [XmlEnum("R3305G")]
    Grundbuchamt_Kerpen,

    /// <summary>
    /// <b>Amtsgericht K&#246;ln</b><br/>
    /// Code: R3306<br/>
    /// </summary>
    [XmlEnum("R3306")]
    Amtsgericht_Koeln,

    /// <summary>
    /// <b>Grundbuchamt K&#246;ln</b><br/>
    /// Code: R3306G<br/>
    /// </summary>
    [XmlEnum("R3306G")]
    Grundbuchamt_Koeln,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lindlar</b><br/>
    /// Code: R3307<br/>
    /// </summary>
    [XmlEnum("R3307")]
    aufgeloest_Amtsgericht_Lindlar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wiehl</b><br/>
    /// Code: R3308<br/>
    /// </summary>
    [XmlEnum("R3308")]
    aufgeloest_Amtsgericht_Wiehl,

    /// <summary>
    /// <b>Amtsgericht Wipperf&#252;rth</b><br/>
    /// Code: R3309<br/>
    /// </summary>
    [XmlEnum("R3309")]
    Amtsgericht_Wipperfuerth,

    /// <summary>
    /// <b>Grundbuchamt Wipperf&#252;rth</b><br/>
    /// Code: R3309G<br/>
    /// </summary>
    [XmlEnum("R3309G")]
    Grundbuchamt_Wipperfuerth,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Br&#252;hl, Zwst. Lechenich in Erftstadt</b><br/>
    /// Code: R3310<br/>
    /// </summary>
    [XmlEnum("R3310")]
    aufgeloest_Amtsgericht_Bruehl_Zwst_Lechenich_in_Erftstadt,

    /// <summary>
    /// <b>Amtsgericht Leverkusen</b><br/>
    /// Code: R3311<br/>
    /// </summary>
    [XmlEnum("R3311")]
    Amtsgericht_Leverkusen,

    /// <summary>
    /// <b>Grundbuchamt Leverkusen</b><br/>
    /// Code: R3311G<br/>
    /// </summary>
    [XmlEnum("R3311G")]
    Grundbuchamt_Leverkusen,

    /// <summary>
    /// <b>Amtsgericht Wermelskirchen</b><br/>
    /// Code: R3312<br/>
    /// </summary>
    [XmlEnum("R3312")]
    Amtsgericht_Wermelskirchen,

    /// <summary>
    /// <b>Grundbuchamt Wermelskirchen</b><br/>
    /// Code: R3312G<br/>
    /// </summary>
    [XmlEnum("R3312G")]
    Grundbuchamt_Wermelskirchen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Siegburg</b><br/>
    /// Code: R6109<br/>
    /// </summary>
    [XmlEnum("R6109")]
    Justizvollzugsanstalt_Siegburg,

    /// <summary>
    /// <b>Sozialgericht Dortmund</b><br/>
    /// Code: R6205<br/>
    /// </summary>
    [XmlEnum("R6205")]
    Sozialgericht_Dortmund,

    /// <summary>
    /// <b>Finanzgericht D&#252;sseldorf</b><br/>
    /// Code: R6254<br/>
    /// </summary>
    [XmlEnum("R6254")]
    Finanzgericht_Duesseldorf,

    /// <summary>
    /// <b>Arbeitsgericht Aachen</b><br/>
    /// Code: R6293<br/>
    /// </summary>
    [XmlEnum("R6293")]
    Arbeitsgericht_Aachen,

    /// <summary>
    /// <b>Sozialgericht Aachen</b><br/>
    /// Code: R6294<br/>
    /// </summary>
    [XmlEnum("R6294")]
    Sozialgericht_Aachen,

    /// <summary>
    /// <b>Verwaltungsgericht Aachen</b><br/>
    /// Code: R6295<br/>
    /// </summary>
    [XmlEnum("R6295")]
    Verwaltungsgericht_Aachen,

    /// <summary>
    /// <b>Arbeitsgericht Arnsberg</b><br/>
    /// Code: R6296<br/>
    /// </summary>
    [XmlEnum("R6296")]
    Arbeitsgericht_Arnsberg,

    /// <summary>
    /// <b>Arbeitsgericht Bocholt</b><br/>
    /// Code: R6297<br/>
    /// </summary>
    [XmlEnum("R6297")]
    Arbeitsgericht_Bocholt,

    /// <summary>
    /// <b>Sozialgericht Detmold</b><br/>
    /// Code: R6298<br/>
    /// </summary>
    [XmlEnum("R6298")]
    Sozialgericht_Detmold,

    /// <summary>
    /// <b>Arbeitsgericht Detmold</b><br/>
    /// Code: R6299<br/>
    /// </summary>
    [XmlEnum("R6299")]
    Arbeitsgericht_Detmold,

    /// <summary>
    /// <b>Landesarbeitsgericht D&#252;sseldorf</b><br/>
    /// Code: R6300<br/>
    /// </summary>
    [XmlEnum("R6300")]
    Landesarbeitsgericht_Duesseldorf,

    /// <summary>
    /// <b>Verwaltungsgericht D&#252;sseldorf</b><br/>
    /// Code: R6301<br/>
    /// </summary>
    [XmlEnum("R6301")]
    Verwaltungsgericht_Duesseldorf,

    /// <summary>
    /// <b>Arbeitsgericht D&#252;sseldorf</b><br/>
    /// Code: R6302<br/>
    /// </summary>
    [XmlEnum("R6302")]
    Arbeitsgericht_Duesseldorf,

    /// <summary>
    /// <b>Arbeitsgericht Duisburg</b><br/>
    /// Code: R6303<br/>
    /// </summary>
    [XmlEnum("R6303")]
    Arbeitsgericht_Duisburg,

    /// <summary>
    /// <b>Sozialgericht Duisburg</b><br/>
    /// Code: R6304<br/>
    /// </summary>
    [XmlEnum("R6304")]
    Sozialgericht_Duisburg,

    /// <summary>
    /// <b>Arbeitsgericht Essen</b><br/>
    /// Code: R6305<br/>
    /// </summary>
    [XmlEnum("R6305")]
    Arbeitsgericht_Essen,

    /// <summary>
    /// <b>Landessozialgericht f&#252;r das Land Nordrhein-Westfalen</b><br/>
    /// Code: R6306<br/>
    /// </summary>
    [XmlEnum("R6306")]
    Landessozialgericht_fuer_das_Land_Nordrhein_Westfalen,

    /// <summary>
    /// <b>Arbeitsgericht Herford</b><br/>
    /// Code: R6307<br/>
    /// </summary>
    [XmlEnum("R6307")]
    Arbeitsgericht_Herford,

    /// <summary>
    /// <b>Arbeitsgericht Iserlohn</b><br/>
    /// Code: R6308<br/>
    /// </summary>
    [XmlEnum("R6308")]
    Arbeitsgericht_Iserlohn,

    /// <summary>
    /// <b>Verwaltungsgericht K&#246;ln</b><br/>
    /// Code: R6309<br/>
    /// </summary>
    [XmlEnum("R6309")]
    Verwaltungsgericht_Koeln,

    /// <summary>
    /// <b>Sozialgericht K&#246;ln</b><br/>
    /// Code: R6310<br/>
    /// </summary>
    [XmlEnum("R6310")]
    Sozialgericht_Koeln,

    /// <summary>
    /// <b>Finanzgericht K&#246;ln</b><br/>
    /// Code: R6311<br/>
    /// </summary>
    [XmlEnum("R6311")]
    Finanzgericht_Koeln,

    /// <summary>
    /// <b>Arbeitsgericht K&#246;ln</b><br/>
    /// Code: R6312<br/>
    /// </summary>
    [XmlEnum("R6312")]
    Arbeitsgericht_Koeln,

    /// <summary>
    /// <b>Landesarbeitsgericht K&#246;ln</b><br/>
    /// Code: R6313<br/>
    /// </summary>
    [XmlEnum("R6313")]
    Landesarbeitsgericht_Koeln,

    /// <summary>
    /// <b>Verwaltungsgericht Minden</b><br/>
    /// Code: R6314<br/>
    /// </summary>
    [XmlEnum("R6314")]
    Verwaltungsgericht_Minden,

    /// <summary>
    /// <b>Arbeitsgericht Minden</b><br/>
    /// Code: R6315<br/>
    /// </summary>
    [XmlEnum("R6315")]
    Arbeitsgericht_Minden,

    /// <summary>
    /// <b>Arbeitsgericht M&#246;nchengladbach</b><br/>
    /// Code: R6316<br/>
    /// </summary>
    [XmlEnum("R6316")]
    Arbeitsgericht_Moenchengladbach,

    /// <summary>
    /// <b>Arbeitsgericht Bonn</b><br/>
    /// Code: R6317<br/>
    /// </summary>
    [XmlEnum("R6317")]
    Arbeitsgericht_Bonn,

    /// <summary>
    /// <b>Finanzgericht M&#252;nster</b><br/>
    /// Code: R6318<br/>
    /// </summary>
    [XmlEnum("R6318")]
    Finanzgericht_Muenster,

    /// <summary>
    /// <b>Verwaltungsgericht M&#252;nster</b><br/>
    /// Code: R6319<br/>
    /// </summary>
    [XmlEnum("R6319")]
    Verwaltungsgericht_Muenster,

    /// <summary>
    /// <b>Arbeitsgericht M&#252;nster</b><br/>
    /// Code: R6320<br/>
    /// </summary>
    [XmlEnum("R6320")]
    Arbeitsgericht_Muenster,

    /// <summary>
    /// <b>Oberverwaltungsgericht f&#252;r das Land Nordrhein-Westfalen</b><br/>
    /// Code: R6321<br/>
    /// </summary>
    [XmlEnum("R6321")]
    Oberverwaltungsgericht_fuer_das_Land_Nordrhein_Westfalen,

    /// <summary>
    /// <b>Verfassungsgerichtshof f&#252;r das Land Nordrhein-Westfalen</b><br/>
    /// Code: R6322<br/>
    /// </summary>
    [XmlEnum("R6322")]
    Verfassungsgerichtshof_fuer_das_Land_Nordrhein_Westfalen,

    /// <summary>
    /// <b>Sozialgericht M&#252;nster</b><br/>
    /// Code: R6323<br/>
    /// </summary>
    [XmlEnum("R6323")]
    Sozialgericht_Muenster,

    /// <summary>
    /// <b>Arbeitsgericht Oberhausen</b><br/>
    /// Code: R6324<br/>
    /// </summary>
    [XmlEnum("R6324")]
    Arbeitsgericht_Oberhausen,

    /// <summary>
    /// <b>Arbeitsgericht Siegburg</b><br/>
    /// Code: R6325<br/>
    /// </summary>
    [XmlEnum("R6325")]
    Arbeitsgericht_Siegburg,

    /// <summary>
    /// <b>Arbeitsgericht Siegen</b><br/>
    /// Code: R6326<br/>
    /// </summary>
    [XmlEnum("R6326")]
    Arbeitsgericht_Siegen,

    /// <summary>
    /// <b>Arbeitsgericht Solingen</b><br/>
    /// Code: R6327<br/>
    /// </summary>
    [XmlEnum("R6327")]
    Arbeitsgericht_Solingen,

    /// <summary>
    /// <b>Arbeitsgericht Wesel</b><br/>
    /// Code: R6328<br/>
    /// </summary>
    [XmlEnum("R6328")]
    Arbeitsgericht_Wesel,

    /// <summary>
    /// <b>Arbeitsgericht Wuppertal</b><br/>
    /// Code: R6329<br/>
    /// </summary>
    [XmlEnum("R6329")]
    Arbeitsgericht_Wuppertal,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer D&#252;sseldorf</b><br/>
    /// Code: R6568<br/>
    /// </summary>
    [XmlEnum("R6568")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Duesseldorf,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Hamm</b><br/>
    /// Code: R6578<br/>
    /// </summary>
    [XmlEnum("R6578")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Hamm,

    /// <summary>
    /// <b>Justizvollzugsanstalt M&#252;nster</b><br/>
    /// Code: R6636<br/>
    /// </summary>
    [XmlEnum("R6636")]
    Justizvollzugsanstalt_Muenster,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer K&#246;ln</b><br/>
    /// Code: R6657<br/>
    /// </summary>
    [XmlEnum("R6657")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Koeln,

    /// <summary>
    /// <b>Anwaltsgerichtshof des Landes Nordrhein-Westfalen</b><br/>
    /// Code: R6675<br/>
    /// </summary>
    [XmlEnum("R6675")]
    Anwaltsgerichtshof_des_Landes_Nordrhein_Westfalen,

    /// <summary>
    /// <b>Arbeitsgericht Bielefeld</b><br/>
    /// Code: R6725<br/>
    /// </summary>
    [XmlEnum("R6725")]
    Arbeitsgericht_Bielefeld,

    /// <summary>
    /// <b>Arbeitsgericht Bochum</b><br/>
    /// Code: R6726<br/>
    /// </summary>
    [XmlEnum("R6726")]
    Arbeitsgericht_Bochum,

    /// <summary>
    /// <b>Arbeitsgericht Dortmund</b><br/>
    /// Code: R6727<br/>
    /// </summary>
    [XmlEnum("R6727")]
    Arbeitsgericht_Dortmund,

    /// <summary>
    /// <b>Arbeitsgericht Gelsenkirchen</b><br/>
    /// Code: R6728<br/>
    /// </summary>
    [XmlEnum("R6728")]
    Arbeitsgericht_Gelsenkirchen,

    /// <summary>
    /// <b>Arbeitsgericht Hagen</b><br/>
    /// Code: R6729<br/>
    /// </summary>
    [XmlEnum("R6729")]
    Arbeitsgericht_Hagen,

    /// <summary>
    /// <b>Arbeitsgericht Hamm</b><br/>
    /// Code: R6730<br/>
    /// </summary>
    [XmlEnum("R6730")]
    Arbeitsgericht_Hamm,

    /// <summary>
    /// <b>Arbeitsgericht Herne</b><br/>
    /// Code: R6731<br/>
    /// </summary>
    [XmlEnum("R6731")]
    Arbeitsgericht_Herne,

    /// <summary>
    /// <b>Arbeitsgericht Krefeld</b><br/>
    /// Code: R6732<br/>
    /// </summary>
    [XmlEnum("R6732")]
    Arbeitsgericht_Krefeld,

    /// <summary>
    /// <b>Arbeitsgericht Paderborn</b><br/>
    /// Code: R6733<br/>
    /// </summary>
    [XmlEnum("R6733")]
    Arbeitsgericht_Paderborn,

    /// <summary>
    /// <b>Arbeitsgericht Rheine</b><br/>
    /// Code: R6734<br/>
    /// </summary>
    [XmlEnum("R6734")]
    Arbeitsgericht_Rheine,

    /// <summary>
    /// <b>Landesarbeitsgericht Hamm</b><br/>
    /// Code: R6757<br/>
    /// </summary>
    [XmlEnum("R6757")]
    Landesarbeitsgericht_Hamm,

    /// <summary>
    /// <b>Justizvollzugsanstalt Attendorn</b><br/>
    /// Code: R6767<br/>
    /// </summary>
    [XmlEnum("R6767")]
    Justizvollzugsanstalt_Attendorn,

    /// <summary>
    /// <b>Justizvollzugskrankenhaus NRW</b><br/>
    /// Code: R6781<br/>
    /// </summary>
    [XmlEnum("R6781")]
    Justizvollzugskrankenhaus_NRW,

    /// <summary>
    /// <b>aufgel&#246;st-Sozialgericht Dortmund</b><br/>
    /// Code: R6802<br/>
    /// </summary>
    [XmlEnum("R6802")]
    aufgeloest_Sozialgericht_Dortmund,

    /// <summary>
    /// <b>Sozialgericht D&#252;sseldorf Der Pr&#228;sident o.V.i.A. pers.</b><br/>
    /// Code: R6803<br/>
    /// </summary>
    [XmlEnum("R6803")]
    Sozialgericht_Duesseldorf_Der_Praesident_o_V_i_A_pers,

    /// <summary>
    /// <b>Sozialgericht Gelsenkirchen</b><br/>
    /// Code: R6804<br/>
    /// </summary>
    [XmlEnum("R6804")]
    Sozialgericht_Gelsenkirchen,

    /// <summary>
    /// <b>Verwaltungsgericht Arnsberg</b><br/>
    /// Code: R6835<br/>
    /// </summary>
    [XmlEnum("R6835")]
    Verwaltungsgericht_Arnsberg,

    /// <summary>
    /// <b>Verwaltungsgericht Gelsenkirchen</b><br/>
    /// Code: R6836<br/>
    /// </summary>
    [XmlEnum("R6836")]
    Verwaltungsgericht_Gelsenkirchen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Willich II</b><br/>
    /// Code: R6913<br/>
    /// </summary>
    [XmlEnum("R6913")]
    Justizvollzugsanstalt_Willich_II,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bielefeld-Senne</b><br/>
    /// Code: R7093<br/>
    /// </summary>
    [XmlEnum("R7093")]
    Justizvollzugsanstalt_Bielefeld_Senne,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bochum-Langendreer</b><br/>
    /// Code: R7156<br/>
    /// </summary>
    [XmlEnum("R7156")]
    Justizvollzugsanstalt_Bochum_Langendreer,

    /// <summary>
    /// <b>Jugendarrestanstalt Remscheid</b><br/>
    /// Code: R7725<br/>
    /// </summary>
    [XmlEnum("R7725")]
    Jugendarrestanstalt_Remscheid,

    /// <summary>
    /// <b>Jugendarrestanstalt Bottrop</b><br/>
    /// Code: R7728<br/>
    /// </summary>
    [XmlEnum("R7728")]
    Jugendarrestanstalt_Bottrop,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bielefeld-Brackwede</b><br/>
    /// Code: R7738<br/>
    /// </summary>
    [XmlEnum("R7738")]
    Justizvollzugsanstalt_Bielefeld_Brackwede,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hamm</b><br/>
    /// Code: R7763<br/>
    /// </summary>
    [XmlEnum("R7763")]
    Justizvollzugsanstalt_Hamm,

    /// <summary>
    /// <b>Jugendarrestanstalt Wetter</b><br/>
    /// Code: R7787<br/>
    /// </summary>
    [XmlEnum("R7787")]
    Jugendarrestanstalt_Wetter,

    /// <summary>
    /// <b>Justizvollzugsanstalt Duisburg-Hamborn</b><br/>
    /// Code: R8080<br/>
    /// </summary>
    [XmlEnum("R8080")]
    Justizvollzugsanstalt_Duisburg_Hamborn,

    /// <summary>
    /// <b>Justizvollzugsanstalt K&#246;ln</b><br/>
    /// Code: R8088<br/>
    /// </summary>
    [XmlEnum("R8088")]
    Justizvollzugsanstalt_Koeln,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rheinbach</b><br/>
    /// Code: R8367<br/>
    /// </summary>
    [XmlEnum("R8367")]
    Justizvollzugsanstalt_Rheinbach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Euskirchen</b><br/>
    /// Code: R8371<br/>
    /// </summary>
    [XmlEnum("R8371")]
    Justizvollzugsanstalt_Euskirchen,

    /// <summary>
    /// <b>Sozialtherapeutische Anstalt Bochum</b><br/>
    /// Code: R8998<br/>
    /// </summary>
    [XmlEnum("R8998")]
    Sozialtherapeutische_Anstalt_Bochum,

    /// <summary>
    /// <b>Justizvollzugsanstalt D&#252;sseldorf</b><br/>
    /// Code: R9071<br/>
    /// </summary>
    [XmlEnum("R9071")]
    Justizvollzugsanstalt_Duesseldorf,

    /// <summary>
    /// <b>Justizvollzugsanstalt Moers-Kapellen</b><br/>
    /// Code: R9090<br/>
    /// </summary>
    [XmlEnum("R9090")]
    Justizvollzugsanstalt_Moers_Kapellen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Aachen</b><br/>
    /// Code: R9099<br/>
    /// </summary>
    [XmlEnum("R9099")]
    Justizvollzugsanstalt_Aachen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Werl</b><br/>
    /// Code: R9162<br/>
    /// </summary>
    [XmlEnum("R9162")]
    Justizvollzugsanstalt_Werl,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hagen</b><br/>
    /// Code: R9165<br/>
    /// </summary>
    [XmlEnum("R9165")]
    Justizvollzugsanstalt_Hagen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bochum</b><br/>
    /// Code: R9167<br/>
    /// </summary>
    [XmlEnum("R9167")]
    Justizvollzugsanstalt_Bochum,

    /// <summary>
    /// <b>Justizvollzugsanstalt Castrop-Rauxel</b><br/>
    /// Code: R9169<br/>
    /// </summary>
    [XmlEnum("R9169")]
    Justizvollzugsanstalt_Castrop_Rauxel,

    /// <summary>
    /// <b>Justizvollzugsanstalt Detmold</b><br/>
    /// Code: R9170<br/>
    /// </summary>
    [XmlEnum("R9170")]
    Justizvollzugsanstalt_Detmold,

    /// <summary>
    /// <b>Justizvollzugsanstalt Dortmund</b><br/>
    /// Code: R9171<br/>
    /// </summary>
    [XmlEnum("R9171")]
    Justizvollzugsanstalt_Dortmund,

    /// <summary>
    /// <b>Justizvollzugsanstalt Essen</b><br/>
    /// Code: R9172<br/>
    /// </summary>
    [XmlEnum("R9172")]
    Justizvollzugsanstalt_Essen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Geldern</b><br/>
    /// Code: R9173<br/>
    /// </summary>
    [XmlEnum("R9173")]
    Justizvollzugsanstalt_Geldern,

    /// <summary>
    /// <b>Justizvollzugsanstalt Gelsenkirchen</b><br/>
    /// Code: R9174<br/>
    /// </summary>
    [XmlEnum("R9174")]
    Justizvollzugsanstalt_Gelsenkirchen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Heinsberg</b><br/>
    /// Code: R9175<br/>
    /// </summary>
    [XmlEnum("R9175")]
    Justizvollzugsanstalt_Heinsberg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Herford</b><br/>
    /// Code: R9176<br/>
    /// </summary>
    [XmlEnum("R9176")]
    Justizvollzugsanstalt_Herford,

    /// <summary>
    /// <b>Justizvollzugsanstalt H&#246;velhof</b><br/>
    /// Code: R9177<br/>
    /// </summary>
    [XmlEnum("R9177")]
    Justizvollzugsanstalt_Hoevelhof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Iserlohn</b><br/>
    /// Code: R9178<br/>
    /// </summary>
    [XmlEnum("R9178")]
    Justizvollzugsanstalt_Iserlohn,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kleve</b><br/>
    /// Code: R9179<br/>
    /// </summary>
    [XmlEnum("R9179")]
    Justizvollzugsanstalt_Kleve,

    /// <summary>
    /// <b>Justizvollzugsanstalt Remscheid</b><br/>
    /// Code: R9180<br/>
    /// </summary>
    [XmlEnum("R9180")]
    Justizvollzugsanstalt_Remscheid,

    /// <summary>
    /// <b>Justizvollzugsanstalt Schwerte</b><br/>
    /// Code: R9181<br/>
    /// </summary>
    [XmlEnum("R9181")]
    Justizvollzugsanstalt_Schwerte,

    /// <summary>
    /// <b>Justizvollzugsanstalt Wuppertal-Vohwinkel</b><br/>
    /// Code: R9182<br/>
    /// </summary>
    [XmlEnum("R9182")]
    Justizvollzugsanstalt_Wuppertal_Vohwinkel,

    /// <summary>
    /// <b>Justizvollzugsanstalt Willich I</b><br/>
    /// Code: R9288<br/>
    /// </summary>
    [XmlEnum("R9288")]
    Justizvollzugsanstalt_Willich_I,

    /// <summary>
    /// <b>Justizvollzugsanstalt Wuppertal-Ronsdorf</b><br/>
    /// Code: R9483<br/>
    /// </summary>
    [XmlEnum("R9483")]
    Justizvollzugsanstalt_Wuppertal_Ronsdorf,

    /// <summary>
    /// <b>Jugendarrestanstalt D&#252;sseldorf</b><br/>
    /// Code: R9565<br/>
    /// </summary>
    [XmlEnum("R9565")]
    Jugendarrestanstalt_Duesseldorf,

    /// <summary>
    /// <b>Test-Amtsgericht D&#252;sseldorf</b><br/>
    /// Code: R9999<br/>
    /// </summary>
    [XmlEnum("R9999")]
    Test_Amtsgericht_Duesseldorf,

    /// <summary>
    /// <b>Oberlandesgericht Koblenz</b><br/>
    /// Code: T2000<br/>
    /// </summary>
    [XmlEnum("T2000")]
    Oberlandesgericht_Koblenz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Koblenz</b><br/>
    /// Code: T2000S<br/>
    /// </summary>
    [XmlEnum("T2000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Koblenz,

    /// <summary>
    /// <b>Landgericht Bad Kreuznach</b><br/>
    /// Code: T2100<br/>
    /// </summary>
    [XmlEnum("T2100")]
    Landgericht_Bad_Kreuznach,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Bad Kreuznach</b><br/>
    /// Code: T2100S<br/>
    /// </summary>
    [XmlEnum("T2100S")]
    Staatsanwaltschaft_beim_Landgericht_Bad_Kreuznach,

    /// <summary>
    /// <b>Amtsgericht Bad Kreuznach</b><br/>
    /// Code: T2101<br/>
    /// </summary>
    [XmlEnum("T2101")]
    Amtsgericht_Bad_Kreuznach,

    /// <summary>
    /// <b>Grundbuchamt Bad Kreuznach</b><br/>
    /// Code: T2101G<br/>
    /// </summary>
    [XmlEnum("T2101G")]
    Grundbuchamt_Bad_Kreuznach,

    /// <summary>
    /// <b>Amtsgericht Bad Kreuznach, Insolvenzgericht</b><br/>
    /// Code: T2101I<br/>
    /// </summary>
    [XmlEnum("T2101I")]
    Amtsgericht_Bad_Kreuznach_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Bad Kreuznach</b><br/>
    /// Code: T2101V<br/>
    /// </summary>
    [XmlEnum("T2101V")]
    Registergericht_Amtsgericht_Bad_Kreuznach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Birkenfeld</b><br/>
    /// Code: T2102<br/>
    /// </summary>
    [XmlEnum("T2102")]
    aufgeloest_Amtsgericht_Birkenfeld,

    /// <summary>
    /// <b>Amtsgericht Idar-Oberstein</b><br/>
    /// Code: T2103<br/>
    /// </summary>
    [XmlEnum("T2103")]
    Amtsgericht_Idar_Oberstein,

    /// <summary>
    /// <b>Grundbuchamt Idar-Oberstein</b><br/>
    /// Code: T2103G<br/>
    /// </summary>
    [XmlEnum("T2103G")]
    Grundbuchamt_Idar_Oberstein,

    /// <summary>
    /// <b>Amtsgericht Idar-Oberstein, Insolvenzgericht</b><br/>
    /// Code: T2103I<br/>
    /// </summary>
    [XmlEnum("T2103I")]
    Amtsgericht_Idar_Oberstein_Insolvenzgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kirn</b><br/>
    /// Code: T2104<br/>
    /// </summary>
    [XmlEnum("T2104")]
    aufgeloest_Amtsgericht_Kirn,

    /// <summary>
    /// <b>Amtsgericht Simmern</b><br/>
    /// Code: T2105<br/>
    /// </summary>
    [XmlEnum("T2105")]
    Amtsgericht_Simmern,

    /// <summary>
    /// <b>Grundbuchamt Simmern/Hunsr&#252;ck</b><br/>
    /// Code: T2105G<br/>
    /// </summary>
    [XmlEnum("T2105G")]
    Grundbuchamt_Simmern_Hunsrueck,

    /// <summary>
    /// <b>Amtsgericht Bad Sobernheim</b><br/>
    /// Code: T2106<br/>
    /// </summary>
    [XmlEnum("T2106")]
    Amtsgericht_Bad_Sobernheim,

    /// <summary>
    /// <b>Grundbuchamt Bad Sobernheim</b><br/>
    /// Code: T2106G<br/>
    /// </summary>
    [XmlEnum("T2106G")]
    Grundbuchamt_Bad_Sobernheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Baumholder</b><br/>
    /// Code: T2107<br/>
    /// </summary>
    [XmlEnum("T2107")]
    aufgeloest_Amtsgericht_Baumholder,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kirchberg</b><br/>
    /// Code: T2108<br/>
    /// </summary>
    [XmlEnum("T2108")]
    aufgeloest_Amtsgericht_Kirchberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Meisenheim</b><br/>
    /// Code: T2109<br/>
    /// </summary>
    [XmlEnum("T2109")]
    aufgeloest_Amtsgericht_Meisenheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stromberg</b><br/>
    /// Code: T2110<br/>
    /// </summary>
    [XmlEnum("T2110")]
    aufgeloest_Amtsgericht_Stromberg,

    /// <summary>
    /// <b>Landgericht Koblenz</b><br/>
    /// Code: T2200<br/>
    /// </summary>
    [XmlEnum("T2200")]
    Landgericht_Koblenz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Koblenz</b><br/>
    /// Code: T2200S<br/>
    /// </summary>
    [XmlEnum("T2200S")]
    Staatsanwaltschaft_beim_Landgericht_Koblenz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Neuenahr-Ahrweiler, Zwst. Adenau</b><br/>
    /// Code: T2201<br/>
    /// </summary>
    [XmlEnum("T2201")]
    aufgeloest_Amtsgericht_Bad_Neuenahr_Ahrweiler_Zwst_Adenau,

    /// <summary>
    /// <b>Amtsgericht Altenkirchen</b><br/>
    /// Code: T2202<br/>
    /// </summary>
    [XmlEnum("T2202")]
    Amtsgericht_Altenkirchen,

    /// <summary>
    /// <b>Grundbuchamt Altenkirchen (Westerwald)</b><br/>
    /// Code: T2202G<br/>
    /// </summary>
    [XmlEnum("T2202G")]
    Grundbuchamt_Altenkirchen_Westerwald,

    /// <summary>
    /// <b>Amtsgericht Andernach</b><br/>
    /// Code: T2203<br/>
    /// </summary>
    [XmlEnum("T2203")]
    Amtsgericht_Andernach,

    /// <summary>
    /// <b>Grundbuchamt Andernach</b><br/>
    /// Code: T2203G<br/>
    /// </summary>
    [XmlEnum("T2203G")]
    Grundbuchamt_Andernach,

    /// <summary>
    /// <b>Amtsgericht Bad Neuenahr-Ahrweiler</b><br/>
    /// Code: T2204<br/>
    /// </summary>
    [XmlEnum("T2204")]
    Amtsgericht_Bad_Neuenahr_Ahrweiler,

    /// <summary>
    /// <b>Grundbuchamt Bad Neuenahr-Ahrweiler</b><br/>
    /// Code: T2204G<br/>
    /// </summary>
    [XmlEnum("T2204G")]
    Grundbuchamt_Bad_Neuenahr_Ahrweiler,

    /// <summary>
    /// <b>Amtsgericht Bad Neuenahr-Ahrweiler, Insolvenzgericht</b><br/>
    /// Code: T2204I<br/>
    /// </summary>
    [XmlEnum("T2204I")]
    Amtsgericht_Bad_Neuenahr_Ahrweiler_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Betzdorf</b><br/>
    /// Code: T2205<br/>
    /// </summary>
    [XmlEnum("T2205")]
    Amtsgericht_Betzdorf,

    /// <summary>
    /// <b>Grundbuchamt Betzdorf</b><br/>
    /// Code: T2205G<br/>
    /// </summary>
    [XmlEnum("T2205G")]
    Grundbuchamt_Betzdorf,

    /// <summary>
    /// <b>Amtsgericht Betzdorf, Insolvenzgericht</b><br/>
    /// Code: T2205I<br/>
    /// </summary>
    [XmlEnum("T2205I")]
    Amtsgericht_Betzdorf_Insolvenzgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Boppard</b><br/>
    /// Code: T2206<br/>
    /// </summary>
    [XmlEnum("T2206")]
    aufgeloest_Amtsgericht_Boppard,

    /// <summary>
    /// <b>Amtsgericht Cochem</b><br/>
    /// Code: T2207<br/>
    /// </summary>
    [XmlEnum("T2207")]
    Amtsgericht_Cochem,

    /// <summary>
    /// <b>Grundbuchamt Cochem</b><br/>
    /// Code: T2207G<br/>
    /// </summary>
    [XmlEnum("T2207G")]
    Grundbuchamt_Cochem,

    /// <summary>
    /// <b>Amtsgericht Cochem, Insolvenzgericht</b><br/>
    /// Code: T2207I<br/>
    /// </summary>
    [XmlEnum("T2207I")]
    Amtsgericht_Cochem_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Diez</b><br/>
    /// Code: T2208<br/>
    /// </summary>
    [XmlEnum("T2208")]
    Amtsgericht_Diez,

    /// <summary>
    /// <b>Grundbuchamt Diez</b><br/>
    /// Code: T2208G<br/>
    /// </summary>
    [XmlEnum("T2208G")]
    Grundbuchamt_Diez,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hachenburg</b><br/>
    /// Code: T2209<br/>
    /// </summary>
    [XmlEnum("T2209")]
    aufgeloest_Amtsgericht_Hachenburg,

    /// <summary>
    /// <b>Amtsgericht Koblenz</b><br/>
    /// Code: T2210<br/>
    /// </summary>
    [XmlEnum("T2210")]
    Amtsgericht_Koblenz,

    /// <summary>
    /// <b>Grundbuchamt Koblenz</b><br/>
    /// Code: T2210G<br/>
    /// </summary>
    [XmlEnum("T2210G")]
    Grundbuchamt_Koblenz,

    /// <summary>
    /// <b>Amtsgericht Koblenz, Insolvenzgericht</b><br/>
    /// Code: T2210I<br/>
    /// </summary>
    [XmlEnum("T2210I")]
    Amtsgericht_Koblenz_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Koblenz</b><br/>
    /// Code: T2210V<br/>
    /// </summary>
    [XmlEnum("T2210V")]
    Registergericht_Amtsgericht_Koblenz,

    /// <summary>
    /// <b>Amtsgericht Lahnstein</b><br/>
    /// Code: T2211<br/>
    /// </summary>
    [XmlEnum("T2211")]
    Amtsgericht_Lahnstein,

    /// <summary>
    /// <b>Grundbuchamt Lahnstein</b><br/>
    /// Code: T2211G<br/>
    /// </summary>
    [XmlEnum("T2211G")]
    Grundbuchamt_Lahnstein,

    /// <summary>
    /// <b>Amtsgericht Linz am Rhein</b><br/>
    /// Code: T2212<br/>
    /// </summary>
    [XmlEnum("T2212")]
    Amtsgericht_Linz_am_Rhein,

    /// <summary>
    /// <b>Grundbuchamt Linz am Rhein</b><br/>
    /// Code: T2212G<br/>
    /// </summary>
    [XmlEnum("T2212G")]
    Grundbuchamt_Linz_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Mayen</b><br/>
    /// Code: T2213<br/>
    /// </summary>
    [XmlEnum("T2213")]
    Amtsgericht_Mayen,

    /// <summary>
    /// <b>Grundbuchamt Mayen</b><br/>
    /// Code: T2213G<br/>
    /// </summary>
    [XmlEnum("T2213G")]
    Grundbuchamt_Mayen,

    /// <summary>
    /// <b>Amtsgericht Mayen, Insolvenzgericht</b><br/>
    /// Code: T2213I<br/>
    /// </summary>
    [XmlEnum("T2213I")]
    Amtsgericht_Mayen_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Mayen, Gemeinsames Mahngericht der L&#228;nder Rheinland-Pfalz und Saarland</b><br/>
    /// Code: T2213M<br/>
    /// </summary>
    [XmlEnum("T2213M")]
    Amtsgericht_Mayen_Gemeinsames_Mahngericht_der_Laender_Rheinland_Pfalz_und_Saarland,

    /// <summary>
    /// <b>Amtsgericht Montabaur</b><br/>
    /// Code: T2214<br/>
    /// </summary>
    [XmlEnum("T2214")]
    Amtsgericht_Montabaur,

    /// <summary>
    /// <b>Grundbuchamt Montabaur</b><br/>
    /// Code: T2214G<br/>
    /// </summary>
    [XmlEnum("T2214G")]
    Grundbuchamt_Montabaur,

    /// <summary>
    /// <b>Amtsgericht Montabaur, Insolvenzgericht</b><br/>
    /// Code: T2214I<br/>
    /// </summary>
    [XmlEnum("T2214I")]
    Amtsgericht_Montabaur_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Montabaur</b><br/>
    /// Code: T2214V<br/>
    /// </summary>
    [XmlEnum("T2214V")]
    Registergericht_Amtsgericht_Montabaur,

    /// <summary>
    /// <b>Amtsgericht Neuwied</b><br/>
    /// Code: T2215<br/>
    /// </summary>
    [XmlEnum("T2215")]
    Amtsgericht_Neuwied,

    /// <summary>
    /// <b>Grundbuchamt Neuwied</b><br/>
    /// Code: T2215G<br/>
    /// </summary>
    [XmlEnum("T2215G")]
    Grundbuchamt_Neuwied,

    /// <summary>
    /// <b>Amtsgericht Neuwied, Insolvenzgericht</b><br/>
    /// Code: T2215I<br/>
    /// </summary>
    [XmlEnum("T2215I")]
    Amtsgericht_Neuwied_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht St. Goar</b><br/>
    /// Code: T2216<br/>
    /// </summary>
    [XmlEnum("T2216")]
    Amtsgericht_St_Goar,

    /// <summary>
    /// <b>Grundbuchamt Sankt Goar</b><br/>
    /// Code: T2216G<br/>
    /// </summary>
    [XmlEnum("T2216G")]
    Grundbuchamt_Sankt_Goar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht St. Goarshausen</b><br/>
    /// Code: T2217<br/>
    /// </summary>
    [XmlEnum("T2217")]
    aufgeloest_Amtsgericht_St_Goarshausen,

    /// <summary>
    /// <b>Amtsgericht Sinzig</b><br/>
    /// Code: T2218<br/>
    /// </summary>
    [XmlEnum("T2218")]
    Amtsgericht_Sinzig,

    /// <summary>
    /// <b>Grundbuchamt Sinzig</b><br/>
    /// Code: T2218G<br/>
    /// </summary>
    [XmlEnum("T2218G")]
    Grundbuchamt_Sinzig,

    /// <summary>
    /// <b>Amtsgericht Westerburg</b><br/>
    /// Code: T2219<br/>
    /// </summary>
    [XmlEnum("T2219")]
    Amtsgericht_Westerburg,

    /// <summary>
    /// <b>Grundbuchamt Westerburg</b><br/>
    /// Code: T2219G<br/>
    /// </summary>
    [XmlEnum("T2219G")]
    Grundbuchamt_Westerburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Asbach</b><br/>
    /// Code: T2220<br/>
    /// </summary>
    [XmlEnum("T2220")]
    aufgeloest_Amtsgericht_Asbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Ems</b><br/>
    /// Code: T2221<br/>
    /// </summary>
    [XmlEnum("T2221")]
    aufgeloest_Amtsgericht_Bad_Ems,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Daaden</b><br/>
    /// Code: T2222<br/>
    /// </summary>
    [XmlEnum("T2222")]
    aufgeloest_Amtsgericht_Daaden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dierdorf</b><br/>
    /// Code: T2223<br/>
    /// </summary>
    [XmlEnum("T2223")]
    aufgeloest_Amtsgericht_Dierdorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht H&#246;hr-Grenzhausen</b><br/>
    /// Code: T2224<br/>
    /// </summary>
    [XmlEnum("T2224")]
    aufgeloest_Amtsgericht_Hoehr_Grenzhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kastellaun</b><br/>
    /// Code: T2225<br/>
    /// </summary>
    [XmlEnum("T2225")]
    aufgeloest_Amtsgericht_Kastellaun,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kirchen</b><br/>
    /// Code: T2226<br/>
    /// </summary>
    [XmlEnum("T2226")]
    aufgeloest_Amtsgericht_Kirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Marienberg</b><br/>
    /// Code: T2227<br/>
    /// </summary>
    [XmlEnum("T2227")]
    aufgeloest_Amtsgericht_Marienberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht M&#252;nstermaifeld</b><br/>
    /// Code: T2228<br/>
    /// </summary>
    [XmlEnum("T2228")]
    aufgeloest_Amtsgericht_Muenstermaifeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Nassau</b><br/>
    /// Code: T2229<br/>
    /// </summary>
    [XmlEnum("T2229")]
    aufgeloest_Amtsgericht_Nassau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Nast&#228;tten</b><br/>
    /// Code: T2230<br/>
    /// </summary>
    [XmlEnum("T2230")]
    aufgeloest_Amtsgericht_Nastaetten,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rennerod</b><br/>
    /// Code: T2231<br/>
    /// </summary>
    [XmlEnum("T2231")]
    aufgeloest_Amtsgericht_Rennerod,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Selters</b><br/>
    /// Code: T2232<br/>
    /// </summary>
    [XmlEnum("T2232")]
    aufgeloest_Amtsgericht_Selters,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Traben-Trarbach</b><br/>
    /// Code: T2233<br/>
    /// </summary>
    [XmlEnum("T2233")]
    aufgeloest_Amtsgericht_Traben_Trarbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wallmerod</b><br/>
    /// Code: T2234<br/>
    /// </summary>
    [XmlEnum("T2234")]
    aufgeloest_Amtsgericht_Wallmerod,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wissen</b><br/>
    /// Code: T2235<br/>
    /// </summary>
    [XmlEnum("T2235")]
    aufgeloest_Amtsgericht_Wissen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Zell</b><br/>
    /// Code: T2236<br/>
    /// </summary>
    [XmlEnum("T2236")]
    aufgeloest_Amtsgericht_Zell,

    /// <summary>
    /// <b>Landgericht Mainz</b><br/>
    /// Code: T2300<br/>
    /// </summary>
    [XmlEnum("T2300")]
    Landgericht_Mainz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Mainz</b><br/>
    /// Code: T2300S<br/>
    /// </summary>
    [XmlEnum("T2300S")]
    Staatsanwaltschaft_beim_Landgericht_Mainz,

    /// <summary>
    /// <b>Amtsgericht Alzey</b><br/>
    /// Code: T2301<br/>
    /// </summary>
    [XmlEnum("T2301")]
    Amtsgericht_Alzey,

    /// <summary>
    /// <b>Grundbuchamt Alzey</b><br/>
    /// Code: T2301G<br/>
    /// </summary>
    [XmlEnum("T2301G")]
    Grundbuchamt_Alzey,

    /// <summary>
    /// <b>Amtsgericht Alzey, Insolvenzgericht</b><br/>
    /// Code: T2301I<br/>
    /// </summary>
    [XmlEnum("T2301I")]
    Amtsgericht_Alzey_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Bingen</b><br/>
    /// Code: T2302<br/>
    /// </summary>
    [XmlEnum("T2302")]
    Amtsgericht_Bingen,

    /// <summary>
    /// <b>Grundbuchamt Bingen am Rhein</b><br/>
    /// Code: T2302G<br/>
    /// </summary>
    [XmlEnum("T2302G")]
    Grundbuchamt_Bingen_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Bingen am Rhein, Insolvenzgericht</b><br/>
    /// Code: T2302I<br/>
    /// </summary>
    [XmlEnum("T2302I")]
    Amtsgericht_Bingen_am_Rhein_Insolvenzgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bingen, Zwst. Ingelheim am Rhein</b><br/>
    /// Code: T2303<br/>
    /// </summary>
    [XmlEnum("T2303")]
    aufgeloest_Amtsgericht_Bingen_Zwst_Ingelheim_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Mainz</b><br/>
    /// Code: T2304<br/>
    /// </summary>
    [XmlEnum("T2304")]
    Amtsgericht_Mainz,

    /// <summary>
    /// <b>Grundbuchamt Mainz</b><br/>
    /// Code: T2304G<br/>
    /// </summary>
    [XmlEnum("T2304G")]
    Grundbuchamt_Mainz,

    /// <summary>
    /// <b>Amtsgericht Mainz, Insolvenzgericht</b><br/>
    /// Code: T2304I<br/>
    /// </summary>
    [XmlEnum("T2304I")]
    Amtsgericht_Mainz_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Mainz</b><br/>
    /// Code: T2304V<br/>
    /// </summary>
    [XmlEnum("T2304V")]
    Registergericht_Amtsgericht_Mainz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Oppenheim</b><br/>
    /// Code: T2305<br/>
    /// </summary>
    [XmlEnum("T2305")]
    aufgeloest_Amtsgericht_Oppenheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht W&#246;llstein</b><br/>
    /// Code: T2306<br/>
    /// </summary>
    [XmlEnum("T2306")]
    aufgeloest_Amtsgericht_Woellstein,

    /// <summary>
    /// <b>Amtsgericht Worms</b><br/>
    /// Code: T2307<br/>
    /// </summary>
    [XmlEnum("T2307")]
    Amtsgericht_Worms,

    /// <summary>
    /// <b>Grundbuchamt Worms</b><br/>
    /// Code: T2307G<br/>
    /// </summary>
    [XmlEnum("T2307G")]
    Grundbuchamt_Worms,

    /// <summary>
    /// <b>Amtsgericht Worms, Insolvenzgericht</b><br/>
    /// Code: T2307I<br/>
    /// </summary>
    [XmlEnum("T2307I")]
    Amtsgericht_Worms_Insolvenzgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Mainz, Zwst. Worms</b><br/>
    /// Code: T2307S<br/>
    /// </summary>
    [XmlEnum("T2307S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Mainz_Zwst_Worms,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht W&#246;rrstadt</b><br/>
    /// Code: T2308<br/>
    /// </summary>
    [XmlEnum("T2308")]
    aufgeloest_Amtsgericht_Woerrstadt,

    /// <summary>
    /// <b>Landgericht Trier</b><br/>
    /// Code: T2400<br/>
    /// </summary>
    [XmlEnum("T2400")]
    Landgericht_Trier,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Trier</b><br/>
    /// Code: T2400S<br/>
    /// </summary>
    [XmlEnum("T2400S")]
    Staatsanwaltschaft_beim_Landgericht_Trier,

    /// <summary>
    /// <b>Amtsgericht Bernkastel-Kues</b><br/>
    /// Code: T2401<br/>
    /// </summary>
    [XmlEnum("T2401")]
    Amtsgericht_Bernkastel_Kues,

    /// <summary>
    /// <b>Grundbuchamt Bernkastel-Kues</b><br/>
    /// Code: T2401G<br/>
    /// </summary>
    [XmlEnum("T2401G")]
    Grundbuchamt_Bernkastel_Kues,

    /// <summary>
    /// <b>Amtsgericht Bitburg</b><br/>
    /// Code: T2402<br/>
    /// </summary>
    [XmlEnum("T2402")]
    Amtsgericht_Bitburg,

    /// <summary>
    /// <b>Grundbuchamt Bitburg</b><br/>
    /// Code: T2402G<br/>
    /// </summary>
    [XmlEnum("T2402G")]
    Grundbuchamt_Bitburg,

    /// <summary>
    /// <b>Amtsgericht Bitburg, Insolvenzgericht</b><br/>
    /// Code: T2402I<br/>
    /// </summary>
    [XmlEnum("T2402I")]
    Amtsgericht_Bitburg_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Daun</b><br/>
    /// Code: T2403<br/>
    /// </summary>
    [XmlEnum("T2403")]
    Amtsgericht_Daun,

    /// <summary>
    /// <b>Grundbuchamt Daun</b><br/>
    /// Code: T2403G<br/>
    /// </summary>
    [XmlEnum("T2403G")]
    Grundbuchamt_Daun,

    /// <summary>
    /// <b>Amtsgericht Hermeskeil</b><br/>
    /// Code: T2404<br/>
    /// </summary>
    [XmlEnum("T2404")]
    Amtsgericht_Hermeskeil,

    /// <summary>
    /// <b>Grundbuchamt Hermeskeil</b><br/>
    /// Code: T2404G<br/>
    /// </summary>
    [XmlEnum("T2404G")]
    Grundbuchamt_Hermeskeil,

    /// <summary>
    /// <b>Amtsgericht Pr&#252;m</b><br/>
    /// Code: T2405<br/>
    /// </summary>
    [XmlEnum("T2405")]
    Amtsgericht_Pruem,

    /// <summary>
    /// <b>Grundbuchamt Pr&#252;m</b><br/>
    /// Code: T2405G<br/>
    /// </summary>
    [XmlEnum("T2405G")]
    Grundbuchamt_Pruem,

    /// <summary>
    /// <b>Amtsgericht Saarburg</b><br/>
    /// Code: T2406<br/>
    /// </summary>
    [XmlEnum("T2406")]
    Amtsgericht_Saarburg,

    /// <summary>
    /// <b>Grundbuchamt Saarburg</b><br/>
    /// Code: T2406G<br/>
    /// </summary>
    [XmlEnum("T2406G")]
    Grundbuchamt_Saarburg,

    /// <summary>
    /// <b>Amtsgericht Trier</b><br/>
    /// Code: T2407<br/>
    /// </summary>
    [XmlEnum("T2407")]
    Amtsgericht_Trier,

    /// <summary>
    /// <b>Grundbuchamt Trier</b><br/>
    /// Code: T2407G<br/>
    /// </summary>
    [XmlEnum("T2407G")]
    Grundbuchamt_Trier,

    /// <summary>
    /// <b>Amtsgericht Trier, Insolvenzgericht</b><br/>
    /// Code: T2407I<br/>
    /// </summary>
    [XmlEnum("T2407I")]
    Amtsgericht_Trier_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Wittlich</b><br/>
    /// Code: T2408<br/>
    /// </summary>
    [XmlEnum("T2408")]
    Amtsgericht_Wittlich,

    /// <summary>
    /// <b>Grundbuchamt Wittlich</b><br/>
    /// Code: T2408G<br/>
    /// </summary>
    [XmlEnum("T2408G")]
    Grundbuchamt_Wittlich,

    /// <summary>
    /// <b>Amtsgericht Wittlich, Insolvenzgericht</b><br/>
    /// Code: T2408I<br/>
    /// </summary>
    [XmlEnum("T2408I")]
    Amtsgericht_Wittlich_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Wittlich</b><br/>
    /// Code: T2408V<br/>
    /// </summary>
    [XmlEnum("T2408V")]
    Registergericht_Amtsgericht_Wittlich,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hillesheim</b><br/>
    /// Code: T2409<br/>
    /// </summary>
    [XmlEnum("T2409")]
    aufgeloest_Amtsgericht_Hillesheim,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neuerburg</b><br/>
    /// Code: T2410<br/>
    /// </summary>
    [XmlEnum("T2410")]
    aufgeloest_Amtsgericht_Neuerburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neumagen</b><br/>
    /// Code: T2411<br/>
    /// </summary>
    [XmlEnum("T2411")]
    aufgeloest_Amtsgericht_Neumagen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rhaunen</b><br/>
    /// Code: T2412<br/>
    /// </summary>
    [XmlEnum("T2412")]
    aufgeloest_Amtsgericht_Rhaunen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Waxweiler</b><br/>
    /// Code: T2413<br/>
    /// </summary>
    [XmlEnum("T2413")]
    aufgeloest_Amtsgericht_Waxweiler,

    /// <summary>
    /// <b>Oberlandesgericht Zweibr&#252;cken</b><br/>
    /// Code: T3000<br/>
    /// </summary>
    [XmlEnum("T3000")]
    Oberlandesgericht_Zweibruecken,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Zweibr&#252;cken</b><br/>
    /// Code: T3000S<br/>
    /// </summary>
    [XmlEnum("T3000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Zweibruecken,

    /// <summary>
    /// <b>Landgericht Frankenthal</b><br/>
    /// Code: T3100<br/>
    /// </summary>
    [XmlEnum("T3100")]
    Landgericht_Frankenthal,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Frankenthal (Pfalz)</b><br/>
    /// Code: T3100S<br/>
    /// </summary>
    [XmlEnum("T3100S")]
    Staatsanwaltschaft_beim_Landgericht_Frankenthal_Pfalz,

    /// <summary>
    /// <b>Amtsgericht Bad D&#252;rkheim</b><br/>
    /// Code: T3101<br/>
    /// </summary>
    [XmlEnum("T3101")]
    Amtsgericht_Bad_Duerkheim,

    /// <summary>
    /// <b>Grundbuchamt Bad D&#252;rkheim</b><br/>
    /// Code: T3101G<br/>
    /// </summary>
    [XmlEnum("T3101G")]
    Grundbuchamt_Bad_Duerkheim,

    /// <summary>
    /// <b>Amtsgericht Frankenthal</b><br/>
    /// Code: T3102<br/>
    /// </summary>
    [XmlEnum("T3102")]
    Amtsgericht_Frankenthal,

    /// <summary>
    /// <b>Grundbuchamt Frankenthal (Pfalz)</b><br/>
    /// Code: T3102G<br/>
    /// </summary>
    [XmlEnum("T3102G")]
    Grundbuchamt_Frankenthal_Pfalz,

    /// <summary>
    /// <b>Amtsgericht Gr&#252;nstadt</b><br/>
    /// Code: T3103<br/>
    /// </summary>
    [XmlEnum("T3103")]
    Amtsgericht_Gruenstadt,

    /// <summary>
    /// <b>Grundbuchamt Gr&#252;nstadt</b><br/>
    /// Code: T3103G<br/>
    /// </summary>
    [XmlEnum("T3103G")]
    Grundbuchamt_Gruenstadt,

    /// <summary>
    /// <b>Amtsgericht Ludwigshafen a.Rhein</b><br/>
    /// Code: T3104<br/>
    /// </summary>
    [XmlEnum("T3104")]
    Amtsgericht_Ludwigshafen_a_Rhein,

    /// <summary>
    /// <b>Grundbuchamt Ludwigshafen am Rhein</b><br/>
    /// Code: T3104G<br/>
    /// </summary>
    [XmlEnum("T3104G")]
    Grundbuchamt_Ludwigshafen_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Ludwigshafen am Rhein, Insolvenzgericht</b><br/>
    /// Code: T3104I<br/>
    /// </summary>
    [XmlEnum("T3104I")]
    Amtsgericht_Ludwigshafen_am_Rhein_Insolvenzgericht,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Frankenthal (Pfalz), Zwst. Ludwigshafen/Rhein</b><br/>
    /// Code: T3104S<br/>
    /// </summary>
    [XmlEnum("T3104S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Frankenthal_Pfalz_Zwst_Ludwigshafen_Rhein,

    /// <summary>
    /// <b>Registergericht Amtsgericht Ludwigshafen am Rhein</b><br/>
    /// Code: T3104V<br/>
    /// </summary>
    [XmlEnum("T3104V")]
    Registergericht_Amtsgericht_Ludwigshafen_am_Rhein,

    /// <summary>
    /// <b>Amtsgericht Neustadt (an der Weinstra&#223;e)</b><br/>
    /// Code: T3105<br/>
    /// </summary>
    [XmlEnum("T3105")]
    Amtsgericht_Neustadt_an_der_Weinstrasse,

    /// <summary>
    /// <b>Grundbuchamt Neustadt an der Weinstra&#223;e</b><br/>
    /// Code: T3105G<br/>
    /// </summary>
    [XmlEnum("T3105G")]
    Grundbuchamt_Neustadt_an_der_Weinstrasse,

    /// <summary>
    /// <b>Amtsgericht Neustadt an der Weinstra&#223;e, Insolvenzgericht</b><br/>
    /// Code: T3105I<br/>
    /// </summary>
    [XmlEnum("T3105I")]
    Amtsgericht_Neustadt_an_der_Weinstrasse_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Speyer</b><br/>
    /// Code: T3106<br/>
    /// </summary>
    [XmlEnum("T3106")]
    Amtsgericht_Speyer,

    /// <summary>
    /// <b>Grundbuchamt Speyer</b><br/>
    /// Code: T3106G<br/>
    /// </summary>
    [XmlEnum("T3106G")]
    Grundbuchamt_Speyer,

    /// <summary>
    /// <b>Landgericht Kaiserslautern</b><br/>
    /// Code: T3200<br/>
    /// </summary>
    [XmlEnum("T3200")]
    Landgericht_Kaiserslautern,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Kaiserslautern</b><br/>
    /// Code: T3200S<br/>
    /// </summary>
    [XmlEnum("T3200S")]
    Staatsanwaltschaft_beim_Landgericht_Kaiserslautern,

    /// <summary>
    /// <b>Amtsgericht Kaiserslautern</b><br/>
    /// Code: T3201<br/>
    /// </summary>
    [XmlEnum("T3201")]
    Amtsgericht_Kaiserslautern,

    /// <summary>
    /// <b>Grundbuchamt Kaiserslautern</b><br/>
    /// Code: T3201G<br/>
    /// </summary>
    [XmlEnum("T3201G")]
    Grundbuchamt_Kaiserslautern,

    /// <summary>
    /// <b>Amtsgericht Kaiserslautern, Insolvenzgericht</b><br/>
    /// Code: T3201I<br/>
    /// </summary>
    [XmlEnum("T3201I")]
    Amtsgericht_Kaiserslautern_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Kaiserslautern, Zentrales Vollstreckungsgericht Rheinland-Pfalz</b><br/>
    /// Code: T3201R<br/>
    /// </summary>
    [XmlEnum("T3201R")]
    Amtsgericht_Kaiserslautern_Zentrales_Vollstreckungsgericht_Rheinland_Pfalz,

    /// <summary>
    /// <b>Registergericht Amtsgericht Kaiserslautern</b><br/>
    /// Code: T3201V<br/>
    /// </summary>
    [XmlEnum("T3201V")]
    Registergericht_Amtsgericht_Kaiserslautern,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kirchheimbolanden</b><br/>
    /// Code: T3202<br/>
    /// </summary>
    [XmlEnum("T3202")]
    aufgeloest_Amtsgericht_Kirchheimbolanden,

    /// <summary>
    /// <b>Amtsgericht Kusel</b><br/>
    /// Code: T3203<br/>
    /// </summary>
    [XmlEnum("T3203")]
    Amtsgericht_Kusel,

    /// <summary>
    /// <b>Grundbuchamt Kusel</b><br/>
    /// Code: T3203G<br/>
    /// </summary>
    [XmlEnum("T3203G")]
    Grundbuchamt_Kusel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lauterecken</b><br/>
    /// Code: T3204<br/>
    /// </summary>
    [XmlEnum("T3204")]
    aufgeloest_Amtsgericht_Lauterecken,

    /// <summary>
    /// <b>Amtsgericht Rockenhausen</b><br/>
    /// Code: T3205<br/>
    /// </summary>
    [XmlEnum("T3205")]
    Amtsgericht_Rockenhausen,

    /// <summary>
    /// <b>Grundbuchamt Rockenhausen</b><br/>
    /// Code: T3205G<br/>
    /// </summary>
    [XmlEnum("T3205G")]
    Grundbuchamt_Rockenhausen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Obermoschel</b><br/>
    /// Code: T3206<br/>
    /// </summary>
    [XmlEnum("T3206")]
    aufgeloest_Amtsgericht_Obermoschel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Winnweiler</b><br/>
    /// Code: T3207<br/>
    /// </summary>
    [XmlEnum("T3207")]
    aufgeloest_Amtsgericht_Winnweiler,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wolfstein</b><br/>
    /// Code: T3208<br/>
    /// </summary>
    [XmlEnum("T3208")]
    aufgeloest_Amtsgericht_Wolfstein,

    /// <summary>
    /// <b>Landgericht Landau (Pfalz)</b><br/>
    /// Code: T3300<br/>
    /// </summary>
    [XmlEnum("T3300")]
    Landgericht_Landau_Pfalz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Landau in der Pfalz</b><br/>
    /// Code: T3300S<br/>
    /// </summary>
    [XmlEnum("T3300S")]
    Staatsanwaltschaft_beim_Landgericht_Landau_in_der_Pfalz,

    /// <summary>
    /// <b>Amtsgericht Landau Zweigstelle Bad Bergzabern</b><br/>
    /// Code: T3301<br/>
    /// </summary>
    [XmlEnum("T3301")]
    Amtsgericht_Landau_Zweigstelle_Bad_Bergzabern,

    /// <summary>
    /// <b>Grundbuchamt Bad Bergzabern</b><br/>
    /// Code: T3301G<br/>
    /// </summary>
    [XmlEnum("T3301G")]
    Grundbuchamt_Bad_Bergzabern,

    /// <summary>
    /// <b>Amtsgericht Germersheim</b><br/>
    /// Code: T3302<br/>
    /// </summary>
    [XmlEnum("T3302")]
    Amtsgericht_Germersheim,

    /// <summary>
    /// <b>Grundbuchamt Germersheim</b><br/>
    /// Code: T3302G<br/>
    /// </summary>
    [XmlEnum("T3302G")]
    Grundbuchamt_Germersheim,

    /// <summary>
    /// <b>Amtsgericht Kandel</b><br/>
    /// Code: T3303<br/>
    /// </summary>
    [XmlEnum("T3303")]
    Amtsgericht_Kandel,

    /// <summary>
    /// <b>Grundbuchamt Kandel</b><br/>
    /// Code: T3303G<br/>
    /// </summary>
    [XmlEnum("T3303G")]
    Grundbuchamt_Kandel,

    /// <summary>
    /// <b>Amtsgericht Landau (Pfalz)</b><br/>
    /// Code: T3304<br/>
    /// </summary>
    [XmlEnum("T3304")]
    Amtsgericht_Landau_Pfalz,

    /// <summary>
    /// <b>Grundbuchamt Landau in der Pfalz</b><br/>
    /// Code: T3304G<br/>
    /// </summary>
    [XmlEnum("T3304G")]
    Grundbuchamt_Landau_in_der_Pfalz,

    /// <summary>
    /// <b>Amtsgericht Landau in der Pfalz, Insolvenzgericht</b><br/>
    /// Code: T3304I<br/>
    /// </summary>
    [XmlEnum("T3304I")]
    Amtsgericht_Landau_in_der_Pfalz_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Landau in der Pfalz</b><br/>
    /// Code: T3304V<br/>
    /// </summary>
    [XmlEnum("T3304V")]
    Registergericht_Amtsgericht_Landau_in_der_Pfalz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Annweiler</b><br/>
    /// Code: T3305<br/>
    /// </summary>
    [XmlEnum("T3305")]
    aufgeloest_Amtsgericht_Annweiler,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Edenkoben</b><br/>
    /// Code: T3306<br/>
    /// </summary>
    [XmlEnum("T3306")]
    aufgeloest_Amtsgericht_Edenkoben,

    /// <summary>
    /// <b>Landgericht Zweibr&#252;cken</b><br/>
    /// Code: T3400<br/>
    /// </summary>
    [XmlEnum("T3400")]
    Landgericht_Zweibruecken,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Zweibr&#252;cken</b><br/>
    /// Code: T3400S<br/>
    /// </summary>
    [XmlEnum("T3400S")]
    Staatsanwaltschaft_beim_Landgericht_Zweibruecken,

    /// <summary>
    /// <b>Amtsgericht Landstuhl</b><br/>
    /// Code: T3401<br/>
    /// </summary>
    [XmlEnum("T3401")]
    Amtsgericht_Landstuhl,

    /// <summary>
    /// <b>Grundbuchamt Landstuhl</b><br/>
    /// Code: T3401G<br/>
    /// </summary>
    [XmlEnum("T3401G")]
    Grundbuchamt_Landstuhl,

    /// <summary>
    /// <b>Amtsgericht Pirmasens</b><br/>
    /// Code: T3402<br/>
    /// </summary>
    [XmlEnum("T3402")]
    Amtsgericht_Pirmasens,

    /// <summary>
    /// <b>Grundbuchamt Pirmasens</b><br/>
    /// Code: T3402G<br/>
    /// </summary>
    [XmlEnum("T3402G")]
    Grundbuchamt_Pirmasens,

    /// <summary>
    /// <b>Amtsgericht Pirmasens, Insolvenzgericht</b><br/>
    /// Code: T3402I<br/>
    /// </summary>
    [XmlEnum("T3402I")]
    Amtsgericht_Pirmasens_Insolvenzgericht,

    /// <summary>
    /// <b>Amtsgericht Zweibr&#252;cken</b><br/>
    /// Code: T3403<br/>
    /// </summary>
    [XmlEnum("T3403")]
    Amtsgericht_Zweibruecken,

    /// <summary>
    /// <b>Grundbuchamt Zweibr&#252;cken</b><br/>
    /// Code: T3403G<br/>
    /// </summary>
    [XmlEnum("T3403G")]
    Grundbuchamt_Zweibruecken,

    /// <summary>
    /// <b>Amtsgericht Zweibr&#252;cken, Insolvenzgericht</b><br/>
    /// Code: T3403I<br/>
    /// </summary>
    [XmlEnum("T3403I")]
    Amtsgericht_Zweibruecken_Insolvenzgericht,

    /// <summary>
    /// <b>Registergericht Amtsgericht Zweibr&#252;cken</b><br/>
    /// Code: T3403V<br/>
    /// </summary>
    [XmlEnum("T3403V")]
    Registergericht_Amtsgericht_Zweibruecken,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dahn</b><br/>
    /// Code: T3404<br/>
    /// </summary>
    [XmlEnum("T3404")]
    aufgeloest_Amtsgericht_Dahn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Waldfischbach</b><br/>
    /// Code: T3405<br/>
    /// </summary>
    [XmlEnum("T3405")]
    aufgeloest_Amtsgericht_Waldfischbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Waldmohr</b><br/>
    /// Code: T3406<br/>
    /// </summary>
    [XmlEnum("T3406")]
    aufgeloest_Amtsgericht_Waldmohr,

    /// <summary>
    /// <b>Arbeitsgericht Kaiserslautern</b><br/>
    /// Code: T6072<br/>
    /// </summary>
    [XmlEnum("T6072")]
    Arbeitsgericht_Kaiserslautern,

    /// <summary>
    /// <b>Sozialgericht Koblenz</b><br/>
    /// Code: T6073<br/>
    /// </summary>
    [XmlEnum("T6073")]
    Sozialgericht_Koblenz,

    /// <summary>
    /// <b>Oberverwaltungsgericht Rheinland-Pfalz</b><br/>
    /// Code: T6074<br/>
    /// </summary>
    [XmlEnum("T6074")]
    Oberverwaltungsgericht_Rheinland_Pfalz,

    /// <summary>
    /// <b>Verfassungsgerichtshof Rheinland-Pfalz</b><br/>
    /// Code: T6075<br/>
    /// </summary>
    [XmlEnum("T6075")]
    Verfassungsgerichtshof_Rheinland_Pfalz,

    /// <summary>
    /// <b>Verwaltungsgericht Koblenz</b><br/>
    /// Code: T6076<br/>
    /// </summary>
    [XmlEnum("T6076")]
    Verwaltungsgericht_Koblenz,

    /// <summary>
    /// <b>Arbeitsgericht Koblenz</b><br/>
    /// Code: T6077<br/>
    /// </summary>
    [XmlEnum("T6077")]
    Arbeitsgericht_Koblenz,

    /// <summary>
    /// <b>Arbeitsgericht Ludwigshafen</b><br/>
    /// Code: T6078<br/>
    /// </summary>
    [XmlEnum("T6078")]
    Arbeitsgericht_Ludwigshafen,

    /// <summary>
    /// <b>Landessozialgericht Rheinland-Pfalz</b><br/>
    /// Code: T6079<br/>
    /// </summary>
    [XmlEnum("T6079")]
    Landessozialgericht_Rheinland_Pfalz,

    /// <summary>
    /// <b>Arbeitsgericht Mainz</b><br/>
    /// Code: T6080<br/>
    /// </summary>
    [XmlEnum("T6080")]
    Arbeitsgericht_Mainz,

    /// <summary>
    /// <b>Landesarbeitsgericht Rheinland-Pfalz</b><br/>
    /// Code: T6081<br/>
    /// </summary>
    [XmlEnum("T6081")]
    Landesarbeitsgericht_Rheinland_Pfalz,

    /// <summary>
    /// <b>Verwaltungsgericht Mainz</b><br/>
    /// Code: T6082<br/>
    /// </summary>
    [XmlEnum("T6082")]
    Verwaltungsgericht_Mainz,

    /// <summary>
    /// <b>Verwaltungsgericht Neustadt an der Weinstra&#223;e</b><br/>
    /// Code: T6083<br/>
    /// </summary>
    [XmlEnum("T6083")]
    Verwaltungsgericht_Neustadt_an_der_Weinstrasse,

    /// <summary>
    /// <b>Finanzgericht Rheinland-Pfalz</b><br/>
    /// Code: T6084<br/>
    /// </summary>
    [XmlEnum("T6084")]
    Finanzgericht_Rheinland_Pfalz,

    /// <summary>
    /// <b>Verwaltungsgericht Trier</b><br/>
    /// Code: T6085<br/>
    /// </summary>
    [XmlEnum("T6085")]
    Verwaltungsgericht_Trier,

    /// <summary>
    /// <b>Sozialgericht Trier</b><br/>
    /// Code: T6086<br/>
    /// </summary>
    [XmlEnum("T6086")]
    Sozialgericht_Trier,

    /// <summary>
    /// <b>Arbeitsgericht Trier</b><br/>
    /// Code: T6121<br/>
    /// </summary>
    [XmlEnum("T6121")]
    Arbeitsgericht_Trier,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer Koblenz</b><br/>
    /// Code: T6176<br/>
    /// </summary>
    [XmlEnum("T6176")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_Koblenz,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Pf&#228;lzischen Rechtsanwaltskammer</b><br/>
    /// Code: T6182<br/>
    /// </summary>
    [XmlEnum("T6182")]
    Anwaltsgericht_fuer_den_Bezirk_der_Pfaelzischen_Rechtsanwaltskammer,

    /// <summary>
    /// <b>Anwaltsgerichtshof Rheinland-Pfalz</b><br/>
    /// Code: T6183<br/>
    /// </summary>
    [XmlEnum("T6183")]
    Anwaltsgerichtshof_Rheinland_Pfalz,

    /// <summary>
    /// <b>Sozialgericht Mainz</b><br/>
    /// Code: T6221<br/>
    /// </summary>
    [XmlEnum("T6221")]
    Sozialgericht_Mainz,

    /// <summary>
    /// <b>Sozialgericht Speyer</b><br/>
    /// Code: T6252<br/>
    /// </summary>
    [XmlEnum("T6252")]
    Sozialgericht_Speyer,

    /// <summary>
    /// <b>Jugendstrafanstalt Schifferstadt</b><br/>
    /// Code: T6311<br/>
    /// </summary>
    [XmlEnum("T6311")]
    Jugendstrafanstalt_Schifferstadt,

    /// <summary>
    /// <b>Jugendarrestanstalt Worms</b><br/>
    /// Code: T6347<br/>
    /// </summary>
    [XmlEnum("T6347")]
    Jugendarrestanstalt_Worms,

    /// <summary>
    /// <b>Arbeitsgericht Kaiserslautern - Ausw&#228;rtige Kammern Pirmasens</b><br/>
    /// Code: T6840<br/>
    /// </summary>
    [XmlEnum("T6840")]
    Arbeitsgericht_Kaiserslautern_Auswaertige_Kammern_Pirmasens,

    /// <summary>
    /// <b>Arbeitsgericht Ludwigshafen am Rhein - Ausw&#228;rtige Kammern Landau i. d. Pfalz</b><br/>
    /// Code: T6841<br/>
    /// </summary>
    [XmlEnum("T6841")]
    Arbeitsgericht_Ludwigshafen_am_Rhein_Auswaertige_Kammern_Landau_i_d_Pfalz,

    /// <summary>
    /// <b>Arbeitsgericht Mainz - Ausw&#228;rtige Kammern Bad Kreuznach</b><br/>
    /// Code: T6842<br/>
    /// </summary>
    [XmlEnum("T6842")]
    Arbeitsgericht_Mainz_Auswaertige_Kammern_Bad_Kreuznach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Frankenthal</b><br/>
    /// Code: T7894<br/>
    /// </summary>
    [XmlEnum("T7894")]
    Justizvollzugsanstalt_Frankenthal,

    /// <summary>
    /// <b>Justizvollzugsanstalt Koblenz</b><br/>
    /// Code: T7895<br/>
    /// </summary>
    [XmlEnum("T7895")]
    Justizvollzugsanstalt_Koblenz,

    /// <summary>
    /// <b>Justizvollzugsanstalt Wittlich</b><br/>
    /// Code: T7913<br/>
    /// </summary>
    [XmlEnum("T7913")]
    Justizvollzugsanstalt_Wittlich,

    /// <summary>
    /// <b>Justizvollzugsanstalt Diez</b><br/>
    /// Code: T7929<br/>
    /// </summary>
    [XmlEnum("T7929")]
    Justizvollzugsanstalt_Diez,

    /// <summary>
    /// <b>Justizvollzugsanstalt Trier</b><br/>
    /// Code: T7945<br/>
    /// </summary>
    [XmlEnum("T7945")]
    Justizvollzugsanstalt_Trier,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ludwigshafen -Sozialtherapeutische Anstalt-</b><br/>
    /// Code: T7946<br/>
    /// </summary>
    [XmlEnum("T7946")]
    Justizvollzugsanstalt_Ludwigshafen_Sozialtherapeutische_Anstalt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Rohrbach</b><br/>
    /// Code: T7947<br/>
    /// </summary>
    [XmlEnum("T7947")]
    Justizvollzugsanstalt_Rohrbach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Zweibr&#252;cken</b><br/>
    /// Code: T7948<br/>
    /// </summary>
    [XmlEnum("T7948")]
    Justizvollzugsanstalt_Zweibruecken,

    /// <summary>
    /// <b>Jugendstrafanstalt Wittlich</b><br/>
    /// Code: T7966<br/>
    /// </summary>
    [XmlEnum("T7966")]
    Jugendstrafanstalt_Wittlich,

    /// <summary>
    /// <b>Oberlandesgericht Dresden</b><br/>
    /// Code: U1000<br/>
    /// </summary>
    [XmlEnum("U1000")]
    Oberlandesgericht_Dresden,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Dresden</b><br/>
    /// Code: U1000S<br/>
    /// </summary>
    [XmlEnum("U1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Dresden,

    /// <summary>
    /// <b>Justizvollzugsanstalt Zwickau</b><br/>
    /// Code: U1001<br/>
    /// </summary>
    [XmlEnum("U1001")]
    Justizvollzugsanstalt_Zwickau,

    /// <summary>
    /// <b>Landgericht Dresden</b><br/>
    /// Code: U1100<br/>
    /// </summary>
    [XmlEnum("U1100")]
    Landgericht_Dresden,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Dresden</b><br/>
    /// Code: U1100S<br/>
    /// </summary>
    [XmlEnum("U1100S")]
    Staatsanwaltschaft_beim_Landgericht_Dresden,

    /// <summary>
    /// <b>Amtsgericht Bautzen</b><br/>
    /// Code: U1101<br/>
    /// </summary>
    [XmlEnum("U1101")]
    Amtsgericht_Bautzen,

    /// <summary>
    /// <b>Grundbuchamt Bautzen</b><br/>
    /// Code: U1101G<br/>
    /// </summary>
    [XmlEnum("U1101G")]
    Grundbuchamt_Bautzen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bischofswerda</b><br/>
    /// Code: U1102<br/>
    /// </summary>
    [XmlEnum("U1102")]
    aufgeloest_Amtsgericht_Bischofswerda,

    /// <summary>
    /// <b>Amtsgericht Dippoldiswalde</b><br/>
    /// Code: U1103<br/>
    /// </summary>
    [XmlEnum("U1103")]
    Amtsgericht_Dippoldiswalde,

    /// <summary>
    /// <b>Grundbuchamt Dippoldiswalde</b><br/>
    /// Code: U1103G<br/>
    /// </summary>
    [XmlEnum("U1103G")]
    Grundbuchamt_Dippoldiswalde,

    /// <summary>
    /// <b>Amtsgericht Dresden</b><br/>
    /// Code: U1104<br/>
    /// </summary>
    [XmlEnum("U1104")]
    Amtsgericht_Dresden,

    /// <summary>
    /// <b>Grundbuchamt Dresden</b><br/>
    /// Code: U1104G<br/>
    /// </summary>
    [XmlEnum("U1104G")]
    Grundbuchamt_Dresden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dresden (Land)</b><br/>
    /// Code: U1105<br/>
    /// </summary>
    [XmlEnum("U1105")]
    aufgeloest_Amtsgericht_Dresden_Land,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Dippoldiswalde, Zwst. Freital</b><br/>
    /// Code: U1106<br/>
    /// </summary>
    [XmlEnum("U1106")]
    aufgeloest_Amtsgericht_Dippoldiswalde_Zwst_Freital,

    /// <summary>
    /// <b>Amtsgericht G&#246;rlitz</b><br/>
    /// Code: U1107<br/>
    /// </summary>
    [XmlEnum("U1107")]
    Amtsgericht_Goerlitz,

    /// <summary>
    /// <b>Grundbuchamt G&#246;rlitz</b><br/>
    /// Code: U1107G<br/>
    /// </summary>
    [XmlEnum("U1107G")]
    Grundbuchamt_Goerlitz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gro&#223;enhain</b><br/>
    /// Code: U1108<br/>
    /// </summary>
    [XmlEnum("U1108")]
    aufgeloest_Amtsgericht_Grossenhain,

    /// <summary>
    /// <b>Amtsgericht Hoyerswerda</b><br/>
    /// Code: U1109<br/>
    /// </summary>
    [XmlEnum("U1109")]
    Amtsgericht_Hoyerswerda,

    /// <summary>
    /// <b>Grundbuchamt Hoyerswerda</b><br/>
    /// Code: U1109G<br/>
    /// </summary>
    [XmlEnum("U1109G")]
    Grundbuchamt_Hoyerswerda,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Hoyerswerda (Zwst. der StA Bautzen)</b><br/>
    /// Code: U1109S<br/>
    /// </summary>
    [XmlEnum("U1109S")]
    Staatsanwaltschaft_beim_Landgericht_Hoyerswerda_Zwst_der_StA_Bautzen,

    /// <summary>
    /// <b>Amtsgericht Kamenz</b><br/>
    /// Code: U1110<br/>
    /// </summary>
    [XmlEnum("U1110")]
    Amtsgericht_Kamenz,

    /// <summary>
    /// <b>Grundbuchamt Kamenz</b><br/>
    /// Code: U1110G<br/>
    /// </summary>
    [XmlEnum("U1110G")]
    Grundbuchamt_Kamenz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Zittau Zweigstelle L&#246;bau</b><br/>
    /// Code: U1111<br/>
    /// </summary>
    [XmlEnum("U1111")]
    aufgeloest_Amtsgericht_Zittau_Zweigstelle_Loebau,

    /// <summary>
    /// <b>Amtsgericht Mei&#223;en</b><br/>
    /// Code: U1112<br/>
    /// </summary>
    [XmlEnum("U1112")]
    Amtsgericht_Meissen,

    /// <summary>
    /// <b>Grundbuchamt Mei&#223;en</b><br/>
    /// Code: U1112G<br/>
    /// </summary>
    [XmlEnum("U1112G")]
    Grundbuchamt_Meissen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Mei&#223;en, Zwst. der StA Dresden</b><br/>
    /// Code: U1112S<br/>
    /// </summary>
    [XmlEnum("U1112S")]
    Staatsanwaltschaft_beim_Landgericht_Meissen_Zwst_der_StA_Dresden,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wei&#223;wasser, Zwst. Niesky</b><br/>
    /// Code: U1113<br/>
    /// </summary>
    [XmlEnum("U1113")]
    aufgeloest_Amtsgericht_Weisswasser_Zwst_Niesky,

    /// <summary>
    /// <b>Amtsgericht Pirna</b><br/>
    /// Code: U1114<br/>
    /// </summary>
    [XmlEnum("U1114")]
    Amtsgericht_Pirna,

    /// <summary>
    /// <b>Grundbuchamt Pirna</b><br/>
    /// Code: U1114G<br/>
    /// </summary>
    [XmlEnum("U1114G")]
    Grundbuchamt_Pirna,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Pirna, Zwst. der StA Dresden</b><br/>
    /// Code: U1114S<br/>
    /// </summary>
    [XmlEnum("U1114S")]
    Staatsanwaltschaft_beim_Landgericht_Pirna_Zwst_der_StA_Dresden,

    /// <summary>
    /// <b>Amtsgericht Riesa</b><br/>
    /// Code: U1115<br/>
    /// </summary>
    [XmlEnum("U1115")]
    Amtsgericht_Riesa,

    /// <summary>
    /// <b>Grundbuchamt Riesa</b><br/>
    /// Code: U1115G<br/>
    /// </summary>
    [XmlEnum("U1115G")]
    Grundbuchamt_Riesa,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Pirna, Zwst. Neustadt (in Sachsen)</b><br/>
    /// Code: U1116<br/>
    /// </summary>
    [XmlEnum("U1116")]
    aufgeloest_Amtsgericht_Pirna_Zwst_Neustadt_in_Sachsen,

    /// <summary>
    /// <b>Amtsgericht Wei&#223;wasser</b><br/>
    /// Code: U1117<br/>
    /// </summary>
    [XmlEnum("U1117")]
    Amtsgericht_Weisswasser,

    /// <summary>
    /// <b>Grundbuchamt Wei&#223;wasser</b><br/>
    /// Code: U1117G<br/>
    /// </summary>
    [XmlEnum("U1117G")]
    Grundbuchamt_Weisswasser,

    /// <summary>
    /// <b>Amtsgericht Zittau</b><br/>
    /// Code: U1118<br/>
    /// </summary>
    [XmlEnum("U1118")]
    Amtsgericht_Zittau,

    /// <summary>
    /// <b>Grundbuchamt Zittau</b><br/>
    /// Code: U1118G<br/>
    /// </summary>
    [XmlEnum("U1118G")]
    Grundbuchamt_Zittau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Zittau, Zwst. der StA G&#246;rlitz</b><br/>
    /// Code: U1118S<br/>
    /// </summary>
    [XmlEnum("U1118S")]
    Staatsanwaltschaft_beim_Landgericht_Zittau_Zwst_der_StA_Goerlitz,

    /// <summary>
    /// <b>Amtsgericht Zittau, Zweigstelle L&#246;bau</b><br/>
    /// Code: U1119<br/>
    /// </summary>
    [XmlEnum("U1119")]
    Amtsgericht_Zittau_Zweigstelle_Loebau,

    /// <summary>
    /// <b>Landgericht Dresden Ausw&#228;rtige Strafvollstreckungskammer</b><br/>
    /// Code: U1130<br/>
    /// </summary>
    [XmlEnum("U1130")]
    Landgericht_Dresden_Auswaertige_Strafvollstreckungskammer,

    /// <summary>
    /// <b>Landgericht Chemnitz</b><br/>
    /// Code: U1200<br/>
    /// </summary>
    [XmlEnum("U1200")]
    Landgericht_Chemnitz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Chemnitz</b><br/>
    /// Code: U1200S<br/>
    /// </summary>
    [XmlEnum("U1200S")]
    Staatsanwaltschaft_beim_Landgericht_Chemnitz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Marienberg Zweigstelle Annaberg-Buchholz</b><br/>
    /// Code: U1201<br/>
    /// </summary>
    [XmlEnum("U1201")]
    aufgeloest_Amtsgericht_Marienberg_Zweigstelle_Annaberg_Buchholz,

    /// <summary>
    /// <b>Amtsgericht Aue-Bad Schlema</b><br/>
    /// Code: U1202<br/>
    /// </summary>
    [XmlEnum("U1202")]
    Amtsgericht_Aue_Bad_Schlema,

    /// <summary>
    /// <b>Grundbuchamt Aue-Bad Schlema</b><br/>
    /// Code: U1202G<br/>
    /// </summary>
    [XmlEnum("U1202G")]
    Grundbuchamt_Aue_Bad_Schlema,

    /// <summary>
    /// <b>Amtsgericht Auerbach</b><br/>
    /// Code: U1203<br/>
    /// </summary>
    [XmlEnum("U1203")]
    Amtsgericht_Auerbach,

    /// <summary>
    /// <b>Grundbuchamt Auerbach</b><br/>
    /// Code: U1203G<br/>
    /// </summary>
    [XmlEnum("U1203G")]
    Grundbuchamt_Auerbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freiberg, Zwst. Brand-Erbisdorf</b><br/>
    /// Code: U1204<br/>
    /// </summary>
    [XmlEnum("U1204")]
    aufgeloest_Amtsgericht_Freiberg_Zwst_Brand_Erbisdorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Chemnitz/Stadt</b><br/>
    /// Code: U1205<br/>
    /// </summary>
    [XmlEnum("U1205")]
    aufgeloest_Amtsgericht_Chemnitz_Stadt,

    /// <summary>
    /// <b>Amtsgericht Chemnitz</b><br/>
    /// Code: U1206<br/>
    /// </summary>
    [XmlEnum("U1206")]
    Amtsgericht_Chemnitz,

    /// <summary>
    /// <b>Grundbuchamt Chemnitz</b><br/>
    /// Code: U1206G<br/>
    /// </summary>
    [XmlEnum("U1206G")]
    Grundbuchamt_Chemnitz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Freiberg Zweigstelle Oederan</b><br/>
    /// Code: U1207<br/>
    /// </summary>
    [XmlEnum("U1207")]
    aufgeloest_Amtsgericht_Freiberg_Zweigstelle_Oederan,

    /// <summary>
    /// <b>Amtsgericht Freiberg</b><br/>
    /// Code: U1208<br/>
    /// </summary>
    [XmlEnum("U1208")]
    Amtsgericht_Freiberg,

    /// <summary>
    /// <b>Grundbuchamt Freiberg</b><br/>
    /// Code: U1208G<br/>
    /// </summary>
    [XmlEnum("U1208G")]
    Grundbuchamt_Freiberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hohenstein-Ernstthal, Zwst. des AG Glauchau</b><br/>
    /// Code: U1209<br/>
    /// </summary>
    [XmlEnum("U1209")]
    aufgeloest_Amtsgericht_Hohenstein_Ernstthal_Zwst_des_AG_Glauchau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht D&#246;beln Zweigstelle Hainichen</b><br/>
    /// Code: U1210<br/>
    /// </summary>
    [XmlEnum("U1210")]
    aufgeloest_Amtsgericht_Doebeln_Zweigstelle_Hainichen,

    /// <summary>
    /// <b>Amtsgericht Hohenstein-Ernstthal</b><br/>
    /// Code: U1211<br/>
    /// </summary>
    [XmlEnum("U1211")]
    Amtsgericht_Hohenstein_Ernstthal,

    /// <summary>
    /// <b>Grundbuchamt Hohenstein-Ernstthal</b><br/>
    /// Code: U1211G<br/>
    /// </summary>
    [XmlEnum("U1211G")]
    Grundbuchamt_Hohenstein_Ernstthal,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Auerbach, Zwst. Klingenthal</b><br/>
    /// Code: U1212<br/>
    /// </summary>
    [XmlEnum("U1212")]
    aufgeloest_Amtsgericht_Auerbach_Zwst_Klingenthal,

    /// <summary>
    /// <b>Amtsgericht Marienberg</b><br/>
    /// Code: U1213<br/>
    /// </summary>
    [XmlEnum("U1213")]
    Amtsgericht_Marienberg,

    /// <summary>
    /// <b>Grundbuchamt Marienberg</b><br/>
    /// Code: U1213G<br/>
    /// </summary>
    [XmlEnum("U1213G")]
    Grundbuchamt_Marienberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Plauen, Zwst. Oelsnitz</b><br/>
    /// Code: U1214<br/>
    /// </summary>
    [XmlEnum("U1214")]
    aufgeloest_Amtsgericht_Plauen_Zwst_Oelsnitz,

    /// <summary>
    /// <b>Amtsgericht Plauen</b><br/>
    /// Code: U1215<br/>
    /// </summary>
    [XmlEnum("U1215")]
    Amtsgericht_Plauen,

    /// <summary>
    /// <b>Grundbuchamt Plauen</b><br/>
    /// Code: U1215G<br/>
    /// </summary>
    [XmlEnum("U1215G")]
    Grundbuchamt_Plauen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Reichenbach</b><br/>
    /// Code: U1216<br/>
    /// </summary>
    [XmlEnum("U1216")]
    aufgeloest_Amtsgericht_Reichenbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rochlitz</b><br/>
    /// Code: U1217<br/>
    /// </summary>
    [XmlEnum("U1217")]
    aufgeloest_Amtsgericht_Rochlitz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schwarzenberg/Erzgebirge</b><br/>
    /// Code: U1218<br/>
    /// </summary>
    [XmlEnum("U1218")]
    aufgeloest_Amtsgericht_Schwarzenberg_Erzgebirge,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Aue Zweigstelle Stollberg</b><br/>
    /// Code: U1219<br/>
    /// </summary>
    [XmlEnum("U1219")]
    aufgeloest_Amtsgericht_Aue_Zweigstelle_Stollberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Zwickau, Zwst. Werdau</b><br/>
    /// Code: U1220<br/>
    /// </summary>
    [XmlEnum("U1220")]
    aufgeloest_Amtsgericht_Zwickau_Zwst_Werdau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Zschopau</b><br/>
    /// Code: U1221<br/>
    /// </summary>
    [XmlEnum("U1221")]
    aufgeloest_Amtsgericht_Zschopau,

    /// <summary>
    /// <b>Amtsgericht Zwickau</b><br/>
    /// Code: U1222<br/>
    /// </summary>
    [XmlEnum("U1222")]
    Amtsgericht_Zwickau,

    /// <summary>
    /// <b>Grundbuchamt Zwickau</b><br/>
    /// Code: U1222G<br/>
    /// </summary>
    [XmlEnum("U1222G")]
    Grundbuchamt_Zwickau,

    /// <summary>
    /// <b>Amtsgericht Zwickau, Zentrales Vollstreckungsgericht Sachsen</b><br/>
    /// Code: U1222R<br/>
    /// </summary>
    [XmlEnum("U1222R")]
    Amtsgericht_Zwickau_Zentrales_Vollstreckungsgericht_Sachsen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Zwickau-Land</b><br/>
    /// Code: U1223<br/>
    /// </summary>
    [XmlEnum("U1223")]
    aufgeloest_Amtsgericht_Zwickau_Land,

    /// <summary>
    /// <b>Amtsgericht Aue-Bad Schlema, Zweigstelle Stollberg</b><br/>
    /// Code: U1225<br/>
    /// </summary>
    [XmlEnum("U1225")]
    Amtsgericht_Aue_Bad_Schlema_Zweigstelle_Stollberg,

    /// <summary>
    /// <b>Grundbuchamt Aue-Bad Schlema, Zweigstelle Stollberg</b><br/>
    /// Code: U1225G<br/>
    /// </summary>
    [XmlEnum("U1225G")]
    Grundbuchamt_Aue_Bad_Schlema_Zweigstelle_Stollberg,

    /// <summary>
    /// <b>Amtsgericht D&#246;beln, Zweigstelle Hainichen</b><br/>
    /// Code: U1226<br/>
    /// </summary>
    [XmlEnum("U1226")]
    Amtsgericht_Doebeln_Zweigstelle_Hainichen,

    /// <summary>
    /// <b>Amtsgericht Marienberg, Zweigstelle Annaberg-Buchholz</b><br/>
    /// Code: U1227<br/>
    /// </summary>
    [XmlEnum("U1227")]
    Amtsgericht_Marienberg_Zweigstelle_Annaberg_Buchholz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Stollberg Ausw. Strafvollstreckungskammer des Landgerichts Chemnitz</b><br/>
    /// Code: U1230<br/>
    /// </summary>
    [XmlEnum("U1230")]
    aufgeloest_Amtsgericht_Stollberg_Ausw_Strafvollstreckungskammer_des_Landgerichts_Chemnitz,

    /// <summary>
    /// <b>Landgericht Leipzig</b><br/>
    /// Code: U1300<br/>
    /// </summary>
    [XmlEnum("U1300")]
    Landgericht_Leipzig,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Leipzig</b><br/>
    /// Code: U1300S<br/>
    /// </summary>
    [XmlEnum("U1300S")]
    Staatsanwaltschaft_beim_Landgericht_Leipzig,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Geithain (in Bad Lausick)</b><br/>
    /// Code: U1301<br/>
    /// </summary>
    [XmlEnum("U1301")]
    aufgeloest_Amtsgericht_Geithain_in_Bad_Lausick,

    /// <summary>
    /// <b>Amtsgericht Borna</b><br/>
    /// Code: U1302<br/>
    /// </summary>
    [XmlEnum("U1302")]
    Amtsgericht_Borna,

    /// <summary>
    /// <b>Grundbuchamt Borna</b><br/>
    /// Code: U1302G<br/>
    /// </summary>
    [XmlEnum("U1302G")]
    Grundbuchamt_Borna,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eilenburg Zweigstelle Delitzsch</b><br/>
    /// Code: U1303<br/>
    /// </summary>
    [XmlEnum("U1303")]
    aufgeloest_Amtsgericht_Eilenburg_Zweigstelle_Delitzsch,

    /// <summary>
    /// <b>Amtsgericht D&#246;beln</b><br/>
    /// Code: U1304<br/>
    /// </summary>
    [XmlEnum("U1304")]
    Amtsgericht_Doebeln,

    /// <summary>
    /// <b>Grundbuchamt D&#246;beln</b><br/>
    /// Code: U1304G<br/>
    /// </summary>
    [XmlEnum("U1304G")]
    Grundbuchamt_Doebeln,

    /// <summary>
    /// <b>Amtsgericht Eilenburg</b><br/>
    /// Code: U1305<br/>
    /// </summary>
    [XmlEnum("U1305")]
    Amtsgericht_Eilenburg,

    /// <summary>
    /// <b>Grundbuchamt Eilenburg</b><br/>
    /// Code: U1305G<br/>
    /// </summary>
    [XmlEnum("U1305G")]
    Grundbuchamt_Eilenburg,

    /// <summary>
    /// <b>Amtsgericht Grimma</b><br/>
    /// Code: U1306<br/>
    /// </summary>
    [XmlEnum("U1306")]
    Amtsgericht_Grimma,

    /// <summary>
    /// <b>Grundbuchamt Grimma</b><br/>
    /// Code: U1306G<br/>
    /// </summary>
    [XmlEnum("U1306G")]
    Grundbuchamt_Grimma,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Grimma (Zwst. der StA Leipzig)</b><br/>
    /// Code: U1306S<br/>
    /// </summary>
    [XmlEnum("U1306S")]
    Staatsanwaltschaft_beim_Landgericht_Grimma_Zwst_der_StA_Leipzig,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht der Stadt Leipzig</b><br/>
    /// Code: U1307<br/>
    /// </summary>
    [XmlEnum("U1307")]
    aufgeloest_Amtsgericht_der_Stadt_Leipzig,

    /// <summary>
    /// <b>Amtsgericht Leipzig</b><br/>
    /// Code: U1308<br/>
    /// </summary>
    [XmlEnum("U1308")]
    Amtsgericht_Leipzig,

    /// <summary>
    /// <b>Grundbuchamt Leipzig</b><br/>
    /// Code: U1308G<br/>
    /// </summary>
    [XmlEnum("U1308G")]
    Grundbuchamt_Leipzig,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Torgau Zweigstelle Oschatz</b><br/>
    /// Code: U1309<br/>
    /// </summary>
    [XmlEnum("U1309")]
    aufgeloest_Amtsgericht_Torgau_Zweigstelle_Oschatz,

    /// <summary>
    /// <b>Amtsgericht Torgau</b><br/>
    /// Code: U1310<br/>
    /// </summary>
    [XmlEnum("U1310")]
    Amtsgericht_Torgau,

    /// <summary>
    /// <b>Grundbuchamt Torgau</b><br/>
    /// Code: U1310G<br/>
    /// </summary>
    [XmlEnum("U1310G")]
    Grundbuchamt_Torgau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Torgau, Zwst. der StA Leipzig</b><br/>
    /// Code: U1310S<br/>
    /// </summary>
    [XmlEnum("U1310S")]
    Staatsanwaltschaft_beim_Landgericht_Torgau_Zwst_der_StA_Leipzig,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Grimma Zweigstelle Wurzen</b><br/>
    /// Code: U1311<br/>
    /// </summary>
    [XmlEnum("U1311")]
    aufgeloest_Amtsgericht_Grimma_Zweigstelle_Wurzen,

    /// <summary>
    /// <b>Amtsgericht Torgau, Zweigstelle Oschatz</b><br/>
    /// Code: U1312<br/>
    /// </summary>
    [XmlEnum("U1312")]
    Amtsgericht_Torgau_Zweigstelle_Oschatz,

    /// <summary>
    /// <b>Landgericht Leipzig Strafvollstreckungskammer in Torgau</b><br/>
    /// Code: U1330<br/>
    /// </summary>
    [XmlEnum("U1330")]
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Torgau,

    /// <summary>
    /// <b>Landgericht Leipzig Strafvollstreckungskammer in D&#246;beln</b><br/>
    /// Code: U1340<br/>
    /// </summary>
    [XmlEnum("U1340")]
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Doebeln,

    /// <summary>
    /// <b>Landgericht Leipzig Strafvollstreckungskammer in Borna</b><br/>
    /// Code: U1350<br/>
    /// </summary>
    [XmlEnum("U1350")]
    Landgericht_Leipzig_Strafvollstreckungskammer_in_Borna,

    /// <summary>
    /// <b>aufgel&#246;st-Landgericht Bautzen Au&#223;enstelle des Landgerichts G&#246;rlitz</b><br/>
    /// Code: U1400<br/>
    /// </summary>
    [XmlEnum("U1400")]
    aufgeloest_Landgericht_Bautzen_Aussenstelle_des_Landgerichts_Goerlitz,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft G&#246;rlitz, Zweigstelle Bautzen</b><br/>
    /// Code: U1400S<br/>
    /// </summary>
    [XmlEnum("U1400S")]
    aufgeloest_Staatsanwaltschaft_Goerlitz_Zweigstelle_Bautzen,

    /// <summary>
    /// <b>Landgericht G&#246;rlitz</b><br/>
    /// Code: U1500<br/>
    /// </summary>
    [XmlEnum("U1500")]
    Landgericht_Goerlitz,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht G&#246;rlitz</b><br/>
    /// Code: U1500S<br/>
    /// </summary>
    [XmlEnum("U1500S")]
    Staatsanwaltschaft_beim_Landgericht_Goerlitz,

    /// <summary>
    /// <b>Landgericht Bautzen, Au&#223;enstelle Landgericht G&#246;rlitz</b><br/>
    /// Code: U1510<br/>
    /// </summary>
    [XmlEnum("U1510")]
    Landgericht_Bautzen_Aussenstelle_Landgericht_Goerlitz,

    /// <summary>
    /// <b>Staatsanwaltschaft G&#246;rlitz, Zweigstelle Bautzen</b><br/>
    /// Code: U1510S<br/>
    /// </summary>
    [XmlEnum("U1510S")]
    Staatsanwaltschaft_Goerlitz_Zweigstelle_Bautzen,

    /// <summary>
    /// <b>Landgericht Zwickau</b><br/>
    /// Code: U1600<br/>
    /// </summary>
    [XmlEnum("U1600")]
    Landgericht_Zwickau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Zwickau</b><br/>
    /// Code: U1600S<br/>
    /// </summary>
    [XmlEnum("U1600S")]
    Staatsanwaltschaft_beim_Landgericht_Zwickau,

    /// <summary>
    /// <b>Landgericht Zwickau Zweigstelle Plauen</b><br/>
    /// Code: U1601<br/>
    /// </summary>
    [XmlEnum("U1601")]
    Landgericht_Zwickau_Zweigstelle_Plauen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Plauen (Zwst. der StA Zwickau)</b><br/>
    /// Code: U1601S<br/>
    /// </summary>
    [XmlEnum("U1601S")]
    Staatsanwaltschaft_beim_Landgericht_Plauen_Zwst_der_StA_Zwickau,

    /// <summary>
    /// <b>Justizvollzugsanstalt Leipzig mit Krankenhaus</b><br/>
    /// Code: U6001<br/>
    /// </summary>
    [XmlEnum("U6001")]
    Justizvollzugsanstalt_Leipzig_mit_Krankenhaus,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Freistaates Sachsen</b><br/>
    /// Code: U6008<br/>
    /// </summary>
    [XmlEnum("U6008")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Freistaates_Sachsen,

    /// <summary>
    /// <b>Sozialgericht Dresden</b><br/>
    /// Code: U6027<br/>
    /// </summary>
    [XmlEnum("U6027")]
    Sozialgericht_Dresden,

    /// <summary>
    /// <b>Jugendstrafvollzugsanstalt Regis-Breitingen</b><br/>
    /// Code: U6269<br/>
    /// </summary>
    [XmlEnum("U6269")]
    Jugendstrafvollzugsanstalt_Regis_Breitingen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Zeithain</b><br/>
    /// Code: U6346<br/>
    /// </summary>
    [XmlEnum("U6346")]
    Justizvollzugsanstalt_Zeithain,

    /// <summary>
    /// <b>Justizvollzugsanstalt G&#246;rlitz</b><br/>
    /// Code: U6348<br/>
    /// </summary>
    [XmlEnum("U6348")]
    Justizvollzugsanstalt_Goerlitz,

    /// <summary>
    /// <b>Justizvollzugsanstalt Torgau</b><br/>
    /// Code: U6350<br/>
    /// </summary>
    [XmlEnum("U6350")]
    Justizvollzugsanstalt_Torgau,

    /// <summary>
    /// <b>Arbeitsgericht Bautzen</b><br/>
    /// Code: U6385<br/>
    /// </summary>
    [XmlEnum("U6385")]
    Arbeitsgericht_Bautzen,

    /// <summary>
    /// <b>Arbeitsgericht Chemnitz</b><br/>
    /// Code: U6386<br/>
    /// </summary>
    [XmlEnum("U6386")]
    Arbeitsgericht_Chemnitz,

    /// <summary>
    /// <b>Arbeitsgericht Dresden</b><br/>
    /// Code: U6387<br/>
    /// </summary>
    [XmlEnum("U6387")]
    Arbeitsgericht_Dresden,

    /// <summary>
    /// <b>Arbeitsgericht Leipzig</b><br/>
    /// Code: U6388<br/>
    /// </summary>
    [XmlEnum("U6388")]
    Arbeitsgericht_Leipzig,

    /// <summary>
    /// <b>Arbeitsgericht Zwickau</b><br/>
    /// Code: U6389<br/>
    /// </summary>
    [XmlEnum("U6389")]
    Arbeitsgericht_Zwickau,

    /// <summary>
    /// <b>Arbeitsgericht Bautzen Au&#223;enkammern G&#246;rlitz</b><br/>
    /// Code: U6390<br/>
    /// </summary>
    [XmlEnum("U6390")]
    Arbeitsgericht_Bautzen_Aussenkammern_Goerlitz,

    /// <summary>
    /// <b>S&#228;chsisches Oberverwaltungsgericht</b><br/>
    /// Code: U6400<br/>
    /// </summary>
    [XmlEnum("U6400")]
    Saechsisches_Oberverwaltungsgericht,

    /// <summary>
    /// <b>Verwaltungsgericht Dresden Fachgerichtszentrum</b><br/>
    /// Code: U6401<br/>
    /// </summary>
    [XmlEnum("U6401")]
    Verwaltungsgericht_Dresden_Fachgerichtszentrum,

    /// <summary>
    /// <b>Sozialgericht Leipzig</b><br/>
    /// Code: U6409<br/>
    /// </summary>
    [XmlEnum("U6409")]
    Sozialgericht_Leipzig,

    /// <summary>
    /// <b>Sozialgericht Chemnitz</b><br/>
    /// Code: U6418<br/>
    /// </summary>
    [XmlEnum("U6418")]
    Sozialgericht_Chemnitz,

    /// <summary>
    /// <b>Verfassungsgerichtshof Sachsen</b><br/>
    /// Code: U6435<br/>
    /// </summary>
    [XmlEnum("U6435")]
    Verfassungsgerichtshof_Sachsen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Dresden</b><br/>
    /// Code: U6862<br/>
    /// </summary>
    [XmlEnum("U6862")]
    Justizvollzugsanstalt_Dresden,

    /// <summary>
    /// <b>Verwaltungsgericht Chemnitz</b><br/>
    /// Code: U8517<br/>
    /// </summary>
    [XmlEnum("U8517")]
    Verwaltungsgericht_Chemnitz,

    /// <summary>
    /// <b>S&#228;chsisches Landesarbeitsgericht</b><br/>
    /// Code: U8550<br/>
    /// </summary>
    [XmlEnum("U8550")]
    Saechsisches_Landesarbeitsgericht,

    /// <summary>
    /// <b>Landessozialgericht Sachsen</b><br/>
    /// Code: U8563<br/>
    /// </summary>
    [XmlEnum("U8563")]
    Landessozialgericht_Sachsen,

    /// <summary>
    /// <b>Bundesverwaltungsgericht</b><br/>
    /// Code: U8572<br/>
    /// </summary>
    [XmlEnum("U8572")]
    Bundesverwaltungsgericht,

    /// <summary>
    /// <b>Justizvollzugsanstalt Bautzen</b><br/>
    /// Code: U8594<br/>
    /// </summary>
    [XmlEnum("U8594")]
    Justizvollzugsanstalt_Bautzen,

    /// <summary>
    /// <b>Justizvollzugsanstalt Waldheim</b><br/>
    /// Code: U8598<br/>
    /// </summary>
    [XmlEnum("U8598")]
    Justizvollzugsanstalt_Waldheim,

    /// <summary>
    /// <b>Verwaltungsgericht Leipzig</b><br/>
    /// Code: U8613<br/>
    /// </summary>
    [XmlEnum("U8613")]
    Verwaltungsgericht_Leipzig,

    /// <summary>
    /// <b>S&#228;chsischer Anwaltsgerichtshof</b><br/>
    /// Code: U8616<br/>
    /// </summary>
    [XmlEnum("U8616")]
    Saechsischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Chemnitz</b><br/>
    /// Code: U8617<br/>
    /// </summary>
    [XmlEnum("U8617")]
    Justizvollzugsanstalt_Chemnitz,

    /// <summary>
    /// <b>S&#228;chsisches Finanzgericht</b><br/>
    /// Code: U8647<br/>
    /// </summary>
    [XmlEnum("U8647")]
    Saechsisches_Finanzgericht,

    /// <summary>
    /// <b>Oberlandesgericht Saarbr&#252;cken</b><br/>
    /// Code: V1000<br/>
    /// </summary>
    [XmlEnum("V1000")]
    Oberlandesgericht_Saarbruecken,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Saarbr&#252;cken</b><br/>
    /// Code: V1000S<br/>
    /// </summary>
    [XmlEnum("V1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Saarbruecken,

    /// <summary>
    /// <b>Landgericht Saarbr&#252;cken</b><br/>
    /// Code: V1100<br/>
    /// </summary>
    [XmlEnum("V1100")]
    Landgericht_Saarbruecken,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Saarbr&#252;cken</b><br/>
    /// Code: V1100S<br/>
    /// </summary>
    [XmlEnum("V1100S")]
    Staatsanwaltschaft_beim_Landgericht_Saarbruecken,

    /// <summary>
    /// <b>Amtsgericht Homburg Zweigstelle Blieskastel</b><br/>
    /// Code: V1101<br/>
    /// </summary>
    [XmlEnum("V1101")]
    Amtsgericht_Homburg_Zweigstelle_Blieskastel,

    /// <summary>
    /// <b>Amtsgericht Homburg</b><br/>
    /// Code: V1102<br/>
    /// </summary>
    [XmlEnum("V1102")]
    Amtsgericht_Homburg,

    /// <summary>
    /// <b>Amtsgericht Lebach</b><br/>
    /// Code: V1103<br/>
    /// </summary>
    [XmlEnum("V1103")]
    Amtsgericht_Lebach,

    /// <summary>
    /// <b>Amtsgericht Merzig</b><br/>
    /// Code: V1104<br/>
    /// </summary>
    [XmlEnum("V1104")]
    Amtsgericht_Merzig,

    /// <summary>
    /// <b>Amtsgericht Neunkirchen</b><br/>
    /// Code: V1105<br/>
    /// </summary>
    [XmlEnum("V1105")]
    Amtsgericht_Neunkirchen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht St. Wendel, Zwst. Nohfelden</b><br/>
    /// Code: V1106<br/>
    /// </summary>
    [XmlEnum("V1106")]
    aufgeloest_Amtsgericht_St_Wendel_Zwst_Nohfelden,

    /// <summary>
    /// <b>Amtsgericht Ottweiler</b><br/>
    /// Code: V1107<br/>
    /// </summary>
    [XmlEnum("V1107")]
    Amtsgericht_Ottweiler,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Perl</b><br/>
    /// Code: V1108<br/>
    /// </summary>
    [XmlEnum("V1108")]
    aufgeloest_Amtsgericht_Perl,

    /// <summary>
    /// <b>Amtsgericht Saarbr&#252;cken</b><br/>
    /// Code: V1109<br/>
    /// </summary>
    [XmlEnum("V1109")]
    Amtsgericht_Saarbruecken,

    /// <summary>
    /// <b>Amtsgericht Saarbr&#252;cken, Zentrales Vollstreckungsgericht Saarland</b><br/>
    /// Code: V1109R<br/>
    /// </summary>
    [XmlEnum("V1109R")]
    Amtsgericht_Saarbruecken_Zentrales_Vollstreckungsgericht_Saarland,

    /// <summary>
    /// <b>Amtsgericht Saarbr&#252;cken Registergericht und Zwangsversteigerungsgericht</b><br/>
    /// Code: V1109V<br/>
    /// </summary>
    [XmlEnum("V1109V")]
    Amtsgericht_Saarbruecken_Registergericht_und_Zwangsversteigerungsgericht,

    /// <summary>
    /// <b>Amtsgericht Saarlouis</b><br/>
    /// Code: V1110<br/>
    /// </summary>
    [XmlEnum("V1110")]
    Amtsgericht_Saarlouis,

    /// <summary>
    /// <b>Amtsgericht St. Ingbert</b><br/>
    /// Code: V1111<br/>
    /// </summary>
    [XmlEnum("V1111")]
    Amtsgericht_St_Ingbert,

    /// <summary>
    /// <b>Amtsgericht St. Wendel</b><br/>
    /// Code: V1112<br/>
    /// </summary>
    [XmlEnum("V1112")]
    Amtsgericht_St_Wendel,

    /// <summary>
    /// <b>Amtsgericht Sulzbach</b><br/>
    /// Code: V1113<br/>
    /// </summary>
    [XmlEnum("V1113")]
    Amtsgericht_Sulzbach,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Tholey</b><br/>
    /// Code: V1114<br/>
    /// </summary>
    [XmlEnum("V1114")]
    aufgeloest_Amtsgericht_Tholey,

    /// <summary>
    /// <b>Amtsgericht V&#246;lklingen</b><br/>
    /// Code: V1115<br/>
    /// </summary>
    [XmlEnum("V1115")]
    Amtsgericht_Voelklingen,

    /// <summary>
    /// <b>Amtsgericht Merzig Zweigstelle Wadern</b><br/>
    /// Code: V1116<br/>
    /// </summary>
    [XmlEnum("V1116")]
    Amtsgericht_Merzig_Zweigstelle_Wadern,

    /// <summary>
    /// <b>Amtsgericht Neunkirchen Vereinsregister</b><br/>
    /// Code: V1120<br/>
    /// </summary>
    [XmlEnum("V1120")]
    Amtsgericht_Neunkirchen_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht Saarlouis Vereinsregister</b><br/>
    /// Code: V1121<br/>
    /// </summary>
    [XmlEnum("V1121")]
    Amtsgericht_Saarlouis_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht Homburg Vereinsregister</b><br/>
    /// Code: V1122<br/>
    /// </summary>
    [XmlEnum("V1122")]
    Amtsgericht_Homburg_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht St. Ingbert Vereinsregister</b><br/>
    /// Code: V1123<br/>
    /// </summary>
    [XmlEnum("V1123")]
    Amtsgericht_St_Ingbert_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht Ottweiler Vereinsregister</b><br/>
    /// Code: V1124<br/>
    /// </summary>
    [XmlEnum("V1124")]
    Amtsgericht_Ottweiler_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht Lebach Vereinsregister</b><br/>
    /// Code: V1125<br/>
    /// </summary>
    [XmlEnum("V1125")]
    Amtsgericht_Lebach_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht St. Wendel Vereinsregister</b><br/>
    /// Code: V1126<br/>
    /// </summary>
    [XmlEnum("V1126")]
    Amtsgericht_St_Wendel_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht Merzig Vereinsregister</b><br/>
    /// Code: V1127<br/>
    /// </summary>
    [XmlEnum("V1127")]
    Amtsgericht_Merzig_Vereinsregister,

    /// <summary>
    /// <b>Amtsgericht V&#246;lklingen Vereinsregister</b><br/>
    /// Code: V1128<br/>
    /// </summary>
    [XmlEnum("V1128")]
    Amtsgericht_Voelklingen_Vereinsregister,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Neunkirchen</b><br/>
    /// Code: V6011<br/>
    /// </summary>
    [XmlEnum("V6011")]
    aufgeloest_Arbeitsgericht_Neunkirchen,

    /// <summary>
    /// <b>Finanzgericht des Saarlandes</b><br/>
    /// Code: V6012<br/>
    /// </summary>
    [XmlEnum("V6012")]
    Finanzgericht_des_Saarlandes,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Saarlouis</b><br/>
    /// Code: V6013<br/>
    /// </summary>
    [XmlEnum("V6013")]
    aufgeloest_Arbeitsgericht_Saarlouis,

    /// <summary>
    /// <b>Verfassungsgerichtshof des Saarlandes</b><br/>
    /// Code: V6014<br/>
    /// </summary>
    [XmlEnum("V6014")]
    Verfassungsgerichtshof_des_Saarlandes,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Saarbr&#252;cken</b><br/>
    /// Code: V6033<br/>
    /// </summary>
    [XmlEnum("V6033")]
    aufgeloest_Arbeitsgericht_Saarbruecken,

    /// <summary>
    /// <b>Anwaltsgericht f&#252;r den Bezirk der Rechtsanwaltskammer des Saarlandes</b><br/>
    /// Code: V6040<br/>
    /// </summary>
    [XmlEnum("V6040")]
    Anwaltsgericht_fuer_den_Bezirk_der_Rechtsanwaltskammer_des_Saarlandes,

    /// <summary>
    /// <b>Landessozialgericht f&#252;r das Saarland</b><br/>
    /// Code: V6042<br/>
    /// </summary>
    [XmlEnum("V6042")]
    Landessozialgericht_fuer_das_Saarland,

    /// <summary>
    /// <b>Landesarbeitsgericht Saarland</b><br/>
    /// Code: V6043<br/>
    /// </summary>
    [XmlEnum("V6043")]
    Landesarbeitsgericht_Saarland,

    /// <summary>
    /// <b>Oberverwaltungsgericht des Saarlandes</b><br/>
    /// Code: V6045<br/>
    /// </summary>
    [XmlEnum("V6045")]
    Oberverwaltungsgericht_des_Saarlandes,

    /// <summary>
    /// <b>Sozialgericht f&#252;r das Saarland</b><br/>
    /// Code: V6046<br/>
    /// </summary>
    [XmlEnum("V6046")]
    Sozialgericht_fuer_das_Saarland,

    /// <summary>
    /// <b>Verwaltungsgericht des Saarlandes Saarlouis</b><br/>
    /// Code: V6051<br/>
    /// </summary>
    [XmlEnum("V6051")]
    Verwaltungsgericht_des_Saarlandes_Saarlouis,

    /// <summary>
    /// <b>Saarl&#228;ndischer Anwaltsgerichtshof</b><br/>
    /// Code: V6054<br/>
    /// </summary>
    [XmlEnum("V6054")]
    Saarlaendischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Saarbr&#252;cken</b><br/>
    /// Code: V6067<br/>
    /// </summary>
    [XmlEnum("V6067")]
    Justizvollzugsanstalt_Saarbruecken,

    /// <summary>
    /// <b>Jugendarrestanstalt Lebach</b><br/>
    /// Code: V6080<br/>
    /// </summary>
    [XmlEnum("V6080")]
    Jugendarrestanstalt_Lebach,

    /// <summary>
    /// <b>Justizvollzugsanstalt Ottweiler</b><br/>
    /// Code: V6216<br/>
    /// </summary>
    [XmlEnum("V6216")]
    Justizvollzugsanstalt_Ottweiler,

    /// <summary>
    /// <b>Arbeitsgericht Saarland</b><br/>
    /// Code: V6234<br/>
    /// </summary>
    [XmlEnum("V6234")]
    Arbeitsgericht_Saarland,

    /// <summary>
    /// <b>Kompetenzzentrum der Justiz f&#252;r ambulante Resozialisierung und Opferhilfe</b><br/>
    /// Code: V6240<br/>
    /// </summary>
    [XmlEnum("V6240")]
    Kompetenzzentrum_der_Justiz_fuer_ambulante_Resozialisierung_und_Opferhilfe,

    /// <summary>
    /// <b>Oberlandesgericht Naumburg</b><br/>
    /// Code: W1000<br/>
    /// </summary>
    [XmlEnum("W1000")]
    Oberlandesgericht_Naumburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Naumburg</b><br/>
    /// Code: W1000S<br/>
    /// </summary>
    [XmlEnum("W1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Naumburg,

    /// <summary>
    /// <b>Landgericht Halle</b><br/>
    /// Code: W1100<br/>
    /// </summary>
    [XmlEnum("W1100")]
    Landgericht_Halle,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Halle</b><br/>
    /// Code: W1100S<br/>
    /// </summary>
    [XmlEnum("W1100S")]
    Staatsanwaltschaft_beim_Landgericht_Halle,

    /// <summary>
    /// <b>Amtsgericht Aschersleben</b><br/>
    /// Code: W1101<br/>
    /// </summary>
    [XmlEnum("W1101")]
    Amtsgericht_Aschersleben,

    /// <summary>
    /// <b>Amtsgericht Bernburg</b><br/>
    /// Code: W1102<br/>
    /// </summary>
    [XmlEnum("W1102")]
    Amtsgericht_Bernburg,

    /// <summary>
    /// <b>Amtsgericht Bitterfeld-Wolfen</b><br/>
    /// Code: W1103<br/>
    /// </summary>
    [XmlEnum("W1103")]
    Amtsgericht_Bitterfeld_Wolfen,

    /// <summary>
    /// <b>Amtsgericht Dessau-Ro&#223;lau</b><br/>
    /// Code: W1104<br/>
    /// </summary>
    [XmlEnum("W1104")]
    Amtsgericht_Dessau_Rosslau,

    /// <summary>
    /// <b>Amtsgericht Dessau-Ro&#223;lau, Zentrales Vollstreckungsgericht Sachsen-Anhalt</b><br/>
    /// Code: W1104R<br/>
    /// </summary>
    [XmlEnum("W1104R")]
    Amtsgericht_Dessau_Rosslau_Zentrales_Vollstreckungsgericht_Sachsen_Anhalt,

    /// <summary>
    /// <b>Amtsgericht Eisleben</b><br/>
    /// Code: W1105<br/>
    /// </summary>
    [XmlEnum("W1105")]
    Amtsgericht_Eisleben,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gr&#228;fenhainichen</b><br/>
    /// Code: W1106<br/>
    /// </summary>
    [XmlEnum("W1106")]
    aufgeloest_Amtsgericht_Graefenhainichen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Halle, Stadt</b><br/>
    /// Code: W1107<br/>
    /// </summary>
    [XmlEnum("W1107")]
    aufgeloest_Amtsgericht_Halle_Stadt,

    /// <summary>
    /// <b>Amtsgericht Halle (Saale)</b><br/>
    /// Code: W1109<br/>
    /// </summary>
    [XmlEnum("W1109")]
    Amtsgericht_Halle_Saale,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hettstedt</b><br/>
    /// Code: W1110<br/>
    /// </summary>
    [XmlEnum("W1110")]
    aufgeloest_Amtsgericht_Hettstedt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hohenm&#246;lsen</b><br/>
    /// Code: W1111<br/>
    /// </summary>
    [XmlEnum("W1111")]
    aufgeloest_Amtsgericht_Hohenmoelsen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Jessen (in Annaburg)</b><br/>
    /// Code: W1112<br/>
    /// </summary>
    [XmlEnum("W1112")]
    aufgeloest_Amtsgericht_Jessen_in_Annaburg,

    /// <summary>
    /// <b>Amtsgericht K&#246;then</b><br/>
    /// Code: W1113<br/>
    /// </summary>
    [XmlEnum("W1113")]
    Amtsgericht_Koethen,

    /// <summary>
    /// <b>Amtsgericht Merseburg</b><br/>
    /// Code: W1114<br/>
    /// </summary>
    [XmlEnum("W1114")]
    Amtsgericht_Merseburg,

    /// <summary>
    /// <b>Amtsgericht Naumburg</b><br/>
    /// Code: W1115<br/>
    /// </summary>
    [XmlEnum("W1115")]
    Amtsgericht_Naumburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Naumburg, Zwst. der StA Halle</b><br/>
    /// Code: W1115S<br/>
    /// </summary>
    [XmlEnum("W1115S")]
    Staatsanwaltschaft_beim_Landgericht_Naumburg_Zwst_der_StA_Halle,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Nebra</b><br/>
    /// Code: W1116<br/>
    /// </summary>
    [XmlEnum("W1116")]
    aufgeloest_Amtsgericht_Nebra,

    /// <summary>
    /// <b>Amtsgericht Quedlinburg</b><br/>
    /// Code: W1117<br/>
    /// </summary>
    [XmlEnum("W1117")]
    Amtsgericht_Quedlinburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Querfurt</b><br/>
    /// Code: W1118<br/>
    /// </summary>
    [XmlEnum("W1118")]
    aufgeloest_Amtsgericht_Querfurt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Ro&#223;lau</b><br/>
    /// Code: W1119<br/>
    /// </summary>
    [XmlEnum("W1119")]
    aufgeloest_Amtsgericht_Rosslau,

    /// <summary>
    /// <b>Amtsgericht Sangerhausen</b><br/>
    /// Code: W1120<br/>
    /// </summary>
    [XmlEnum("W1120")]
    Amtsgericht_Sangerhausen,

    /// <summary>
    /// <b>Amtsgericht Wei&#223;enfels</b><br/>
    /// Code: W1121<br/>
    /// </summary>
    [XmlEnum("W1121")]
    Amtsgericht_Weissenfels,

    /// <summary>
    /// <b>Amtsgericht Wittenberg</b><br/>
    /// Code: W1122<br/>
    /// </summary>
    [XmlEnum("W1122")]
    Amtsgericht_Wittenberg,

    /// <summary>
    /// <b>Amtsgericht Zeitz</b><br/>
    /// Code: W1123<br/>
    /// </summary>
    [XmlEnum("W1123")]
    Amtsgericht_Zeitz,

    /// <summary>
    /// <b>Amtsgericht Aschersleben Dienstgeb&#228;ude Sta&#223;furt</b><br/>
    /// Code: W1124<br/>
    /// </summary>
    [XmlEnum("W1124")]
    Amtsgericht_Aschersleben_Dienstgebaeude_Stassfurt,

    /// <summary>
    /// <b>Landgericht Magdeburg</b><br/>
    /// Code: W1200<br/>
    /// </summary>
    [XmlEnum("W1200")]
    Landgericht_Magdeburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Magdeburg</b><br/>
    /// Code: W1200S<br/>
    /// </summary>
    [XmlEnum("W1200S")]
    Staatsanwaltschaft_beim_Landgericht_Magdeburg,

    /// <summary>
    /// <b>Amtsgericht Burg</b><br/>
    /// Code: W1201<br/>
    /// </summary>
    [XmlEnum("W1201")]
    Amtsgericht_Burg,

    /// <summary>
    /// <b>Amtsgericht Gardelegen</b><br/>
    /// Code: W1202<br/>
    /// </summary>
    [XmlEnum("W1202")]
    Amtsgericht_Gardelegen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Genthin</b><br/>
    /// Code: W1203<br/>
    /// </summary>
    [XmlEnum("W1203")]
    aufgeloest_Amtsgericht_Genthin,

    /// <summary>
    /// <b>Amtsgericht Halberstadt</b><br/>
    /// Code: W1204<br/>
    /// </summary>
    [XmlEnum("W1204")]
    Amtsgericht_Halberstadt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Halberstadt, Zwst. der StA Magdeburg</b><br/>
    /// Code: W1204S<br/>
    /// </summary>
    [XmlEnum("W1204S")]
    Staatsanwaltschaft_beim_Landgericht_Halberstadt_Zwst_der_StA_Magdeburg,

    /// <summary>
    /// <b>Amtsgericht Haldensleben</b><br/>
    /// Code: W1205<br/>
    /// </summary>
    [XmlEnum("W1205")]
    Amtsgericht_Haldensleben,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Havelberg</b><br/>
    /// Code: W1206<br/>
    /// </summary>
    [XmlEnum("W1206")]
    aufgeloest_Amtsgericht_Havelberg,

    /// <summary>
    /// <b>aufgel&#246;st-Kreisgericht Gardelegen (vormals Kalbe/Milde)</b><br/>
    /// Code: W1207<br/>
    /// </summary>
    [XmlEnum("W1207")]
    aufgeloest_Kreisgericht_Gardelegen_vormals_Kalbe_Milde,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kl&#246;tze</b><br/>
    /// Code: W1208<br/>
    /// </summary>
    [XmlEnum("W1208")]
    aufgeloest_Amtsgericht_Kloetze,

    /// <summary>
    /// <b>Amtsgericht Magdeburg</b><br/>
    /// Code: W1209<br/>
    /// </summary>
    [XmlEnum("W1209")]
    Amtsgericht_Magdeburg,

    /// <summary>
    /// <b>Amtsgericht Oschersleben</b><br/>
    /// Code: W1210<br/>
    /// </summary>
    [XmlEnum("W1210")]
    Amtsgericht_Oschersleben,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Osterburg</b><br/>
    /// Code: W1211<br/>
    /// </summary>
    [XmlEnum("W1211")]
    aufgeloest_Amtsgericht_Osterburg,

    /// <summary>
    /// <b>Amtsgericht Salzwedel</b><br/>
    /// Code: W1212<br/>
    /// </summary>
    [XmlEnum("W1212")]
    Amtsgericht_Salzwedel,

    /// <summary>
    /// <b>Amtsgericht Sch&#246;nebeck</b><br/>
    /// Code: W1213<br/>
    /// </summary>
    [XmlEnum("W1213")]
    Amtsgericht_Schoenebeck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sta&#223;furt</b><br/>
    /// Code: W1214<br/>
    /// </summary>
    [XmlEnum("W1214")]
    aufgeloest_Amtsgericht_Stassfurt,

    /// <summary>
    /// <b>Amtsgericht Stendal</b><br/>
    /// Code: W1215<br/>
    /// </summary>
    [XmlEnum("W1215")]
    Amtsgericht_Stendal,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wanzleben</b><br/>
    /// Code: W1217<br/>
    /// </summary>
    [XmlEnum("W1217")]
    aufgeloest_Amtsgericht_Wanzleben,

    /// <summary>
    /// <b>Amtsgericht Wernigerode</b><br/>
    /// Code: W1218<br/>
    /// </summary>
    [XmlEnum("W1218")]
    Amtsgericht_Wernigerode,

    /// <summary>
    /// <b>Amtsgericht Haldensleben Zweigstelle Wolmirstedt</b><br/>
    /// Code: W1219<br/>
    /// </summary>
    [XmlEnum("W1219")]
    Amtsgericht_Haldensleben_Zweigstelle_Wolmirstedt,

    /// <summary>
    /// <b>Amtsgericht Zerbst</b><br/>
    /// Code: W1220<br/>
    /// </summary>
    [XmlEnum("W1220")]
    Amtsgericht_Zerbst,

    /// <summary>
    /// <b>Landgericht Dessau-Ro&#223;lau</b><br/>
    /// Code: W1300<br/>
    /// </summary>
    [XmlEnum("W1300")]
    Landgericht_Dessau_Rosslau,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Dessau-Ro&#223;lau</b><br/>
    /// Code: W1300S<br/>
    /// </summary>
    [XmlEnum("W1300S")]
    Staatsanwaltschaft_beim_Landgericht_Dessau_Rosslau,

    /// <summary>
    /// <b>Landgericht Stendal</b><br/>
    /// Code: W1400<br/>
    /// </summary>
    [XmlEnum("W1400")]
    Landgericht_Stendal,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Stendal</b><br/>
    /// Code: W1400S<br/>
    /// </summary>
    [XmlEnum("W1400S")]
    Staatsanwaltschaft_beim_Landgericht_Stendal,

    /// <summary>
    /// <b>Landgericht Stendal Ausw&#228;rtige Strafvollstreckungskammer</b><br/>
    /// Code: W1430<br/>
    /// </summary>
    [XmlEnum("W1430")]
    Landgericht_Stendal_Auswaertige_Strafvollstreckungskammer,

    /// <summary>
    /// <b>Landgericht Halle Ausw&#228;rtige Strafvollstreckungskammer bei dem Amtsgericht Naumburg</b><br/>
    /// Code: W1500<br/>
    /// </summary>
    [XmlEnum("W1500")]
    Landgericht_Halle_Auswaertige_Strafvollstreckungskammer_bei_dem_Amtsgericht_Naumburg,

    /// <summary>
    /// <b>Anwaltsgericht im Bezirk der Rechtsanwaltskammer des Landes Sachsen-Anhalt</b><br/>
    /// Code: W6008<br/>
    /// </summary>
    [XmlEnum("W6008")]
    Anwaltsgericht_im_Bezirk_der_Rechtsanwaltskammer_des_Landes_Sachsen_Anhalt,

    /// <summary>
    /// <b>Anwaltsgerichtshof des Landes Sachsen-Anhalt</b><br/>
    /// Code: W6009<br/>
    /// </summary>
    [XmlEnum("W6009")]
    Anwaltsgerichtshof_des_Landes_Sachsen_Anhalt,

    /// <summary>
    /// <b>Ministerium f&#252;r Justiz und Gleichstellung des Landes Sachsen-Anhalt, Magdeburg</b><br/>
    /// Code: W6118<br/>
    /// </summary>
    [XmlEnum("W6118")]
    Ministerium_fuer_Justiz_und_Gleichstellung_des_Landes_Sachsen_Anhalt_Magdeburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Volkstedt</b><br/>
    /// Code: W6235<br/>
    /// </summary>
    [XmlEnum("W6235")]
    Justizvollzugsanstalt_Volkstedt,

    /// <summary>
    /// <b>aufgel&#246;st-Verwaltungsgericht Dessau</b><br/>
    /// Code: W6289<br/>
    /// </summary>
    [XmlEnum("W6289")]
    aufgeloest_Verwaltungsgericht_Dessau,

    /// <summary>
    /// <b>Verwaltungsgericht Magdeburg</b><br/>
    /// Code: W6294<br/>
    /// </summary>
    [XmlEnum("W6294")]
    Verwaltungsgericht_Magdeburg,

    /// <summary>
    /// <b>Justizvollzugsanstalt Halle</b><br/>
    /// Code: W6373<br/>
    /// </summary>
    [XmlEnum("W6373")]
    Justizvollzugsanstalt_Halle,

    /// <summary>
    /// <b>Arbeitsgericht Halle</b><br/>
    /// Code: W6377<br/>
    /// </summary>
    [XmlEnum("W6377")]
    Arbeitsgericht_Halle,

    /// <summary>
    /// <b>Jugendanstalt Ra&#223;nitz</b><br/>
    /// Code: W6424<br/>
    /// </summary>
    [XmlEnum("W6424")]
    Jugendanstalt_Rassnitz,

    /// <summary>
    /// <b>Oberverwaltungsgericht des Landes Sachsen-Anhalt</b><br/>
    /// Code: W6438<br/>
    /// </summary>
    [XmlEnum("W6438")]
    Oberverwaltungsgericht_des_Landes_Sachsen_Anhalt,

    /// <summary>
    /// <b>Justizvollzugsanstalt Burg</b><br/>
    /// Code: W6445<br/>
    /// </summary>
    [XmlEnum("W6445")]
    Justizvollzugsanstalt_Burg,

    /// <summary>
    /// <b>Landesarbeitsgericht Sachsen-Anhalt</b><br/>
    /// Code: W6453<br/>
    /// </summary>
    [XmlEnum("W6453")]
    Landesarbeitsgericht_Sachsen_Anhalt,

    /// <summary>
    /// <b>Arbeitsgericht Dessau-Ro&#223;lau</b><br/>
    /// Code: W6454<br/>
    /// </summary>
    [XmlEnum("W6454")]
    Arbeitsgericht_Dessau_Rosslau,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Halberstadt</b><br/>
    /// Code: W6455<br/>
    /// </summary>
    [XmlEnum("W6455")]
    aufgeloest_Arbeitsgericht_Halberstadt,

    /// <summary>
    /// <b>Arbeitsgericht Magdeburg</b><br/>
    /// Code: W6458<br/>
    /// </summary>
    [XmlEnum("W6458")]
    Arbeitsgericht_Magdeburg,

    /// <summary>
    /// <b>aufgel&#246;st-Arbeitsgericht Naumburg</b><br/>
    /// Code: W6459<br/>
    /// </summary>
    [XmlEnum("W6459")]
    aufgeloest_Arbeitsgericht_Naumburg,

    /// <summary>
    /// <b>Arbeitsgericht Stendal</b><br/>
    /// Code: W6460<br/>
    /// </summary>
    [XmlEnum("W6460")]
    Arbeitsgericht_Stendal,

    /// <summary>
    /// <b>Verwaltungsgericht Halle</b><br/>
    /// Code: W6464<br/>
    /// </summary>
    [XmlEnum("W6464")]
    Verwaltungsgericht_Halle,

    /// <summary>
    /// <b>Finanzgericht des Landes Sachsen-Anhalt</b><br/>
    /// Code: W6467<br/>
    /// </summary>
    [XmlEnum("W6467")]
    Finanzgericht_des_Landes_Sachsen_Anhalt,

    /// <summary>
    /// <b>Landessozialgericht Sachsen-Anhalt</b><br/>
    /// Code: W6468<br/>
    /// </summary>
    [XmlEnum("W6468")]
    Landessozialgericht_Sachsen_Anhalt,

    /// <summary>
    /// <b>Sozialgericht Dessau-Ro&#223;lau</b><br/>
    /// Code: W6469<br/>
    /// </summary>
    [XmlEnum("W6469")]
    Sozialgericht_Dessau_Rosslau,

    /// <summary>
    /// <b>Sozialgericht Halle</b><br/>
    /// Code: W6470<br/>
    /// </summary>
    [XmlEnum("W6470")]
    Sozialgericht_Halle,

    /// <summary>
    /// <b>Sozialgericht Magdeburg</b><br/>
    /// Code: W6471<br/>
    /// </summary>
    [XmlEnum("W6471")]
    Sozialgericht_Magdeburg,

    /// <summary>
    /// <b>aufgel&#246;st-Sozialgericht Stendal</b><br/>
    /// Code: W6472<br/>
    /// </summary>
    [XmlEnum("W6472")]
    aufgeloest_Sozialgericht_Stendal,

    /// <summary>
    /// <b>Landesverfassungsgericht Sachsen-Anhalt</b><br/>
    /// Code: W6488<br/>
    /// </summary>
    [XmlEnum("W6488")]
    Landesverfassungsgericht_Sachsen_Anhalt,

    /// <summary>
    /// <b>Dienstgericht f&#252;r Richter Sachsen-Anhalt</b><br/>
    /// Code: W6632<br/>
    /// </summary>
    [XmlEnum("W6632")]
    Dienstgericht_fuer_Richter_Sachsen_Anhalt,

    /// <summary>
    /// <b>Landesberufsgericht f&#252;r Heilberufe Sachsen-Anhalt</b><br/>
    /// Code: W6633<br/>
    /// </summary>
    [XmlEnum("W6633")]
    Landesberufsgericht_fuer_Heilberufe_Sachsen_Anhalt,

    /// <summary>
    /// <b>Berufsgerichtshof der Ingenieurkammer Sachsen-Anhalt</b><br/>
    /// Code: W6634<br/>
    /// </summary>
    [XmlEnum("W6634")]
    Berufsgerichtshof_der_Ingenieurkammer_Sachsen_Anhalt,

    /// <summary>
    /// <b>Richterdienstgericht Sachsen-Anhalt</b><br/>
    /// Code: W6635<br/>
    /// </summary>
    [XmlEnum("W6635")]
    Richterdienstgericht_Sachsen_Anhalt,

    /// <summary>
    /// <b>Berufsgericht f&#252;r Heilberufe Sachsen-Anhalt</b><br/>
    /// Code: W6636<br/>
    /// </summary>
    [XmlEnum("W6636")]
    Berufsgericht_fuer_Heilberufe_Sachsen_Anhalt,

    /// <summary>
    /// <b>Berufsgericht der Ingenieurkammer Sachsen-Anhalt</b><br/>
    /// Code: W6637<br/>
    /// </summary>
    [XmlEnum("W6637")]
    Berufsgericht_der_Ingenieurkammer_Sachsen_Anhalt,

    /// <summary>
    /// <b>Oberlandesgericht Schleswig</b><br/>
    /// Code: X1000<br/>
    /// </summary>
    [XmlEnum("X1000")]
    Oberlandesgericht_Schleswig,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Schleswig</b><br/>
    /// Code: X1000S<br/>
    /// </summary>
    [XmlEnum("X1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Schleswig,

    /// <summary>
    /// <b>Landgericht Flensburg</b><br/>
    /// Code: X1100<br/>
    /// </summary>
    [XmlEnum("X1100")]
    Landgericht_Flensburg,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Flensburg</b><br/>
    /// Code: X1100S<br/>
    /// </summary>
    [XmlEnum("X1100S")]
    Staatsanwaltschaft_beim_Landgericht_Flensburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bredstedt</b><br/>
    /// Code: X1111<br/>
    /// </summary>
    [XmlEnum("X1111")]
    aufgeloest_Amtsgericht_Bredstedt,

    /// <summary>
    /// <b>Amtsgericht Flensburg</b><br/>
    /// Code: X1112<br/>
    /// </summary>
    [XmlEnum("X1112")]
    Amtsgericht_Flensburg,

    /// <summary>
    /// <b>Grundbuchamt Flensburg</b><br/>
    /// Code: X1112G<br/>
    /// </summary>
    [XmlEnum("X1112G")]
    Grundbuchamt_Flensburg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Flensburg</b><br/>
    /// Code: X1112R<br/>
    /// </summary>
    [XmlEnum("X1112R")]
    Registergericht_Amtsgericht_Flensburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Friedrichstadt</b><br/>
    /// Code: X1113<br/>
    /// </summary>
    [XmlEnum("X1113")]
    aufgeloest_Amtsgericht_Friedrichstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Heide</b><br/>
    /// Code: X1114<br/>
    /// </summary>
    [XmlEnum("X1114")]
    aufgeloest_Amtsgericht_Heide,

    /// <summary>
    /// <b>Amtsgericht Husum</b><br/>
    /// Code: X1115<br/>
    /// </summary>
    [XmlEnum("X1115")]
    Amtsgericht_Husum,

    /// <summary>
    /// <b>Grundbuchamt Husum</b><br/>
    /// Code: X1115G<br/>
    /// </summary>
    [XmlEnum("X1115G")]
    Grundbuchamt_Husum,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kappeln</b><br/>
    /// Code: X1116<br/>
    /// </summary>
    [XmlEnum("X1116")]
    aufgeloest_Amtsgericht_Kappeln,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Leck</b><br/>
    /// Code: X1117<br/>
    /// </summary>
    [XmlEnum("X1117")]
    aufgeloest_Amtsgericht_Leck,

    /// <summary>
    /// <b>Amtsgericht Nieb&#252;ll</b><br/>
    /// Code: X1118<br/>
    /// </summary>
    [XmlEnum("X1118")]
    Amtsgericht_Niebuell,

    /// <summary>
    /// <b>Grundbuchamt Nieb&#252;ll</b><br/>
    /// Code: X1118G<br/>
    /// </summary>
    [XmlEnum("X1118G")]
    Grundbuchamt_Niebuell,

    /// <summary>
    /// <b>Amtsgericht Schleswig</b><br/>
    /// Code: X1119<br/>
    /// </summary>
    [XmlEnum("X1119")]
    Amtsgericht_Schleswig,

    /// <summary>
    /// <b>Grundbuchamt Schleswig</b><br/>
    /// Code: X1119G<br/>
    /// </summary>
    [XmlEnum("X1119G")]
    Grundbuchamt_Schleswig,

    /// <summary>
    /// <b>Amtsgericht Schleswig, Zentrales Mahngericht f&#252;r Schleswig-Holstein</b><br/>
    /// Code: X1119M<br/>
    /// </summary>
    [XmlEnum("X1119M")]
    Amtsgericht_Schleswig_Zentrales_Mahngericht_fuer_Schleswig_Holstein,

    /// <summary>
    /// <b>Amtsgericht Schleswig, Zentrales Vollstreckungsgericht Schleswig-Holstein</b><br/>
    /// Code: X1119R<br/>
    /// </summary>
    [XmlEnum("X1119R")]
    Amtsgericht_Schleswig_Zentrales_Vollstreckungsgericht_Schleswig_Holstein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht T&#246;nning</b><br/>
    /// Code: X1121<br/>
    /// </summary>
    [XmlEnum("X1121")]
    aufgeloest_Amtsgericht_Toenning,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wesselburen</b><br/>
    /// Code: X1122<br/>
    /// </summary>
    [XmlEnum("X1122")]
    aufgeloest_Amtsgericht_Wesselburen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Westerland</b><br/>
    /// Code: X1123<br/>
    /// </summary>
    [XmlEnum("X1123")]
    aufgeloest_Amtsgericht_Westerland,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wyk a. F&#246;hr</b><br/>
    /// Code: X1124<br/>
    /// </summary>
    [XmlEnum("X1124")]
    aufgeloest_Amtsgericht_Wyk_a_Foehr,

    /// <summary>
    /// <b>Landgericht Itzehoe</b><br/>
    /// Code: X1300<br/>
    /// </summary>
    [XmlEnum("X1300")]
    Landgericht_Itzehoe,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Itzehoe</b><br/>
    /// Code: X1300S<br/>
    /// </summary>
    [XmlEnum("X1300S")]
    Staatsanwaltschaft_beim_Landgericht_Itzehoe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Brunsb&#252;ttelkoog</b><br/>
    /// Code: X1311<br/>
    /// </summary>
    [XmlEnum("X1311")]
    aufgeloest_Amtsgericht_Brunsbuettelkoog,

    /// <summary>
    /// <b>Amtsgericht Elmshorn</b><br/>
    /// Code: X1312<br/>
    /// </summary>
    [XmlEnum("X1312")]
    Amtsgericht_Elmshorn,

    /// <summary>
    /// <b>Grundbuchamt Elmshorn</b><br/>
    /// Code: X1312G<br/>
    /// </summary>
    [XmlEnum("X1312G")]
    Grundbuchamt_Elmshorn,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gl&#252;ckstadt</b><br/>
    /// Code: X1314<br/>
    /// </summary>
    [XmlEnum("X1314")]
    aufgeloest_Amtsgericht_Glueckstadt,

    /// <summary>
    /// <b>Amtsgericht Itzehoe</b><br/>
    /// Code: X1315<br/>
    /// </summary>
    [XmlEnum("X1315")]
    Amtsgericht_Itzehoe,

    /// <summary>
    /// <b>Grundbuchamt Itzehoe</b><br/>
    /// Code: X1315G<br/>
    /// </summary>
    [XmlEnum("X1315G")]
    Grundbuchamt_Itzehoe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Kellinghusen</b><br/>
    /// Code: X1316<br/>
    /// </summary>
    [XmlEnum("X1316")]
    aufgeloest_Amtsgericht_Kellinghusen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Krempe</b><br/>
    /// Code: X1317<br/>
    /// </summary>
    [XmlEnum("X1317")]
    aufgeloest_Amtsgericht_Krempe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Marne</b><br/>
    /// Code: X1318<br/>
    /// </summary>
    [XmlEnum("X1318")]
    aufgeloest_Amtsgericht_Marne,

    /// <summary>
    /// <b>Amtsgericht Meldorf</b><br/>
    /// Code: X1319<br/>
    /// </summary>
    [XmlEnum("X1319")]
    Amtsgericht_Meldorf,

    /// <summary>
    /// <b>Grundbuchamt Meldorf</b><br/>
    /// Code: X1319G<br/>
    /// </summary>
    [XmlEnum("X1319G")]
    Grundbuchamt_Meldorf,

    /// <summary>
    /// <b>Amtsgericht Pinneberg</b><br/>
    /// Code: X1321<br/>
    /// </summary>
    [XmlEnum("X1321")]
    Amtsgericht_Pinneberg,

    /// <summary>
    /// <b>Grundbuchamt Pinneberg</b><br/>
    /// Code: X1321G<br/>
    /// </summary>
    [XmlEnum("X1321G")]
    Grundbuchamt_Pinneberg,

    /// <summary>
    /// <b>Registergericht Amtsgericht Pinneberg</b><br/>
    /// Code: X1321R<br/>
    /// </summary>
    [XmlEnum("X1321R")]
    Registergericht_Amtsgericht_Pinneberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Rantzau, Post Barmstedt</b><br/>
    /// Code: X1322<br/>
    /// </summary>
    [XmlEnum("X1322")]
    aufgeloest_Amtsgericht_Rantzau_Post_Barmstedt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Schenefeld</b><br/>
    /// Code: X1323<br/>
    /// </summary>
    [XmlEnum("X1323")]
    aufgeloest_Amtsgericht_Schenefeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Uetersen</b><br/>
    /// Code: X1324<br/>
    /// </summary>
    [XmlEnum("X1324")]
    aufgeloest_Amtsgericht_Uetersen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wedel (Holstein)</b><br/>
    /// Code: X1325<br/>
    /// </summary>
    [XmlEnum("X1325")]
    aufgeloest_Amtsgericht_Wedel_Holstein,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Wilster</b><br/>
    /// Code: X1326<br/>
    /// </summary>
    [XmlEnum("X1326")]
    aufgeloest_Amtsgericht_Wilster,

    /// <summary>
    /// <b>Landgericht Kiel</b><br/>
    /// Code: X1500<br/>
    /// </summary>
    [XmlEnum("X1500")]
    Landgericht_Kiel,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Kiel</b><br/>
    /// Code: X1500S<br/>
    /// </summary>
    [XmlEnum("X1500S")]
    Staatsanwaltschaft_beim_Landgericht_Kiel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Bramstedt</b><br/>
    /// Code: X1511<br/>
    /// </summary>
    [XmlEnum("X1511")]
    aufgeloest_Amtsgericht_Bad_Bramstedt,

    /// <summary>
    /// <b>Amtsgericht Bad Segeberg</b><br/>
    /// Code: X1512<br/>
    /// </summary>
    [XmlEnum("X1512")]
    Amtsgericht_Bad_Segeberg,

    /// <summary>
    /// <b>Grundbuchamt Bad Segeberg</b><br/>
    /// Code: X1512G<br/>
    /// </summary>
    [XmlEnum("X1512G")]
    Grundbuchamt_Bad_Segeberg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bordesholm</b><br/>
    /// Code: X1513<br/>
    /// </summary>
    [XmlEnum("X1513")]
    aufgeloest_Amtsgericht_Bordesholm,

    /// <summary>
    /// <b>Amtsgericht Eckernf&#246;rde</b><br/>
    /// Code: X1514<br/>
    /// </summary>
    [XmlEnum("X1514")]
    Amtsgericht_Eckernfoerde,

    /// <summary>
    /// <b>Grundbuchamt Eckernf&#246;rde</b><br/>
    /// Code: X1514G<br/>
    /// </summary>
    [XmlEnum("X1514G")]
    Grundbuchamt_Eckernfoerde,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Gettorf</b><br/>
    /// Code: X1515<br/>
    /// </summary>
    [XmlEnum("X1515")]
    aufgeloest_Amtsgericht_Gettorf,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Hohenwestedt</b><br/>
    /// Code: X1516<br/>
    /// </summary>
    [XmlEnum("X1516")]
    aufgeloest_Amtsgericht_Hohenwestedt,

    /// <summary>
    /// <b>Amtsgericht Kiel</b><br/>
    /// Code: X1517<br/>
    /// </summary>
    [XmlEnum("X1517")]
    Amtsgericht_Kiel,

    /// <summary>
    /// <b>Grundbuchamt Kiel</b><br/>
    /// Code: X1517G<br/>
    /// </summary>
    [XmlEnum("X1517G")]
    Grundbuchamt_Kiel,

    /// <summary>
    /// <b>Registergericht Amtsgericht Kiel</b><br/>
    /// Code: X1517R<br/>
    /// </summary>
    [XmlEnum("X1517R")]
    Registergericht_Amtsgericht_Kiel,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht L&#252;tjenburg</b><br/>
    /// Code: X1518<br/>
    /// </summary>
    [XmlEnum("X1518")]
    aufgeloest_Amtsgericht_Luetjenburg,

    /// <summary>
    /// <b>Amtsgericht Neum&#252;nster</b><br/>
    /// Code: X1519<br/>
    /// </summary>
    [XmlEnum("X1519")]
    Amtsgericht_Neumuenster,

    /// <summary>
    /// <b>Grundbuchamt Neum&#252;nster</b><br/>
    /// Code: X1519G<br/>
    /// </summary>
    [XmlEnum("X1519G")]
    Grundbuchamt_Neumuenster,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Nortorf</b><br/>
    /// Code: X1521<br/>
    /// </summary>
    [XmlEnum("X1521")]
    aufgeloest_Amtsgericht_Nortorf,

    /// <summary>
    /// <b>Amtsgericht Pl&#246;n</b><br/>
    /// Code: X1522<br/>
    /// </summary>
    [XmlEnum("X1522")]
    Amtsgericht_Ploen,

    /// <summary>
    /// <b>Grundbuchamt Pl&#246;n</b><br/>
    /// Code: X1522G<br/>
    /// </summary>
    [XmlEnum("X1522G")]
    Grundbuchamt_Ploen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Preetz</b><br/>
    /// Code: X1523<br/>
    /// </summary>
    [XmlEnum("X1523")]
    aufgeloest_Amtsgericht_Preetz,

    /// <summary>
    /// <b>Amtsgericht Rendsburg</b><br/>
    /// Code: X1524<br/>
    /// </summary>
    [XmlEnum("X1524")]
    Amtsgericht_Rendsburg,

    /// <summary>
    /// <b>Grundbuchamt Rendsburg</b><br/>
    /// Code: X1524G<br/>
    /// </summary>
    [XmlEnum("X1524G")]
    Grundbuchamt_Rendsburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sch&#246;nberg (Holstein)</b><br/>
    /// Code: X1525<br/>
    /// </summary>
    [XmlEnum("X1525")]
    aufgeloest_Amtsgericht_Schoenberg_Holstein,

    /// <summary>
    /// <b>Amtsgericht Norderstedt</b><br/>
    /// Code: X1526<br/>
    /// </summary>
    [XmlEnum("X1526")]
    Amtsgericht_Norderstedt,

    /// <summary>
    /// <b>Grundbuchamt Norderstedt</b><br/>
    /// Code: X1526G<br/>
    /// </summary>
    [XmlEnum("X1526G")]
    Grundbuchamt_Norderstedt,

    /// <summary>
    /// <b>Landgericht L&#252;beck</b><br/>
    /// Code: X1700<br/>
    /// </summary>
    [XmlEnum("X1700")]
    Landgericht_Luebeck,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht L&#252;beck</b><br/>
    /// Code: X1700S<br/>
    /// </summary>
    [XmlEnum("X1700S")]
    Staatsanwaltschaft_beim_Landgericht_Luebeck,

    /// <summary>
    /// <b>Amtsgericht Ahrensburg</b><br/>
    /// Code: X1711<br/>
    /// </summary>
    [XmlEnum("X1711")]
    Amtsgericht_Ahrensburg,

    /// <summary>
    /// <b>Grundbuchamt Ahrensburg</b><br/>
    /// Code: X1711G<br/>
    /// </summary>
    [XmlEnum("X1711G")]
    Grundbuchamt_Ahrensburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Oldesloe</b><br/>
    /// Code: X1712<br/>
    /// </summary>
    [XmlEnum("X1712")]
    aufgeloest_Amtsgericht_Bad_Oldesloe,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bad Schwartau</b><br/>
    /// Code: X1713<br/>
    /// </summary>
    [XmlEnum("X1713")]
    aufgeloest_Amtsgericht_Bad_Schwartau,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Bargteheide</b><br/>
    /// Code: X1714<br/>
    /// </summary>
    [XmlEnum("X1714")]
    aufgeloest_Amtsgericht_Bargteheide,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Burg a. F.</b><br/>
    /// Code: X1715<br/>
    /// </summary>
    [XmlEnum("X1715")]
    aufgeloest_Amtsgericht_Burg_a_F,

    /// <summary>
    /// <b>Amtsgericht Eutin</b><br/>
    /// Code: X1716<br/>
    /// </summary>
    [XmlEnum("X1716")]
    Amtsgericht_Eutin,

    /// <summary>
    /// <b>Grundbuchamt Eutin</b><br/>
    /// Code: X1716G<br/>
    /// </summary>
    [XmlEnum("X1716G")]
    Grundbuchamt_Eutin,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Geesthacht</b><br/>
    /// Code: X1717<br/>
    /// </summary>
    [XmlEnum("X1717")]
    aufgeloest_Amtsgericht_Geesthacht,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Heiligenhafen</b><br/>
    /// Code: X1718<br/>
    /// </summary>
    [XmlEnum("X1718")]
    aufgeloest_Amtsgericht_Heiligenhafen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lauenburg (Elbe)</b><br/>
    /// Code: X1719<br/>
    /// </summary>
    [XmlEnum("X1719")]
    aufgeloest_Amtsgericht_Lauenburg_Elbe,

    /// <summary>
    /// <b>Amtsgericht L&#252;beck</b><br/>
    /// Code: X1721<br/>
    /// </summary>
    [XmlEnum("X1721")]
    Amtsgericht_Luebeck,

    /// <summary>
    /// <b>Grundbuchamt L&#252;beck</b><br/>
    /// Code: X1721G<br/>
    /// </summary>
    [XmlEnum("X1721G")]
    Grundbuchamt_Luebeck,

    /// <summary>
    /// <b>Registergericht Amtsgericht L&#252;beck</b><br/>
    /// Code: X1721R<br/>
    /// </summary>
    [XmlEnum("X1721R")]
    Registergericht_Amtsgericht_Luebeck,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht M&#246;lln</b><br/>
    /// Code: X1722<br/>
    /// </summary>
    [XmlEnum("X1722")]
    aufgeloest_Amtsgericht_Moelln,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neustadt in Holstein</b><br/>
    /// Code: X1723<br/>
    /// </summary>
    [XmlEnum("X1723")]
    aufgeloest_Amtsgericht_Neustadt_in_Holstein,

    /// <summary>
    /// <b>Amtsgericht Oldenburg (Holstein)</b><br/>
    /// Code: X1724<br/>
    /// </summary>
    [XmlEnum("X1724")]
    Amtsgericht_Oldenburg_Holstein,

    /// <summary>
    /// <b>Grundbuchamt Oldenburg (Holstein)</b><br/>
    /// Code: X1724G<br/>
    /// </summary>
    [XmlEnum("X1724G")]
    Grundbuchamt_Oldenburg_Holstein,

    /// <summary>
    /// <b>Amtsgericht Ratzeburg</b><br/>
    /// Code: X1725<br/>
    /// </summary>
    [XmlEnum("X1725")]
    Amtsgericht_Ratzeburg,

    /// <summary>
    /// <b>Grundbuchamt Ratzeburg</b><br/>
    /// Code: X1725G<br/>
    /// </summary>
    [XmlEnum("X1725G")]
    Grundbuchamt_Ratzeburg,

    /// <summary>
    /// <b>Amtsgericht Reinbek</b><br/>
    /// Code: X1726<br/>
    /// </summary>
    [XmlEnum("X1726")]
    Amtsgericht_Reinbek,

    /// <summary>
    /// <b>Grundbuchamt Reinbek</b><br/>
    /// Code: X1726G<br/>
    /// </summary>
    [XmlEnum("X1726G")]
    Grundbuchamt_Reinbek,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Reinfeld</b><br/>
    /// Code: X1727<br/>
    /// </summary>
    [XmlEnum("X1727")]
    aufgeloest_Amtsgericht_Reinfeld,

    /// <summary>
    /// <b>Amtsgericht Schwarzenbek</b><br/>
    /// Code: X1728<br/>
    /// </summary>
    [XmlEnum("X1728")]
    Amtsgericht_Schwarzenbek,

    /// <summary>
    /// <b>Grundbuchamt Schwarzenbek</b><br/>
    /// Code: X1728G<br/>
    /// </summary>
    [XmlEnum("X1728G")]
    Grundbuchamt_Schwarzenbek,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Trittau</b><br/>
    /// Code: X1729<br/>
    /// </summary>
    [XmlEnum("X1729")]
    aufgeloest_Amtsgericht_Trittau,

    /// <summary>
    /// <b>Arbeitsgericht Elmshorn</b><br/>
    /// Code: X6070<br/>
    /// </summary>
    [XmlEnum("X6070")]
    Arbeitsgericht_Elmshorn,

    /// <summary>
    /// <b>Arbeitsgericht Flensburg</b><br/>
    /// Code: X6071<br/>
    /// </summary>
    [XmlEnum("X6071")]
    Arbeitsgericht_Flensburg,

    /// <summary>
    /// <b>Sozialgericht Itzehoe</b><br/>
    /// Code: X6073<br/>
    /// </summary>
    [XmlEnum("X6073")]
    Sozialgericht_Itzehoe,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Finanzgericht</b><br/>
    /// Code: X6074<br/>
    /// </summary>
    [XmlEnum("X6074")]
    Schleswig_Holsteinisches_Finanzgericht,

    /// <summary>
    /// <b>Sozialgericht Kiel</b><br/>
    /// Code: X6075<br/>
    /// </summary>
    [XmlEnum("X6075")]
    Sozialgericht_Kiel,

    /// <summary>
    /// <b>Landesarbeitsgericht Schleswig-Holstein</b><br/>
    /// Code: X6076<br/>
    /// </summary>
    [XmlEnum("X6076")]
    Landesarbeitsgericht_Schleswig_Holstein,

    /// <summary>
    /// <b>Arbeitsgericht Neum&#252;nster</b><br/>
    /// Code: X6077<br/>
    /// </summary>
    [XmlEnum("X6077")]
    Arbeitsgericht_Neumuenster,

    /// <summary>
    /// <b>Sozialgericht Schleswig</b><br/>
    /// Code: X6078<br/>
    /// </summary>
    [XmlEnum("X6078")]
    Sozialgericht_Schleswig,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Landessozialgericht</b><br/>
    /// Code: X6079<br/>
    /// </summary>
    [XmlEnum("X6079")]
    Schleswig_Holsteinisches_Landessozialgericht,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Verwaltungsgericht</b><br/>
    /// Code: X6080<br/>
    /// </summary>
    [XmlEnum("X6080")]
    Schleswig_Holsteinisches_Verwaltungsgericht,

    /// <summary>
    /// <b>Schleswig-Holsteinischer Anwaltsgerichtshof</b><br/>
    /// Code: X6111<br/>
    /// </summary>
    [XmlEnum("X6111")]
    Schleswig_Holsteinischer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Arbeitsgericht Kiel</b><br/>
    /// Code: X6165<br/>
    /// </summary>
    [XmlEnum("X6165")]
    Arbeitsgericht_Kiel,

    /// <summary>
    /// <b>Arbeitsgericht L&#252;beck</b><br/>
    /// Code: X6166<br/>
    /// </summary>
    [XmlEnum("X6166")]
    Arbeitsgericht_Luebeck,

    /// <summary>
    /// <b>Sozialgericht L&#252;beck</b><br/>
    /// Code: X6188<br/>
    /// </summary>
    [XmlEnum("X6188")]
    Sozialgericht_Luebeck,

    /// <summary>
    /// <b>Justizvollzugsanstalt L&#252;beck</b><br/>
    /// Code: X6240<br/>
    /// </summary>
    [XmlEnum("X6240")]
    Justizvollzugsanstalt_Luebeck,

    /// <summary>
    /// <b>Justizvollzugsanstalt Glasmoor</b><br/>
    /// Code: X6313<br/>
    /// </summary>
    [XmlEnum("X6313")]
    Justizvollzugsanstalt_Glasmoor,

    /// <summary>
    /// <b>Justizvollzugsanstalt Itzehoe</b><br/>
    /// Code: X6315<br/>
    /// </summary>
    [XmlEnum("X6315")]
    Justizvollzugsanstalt_Itzehoe,

    /// <summary>
    /// <b>Jugendanstalt Schleswig</b><br/>
    /// Code: X6321<br/>
    /// </summary>
    [XmlEnum("X6321")]
    Jugendanstalt_Schleswig,

    /// <summary>
    /// <b>Justizvollzugsanstalt Neum&#252;nster</b><br/>
    /// Code: X6323<br/>
    /// </summary>
    [XmlEnum("X6323")]
    Justizvollzugsanstalt_Neumuenster,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Oberverwaltungsgericht</b><br/>
    /// Code: X6387<br/>
    /// </summary>
    [XmlEnum("X6387")]
    Schleswig_Holsteinisches_Oberverwaltungsgericht,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Landesverfassungsgericht</b><br/>
    /// Code: X6433<br/>
    /// </summary>
    [XmlEnum("X6433")]
    Schleswig_Holsteinisches_Landesverfassungsgericht,

    /// <summary>
    /// <b>Justizvollzugsanstalt Kiel</b><br/>
    /// Code: X6747<br/>
    /// </summary>
    [XmlEnum("X6747")]
    Justizvollzugsanstalt_Kiel,

    /// <summary>
    /// <b>Justizvollzugsanstalt Flensburg</b><br/>
    /// Code: X6756<br/>
    /// </summary>
    [XmlEnum("X6756")]
    Justizvollzugsanstalt_Flensburg,

    /// <summary>
    /// <b>Schleswig-Holsteinisches Anwaltsgericht</b><br/>
    /// Code: X6776<br/>
    /// </summary>
    [XmlEnum("X6776")]
    Schleswig_Holsteinisches_Anwaltsgericht,

    /// <summary>
    /// <b>Th&#252;ringer Oberlandesgericht</b><br/>
    /// Code: Y1000<br/>
    /// </summary>
    [XmlEnum("Y1000")]
    Thueringer_Oberlandesgericht,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Oberlandesgericht Jena</b><br/>
    /// Code: Y1000S<br/>
    /// </summary>
    [XmlEnum("Y1000S")]
    Staatsanwaltschaft_beim_Oberlandesgericht_Jena,

    /// <summary>
    /// <b>Landgericht Erfurt</b><br/>
    /// Code: Y1100<br/>
    /// </summary>
    [XmlEnum("Y1100")]
    Landgericht_Erfurt,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Erfurt</b><br/>
    /// Code: Y1100S<br/>
    /// </summary>
    [XmlEnum("Y1100S")]
    Staatsanwaltschaft_beim_Landgericht_Erfurt,

    /// <summary>
    /// <b>Amtsgericht Apolda</b><br/>
    /// Code: Y1101<br/>
    /// </summary>
    [XmlEnum("Y1101")]
    Amtsgericht_Apolda,

    /// <summary>
    /// <b>Grundbuchamt Apolda</b><br/>
    /// Code: Y1101G<br/>
    /// </summary>
    [XmlEnum("Y1101G")]
    Grundbuchamt_Apolda,

    /// <summary>
    /// <b>Amtsgericht Arnstadt</b><br/>
    /// Code: Y1102<br/>
    /// </summary>
    [XmlEnum("Y1102")]
    Amtsgericht_Arnstadt,

    /// <summary>
    /// <b>Grundbuchamt Arnstadt</b><br/>
    /// Code: Y1102G<br/>
    /// </summary>
    [XmlEnum("Y1102G")]
    Grundbuchamt_Arnstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Sondershausen Zweigstelle Artern</b><br/>
    /// Code: Y1103<br/>
    /// </summary>
    [XmlEnum("Y1103")]
    aufgeloest_Amtsgericht_Sondershausen_Zweigstelle_Artern,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht M&#252;hlhausen Zweigstelle Bad Langensalza</b><br/>
    /// Code: Y1104<br/>
    /// </summary>
    [XmlEnum("Y1104")]
    aufgeloest_Amtsgericht_Muehlhausen_Zweigstelle_Bad_Langensalza,

    /// <summary>
    /// <b>aufgel&#246;st-Grundbuchamt M&#252;hlhausen Zweigstelle Bad Langensalza</b><br/>
    /// Code: Y1104G<br/>
    /// </summary>
    [XmlEnum("Y1104G")]
    aufgeloest_Grundbuchamt_Muehlhausen_Zweigstelle_Bad_Langensalza,

    /// <summary>
    /// <b>Amtsgericht Eisenach</b><br/>
    /// Code: Y1105<br/>
    /// </summary>
    [XmlEnum("Y1105")]
    Amtsgericht_Eisenach,

    /// <summary>
    /// <b>Grundbuchamt Eisenach</b><br/>
    /// Code: Y1105G<br/>
    /// </summary>
    [XmlEnum("Y1105G")]
    Grundbuchamt_Eisenach,

    /// <summary>
    /// <b>Amtsgericht Erfurt</b><br/>
    /// Code: Y1106<br/>
    /// </summary>
    [XmlEnum("Y1106")]
    Amtsgericht_Erfurt,

    /// <summary>
    /// <b>Grundbuchamt Erfurt</b><br/>
    /// Code: Y1106G<br/>
    /// </summary>
    [XmlEnum("Y1106G")]
    Grundbuchamt_Erfurt,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Erfurt (Land)</b><br/>
    /// Code: Y1107<br/>
    /// </summary>
    [XmlEnum("Y1107")]
    aufgeloest_Amtsgericht_Erfurt_Land,

    /// <summary>
    /// <b>Amtsgericht Gotha</b><br/>
    /// Code: Y1108<br/>
    /// </summary>
    [XmlEnum("Y1108")]
    Amtsgericht_Gotha,

    /// <summary>
    /// <b>Grundbuchamt Gotha</b><br/>
    /// Code: Y1108G<br/>
    /// </summary>
    [XmlEnum("Y1108G")]
    Grundbuchamt_Gotha,

    /// <summary>
    /// <b>Amtsgericht Heiligenstadt</b><br/>
    /// Code: Y1109<br/>
    /// </summary>
    [XmlEnum("Y1109")]
    Amtsgericht_Heiligenstadt,

    /// <summary>
    /// <b>Grundbuchamt Heilbad Heiligenstadt</b><br/>
    /// Code: Y1109G<br/>
    /// </summary>
    [XmlEnum("Y1109G")]
    Grundbuchamt_Heilbad_Heiligenstadt,

    /// <summary>
    /// <b>Amtsgericht M&#252;hlhausen</b><br/>
    /// Code: Y1110<br/>
    /// </summary>
    [XmlEnum("Y1110")]
    Amtsgericht_Muehlhausen,

    /// <summary>
    /// <b>Grundbuchamt M&#252;hlhausen</b><br/>
    /// Code: Y1110G<br/>
    /// </summary>
    [XmlEnum("Y1110G")]
    Grundbuchamt_Muehlhausen,

    /// <summary>
    /// <b>Amtsgericht Nordhausen</b><br/>
    /// Code: Y1111<br/>
    /// </summary>
    [XmlEnum("Y1111")]
    Amtsgericht_Nordhausen,

    /// <summary>
    /// <b>Grundbuchamt Nordhausen</b><br/>
    /// Code: Y1111G<br/>
    /// </summary>
    [XmlEnum("Y1111G")]
    Grundbuchamt_Nordhausen,

    /// <summary>
    /// <b>Amtsgericht S&#246;mmerda</b><br/>
    /// Code: Y1112<br/>
    /// </summary>
    [XmlEnum("Y1112")]
    Amtsgericht_Soemmerda,

    /// <summary>
    /// <b>Grundbuchamt S&#246;mmerda</b><br/>
    /// Code: Y1112G<br/>
    /// </summary>
    [XmlEnum("Y1112G")]
    Grundbuchamt_Soemmerda,

    /// <summary>
    /// <b>Amtsgericht Sondershausen</b><br/>
    /// Code: Y1113<br/>
    /// </summary>
    [XmlEnum("Y1113")]
    Amtsgericht_Sondershausen,

    /// <summary>
    /// <b>Grundbuchamt Sondershausen</b><br/>
    /// Code: Y1113G<br/>
    /// </summary>
    [XmlEnum("Y1113G")]
    Grundbuchamt_Sondershausen,

    /// <summary>
    /// <b>Amtsgericht Weimar</b><br/>
    /// Code: Y1114<br/>
    /// </summary>
    [XmlEnum("Y1114")]
    Amtsgericht_Weimar,

    /// <summary>
    /// <b>Grundbuchamt Weimar</b><br/>
    /// Code: Y1114G<br/>
    /// </summary>
    [XmlEnum("Y1114G")]
    Grundbuchamt_Weimar,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Heilbad Heiligenstadt Zweigstelle Leinefelde-Worbis</b><br/>
    /// Code: Y1115<br/>
    /// </summary>
    [XmlEnum("Y1115")]
    aufgeloest_Amtsgericht_Heilbad_Heiligenstadt_Zweigstelle_Leinefelde_Worbis,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Gotha, Au&#223;enstelle der StA Erfurt</b><br/>
    /// Code: Y1116S<br/>
    /// </summary>
    [XmlEnum("Y1116S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Gotha_Aussenstelle_der_StA_Erfurt,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Erfurt, Au&#223;enstelle Erfurt</b><br/>
    /// Code: Y1117S<br/>
    /// </summary>
    [XmlEnum("Y1117S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Erfurt_Aussenstelle_Erfurt,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Weimar, Au&#223;enstelle der StA Erfurt</b><br/>
    /// Code: Y1118S<br/>
    /// </summary>
    [XmlEnum("Y1118S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Weimar_Aussenstelle_der_StA_Erfurt,

    /// <summary>
    /// <b>Landgericht Gera</b><br/>
    /// Code: Y1200<br/>
    /// </summary>
    [XmlEnum("Y1200")]
    Landgericht_Gera,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Gera</b><br/>
    /// Code: Y1200S<br/>
    /// </summary>
    [XmlEnum("Y1200S")]
    Staatsanwaltschaft_beim_Landgericht_Gera,

    /// <summary>
    /// <b>Amtsgericht Altenburg</b><br/>
    /// Code: Y1201<br/>
    /// </summary>
    [XmlEnum("Y1201")]
    Amtsgericht_Altenburg,

    /// <summary>
    /// <b>Grundbuchamt Altenburg</b><br/>
    /// Code: Y1201G<br/>
    /// </summary>
    [XmlEnum("Y1201G")]
    Grundbuchamt_Altenburg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Eisenberg</b><br/>
    /// Code: Y1202<br/>
    /// </summary>
    [XmlEnum("Y1202")]
    aufgeloest_Amtsgericht_Eisenberg,

    /// <summary>
    /// <b>Amtsgericht Gera</b><br/>
    /// Code: Y1203<br/>
    /// </summary>
    [XmlEnum("Y1203")]
    Amtsgericht_Gera,

    /// <summary>
    /// <b>Grundbuchamt Gera</b><br/>
    /// Code: Y1203G<br/>
    /// </summary>
    [XmlEnum("Y1203G")]
    Grundbuchamt_Gera,

    /// <summary>
    /// <b>aufgel&#246;st-Kreisgericht Gera-Land</b><br/>
    /// Code: Y1204<br/>
    /// </summary>
    [XmlEnum("Y1204")]
    aufgeloest_Kreisgericht_Gera_Land,

    /// <summary>
    /// <b>Amtsgericht Greiz</b><br/>
    /// Code: Y1205<br/>
    /// </summary>
    [XmlEnum("Y1205")]
    Amtsgericht_Greiz,

    /// <summary>
    /// <b>Grundbuchamt Greiz</b><br/>
    /// Code: Y1205G<br/>
    /// </summary>
    [XmlEnum("Y1205G")]
    Grundbuchamt_Greiz,

    /// <summary>
    /// <b>Amtsgericht Jena</b><br/>
    /// Code: Y1206<br/>
    /// </summary>
    [XmlEnum("Y1206")]
    Amtsgericht_Jena,

    /// <summary>
    /// <b>Grundbuchamt Jena</b><br/>
    /// Code: Y1206G<br/>
    /// </summary>
    [XmlEnum("Y1206G")]
    Grundbuchamt_Jena,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Jena, Zwst. der StA Gera</b><br/>
    /// Code: Y1206S<br/>
    /// </summary>
    [XmlEnum("Y1206S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Jena_Zwst_der_StA_Gera,

    /// <summary>
    /// <b>Amtsgericht Jena - Handels-, Genossenschafts- und Partnerschaftsregister</b><br/>
    /// Code: Y1206V<br/>
    /// </summary>
    [XmlEnum("Y1206V")]
    Amtsgericht_Jena_Handels_Genossenschafts_und_Partnerschaftsregister,

    /// <summary>
    /// <b>Amtsgericht P&#246;&#223;neck Zweigstelle Bad Lobenstein</b><br/>
    /// Code: Y1208<br/>
    /// </summary>
    [XmlEnum("Y1208")]
    Amtsgericht_Poessneck_Zweigstelle_Bad_Lobenstein,

    /// <summary>
    /// <b>Grundbuchamt P&#246;&#223;neck Zweigstelle Bad Lobenstein</b><br/>
    /// Code: Y1208G<br/>
    /// </summary>
    [XmlEnum("Y1208G")]
    Grundbuchamt_Poessneck_Zweigstelle_Bad_Lobenstein,

    /// <summary>
    /// <b>Amtsgericht P&#246;&#223;neck</b><br/>
    /// Code: Y1209<br/>
    /// </summary>
    [XmlEnum("Y1209")]
    Amtsgericht_Poessneck,

    /// <summary>
    /// <b>Grundbuchamt P&#246;&#223;neck</b><br/>
    /// Code: Y1209G<br/>
    /// </summary>
    [XmlEnum("Y1209G")]
    Grundbuchamt_Poessneck,

    /// <summary>
    /// <b>Amtsgericht Rudolstadt</b><br/>
    /// Code: Y1210<br/>
    /// </summary>
    [XmlEnum("Y1210")]
    Amtsgericht_Rudolstadt,

    /// <summary>
    /// <b>Grundbuchamt Rudolstadt</b><br/>
    /// Code: Y1210G<br/>
    /// </summary>
    [XmlEnum("Y1210G")]
    Grundbuchamt_Rudolstadt,

    /// <summary>
    /// <b>aufgel&#246;st-Staatsanwaltschaft beim Landgericht Rudolstadt, Zwst. der StA Gera</b><br/>
    /// Code: Y1210S<br/>
    /// </summary>
    [XmlEnum("Y1210S")]
    aufgeloest_Staatsanwaltschaft_beim_Landgericht_Rudolstadt_Zwst_der_StA_Gera,

    /// <summary>
    /// <b>Amtsgericht Rudolstadt Zweigstelle Saalfeld</b><br/>
    /// Code: Y1211<br/>
    /// </summary>
    [XmlEnum("Y1211")]
    Amtsgericht_Rudolstadt_Zweigstelle_Saalfeld,

    /// <summary>
    /// <b>Grundbuchamt Rudolstadt Zweigstelle Saalfeld</b><br/>
    /// Code: Y1211G<br/>
    /// </summary>
    [XmlEnum("Y1211G")]
    Grundbuchamt_Rudolstadt_Zweigstelle_Saalfeld,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Lobenstein, Zwst. Schleiz</b><br/>
    /// Code: Y1212<br/>
    /// </summary>
    [XmlEnum("Y1212")]
    aufgeloest_Amtsgericht_Lobenstein_Zwst_Schleiz,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Altenburg, Zwst. Schm&#246;lln</b><br/>
    /// Code: Y1213<br/>
    /// </summary>
    [XmlEnum("Y1213")]
    aufgeloest_Amtsgericht_Altenburg_Zwst_Schmoelln,

    /// <summary>
    /// <b>Amtsgericht Stadtroda</b><br/>
    /// Code: Y1214<br/>
    /// </summary>
    [XmlEnum("Y1214")]
    Amtsgericht_Stadtroda,

    /// <summary>
    /// <b>Grundbuchamt Stadtroda</b><br/>
    /// Code: Y1214G<br/>
    /// </summary>
    [XmlEnum("Y1214G")]
    Grundbuchamt_Stadtroda,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Greiz, Zwst. Zeulenroda</b><br/>
    /// Code: Y1215<br/>
    /// </summary>
    [XmlEnum("Y1215")]
    aufgeloest_Amtsgericht_Greiz_Zwst_Zeulenroda,

    /// <summary>
    /// <b>Landgericht Meiningen</b><br/>
    /// Code: Y1300<br/>
    /// </summary>
    [XmlEnum("Y1300")]
    Landgericht_Meiningen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht Meiningen</b><br/>
    /// Code: Y1300S<br/>
    /// </summary>
    [XmlEnum("Y1300S")]
    Staatsanwaltschaft_beim_Landgericht_Meiningen,

    /// <summary>
    /// <b>Amtsgericht Bad Salzungen</b><br/>
    /// Code: Y1301<br/>
    /// </summary>
    [XmlEnum("Y1301")]
    Amtsgericht_Bad_Salzungen,

    /// <summary>
    /// <b>Grundbuchamt Bad Salzungen</b><br/>
    /// Code: Y1301G<br/>
    /// </summary>
    [XmlEnum("Y1301G")]
    Grundbuchamt_Bad_Salzungen,

    /// <summary>
    /// <b>Amtsgericht Hildburghausen</b><br/>
    /// Code: Y1302<br/>
    /// </summary>
    [XmlEnum("Y1302")]
    Amtsgericht_Hildburghausen,

    /// <summary>
    /// <b>Grundbuchamt Hildburghausen</b><br/>
    /// Code: Y1302G<br/>
    /// </summary>
    [XmlEnum("Y1302G")]
    Grundbuchamt_Hildburghausen,

    /// <summary>
    /// <b>Amtsgericht Arnstadt Zweigstelle Ilmenau</b><br/>
    /// Code: Y1303<br/>
    /// </summary>
    [XmlEnum("Y1303")]
    Amtsgericht_Arnstadt_Zweigstelle_Ilmenau,

    /// <summary>
    /// <b>Grundbuchamt Arnstadt Zweigstelle Ilmenau</b><br/>
    /// Code: Y1303G<br/>
    /// </summary>
    [XmlEnum("Y1303G")]
    Grundbuchamt_Arnstadt_Zweigstelle_Ilmenau,

    /// <summary>
    /// <b>Amtsgericht Meiningen</b><br/>
    /// Code: Y1304<br/>
    /// </summary>
    [XmlEnum("Y1304")]
    Amtsgericht_Meiningen,

    /// <summary>
    /// <b>Grundbuchamt Meiningen</b><br/>
    /// Code: Y1304G<br/>
    /// </summary>
    [XmlEnum("Y1304G")]
    Grundbuchamt_Meiningen,

    /// <summary>
    /// <b>Amtsgericht Meiningen, Zentrales Vollstreckungsgericht Th&#252;ringen</b><br/>
    /// Code: Y1304R<br/>
    /// </summary>
    [XmlEnum("Y1304R")]
    Amtsgericht_Meiningen_Zentrales_Vollstreckungsgericht_Thueringen,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Neuhaus/Rwg.</b><br/>
    /// Code: Y1305<br/>
    /// </summary>
    [XmlEnum("Y1305")]
    aufgeloest_Amtsgericht_Neuhaus_Rwg,

    /// <summary>
    /// <b>aufgel&#246;st-Amtsgericht Meiningen Zweigstelle Schmalkalden</b><br/>
    /// Code: Y1306<br/>
    /// </summary>
    [XmlEnum("Y1306")]
    aufgeloest_Amtsgericht_Meiningen_Zweigstelle_Schmalkalden,

    /// <summary>
    /// <b>Amtsgericht Sonneberg</b><br/>
    /// Code: Y1307<br/>
    /// </summary>
    [XmlEnum("Y1307")]
    Amtsgericht_Sonneberg,

    /// <summary>
    /// <b>Grundbuchamt Sonneberg</b><br/>
    /// Code: Y1307G<br/>
    /// </summary>
    [XmlEnum("Y1307G")]
    Grundbuchamt_Sonneberg,

    /// <summary>
    /// <b>Amtsgericht Suhl</b><br/>
    /// Code: Y1308<br/>
    /// </summary>
    [XmlEnum("Y1308")]
    Amtsgericht_Suhl,

    /// <summary>
    /// <b>Grundbuchamt Suhl</b><br/>
    /// Code: Y1308G<br/>
    /// </summary>
    [XmlEnum("Y1308G")]
    Grundbuchamt_Suhl,

    /// <summary>
    /// <b>Landgericht M&#252;hlhausen</b><br/>
    /// Code: Y1400<br/>
    /// </summary>
    [XmlEnum("Y1400")]
    Landgericht_Muehlhausen,

    /// <summary>
    /// <b>Staatsanwaltschaft beim Landgericht M&#252;hlhausen</b><br/>
    /// Code: Y1400S<br/>
    /// </summary>
    [XmlEnum("Y1400S")]
    Staatsanwaltschaft_beim_Landgericht_Muehlhausen,

    /// <summary>
    /// <b>Th&#252;ringer Finanzgericht</b><br/>
    /// Code: Y6003<br/>
    /// </summary>
    [XmlEnum("Y6003")]
    Thueringer_Finanzgericht,

    /// <summary>
    /// <b>Th&#252;ringer Anwaltsgerichtshof</b><br/>
    /// Code: Y6004<br/>
    /// </summary>
    [XmlEnum("Y6004")]
    Thueringer_Anwaltsgerichtshof,

    /// <summary>
    /// <b>Bundesarbeitsgericht</b><br/>
    /// Code: Y6010<br/>
    /// </summary>
    [XmlEnum("Y6010")]
    Bundesarbeitsgericht,

    /// <summary>
    /// <b>Arbeitsgericht Gera</b><br/>
    /// Code: Y6060<br/>
    /// </summary>
    [XmlEnum("Y6060")]
    Arbeitsgericht_Gera,

    /// <summary>
    /// <b>Verwaltungsgericht Gera</b><br/>
    /// Code: Y6061<br/>
    /// </summary>
    [XmlEnum("Y6061")]
    Verwaltungsgericht_Gera,

    /// <summary>
    /// <b>Th&#252;ringer Verfassungsgerichtshof</b><br/>
    /// Code: Y6149<br/>
    /// </summary>
    [XmlEnum("Y6149")]
    Thueringer_Verfassungsgerichtshof,

    /// <summary>
    /// <b>Justizvollzugsanstalt Suhl-Goldlauter</b><br/>
    /// Code: Y6319<br/>
    /// </summary>
    [XmlEnum("Y6319")]
    Justizvollzugsanstalt_Suhl_Goldlauter,

    /// <summary>
    /// <b>Justizvollzugsanstalt Hohenleuben</b><br/>
    /// Code: Y6320<br/>
    /// </summary>
    [XmlEnum("Y6320")]
    Justizvollzugsanstalt_Hohenleuben,

    /// <summary>
    /// <b>Justizvollzugsanstalt Unterma&#223;feld</b><br/>
    /// Code: Y6322<br/>
    /// </summary>
    [XmlEnum("Y6322")]
    Justizvollzugsanstalt_Untermassfeld,

    /// <summary>
    /// <b>Justizvollzugsanstalt Tonna</b><br/>
    /// Code: Y6323<br/>
    /// </summary>
    [XmlEnum("Y6323")]
    Justizvollzugsanstalt_Tonna,

    /// <summary>
    /// <b>Verwaltungsgericht Weimar</b><br/>
    /// Code: Y6325<br/>
    /// </summary>
    [XmlEnum("Y6325")]
    Verwaltungsgericht_Weimar,

    /// <summary>
    /// <b>Th&#252;ringer Anwaltsgericht</b><br/>
    /// Code: Y6342<br/>
    /// </summary>
    [XmlEnum("Y6342")]
    Thueringer_Anwaltsgericht,

    /// <summary>
    /// <b>Th&#252;ringer Landesarbeitsgericht</b><br/>
    /// Code: Y6388<br/>
    /// </summary>
    [XmlEnum("Y6388")]
    Thueringer_Landesarbeitsgericht,

    /// <summary>
    /// <b>Arbeitsgericht Eisenach</b><br/>
    /// Code: Y6389<br/>
    /// </summary>
    [XmlEnum("Y6389")]
    Arbeitsgericht_Eisenach,

    /// <summary>
    /// <b>Arbeitsgericht Erfurt</b><br/>
    /// Code: Y6390<br/>
    /// </summary>
    [XmlEnum("Y6390")]
    Arbeitsgericht_Erfurt,

    /// <summary>
    /// <b>Arbeitsgericht Jena</b><br/>
    /// Code: Y6391<br/>
    /// </summary>
    [XmlEnum("Y6391")]
    Arbeitsgericht_Jena,

    /// <summary>
    /// <b>Arbeitsgericht Nordhausen</b><br/>
    /// Code: Y6392<br/>
    /// </summary>
    [XmlEnum("Y6392")]
    Arbeitsgericht_Nordhausen,

    /// <summary>
    /// <b>Arbeitsgericht Suhl</b><br/>
    /// Code: Y6393<br/>
    /// </summary>
    [XmlEnum("Y6393")]
    Arbeitsgericht_Suhl,

    /// <summary>
    /// <b>Th&#252;ringer Oberverwaltungsgericht</b><br/>
    /// Code: Y6397<br/>
    /// </summary>
    [XmlEnum("Y6397")]
    Thueringer_Oberverwaltungsgericht,

    /// <summary>
    /// <b>Verwaltungsgericht Meiningen</b><br/>
    /// Code: Y6398<br/>
    /// </summary>
    [XmlEnum("Y6398")]
    Verwaltungsgericht_Meiningen,

    /// <summary>
    /// <b>Th&#252;ringer Landessozialgericht</b><br/>
    /// Code: Y6402<br/>
    /// </summary>
    [XmlEnum("Y6402")]
    Thueringer_Landessozialgericht,

    /// <summary>
    /// <b>Sozialgericht Altenburg</b><br/>
    /// Code: Y6403<br/>
    /// </summary>
    [XmlEnum("Y6403")]
    Sozialgericht_Altenburg,

    /// <summary>
    /// <b>Sozialgericht Gotha</b><br/>
    /// Code: Y6404<br/>
    /// </summary>
    [XmlEnum("Y6404")]
    Sozialgericht_Gotha,

    /// <summary>
    /// <b>Sozialgericht Meiningen</b><br/>
    /// Code: Y6405<br/>
    /// </summary>
    [XmlEnum("Y6405")]
    Sozialgericht_Meiningen,

    /// <summary>
    /// <b>Sozialgericht Nordhausen</b><br/>
    /// Code: Y6406<br/>
    /// </summary>
    [XmlEnum("Y6406")]
    Sozialgericht_Nordhausen,

    /// <summary>
    /// <b>Jugendstrafanstalt Arnstadt</b><br/>
    /// Code: Y6508<br/>
    /// </summary>
    [XmlEnum("Y6508")]
    Jugendstrafanstalt_Arnstadt,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof -Ref. BZR 3 / SB 31-</b><br/>
    /// Code: Z1000<br/>
    /// </summary>
    [XmlEnum("Z1000")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Ref_BZR_3_SB_31,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof -Testanfragen-</b><br/>
    /// Code: Z1000S<br/>
    /// </summary>
    [XmlEnum("Z1000S")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Testanfragen,

    /// <summary>
    /// <b>Der Generalbundesanwalt b. BGH Dienststelle Bundeszentralreg. Arbeitsgruppe &quot;Wahlen&quot;</b><br/>
    /// Code: Z1007<br/>
    /// </summary>
    [XmlEnum("Z1007")]
    Der_Generalbundesanwalt_b_BGH_Dienststelle_Bundeszentralreg_Arbeitsgruppe_Wahlen,

    /// <summary>
    /// <b>aufgel&#246;st-Der Generalbundesanwalt beim Bundesgerichtshof -Bundeszentralregister-</b><br/>
    /// Code: Z1100<br/>
    /// </summary>
    [XmlEnum("Z1100")]
    aufgeloest_Der_Generalbundesanwalt_beim_Bundesgerichtshof_Bundeszentralregister,

    /// <summary>
    /// <b>Bundesamt f&#252;r Justiz, Internationaler Strafnachrichtenaustausch</b><br/>
    /// Code: Z1200<br/>
    /// </summary>
    [XmlEnum("Z1200")]
    Bundesamt_fuer_Justiz_Internationaler_Strafnachrichtenaustausch,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof Zentrale Beh&#246;rde / SorgeR&#220;bkAG</b><br/>
    /// Code: Z6108<br/>
    /// </summary>
    [XmlEnum("Z6108")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Zentrale_Behoerde_SorgeRUebkAG,

    /// <summary>
    /// <b>Der Generalbundesanwalt beim Bundesgerichtshof Ref. IV 3 AZ. IV 29 H 2/90</b><br/>
    /// Code: Z7350<br/>
    /// </summary>
    [XmlEnum("Z7350")]
    Der_Generalbundesanwalt_beim_Bundesgerichtshof_Ref_IV_3_AZ_IV_29_H_2_90,
}
