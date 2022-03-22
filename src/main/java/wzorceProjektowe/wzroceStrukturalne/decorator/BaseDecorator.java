package wzorceProjektowe.wzroceStrukturalne.decorator;


public abstract class BaseDecorator implements Notifier {

    Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
