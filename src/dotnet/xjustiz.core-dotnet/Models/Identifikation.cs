namespace xjustiz.core_dotnet.Models;

using System;
using System.Xml.Serialization;

/// <summary>
/// Identifiziert ein Objekt eindeutig.
/// Uniquely identifies an object.
/// </summary>
public class Identifikation
{
    /// <summary>
    /// Die eindeutige ID des Objekts (UUID).
    /// The unique ID of the object (UUID).
    /// </summary>
    [XmlElement("id", Namespace = XJustizExport.Tns, Order = 1)]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    /// <summary>
    /// Die Nummer des Objekts im übergeordneten Container (z.B. "1").
    /// The number of the object within the parent container (e.g., "1").
    /// </summary>
    [XmlElement("nummerImUebergeordnetenContainer", Namespace = XJustizExport.Tns, Order = 2)]
    public string NummerImUebergeordnetenContainer { get; set; } = "1";
}
