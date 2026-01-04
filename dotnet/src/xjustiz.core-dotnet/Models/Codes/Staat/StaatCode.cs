namespace xjustiz.core_dotnet.Models.Codes.Staat;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Staat Codes from <a href='https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat'>XRepository: Codeliste Staat aus der Staats- und Gebietssystematik des Statistischen Bundesamtes</a>.<br/>
/// <u><b>Country Codes:</b></u> from <a href="https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat">XRepository: State code list from the State and Territorial Classification of the Federal Statistical Office</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(StaatCodeJsonConverter))]
public enum StaatCode
{
    /// <summary>
    /// <b>Deutschland / Germany</b><br/>
    /// Staatenname-kurz: Deutschland<br/>
    /// Staatenname-voll: die Bundesrepublik Deutschland<br/>
    /// Schluessel-Staat: 000<br/>
    /// ISO-3: DEU<br/>
    /// ISO-2: DE<br/>
    /// </summary>
    [XmlEnum("000")]
    Deutschland,

    /// <summary>
    /// <b>Albanien / Albania</b><br/>
    /// Staatenname-kurz: Albanien<br/>
    /// Staatenname-voll: die Republik Albanien<br/>
    /// Schluessel-Staat: 121<br/>
    /// ISO-3: ALB<br/>
    /// ISO-2: AL<br/>
    /// </summary>
    [XmlEnum("121")]
    Albanien,

    /// <summary>
    /// <b>Bosnien und Herzegowina / Bosnia &amp; Herzegovina</b><br/>
    /// Staatenname-kurz: Bosnien und Herzegowina<br/>
    /// Staatenname-voll: Bosnien und Herzegowina<br/>
    /// Schluessel-Staat: 122<br/>
    /// ISO-3: BIH<br/>
    /// ISO-2: BA<br/>
    /// </summary>
    [XmlEnum("122")]
    Bosnien_und_Herzegowina,

    /// <summary>
    /// <b>Andorra</b><br/>
    /// Staatenname-kurz: Andorra<br/>
    /// Staatenname-voll: das F&#252;rstentum Andorra<br/>
    /// Schluessel-Staat: 123<br/>
    /// ISO-3: AND<br/>
    /// ISO-2: AD<br/>
    /// </summary>
    [XmlEnum("123")]
    Andorra,

    /// <summary>
    /// <b>Belgien / Belgium</b><br/>
    /// Staatenname-kurz: Belgien<br/>
    /// Staatenname-voll: das K&#246;nigreich Belgien<br/>
    /// Schluessel-Staat: 124<br/>
    /// ISO-3: BEL<br/>
    /// ISO-2: BE<br/>
    /// </summary>
    [XmlEnum("124")]
    Belgien,

    /// <summary>
    /// <b>Bulgarien / Bulgaria</b><br/>
    /// Staatenname-kurz: Bulgarien<br/>
    /// Staatenname-voll: die Republik Bulgarien<br/>
    /// Schluessel-Staat: 125<br/>
    /// ISO-3: BGR<br/>
    /// ISO-2: BG<br/>
    /// </summary>
    [XmlEnum("125")]
    Bulgarien,

    /// <summary>
    /// <b>D&#228;nemark / Denmark</b><br/>
    /// Staatenname-kurz: D&#228;nemark<br/>
    /// Staatenname-voll: das K&#246;nigreich D&#228;nemark<br/>
    /// Schluessel-Staat: 126<br/>
    /// ISO-3: DNK<br/>
    /// ISO-2: DK<br/>
    /// </summary>
    [XmlEnum("126")]
    Daenemark,

    /// <summary>
    /// <b>Estland / Estonia</b><br/>
    /// Staatenname-kurz: Estland<br/>
    /// Staatenname-voll: die Republik Estland<br/>
    /// Schluessel-Staat: 127<br/>
    /// ISO-3: EST<br/>
    /// ISO-2: EE<br/>
    /// </summary>
    [XmlEnum("127")]
    Estland,

    /// <summary>
    /// <b>Finnland / Finland</b><br/>
    /// Staatenname-kurz: Finnland<br/>
    /// Staatenname-voll: die Republik Finnland<br/>
    /// Schluessel-Staat: 128<br/>
    /// ISO-3: FIN<br/>
    /// ISO-2: FI<br/>
    /// </summary>
    [XmlEnum("128")]
    Finnland,

    /// <summary>
    /// <b>Frankreich / France</b><br/>
    /// Staatenname-kurz: Frankreich<br/>
    /// Staatenname-voll: die Franz&#246;sische Republik<br/>
    /// Schluessel-Staat: 129<br/>
    /// ISO-3: FRA<br/>
    /// ISO-2: FR<br/>
    /// </summary>
    [XmlEnum("129")]
    Frankreich,

    /// <summary>
    /// <b>Kroatien / Croatia</b><br/>
    /// Staatenname-kurz: Kroatien<br/>
    /// Staatenname-voll: die Republik Kroatien<br/>
    /// Schluessel-Staat: 130<br/>
    /// ISO-3: HRV<br/>
    /// ISO-2: HR<br/>
    /// </summary>
    [XmlEnum("130")]
    Kroatien,

    /// <summary>
    /// <b>Slowenien / Slovenia</b><br/>
    /// Staatenname-kurz: Slowenien<br/>
    /// Staatenname-voll: die Republik Slowenien<br/>
    /// Schluessel-Staat: 131<br/>
    /// ISO-3: SVN<br/>
    /// ISO-2: SI<br/>
    /// </summary>
    [XmlEnum("131")]
    Slowenien,

    /// <summary>
    /// <b>Griechenland / Greece</b><br/>
    /// Staatenname-kurz: Griechenland<br/>
    /// Staatenname-voll: die Hellenische Republik<br/>
    /// Schluessel-Staat: 134<br/>
    /// ISO-3: GRC<br/>
    /// ISO-2: GR<br/>
    /// </summary>
    [XmlEnum("134")]
    Griechenland,

    /// <summary>
    /// <b>Irland / Ireland</b><br/>
    /// Staatenname-kurz: Irland<br/>
    /// Staatenname-voll: Irland<br/>
    /// Schluessel-Staat: 135<br/>
    /// ISO-3: IRL<br/>
    /// ISO-2: IE<br/>
    /// </summary>
    [XmlEnum("135")]
    Irland,

    /// <summary>
    /// <b>Island / Iceland</b><br/>
    /// Staatenname-kurz: Island<br/>
    /// Staatenname-voll: Island<br/>
    /// Schluessel-Staat: 136<br/>
    /// ISO-3: ISL<br/>
    /// ISO-2: IS<br/>
    /// </summary>
    [XmlEnum("136")]
    Island,

    /// <summary>
    /// <b>Italien / Italy</b><br/>
    /// Staatenname-kurz: Italien<br/>
    /// Staatenname-voll: die Italienische Republik<br/>
    /// Schluessel-Staat: 137<br/>
    /// ISO-3: ITA<br/>
    /// ISO-2: IT<br/>
    /// </summary>
    [XmlEnum("137")]
    Italien,

    /// <summary>
    /// <b>Lettland / Latvia</b><br/>
    /// Staatenname-kurz: Lettland<br/>
    /// Staatenname-voll: die Republik Lettland<br/>
    /// Schluessel-Staat: 139<br/>
    /// ISO-3: LVA<br/>
    /// ISO-2: LV<br/>
    /// </summary>
    [XmlEnum("139")]
    Lettland,

    /// <summary>
    /// <b>Montenegro</b><br/>
    /// Staatenname-kurz: Montenegro<br/>
    /// Staatenname-voll: Montenegro<br/>
    /// Schluessel-Staat: 140<br/>
    /// ISO-3: MNE<br/>
    /// ISO-2: ME<br/>
    /// </summary>
    [XmlEnum("140")]
    Montenegro,

    /// <summary>
    /// <b>Liechtenstein</b><br/>
    /// Staatenname-kurz: Liechtenstein<br/>
    /// Staatenname-voll: das F&#252;rstentum Liechtenstein<br/>
    /// Schluessel-Staat: 141<br/>
    /// ISO-3: LIE<br/>
    /// ISO-2: LI<br/>
    /// </summary>
    [XmlEnum("141")]
    Liechtenstein,

    /// <summary>
    /// <b>Litauen / Lithuania</b><br/>
    /// Staatenname-kurz: Litauen<br/>
    /// Staatenname-voll: die Republik Litauen<br/>
    /// Schluessel-Staat: 142<br/>
    /// ISO-3: LTU<br/>
    /// ISO-2: LT<br/>
    /// </summary>
    [XmlEnum("142")]
    Litauen,

    /// <summary>
    /// <b>Luxemburg / Luxembourg</b><br/>
    /// Staatenname-kurz: Luxemburg<br/>
    /// Staatenname-voll: das Gro&#223;herzogtum Luxemburg<br/>
    /// Schluessel-Staat: 143<br/>
    /// ISO-3: LUX<br/>
    /// ISO-2: LU<br/>
    /// </summary>
    [XmlEnum("143")]
    Luxemburg,

    /// <summary>
    /// <b>Nordmazedonien / North Macedonia</b><br/>
    /// Staatenname-kurz: Nordmazedonien<br/>
    /// Staatenname-voll: die Republik Nordmazedonien<br/>
    /// Schluessel-Staat: 144<br/>
    /// ISO-3: MKD<br/>
    /// ISO-2: MK<br/>
    /// </summary>
    [XmlEnum("144")]
    Nordmazedonien,

    /// <summary>
    /// <b>Malta</b><br/>
    /// Staatenname-kurz: Malta<br/>
    /// Staatenname-voll: die Republik Malta<br/>
    /// Schluessel-Staat: 145<br/>
    /// ISO-3: MLT<br/>
    /// ISO-2: MT<br/>
    /// </summary>
    [XmlEnum("145")]
    Malta,

    /// <summary>
    /// <b>Republik Moldau / Moldova</b><br/>
    /// Staatenname-kurz: Republik Moldau<br/>
    /// Staatenname-voll: die Republik Moldau<br/>
    /// Schluessel-Staat: 146<br/>
    /// ISO-3: MDA<br/>
    /// ISO-2: MD<br/>
    /// </summary>
    [XmlEnum("146")]
    Republik_Moldau,

