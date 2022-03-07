package bardzo_WAŻNE_DO_PRACY.inheritance_Dziedziczenie;

public class Main {

    public static void main(String[] args) {


        //dziedziczenie
        Person p1 = new Person();
        Student s1 = new Student();
        //przez dziedziczenie
        //student jest osobą, więc:
        Person p2 = new Student();  // Widzi tylko metody z klasy Person a nie widzi Studenta

        //////

        consumePerson(p1);
        consumePerson(s1);
        consumePerson(p2);
        //////

        //klasa która rozszerza ma wszystko co klasa rozszerzana
        //klasy potomne mają wszystkie metody (public czy z dostępu
        // z klasy rodzica

        p1.sayHello();
        s1.sayHello();
        p2.sayHello();

        //klasa Person NIE MA dostępu do metod student:
        //p1.learn() <- osoba nie ma metody learn
        s1.learn();
        //nie działa bo bo sprawdziamy dostęne metody po typie zmienej!
        //p2.learn(); = mimo, że wiemy, że to  student to nie ma learn

        Person p3 = new Person("Kamil","W.");

        Person s2 = new Student("Tomasz","Jablonski","5");
        System.out.println(s2);

        System.out.println("================");
        Person p18 = new Person(); // Person ma tylko dostęp do Person
        Student s10 = new Student(); // Zawołanie polimofriczne - wywoływanie metod po kolei w góre aż
        // dojdziemy do nienadpisanej
        Person p11 = new Student();

        p18.sayHello();
        s10.sayHello();
        p11.toString();
    }

        private static void consumePerson (Person p){
            //do something with person
        }
    }


