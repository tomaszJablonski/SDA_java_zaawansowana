package javaZaawansowanaProgramowanie_ZADANIA.Zadanie1i2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class Main {
    public static void main(String[] args) {

        //Sortowanie listy przez Arrays.asList

        List<String> stringList = Arrays.asList("Adam","Basia","Zdzisław","adam","kamila");
        stringList = sortOdZDoA(stringList);
        System.out.println("stringList = " + stringList);

        //Sortowanie klasy Person
        sortedList();

    }
    //sorotwanie od A do Z
    public static void sortedList(){

        List<Person> sortedList = new ArrayList<>();

        sortedList.add(new Person("Marian"));
        sortedList.add(new Person("Agnieszka"));
        sortedList.add(new Person("Kamil"));
        sortedList.add(new Person("asia"));
        sortedList.add(new Person("Dominika"));

        sortedList.sort(new PersonComparator());
        System.out.println("sortedList = " + sortedList);


    }

//    public static void sortedListWithoutPerson(){
//
//        List<String> stringList = new ArrayList<>();
//
//        stringList.add("Marian");
//        stringList.add("Agnieszka");
//        stringList.add("Kaisa");
//        stringList.add("Ola");
//        stringList.add("Tomasz");
//
//        //Comparator<String> comparator = ((s1, s2) -> s1.compareTo(s2));
//        Comparator<String> comparator = (String::compareTo);
//        Arrays.sort(stringList, comparator.reversed());
//
//    }

    private static List<String> sortOdZDoA (List<String> input){
        input.sort(CASE_INSENSITIVE_ORDER.reversed());
        return input;
    }

    //zadanie 2-coparator którego można po prostu użyć

    private static class MyOwnComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return -o1.toUpperCase().compareTo(o2.toUpperCase());

        }
    }

    }


