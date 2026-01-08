namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Eine externe Quelle für eine Datei.<br/>
/// <u><b>External source:</b></u> An external file source.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class ExterneQuelle
{
    //TODO: Define how a FileSource might look like
    /// <summary>
    /// Parameter für die Verbindung.<br/>
    /// <u><b>Connection parameters:</b></u> Connection parameters.
    /// </summary>
    [XmlElement("verbindungsparameter", Namespace = "", Order = 1)]
    public string? Verbindungsparameter { get; set; }

    /// <summary>
    /// Der Typ der Verbindung.<br/>
    /// <u><b>Connection type:</b></u> The connection type.
    /// </summary>
    [XmlElement("verbindungstyp", Namespace = "", Order = 2)]
    public VerbindungsTyp? Verbindungstyp { get; set; }

    /// <summary>
    /// Der Hashwert der Datei.<br/>
    /// <u><b>Hash value:</b></u> The hash value of the file.
    /// </summary>
    [XmlElement("hashwert", Namespace = "", Order = 3)]
    public string? Hashwert { get; set; }
}

//TODO: Define Enum for this ???
/// <summary>
/// Typ der Verbindung.<br/>
/// <u><b>Connection type:</b></u> Connection type.
/// </summary>
public class VerbindungsTyp
{
    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}