package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

//wyjątek typu unchecked
//rozszerzyć klase RuntimeException lub jakiegos jej potomka
//zazwyczaj to RuntimeException (>90%)
//własną wewnętrzną firmową struktura

//Wyjątek to KLASA, może mieć pola,
// constructory, metody,implementować interfejsy
public class MyCustomUncheckedException extends RuntimeException {

    public static void main(String[] args) {

    }
    public MyCustomUncheckedException() {
    }

    public MyCustomUncheckedException(String message) {
        super(message);
    }
}


