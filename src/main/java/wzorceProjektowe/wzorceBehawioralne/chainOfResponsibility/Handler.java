package wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle();
}
