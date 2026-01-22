namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Die Art der Telekommunikation.<br/>
/// <u><b>Telecommunication type:</b></u> The type of telecommunication.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Telekommunikationsart : ICode<TelekommunikationsartCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = TelekommunikationsartCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = TelekommunikationsartCodeLists.Uri;

    /// <summary>
    /// Ruft den Telekommunikationsart-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the telecommunication type code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public TelekommunikationsartCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set
        {
            if (TelekommunikationsartCodeMapper.TryParse(value, out var result))
            {
                Code = result;
            }
            else
            {
                Code = default;
            }
        }
    }
}
