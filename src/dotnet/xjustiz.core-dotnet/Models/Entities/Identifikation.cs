namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;

/// <summary>
/// Identifiziert ein Objekt eindeutig.
/// </summary>
public class Identifikation
{
    /// <summary>
    /// Der Datentyp zur Angabe einer UUID.
    /// </summary>
    [XmlElement("id", Namespace = XJustizExport.Tns, Order = 1)]
    public string Id { get; set; } = Guid.NewGuid().ToString();
    /// <summary>
    /// Über die Nummer im übergeordneten Container wird den Schriftgutobjekten eine Reihenfolge mitgegeben. Unter "Container“ ist dabei jeweils das Akten-, Teilakten- oder Dokumentensegment, in dem die Schriftgutobjekte aufgeführt sind, zu verstehen. Umsetzungshinweise: Die Nummern dürfen innerhalb eines Containers nicht doppelt vergeben werden. Dies gilt auch für unterschiedliche Arten von Schriftgutobjekten innerhalb eines Containers (z.B. Teilakten und Dokumente innerhalb einer Akte). Die Nummerierung muss in dem Container mit 1 beginnen. Auslassungen sind nicht zulässig, da die Bedeutung einer fehlenden Zahl keine Rückschlüsse, z.B. auf die Vollständigkeit einer Akte, erlaubt.
    /// </summary>
    [XmlElement("nummerImUebergeordnetenContainer", Namespace = XJustizExport.Tns, Order = 2)]
    public string NummerImUebergeordnetenContainer { get; set; } = "1";
}
