package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie3;

public class DVDPlayer implements Player{

    @Override
    public String play(String movie) {
        return "Play the movie " + " DVD " + movie;
    }

    @Override
    public void stop() {
        System.out.println("Player DVD is stop");
    }
}
