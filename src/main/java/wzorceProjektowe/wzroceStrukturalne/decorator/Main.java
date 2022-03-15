package wzorceProjektowe.wzroceStrukturalne.decorator;

//Decorator - dziedziczenie bez dziedziczenia



public class Main {
    public static void main(String[] args) {

        //implementuje interfejs Norifier ale nie jest dekoratorem
        NotificationService notificationService = new NotificationService();

        Notifier notifierWithSlack = new SlackDecorator(notificationService);
        Notifier notifierWithSlackAndFacebook = new FacebookDecorator(notifierWithSlack);

       // Notifier notifier= new FacebookDecorator(new SlackDecorator(notificationService));

        notifierWithSlackAndFacebook.send("new notification");

    }
}
