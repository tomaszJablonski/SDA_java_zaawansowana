package wzorceProjektowe.wzorceBehawioralne.Obserwator;

public interface Producer {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();

}
