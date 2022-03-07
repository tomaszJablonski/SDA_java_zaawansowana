package solid.openClosedPrincipal;

public class AWSProvider implements EmailProvider{


    @Override
    public void send(String to, String content) {
        System.out.println(to + " " + content + " AWS");
    }
}
