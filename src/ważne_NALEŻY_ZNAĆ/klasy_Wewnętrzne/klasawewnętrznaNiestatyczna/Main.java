package ważne_NALEŻY_ZNAĆ.klasy_Wewnętrzne.klasawewnętrznaNiestatyczna;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1L,"Order1");
        //Tak nie działa
        //potrzeby jest obiekt Order
        //Order.Entry entry = new Order.Entry("",0)

        Order.Entry entry =
                order.new Entry("product1",10);
        System.out.println("entry.info() = " + entry.info());
    }
}
