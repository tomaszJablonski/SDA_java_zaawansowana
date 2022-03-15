package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

public class Application {

    private Button button;
    private MailBox mailBox;

    public Application(MassFactory factory) {
        button = factory.createButton();
        mailBox = factory.createMailBox();
    }

    public void paint() {
        button.paint();
        mailBox.paint();
    }


}
