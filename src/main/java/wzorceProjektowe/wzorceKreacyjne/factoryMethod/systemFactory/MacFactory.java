package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

public class MacFactory implements MassFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public MailBox createMailBox() {
        return new MacOsMailBox();
    }

}
