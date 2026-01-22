namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen HTTP-Header.<br/>
/// <u><b>HTTP header:</b></u> Represents an HTTP header.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class HttpHeaderCore
{
    /// <summary>
    /// Der Name des Headers.<br/>
    /// <u><b>Name:</b></u> The name of the header.
    /// </summary>
    [XmlElement("name", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("name")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Name { get; set; } = string.Empty;

    /// <summary>
    /// Der Wert des Headers.<br/>
    /// <u><b>Value:</b></u> The value of the header.
    /// </summary>
    [XmlElement("wert", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("value")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Value { get; set; } = string.Empty;
}
