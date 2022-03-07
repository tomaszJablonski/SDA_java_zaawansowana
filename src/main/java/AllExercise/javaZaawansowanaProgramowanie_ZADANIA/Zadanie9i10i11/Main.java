package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie9i10i11;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(0,0),new Point2D(5,0));
        System.out.println(circle);

        System.out.println("Po przesunięciu");
        circle.movable(new MoveDirection(3,0));
        System.out.println(circle);

        System.out.println("Po zmianie rozmiaru");
        circle.resize(2);
        System.out.println(circle);




    }
}
