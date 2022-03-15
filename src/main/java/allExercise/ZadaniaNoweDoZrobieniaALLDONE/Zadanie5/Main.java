package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie5;

import java.util.HashMap;
import java.util.Map;

/*
13.
1. Stwórz klasę Key, która będzie wykorzystywana jako klucz w HashMap.
 Klasa ma zawierać jedno pole - value(int).
 done
2. Stwórz kilka obiektów klasy Key.
done
3. Stwórz mapę HashMap<Key, String>, a następnie dodaj klucze
i wartości (wartości są dowolne) - jaka jest kolejność elementów ?
Uruchom program kilka razy - czy kolejność zawsze jest taka sama ?
4. Dodaj implementację hashCode w taki sposób, aby zawsze zwracała tą samą wartość. Uruchom program - jak wygląda mapa ?
5. Zmnień implementację hashCode tak aby zaczynała się od 0 i z każdym wykonaniem zwracała liczbę o 1 większą. W programie sprawdź czy w mapie znajdują się dodane wcześniej klucze ?
6. Dodaj dwa razy ten sam klucz do mapy - ile elementów znajduje się mapie
 */

//nie psuć hashCoda i Mapy i będzie git
public class Main {
    public static void main(String[] args) {

        Key key1 = new Key(5);
        Key key2 = new Key(4);
        Key key3 = new Key(33);
        Key key4 = new Key(23);

        Map<Key, String> hashKey = new HashMap<>();
        hashKey.put(key1,"klucz1");
        hashKey.put(key2,"klucz2");
        hashKey.put(key3,"klucz3");
        hashKey.put(key4,"klucz4");
        //nie duplikować rekordów bo będzie błąd dość poważny
        hashKey.put(key4,"klucz4");

        System.out.println("hashKey = " + hashKey);

        String key4Value = hashKey.get(key4);
        System.out.println("key4Value = " + key4Value);


    }
}
