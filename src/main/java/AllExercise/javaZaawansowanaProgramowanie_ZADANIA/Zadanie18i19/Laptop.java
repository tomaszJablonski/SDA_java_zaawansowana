package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie18i19;

/*
TODO
 Stwórz klasę Laptop rozszerzającą klasę Computer z poprzedniego zadania.
 Klasa Laptop powinna dodatkowo zawierać parametr bateria.
 Zaimplementuj dodatkowe gettery, settery, konstruktor oraz odpowiednio nadpisz metody toString() oraz equals() i hashcode().
 Użyj odniesienia do metod klasy nadrzędnej.
 */

import java.util.Objects;

public class Laptop extends Computer{

    private String battery;

    public Laptop(String processor, Integer ram, String graphicCard, String firma, String model,String battery) {
        super(processor, ram, graphicCard, firma, model);
        this.battery=battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + this.getProcessor()+ '\'' +
                ", ram='" + this.getRam() + '\'' +
                ", graphicCard='" + this.getGraphicCard() + '\'' +
                ", firma='" + this.getFirma() + '\'' +
                ", model='" + this.getModel() + '\'' +
                "battery='" + battery + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
