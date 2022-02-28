package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.Classes;

/*
    W pracy z kolekcjami ZAZWYCZAJ (!) korzystamy z interfejsów
    implementacja to szeczgół
    wszystkie kolekcje mają interfejs
 */

//lista - kolekcja która przechowuje
//1. przechowuje kolejność
//2.pozwala na duplikaty


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//mamy dwie implementacje
//ArrayList, LinkendList

//ArrayList vs LikendList
// (lista odsyłaczowa powinna być szybsza ale nie jest) -
// W PRACY TYLKO ArrayList
public class ListCollectionsMain {

    public static void main(String[] args) {
        //ArrayList - która pod spodem ma tablice
        //LinkedList - lista która pod spodem ma listę odsyłaczową (na referencjach)
        List<Person> personList = new ArrayList<>();
        //List<Person> personList = new LinkedList<>();
        //reszta to samo
        int listSize = personList.size();
        System.out.println("listSize = " + listSize);

        //dodać do listy
        personList.add(new Person("Jan",12));
        personList.add(new Person("Dominika", 23));


        System.out.println("personList.size() = " + personList.size());
        //kolejność dodawania jest pamiętana
        System.out.println("personList = " + personList);
        personList.add(1, new Person("Kamil",19));
        System.out.println("personList = " + personList);

        //wyciąganie czegoś z listy
        Person personListZero = personList.get(0);
        System.out.println("personListZero = " + personListZero);

        //sortowanie (list only)
        //wiemy że klasa Person implementuje Comparable, więc chcemy go użyć
        personList.sort(Comparator.naturalOrder());
        System.out.println("personList after sort = " + personList);
        personList.sort(new PersonByAgeeComparator());
        System.out.println("personList after sorting by age = " + personList);

        //sprawdzić czy lista zawiera element
        boolean containsJan = personList.contains(new Person("Jan",12));
        System.out.println("containsJan = " + containsJan);

        //wszystkie kolekcje wspierają pętlę for-each
        for (Person person:personList){
            if (person.equals(new Person("Jan",12))){
                System.out.println("Lista zwiera Jana");
            }
        }

        boolean isListEmpty = personList.isEmpty();
        System.out.println("isListEmpty = " + isListEmpty);

        //usuwanie
        personList.remove(new Person("Kamil",19));
        System.out.println("After removal  = " + personList);

        //tylko dla listy - lista ma kolejność więc ma indeksy
        for (int i=0; i<personList.size();i++){
            Person p = personList.get(i);
            System.out.println("p = " + p);
        }

    }

}
