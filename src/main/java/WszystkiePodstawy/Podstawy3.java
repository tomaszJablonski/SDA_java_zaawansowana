package WszystkiePodstawy;

public class Podstawy3 {
    //Metody

    //void -nic nie zwracamy wykonuje zestaw operacji i koniec

    static void przywitajSie(String imie, String nazwisko) {
        System.out.println("Hello " + imie + nazwisko);
        return; //szybsze przerwanie działania metody z typem void
    }

    static void powiedzCzesc() {
        System.out.println("czesc");
    }

    static int potega2(int potega) {
        int wynik = 1;
        for (int i = 0; i < potega + 1; i++) {
            if (i == 0) {
                wynik = 1;
            } else {
                wynik = wynik * 2;
            }
        }
        return wynik;
    }

    static double potega2razy10(int potega) {
        return potega2(potega) * 10;
    }

    static int dodaj(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int wynikMetody = potega2(2);
        System.out.println(wynikMetody);
        System.out.println(potega2razy10(4));
        System.out.println(dodaj(5, 10));
//            przywitajSie("John ","C");
//            przywitajSie("Alicja ","B");
//            przywitajSie("Karol ","C");
//            przywitajSie("Róża ","C");
//            przywitajSie("Dominik ","k");

        //Zadanie
        // Napisać metody obliczające pole i obwod: kola, trojkata, prostokata
        // Napisać metode void, która informuje użytkownika o powyższych metodach

//        zadanie 8
//
//        String binarna = Integer.toBinaryString(3); //zamiana liczby na bity
//
//        if (binarna.length() < 4) {
//            int iloscZer = 4 - binarna.length();
//            for (int i =0; i < iloscZer;i++ ){
//                binarna = "0" + binarna;
//            }
//        }
//
//        System.out.println("Po: " + binarna);

        //Wyrażenia regularne - regular expresion

        //www.regex101.com

//        x - (o,inf)
//        + - (1,inf)
//        {n,m} -> (n,m)
//        {n,}  -> minimum n
//        {,m}  -> max m
//        {n}   -> dokladnie n

//        na przykład przy datach
//        DD-MM-YYYY

//        4litery-4cyfry-3litery-2cyfy-SN
//        AERF-2345-Asz-22-SN
//        [A-Za-z]{4}-[0-9]{4}-[A-Za-z]{3}-[0-9]{2}-SN

//        FV-[0-9]{4}-2021
//        FV-1234-2021
//
//        ID-1234-(alfabet od A do Z)
//        ID-1234-az
//        ID-[0-9]{4}-[a-z]{0,2}

        //odczytywanie patternu ze skanera

//        Scanner odczyt = new Scanner(System.in);
//        String x = odczyt.nextLine();
//
//        Pattern odczyt1 = Pattern.compile("FV-[0-9]{4}-2021");
//        Matcher bOdczyt1 = odczyt1.matcher(x);
//        bOdczyt1.matches();
//        System.out.println(bOdczyt1.matches());
//
//
//        Pattern p = Pattern.compile("[A-Za-z]{4}-[0-9]{4}-[A-Za-z]{3}-[0-9]{2}-SN"); //żeby wyrażenie regularne było zrozumiałe dla Javy
//          Matcher a = p.matcher("AAAA-1111-CCC-22-SN"); // sprawdza czy jest true czy false
//          a.matches();
//          System.out.println(a.matches());

//        Użytkownik podaje login i hasło
//                - Login składa się tylko z liter i nie posiada żadnych znaków specjalnych
//                - Hasło musi mieć conajmniej 12 znaków, posiadać cyfry i litery (w tym minimum jedną dużą)

        //login
//        Scanner loginOdczyt = new Scanner(System.in);
//
//        System.out.println("Podaj login");
//        String login1 = loginOdczyt.nextLine();
//        Pattern loginP = Pattern.compile("[A-Za-z]{5,}");
//        Matcher loginM = loginP.matcher(login1);
//        loginM.matches();
//        System.out.println(loginM.matches());
//
//        //hasło
//
//        Scanner hasłoOdczyt = new Scanner(System.in);
//        System.out.println("Podaj hasło");
//        String haslo = hasłoOdczyt.nextLine();
//        Pattern hasloP = Pattern.compile("[A-Za-z-0-9]{12,}");
//        Matcher hasloM = hasloP.matcher(haslo);
//        hasloM.matches();
//        System.out.println(hasloM.matches());

        //^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$

        //tablice

        //tablice jednowymiarowe

//        String[] arrayS = new String[10];
//        System.out.println(arrayS[0]);
//        int [] arrayI = new int[2];
//        double[] arrayD = new double[3];
//        char [] arrayC = new char[10];
//        System.out.println(arrayI[0]);
//        System.out.println((arrayD[0]));

//        String[] arrayN = new String[]{"Adam","Jakub"};
//        System.out.println(arrayN);
//
//        arrayN[1] ="Antoni"; //nadpisywanie
//        System.out.println(arrayN);
//
//        int size = 10;
//        String [] arrayQ = new String[size];
//        String [] arrayQ1 = new String[]{"Adam","Antoni","Mariusz","Agnieszka"};
//
//        for (int i = 0;i < arrayQ1.length; i++){
//            System.out.println(arrayQ1[i]);
//        }

//        Index  : 0 1 2 3 4 5 6
//        Wartosc: 1 2 4 8 16 32 64

//        Użytkownik podaje potęgę dwójki np. 5
//        W odpowiedzi dostanie tablicę potęgi 2 od 0 do 5
//        Przykładowo: podaje 5, a otrzymuje tablicę: 1,2,4,8,16,32

//        Scanner numberImpress = new Scanner(System.in);
//        System.out.println("Podaj liczbę");
//        int number = numberImpress.nextInt();
//        int [] arrayImpress = new int[number+1];
//
//        for (int i = 0;i < number+1; i++) {
//            if (i == 0) {
//                arrayImpress[i] = 1;
//            } else {
//                arrayImpress[i] = arrayImpress[i - 1] * 2;
//            }
//            System.out.println(arrayImpress[i]);
//
//        }

//        Mamy koszyk 10 elementowy.
//    Użytkownik ma 4 opcje: dodaj, usuń, zamień, wyswietl
//        -- Jeżeli dodaj
//            Podajemy nazwę produktu i wrzucamy go na pozycję, gdzie jest null
//            Jeżeli wszystkie 10 slotów jest zajęte -> otrzymujemy komunikat
//        -- Jezeli usun
//            Podajemy index, i jezeli usuwamy to zamieniamy na null
//                inaczej odpowiedni komunikat
//        -- jezeli modyfikuj
//                zamien obiekt pod podanym indeksem na nowy ktory rowniez podaje uzytkownik
//        -- jezeli wyswietl
//            wyswietl wszystkie pozycje w liscie
//
//    Dziala to wszystkow w petli dopoki uzytkownik nie poda informacji koniec

//        int rozmiar = 2;
//
//        String[] koszyk = new String[rozmiar];
//        String opcje = "dodaj | usun | modyfikuj | wyswietl | koniec";
//        boolean isRunning = true;
//
//        while (isRunning) {
//            Scanner odczyt = new Scanner(System.in);
//            System.out.println("Dostępne opcje: " + opcje);
//            System.out.print("Podaj opcje: ");
//            String wybranaOpcja = odczyt.nextLine();
//
//            switch (wybranaOpcja) {
//                case "dodaj":
//                    boolean czyBezZmian = true;
//                    // Opcja dodaj
//                    System.out.print("Podaj produkt: ");
//                    String produkt = odczyt.nextLine();
//
//                    for (int i = 0; i < rozmiar; i++) {
//                        if (koszyk[i] == null) {
//                            koszyk[i] = produkt;
//                            czyBezZmian = false;
//                            break;
//                        }
//                    }
//                    if (czyBezZmian) {
//                        System.out.println("Koszyk jest pełny");
//                    }
//                    break;
//
//                case "usun":
//                    boolean usun = false;
//                    for (int i = 0; i < koszyk.length; i++) {
//                        System.out.println(koszyk[i]);
//                    }
//                    System.out.print("Podaj jaki produkt chcesz usunąć: ");
//                    String produktDelete = odczyt.nextLine();
//
//                    for (int i = 0; i < rozmiar; i++) {
//                        if (koszyk[i] != null) {
//                            koszyk[i] = produktDelete;
//                            koszyk[i] = null;
//                            usun = true;
//                        } else if (koszyk[i] != produktDelete) {
//                            System.out.println("Nie ma takiego produkut na liście");
//
//                        }
//                        if (usun) {
//                            System.out.println("Element usunięty z koszyka");
//                            break;
//                        }
//
//
//                    }
//                    break;
//
//                case "modyfikuj":
//                    boolean changeProduct = false;
//                    System.out.println("Jaki element w koszyku chcesz modyfikować ? ");
//                    String toChangeP = odczyt.nextLine();
//                    System.out.println("Na jakie produkt chcesz zamienić?");
//                    String afterChangeP = odczyt.nextLine();
//                    for (int i = 0; i < rozmiar; i++) {
//                        if (koszyk[i] != null) {
//                            koszyk[i] = afterChangeP;
//                            changeProduct = true;
//                        } else if (koszyk[i] != toChangeP) {
//                            System.out.println("Nie ma takiego produkut na liście");
//                        }
//                        if (changeProduct) {
//                            System.out.println("Element został zamieniony");
//                            break;
//                        }
//                    }
//                    break;
//                case "wyswietl":
//                    for (int i = 0; i < koszyk.length; i++) {
//                        System.out.println(koszyk[i]);
//                    }
//                    break;
//
//                case "koniec":
//                    isRunning = false;
//                    break;


        //tablice wielowymairowe
//        int liczba_wierszy = 2, liczba_kolumn = 2;
//
//        int [][] matrix = new int[liczba_wierszy][liczba_kolumn];
//
//        matrix [0][0] = 10;
//        matrix [0][1] = 20;
//
//        System.out.println(matrix[0][1]);

        //tablica 3 wierszy i 4 kolumny
        //inforamcje x i y
        //wykonać souta

//        int [][] tablica = new int[3][4];
//        tablica [0] = new int[]{1,2,3};
//        tablica [1] = new int[]{4,5,6,7};
//        System.out.println(tablica[0][2]);
//        System.out.println(tablica[1][3]);

        //napisać kółko i krzyżyk - dodatkowe !!!!


//        //Zadanie Napisać tabelę, która posiada kolumny
//        0 - Imię
//        1-  Nazwisko
//        2 - Miasto
//
//        napisać aplikację która pozwala wprowadzić dane n użytkownika
//        na koniec wyświetl kompletną tablice

        //początek pętli - tutaj użytkownik podaje libczę wierszy

//        int liczba_wierszy=1
//
//        Scanner scan =  new Scanner(System.in);
//        int size_wiesze=2, size_kolumny=2;
//        String [][] tablica = new String[size_wiesze][size_kolumny];
//        System.out.println("Podaj imię");
//        tablica[0][0] = info.nextLine();
//        System.out.print("Podaj nazwisko: ");
//        tablica[0][1] = info.nextLine();
//        System.out.print("Podaj miasto: ");
//        tablica[0][2] = info.nextLine();
//
//        System.out.println(tablica[0][0] + " | " + tablica[0][1] + " | " + tablica[0][2]);

        //koniec pętli


//        tablica [0] = new String[][]{"Imię","Nazwisko","Miasto"};
//        tablica [1] = new String[][]{};
//
//        for (int i = 0; i < size_wiesze; i++) {
//
//
//        }


    }


}
