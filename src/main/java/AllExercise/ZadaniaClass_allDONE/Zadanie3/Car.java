package AllExercise.ZadaniaClass_allDONE.Zadanie3;

public class Car extends Vehicle{

    private String fuelType;


    public Car(int actualSpeed, String fuelType) {
        super(100,actualSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                " maxSpeedCar= " + super.getMaxSpeed() +" actualSpeed "+ getActualSpeed()+
                ", fuelType= " + fuelType + '\'' +
                '}';
    }




}
