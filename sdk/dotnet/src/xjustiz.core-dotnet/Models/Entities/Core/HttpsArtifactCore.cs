namespace xjustiz.core_dotnet.Models.Entities.Core;

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine URL zum Abruf einer Datei via HTTPS.<br/>
/// <u><b>HTTPS artifact:</b></u> Represents a URL for retrieving a file via HTTPS.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class HttpsArtifactCore : ArtifactCore
{
    /// <summary>
    /// Die URL zur Datei.<br/>
    /// <u><b>URL:</b></u> The URL to the file.
    /// </summary>
    [XmlElement("url", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("url")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Url { get; set; } = string.Empty;

    /// <summary>
    /// Der Zeitpunkt an dem die URL abläuft.<br/>
    /// <u><b>Expires at UTC:</b></u> The time when the URL expires.
    /// </summary>
    [XmlElement("ablaufdatum", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("expiresAtUtc")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public DateTime? ExpiresAtUtc { get; set; }

    /// <summary>
    /// Optionale HTTP-Header für den Abruf.<br/>
    /// <u><b>Headers:</b></u> Optional HTTP headers for retrieval.
    /// </summary>
    [XmlArray("headerListe", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XmlArrayItem("header", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("headers")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<HttpHeaderCore> Headers { get; set; } = [];
}