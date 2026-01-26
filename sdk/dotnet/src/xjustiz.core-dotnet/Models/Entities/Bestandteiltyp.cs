namespace xjustiz.core_dotnet.Models.Entities;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Bestandteil;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Bestandteiltyp definiert die Art eines Dokumentbestandteils (z. B. Original, Signaturdatei).<br/>
/// <u><b>Component type:</b></u> The component type defines the type of a document component (e.g., original, signature file).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Bestandteiltyp : ICode<BestandteiltypCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = BestandteiltypCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = BestandteiltypCodeLists.Uri;

    /// <summary>
    /// Ruft den Bestandteiltyp-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the component type code.
    /// </summary>
    [XmlIgnore]
    [JsonPropertyName("code")]
    public BestandteiltypCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonIgnore]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = BestandteiltypCodeMapper.TryParse(value, out var result) ? result : default;
    }
}