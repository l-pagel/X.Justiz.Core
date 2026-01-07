namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Fachspezifische Daten eines Dokuments.<br/>
/// <u><b>Subject-specific data:</b></u> Specialized data of a document.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class XjustizFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet die Dokumentklasse anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen, systemübergreifenden Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Element 'dokumententyp' verwendet werden.<br/>
    /// <u><b>Document class:</b></u> Designates the document class based on the predefined value list. This is deliberately kept concise for smooth, cross-system exchange. For a more specific designation, the element 'dokumententyp' (document type) can be used.
    /// </summary>
    [XmlElement("dokumentklasse", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Dokumentklasse? Dokumentklasse { get; set; }

    /// <summary>
    /// Repräsentiert eine Datei.<br/>
    /// <u><b>File:</b></u> Represents a file.
    /// </summary>
    [XmlElement("datei", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Datei Datei { get; set; } = new();
}