    /// <summary>
    /// <b>Monaco</b><br/>
    /// Staatenname-kurz: Monaco<br/>
    /// Staatenname-voll: das F&#252;rstentum Monaco<br/>
    /// Schluessel-Staat: 147<br/>
    /// ISO-3: MCO<br/>
    /// ISO-2: MC<br/>
    /// </summary>
    [XmlEnum("147")]
    Monaco,

    /// <summary>
    /// <b>K&#246;nigreich der Niederlande / Netherlands</b><br/>
    /// Staatenname-kurz: K&#246;nigreich der Niederlande<br/>
    /// Staatenname-voll: das K&#246;nigreich der Niederlande<br/>
    /// Schluessel-Staat: 148<br/>
    /// ISO-3: NLD<br/>
    /// ISO-2: NL<br/>
    /// </summary>
    [XmlEnum("148")]
    Koenigreich_der_Niederlande,

    /// <summary>
    /// <b>Norwegen / Norway</b><br/>
    /// Staatenname-kurz: Norwegen<br/>
    /// Staatenname-voll: das K&#246;nigreich Norwegen<br/>
    /// Schluessel-Staat: 149<br/>
    /// ISO-3: NOR<br/>
    /// ISO-2: NO<br/>
    /// </summary>
    [XmlEnum("149")]
    Norwegen,

    /// <summary>
    /// <b>Kosovo</b><br/>
    /// Staatenname-kurz: Kosovo<br/>
    /// Staatenname-voll: die Republik Kosovo<br/>
    /// Schluessel-Staat: 150<br/>
    /// ISO-3: XXK<br/>
    /// ISO-2: XK<br/>
    /// </summary>
    [XmlEnum("150")]
    Kosovo,

    /// <summary>
    /// <b>&#214;sterreich / Austria</b><br/>
    /// Staatenname-kurz: &#214;sterreich<br/>
    /// Staatenname-voll: die Republik &#214;sterreich<br/>
    /// Schluessel-Staat: 151<br/>
    /// ISO-3: AUT<br/>
    /// ISO-2: AT<br/>
    /// </summary>
    [XmlEnum("151")]
    Oesterreich,

    /// <summary>
    /// <b>Polen / Poland</b><br/>
    /// Staatenname-kurz: Polen<br/>
    /// Staatenname-voll: die Republik Polen<br/>
    /// Schluessel-Staat: 152<br/>
    /// ISO-3: POL<br/>
    /// ISO-2: PL<br/>
    /// </summary>
    [XmlEnum("152")]
    Polen,

    /// <summary>
    /// <b>Portugal</b><br/>
    /// Staatenname-kurz: Portugal<br/>
    /// Staatenname-voll: die Portugiesische Republik<br/>
    /// Schluessel-Staat: 153<br/>
    /// ISO-3: PRT<br/>
    /// ISO-2: PT<br/>
    /// </summary>
    [XmlEnum("153")]
    Portugal,

    /// <summary>
    /// <b>Rum&#228;nien / Romania</b><br/>
    /// Staatenname-kurz: Rum&#228;nien<br/>
    /// Staatenname-voll: Rum&#228;nien<br/>
    /// Schluessel-Staat: 154<br/>
    /// ISO-3: ROU<br/>
    /// ISO-2: RO<br/>
    /// </summary>
    [XmlEnum("154")]
    Rumaenien,

    /// <summary>
    /// <b>Slowakei / Slovakia</b><br/>
    /// Staatenname-kurz: Slowakei<br/>
    /// Staatenname-voll: die Slowakische Republik<br/>
    /// Schluessel-Staat: 155<br/>
    /// ISO-3: SVK<br/>
    /// ISO-2: SK<br/>
    /// </summary>
    [XmlEnum("155")]
    Slowakei,

    /// <summary>
    /// <b>San Marino</b><br/>
    /// Staatenname-kurz: San Marino<br/>
    /// Staatenname-voll: die Republik San Marino<br/>
    /// Schluessel-Staat: 156<br/>
    /// ISO-3: SMR<br/>
    /// ISO-2: SM<br/>
    /// </summary>
    [XmlEnum("156")]
    San_Marino,

    /// <summary>
    /// <b>Schweden / Sweden</b><br/>
    /// Staatenname-kurz: Schweden<br/>
    /// Staatenname-voll: das K&#246;nigreich Schweden<br/>
    /// Schluessel-Staat: 157<br/>
    /// ISO-3: SWE<br/>
    /// ISO-2: SE<br/>
    /// </summary>
    [XmlEnum("157")]
    Schweden,

    /// <summary>
    /// <b>Schweiz / Switzerland</b><br/>
    /// Staatenname-kurz: Schweiz<br/>
    /// Staatenname-voll: die Schweizerische Eidgenossenschaft<br/>
    /// Schluessel-Staat: 158<br/>
    /// ISO-3: CHE<br/>
    /// ISO-2: CH<br/>
    /// </summary>
    [XmlEnum("158")]
    Schweiz,

    /// <summary>
    /// <b>Russische F&#246;deration / Russia</b><br/>
    /// Staatenname-kurz: Russische F&#246;deration<br/>
    /// Staatenname-voll: die Russische F&#246;deration<br/>
    /// Schluessel-Staat: 160<br/>
    /// ISO-3: RUS<br/>
    /// ISO-2: RU<br/>
    /// </summary>
    [XmlEnum("160")]
    Russische_Foederation,

    /// <summary>
    /// <b>Spanien / Spain</b><br/>
    /// Staatenname-kurz: Spanien<br/>
    /// Staatenname-voll: das K&#246;nigreich Spanien<br/>
    /// Schluessel-Staat: 161<br/>
    /// ISO-3: ESP<br/>
    /// ISO-2: ES<br/>
    /// </summary>
    [XmlEnum("161")]
    Spanien,

    /// <summary>
    /// <b>T&#252;rkei / T&#252;rkiye</b><br/>
    /// Staatenname-kurz: T&#252;rkei<br/>
    /// Staatenname-voll: die Republik T&#252;rkei<br/>
    /// Schluessel-Staat: 163<br/>
    /// ISO-3: TUR<br/>
    /// ISO-2: TR<br/>
    /// </summary>
    [XmlEnum("163")]
    Tuerkei,

    /// <summary>
    /// <b>Tschechien / Czechia</b><br/>
    /// Staatenname-kurz: Tschechien<br/>
    /// Staatenname-voll: die Tschechische Republik<br/>
    /// Schluessel-Staat: 164<br/>
    /// ISO-3: CZE<br/>
    /// ISO-2: CZ<br/>
    /// </summary>
    [XmlEnum("164")]
    Tschechien,

    /// <summary>
    /// <b>Ungarn / Hungary</b><br/>
    /// Staatenname-kurz: Ungarn<br/>
    /// Staatenname-voll: Ungarn<br/>
    /// Schluessel-Staat: 165<br/>
    /// ISO-3: HUN<br/>
    /// ISO-2: HU<br/>
    /// </summary>
    [XmlEnum("165")]
    Ungarn,

    /// <summary>
    /// <b>Ukraine</b><br/>
    /// Staatenname-kurz: Ukraine<br/>
    /// Staatenname-voll: die Ukraine<br/>
    /// Schluessel-Staat: 166<br/>
    /// ISO-3: UKR<br/>
    /// ISO-2: UA<br/>
    /// </summary>
    [XmlEnum("166")]
    Ukraine,

    /// <summary>
    /// <b>Vatikanstadt / Vatican City</b><br/>
    /// Staatenname-kurz: Vatikanstadt<br/>
    /// Staatenname-voll: der Staat Vatikanstadt<br/>
    /// Schluessel-Staat: 167<br/>
    /// ISO-3: VAT<br/>
    /// ISO-2: VA<br/>
    /// </summary>
    [XmlEnum("167")]
    Vatikanstadt,

    /// <summary>
    /// <b>Vereinigtes K&#246;nigreich / United Kingdom</b><br/>
    /// Staatenname-kurz: Vereinigtes K&#246;nigreich<br/>
    /// Staatenname-voll: das Vereinigte K&#246;nigreich Gro&#223;britannien und Nordirland<br/>
    /// Schluessel-Staat: 168<br/>
    /// ISO-3: GBR<br/>
    /// ISO-2: GB<br/>
    /// </summary>
    [XmlEnum("168")]
    Vereinigtes_Koenigreich,

    /// <summary>
    /// <b>Belarus</b><br/>
    /// Staatenname-kurz: Belarus<br/>
    /// Staatenname-voll: die Republik Belarus<br/>
    /// Schluessel-Staat: 169<br/>
    /// ISO-3: BLR<br/>
    /// ISO-2: BY<br/>
    /// </summary>
    [XmlEnum("169")]
    Belarus,

    /// <summary>
    /// <b>Serbien / Serbia</b><br/>
    /// Staatenname-kurz: Serbien<br/>
    /// Staatenname-voll: die Republik Serbien<br/>
    /// Schluessel-Staat: 170<br/>
    /// ISO-3: SRB<br/>
    /// ISO-2: RS<br/>
    /// </summary>
    [XmlEnum("170")]
    Serbien,

    /// <summary>
    /// <b>Zypern / Cyprus</b><br/>
    /// Staatenname-kurz: Zypern<br/>
    /// Staatenname-voll: die Republik Zypern<br/>
    /// Schluessel-Staat: 181<br/>
    /// ISO-3: CYP<br/>
    /// ISO-2: CY<br/>
    /// </summary>
    [XmlEnum("181")]
    Zypern,

    /// <summary>
    /// <b>Algerien / Algeria</b><br/>
    /// Staatenname-kurz: Algerien<br/>
    /// Staatenname-voll: die Demokratische Volksrepublik Algerien<br/>
    /// Schluessel-Staat: 221<br/>
    /// ISO-3: DZA<br/>
    /// ISO-2: DZ<br/>
    /// </summary>
    [XmlEnum("221")]
    Algerien,

