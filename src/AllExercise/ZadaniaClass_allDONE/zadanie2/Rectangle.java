package AllExercise.ZadaniaClass_allDONE.zadanie2;

public class Rectangle {

    private double sideA;
    private double sideB;

    public  Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle -->" + " Field = " + field() + " | " +" circumFerence = " + circumFerence()
               ;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    //pole
    public double field(){
        return sideA * sideB;
    }
    //obwód
    public double circumFerence(){
        return 2 * sideA + 2* sideB;
    }
}
