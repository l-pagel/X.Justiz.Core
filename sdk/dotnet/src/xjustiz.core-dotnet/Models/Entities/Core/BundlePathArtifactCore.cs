namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Dateipfad innerhalb eines Bundles.<br/>
/// <u><b>Bundle path artifact:</b></u> Represents a file path within a bundle.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class BundlePathArtifactCore : ArtifactCore
{
    /// <summary>
    /// Der relative Pfad zur Datei im Bundle.<br/>
    /// <u><b>Path:</b></u> The relative path to the file in the bundle.
    /// </summary>
    [XmlElement("pfad", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("path")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Path { get; set; } = string.Empty;
}