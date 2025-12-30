namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert das Geschlecht einer Person als Code.
/// Represents the gender of a person as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Geschlecht
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// Possible codes can be taken from the code list Code.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string? Code { get; set; }
}
