package wzorceProjektowe.wzorceKreacyjne.singleton;

public class Singleton {

    //Pierwszy Eager
    //Drugi Layze

    //odwołuje się sam do siebie
    //Singletony są do tego że jeżeli  chcemy ustawić np. stałą rozdzielczość ekranu to taka
    //klasa nam zapewnia, że wszędzie będziemy dokładniej z tego samego
    //finalnego pola korzystać.

    private static final Singleton INSTANCE = new Singleton();

    //private static Singleton INSTANCE = null;


//    Lazy
//    public static Singleton getINSTANCE() {
//        if(INSTANCE == null){
//            INSTANCE = INSTANCE;
//        }
//        return INSTANCE;
//    }


    //ograniczamy stworzenie wiecęj niż jednego elementu
    private Singleton() {
    }

    //Eager
    public static synchronized Singleton getINSTANCE() {
        return INSTANCE;
    }

    private int count = 5;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }


}
