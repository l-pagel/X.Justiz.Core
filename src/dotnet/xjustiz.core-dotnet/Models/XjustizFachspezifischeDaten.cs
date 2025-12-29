namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Entities;

/// <summary>
/// Fachspezifische Daten eines Dokuments.
/// </summary>
public class XjustizFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen, systemübergreifenden Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Element 'dokumententyp' verwendet werden.
    /// </summary>
    [XmlElement("dokumentklasse", Namespace = XJustizExport.Tns, Order = 1)]
    public DokumentklasseCode? Dokumentklasse { get; set; }

    /// <summary>
    /// Repräsentiert eine Datei.
    /// </summary>
    [XmlElement("datei", Namespace = XJustizExport.Tns, Order = 2)]
    public Datei Datei { get; set; } = new();
}
