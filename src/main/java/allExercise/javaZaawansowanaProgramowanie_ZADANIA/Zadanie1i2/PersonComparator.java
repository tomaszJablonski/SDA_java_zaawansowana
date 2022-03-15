package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie1i2;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String name = o2.getName();
        String name1 = o1.getName();
        return name.compareTo(name1);
    }
}
