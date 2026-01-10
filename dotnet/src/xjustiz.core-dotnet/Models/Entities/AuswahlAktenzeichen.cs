namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.<br/>
/// <u><b>File reference selection:</b></u> Selection structure for file references.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.<br/>
    /// <u><b>Free text:</b></u> The complete file reference can be transmitted here as unstructured free text.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    [System.Text.Json.Serialization.JsonPropertyName("aktenzeichen.freitext")]
    public string? Freitext { get; set; }
}
