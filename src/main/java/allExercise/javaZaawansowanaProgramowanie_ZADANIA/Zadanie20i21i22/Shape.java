package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21i22;

/*
TODO
 Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter()
 służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
 Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio implementując metody abstrakcyjne.
 Sprawdź poprawność działania.
 */

public abstract class Shape {

    private double sideAShape;
    private double sideBShape;

    public Shape(double sideAShape, double sideBShape) {
        this.sideAShape = sideAShape;
        this.sideBShape = sideBShape;
    }

    public Shape(double sideAShape) {
        this.sideAShape = sideAShape;
    }

    protected Shape() {
    }

    //obwód
    abstract protected double calculatePerimeter();

    //pole
    abstract protected double calculateArea();


    public double getSideAShape() {
        return sideAShape;
    }

    public double getSideBShape() {
        return sideBShape;
    }

}
