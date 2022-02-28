package javaZaawansowanaProgramowanie_ZADANIA.Zadanie27;

/*
TODO
 Zaprojektuj klasę Joiner,
 która w konstruktorze będzie przyjmowała separator (string) oraz
 posiadała metodę join() pozwalającą na podanie dowolnej
 ilości obiektów typu T. Metoda ta będzie zwracać stringa łącząc wszystkie
 przekazane elementy wywołując ich metodę toString() i oddzielać je separatorem.
 np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
 */

public class Main {
    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");

        String result = joiner.join(1,2,3,4,5,6);

        System.out.println(result);


    }
}
