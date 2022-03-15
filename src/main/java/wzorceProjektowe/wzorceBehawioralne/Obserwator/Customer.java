package wzorceProjektowe.wzorceBehawioralne.Obserwator;

public class Customer implements  Subscriber{

    int maxPrice;

    public Customer(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public void makeDecision(int price) {
        if(price <= maxPrice){
            System.out.println(this.toString() + " kupuje Iphona");
            return;
        }
        System.out.println(this.toString() + " Za drogo ");
    }
}
