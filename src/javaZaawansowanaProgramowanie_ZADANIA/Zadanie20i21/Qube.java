package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21;

public class Qube extends Shape3D {


    public Qube(double sideAShape) {
        super(sideAShape);
    }

    @Override
    protected double calculatePerimeter() {
        return 0;
    }

    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    protected double calculateVolume() {
        return 3 * getSideAShape();
    }
}
