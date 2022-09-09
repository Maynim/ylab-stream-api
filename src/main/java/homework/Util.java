package homework;

import java.util.*;

import static homework.Status.*;

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

    public static Pair<Integer, Integer> findFirstPair(int[] array, int expectedSum) {
        if (array == null) {
            return new Pair<>(EMPTY);
        }

        Map<Integer, Integer> memElementMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];

            if (memElementMap.containsKey(expectedSum - currentElement)) {
                int pairElement = array[memElementMap.get(expectedSum - currentElement)];
                return new Pair<>(pairElement, currentElement);
            }
            memElementMap.put(currentElement, i);
        }

        return new Pair<>(NOT_FOUND);
    }

    public static boolean fuzzySearch(String word, String text) {
        if (word == null || text == null){
            return false;
        }

        String[] wordArr = word.split("");
        String[] textArr = text.split("");

        int textMarker = 0;
        int wordMarker = 0;

        while (textMarker != textArr.length - 1 && wordMarker != wordArr.length - 1) {
            if (Objects.equals(wordArr[wordMarker], textArr[textMarker])) {
                wordMarker++;
            }
            textMarker++;
        }

        return wordMarker == wordArr.length - 1;
    }
}