    /// <summary>
    /// <b>Angola</b><br/>
    /// Staatenname-kurz: Angola<br/>
    /// Staatenname-voll: die Republik Angola<br/>
    /// Schluessel-Staat: 223<br/>
    /// ISO-3: AGO<br/>
    /// ISO-2: AO<br/>
    /// </summary>
    [XmlEnum("223")]
    Angola,

    /// <summary>
    /// <b>Eritrea</b><br/>
    /// Staatenname-kurz: Eritrea<br/>
    /// Staatenname-voll: der Staat Eritrea<br/>
    /// Schluessel-Staat: 224<br/>
    /// ISO-3: ERI<br/>
    /// ISO-2: ER<br/>
    /// </summary>
    [XmlEnum("224")]
    Eritrea,

    /// <summary>
    /// <b>&#196;thiopien / Ethiopia</b><br/>
    /// Staatenname-kurz: &#196;thiopien<br/>
    /// Staatenname-voll: die Demokratische Bundesrepublik &#196;thiopien<br/>
    /// Schluessel-Staat: 225<br/>
    /// ISO-3: ETH<br/>
    /// ISO-2: ET<br/>
    /// </summary>
    [XmlEnum("225")]
    Aethiopien,

    /// <summary>
    /// <b>Lesotho</b><br/>
    /// Staatenname-kurz: Lesotho<br/>
    /// Staatenname-voll: das K&#246;nigreich Lesotho<br/>
    /// Schluessel-Staat: 226<br/>
    /// ISO-3: LSO<br/>
    /// ISO-2: LS<br/>
    /// </summary>
    [XmlEnum("226")]
    Lesotho,

    /// <summary>
    /// <b>Botsuana / Botswana</b><br/>
    /// Staatenname-kurz: Botsuana<br/>
    /// Staatenname-voll: die Republik Botsuana<br/>
    /// Schluessel-Staat: 227<br/>
    /// ISO-3: BWA<br/>
    /// ISO-2: BW<br/>
    /// </summary>
    [XmlEnum("227")]
    Botsuana,

    /// <summary>
    /// <b>Benin</b><br/>
    /// Staatenname-kurz: Benin<br/>
    /// Staatenname-voll: die Republik Benin<br/>
    /// Schluessel-Staat: 229<br/>
    /// ISO-3: BEN<br/>
    /// ISO-2: BJ<br/>
    /// </summary>
    [XmlEnum("229")]
    Benin,

    /// <summary>
    /// <b>Dschibuti / Djibouti</b><br/>
    /// Staatenname-kurz: Dschibuti<br/>
    /// Staatenname-voll: die Republik Dschibuti<br/>
    /// Schluessel-Staat: 230<br/>
    /// ISO-3: DJI<br/>
    /// ISO-2: DJ<br/>
    /// </summary>
    [XmlEnum("230")]
    Dschibuti,

    /// <summary>
    /// <b>C&#244;te d’Ivoire</b><br/>
    /// Staatenname-kurz: C&#244;te d’Ivoire<br/>
    /// Staatenname-voll: die Republik C&#244;te d’Ivoire<br/>
    /// Schluessel-Staat: 231<br/>
    /// ISO-3: CIV<br/>
    /// ISO-2: CI<br/>
    /// </summary>
    [XmlEnum("231")]
    C_te_d_Ivoire,

    /// <summary>
    /// <b>Nigeria</b><br/>
    /// Staatenname-kurz: Nigeria<br/>
    /// Staatenname-voll: die Bundesrepublik Nigeria<br/>
    /// Schluessel-Staat: 232<br/>
    /// ISO-3: NGA<br/>
    /// ISO-2: NG<br/>
    /// </summary>
    [XmlEnum("232")]
    Nigeria,

    /// <summary>
    /// <b>Simbabwe / Zimbabwe</b><br/>
    /// Staatenname-kurz: Simbabwe<br/>
    /// Staatenname-voll: die Republik Simbabwe<br/>
    /// Schluessel-Staat: 233<br/>
    /// ISO-3: ZWE<br/>
    /// ISO-2: ZW<br/>
    /// </summary>
    [XmlEnum("233")]
    Simbabwe,

    /// <summary>
    /// <b>Gabun / Gabon</b><br/>
    /// Staatenname-kurz: Gabun<br/>
    /// Staatenname-voll: die Gabunische Republik<br/>
    /// Schluessel-Staat: 236<br/>
    /// ISO-3: GAB<br/>
    /// ISO-2: GA<br/>
    /// </summary>
    [XmlEnum("236")]
    Gabun,

    /// <summary>
    /// <b>Gambia</b><br/>
    /// Staatenname-kurz: Gambia<br/>
    /// Staatenname-voll: die Republik Gambia<br/>
    /// Schluessel-Staat: 237<br/>
    /// ISO-3: GMB<br/>
    /// ISO-2: GM<br/>
    /// </summary>
    [XmlEnum("237")]
    Gambia,

    /// <summary>
    /// <b>Ghana</b><br/>
    /// Staatenname-kurz: Ghana<br/>
    /// Staatenname-voll: die Republik Ghana<br/>
    /// Schluessel-Staat: 238<br/>
    /// ISO-3: GHA<br/>
    /// ISO-2: GH<br/>
    /// </summary>
    [XmlEnum("238")]
    Ghana,

    /// <summary>
    /// <b>Mauretanien / Mauritania</b><br/>
    /// Staatenname-kurz: Mauretanien<br/>
    /// Staatenname-voll: die Islamische Republik Mauretanien<br/>
    /// Schluessel-Staat: 239<br/>
    /// ISO-3: MRT<br/>
    /// ISO-2: MR<br/>
    /// </summary>
    [XmlEnum("239")]
    Mauretanien,

    /// <summary>
    /// <b>Cabo Verde</b><br/>
    /// Staatenname-kurz: Cabo Verde<br/>
    /// Staatenname-voll: die Republik Cabo Verde<br/>
    /// Schluessel-Staat: 242<br/>
    /// ISO-3: CPV<br/>
    /// ISO-2: CV<br/>
    /// </summary>
    [XmlEnum("242")]
    Cabo_Verde,

    /// <summary>
    /// <b>Kenia / Kenya</b><br/>
    /// Staatenname-kurz: Kenia<br/>
    /// Staatenname-voll: die Republik Kenia<br/>
    /// Schluessel-Staat: 243<br/>
    /// ISO-3: KEN<br/>
    /// ISO-2: KE<br/>
    /// </summary>
    [XmlEnum("243")]
    Kenia,

    /// <summary>
    /// <b>Komoren / Comoros</b><br/>
    /// Staatenname-kurz: Komoren<br/>
    /// Staatenname-voll: die Union der Komoren<br/>
    /// Schluessel-Staat: 244<br/>
    /// ISO-3: COM<br/>
    /// ISO-2: KM<br/>
    /// </summary>
    [XmlEnum("244")]
    Komoren,

    /// <summary>
    /// <b>Kongo / Congo</b><br/>
    /// Staatenname-kurz: Kongo<br/>
    /// Staatenname-voll: die Republik Kongo<br/>
    /// Schluessel-Staat: 245<br/>
    /// ISO-3: COG<br/>
    /// ISO-2: CG<br/>
    /// </summary>
    [XmlEnum("245")]
    Kongo,

    /// <summary>
    /// <b>Demokratische Republik Kongo / Congo (DRC)</b><br/>
    /// Staatenname-kurz: Demokratische Republik Kongo<br/>
    /// Staatenname-voll: die Demokratische Republik Kongo<br/>
    /// Schluessel-Staat: 246<br/>
    /// ISO-3: COD<br/>
    /// ISO-2: CD<br/>
    /// </summary>
    [XmlEnum("246")]
    Demokratische_Republik_Kongo,

    /// <summary>
    /// <b>Liberia</b><br/>
    /// Staatenname-kurz: Liberia<br/>
    /// Staatenname-voll: die Republik Liberia<br/>
    /// Schluessel-Staat: 247<br/>
    /// ISO-3: LBR<br/>
    /// ISO-2: LR<br/>
    /// </summary>
    [XmlEnum("247")]
    Liberia,

    /// <summary>
    /// <b>Libyen / Libya</b><br/>
    /// Staatenname-kurz: Libyen<br/>
    /// Staatenname-voll: der Staat Libyen<br/>
    /// Schluessel-Staat: 248<br/>
    /// ISO-3: LBY<br/>
    /// ISO-2: LY<br/>
    /// </summary>
    [XmlEnum("248")]
    Libyen,

    /// <summary>
    /// <b>Madagaskar / Madagascar</b><br/>
    /// Staatenname-kurz: Madagaskar<br/>
    /// Staatenname-voll: die Republik Madagaskar<br/>
    /// Schluessel-Staat: 249<br/>
    /// ISO-3: MDG<br/>
    /// ISO-2: MG<br/>
    /// </summary>
    [XmlEnum("249")]
    Madagaskar,

    /// <summary>
    /// <b>Mali</b><br/>
    /// Staatenname-kurz: Mali<br/>
    /// Staatenname-voll: die Republik Mali<br/>
    /// Schluessel-Staat: 251<br/>
    /// ISO-3: MLI<br/>
    /// ISO-2: ML<br/>
    /// </summary>
    [XmlEnum("251")]
    Mali,

    /// <summary>
    /// <b>Marokko / Morocco</b><br/>
    /// Staatenname-kurz: Marokko<br/>
    /// Staatenname-voll: das K&#246;nigreich Marokko<br/>
    /// Schluessel-Staat: 252<br/>
    /// ISO-3: MAR<br/>
    /// ISO-2: MA<br/>
    /// </summary>
    [XmlEnum("252")]
    Marokko,

    /// <summary>
    /// <b>Mauritius</b><br/>
    /// Staatenname-kurz: Mauritius<br/>
    /// Staatenname-voll: die Republik Mauritius<br/>
    /// Schluessel-Staat: 253<br/>
    /// ISO-3: MUS<br/>
    /// ISO-2: MU<br/>
    /// </summary>
    [XmlEnum("253")]
    Mauritius,

    /// <summary>
    /// <b>Mosambik / Mozambique</b><br/>
    /// Staatenname-kurz: Mosambik<br/>
    /// Staatenname-voll: die Republik Mosambik<br/>
    /// Schluessel-Staat: 254<br/>
    /// ISO-3: MOZ<br/>
    /// ISO-2: MZ<br/>
    /// </summary>
    [XmlEnum("254")]
    Mosambik,

