package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Adam", 45);
        Person p2 = new Person("Jan",34);
        Person p3 = new Person("Jan", 33);

        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));
        System.out.println("p1.compareTo(p3) = " + p1.compareTo(p3));
        System.out.println("p2.compareTo(p3) = " + p2.compareTo(p3));



    }
}
