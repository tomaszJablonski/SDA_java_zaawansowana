package solid.openClosedPrincipal;

public class EmailSender implements  EmailProvider{

    EmailProvider[] providers;

    public EmailSender(EmailProvider[] provider) {
        this.providers = provider;
    }

    @Override
    public void send(String to, String content) {
        for (EmailProvider emailProvider: providers){
            try {
                emailProvider.send(to,content);
                return;
            } catch (Exception exc){

            }


        }
    }
}
