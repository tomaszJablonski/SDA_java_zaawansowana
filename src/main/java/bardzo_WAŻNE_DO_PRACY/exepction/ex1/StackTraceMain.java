package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

public class StackTraceMain {
    public static void main(String[] args) {
        foo();
        System.out.println("main");
    }

    private static void foo(){
        bar();
        System.out.println("foo");
    }

    private static void bar(){
        buzz();
        System.out.println("bar");
    }

    private static void buzz(){
        bad(); // jeśli metoda bad rzuci wyjątek to przerywamy TUTAJ
        //(nie wyposujemy na ekran) i rzucam wyjątek wyżej
        System.out.println("buzz");
    }

    //ta metoda rzuca wyjątek typu unchecked
    private static void bad(){
        throw new MyCustomUncheckedException();
    }
}
