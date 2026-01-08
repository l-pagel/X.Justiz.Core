namespace xjustiz.core_dotnet.Util.Versioning;

[AttributeUsage(AttributeTargets.All, Inherited = false)]
public sealed class ForTestingOnlyAttribute(string? reason = null)
    : Attribute
{
    public string? Reason { get; } = reason;
}