package javaZaawansowanaProgramowanie_ZADANIA.Zadanie24i25;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<String> basket = new ArrayList<>();

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    Basket addToBasket(String product) throws BasketFullException {
        if(basket.size()<10) {
            basket.add(product);
        } else {
            throw new BasketFullException("Your basket is FULL!");
        }
        return this;
    }

    Basket removeFromBasket(String product) throws BasketEmptyException {
        if(basket.size()>0) {
            basket.remove(product);
        } else {
            throw new BasketEmptyException("Basket is empty! You can`t remove next product!");
        }
        return this;
    }
}

