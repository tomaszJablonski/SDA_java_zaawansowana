package WszystkiePodstawy;

public class Podstawy2 {

    public static void main(String[] args) {

//        int reszta = 10 % 2; //reszta pokazuje w switchu jaka jest reszta
//        String komunikat;
//
//        switch (reszta) {
//            case 0:
//                komunikat = "Reszta wynosi 0";
//            case 1:
//                komunikat = "Reszta wynosi 1";
//            case 2:
//                komunikat = "Reszta wynosi 2";
//            default:
//                komunikat = "Reszta powyżej 2";
//        }
//        System.out.println(komunikat);

//        int x=0;
//
//        for(int i = 0; i<10; i++){
//            System.out.println("Wartość licznika: " + i );
//        }
//
//        for(int i= 20; i>=10; i=i-2){
//            x = x + 1;
//            System.out.println("Wartość licznika: " + i);
//        }
//        System.out.println(x);

        //napisać program który będzie wyświetlał kolejne potęgi 2
        //od potęgi 0 do 10

//        int potega = 1;
//
//        for (int i=0; i<=10;i++) {
//
//            if (i !=0) {
//                potega *=2;
//            }
//
//
//            System.out.println("Potęga  "+ i + " wynosi " + potega);
//
//        }

        // napisać pętle która wyświetli tylko liczby parzystę od 0 do 50
//
//        for (int i =0; i<=50;i=i+2){
//            System.out.println(i);
//        }


        // napisać pętle która wyświetli komunikat 20 -0
        //reszta z dzielenia liczy i to ...
        //(ten komunikat wyświetlamy jedynie kiedy reszta wynosi 2 lub 3


//        for (int i = 20; i >= 0; i--) {
//
//            int reszta = i % 3;
//
//            if(reszta==2 || reszta==3) {
//                System.out.println("Liczba: " + i + " Reszta wynosi 2 lub 3 = " + reszta );
//
//            }
//
//
//            }

//        int x=0;
//
//        while (x<10) {
//            System.out.println(x);
//            x++;
//        }
        // napisać pętle która wyświetli tylko liczby parzystę od 0 do 50
//
//        int z=-2;
//
//        while (z<50){
//            z=z+2;
//            System.out.println(z);
//        }

        // a=100 | suma = 0
        // w pętli while a jest pomniejszane o 5
        // natomiast suma rośnie o aktulaną wartość  a % 6
        //Pętla while działa dopuki a >=50 lub suma jest  <=50
//
//        int a =100;
//        int suma= 0;
//
//        while (a >=50 || suma <=50){
//            suma +=a%6;
//            a -=5;
//            System.out.println("a " + a + " suma " + suma);
//
//            if (a<=-20){
//            break;
//            }
//        }
//
////

//        }

//        int i = 10;
//        //to co jest w pętli do wykona się przynajmniej raz
//        // nawet jeżeli warunek nie jest spełniony
//        do {
//            System.out.println(i + "  Hello World");
//            ++i;
//        } while (i<10);

        //można również stosować break; przerwanie działania pętli

//        for(int i=0; i <10; i ++) {
//            System.out.println("Hello worlld = " + i );
//            if (i==8) {
//                continue; // przeskakujemy do początku pentli
//            }
//
//            System.out.println("ABCD = " +i) ;
        //}


        //Klasy i obiekty: String, MojObiekt
        //zmienne mojaZmienna, wartoscX, x
        //STALE: PI_NUMBER np. final double PI_NUMBER = 3.14;

        // I opcja literał
//        String t1 = "Ala ma kota";
//        String t2 = "Mirosław ma kota";
//
//        //II opcja - konstruktor
//        String nt = new String ("Ala ma kota");
//
//
//        System.out.println(t1);
//        String t3= t1 + t2;
//        System.out.println(t3);
//        t1 += t2;
//        System.out.println(t1);
//
//
//        String s1="SDA";
//        String s2="SDA";
//        String s3= new String("SDA");
//        //String s3= s2;
//        String s4=s1;
//        s4 +="Java";
//        System.out.println(s4);
//
//        //Porównywanie Stringów
//        System.out.println(s1 == s2); //true
//        System.out.println(s1 == s3); //false
//
//        // equals służy do porównywania wartości stringów
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1.equals(s3)); //true

//        String text = "Ala ma kota.";
//        //lenght() - zwraca długość tekstu.
//        //toUpperCase() oraz toLowerCase() - zamienia na same duże/małe litery
//        //indexOf("tekst") - zwracapozycję pierwszego! wystpąienia tekst w Strignu
//
//        System.out.println(text.length());
//        System.out.println(text.toUpperCase(Locale.ROOT));
//        System.out.println(text.toLowerCase(Locale.ROOT));
//        System.out.println(text.indexOf("z")); //pokazuje ile jest danych liter w ciągu licząc od 0 nie od 1
        //albo pokazuje na -1 jak brakuje litery

