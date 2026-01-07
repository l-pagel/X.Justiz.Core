namespace xjustiz.core_dotnet.Models.Codes;

using xjustiz.core_dotnet.Models.Codes.Rolle;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert die Bezeichnung einer Rolle als Code der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>Codeliste "Rollenbezeichnung"</a>.<br/>
/// <u><b>Role designation:</b></u> Represents the designation of a role as a code of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung'>code list "Rollenbezeichnung"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Rollenbezeichnung : ICode<RollenCode>
{
    public string ListVersionId { get; set; } = "3.6"; //Default to latest

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung";

    public RollenCode Code { get; set; }
}
