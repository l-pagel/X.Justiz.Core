namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Definiert den Typen einer Akte.
/// Defines the type of a file/case.
/// </summary>
public class Aktentyp
{
    /// <summary>
    /// Der Code für den Aktentyp (z.B. "001" für Allgemeine Akte).
    /// The code for the file type (e.g., "001" for General File).
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}