    /// <summary>
    /// <b>Niger</b><br/>
    /// Staatenname-kurz: Niger<br/>
    /// Staatenname-voll: die Republik Niger<br/>
    /// Schluessel-Staat: 255<br/>
    /// ISO-3: NER<br/>
    /// ISO-2: NE<br/>
    /// </summary>
    [XmlEnum("255")]
    Niger,

    /// <summary>
    /// <b>Malawi</b><br/>
    /// Staatenname-kurz: Malawi<br/>
    /// Staatenname-voll: die Republik Malawi<br/>
    /// Schluessel-Staat: 256<br/>
    /// ISO-3: MWI<br/>
    /// ISO-2: MW<br/>
    /// </summary>
    [XmlEnum("256")]
    Malawi,

    /// <summary>
    /// <b>Sambia / Zambia</b><br/>
    /// Staatenname-kurz: Sambia<br/>
    /// Staatenname-voll: die Republik Sambia<br/>
    /// Schluessel-Staat: 257<br/>
    /// ISO-3: ZMB<br/>
    /// ISO-2: ZM<br/>
    /// </summary>
    [XmlEnum("257")]
    Sambia,

    /// <summary>
    /// <b>Burkina Faso</b><br/>
    /// Staatenname-kurz: Burkina Faso<br/>
    /// Staatenname-voll: Burkina Faso<br/>
    /// Schluessel-Staat: 258<br/>
    /// ISO-3: BFA<br/>
    /// ISO-2: BF<br/>
    /// </summary>
    [XmlEnum("258")]
    Burkina_Faso,

    /// <summary>
    /// <b>Guinea-Bissau</b><br/>
    /// Staatenname-kurz: Guinea-Bissau<br/>
    /// Staatenname-voll: die Republik Guinea-Bissau<br/>
    /// Schluessel-Staat: 259<br/>
    /// ISO-3: GNB<br/>
    /// ISO-2: GW<br/>
    /// </summary>
    [XmlEnum("259")]
    Guinea_Bissau,

    /// <summary>
    /// <b>Guinea</b><br/>
    /// Staatenname-kurz: Guinea<br/>
    /// Staatenname-voll: die Republik Guinea<br/>
    /// Schluessel-Staat: 261<br/>
    /// ISO-3: GIN<br/>
    /// ISO-2: GN<br/>
    /// </summary>
    [XmlEnum("261")]
    Guinea,

    /// <summary>
    /// <b>Kamerun / Cameroon</b><br/>
    /// Staatenname-kurz: Kamerun<br/>
    /// Staatenname-voll: die Republik Kamerun<br/>
    /// Schluessel-Staat: 262<br/>
    /// ISO-3: CMR<br/>
    /// ISO-2: CM<br/>
    /// </summary>
    [XmlEnum("262")]
    Kamerun,

    /// <summary>
    /// <b>S&#252;dafrika / South Africa</b><br/>
    /// Staatenname-kurz: S&#252;dafrika<br/>
    /// Staatenname-voll: die Republik S&#252;dafrika<br/>
    /// Schluessel-Staat: 263<br/>
    /// ISO-3: ZAF<br/>
    /// ISO-2: ZA<br/>
    /// </summary>
    [XmlEnum("263")]
    Suedafrika,

    /// <summary>
    /// <b>Ruanda / Rwanda</b><br/>
    /// Staatenname-kurz: Ruanda<br/>
    /// Staatenname-voll: die Republik Ruanda<br/>
    /// Schluessel-Staat: 265<br/>
    /// ISO-3: RWA<br/>
    /// ISO-2: RW<br/>
    /// </summary>
    [XmlEnum("265")]
    Ruanda,

    /// <summary>
    /// <b>Namibia</b><br/>
    /// Staatenname-kurz: Namibia<br/>
    /// Staatenname-voll: die Republik Namibia<br/>
    /// Schluessel-Staat: 267<br/>
    /// ISO-3: NAM<br/>
    /// ISO-2: NA<br/>
    /// </summary>
    [XmlEnum("267")]
    Namibia,

    /// <summary>
    /// <b>S&#227;o Tom&#233; und Pr&#237;ncipe / S&#227;o Tom&#233; &amp; Pr&#237;ncipe</b><br/>
    /// Staatenname-kurz: S&#227;o Tom&#233; und Pr&#237;ncipe<br/>
    /// Staatenname-voll: die Demokratische Republik S&#227;o Tom&#233; und Pr&#237;ncipe<br/>
    /// Schluessel-Staat: 268<br/>
    /// ISO-3: STP<br/>
    /// ISO-2: ST<br/>
    /// </summary>
    [XmlEnum("268")]
    S_o_Tom_und_Pr_ncipe,

    /// <summary>
    /// <b>Senegal</b><br/>
    /// Staatenname-kurz: Senegal<br/>
    /// Staatenname-voll: die Republik Senegal<br/>
    /// Schluessel-Staat: 269<br/>
    /// ISO-3: SEN<br/>
    /// ISO-2: SN<br/>
    /// </summary>
    [XmlEnum("269")]
    Senegal,

    /// <summary>
    /// <b>Seychellen / Seychelles</b><br/>
    /// Staatenname-kurz: Seychellen<br/>
    /// Staatenname-voll: die Republik Seychellen<br/>
    /// Schluessel-Staat: 271<br/>
    /// ISO-3: SYC<br/>
    /// ISO-2: SC<br/>
    /// </summary>
    [XmlEnum("271")]
    Seychellen,

    /// <summary>
    /// <b>Sierra Leone</b><br/>
    /// Staatenname-kurz: Sierra Leone<br/>
    /// Staatenname-voll: die Republik Sierra Leone<br/>
    /// Schluessel-Staat: 272<br/>
    /// ISO-3: SLE<br/>
    /// ISO-2: SL<br/>
    /// </summary>
    [XmlEnum("272")]
    Sierra_Leone,

    /// <summary>
    /// <b>Somalia</b><br/>
    /// Staatenname-kurz: Somalia<br/>
    /// Staatenname-voll: die Bundesrepublik Somalia<br/>
    /// Schluessel-Staat: 273<br/>
    /// ISO-3: SOM<br/>
    /// ISO-2: SO<br/>
    /// </summary>
    [XmlEnum("273")]
    Somalia,

    /// <summary>
    /// <b>&#196;quatorialguinea / Equatorial Guinea</b><br/>
    /// Staatenname-kurz: &#196;quatorialguinea<br/>
    /// Staatenname-voll: die Republik &#196;quatorialguinea<br/>
    /// Schluessel-Staat: 274<br/>
    /// ISO-3: GNQ<br/>
    /// ISO-2: GQ<br/>
    /// </summary>
    [XmlEnum("274")]
    Aequatorialguinea,

    /// <summary>
    /// <b>Sudan</b><br/>
    /// Staatenname-kurz: Sudan<br/>
    /// Staatenname-voll: die Republik Sudan<br/>
    /// Schluessel-Staat: 277<br/>
    /// ISO-3: SDN<br/>
    /// ISO-2: SD<br/>
    /// </summary>
    [XmlEnum("277")]
    Sudan,

    /// <summary>
    /// <b>S&#252;dsudan / South Sudan</b><br/>
    /// Staatenname-kurz: S&#252;dsudan<br/>
    /// Staatenname-voll: die Republik S&#252;dsudan<br/>
    /// Schluessel-Staat: 278<br/>
    /// ISO-3: SSD<br/>
    /// ISO-2: SS<br/>
    /// </summary>
    [XmlEnum("278")]
    Suedsudan,

    /// <summary>
    /// <b>Eswatini</b><br/>
    /// Staatenname-kurz: Eswatini<br/>
    /// Staatenname-voll: das K&#246;nigreich Eswatini<br/>
    /// Schluessel-Staat: 281<br/>
    /// ISO-3: SWZ<br/>
    /// ISO-2: SZ<br/>
    /// </summary>
    [XmlEnum("281")]
    Eswatini,

    /// <summary>
    /// <b>Vereinigte Republik Tansania / Tanzania</b><br/>
    /// Staatenname-kurz: Vereinigte Republik Tansania<br/>
    /// Staatenname-voll: die Vereinigte Republik Tansania<br/>
    /// Schluessel-Staat: 282<br/>
    /// ISO-3: TZA<br/>
    /// ISO-2: TZ<br/>
    /// </summary>
    [XmlEnum("282")]
    Vereinigte_Republik_Tansania,

    /// <summary>
    /// <b>Togo</b><br/>
    /// Staatenname-kurz: Togo<br/>
    /// Staatenname-voll: die Republik Togo<br/>
    /// Schluessel-Staat: 283<br/>
    /// ISO-3: TGO<br/>
    /// ISO-2: TG<br/>
    /// </summary>
    [XmlEnum("283")]
    Togo,

    /// <summary>
    /// <b>Tschad / Chad</b><br/>
    /// Staatenname-kurz: Tschad<br/>
    /// Staatenname-voll: die Republik Tschad<br/>
    /// Schluessel-Staat: 284<br/>
    /// ISO-3: TCD<br/>
    /// ISO-2: TD<br/>
    /// </summary>
    [XmlEnum("284")]
    Tschad,

    /// <summary>
    /// <b>Tunesien / Tunisia</b><br/>
    /// Staatenname-kurz: Tunesien<br/>
    /// Staatenname-voll: die Tunesische Republik<br/>
    /// Schluessel-Staat: 285<br/>
    /// ISO-3: TUN<br/>
    /// ISO-2: TN<br/>
    /// </summary>
    [XmlEnum("285")]
    Tunesien,

    /// <summary>
    /// <b>Uganda</b><br/>
    /// Staatenname-kurz: Uganda<br/>
    /// Staatenname-voll: die Republik Uganda<br/>
    /// Schluessel-Staat: 286<br/>
    /// ISO-3: UGA<br/>
    /// ISO-2: UG<br/>
    /// </summary>
    [XmlEnum("286")]
    Uganda,

