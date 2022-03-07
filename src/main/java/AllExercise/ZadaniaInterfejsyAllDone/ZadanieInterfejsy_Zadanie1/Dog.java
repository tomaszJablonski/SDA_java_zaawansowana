package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie1;

public class Dog implements  Animals{

    @Override
    public String givaAVoice() {
        return "Hał hał";
    }

    @Override
    public String move() {
        return Animals.super.move();
    }
}
