namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// VersicherungsTyp Codes aus <see href="https://github.com/l-pagel/X.Justiz.Core/tree/main/docs">IHK Liste</see>.<br/>
/// <u><b>Insurance type codes:</b></u> from <see href="https://github.com/l-pagel/X.Justiz.Core/tree/main/docs">IHK list</see>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(VersicherungsTypCodeJsonConverter))]
public enum VersicherungsTypCode
{
    /// <summary>
    /// <b>Alle Sparten</b><br/>
    /// Code: 000<br/>
    /// </summary>
    [XmlEnum("000")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alle_Sparten,

    /// <summary>
    /// <b>Lebensversicherung</b><br/>
    /// Code: 01<br/>
    /// </summary>
    [XmlEnum("01")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebensversicherung,

    /// <summary>
    /// <b>Einzelversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.</b><br/>
    /// Code: 011<br/>
    /// </summary>
    [XmlEnum("011")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzelversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird,

    /// <summary>
    /// <b>Kapitalbildende Lebensversicherung (einschließlich vermögensbildender Lebensversicherung) mit überwiegendem Todesfallcharakter</b><br/>
    /// Code: 0111<br/>
    /// </summary>
    [XmlEnum("0111")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Todesfallcharakter,

    /// <summary>
    /// <b>Risikoversicherung</b><br/>
    /// Code: 0112<br/>
    /// </summary>
    [XmlEnum("0112")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Risikoversicherung,

    /// <summary>
    /// <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter</b><br/>
    /// Code: 0113<br/>
    /// </summary>
    [XmlEnum("0113")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter,

    /// <summary>
    /// <b>Berufsunfähigkeitsversicherung</b><br/>
    /// Code: 0114<br/>
    /// </summary>
    [XmlEnum("0114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Berufsunfaehigkeitsversicherung,

    /// <summary>
    /// <b>Pflegerentenversicherung</b><br/>
    /// Code: 0115<br/>
    /// </summary>
    [XmlEnum("0115")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pflegerentenversicherung,

    /// <summary>
    /// <b>übrige und nicht aufgegliederte Einzelversicherung (einschließlich der Heirats- und Geburtenversicherung, aber ohne sonstige Lebensversicherung</b><br/>
    /// Code: 0116<br/>
    /// </summary>
    [XmlEnum("0116")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uebrige_und_nicht_aufgegliederte_Einzelversicherung_einschliesslich_der_Heirats_und_Geburtenversicherung_aber_ohne_sonstige_Lebensversicherung,

    /// <summary>
    /// <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG</b><br/>
    /// Code: 0117<br/>
    /// </summary>
    [XmlEnum("0117")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG,

    /// <summary>
    /// <b>Kollektivversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.</b><br/>
    /// Code: 012<br/>
    /// </summary>
    [XmlEnum("012")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kollektivversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird,

    /// <summary>
    /// <b>Kapitalversicherung mit überwiegendem Todesfallcharakter (ohne Kennzahlen 01.2.2 und 01.2.3)</b><br/>
    /// Code: 0121<br/>
    /// </summary>
    [XmlEnum("0121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalversicherung_mit_ueberwiegendem_Todesfallcharakter,

    /// <summary>
    /// <b>Bausparrisikoversicherung</b><br/>
    /// Code: 0122<br/>
    /// </summary>
    [XmlEnum("0122")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bausparrisikoversicherung,

    /// <summary>
    /// <b>Restschuldversicherung</b><br/>
    /// Code: 0123<br/>
    /// </summary>
    [XmlEnum("0123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Restschuldversicherung,

    /// <summary>
    /// <b>übrige und nicht aufgegliederte Kollektivversicherung (einschließlich der Heirats- und Geburtenversicherung), aber ohne sonstige Lebensversicherung</b><br/>
    /// Code: 0124<br/>
    /// </summary>
    [XmlEnum("0124")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uebrige_und_nicht_aufgegliederte_Kollektivversicherung_aber_ohne_sonstige_Lebensversicherung,

    /// <summary>
    /// <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG</b><br/>
    /// Code: 0125<br/>
    /// </summary>
    [XmlEnum("0125")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG_0125,

    /// <summary>
    /// <b>Zusatzversicherung (einschließlich der, für Kollektivversicherungen)</b><br/>
    /// Code: 013<br/>
    /// </summary>
    [XmlEnum("013")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversicherung,

    /// <summary>
    /// <b>Unfall- Zusatzversicherung</b><br/>
    /// Code: 0131<br/>
    /// </summary>
    [XmlEnum("0131")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unfall_Zusatzversicherung,

    /// <summary>
    /// <b>Berufsunfähigkeits(Invaliditäts)-Zusatzversicherung</b><br/>
    /// Code: 0132<br/>
    /// </summary>
    [XmlEnum("0132")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Berufsunfaehigkeits_Zusatzversicherung,

    /// <summary>
    /// <b>Risiko- und Zeitrenten- Zusatzversicherung</b><br/>
    /// Code: 0133<br/>
    /// </summary>
    [XmlEnum("0133")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Risiko_und_Zeitrenten_Zusatzversicherung,

    /// <summary>
    /// <b>Pflegerenten- Zusatzversicherung</b><br/>
    /// Code: 0134<br/>
    /// </summary>
    [XmlEnum("0134")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pflegerenten_Zusatzversicherung,

    /// <summary>
    /// <b>Sonstige Zusatzversicherung</b><br/>
    /// Code: 0135<br/>
    /// </summary>
    [XmlEnum("0135")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Zusatzversicherung,

    /// <summary>
    /// <b>Sonstige Lebensversicherung</b><br/>
    /// Code: 014<br/>
    /// </summary>
    [XmlEnum("014")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Lebensversicherung,

    /// <summary>
    /// <b>Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird</b><br/>
    /// Code: 0141<br/>
    /// </summary>
    [XmlEnum("0141")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird,

    /// <summary>
    /// <b>Lebensversicherung ohne Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird</b><br/>
    /// Code: 0142<br/>
    /// </summary>
    [XmlEnum("0142")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebensversicherung_ohne_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird,

    /// <summary>
    /// <b>Tontinengeschäfte</b><br/>
    /// Code: 0143<br/>
    /// </summary>
    [XmlEnum("0143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tontinengeschaefte,

    /// <summary>
    /// <b>Kapitalisierungsgeschäfte</b><br/>
    /// Code: 0144<br/>
    /// </summary>
    [XmlEnum("0144")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kapitalisierungsgeschaefte,

    /// <summary>
    /// <b>Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird, nach dem AltZertG</b><br/>
    /// Code: 0145<br/>
    /// </summary>
    [XmlEnum("0145")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird_nach_dem_AltZertG,

    /// <summary>
    /// <b>Geschäfte der Verwaltung von Versorgungseinrichtungen</b><br/>
    /// Code: 015<br/>
    /// </summary>
    [XmlEnum("015")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Geschaefte_der_Verwaltung_von_Versorgungseinrichtungen,

    /// <summary>
    /// <b>Krankenversicherung</b><br/>
    /// Code: 02<br/>
    /// </summary>
    [XmlEnum("02")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Krankenversicherung,

    /// <summary>
    /// <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär)</b><br/>
    /// Code: 021<br/>
    /// </summary>
    [XmlEnum("021")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Krankheitskostenvollversicherung,

    /// <summary>
    /// <b>Einzel- Krankheitskostenvollversicherung</b><br/>
    /// Code: 0211<br/>
    /// </summary>
    [XmlEnum("0211")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Krankheitskostenvollversicherung_0211,

    /// <summary>
    /// <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär), nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0212<br/>
    /// </summary>
    [XmlEnum("0212")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadensversicherung</b><br/>
    /// Code: 0213<br/>
    /// </summary>
    [XmlEnum("0213")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Krankheitskostenvollversicherung_nach_Art_der_Schadensversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant)</b><br/>
    /// Code: 022<br/>
    /// </summary>
    [XmlEnum("022")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) substitutiv</b><br/>
    /// Code: 0221<br/>
    /// </summary>
    [XmlEnum("0221")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0222<br/>
    /// </summary>
    [XmlEnum("0222")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung</b><br/>
    /// Code: 0223<br/>
    /// </summary>
    [XmlEnum("0223")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär)</b><br/>
    /// Code: 023<br/>
    /// </summary>
    [XmlEnum("023")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_023,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) substitutiv</b><br/>
    /// Code: 0231<br/>
    /// </summary>
    [XmlEnum("0231")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv_0231,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0232<br/>
    /// </summary>
    [XmlEnum("0232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0232,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung</b><br/>
    /// Code: 0233<br/>
    /// </summary>
    [XmlEnum("0233")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0233,

    /// <summary>
    /// <b>Einzel- Krankentagegeldversicherung</b><br/>
    /// Code: 024<br/>
    /// </summary>
    [XmlEnum("024")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Krankentagegeldversicherung,

    /// <summary>
    /// <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) substitutiv</b><br/>
    /// Code: 0241<br/>
    /// </summary>
    [XmlEnum("0241")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Krankentagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0242<br/>
    /// </summary>
    [XmlEnum("0242")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nach Art der Schadenversicherung</b><br/>
    /// Code: 0243<br/>
    /// </summary>
    [XmlEnum("0243")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Krankentagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Lohnfortzahlungsversicherung</b><br/>
    /// Code: 0244<br/>
    /// </summary>
    [XmlEnum("0244")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lohnfortzahlungsversicherung,

    /// <summary>
    /// <b>Restschuldversicherung</b><br/>
    /// Code: 0245<br/>
    /// </summary>
    [XmlEnum("0245")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Restschuldversicherung_0245,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankenhaustagegeldversicherung</b><br/>
    /// Code: 025<br/>
    /// </summary>
    [XmlEnum("025")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankenhaustagegeldversicherung substitutiv</b><br/>
    /// Code: 0251<br/>
    /// </summary>
    [XmlEnum("0251")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0252<br/>
    /// </summary>
    [XmlEnum("0252")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Selbstständige Einzel- Krankenhaustagegeldversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 0253<br/>
    /// </summary>
    [XmlEnum("0253")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Sonstige selbstständige Einzel- Teilversicherung</b><br/>
    /// Code: 026<br/>
    /// </summary>
    [XmlEnum("026")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_selbststaendige_Einzel_Teilversicherung,

    /// <summary>
    /// <b>Selbstständige Zahnbehandlungsversicherung substitutiv</b><br/>
    /// Code: 0261<br/>
    /// </summary>
    [XmlEnum("0261")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Zahnbehandlungsversicherung_substitutiv,

    /// <summary>
    /// <b>Selbstständige Zahnbehandlungsversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0262<br/>
    /// </summary>
    [XmlEnum("0262")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Zahnbehandlungsversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Selbstständige Zahnbehandlungsversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 0263<br/>
    /// </summary>
    [XmlEnum("0263")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Zahnbehandlungsversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) substitutiv</b><br/>
    /// Code: 0264<br/>
    /// </summary>
    [XmlEnum("0264")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kurkostenversicherung_substitutiv,

    /// <summary>
    /// <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0265<br/>
    /// </summary>
    [XmlEnum("0265")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kurkostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nach Art der Schadenversicherung</b><br/>
    /// Code: 0266<br/>
    /// </summary>
    [XmlEnum("0266")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kurkostenversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Reisekrankenversicherung (gegen festes Entgelt)</b><br/>
    /// Code: 0267<br/>
    /// </summary>
    [XmlEnum("0267")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reisekrankenversicherung,

    /// <summary>
    /// <b>Sonstige Teilversicherung substitutiv</b><br/>
    /// Code: 0268<br/>
    /// </summary>
    [XmlEnum("0268")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Teilversicherung_substitutiv,

    /// <summary>
    /// <b>Sonstige Teilversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0269<br/>
    /// </summary>
    [XmlEnum("0269")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Teilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Sonstige Teilversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02610<br/>
    /// </summary>
    [XmlEnum("02610")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Teilversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Gruppen- Krankenversicherung (nach Einzel- und Sondertarifen)</b><br/>
    /// Code: 027<br/>
    /// </summary>
    [XmlEnum("027")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankenversicherung,

    /// <summary>
    /// <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) substitutiv</b><br/>
    /// Code: 0271<br/>
    /// </summary>
    [XmlEnum("0271")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankheitskostenvollversicherung_substitutiv,

    /// <summary>
    /// <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0272<br/>
    /// </summary>
    [XmlEnum("0272")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadenversicherung</b><br/>
    /// Code: 0273<br/>
    /// </summary>
    [XmlEnum("0273")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankheitskostenvollversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) substitutiv</b><br/>
    /// Code: 0274<br/>
    /// </summary>
    [XmlEnum("0274")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0275<br/>
    /// </summary>
    [XmlEnum("0275")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung</b><br/>
    /// Code: 0276<br/>
    /// </summary>
    [XmlEnum("0276")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) substitutiv</b><br/>
    /// Code: 0277<br/>
    /// </summary>
    [XmlEnum("0277")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv_0277,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0278<br/>
    /// </summary>
    [XmlEnum("0278")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0278,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung</b><br/>
    /// Code: 0279<br/>
    /// </summary>
    [XmlEnum("0279")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0279,

    /// <summary>
    /// <b>Gruppen- Krankentagegeldversicherung substitutiv</b><br/>
    /// Code: 02710<br/>
    /// </summary>
    [XmlEnum("02710")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankentagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Gruppen- Krankentagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 02711<br/>
    /// </summary>
    [XmlEnum("02711")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Gruppen- Krankentagegeldversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02712<br/>
    /// </summary>
    [XmlEnum("02712")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Krankentagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung substitutiv</b><br/>
    /// Code: 02713<br/>
    /// </summary>
    [XmlEnum("02713")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 02714<br/>
    /// </summary>
    [XmlEnum("02714")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02715<br/>
    /// </summary>
    [XmlEnum("02715")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Sonstige selbstständige Gruppenteilversicherung substitutiv</b><br/>
    /// Code: 02716<br/>
    /// </summary>
    [XmlEnum("02716")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_selbststaendige_Gruppenteilversicherung_substitutiv,

    /// <summary>
    /// <b>Sonstige selbstständige Gruppenteilversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 02717<br/>
    /// </summary>
    [XmlEnum("02717")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_selbststaendige_Gruppenteilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Sonstige selbstständige Gruppenteilversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02718<br/>
    /// </summary>
    [XmlEnum("02718")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_selbststaendige_Gruppenteilversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Gruppen- Pflegepflichtversicherung</b><br/>
    /// Code: 02719<br/>
    /// </summary>
    [XmlEnum("02719")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Pflegepflichtversicherung,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegekostenversicherung substitutiv</b><br/>
    /// Code: 02720<br/>
    /// </summary>
    [XmlEnum("02720")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegekostenversicherung_substitutiv,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 02721<br/>
    /// </summary>
    [XmlEnum("02721")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegekostenversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02722<br/>
    /// </summary>
    [XmlEnum("02722")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegekostenversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegetagegeldversicherung substitutiv</b><br/>
    /// Code: 02723<br/>
    /// </summary>
    [XmlEnum("02723")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegetagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 02724<br/>
    /// </summary>
    [XmlEnum("02724")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Freiwillige Gruppen- Pflegetagegeldversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 02725<br/>
    /// </summary>
    [XmlEnum("02725")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Gruppen_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Pflegekrankenversicherung</b><br/>
    /// Code: 028<br/>
    /// </summary>
    [XmlEnum("028")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pflegekrankenversicherung,

    /// <summary>
    /// <b>Pflegepflichtversicherung</b><br/>
    /// Code: 0281<br/>
    /// </summary>
    [XmlEnum("0281")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pflegepflichtversicherung,

    /// <summary>
    /// <b>Freiwillige Pflegekostenversicherung substitutiv</b><br/>
    /// Code: 0282<br/>
    /// </summary>
    [XmlEnum("0282")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegekostenversicherung_substitutiv,

    /// <summary>
    /// <b>Freiwillige Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0283<br/>
    /// </summary>
    [XmlEnum("0283")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Freiwillige Pflegekostenversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 0284<br/>
    /// </summary>
    [XmlEnum("0284")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegekostenversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Freiwillige Pflegetagegeldversicherung substitutiv</b><br/>
    /// Code: 0285<br/>
    /// </summary>
    [XmlEnum("0285")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegetagegeldversicherung_substitutiv,

    /// <summary>
    /// <b>Freiwillige Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b><br/>
    /// Code: 0286<br/>
    /// </summary>
    [XmlEnum("0286")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung,

    /// <summary>
    /// <b>Freiwillige Pflegetagegeldversicherung nach Art der Schadenversicherung</b><br/>
    /// Code: 0287<br/>
    /// </summary>
    [XmlEnum("0287")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freiwillige_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Krankenversicherung (einschließlich der Beihilfeablöseversicherung)</b><br/>
    /// Code: 029<br/>
    /// </summary>
    [XmlEnum("029")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Krankenversicherung,

    /// <summary>
    /// <b>Allgemeine Unfallversicherung</b><br/>
    /// Code: 03<br/>
    /// </summary>
    [XmlEnum("03")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allgemeine_Unfallversicherung,

    /// <summary>
    /// <b>Einzelunfallversicherung ohne Beitragsrückgewähr</b><br/>
    /// Code: 031<br/>
    /// </summary>
    [XmlEnum("031")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzelunfallversicherung_ohne_Beitragsrueckgewaehr,

    /// <summary>
    /// <b>Unfallvollversicherung (ohne Kennzahlen 03.1.02 und 03.1.03)</b><br/>
    /// Code: 03101<br/>
    /// </summary>
    [XmlEnum("03101")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unfallvollversicherung,

    /// <summary>
    /// <b>Volks- Unfallvollversicherung</b><br/>
    /// Code: 03102<br/>
    /// </summary>
    [XmlEnum("03102")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Volks_Unfallvollversicherung,

    /// <summary>
    /// <b>Unfallvollversicherung aus der FUSt- Versicherung</b><br/>
    /// Code: 03103<br/>
    /// </summary>
    [XmlEnum("03103")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unfallvollversicherung_aus_der_FUSt_Versicherung,

    /// <summary>
    /// <b>Versicherung gegen außerberufliche Unfälle</b><br/>
    /// Code: 03104<br/>
    /// </summary>
    [XmlEnum("03104")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_gegen_ausserberufliche_Unfaelle,

    /// <summary>
    /// <b>Reiseunfallversicherung</b><br/>
    /// Code: 03105<br/>
    /// </summary>
    [XmlEnum("03105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reiseunfallversicherung,

    /// <summary>
    /// <b>Sofortunfallversicherung</b><br/>
    /// Code: 03106<br/>
    /// </summary>
    [XmlEnum("03106")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sofortunfallversicherung,

    /// <summary>
    /// <b>Luftfahrtunfallversicherung</b><br/>
    /// Code: 03107<br/>
    /// </summary>
    [XmlEnum("03107")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Luftfahrtunfallversicherung,

    /// <summary>
    /// <b>Lebenslängliche Verkehrsmittelunfallversicherung</b><br/>
    /// Code: 03108<br/>
    /// </summary>
    [XmlEnum("03108")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebenslaengliche_Verkehrsmittelunfallversicherung,

    /// <summary>
    /// <b>Sportbootinsassenunfallversicherung</b><br/>
    /// Code: 03109<br/>
    /// </summary>
    [XmlEnum("03109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sportbootinsassenunfallversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Einzelunfallversicherung</b><br/>
    /// Code: 03199<br/>
    /// </summary>
    [XmlEnum("03199")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Einzelunfallversicherung,

    /// <summary>
    /// <b>Gruppen- Unfallversicherung ohne Beitragsrückgewähr</b><br/>
    /// Code: 033<br/>
    /// </summary>
    [XmlEnum("033")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Unfallversicherung_ohne_Beitragsrueckgewaehr,

    /// <summary>
    /// <b>Gruppen- Unfallvollversicherung</b><br/>
    /// Code: 0331<br/>
    /// </summary>
    [XmlEnum("0331")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Unfallvollversicherung,

    /// <summary>
    /// <b>Gruppen- Unfallteilversicherung</b><br/>
    /// Code: 0333<br/>
    /// </summary>
    [XmlEnum("0333")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Unfallteilversicherung,

    /// <summary>
    /// <b>Probandenversicherung</b><br/>
    /// Code: 034<br/>
    /// </summary>
    [XmlEnum("034")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Probandenversicherung,

    /// <summary>
    /// <b>Kraftfahrtunfallversicherung (einschließlich der namentlichen Kraftfahrtunfallversicherung)</b><br/>
    /// Code: 035<br/>
    /// </summary>
    [XmlEnum("035")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrtunfallversicherung,

    /// <summary>
    /// <b>Unfallversicherung mit Beitragsrückgewähr</b><br/>
    /// Code: 038<br/>
    /// </summary>
    [XmlEnum("038")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unfallversicherung_mit_Beitragsrueckgewaehr,

    /// <summary>
    /// <b>Einzel- Unfallversicherung</b><br/>
    /// Code: 0381<br/>
    /// </summary>
    [XmlEnum("0381")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einzel_Unfallversicherung,

    /// <summary>
    /// <b>Gruppen- Unfallversicherung</b><br/>
    /// Code: 0382<br/>
    /// </summary>
    [XmlEnum("0382")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gruppen_Unfallversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte allgemeine Unfallversicherung</b><br/>
    /// Code: 039<br/>
    /// </summary>
    [XmlEnum("039")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_allgemeine_Unfallversicherung,

    /// <summary>
    /// <b>Haftpflichtversicherung</b><br/>
    /// Code: 04<br/>
    /// </summary>
    [XmlEnum("04")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haftpflichtversicherung,

    /// <summary>
    /// <b>Privathaftpflichtversicherung (einschließlich Sportboot- und Hundehalterhaftpflichtversicherung)</b><br/>
    /// Code: 041<br/>
    /// </summary>
    [XmlEnum("041")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Privathaftpflichtversicherung,

    /// <summary>
    /// <b>Betriebs- und Berufshaftpflichtversicherung</b><br/>
    /// Code: 042<br/>
    /// </summary>
    [XmlEnum("042")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Betriebs_und_Berufshaftpflichtversicherung,

    /// <summary>
    /// <b>Industrie- und Handelsbetriebe</b><br/>
    /// Code: 0421<br/>
    /// </summary>
    [XmlEnum("0421")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Industrie_und_Handelsbetriebe,

    /// <summary>
    /// <b>Baugewerbe (einschließlich Architekten und Bauingeneure)</b><br/>
    /// Code: 0422<br/>
    /// </summary>
    [XmlEnum("0422")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baugewerbe,

    /// <summary>
    /// <b>Sonstige Betriebs- und Berufshaftpflichtversicherung</b><br/>
    /// Code: 0423<br/>
    /// </summary>
    [XmlEnum("0423")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Betriebs_und_Berufshaftpflichtversicherung,

    /// <summary>
    /// <b>Umwelt- Haftpflichtversicherung</b><br/>
    /// Code: 043<br/>
    /// </summary>
    [XmlEnum("043")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Umwelt_Haftpflichtversicherung,

    /// <summary>
    /// <b>Gewässerschaden- Haftpflichtversicherung</b><br/>
    /// Code: 0431<br/>
    /// </summary>
    [XmlEnum("0431")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gewaesserschaden_Haftpflichtversicherung,

    /// <summary>
    /// <b>Umwelthaftpflicht- Modell</b><br/>
    /// Code: 0432<br/>
    /// </summary>
    [XmlEnum("0432")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Umwelthaftpflicht_Modell,

    /// <summary>
    /// <b>Vermögensschaden- Haftpflichtversicherung</b><br/>
    /// Code: 044<br/>
    /// </summary>
    [XmlEnum("044")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vermoegensschaden_Haftpflichtversicherung,

    /// <summary>
    /// <b>Verkehrshaftungsversicherung (einschließlich der Speditions- und Rollfuhrversicherung)</b><br/>
    /// Code: 045<br/>
    /// </summary>
    [XmlEnum("045")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verkehrshaftungsversicherung,

    /// <summary>
    /// <b>Strahlen- und Atomanlagen- Haftpflichtversicherung</b><br/>
    /// Code: 046<br/>
    /// </summary>
    [XmlEnum("046")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Strahlen_und_Atomanlagen_Haftpflichtversicherung,

    /// <summary>
    /// <b>Strahlen- Haftpflichtversicherung</b><br/>
    /// Code: 0461<br/>
    /// </summary>
    [XmlEnum("0461")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Strahlen_Haftpflichtversicherung,

    /// <summary>
    /// <b>Atomanlagen- Haftpflichtversicherung</b><br/>
    /// Code: 0462<br/>
    /// </summary>
    [XmlEnum("0462")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Atomanlagen_Haftpflichtversicherung,

    /// <summary>
    /// <b>Feuerhaftungsversicherung</b><br/>
    /// Code: 047<br/>
    /// </summary>
    [XmlEnum("047")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuerhaftungsversicherung,

    /// <summary>
    /// <b>See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko) sowie Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge</b><br/>
    /// Code: 048<br/>
    /// </summary>
    [XmlEnum("048")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung_sowie_Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge,

    /// <summary>
    /// <b>Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge mit eigenem Antrieb</b><br/>
    /// Code: 0481<br/>
    /// </summary>
    [XmlEnum("0481")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_mit_eigenem_Antrieb,

    /// <summary>
    /// <b>Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge ohne eigenen Antrieb</b><br/>
    /// Code: 0482<br/>
    /// </summary>
    [XmlEnum("0482")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_ohne_eigenen_Antrieb,

    /// <summary>
    /// <b>See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko)</b><br/>
    /// Code: 0483<br/>
    /// </summary>
    [XmlEnum("0483")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Haftpflichtversicherung</b><br/>
    /// Code: 049<br/>
    /// </summary>
    [XmlEnum("049")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Haftpflichtversicherung,

    /// <summary>
    /// <b>Haus- und Grundbesitzerhaftpflichtversicherung</b><br/>
    /// Code: 04901<br/>
    /// </summary>
    [XmlEnum("04901")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haus_und_Grundbesitzerhaftpflichtversicherung,

    /// <summary>
    /// <b>Kraftfahrzeug- Parkplatzversicherung</b><br/>
    /// Code: 04902<br/>
    /// </summary>
    [XmlEnum("04902")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrzeug_Parkplatzversicherung,

    /// <summary>
    /// <b>Kühlgüterhaftpflichtversicherung</b><br/>
    /// Code: 04903<br/>
    /// </summary>
    [XmlEnum("04903")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kuehlgueterhaftpflichtversicherung,

    /// <summary>
    /// <b>Sonstige Haftpflichtversicherung</b><br/>
    /// Code: 04999<br/>
    /// </summary>
    [XmlEnum("04999")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Haftpflichtversicherung,

    /// <summary>
    /// <b>Kraftfahrtversicherung</b><br/>
    /// Code: 05<br/>
    /// </summary>
    [XmlEnum("05")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrtversicherung,

    /// <summary>
    /// <b>Kraftfahrzeug- Haftpflichtversicherung</b><br/>
    /// Code: 051<br/>
    /// </summary>
    [XmlEnum("051")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrzeug_Haftpflichtversicherung,

    /// <summary>
    /// <b>Fahrzeugvollversicherung</b><br/>
    /// Code: 052<br/>
    /// </summary>
    [XmlEnum("052")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrzeugvollversicherung,

    /// <summary>
    /// <b>Fahrzeugteilversicherung</b><br/>
    /// Code: 053<br/>
    /// </summary>
    [XmlEnum("053")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrzeugteilversicherung,

    /// <summary>
    /// <b>Sonstige Kraftfahrtversicherung (05.2 und 05.3 insgesamt)</b><br/>
    /// Code: 055<br/>
    /// </summary>
    [XmlEnum("055")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Kraftfahrtversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Kraftfahrtversicherung</b><br/>
    /// Code: 059<br/>
    /// </summary>
    [XmlEnum("059")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Kraftfahrtversicherung,

    /// <summary>
    /// <b>Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)</b><br/>
    /// Code: 06<br/>
    /// </summary>
    [XmlEnum("06")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Luftfahrtversicherung,

    /// <summary>
    /// <b>Luftfahrzeug- Kaskoversicherung</b><br/>
    /// Code: 063<br/>
    /// </summary>
    [XmlEnum("063")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Luftfahrzeug_Kaskoversicherung,

    /// <summary>
    /// <b>Raumfahrzeug- Kaskoversicherung</b><br/>
    /// Code: 065<br/>
    /// </summary>
    [XmlEnum("065")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Raumfahrzeug_Kaskoversicherung,

    /// <summary>
    /// <b>Pre- Launch- Versicherung</b><br/>
    /// Code: 0651<br/>
    /// </summary>
    [XmlEnum("0651")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pre_Launch_Versicherung,

    /// <summary>
    /// <b>Launch- Versicherung</b><br/>
    /// Code: 0652<br/>
    /// </summary>
    [XmlEnum("0652")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Launch_Versicherung,

    /// <summary>
    /// <b>In- Orbit- Versicherung</b><br/>
    /// Code: 0653<br/>
    /// </summary>
    [XmlEnum("0653")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    In_Orbit_Versicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)</b><br/>
    /// Code: 069<br/>
    /// </summary>
    [XmlEnum("069")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Luftfahrtversicherung,

    /// <summary>
    /// <b>Rechtsschutzversicherung</b><br/>
    /// Code: 07<br/>
    /// </summary>
    [XmlEnum("07")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung,

    /// <summary>
    /// <b>Rechtsschutzversicherung nach ARB</b><br/>
    /// Code: 071<br/>
    /// </summary>
    [XmlEnum("071")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung_nach_ARB,

    /// <summary>
    /// <b>Verkehrs- Rechtsschutzversicherung</b><br/>
    /// Code: 0711<br/>
    /// </summary>
    [XmlEnum("0711")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verkehrs_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Fahrzeug- Rechtsschutzversicherung</b><br/>
    /// Code: 0712<br/>
    /// </summary>
    [XmlEnum("0712")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrzeug_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Fahrer- Rechtsschutzversicherung</b><br/>
    /// Code: 0713<br/>
    /// </summary>
    [XmlEnum("0713")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrer_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Rechtsschutzversicherung für Gewerbetreibende und freiberuflich Tätige</b><br/>
    /// Code: 0714<br/>
    /// </summary>
    [XmlEnum("0714")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung_fuer_Gewerbetreibende_und_freiberuflich_Taetige,

    /// <summary>
    /// <b>Familien- Rechtsschutzversicherung</b><br/>
    /// Code: 0715<br/>
    /// </summary>
    [XmlEnum("0715")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Familien_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Familien- und Verkehrs- Rechtsschutzversicherung</b><br/>
    /// Code: 0716<br/>
    /// </summary>
    [XmlEnum("0716")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Familien_und_Verkehrs_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Landwirtschafts- und Verkehrs- Rechtsschutzversicherung</b><br/>
    /// Code: 0717<br/>
    /// </summary>
    [XmlEnum("0717")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Landwirtschafts_und_Verkehrs_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Rechtsschutzversicherung für Vereine</b><br/>
    /// Code: 0718<br/>
    /// </summary>
    [XmlEnum("0718")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung_fuer_Vereine,

    /// <summary>
    /// <b>Rechtsschutzversicherung für Grundstückseigentum und Miete</b><br/>
    /// Code: 0719<br/>
    /// </summary>
    [XmlEnum("0719")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung_fuer_Grundstueckseigentum_und_Miete,

    /// <summary>
    /// <b>Vermögensschaden-Rechtsschutzversicherungen für Aufsichtsräte, Beiräte, Vorstände (VRB)</b><br/>
    /// Code: 072<br/>
    /// </summary>
    [XmlEnum("072")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vermoegensschaden_Rechtsschutzversicherungen_fuer_Aufsichtsraete_Beiraete_Vorstaende,

    /// <summary>
    /// <b>Rechtsschutzversicherung für Träger öffentlicher Aufgaben (ÖRB)</b><br/>
    /// Code: 073<br/>
    /// </summary>
    [XmlEnum("073")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rechtsschutzversicherung_fuer_Traeger_oeffentlicher_Aufgaben,

    /// <summary>
    /// <b>Kraftfahrt- Strafrechtsschutzversicherung mit Auslands- Zivilrechtsschutzversicherung</b><br/>
    /// Code: 075<br/>
    /// </summary>
    [XmlEnum("075")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrt_Strafrechtsschutzversicherung_mit_Auslands_Zivilrechtsschutzversicherung,

    /// <summary>
    /// <b>Spezial- Strafrechtsschutzversicherung der Unternehmen</b><br/>
    /// Code: 076<br/>
    /// </summary>
    [XmlEnum("076")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Spezial_Strafrechtsschutzversicherung_der_Unternehmen,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Rechtsschutzversicherung</b><br/>
    /// Code: 079<br/>
    /// </summary>
    [XmlEnum("079")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Rechtsschutzversicherung,

    /// <summary>
    /// <b>Feuerversicherung</b><br/>
    /// Code: 08<br/>
    /// </summary>
    [XmlEnum("08")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuerversicherung,

    /// <summary>
    /// <b>Feuer- Industrie- Versicherung</b><br/>
    /// Code: 081<br/>
    /// </summary>
    [XmlEnum("081")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuer_Industrie_Versicherung,

    /// <summary>
    /// <b>Landwirtschaftliche Feuerversicherung</b><br/>
    /// Code: 082<br/>
    /// </summary>
    [XmlEnum("082")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Landwirtschaftliche_Feuerversicherung,

    /// <summary>
    /// <b>Sonstige Feuerversicherung (einschließlich der Waldbrandversicherung)</b><br/>
    /// Code: 083<br/>
    /// </summary>
    [XmlEnum("083")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Feuerversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Feuerversicherung</b><br/>
    /// Code: 089<br/>
    /// </summary>
    [XmlEnum("089")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Feuerversicherung,

    /// <summary>
    /// <b>Einbruchdiebstahl und Raub (ED)- Versicherung</b><br/>
    /// Code: 09<br/>
    /// </summary>
    [XmlEnum("09")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einbruchdiebstahl_und_Raub_Versicherung,

    /// <summary>
    /// <b>übrige und nicht aufgegliederte ED-Versicherung</b><br/>
    /// Code: 099<br/>
    /// </summary>
    [XmlEnum("099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uebrige_und_nicht_aufgegliederte_ED_Versicherung,

    /// <summary>
    /// <b>Leitungswasser (Lw)- Versicherung</b><br/>
    /// Code: 10<br/>
    /// </summary>
    [XmlEnum("10")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Leitungswasser_Versicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Lw- Versicherung</b><br/>
    /// Code: 109<br/>
    /// </summary>
    [XmlEnum("109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Lw_Versicherung,

    /// <summary>
    /// <b>Glasversicherung</b><br/>
    /// Code: 11<br/>
    /// </summary>
    [XmlEnum("11")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Glasversicherung,

    /// <summary>
    /// <b>Sturmversicherung</b><br/>
    /// Code: 12<br/>
    /// </summary>
    [XmlEnum("12")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sturmversicherung,

    /// <summary>
    /// <b>Sturmversicherung</b><br/>
    /// Code: 121<br/>
    /// </summary>
    [XmlEnum("121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sturmversicherung_121,

    /// <summary>
    /// <b>Gärtnerei- Sturmversicherung</b><br/>
    /// Code: 123<br/>
    /// </summary>
    [XmlEnum("123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gaertnerei_Sturmversicherung,

    /// <summary>
    /// <b>Versicherung weiterer Elementarschäden bei gewerblichen Risiken</b><br/>
    /// Code: 124<br/>
    /// </summary>
    [XmlEnum("124")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_weiterer_Elementarschaeden_bei_gewerblichen_Risiken,

    /// <summary>
    /// <b>Verbundene Hausratversicherung</b><br/>
    /// Code: 13<br/>
    /// </summary>
    [XmlEnum("13")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Hausratversicherung,

    /// <summary>
    /// <b>Verbundene Hausratversicherung ohne Einschluss weiterer Elementarschäden</b><br/>
    /// Code: 131<br/>
    /// </summary>
    [XmlEnum("131")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Hausratversicherung_ohne_Einschluss_weiterer_Elementarschaeden,

    /// <summary>
    /// <b>Verbundene Hausratversicherung unter Einschluss weiterer Elementarschäden</b><br/>
    /// Code: 132<br/>
    /// </summary>
    [XmlEnum("132")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Hausratversicherung_unter_Einschluss_weiterer_Elementarschaeden,

    /// <summary>
    /// <b>Verbundene Wohngebäudeversicherung</b><br/>
    /// Code: 14<br/>
    /// </summary>
    [XmlEnum("14")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Wohngebaeudeversicherung,

    /// <summary>
    /// <b>Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden</b><br/>
    /// Code: 141<br/>
    /// </summary>
    [XmlEnum("141")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden,

    /// <summary>
    /// <b>Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden</b><br/>
    /// Code: 142<br/>
    /// </summary>
    [XmlEnum("142")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden_142,

    /// <summary>
    /// <b>Hagelversicherung</b><br/>
    /// Code: 15<br/>
    /// </summary>
    [XmlEnum("15")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hagelversicherung,

    /// <summary>
    /// <b>Tierversicherung</b><br/>
    /// Code: 16<br/>
    /// </summary>
    [XmlEnum("16")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tierversicherung,

    /// <summary>
    /// <b>Langfristige Tierlebensversicherung</b><br/>
    /// Code: 161<br/>
    /// </summary>
    [XmlEnum("161")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Langfristige_Tierlebensversicherung,

    /// <summary>
    /// <b>Pferdelebensversicherung</b><br/>
    /// Code: 1611<br/>
    /// </summary>
    [XmlEnum("1611")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pferdelebensversicherung,

    /// <summary>
    /// <b>Rindviehlebensversicherung</b><br/>
    /// Code: 1612<br/>
    /// </summary>
    [XmlEnum("1612")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rindviehlebensversicherung,

    /// <summary>
    /// <b>Schweinelebensversicherung</b><br/>
    /// Code: 1613<br/>
    /// </summary>
    [XmlEnum("1613")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schweinelebensversicherung,

    /// <summary>
    /// <b>Geflügellebensversicherung</b><br/>
    /// Code: 1614<br/>
    /// </summary>
    [XmlEnum("1614")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gefluegellebensversicherung,

    /// <summary>
    /// <b>Hundelebensversicherung</b><br/>
    /// Code: 1616<br/>
    /// </summary>
    [XmlEnum("1616")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hundelebensversicherung,

    /// <summary>
    /// <b>Übrige langfristige Tierlebensversicherung</b><br/>
    /// Code: 1619<br/>
    /// </summary>
    [XmlEnum("1619")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_langfristige_Tierlebensversicherung,

    /// <summary>
    /// <b>Kurzfristige Tierversicherung</b><br/>
    /// Code: 162<br/>
    /// </summary>
    [XmlEnum("162")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kurzfristige_Tierversicherung,

    /// <summary>
    /// <b>Trächtigkeits-, Leibesfrucht- und Fohlenversicherung</b><br/>
    /// Code: 1621<br/>
    /// </summary>
    [XmlEnum("1621")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Traechtigkeits_Leibesfrucht_und_Fohlenversicherung,

    /// <summary>
    /// <b>Weidetierversicherung</b><br/>
    /// Code: 1622<br/>
    /// </summary>
    [XmlEnum("1622")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Weidetierversicherung,

    /// <summary>
    /// <b>Mastviehversicherung</b><br/>
    /// Code: 1623<br/>
    /// </summary>
    [XmlEnum("1623")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mastviehversicherung,

    /// <summary>
    /// <b>Schlachttierversicherung (einschließlich Schlachtwertversicherung)</b><br/>
    /// Code: 1624<br/>
    /// </summary>
    [XmlEnum("1624")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schlachttierversicherung,

    /// <summary>
    /// <b>Operations-(Kastrations)-Versicherung</b><br/>
    /// Code: 1625<br/>
    /// </summary>
    [XmlEnum("1625")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Operations_Versicherung,

    /// <summary>
    /// <b>Übrige kurzfristige Tierversicherung</b><br/>
    /// Code: 1629<br/>
    /// </summary>
    [XmlEnum("1629")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_kurzfristige_Tierversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Tierversicherung</b><br/>
    /// Code: 169<br/>
    /// </summary>
    [XmlEnum("169")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Tierversicherung,

    /// <summary>
    /// <b>Technische Versicherung</b><br/>
    /// Code: 17<br/>
    /// </summary>
    [XmlEnum("17")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Technische_Versicherung,

    /// <summary>
    /// <b>Maschinenversicherung (einschließlich der Baugeräteversicherung)</b><br/>
    /// Code: 171<br/>
    /// </summary>
    [XmlEnum("171")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Maschinenversicherung,

    /// <summary>
    /// <b>Elektronikversicherung</b><br/>
    /// Code: 172<br/>
    /// </summary>
    [XmlEnum("172")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Elektronikversicherung,

    /// <summary>
    /// <b>Montageversicherung</b><br/>
    /// Code: 174<br/>
    /// </summary>
    [XmlEnum("174")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Montageversicherung,

    /// <summary>
    /// <b>Haushaltsgeräteversicherung</b><br/>
    /// Code: 175<br/>
    /// </summary>
    [XmlEnum("175")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haushaltsgeraeteversicherung,

    /// <summary>
    /// <b>Bauleistungsversicherung</b><br/>
    /// Code: 176<br/>
    /// </summary>
    [XmlEnum("176")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bauleistungsversicherung,

    /// <summary>
    /// <b>Übrige technische Versicherungen</b><br/>
    /// Code: 179<br/>
    /// </summary>
    [XmlEnum("179")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_technische_Versicherungen,

    /// <summary>
    /// <b>Übrige technische Sachschadenversicherungen</b><br/>
    /// Code: 1791<br/>
    /// </summary>
    [XmlEnum("1791")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_technische_Sachschadenversicherungen,

    /// <summary>
    /// <b>Reparaturkostenversicherung von Kraftwagen</b><br/>
    /// Code: 17911<br/>
    /// </summary>
    [XmlEnum("17911")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reparaturkostenversicherung_von_Kraftwagen,

    /// <summary>
    /// <b>Reparaturkostenversicherung von Fernseh- und Videogeräten</b><br/>
    /// Code: 17912<br/>
    /// </summary>
    [XmlEnum("17912")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reparaturkostenversicherung_von_Fernseh_und_Videogeraeten,

    /// <summary>
    /// <b>Reparaturkostenversicherung von Haushaltsgeräten</b><br/>
    /// Code: 17913<br/>
    /// </summary>
    [XmlEnum("17913")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reparaturkostenversicherung_von_Haushaltsgeraeten,

    /// <summary>
    /// <b>Garantieverlängerungsversicherung von technischen Geräten</b><br/>
    /// Code: 17914<br/>
    /// </summary>
    [XmlEnum("17914")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Garantieverlaengerungsversicherung_von_technischen_Geraeten,

    /// <summary>
    /// <b>Sonstige technische Versicherungen</b><br/>
    /// Code: 1799<br/>
    /// </summary>
    [XmlEnum("1799")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_technische_Versicherungen,

    /// <summary>
    /// <b>Einheitsversicherung</b><br/>
    /// Code: 18<br/>
    /// </summary>
    [XmlEnum("18")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Einheitsversicherung,

    /// <summary>
    /// <b>Allgemeine Einheitsversicherung</b><br/>
    /// Code: 181<br/>
    /// </summary>
    [XmlEnum("181")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allgemeine_Einheitsversicherung,

    /// <summary>
    /// <b>Juwelierwaren- Einheitsversicherung</b><br/>
    /// Code: 182<br/>
    /// </summary>
    [XmlEnum("182")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Juwelierwaren_Einheitsversicherung,

    /// <summary>
    /// <b>Rauchwaren- Einheitsversicherung</b><br/>
    /// Code: 183<br/>
    /// </summary>
    [XmlEnum("183")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rauchwaren_Einheitsversicherung,

    /// <summary>
    /// <b>Textilveredlung- Einheitsversicherung</b><br/>
    /// Code: 184<br/>
    /// </summary>
    [XmlEnum("184")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Textilveredlung_Einheitsversicherung,

    /// <summary>
    /// <b>Wäscheschutz- Einheitsversicherung</b><br/>
    /// Code: 185<br/>
    /// </summary>
    [XmlEnum("185")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Waescheschutz_Einheitsversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Einheitsversicherung</b><br/>
    /// Code: 189<br/>
    /// </summary>
    [XmlEnum("189")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Einheitsversicherung,

    /// <summary>
    /// <b>Transportversicherung</b><br/>
    /// Code: 19<br/>
    /// </summary>
    [XmlEnum("19")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Transportversicherung,

    /// <summary>
    /// <b>Kaskoversicherung</b><br/>
    /// Code: 191<br/>
    /// </summary>
    [XmlEnum("191")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kaskoversicherung,

    /// <summary>
    /// <b>Seeschifffahrts- Kaskoversicherung</b><br/>
    /// Code: 1911<br/>
    /// </summary>
    [XmlEnum("1911")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Seeschifffahrts_Kaskoversicherung,

    /// <summary>
    /// <b>Binnensee- und Flussschifffahrts- Kaskoversicherung</b><br/>
    /// Code: 1912<br/>
    /// </summary>
    [XmlEnum("1912")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Binnensee_und_Flussschifffahrts_Kaskoversicherung,

    /// <summary>
    /// <b>Schienenfahrzeug- Kaskoversicherung</b><br/>
    /// Code: 1915<br/>
    /// </summary>
    [XmlEnum("1915")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schienenfahrzeug_Kaskoversicherung,

    /// <summary>
    /// <b>Sportboot- Kaskoversicherung</b><br/>
    /// Code: 1916<br/>
    /// </summary>
    [XmlEnum("1916")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sportboot_Kaskoversicherung,

    /// <summary>
    /// <b>Baurisikoversicherung</b><br/>
    /// Code: 1917<br/>
    /// </summary>
    [XmlEnum("1917")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baurisikoversicherung,

    /// <summary>
    /// <b>Übrige Kaskoversicherung</b><br/>
    /// Code: 1919<br/>
    /// </summary>
    [XmlEnum("1919")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_Kaskoversicherung,

    /// <summary>
    /// <b>Transportgüterversicherung</b><br/>
    /// Code: 192<br/>
    /// </summary>
    [XmlEnum("192")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Transportgueterversicherung,

    /// <summary>
    /// <b>Transportgüterversicherung (ohne die Kennzahlen 19.2.3 bis 19.2.6)</b><br/>
    /// Code: 1922<br/>
    /// </summary>
    [XmlEnum("1922")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Transportgueterversicherung_1922,

    /// <summary>
    /// <b>Reiselagerversicherung</b><br/>
    /// Code: 1923<br/>
    /// </summary>
    [XmlEnum("1923")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reiselagerversicherung,

    /// <summary>
    /// <b>Container- Kaskoversicherung</b><br/>
    /// Code: 1925<br/>
    /// </summary>
    [XmlEnum("1925")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Container_Kaskoversicherung,

    /// <summary>
    /// <b>Tiertransportversicherung</b><br/>
    /// Code: 1926<br/>
    /// </summary>
    [XmlEnum("1926")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tiertransportversicherung,

    /// <summary>
    /// <b>Übrige Warenversicherung</b><br/>
    /// Code: 1929<br/>
    /// </summary>
    [XmlEnum("1929")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_Warenversicherung,

    /// <summary>
    /// <b>Valorenversicherung (gewerblich)</b><br/>
    /// Code: 193<br/>
    /// </summary>
    [XmlEnum("193")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Valorenversicherung,

    /// <summary>
    /// <b>Filmversicherung (ohne die Kennzahl 29.2.01)</b><br/>
    /// Code: 194<br/>
    /// </summary>
    [XmlEnum("194")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Filmversicherung,

    /// <summary>
    /// <b>Kriegsrisikoversicherung</b><br/>
    /// Code: 197<br/>
    /// </summary>
    [XmlEnum("197")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kriegsrisikoversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Transportversicherung (einschließlich Versicherung von Offshore- Risiken)</b><br/>
    /// Code: 199<br/>
    /// </summary>
    [XmlEnum("199")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Transportversicherung,

    /// <summary>
    /// <b>Kredit- und Kautionsversicherung</b><br/>
    /// Code: 20<br/>
    /// </summary>
    [XmlEnum("20")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kredit_und_Kautionsversicherung,

    /// <summary>
    /// <b>Kautionsversicherung (einschließlich Baugarantieversicherung)</b><br/>
    /// Code: 201<br/>
    /// </summary>
    [XmlEnum("201")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kautionsversicherung,

    /// <summary>
    /// <b>Delkrederversicherung</b><br/>
    /// Code: 202<br/>
    /// </summary>
    [XmlEnum("202")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Delkrederversicherung,

    /// <summary>
    /// <b>Ausfuhrkreditversicherung</b><br/>
    /// Code: 2021<br/>
    /// </summary>
    [XmlEnum("2021")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ausfuhrkreditversicherung,

    /// <summary>
    /// <b>Warenkreditversicherung</b><br/>
    /// Code: 2022<br/>
    /// </summary>
    [XmlEnum("2022")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Warenkreditversicherung,

    /// <summary>
    /// <b>Investitionsgüterkreditversicherung</b><br/>
    /// Code: 2023<br/>
    /// </summary>
    [XmlEnum("2023")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Investitionsgueterkreditversicherung,

    /// <summary>
    /// <b>Konsumentenkreditversicherung</b><br/>
    /// Code: 2024<br/>
    /// </summary>
    [XmlEnum("2024")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Konsumentenkreditversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Delkrederversicherung</b><br/>
    /// Code: 2029<br/>
    /// </summary>
    [XmlEnum("2029")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Delkrederversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Kredit- und Kautionsversicherung</b><br/>
    /// Code: 209<br/>
    /// </summary>
    [XmlEnum("209")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Kredit_und_Kautionsversicherung,

    /// <summary>
    /// <b>Versicherung zusätzlicher Gefahren zur Feuer- bzw. Feuer- Betriebsunterbrechungs- Versicherung (Extend Coverage (EC)- Versicherung)</b><br/>
    /// Code: 21<br/>
    /// </summary>
    [XmlEnum("21")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_zusaetzlicher_Gefahren_zur_Feuer_bzw_Feuer_Betriebsunterbrechungs_Versicherung_Versicherung,

    /// <summary>
    /// <b>Betriebsunterbrechungs- Versicherung</b><br/>
    /// Code: 23<br/>
    /// </summary>
    [XmlEnum("23")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Betriebsunterbrechungs_Versicherung,

    /// <summary>
    /// <b>Feuer-(Groß) Betriebsunterbrechungs- Versicherung</b><br/>
    /// Code: 231<br/>
    /// </summary>
    [XmlEnum("231")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuer_Betriebsunterbrechungs_Versicherung,

    /// <summary>
    /// <b>Technische- Betriebsunterbrechungs- Versicherung/ MBU Elektronik</b><br/>
    /// Code: 232<br/>
    /// </summary>
    [XmlEnum("232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Technische_Betriebsunterbrechungs_Versicherung_MBU_Elektronik,

    /// <summary>
    /// <b>Sonstige Betriebsunterbrechungsversicherungen</b><br/>
    /// Code: 233<br/>
    /// </summary>
    [XmlEnum("233")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Betriebsunterbrechungsversicherungen,

    /// <summary>
    /// <b>Beistandsleistungsversicherung</b><br/>
    /// Code: 24<br/>
    /// </summary>
    [XmlEnum("24")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Beistandsleistungsversicherung,

    /// <summary>
    /// <b>Schutzbriefversicherung</b><br/>
    /// Code: 241<br/>
    /// </summary>
    [XmlEnum("241")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schutzbriefversicherung,

    /// <summary>
    /// <b>Sportboot- Serviceversicherung</b><br/>
    /// Code: 242<br/>
    /// </summary>
    [XmlEnum("242")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sportboot_Serviceversicherung,

    /// <summary>
    /// <b>Flugrückholkostenversicherung</b><br/>
    /// Code: 243<br/>
    /// </summary>
    [XmlEnum("243")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Flugrueckholkostenversicherung,

    /// <summary>
    /// <b>Schutzbriefversicherung unter Einschluss der sog. Mallorca- Police</b><br/>
    /// Code: 244<br/>
    /// </summary>
    [XmlEnum("244")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schutzbriefversicherung_unter_Einschluss_der_sog_Mallorca_Police,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Beistandsleistungsversicherung</b><br/>
    /// Code: 249<br/>
    /// </summary>
    [XmlEnum("249")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Beistandsleistungsversicherung,

    /// <summary>
    /// <b>Luft- und Raumfahrzeug- Haftpflichtversicherung</b><br/>
    /// Code: 25<br/>
    /// </summary>
    [XmlEnum("25")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Luft_und_Raumfahrzeug_Haftpflichtversicherung,

    /// <summary>
    /// <b>Luftfahrt- Haftpflichtversicherung (einschließlich der Luftfrachtführer- Haftpflichtversicherung)</b><br/>
    /// Code: 251<br/>
    /// </summary>
    [XmlEnum("251")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Luftfahrt_Haftpflichtversicherung,

    /// <summary>
    /// <b>Raumfahrzeug- Haftpflichtversicherung</b><br/>
    /// Code: 252<br/>
    /// </summary>
    [XmlEnum("252")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Raumfahrzeug_Haftpflichtversicherung,

    /// <summary>
    /// <b>Sonstige Schadenversicherung, z.B. Maschinen- Garantie- Versicherung</b><br/>
    /// Code: 29<br/>
    /// </summary>
    [XmlEnum("29")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Schadenversicherung_z_B_Maschinen_Garantie_Versicherung,

    /// <summary>
    /// <b>Sonstige Sachschadenversicherung</b><br/>
    /// Code: 291<br/>
    /// </summary>
    [XmlEnum("291")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Sachschadenversicherung,

    /// <summary>
    /// <b>Schwamm- und Hausbockkäferversicherung</b><br/>
    /// Code: 29101<br/>
    /// </summary>
    [XmlEnum("29101")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schwamm_und_Hausbockkaeferversicherung,

    /// <summary>
    /// <b>Ausstellungsversicherung</b><br/>
    /// Code: 29102<br/>
    /// </summary>
    [XmlEnum("29102")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ausstellungsversicherung,

    /// <summary>
    /// <b>Fahrradversicherung</b><br/>
    /// Code: 29103<br/>
    /// </summary>
    [XmlEnum("29103")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrradversicherung,

    /// <summary>
    /// <b>Garderobenversicherung</b><br/>
    /// Code: 29104<br/>
    /// </summary>
    [XmlEnum("29104")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Garderobenversicherung,

    /// <summary>
    /// <b>Jagd- und Sportwaffenversicherung</b><br/>
    /// Code: 29105<br/>
    /// </summary>
    [XmlEnum("29105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Jagd_und_Sportwaffenversicherung,

    /// <summary>
    /// <b>Musikinstrumenteversicherung</b><br/>
    /// Code: 29106<br/>
    /// </summary>
    [XmlEnum("29106")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Musikinstrumenteversicherung,

    /// <summary>
    /// <b>Fotoapparateversicherung</b><br/>
    /// Code: 29107<br/>
    /// </summary>
    [XmlEnum("29107")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fotoapparateversicherung,

    /// <summary>
    /// <b>Kühlgüterversicherung</b><br/>
    /// Code: 29108<br/>
    /// </summary>
    [XmlEnum("29108")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kuehlgueterversicherung,

    /// <summary>
    /// <b>Warenversicherung in Tiefkühlanlagen</b><br/>
    /// Code: 29109<br/>
    /// </summary>
    [XmlEnum("29109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Warenversicherung_in_Tiefkuehlanlagen,

    /// <summary>
    /// <b>Atomanlagen- Sachversicherung</b><br/>
    /// Code: 29110<br/>
    /// </summary>
    [XmlEnum("29110")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Atomanlagen_Sachversicherung,

    /// <summary>
    /// <b>Automatenversicherung</b><br/>
    /// Code: 29111<br/>
    /// </summary>
    [XmlEnum("29111")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Automatenversicherung,

    /// <summary>
    /// <b>Reisegepäckversicherung</b><br/>
    /// Code: 29112<br/>
    /// </summary>
    [XmlEnum("29112")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reisegepaeckversicherung,

    /// <summary>
    /// <b>Kraftfahrtgepäckversicherung</b><br/>
    /// Code: 29113<br/>
    /// </summary>
    [XmlEnum("29113")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kraftfahrtgepaeckversicherung,

    /// <summary>
    /// <b>Valorenversicherung (privat)</b><br/>
    /// Code: 29114<br/>
    /// </summary>
    [XmlEnum("29114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Valorenversicherung_29114,

    /// <summary>
    /// <b>Freizeitsportgeräteversicherung (einschließlich der Skibruchversicherung)</b><br/>
    /// Code: 29115<br/>
    /// </summary>
    [XmlEnum("29115")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freizeitsportgeraeteversicherung,

    /// <summary>
    /// <b>Verderbschadenversicherung</b><br/>
    /// Code: 29116<br/>
    /// </summary>
    [XmlEnum("29116")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verderbschadenversicherung,

    /// <summary>
    /// <b>Gärtnereri- Verderbschadenversicherung</b><br/>
    /// Code: 29117<br/>
    /// </summary>
    [XmlEnum("29117")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gaertnereri_Verderbschadenversicherung,

    /// <summary>
    /// <b>Campingversicherung</b><br/>
    /// Code: 29119<br/>
    /// </summary>
    [XmlEnum("29119")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Campingversicherung,

    /// <summary>
    /// <b>Versicherung von Kunstgegenständen</b><br/>
    /// Code: 29120<br/>
    /// </summary>
    [XmlEnum("29120")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_von_Kunstgegenstaenden,

    /// <summary>
    /// <b>Versicherung von Auktionen</b><br/>
    /// Code: 29121<br/>
    /// </summary>
    [XmlEnum("29121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_von_Auktionen,

    /// <summary>
    /// <b>Brillenversicherung</b><br/>
    /// Code: 29122<br/>
    /// </summary>
    [XmlEnum("29122")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Brillenversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Sachschadenversicherung</b><br/>
    /// Code: 29199<br/>
    /// </summary>
    [XmlEnum("29199")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Sachschadenversicherung,

    /// <summary>
    /// <b>Sonstige Vermögensschadenversicherung</b><br/>
    /// Code: 293<br/>
    /// </summary>
    [XmlEnum("293")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_Vermoegensschadenversicherung,

    /// <summary>
    /// <b>Boykott- und Streikversicherung</b><br/>
    /// Code: 29301<br/>
    /// </summary>
    [XmlEnum("29301")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Boykott_und_Streikversicherung,

    /// <summary>
    /// <b>Reise-Rücktrittskostenversicherung</b><br/>
    /// Code: 29302<br/>
    /// </summary>
    [XmlEnum("29302")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Reise_Ruecktrittskostenversicherung,

    /// <summary>
    /// <b>Lizenzverlustversicherung</b><br/>
    /// Code: 29304<br/>
    /// </summary>
    [XmlEnum("29304")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lizenzverlustversicherung,

    /// <summary>
    /// <b>Tierkrankenversicherung</b><br/>
    /// Code: 29305<br/>
    /// </summary>
    [XmlEnum("29305")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tierkrankenversicherung,

    /// <summary>
    /// <b>Maschinengarantieversicherung</b><br/>
    /// Code: 29306<br/>
    /// </summary>
    [XmlEnum("29306")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Maschinengarantieversicherung,

    /// <summary>
    /// <b>Datenmissbrauchsversicherung</b><br/>
    /// Code: 29307<br/>
    /// </summary>
    [XmlEnum("29307")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Datenmissbrauchsversicherung,

    /// <summary>
    /// <b>Scheckkartenversicherung von Scheckkarteninhabern</b><br/>
    /// Code: 29308<br/>
    /// </summary>
    [XmlEnum("29308")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Scheckkartenversicherung_von_Scheckkarteninhabern,

    /// <summary>
    /// <b>Insolvenzversicherung</b><br/>
    /// Code: 29310<br/>
    /// </summary>
    [XmlEnum("29310")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Insolvenzversicherung,

    /// <summary>
    /// <b>Schlüsselverlustsicherung</b><br/>
    /// Code: 29311<br/>
    /// </summary>
    [XmlEnum("29311")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schluesselverlustsicherung,

    /// <summary>
    /// <b>Garantieversicherung von Kraftfahrzeugen</b><br/>
    /// Code: 29312<br/>
    /// </summary>
    [XmlEnum("29312")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Garantieversicherung_von_Kraftfahrzeugen,

    /// <summary>
    /// <b>Mietverlustversicherung</b><br/>
    /// Code: 29313<br/>
    /// </summary>
    [XmlEnum("29313")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mietverlustversicherung,

    /// <summary>
    /// <b>Raumfahrzeug-Vermögensschadenversicherung</b><br/>
    /// Code: 29314<br/>
    /// </summary>
    [XmlEnum("29314")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Raumfahrzeug_Vermoegensschadenversicherung,

    /// <summary>
    /// <b>Milchgeldausfallversicherung</b><br/>
    /// Code: 29315<br/>
    /// </summary>
    [XmlEnum("29315")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Milchgeldausfallversicherung,

    /// <summary>
    /// <b>Produktschutzversicherung</b><br/>
    /// Code: 29316<br/>
    /// </summary>
    [XmlEnum("29316")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Produktschutzversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Vermögensschadenversicherung</b><br/>
    /// Code: 29399<br/>
    /// </summary>
    [XmlEnum("29399")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Vermoegensschadenversicherung,

    /// <summary>
    /// <b>Sonstige gemischte Versicherung</b><br/>
    /// Code: 294<br/>
    /// </summary>
    [XmlEnum("294")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonstige_gemischte_Versicherung,

    /// <summary>
    /// <b>Tank- und Fassleckageversicherung</b><br/>
    /// Code: 29402<br/>
    /// </summary>
    [XmlEnum("29402")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tank_und_Fassleckageversicherung,

    /// <summary>
    /// <b>Filmtheater- Einheitsversicherung</b><br/>
    /// Code: 29403<br/>
    /// </summary>
    [XmlEnum("29403")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Filmtheater_Einheitsversicherung,

    /// <summary>
    /// <b>Versicherung von Winzerbetrieben gegen Frostschäden</b><br/>
    /// Code: 29404<br/>
    /// </summary>
    [XmlEnum("29404")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_von_Winzerbetrieben_gegen_Frostschaeden,

    /// <summary>
    /// <b>Allgefahrenversicherung</b><br/>
    /// Code: 29405<br/>
    /// </summary>
    [XmlEnum("29405")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allgefahrenversicherung,

    /// <summary>
    /// <b>Inhaltsversicherung für Geschäfte und Betriebe</b><br/>
    /// Code: 29406<br/>
    /// </summary>
    [XmlEnum("29406")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Inhaltsversicherung_fuer_Geschaefte_und_Betriebe,

    /// <summary>
    /// <b>Erweiterte Haushaltsversicherung</b><br/>
    /// Code: 29407<br/>
    /// </summary>
    [XmlEnum("29407")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Erweiterte_Haushaltsversicherung,

    /// <summary>
    /// <b>Dynamische Sachversicherung</b><br/>
    /// Code: 29408<br/>
    /// </summary>
    [XmlEnum("29408")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dynamische_Sachversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte gemischte Versicherung</b><br/>
    /// Code: 29499<br/>
    /// </summary>
    [XmlEnum("29499")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_gemischte_Versicherung,

    /// <summary>
    /// <b>Vertrauensschadenversicherung</b><br/>
    /// Code: 296<br/>
    /// </summary>
    [XmlEnum("296")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vertrauensschadenversicherung,

    /// <summary>
    /// <b>Vertrauensschadenversicherung (ohne Kennzahlen 26.6.02 und 29.6.04)</b><br/>
    /// Code: 29601<br/>
    /// </summary>
    [XmlEnum("29601")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vertrauensschadenversicherung_29601,

    /// <summary>
    /// <b>Computermissbrauchsversicherung</b><br/>
    /// Code: 29602<br/>
    /// </summary>
    [XmlEnum("29602")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Computermissbrauchsversicherung,

    /// <summary>
    /// <b>Versicherung gegen Veruntreuung von Selbstfahrervermieterfahrzeugen</b><br/>
    /// Code: 29603<br/>
    /// </summary>
    [XmlEnum("29603")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherung_gegen_Veruntreuung_von_Selbstfahrervermieterfahrzeugen,

    /// <summary>
    /// <b>Eigenschadenversicherung von Körperschaften und Anstalten des öffentlichen Rechts</b><br/>
    /// Code: 29604<br/>
    /// </summary>
    [XmlEnum("29604")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Eigenschadenversicherung_von_Koerperschaften_und_Anstalten_des_oeffentlichen_Rechts,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte Vertrauensschadenversicherung</b><br/>
    /// Code: 29699<br/>
    /// </summary>
    [XmlEnum("29699")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_Vertrauensschadenversicherung,

    /// <summary>
    /// <b>Übrige und nicht aufgegliederte sonstige Schadenversicherungen</b><br/>
    /// Code: 299<br/>
    /// </summary>
    [XmlEnum("299")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uebrige_und_nicht_aufgegliederte_sonstige_Schadenversicherungen,

    /// <summary>
    /// <b>Schaden- und Unfallversicherungen insgesamt</b><br/>
    /// Code: 300<br/>
    /// </summary>
    [XmlEnum("300")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schaden_und_Unfallversicherungen_insgesamt,
}
