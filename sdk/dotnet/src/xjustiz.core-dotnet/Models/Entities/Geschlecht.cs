namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Das Geschlecht einer Person.<br/>
/// <u><b>Gender:</b></u> The gender of a person.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Geschlecht : ICode<GeschlechtCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = GeschlechtCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = GeschlechtCodeLists.Uri;

    /// <summary>
    /// Ruft den Geschlecht-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the gender code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public GeschlechtCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = GeschlechtCodeMapper.TryParse(value, out var result) ? result : default;
    }
}