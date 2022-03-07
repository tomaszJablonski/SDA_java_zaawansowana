package AllExercise.ZadaniaClass_allDONE.Zadanie3;

public class Vehicle {

    private int maxSpeed;
    private int actualSpeed;

    public Vehicle(int maxSpeed, int actualSpeed) {
        this.maxSpeed = maxSpeed;
        this.actualSpeed = actualSpeed;
    }

    @Override
    public String toString() {
        return "Vhicle{" +
                "maxSpeed=" + maxSpeed +
                ", actualSpeed=" + actualSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getActualSpeed() {
            return actualSpeed;
    }
//TODO What is Wrong xD ???????????????????????????????????? BACK TO IT
    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
        if (this.actualSpeed>this.maxSpeed|| this.actualSpeed<0){
            System.out.println("Error");
        } else {
            System.out.println("Speed is good");
        }
    }
}
