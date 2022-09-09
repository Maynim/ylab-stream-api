package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Util {

    public static Map<String, Integer> getNamesakeCountMap(ComplexExamples.Person[] arrayOfPerson) {
        if (arrayOfPerson == null) {
            return Collections.emptyMap();
        }

        Map<String, Integer> sortedNamesakeCountMap = new TreeMap<>();

        Arrays.stream(arrayOfPerson)
                .distinct()
                .forEach(person -> sortedNamesakeCountMap.merge(person.name, 1, Integer::sum));
        return sortedNamesakeCountMap;
    }
}
