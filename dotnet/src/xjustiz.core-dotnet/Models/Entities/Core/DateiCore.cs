namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Datei.<br/>
/// <u><b>File:</b></u> Represents a file.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class DateiCore : Datei
{
    /// <summary>
    /// Gibt an ob die Datei teil des Export Verzeichnisses ist oder ob der Zugriff über eine externe quelle (z.B Downloadlink) erfolgt.<br/>
    /// <u><b>IsExternal</b></u> 'true' if the file must be retrieved from an external source.
    /// </summary>
    [XmlElement("lokal", Namespace = "", Order = 4)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public bool IsExternal { get; set; }

    /// <summary>
    /// Gibt eine externe Quelle an über die man die Datei beziehen kann.<br/>
    /// <u><b>ExternalSource:</b></u> Specifies an external source from which the file can be obtained.
    /// </summary>
    [XmlElement("lokal", Namespace = "", Order = 4)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public ExterneQuelle? ExterneQuelle { get; set; }
}
