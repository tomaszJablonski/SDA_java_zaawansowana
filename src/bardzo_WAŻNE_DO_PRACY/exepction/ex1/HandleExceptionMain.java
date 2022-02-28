package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

public class HandleExceptionMain {
    public static void main(String[] args) {
        execute();
    }

    //wyjątki się rzuca, wiec mozna je złapać
    //do łapania wyjątków służy : try{} lub try{}catch{} lub try{}catch{}finally{}
    //alternatywa: try, try-catch,try-catch-finally

    //try - pozwala wykonać "niebezpieczny" kawałek kodu
    //catch - pozwala łapać i obsłużyć wyjątek
    //finally - "sprząta" po metodzie

    //WAŻNE - catch trzeba od najbardziej szegółowych wyjątków do ogólnych
    public static void execute(){
        try {
            System.out.println("Wykonuje niebezpieczną operacje");
            bad();
            System.out.println("Wykonana z sukcesem");
        }catch (MyCustomUncheckedException exc) {
            System.out.println("Złapałem wyjątek ! ale działam (:");
            //obsłiuga NullPointerException
        }catch ( java.lang.NullPointerException exc){
            System.out.println("Złapałem nulla!");
            //obsługa ArrayIndesOutOfBoundException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exc){
            System.out.println("Złapałem coś dziwnego?");
        }
        //kiedy wykona się finally? (!) // Finally się zawsze WYKONA czy są wyjątki czy nie
        //kiedy będzie wyjątek
        //kiedy nie będzie wyjątku
        System.out.println("In finally");
    }

    private static void bad(){
        //throw new MyCustomUncheckedException("Something bad has happened");
        throw new java.lang.NullPointerException();
    }

}
