package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.bridge;

public class CoffeePurchase implements DrinkPurchase {


    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a coffe for " + cost);
        return new Coffie();
    }
}
