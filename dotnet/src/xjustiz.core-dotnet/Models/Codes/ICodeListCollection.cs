namespace xjustiz.core_dotnet.Models.Codes;

using System.Collections.Generic;

/// <summary>
/// Interface für eine Sammlung von Codelisten.<br/>
/// <u><b>Code list collection interface:</b></u> Interface for a collection of code lists.
/// </summary>
/// <typeparam name="T">The enum type of the code.</typeparam>
internal interface ICodeListCollection<T>
    where T : Enum
{
    public static abstract string Uri { get; }

    public static abstract IVersionedCodeList<T> LatestList { get; }
}
