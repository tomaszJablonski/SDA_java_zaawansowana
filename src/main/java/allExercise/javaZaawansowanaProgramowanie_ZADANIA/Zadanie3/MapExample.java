package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie3;

import java.util.Objects;

public class MapExample {

    private String name;
    private Integer number;

    public MapExample(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapExample mapExample = (MapExample) o;
        return Objects.equals(name, mapExample.name) && Objects.equals(number, mapExample.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Map " +
                "name='" + name + '\'' +
                ", number=" + number +
                '.';
    }
}
