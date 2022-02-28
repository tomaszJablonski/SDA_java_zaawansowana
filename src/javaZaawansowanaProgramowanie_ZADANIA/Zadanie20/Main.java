package javaZaawansowanaProgramowanie_ZADANIA.Zadanie20;

public class Main {
    public static void main(String[] args) {

        Hexagon hexagon = new Hexagon(5);
        System.out.println("hexagon.calculateArea(5) = " + hexagon.calculateArea());
        System.out.println("hexagon.calculatePerimeter() = " + hexagon.calculatePerimeter());

        Cone cone = new Cone(5, 10);
        System.out.println("cone.calculateVolume() = " + cone.calculateVolume());

        Qube qube = new Qube(5);
        System.out.println("qube.calculateVolume() = " + qube.calculateVolume());


    }
}
