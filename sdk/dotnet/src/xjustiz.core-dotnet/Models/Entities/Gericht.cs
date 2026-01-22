namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Gericht als Code.<br/>
/// <u><b>Court:</b></u> Represents a court as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Gericht : ICode<GerichtCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = GerichtCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = GerichtCodeLists.Uri;

    /// <summary>
    /// Ruft den Gericht-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the court code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public GerichtCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = GerichtCodeMapper.TryParse(value, out var result) ? result : default;
    }
}