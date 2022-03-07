package ważne_NALEŻY_ZNAĆ.casting;

//Rzytowanie w górę
//góra ? jeden z naszych rodziców w dziedziczeniu
// lub interfejs który implementujemy
//rzutowanew górę jest bezpieczne

public class UpCasting {

    public static void main(String[] args) {
        Student student = new Student();

        //Rzutowanie na implementowy interfejs:
        Learner learner = student;

        //rzutowanie na rodzica:
        Person person = student;

        //rzutowanie na Object (rodzica wszystkich):
        Object object = student;

        //rzutowanie na interfejs implementowany przez rodzica:
        Greeter greeter = student;

    }
}
