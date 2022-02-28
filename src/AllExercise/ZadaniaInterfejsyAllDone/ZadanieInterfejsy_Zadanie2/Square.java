package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie2;

public class Square implements Shape,Shape3d{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
