package wzorceProjektowe.wzorceKreacyjne.singleton;

//@NoArgsConstructor
public final class NajprostszySingleton {

    //Najprostrzy rodzaj Singletona

    //public static final NajprostszySingleton INSTANCE = new NajprostszySingleton;
    //String value;
//    private NajprostszySingleton(String value) {
//    }

    //-------------------------------------------------------

    //zabezpieczenie dla wątków!!! Zawsze pokaże się tylko jeden niezmioniony wynik
    public static volatile NajprostszySingleton INSTANCE;

    public String value;

    private NajprostszySingleton(String value) {
    }

    public static NajprostszySingleton getInstance(String value) {
        NajprostszySingleton result = INSTANCE;
        if (result != null) {
            return result;
        }

        synchronized (NajprostszySingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new NajprostszySingleton(value);
            }
            return INSTANCE;
        }

    }

    /*
    Tak wtedy wygląda main :

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
 OutputDemoMultiThread.txt: Execution result
If you see the same value, then singleton was reused (yay!)
If you see different values, then 2 singletons were created (booo!!)

RESULT:

BAR
BAR

     */


}
