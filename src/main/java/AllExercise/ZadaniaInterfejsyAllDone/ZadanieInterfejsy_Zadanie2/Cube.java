package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie2;

public class Cube implements Shape,Shape3d{

    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 6*a*a;
    }

    @Override
    public double calculateVolume() {
        return a*a*a;
    }
}
