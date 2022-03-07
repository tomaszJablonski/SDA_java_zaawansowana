package solid.openClosedPrincipal;

//Chodzi w tej zasadzie oto, że można wysyłać różne maile z różnych
//providerów przez interfejs
//dodawając nowe klasy które go implementują



public class Main {
    public static void main(String[] args) {

        EmailProvider[] emailProviders = {new MailgunProvider(), new AWSProvider()};

        EmailSender emailSender = new EmailSender(emailProviders);
        EmailSender emailSender1 = new EmailSender(emailProviders);

        emailSender.send("Zdzisława","Hello world");
        emailSender1.send("Zdzisława","Hello world");
    }
}
