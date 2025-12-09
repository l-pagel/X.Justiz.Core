namespace XJustiz-Lite.Dotnet
{
    using System;
    using System.Collections.Generic;
    using System.Xml.Serialization;

    public static class XJustizExport
    {
        public const string Tns = "http://www.xjustiz.de";
        public const string Xsi = "http://www.w3.org/2001/XMLSchema-instance";
    }

    [XmlRoot(
        ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
        Namespace = XJustizExport.Tns)]
    public class UebermittlungSchriftgutobjekteNachricht
    {
        [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
        public Nachrichtenkopf Kopf { get; set; } = new();

        [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
        public Grunddaten? Grunddaten { get; set; }

        [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
        public Schriftgutobjekte? Schriftgutobjekte { get; set; }

        [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
        public string SchemaLocation { get; set; } =
            $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
    }

    public class Nachrichtenkopf
    {
        [XmlAttribute("xjustizVersion")]
        public string Version { get; set; } = "3.5.1";

        [XmlElement("aktenzeichen.absender", Namespace = XJustizExport.Tns, Order = 1)]
        public string[]? AktenzeichenAbsender { get; set; }

        [XmlElement("aktenzeichen.empfaenger", Namespace = XJustizExport.Tns, Order = 2)]
        public string[]? AktenzeichenEmpfaenger { get; set; }

        [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, Order = 3)]
        public DateTime Erstellungszeitpunkt { get; set; }

        [XmlElement("auswahl_absender", Namespace = XJustizExport.Tns, Order = 4)]
        public AuswahlAdresse Absender { get; set; } = new();

        [XmlElement("auswahl_empfaenger", Namespace = XJustizExport.Tns, Order = 5)]
        public AuswahlAdresse Empfaenger { get; set; } = new();

        [XmlElement("eigeneNachrichtenID", Namespace = XJustizExport.Tns, Order = 6)]
        public string? EigeneNachrichtenId { get; set; }
    }

    public class AuswahlAdresse
    {
        [XmlElement("absender.sonstige", Namespace = XJustizExport.Tns)]
        public string? AbsenderSonstige { get; set; }

        [XmlElement("empfaenger.sonstige", Namespace = XJustizExport.Tns)]
        public string? EmpfaengerSonstige { get; set; }

        [XmlElement("empfaenger.gericht", Namespace = XJustizExport.Tns)]
        public string? EmpfaengerGericht { get; set; }

        [XmlElement("empfaenger.rvTraeger", Namespace = XJustizExport.Tns)]
        public string? EmpfaengerRvTraeger { get; set; }

        [XmlElement("empfaenger.polizeibehoerde", Namespace = XJustizExport.Tns)]
        public string? EmpfaengerPolizei { get; set; }
    }

    public class Grunddaten
    {
        [XmlElement("verfahrensdaten", Namespace = XJustizExport.Tns)]
        public Verfahrensdaten? Verfahrensdaten { get; set; }
    }

    public class Verfahrensdaten
    {
        [XmlElement("verfahrensnummer", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Verfahrensnummer { get; set; }

        [XmlElement("instanzdaten", Namespace = XJustizExport.Tns, Order = 2)]
        public Instanzdaten? Instanzdaten { get; set; }

        [XmlElement("beteiligung", Namespace = XJustizExport.Tns, Order = 3)]
        public List<Beteiligung>? Beteiligungen { get; set; }
    }

    public class Instanzdaten
    {
        [XmlElement("instanznummer", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Instanznummer { get; set; }

        [XmlElement("sachgebietszusatz", Namespace = XJustizExport.Tns, Order = 2)]
        public string? Sachgebietszusatz { get; set; }

        [XmlElement("auswahl_instanzbehoerde", Namespace = XJustizExport.Tns, Order = 3)]
        public AuswahlInstanzbehoerde? AuswahlInstanzbehoerde { get; set; }
    }

    public class AuswahlInstanzbehoerde
    {
        [XmlElement("gericht", Namespace = XJustizExport.Tns)]
        public GerichtCode? Gericht { get; set; }
    }

    public class GerichtCode
    {
        [XmlAttribute("listVersionID")]
        public string ListVersionId { get; set; } = "3.5.1";

        [XmlElement("code", Namespace = "")]
        public string Code { get; set; } = string.Empty;
    }

    public class Beteiligung
    {
        [XmlElement("rolle", Namespace = XJustizExport.Tns, Order = 1)]
        public Rolle Rolle { get; set; } = new();

        [XmlElement("beteiligter", Namespace = XJustizExport.Tns, Order = 2)]
        public Beteiligter Beteiligter { get; set; } = new();
    }

    public class Rolle
    {
        [XmlElement("rollenbezeichnung", Namespace = XJustizExport.Tns)]
        public Rollenbezeichnung Rollenbezeichnung { get; set; } = new();
    }

    public class Rollenbezeichnung
    {
        [XmlAttribute("listVersionID")]
        public string ListVersionId { get; set; } = "3.5.1";

        [XmlElement("code", Namespace = "")]
        public string Code { get; set; } = string.Empty;
    }

    public class Beteiligter
    {
        [XmlElement("auswahl_beteiligter", Namespace = XJustizExport.Tns)]
        public AuswahlBeteiligter Auswahl { get; set; } = new();
    }

    public class AuswahlBeteiligter
    {
        [XmlElement("natuerlichePerson", Namespace = XJustizExport.Tns)]
        public NatuerlichePerson? NP { get; set; }

        [XmlElement("organisation", Namespace = XJustizExport.Tns)]
        public Organisation? Org { get; set; }
    }

    public class NatuerlichePerson
    {
        [XmlElement("vollerName", Namespace = XJustizExport.Tns)]
        public VollerName VollerName { get; set; } = new();

        [XmlElement("geschlecht", Namespace = XJustizExport.Tns)]
        public Geschlecht Geschlecht { get; set; } = new();

        [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
        public Anschrift? Anschrift { get; set; }

        [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
        public List<Telekommunikation>? Telekommunikation { get; set; }

        [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
        public Bankverbindung? Bankverbindung { get; set; }
    }

    public class VollerName
    {
        [XmlElement("vorname", Namespace = XJustizExport.Tns)]
        public string? Vorname { get; set; }

        [XmlElement("rufname", Namespace = XJustizExport.Tns)]
        public string? Rufname { get; set; }

        [XmlElement("titel", Namespace = XJustizExport.Tns)]
        public string? Titel { get; set; }

        [XmlElement("namensvorsatz", Namespace = XJustizExport.Tns)]
        public string? Namensvorsatz { get; set; }

        [XmlElement("nachname", Namespace = XJustizExport.Tns)]
        public string? Nachname { get; set; }
    }

    public class Geschlecht
    {
        [XmlElement("code", Namespace = "")]
        public string? Code { get; set; }
    }

    public class Organisation
    {
        [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
        public Bezeichnung? Bezeichnung { get; set; }

        [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
        public Anschrift? Anschrift { get; set; }

        [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
        public List<Telekommunikation>? Telekommunikation { get; set; }

        [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
        public Bankverbindung? Bankverbindung { get; set; }
    }

    public class Telekommunikation
    {
        [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
        public Telekommunikationsart? Telekommunikationsart { get; set; }

        [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
        public string? verbindung { get; set; }
    }

    public class Telekommunikationsart
    {
        [XmlElement("code", Namespace = "")]
        public string? code { get; set; }
    }

    public class Bezeichnung
    {
        [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
        public string? Aktuell { get; set; }
    }

    public class Anschrift
    {
        [XmlElement("strasse", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Strasse { get; set; }

        [XmlElement("hausnummer", Namespace = XJustizExport.Tns, Order = 2)]
        public string? Hausnummer { get; set; }

        [XmlElement("postleitzahl", Namespace = XJustizExport.Tns, Order = 3)]
        public string? Postleitzahl { get; set; }

        [XmlElement("ort", Namespace = XJustizExport.Tns, Order = 4)]
        public string? Ort { get; set; }

        [XmlElement("staat", Namespace = XJustizExport.Tns, Order = 5)]
        public Staat? Staat { get; set; }
    }

    public class Staat
    {
        [XmlAttribute("listVersionID")]
        public string ListVersionId { get; set; } = "3.5.1";

        [XmlElement("code", Namespace = "")]
        public string Code { get; set; } = string.Empty;
    }

    public class Bankverbindung
    {
        [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
        public string? Kontoinhaber { get; set; }

        [XmlElement("iban", Namespace = XJustizExport.Tns)]
        public string? Iban { get; set; }

        [XmlElement("bic", Namespace = XJustizExport.Tns)]
        public string? Bic { get; set; }
    }

    public class Schriftgutobjekte
    {
        [XmlElement("akte", Namespace = XJustizExport.Tns)]
        public List<Akte>? Akte { get; set; }

        [XmlElement("dokument", Namespace = XJustizExport.Tns)]
        public List<Dokument>? Dokumente { get; set; }
    }

    public class Akte
    {
        [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
        public Identifikation Identifikation { get; set; } = new();

        [XmlElement("anwendungsspezifischeErweiterung", Namespace = XJustizExport.Tns, Order = 2)]
        public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }

        [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 3)]
        public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();
    }

    public class XjustizAkteFachspezifischeDaten
    {
        [XmlElement("aktentyp", Namespace = XJustizExport.Tns, Order = 1)]
        public Aktentyp Aktentyp { get; set; } = new();

        [XmlElement("anzeigename", Namespace = XJustizExport.Tns, Order = 2)]
        public string? Anzeigename { get; set; }

        [XmlElement("aktenzeichen", Namespace = XJustizExport.Tns, Order = 3)]
        public Aktenzeichen Aktenzeichen { get; set; } = new();
    }

    public class Aktentyp
    {
        [XmlElement("code", Namespace = "", Order = 1)]
        public string Code { get; set; } = "001";
    }

    public class Aktenzeichen
    {
        [XmlElement("auswahl_aktenzeichen", Namespace = XJustizExport.Tns, Order = 1)]
        public AuswahlAktenzeichen Auswahl { get; set; } = new();
    }

    public class AuswahlAktenzeichen
    {
        [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Freitext { get; set; }
    }

    public class Dokument
    {
        [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
        public Identifikation Identifikation { get; set; } = new();

        [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 2)]
        public XjustizFachspezifischeDaten FachspezifischeDaten { get; set; } = new();

        [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, DataType = "dateTime", Order = 3)]
        public DateTime? Erstellungszeitpunkt { get; set; }
    }

    public class Identifikation
    {
        [XmlElement("id", Namespace = XJustizExport.Tns, Order = 1)]
        public string Id { get; set; } = Guid.NewGuid().ToString();

        [XmlElement("nummerImUebergeordnetenContainer", Namespace = XJustizExport.Tns, Order = 2)]
        public string NummerImUebergeordnetenContainer { get; set; } = "1";
    }

    public class XjustizFachspezifischeDaten
    {
        [XmlElement("dokumentklasse", Namespace = XJustizExport.Tns, Order = 1)]
        public DokumentklasseCode? Dokumentklasse { get; set; }

        [XmlElement("datei", Namespace = XJustizExport.Tns, Order = 2)]
        public Datei Datei { get; set; } = new();
    }

    public class Datei
    {
        [XmlElement("dateiname", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Dateiname { get; set; }

        [XmlElement("bestandteil", Namespace = XJustizExport.Tns, Order = 2)]
        public List<Bestandteil> Bestandteile { get; set; } = new();
    }

    public class Bestandteil
    {
        [XmlAttribute("listVersionID")]
        public string ListVersionId { get; set; } = "2.4";

        [XmlElement("code", Namespace = "", Order = 1)]
        public string Code { get; set; } = "001";
    }

    public class DokumentklasseCode
    {
        [XmlAttribute("listVersionID")]
        public string ListVersionId { get; set; } = "3.5.1";

        [XmlElement("code", Namespace = "")]
        public string Code { get; set; } = string.Empty;
    }

    public class AnwendungsspezifischeErweiterung
    {
        [XmlElement("kennung", Namespace = XJustizExport.Tns, Order = 1)]
        public string Kennung { get; set; } = "Mandatensoftware";

        [XmlElement("name", Namespace = XJustizExport.Tns, Order = 2)]
        public string Name { get; set; } = "JL.Portal";

        [XmlElement("feldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
        public List<Feldgruppe>? Feldgruppen { get; set; }

        [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
        public List<Feld>? Felder { get; set; }
    }

    public class Feldgruppe
    {
        [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Name { get; set; }

        [XmlElement("beschreibung", Namespace = XJustizExport.Tns, Order = 2)]
        public string Beschreibung { get; set; } = string.Empty;

        [XmlElement("unterfeldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
        public List<Feldgruppe>? UnterFeldgruppen { get; set; }

        [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
        public List<Feld>? Felder { get; set; }
    }

    public class Feld
    {
        [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
        public string? Name { get; set; }

        [XmlElement("wert", Namespace = XJustizExport.Tns, Order = 2)]
        public string? Wert { get; set; }
    }
}
