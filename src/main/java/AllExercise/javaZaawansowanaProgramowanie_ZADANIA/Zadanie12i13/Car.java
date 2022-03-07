package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private int year;
    private List<Manufacturer> manufacturerList = new ArrayList<>();
    private EngineType engineType; // enum

    public Car(String name, String model, int price, int year, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && year == car.year && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, year, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }
}
