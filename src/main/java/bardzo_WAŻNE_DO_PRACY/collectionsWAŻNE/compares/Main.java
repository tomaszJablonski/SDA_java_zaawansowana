package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.compares;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Adam", 45);
        Person p2 = new Person("Jan",34);
        Person p3 = new Person("Jan", 33);

        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));
        System.out.println("p1.compareTo(p3) = " + p1.compareTo(p3));
        System.out.println("p2.compareTo(p3) = " + p2.compareTo(p3));

        PersonByNameComparator comparator = new PersonByNameComparator();
        System.out.println("comparator.compare(p1,p2) = " + comparator.compare(p1, p2));
        System.out.println("comparator.compare(p1,p3) = " + comparator.compare(p1, p3));
        System.out.println("comparator.compare(p2,p3) = " + comparator.compare(p2, p3));



    }
}
