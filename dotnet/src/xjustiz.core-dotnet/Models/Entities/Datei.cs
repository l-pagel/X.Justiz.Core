namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Datei.<br/>
/// <u><b>File:</b></u> Represents a file.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Datei
{
    /// <summary>
    /// Der Dateiname soll nach der Syntax "Dokumentname_UUID.Dateiformat" gebildet werden. Die Länge von Dateinamen darf nur 90 Zeichen inkl. der Dateiendungen betragen. In Dateinamen dürfen nur noch alle Buchstaben des deutschen Alphabetes einschließlich der Umlaute Ä, ä, Ö, ö, Ü, ü und ß genutzt werden. Zudem dürfen alle Ziffern und die Zeichen "Unterstrich" und "Minus" genutzt werden. Punkte sind nur als Trenner zwischen dem Dateinamen und der Dateinamenserweiterung zulässig. Nur bei konkatenierten Dateinamensendungen, z.B. bei abgesetzten Signaturdateien, dürfen Punkte auch im Dateinamen genutzt werden (z.B. Dokument1.pdf.pkcs7). Soweit eine signierte Datei gemeinsam mit einer zugehörigen Signaturdatei übersandt wird, hat die Signaturdatei exakt denselben Dateinamen wie die signierte Datei zu erhalten, mit Ausnahme des Dateiformats, welches das Format der Signaturdatei wiedergibt (Identität bei UUID und Dokumentname, z.B. Klage_UUID.pdf und Klage_UUID.pdf.pkcs7). Dies gilt nur für die erste Signaturdatei, die zu einer Datei erstellt wird. Jede weitere Signaturdatei muss einen abweichenden Dateinamen erhalten (z.B. Ergänzung einer Ziffer), da andernfalls komplett identische Dateinamen entstehen. Die Länge von Dateinamen von Signaturdateien darf ebenfalls nur 90 Zeichen inkl. der Signaturdateiendungen betragen. Die XJustiz-Nachricht, die einer EGVP-Nachricht beigefügt wird, beschreibt den Inhalt der Nachricht und muss immer den Dateinamen xjustiz_nachricht.xml tragen. Sofern der EGVP-Nachricht weitere XJustiz-Nachrichten, z.B. bei der Weiterleitung von Nachrichten anderer Beteiligter oder als Bestandteil von Akten, beigefügt werden müssen, so muss dem Dateinamen dieser XJustiz-Datensätze eine UUID angestellt werden (xjustiz_nachricht_UUID.xml).<br/>
    /// <u><b>Filename:</b></u> The filename should be formed according to the syntax 'DocumentName_UUID.FileFormat'. The length of filenames must not exceed 90 characters including file extensions. Only letters of the German alphabet including umlauts Ä, ä, Ö, ö, Ü, ü and ß may be used in filenames. In addition, all digits and the characters 'underscore' and 'minus' may be used. Dots are only permitted as separators between the filename and the file extension. Dots may only be used in the filename for concatenated file extensions, e.g., for detached signature files (e.g., Document1.pdf.pkcs7). If a signed file is sent together with an associated signature file, the signature file must have exactly the same filename as the signed file, with the exception of the file format, which reflects the format of the signature file (identity of UUID and document name, e.g., Klage_UUID.pdf and Klage_UUID.pdf.pkcs7). This only applies to the first signature file created for a file. Any further signature file must have a different filename (e.g., addition of a digit), otherwise completely identical filenames will result. The length of filenames of signature files must also not exceed 90 characters including the signature file extensions. The XJustiz message attached to an EGVP message describes the content of the message and must always bear the filename xjustiz_nachricht.xml. If further XJustiz messages must be attached to the EGVP message, e.g., when forwarding messages from other participants or as part of files, a UUID must be prefixed to the filename of these XJustiz data sets (xjustiz_nachricht_UUID.xml).
    /// </summary>
    [XmlElement("dateiname", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Dateiname { get; set; }

    /// <summary>
    /// Ein Dokument kann aus mehreren Dateien bestehen. So kann bspw. in einer Datei der Schriftsatz und in einer weiteren Datei die zugehörige Signatur übermittelt werden. Fachlich bilden beide Dateien gemeinsam das Dokument. Entsprechendes gilt, wenn zu einer eingereichten Originaldatei weitere Dateien erstellt werden (Repräsentate, Versionen, Transfervermerke, Signaturprüfprotokolle). Die Werteliste dient dazu, den Bestandteiltyp für die einzelnen Dateien anzugeben. Dabei darf der Bestandteiltyp "Original" für ein und dasselbe Dokument nur einmal vorkommen.<br/>
    /// <u><b>Components:</b></u> A document can consist of several files. For example, the pleading can be transmitted in one file and the associated signature in another file. Technically, both files together form the document. The same applies if further files are created for a submitted original file (representatives, versions, transfer notes, signature verification logs). The value list serves to specify the component type for the individual files. The component type 'Original' may only occur once for the same document.
    /// </summary>
    [XmlElement("bestandteil", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Bestandteil> Bestandteile { get; set; } = new();
}
