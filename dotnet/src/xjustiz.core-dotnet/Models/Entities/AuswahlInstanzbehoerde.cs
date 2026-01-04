namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für eine Instanzbehörde.<br/>
/// <u><b>Instance authority selection:</b></u> Selection structure for an instance authority.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class AuswahlInstanzbehoerde
{
    /// <summary>
    /// Hier ist die jeweilige XJustiz-ID des Gerichts oder der Staatsanwaltschaft aus der Codeliste anzugeben.<br/>
    /// <u><b>Court:</b></u> The respective XJustiz ID of the court or public prosecutor's office from the code list must be specified here.
    /// </summary>
    [XmlElement("gericht", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Gericht? Gericht { get; set; }
}
