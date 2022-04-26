package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

//set - kolekcja nie pozawala na duplikaty
// dobrze by był hashcode i equals

import java.util.*;

//trzy implementacje:
//hashset
//linkedhashset
//treeset

//nie ma czegoś takiego jak indeksy



//Hashset - jest najszybsza i najczęściej wykorzysytwana
public class SetCollectionMain {
    public static void main(String[] args) {
        hashSet();
        linkedHashSet();
        treeSet();
        treeSetBox();


    }

    private static void hashSet(){
        System.out.println("===============");
        System.out.println("Hash Set");
        System.out.println("===============");

        Set<Person> set = new HashSet<>();

        //rozmiar,pustość
        System.out.println("set.size() = " + set.size());
        System.out.println("set.isEmpty() = " + set.isEmpty());

        //nie utrzymuje kolejności dodawania, kolejność jest losowa
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Damian",25));
        //duplikaty są ignorowane
        System.out.println("set.size() = " + set.size());
        System.out.println("set = " + set);

        boolean contains = set.contains(new Person("Damian",25));
        System.out.println("contains = " + contains);

        //iterowanie - pętla for each
        for(Person person: set){
            System.out.println("person = " + person);
        }

       //usuwanie

        System.out.println(" before remove = " + set);
        set.remove(new Person("Damian",25));
        System.out.println("after remove  = " + set);

        //wyczyścić set
        set.clear();
        System.out.println("set = " + set);

    }
    //Linkedhash set - utrzymuje kolejność dodawania (nie da się go sortować
    // nie pozwala na duplikaty
    private static void linkedHashSet(){
        System.out.println("===============");
        System.out.println("Linked Hash Set");
        System.out.println("===============");

        Set<Person> set = new LinkedHashSet<>();

        //rozmiar,pustość
        System.out.println("set.size() = " + set.size());
        System.out.println("set.isEmpty() = " + set.isEmpty());

        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Damian",25));
        //duplikaty są ignorowane
        System.out.println("set.size() = " + set.size());
        System.out.println("set = " + set);

        boolean contains = set.contains(new Person("Damian",25));
        System.out.println("contains = " + contains);

        //iterowanie - pętla for each
        for(Person person: set){
            System.out.println("person = " + person);
        }

        //usuwanie

        System.out.println(" before remove = " + set);
        set.remove(new Person("Damian",25));
        System.out.println("after remove  = " + set);

        //wyczyścić set
        set.clear();
        System.out.println("set = " + set);

    }
    //przechowuje elememty posortowane
    //jak sortuje elementy (?) sortuje według Comparable lub Comparatora
    //nie pozwala na duplikaty
    private static void treeSet(){
        System.out.println("===============");
        System.out.println("Tree Set");
        System.out.println("===============");

        Set<Person> set = new TreeSet<>();

        //rozmiar,pustość
        System.out.println("set.size() = " + set.size());
        System.out.println("set.isEmpty() = " + set.isEmpty());

        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Kamil",19));
        set.add(new Person("Damian",25));
        set.add(new Person("Asia",38));

        //duplikaty są ignorowane
        System.out.println("set.size() = " + set.size());
        System.out.println("set = " + set);

        boolean contains = set.contains(new Person("Damian",25));
        System.out.println("contains = " + contains);

        //iterowanie - pętla for each
        for (Person person : set) {
            System.out.println("person = " + person);
        }

        //usuwanie

        System.out.println(" before remove = " + set);
        set.remove(new Person("Damian", 25));
        System.out.println("after remove  = " + set);

        set.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Posortowany set" + set);

        //wyczyścić set
        set.clear();
        System.out.println("set = " + set);

    }

    //jeśli elementy które przechowujemy nie implementują Comparable
    //to musimy TreeSetow powiedzieć jak ma je porównywać
    //czyli dsotarczyć Comparator
    private  static void treeSetBox(){
        System.out.println("====================");
        System.out.println("Tree set with StringBox");
        System.out.println("====================");

        Set<StringBox> set = new TreeSet<>(new StringBoxComparator());
        set.add(new StringBox("Hello"));
        set.add(new StringBox("Adam"));

        System.out.println("set = " + set);


    }
}
