package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie27;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner <T>{

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements){
        return Stream.of(elements)
                .map(e -> e.toString() )
                .collect(Collectors.joining(separator));
    }


    }