    /// <summary>
    /// <b>&#196;gypten / Egypt</b><br/>
    /// Staatenname-kurz: &#196;gypten<br/>
    /// Staatenname-voll: die Arabische Republik &#196;gypten<br/>
    /// Schluessel-Staat: 287<br/>
    /// ISO-3: EGY<br/>
    /// ISO-2: EG<br/>
    /// </summary>
    [XmlEnum("287")]
    Aegypten,

    /// <summary>
    /// <b>Zentralafrikanische Republik / Central African Republic</b><br/>
    /// Staatenname-kurz: Zentralafrikanische Republik<br/>
    /// Staatenname-voll: die Zentralafrikanische Republik<br/>
    /// Schluessel-Staat: 289<br/>
    /// ISO-3: CAF<br/>
    /// ISO-2: CF<br/>
    /// </summary>
    [XmlEnum("289")]
    Zentralafrikanische_Republik,

    /// <summary>
    /// <b>Burundi</b><br/>
    /// Staatenname-kurz: Burundi<br/>
    /// Staatenname-voll: die Republik Burundi<br/>
    /// Schluessel-Staat: 291<br/>
    /// ISO-3: BDI<br/>
    /// ISO-2: BI<br/>
    /// </summary>
    [XmlEnum("291")]
    Burundi,

    /// <summary>
    /// <b>Antigua und Barbuda / Antigua &amp; Barbuda</b><br/>
    /// Staatenname-kurz: Antigua und Barbuda<br/>
    /// Staatenname-voll: Antigua und Barbuda<br/>
    /// Schluessel-Staat: 320<br/>
    /// ISO-3: ATG<br/>
    /// ISO-2: AG<br/>
    /// </summary>
    [XmlEnum("320")]
    Antigua_und_Barbuda,

    /// <summary>
    /// <b>Barbados</b><br/>
    /// Staatenname-kurz: Barbados<br/>
    /// Staatenname-voll: Barbados<br/>
    /// Schluessel-Staat: 322<br/>
    /// ISO-3: BRB<br/>
    /// ISO-2: BB<br/>
    /// </summary>
    [XmlEnum("322")]
    Barbados,

    /// <summary>
    /// <b>Argentinien / Argentina</b><br/>
    /// Staatenname-kurz: Argentinien<br/>
    /// Staatenname-voll: die Argentinische Republik<br/>
    /// Schluessel-Staat: 323<br/>
    /// ISO-3: ARG<br/>
    /// ISO-2: AR<br/>
    /// </summary>
    [XmlEnum("323")]
    Argentinien,

    /// <summary>
    /// <b>Bahamas</b><br/>
    /// Staatenname-kurz: Bahamas<br/>
    /// Staatenname-voll: das Commonwealth der Bahamas<br/>
    /// Schluessel-Staat: 324<br/>
    /// ISO-3: BHS<br/>
    /// ISO-2: BS<br/>
    /// </summary>
    [XmlEnum("324")]
    Bahamas,

    /// <summary>
    /// <b>Plurinationaler Staat Bolivien / Bolivia</b><br/>
    /// Staatenname-kurz: Plurinationaler Staat Bolivien<br/>
    /// Staatenname-voll: der Plurinationale Staat Bolivien<br/>
    /// Schluessel-Staat: 326<br/>
    /// ISO-3: BOL<br/>
    /// ISO-2: BO<br/>
    /// </summary>
    [XmlEnum("326")]
    Plurinationaler_Staat_Bolivien,

    /// <summary>
    /// <b>Brasilien / Brazil</b><br/>
    /// Staatenname-kurz: Brasilien<br/>
    /// Staatenname-voll: die F&#246;derative Republik Brasilien<br/>
    /// Schluessel-Staat: 327<br/>
    /// ISO-3: BRA<br/>
    /// ISO-2: BR<br/>
    /// </summary>
    [XmlEnum("327")]
    Brasilien,

    /// <summary>
    /// <b>Guyana</b><br/>
    /// Staatenname-kurz: Guyana<br/>
    /// Staatenname-voll: die Kooperative Republik Guyana<br/>
    /// Schluessel-Staat: 328<br/>
    /// ISO-3: GUY<br/>
    /// ISO-2: GY<br/>
    /// </summary>
    [XmlEnum("328")]
    Guyana,

    /// <summary>
    /// <b>Belize</b><br/>
    /// Staatenname-kurz: Belize<br/>
    /// Staatenname-voll: Belize<br/>
    /// Schluessel-Staat: 330<br/>
    /// ISO-3: BLZ<br/>
    /// ISO-2: BZ<br/>
    /// </summary>
    [XmlEnum("330")]
    Belize,

    /// <summary>
    /// <b>Chile</b><br/>
    /// Staatenname-kurz: Chile<br/>
    /// Staatenname-voll: die Republik Chile<br/>
    /// Schluessel-Staat: 332<br/>
    /// ISO-3: CHL<br/>
    /// ISO-2: CL<br/>
    /// </summary>
    [XmlEnum("332")]
    Chile,

    /// <summary>
    /// <b>Dominica</b><br/>
    /// Staatenname-kurz: Dominica<br/>
    /// Staatenname-voll: das Commonwealth Dominica<br/>
    /// Schluessel-Staat: 333<br/>
    /// ISO-3: DMA<br/>
    /// ISO-2: DM<br/>
    /// </summary>
    [XmlEnum("333")]
    Dominica,

    /// <summary>
    /// <b>Costa Rica</b><br/>
    /// Staatenname-kurz: Costa Rica<br/>
    /// Staatenname-voll: die Republik Costa Rica<br/>
    /// Schluessel-Staat: 334<br/>
    /// ISO-3: CRI<br/>
    /// ISO-2: CR<br/>
    /// </summary>
    [XmlEnum("334")]
    Costa_Rica,

    /// <summary>
    /// <b>Dominikanische Republik / Dominican Republic</b><br/>
    /// Staatenname-kurz: Dominikanische Republik<br/>
    /// Staatenname-voll: die Dominikanische Republik<br/>
    /// Schluessel-Staat: 335<br/>
    /// ISO-3: DOM<br/>
    /// ISO-2: DO<br/>
    /// </summary>
    [XmlEnum("335")]
    Dominikanische_Republik,

    /// <summary>
    /// <b>Ecuador</b><br/>
    /// Staatenname-kurz: Ecuador<br/>
    /// Staatenname-voll: die Republik Ecuador<br/>
    /// Schluessel-Staat: 336<br/>
    /// ISO-3: ECU<br/>
    /// ISO-2: EC<br/>
    /// </summary>
    [XmlEnum("336")]
    Ecuador,

    /// <summary>
    /// <b>El Salvador</b><br/>
    /// Staatenname-kurz: El Salvador<br/>
    /// Staatenname-voll: die Republik El Salvador<br/>
    /// Schluessel-Staat: 337<br/>
    /// ISO-3: SLV<br/>
    /// ISO-2: SV<br/>
    /// </summary>
    [XmlEnum("337")]
    El_Salvador,

    /// <summary>
    /// <b>Grenada</b><br/>
    /// Staatenname-kurz: Grenada<br/>
    /// Staatenname-voll: Grenada<br/>
    /// Schluessel-Staat: 340<br/>
    /// ISO-3: GRD<br/>
    /// ISO-2: GD<br/>
    /// </summary>
    [XmlEnum("340")]
    Grenada,

    /// <summary>
    /// <b>Guatemala</b><br/>
    /// Staatenname-kurz: Guatemala<br/>
    /// Staatenname-voll: die Republik Guatemala<br/>
    /// Schluessel-Staat: 345<br/>
    /// ISO-3: GTM<br/>
    /// ISO-2: GT<br/>
    /// </summary>
    [XmlEnum("345")]
    Guatemala,

    /// <summary>
    /// <b>Haiti</b><br/>
    /// Staatenname-kurz: Haiti<br/>
    /// Staatenname-voll: die Republik Haiti<br/>
    /// Schluessel-Staat: 346<br/>
    /// ISO-3: HTI<br/>
    /// ISO-2: HT<br/>
    /// </summary>
    [XmlEnum("346")]
    Haiti,

    /// <summary>
    /// <b>Honduras</b><br/>
    /// Staatenname-kurz: Honduras<br/>
    /// Staatenname-voll: die Republik Honduras<br/>
    /// Schluessel-Staat: 347<br/>
    /// ISO-3: HND<br/>
    /// ISO-2: HN<br/>
    /// </summary>
    [XmlEnum("347")]
    Honduras,

    /// <summary>
    /// <b>Kanada / Canada</b><br/>
    /// Staatenname-kurz: Kanada<br/>
    /// Staatenname-voll: Kanada<br/>
    /// Schluessel-Staat: 348<br/>
    /// ISO-3: CAN<br/>
    /// ISO-2: CA<br/>
    /// </summary>
    [XmlEnum("348")]
    Kanada,

    /// <summary>
    /// <b>Kolumbien / Colombia</b><br/>
    /// Staatenname-kurz: Kolumbien<br/>
    /// Staatenname-voll: die Republik Kolumbien<br/>
    /// Schluessel-Staat: 349<br/>
    /// ISO-3: COL<br/>
    /// ISO-2: CO<br/>
    /// </summary>
    [XmlEnum("349")]
    Kolumbien,

    /// <summary>
    /// <b>Kuba / Cuba</b><br/>
    /// Staatenname-kurz: Kuba<br/>
    /// Staatenname-voll: die Republik Kuba<br/>
    /// Schluessel-Staat: 351<br/>
    /// ISO-3: CUB<br/>
    /// ISO-2: CU<br/>
    /// </summary>
    [XmlEnum("351")]
    Kuba,

    /// <summary>
    /// <b>Mexiko / Mexico</b><br/>
    /// Staatenname-kurz: Mexiko<br/>
    /// Staatenname-voll: die Vereinigten Mexikanischen Staaten<br/>
    /// Schluessel-Staat: 353<br/>
    /// ISO-3: MEX<br/>
    /// ISO-2: MX<br/>
    /// </summary>
    [XmlEnum("353")]
    Mexiko,

