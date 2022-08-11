package WszystkiePodstawy;

public class Podstawy1 {

    static int globalny = 345;

    public static void main(String[] args) {

        //Podstawowy sposób deklaracji zmiennej
        //int - liczba całkowita 2^32
        //short oraz long - krótki 2^16 i  długi int 2^64
        //float (około 8  miejsc) , double (do 15) - liczby zmienno przecinkowe
        //boolean - prawda/fałsz
        //String - łańcuch znaków / tekst
        //char - znak


        //jawne deklaracje zmiennych

        int x = 120;
        long l = 250L;
        double y = 120.75d;
        float f = 12.5f;

        char c = '!';

        System.out.println("Sumowanie" + c + " " + x * f + c);
        System.out.println("Sumowanie 2" + " " + c);
        System.out.println(y + c);


        System.out.println("Hello World");
        System.out.println(x);
        System.out.println(l);
        System.out.println(y);
        System.out.println(f);

        System.out.println("Wartość x to: " + x);  //konkatenacja - połączenie tekstu ze zmienną

        String text = "Ala ma kota.";
        System.out.println(text);

        //akcestor Final
        final double PI; //zadeklarować zmienną można tylko raz
        PI = 230;
        System.out.println(PI);

        System.out.println(globalny);

        // a = 10 b= 20 Zamień wartości a i b miejscami

        int a = 10, b = 20;
        System.out.println("a= " + a + " b= " + b);
        int tmp = a;
        System.out.println("a= " + a + " b= " + b + " tmp= " + a);
        a = b;
        System.out.println("a= " + a + " b= " + b + " tmp= " + a);
        b = tmp;
        System.out.println("a= " + a + " b= " + b + " tmp= " + a);


        //operatory przypisania i arytmetyczne
        int z = 100;

        //I opcja
        z = z + 100;
        System.out.println("I opcja  " + z);
        //II opcja
        z += 100;
        System.out.println("II opcja " + z);

        //modulo - reszta z dzielenia

        int p = 10;
        double o = 4.5d;
        o %= 2;
        System.out.println(o);

        //inkrementacja ++ | dekrementacja --

        int i = 10;
        //post - najpierw wyświetla wartość a potem ją modyfikuje
        System.out.println(i++);
        System.out.println(i);
        //Pre - od razu wyświetla zwiększoną wartość
        i = 10;
        System.out.println(++i);
//        i++; ++i;
//        i--; --i;

//        x % 2 =1  to wiemy, że liczba jest nieparzysta

        //Równe == | Nie równe !=
        // < > >= <=
        System.out.println("Boolean");
        boolean arg1 = true;
        boolean arg2 = false;
        boolean arg3 = true;

        System.out.println("arg1 && arg2 && arg3");
        //arg1 && arg2 && arg3
        System.out.println(arg1 && arg2 || arg3);
        System.out.println("(arg1 && arg2) && arg3");
        //(arg1 && arg2) && arg3
        System.out.println((arg1 && arg2) || arg3);

        System.out.println(arg1 == arg2);
        System.out.println(arg1 != arg2);

        System.out.println("Porównywanie");
        int z1 = 20;
        int z2 = 20;

        System.out.println(z1 >= z2);

        //Koniunkcja - && jeden i drugi muszą być prawdzwie wszystkie boolean muszą być true i będzie true
        System.out.println(arg1 && arg2);

        //Alternatywa || albo potrzebuje tego lub tego - jedne z nich musi zostać spełniony żeby było true
        System.out.println(arg1 || arg2);

        //Negacja - !() nieprawada że jeżeli był true zamień go na false i na odwrót
        System.out.println(!(arg1 || arg2));

        //x1 > 20 i czy jest parzysty ? // == vxu jest równy

        int x1 = 33;
        System.out.println((x1 > 20) && (x1 % 2 == 0));

        //konwersja zmiennej

        int i10 = 10;
        float f10 = i10;
        System.out.println(i10);
        //short s10=i10; tak się nie da
        long l10 = i10;
        System.out.println(l10);

        //wszystkie typy numeryczne można konwertować do double
        //char można skonweetować do int (do mniejszego się nie da)

        double wynik = f10 + i10;
        System.out.println(wynik);

        //casting czyli rzutwanie zmiana większej zmiennej na mniejszą
        //ucina końcówki nie zaokrągla
        System.out.println("Rzutowanie");
        double d2 = 120.55d;
        int i2 = (int) d2;
        System.out.println(i2);

        System.out.println("int na byte");
        int in = 123456789;
        byte b2 = (byte) in;
        System.out.println(b2);
        //wyszło 21 ponieważ zostało pobrane ostatnie 8 bitów intigera

        // intruckja if zawsze ją budować o to co nas interesuje        System.out.println("Instruckja IF");
        //dodawać else tylk jeżeli jest to konieczne
        int w1 = 10;

        if (w1 % 2 == 0) {
            System.out.println("Liczba jest parzysta");
            w1 -= 100;
            System.out.println("Nasza wartość pomniejszona o 100 = " + w1);
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        //jeżeli wartość x> 100 i jest parzysta to pomnóż x przez 3
        //w innym wypadku podaj resztę z dzielenia oraz podziel przez 10

        System.out.println("ćwiczenie");
        int lib1 = 110;

        if (lib1 > 100 && lib1 % 2 == 0) {
            System.out.println("Wynik Liczba parzysta = " + lib1 * 3);
        } else {
            System.out.println("Reszta z dzielenia to  = ");
            System.out.println(lib1 % 2);
            System.out.println(lib1 / 10);
        }

        System.out.println("Kolejny IF");
        float percent = 10000f;

        if (percent > 100) {
            System.out.println("Błędna wartość powyżej 100");
        } else if (percent < 0) {
            System.out.println("Błędna wartość poniżej 0");
        }

        System.out.println("Kolejny if percent w ifie ");

        if (percent > 50) {
            if (percent % 2 == 0) {

            }

        }

        // Mamy trzy liczby q=10,w=20,e=30
        //interesuje mnie komuniakt która licza jest największa (1 część)
        //weryfikuj czy wartości są równe

        int q = 50;
        int w = 500;
        int e = 10000;
        System.out.println("q = " + q);
        System.out.println("w = " + w);
        System.out.println("e = " + e);

        if (q > w && q > e) {
            System.out.println("Q jest największe");
        } else if (w > e && w > q) {
            System.out.println("W jest największe");
        } else if (e > q && e > w) {
            System.out.println("e jest największe");
        }

        //albo tak
        if (e >= w && e >= q) {

            if (e == w && e == q) {
                System.out.println("Wszystkie są równe.");
            } else if (e == q) {
                System.out.println("e i q są największe.");
            } else if (e == w) {
                System.out.println("e i w są największe.");
            } else {
                System.out.println("e jest największe.");
            }
        } else if (w >= q) {
            if (w == q) {
                System.out.println("w i q są największe");
            } else {
                System.out.println("w jest największe.");
            }
        } else {
            System.out.println("q jest największe.");
        }


        int a1 = 10, a2 = 10;

        if (a1 == a2) {
            System.out.println("Wartości są równe");
        } else {
            System.out.println("Wartości nie są równe");
        }

        //a i b typ float oraz string opcja
        //mamy dodatkową zmienną typu double o nazwie wynik
        //jeżeli opcja dodaj a+b
        //jezeli odejmij a-b
        //a*b
        //wyświetl wynik na końcu

        String opcje = "Odejmowanie ";
        float n = 15f;
        float m = 5f;
        System.out.println("Wartość n = " + n);
        System.out.println("Wartość m = " + m);

        double wynik123;
        boolean exe = true;

        switch (opcje) {
            case "Dodawanie":
                wynik123 = n + m;
                System.out.println("Wykonam operacje dodawania = " + wynik123);
                break;
            case "Odejmowanie ":
                wynik123 = n - m;
                System.out.println("Wykonam operacje odejmowania =" + wynik123);
                break;
            case "Mnożenie":
                wynik123 = n * m;
                System.out.println("Wykonam operacje mnożenia = " + wynik123);
                break;
            default:
                System.out.println("Nie rozpoznano opcji ");
                wynik123 = 0;
                exe = false;
                break;
        }


    }
}
