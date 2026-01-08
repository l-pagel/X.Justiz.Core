namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using System.Text.Json.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Rolle;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Ermöglicht die Angabe einer Rollenbezeichnung als Code.<br/>
/// <u><b>Role name:</b></u> Enables the specification of a role name as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Rollenbezeichnung : ICode<RollenCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = RollenCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = RollenCodeLists.Uri;

    /// <summary>
    /// Ruft den Rollenbezeichnung-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the role name code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public RollenCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = RollenCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
