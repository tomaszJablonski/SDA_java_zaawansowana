package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

//Checked vs unchecked
//które są popularniejsze?
//unchecked to teraz główmy typ wyjątku
//od wyjątków checked się odchodzi
public class ThrowCheckedException {
    public static void main(String[] args) throws MyCheckedException{
        bad();

    }
   //rzuca wyjątek typu checked
    // throw - rzucamy
    //wyjątki checked trzeba obsłużyć lub zadeklarować jako rzucane

    //deklaracja rzucania to throws NazwaKlasyWyjątku w metodzie(sygnatrzue)
    //checked exception WYMUSZA żeby coś zrobić z tym wyjątkiem
    private static void bad() throws MyCheckedException{
        MyCheckedException checkedException = new MyCheckedException();
        throw checkedException;
    }
}
