namespace xjustiz.core_dotnet.Models;

using System;
using System.Xml.Serialization;

public class Identifikation
{
    [XmlElement("id", Namespace = XJustizExport.Tns, Order = 1)]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    [XmlElement("nummerImUebergeordnetenContainer", Namespace = XJustizExport.Tns, Order = 2)]
    public string NummerImUebergeordnetenContainer { get; set; } = "1";
}
