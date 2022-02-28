package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21;

public class Rectangle extends Shape {

    public Rectangle(double sideAShape, double sideBShape) {
        super(sideAShape, sideBShape);
    }

    @Override
    protected double calculatePerimeter() {
        System.out.println("Perimeter for Rectangle");
        return 2 * getSideAShape() + 2 * getSideBShape();
    }

    @Override
    protected double calculateArea() {
        System.out.println("Area for Triangle");
        return getSideAShape() * getSideBShape();
    }
}
