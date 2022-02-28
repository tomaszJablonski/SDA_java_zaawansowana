package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20;

public class Hexagon extends Shape {


    public Hexagon(double sideAShape) {
        super(sideAShape);
    }

    @Override
    protected double calculatePerimeter() {
        System.out.println("Perimeter for Hexagon");
        return 6 * getSideAShape();
    }

    @Override
    protected double calculateArea() {
        System.out.println("Area  for Hexagon");
        return ((3*Math.pow(getSideAShape(),getSideAShape())/Math.sqrt(3))/2);
    }


}
