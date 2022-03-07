package WzorceProjektowe.wzorceKonstrukcyjne.wzorceBehawioralne.chainOfResponsibility;

public class DeliveryHandler extends BaseHendler {
    @Override
    public void handle() {
        System.out.println("Handling delivery ");
        super.handle();
    }
}
