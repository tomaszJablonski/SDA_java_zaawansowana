package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie9i10i11;

public class Circle implements Movable,Resizable {
    private Point2D center; //środek koła
    private Point2D point; // punkt na okręgu - promień

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    //obliczanie promienia z twierdzenia pitagorasa!!!!!
    public double getRadius() {
        return Math.sqrt(
                Math.pow(point.getX() - center.getX(), 2) +
                        Math.pow(point.getY() - center.getY(), 2));

    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public void movable(MoveDirection moveDirection) {
        center.movable(moveDirection);
        point.movable(moveDirection);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public void resize(double resizeFactor) {
       point = new Point2D(point.getX() * resizeFactor,point.getY()*resizeFactor);


    }
}

