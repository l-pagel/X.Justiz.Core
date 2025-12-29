namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Definiert den Typen einer Akte.
/// </summary>
public class Aktentyp
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}
