namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Identifiziert ein Objekt eindeutig.
/// Uniquely identifies an object.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Identifikation
{
    /// <summary>
    /// Der Datentyp zur Angabe einer UUID.
    /// The data type for specifying a UUID.
    /// </summary>
    [XmlElement("id", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    /// <summary>
    /// Über die Nummer im übergeordneten Container wird den Schriftgutobjekten eine Reihenfolge mitgegeben. Unter "Container“ ist dabei jeweils das Akten-, Teilakten- oder Dokumentensegment, in dem die Schriftgutobjekte aufgeführt sind, zu verstehen. Umsetzungshinweise: Die Nummern dürfen innerhalb eines Containers nicht doppelt vergeben werden. Dies gilt auch für unterschiedliche Arten von Schriftgutobjekten innerhalb eines Containers (z.B. Teilakten und Dokumente innerhalb einer Akte). Die Nummerierung muss in dem Container mit 1 beginnen. Auslassungen sind nicht zulässig, da die Bedeutung einer fehlenden Zahl keine Rückschlüsse, z.B. auf die Vollständigkeit einer Akte, erlaubt.
    /// A sequence is given to the document objects via the number in the superordinate container. 'Container' refers to the file, sub-file or document segment in which the document objects are listed. Implementation notes: The numbers may not be assigned twice within a container. This also applies to different types of document objects within a container (e.g., sub-files and documents within a file). The numbering must start with 1 in the container. Omissions are not permitted, as the meaning of a missing number allows no conclusions, e.g., on the completeness of a file.
    /// </summary>
    [XmlElement("nummerImUebergeordnetenContainer", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string NummerImUebergeordnetenContainer { get; set; } = "1";
}
