package wzorceProjektowe.wzroceStrukturalne.decorator;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notify to Facebook");
        super.send(message);
    }
}
