package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.fasada;

public class OrderFacadeType {
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public OrderFacadeType(PaymentService paymentService, DeliveryService deliveryService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
    }

    public boolean placeOrder(String productId,String userId,double price){
        boolean paymentStatus = this.paymentService.pay(price,userId);
        if(!paymentStatus){
            return false;
        }
        this.deliveryService.deliver(productId,userId);
        return true;
    }
}
