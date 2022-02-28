package AllExercise.ZadaniaNoweDoZrobienia.Zadanie4;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;
    private double earnings;

    public Person(String firstName, String lastName, int age, double earnings) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.earnings = earnings;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getEarnings() {
        return earnings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.earnings, earnings) == 0 && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, earnings);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", earnings=" + earnings +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(lastName.compareTo(o.lastName) !=0){
            return lastName.compareTo(o.lastName);
        }
        return String.CASE_INSENSITIVE_ORDER.compare(firstName,o.firstName);
    }
}
