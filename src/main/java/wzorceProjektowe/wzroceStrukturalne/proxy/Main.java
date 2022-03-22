package wzorceProjektowe.wzroceStrukturalne.proxy;

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

/*
 Zastosowanie
Wzorzec Pełnomocnik może przydać się w wielu przypadkach.
Przejrzyjmy najpopularniejsze przypadki użycia tej koncepcji:

- Leniwa inicjalizacja (wirtualny pełnomocnik). Gdy masz do czynienia z zasobożernym obiektem usługi, którego potrzebujesz jedynie co jakiś czas.
 Zamiast tworzyć obiekt podczas uruchamiania aplikacji, możesz opóźnić inicjalizację obiektu do momentu gdy faktycznie staje się potrzebny.

- Kontrola dostępu (pełnomocnik ochronny). Przydatne, gdy chcesz pozwolić tylko niektórym klientom na korzystanie z obiektu usługi. Na przykład, gdy usługi stanowią kluczową część systemu operacyjnego, a klienci to różne uruchamiane aplikacje (również te szkodliwe).
 Pełnomocnik może przekazać żądanie obiektowi usługi tylko wtedy, gdy klient przedstawi odpowiednie poświadczenia.

- Lokalne uruchamianie zdalnej usługi (pełnomocnik zdalny). Użyteczne, gdy obiekt udostępniający usługę znajduje się na zdalnym serwerze.
  W takim przypadku, pełnomocnik przekazuje żądania klienta przez sieć, biorąc na siebie kłopotliwe szczegóły przesyłu.

- Prowadzenie dziennika żądań (pełnomocnik prowadzący dziennik). Pozwala prowadzić rejestr żądań przesyłanych do obiektu usługi.
  Pełnomocnik może zapisywać do dziennika każde żądanie przed przekazaniem go usłudze.

- Przechowywanie w pamięci podręcznej wyników działań (pełnomocnik z pamięcią podręczną). Pozwala przechować wyniki przekazywanych żądań i zarządzać cyklem życia pamięci podręcznej. Szczególnie ważne przy dużych wielkościach danych wynikowych.
  Pełnomocnik może implementować pamięć podręczną często powtarzających się żądań dających ten sam wynik. Można wykorzystać parametry żądania w charakterze kluczy identyfikujących odpowiedni obszar pamięci podręcznej.

- Sprytne referencje. Można likwidować zasobożerny obiekt, gdy nie ma klientów którzy go potrzebują.
  Pełnomocnik może pozwolić na śledzenie klientów którzy otrzymali referencję do obiektu usługi lub wyników jego pracy. Co jakiś czas pełnomocnik może przejrzeć listę klientów, sprawdzając czy wciąż są aktywni. Jeśli lista klientów okazuje się pusta, pełnomocnik może zlikwidować obiekt usługi i tym samym zwolnić zasoby systemowe.

- Pełnomocnik może też pamiętać, że klient zmodyfikował obiekt-usługę. Dzięki temu niezmienione obiekty mogą być ponownie wykorzystane przez innych klientów.

 */
