package solid.openClosedPrincipal;

public class MailgunProvider implements EmailProvider {


    @Override
    public void send(String to, String content) throws Exception {
        throw new Exception("Sending failed");
        //System.out.println(to + " " + content + " mailgun");
    }
}
