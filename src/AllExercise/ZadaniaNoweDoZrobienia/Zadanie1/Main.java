package AllExercise.ZadaniaNoweDoZrobienia.Zadanie1;

import java.util.*;

/*TODO
   1. Stwórz listę Stringów, dodaj przykładowe wartości, a następnie ją posortuj. Jak została posortowana ?
   2. Stwórz set Stringów, a następnie dodaj kilka wartości. Dodaj parę duplikatów - jaki jest rozmiar kolekcji?
   done
   3. Stwórz metodę, która przyjmuje listę przechowującą liczby całkowite, która wypisuje wszystkie liczby.
   done
   4. Zmodyfikuj powyższą metodę tak, aby wypisywała tylko liczby parzyste wraz z ich indeksami.
   done
   5. Zmodyfikuj powyższą metodą tak, aby przyjmowała dowolną kolekcję (co z indeksami?).
   6. Stwórz mapę, a następnie dodaj kilka wartości wraz z kluczami.
   Wypisz te wpisy na ekran w postaci: "klucz -> wartość".
   done
   7. Stwórz mapę, a następnie dodaj kilka wartości dla tego samego klucza. Która wartość została w mapie ?
   done
   8. Posortuj listę Stringów według ich długości - rosnąco.
   done
   9. Napisz metodę która przyjmuje listę stringów, a następnie zwraca ilość unikalnych elementów w tej kolekcji.
   done

 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Exe 1 ");
        listPerson();

        System.out.println("============================");
        System.out.println("Exe 2");
        hashSetPeople();

        System.out.println("==========================");
        System.out.println("Exe 3");
        listNumbers();

        System.out.println("==========================");
        System.out.println("Exe 4 ");
        evenNumbersList();

        System.out.println("===========================");
        System.out.println("Exe 5");
        numberListToHashSet();

        System.out.println("============================");
        System.out.println("Exe 6 and 7 ");
        mapOfNumbers();

        System.out.println("==========================");
        System.out.println("Exe 8");
        listofStrings();

        System.out.println("==========================");
        System.out.println("Exe 9");
        list2ofStrings();





    }

    public static void list2ofStrings(){

        List<String> peopleList = new ArrayList<>();

        peopleList.add("To jest zegarek Ani");
        peopleList.add("To jest zegarek Ani");
        peopleList.add("To jest zegarek Basi");
        peopleList.add("To jest zegarek Basi");
        peopleList.add("To jest zegarek Kasi"); //ten jest unikalny
        peopleList.add("To jest zegarek Asi");
        peopleList.add("To jest zegarek Asi");
        peopleList.add("To jest zegarek Pasi");
        peopleList.add("To jest zegarek Pasi");

        for (String list: peopleList){
            System.out.println(list);
        }

        System.out.println("=====Convert list to set ======");

        Set<String> peopleListToSet = new HashSet<>(peopleList);

        System.out.println("peopleListToSet.size() = " + peopleListToSet.size());


    }

    public static void listofStrings(){

        List<Watch> stringList = new ArrayList<>();

        stringList.add(new Watch("Zegarofigarfigaromistrzowski"));
        stringList.add(new Watch("Zegarek"));
        stringList.add(new Watch("Zegarofigaooofigarooomistrzowski"));
        stringList.add(new Watch("Zegarmistrz"));
        stringList.add(new Watch("Zegarmistrzowski"));

        System.out.println("Before sort");
        System.out.println("stringList = " + stringList);

        System.out.println("After sort");
        stringList.sort(new WatchComparator());
        System.out.println("stringList = " + stringList);


    }



    public static void mapOfNumbers(){

        Map<ListNumbers,Integer> mapNumbers = new HashMap<>();

        mapNumbers.put(new ListNumbers(123),1);
        mapNumbers.put(new ListNumbers(250),2);
        mapNumbers.put(new ListNumbers(99),3);
        mapNumbers.put(new ListNumbers(1123),4);
        mapNumbers.put(new ListNumbers(453),5);
        mapNumbers.put(new ListNumbers(835),6);
        mapNumbers.put(new ListNumbers(11),7);
        //Exe 7 - all in HashMap in Random places
        mapNumbers.put(new ListNumbers(25),7);
        mapNumbers.put(new ListNumbers(33),7);

        for (Map.Entry mapListNumbers : mapNumbers.entrySet()){
            System.out.println(mapListNumbers.getKey() + " " + mapListNumbers.getValue());

        }
        }


    public static void listPerson(){

        List<People> peopleList = new ArrayList<>();

        peopleList.add(new People("Marian", "Dzidzia"));
        peopleList.add(new People("Luke", "Skywalker"));
        peopleList.add(new People("Adam", "Małysz"));
        peopleList.add(new People("Geralt", "Wiedźmin"));
        System.out.println();

        PeopleComparator peopleComparator = new PeopleComparator();
        System.out.println("peopleComparator = " + peopleComparator);


    }

    public static void hashSetPeople() {

        Set<People> setPeople = new HashSet<>();
        System.out.println("setPeople.size() = " + setPeople.size());

        setPeople.add(new People("Luke", "Skywalker"));
        setPeople.add(new People("Tony", "Stark"));
        setPeople.add(new People("Maja", "Pszczółka"));
        setPeople.add(new People("Kubuś", "Puchatek"));
        setPeople.add(new People("Kubuś", "Puchatek"));
        setPeople.add(new People("Kubuś", "Puchatek"));
        setPeople.add(new People("Kubuś", "Puchatek"));

        System.out.println("setPeople.size() = " + setPeople.size());
        System.out.print("setPeople = " + setPeople);
    }

    public static void listNumbers() {

        List<ListNumbers> listNumbers = new ArrayList<>();

        listNumbers.add(new ListNumbers(1));
        listNumbers.add(new ListNumbers(2));
        listNumbers.add(new ListNumbers(3));
        listNumbers.add(new ListNumbers(4));
        listNumbers.add(new ListNumbers(5));
        listNumbers.add(new ListNumbers(6));
        listNumbers.add(new ListNumbers(7));
        listNumbers.add(new ListNumbers(8));
        listNumbers.add(new ListNumbers(9));
        listNumbers.add(new ListNumbers(10));


        for (int i = 0; i < listNumbers.size(); ++i) {
            ListNumbers listNumbers1 = listNumbers.get(i);
            System.out.println("i = " + i + " listNumber " + listNumbers1);

        }
    }

    public static void evenNumbersList() {

        List<ListNumbers> evenNumbersList = new ArrayList<>();

        evenNumbersList.add(new ListNumbers(1));
        evenNumbersList.add(new ListNumbers(2));
        evenNumbersList.add(new ListNumbers(3));
        evenNumbersList.add(new ListNumbers(4));
        evenNumbersList.add(new ListNumbers(5));
        evenNumbersList.add(new ListNumbers(6));
        evenNumbersList.add(new ListNumbers(7));
        evenNumbersList.add(new ListNumbers(8));
        evenNumbersList.add(new ListNumbers(9));
        evenNumbersList.add(new ListNumbers(10));

        for (int i = 0; i < evenNumbersList.size(); i++) {
            ListNumbers evenNumber = evenNumbersList.get(i);
            if (i % 2 == 1) {
                System.out.println("evenNumber = " + evenNumber);
            }
        }
    }

    public static void numberListToHashSet(){

        Set<ListNumbers> listToSet = new HashSet<>();

        listToSet.add(new ListNumbers(1));
        listToSet.add(new ListNumbers(2));
        listToSet.add(new ListNumbers(3));
        listToSet.add(new ListNumbers(4));
        listToSet.add(new ListNumbers(5));
        listToSet.add(new ListNumbers(6));
        listToSet.add(new ListNumbers(7));
        listToSet.add(new ListNumbers(8));
        listToSet.add(new ListNumbers(9));
        listToSet.add(new ListNumbers(10));

        for ( ListNumbers listTo: listToSet){
            System.out.println(listTo);
        }



    }








        }



