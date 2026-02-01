namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Versicherer;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Das Versicherungsunternehmen.<br/>
/// <u><b>Insurance company:</b></u> The insurance company.
/// </summary>
public class Versicherer : ICode<VersichererCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string ListVersionId { get; set; } = VersichererCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? ListUri { get; set; } = VersichererCodeLists.Uri;

    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlIgnore]
    [System.Text.Json.Serialization.JsonPropertyName("code")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public VersichererCode Code { get; set; }

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
        set => Code = VersichererCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
