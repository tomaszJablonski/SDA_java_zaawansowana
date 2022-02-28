package bardzo_WAŻNE_DO_PRACY.INTERFEJS_WAŻNE.example1;

//definiuje zachowanie czegoś np. drukarki, może drukować rzeczy
// co coś robi a w klasach jak to zrobić

//interfejs się IMPLEMENTUJE w Klasash
//interefsy mają tylko* Klasy abstrakcyjne
//* od javy 8 mogą mieś domyślne implementacje


//podobnie jak klasy ->interfejs = typ danych

// NIE MOŻE mieć pól i konstruktorów

//domyślnie wszystkie metody są public

// może mieć stałe (zmienne typu static)

//może mieć statyczne metody

//jeden interfejs może rozszerzać jeden bądź wiele innych interefjsów

public interface Interfaces extends InterfaceExample2,InterfejsExample3 {
    //nie posida pol, a wszsytkie "pola" są public static final
    static final double PI = 3.14;

    static void hello(){
        System.out.println("Hello");
    }

    //metody abstrakcyjne = bez implementacji
    void shoutHello();
    String getName();
    void validateNumber(int number);
    String cinvertToString(Object object);

    //od java 8 mogą mieć domyślną implementację
    //Zaczynamy od słowa `default`

    default int add (int a1, int a2) {
        return a1 + a2;
    }




}
