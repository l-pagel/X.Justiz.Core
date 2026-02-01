namespace xjustiz.core_dotnet.Models.Codes;

/// <summary>
/// Basis-Interface für eine Sammlung von Codelisten.<br/>
/// <u><b>Code list collection base interface:</b></u> Base interface for a collection of code lists providing common information.
/// </summary>
internal interface ICodeListCollection
{
    /// <summary>
    /// Die URI der Codeliste.<br/>
    /// <u><b>URI:</b></u> The URI of the code list.
    /// </summary>
    public static abstract string Uri { get; }
}

/// <summary>
/// Interface für eine Sammlung von Codelisten.<br/>
/// <u><b>Code list collection interface:</b></u> Interface for a collection of code lists.
/// </summary>
/// <typeparam name="T">The enum type of the code.</typeparam>
internal interface ICodeListCollection<out T> : ICodeListCollection
    where T : Enum
{
    /// <summary>
    /// Die aktuellste Liste der Codes.<br/>
    /// <u><b>Latest list:</b></u> The latest list of codes.
    /// </summary>
    public static abstract IVersionedCodeList<T> LatestList { get; }
}