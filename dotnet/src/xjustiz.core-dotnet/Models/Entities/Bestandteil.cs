namespace xjustiz.core_dotnet.Models.Entities;

using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Bestandteil;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Ein Bestandteil einer Datei (z.B. Format, Version) als Code der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp'>Codeliste "Bestandteiltyp"</a>.<br/>
/// <u><b>Component:</b></u> A component of a file (e.g., format, version) as a code of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp'>code list "Bestandteiltyp"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Bestandteil : ICode<BestandteilCode>
{
    public string ListVersionId { get; set; } = "2.4"; //Default to latest

    public string? ListUri { get; set; } = "https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp";

    public BestandteilCode Code { get; set; }
}
