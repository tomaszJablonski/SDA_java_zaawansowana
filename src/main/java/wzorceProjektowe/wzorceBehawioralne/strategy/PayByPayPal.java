package wzorceProjektowe.wzorceBehawioralne.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> dataBase = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        dataBase.put("amanda1985", "amanda@ya.com");
        dataBase.put("qwerty", "john@amazon.eu");
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter the user`s email: ");
                email = reader.readLine();
                System.out.println("Enter the password");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Data verification has been succesful.");

                } else {
                    System.out.println("Wrong email or password");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(dataBase.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


}
