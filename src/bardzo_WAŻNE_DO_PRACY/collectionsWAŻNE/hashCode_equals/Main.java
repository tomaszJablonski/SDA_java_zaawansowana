package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.hashCode_equals;

//MEGA GIGA WAŻNE 100% PYTANIE REKRUTACYJNE !!!!!!!!!!!
//pamiętać o kontrakcie
//2 obiekty są równe to mogą mieć ten sam hash code
//2 te same hash cody nie znaczą, że będą te same obiekty
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Tomasz", "Jabłoński",19,"1234");
        System.out.println("p1.hashCode() = " + p1.hashCode());

        Person p2 = new Person("Tomasz", "Jabłoński",19,"1234");
        System.out.println("p2.hashCode() = " + p2.hashCode());

        System.out.print("p1 == p2: ");
        System.out.println(p1 == p2);

        System.out.println("p1.equals(p2) = " + p1.equals(p2));



    }
}
