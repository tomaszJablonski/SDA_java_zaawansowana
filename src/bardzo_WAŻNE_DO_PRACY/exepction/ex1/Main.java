package bardzo_WAŻNE_DO_PRACY.exepction.ex1;


//Wyjątki to klasy
///te klasy muszą rozszerzać(dziedziczyć po jednym z instniejących wyjątków
//to po jakim wyjątku dziedziczy określa ich typ (checked/unchecked)
public class Main {
    public static void main(String[] args) {

        MyCustomUncheckedException uncheckedException = new MyCustomUncheckedException();
        MyCheckedException myCheckedException = new MyCheckedException();


    }
}