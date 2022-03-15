package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie2;

public class Sphere implements Shape,Shape3d {
    private double  r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 4*Math.PI*Math.sqrt(r);
    }

    @Override
    public double calculateVolume() { return 4/3*Math.PI*Math.pow(r,3);
    }
}
