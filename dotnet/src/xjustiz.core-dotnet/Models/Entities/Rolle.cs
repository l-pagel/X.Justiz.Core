namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Rolle;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für eine Rolle der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>Codeliste "Rollenbezeichnung"</a>.<br/>
/// <u><b>Role code:</b></u> The code for a role of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>code list "RoleName"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_4_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Rolle : ICode<RollenCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = RollenCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = RollenCodeLists.Uri;

    /// <summary>
    /// Interne Eigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Internal property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = RollenCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    /// <summary>
    /// Ruft den Rolle-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the role code.
    /// </summary>
    [XmlIgnore]
    public RollenCode Code { get; set; }
}
