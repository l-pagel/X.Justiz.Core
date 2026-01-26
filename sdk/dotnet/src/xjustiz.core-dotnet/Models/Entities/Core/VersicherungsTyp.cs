namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Versicherung;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Typ der VersicherungCore.<br/>
/// <u><b>Insurance type:</b></u> Insurance type.
/// </summary>
public class VersicherungsTyp : ICode<VersicherungsTypCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string ListVersionId { get; set; } = VersicherungsTypCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? ListUri { get; set; } = VersicherungsTypCodeLists.Uri;

    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlIgnore]
    [System.Text.Json.Serialization.JsonPropertyName("code")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public VersicherungsTypCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [System.Text.Json.Serialization.JsonIgnore]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = VersicherungsTypCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
