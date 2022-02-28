package function_WAŻNE.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //stream - to jest sposób przetwarzania danych

    //TODO ROZMOWA REKRUTACYJNA
    //typy operacji na stremach:
    //pośrednie - zwracają nowy stream z "jakoś" zmienionymi danymi
    //np. map,filter, flatMap,distinct, sort, peek
    // terminalne - operacje które kończą streama i zwracają jakiś wynik, wykonuje akcje
    //np. forEach, collect, count, reduce, findFirst, findAny


    //stream są:
    //jednorazowe - stream tworzymy i uruchamiamy (poprzez operacje terminalną)
    //i nie można go wykorzystać od nowa

    //leniwe - do momentu wywołania operacji terminalnej nic się nie dzieje

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Five ");

        //zamienić wszystkie elementy w liście na drukowane i stowrzyć nową listę
        list.stream()
                .map (s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        //to samo co u góry, tylko zamiast wypisywać zebrać do listy
        List<String> upperCase = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("upperCase = " + upperCase);

        //zamist list - set
        Set<String> upperCase1 = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println("upperCase = " + upperCase1);

        //zostawić tylko elementy, które zaczynają się od litery F
        List <String> listWithStartingWithF = list.stream()
                .filter (s -> s.startsWith("F")) //!!
                .collect(Collectors.toList());
        System.out.println("listWithStartingWithF = " + listWithStartingWithF);

        //można składać operacje
        List <String> multiOperatingList = list.stream()
                .map (s -> s.toUpperCase())
                .filter(s -> s.startsWith("F"))
                .map (s -> "Hello" + s)
                .collect(Collectors.toList());
        System.out.println("multiOperatingList = " + multiOperatingList);

        List<List<String>> collect = list.stream()
                .map(s -> toChars(s))
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        //!!!!!!!!!!!!!!!!!!!!!
        //faltMapa - > pwoduje ,że nie ma List<List<String>>
        //tylko List<String>
        List<String> collect1 = list.stream()
                .map(s -> toChars(s))
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);



    }

    private static List <String> toChars(String s){
        List<String> chars = new ArrayList<>();

        char[] charArray = s.toCharArray();
        for(char c : charArray){
            chars.add(String.valueOf(c));
        }
        return chars;
    }
}
