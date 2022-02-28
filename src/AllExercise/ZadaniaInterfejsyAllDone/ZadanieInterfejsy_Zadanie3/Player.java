package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie3;

public interface Player {

    String play(String move);
    default void stop(){
        System.out.println("Stop playing");
    };
}
