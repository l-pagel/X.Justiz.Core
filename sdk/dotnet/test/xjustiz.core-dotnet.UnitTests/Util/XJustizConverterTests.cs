namespace xjustiz.core_dotnet.UnitTests.Util;

using System;
using System.Collections.Generic;
using xjustiz.core_dotnet.Util.Converter;
using xjustiz.core_dotnet.Util.Versioning;
using Xunit;

/// <summary>
/// Unit tests for <see cref="XJustizConverter"/>.
/// </summary>
public class XJustizConverterTests
{
    /// <summary>
    /// Initializes a new instance of the <see cref="XJustizConverterTests"/> class.
    /// </summary>
    public XJustizConverterTests()
    {
    }

    /// <summary>
    /// Verifies that simple properties are copied when available.
    /// </summary>
    [Fact]
    public void Convert_ShouldCopySimpleProperties_WhenAvailable()
    {
        // Arrange
        var source = new TestModel
        {
            IntroducedInV020 = "Test",
            IntroducedInVTEST999 = "IgnoreMe",
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        // Assert
        Assert.NotNull(result);
        Assert.Equal("Test", result.IntroducedInV020);
        Assert.Null(result.IntroducedInVTEST999);
        Assert.Contains(lostData, x => x.Contains("IntroducedInVTEST999"));
    }

    /// <summary>
    /// Verifies that properties are kept when introduced in the target version.
    /// </summary>
    [Fact]
    public void Convert_ShouldKeepProperties_WhenIntroducedInTargetVersion()
    {
        // Arrange
        var source = new TestModel
        {
            IntroducedInV020 = "KeepMe",
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        // Assert
        Assert.NotNull(result);
        Assert.Equal("KeepMe", result.IntroducedInV020);
        Assert.Empty(lostData);
    }

    /// <summary>
    /// Verifies that properties are removed when removed in the target version.
    /// </summary>
    [Fact]
    public void Convert_ShouldRemoveProperty_WhenRemovedInTargetVersion()
    {
        // Arrange
        var source = new TestModel
        {
            RemovedInV1 = "RemoveMe",
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        // Assert
        Assert.NotNull(result);
        Assert.Null(result.RemovedInV1);
        Assert.Contains(lostData, x => x.Contains("RemovedInV1"));
    }

    /// <summary>
    /// Verifies that nested objects are handled correctly.
    /// </summary>
    [Fact]
    public void Convert_ShouldHandleNestedObjects()
    {
        // Arrange
        var source = new TestModel
        {
            Nested = new NestedModel
            {
                NestedProperty = "NestedValue",
                NestedRemovedInV1 = "RemoveMe",
            },
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        // Assert
        Assert.NotNull(result);
        Assert.NotNull(result.Nested);
        Assert.Equal("NestedValue", result.Nested!.NestedProperty);
        Assert.Null(result.Nested.NestedRemovedInV1);
        Assert.Contains(lostData, x => x.Contains("NestedRemovedInV1"));
    }

    /// <summary>
    /// Verifies that lists are handled correctly.
    /// </summary>
    [Fact]
    public void Convert_ShouldHandleLists()
    {
        // Arrange
        var source = new TestModel
        {
            ListOfNested =
            [
                new NestedModel { NestedProperty = "Item1" },
                new NestedModel { NestedProperty = "Item2" },
            ],
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out _);

        // Assert
        Assert.NotNull(result);
        Assert.Equal(2, result.ListOfNested!.Count);
        Assert.Equal("Item1", result.ListOfNested[0].NestedProperty);
        Assert.Equal("Item2", result.ListOfNested[1].NestedProperty);
    }

    /// <summary>
    /// Verifies that items in a list are filtered if their type is not available.
    /// </summary>
    [Fact]
    public void Convert_ShouldFilterItemsInList_WhenItemTypeNotAvailable()
    {
        var source = new ListContainer
        {
            UnavailableItems =
            [
                new UnavailableModel(),
                new UnavailableModel(),
            ],
        };

        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        Assert.NotNull(result);
        Assert.Empty(result.UnavailableItems!);
        Assert.Equal(2, lostData.Count); // One error per item
    }

    private static TestModel InvokeDeepCopy(TestModel source, Enum targetVersion, out List<string> lostData)
    {
        lostData = [];
        // Using static DeepCopy
        var result = XJustizConverter.DeepCopy(source, targetVersion, lostData, "TestContext");
        return (TestModel)result!;
    }

    private static ListContainer InvokeDeepCopy(ListContainer source, Enum targetVersion, out List<string> lostData)
    {
        lostData = [];
        var result = XJustizConverter.DeepCopy(source, targetVersion, lostData, "TestContext");
        return (ListContainer)result!;
    }

    /// <summary>
    /// Test model class.
    /// </summary>
    public class TestModel
    {
        /// <summary>
        /// Always available property.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
        public string? IntroducedInV020 { get; set; }

        /// <summary>
        /// Property introduced in VTEST9.9.9.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET)]
        public string? IntroducedInVTEST999 { get; set; }

        /// <summary>
        /// Property removed in V1.0.0.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0, Removed = XJustizCoreVersion.V0_2_0)]
        public string? RemovedInV1 { get; set; }

        /// <summary>
        /// Nested object.
        /// </summary>
        public NestedModel? Nested { get; set; }

        /// <summary>
        /// List of nested objects.
        /// </summary>
        public List<NestedModel>? ListOfNested { get; set; }
    }

    /// <summary>
    /// Nested test model class.
    /// </summary>
    public class NestedModel
    {
        /// <summary>
        /// Nested property.
        /// </summary>
        public string? NestedProperty { get; set; }

        /// <summary>
        /// Nested property removed in V1.0.0.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0, Removed = XJustizCoreVersion.V0_2_0)]
        public string? NestedRemovedInV1 { get; set; }
    }

    /// <summary>
    /// Container for list tests.
    /// </summary>
    public class ListContainer
    {
        /// <summary>
        /// List of unavailable items.
        /// </summary>
        public List<UnavailableModel>? UnavailableItems { get; set; }
    }

    /// <summary>
    /// Unavailable model class.
    /// </summary>
    [XJustizCoreAvailability(XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET)]
    public class UnavailableModel
    {
    }
}