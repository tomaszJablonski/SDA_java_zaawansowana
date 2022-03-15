package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21i22;

public class Main {
    public static void main(String[] args) {

        Hexagon hexagon = new Hexagon(5);
        System.out.println("hexagon.calculateArea(5) = " + hexagon.calculateArea());
        System.out.println("hexagon.calculatePerimeter() = " + hexagon.calculatePerimeter());

        Cone cone = new Cone(5, 10);
        System.out.println("cone.calculateVolume() = " + (int) cone.calculateVolume());
        cone.fill(50);

        Qube qube = new Qube(5);
        System.out.println("qube.calculateVolume() = " + qube.calculateVolume());
        qube.fill(20);




    }
}
