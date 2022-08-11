package WszystkiePodstawy.Podstawy5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //var args

    static int dzialanie(String options, int... numbers) {
        int wynik = 0;
        if (options.equals("dodawaj")) {
            for (int l : numbers) {
                wynik = wynik + 1;
            }
        } else if (options.equals("odejmuj")) {
            for (int l : numbers) {
                wynik = wynik - 1;
            }
            wynik = wynik + numbers[0] * 2;
        } else {
            System.out.println("Nie obsługiwane polecenie");
        }
        return wynik;
    }


    static void sayToPeople(String word, String... people) {
        //Scanner scan = new Scanner(System.in); można użyć w pętli while
        System.out.println("Nasze słowo" + word);
//        for (int i=0; i<people.length;i++) - dla każdej tablicy, to samo co to poniżej
        for (String s : people) {
            System.out.println(word + "," + s);
        }
    }

    // !TODO Utworzyć metodę dodajFakture()
    // !INFO Metoda typu void
    // Prosi od użytkownika o informację o Koszt, netto, etc..
    // Jeżeli któraś z informacji jest nieprawidłowa
    // -> poproś o tą informację jeszcze raz.
    // Jeżeli wszystko jest prawidłowe -> utwórz fakturę i wykonaj metodę zapiszFakture

    static boolean sprawdzID(String ID) {
        Pattern wzorID = Pattern.compile("FW-(W|P)-[0-9]{4}-2021");
        Matcher naszeID = wzorID.matcher(ID);
        return naszeID.matches();
    }

    static double sprawdzVAT(double VAT) {
        while (VAT < 0.0) {
            System.out.println("VAT nieprawidłowy. Podaj ponownie: ");
            //tutaj zmienić VAT
        }
        if (VAT > 0.0) {
            return VAT;
        }

        return VAT;
    }

    static void dodajFakture() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ID: ");
        String ID = scan.nextLine();

        while (!sprawdzID(ID)) {
            System.out.print("ID nieprawidłowe. Podaj ponownie: ");
            ID = scan.nextLine();
        }

        System.out.println("Podaj opis produktów: ");
        String opis = scan.nextLine();

        System.out.println("Podaj Vat: ");
        double VAT = scan.nextDouble();
        scan.nextLine();
        sprawdzVAT(VAT);


//        f1.setID("FW-[0-9]{4}-2021");
//        f1.setKwotaNetto(100);
//        f1.setVAT(23);
//        f1.setNIP("3-2-2-3");
//        f1.setOpis("Usługi szkoleniowe");
    }

    // !TODO Utworz metodę zapiszFakture
    // Metoda zapisuje fakture do tablicy,
    // Jezeli tablica nie ma miejsc wolnych -> zwraca komunikat.

    public static void main(String[] args) {

        //Klasa w klasie

        MyOtcherClass moc = new MyOtcherClass();
        MyOtcherClass.MyInnerClass mic1 = moc.init(); //zagnieżdżenie klasy InnerClass w OuterClass
        // ==
        MyOtcherClass.MyInnerClass mic2 = moc.new MyInnerClass();

        //static ma jedno konkretne miejsce w pamięci i jest unikatowe ,dokładnie jedną jednyną klase


        //Data i czas - prawidłowe metody !!!

        //czas

        LocalTime aktualnyCzas = LocalTime.now().withSecond(0).withNano(0).withMinute(0).plusHours(1); //HH:MM:SS.nnnnnnnnn
        int godzina = LocalTime.now().getHour();
        System.out.println(aktualnyCzas);
        System.out.println(godzina);

        //Data

        LocalDate aktualnaData = LocalDate.now();
        System.out.println(aktualnaData); // YYYY-MM-DD Standard ISO
        LocalDate mojaData = LocalDate.of(2020, Month.DECEMBER, 12); //stwarzanie własnej daty
        System.out.println(mojaData);
        String formattedDate = LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" +
                LocalDate.now().getYear();
        System.out.println(formattedDate);

        //Data plus czas

        LocalDateTime lokalnyCzasiDzień = LocalDateTime.now();
        System.out.println(lokalnyCzasiDzień);

        //Epoch time -
        //Epoch time start: 1 stycznia 1970 00:00:00  ile czasu minęło od tego moemntu do teraz

        //formatowanie

        LocalDate data = LocalDate.now();
        String dataString = data.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dataString);

        //varargs - metody o zmiennej liczbie argumentów

        sayToPeople("Hello!", "Ala", "kot", "Pies");
        sayToPeople("Hello", "Adam");
        sayToPeople("Hello", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam", "Adam");

        //Zadanie
        //Użytkownik podaje String -> dodawaj / odejmij oraz dwoloną ilość int
        //Program zawraca sumę lub różnicę podanych integerów
        //Jeżeli użytkownik poda String inny niż powyższy -> błąd

        System.out.println(dzialanie("dodawaj", 3, 4, 5));
        System.out.println(dzialanie("odejmuj", 3, 4));
        System.out.println(dzialanie("mnoz", 3, 2));

        //Zadanie
        //Etap 1
        //Program do obsługi fakury
        // /*
        // -z ID w postaci:FV-W/P-numer-2021
        // - nip
        //-kwota netto
        // - opisu ( nazwa pozycji) // może mieć tylko jedną pozycjie
        // -VAT
        // - Czy jest koszt? (True/False)
        // */

        //!TODO weryfikacja ID faktury
        //!TODO menu sprawdzenia faktury

        dodajFakture();


////        Faktura f1 = new Faktura( );
//        f1.setCzykoszt(false);
//        f1.setID("FW-[0-9]{4}-2021");
//        f1.setKwotaNetto(100);
//        f1.setVAT(23);
//        f1.setNIP("3-2-2-3");
//        f1.setOpis("Usługi szkoleniowe");
//
//        System.out.println(f1.obliczBrutto());
//        System.out.println(f1);


    }
}
