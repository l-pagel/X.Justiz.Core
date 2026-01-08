namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Rolle;
using xjustiz.core_dotnet.Util.Versioning;
using xjustiz.core_dotnet.Models.Codes;

/// <summary>
/// Repräsentiert die Bezeichnung einer Rolle als Code der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>Codeliste "Rollenbezeichnung"</a>.<br/>
/// <u><b>Role designation:</b></u> Represents the designation of a role as a code of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>code list "Rollenbezeichnung"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Rollenbezeichnung : ICode<RollenCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.6"; //Default to latest

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = "urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung";

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToString();
        set => Code = Enum.TryParse<RollenCode>(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public RollenCode Code { get; set; }
}
