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
    [XmlElement("verbindungsparameter", Namespace = "", Order = 1)]
    public string? Verbindungsparameter { get; set; }

    [XmlElement("verbindungstyp", Namespace = "", Order = 2)]
    public VerbindungsTyp? Verbindungstyp { get; set; }

    [XmlElement("hashwert", Namespace = "", Order = 3)]
    public string? Hashwert { get; set; }
}

//TODO: Define Enum for this ???
public class VerbindungsTyp
{
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}