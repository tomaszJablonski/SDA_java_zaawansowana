package AllExercise.ZadaniaLambdy.Zadanie5;


/*
5. Napisz wyrażenie lambda, które sprawdza czy
podany podany tekst zawiera przekazany fragment.

 */

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Predicate<String> stringPredicate = value -> value.contains("To");

        boolean exampleText = stringPredicate.test(text);
        System.out.println("exampleText = " + exampleText);



    }
}
