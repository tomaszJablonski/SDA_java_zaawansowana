package function_WAŻNE.lambda;

//1.wyrażenie lambda - musi mieć typ
//2.typ - dowolna klasa abstrakcyjna/interfejs który ma tylko jedną metodę abstrakcyjną
//2a typ - interfejs funkcyjny
//3.Czy sami musimy definiować typy ? NIE
//4.typy wbudowane w javie - java.util.function
//5. ważniejsze typy:
//!!!!!!!!!!!!!!! BARDZO WAŻNE TRZEBA ZNAĆ!!!!!!!!!!!!!!!!!!
// - Consumer - nic nie zwraca coś przyjmuje - accept //zjadamy nie ma
// - Predicate - zwraca boola coś przyjmuje - test
// - Supplier - coś zwraca nic nie przyjmuje - get // coś generujemy
// - Function - coś przyjmuje,coś zwraca - apply
// - Runnable - nic nie zwraca nic nie przyjmuje - run //robimy sami z siebie
//!!!!!!!!!!!!!!! BARDZO WAŻNE TRZEBA ZNAĆ !!!!!!!!!!!!!!!!!

import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        //lambda to implementacja abstrakcyjnej metody
        //bo bez nowej klasy

        //wyrażenie lambda: (argumenty) -> ciało;
        //wrażenie lambda: (argumenty) ->{ciało};
        Runnable action = () -> System.out.println("Hello");
        action.run();

        //cos przyjmuje nie zwraca nic
        Consumer<Long> longConsumer1 = (Long value) ->
                System.out.println("Hello from consumer1 = " + value);
        longConsumer1.accept(10L);
        Consumer<Long> longConsumer2 =
                //zamiast (Long value) -> (value)  bo Consumer<Long>
                (value) -> System.out.println("Hello from consumer2 = " + value);
        longConsumer2.accept(11L);
        //w przypadku jednego argumentu
        //można opuścić nawiasy
        Consumer<Long> longConsumer3 = value -> System.out.println("Hello from consumer3 = " + value);
        longConsumer3.accept(12L);

        //coś testuje
        //zwracamy to co zwraca wyrażenie po strzałce
        Predicate<String> stringRredicate1 = String::isEmpty; //s1 -> s1.isEmpty();

        boolean test1Result = stringRredicate1.test("Not Empty");
        System.out.println("test1Result = " + test1Result);
        Predicate<String> stringPredicate2 = String::isEmpty; //s1 -> s1.isEmpty();
        boolean test2Result = stringPredicate2.test("Not Empty");
        System.out.println("stringPredicate2 = " + test2Result);

        //coś generuje
        Supplier<Integer> integerSupplier = () -> 1;
        Integer integer = integerSupplier.get();
        System.out.println("integer = " + integer);

        //coś przyjmuje coś zwraca
        Function<String, Integer> function1 = String::length; //s1 -> s1.length();
        Integer abcLenght1 = function1.apply("abc");
        System.out.println("abcLenght1 = " + abcLenght1);
        Function<String, Integer> function2 = String::length; //value -> value.length();
        Integer abcLenght2 = function2.apply("abc");
        System.out.println("abcLenght2 = " + abcLenght2);


        //co gdy metoda przyjmuje więcej niż 1 argument
        BiPredicate<String, Integer> biPredicate =
                (String s, Integer i) -> s.length() > i;
        BiPredicate<String, Integer> biPredicate2 = (s, i) -> s.length() > i;


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        //policzy wszystko
        count(list, i -> true);
        //policzy parzyste
        count(list, i -> i % 2 == 0);
        //policzy nieparzyste
        count(list, i -> 2 != 0);
        //policzy nieparzyste większe od 3
        count(list, i -> i > 3 && i % 2 != 0);

        //method reference
        //"referencja do metody"
        //pozwala zapisać lamby krócej

        //np.test który sprawdza czy String jest pusty
        Predicate<String> isEmpty = String::isEmpty;
        //albo tak to jest to samo
        System.out.println("isEmpty = " + isEmpty.test("to jest string"));
        Predicate<String> isEmpty2 = String::isEmpty;
        System.out.println("isEmpty2 = " + isEmpty2);
        //zawołaj metodę isEmpty z klasy String
        //TO JEST METODA REFERENCYJNA!!! PONIŻEJ
        //jeśli na wejściu typu X wywołujemy tylko metodę Y
        //to możemy napisać X::Y
        Predicate<String> isEmpty3 = String::isEmpty;
        System.out.println(isEmpty3);

    }

    //chcemy policzyć, ile ementów z listy spełnia predicate
    private static void count(List<Integer> list, Predicate<Integer> test) {
        int matching = 0;

        for (Integer integer : list) {
            if (test.test(integer)) {
                ++matching;
            }
        }
    }
}
