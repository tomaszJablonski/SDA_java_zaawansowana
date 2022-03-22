package wzorceProjektowe.wzorceBehawioralne.chainOfResponsibilityWAZNE.sDA;

public interface Handler {
    void setNext(Handler handler);
    void handle();
}