        //ZADANIE
        //Pierwszy krok

        //weryfikcja czy teskt zawiera minimum 15 znaków lenght>=15
        //jeżeli tak ->teskt prawidłowy
        //jeżeli nie -> Error! Mniej niż 15 znaków

        //Jeżeli lenght >=15
        //to sprawdź czy teskt zawiera "!" oraz "."
        //jezeli tak tekst prawidłowy
        //inaczej - tekst nie zawiera wykrzyknika i/lub kropki
        //indexOf(znak) == -1 brak znaku w tekscie

//        String text1= "Ala ma kota i bociana.";
//        if (text1.length() >= 15){
//            if (text1.indexOf("!") == -1 || text1.indexOf(".") == -1)  {
//                System.out.println("Tekst nie zawiera kropki i/lub wykrzyknika");
//            } else {
//                System.out.println("Teskt jest prawidłowy ");
//            }
//        } else {
//            System.out.println("Error! Napis ma mniej niż 15 znaków");
//        }
//
//        String joke = "hahahahahahahaha";
//        System.out.println(joke);
//        //replaceall("stary_do_podmiany, "nowy_znak"); działa na łańcuchach znaków
//        System.out.println(joke.replaceAll("a", "o"));
//
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj inforamcje: ");
//        String textL = scan.nextLine();
//        System.out.println("Podany tekst: " + textL);

//        Scanner scan = new Scanner(System.in);
//        scan.useLocale(Locale.US); // Pozwoli używać "." zamiast ","
//        System.out.print("Podaj A: ");
//        double zmiennaA = scan.nextDouble();
//
//        System.out.print("Podaj B: ");
//        double zmiennaB = scan.nextDouble();
//
//        System.out.println("A= " + zmiennaA + " B= "+ zmiennaB);

//        Scanner scan = new Scanner(System.in);
//        //scan.useLocale(Locale.US); // Pozwoli używać "." zamiast ","
//        System.out.print("Podaj wiek: ");
//        int zmiennaA = scan.nextInt();
//        scan.nextLine(); // jeżeli pobieramy w kolejności liczba tekst
//        System.out.print("Podaj imię: ");
//        String zmiennaB = scan.next();
//
//        System.out.println("Wiek = " + zmiennaA + " Imię = "+ zmiennaB);


        //Użytkownik podaje swoje imię a następnie dostaje komunikat
        //Witaj Karol

//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Witaj. Podaj swoje imię :) ");
//        String imie = scan1.nextLine();
//        System.out.println("Witaj " + imie);

        //Na początku użytkownik podaje sumę PLN np.380,30
        //Nastepnie podaje walutę: USD albo Euro
        //Program w odpowiedzi podaje ile EUR lub USD
        //Program konwertuje podane PLN  -> Wybraną walutę
        //Euro = 4.60 USD=3.95
        //Jeżęli użytkownik poda coś innego otrzyma odpowiedni
        //kominukat.
        //String odpowiedzialny za walutę (EUR/USD) zawsze musi być
        //napisany z dużych liter

//        final float EUR = 4.60f;
//        final float USD = 3.95f;
//        Scanner scanwal = new Scanner(System.in);
//        Scanner scanrodzaj = new Scanner(System.in);
//        System.out.println("Witaj w przeliczniku waluty PLN na USD/EUR");
//        System.out.println("Podaj ilość jaką chcesz przerobić");
//        float liczba = scanwal.nextFloat();
//
//        scanwal.nextLine();
//
//        System.out.println("Podaj na jaką walutę chcesz przekonwertować?");
//        String rodzaj = scanrodzaj.nextLine();
//        switch (rodzaj.toUpperCase()) {
//            case "EUR":
//                System.out.printf("PLN --> EUR %.2f", liczba/EUR );
//
//            break;
//
//            case "USD":
//                System.out.printf("PLN --> USD %.2f" , liczba/USD);
//            break;
//
//            default:
//                System.out.println("To co podałeś to nie jest liczba");
//            break;
//
//        }
////
//        double dokladna = 345.456456456d;
//        System.out.printf("Moja liczba to: %5.2f | %5.4f \n",dokladna, dokladna); //5 cyfr i 2 miejsca po przecinku
//        System.out.println(dokladna);
//
//        //%[flaga][rozmiar][.precyzja]
//
//        String ala = "ala";
//        System.out.printf("%15s",ala);
//        char c = "A";
//        System.out.println("%3c",c);
//
//


    }


}


