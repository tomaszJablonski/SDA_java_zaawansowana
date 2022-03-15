package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie4;

/*
TODO
 Zadanie 4
 1. Stwórz klasę Person, która przechowuje imię (String), nazwisko (String), wiek (int), zarobki (double).
 done
 2. Stwórz kilka obiektów klasy Person.
 Done
 3. Stwórz TreeSet a następnie dodaj kilka stworzone obiekty - co się stało?
 Done
 4. Dodaj niezbędne elementy do klasy Person, tak aby domyślnie osoby były sortowane po nazwisku.
 done
 5. Uruchom ponownie program - jaka jest kolejność w zbiorze ?
 done
 6. Stwórz własne komparatory - PersonByNameComparator, PersonByAgeComparator, PersonBySalaryComparator
 done
 7. Stwórz trzy TreeSet - każdy z inną strategią porównywania (stworzonymi powyżej) - wypisz ich zawartość na ekran
 done
 */

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> personSet = new TreeSet<>();

        System.out.println("personSet.size() = " + personSet.size());
        System.out.println("personSet = " + personSet);

        personSet.add(new Person("Agnieszka","Wola",24,3500));
        personSet.add(new Person("Iza","Hora",23,4500));
        personSet.add(new Person("Hania","Tylna",30,2500));
        personSet.add(new Person("Tatiana","Kopacz",31,1500));

        System.out.println("personSet.size() = " + personSet.size());
        System.out.print("personSet = " + personSet);

        System.out.println();

        Set<Person> personSet1 = new TreeSet<>(new PersonByNameComparator());

        personSet1.add(new Person("Agnieszka","Wola",24,3500));
        personSet1.add(new Person("Iza","Hora",23,4500));
        personSet1.add(new Person("Hania","Tylna",30,2500));
        personSet1.add(new Person("Tatiana","Kopacz",31,1500));

        System.out.println("personSet1 = " + personSet1);


        Set<Person> personSet2 = new TreeSet<>(new PersonByAgeComparator());

        personSet2.add(new Person("Agnieszka","Wola",24,3500));
        personSet2.add(new Person("Iza","Hora",23,4500));
        personSet2.add(new Person("Hania","Tylna",30,2500));
        personSet2.add(new Person("Tatiana","Kopacz",31,1500));

        System.out.println("personSet2 = " + personSet2);

        Set<Person> personSet3 = new TreeSet<>(new PersonBySalaryComparator());

        personSet3.add(new Person("Agnieszka","Wola",24,3500));
        personSet3.add(new Person("Iza","Hora",23,4500));
        personSet3.add(new Person("Hania","Tylna",30,2500));
        personSet3.add(new Person("Tatiana","Kopacz",31,1500));

        System.out.println("personSet3 = " + personSet3);


    }
}
