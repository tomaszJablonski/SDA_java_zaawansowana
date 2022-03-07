package AllExercise.ZadaniaLambdy.Zadanie2;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
   /*
   2. Napisz wyrażenie lambda, które dla podanego
   stringa zwraca ten sam tekst, tylko drukowanymi literami.
    */

    public static void main(String[] args) {

        Function<String,String> changeTextToUpperCase = (myText)
                ->myText.toUpperCase();
        String textToUpperCase = changeTextToUpperCase.apply("to jest moj tekst");
        System.out.println(textToUpperCase);


    }
}
