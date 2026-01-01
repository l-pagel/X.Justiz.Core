namespace xjustiz.core_dotnet.Util;

using System;
using System.Collections.Generic;
using System.IO.Compression;
using System.IO;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Codes;

/// <summary>
/// Stellt Hilfsmethoden zum Erstellen von XJustiz-ZIP-Dateien bereit.
/// Provides utility methods for creating XJustiz ZIP files.
/// </summary>
public static class Zip
{
    /// <summary>
    /// Erstellt eine ZIP-Datei mit den XJustiz-Daten und optionalen Anhängen und speichert sie als temporäre Datei.
    /// Creates a ZIP file containing the XJustiz data and optional attachments and saves it as a temporary file.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">Die XJustiz-Nachricht. / The XJustiz message.</param>
    /// <param name="exportFiles">Eine Liste von Dateipfaden, die als Anhänge hinzugefügt werden sollen. / A list of file paths to be added as attachments.</param>
    /// <returns>Der Pfad zur erstellten temporären ZIP-Datei. / The path to the created temporary ZIP file.</returns>
    public static async Task<string> ArchiveToZipFileAsync(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht, List<string>? exportFiles = null)
    {
        var tempZipPath = Path.Combine(Path.GetTempPath(), Path.GetRandomFileName());
        var fileName = GetFileName(uebermittlungSchriftgutobjekteNachricht);

        using (var zip = ZipFile.Open(tempZipPath, ZipArchiveMode.Create))
        {
            await AddXJustizXmlToZipAsync(zip, uebermittlungSchriftgutobjekteNachricht, fileName);
            await AddFilesToZipAsync(zip, exportFiles ?? []);
        }

        return tempZipPath;
    }

    /// <summary>
    /// Erstellt einen MemoryStream, der das ZIP-Archiv mit den XJustiz-Daten und optionalen Anhängen enthält.
    /// Creates a MemoryStream containing the ZIP archive with the XJustiz data and optional attachments.
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
        ns.Add(string.Empty, XJustizConstants.Tns);
        ns.Add("xsi", XJustizConstants.Xsi);

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
