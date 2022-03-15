package wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility;

//Odpowiedzialność łańcuchowa
public class Main {
    public static void main(String[] args) {


        Handler handler1 = new DeliveryHandler();
        Handler handler2 = new PaymentHandler();


        handler2.setNext(handler1);

        handler2.handle();

    }
}
