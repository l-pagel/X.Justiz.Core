package de.xjustiz.core.util.converter;

import de.xjustiz.core.util.versioning.XJustizCoreAvailability;
import de.xjustiz.core.util.versioning.XJustizCoreVersion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link XJustizConverter}.
 */
class XJustizConverterTest {

    @Test
    void convert_shouldCopySimpleProperties_whenAvailable() {
        // Arrange
        var source = new TestModel();
        source.setIntroducedInV020("Test");
        source.setIntroducedInVTEST999("IgnoreMe");

        // Act
        var lostData = new ArrayList<String>();
        var result = (TestModel) XJustizConverter.deepCopy(source, XJustizCoreVersion.V0_2_0, lostData, "TestContext");

        // Assert
        assertNotNull(result);
        assertEquals("Test", result.getIntroducedInV020());
        assertNull(result.getIntroducedInVTEST999());
        assertTrue(lostData.stream().anyMatch(s -> s.contains("introducedInVTEST999")));
    }

    @Test
    void convert_shouldKeepProperties_whenIntroducedInTargetVersion() {
        // Arrange
        var source = new TestModel();
        source.setIntroducedInV020("KeepMe");

        // Act
        var lostData = new ArrayList<String>();
        var result = (TestModel) XJustizConverter.deepCopy(source, XJustizCoreVersion.V0_2_0, lostData, "TestContext");

        // Assert
        assertNotNull(result);
        assertEquals("KeepMe", result.getIntroducedInV020());
        assertTrue(lostData.isEmpty());
    }

    @Test
    void convert_shouldHandleNestedObjects() {
        // Arrange
        var nested = new NestedModel();
        nested.setNestedProperty("NestedValue");
        nested.setNestedRemovedInV1("RemoveMe");

        var source = new TestModel();
        source.setNested(nested);

        // Act
        var lostData = new ArrayList<String>();
        var result = (TestModel) XJustizConverter.deepCopy(source, XJustizCoreVersion.V0_2_0, lostData, "TestContext");

        // Assert
        assertNotNull(result);
        assertNotNull(result.getNested());
        assertEquals("NestedValue", result.getNested().getNestedProperty());
        assertNull(result.getNested().getNestedRemovedInV1());
        assertTrue(lostData.stream().anyMatch(s -> s.contains("nestedRemovedInV1")));
    }

    @Test
    void convert_shouldHandleLists() {
        // Arrange
        var item1 = new NestedModel();
        item1.setNestedProperty("Item1");
        var item2 = new NestedModel();
        item2.setNestedProperty("Item2");

        var source = new TestModel();
        source.setListOfNested(List.of(item1, item2));

        // Act
        var lostData = new ArrayList<String>();
        var result = (TestModel) XJustizConverter.deepCopy(source, XJustizCoreVersion.V0_2_0, lostData, "TestContext");

        // Assert
        assertNotNull(result);
        assertNotNull(result.getListOfNested());
        assertEquals(2, result.getListOfNested().size());
        assertEquals("Item1", result.getListOfNested().get(0).getNestedProperty());
        assertEquals("Item2", result.getListOfNested().get(1).getNestedProperty());
    }

    @Test
    void convert_shouldFilterItemsInList_whenItemTypeNotAvailable() {
        // Arrange
        var source = new ListContainer();
        source.setUnavailableItems(List.of(new UnavailableModel(), new UnavailableModel()));

        // Act
        var lostData = new ArrayList<String>();
        var result = (ListContainer) XJustizConverter.deepCopy(source, XJustizCoreVersion.V0_2_0, lostData,
                "TestContext");

        // Assert
        assertNotNull(result);
        assertNotNull(result.getUnavailableItems());
        assertTrue(result.getUnavailableItems().isEmpty());
        assertEquals(2, lostData.size()); // One error per item
    }

    // Test model classes

    public static class TestModel {
        @XJustizCoreAvailability(introduced = XJustizCoreVersion.V0_2_0)
        private String introducedInV020;

        @XJustizCoreAvailability(introduced = XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET)
        private String introducedInVTEST999;

        private NestedModel nested;
        private List<NestedModel> listOfNested;

        public String getIntroducedInV020() {
            return introducedInV020;
        }

        public void setIntroducedInV020(String value) {
            this.introducedInV020 = value;
        }

        public String getIntroducedInVTEST999() {
            return introducedInVTEST999;
        }

        public void setIntroducedInVTEST999(String value) {
            this.introducedInVTEST999 = value;
        }

        public NestedModel getNested() {
            return nested;
        }

        public void setNested(NestedModel value) {
            this.nested = value;
        }

        public List<NestedModel> getListOfNested() {
            return listOfNested;
        }

        public void setListOfNested(List<NestedModel> value) {
            this.listOfNested = value;
        }
    }

    public static class NestedModel {
        private String nestedProperty;

        @XJustizCoreAvailability(introduced = XJustizCoreVersion.V0_2_0, removed = XJustizCoreVersion.V0_2_0, isRemoved = true)
        private String nestedRemovedInV1;

        public String getNestedProperty() {
            return nestedProperty;
        }

        public void setNestedProperty(String value) {
            this.nestedProperty = value;
        }

        public String getNestedRemovedInV1() {
            return nestedRemovedInV1;
        }

        public void setNestedRemovedInV1(String value) {
            this.nestedRemovedInV1 = value;
        }
    }

    public static class ListContainer {
        private List<UnavailableModel> unavailableItems;

        public List<UnavailableModel> getUnavailableItems() {
            return unavailableItems;
        }

        public void setUnavailableItems(List<UnavailableModel> value) {
            this.unavailableItems = value;
        }
    }

    @XJustizCoreAvailability(introduced = XJustizCoreVersion.V_TEST_NOT_AVAILABLE_YET)
    public static class UnavailableModel {
    }
}
