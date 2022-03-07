package ważne_NALEŻY_ZNAĆ.enkapsulation;

public class Phone {
    private String producer;
    private String model;
    private long batteryCapacity;

    public Phone(String producer, String model, long batteryCapacity) {
        this.producer = producer;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

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

    public long getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(long batteryCapacity) {
        if (batteryCapacity < 0){
            //zgłoś błąd
        }
        this.batteryCapacity = batteryCapacity;
    }
}


