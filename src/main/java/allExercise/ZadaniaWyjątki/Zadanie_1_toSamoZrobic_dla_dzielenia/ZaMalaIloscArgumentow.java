package allExercise.ZadaniaWyjątki.Zadanie_1_toSamoZrobic_dla_dzielenia;

public class ZaMalaIloscArgumentow extends Exception{



    public ZaMalaIloscArgumentow(int a,int b)  {
        super("Zbyt mała ilość argumentów. Wymagane a" + a + "podano: b" + b);

    }
}
