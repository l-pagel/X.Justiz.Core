namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Enthält Listen von Schriftgutobjekten (Akten und Dokumente).<br/>
/// <u><b>Document objects:</b></u> Contains lists of document objects (files/cases and documents).
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Schriftgutobjekte
{
    /// <summary>
    /// Repräsentiert eine Akte.<br/>
    /// <u><b>File:</b></u> Represents a file / case.
    /// </summary>
    [XmlElement("akte", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Akte>? Akte { get; set; }

    /// <summary>
    /// In diesem Element sollen alle Dokumente aufgeführt werden, die im Rahmen des konkreten Kommunikationsanlasses übermittelt werden. Die XJustiz-Nachricht selbst soll nicht aufgeführt werden, da sie lediglich der Beschreibung des Inhalts der Übermittlung dient.<br/>
    /// <u><b>Documents:</b></u> All documents transmitted in the context of the specific communication occasion should be listed in this element. The XJustiz message itself should not be listed, as it only serves to describe the content of the transmission.
    /// </summary>
    [XmlElement("dokument", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Dokument>? Dokumente { get; set; }
}
