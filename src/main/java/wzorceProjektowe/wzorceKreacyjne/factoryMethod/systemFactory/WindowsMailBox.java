package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

public class WindowsMailBox implements MailBox {

    @Override
    public void paint() {
        System.out.println("You have created new mail box in Windows");
    }
}
