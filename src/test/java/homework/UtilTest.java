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
                new ComplexExamples.Person(0, "James"),
                new ComplexExamples.Person(0, "James"),
                new ComplexExamples.Person(1, "Bob"),
                new ComplexExamples.Person(2, "Emily"),
                new ComplexExamples.Person(3, "Emily"),
                new ComplexExamples.Person(4, "Anna"),
                new ComplexExamples.Person(4, "Anna"),
                new ComplexExamples.Person(5, "Max"),
                new ComplexExamples.Person(5, "Max"),
                new ComplexExamples.Person(6, "Max"),
                new ComplexExamples.Person(7, "Max"),
                new ComplexExamples.Person(8, "Max"),
                new ComplexExamples.Person(9, "David")
        };

        private static final Map<String, Integer> EXPECTED_MAP = new TreeMap<>();

        static {
            EXPECTED_MAP.put("Anna", 1);
            EXPECTED_MAP.put("Bob", 1);
            EXPECTED_MAP.put("David", 1);
            EXPECTED_MAP.put("Emily", 2);
            EXPECTED_MAP.put("James", 1);
            EXPECTED_MAP.put("Max", 4);
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

    @Nested
    @DisplayName("Tests for Task 2")
    class SecondTaskTest {

        private static final int[] INPUT_ARRAY_WITHOUT_PAIR = {2, 7, 6, 1};
        private static final int[] INPUT_ARRAY_WITH_PAIR = {3, 4, 2, 7};

        private static final int INPUT_EXPECTED_SUM = 10;

        @Test
        void returnPairWithStatusEmptyWhenInputIsNull() {
            Pair<Integer, Integer> actualPair = Util.findFirstPair(null, INPUT_EXPECTED_SUM);
            Status actualStatus = actualPair.status;

            assertEquals(Status.EMPTY, actualStatus);
        }

        @Test
        void returnPairWithStatusNotFoundWhenArrayDontContainPair() {
            Pair<Integer, Integer> actualPair = Util.findFirstPair(INPUT_ARRAY_WITHOUT_PAIR, INPUT_EXPECTED_SUM);
            Status actualStatus = actualPair.status;

            assertEquals(Status.NOT_FOUND, actualStatus);
        }

        @Test
        void returnPairWithStatusFoundWhenArrayContainPair() {
            Pair<Integer, Integer> actualPair = Util.findFirstPair(INPUT_ARRAY_WITH_PAIR, INPUT_EXPECTED_SUM);
            Status actualStatus = actualPair.status;

            assertEquals(Status.FOUND, actualStatus);
        }
    }

}
