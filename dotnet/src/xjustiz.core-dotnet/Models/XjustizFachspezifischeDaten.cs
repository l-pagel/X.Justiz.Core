namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Entities;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten eines Dokuments.
/// Specialized data of a document.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class XjustizFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen, systemübergreifenden Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Element 'dokumententyp' verwendet werden.
    /// Designates the document class based on the predefined value list. This is deliberately kept concise for smooth, cross-system exchange. For a more specific designation, the element 'dokumententyp' (document type) can be used.
    /// </summary>
    [XmlElement("dokumentklasse", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public DokumentklasseCode? Dokumentklasse { get; set; }

    /// <summary>
    /// Repräsentiert eine Datei.
    /// Represents a file.
    /// </summary>
    [XmlElement("datei", Namespace = XJustizExport.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Datei Datei { get; set; } = new();
}
