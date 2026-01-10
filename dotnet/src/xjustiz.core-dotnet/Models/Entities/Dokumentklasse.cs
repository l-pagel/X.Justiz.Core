namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Dokumentklasse;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Die Dokumentklasse definiert den Typ eines Dokuments (z. B. Klageschrift, Urteil).<br/>
/// <u><b>Document class:</b></u> The document class defines the type of a document (e.g., statement of claim, judgment).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Dokumentklasse : ICode<DokumentklasseCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = DokumentklasseCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = DokumentklasseCodeLists.Uri;

    /// <summary>
    /// Ruft den Dokumentklasse-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the document class code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public DokumentklasseCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = DokumentklasseCodeMapper.TryParse(value, out var result) ? result : default;
    }
}
