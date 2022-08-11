package WszystkiePodstawy.Podstawy4.dane.sclass;

public class Zewn {
    private static int x = 5;

    public void wyswietlNumer() {
    }

    public static class Wewn {
        public void wysiwetlNumer() {
            System.out.println(x);
        }
    }

    public static Wewn init() {
        return new Wewn(); //this -->new Wewn()
    }
}
