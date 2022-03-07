package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int year;
    private String country;

    public Manufacturer(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return year == that.year && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
