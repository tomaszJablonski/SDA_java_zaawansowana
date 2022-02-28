package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.compares;

import java.util.Comparator;

//Comparator <- słiuży do porównywania obiektów
//pozwala porównywać obiekty w dowolnym sposób
//może być wiele róznych comparatorów w porównaniu do Comparable

public class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String nameOfFirst = o1.getName();
        String nameOfSecond = o2.getName();
        return nameOfFirst.compareTo(nameOfSecond);


    }
}
