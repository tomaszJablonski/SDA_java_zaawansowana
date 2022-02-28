package ważne_NALEŻY_ZNAĆ.records;

import java.time.LocalDate;
import java.util.Objects;

public class Car {

    private final String model;
    private final String producer;
    private final LocalDate dateOfProduction;
    private final boolean imported;
    private final String vinNumber;

    public Car(String model, String producer, LocalDate dateOfProduction, boolean imported, String vinNumber) {
        this.model = model;
        this.producer = producer;
        this.dateOfProduction = dateOfProduction;
        this.imported = imported;
        this.vinNumber = vinNumber;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public boolean isImported() {
        return imported;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", imported=" + imported +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return imported == car.imported && Objects.equals(model, car.model) && Objects.equals(producer, car.producer) && Objects.equals(dateOfProduction, car.dateOfProduction) && Objects.equals(vinNumber, car.vinNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, dateOfProduction, imported, vinNumber);
    }
}
