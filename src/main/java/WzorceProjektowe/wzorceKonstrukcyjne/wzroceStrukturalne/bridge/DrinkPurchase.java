package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.bridge;

public interface DrinkPurchase {
    //odwołanie do Drink to jest ten most
    //w jednym interfejsie korzystamy z innego interfejsu
    Drink buy (final Double cost);
}
