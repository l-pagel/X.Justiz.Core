namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Basisklasse für Abrufinformationen einer Datei.<br/>
/// <u><b>Artifact:</b></u> Base class for file retrieval information.
/// </summary>
[JsonPolymorphic(TypeDiscriminatorPropertyName = "type")]
[JsonDerivedType(typeof(BundlePathArtifact), "bundle-path")]
[JsonDerivedType(typeof(HttpsArtifact), "https")]
[XmlInclude(typeof(BundlePathArtifact))]
[XmlInclude(typeof(HttpsArtifact))]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public abstract class Artifact
{
}
