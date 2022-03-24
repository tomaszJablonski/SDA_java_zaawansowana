package wzorceProjektowe.wzorceBehawioralne.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;


    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    @Override
    public void collectPaymentDetails() {
        try {


            System.out.println("Enter the card number: ");
            String number = bufferedReader.readLine();
            System.out.println("Enter the card expiration date 'mm/yyyy' : ");
            String date = bufferedReader.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = bufferedReader.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
