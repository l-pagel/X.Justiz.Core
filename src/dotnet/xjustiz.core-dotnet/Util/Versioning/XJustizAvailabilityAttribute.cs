namespace xjustiz.core_dotnet.Util.Versioning;

public sealed class XJustizAvailabilityAttribute(XJustizVersion introduced) : VersionAvailabilityAttribute((int)introduced)
{
    public XJustizVersion IntroducedIn => (XJustizVersion)IntroducedRaw;

    public XJustizVersion RemovedIn
    {
        get => (XJustizVersion)RemovedRaw;
        set => RemovedRaw = (int)value;
    }

    public bool IsAvailableIn(XJustizVersion version)
        => IsAvailableRaw((int)version);
}
