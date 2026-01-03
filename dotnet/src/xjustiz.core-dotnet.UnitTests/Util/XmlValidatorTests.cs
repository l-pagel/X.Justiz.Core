namespace xjustiz.core_dotnet.UnitTests.Util;

using System;
using System.IO;
using Xunit;
using xjustiz.core_dotnet.Util;
using xjustiz.core_dotnet.Util.Versioning;
using System.Threading.Tasks;

public class XmlValidatorTests : IDisposable
{
    private readonly string tempPath;

    public XmlValidatorTests()
    {
        tempPath = Path.Combine(Path.GetTempPath(), "XmlValidatorTests_" + Guid.NewGuid());
        Directory.CreateDirectory(tempPath);
    }

    [Fact]
    public async Task Validate_ValidXml_ReturnsNoErrorsAsync()
    {
        // Arrange
        var xmlContent = @"<?xml version=""1.0"" encoding=""utf-8""?>
                                <tns:nachricht.gds.basisnachricht.0005006
                                    xmlns:tns=""http://www.xjustiz.de""
                                    xmlns:xsi=""http://www.w3.org/2001/XMLSchema-instance"">
                                    <tns:nachrichtenkopf xjustizVersion=""3.4.1"">
                                        <tns:erstellungszeitpunkt>2023-10-01T10:00:00</tns:erstellungszeitpunkt>
                                        <tns:auswahl_absender>
                                            <tns:absender.sonstige>TestAbsender</tns:absender.sonstige>
                                        </tns:auswahl_absender>
                                        <tns:auswahl_empfaenger>
                                            <tns:empfaenger.sonstige>TestEmpfaenger</tns:empfaenger.sonstige>
                                        </tns:auswahl_empfaenger>
                                        <tns:eigeneNachrichtenID>550e8400-e29b-41d4-a716-446655440000</tns:eigeneNachrichtenID>
                                    </tns:nachrichtenkopf>
                                    <tns:grunddaten/>
                                </tns:nachricht.gds.basisnachricht.0005006>";

        var filePath = Path.Combine(tempPath, "valid.xml");
        File.WriteAllText(filePath, xmlContent);

        // Act
        var errors = await XmlValidator.ValidateAsync(filePath, XJustizVersion.V3_4_1);

        // Assert
        Assert.Empty(errors);
    }

    [Fact]
    public async Task Validate_InvalidXml_ReturnsErrorsAsync()
    {
        // Arrange
        var xmlContent = @"<?xml version=""1.0"" encoding=""utf-8""?>
<tns:nachricht.gds.basisnachricht.0005006
    xmlns:tns=""http://www.xjustiz.de"">
    <tns:nachrichtenkopf xjustizVersion=""3.4.1"">
        <!-- Missing required fields like erstellungszeitpunkt -->
    </tns:nachrichtenkopf>
</tns:nachricht.gds.basisnachricht.0005006>";

        var filePath = Path.Combine(tempPath, "invalid.xml");
        File.WriteAllText(filePath, xmlContent);

        // Act
        var errors = await XmlValidator.ValidateAsync(filePath, XJustizVersion.V3_4_1);

        // Assert
        Assert.NotEmpty(errors);
        // Expect validation errors about missing elements
    }

    [Fact]
    public async Task Validate_MalformedXml_ReturnsParsingErrorAsync()
    {
        // Arrange
        var xmlContent = @"<not<valid>xml";
        var filePath = Path.Combine(tempPath, "malformed.xml");
        File.WriteAllText(filePath, xmlContent);

        // Act
        var errors = await XmlValidator.ValidateAsync(filePath, XJustizVersion.V3_4_1);

        // Assert
        Assert.Contains(errors, e => e.Contains("XML Parsing failed") || e.Contains("Unexpected error"));
    }

    [Fact]
    public async Task Validate_NonExistentFile_ThrowsFileNotFound()
    {
        await Assert.ThrowsAsync<FileNotFoundException>(() =>
            XmlValidator.ValidateAsync(Path.Combine(tempPath, "doesnotexist.xml"), XJustizVersion.V3_4_1));
    }

