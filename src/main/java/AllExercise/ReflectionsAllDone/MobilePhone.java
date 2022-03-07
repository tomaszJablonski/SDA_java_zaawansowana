package AllExercise.ReflectionsAllDone;

public class MobilePhone {

    private String producer;
    private String model;
    private long initialBatteryCapacity;
    private long currentBatteryCapacity;
    private boolean turnedOn;


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getInitialBatteryCapacity() {
        return initialBatteryCapacity;
    }

    public void setInitialBatteryCapacity(long initialBatteryCapacity) {
        this.initialBatteryCapacity = initialBatteryCapacity;
    }

    public long getCurrentBatteryCapacity() {
        return currentBatteryCapacity;
    }

    public void setCurrentBatteryCapacity(long currentBatteryCapacity) {
        this.currentBatteryCapacity = currentBatteryCapacity;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", initialBatteryCapacity=" + initialBatteryCapacity +
                ", currentBatteryCapacity=" + currentBatteryCapacity +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
