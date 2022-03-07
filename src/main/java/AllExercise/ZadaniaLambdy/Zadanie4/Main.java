package AllExercise.ZadaniaLambdy.Zadanie4;

/*
4. Napisz wyrażenie lambda, które generuje losową
liczbę z podanego zakresu.


 */

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //generowanie losowych liczb, seed powoduje,że za każdym razem bedzie inny przedział
        Random random = new Random(System.currentTimeMillis());
        //                                  (jedyna zmiana to dodanie tu zakresu w tych nawiasach)
        Supplier<Integer> randomNumber = () ->  random.nextInt(0,100);
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());
        System.out.println("randomNumber.get() = " + randomNumber.get());



    }
}
