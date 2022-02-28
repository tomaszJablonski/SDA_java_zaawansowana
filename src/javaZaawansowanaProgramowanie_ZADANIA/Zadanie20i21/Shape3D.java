package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21;

public abstract class Shape3D extends Shape {

    private double r;
    private double h;


    public Shape3D(double sideAShape) {
        super(sideAShape);

    }

    public Shape3D(double r, double h) {
        this.r = r;
        this.h = h;
    }


    abstract protected double calculateVolume();


    public double getR() {
        return r;
    }


    public double getH() {
        return h;
    }


}
