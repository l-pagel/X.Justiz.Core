namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert Integritätsinformationen einer Datei.<br/>
/// <u><b>Hash info:</b></u> Represents file integrity information.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class HashInfo
{
    /// <summary>
    /// Der verwendete Hash-Algorithmus (z.B. SHA-256).<br/>
    /// <u><b>Algorithm:</b></u> The hash algorithm used (e.g., SHA-256).
    /// </summary>
    [XmlElement("algorithmus", Namespace = "")]
    [JsonPropertyName("algorithm")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Algorithm { get; set; } = "SHA-256";

    /// <summary>
    /// Der Hashwert.<br/>
    /// <u><b>Value:</b></u> The hash value.
    /// </summary>
    [XmlElement("wert", Namespace = "")]
    [JsonPropertyName("value")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Value { get; set; } = string.Empty;
}
