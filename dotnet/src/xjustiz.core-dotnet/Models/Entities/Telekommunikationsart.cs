namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Art der Telekommunikation als Code.<br/>
/// <u><b>Telecommunication type:</b></u> Type of telecommunication as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Telekommunikationsart
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.<br/>
    /// <u><b>Code:</b></u> Possible codes can be taken from the code list Code.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Code { get; set; }
}
