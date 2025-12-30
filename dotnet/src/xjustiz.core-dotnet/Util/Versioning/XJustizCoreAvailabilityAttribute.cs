namespace xjustiz.core_dotnet.Util.Versioning;

public sealed class XJustizCoreAvailabilityAttribute(XJustizCoreVersion introduced)
    : VersionAvailabilityAttribute((int)introduced)
{
    public XJustizCoreVersion IntroducedIn => (XJustizCoreVersion)IntroducedRaw;

    public XJustizCoreVersion RemovedIn
    {
        get => (XJustizCoreVersion)RemovedRaw;
        set => RemovedRaw = (int)value;
    }

    public bool IsAvailableIn(XJustizCoreVersion version)
        => IsAvailableRaw((int)version);
}