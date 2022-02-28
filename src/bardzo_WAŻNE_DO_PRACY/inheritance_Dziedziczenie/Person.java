package bardzo_WAŻNE_DO_PRACY.inheritance_Dziedziczenie;

public class Person {

    private String name;
    private String lastName;

    public Person() {
        System.out.println("Creating Person");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void sayHello(){
        System.out.println("Hello from person");
    }




}
