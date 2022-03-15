package allExercise.ZadaniaLambdy.Zadanie3;

/*
3. Napisz wyrażenie lambda, które generuje losową liczbę.

 */

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //generowanie losowych liczb, seed powoduje,że za każdym razem bedzie inny przedział
        Random random = new Random(System.currentTimeMillis());
        Supplier<Integer> randomNumber = () ->  random.nextInt();
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());


    }
}
