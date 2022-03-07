package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13;

import java.util.Comparator;
import java.util.function.Function;

public enum SortType {
    ASC,
    DESC;

    public Comparator<Car> getComparator(Function<Car,? extends Comparable> fieldExtractor){
        Comparator<Car> defaultComparator = Comparator.comparing(car -> fieldExtractor.apply(car));
        if(this == DESC){
            defaultComparator = defaultComparator.reversed();
        }
        return defaultComparator;
    }
}
