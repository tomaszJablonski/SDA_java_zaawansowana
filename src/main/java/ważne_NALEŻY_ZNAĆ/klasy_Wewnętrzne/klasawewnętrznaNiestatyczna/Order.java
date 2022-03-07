package ważne_NALEŻY_ZNAĆ.klasy_Wewnętrzne.klasawewnętrznaNiestatyczna;

//klasa wewnętrzna
//klasa w klasie
//klasa wewnętrzna NIE statyczna
//dostęp do wszystkich pól klasy zewnętrznej
public class Order {

    private Long id;
    private String name;
    private Entry[] entries;

    public Order(Long id, String name) {
        this.id = id;
        this.name = name;

    }
    //Nie ma STATIC (!)
    class Entry {
        private final String product;
        private final int quantity;

        public Entry(String product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public String info(){
            return String.format("Order %d, product: %s ,  quantity: %d",
                    id, product, quantity);
        }
    }

}


