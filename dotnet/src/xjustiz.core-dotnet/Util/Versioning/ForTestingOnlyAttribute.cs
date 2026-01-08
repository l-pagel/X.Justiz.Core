namespace xjustiz.core_dotnet.Util.Versioning;

[AttributeUsage(AttributeTargets.All, Inherited = false)]
/// <summary>
/// Markiert Elemente, die nur zu Testzwecken dienen.<br/>
/// <u><b>For testing only attribute:</b></u> Marks elements intended for testing purposes only.
/// </summary>
public sealed class ForTestingOnlyAttribute(string? reason = null)
    : Attribute
{
    public string? Reason { get; } = reason;
}