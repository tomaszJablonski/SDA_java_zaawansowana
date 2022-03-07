package AllExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie4;

import java.util.Comparator;

public class PersonBySalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getEarnings(),o2.getEarnings());
    }
}
