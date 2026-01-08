namespace xjustiz.core_dotnet.Models.Codes;

using System.Collections.Generic;

/// <summary>
/// Eine schreibgeschützte Liste mit Versionsinformationen.<br/>
/// <u><b>Versioned code list interface:</b></u> A read-only list with version information.
/// </summary>
/// <typeparam name="T">The type of elements in the list.</typeparam>
public interface IVersionedCodeList<out T> : IReadOnlyList<T>
{
    string Version { get; }
}

/// <summary>
/// Implementierung einer versionierten Codeliste.<br/>
/// <u><b>Versioned code list:</b></u> Implementation of a versioned code list.
/// </summary>
/// <typeparam name="T">The type of elements in the list.</typeparam>
public sealed class VersionedCodeList<T> : List<T>, IVersionedCodeList<T>
{
    public VersionedCodeList(string version)
    {
        Version = version;
    }

    public VersionedCodeList(string version, IEnumerable<T> collection)
        : base(collection)
    {
        Version = version;
    }

    public string Version { get; }
}
