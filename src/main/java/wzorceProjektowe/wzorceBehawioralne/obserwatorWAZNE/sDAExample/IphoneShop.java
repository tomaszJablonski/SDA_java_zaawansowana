package wzorceProjektowe.wzorceBehawioralne.obserwatorWAZNE.sDAExample;


import java.util.ArrayList;
import java.util.List;

public class IphoneShop implements Producer {

    List<Subscriber> subscriberList = new ArrayList<>();
    private  int currentPrice;

    public IphoneShop(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
        subscriber.makeDecision(currentPrice);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscriberList ){
            subscriber.makeDecision(currentPrice);
        }
    }

    public void updatePrice(int newPrice){
        this.currentPrice = newPrice;
        notifySubscribers();
    }
}
