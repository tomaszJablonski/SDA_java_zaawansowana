package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie3;
/*
3.
1. Stwórz interfejs Player z jedną metodą play(String movie).
Done
2. Stwórz klasy CDPlayer, DVDPlayer, BlueRayPlayer.
Done
3. W nowo powstałych klasach zaimplementuj interfejs Player.
Done
4. Zaimplementuj brakujące metody. Niech każda klasa wypsiuje na ekran: "Odtwarzam film <typ>: <film>", np. "Odtwarzam film CD: Avatar".
//TODO prawie done
5. W klasie Player dodaj metodę void stop(), z domyślną implementacją, która wypisuje na ekran "Zatrzymanie odtwarzania".
done
6. Nadpisz metodę stop() w DVDPlayer, tak aby wypisywała `Odtwarzacz DVD zatrzymany`.
Done
7. Dodaj interfejs HDRPlayer z metodą canPlayHdr, która zwraca informację czy dany odtwarzacz potrafi odtwarzać filmy w wysokiej jakości.
Done
8. Zaimplementuj nowo powstały interfejs w klasie BlueRayPlayer.
 */
public class Main {
    public static void main(String[] args) {

        Player player = new DVDPlayer();
        play(player);
        stop(player);
        System.out.println();

        Player player1 = new CDPlayer();
        play(player1);
        stop(player1);

        System.out.println();
        Player player2 = new BlueRayPlayer();
        play(player2);
        stop(player2);
        HDRPlayer hdrPlayer = new BlueRayPlayer();
        canPlayHdr(hdrPlayer);


    }

    public static void play(Player movies){
        String result = movies.play("Avatar");
        System.out.println(result);
    }

    public static void stop(Player stopFilm){
        stopFilm.stop();
    }

    public static void canPlayHdr(HDRPlayer playHdr){
        playHdr.canPlayHdr();
    }
}
