package WzorceProjektowe.wzorceKonstrukcyjne.wzorceBehawioralne.chainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle();
}
