namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

/// <summary>
/// Mapper für <see cref="VersicherungsTypCode"/>.<br/>
/// <u><b>Insurance code mapper:</b></u> Mapper for <see cref="VersicherungsTypCode"/>.
/// </summary>
public static class VersicherungsTypCodeMapper
{
    public static VersicherungsTypCode FromCode(string code)
    {
        return FromString(code);
    }

    public static VersicherungsTypCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new ArgumentException($"Unknown Versicherung: {value}", nameof(value));
    }

    public static bool TryParse(string value, out VersicherungsTypCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "000":
            case "Alle Sparten":
                result = VersicherungsTypCode.Alle_Sparten;
                return true;
            case "01":
            case "Lebensversicherung":
                result = VersicherungsTypCode.Lebensversicherung;
                return true;
            case "011":
            case "Einzelversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.":
                result = VersicherungsTypCode.Einzelversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0111":
            case "Kapitalbildende Lebensversicherung (einschließlich vermögensbildender Lebensversicherung) mit überwiegendem Todesfallcharakter":
                result = VersicherungsTypCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Todesfallcharakter;
                return true;
            case "0112":
            case "Risikoversicherung":
                result = VersicherungsTypCode.Risikoversicherung;
                return true;
            case "0113":
            case "Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter":
                result = VersicherungsTypCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter;
                return true;
            case "0114":
            case "Berufsunfähigkeitsversicherung":
                result = VersicherungsTypCode.Berufsunfaehigkeitsversicherung;
                return true;
            case "0115":
            case "Pflegerentenversicherung":
                result = VersicherungsTypCode.Pflegerentenversicherung;
                return true;
            case "0116":
            case "übrige und nicht aufgegliederte Einzelversicherung (einschließlich der Heirats- und Geburtenversicherung, aber ohne sonstige Lebensversicherung":
                result = VersicherungsTypCode.uebrige_und_nicht_aufgegliederte_Einzelversicherung_einschliesslich_der_Heirats_und_Geburtenversicherung_aber_ohne_sonstige_Lebensversicherung;
                return true;
            case "0117":
            case "Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG":
                result = VersicherungsTypCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG;
                return true;
            case "012":
            case "Kollektivversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.":
                result = VersicherungsTypCode.Kollektivversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0121":
            case "Kapitalversicherung mit überwiegendem Todesfallcharakter (ohne Kennzahlen 01.2.2 und 01.2.3)":
                result = VersicherungsTypCode.Kapitalversicherung_mit_ueberwiegendem_Todesfallcharakter;
                return true;
            case "0122":
            case "Bausparrisikoversicherung":
                result = VersicherungsTypCode.Bausparrisikoversicherung;
                return true;
            case "0123":
            case "Restschuldversicherung":
                result = VersicherungsTypCode.Restschuldversicherung;
                return true;
            case "0124":
            case "übrige und nicht aufgegliederte Kollektivversicherung (einschließlich der Heirats- und Geburtenversicherung), aber ohne sonstige Lebensversicherung":
                result = VersicherungsTypCode.uebrige_und_nicht_aufgegliederte_Kollektivversicherung_aber_ohne_sonstige_Lebensversicherung;
                return true;
            case "0125":
                result = VersicherungsTypCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG_0125;
                return true;
            case "013":
            case "Zusatzversicherung (einschließlich der, für Kollektivversicherungen)":
                result = VersicherungsTypCode.Zusatzversicherung;
                return true;
            case "0131":
            case "Unfall- Zusatzversicherung":
                result = VersicherungsTypCode.Unfall_Zusatzversicherung;
                return true;
            case "0132":
            case "Berufsunfähigkeits(Invaliditäts)-Zusatzversicherung":
                result = VersicherungsTypCode.Berufsunfaehigkeits_Zusatzversicherung;
                return true;
            case "0133":
            case "Risiko- und Zeitrenten- Zusatzversicherung":
                result = VersicherungsTypCode.Risiko_und_Zeitrenten_Zusatzversicherung;
                return true;
            case "0134":
            case "Pflegerenten- Zusatzversicherung":
                result = VersicherungsTypCode.Pflegerenten_Zusatzversicherung;
                return true;
            case "0135":
            case "Sonstige Zusatzversicherung":
                result = VersicherungsTypCode.Sonstige_Zusatzversicherung;
                return true;
            case "014":
            case "Sonstige Lebensversicherung":
                result = VersicherungsTypCode.Sonstige_Lebensversicherung;
                return true;
            case "0141":
            case "Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird":
                result = VersicherungsTypCode.Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird;
                return true;
            case "0142":
            case "Lebensversicherung ohne Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird":
                result = VersicherungsTypCode.Lebensversicherung_ohne_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0143":
            case "Tontinengeschäfte":
                result = VersicherungsTypCode.Tontinengeschaefte;
                return true;
            case "0144":
            case "Kapitalisierungsgeschäfte":
                result = VersicherungsTypCode.Kapitalisierungsgeschaefte;
                return true;
            case "0145":
            case "Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird, nach dem AltZertG":
                result = VersicherungsTypCode.Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird_nach_dem_AltZertG;
                return true;
            case "015":
            case "Geschäfte der Verwaltung von Versorgungseinrichtungen":
                result = VersicherungsTypCode.Geschaefte_der_Verwaltung_von_Versorgungseinrichtungen;
                return true;
            case "02":
            case "Krankenversicherung":
                result = VersicherungsTypCode.Krankenversicherung;
                return true;
            case "021":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär)":
                result = VersicherungsTypCode.Einzel_Krankheitskostenvollversicherung;
                return true;
            case "0211":
            case "Einzel- Krankheitskostenvollversicherung":
                result = VersicherungsTypCode.Einzel_Krankheitskostenvollversicherung_0211;
                return true;
            case "0212":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär), nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Einzel_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0213":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadensversicherung":
                result = VersicherungsTypCode.Einzel_Krankheitskostenvollversicherung_nach_Art_der_Schadensversicherung;
                return true;
            case "022":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant)":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung;
                return true;
            case "0221":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv;
                return true;
            case "0222":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0223":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "023":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär)":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_023;
                return true;
            case "0231":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv_0231;
                return true;
            case "0232":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0232;
                return true;
            case "0233":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0233;
                return true;
            case "024":
            case "Einzel- Krankentagegeldversicherung":
                result = VersicherungsTypCode.Einzel_Krankentagegeldversicherung;
                return true;
            case "0241":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) substitutiv":
                result = VersicherungsTypCode.Krankentagegeldversicherung_substitutiv;
                return true;
            case "0242":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0243":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Krankentagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0244":
            case "Lohnfortzahlungsversicherung":
                result = VersicherungsTypCode.Lohnfortzahlungsversicherung;
                return true;
            case "0245":
                result = VersicherungsTypCode.Restschuldversicherung_0245;
                return true;
            case "025":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung;
                return true;
            case "0251":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_substitutiv;
                return true;
            case "0252":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0253":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "026":
            case "Sonstige selbstständige Einzel- Teilversicherung":
                result = VersicherungsTypCode.Sonstige_selbststaendige_Einzel_Teilversicherung;
                return true;
            case "0261":
            case "Selbstständige Zahnbehandlungsversicherung substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Zahnbehandlungsversicherung_substitutiv;
                return true;
            case "0262":
            case "Selbstständige Zahnbehandlungsversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Zahnbehandlungsversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0263":
            case "Selbstständige Zahnbehandlungsversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Zahnbehandlungsversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0264":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) substitutiv":
                result = VersicherungsTypCode.Kurkostenversicherung_substitutiv;
                return true;
            case "0265":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Kurkostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0266":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Kurkostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0267":
            case "Reisekrankenversicherung (gegen festes Entgelt)":
                result = VersicherungsTypCode.Reisekrankenversicherung;
                return true;
            case "0268":
            case "Sonstige Teilversicherung substitutiv":
                result = VersicherungsTypCode.Sonstige_Teilversicherung_substitutiv;
                return true;
            case "0269":
            case "Sonstige Teilversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Sonstige_Teilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02610":
            case "Sonstige Teilversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Sonstige_Teilversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "027":
            case "Gruppen- Krankenversicherung (nach Einzel- und Sondertarifen)":
                result = VersicherungsTypCode.Gruppen_Krankenversicherung;
                return true;
            case "0271":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) substitutiv":
                result = VersicherungsTypCode.Gruppen_Krankheitskostenvollversicherung_substitutiv;
                return true;
            case "0272":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Gruppen_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0273":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Gruppen_Krankheitskostenvollversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0274":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv;
                return true;
            case "0275":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0276":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0277":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv_0277;
                return true;
            case "0278":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0278;
                return true;
            case "0279":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0279;
                return true;
            case "02710":
            case "Gruppen- Krankentagegeldversicherung substitutiv":
                result = VersicherungsTypCode.Gruppen_Krankentagegeldversicherung_substitutiv;
                return true;
            case "02711":
            case "Gruppen- Krankentagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Gruppen_Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02712":
            case "Gruppen- Krankentagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Gruppen_Krankentagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02713":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung substitutiv":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_substitutiv;
                return true;
            case "02714":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02715":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02716":
            case "Sonstige selbstständige Gruppenteilversicherung substitutiv":
                result = VersicherungsTypCode.Sonstige_selbststaendige_Gruppenteilversicherung_substitutiv;
                return true;
            case "02717":
            case "Sonstige selbstständige Gruppenteilversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Sonstige_selbststaendige_Gruppenteilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02718":
            case "Sonstige selbstständige Gruppenteilversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Sonstige_selbststaendige_Gruppenteilversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02719":
            case "Gruppen- Pflegepflichtversicherung":
                result = VersicherungsTypCode.Gruppen_Pflegepflichtversicherung;
                return true;
            case "02720":
            case "Freiwillige Gruppen- Pflegekostenversicherung substitutiv":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegekostenversicherung_substitutiv;
                return true;
            case "02721":
            case "Freiwillige Gruppen- Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02722":
            case "Freiwillige Gruppen- Pflegekostenversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegekostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02723":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung substitutiv":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_substitutiv;
                return true;
            case "02724":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02725":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "028":
            case "Pflegekrankenversicherung":
                result = VersicherungsTypCode.Pflegekrankenversicherung;
                return true;
            case "0281":
            case "Pflegepflichtversicherung":
                result = VersicherungsTypCode.Pflegepflichtversicherung;
                return true;
            case "0282":
            case "Freiwillige Pflegekostenversicherung substitutiv":
                result = VersicherungsTypCode.Freiwillige_Pflegekostenversicherung_substitutiv;
                return true;
            case "0283":
            case "Freiwillige Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Freiwillige_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0284":
            case "Freiwillige Pflegekostenversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Freiwillige_Pflegekostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0285":
            case "Freiwillige Pflegetagegeldversicherung substitutiv":
                result = VersicherungsTypCode.Freiwillige_Pflegetagegeldversicherung_substitutiv;
                return true;
            case "0286":
            case "Freiwillige Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsTypCode.Freiwillige_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0287":
            case "Freiwillige Pflegetagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsTypCode.Freiwillige_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "029":
            case "Übrige und nicht aufgegliederte Krankenversicherung (einschließlich der Beihilfeablöseversicherung)":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Krankenversicherung;
                return true;
            case "03":
            case "Allgemeine Unfallversicherung":
                result = VersicherungsTypCode.Allgemeine_Unfallversicherung;
                return true;
            case "031":
            case "Einzelunfallversicherung ohne Beitragsrückgewähr":
                result = VersicherungsTypCode.Einzelunfallversicherung_ohne_Beitragsrueckgewaehr;
                return true;
            case "03101":
            case "Unfallvollversicherung (ohne Kennzahlen 03.1.02 und 03.1.03)":
                result = VersicherungsTypCode.Unfallvollversicherung;
                return true;
            case "03102":
            case "Volks- Unfallvollversicherung":
                result = VersicherungsTypCode.Volks_Unfallvollversicherung;
                return true;
            case "03103":
            case "Unfallvollversicherung aus der FUSt- Versicherung":
                result = VersicherungsTypCode.Unfallvollversicherung_aus_der_FUSt_Versicherung;
                return true;
            case "03104":
            case "Versicherung gegen außerberufliche Unfälle":
                result = VersicherungsTypCode.Versicherung_gegen_ausserberufliche_Unfaelle;
                return true;
            case "03105":
            case "Reiseunfallversicherung":
                result = VersicherungsTypCode.Reiseunfallversicherung;
                return true;
            case "03106":
            case "Sofortunfallversicherung":
                result = VersicherungsTypCode.Sofortunfallversicherung;
                return true;
            case "03107":
            case "Luftfahrtunfallversicherung":
                result = VersicherungsTypCode.Luftfahrtunfallversicherung;
                return true;
            case "03108":
            case "Lebenslängliche Verkehrsmittelunfallversicherung":
                result = VersicherungsTypCode.Lebenslaengliche_Verkehrsmittelunfallversicherung;
                return true;
            case "03109":
            case "Sportbootinsassenunfallversicherung":
                result = VersicherungsTypCode.Sportbootinsassenunfallversicherung;
                return true;
            case "03199":
            case "Übrige und nicht aufgegliederte Einzelunfallversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Einzelunfallversicherung;
                return true;
            case "033":
            case "Gruppen- Unfallversicherung ohne Beitragsrückgewähr":
                result = VersicherungsTypCode.Gruppen_Unfallversicherung_ohne_Beitragsrueckgewaehr;
                return true;
            case "0331":
            case "Gruppen- Unfallvollversicherung":
                result = VersicherungsTypCode.Gruppen_Unfallvollversicherung;
                return true;
            case "0333":
            case "Gruppen- Unfallteilversicherung":
                result = VersicherungsTypCode.Gruppen_Unfallteilversicherung;
                return true;
            case "034":
            case "Probandenversicherung":
                result = VersicherungsTypCode.Probandenversicherung;
                return true;
            case "035":
            case "Kraftfahrtunfallversicherung (einschließlich der namentlichen Kraftfahrtunfallversicherung)":
                result = VersicherungsTypCode.Kraftfahrtunfallversicherung;
                return true;
            case "038":
            case "Unfallversicherung mit Beitragsrückgewähr":
                result = VersicherungsTypCode.Unfallversicherung_mit_Beitragsrueckgewaehr;
                return true;
            case "0381":
            case "Einzel- Unfallversicherung":
                result = VersicherungsTypCode.Einzel_Unfallversicherung;
                return true;
            case "0382":
            case "Gruppen- Unfallversicherung":
                result = VersicherungsTypCode.Gruppen_Unfallversicherung;
                return true;
            case "039":
            case "Übrige und nicht aufgegliederte allgemeine Unfallversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_allgemeine_Unfallversicherung;
                return true;
            case "04":
            case "Haftpflichtversicherung":
                result = VersicherungsTypCode.Haftpflichtversicherung;
                return true;
            case "041":
            case "Privathaftpflichtversicherung (einschließlich Sportboot- und Hundehalterhaftpflichtversicherung)":
                result = VersicherungsTypCode.Privathaftpflichtversicherung;
                return true;
            case "042":
            case "Betriebs- und Berufshaftpflichtversicherung":
                result = VersicherungsTypCode.Betriebs_und_Berufshaftpflichtversicherung;
                return true;
            case "0421":
            case "Industrie- und Handelsbetriebe":
                result = VersicherungsTypCode.Industrie_und_Handelsbetriebe;
                return true;
            case "0422":
            case "Baugewerbe (einschließlich Architekten und Bauingeneure)":
                result = VersicherungsTypCode.Baugewerbe;
                return true;
            case "0423":
            case "Sonstige Betriebs- und Berufshaftpflichtversicherung":
                result = VersicherungsTypCode.Sonstige_Betriebs_und_Berufshaftpflichtversicherung;
                return true;
            case "043":
            case "Umwelt- Haftpflichtversicherung":
                result = VersicherungsTypCode.Umwelt_Haftpflichtversicherung;
                return true;
            case "0431":
            case "Gewässerschaden- Haftpflichtversicherung":
                result = VersicherungsTypCode.Gewaesserschaden_Haftpflichtversicherung;
                return true;
            case "0432":
            case "Umwelthaftpflicht- Modell":
                result = VersicherungsTypCode.Umwelthaftpflicht_Modell;
                return true;
            case "044":
            case "Vermögensschaden- Haftpflichtversicherung":
                result = VersicherungsTypCode.Vermoegensschaden_Haftpflichtversicherung;
                return true;
            case "045":
            case "Verkehrshaftungsversicherung (einschließlich der Speditions- und Rollfuhrversicherung)":
                result = VersicherungsTypCode.Verkehrshaftungsversicherung;
                return true;
            case "046":
            case "Strahlen- und Atomanlagen- Haftpflichtversicherung":
                result = VersicherungsTypCode.Strahlen_und_Atomanlagen_Haftpflichtversicherung;
                return true;
            case "0461":
            case "Strahlen- Haftpflichtversicherung":
                result = VersicherungsTypCode.Strahlen_Haftpflichtversicherung;
                return true;
            case "0462":
            case "Atomanlagen- Haftpflichtversicherung":
                result = VersicherungsTypCode.Atomanlagen_Haftpflichtversicherung;
                return true;
            case "047":
            case "Feuerhaftungsversicherung":
                result = VersicherungsTypCode.Feuerhaftungsversicherung;
                return true;
            case "048":
            case "See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko) sowie Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge":
                result = VersicherungsTypCode.See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung_sowie_Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge;
                return true;
            case "0481":
            case "Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge mit eigenem Antrieb":
                result = VersicherungsTypCode.Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_mit_eigenem_Antrieb;
                return true;
            case "0482":
            case "Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge ohne eigenen Antrieb":
                result = VersicherungsTypCode.Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_ohne_eigenen_Antrieb;
                return true;
            case "0483":
            case "See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko)":
                result = VersicherungsTypCode.See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung;
                return true;
            case "049":
            case "Übrige und nicht aufgegliederte Haftpflichtversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Haftpflichtversicherung;
                return true;
            case "04901":
            case "Haus- und Grundbesitzerhaftpflichtversicherung":
                result = VersicherungsTypCode.Haus_und_Grundbesitzerhaftpflichtversicherung;
                return true;
            case "04902":
            case "Kraftfahrzeug- Parkplatzversicherung":
                result = VersicherungsTypCode.Kraftfahrzeug_Parkplatzversicherung;
                return true;
            case "04903":
            case "Kühlgüterhaftpflichtversicherung":
                result = VersicherungsTypCode.Kuehlgueterhaftpflichtversicherung;
                return true;
            case "04999":
            case "Sonstige Haftpflichtversicherung":
                result = VersicherungsTypCode.Sonstige_Haftpflichtversicherung;
                return true;
            case "05":
            case "Kraftfahrtversicherung":
                result = VersicherungsTypCode.Kraftfahrtversicherung;
                return true;
            case "051":
            case "Kraftfahrzeug- Haftpflichtversicherung":
                result = VersicherungsTypCode.Kraftfahrzeug_Haftpflichtversicherung;
                return true;
            case "052":
            case "Fahrzeugvollversicherung":
                result = VersicherungsTypCode.Fahrzeugvollversicherung;
                return true;
            case "053":
            case "Fahrzeugteilversicherung":
                result = VersicherungsTypCode.Fahrzeugteilversicherung;
                return true;
            case "055":
            case "Sonstige Kraftfahrtversicherung (05.2 und 05.3 insgesamt)":
                result = VersicherungsTypCode.Sonstige_Kraftfahrtversicherung;
                return true;
            case "059":
            case "Übrige und nicht aufgegliederte Kraftfahrtversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Kraftfahrtversicherung;
                return true;
            case "06":
            case "Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)":
                result = VersicherungsTypCode.Luftfahrtversicherung;
                return true;
            case "063":
            case "Luftfahrzeug- Kaskoversicherung":
                result = VersicherungsTypCode.Luftfahrzeug_Kaskoversicherung;
                return true;
            case "065":
            case "Raumfahrzeug- Kaskoversicherung":
                result = VersicherungsTypCode.Raumfahrzeug_Kaskoversicherung;
                return true;
            case "0651":
            case "Pre- Launch- Versicherung":
                result = VersicherungsTypCode.Pre_Launch_Versicherung;
                return true;
            case "0652":
            case "Launch- Versicherung":
                result = VersicherungsTypCode.Launch_Versicherung;
                return true;
            case "0653":
            case "In- Orbit- Versicherung":
                result = VersicherungsTypCode.In_Orbit_Versicherung;
                return true;
            case "069":
            case "Übrige und nicht aufgegliederte Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Luftfahrtversicherung;
                return true;
            case "07":
            case "Rechtsschutzversicherung":
                result = VersicherungsTypCode.Rechtsschutzversicherung;
                return true;
            case "071":
            case "Rechtsschutzversicherung nach ARB":
                result = VersicherungsTypCode.Rechtsschutzversicherung_nach_ARB;
                return true;
            case "0711":
            case "Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0712":
            case "Fahrzeug- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Fahrzeug_Rechtsschutzversicherung;
                return true;
            case "0713":
            case "Fahrer- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Fahrer_Rechtsschutzversicherung;
                return true;
            case "0714":
            case "Rechtsschutzversicherung für Gewerbetreibende und freiberuflich Tätige":
                result = VersicherungsTypCode.Rechtsschutzversicherung_fuer_Gewerbetreibende_und_freiberuflich_Taetige;
                return true;
            case "0715":
            case "Familien- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Familien_Rechtsschutzversicherung;
                return true;
            case "0716":
            case "Familien- und Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Familien_und_Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0717":
            case "Landwirtschafts- und Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsTypCode.Landwirtschafts_und_Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0718":
            case "Rechtsschutzversicherung für Vereine":
                result = VersicherungsTypCode.Rechtsschutzversicherung_fuer_Vereine;
                return true;
            case "0719":
            case "Rechtsschutzversicherung für Grundstückseigentum und Miete":
                result = VersicherungsTypCode.Rechtsschutzversicherung_fuer_Grundstueckseigentum_und_Miete;
                return true;
            case "072":
            case "Vermögensschaden-Rechtsschutzversicherungen für Aufsichtsräte, Beiräte, Vorstände (VRB)":
                result = VersicherungsTypCode.Vermoegensschaden_Rechtsschutzversicherungen_fuer_Aufsichtsraete_Beiraete_Vorstaende;
                return true;
            case "073":
            case "Rechtsschutzversicherung für Träger öffentlicher Aufgaben (ÖRB)":
                result = VersicherungsTypCode.Rechtsschutzversicherung_fuer_Traeger_oeffentlicher_Aufgaben;
                return true;
            case "075":
            case "Kraftfahrt- Strafrechtsschutzversicherung mit Auslands- Zivilrechtsschutzversicherung":
                result = VersicherungsTypCode.Kraftfahrt_Strafrechtsschutzversicherung_mit_Auslands_Zivilrechtsschutzversicherung;
                return true;
            case "076":
            case "Spezial- Strafrechtsschutzversicherung der Unternehmen":
                result = VersicherungsTypCode.Spezial_Strafrechtsschutzversicherung_der_Unternehmen;
                return true;
            case "079":
            case "Übrige und nicht aufgegliederte Rechtsschutzversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Rechtsschutzversicherung;
                return true;
            case "08":
            case "Feuerversicherung":
                result = VersicherungsTypCode.Feuerversicherung;
                return true;
            case "081":
            case "Feuer- Industrie- Versicherung":
                result = VersicherungsTypCode.Feuer_Industrie_Versicherung;
                return true;
            case "082":
            case "Landwirtschaftliche Feuerversicherung":
                result = VersicherungsTypCode.Landwirtschaftliche_Feuerversicherung;
                return true;
            case "083":
            case "Sonstige Feuerversicherung (einschließlich der Waldbrandversicherung)":
                result = VersicherungsTypCode.Sonstige_Feuerversicherung;
                return true;
            case "089":
            case "Übrige und nicht aufgegliederte Feuerversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Feuerversicherung;
                return true;
            case "09":
            case "Einbruchdiebstahl und Raub (ED)- Versicherung":
                result = VersicherungsTypCode.Einbruchdiebstahl_und_Raub_Versicherung;
                return true;
            case "099":
            case "übrige und nicht aufgegliederte ED-Versicherung":
                result = VersicherungsTypCode.uebrige_und_nicht_aufgegliederte_ED_Versicherung;
                return true;
            case "10":
            case "Leitungswasser (Lw)- Versicherung":
                result = VersicherungsTypCode.Leitungswasser_Versicherung;
                return true;
            case "109":
            case "Übrige und nicht aufgegliederte Lw- Versicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Lw_Versicherung;
                return true;
            case "11":
            case "Glasversicherung":
                result = VersicherungsTypCode.Glasversicherung;
                return true;
            case "12":
            case "Sturmversicherung":
                result = VersicherungsTypCode.Sturmversicherung;
                return true;
            case "121":
                result = VersicherungsTypCode.Sturmversicherung_121;
                return true;
            case "123":
            case "Gärtnerei- Sturmversicherung":
                result = VersicherungsTypCode.Gaertnerei_Sturmversicherung;
                return true;
            case "124":
            case "Versicherung weiterer Elementarschäden bei gewerblichen Risiken":
                result = VersicherungsTypCode.Versicherung_weiterer_Elementarschaeden_bei_gewerblichen_Risiken;
                return true;
            case "13":
            case "Verbundene Hausratversicherung":
                result = VersicherungsTypCode.Verbundene_Hausratversicherung;
                return true;
            case "131":
            case "Verbundene Hausratversicherung ohne Einschluss weiterer Elementarschäden":
                result = VersicherungsTypCode.Verbundene_Hausratversicherung_ohne_Einschluss_weiterer_Elementarschaeden;
                return true;
            case "132":
            case "Verbundene Hausratversicherung unter Einschluss weiterer Elementarschäden":
                result = VersicherungsTypCode.Verbundene_Hausratversicherung_unter_Einschluss_weiterer_Elementarschaeden;
                return true;
            case "14":
            case "Verbundene Wohngebäudeversicherung":
                result = VersicherungsTypCode.Verbundene_Wohngebaeudeversicherung;
                return true;
            case "141":
            case "Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden":
                result = VersicherungsTypCode.Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden;
                return true;
            case "142":
                result = VersicherungsTypCode.Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden_142;
                return true;
            case "15":
            case "Hagelversicherung":
                result = VersicherungsTypCode.Hagelversicherung;
                return true;
            case "16":
            case "Tierversicherung":
                result = VersicherungsTypCode.Tierversicherung;
                return true;
            case "161":
            case "Langfristige Tierlebensversicherung":
                result = VersicherungsTypCode.Langfristige_Tierlebensversicherung;
                return true;
            case "1611":
            case "Pferdelebensversicherung":
                result = VersicherungsTypCode.Pferdelebensversicherung;
                return true;
            case "1612":
            case "Rindviehlebensversicherung":
                result = VersicherungsTypCode.Rindviehlebensversicherung;
                return true;
            case "1613":
            case "Schweinelebensversicherung":
                result = VersicherungsTypCode.Schweinelebensversicherung;
                return true;
            case "1614":
            case "Geflügellebensversicherung":
                result = VersicherungsTypCode.Gefluegellebensversicherung;
                return true;
            case "1616":
            case "Hundelebensversicherung":
                result = VersicherungsTypCode.Hundelebensversicherung;
                return true;
            case "1619":
            case "Übrige langfristige Tierlebensversicherung":
                result = VersicherungsTypCode.Uebrige_langfristige_Tierlebensversicherung;
                return true;
            case "162":
            case "Kurzfristige Tierversicherung":
                result = VersicherungsTypCode.Kurzfristige_Tierversicherung;
                return true;
            case "1621":
            case "Trächtigkeits-, Leibesfrucht- und Fohlenversicherung":
                result = VersicherungsTypCode.Traechtigkeits_Leibesfrucht_und_Fohlenversicherung;
                return true;
            case "1622":
            case "Weidetierversicherung":
                result = VersicherungsTypCode.Weidetierversicherung;
                return true;
            case "1623":
            case "Mastviehversicherung":
                result = VersicherungsTypCode.Mastviehversicherung;
                return true;
            case "1624":
            case "Schlachttierversicherung (einschließlich Schlachtwertversicherung)":
                result = VersicherungsTypCode.Schlachttierversicherung;
                return true;
            case "1625":
            case "Operations-(Kastrations)-Versicherung":
                result = VersicherungsTypCode.Operations_Versicherung;
                return true;
            case "1629":
            case "Übrige kurzfristige Tierversicherung":
                result = VersicherungsTypCode.Uebrige_kurzfristige_Tierversicherung;
                return true;
            case "169":
            case "Übrige und nicht aufgegliederte Tierversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Tierversicherung;
                return true;
            case "17":
            case "Technische Versicherung":
                result = VersicherungsTypCode.Technische_Versicherung;
                return true;
            case "171":
            case "Maschinenversicherung (einschließlich der Baugeräteversicherung)":
                result = VersicherungsTypCode.Maschinenversicherung;
                return true;
            case "172":
            case "Elektronikversicherung":
                result = VersicherungsTypCode.Elektronikversicherung;
                return true;
            case "174":
            case "Montageversicherung":
                result = VersicherungsTypCode.Montageversicherung;
                return true;
            case "175":
            case "Haushaltsgeräteversicherung":
                result = VersicherungsTypCode.Haushaltsgeraeteversicherung;
                return true;
            case "176":
            case "Bauleistungsversicherung":
                result = VersicherungsTypCode.Bauleistungsversicherung;
                return true;
            case "179":
            case "Übrige technische Versicherungen":
                result = VersicherungsTypCode.Uebrige_technische_Versicherungen;
                return true;
            case "1791":
            case "Übrige technische Sachschadenversicherungen":
                result = VersicherungsTypCode.Uebrige_technische_Sachschadenversicherungen;
                return true;
            case "17911":
            case "Reparaturkostenversicherung von Kraftwagen":
                result = VersicherungsTypCode.Reparaturkostenversicherung_von_Kraftwagen;
                return true;
            case "17912":
            case "Reparaturkostenversicherung von Fernseh- und Videogeräten":
                result = VersicherungsTypCode.Reparaturkostenversicherung_von_Fernseh_und_Videogeraeten;
                return true;
            case "17913":
            case "Reparaturkostenversicherung von Haushaltsgeräten":
                result = VersicherungsTypCode.Reparaturkostenversicherung_von_Haushaltsgeraeten;
                return true;
            case "17914":
            case "Garantieverlängerungsversicherung von technischen Geräten":
                result = VersicherungsTypCode.Garantieverlaengerungsversicherung_von_technischen_Geraeten;
                return true;
            case "1799":
            case "Sonstige technische Versicherungen":
                result = VersicherungsTypCode.Sonstige_technische_Versicherungen;
                return true;
            case "18":
            case "Einheitsversicherung":
                result = VersicherungsTypCode.Einheitsversicherung;
                return true;
            case "181":
            case "Allgemeine Einheitsversicherung":
                result = VersicherungsTypCode.Allgemeine_Einheitsversicherung;
                return true;
            case "182":
            case "Juwelierwaren- Einheitsversicherung":
                result = VersicherungsTypCode.Juwelierwaren_Einheitsversicherung;
                return true;
            case "183":
            case "Rauchwaren- Einheitsversicherung":
                result = VersicherungsTypCode.Rauchwaren_Einheitsversicherung;
                return true;
            case "184":
            case "Textilveredlung- Einheitsversicherung":
                result = VersicherungsTypCode.Textilveredlung_Einheitsversicherung;
                return true;
            case "185":
            case "Wäscheschutz- Einheitsversicherung":
                result = VersicherungsTypCode.Waescheschutz_Einheitsversicherung;
                return true;
            case "189":
            case "Übrige und nicht aufgegliederte Einheitsversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Einheitsversicherung;
                return true;
            case "19":
            case "Transportversicherung":
                result = VersicherungsTypCode.Transportversicherung;
                return true;
            case "191":
            case "Kaskoversicherung":
                result = VersicherungsTypCode.Kaskoversicherung;
                return true;
            case "1911":
            case "Seeschifffahrts- Kaskoversicherung":
                result = VersicherungsTypCode.Seeschifffahrts_Kaskoversicherung;
                return true;
            case "1912":
            case "Binnensee- und Flussschifffahrts- Kaskoversicherung":
                result = VersicherungsTypCode.Binnensee_und_Flussschifffahrts_Kaskoversicherung;
                return true;
            case "1915":
            case "Schienenfahrzeug- Kaskoversicherung":
                result = VersicherungsTypCode.Schienenfahrzeug_Kaskoversicherung;
                return true;
            case "1916":
            case "Sportboot- Kaskoversicherung":
                result = VersicherungsTypCode.Sportboot_Kaskoversicherung;
                return true;
            case "1917":
            case "Baurisikoversicherung":
                result = VersicherungsTypCode.Baurisikoversicherung;
                return true;
            case "1919":
            case "Übrige Kaskoversicherung":
                result = VersicherungsTypCode.Uebrige_Kaskoversicherung;
                return true;
            case "192":
            case "Transportgüterversicherung":
                result = VersicherungsTypCode.Transportgueterversicherung;
                return true;
            case "1922":
            case "Transportgüterversicherung (ohne die Kennzahlen 19.2.3 bis 19.2.6)":
                result = VersicherungsTypCode.Transportgueterversicherung_1922;
                return true;
            case "1923":
            case "Reiselagerversicherung":
                result = VersicherungsTypCode.Reiselagerversicherung;
                return true;
            case "1925":
            case "Container- Kaskoversicherung":
                result = VersicherungsTypCode.Container_Kaskoversicherung;
                return true;
            case "1926":
            case "Tiertransportversicherung":
                result = VersicherungsTypCode.Tiertransportversicherung;
                return true;
            case "1929":
            case "Übrige Warenversicherung":
                result = VersicherungsTypCode.Uebrige_Warenversicherung;
                return true;
            case "193":
            case "Valorenversicherung (gewerblich)":
                result = VersicherungsTypCode.Valorenversicherung;
                return true;
            case "194":
            case "Filmversicherung (ohne die Kennzahl 29.2.01)":
                result = VersicherungsTypCode.Filmversicherung;
                return true;
            case "197":
            case "Kriegsrisikoversicherung":
                result = VersicherungsTypCode.Kriegsrisikoversicherung;
                return true;
            case "199":
            case "Übrige und nicht aufgegliederte Transportversicherung (einschließlich Versicherung von Offshore- Risiken)":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Transportversicherung;
                return true;
            case "20":
            case "Kredit- und Kautionsversicherung":
                result = VersicherungsTypCode.Kredit_und_Kautionsversicherung;
                return true;
            case "201":
            case "Kautionsversicherung (einschließlich Baugarantieversicherung)":
                result = VersicherungsTypCode.Kautionsversicherung;
                return true;
            case "202":
            case "Delkrederversicherung":
                result = VersicherungsTypCode.Delkrederversicherung;
                return true;
            case "2021":
            case "Ausfuhrkreditversicherung":
                result = VersicherungsTypCode.Ausfuhrkreditversicherung;
                return true;
            case "2022":
            case "Warenkreditversicherung":
                result = VersicherungsTypCode.Warenkreditversicherung;
                return true;
            case "2023":
            case "Investitionsgüterkreditversicherung":
                result = VersicherungsTypCode.Investitionsgueterkreditversicherung;
                return true;
            case "2024":
            case "Konsumentenkreditversicherung":
                result = VersicherungsTypCode.Konsumentenkreditversicherung;
                return true;
            case "2029":
            case "Übrige und nicht aufgegliederte Delkrederversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Delkrederversicherung;
                return true;
            case "209":
            case "Übrige und nicht aufgegliederte Kredit- und Kautionsversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Kredit_und_Kautionsversicherung;
                return true;
            case "21":
            case "Versicherung zusätzlicher Gefahren zur Feuer- bzw. Feuer- Betriebsunterbrechungs- Versicherung (Extend Coverage (EC)- Versicherung)":
                result = VersicherungsTypCode.Versicherung_zusaetzlicher_Gefahren_zur_Feuer_bzw_Feuer_Betriebsunterbrechungs_Versicherung_Versicherung;
                return true;
            case "23":
            case "Betriebsunterbrechungs- Versicherung":
                result = VersicherungsTypCode.Betriebsunterbrechungs_Versicherung;
                return true;
            case "231":
            case "Feuer-(Groß) Betriebsunterbrechungs- Versicherung":
                result = VersicherungsTypCode.Feuer_Betriebsunterbrechungs_Versicherung;
                return true;
            case "232":
            case "Technische- Betriebsunterbrechungs- Versicherung/ MBU Elektronik":
                result = VersicherungsTypCode.Technische_Betriebsunterbrechungs_Versicherung_MBU_Elektronik;
                return true;
            case "233":
            case "Sonstige Betriebsunterbrechungsversicherungen":
                result = VersicherungsTypCode.Sonstige_Betriebsunterbrechungsversicherungen;
                return true;
            case "24":
            case "Beistandsleistungsversicherung":
                result = VersicherungsTypCode.Beistandsleistungsversicherung;
                return true;
            case "241":
            case "Schutzbriefversicherung":
                result = VersicherungsTypCode.Schutzbriefversicherung;
                return true;
            case "242":
            case "Sportboot- Serviceversicherung":
                result = VersicherungsTypCode.Sportboot_Serviceversicherung;
                return true;
            case "243":
            case "Flugrückholkostenversicherung":
                result = VersicherungsTypCode.Flugrueckholkostenversicherung;
                return true;
            case "244":
            case "Schutzbriefversicherung unter Einschluss der sog. Mallorca- Police":
                result = VersicherungsTypCode.Schutzbriefversicherung_unter_Einschluss_der_sog_Mallorca_Police;
                return true;
            case "249":
            case "Übrige und nicht aufgegliederte Beistandsleistungsversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Beistandsleistungsversicherung;
                return true;
            case "25":
            case "Luft- und Raumfahrzeug- Haftpflichtversicherung":
                result = VersicherungsTypCode.Luft_und_Raumfahrzeug_Haftpflichtversicherung;
                return true;
            case "251":
            case "Luftfahrt- Haftpflichtversicherung (einschließlich der Luftfrachtführer- Haftpflichtversicherung)":
                result = VersicherungsTypCode.Luftfahrt_Haftpflichtversicherung;
                return true;
            case "252":
            case "Raumfahrzeug- Haftpflichtversicherung":
                result = VersicherungsTypCode.Raumfahrzeug_Haftpflichtversicherung;
                return true;
            case "29":
            case "Sonstige Schadenversicherung, z.B. Maschinen- Garantie- Versicherung":
                result = VersicherungsTypCode.Sonstige_Schadenversicherung_z_B_Maschinen_Garantie_Versicherung;
                return true;
            case "291":
            case "Sonstige Sachschadenversicherung":
                result = VersicherungsTypCode.Sonstige_Sachschadenversicherung;
                return true;
            case "29101":
            case "Schwamm- und Hausbockkäferversicherung":
                result = VersicherungsTypCode.Schwamm_und_Hausbockkaeferversicherung;
                return true;
            case "29102":
            case "Ausstellungsversicherung":
                result = VersicherungsTypCode.Ausstellungsversicherung;
                return true;
            case "29103":
            case "Fahrradversicherung":
                result = VersicherungsTypCode.Fahrradversicherung;
                return true;
            case "29104":
            case "Garderobenversicherung":
                result = VersicherungsTypCode.Garderobenversicherung;
                return true;
            case "29105":
            case "Jagd- und Sportwaffenversicherung":
                result = VersicherungsTypCode.Jagd_und_Sportwaffenversicherung;
                return true;
            case "29106":
            case "Musikinstrumenteversicherung":
                result = VersicherungsTypCode.Musikinstrumenteversicherung;
                return true;
            case "29107":
            case "Fotoapparateversicherung":
                result = VersicherungsTypCode.Fotoapparateversicherung;
                return true;
            case "29108":
            case "Kühlgüterversicherung":
                result = VersicherungsTypCode.Kuehlgueterversicherung;
                return true;
            case "29109":
            case "Warenversicherung in Tiefkühlanlagen":
                result = VersicherungsTypCode.Warenversicherung_in_Tiefkuehlanlagen;
                return true;
            case "29110":
            case "Atomanlagen- Sachversicherung":
                result = VersicherungsTypCode.Atomanlagen_Sachversicherung;
                return true;
            case "29111":
            case "Automatenversicherung":
                result = VersicherungsTypCode.Automatenversicherung;
                return true;
            case "29112":
            case "Reisegepäckversicherung":
                result = VersicherungsTypCode.Reisegepaeckversicherung;
                return true;
            case "29113":
            case "Kraftfahrtgepäckversicherung":
                result = VersicherungsTypCode.Kraftfahrtgepaeckversicherung;
                return true;
            case "29114":
            case "Valorenversicherung (privat)":
                result = VersicherungsTypCode.Valorenversicherung_29114;
                return true;
            case "29115":
            case "Freizeitsportgeräteversicherung (einschließlich der Skibruchversicherung)":
                result = VersicherungsTypCode.Freizeitsportgeraeteversicherung;
                return true;
            case "29116":
            case "Verderbschadenversicherung":
                result = VersicherungsTypCode.Verderbschadenversicherung;
                return true;
            case "29117":
            case "Gärtnereri- Verderbschadenversicherung":
                result = VersicherungsTypCode.Gaertnereri_Verderbschadenversicherung;
                return true;
            case "29119":
            case "Campingversicherung":
                result = VersicherungsTypCode.Campingversicherung;
                return true;
            case "29120":
            case "Versicherung von Kunstgegenständen":
                result = VersicherungsTypCode.Versicherung_von_Kunstgegenstaenden;
                return true;
            case "29121":
            case "Versicherung von Auktionen":
                result = VersicherungsTypCode.Versicherung_von_Auktionen;
                return true;
            case "29122":
            case "Brillenversicherung":
                result = VersicherungsTypCode.Brillenversicherung;
                return true;
            case "29199":
            case "Übrige und nicht aufgegliederte Sachschadenversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Sachschadenversicherung;
                return true;
            case "293":
            case "Sonstige Vermögensschadenversicherung":
                result = VersicherungsTypCode.Sonstige_Vermoegensschadenversicherung;
                return true;
            case "29301":
            case "Boykott- und Streikversicherung":
                result = VersicherungsTypCode.Boykott_und_Streikversicherung;
                return true;
            case "29302":
            case "Reise-Rücktrittskostenversicherung":
                result = VersicherungsTypCode.Reise_Ruecktrittskostenversicherung;
                return true;
            case "29304":
            case "Lizenzverlustversicherung":
                result = VersicherungsTypCode.Lizenzverlustversicherung;
                return true;
            case "29305":
            case "Tierkrankenversicherung":
                result = VersicherungsTypCode.Tierkrankenversicherung;
                return true;
            case "29306":
            case "Maschinengarantieversicherung":
                result = VersicherungsTypCode.Maschinengarantieversicherung;
                return true;
            case "29307":
            case "Datenmissbrauchsversicherung":
                result = VersicherungsTypCode.Datenmissbrauchsversicherung;
                return true;
            case "29308":
            case "Scheckkartenversicherung von Scheckkarteninhabern":
                result = VersicherungsTypCode.Scheckkartenversicherung_von_Scheckkarteninhabern;
                return true;
            case "29310":
            case "Insolvenzversicherung":
                result = VersicherungsTypCode.Insolvenzversicherung;
                return true;
            case "29311":
            case "Schlüsselverlustsicherung":
                result = VersicherungsTypCode.Schluesselverlustsicherung;
                return true;
            case "29312":
            case "Garantieversicherung von Kraftfahrzeugen":
                result = VersicherungsTypCode.Garantieversicherung_von_Kraftfahrzeugen;
                return true;
            case "29313":
            case "Mietverlustversicherung":
                result = VersicherungsTypCode.Mietverlustversicherung;
                return true;
            case "29314":
            case "Raumfahrzeug-Vermögensschadenversicherung":
                result = VersicherungsTypCode.Raumfahrzeug_Vermoegensschadenversicherung;
                return true;
            case "29315":
            case "Milchgeldausfallversicherung":
                result = VersicherungsTypCode.Milchgeldausfallversicherung;
                return true;
            case "29316":
            case "Produktschutzversicherung":
                result = VersicherungsTypCode.Produktschutzversicherung;
                return true;
            case "29399":
            case "Übrige und nicht aufgegliederte Vermögensschadenversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Vermoegensschadenversicherung;
                return true;
            case "294":
            case "Sonstige gemischte Versicherung":
                result = VersicherungsTypCode.Sonstige_gemischte_Versicherung;
                return true;
            case "29402":
            case "Tank- und Fassleckageversicherung":
                result = VersicherungsTypCode.Tank_und_Fassleckageversicherung;
                return true;
            case "29403":
            case "Filmtheater- Einheitsversicherung":
                result = VersicherungsTypCode.Filmtheater_Einheitsversicherung;
                return true;
            case "29404":
            case "Versicherung von Winzerbetrieben gegen Frostschäden":
                result = VersicherungsTypCode.Versicherung_von_Winzerbetrieben_gegen_Frostschaeden;
                return true;
            case "29405":
            case "Allgefahrenversicherung":
                result = VersicherungsTypCode.Allgefahrenversicherung;
                return true;
            case "29406":
            case "Inhaltsversicherung für Geschäfte und Betriebe":
                result = VersicherungsTypCode.Inhaltsversicherung_fuer_Geschaefte_und_Betriebe;
                return true;
            case "29407":
            case "Erweiterte Haushaltsversicherung":
                result = VersicherungsTypCode.Erweiterte_Haushaltsversicherung;
                return true;
            case "29408":
            case "Dynamische Sachversicherung":
                result = VersicherungsTypCode.Dynamische_Sachversicherung;
                return true;
            case "29499":
            case "Übrige und nicht aufgegliederte gemischte Versicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_gemischte_Versicherung;
                return true;
            case "296":
            case "Vertrauensschadenversicherung":
                result = VersicherungsTypCode.Vertrauensschadenversicherung;
                return true;
            case "29601":
            case "Vertrauensschadenversicherung (ohne Kennzahlen 26.6.02 und 29.6.04)":
                result = VersicherungsTypCode.Vertrauensschadenversicherung_29601;
                return true;
            case "29602":
            case "Computermissbrauchsversicherung":
                result = VersicherungsTypCode.Computermissbrauchsversicherung;
                return true;
            case "29603":
            case "Versicherung gegen Veruntreuung von Selbstfahrervermieterfahrzeugen":
                result = VersicherungsTypCode.Versicherung_gegen_Veruntreuung_von_Selbstfahrervermieterfahrzeugen;
                return true;
            case "29604":
            case "Eigenschadenversicherung von Körperschaften und Anstalten des öffentlichen Rechts":
                result = VersicherungsTypCode.Eigenschadenversicherung_von_Koerperschaften_und_Anstalten_des_oeffentlichen_Rechts;
                return true;
            case "29699":
            case "Übrige und nicht aufgegliederte Vertrauensschadenversicherung":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_Vertrauensschadenversicherung;
                return true;
            case "299":
            case "Übrige und nicht aufgegliederte sonstige Schadenversicherungen":
                result = VersicherungsTypCode.Uebrige_und_nicht_aufgegliederte_sonstige_Schadenversicherungen;
                return true;
            case "300":
            case "Schaden- und Unfallversicherungen insgesamt":
                result = VersicherungsTypCode.Schaden_und_Unfallversicherungen_insgesamt;
                return true;
            default:
                return false;
        }
    }
}
