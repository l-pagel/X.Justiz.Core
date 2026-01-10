namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert Integritätsinformationen einer Datei.<br/>
/// <u><b>Hash info:</b></u> Represents file integrity information.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class HashInfoCore : IEquatable<HashInfoCore>
{
    /// <summary>
    /// Der verwendete Hash-Algorithmus (z.B. SHA-256).<br/>
    /// <u><b>Algorithm:</b></u> The hash algorithm used (e.g., SHA-256).
    /// </summary>
    [XmlElement("algorithmus", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("algorithm")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Algorithm { get; set; } = "SHA-256";

    /// <summary>
    /// Der Hashwert.<br/>
    /// <u><b>Value:</b></u> The hash value.
    /// </summary>
    [XmlElement("wert", Namespace = SchemeConstants.XJustizCore_Tns)]
    [JsonPropertyName("value")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Value { get; set; } = string.Empty;

    public static bool operator ==(HashInfoCore? left, HashInfoCore? right) => Equals(left, right);

    public static bool operator !=(HashInfoCore? left, HashInfoCore? right) => !Equals(left, right);

    public bool Equals(HashInfoCore? other)
    {
        if (other is null)
        {
            return false;
        }

        if (ReferenceEquals(this, other))
        {
            return true;
        }

        // Use OrdinalIgnoreCase for Algorithm as naming conventions can vary,
        // but hashes are usually compared with Ordinal.
        return string.Equals(Algorithm, other.Algorithm, StringComparison.OrdinalIgnoreCase) &&
               string.Equals(Value, other.Value, StringComparison.Ordinal);
    }

    public override bool Equals(object? obj)
    {
        return Equals(obj as HashInfoCore);
    }

    public override int GetHashCode()
    {
        // HashCode.Combine is the modern, robust way to generate a hash code
        return HashCode.Combine(
            Algorithm?.ToLowerInvariant(),
            Value);
    }
}
