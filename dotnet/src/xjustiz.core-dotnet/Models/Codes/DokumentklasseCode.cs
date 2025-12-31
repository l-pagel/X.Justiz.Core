namespace xjustiz.core_dotnet.Models.Codes;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für eine Dokumentklasse.
/// The code for a document class.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class DokumentklasseCode
{
    [XmlAttribute("listVersionID")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// In diesem XML-Element wird der Code einer Codeliste übermittelt.
    /// The code of a code list is transmitted in this XML element.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string Code { get; set; } = string.Empty;
}
