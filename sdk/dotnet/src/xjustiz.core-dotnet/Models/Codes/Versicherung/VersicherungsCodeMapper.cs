namespace xjustiz.core_dotnet.Models.Codes.Versicherung;

/// <summary>
/// Mapper für <see cref="VersicherungsCode"/>.<br/>
/// <u><b>Insurance code mapper:</b></u> Mapper for <see cref="VersicherungsCode"/>.
/// </summary>
public static class VersicherungsCodeMapper
{
    public static VersicherungsCode FromCode(string code)
    {
        return FromString(code);
    }

    public static VersicherungsCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Versicherung: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out VersicherungsCode result)
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
                result = VersicherungsCode.Alle_Sparten;
                return true;
            case "01":
            case "Lebensversicherung":
                result = VersicherungsCode.Lebensversicherung;
                return true;
            case "011":
            case "Einzelversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.":
                result = VersicherungsCode.Einzelversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0111":
            case "Kapitalbildende Lebensversicherung (einschließlich vermögensbildender Lebensversicherung) mit überwiegendem Todesfallcharakter":
                result = VersicherungsCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Todesfallcharakter;
                return true;
            case "0112":
            case "Risikoversicherung":
                result = VersicherungsCode.Risikoversicherung;
                return true;
            case "0113":
            case "Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter":
                result = VersicherungsCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter;
                return true;
            case "0114":
            case "Berufsunfähigkeitsversicherung":
                result = VersicherungsCode.Berufsunfaehigkeitsversicherung;
                return true;
            case "0115":
            case "Pflegerentenversicherung":
                result = VersicherungsCode.Pflegerentenversicherung;
                return true;
            case "0116":
            case "übrige und nicht aufgegliederte Einzelversicherung (einschließlich der Heirats- und Geburtenversicherung, aber ohne sonstige Lebensversicherung":
                result = VersicherungsCode.uebrige_und_nicht_aufgegliederte_Einzelversicherung_einschliesslich_der_Heirats_und_Geburtenversicherung_aber_ohne_sonstige_Lebensversicherung;
                return true;
            case "0117":
            case "Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG":
                result = VersicherungsCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG;
                return true;
            case "012":
            case "Kollektivversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.":
                result = VersicherungsCode.Kollektivversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0121":
            case "Kapitalversicherung mit überwiegendem Todesfallcharakter (ohne Kennzahlen 01.2.2 und 01.2.3)":
                result = VersicherungsCode.Kapitalversicherung_mit_ueberwiegendem_Todesfallcharakter;
                return true;
            case "0122":
            case "Bausparrisikoversicherung":
                result = VersicherungsCode.Bausparrisikoversicherung;
                return true;
            case "0123":
            case "Restschuldversicherung":
                result = VersicherungsCode.Restschuldversicherung;
                return true;
            case "0124":
            case "übrige und nicht aufgegliederte Kollektivversicherung (einschließlich der Heirats- und Geburtenversicherung), aber ohne sonstige Lebensversicherung":
                result = VersicherungsCode.uebrige_und_nicht_aufgegliederte_Kollektivversicherung_aber_ohne_sonstige_Lebensversicherung;
                return true;
            case "0125":
                result = VersicherungsCode.Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG_0125;
                return true;
            case "013":
            case "Zusatzversicherung (einschließlich der, für Kollektivversicherungen)":
                result = VersicherungsCode.Zusatzversicherung;
                return true;
            case "0131":
            case "Unfall- Zusatzversicherung":
                result = VersicherungsCode.Unfall_Zusatzversicherung;
                return true;
            case "0132":
            case "Berufsunfähigkeits(Invaliditäts)-Zusatzversicherung":
                result = VersicherungsCode.Berufsunfaehigkeits_Zusatzversicherung;
                return true;
            case "0133":
            case "Risiko- und Zeitrenten- Zusatzversicherung":
                result = VersicherungsCode.Risiko_und_Zeitrenten_Zusatzversicherung;
                return true;
            case "0134":
            case "Pflegerenten- Zusatzversicherung":
                result = VersicherungsCode.Pflegerenten_Zusatzversicherung;
                return true;
            case "0135":
            case "Sonstige Zusatzversicherung":
                result = VersicherungsCode.Sonstige_Zusatzversicherung;
                return true;
            case "014":
            case "Sonstige Lebensversicherung":
                result = VersicherungsCode.Sonstige_Lebensversicherung;
                return true;
            case "0141":
            case "Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird":
                result = VersicherungsCode.Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird;
                return true;
            case "0142":
            case "Lebensversicherung ohne Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird":
                result = VersicherungsCode.Lebensversicherung_ohne_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird;
                return true;
            case "0143":
            case "Tontinengeschäfte":
                result = VersicherungsCode.Tontinengeschaefte;
                return true;
            case "0144":
            case "Kapitalisierungsgeschäfte":
                result = VersicherungsCode.Kapitalisierungsgeschaefte;
                return true;
            case "0145":
            case "Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird, nach dem AltZertG":
                result = VersicherungsCode.Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird_nach_dem_AltZertG;
                return true;
            case "015":
            case "Geschäfte der Verwaltung von Versorgungseinrichtungen":
                result = VersicherungsCode.Geschaefte_der_Verwaltung_von_Versorgungseinrichtungen;
                return true;
            case "02":
            case "Krankenversicherung":
                result = VersicherungsCode.Krankenversicherung;
                return true;
            case "021":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär)":
                result = VersicherungsCode.Einzel_Krankheitskostenvollversicherung;
                return true;
            case "0211":
            case "Einzel- Krankheitskostenvollversicherung":
                result = VersicherungsCode.Einzel_Krankheitskostenvollversicherung_0211;
                return true;
            case "0212":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär), nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Einzel_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0213":
            case "Einzel- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadensversicherung":
                result = VersicherungsCode.Einzel_Krankheitskostenvollversicherung_nach_Art_der_Schadensversicherung;
                return true;
            case "022":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant)":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung;
                return true;
            case "0221":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) substitutiv":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv;
                return true;
            case "0222":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0223":
            case "Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "023":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär)":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_023;
                return true;
            case "0231":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) substitutiv":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv_0231;
                return true;
            case "0232":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0232;
                return true;
            case "0233":
            case "Selbstständige Einzel- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0233;
                return true;
            case "024":
            case "Einzel- Krankentagegeldversicherung":
                result = VersicherungsCode.Einzel_Krankentagegeldversicherung;
                return true;
            case "0241":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) substitutiv":
                result = VersicherungsCode.Krankentagegeldversicherung_substitutiv;
                return true;
            case "0242":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0243":
            case "Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nach Art der Schadenversicherung":
                result = VersicherungsCode.Krankentagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0244":
            case "Lohnfortzahlungsversicherung":
                result = VersicherungsCode.Lohnfortzahlungsversicherung;
                return true;
            case "0245":
                result = VersicherungsCode.Restschuldversicherung_0245;
                return true;
            case "025":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung;
                return true;
            case "0251":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung substitutiv":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_substitutiv;
                return true;
            case "0252":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0253":
            case "Selbstständige Einzel- Krankenhaustagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "026":
            case "Sonstige selbstständige Einzel- Teilversicherung":
                result = VersicherungsCode.Sonstige_selbststaendige_Einzel_Teilversicherung;
                return true;
            case "0261":
            case "Selbstständige Zahnbehandlungsversicherung substitutiv":
                result = VersicherungsCode.Selbststaendige_Zahnbehandlungsversicherung_substitutiv;
                return true;
            case "0262":
            case "Selbstständige Zahnbehandlungsversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Zahnbehandlungsversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0263":
            case "Selbstständige Zahnbehandlungsversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Zahnbehandlungsversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0264":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) substitutiv":
                result = VersicherungsCode.Kurkostenversicherung_substitutiv;
                return true;
            case "0265":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Kurkostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0266":
            case "Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nach Art der Schadenversicherung":
                result = VersicherungsCode.Kurkostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0267":
            case "Reisekrankenversicherung (gegen festes Entgelt)":
                result = VersicherungsCode.Reisekrankenversicherung;
                return true;
            case "0268":
            case "Sonstige Teilversicherung substitutiv":
                result = VersicherungsCode.Sonstige_Teilversicherung_substitutiv;
                return true;
            case "0269":
            case "Sonstige Teilversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Sonstige_Teilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02610":
            case "Sonstige Teilversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Sonstige_Teilversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "027":
            case "Gruppen- Krankenversicherung (nach Einzel- und Sondertarifen)":
                result = VersicherungsCode.Gruppen_Krankenversicherung;
                return true;
            case "0271":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) substitutiv":
                result = VersicherungsCode.Gruppen_Krankheitskostenvollversicherung_substitutiv;
                return true;
            case "0272":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Gruppen_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0273":
            case "Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadenversicherung":
                result = VersicherungsCode.Gruppen_Krankheitskostenvollversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0274":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) substitutiv":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv;
                return true;
            case "0275":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0276":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0277":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) substitutiv":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv_0277;
                return true;
            case "0278":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0278;
                return true;
            case "0279":
            case "Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0279;
                return true;
            case "02710":
            case "Gruppen- Krankentagegeldversicherung substitutiv":
                result = VersicherungsCode.Gruppen_Krankentagegeldversicherung_substitutiv;
                return true;
            case "02711":
            case "Gruppen- Krankentagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Gruppen_Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02712":
            case "Gruppen- Krankentagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Gruppen_Krankentagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02713":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung substitutiv":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_substitutiv;
                return true;
            case "02714":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02715":
            case "Selbstständige Gruppen- Krankenhaustagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02716":
            case "Sonstige selbstständige Gruppenteilversicherung substitutiv":
                result = VersicherungsCode.Sonstige_selbststaendige_Gruppenteilversicherung_substitutiv;
                return true;
            case "02717":
            case "Sonstige selbstständige Gruppenteilversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Sonstige_selbststaendige_Gruppenteilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02718":
            case "Sonstige selbstständige Gruppenteilversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Sonstige_selbststaendige_Gruppenteilversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02719":
            case "Gruppen- Pflegepflichtversicherung":
                result = VersicherungsCode.Gruppen_Pflegepflichtversicherung;
                return true;
            case "02720":
            case "Freiwillige Gruppen- Pflegekostenversicherung substitutiv":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegekostenversicherung_substitutiv;
                return true;
            case "02721":
            case "Freiwillige Gruppen- Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02722":
            case "Freiwillige Gruppen- Pflegekostenversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegekostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "02723":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung substitutiv":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_substitutiv;
                return true;
            case "02724":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "02725":
            case "Freiwillige Gruppen- Pflegetagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Freiwillige_Gruppen_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "028":
            case "Pflegekrankenversicherung":
                result = VersicherungsCode.Pflegekrankenversicherung;
                return true;
            case "0281":
            case "Pflegepflichtversicherung":
                result = VersicherungsCode.Pflegepflichtversicherung;
                return true;
            case "0282":
            case "Freiwillige Pflegekostenversicherung substitutiv":
                result = VersicherungsCode.Freiwillige_Pflegekostenversicherung_substitutiv;
                return true;
            case "0283":
            case "Freiwillige Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Freiwillige_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0284":
            case "Freiwillige Pflegekostenversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Freiwillige_Pflegekostenversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "0285":
            case "Freiwillige Pflegetagegeldversicherung substitutiv":
                result = VersicherungsCode.Freiwillige_Pflegetagegeldversicherung_substitutiv;
                return true;
            case "0286":
            case "Freiwillige Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung":
                result = VersicherungsCode.Freiwillige_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung;
                return true;
            case "0287":
            case "Freiwillige Pflegetagegeldversicherung nach Art der Schadenversicherung":
                result = VersicherungsCode.Freiwillige_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung;
                return true;
            case "029":
            case "Übrige und nicht aufgegliederte Krankenversicherung (einschließlich der Beihilfeablöseversicherung)":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Krankenversicherung;
                return true;
            case "03":
            case "Allgemeine Unfallversicherung":
                result = VersicherungsCode.Allgemeine_Unfallversicherung;
                return true;
            case "031":
            case "Einzelunfallversicherung ohne Beitragsrückgewähr":
                result = VersicherungsCode.Einzelunfallversicherung_ohne_Beitragsrueckgewaehr;
                return true;
            case "03101":
            case "Unfallvollversicherung (ohne Kennzahlen 03.1.02 und 03.1.03)":
                result = VersicherungsCode.Unfallvollversicherung;
                return true;
            case "03102":
            case "Volks- Unfallvollversicherung":
                result = VersicherungsCode.Volks_Unfallvollversicherung;
                return true;
            case "03103":
            case "Unfallvollversicherung aus der FUSt- Versicherung":
                result = VersicherungsCode.Unfallvollversicherung_aus_der_FUSt_Versicherung;
                return true;
            case "03104":
            case "Versicherung gegen außerberufliche Unfälle":
                result = VersicherungsCode.Versicherung_gegen_ausserberufliche_Unfaelle;
                return true;
            case "03105":
            case "Reiseunfallversicherung":
                result = VersicherungsCode.Reiseunfallversicherung;
                return true;
            case "03106":
            case "Sofortunfallversicherung":
                result = VersicherungsCode.Sofortunfallversicherung;
                return true;
            case "03107":
            case "Luftfahrtunfallversicherung":
                result = VersicherungsCode.Luftfahrtunfallversicherung;
                return true;
            case "03108":
            case "Lebenslängliche Verkehrsmittelunfallversicherung":
                result = VersicherungsCode.Lebenslaengliche_Verkehrsmittelunfallversicherung;
                return true;
            case "03109":
            case "Sportbootinsassenunfallversicherung":
                result = VersicherungsCode.Sportbootinsassenunfallversicherung;
                return true;
            case "03199":
            case "Übrige und nicht aufgegliederte Einzelunfallversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Einzelunfallversicherung;
                return true;
            case "033":
            case "Gruppen- Unfallversicherung ohne Beitragsrückgewähr":
                result = VersicherungsCode.Gruppen_Unfallversicherung_ohne_Beitragsrueckgewaehr;
                return true;
            case "0331":
            case "Gruppen- Unfallvollversicherung":
                result = VersicherungsCode.Gruppen_Unfallvollversicherung;
                return true;
            case "0333":
            case "Gruppen- Unfallteilversicherung":
                result = VersicherungsCode.Gruppen_Unfallteilversicherung;
                return true;
            case "034":
            case "Probandenversicherung":
                result = VersicherungsCode.Probandenversicherung;
                return true;
            case "035":
            case "Kraftfahrtunfallversicherung (einschließlich der namentlichen Kraftfahrtunfallversicherung)":
                result = VersicherungsCode.Kraftfahrtunfallversicherung;
                return true;
            case "038":
            case "Unfallversicherung mit Beitragsrückgewähr":
                result = VersicherungsCode.Unfallversicherung_mit_Beitragsrueckgewaehr;
                return true;
            case "0381":
            case "Einzel- Unfallversicherung":
                result = VersicherungsCode.Einzel_Unfallversicherung;
                return true;
            case "0382":
            case "Gruppen- Unfallversicherung":
                result = VersicherungsCode.Gruppen_Unfallversicherung;
                return true;
            case "039":
            case "Übrige und nicht aufgegliederte allgemeine Unfallversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_allgemeine_Unfallversicherung;
                return true;
            case "04":
            case "Haftpflichtversicherung":
                result = VersicherungsCode.Haftpflichtversicherung;
                return true;
            case "041":
            case "Privathaftpflichtversicherung (einschließlich Sportboot- und Hundehalterhaftpflichtversicherung)":
                result = VersicherungsCode.Privathaftpflichtversicherung;
                return true;
            case "042":
            case "Betriebs- und Berufshaftpflichtversicherung":
                result = VersicherungsCode.Betriebs_und_Berufshaftpflichtversicherung;
                return true;
            case "0421":
            case "Industrie- und Handelsbetriebe":
                result = VersicherungsCode.Industrie_und_Handelsbetriebe;
                return true;
            case "0422":
            case "Baugewerbe (einschließlich Architekten und Bauingeneure)":
                result = VersicherungsCode.Baugewerbe;
                return true;
            case "0423":
            case "Sonstige Betriebs- und Berufshaftpflichtversicherung":
                result = VersicherungsCode.Sonstige_Betriebs_und_Berufshaftpflichtversicherung;
                return true;
            case "043":
            case "Umwelt- Haftpflichtversicherung":
                result = VersicherungsCode.Umwelt_Haftpflichtversicherung;
                return true;
            case "0431":
            case "Gewässerschaden- Haftpflichtversicherung":
                result = VersicherungsCode.Gewaesserschaden_Haftpflichtversicherung;
                return true;
            case "0432":
            case "Umwelthaftpflicht- Modell":
                result = VersicherungsCode.Umwelthaftpflicht_Modell;
                return true;
            case "044":
            case "Vermögensschaden- Haftpflichtversicherung":
                result = VersicherungsCode.Vermoegensschaden_Haftpflichtversicherung;
                return true;
            case "045":
            case "Verkehrshaftungsversicherung (einschließlich der Speditions- und Rollfuhrversicherung)":
                result = VersicherungsCode.Verkehrshaftungsversicherung;
                return true;
            case "046":
            case "Strahlen- und Atomanlagen- Haftpflichtversicherung":
                result = VersicherungsCode.Strahlen_und_Atomanlagen_Haftpflichtversicherung;
                return true;
            case "0461":
            case "Strahlen- Haftpflichtversicherung":
                result = VersicherungsCode.Strahlen_Haftpflichtversicherung;
                return true;
            case "0462":
            case "Atomanlagen- Haftpflichtversicherung":
                result = VersicherungsCode.Atomanlagen_Haftpflichtversicherung;
                return true;
            case "047":
            case "Feuerhaftungsversicherung":
                result = VersicherungsCode.Feuerhaftungsversicherung;
                return true;
            case "048":
            case "See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko) sowie Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge":
                result = VersicherungsCode.See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung_sowie_Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge;
                return true;
            case "0481":
            case "Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge mit eigenem Antrieb":
                result = VersicherungsCode.Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_mit_eigenem_Antrieb;
                return true;
            case "0482":
            case "Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge ohne eigenen Antrieb":
                result = VersicherungsCode.Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_ohne_eigenen_Antrieb;
                return true;
            case "0483":
            case "See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko)":
                result = VersicherungsCode.See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung;
                return true;
            case "049":
            case "Übrige und nicht aufgegliederte Haftpflichtversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Haftpflichtversicherung;
                return true;
            case "04901":
            case "Haus- und Grundbesitzerhaftpflichtversicherung":
                result = VersicherungsCode.Haus_und_Grundbesitzerhaftpflichtversicherung;
                return true;
            case "04902":
            case "Kraftfahrzeug- Parkplatzversicherung":
                result = VersicherungsCode.Kraftfahrzeug_Parkplatzversicherung;
                return true;
            case "04903":
            case "Kühlgüterhaftpflichtversicherung":
                result = VersicherungsCode.Kuehlgueterhaftpflichtversicherung;
                return true;
            case "04999":
            case "Sonstige Haftpflichtversicherung":
                result = VersicherungsCode.Sonstige_Haftpflichtversicherung;
                return true;
            case "05":
            case "Kraftfahrtversicherung":
                result = VersicherungsCode.Kraftfahrtversicherung;
                return true;
            case "051":
            case "Kraftfahrzeug- Haftpflichtversicherung":
                result = VersicherungsCode.Kraftfahrzeug_Haftpflichtversicherung;
                return true;
            case "052":
            case "Fahrzeugvollversicherung":
                result = VersicherungsCode.Fahrzeugvollversicherung;
                return true;
            case "053":
            case "Fahrzeugteilversicherung":
                result = VersicherungsCode.Fahrzeugteilversicherung;
                return true;
            case "055":
            case "Sonstige Kraftfahrtversicherung (05.2 und 05.3 insgesamt)":
                result = VersicherungsCode.Sonstige_Kraftfahrtversicherung;
                return true;
            case "059":
            case "Übrige und nicht aufgegliederte Kraftfahrtversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Kraftfahrtversicherung;
                return true;
            case "06":
            case "Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)":
                result = VersicherungsCode.Luftfahrtversicherung;
                return true;
            case "063":
            case "Luftfahrzeug- Kaskoversicherung":
                result = VersicherungsCode.Luftfahrzeug_Kaskoversicherung;
                return true;
            case "065":
            case "Raumfahrzeug- Kaskoversicherung":
                result = VersicherungsCode.Raumfahrzeug_Kaskoversicherung;
                return true;
            case "0651":
            case "Pre- Launch- Versicherung":
                result = VersicherungsCode.Pre_Launch_Versicherung;
                return true;
            case "0652":
            case "Launch- Versicherung":
                result = VersicherungsCode.Launch_Versicherung;
                return true;
            case "0653":
            case "In- Orbit- Versicherung":
                result = VersicherungsCode.In_Orbit_Versicherung;
                return true;
            case "069":
            case "Übrige und nicht aufgegliederte Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Luftfahrtversicherung;
                return true;
            case "07":
            case "Rechtsschutzversicherung":
                result = VersicherungsCode.Rechtsschutzversicherung;
                return true;
            case "071":
            case "Rechtsschutzversicherung nach ARB":
                result = VersicherungsCode.Rechtsschutzversicherung_nach_ARB;
                return true;
            case "0711":
            case "Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsCode.Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0712":
            case "Fahrzeug- Rechtsschutzversicherung":
                result = VersicherungsCode.Fahrzeug_Rechtsschutzversicherung;
                return true;
            case "0713":
            case "Fahrer- Rechtsschutzversicherung":
                result = VersicherungsCode.Fahrer_Rechtsschutzversicherung;
                return true;
            case "0714":
            case "Rechtsschutzversicherung für Gewerbetreibende und freiberuflich Tätige":
                result = VersicherungsCode.Rechtsschutzversicherung_fuer_Gewerbetreibende_und_freiberuflich_Taetige;
                return true;
            case "0715":
            case "Familien- Rechtsschutzversicherung":
                result = VersicherungsCode.Familien_Rechtsschutzversicherung;
                return true;
            case "0716":
            case "Familien- und Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsCode.Familien_und_Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0717":
            case "Landwirtschafts- und Verkehrs- Rechtsschutzversicherung":
                result = VersicherungsCode.Landwirtschafts_und_Verkehrs_Rechtsschutzversicherung;
                return true;
            case "0718":
            case "Rechtsschutzversicherung für Vereine":
                result = VersicherungsCode.Rechtsschutzversicherung_fuer_Vereine;
                return true;
            case "0719":
            case "Rechtsschutzversicherung für Grundstückseigentum und Miete":
                result = VersicherungsCode.Rechtsschutzversicherung_fuer_Grundstueckseigentum_und_Miete;
                return true;
            case "072":
            case "Vermögensschaden-Rechtsschutzversicherungen für Aufsichtsräte, Beiräte, Vorstände (VRB)":
                result = VersicherungsCode.Vermoegensschaden_Rechtsschutzversicherungen_fuer_Aufsichtsraete_Beiraete_Vorstaende;
                return true;
            case "073":
            case "Rechtsschutzversicherung für Träger öffentlicher Aufgaben (ÖRB)":
                result = VersicherungsCode.Rechtsschutzversicherung_fuer_Traeger_oeffentlicher_Aufgaben;
                return true;
            case "075":
            case "Kraftfahrt- Strafrechtsschutzversicherung mit Auslands- Zivilrechtsschutzversicherung":
                result = VersicherungsCode.Kraftfahrt_Strafrechtsschutzversicherung_mit_Auslands_Zivilrechtsschutzversicherung;
                return true;
            case "076":
            case "Spezial- Strafrechtsschutzversicherung der Unternehmen":
                result = VersicherungsCode.Spezial_Strafrechtsschutzversicherung_der_Unternehmen;
                return true;
            case "079":
            case "Übrige und nicht aufgegliederte Rechtsschutzversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Rechtsschutzversicherung;
                return true;
            case "08":
            case "Feuerversicherung":
                result = VersicherungsCode.Feuerversicherung;
                return true;
            case "081":
            case "Feuer- Industrie- Versicherung":
                result = VersicherungsCode.Feuer_Industrie_Versicherung;
                return true;
            case "082":
            case "Landwirtschaftliche Feuerversicherung":
                result = VersicherungsCode.Landwirtschaftliche_Feuerversicherung;
                return true;
            case "083":
            case "Sonstige Feuerversicherung (einschließlich der Waldbrandversicherung)":
                result = VersicherungsCode.Sonstige_Feuerversicherung;
                return true;
            case "089":
            case "Übrige und nicht aufgegliederte Feuerversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Feuerversicherung;
                return true;
            case "09":
            case "Einbruchdiebstahl und Raub (ED)- Versicherung":
                result = VersicherungsCode.Einbruchdiebstahl_und_Raub_Versicherung;
                return true;
            case "099":
            case "übrige und nicht aufgegliederte ED-Versicherung":
                result = VersicherungsCode.uebrige_und_nicht_aufgegliederte_ED_Versicherung;
                return true;
            case "10":
            case "Leitungswasser (Lw)- Versicherung":
                result = VersicherungsCode.Leitungswasser_Versicherung;
                return true;
            case "109":
            case "Übrige und nicht aufgegliederte Lw- Versicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Lw_Versicherung;
                return true;
            case "11":
            case "Glasversicherung":
                result = VersicherungsCode.Glasversicherung;
                return true;
            case "12":
            case "Sturmversicherung":
                result = VersicherungsCode.Sturmversicherung;
                return true;
            case "121":
                result = VersicherungsCode.Sturmversicherung_121;
                return true;
            case "123":
            case "Gärtnerei- Sturmversicherung":
                result = VersicherungsCode.Gaertnerei_Sturmversicherung;
                return true;
            case "124":
            case "Versicherung weiterer Elementarschäden bei gewerblichen Risiken":
                result = VersicherungsCode.Versicherung_weiterer_Elementarschaeden_bei_gewerblichen_Risiken;
                return true;
            case "13":
            case "Verbundene Hausratversicherung":
                result = VersicherungsCode.Verbundene_Hausratversicherung;
                return true;
            case "131":
            case "Verbundene Hausratversicherung ohne Einschluss weiterer Elementarschäden":
                result = VersicherungsCode.Verbundene_Hausratversicherung_ohne_Einschluss_weiterer_Elementarschaeden;
                return true;
            case "132":
            case "Verbundene Hausratversicherung unter Einschluss weiterer Elementarschäden":
                result = VersicherungsCode.Verbundene_Hausratversicherung_unter_Einschluss_weiterer_Elementarschaeden;
                return true;
            case "14":
            case "Verbundene Wohngebäudeversicherung":
                result = VersicherungsCode.Verbundene_Wohngebaeudeversicherung;
                return true;
            case "141":
            case "Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden":
                result = VersicherungsCode.Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden;
                return true;
            case "142":
                result = VersicherungsCode.Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden_142;
                return true;
            case "15":
            case "Hagelversicherung":
                result = VersicherungsCode.Hagelversicherung;
                return true;
            case "16":
            case "Tierversicherung":
                result = VersicherungsCode.Tierversicherung;
                return true;
            case "161":
            case "Langfristige Tierlebensversicherung":
                result = VersicherungsCode.Langfristige_Tierlebensversicherung;
                return true;
            case "1611":
            case "Pferdelebensversicherung":
                result = VersicherungsCode.Pferdelebensversicherung;
                return true;
            case "1612":
            case "Rindviehlebensversicherung":
                result = VersicherungsCode.Rindviehlebensversicherung;
                return true;
            case "1613":
            case "Schweinelebensversicherung":
                result = VersicherungsCode.Schweinelebensversicherung;
                return true;
            case "1614":
            case "Geflügellebensversicherung":
                result = VersicherungsCode.Gefluegellebensversicherung;
                return true;
            case "1616":
            case "Hundelebensversicherung":
                result = VersicherungsCode.Hundelebensversicherung;
                return true;
            case "1619":
            case "Übrige langfristige Tierlebensversicherung":
                result = VersicherungsCode.Uebrige_langfristige_Tierlebensversicherung;
                return true;
            case "162":
            case "Kurzfristige Tierversicherung":
                result = VersicherungsCode.Kurzfristige_Tierversicherung;
                return true;
            case "1621":
            case "Trächtigkeits-, Leibesfrucht- und Fohlenversicherung":
                result = VersicherungsCode.Traechtigkeits_Leibesfrucht_und_Fohlenversicherung;
                return true;
            case "1622":
            case "Weidetierversicherung":
                result = VersicherungsCode.Weidetierversicherung;
                return true;
            case "1623":
            case "Mastviehversicherung":
                result = VersicherungsCode.Mastviehversicherung;
                return true;
            case "1624":
            case "Schlachttierversicherung (einschließlich Schlachtwertversicherung)":
                result = VersicherungsCode.Schlachttierversicherung;
                return true;
            case "1625":
            case "Operations-(Kastrations)-Versicherung":
                result = VersicherungsCode.Operations_Versicherung;
                return true;
            case "1629":
            case "Übrige kurzfristige Tierversicherung":
                result = VersicherungsCode.Uebrige_kurzfristige_Tierversicherung;
                return true;
            case "169":
            case "Übrige und nicht aufgegliederte Tierversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Tierversicherung;
                return true;
            case "17":
            case "Technische Versicherung":
                result = VersicherungsCode.Technische_Versicherung;
                return true;
            case "171":
            case "Maschinenversicherung (einschließlich der Baugeräteversicherung)":
                result = VersicherungsCode.Maschinenversicherung;
                return true;
            case "172":
            case "Elektronikversicherung":
                result = VersicherungsCode.Elektronikversicherung;
                return true;
            case "174":
            case "Montageversicherung":
                result = VersicherungsCode.Montageversicherung;
                return true;
            case "175":
            case "Haushaltsgeräteversicherung":
                result = VersicherungsCode.Haushaltsgeraeteversicherung;
                return true;
            case "176":
            case "Bauleistungsversicherung":
                result = VersicherungsCode.Bauleistungsversicherung;
                return true;
            case "179":
            case "Übrige technische Versicherungen":
                result = VersicherungsCode.Uebrige_technische_Versicherungen;
                return true;
            case "1791":
            case "Übrige technische Sachschadenversicherungen":
                result = VersicherungsCode.Uebrige_technische_Sachschadenversicherungen;
                return true;
            case "17911":
            case "Reparaturkostenversicherung von Kraftwagen":
                result = VersicherungsCode.Reparaturkostenversicherung_von_Kraftwagen;
                return true;
            case "17912":
            case "Reparaturkostenversicherung von Fernseh- und Videogeräten":
                result = VersicherungsCode.Reparaturkostenversicherung_von_Fernseh_und_Videogeraeten;
                return true;
            case "17913":
            case "Reparaturkostenversicherung von Haushaltsgeräten":
                result = VersicherungsCode.Reparaturkostenversicherung_von_Haushaltsgeraeten;
                return true;
            case "17914":
            case "Garantieverlängerungsversicherung von technischen Geräten":
                result = VersicherungsCode.Garantieverlaengerungsversicherung_von_technischen_Geraeten;
                return true;
            case "1799":
            case "Sonstige technische Versicherungen":
                result = VersicherungsCode.Sonstige_technische_Versicherungen;
                return true;
            case "18":
            case "Einheitsversicherung":
                result = VersicherungsCode.Einheitsversicherung;
                return true;
            case "181":
            case "Allgemeine Einheitsversicherung":
                result = VersicherungsCode.Allgemeine_Einheitsversicherung;
                return true;
            case "182":
            case "Juwelierwaren- Einheitsversicherung":
                result = VersicherungsCode.Juwelierwaren_Einheitsversicherung;
                return true;
            case "183":
            case "Rauchwaren- Einheitsversicherung":
                result = VersicherungsCode.Rauchwaren_Einheitsversicherung;
                return true;
            case "184":
            case "Textilveredlung- Einheitsversicherung":
                result = VersicherungsCode.Textilveredlung_Einheitsversicherung;
                return true;
            case "185":
            case "Wäscheschutz- Einheitsversicherung":
                result = VersicherungsCode.Waescheschutz_Einheitsversicherung;
                return true;
            case "189":
            case "Übrige und nicht aufgegliederte Einheitsversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Einheitsversicherung;
                return true;
            case "19":
            case "Transportversicherung":
                result = VersicherungsCode.Transportversicherung;
                return true;
            case "191":
            case "Kaskoversicherung":
                result = VersicherungsCode.Kaskoversicherung;
                return true;
            case "1911":
            case "Seeschifffahrts- Kaskoversicherung":
                result = VersicherungsCode.Seeschifffahrts_Kaskoversicherung;
                return true;
            case "1912":
            case "Binnensee- und Flussschifffahrts- Kaskoversicherung":
                result = VersicherungsCode.Binnensee_und_Flussschifffahrts_Kaskoversicherung;
                return true;
            case "1915":
            case "Schienenfahrzeug- Kaskoversicherung":
                result = VersicherungsCode.Schienenfahrzeug_Kaskoversicherung;
                return true;
            case "1916":
            case "Sportboot- Kaskoversicherung":
                result = VersicherungsCode.Sportboot_Kaskoversicherung;
                return true;
            case "1917":
            case "Baurisikoversicherung":
                result = VersicherungsCode.Baurisikoversicherung;
                return true;
            case "1919":
            case "Übrige Kaskoversicherung":
                result = VersicherungsCode.Uebrige_Kaskoversicherung;
                return true;
            case "192":
            case "Transportgüterversicherung":
                result = VersicherungsCode.Transportgueterversicherung;
                return true;
            case "1922":
            case "Transportgüterversicherung (ohne die Kennzahlen 19.2.3 bis 19.2.6)":
                result = VersicherungsCode.Transportgueterversicherung_1922;
                return true;
            case "1923":
            case "Reiselagerversicherung":
                result = VersicherungsCode.Reiselagerversicherung;
                return true;
            case "1925":
            case "Container- Kaskoversicherung":
                result = VersicherungsCode.Container_Kaskoversicherung;
                return true;
            case "1926":
            case "Tiertransportversicherung":
                result = VersicherungsCode.Tiertransportversicherung;
                return true;
            case "1929":
            case "Übrige Warenversicherung":
                result = VersicherungsCode.Uebrige_Warenversicherung;
                return true;
            case "193":
            case "Valorenversicherung (gewerblich)":
                result = VersicherungsCode.Valorenversicherung;
                return true;
            case "194":
            case "Filmversicherung (ohne die Kennzahl 29.2.01)":
                result = VersicherungsCode.Filmversicherung;
                return true;
            case "197":
            case "Kriegsrisikoversicherung":
                result = VersicherungsCode.Kriegsrisikoversicherung;
                return true;
            case "199":
            case "Übrige und nicht aufgegliederte Transportversicherung (einschließlich Versicherung von Offshore- Risiken)":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Transportversicherung;
                return true;
            case "20":
            case "Kredit- und Kautionsversicherung":
                result = VersicherungsCode.Kredit_und_Kautionsversicherung;
                return true;
            case "201":
            case "Kautionsversicherung (einschließlich Baugarantieversicherung)":
                result = VersicherungsCode.Kautionsversicherung;
                return true;
            case "202":
            case "Delkrederversicherung":
                result = VersicherungsCode.Delkrederversicherung;
                return true;
            case "2021":
            case "Ausfuhrkreditversicherung":
                result = VersicherungsCode.Ausfuhrkreditversicherung;
                return true;
            case "2022":
            case "Warenkreditversicherung":
                result = VersicherungsCode.Warenkreditversicherung;
                return true;
            case "2023":
            case "Investitionsgüterkreditversicherung":
                result = VersicherungsCode.Investitionsgueterkreditversicherung;
                return true;
            case "2024":
            case "Konsumentenkreditversicherung":
                result = VersicherungsCode.Konsumentenkreditversicherung;
                return true;
            case "2029":
            case "Übrige und nicht aufgegliederte Delkrederversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Delkrederversicherung;
                return true;
            case "209":
            case "Übrige und nicht aufgegliederte Kredit- und Kautionsversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Kredit_und_Kautionsversicherung;
                return true;
            case "21":
            case "Versicherung zusätzlicher Gefahren zur Feuer- bzw. Feuer- Betriebsunterbrechungs- Versicherung (Extend Coverage (EC)- Versicherung)":
                result = VersicherungsCode.Versicherung_zusaetzlicher_Gefahren_zur_Feuer_bzw_Feuer_Betriebsunterbrechungs_Versicherung_Versicherung;
                return true;
            case "23":
            case "Betriebsunterbrechungs- Versicherung":
                result = VersicherungsCode.Betriebsunterbrechungs_Versicherung;
                return true;
            case "231":
            case "Feuer-(Groß) Betriebsunterbrechungs- Versicherung":
                result = VersicherungsCode.Feuer_Betriebsunterbrechungs_Versicherung;
                return true;
            case "232":
            case "Technische- Betriebsunterbrechungs- Versicherung/ MBU Elektronik":
                result = VersicherungsCode.Technische_Betriebsunterbrechungs_Versicherung_MBU_Elektronik;
                return true;
            case "233":
            case "Sonstige Betriebsunterbrechungsversicherungen":
                result = VersicherungsCode.Sonstige_Betriebsunterbrechungsversicherungen;
                return true;
            case "24":
            case "Beistandsleistungsversicherung":
                result = VersicherungsCode.Beistandsleistungsversicherung;
                return true;
            case "241":
            case "Schutzbriefversicherung":
                result = VersicherungsCode.Schutzbriefversicherung;
                return true;
            case "242":
            case "Sportboot- Serviceversicherung":
                result = VersicherungsCode.Sportboot_Serviceversicherung;
                return true;
            case "243":
            case "Flugrückholkostenversicherung":
                result = VersicherungsCode.Flugrueckholkostenversicherung;
                return true;
            case "244":
            case "Schutzbriefversicherung unter Einschluss der sog. Mallorca- Police":
                result = VersicherungsCode.Schutzbriefversicherung_unter_Einschluss_der_sog_Mallorca_Police;
                return true;
            case "249":
            case "Übrige und nicht aufgegliederte Beistandsleistungsversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Beistandsleistungsversicherung;
                return true;
            case "25":
            case "Luft- und Raumfahrzeug- Haftpflichtversicherung":
                result = VersicherungsCode.Luft_und_Raumfahrzeug_Haftpflichtversicherung;
                return true;
            case "251":
            case "Luftfahrt- Haftpflichtversicherung (einschließlich der Luftfrachtführer- Haftpflichtversicherung)":
                result = VersicherungsCode.Luftfahrt_Haftpflichtversicherung;
                return true;
            case "252":
            case "Raumfahrzeug- Haftpflichtversicherung":
                result = VersicherungsCode.Raumfahrzeug_Haftpflichtversicherung;
                return true;
            case "29":
            case "Sonstige Schadenversicherung, z.B. Maschinen- Garantie- Versicherung":
                result = VersicherungsCode.Sonstige_Schadenversicherung_z_B_Maschinen_Garantie_Versicherung;
                return true;
            case "291":
            case "Sonstige Sachschadenversicherung":
                result = VersicherungsCode.Sonstige_Sachschadenversicherung;
                return true;
            case "29101":
            case "Schwamm- und Hausbockkäferversicherung":
                result = VersicherungsCode.Schwamm_und_Hausbockkaeferversicherung;
                return true;
            case "29102":
            case "Ausstellungsversicherung":
                result = VersicherungsCode.Ausstellungsversicherung;
                return true;
            case "29103":
            case "Fahrradversicherung":
                result = VersicherungsCode.Fahrradversicherung;
                return true;
            case "29104":
            case "Garderobenversicherung":
                result = VersicherungsCode.Garderobenversicherung;
                return true;
            case "29105":
            case "Jagd- und Sportwaffenversicherung":
                result = VersicherungsCode.Jagd_und_Sportwaffenversicherung;
                return true;
            case "29106":
            case "Musikinstrumenteversicherung":
                result = VersicherungsCode.Musikinstrumenteversicherung;
                return true;
            case "29107":
            case "Fotoapparateversicherung":
                result = VersicherungsCode.Fotoapparateversicherung;
                return true;
            case "29108":
            case "Kühlgüterversicherung":
                result = VersicherungsCode.Kuehlgueterversicherung;
                return true;
            case "29109":
            case "Warenversicherung in Tiefkühlanlagen":
                result = VersicherungsCode.Warenversicherung_in_Tiefkuehlanlagen;
                return true;
            case "29110":
            case "Atomanlagen- Sachversicherung":
                result = VersicherungsCode.Atomanlagen_Sachversicherung;
                return true;
            case "29111":
            case "Automatenversicherung":
                result = VersicherungsCode.Automatenversicherung;
                return true;
            case "29112":
            case "Reisegepäckversicherung":
                result = VersicherungsCode.Reisegepaeckversicherung;
                return true;
            case "29113":
            case "Kraftfahrtgepäckversicherung":
                result = VersicherungsCode.Kraftfahrtgepaeckversicherung;
                return true;
            case "29114":
            case "Valorenversicherung (privat)":
                result = VersicherungsCode.Valorenversicherung_29114;
                return true;
            case "29115":
            case "Freizeitsportgeräteversicherung (einschließlich der Skibruchversicherung)":
                result = VersicherungsCode.Freizeitsportgeraeteversicherung;
                return true;
            case "29116":
            case "Verderbschadenversicherung":
                result = VersicherungsCode.Verderbschadenversicherung;
                return true;
            case "29117":
            case "Gärtnereri- Verderbschadenversicherung":
                result = VersicherungsCode.Gaertnereri_Verderbschadenversicherung;
                return true;
            case "29119":
            case "Campingversicherung":
                result = VersicherungsCode.Campingversicherung;
                return true;
            case "29120":
            case "Versicherung von Kunstgegenständen":
                result = VersicherungsCode.Versicherung_von_Kunstgegenstaenden;
                return true;
            case "29121":
            case "Versicherung von Auktionen":
                result = VersicherungsCode.Versicherung_von_Auktionen;
                return true;
            case "29122":
            case "Brillenversicherung":
                result = VersicherungsCode.Brillenversicherung;
                return true;
            case "29199":
            case "Übrige und nicht aufgegliederte Sachschadenversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Sachschadenversicherung;
                return true;
            case "293":
            case "Sonstige Vermögensschadenversicherung":
                result = VersicherungsCode.Sonstige_Vermoegensschadenversicherung;
                return true;
            case "29301":
            case "Boykott- und Streikversicherung":
                result = VersicherungsCode.Boykott_und_Streikversicherung;
                return true;
            case "29302":
            case "Reise-Rücktrittskostenversicherung":
                result = VersicherungsCode.Reise_Ruecktrittskostenversicherung;
                return true;
            case "29304":
            case "Lizenzverlustversicherung":
                result = VersicherungsCode.Lizenzverlustversicherung;
                return true;
            case "29305":
            case "Tierkrankenversicherung":
                result = VersicherungsCode.Tierkrankenversicherung;
                return true;
            case "29306":
            case "Maschinengarantieversicherung":
                result = VersicherungsCode.Maschinengarantieversicherung;
                return true;
            case "29307":
            case "Datenmissbrauchsversicherung":
                result = VersicherungsCode.Datenmissbrauchsversicherung;
                return true;
            case "29308":
            case "Scheckkartenversicherung von Scheckkarteninhabern":
                result = VersicherungsCode.Scheckkartenversicherung_von_Scheckkarteninhabern;
                return true;
            case "29310":
            case "Insolvenzversicherung":
                result = VersicherungsCode.Insolvenzversicherung;
                return true;
            case "29311":
            case "Schlüsselverlustsicherung":
                result = VersicherungsCode.Schluesselverlustsicherung;
                return true;
            case "29312":
            case "Garantieversicherung von Kraftfahrzeugen":
                result = VersicherungsCode.Garantieversicherung_von_Kraftfahrzeugen;
                return true;
            case "29313":
            case "Mietverlustversicherung":
                result = VersicherungsCode.Mietverlustversicherung;
                return true;
            case "29314":
            case "Raumfahrzeug-Vermögensschadenversicherung":
                result = VersicherungsCode.Raumfahrzeug_Vermoegensschadenversicherung;
                return true;
            case "29315":
            case "Milchgeldausfallversicherung":
                result = VersicherungsCode.Milchgeldausfallversicherung;
                return true;
            case "29316":
            case "Produktschutzversicherung":
                result = VersicherungsCode.Produktschutzversicherung;
                return true;
            case "29399":
            case "Übrige und nicht aufgegliederte Vermögensschadenversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Vermoegensschadenversicherung;
                return true;
            case "294":
            case "Sonstige gemischte Versicherung":
                result = VersicherungsCode.Sonstige_gemischte_Versicherung;
                return true;
            case "29402":
            case "Tank- und Fassleckageversicherung":
                result = VersicherungsCode.Tank_und_Fassleckageversicherung;
                return true;
            case "29403":
            case "Filmtheater- Einheitsversicherung":
                result = VersicherungsCode.Filmtheater_Einheitsversicherung;
                return true;
            case "29404":
            case "Versicherung von Winzerbetrieben gegen Frostschäden":
                result = VersicherungsCode.Versicherung_von_Winzerbetrieben_gegen_Frostschaeden;
                return true;
            case "29405":
            case "Allgefahrenversicherung":
                result = VersicherungsCode.Allgefahrenversicherung;
                return true;
            case "29406":
            case "Inhaltsversicherung für Geschäfte und Betriebe":
                result = VersicherungsCode.Inhaltsversicherung_fuer_Geschaefte_und_Betriebe;
                return true;
            case "29407":
            case "Erweiterte Haushaltsversicherung":
                result = VersicherungsCode.Erweiterte_Haushaltsversicherung;
                return true;
            case "29408":
            case "Dynamische Sachversicherung":
                result = VersicherungsCode.Dynamische_Sachversicherung;
                return true;
            case "29499":
            case "Übrige und nicht aufgegliederte gemischte Versicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_gemischte_Versicherung;
                return true;
            case "296":
            case "Vertrauensschadenversicherung":
                result = VersicherungsCode.Vertrauensschadenversicherung;
                return true;
            case "29601":
            case "Vertrauensschadenversicherung (ohne Kennzahlen 26.6.02 und 29.6.04)":
                result = VersicherungsCode.Vertrauensschadenversicherung_29601;
                return true;
            case "29602":
            case "Computermissbrauchsversicherung":
                result = VersicherungsCode.Computermissbrauchsversicherung;
                return true;
            case "29603":
            case "Versicherung gegen Veruntreuung von Selbstfahrervermieterfahrzeugen":
                result = VersicherungsCode.Versicherung_gegen_Veruntreuung_von_Selbstfahrervermieterfahrzeugen;
                return true;
            case "29604":
            case "Eigenschadenversicherung von Körperschaften und Anstalten des öffentlichen Rechts":
                result = VersicherungsCode.Eigenschadenversicherung_von_Koerperschaften_und_Anstalten_des_oeffentlichen_Rechts;
                return true;
            case "29699":
            case "Übrige und nicht aufgegliederte Vertrauensschadenversicherung":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_Vertrauensschadenversicherung;
                return true;
            case "299":
            case "Übrige und nicht aufgegliederte sonstige Schadenversicherungen":
                result = VersicherungsCode.Uebrige_und_nicht_aufgegliederte_sonstige_Schadenversicherungen;
                return true;
            case "300":
            case "Schaden- und Unfallversicherungen insgesamt":
                result = VersicherungsCode.Schaden_und_Unfallversicherungen_insgesamt;
                return true;
            default:
                return false;
        }
    }
}
