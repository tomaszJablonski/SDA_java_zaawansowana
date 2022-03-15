package wzorceProjektowe.wzroceStrukturalne.bridge;

//Bridge
//Podział jednej wielkiej klasy na dwie mniejsze
//i wtedy jedna kożysta z drugiej ale obie są niezależnie
//i modyfikacja jednej nie wpływa bezpośrednio na drugą


public class Main {
    public static void main(String[] args) {

        Drink drink = new CoffeePurchase().buy(5.5);
        System.out.println("drink.getVolume() = " + drink.getVolume());

    }
}