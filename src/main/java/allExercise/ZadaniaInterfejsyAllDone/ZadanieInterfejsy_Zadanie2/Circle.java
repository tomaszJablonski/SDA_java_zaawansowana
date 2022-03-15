package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie2;

public class Circle implements Shape{
    private double  r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 3.14*Math.sqrt(r);
    }
}