    [Fact]
    public async Task Validate_Stream_ValidXml_ReturnsNoErrorsAsync()
    {
        // Arrange
        var xmlContent = @"<?xml version=""1.0"" encoding=""utf-8""?>
                                <tns:nachricht.gds.basisnachricht.0005006
                                    xmlns:tns=""http://www.xjustiz.de""
                                    xmlns:xsi=""http://www.w3.org/2001/XMLSchema-instance"">
                                    <tns:nachrichtenkopf xjustizVersion=""3.4.1"">
                                        <tns:erstellungszeitpunkt>2023-10-01T10:00:00</tns:erstellungszeitpunkt>
                                        <tns:auswahl_absender>
                                            <tns:absender.sonstige>TestAbsender</tns:absender.sonstige>
                                        </tns:auswahl_absender>
                                        <tns:auswahl_empfaenger>
                                            <tns:empfaenger.sonstige>TestEmpfaenger</tns:empfaenger.sonstige>
                                        </tns:auswahl_empfaenger>
                                        <tns:eigeneNachrichtenID>550e8400-e29b-41d4-a716-446655440000</tns:eigeneNachrichtenID>
                                    </tns:nachrichtenkopf>
                                    <tns:grunddaten/>
                                </tns:nachricht.gds.basisnachricht.0005006>";

        using var stream = new MemoryStream(System.Text.Encoding.UTF8.GetBytes(xmlContent));

        // Act
        var errors = await XmlValidator.ValidateAsync(stream, XJustizVersion.V3_4_1);

        // Assert
        Assert.Empty(errors);
    }

    [Fact]
    public async Task Validate_WrongVersion_ReturnsErrorsAsync()
    {
        // Arrange: XML claims 3.4.1 but we validate against 3.2.1 (if 3.2.1 is available)
        // Or structure is just wrong for another version.
        // Using 3.2.1 for validation.

        var xmlContent = @"<?xml version=""1.0"" encoding=""utf-8""?>
                                <tns:nachricht.gds.basisnachricht.0005006
                                    xmlns:tns=""http://www.xjustiz.de""
                                    xmlns:xsi=""http://www.w3.org/2001/XMLSchema-instance"">
                                    <tns:nachrichtenkopf xjustizVersion=""3.4.1"">
                                        <tns:erstellungszeitpunkt>2023-10-01T10:00:00</tns:erstellungszeitpunkt>
                                        <tns:auswahl_absender>
                                            <tns:absender.sonstige>TestAbsender</tns:absender.sonstige>
                                        </tns:auswahl_absender>
                                        <tns:auswahl_empfaenger>
                                            <tns:empfaenger.sonstige>TestEmpfaenger</tns:empfaenger.sonstige>
                                        </tns:auswahl_empfaenger>
                                        <tns:eigeneNachrichtenID>550e8400-e29b-41d4-a716-446655440000</tns:eigeneNachrichtenID>
                                    </tns:nachrichtenkopf>
                                    <tns:grunddaten/>
                                </tns:nachricht.gds.basisnachricht.0005006>";

        var filePath = Path.Combine(tempPath, "wrong_version.xml");
        File.WriteAllText(filePath, xmlContent);

        // Act
        // V3_2_1 schemas should complain about xjustizVersion fixed attribute or missing elements defined solely in 3.4.1 etc.
        // However, 3.2.1 might not have 0005006 or might have different definition.
        // If the element doesn't exist in 3.2.1, it's an error.
        var errors = await XmlValidator.ValidateAsync(filePath, XJustizVersion.V3_2_1);

        // Assert
        Assert.NotEmpty(errors);
    }

    public void Dispose()
    {
        Dispose(true);
        GC.SuppressFinalize(this);
    }

    protected virtual void Dispose(bool disposing)
    {
        if (Directory.Exists(tempPath))
        {
            try
            {
                Directory.Delete(tempPath, true);
            }
            catch
            {
                // Inspecting tests might lock files temporarily
            }
        }
    }
}
