namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using System.Text.Json.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Aktentyp;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.<br/>
/// <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_4_0)] // todo: prüfen: Adjusted to conservative guess or typical
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Aktentyp : ICode<AktentypCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = AktentypCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = AktentypCodeLists.Uri;

    /// <summary>
    /// Ruft den Aktentyp-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the case type code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public AktentypCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = AktentypCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
