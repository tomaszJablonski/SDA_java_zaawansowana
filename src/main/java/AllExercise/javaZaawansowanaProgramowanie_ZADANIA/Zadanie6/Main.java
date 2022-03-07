package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String,String> mapa = new TreeMap<>();

        mapa.put("Wlacz","TV");
        mapa.put("To jest","Radio");
        mapa.put("E tam","Computer");
        mapa.put("To tu","DVD");

        firstAndLastElement(mapa);
    }
    //pokazuje pierwszy i ostatni element
    public static void firstAndLastElement(TreeMap<String,String> sampleMap){
        Map.Entry<String,String> firstEntry = sampleMap.firstEntry();
        System.out.println("Fist entry [" + firstEntry.getKey() + "," + firstEntry.getValue() + "]");

        Map.Entry<String,String> lastEntry = sampleMap.lastEntry();
        System.out.println("Last entry [" + lastEntry.getKey() + "," + lastEntry.getValue() + "]");


    }



}
