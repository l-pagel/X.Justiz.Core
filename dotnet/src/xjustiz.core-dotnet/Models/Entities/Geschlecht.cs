namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert das Geschlecht einer Person als Code.<br/>
/// <u><b>Gender:</b></u> Represents the gender of a person as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Geschlecht : ICode<GeschlechtCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2";

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:de:xauslaender:codelist:geschlecht";

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToString();
        set => Code = Enum.TryParse<GeschlechtCode>(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public GeschlechtCode Code { get; set; }
}
