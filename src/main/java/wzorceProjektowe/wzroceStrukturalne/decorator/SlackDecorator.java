package wzorceProjektowe.wzroceStrukturalne.decorator;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending notify to Slack");
        super.send(message);
    }


}
