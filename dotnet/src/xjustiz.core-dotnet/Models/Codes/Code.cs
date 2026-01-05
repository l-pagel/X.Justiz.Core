namespace xjustiz.core_dotnet.Models.Codes;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der XÖV-Datentyp CodeValue ermöglicht die Übermittlung von Werten, so genannter Codes, aus vordefinierten Codelisten. Eine Codeliste ist eine Liste von Codes und der Beschreibung ihrer jeweiligen Bedeutung. Eine entscheidende Eigenschaft des Datentyps ist die Möglichkeit auf differenzierte Weise Bezug zu Codelisten zu nehmen (CodeValue-Typ 1 bis 4). In jedem Fall erlauben die übermittelten Daten eine eindeutige Identifizierung der zugrundeliegenden Codeliste.<br/>
/// <u><b>CodeValue:</b></u> The XÖV data type “CodeValue” enables the transmission of values — so-called codes — from predefined code lists.
/// A code list is a list of codes along with a description of their respective meanings.
/// A key characteristic of this data type is the ability to reference code lists in a differentiated way (code types 1 to 4).
/// In every case, the transmitted data allows for the unambiguous identification of the underlying code list.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Code
{
    /// <summary>
    /// Mit diesem XML-Attribut wird die Kennung der Codeliste übermittelt, in deren Kontext der jeweilige CodeValue zu interpretieren ist. Die Kennung identifiziert die Codeliste, nicht jedoch deren Version eindeutig. Wird bereits im Rahmen des XÖV-Standards eine Kennung vorgegeben (es handelt sich in diesem Fall um einen CodeValue-Typ 1, 2 oder 3) darf auf eine nochmalige Angabe der Kennung bei der Übermittlung eines Codes verzichtet werden. Aus diesem Grund ist das XML-Attribut listURI zunächst als optional deklariert.<br/>
    /// <u><b>List URI:</b></u> This XML attribute is used to transmit the identifier of the code list within whose context the respective code is to be interpreted.
    /// The identifier uniquely identifies the code list, but not its version.
    /// If the identifier is already defined within the XÖV standard (in this case, it is a code type 1, 2, or 3), it may be omitted when transmitting the code.
    /// For this reason, the XML attribute <c>listURI</c> is initially declared as optional..
    /// </summary>
    [XmlAttribute("listURI")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? ListUri { get; set; }

    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen CodeValue-Typ 1 oder 2).<br/>
    /// <u><b>List version ID:</b></u> The version of the code list. Documentation from XOEV library: The specific version of the code list to be used is transmitted with this XML attribute. Analogous to listURI, determining the version of a code list is mandatory when transmitting a code. However, the version can also already be defined in the XÖV standard (in this case, it is a code type 1 or 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// In diesem XML-Element wird der CodeValue einer Codeliste übermittelt.<br/>
    /// <u><b>CodeValue:</b></u> The code of a code list is transmitted in this XML element.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string CodeValue { get; set; } = string.Empty;
}
