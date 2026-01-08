namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

/// <summary>
/// Versionslisten für <see cref="DokumentklasseCode"/> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codelisten GDS.Dokumentklasse</a>.<br/>
/// <u><b>DocumentClass code lists:</b></u> for <see cref="DokumentklasseCode"/> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code lists GDS.DocumentClass</a>.
/// </summary>
public sealed class DokumentklasseCodeLists : ICodeListCollection<DokumentklasseCode>
{
    /// <summary>
    /// Dokumentklassen Codes Version <b>1.4</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.4:technischerBestandteilGenericode">XRepository: GDS.Dokumentklasse</a>.<br/>
    /// <u><b>DocumentClass codes:</b></u> version <b>1.4</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.4:technischerBestandteilGenericode">XRepository: Code lists GDS.DocumentClass</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Entfernung des Wertes "Anlage" │ Entfernung der Spalte "Fachmodul" │ Erweiterung um die Spalte "Beschreibung" │ Erweiterung um den Wert "Gerichtsbescheid".<br/>
    /// <b>Changelog:</b> Removal of the value 'Attachment' | Removal of the column 'Specialized Module' | Addition of the column 'Description' | Addition of the value 'Court Order'.
    /// </summary>
    public static readonly VersionedCodeList<DokumentklasseCode> V1_4 = new("1.4")
    {
        DokumentklasseCode.Andere_Sonstige,
        DokumentklasseCode.Klage_Antrag,
        DokumentklasseCode.Urteil,
        DokumentklasseCode.Beschluss,
        DokumentklasseCode.Verfuegung,
        DokumentklasseCode.Vermerk,
        DokumentklasseCode.Protokoll,
        DokumentklasseCode.Fehlblatt,
        DokumentklasseCode.Zustellungsdokument,
        DokumentklasseCode.Gutachten,
        DokumentklasseCode.Technische_Information,
        DokumentklasseCode.Schreiben,
        DokumentklasseCode.Antrag_Behoerde,
        DokumentklasseCode.Bescheid,
        DokumentklasseCode.Einspruch_Widerspruch_Behoerde,
        DokumentklasseCode.Einspruchs_Widerspruchsbescheid,
        DokumentklasseCode.Kostendokument,
        DokumentklasseCode.Gerichtsbescheid,
    };

    /// <summary>
    /// Dokumentklassen Codes Version <b>1.3</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.3:technischerBestandteilGenericode">XRepository: GDS.Dokumentklasse</a>.<br/>
    /// <u><b>DocumentClass codes:</b></u> version <b>1.3</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.3:technischerBestandteilGenericode">XRepository: Code lists GDS.DocumentClass</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Es gibt keine inhaltlichen Änderungen zur Vorgängerversion. Es wurde lediglich das Fachmodul REG bei einigen Codelisteneinträgen in der Fachmodulspalte ergänzt.<br/>
    /// <b>Changelog:</b> Removal of the value 'Attachment' | Removal of the column 'Specialized Module' | Addition of the column 'Description' | Addition of the value 'Court Order'.
    /// </summary>
    public static readonly VersionedCodeList<DokumentklasseCode> V1_3 = new("1.3")
    {
        DokumentklasseCode.Andere_Sonstige,
        DokumentklasseCode.Klage_Antrag,
        DokumentklasseCode.Anlage,
        DokumentklasseCode.Urteil,
        DokumentklasseCode.Beschluss,
        DokumentklasseCode.Verfuegung,
        DokumentklasseCode.Vermerk,
        DokumentklasseCode.Protokoll,
        DokumentklasseCode.Fehlblatt,
        DokumentklasseCode.Zustellungsdokument,
        DokumentklasseCode.Gutachten,
        DokumentklasseCode.Technische_Information,
        DokumentklasseCode.Schreiben,
        DokumentklasseCode.Antrag_Behoerde,
        DokumentklasseCode.Bescheid,
        DokumentklasseCode.Einspruch_Widerspruch_Behoerde,
        DokumentklasseCode.Einspruchs_Widerspruchsbescheid,
        DokumentklasseCode.Kostendokument,
    };

    /// <summary>
    /// Dokumentklassen Codes Version <b>1.2</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.2:technischerBestandteilGenericode">XRepository: GDS.Dokumentklasse</a>.<br/>
    /// <u><b>DocumentClass codes:</b></u> version <b>1.2</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.2:technischerBestandteilGenericode">XRepository: Code lists GDS.DocumentClass</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Die Codeliste wurde um den Wert "020|Kostendokument" ergänzt. Die Fachmodule in der Fachmodulspalte werden nun komma-separiert ohne zusätzliches Leerzeichen aufgeführt.<br/>
    /// <b>Changelog:</b> "The code list was extended by adding the value ‘020|Cost document’. The specialist modules listed in the specialist-module column are now shown as comma-separated values without additional spaces.
    /// </summary>
    public static readonly VersionedCodeList<DokumentklasseCode> V1_2 = new("1.2")
    {
        DokumentklasseCode.Andere_Sonstige,
        DokumentklasseCode.Klage_Antrag,
        DokumentklasseCode.Anlage,
        DokumentklasseCode.Urteil,
        DokumentklasseCode.Beschluss,
        DokumentklasseCode.Verfuegung,
        DokumentklasseCode.Vermerk,
        DokumentklasseCode.Protokoll,
        DokumentklasseCode.Fehlblatt,
        DokumentklasseCode.Zustellungsdokument,
        DokumentklasseCode.Gutachten,
        DokumentklasseCode.Technische_Information,
        DokumentklasseCode.Schreiben,
        DokumentklasseCode.Antrag_Behoerde,
        DokumentklasseCode.Bescheid,
        DokumentklasseCode.Einspruch_Widerspruch_Behoerde,
        DokumentklasseCode.Einspruchs_Widerspruchsbescheid,
        DokumentklasseCode.Kostendokument,
    };

