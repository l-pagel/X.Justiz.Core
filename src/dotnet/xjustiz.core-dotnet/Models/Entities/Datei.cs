namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Datei.
/// </summary>
public class Datei
{
    /// <summary>
    /// Der Dateiname soll nach der Syntax "Dokumentname_UUID.Dateiformat" gebildet werden. Die Länge von Dateinamen darf nur 90 Zeichen inkl. der Dateiendungen betragen. In Dateinamen dürfen nur noch alle Buchstaben des deutschen Alphabetes einschließlich der Umlaute Ä, ä, Ö, ö, Ü, ü und ß genutzt werden. Zudem dürfen alle Ziffern und die Zeichen "Unterstrich" und "Minus" genutzt werden. Punkte sind nur als Trenner zwischen dem Dateinamen und der Dateinamenserweiterung zulässig. Nur bei konkatenierten Dateinamensendungen, z.B. bei abgesetzten Signaturdateien, dürfen Punkte auch im Dateinamen genutzt werden (z.B. Dokument1.pdf.pkcs7). Soweit eine signierte Datei gemeinsam mit einer zugehörigen Signaturdatei übersandt wird, hat die Signaturdatei exakt denselben Dateinamen wie die signierte Datei zu erhalten, mit Ausnahme des Dateiformats, welches das Format der Signaturdatei wiedergibt (Identität bei UUID und Dokumentname, z.B. Klage_UUID.pdf und Klage_UUID.pdf.pkcs7). Dies gilt nur für die erste Signaturdatei, die zu einer Datei erstellt wird. Jede weitere Signaturdatei muss einen abweichenden Dateinamen erhalten (z.B. Ergänzung einer Ziffer), da andernfalls komplett identische Dateinamen entstehen. Die Länge von Dateinamen von Signaturdateien darf ebenfalls nur 90 Zeichen inkl. der Signaturdateiendungen betragen. Die XJustiz-Nachricht, die einer EGVP-Nachricht beigefügt wird, beschreibt den Inhalt der Nachricht und muss immer den Dateinamen xjustiz_nachricht.xml tragen. Sofern der EGVP-Nachricht weitere XJustiz-Nachrichten, z.B. bei der Weiterleitung von Nachrichten anderer Beteiligter oder als Bestandteil von Akten, beigefügt werden müssen, so muss dem Dateinamen dieser XJustiz-Datensätze eine UUID angestellt werden (xjustiz_nachricht_UUID.xml).
    /// </summary>
    [XmlElement("dateiname", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Dateiname { get; set; }

    /// <summary>
    /// Ein Dokument kann aus mehreren Dateien bestehen. So kann bspw. in einer Datei der Schriftsatz und in einer weiteren Datei die zugehörige Signatur übermittelt werden. Fachlich bilden beide Dateien gemeinsam das Dokument. Entsprechendes gilt, wenn zu einer eingereichten Originaldatei weitere Dateien erstellt werden (Repräsentate, Versionen, Transfervermerke, Signaturprüfprotokolle). Die Werteliste dient dazu, den Bestandteiltyp für die einzelnen Dateien anzugeben. Dabei darf der Bestandteiltyp "Original" für ein und dasselbe Dokument nur einmal vorkommen.
    /// </summary>
    [XmlElement("bestandteil", Namespace = XJustizExport.Tns, Order = 2)]
    public List<Bestandteil> Bestandteile { get; set; } = new();
}
