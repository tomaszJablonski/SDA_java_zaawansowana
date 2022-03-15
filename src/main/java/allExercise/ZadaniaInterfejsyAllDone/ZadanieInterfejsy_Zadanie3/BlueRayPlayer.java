package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie3;

public class BlueRayPlayer implements Player,HDRPlayer{

    @Override
    public String play(String movie) {
        return "Play the movie " + " BlueRay " + movie ;
    }

    @Override
    public void stop() {
        System.out.println("Stop playing");
    }

    @Override
    public void canPlayHdr(){
        System.out.println("Can play HDR");
    }
}
