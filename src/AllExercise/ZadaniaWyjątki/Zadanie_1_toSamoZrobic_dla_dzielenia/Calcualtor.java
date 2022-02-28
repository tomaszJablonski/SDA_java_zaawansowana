package AllExercise.ZadaniaWyjątki.Zadanie_1_toSamoZrobic_dla_dzielenia;
//TODO
//  1. Stwórz statyczną klasę Kalkulator, która będzie posiadała metody pozwalające dodawać, odejmować,
//  mnożyć i dzielić liczby całkowite.
//  done
//  2. Zmodyfikuj powstałą klasę tak, aby metody które dodają i mnożą mogły przyjmować więcej niż
//  dwa argumenty (wykorzystaj mechanizm varargs).
//  done
//  3. Upewnij się, że dodawnie i mnożenie przyjmują conajmniej 2 argumenty.
//  W przeciwnym razie wypisz odpowiedni komunikat i zwróć -1.
// done
//        4. Przeciąż metodę służącą do dodawania i odejmowania tak by akceptowała typ int i double.
          //prawie done
// TODO
//  5. Zmodyfikuj statyczny kalkulator tak, aby w przypadku dzielenia przez 0
//  był rzucany wyjątek typu unchecked - CannotDivideBy0Exception.
//  done
//  6. Dodaj własny wyjątek typu checked ZaMalaIloscArgumentow,
//  który będzie rzucany gdy metody add i multilpy otrzymają zbyt
//  małą ilość ilość argumentów. Jako wiadomość w wyjątku wypisz:
//  "Zbyt mała ilość argumentów. Wymagane X, podano: Y".
//        7. Obsłuż wyjątki - w przypadku dzielenia przez zero na
//        wyjścię błędów (System.err) wypisz odpowiedni komunikat;
//        w przypadku zbyt małej liczby argumentów wypisz
//        komunikat na zwykłe wyjście (System.out).
//     prawie done

public class Calcualtor {

    public static int plus(int...args) throws ZaMalaIloscArgumentow{
        if(args.length>1) {
            int suma = 0;
            for (int i = 0; i < args.length; i++) {
                suma += args[i];
            }
            return suma;
        }
        throw new ZaMalaIloscArgumentow(2,args.length) ;
    }

    public static double plus(double a, double b,double...args){
        return a+b;
    }

    public static int minus(int a,int b,int...args){
        return a-b;
    }

    public static double minus(double a, double b, double...args){
        return a - b;
    }

    public static int multiplication(int...args){
        int suma=1;
        for (int i =0;i<args.length;i++){
            suma*=args[i];
        }
        return suma;
    }

    public static int dividing(int a,int b){
        if(b==0){
            throw new CannotDivideBy0Exception();
        }
        return a/b;
    }

    }


