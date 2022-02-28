package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.hashCode_equals;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String name, String lastName, int age, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, pesel);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
