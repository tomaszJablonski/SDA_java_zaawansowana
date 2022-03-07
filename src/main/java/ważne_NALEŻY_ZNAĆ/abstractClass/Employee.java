package ważne_NALEŻY_ZNAĆ.abstractClass;

//definicja klasy abstrakcyjnej:
// - słowo abstract przy class

//normalna klasa, posiada pola, construktory,metody
//Może (NIE MUSI) posiadać metody abstrakcyjne

//NIE można zrobić obiektu takiej klasy
public abstract class Employee {
    private final String name;
    private final String lastName;


    protected Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //metod abstrakcyjnych może być od 0 do bardzo wielu
    //musi być nadpisana
    protected abstract String getDepartmentName();

    public String getInfo(){

        return "%s %s works in %s".formatted(name,lastName, getDepartmentName());
    }
}
