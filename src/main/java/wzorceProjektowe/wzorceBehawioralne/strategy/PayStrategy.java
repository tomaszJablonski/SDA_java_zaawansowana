package wzorceProjektowe.wzorceBehawioralne.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();


}
