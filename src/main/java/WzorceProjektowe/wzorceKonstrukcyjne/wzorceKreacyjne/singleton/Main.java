package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.singleton;

public class Main {
    public static void main(String[] args) {

        //Eager

        Singleton s1 = Singleton.getINSTANCE();

        System.out.println("s1.getCount() = " + s1.getCount());
        s1.increment();

        Singleton s2 = Singleton.getINSTANCE();
        System.out.println("s2.getCount() = " + s2.getCount());

        //Zrobić Leyze

    }
}
