namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Definiert den Typen einer Akte.
/// Defines the type of a file/case.
/// </summary>
public class Aktentyp
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// Possible codes can be taken from the code list Code.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}
