namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Aktenzeichen.<br/>
/// <u><b>File reference:</b></u> Represents a file reference / case number.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Aktenzeichen
{
    /// <summary>
    /// Auswahlstruktur für Aktenzeichen.<br/>
    /// <u><b>Selection:</b></u> Selection structure for file references.
    /// </summary>
    [XmlElement("auswahl_aktenzeichen", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public AuswahlAktenzeichen Auswahl { get; set; } = new();
}
