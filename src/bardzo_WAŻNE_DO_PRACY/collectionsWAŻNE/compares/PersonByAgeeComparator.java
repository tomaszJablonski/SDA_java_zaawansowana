package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.compares;

import java.util.Comparator;

//Comparator <- służy do porównywania obiektów
//pozwala porównywać obiekty w dowolnym sposób
//może być wiele róznych comparatorów w porównaniu do Comparable

public class PersonByAgeeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());


    }
}
