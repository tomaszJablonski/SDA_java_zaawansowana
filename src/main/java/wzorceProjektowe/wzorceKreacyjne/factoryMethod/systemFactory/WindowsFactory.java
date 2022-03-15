package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

public class WindowsFactory implements MassFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public MailBox createMailBox() {
        return new WindowsMailBox();
    }
}
