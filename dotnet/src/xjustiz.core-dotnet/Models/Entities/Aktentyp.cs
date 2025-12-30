namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Definiert den Typen einer Akte.
/// Defines the type of a file/case.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Aktentyp
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// Possible codes can be taken from the code list Code.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string Code { get; set; } = "001";
}