    /// <summary>
    /// <b>Nicaragua</b><br/>
    /// Staatenname-kurz: Nicaragua<br/>
    /// Staatenname-voll: die Republik Nicaragua<br/>
    /// Schluessel-Staat: 354<br/>
    /// ISO-3: NIC<br/>
    /// ISO-2: NI<br/>
    /// </summary>
    [XmlEnum("354")]
    Nicaragua,

    /// <summary>
    /// <b>Jamaika / Jamaica</b><br/>
    /// Staatenname-kurz: Jamaika<br/>
    /// Staatenname-voll: Jamaika<br/>
    /// Schluessel-Staat: 355<br/>
    /// ISO-3: JAM<br/>
    /// ISO-2: JM<br/>
    /// </summary>
    [XmlEnum("355")]
    Jamaika,

    /// <summary>
    /// <b>Panama</b><br/>
    /// Staatenname-kurz: Panama<br/>
    /// Staatenname-voll: die Republik Panama<br/>
    /// Schluessel-Staat: 357<br/>
    /// ISO-3: PAN<br/>
    /// ISO-2: PA<br/>
    /// </summary>
    [XmlEnum("357")]
    Panama,

    /// <summary>
    /// <b>Paraguay</b><br/>
    /// Staatenname-kurz: Paraguay<br/>
    /// Staatenname-voll: die Republik Paraguay<br/>
    /// Schluessel-Staat: 359<br/>
    /// ISO-3: PRY<br/>
    /// ISO-2: PY<br/>
    /// </summary>
    [XmlEnum("359")]
    Paraguay,

    /// <summary>
    /// <b>Peru</b><br/>
    /// Staatenname-kurz: Peru<br/>
    /// Staatenname-voll: die Republik Peru<br/>
    /// Schluessel-Staat: 361<br/>
    /// ISO-3: PER<br/>
    /// ISO-2: PE<br/>
    /// </summary>
    [XmlEnum("361")]
    Peru,

    /// <summary>
    /// <b>Suriname</b><br/>
    /// Staatenname-kurz: Suriname<br/>
    /// Staatenname-voll: die Republik Suriname<br/>
    /// Schluessel-Staat: 364<br/>
    /// ISO-3: SUR<br/>
    /// ISO-2: SR<br/>
    /// </summary>
    [XmlEnum("364")]
    Suriname,

    /// <summary>
    /// <b>Uruguay</b><br/>
    /// Staatenname-kurz: Uruguay<br/>
    /// Staatenname-voll: die Republik &#214;stlich des Uruguay<br/>
    /// Schluessel-Staat: 365<br/>
    /// ISO-3: URY<br/>
    /// ISO-2: UY<br/>
    /// </summary>
    [XmlEnum("365")]
    Uruguay,

    /// <summary>
    /// <b>St. Lucia</b><br/>
    /// Staatenname-kurz: St. Lucia<br/>
    /// Staatenname-voll: St. Lucia<br/>
    /// Schluessel-Staat: 366<br/>
    /// ISO-3: LCA<br/>
    /// ISO-2: LC<br/>
    /// </summary>
    [XmlEnum("366")]
    St_Lucia,

    /// <summary>
    /// <b>Bolivarische Republik Venezuela / Venezuela</b><br/>
    /// Staatenname-kurz: Bolivarische Republik Venezuela<br/>
    /// Staatenname-voll: die Bolivarische Republik Venezuela<br/>
    /// Schluessel-Staat: 367<br/>
    /// ISO-3: VEN<br/>
    /// ISO-2: VE<br/>
    /// </summary>
    [XmlEnum("367")]
    Bolivarische_Republik_Venezuela,

    /// <summary>
    /// <b>Vereinigte Staaten / United States</b><br/>
    /// Staatenname-kurz: Vereinigte Staaten<br/>
    /// Staatenname-voll: die Vereinigten Staaten von Amerika<br/>
    /// Schluessel-Staat: 368<br/>
    /// ISO-3: USA<br/>
    /// ISO-2: US<br/>
    /// </summary>
    [XmlEnum("368")]
    Vereinigte_Staaten,

    /// <summary>
    /// <b>St. Vincent und die Grenadinen / St. Vincent &amp; Grenadines</b><br/>
    /// Staatenname-kurz: St. Vincent und die Grenadinen<br/>
    /// Staatenname-voll: St. Vincent und die Grenadinen<br/>
    /// Schluessel-Staat: 369<br/>
    /// ISO-3: VCT<br/>
    /// ISO-2: VC<br/>
    /// </summary>
    [XmlEnum("369")]
    St_Vincent_und_die_Grenadinen,

    /// <summary>
    /// <b>St. Kitts und Nevis / St. Kitts &amp; Nevis</b><br/>
    /// Staatenname-kurz: St. Kitts und Nevis<br/>
    /// Staatenname-voll: die F&#246;deration St. Kitts und Nevis<br/>
    /// Schluessel-Staat: 370<br/>
    /// ISO-3: KNA<br/>
    /// ISO-2: KN<br/>
    /// </summary>
    [XmlEnum("370")]
    St_Kitts_und_Nevis,

    /// <summary>
    /// <b>Trinidad und Tobago / Trinidad &amp; Tobago</b><br/>
    /// Staatenname-kurz: Trinidad und Tobago<br/>
    /// Staatenname-voll: die Republik Trinidad und Tobago<br/>
    /// Schluessel-Staat: 371<br/>
    /// ISO-3: TTO<br/>
    /// ISO-2: TT<br/>
    /// </summary>
    [XmlEnum("371")]
    Trinidad_und_Tobago,

    /// <summary>
    /// <b>Jemen / Yemen</b><br/>
    /// Staatenname-kurz: Jemen<br/>
    /// Staatenname-voll: die Republik Jemen<br/>
    /// Schluessel-Staat: 421<br/>
    /// ISO-3: YEM<br/>
    /// ISO-2: YE<br/>
    /// </summary>
    [XmlEnum("421")]
    Jemen,

    /// <summary>
    /// <b>Armenien / Armenia</b><br/>
    /// Staatenname-kurz: Armenien<br/>
    /// Staatenname-voll: die Republik Armenien<br/>
    /// Schluessel-Staat: 422<br/>
    /// ISO-3: ARM<br/>
    /// ISO-2: AM<br/>
    /// </summary>
    [XmlEnum("422")]
    Armenien,

    /// <summary>
    /// <b>Afghanistan</b><br/>
    /// Staatenname-kurz: Afghanistan<br/>
    /// Staatenname-voll: die Islamische Republik Afghanistan<br/>
    /// Schluessel-Staat: 423<br/>
    /// ISO-3: AFG<br/>
    /// ISO-2: AF<br/>
    /// </summary>
    [XmlEnum("423")]
    Afghanistan,

    /// <summary>
    /// <b>Bahrain</b><br/>
    /// Staatenname-kurz: Bahrain<br/>
    /// Staatenname-voll: das K&#246;nigreich Bahrain<br/>
    /// Schluessel-Staat: 424<br/>
    /// ISO-3: BHR<br/>
    /// ISO-2: BH<br/>
    /// </summary>
    [XmlEnum("424")]
    Bahrain,

    /// <summary>
    /// <b>Aserbaidschan / Azerbaijan</b><br/>
    /// Staatenname-kurz: Aserbaidschan<br/>
    /// Staatenname-voll: die Republik Aserbaidschan<br/>
    /// Schluessel-Staat: 425<br/>
    /// ISO-3: AZE<br/>
    /// ISO-2: AZ<br/>
    /// </summary>
    [XmlEnum("425")]
    Aserbaidschan,

    /// <summary>
    /// <b>Bhutan</b><br/>
    /// Staatenname-kurz: Bhutan<br/>
    /// Staatenname-voll: das K&#246;nigreich Bhutan<br/>
    /// Schluessel-Staat: 426<br/>
    /// ISO-3: BTN<br/>
    /// ISO-2: BT<br/>
    /// </summary>
    [XmlEnum("426")]
    Bhutan,

    /// <summary>
    /// <b>Myanmar</b><br/>
    /// Staatenname-kurz: Myanmar<br/>
    /// Staatenname-voll: die Republik der Union Myanmar<br/>
    /// Schluessel-Staat: 427<br/>
    /// ISO-3: MMR<br/>
    /// ISO-2: MM<br/>
    /// </summary>
    [XmlEnum("427")]
    Myanmar,

    /// <summary>
    /// <b>Brunei Darussalam / Brunei</b><br/>
    /// Staatenname-kurz: Brunei Darussalam<br/>
    /// Staatenname-voll: Brunei Darussalam<br/>
    /// Schluessel-Staat: 429<br/>
    /// ISO-3: BRN<br/>
    /// ISO-2: BN<br/>
    /// </summary>
    [XmlEnum("429")]
    Brunei_Darussalam,

    /// <summary>
    /// <b>Georgien / Georgia</b><br/>
    /// Staatenname-kurz: Georgien<br/>
    /// Staatenname-voll: Georgien<br/>
    /// Schluessel-Staat: 430<br/>
    /// ISO-3: GEO<br/>
    /// ISO-2: GE<br/>
    /// </summary>
    [XmlEnum("430")]
    Georgien,

    /// <summary>
    /// <b>Sri Lanka</b><br/>
    /// Staatenname-kurz: Sri Lanka<br/>
    /// Staatenname-voll: die Demokratische Sozialistische Republik Sri Lanka<br/>
    /// Schluessel-Staat: 431<br/>
    /// ISO-3: LKA<br/>
    /// ISO-2: LK<br/>
    /// </summary>
    [XmlEnum("431")]
    Sri_Lanka,

    /// <summary>
    /// <b>Vietnam</b><br/>
    /// Staatenname-kurz: Vietnam<br/>
    /// Staatenname-voll: die Sozialistische Republik Vietnam<br/>
    /// Schluessel-Staat: 432<br/>
    /// ISO-3: VNM<br/>
    /// ISO-2: VN<br/>
    /// </summary>
    [XmlEnum("432")]
    Vietnam,

    /// <summary>
    /// <b>Demokratische Volksrepublik Korea / North Korea</b><br/>
    /// Staatenname-kurz: Demokratische Volksrepublik Korea<br/>
    /// Staatenname-voll: die Demokratische Volksrepublik Korea<br/>
    /// Schluessel-Staat: 434<br/>
    /// ISO-3: PRK<br/>
    /// ISO-2: KP<br/>
    /// </summary>
    [XmlEnum("434")]
    Demokratische_Volksrepublik_Korea,

