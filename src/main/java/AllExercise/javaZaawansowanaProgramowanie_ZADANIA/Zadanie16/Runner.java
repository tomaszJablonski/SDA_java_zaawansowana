package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie16;

import java.util.stream.Stream;

/*
TODO
 Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED.
 Enum powinien posiadać dwa parametry:
 • minimalny czas przebiegnięcia maratonu w minutach
 • maksymalny czas przebiegnięcia maratonu w minutach
 Dodatkowo enum Runner powinien zawierać
 metodę statyczną getFitnessLevel(), która przyjmuje na wejściu
 dowolny czas przebiegnięcia maratonu, a jako rezultat powinna
 zwracać konkretny obiekt Runner na podstawie przekazanego czasu.
 */
public enum Runner {

    BEGINNER(55.8F,120.7F),
    INTERMEDIATE(34.5F,55.7F),
    ADVANCED(15.0F,34.4F);

    private final float minTime;
    private final float maxTime;

    Runner(float minTime, float maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner  getFitnessLevel(float time){
       return Stream.of(values())
               .filter( runner -> runner.minTime <= time && runner.maxTime >=time)
               .findFirst()
               .orElseThrow(()-> new IllegalStateException("Nie ma poziomu dla przekazanego czasu" + time));



    }
}
