namespace xjustiz.core_dotnet.Models.Codes.Rolle;

public static class RollenCodeMapper
{
    public static RollenCode FromCode(string code)
    {
        return FromString(code);
    }

    public static RollenCode FromString(string value)
    {
        if (TryParse(value, out var result))
        {
            return result;
        }

        throw new System.ArgumentException($"Unknown Rolle: {value}", nameof(value));
    }

    public static bool TryParse(string? value, out RollenCode result)
    {
        result = default;
        if (string.IsNullOrEmpty(value))
        {
            return false;
        }

        switch (value)
        {
            case "001":
            case "Abwesenheitspfleger(in)":
                result = RollenCode.Abwesenheitspfleger;
                return true;
            case "002":
            case "Aliasidentität":
                result = RollenCode.Aliasidentitaet;
                return true;
            case "003":
            case "Angehörige(r)":
                result = RollenCode.Angehoerige;
                return true;
            case "004":
            case "Angeklagte(r)":
                result = RollenCode.Angeklagte;
                return true;
            case "005":
            case "Angeschuldigte(r)":
                result = RollenCode.Angeschuldigte;
                return true;
            case "006":
            case "Annehmende(r)":
                result = RollenCode.Annehmende;
                return true;
            case "007":
            case "Anschlussberufungsbeklagte(r)":
                result = RollenCode.Anschlussberufungsbeklagte;
                return true;
            case "008":
            case "Anschlussberufungskläger(in)":
                result = RollenCode.Anschlussberufungsklaeger;
                return true;
            case "009":
            case "Anschlussbeschwerdeführer(in)":
                result = RollenCode.Anschlussbeschwerdefuehrer;
                return true;
            case "010":
            case "Anschlussbeschwerdegegner(in)":
                result = RollenCode.Anschlussbeschwerdegegner;
                return true;
            case "011":
            case "Anschlussrechtsbeschwerdeführer(in)":
                result = RollenCode.Anschlussrechtsbeschwerdefuehrer;
                return true;
            case "012":
            case "Anschlussrechtsbeschwerdegegner(in)":
                result = RollenCode.Anschlussrechtsbeschwerdegegner;
                return true;
            case "013":
            case "Anschlussrevisionsbeklagte(r)":
                result = RollenCode.Anschlussrevisionsbeklagte;
                return true;
            case "014":
            case "Anschlussrevisionskläger(in)":
                result = RollenCode.Anschlussrevisionsklaeger;
                return true;
            case "015":
            case "Antragsgegner(in)":
                result = RollenCode.Antragsgegner;
                return true;
            case "016":
            case "Antragsteller(in)":
                result = RollenCode.Antragsteller;
                return true;
            case "017":
            case "Anzeigeerstatter(in)":
                result = RollenCode.Anzeigeerstatter;
                return true;
            case "018":
            case "Anzunehmende(r)":
                result = RollenCode.Anzunehmende;
                return true;
            case "019":
            case "Arrestgläubiger(in)":
                result = RollenCode.Arrestglaeubiger;
                return true;
            case "020":
            case "Arrestschuldner(in)":
                result = RollenCode.Arrestschuldner;
                return true;
            case "021":
            case "Aufsichtsbehörde":
                result = RollenCode.Aufsichtsbehoerde;
                return true;
            case "022":
            case "Ausschlagende(r)":
                result = RollenCode.Ausschlagende;
                return true;
            case "023":
            case "Beamter (Beamtin)":
                result = RollenCode.Beamter_Beamtin;
                return true;
            case "024":
            case "Behörde":
                result = RollenCode.Behoerde;
                return true;
            case "025":
            case "Beigeladene(r)":
                result = RollenCode.Beigeladene;
                return true;
            case "026":
            case "Beistand":
                result = RollenCode.Beistand;
                return true;
            case "027":
            case "Bekannte(r)":
                result = RollenCode.Bekannte;
                return true;
            case "028":
            case "Beklagte(r)":
                result = RollenCode.Beklagte;
                return true;
            case "029":
            case "Berufungsbeklagte(r)":
                result = RollenCode.Berufungsbeklagte;
                return true;
            case "030":
            case "Berufungskläger(in)":
                result = RollenCode.Berufungsklaeger;
                return true;
            case "031":
            case "Beschuldigte(r)":
                result = RollenCode.Beschuldigte;
                return true;
            case "032":
            case "Beschwerdeführer(in)":
                result = RollenCode.Beschwerdefuehrer;
                return true;
            case "033":
            case "Beschwerdegegner(in)":
                result = RollenCode.Beschwerdegegner;
                return true;
            case "034":
            case "Besucher(in)":
                result = RollenCode.Besucher;
                return true;
            case "036":
            case "Betreibende(r) Gläubige(r)":
                result = RollenCode.Betreibende_Glaeubige;
                return true;
            case "037":
            case "Betreuer(in)":
                result = RollenCode.Betreuer;
                return true;
            case "038":
            case "Betreute(r)":
                result = RollenCode.Betreute;
                return true;
            case "039":
            case "Betreuungsbehörde":
                result = RollenCode.Betreuungsbehoerde;
                return true;
            case "040":
            case "Betroffene(r)":
                result = RollenCode.Betroffene;
                return true;
            case "041":
            case "Bevollmächtigte(r)":
                result = RollenCode.Bevollmaechtigte;
                return true;
            case "042":
            case "Bewährungshelfer(in)":
                result = RollenCode.Bewaehrungshelfer;
                return true;
            case "043":
            case "Beweisanwalt (-anwältin)":
                result = RollenCode.Beweisanwalt;
                return true;
            case "044":
            case "Bruder (Schwester)":
                result = RollenCode.Bruder_Schwester;
                return true;
            case "045":
            case "Bundeswehrdisziplinaranwalt (-anwältin)":
                result = RollenCode.Bundeswehrdisziplinaranwalt;
                return true;
            case "046":
            case "Bußgeldempfänger(in)":
                result = RollenCode.Bussgeldempfaenger;
                return true;
            case "047":
            case "Cousin(e)":
                result = RollenCode.Cousin;
                return true;
            case "048":
            case "Dienstvorgesetzte(r)":
                result = RollenCode.Dienstvorgesetzte;
                return true;
            case "049":
            case "director":
                result = RollenCode.director;
                return true;
            case "050":
            case "Dolmetscher(in)":
                result = RollenCode.Dolmetscher;
                return true;
            case "051":
            case "Dritte(r)":
                result = RollenCode.Dritte;
                return true;
            case "052":
            case "Drittschuldner(in)":
                result = RollenCode.Drittschuldner;
                return true;
            case "053":
            case "Drittwiderbeklagte(r)":
                result = RollenCode.Drittwiderbeklagte;
                return true;
            case "054":
            case "Drittwiderkläger(in)":
                result = RollenCode.Drittwiderklaeger;
                return true;
            case "056":
            case "Ehemann (Ehefrau)":
                result = RollenCode.Ehemann_Ehefrau;
                return true;
            case "057":
            case "Eigentümer(in)":
                result = RollenCode.Eigentuemer;
                return true;
            case "058":
            case "Eingetragene(r) Lebenspartner(in)":
                result = RollenCode.Eingetragene_Lebenspartner;
                return true;
            case "059":
            case "Einleitungsbehörde":
                result = RollenCode.Einleitungsbehoerde;
                return true;
            case "060":
            case "Eltern":
                result = RollenCode.Eltern;
                return true;
            case "061":
            case "Elternteil":
                result = RollenCode.Elternteil;
                return true;
            case "062":
            case "Enkel(in)":
                result = RollenCode.Enkel;
                return true;
            case "063":
            case "Erbe (Erbin)":
                result = RollenCode.Erbe_Erbin;
                return true;
            case "064":
            case "Erbe (Erbin) (ausschlagend)":
                result = RollenCode.Erbe_Erbin_ausschlagend;
                return true;
            case "065":
            case "Erbe (Erbin) (vorverstorben)":
                result = RollenCode.Erbe_Erbin_vorverstorben;
                return true;
            case "066":
            case "Erblasser(in)":
                result = RollenCode.Erblasser;
                return true;
            case "067":
            case "Ergänzungspfleger(in)":
                result = RollenCode.Ergaenzungspfleger;
                return true;
            case "068":
            case "Erinnerungsführer(in)":
                result = RollenCode.Erinnerungsfuehrer;
                return true;
            case "069":
            case "Erinnerungsgegner(in)":
                result = RollenCode.Erinnerungsgegner;
                return true;
            case "070":
            case "Ersatzbetreuer(in)":
                result = RollenCode.Ersatzbetreuer;
                return true;
            case "071":
            case "Ersteher(in)":
                result = RollenCode.Ersteher;
                return true;
            case "072":
            case "Erwerber(in)":
                result = RollenCode.Erwerber;
                return true;
            case "073":
            case "Erziehungsberechtigte(r)":
                result = RollenCode.Erziehungsberechtigte;
                return true;
            case "074":
            case "Frühere(r) Ehegatte (Ehegattin)":
                result = RollenCode.Fruehere_Ehegatte_Ehegattin;
                return true;
            case "075":
            case "Frühere(r) Beklagte(r)":
                result = RollenCode.Fruehere_Beklagte;
                return true;
            case "076":
            case "Frühere(r) Beteiligte(r)":
                result = RollenCode.Fruehere_Beteiligte;
                return true;
            case "077":
            case "Frühere(r) Gläubiger(in)":
                result = RollenCode.Fruehere_Glaeubiger;
                return true;
            case "078":
            case "Frühere(r) Kläger(in)":
                result = RollenCode.Fruehere_Klaeger;
                return true;
            case "079":
            case "Frühere(r) Soldat(in)":
                result = RollenCode.Fruehere_Soldat;
                return true;
            case "080":
            case "Gegenvormund":
                result = RollenCode.Gegenvormund;
                return true;
            case "081":
            case "Generalbundesanwalt (-anwältin)":
                result = RollenCode.Generalbundesanwalt;
                return true;
            case "082":
            case "Gericht":
                result = RollenCode.Gericht;
                return true;
            case "083":
            case "Gerichtsvollzieher(in)":
                result = RollenCode.Gerichtsvollzieher;
                return true;
            case "084":
            case "Geschädigte(r)":
                result = RollenCode.Geschaedigte;
                return true;
            case "085":
            case "Geschäftsführende(r) Gesellschafter(in)":
                result = RollenCode.Geschaeftsfuehrende_Gesellschafter;
                return true;
            case "086":
            case "Geschäftsführer(in)":
                result = RollenCode.Geschaeftsfuehrer;
                return true;
            case "087":
            case "Gesetzliche(r) Erbe (Erbin)":
                result = RollenCode.Gesetzliche_Erbe_Erbin;
                return true;
            case "088":
            case "Gesetzliche(r) Vertreter(in)":
                result = RollenCode.Gesetzliche_Vertreter;
                return true;
            case "089":
            case "Gläubiger(in)":
                result = RollenCode.Glaeubiger;
                return true;
            case "090":
            case "Großeltern":
                result = RollenCode.Grosseltern;
                return true;
            case "092":
            case "Großvater (Großmutter)":
                result = RollenCode.Grossvater_Grossmutter;
                return true;
            case "093":
            case "Hauptbevollmächtigte(r)":
                result = RollenCode.Hauptbevollmaechtigte;
                return true;
            case "094":
            case "Hoferbe (Hoferbin)":
                result = RollenCode.Hoferbe_Hoferbin;
                return true;
            case "095":
            case "Inhaber(in) der Firma":
                result = RollenCode.Inhaber_der_Firma;
                return true;
            case "096":
            case "Insolvenzverwalter(in)":
                result = RollenCode.Insolvenzverwalter;
                return true;
            case "097":
            case "Jugendamt":
                result = RollenCode.Jugendamt;
                return true;
            case "098":
            case "Kammer":
                result = RollenCode.Kammer;
                return true;
            case "099":
            case "Kammermitglied":
                result = RollenCode.Kammermitglied;
                return true;
            case "100":
            case "Kind":
                result = RollenCode.Kind;
                return true;
            case "101":
            case "Kläger(in)":
                result = RollenCode.Klaeger;
                return true;
            case "102":
            case "Kontrollbetreuer(in)":
                result = RollenCode.Kontrollbetreuer;
                return true;
            case "103":
            case "Korrespondenzanwalt (-anwältin)":
                result = RollenCode.Korrespondenzanwalt;
                return true;
            case "104":
            case "Kostenschuldner(in)":
                result = RollenCode.Kostenschuldner;
                return true;
            case "105":
            case "Landwirtschaftsrichter(in)":
                result = RollenCode.Landwirtschaftsrichter;
                return true;
            case "106":
            case "Lebenspartner(in)":
                result = RollenCode.Lebenspartner;
                return true;
            case "107":
            case "Liquidator(in)":
                result = RollenCode.Liquidator;
                return true;
            case "108":
            case "Minderjährige(r)":
                result = RollenCode.Minderjaehrige;
                return true;
            case "109":
            case "Mitvormund":
                result = RollenCode.Mitvormund;
                return true;
            case "110":
            case "Mündel":
                result = RollenCode.Muendel;
                return true;
            case "112":
            case "Nachbesserungsgläubiger(in)":
                result = RollenCode.Nachbesserungsglaeubiger;
                return true;
            case "113":
            case "Nachlasspfleger(in)":
                result = RollenCode.Nachlasspfleger;
                return true;
            case "114":
            case "Nachlassverwalter(in)":
                result = RollenCode.Nachlassverwalter;
                return true;
            case "115":
            case "Nebenkläger(in)":
                result = RollenCode.Nebenklaeger;
                return true;
            case "116":
            case "Neffe (Nichte)":
                result = RollenCode.Neffe_Nichte;
                return true;
            case "117":
            case "Nicht verwandt":
                result = RollenCode.Nicht_verwandt;
                return true;
            case "118":
            case "Onkel (Tante)":
                result = RollenCode.Onkel_Tante;
                return true;
            case "119":
            case "Opfer":
                result = RollenCode.Opfer;
                return true;
            case "120":
            case "Pächter(in)":
                result = RollenCode.Paechter;
                return true;
            case "121":
            case "Pflegeeltern":
                result = RollenCode.Pflegeeltern;
                return true;
            case "123":
            case "Pfleger(in)":
                result = RollenCode.Pfleger;
                return true;
            case "124":
            case "Pfleger(in) für das Sammelvermögen":
                result = RollenCode.Pfleger_fuer_das_Sammelvermoegen;
                return true;
            case "125":
            case "Pfleger(in) für die Leibesfrucht":
                result = RollenCode.Pfleger_fuer_die_Leibesfrucht;
                return true;
            case "126":
            case "Pflegevater (Pflegemutter) des Mündels":
                result = RollenCode.Pflegevater_Pflegemutter_des_Muendels;
                return true;
            case "127":
            case "Pflegling":
                result = RollenCode.Pflegling;
                return true;
            case "128":
            case "Pflichtverteidiger(in)":
                result = RollenCode.Pflichtverteidiger;
                return true;
            case "129":
            case "Polizei":
                result = RollenCode.Polizei;
                return true;
            case "130":
            case "Privatbeklagte(r)":
                result = RollenCode.Privatbeklagte;
                return true;
            case "131":
            case "Privatkläger(in)":
                result = RollenCode.Privatklaeger;
                return true;
            case "132":
            case "Prozessbevollmächtigte(r)":
                result = RollenCode.Prozessbevollmaechtigte;
                return true;
            case "133":
            case "Prozesskostenhilfe-Anwalt (-Anwältin)":
                result = RollenCode.Prozesskostenhilfe_Anwalt_Anwaeltin;
                return true;
            case "134":
            case "Prozesskostenhilfe-Korrespondenzanwalt (-anwältin)":
                result = RollenCode.Prozesskostenhilfe_Korrespondenzanwalt;
                return true;
            case "135":
            case "Rechtsanwalt (-anwältin)":
                result = RollenCode.Rechtsanwalt;
                return true;
            case "136":
            case "Rechtsbeistand":
                result = RollenCode.Rechtsbeistand;
                return true;
            case "137":
            case "Rechtsbeschwerdeführer(in)":
                result = RollenCode.Rechtsbeschwerdefuehrer;
                return true;
            case "138":
            case "Rechtsbeschwerdegegner(in)":
                result = RollenCode.Rechtsbeschwerdegegner;
                return true;
            case "139":
            case "Revisionsbeklagte(r)":
                result = RollenCode.Revisionsbeklagte;
                return true;
            case "140":
            case "Revisionskläger(in)":
                result = RollenCode.Revisionsklaeger;
                return true;
            case "141":
            case "Sachbearbeiter(in)":
                result = RollenCode.Sachbearbeiter;
                return true;
            case "142":
            case "Sachverständige(r)":
                result = RollenCode.Sachverstaendige;
                return true;
            case "143":
            case "Schuldner(in)":
                result = RollenCode.Schuldner;
                return true;
            case "144":
            case "Schwager (Schwägerin)":
                result = RollenCode.Schwager_Schwaegerin;
                return true;
            case "146":
            case "Schwiegersohn (Schwiegertochter)":
                result = RollenCode.Schwiegersohn_Schwiegertochter;
                return true;
            case "148":
            case "Schwiegervater (Schwiegermutter)":
                result = RollenCode.Schwiegervater_Schwiegermutter;
                return true;
            case "149":
            case "Sohn (Tochter)":
                result = RollenCode.Sohn_Tochter;
                return true;
            case "150":
            case "Soldat(in)":
                result = RollenCode.Soldat;
                return true;
            case "151":
            case "Sonstige(r) Beteiligte(r)":
                result = RollenCode.Sonstige_Beteiligte;
                return true;
            case "152":
            case "Sonstige(r) Vertreter(in)":
                result = RollenCode.Sonstige_Vertreter;
                return true;
            case "153":
            case "Staatsanwaltschaft":
                result = RollenCode.Staatsanwaltschaft;
                return true;
            case "154":
            case "Stiefeltern":
                result = RollenCode.Stiefeltern;
                return true;
            case "156":
            case "Stiefvater (Stiefmutter)":
                result = RollenCode.Stiefvater_Stiefmutter;
                return true;
            case "161":
            case "Terminsbevollmächtigte(r)":
                result = RollenCode.Terminsbevollmaechtigte;
                return true;
            case "162":
            case "Testamentsvollstrecker(in)":
                result = RollenCode.Testamentsvollstrecker;
                return true;
            case "163":
            case "Testator(in)":
                result = RollenCode.Testator;
                return true;
            case "164":
            case "Übernehmer(in)":
                result = RollenCode.Uebernehmer;
                return true;
            case "165":
            case "Unterbevollmächtigte(r)":
                result = RollenCode.Unterbevollmaechtigte;
                return true;
            case "166":
            case "Ur-Enkel(in)":
                result = RollenCode.Ur_Enkel;
                return true;
            case "167":
            case "Vater (Mutter)":
                result = RollenCode.Vater_Mutter;
                return true;
            case "168":
            case "Veräußerer (Veräußerin)":
                result = RollenCode.Veraeusserer_Veraeusserin;
                return true;
            case "169":
            case "Verfahrensbevollmächtigte(r)":
                result = RollenCode.Verfahrensbevollmaechtigte;
                return true;
            case "170":
            case "Verfahrenskostenhilfe-Anwalt(-Anwältin)":
                result = RollenCode.Verfahrenskostenhilfe_Anwalt_Anwaeltin;
                return true;
            case "171":
            case "Verfahrenskostenhilfe-Korrespondenzanwalt (-anwältin)":
                result = RollenCode.Verfahrenskostenhilfe_Korrespondenzanwalt;
                return true;
            case "172":
            case "Verfahrenspfleger(in)":
                result = RollenCode.Verfahrenspfleger;
                return true;
            case "173":
            case "Verfahrensvertreter(in) (§787 ZPO)":
                result = RollenCode.Verfahrensvertreter_787_ZPO;
                return true;
            case "174":
            case "Verfügungsbeklagte(r)":
                result = RollenCode.Verfuegungsbeklagte;
                return true;
            case "175":
            case "Verfügungskläger(in)":
                result = RollenCode.Verfuegungsklaeger;
                return true;
            case "176":
            case "Verkehrsanwalt (-anwältin)":
                result = RollenCode.Verkehrsanwalt;
                return true;
            case "177":
            case "Verlobte(r)":
                result = RollenCode.Verlobte;
                return true;
            case "178":
            case "Vermächtnisnehmer(in)":
                result = RollenCode.Vermaechtnisnehmer;
                return true;
            case "179":
            case "Vermieter(in)":
                result = RollenCode.Vermieter;
                return true;
            case "180":
            case "Verpächter(in)":
                result = RollenCode.Verpaechter;
                return true;
            case "181":
            case "Versorgungsträger(in)":
                result = RollenCode.Versorgungstraeger;
                return true;
            case "182":
            case "Verteidiger(in)":
                result = RollenCode.Verteidiger;
                return true;
            case "183":
            case "Vertreter(in) der Interessen des Ausgleichsfonds":
                result = RollenCode.Vertreter_der_Interessen_des_Ausgleichsfonds;
                return true;
            case "184":
            case "Vertreter(in) der Staatskasse":
                result = RollenCode.Vertreter_der_Staatskasse;
                return true;
            case "185":
            case "Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht":
                result = RollenCode.Vertreter_des_Bundesinteresses_beim_Bundesverwaltungsgericht;
                return true;
            case "186":
            case "Vertreter(in) des öffentlichen Interesses":
                result = RollenCode.Vertreter_des_oeffentlichen_Interesses;
                return true;
            case "187":
            case "Verurteilte(r)":
                result = RollenCode.Verurteilte;
                return true;
            case "188":
            case "Verwalter(in) der Wohnungseigentümergemeinschaft":
                result = RollenCode.Verwalter_der_Wohnungseigentuemergemeinschaft;
                return true;
            case "189":
            case "Verwaltungsbehörde":
                result = RollenCode.Verwaltungsbehoerde;
                return true;
            case "190":
            case "Vollstreckungsgläubiger(in)":
                result = RollenCode.Vollstreckungsglaeubiger;
                return true;
            case "191":
            case "Vollstreckungsschuldner(in)":
                result = RollenCode.Vollstreckungsschuldner;
                return true;
            case "192":
            case "Vorläufige(r) Betreuer(in)":
                result = RollenCode.Vorlaeufige_Betreuer;
                return true;
            case "193":
            case "Vormund":
                result = RollenCode.Vormund;
                return true;
            case "194":
            case "Vorstand":
                result = RollenCode.Vorstand;
                return true;
            case "195":
            case "Vorsorgebevollmächtigte(r)":
                result = RollenCode.Vorsorgebevollmaechtigte;
                return true;
            case "196":
            case "Wahlverteidiger(in)":
                result = RollenCode.Wahlverteidiger;
                return true;
            case "197":
            case "Widerbeklagte(r)":
                result = RollenCode.Widerbeklagte;
                return true;
            case "198":
            case "Widerkläger(in)":
                result = RollenCode.Widerklaeger;
                return true;
            case "199":
            case "Wiederaufnahmebeklagte(r)":
                result = RollenCode.Wiederaufnahmebeklagte;
                return true;
            case "200":
            case "Wiederaufnahmekläger(in)":
                result = RollenCode.Wiederaufnahmeklaeger;
                return true;
            case "201":
            case "Zahlungs- und Auflagenempfänger(in)":
                result = RollenCode.Zahlungs_und_Auflagenempfaenger;
                return true;
            case "202":
            case "Zeuge (Zeugin)":
                result = RollenCode.Zeuge_Zeugin;
                return true;
            case "203":
            case "Zeugenbeistand":
                result = RollenCode.Zeugenbeistand;
                return true;
            case "204":
            case "Zulassungsantragsgegner(in)":
                result = RollenCode.Zulassungsantragsgegner;
                return true;
            case "205":
            case "Zulassungsantragsteller(in)":
                result = RollenCode.Zulassungsantragsteller;
                return true;
            case "206":
            case "Zustellungsbevollmächtigte(r)":
                result = RollenCode.Zustellungsbevollmaechtigte;
                return true;
            case "207":
            case "Zustellungsvertreter(in) (§6 ZVG)":
                result = RollenCode.Zustellungsvertreter_6_ZVG;
                return true;
            case "208":
            case "Notar(in)":
                result = RollenCode.Notar;
                return true;
            case "209":
            case "Auskunftsempfänger(in)":
                result = RollenCode.Auskunftsempfaenger;
                return true;
            case "210":
            case "Melder(in)":
                result = RollenCode.Melder;
                return true;
            case "211":
            case "Verwahrstelle":
                result = RollenCode.Verwahrstelle;
                return true;
            case "212":
            case "Aussteller(in)":
                result = RollenCode.Aussteller;
                return true;
            case "213":
            case "Berechtigte(r)":
                result = RollenCode.Berechtigte;
                return true;
            case "214":
            case "Berechtigte(r) an einem Recht":
                result = RollenCode.Berechtigte_an_einem_Recht;
                return true;
            case "215":
            case "Einreicher(in)":
                result = RollenCode.Einreicher;
                return true;
            case "216":
            case "Erbbauberechtigte(r)":
                result = RollenCode.Erbbauberechtigte;
                return true;
            case "217":
            case "Finanzamt":
                result = RollenCode.Finanzamt;
                return true;
            case "218":
            case "Grundbuchvertreter(in)":
                result = RollenCode.Grundbuchvertreter;
                return true;
            case "219":
            case "Insolvenzgericht":
                result = RollenCode.Insolvenzgericht;
                return true;
            case "220":
            case "Mitteilungsempfänger(in)":
                result = RollenCode.Mitteilungsempfaenger;
                return true;
            case "221":
            case "Nacherbe (Nacherbin)":
                result = RollenCode.Nacherbe_Nacherbin;
                return true;
            case "222":
            case "Rechnungsempfänger(in)":
                result = RollenCode.Rechnungsempfaenger;
                return true;
            case "223":
            case "Veranlasser(in)":
                result = RollenCode.Veranlasser;
                return true;
            case "224":
            case "Versteigerungsabteilung":
                result = RollenCode.Versteigerungsabteilung;
                return true;
            case "225":
            case "Vertretungsberechtigte(r)":
                result = RollenCode.Vertretungsberechtigte;
                return true;
            case "226":
            case "Zweitschuldner(in)":
                result = RollenCode.Zweitschuldner;
                return true;
            case "227":
            case "Vertreter(in)":
                result = RollenCode.Vertreter;
                return true;
            case "228":
            case "Arbeitgeber(in)":
                result = RollenCode.Arbeitgeber;
                return true;
            case "229":
            case "RV-Träger(in)":
                result = RollenCode.RV_Traeger;
                return true;
            case "230":
            case "Vollstreckungsstelle":
                result = RollenCode.Vollstreckungsstelle;
                return true;
            case "231":
            case "Abkömmling":
                result = RollenCode.Abkoemmling;
                return true;
            case "232":
            case "Kreditnehmer(in)":
                result = RollenCode.Kreditnehmer;
                return true;
            case "233":
            case "Neu vorzutragende(r) Eigentümer(in)":
                result = RollenCode.Neu_vorzutragende_Eigentuemer;
                return true;
            case "234":
            case "Notariatsverwalter(in)":
                result = RollenCode.Notariatsverwalter;
                return true;
            case "235":
            case "Notarvertreter(in)":
                result = RollenCode.Notarvertreter;
                return true;
            case "236":
            case "Partei kraft Amtes":
                result = RollenCode.Partei_kraft_Amtes;
                return true;
            case "237":
            case "Sequester":
                result = RollenCode.Sequester;
                return true;
            case "238":
            case "Treuhänder(in)":
                result = RollenCode.Treuhaender;
                return true;
            case "239":
            case "Zustimmende(r)":
                result = RollenCode.Zustimmende;
                return true;
            case "240":
            case "Gläubigervertreter(in)":
                result = RollenCode.Glaeubigervertreter;
                return true;
            case "241":
            case "Schuldnervertreter(in)":
                result = RollenCode.Schuldnervertreter;
                return true;
            case "242":
            case "Zahlungsempfänger(in)":
                result = RollenCode.Zahlungsempfaenger;
                return true;
            case "243":
            case "Anteilsinhaber(in)":
                result = RollenCode.Anteilsinhaber;
                return true;
            case "244":
            case "Antragsteller(in) -Eröffnung":
                result = RollenCode.Antragsteller_Eroeffnung;
                return true;
            case "245":
            case "Debitor(in)":
                result = RollenCode.Debitor;
                return true;
            case "246":
            case "Gesellschafter(in)":
                result = RollenCode.Gesellschafter;
                return true;
            case "247":
            case "Handlungsbevollmächtigte(r)":
                result = RollenCode.Handlungsbevollmaechtigte;
                return true;
            case "248":
            case "Mitglied einer Gesamt-Anteilsinhaberschaft":
                result = RollenCode.Mitglied_einer_Gesamt_Anteilsinhaberschaft;
                return true;
            case "249":
            case "Mitglied einer Gläubigergemeinschaft":
                result = RollenCode.Mitglied_einer_Glaeubigergemeinschaft;
                return true;
            case "250":
            case "Mitreeder(in)":
                result = RollenCode.Mitreeder;
                return true;
            case "251":
            case "Partner(in)":
                result = RollenCode.Partner;
                return true;
            case "252":
            case "Persönlich haftende(r) Gesellschafter(in)":
                result = RollenCode.Persoenlich_haftende_Gesellschafter;
                return true;
            case "253":
            case "Prozesspfleger(in)":
                result = RollenCode.Prozesspfleger;
                return true;
            case "254":
            case "Sachwalter(in)":
                result = RollenCode.Sachwalter;
                return true;
            case "255":
            case "Treuhänder(in) (Wohlverhaltensperiode)":
                result = RollenCode.Treuhaender_Wohlverhaltensperiode;
                return true;
            case "256":
            case "Vermögensträger(in)":
                result = RollenCode.Vermoegenstraeger;
                return true;
            case "257":
            case "Vorläufige(r) Insolvenzverwalter(in)":
                result = RollenCode.Vorlaeufige_Insolvenzverwalter;
                return true;
            case "258":
            case "Vorläufige(r) Treuhänder(in)":
                result = RollenCode.Vorlaeufige_Treuhaender;
                return true;
            case "259":
            case "Sondersachwalter(in)":
                result = RollenCode.Sondersachwalter;
                return true;
            case "260":
            case "Sonderinsolvenzverwalter(in)":
                result = RollenCode.Sonderinsolvenzverwalter;
                return true;
            case "261":
            case "Vorläufige(r) Sachwalter(in)":
                result = RollenCode.Vorlaeufige_Sachwalter;
                return true;
            case "262":
            case "Abwickler(in)":
                result = RollenCode.Abwickler;
                return true;
            case "263":
            case "Übernehmender Rechtsträger":
                result = RollenCode.Uebernehmender_Rechtstraeger;
                return true;
            case "264":
            case "Aufsichtsrat (-rätin)":
                result = RollenCode.Aufsichtsrat_raetin;
                return true;
            case "265":
            case "Besondere(r) Vertreter(in) nach § 30 BGB":
                result = RollenCode.Besondere_Vertreter_nach_30_BGB;
                return true;
            case "266":
            case "Betriebsleiter(in)":
                result = RollenCode.Betriebsleiter;
                return true;
            case "267":
            case "Empfangsberechtigte(r)":
                result = RollenCode.Empfangsberechtigte;
                return true;
            case "268":
            case "Geschäftsführende(r) Direktor(in)":
                result = RollenCode.Geschaeftsfuehrende_Direktor;
                return true;
            case "269":
            case "Geschäftsleiter(in)":
                result = RollenCode.Geschaeftsleiter;
                return true;
            case "271":
            case "Gründer(in)":
                result = RollenCode.Gruender;
                return true;
            case "272":
            case "Gründungsprüfer(in)":
                result = RollenCode.Gruendungspruefer;
                return true;
            case "273":
            case "Hauptniederlassung":
                result = RollenCode.Hauptniederlassung;
                return true;
            case "274":
            case "Inhaber(in)":
                result = RollenCode.Inhaber;
                return true;
            case "275":
            case "Kommanditist(in)":
                result = RollenCode.Kommanditist;
                return true;
            case "276":
            case "Konkursverwalter(in)":
                result = RollenCode.Konkursverwalter;
                return true;
            case "277":
            case "Mitglied des Leitungsorgans":
                result = RollenCode.Mitglied_des_Leitungsorgans;
                return true;
            case "278":
            case "Mitglied EWIV":
                result = RollenCode.Mitglied_EWIV;
                return true;
            case "279":
            case "Nachgründungsprüfer(in)":
                result = RollenCode.Nachgruendungspruefer;
                return true;
            case "280":
            case "Nachtragsabwickler(in)":
                result = RollenCode.Nachtragsabwickler;
                return true;
            case "281":
            case "Nachtragsliquidator(in)":
                result = RollenCode.Nachtragsliquidator;
                return true;
            case "282":
            case "Notgeschäftsführer(in)":
                result = RollenCode.Notgeschaeftsfuehrer;
                return true;
            case "283":
            case "Notliquidator(in)":
                result = RollenCode.Notliquidator;
                return true;
            case "284":
            case "Notvorstand":
                result = RollenCode.Notvorstand;
                return true;
            case "285":
            case "Prokurist(in)":
                result = RollenCode.Prokurist;
                return true;
            case "287":
            case "Rechtsträger(in)":
                result = RollenCode.Rechtstraeger;
                return true;
            case "288":
            case "Registergericht":
                result = RollenCode.Registergericht;
                return true;
            case "289":
            case "Sacheinlagenprüfer(in)":
                result = RollenCode.Sacheinlagenpruefer;
                return true;
            case "290":
            case "Ständige(r) Vertreter(in) für die Zweigniederlassung":
                result = RollenCode.Staendige_Vertreter_fuer_die_Zweigniederlassung;
                return true;
            case "291":
            case "Übertragender Rechtsträger":
                result = RollenCode.Uebertragender_Rechtstraeger;
                return true;
            case "292":
            case "Vergleichsverwalter(in)":
                result = RollenCode.Vergleichsverwalter;
                return true;
            case "293":
            case "Verwaltungsrat (-rätin)":
                result = RollenCode.Verwaltungsrat_raetin;
                return true;
            case "294":
            case "Vorstandsvorsitzende(r)":
                result = RollenCode.Vorstandsvorsitzende;
                return true;
            case "295":
            case "Zweigniederlassung":
                result = RollenCode.Zweigniederlassung;
                return true;
            case "296":
            case "Vertreter(in) des Klägers/der Klägerin":
                result = RollenCode.Vertreter_des_Klaegers_oder_der_Klaegerin;
                return true;
            case "297":
            case "Vertreter(in) des/der Beklagten":
                result = RollenCode.Vertreter_des_oder_der_Beklagten;
                return true;
            case "298":
            case "Bewährungshilfe":
                result = RollenCode.Bewaehrungshilfe;
                return true;
            case "299":
            case "Gerichtshilfe":
                result = RollenCode.Gerichtshilfe;
                return true;
            case "300":
            case "Justizvollzug":
                result = RollenCode.Justizvollzug;
                return true;
            case "301":
            case "Pseudoname":
                result = RollenCode.Pseudoname;
                return true;
            case "302":
            case "Gesetzliche(r) Vertreter(in) des Gläubigers/der Gläubigerin":
                result = RollenCode.Gesetzliche_Vertreter_des_Glaeubigers_oder_der_Glaeubigerin;
                return true;
            case "303":
            case "Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin":
                result = RollenCode.Gesetzliche_Vertreter_des_Schuldners_oder_der_Schuldnerin;
                return true;
            case "304":
            case "Bevollmächtigte(r) des Gläubigers/der Gläubigerin":
                result = RollenCode.Bevollmaechtigte_des_Glaeubigers_oder_der_Glaeubigerin;
                return true;
            case "305":
            case "Bevollmächtigte(r) des Schuldners/der Schuldnerin":
                result = RollenCode.Bevollmaechtigte_des_Schuldners_oder_der_Schuldnerin;
                return true;
            case "306":
            case "Fahrzeughalter(in)":
                result = RollenCode.Fahrzeughalter;
                return true;
            case "307":
            case "Frühere(r) Lebenspartner(in)":
                result = RollenCode.Fruehere_Lebenspartner;
                return true;
            case "308":
            case "Sicherungsverwalter(in)":
                result = RollenCode.Sicherungsverwalter;
                return true;
            case "309":
            case "Zwangsverwalter(in)":
                result = RollenCode.Zwangsverwalter;
                return true;
            case "310":
            case "Mieter(in)":
                result = RollenCode.Mieter;
                return true;
            case "311":
            case "Bürge (Bürgin)":
                result = RollenCode.Buerge_Buergin;
                return true;
            case "312":
            case "Meistbietende(r)":
                result = RollenCode.Meistbietende;
                return true;
            case "313":
            case "Abschlussprüfer(in)":
                result = RollenCode.Abschlusspruefer;
                return true;
            case "314":
            case "Antragstellervertreter(in)":
                result = RollenCode.Antragstellervertreter;
                return true;
            case "315":
            case "Aufsichtsratsvorsitzende(r)":
                result = RollenCode.Aufsichtsratsvorsitzende;
                return true;
            case "316":
            case "Berufskammer":
                result = RollenCode.Berufskammer;
                return true;
            case "317":
            case "Betroffenenvertreter(in)":
                result = RollenCode.Betroffenenvertreter;
                return true;
            case "318":
            case "Bürgermeister(in)":
                result = RollenCode.Buergermeister;
                return true;
            case "319":
            case "Eingliederungsbeteiligte(r)":
                result = RollenCode.Eingliederungsbeteiligte;
                return true;
            case "320":
            case "Formwechselnder Rechtsträger":
                result = RollenCode.Formwechselnder_Rechtstraeger;
                return true;
            case "321":
            case "Gewerbeamt":
                result = RollenCode.Gewerbeamt;
                return true;
            case "322":
            case "Inhaber(in) (nicht eingetragen)":
                result = RollenCode.Inhaber_nicht_eingetragen;
                return true;
            case "323":
            case "Kostenempfänger(in)":
                result = RollenCode.Kostenempfaenger;
                return true;
            case "324":
            case "Nachlassgericht":
                result = RollenCode.Nachlassgericht;
                return true;
            case "325":
            case "Sonderprüfer(in)":
                result = RollenCode.Sonderpruefer;
                return true;
            case "326":
            case "Sonstige(r) gerichtlich bestellte(r) Vertreter(in)":
                result = RollenCode.Sonstige_gerichtlich_bestellte_Vertreter;
                return true;
            case "327":
            case "Sonstige(r) gesetzliche(r) Vertreter(in) BGB":
                result = RollenCode.Sonstige_gesetzliche_Vertreter_BGB;
                return true;
            case "328":
            case "Sonstige(r) organschaftliche(r) Vertreter(in) HRB":
                result = RollenCode.Sonstige_organschaftliche_Vertreter_HRB;
                return true;
            case "329":
            case "Standardkostenschuldner(in)":
                result = RollenCode.Standardkostenschuldner;
                return true;
            case "330":
            case "Übernahmeschuldner(in)":
                result = RollenCode.Uebernahmeschuldner;
                return true;
            case "331":
            case "Unternehmensvertragsbeteiligte(r)":
                result = RollenCode.Unternehmensvertragsbeteiligte;
                return true;
            case "332":
            case "Vertreter(in) des persönlich haftenden Gesellschafters":
                result = RollenCode.Vertreter_des_persoenlich_haftenden_Gesellschafters;
                return true;
            case "333":
            case "Werkleiter(in)":
                result = RollenCode.Werkleiter;
                return true;
            case "334":
            case "Mehrfachsitz":
                result = RollenCode.Mehrfachsitz;
                return true;
            case "335":
            case "Mitglied VR":
                result = RollenCode.Mitglied_VR;
                return true;
            case "336":
            case "Mitglied e. BGB-Gesellschaft als Abwicklerin":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_Abwicklerin;
                return true;
            case "337":
            case "Mitglied e. BGB-Gesellschaft als ges. Vertreterin":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_ges_Vertreterin;
                return true;
            case "338":
            case "Mitglied e. BGB-Gesellschaft als Kommanditistin":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_Kommanditistin;
                return true;
            case "339":
            case "Mitglied e. BGB-Gesellschaft als Liquidatorin":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_Liquidatorin;
                return true;
            case "340":
            case "Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_Mitglied_e_EWIV;
                return true;
            case "341":
            case "Mitglied e. BGB-Gesellschaft als phG":
                result = RollenCode.Mitglied_e_BGB_Gesellschaft_als_phG;
                return true;
            case "342":
            case "Mitglied e. Erbengemeinschaft als ges. Vertreterin":
                result = RollenCode.Mitglied_e_Erbengemeinschaft_als_ges_Vertreterin;
                return true;
            case "343":
            case "Mitglied e. Erbengemeinschaft als Inhaberin":
                result = RollenCode.Mitglied_e_Erbengemeinschaft_als_Inhaberin;
                return true;
            case "344":
            case "Mitglied e. Erbengemeinschaft als Kommanditistin":
                result = RollenCode.Mitglied_e_Erbengemeinschaft_als_Kommanditistin;
                return true;
            case "345":
            case "Mitglied e. Erbengemeinschaft als Mitglied e. EWIV":
                result = RollenCode.Mitglied_e_Erbengemeinschaft_als_Mitglied_e_EWIV;
                return true;
            case "346":
            case "Nebensitz":
                result = RollenCode.Nebensitz;
                return true;
            case "347":
            case "Gesamthandsgemeinschaft":
                result = RollenCode.Gesamthandsgemeinschaft;
                return true;
            case "348":
            case "Mitglied einer Gesamthandsgemeinschaft":
                result = RollenCode.Mitglied_einer_Gesamthandsgemeinschaft;
                return true;
            case "349":
            case "Leitungsperson i.S.v. § 30 Abs. 1 Nr. 1 bis 5 OWiG":
                result = RollenCode.Leitungsperson_iSv_30_Abs_1_Nr_1_bis_5_OWiG;
                return true;
            case "350":
            case "Einziehungsbeteiligter":
                result = RollenCode.Einziehungsbeteiligter;
                return true;
            case "351":
            case "Antragsgegnervertreter(in)":
                result = RollenCode.Antragsgegnervertreter;
                return true;
            case "352":
            case "Verbraucher(in)":
                result = RollenCode.Verbraucher;
                return true;
            case "353":
            case "Vielmelder(in)":
                result = RollenCode.Vielmelder;
                return true;
            case "354":
            case "Vollmachtgeber(in)":
                result = RollenCode.Vollmachtgeber;
                return true;
            case "355":
            case "Nebenbeteiligte(r) § 444 StPO":
                result = RollenCode.Nebenbeteiligte_444_StPO;
                return true;
            case "356":
            case "Verfallsbeteiligte(r) § 442 StPO a.F.":
                result = RollenCode.Verfallsbeteiligte_442_StPO_aF;
                return true;
            case "357":
            case "Verfolgte(r) § 34 IRG":
                result = RollenCode.Verfolgte_34_IRG;
                return true;
            case "358":
            case "Rechtsnachfolger(in)":
                result = RollenCode.Rechtsnachfolger;
                return true;
            case "359":
            case "Statuswechselnde(r) Rechtsträger(in)":
                result = RollenCode.Statuswechselnde_Rechtstraeger;
                return true;
            case "360":
            case "Haftangehörige":
                result = RollenCode.Haftangehoerige;
                return true;
            case "361":
            case "Restrukturierungsbeauftragte(r)":
                result = RollenCode.Restrukturierungsbeauftragte;
                return true;
            case "362":
            case "Sanierungsmoderator(in)":
                result = RollenCode.Sanierungsmoderator;
                return true;
            case "363":
            case "Abschriftenempfänger(in)":
                result = RollenCode.Abschriftenempfaenger;
                return true;
            case "364":
            case "Kostenbeamte(r)":
                result = RollenCode.Kostenbeamte;
                return true;
            case "365":
            case "Urkundsbeamte(r) der Geschäftsstelle":
                result = RollenCode.Urkundsbeamte_der_Geschaeftsstelle;
                return true;
            case "366":
            case "Anordnungsbefugte(r)":
                result = RollenCode.Anordnungsbefugte;
                return true;
            case "367":
            case "Erstschuldner(in)":
                result = RollenCode.Erstschuldner;
                return true;
            case "368":
            case "Kasse":
                result = RollenCode.Kasse;
                return true;
            case "369":
            case "Arrestbeklagte(r)":
                result = RollenCode.Arrestbeklagte;
                return true;
            case "370":
            case "Arrestkläger(in)":
                result = RollenCode.Arrestklaeger;
                return true;
            case "371":
            case "Bezirksrevisor(in)":
                result = RollenCode.Bezirksrevisor;
                return true;
            case "372":
            case "Nebenintervenient(in)":
                result = RollenCode.Nebenintervenient;
                return true;
            case "373":
            case "Restitutionsbeklagte(r)":
                result = RollenCode.Restitutionsbeklagte;
                return true;
            case "374":
            case "Restitutionskläger(in)":
                result = RollenCode.Restitutionsklaeger;
                return true;
            case "375":
            case "Streithelfer(in)":
                result = RollenCode.Streithelfer;
                return true;
            case "376":
            case "Streitverkündete(r)":
                result = RollenCode.Streitverkuendete;
                return true;
            case "377":
            case "Übersetzer(in)":
                result = RollenCode.Uebersetzer;
                return true;
            case "378":
                result = RollenCode.Unternehmen_378;
                return true;
            case "379":
            case "Kontaktperson des Unternehmens":
                result = RollenCode.Kontaktperson_des_Unternehmens;
                return true;
            case "380":
            case "Beigetretene(r)":
                result = RollenCode.Beigetretene;
                return true;
            case "381":
            case "Erklärende(r)":
                result = RollenCode.Erklaerende;
                return true;
            case "382":
            case "Heim":
                result = RollenCode.Heim;
                return true;
            case "383":
            case "Inhaftierte Person":
                result = RollenCode.Inhaftierte_Person;
                return true;
            case "384":
            case "Jugendgerichtshilfe":
                result = RollenCode.Jugendgerichtshilfe;
                return true;
            case "385":
            case "Krankenhaus":
                result = RollenCode.Krankenhaus;
                return true;
            case "386":
            case "Nebenbetroffene(r)":
                result = RollenCode.Nebenbetroffene;
                return true;
            case "387":
            case "Nebenklägervertreter(in)":
                result = RollenCode.Nebenklaegervertreter;
                return true;
            case "388":
            case "Psychosoziale(r) Prozessbegleiter(in)":
                result = RollenCode.Psychosoziale_Prozessbegleiter;
                return true;
            case "389":
            case "Rentenberater(in)":
                result = RollenCode.Rentenberater;
                return true;
            case "390":
            case "Sachverständige(n) Zeuge (Zeugin)":
                result = RollenCode.Sachverstaendigen_Zeuge_Zeugin;
                return true;
            case "391":
            case "Steuerberater(in)":
                result = RollenCode.Steuerberater;
                return true;
            case "392":
                result = RollenCode.Unternehmen_392;
                return true;
            case "393":
            case "Verfahrensbeistand":
                result = RollenCode.Verfahrensbeistand;
                return true;
            case "394":
            case "Verfahrensbeteiligte(r)":
                result = RollenCode.Verfahrensbeteiligte;
                return true;
            case "395":
            case "Verhinderungsbetreuer":
                result = RollenCode.Verhinderungsbetreuer;
                return true;
            case "396":
            case "Verletztenbeistand":
                result = RollenCode.Verletztenbeistand;
                return true;
            case "397":
            case "Wirtschaftsprüfer(in)":
                result = RollenCode.Wirtschaftspruefer;
                return true;
            case "398":
            case "Zedent(in)":
                result = RollenCode.Zedent;
                return true;
            case "399":
            case "Registerführende Behörde/Stelle":
                result = RollenCode.Registerfuehrende_Behoerde_oder_Stelle;
                return true;
        }

        return false;
    }
}
