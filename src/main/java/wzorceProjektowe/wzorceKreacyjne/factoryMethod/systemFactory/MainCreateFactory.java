package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

import java.util.Scanner;

public class MainCreateFactory {

    private static Application configureApplication() {
        Application application;
        MassFactory massFactory;

        System.out.println("Welcome in my Factory");
        System.out.println("Choose your System: Windows or Mac");

        Scanner scanner = new Scanner(System.in);
        String osName = scanner.nextLine().toLowerCase();
        //osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            massFactory = new MacFactory();
            application = new Application(massFactory);
        } else {
            massFactory = new WindowsFactory();
            application = new Application(massFactory);
        }

        return application;
    }


    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();

    }
}
