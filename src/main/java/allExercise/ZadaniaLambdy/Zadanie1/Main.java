package allExercise.ZadaniaLambdy.Zadanie1;

import java.util.function.Predicate;

public class Main {
    /*
    1. Napisz wyrażenie lambda, które dla podanego stringa zwraca
    informację czy wszystkie litery są drukowane.
     */
    public static void main(String[] args) {

        //jak jest jedna zmienna to można tak zapisać
        Predicate<String> textUpperCase = value -> value.equals(value.toUpperCase());

        boolean to_jest_tekst = textUpperCase.test("to jest tekst");
        System.out.println("to_jest_tekst = " + to_jest_tekst);


    }
}
