namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Collections.Generic;
using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Datei im Sinne eines Dateimanifests.<br/>
/// <u><b>File core:</b></u> Represents a file as a file manifest.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class DateiCore : Datei
{
    /// <summary>
    /// Die Dateiendung (z.B. .pdf).<br/>
    /// <u><b>File extension:</b></u> The file extension (e.g. .pdf).
    /// </summary>
    [XmlElement("dateiendung", Namespace = "", Order = 3)]
    [JsonPropertyName("fileExtension")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Dateiendung { get; set; }

    /// <summary>
    /// Der Content-Type der Datei (z.B. application/pdf).<br/>
    /// <u><b>Content type:</b></u> The content type of the file (e.g. application/pdf).
    /// </summary>
    [XmlElement("contentType", Namespace = "", Order = 4)]
    [JsonPropertyName("contentType")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? ContentType { get; set; }

    /// <summary>
    /// Die Größe der Datei in Bytes.<br/>
    /// <u><b>Size:</b></u> The size of the file in bytes.
    /// </summary>
    [XmlElement("groesse", Namespace = "", Order = 5)]
    [JsonPropertyName("size")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public long? Groesse { get; set; }

    /// <summary>
    /// Integritätsinformationen der Datei.<br/>
    /// <u><b>Hash:</b></u> Integrity information of the file.
    /// </summary>
    [XmlElement("hash", Namespace = "", Order = 6)]
    [JsonPropertyName("hash")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public HashInfo? Hash { get; set; }

    /// <summary>
    /// Eine Liste von Abrufmöglichkeiten für die Datei.<br/>
    /// <u><b>Artifacts:</b></u> A list of retrieval options for the file.
    /// </summary>
    [XmlArray("artefaktListe", Namespace = "", Order = 7)]
    [XmlArrayItem("bundlePfad", typeof(BundlePathArtifact), Namespace = "")]
    [XmlArrayItem("https", typeof(HttpsArtifact), Namespace = "")]
    [JsonPropertyName("artifacts")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Artifact> Artefakte { get; set; } = new();
}
