package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

//napisz klasę pudełko, które przechowuje inny obiekt - napisane

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Main {
    //Typy boxowe to obiektowe wersje typów prymitywnych
    //int - Integer
    //long - Long
    //char - Character
    //double - Double
    //float - Float
    //boolean - Boolean
    //byte - Byte
    //short - Short


    public static void main(String[] args) {
        //pudełko na stringa

        StringBox stringBox = new StringBox("SomeSecretValue");
        System.out.println("stringBox.getValue() = " + stringBox.getValue());

        //pudełko na LocalDate
        LocalDateBox localDateBox = new LocalDateBox(LocalDate.now());
        System.out.println("localDateBox = " + localDateBox.getValue());


        //Do typów generycznyh używamy tylko typów boxowych ( są na górze)
        //definiujemy żeby za T podstawić String
        GenericBox<String> stringGenericBox = new GenericBox<String>("Hello");
        //definiujemy żeby za T podstawić Integer
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>(10);
        //patterny
        //jak po lewjej stronie jest podany typ w nawiasie <>
        //to po prawje nawias może być pusty
        //Ale nie można go pominąć
        GenericBox<Pattern> patternGenericBox = new GenericBox<>(null);
        Pattern patternGenericBoxValue = patternGenericBox.getValue();

        //z tego jak mam możliwość to nie korzystać
        // raw types (typy generyczne bez typu)
        //jak pomijamy typ to używamy raw types
        GenericBox rawgenericBox = new GenericBox(14.5);
        //użycie raz types powoduje prace z Object
        // -> a to powoduje koieczność castowania
        double vaule = (double) rawgenericBox.getValue();

        //nie interesuje nas typ, chcemy dowolne pudełko
        //<?> dowolny typ  // rozmowa REKRUTACYJNA
        GenericBox<?> anybox;
        anybox = stringGenericBox;
        anybox = integerGenericBox;

        //system typów i typy generyczne
        //Object <-String
        //Object <-Integer
        //Object <-LocalDate
        //Object <-GenericBox

        //object jest rodzicem każdej klasy, też generycznej
        //object jest rodzicem każdego pudełka
        Object object1 = new GenericBox<String>("hello");
        Object object2 = new GenericBox<Integer>(12);

        object1 = object2;


        //100% pytanie na rozmowie rekrutacyjnej
        //dziedziczenie NIE działa po typach generycznych !!!!!!!!!!!
        //TO NIE JEST PRAWDA!!!!
        //GenericBox<Object> <-GenericBox<String>

        //Wildcardy
        //1.Akceptuj wszystko <?>
        GenericBox<?> anyBox1 = new GenericBox<>("Hello");
        GenericBox<?> anyBox2 = new GenericBox<>(LocalDateTime.now());

        //2.Akceptuj wszystko co rozszerza klasę X
        //<? extends X>
        //klasa Number jest wbudowana i pozwala używać każej liczby od inta do doubla
        GenericBox<? extends Number> numberBox1 = new GenericBox<>(10);
        GenericBox<? extends Number> numberBox2 = new GenericBox<>(10.12);
        GenericBox<? extends Number> numberBox3 = new GenericBox<>(10.2323);
        GenericBox<? extends Number> numberBox4 = new GenericBox<>(1022222L);
        //String już nie kompiluje się bo to nie zozszerza klasy Number
        //GenericBox<? extends Number> numberBox1 = new GenericBox<>("napis");

        //3. Akceptuj wszystko co jest w górę od danej klasy
        //drzewa w inforamtyce rosną w dół tak jak drzewo genealogiczne
        //<? super X>
        GenericBox<? super Integer> superBox1 = new GenericBox<>(12);
        GenericBox<? super Integer> superBox2 = new GenericBox<>(new Object());

        //wywołanie generycznej metody która jest poniżej
        GenericBox<Instant> instantGenericBox = new GenericBox<>(Instant.now());
        Instant instant = unpackBox(instantGenericBox);


        //Dwa typy generyczne
        //Instant - klasa która liczy sekundy i dzięki temu pokazuje czas
        GenericBiBox<String,Instant> biBox = new GenericBiBox<>("Hello",Instant.now());

        //Dziedziczenie generyczne
        GenericSpecificBiBox<Long, Double> genericSpecificBiBox = new GenericSpecificBiBox<>(5L,12.5);
        HalfSpecificBiBox<LocalDateTime> halfSpecificBiBox = new HalfSpecificBiBox<>(LocalDateTime.now(),"Hello");
        SpecificBox specificBox = new SpecificBox(Instant.now(),-123123413L);


    }


    //metody które przyjmują klasy generyczne jako argumenty
    public  static void  printBox(GenericBox<String> box){
        System.out.println("box.getValue() = " + box.getValue());
    }

    public static void  printAnyBox(GenericBox<?> anyBox){
        System.out.println("anyBox.getValue() = " + anyBox.getValue());
    }

    public static void  printExtendBox(GenericBox<? extends  Number> extendBox){
        System.out.println("extendBox.getValue() = " + extendBox.getValue());
    }

    public static void printSuperBox(GenericBox<? super Integer> superBox){
        System.out.println("superBox.getValue() = " + superBox.getValue());
    }

    //metody generyczne
    //metody generyczne, któreprzyjmują parametr
    //<T....> <- określa parametry
    //parametry ,pga być jako typ zwracany jako element generyczny klas w argumentach
    public static <T> T unpackBox(GenericBox<T> box){

        return box.getValue();
    }

}
