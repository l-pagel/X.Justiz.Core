namespace xjustiz.core_dotnet.UnitTests.Util;

using System;
using System.Collections.Generic;
using FluentAssertions;
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
            AlwaysAvailable = "Test",
            IntroducedInV1 = "IgnoreMe",
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V0_2_0, out var lostData);

        // Assert
        result.Should().NotBeNull();
        result.AlwaysAvailable.Should().Be("Test");
        result.IntroducedInV1.Should().BeNull();
        lostData.Should().Contain(x => x.Contains("IntroducedInV1"));
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
            IntroducedInV1 = "KeepMe",
        };

        // Act
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V1_0_0, out var lostData);

        // Assert
        result.Should().NotBeNull();
        result.IntroducedInV1.Should().Be("KeepMe");
        lostData.Should().BeEmpty();
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
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V1_0_0, out var lostData);

        // Assert
        result.Should().NotBeNull();
        result.RemovedInV1.Should().BeNull();
        lostData.Should().Contain(x => x.Contains("RemovedInV1"));
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
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V1_0_0, out var lostData);

        // Assert
        result.Should().NotBeNull();
        result.Nested.Should().NotBeNull();
        result.Nested!.NestedProperty.Should().Be("NestedValue");
        result.Nested.NestedRemovedInV1.Should().BeNull();
        lostData.Should().Contain(x => x.Contains("NestedRemovedInV1"));
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
        var result = InvokeDeepCopy(source, XJustizCoreVersion.V1_0_0, out var lostData);

        // Assert
        result.Should().NotBeNull();
        result.ListOfNested.Should().HaveCount(2);
        result.ListOfNested![0].NestedProperty.Should().Be("Item1");
        result.ListOfNested![1].NestedProperty.Should().Be("Item2");
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

        result.Should().NotBeNull();
        result.UnavailableItems.Should().BeEmpty();
        lostData.Should().HaveCount(2); // One error per item
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
        public string? AlwaysAvailable { get; set; }

        /// <summary>
        /// Property introduced in V1.0.0.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
        public string? IntroducedInV1 { get; set; }

        /// <summary>
        /// Property removed in V1.0.0.
        /// </summary>
        [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0, Removed = XJustizCoreVersion.V1_0_0)]
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
        [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0, Removed = XJustizCoreVersion.V1_0_0)]
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
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public class UnavailableModel
    {
    }
}
