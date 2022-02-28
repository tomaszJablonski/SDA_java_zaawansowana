package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21;

public class Cone extends Shape3D {

    public Cone(double r, double h) {
        super(r, h);
    }

    @Override
    protected double calculateVolume() {
        return 0;
    }

    @Override
    protected double calculatePerimeter() {
        return 0;
    }

    @Override
    protected double calculateArea() {
        return 1.0 / 3 * (Math.PI * Math.sqrt(getR()) * getH());
    }
}
