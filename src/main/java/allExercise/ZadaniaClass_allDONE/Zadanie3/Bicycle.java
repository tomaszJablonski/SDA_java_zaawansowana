package allExercise.ZadaniaClass_allDONE.Zadanie3;

public class Bicycle extends Vehicle{

    private int numberOfDerailleurs;


    public Bicycle(int actualSpeed, int numberOfDerailleurs) {
        super(25,actualSpeed);
        this.numberOfDerailleurs = numberOfDerailleurs;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "maxSpeed= " + super.getMaxSpeed() + " actualSpeed " +getActualSpeed() +
                ", numberOfDerailleurs= " + numberOfDerailleurs +
                '}';
    }
}
