package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie1;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        String nameOfFirst = o1.getFirstName();
        String nameOfLast = o2.getLastName();
        return nameOfFirst.compareTo(nameOfLast);
    }
}