    /// <summary>
    /// Dokumentklassen Codes Version <b>1.1</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.1:technischerBestandteilGenericode">XRepository: GDS.Dokumentklasse</a>.<br/>
    /// <u><b>DocumentClass codes:</b></u> version <b>1.1</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.1:technischerBestandteilGenericode">XRepository: Code lists GDS.DocumentClass</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Die Codeliste wurde um eine Spalte 'fachmodul' ergänzt, in der die dort aufgeführten Fachmodule ausschließlich die für sie gekennzeichneten Werte nutzen.<br/>
    /// <b>Changelog:</b> The code list was supplemented by a 'specialized module' column, in which the specialized modules listed there exclusively use the values marked for them.
    /// </summary>
    public static readonly VersionedCodeList<DokumentklasseCode> V1_1 = new("1.1")
    {
        DokumentklasseCode.Andere_Sonstige,
        DokumentklasseCode.Klage_Antrag,
        DokumentklasseCode.Anlage,
        DokumentklasseCode.Urteil,
        DokumentklasseCode.Beschluss,
        DokumentklasseCode.Verfuegung,
        DokumentklasseCode.Vermerk,
        DokumentklasseCode.Protokoll,
        DokumentklasseCode.Fehlblatt,
        DokumentklasseCode.Zustellungsdokument,
        DokumentklasseCode.Gutachten,
        DokumentklasseCode.Technische_Information,
        DokumentklasseCode.Schreiben,
        DokumentklasseCode.Antrag_Behoerde,
        DokumentklasseCode.Bescheid,
        DokumentklasseCode.Einspruch_Widerspruch_Behoerde,
        DokumentklasseCode.Einspruchs_Widerspruchsbescheid,
    };

    /// <summary>
    /// Dokumentklassen Codes Version <b>1.0</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.0:technischerBestandteilGenericode">XRepository: GDS.Dokumentklasse</a>.<br/>
    /// <u><b>DocumentClass codes:</b></u> version <b>1.0</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse_1.0:technischerBestandteilGenericode">XRepository: Code lists GDS.DocumentClass</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Die Einträge entsprechen den Einträgen mit den Schlüsseln 001 bis 019 der früheren Typ1-Codeliste 'GDS-Dokumenttyp in der Version 3.1, welche in die Typ3-Codelisten 'GDS.Dokumentklasse' und 'GDS.Dokumenttyp' aufgeteilt wurde. Die früheren Einträge "002|Eingangsschreiben" und "004|Ausgangsschreiben" wurden entfernt.<br/>
    /// <b>Changelog:</b> The entries correspond to those with keys 001 to 019 from the former Type-1 code list ‘GDS document type, version 3.1’, which has been split into the Type-3 code lists ‘GDS.DocumentClass’ and ‘GDS.DocumentType’. The former entries ‘002 | Incoming correspondence’ and ‘004 | Outgoing correspondence’ were removed.
    /// </summary>
    public static readonly VersionedCodeList<DokumentklasseCode> V1_0 = new("1.0")
    {
        DokumentklasseCode.Andere_Sonstige,
        DokumentklasseCode.Klage_Antrag,
        DokumentklasseCode.Anlage,
        DokumentklasseCode.Urteil,
        DokumentklasseCode.Beschluss,
        DokumentklasseCode.Verfuegung,
        DokumentklasseCode.Vermerk,
        DokumentklasseCode.Protokoll,
        DokumentklasseCode.Fehlblatt,
        DokumentklasseCode.Zustellungsdokument,
        DokumentklasseCode.Gutachten,
        DokumentklasseCode.Technische_Information,
        DokumentklasseCode.Schreiben,
        DokumentklasseCode.Antrag_Behoerde,
        DokumentklasseCode.Bescheid,
        DokumentklasseCode.Einspruch_Widerspruch_Behoerde,
        DokumentklasseCode.Einspruchs_Widerspruchsbescheid,
    };

    public static string Uri => "urn:xoev-de:xjustiz:codeliste:gds.dokumenttyp";

    public static IVersionedCodeList<DokumentklasseCode> LatestList => V1_4;
}
