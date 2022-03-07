package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.decorator;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notify to Slack");
        super.send(message);
    }


}
