package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.Classes;

//mapy
//przechowują klucz i wartość
//klucz jest unikalny w skali mapy <- klucze się nie powtarzają
//wartość - wszystko jedno mogą się powtarzać


//trzy implementacja:
// hashmap
// linkedhashmap
// treemap


//ciekawosta - pod spodem set to mapa (:

//w mapie ważne są klucze (!)


import java.util.*;

public class MapCollectionMain {

    public static void main(String[] args) {

     //klucz -> String; wartość ->Integer
     Map<String,Integer> map = new HashMap<>();

        System.out.println("map.size() = " + map.size());
        System.out.println("map.isEmpty() = " + map.isEmpty());

        //dodawnie wpisów - metoda put
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        System.out.println("map = " + map);

        //dodawanie tego samego klucza z inną wartością:
        map.put("one",0);
        System.out.println("map = " + map);

        //wyciąganie z mapy
        Integer valueAtTwo = map.get("two");
        System.out.println("valueAtTwo = " + valueAtTwo);

        //usuwanie(po kluczu)
        map.remove("one");
        System.out.println("map = " + map);

        //jak sprawdzać czy w mapie istnieje klucz
        boolean containKey = map.containsKey("three");
        System.out.println("containKey = " + containKey);

        //iterowanie po mapach
        //nie da się tak po prostu pętlą for
        //1.tylko po kluczach
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println("key = " + key);
        }
        System.out.println("Tylko po wrtościach!");
        //2.tylko po wartościach
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println("value = " + value);
        }

        //3.Po mapowaniu klucz -> wartość
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + "------> value " + value);

        }

        //TreeMap
        //jak klucz nie jst Comparable to trzeba podać Comparator do klucza
        TreeMap<StringBox, Integer> treeMap = new TreeMap<>(new StringBoxComparator());
        treeMap.put(new StringBox("Jan"),1);
        treeMap.put(new StringBox("Adam"),1);

        System.out.println("treeMap = " + treeMap);


    }
}
