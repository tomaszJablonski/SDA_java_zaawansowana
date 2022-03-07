package AllExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie3;

/*
TODO
 Zadanie 3
 1. Stwórz statyczną metodę, która przyjmuje tekst, a zwraca mapę typu Map<Character, Integer>,
 która zawiera ilość wystąpień danej litery.
 done
 2. Stwórz dwie wersje powyższej metody - jedna wykorzystuje HashMap, druga - TreeMap.
 done
 3. Wypisz zawartość mapy na ekran w formie "litera -> wartość". Czy poszczególne implementacje się różnią ? Dlaczego ?
 done
 4. Zmodyfikuj powyższą metodą tak aby przekazywać parametr (boolean), który w przypadku przekazania wartości logicznej true powoduje,
 że mapa ignoruje wielkość liter. Uruchom ponownie program.
 done

 //nie do końca zrobiłem go sam ale będę miał podpowiedź na przyszłość

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String text = "Abrakadabra";

        System.out.println("howMuchLetterHashMap1 = " + howMuchLetterHashMap1(text, true, 'a'));


        System.out.println("howMuchLetterHashMap(\"AbrakadabrA\") = " + howMuchLetterHashMap("AbrakadabrA")); // a=3 A=2

        System.out.println("howMuchLetterTreeMap(\"AbrakadabrA\") = " + howMuchLetterTreeMap("AbrakadabrA")); // a=3 A=2

    }

    public static String howMuchLetterHashMap(String name) {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();


            characterIntegerMap.put('A', name.indexOf("a"));

            Set<Map.Entry<Character, Integer>> entries = characterIntegerMap.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("key = " + key + "------> value " + value);

            }

            return String.valueOf(characterIntegerMap.get('A'));
        }


    public static String howMuchLetterTreeMap(String name){

        Map<Character,Integer> characterIntegerMap = new TreeMap<>();
        characterIntegerMap.put('A',name.indexOf("a"));

        return String.valueOf(characterIntegerMap.get('A'));
    }

    public static String howMuchLetterHashMap1(String text, boolean ignoreUpperCase, Character charToCount){
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        if (ignoreUpperCase) {
            text = text.toLowerCase();
            charToCount = Character.toLowerCase(charToCount);
        }

        for (char singleChar : text.toCharArray()) {
            characterIntegerMap.put(singleChar, characterIntegerMap.getOrDefault(singleChar, 0) + 1);
        }


        return String.valueOf(characterIntegerMap.getOrDefault(charToCount, 0));
    }


    }

