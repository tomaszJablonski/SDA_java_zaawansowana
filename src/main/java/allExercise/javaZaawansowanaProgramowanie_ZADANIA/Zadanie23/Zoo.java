package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie23;

import java.util.*;
import java.util.stream.Collectors;


/*
TODO
 Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz
 pozwalała na otrzymywanie statystyk na temat posiadanych zwierząt:
 int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
 Map<String, Integer> getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku

 TODO
  Map<String, Integer> getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku
  posortowaną na podstawie ilości zwierząt danego gatunku,
  gdzie pierwszym elementem zawsze jest gatunek z największą ilością zwierząt
  void addAnimals(String, int) → dodaje n zwierząt danego gatunku
 */

public class Zoo {
    public static void main(String[] args) {
        Map<String, Integer> collectionOfAnimals = new HashMap<>();

        collectionOfAnimals.put("elephant", 10);
        collectionOfAnimals.put("monkey", 23);
        collectionOfAnimals.put("bear", 2);
        collectionOfAnimals.put("snake", 5);
        collectionOfAnimals.put("parrot", 15);
        collectionOfAnimals.put("lion", 30);

        System.out.println("1.------------------");
        getNumberOfAllAnimals(collectionOfAnimals);
        System.out.println("2.------------------");
        getAnimalsCount(collectionOfAnimals);
        System.out.println("3.--------------------");
        getAnimalsCountSorted(collectionOfAnimals);
        System.out.println("4.---------------------");
        getAnimalsCountSortedStream(collectionOfAnimals);
        System.out.println("5.--------------------");
        addAnimals("Goryl ",1,3,2,5,6);
    }

    public static  Collection<Integer> getNumberOfAllAnimals(Map<String, Integer> stringIntegerMap) {
        int sum = 0;
        for (Integer all : stringIntegerMap.values()) {
            sum += all;
        }
        System.out.println("Sum of all animals = " + sum);
        return stringIntegerMap.values();

    }

    public static Map<String, Integer> getAnimalsCount(Map<String, Integer> collectionOfAnimals) {
        Set<Map.Entry<String, Integer>> entries = new HashSet<>();
        for (Map.Entry<String, Integer> entry : collectionOfAnimals.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + "------> value " + value);
        }
        return collectionOfAnimals;
    }

    //Rosnąco zwyczajnie
    public static Map<String, Integer> getAnimalsCountSorted(Map<String, Integer> getAnimalsCountSorted) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(getAnimalsCountSorted.entrySet());
        entries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + "------> value " + value);
        }
        return getAnimalsCountSorted;
    }



    public static void addAnimals(String name, int ... numbers){
        Map<String, int[]> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put(name,numbers);
        for (Integer numberAnimal: numbers) {
            System.out.print(name + " " + numberAnimal);
        }
    }

    public static Map<String, Integer> getAnimalsCountSortedStream(Map<String, Integer> getAnimalsCountSortedStream) {
        Map<String, Integer> sortedMapReverseOrder = getAnimalsCountSortedStream.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
         System.out.println(sortedMapReverseOrder);
         return getAnimalsCountSortedStream;
    }


}










