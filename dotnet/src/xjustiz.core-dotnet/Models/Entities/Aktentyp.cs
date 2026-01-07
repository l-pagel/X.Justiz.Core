namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Aktentyp;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Definiert den Typen einer Akte.<br/>
/// <u><b>File type:</b></u> Defines the type of a file/case.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Aktentyp : ICode<AktentypCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2.2";

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp";

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToString();
        set => Code = Enum.TryParse<AktentypCode>(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public AktentypCode Code { get; set; }
}
