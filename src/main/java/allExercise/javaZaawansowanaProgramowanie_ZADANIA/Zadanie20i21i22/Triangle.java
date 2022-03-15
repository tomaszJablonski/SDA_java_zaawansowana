package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21i22;

public class Triangle extends Shape {

    public Triangle(double sideAShape) {
        super(sideAShape);
    }

    @Override
    protected double calculatePerimeter() {
        System.out.println("Perimeter for Triangle");
        return 3 * getSideAShape();
    }

    @Override
    protected double calculateArea() {
        System.out.println("Area for Triangle");
        return (int) ((Math.pow(getSideAShape(), getSideAShape()) * Math.sqrt(3)) / 4);
    }
}
