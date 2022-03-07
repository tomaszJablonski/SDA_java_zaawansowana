package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.decorator;

public class FacebookDecorator extends BaseDecorator{

    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notify to Facebook");
        super.send(message);
    }
}
