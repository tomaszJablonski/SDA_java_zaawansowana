package solid.openClosedPrincipal;

public interface EmailProvider {

    void send(String to, String content) throws Exception;

}
