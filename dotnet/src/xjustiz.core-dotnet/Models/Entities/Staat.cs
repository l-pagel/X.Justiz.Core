namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Staat;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Staat als Code.<br/>
/// <u><b>Country:</b></u> Represents a country / state as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Staat : ICode<StaatCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2024-08-01";

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:de:bund:destatis:bevoelkerungsstatistik:schluessel:staat";

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = StaatCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public StaatCode Code { get; set; }
}
