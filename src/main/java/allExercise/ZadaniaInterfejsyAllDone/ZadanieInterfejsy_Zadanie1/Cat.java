package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie1;

public class Cat implements Animals{

    @Override
    public String givaAVoice() {

        return "Miał miał";
    }

    @Override
    public String move() {
        return Animals.super.move();
    }
}
