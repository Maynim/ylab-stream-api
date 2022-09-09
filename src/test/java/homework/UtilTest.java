package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Nested
    @DisplayName("Tests for Task 1")
    class FirstTaskTest {

        private static final ComplexExamples.Person[] INPUT_ARRAY = new ComplexExamples.Person[]{
                new ComplexExamples.Person(0, "Harry"),
                new ComplexExamples.Person(0, "Harry"),
                new ComplexExamples.Person(1, "Harry"),
                new ComplexExamples.Person(2, "Harry"),
                new ComplexExamples.Person(3, "Emily"),
                new ComplexExamples.Person(4, "Jack"),
                new ComplexExamples.Person(4, "Jack"),
                new ComplexExamples.Person(5, "Amelia"),
                new ComplexExamples.Person(5, "Amelia"),
                new ComplexExamples.Person(6, "Amelia"),
                new ComplexExamples.Person(7, "Amelia"),
                new ComplexExamples.Person(8, "Amelia")
        };

        private static final Map<String, Integer> EXPECTED_MAP = new TreeMap<>();

        static {
            EXPECTED_MAP.put("Amelia", 4);
            EXPECTED_MAP.put("Emily", 1);
            EXPECTED_MAP.put("Harry", 3);
            EXPECTED_MAP.put("Jack", 1);
        }

        @Test
        void returnEmptyMapIfInputArrayIsNull() {
            Map<String, Integer> actualMap = Util.getNamesakeCountMap(null);

            assertEquals(Collections.emptyMap(), actualMap);
        }

        @Test
        void returnSortedAndGroupByNameMap() {
            Map<String, Integer> actualNamesakeCountMap = Util.getNamesakeCountMap(INPUT_ARRAY);

            assertEquals(EXPECTED_MAP, actualNamesakeCountMap);
        }

    }

}