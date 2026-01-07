namespace xjustiz.core_dotnet.Models.Entities;

using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Dokumentklasse;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für eine Dokumentklasse der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>Codeliste "Dokumentklasse"</a>.<br/>
/// <u><b>Document class code:</b></u> The code for a document class of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>code list "Dokumentklasse"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Dokumentklasse : ICode<DokumentklasseCode>
{
    public string ListVersionId { get; set; } = "1.4"; // Default to latest

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse";

    public DokumentklasseCode Code { get; set; }
}
