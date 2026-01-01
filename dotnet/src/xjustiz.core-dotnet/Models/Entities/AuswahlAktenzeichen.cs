namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.
/// Selection structure for file references.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.
    /// The complete file reference can be transmitted here as unstructured free text.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Freitext { get; set; }
}
