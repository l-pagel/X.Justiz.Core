namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

using System;
using System.Collections.Generic;

/// <summary>
/// Mapper für <see cref="DokumentklasseCode"/>.<br/>
/// <u><b>Document class code mapper:</b></u> Mapper for <see cref="DokumentklasseCode"/>.
/// </summary>
public static partial class DokumentklasseCodeMapper
{
    private static readonly Dictionary<string, DokumentklasseCode> Map = new(StringComparer.OrdinalIgnoreCase)
    {
        { "001", DokumentklasseCode.Andere_Sonstige },
        { "003", DokumentklasseCode.Klage_Antrag },
        { "005", DokumentklasseCode.Anlage },
        { "006", DokumentklasseCode.Urteil },
        { "007", DokumentklasseCode.Beschluss },
        { "008", DokumentklasseCode.Verfuegung },
        { "009", DokumentklasseCode.Vermerk },
        { "010", DokumentklasseCode.Protokoll },
        { "011", DokumentklasseCode.Fehlblatt },
        { "012", DokumentklasseCode.Zustellungsdokument },
        { "013", DokumentklasseCode.Gutachten },
        { "014", DokumentklasseCode.Technische_Information },
        { "015", DokumentklasseCode.Schreiben },
        { "016", DokumentklasseCode.Antrag_Behoerde },
        { "017", DokumentklasseCode.Bescheid },
        { "018", DokumentklasseCode.Einspruch_Widerspruch_Behoerde },
        { "019", DokumentklasseCode.Einspruchs_Widerspruchsbescheid },
        { "020", DokumentklasseCode.Kostendokument },
        { "021", DokumentklasseCode.Gerichtsbescheid },
        { "Andere / Sonstige", DokumentklasseCode.Andere_Sonstige },
        { "Anlage", DokumentklasseCode.Anlage },
        { "Antrag (Behörde)", DokumentklasseCode.Antrag_Behoerde },
        { "Bescheid", DokumentklasseCode.Bescheid },
        { "Beschluss", DokumentklasseCode.Beschluss },
        { "Einspruch / Widerspruch (Behörde)", DokumentklasseCode.Einspruch_Widerspruch_Behoerde },
        { "Einspruchs- / Widerspruchsbescheid", DokumentklasseCode.Einspruchs_Widerspruchsbescheid },
        { "Fehlblatt", DokumentklasseCode.Fehlblatt },
        { "Gerichtsbescheid", DokumentklasseCode.Gerichtsbescheid },
        { "Gutachten", DokumentklasseCode.Gutachten },
        { "Klage / Antrag", DokumentklasseCode.Klage_Antrag },
        { "Kostendokument", DokumentklasseCode.Kostendokument },
        { "Protokoll", DokumentklasseCode.Protokoll },
        { "Schreiben", DokumentklasseCode.Schreiben },
        { "Technische Information", DokumentklasseCode.Technische_Information },
        { "Urteil", DokumentklasseCode.Urteil },
        { "Verfügung", DokumentklasseCode.Verfuegung },
        { "Vermerk", DokumentklasseCode.Vermerk },
        { "Zustellungsdokument", DokumentklasseCode.Zustellungsdokument },
    };

    /// <summary>
    /// Tries to parse a string value (Code, Name) into a DokumentklasseCode.
    /// </summary>
    public static bool TryParse(string? value, out DokumentklasseCode code)
    {
        if (string.IsNullOrWhiteSpace(value))
        {
            code = default;
            return false;
        }

        return Map.TryGetValue(value.Trim(), out code);
    }
}
