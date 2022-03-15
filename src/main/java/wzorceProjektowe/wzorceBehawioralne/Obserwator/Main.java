package wzorceProjektowe.wzorceBehawioralne.Obserwator;

//częściej używane niż command
public class Main {
    public static void main(String[] args) {

        IphoneShop iphoneShop = new IphoneShop(2000);

        Customer customer1 = new Customer(1500);
        Customer customer2 = new Customer(2500);

        iphoneShop.addSubscriber(customer1);
        iphoneShop.addSubscriber(customer2);

        iphoneShop.removeSubscriber(customer2);

        iphoneShop.updatePrice(1200);



    }
}
