namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Staat;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Staat als Code.<br/>
/// <u><b>State:</b></u> Represents a state as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Staat : ICode<StaatCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = StaatCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = StaatCodeLists.Uri;

    /// <summary>
    /// Ruft den Staat-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the state code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public StaatCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = StaatCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
