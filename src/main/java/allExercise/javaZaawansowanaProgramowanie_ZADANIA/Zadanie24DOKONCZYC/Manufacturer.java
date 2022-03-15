package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie24DOKONCZYC;

import java.util.List;
import java.util.Objects;

public class Manufacturer {

    private String name;
    private int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfCreation == that.yearOfCreation && Objects.equals(name, that.name) && Objects.equals(models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfCreation, models);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", models=" + models +
                '}';
    }
}
