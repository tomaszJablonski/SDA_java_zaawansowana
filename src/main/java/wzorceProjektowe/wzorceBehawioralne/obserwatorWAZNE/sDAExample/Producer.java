package wzorceProjektowe.wzorceBehawioralne.obserwatorWAZNE.sDAExample;

public interface Producer {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();

}
