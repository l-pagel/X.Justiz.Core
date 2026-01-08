namespace xjustiz.core_dotnet.Models.Codes;

using System.Collections.Generic;

internal interface ICodeListCollection<T>
    where T : Enum
{
    public static abstract string Uri { get; }

    public static abstract IReadOnlyList<T> LatestList { get; }
}
