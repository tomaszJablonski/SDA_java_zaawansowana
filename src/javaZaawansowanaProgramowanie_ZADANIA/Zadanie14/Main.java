package javaZaawansowanaProgramowanie_ZADANIA.Zadanie14;

/*
TODO
 Na podstawie 100.000 elementowej tablicy z losowo wybranymi wartościami zaimplementuj następujące funkcjonalności:
 1.zwróć listę unikalnych elementów,
 2.zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej tablicy,
 3.zwróć listę 25 najczęściej powtarzających się elementów.
 Zaimplementuj metodę, która deduplikuje elementy w liście. W przypadku znalezienia duplikatu,
 zastępuje go nową losową wcześniej nie występującą wartością. Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.
 */


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = generatingRandomValues();
        //System.out.println("integerList = " + integerList);

        List<Integer> uniqeValues = uniqueValues(integerList);
        System.out.println("uniqeValues = " + uniqeValues);
        System.out.println("uniqueSize = " + uniqeValues.size());

        List<Integer> duplicateValues = repeatValues(integerList);
        System.out.println("duplicateValues = " + duplicateValues);

        List<Integer> only25 = get25(integerList);
        System.out.println("only25 = " + only25);

        List<Integer> only25Map = get25Map(integerList);
        System.out.println("only25Map = " + only25Map);

        List<Integer> uniqueValues2 = generateUniqueValues(integerList);
        System.out.println("uniqueValues2 = " + uniqueValues2);

    }
    //generuje losowe wartości w liście
    private static List<Integer> generatingRandomValues() {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            integerList.add(random.nextInt(100_000));
        }
        return integerList;
    }
    //wyświetla tylko unikalne elemenety z listy
    private static List<Integer> uniqueValues(List<Integer> integerList) {
        return integerList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //generuje wartości ale tylko unikalne ,nie dodaje duplikatów
    private static void addOrGenerateUniqueValue(List<Integer> uniqueValues, Integer value) {
        Random randomGenerator = new Random();
        while (uniqueValues.contains(value)) {
            value = randomGenerator.nextInt();
        }

        uniqueValues.add(value);
    }

    //generuje uniklane wartości
    private static List<Integer> generateUniqueValues(List<Integer> values) {
        List<Integer> uniqueValues = new ArrayList<>();
        values.forEach(value -> addOrGenerateUniqueValue(uniqueValues, value));
        return uniqueValues;
    }

    private static List<Integer> get25Map(List<Integer> values) {
        return getMap(values).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(25)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    private static List<Integer> repeatValues(List<Integer> integerList) {
        return getMap(integerList).entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    private static List<Integer> get25(List<Integer> integerList) {
        return integerList.stream()
                .limit(25)
                .collect(Collectors.toList());
    }

    private static Map<Integer, Integer> getMap(List<Integer> integerList) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        integerList.forEach(key -> integerIntegerMap.put(key, integerIntegerMap.getOrDefault(key, 0) + 1));
        return integerIntegerMap;
    }


}


