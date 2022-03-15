package wzorceProjektowe.wzroceStrukturalne.compsite;

public class Main {
    public static void main(String[] args) {
        //Composite

        Box component1 = new Box();
        Box component2 = new Box();
        Product component3 = new Product(10.0);
        Product component4 = new Product(2.5);
        Product component5 = new Product(5.0);

        component1.addChild(component2);
        component1.addChild(component3);

        component2.addChild(component4);
        component2.addChild(component5);

        System.out.println(component1.calculatePrice());
        System.out.println(component2.calculatePrice());
    }
}
