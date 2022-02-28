package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie3;

public class CDPlayer implements Player{

    @Override
    public String play(String movie) {
        return "Play the movie" + " CD "  + movie;
    }

    @Override
    public void stop() {
        System.out.println("Player is stop");
    }
}
