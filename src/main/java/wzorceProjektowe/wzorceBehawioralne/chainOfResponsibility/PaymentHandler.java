package wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility;

public class PaymentHandler extends BaseHendler {
    @Override
    public void handle() {
        System.out.println("Handling Payment");
        super.handle();
    }
}
