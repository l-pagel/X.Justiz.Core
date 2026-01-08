namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Gericht als Code.<br/>
/// <u><b>Court:</b></u> Represents a court as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Gericht : ICode<GerichtCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = GerichtCodeLists.LatestList.Version;

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = GerichtCodeLists.Uri;

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = GerichtCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public GerichtCode Code { get; set; }
}