namespace xjustiz.core_dotnet.Models.Codes;

using System.Collections;
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
public sealed class VersionedCodeList<T> : IVersionedCodeList<T>, IEnumerable<T>
{
    private readonly List<T> _items = [];

    public VersionedCodeList(string version)
    {
        Version = version;
    }

    public VersionedCodeList(string version, IEnumerable<T> collection)
    {
        Version = version;
        _items.AddRange(collection);
    }

    public string Version { get; }

    public int Count => _items.Count;

    public T this[int index] => _items[index];

    public void Add(T item) => _items.Add(item);

    public IEnumerator<T> GetEnumerator() => _items.GetEnumerator();

    IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
}
