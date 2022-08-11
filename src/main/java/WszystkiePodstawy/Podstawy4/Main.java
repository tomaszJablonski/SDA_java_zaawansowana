package WszystkiePodstawy.Podstawy4;
//pakiet


import com.javapodstawy3.books.Book;
import com.javapodstawy3.sclass.Zewn;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
//Metody

    static double poleKola(double r) {
        final double PI = 3.14;
        return PI * (r * r);
    }

    static double objetoscWalca(double h, double w) {
        return poleKola(w) * h;
    }
//nic nie zwraca i nie można przypisać jej do żadnej zmiennej

    static void wyswietlMenu() {
        System.out.println("Witam!");
        System.out.println("To jest proste menu");
        System.out.println("Witaj");
    }

    static void czyParzysta(int number) {
        if (number % 2 == 0) {
            return;
        }
        System.out.println("Nieparzysta");
    }
// Napisać metodę, która oblicza silnię (i ją zwraca), gdzie argument n -> jaka silnia mnie interesuje
// silnia(3) -> zwraca wynik 3!

// Metoda tworzy ciąg liczb parzystych od n do m (n i m to argumenty metody)
// ciag(2,10) -> [2,4,6,8,10]

    static int silnia() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe z której ma być obliczona silnia");
        int a = scan.nextInt();
        int wynik = 1;

        for (int i = 1; i <= a; i++) {
            wynik = wynik * i;
        }
        //sout wypisywać w mainie lepiej
//        if (a > 0) {
//            System.out.println("Wynik silni dla " + a + " to " );
//        } else if (a == 0) {
//            System.out.println("Silnia wynosi =" + " 1! ");
//        } else {
//            System.out.println("Liczba nie może być ujemna");
//        }
        return wynik;
    }

    static int[] ciagLiczbMax(int min, int max) {
        //8,10,12,14,16,18,20
        int rozmiar = ((max - min) / 2) + 1;
        int[] tablica = new int[rozmiar];

        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = min + (2 * i);
        }
        return tablica;
    }


    public static void main(String[] args) {

//        wyswietlMenu();
//        double W1 = objetoscWalca(10.25,3.21);
//        System.out.println(W1);
//        double W2 = objetoscWalca(11.5,4.8);
//        System.out.println(W2);
//        System.out.println(silnia());
//
//        int [] t = ciagLiczbMax(6,12);
//        for (int i =0;i < t.length;i++){
//            System.out.println(t[i]);
//        }

//        Car c1 = new Car("fiat","zielony" );
//        c1.setMarka("Porshe");
//        c1.setKolor("Yellow");
//        System.out.println("Kolor " + c1.getKolor() + "Marka " + c1.getMarka());
//        c1.wyswietlParametry();
//        Car c2 = new Car("mercedes","czarny");
//        c2.setMarka("Golf");
//        c2.setKolor("Rdzawy");
//        System.out.println("Kolor " + c2.getKolor() + "Marka " + c2.getMarka());

        int[] tOcen = new int[]{3, 4, 0, 5, 3, 1};
        Student person1 = new Student("Tomasz", "Jablonski", 34567, true, tOcen);
        //Student - klasa  person1 - obiekt na podstawie klasy
        System.out.println(person1);
        person1.showMaxOceny();
        person1.dodajocene(5);
        System.out.println(person1);

        //pakiety
        Book b1 = new Book();
        Book b2 = new com.javapodstawy3.books.Book();
        System.out.println(PI);


//            MAIN -> (Books + protected Author)
//            private String tytul;
//            private int Pages;
//            private Autohor autohor;

        Zewn z1 = new Zewn();
        Zewn.Wewn w1 = Zewn.init();
        z1.wyswietlNumer();

        //scanner w kalasach
        Scanner odczytStudent = new Scanner(System.in);
        Student s2 = new Student(odczytStudent);
        System.out.println(s2);


    }
}
