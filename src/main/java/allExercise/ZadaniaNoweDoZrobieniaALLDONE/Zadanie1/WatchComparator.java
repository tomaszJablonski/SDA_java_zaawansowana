package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie1;

import java.util.Comparator;

public class WatchComparator implements Comparator<Watch> {


    @Override
    public int compare(Watch o1, Watch o2) {
        String name = o1.getName();
        String name1 = o2.getName();
        return name.compareTo(name1);
    }
}
