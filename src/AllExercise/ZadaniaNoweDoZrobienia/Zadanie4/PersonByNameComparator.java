package AllExercise.ZadaniaNoweDoZrobienia.Zadanie4;

import java.util.Comparator;

public class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getFirstName(),o2.getFirstName());
    }
}
