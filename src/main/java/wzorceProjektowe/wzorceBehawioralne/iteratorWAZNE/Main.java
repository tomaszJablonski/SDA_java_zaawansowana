package wzorceProjektowe.wzorceBehawioralne.iteratorWAZNE;


//działa odwrotnie niż obserwator, tutaj to klient a nie sklep wysyła zapytanie
//i oczekuje odpowiedzi
//Iterator jest zaimplementowany w Javie

/*

wykorzystanie wbudowanych interfejsów Iterable i Iterator

celem stosowania jest ukrycie sposobu implementacji danych

jeżeli chcemy dać dostęp do iteratora na podstawie standardowej
kolekcji -> wbudowany interfejs Iterable

w celu stworzenia własnego:

stworzenie metody sprawdzającej, czy istnieje następny element
metoda dająca dostęp do kolejnego obiektu
często implementowany za pomocą wbudowanego interfejsu Iterator
hasNext() i next()
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simple Iterator");

        List<String> names = new ArrayList<>();
        names.add("Mariola");
        names.add("Agnieszka");
        names.add("Andżela");
        names.add("Halina");

        names.add(2, "Susana");
        names.add(3, "Anna");

        Iterator<String> stringIterator = names.iterator();
//        System.out.println("stringIterator.next() = " + stringIterator.next());
//        System.out.println("stringIterator.next() = " + stringIterator.next());
//        System.out.println("stringIterator.next() = " + stringIterator.next());
//        System.out.println("stringIterator.next() = " + stringIterator.next());


        //wypisuje wszystkie elementy z iteratora
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
        System.out.println();
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        System.out.println("ListIterator" + "\n");

        ListIterator<String> stringIterator1 = names.listIterator();
        stringIterator1.add("Roza");
        stringIterator1.add("Karina");

        for (String listIterator : names) {
            System.out.println(listIterator);
        }


    }
}