    /// <summary>
    /// <b>Indien / India</b><br/>
    /// Staatenname-kurz: Indien<br/>
    /// Staatenname-voll: die Republik Indien<br/>
    /// Schluessel-Staat: 436<br/>
    /// ISO-3: IND<br/>
    /// ISO-2: IN<br/>
    /// </summary>
    [XmlEnum("436")]
    Indien,

    /// <summary>
    /// <b>Indonesien / Indonesia</b><br/>
    /// Staatenname-kurz: Indonesien<br/>
    /// Staatenname-voll: die Republik Indonesien<br/>
    /// Schluessel-Staat: 437<br/>
    /// ISO-3: IDN<br/>
    /// ISO-2: ID<br/>
    /// </summary>
    [XmlEnum("437")]
    Indonesien,

    /// <summary>
    /// <b>Irak / Iraq</b><br/>
    /// Staatenname-kurz: Irak<br/>
    /// Staatenname-voll: die Republik Irak<br/>
    /// Schluessel-Staat: 438<br/>
    /// ISO-3: IRQ<br/>
    /// ISO-2: IQ<br/>
    /// </summary>
    [XmlEnum("438")]
    Irak,

    /// <summary>
    /// <b>Islamische Republik Iran / Iran</b><br/>
    /// Staatenname-kurz: Islamische Republik Iran<br/>
    /// Staatenname-voll: die Islamische Republik Iran<br/>
    /// Schluessel-Staat: 439<br/>
    /// ISO-3: IRN<br/>
    /// ISO-2: IR<br/>
    /// </summary>
    [XmlEnum("439")]
    Islamische_Republik_Iran,

    /// <summary>
    /// <b>Israel</b><br/>
    /// Staatenname-kurz: Israel<br/>
    /// Staatenname-voll: der Staat Israel<br/>
    /// Schluessel-Staat: 441<br/>
    /// ISO-3: ISR<br/>
    /// ISO-2: IL<br/>
    /// </summary>
    [XmlEnum("441")]
    Israel,

    /// <summary>
    /// <b>Japan</b><br/>
    /// Staatenname-kurz: Japan<br/>
    /// Staatenname-voll: Japan<br/>
    /// Schluessel-Staat: 442<br/>
    /// ISO-3: JPN<br/>
    /// ISO-2: JP<br/>
    /// </summary>
    [XmlEnum("442")]
    Japan,

    /// <summary>
    /// <b>Kasachstan / Kazakhstan</b><br/>
    /// Staatenname-kurz: Kasachstan<br/>
    /// Staatenname-voll: die Republik Kasachstan<br/>
    /// Schluessel-Staat: 444<br/>
    /// ISO-3: KAZ<br/>
    /// ISO-2: KZ<br/>
    /// </summary>
    [XmlEnum("444")]
    Kasachstan,

    /// <summary>
    /// <b>Jordanien / Jordan</b><br/>
    /// Staatenname-kurz: Jordanien<br/>
    /// Staatenname-voll: das Haschemitische K&#246;nigreich Jordanien<br/>
    /// Schluessel-Staat: 445<br/>
    /// ISO-3: JOR<br/>
    /// ISO-2: JO<br/>
    /// </summary>
    [XmlEnum("445")]
    Jordanien,

    /// <summary>
    /// <b>Kambodscha / Cambodia</b><br/>
    /// Staatenname-kurz: Kambodscha<br/>
    /// Staatenname-voll: das K&#246;nigreich Kambodscha<br/>
    /// Schluessel-Staat: 446<br/>
    /// ISO-3: KHM<br/>
    /// ISO-2: KH<br/>
    /// </summary>
    [XmlEnum("446")]
    Kambodscha,

    /// <summary>
    /// <b>Katar / Qatar</b><br/>
    /// Staatenname-kurz: Katar<br/>
    /// Staatenname-voll: der Staat Katar<br/>
    /// Schluessel-Staat: 447<br/>
    /// ISO-3: QAT<br/>
    /// ISO-2: QA<br/>
    /// </summary>
    [XmlEnum("447")]
    Katar,

    /// <summary>
    /// <b>Kuwait</b><br/>
    /// Staatenname-kurz: Kuwait<br/>
    /// Staatenname-voll: der Staat Kuwait<br/>
    /// Schluessel-Staat: 448<br/>
    /// ISO-3: KWT<br/>
    /// ISO-2: KW<br/>
    /// </summary>
    [XmlEnum("448")]
    Kuwait,

    /// <summary>
    /// <b>Demokratische Volksrepublik Laos / Laos</b><br/>
    /// Staatenname-kurz: Demokratische Volksrepublik Laos<br/>
    /// Staatenname-voll: die Demokratische Volksrepublik Laos<br/>
    /// Schluessel-Staat: 449<br/>
    /// ISO-3: LAO<br/>
    /// ISO-2: LA<br/>
    /// </summary>
    [XmlEnum("449")]
    Demokratische_Volksrepublik_Laos,

    /// <summary>
    /// <b>Kirgisistan / Kyrgyzstan</b><br/>
    /// Staatenname-kurz: Kirgisistan<br/>
    /// Staatenname-voll: die Kirgisische Republik<br/>
    /// Schluessel-Staat: 450<br/>
    /// ISO-3: KGZ<br/>
    /// ISO-2: KG<br/>
    /// </summary>
    [XmlEnum("450")]
    Kirgisistan,

    /// <summary>
    /// <b>Libanon / Lebanon</b><br/>
    /// Staatenname-kurz: Libanon<br/>
    /// Staatenname-voll: die Libanesische Republik<br/>
    /// Schluessel-Staat: 451<br/>
    /// ISO-3: LBN<br/>
    /// ISO-2: LB<br/>
    /// </summary>
    [XmlEnum("451")]
    Libanon,

    /// <summary>
    /// <b>Malediven / Maldives</b><br/>
    /// Staatenname-kurz: Malediven<br/>
    /// Staatenname-voll: die Republik Malediven<br/>
    /// Schluessel-Staat: 454<br/>
    /// ISO-3: MDV<br/>
    /// ISO-2: MV<br/>
    /// </summary>
    [XmlEnum("454")]
    Malediven,

    /// <summary>
    /// <b>Oman</b><br/>
    /// Staatenname-kurz: Oman<br/>
    /// Staatenname-voll: das Sultanat Oman<br/>
    /// Schluessel-Staat: 456<br/>
    /// ISO-3: OMN<br/>
    /// ISO-2: OM<br/>
    /// </summary>
    [XmlEnum("456")]
    Oman,

    /// <summary>
    /// <b>Mongolei / Mongolia</b><br/>
    /// Staatenname-kurz: Mongolei<br/>
    /// Staatenname-voll: die Mongolei<br/>
    /// Schluessel-Staat: 457<br/>
    /// ISO-3: MNG<br/>
    /// ISO-2: MN<br/>
    /// </summary>
    [XmlEnum("457")]
    Mongolei,

    /// <summary>
    /// <b>Nepal</b><br/>
    /// Staatenname-kurz: Nepal<br/>
    /// Staatenname-voll: Nepal<br/>
    /// Schluessel-Staat: 458<br/>
    /// ISO-3: NPL<br/>
    /// ISO-2: NP<br/>
    /// </summary>
    [XmlEnum("458")]
    Nepal,

    /// <summary>
    /// <b>Bangladesch / Bangladesh</b><br/>
    /// Staatenname-kurz: Bangladesch<br/>
    /// Staatenname-voll: die Volksrepublik Bangladesch<br/>
    /// Schluessel-Staat: 460<br/>
    /// ISO-3: BGD<br/>
    /// ISO-2: BD<br/>
    /// </summary>
    [XmlEnum("460")]
    Bangladesch,

    /// <summary>
    /// <b>Pakistan</b><br/>
    /// Staatenname-kurz: Pakistan<br/>
    /// Staatenname-voll: die Islamische Republik Pakistan<br/>
    /// Schluessel-Staat: 461<br/>
    /// ISO-3: PAK<br/>
    /// ISO-2: PK<br/>
    /// </summary>
    [XmlEnum("461")]
    Pakistan,

    /// <summary>
    /// <b>Philippinen / Philippines</b><br/>
    /// Staatenname-kurz: Philippinen<br/>
    /// Staatenname-voll: die Republik der Philippinen<br/>
    /// Schluessel-Staat: 462<br/>
    /// ISO-3: PHL<br/>
    /// ISO-2: PH<br/>
    /// </summary>
    [XmlEnum("462")]
    Philippinen,

    /// <summary>
    /// <b>Republik Korea / Korea</b><br/>
    /// Staatenname-kurz: Republik Korea<br/>
    /// Staatenname-voll: die Republik Korea<br/>
    /// Schluessel-Staat: 467<br/>
    /// ISO-3: KOR<br/>
    /// ISO-2: KR<br/>
    /// </summary>
    [XmlEnum("467")]
    Republik_Korea,

    /// <summary>
    /// <b>Vereinigte Arabische Emirate / United Arab Emirates</b><br/>
    /// Staatenname-kurz: Vereinigte Arabische Emirate<br/>
    /// Staatenname-voll: die Vereinigten Arabischen Emirate (Abu Dhabi, Adschman, Dubai, Fudschaira, Ras al Chaima, Schardscha, Umm al Kaiwain)<br/>
    /// Schluessel-Staat: 469<br/>
    /// ISO-3: ARE<br/>
    /// ISO-2: AE<br/>
    /// </summary>
    [XmlEnum("469")]
    Vereinigte_Arabische_Emirate,

    /// <summary>
    /// <b>Tadschikistan / Tajikistan</b><br/>
    /// Staatenname-kurz: Tadschikistan<br/>
    /// Staatenname-voll: die Republik Tadschikistan<br/>
    /// Schluessel-Staat: 470<br/>
    /// ISO-3: TJK<br/>
    /// ISO-2: TJ<br/>
    /// </summary>
    [XmlEnum("470")]
    Tadschikistan,

