namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert das Geschlecht einer Person als Code.
/// Represents the gender of a person as a code.
/// </summary>
public class Geschlecht
{
    /// <summary>
    /// Der Code für das Geschlecht.
    /// The code for the gender.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}
