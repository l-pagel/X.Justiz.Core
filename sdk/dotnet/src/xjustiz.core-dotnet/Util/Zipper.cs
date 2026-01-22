namespace xjustiz.core_dotnet.Util;

using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Helpers;

/// <summary>
/// Stellt Hilfsmethoden zum Erstellen von XJustiz-ZIP-Dateien bereit.<br/>
/// <u><b>Zipper:</b></u> Provides utility methods for creating XJustiz ZIP files.
/// </summary>
public static class Zipper
{
    /// <summary>
    /// Erstellt eine ZIP-Datei mit den XJustiz-Daten und optionalen Anhängen und speichert sie am angegebenen Pfad.<br/>
    /// <u><b>Archive to ZIP file:</b></u> Creates a ZIP file containing the XJustiz data and optional attachments and saves it at the specified path.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">Die XJustiz-Nachricht. / The XJustiz message.</param>
    /// <param name="destinationZipPath">Der Pfad, an dem die ZIP-Datei erstellt werden soll. / The path where the ZIP file should be created.</param>
    /// <param name="exportFiles">Eine Liste von Dateipfaden, die als Anhänge hinzugefügt werden sollen. / A list of file paths to be added as attachments.</param>
    /// <returns>Der Pfad zur erstellten ZIP-Datei. / The path to the created ZIP file.</returns>
    public static async Task<string> ArchiveToZipFileAsync(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht, string destinationZipPath, List<string>? exportFiles = null)
    {
        var fileName = GetFileName(uebermittlungSchriftgutobjekteNachricht);

        using (var zip = ZipFile.Open(destinationZipPath, ZipArchiveMode.Create))
        {
            await AddXJustizXmlToZipAsync(zip, uebermittlungSchriftgutobjekteNachricht, fileName);
            await AddFilesToZipAsync(zip, exportFiles ?? []);
        }

        return destinationZipPath;
    }

    /// <summary>
    /// Erstellt einen MemoryStream, der das ZIP-Archiv mit den XJustiz-Daten und optionalen Anhängen enthält.<br/>
    /// <u><b>Archive to ZIP stream:</b></u> Creates a MemoryStream containing the ZIP archive with the XJustiz data and optional attachments.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">Die XJustiz-Nachricht. / The XJustiz message.</param>
    /// <param name="exportFiles">Eine Liste von Dateipfaden, die als Anhänge hinzugefügt werden sollen. / A list of file paths to be added as attachments.</param>
    /// <returns>Ein MemoryStream, der das ZIP-Archiv enthält. / A MemoryStream containing the ZIP archive.</returns>
    public static async Task<MemoryStream> ArchiveToZipStreamAsync(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht, List<string>? exportFiles = null)
    {
        var ms = new MemoryStream();
        var fileName = GetFileName(uebermittlungSchriftgutobjekteNachricht);

        using (var zip = new ZipArchive(ms, ZipArchiveMode.Create, leaveOpen: true))
        {
            await AddXJustizXmlToZipAsync(zip, uebermittlungSchriftgutobjekteNachricht, fileName);
            await AddFilesToZipAsync(zip, exportFiles ?? []);
        }

        ms.Position = 0;
        return ms;
    }

    private static string GetFileName(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht) => $"akte_{uebermittlungSchriftgutobjekteNachricht.GetAktenzeichen() ?? Guid.NewGuid().ToString()}.xml";

    private static async Task AddXJustizXmlToZipAsync<T>(ZipArchive zip, T objectToSerialize, string fileName)
    {
        var xmlEntry = zip.CreateEntry(fileName);
        var serializer = new XmlSerializer(typeof(T));

        var ns = new XmlSerializerNamespaces();
        ns.Add(string.Empty, SchemeConstants.XJustiz_Tns);
        ns.Add("xsi", SchemeConstants.Xsi);

        using var entryStream = xmlEntry.Open();

        var settings = new XmlWriterSettings
        {
            Encoding = new UTF8Encoding(false),
            Indent = true,
            Async = true,
        };

        using var writer = XmlWriter.Create(entryStream, settings);

        serializer.Serialize(writer, objectToSerialize, ns);

        await writer.FlushAsync();
    }

    private static async Task AddFilesToZipAsync(ZipArchive zip, List<string> filePaths)
    {
        foreach (var filePath in filePaths)
        {
            var targetFilePath = Path.Combine("Dokumente", Path.GetFileName(filePath));

            var fileEntry = zip.CreateEntry(targetFilePath);

            using var fileEntryStream = fileEntry.Open();
            using var sourceStream = File.OpenRead(filePath);
            await sourceStream.CopyToAsync(fileEntryStream);
        }
    }
}