    /// <summary>
    /// <b>Turkmenistan</b><br/>
    /// Staatenname-kurz: Turkmenistan<br/>
    /// Staatenname-voll: Turkmenistan<br/>
    /// Schluessel-Staat: 471<br/>
    /// ISO-3: TKM<br/>
    /// ISO-2: TM<br/>
    /// </summary>
    [XmlEnum("471")]
    Turkmenistan,

    /// <summary>
    /// <b>Saudi-Arabien / Saudi Arabia</b><br/>
    /// Staatenname-kurz: Saudi-Arabien<br/>
    /// Staatenname-voll: das K&#246;nigreich Saudi-Arabien<br/>
    /// Schluessel-Staat: 472<br/>
    /// ISO-3: SAU<br/>
    /// ISO-2: SA<br/>
    /// </summary>
    [XmlEnum("472")]
    Saudi_Arabien,

    /// <summary>
    /// <b>Singapur / Singapore</b><br/>
    /// Staatenname-kurz: Singapur<br/>
    /// Staatenname-voll: die Republik Singapur<br/>
    /// Schluessel-Staat: 474<br/>
    /// ISO-3: SGP<br/>
    /// ISO-2: SG<br/>
    /// </summary>
    [XmlEnum("474")]
    Singapur,

    /// <summary>
    /// <b>Arabische Republik Syrien / Syria</b><br/>
    /// Staatenname-kurz: Arabische Republik Syrien<br/>
    /// Staatenname-voll: die Arabische Republik Syrien<br/>
    /// Schluessel-Staat: 475<br/>
    /// ISO-3: SYR<br/>
    /// ISO-2: SY<br/>
    /// </summary>
    [XmlEnum("475")]
    Arabische_Republik_Syrien,

    /// <summary>
    /// <b>Thailand</b><br/>
    /// Staatenname-kurz: Thailand<br/>
    /// Staatenname-voll: das K&#246;nigreich Thailand<br/>
    /// Schluessel-Staat: 476<br/>
    /// ISO-3: THA<br/>
    /// ISO-2: TH<br/>
    /// </summary>
    [XmlEnum("476")]
    Thailand,

    /// <summary>
    /// <b>Usbekistan / Uzbekistan</b><br/>
    /// Staatenname-kurz: Usbekistan<br/>
    /// Staatenname-voll: die Republik Usbekistan<br/>
    /// Schluessel-Staat: 477<br/>
    /// ISO-3: UZB<br/>
    /// ISO-2: UZ<br/>
    /// </summary>
    [XmlEnum("477")]
    Usbekistan,

    /// <summary>
    /// <b>China</b><br/>
    /// Staatenname-kurz: China<br/>
    /// Staatenname-voll: die Volksrepublik China<br/>
    /// Schluessel-Staat: 479<br/>
    /// ISO-3: CHN<br/>
    /// ISO-2: CN<br/>
    /// </summary>
    [XmlEnum("479")]
    China,

    /// <summary>
    /// <b>Malaysia</b><br/>
    /// Staatenname-kurz: Malaysia<br/>
    /// Staatenname-voll: Malaysia<br/>
    /// Schluessel-Staat: 482<br/>
    /// ISO-3: MYS<br/>
    /// ISO-2: MY<br/>
    /// </summary>
    [XmlEnum("482")]
    Malaysia,

    /// <summary>
    /// <b>Timor-Leste</b><br/>
    /// Staatenname-kurz: Timor-Leste<br/>
    /// Staatenname-voll: die Demokratische Republik Timor-Leste<br/>
    /// Schluessel-Staat: 483<br/>
    /// ISO-3: TLS<br/>
    /// ISO-2: TL<br/>
    /// </summary>
    [XmlEnum("483")]
    Timor_Leste,

    /// <summary>
    /// <b>Australien / Australia</b><br/>
    /// Staatenname-kurz: Australien<br/>
    /// Staatenname-voll: Australien<br/>
    /// Schluessel-Staat: 523<br/>
    /// ISO-3: AUS<br/>
    /// ISO-2: AU<br/>
    /// </summary>
    [XmlEnum("523")]
    Australien,

    /// <summary>
    /// <b>Salomonen / Solomon Islands</b><br/>
    /// Staatenname-kurz: Salomonen<br/>
    /// Staatenname-voll: die Salomonen<br/>
    /// Schluessel-Staat: 524<br/>
    /// ISO-3: SLB<br/>
    /// ISO-2: SB<br/>
    /// </summary>
    [XmlEnum("524")]
    Salomonen,

    /// <summary>
    /// <b>Fidschi / Fiji</b><br/>
    /// Staatenname-kurz: Fidschi<br/>
    /// Staatenname-voll: die Republik Fidschi<br/>
    /// Schluessel-Staat: 526<br/>
    /// ISO-3: FJI<br/>
    /// ISO-2: FJ<br/>
    /// </summary>
    [XmlEnum("526")]
    Fidschi,

    /// <summary>
    /// <b>Cookinseln / Cook Islands</b><br/>
    /// Staatenname-kurz: Cookinseln<br/>
    /// Staatenname-voll: die Cookinseln<br/>
    /// Schluessel-Staat: 527<br/>
    /// ISO-3: COK<br/>
    /// ISO-2: CK<br/>
    /// </summary>
    [XmlEnum("527")]
    Cookinseln,

    /// <summary>
    /// <b>Kiribati</b><br/>
    /// Staatenname-kurz: Kiribati<br/>
    /// Staatenname-voll: die Republik Kiribati<br/>
    /// Schluessel-Staat: 530<br/>
    /// ISO-3: KIR<br/>
    /// ISO-2: KI<br/>
    /// </summary>
    [XmlEnum("530")]
    Kiribati,

    /// <summary>
    /// <b>Nauru</b><br/>
    /// Staatenname-kurz: Nauru<br/>
    /// Staatenname-voll: die Republik Nauru<br/>
    /// Schluessel-Staat: 531<br/>
    /// ISO-3: NRU<br/>
    /// ISO-2: NR<br/>
    /// </summary>
    [XmlEnum("531")]
    Nauru,

    /// <summary>
    /// <b>Vanuatu</b><br/>
    /// Staatenname-kurz: Vanuatu<br/>
    /// Staatenname-voll: die Republik Vanuatu<br/>
    /// Schluessel-Staat: 532<br/>
    /// ISO-3: VUT<br/>
    /// ISO-2: VU<br/>
    /// </summary>
    [XmlEnum("532")]
    Vanuatu,

    /// <summary>
    /// <b>Niue</b><br/>
    /// Staatenname-kurz: Niue<br/>
    /// Staatenname-voll: Niue<br/>
    /// Schluessel-Staat: 533<br/>
    /// ISO-3: NIU<br/>
    /// ISO-2: NU<br/>
    /// </summary>
    [XmlEnum("533")]
    Niue,

    /// <summary>
    /// <b>Neuseeland / New Zealand</b><br/>
    /// Staatenname-kurz: Neuseeland<br/>
    /// Staatenname-voll: Neuseeland<br/>
    /// Schluessel-Staat: 536<br/>
    /// ISO-3: NZL<br/>
    /// ISO-2: NZ<br/>
    /// </summary>
    [XmlEnum("536")]
    Neuseeland,

    /// <summary>
    /// <b>Palau</b><br/>
    /// Staatenname-kurz: Palau<br/>
    /// Staatenname-voll: die Republik Palau<br/>
    /// Schluessel-Staat: 537<br/>
    /// ISO-3: PLW<br/>
    /// ISO-2: PW<br/>
    /// </summary>
    [XmlEnum("537")]
    Palau,

    /// <summary>
    /// <b>Papua-Neuguinea / Papua New Guinea</b><br/>
    /// Staatenname-kurz: Papua-Neuguinea<br/>
    /// Staatenname-voll: der Unabh&#228;ngige Staat Papua-Neuguinea<br/>
    /// Schluessel-Staat: 538<br/>
    /// ISO-3: PNG<br/>
    /// ISO-2: PG<br/>
    /// </summary>
    [XmlEnum("538")]
    Papua_Neuguinea,

    /// <summary>
    /// <b>Tuvalu</b><br/>
    /// Staatenname-kurz: Tuvalu<br/>
    /// Staatenname-voll: Tuvalu<br/>
    /// Schluessel-Staat: 540<br/>
    /// ISO-3: TUV<br/>
    /// ISO-2: TV<br/>
    /// </summary>
    [XmlEnum("540")]
    Tuvalu,

    /// <summary>
    /// <b>Tonga</b><br/>
    /// Staatenname-kurz: Tonga<br/>
    /// Staatenname-voll: das K&#246;nigreich Tonga<br/>
    /// Schluessel-Staat: 541<br/>
    /// ISO-3: TON<br/>
    /// ISO-2: TO<br/>
    /// </summary>
    [XmlEnum("541")]
    Tonga,

    /// <summary>
    /// <b>Samoa</b><br/>
    /// Staatenname-kurz: Samoa<br/>
    /// Staatenname-voll: der Unabh&#228;ngige Staat Samoa<br/>
    /// Schluessel-Staat: 543<br/>
    /// ISO-3: WSM<br/>
    /// ISO-2: WS<br/>
    /// </summary>
    [XmlEnum("543")]
    Samoa,

    /// <summary>
    /// <b>Marshallinseln / Marshall Islands</b><br/>
    /// Staatenname-kurz: Marshallinseln<br/>
    /// Staatenname-voll: die Republik Marshallinseln<br/>
    /// Schluessel-Staat: 544<br/>
    /// ISO-3: MHL<br/>
    /// ISO-2: MH<br/>
    /// </summary>
    [XmlEnum("544")]
    Marshallinseln,

    /// <summary>
    /// <b>F&#246;derierte Staaten von Mikronesien / Micronesia</b><br/>
    /// Staatenname-kurz: F&#246;derierte Staaten von Mikronesien<br/>
    /// Staatenname-voll: die F&#246;derierten Staaten von Mikronesien<br/>
    /// Schluessel-Staat: 545<br/>
    /// ISO-3: FSM<br/>
    /// ISO-2: FM<br/>
    /// </summary>
    [XmlEnum("545")]
    Foederierte_Staaten_von_Mikronesien,
}
