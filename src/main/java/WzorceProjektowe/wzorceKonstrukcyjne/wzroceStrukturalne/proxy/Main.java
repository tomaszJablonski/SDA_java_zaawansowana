package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.proxy;

//Proxy - każde zapytanie musi przejść przez proxy
//nie zawsze przepuszcza dalej jeżeli nie zgadzają się
//dane wejściowe

//klient,klient,klient --> Pośrednik(PROXY) ---> Baza danych
//czyli nie każdy klient jest wpuszczany
//mp. klient może płacić kartą lub gotówką,
// i jeżeli przejdzie płatność
//to jest wpuszczany dalej a jak nie to nie

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        Proxy proxy = new Proxy(service);

        System.out.println("service.getTemperature() = " + service.getTemperature());
        System.out.println("proxy.getTemperature() = " + proxy.getTemperature());

    }
}
