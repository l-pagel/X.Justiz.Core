namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Diagnostics.CodeAnalysis;
using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert Integritätsinformationen einer Datei.<br/>
/// <u><b>Hash info:</b></u> Represents file integrity information.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class HashInfoCore : IEqualityComparer<HashInfoCore>
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

    /// <inheritdoc />
    public bool Equals(HashInfoCore? x, HashInfoCore? y)
    {
        if (ReferenceEquals(x, y))
        {
            return true;
        }

        if (x is null || y is null)
        {
            return false;
        }

        // Use OrdinalIgnoreCase for Algorithm as naming conventions can vary,
        // but hashes are usually compared with Ordinal.
        return string.Equals(x.Algorithm, y.Algorithm, StringComparison.OrdinalIgnoreCase) &&
               string.Equals(x.Value, y.Value, StringComparison.Ordinal);
    }

    /// <inheritdoc />
    public override bool Equals(object? obj)
    {
        return Equals(this, obj as HashInfoCore);
    }

    /// <inheritdoc />
    public int GetHashCode([DisallowNull] HashInfoCore obj)
    {
        // HashCode.Combine is the modern, robust way to generate a hash code
        return HashCode.Combine(
            obj.Algorithm?.ToLowerInvariant(),
            obj.Value);
    }

    /// <inheritdoc />
    public override int GetHashCode()
    {
        return GetHashCode(this);
    }
}
