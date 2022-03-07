package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Map<String,Integer> mapOfNames = new TreeMap<>();

        mapOfNames.put("Java",15000);
        mapOfNames.put("PHP",1222);
        mapOfNames.put("C++",2564);
        mapOfNames.put("Ruby",230);
        mapOfNames.put("C#",1234);

        mapOfNames.entrySet();
//        for (Map.Entry<String,Integer> mapEntry : mapOfNames.entrySet()){
//            System.out.println(mapEntry.getKey() + "," + mapEntry.getValue() + "." );
//        }

        printMapStream(mapOfNames);
        System.out.println("===============");
        printMap(mapOfNames);
        System.out.println("===============");
        printMapUsingIterator(mapOfNames);







    }

    private static void printMapUsingIterator(Map<String,Integer> stringIntegerMap){
        Iterator<Map.Entry<String,Integer>> sampleIterator = stringIntegerMap.entrySet().iterator();
        //hasNext czy jakieś elementy są jeszcze do przejścia - funkcja iteratora
        while (sampleIterator.hasNext()){
            Map.Entry<String,Integer> mapEntry = sampleIterator.next();
            StringBuilder row = new StringBuilder("Klucz");
            row.append(mapEntry.getKey())
                    .append(",Wartość")
                    .append(mapEntry.getValue());

            if(!sampleIterator.hasNext()){
                row.append(".");
            }else {
                row.append(",");
            }
            System.out.println("row = " + row);
        }
    }

    private static void printMap(Map<String,Integer> stringIntegerMap){
        Set<Map.Entry<String,Integer>> entrySet = stringIntegerMap.entrySet();
        int iterationNumber = 1;
        for (Map.Entry<String,Integer> mapEntry : entrySet ){
            StringBuilder row = new StringBuilder("Klucz");
            row.append(mapEntry.getKey())
                    .append(",Wartość")
                    .append(mapEntry.getValue());

            if(iterationNumber == entrySet.size()){
                row.append(".");
            }else {
                row.append(",");
            }
            System.out.println("row = " + row);
            iterationNumber++;
        }
    }

    private static void printMapStream(Map<String,Integer> sampleMap){
        //stream wpisów w mapie
        String message = sampleMap.entrySet().stream()
                //wyrażenie lambda
                .map(mapEntry -> "Klucz :" + mapEntry.getKey()  + "," + "Wartość : " + mapEntry.getValue() )
                .collect(Collectors.joining("\n", "", "."));

        System.out.println("message = " + message);
    }
}
