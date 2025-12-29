namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Art der Telekommunikation als Code.
/// Type of telecommunication as a code.
/// </summary>
public class Telekommunikationsart
{
    /// <summary>
    /// Der Code für die Telekommunikationsart.
    /// The code for the telecommunication type.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string? code { get; set; }
}
