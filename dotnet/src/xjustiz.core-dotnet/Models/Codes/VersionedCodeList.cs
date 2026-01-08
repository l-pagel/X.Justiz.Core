namespace xjustiz.core_dotnet.Models.Codes;

using System.Collections.Generic;

public interface IVersionedCodeList<out T> : IReadOnlyList<T>
{
    string Version { get; }
}

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
