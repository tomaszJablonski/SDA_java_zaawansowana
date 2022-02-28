package javaZaawansowanaProgramowanie_ZADANIA.Zadanie4;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> newMap = new HashMap<>();

    public Storage(Map<String, List<String>> newMap) {
        this.newMap = newMap;
    }

    public Map<String, List<String>> getNewMap() {
        return newMap;
    }

    public void setNewMap(Map<String, List<String>> newMap) {
        this.newMap = newMap;
    }

    public void addToStorage(String key, String value){
        if(newMap.containsKey(key)){
            newMap.get(key).add(value);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            newMap.put(key,values);
        }
    }

    public void printValues(String key){
        System.out.println("Wartości dla klucza" + key + ":" + newMap.get(key));
    }

    public void findValues(String value){
        String message = newMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.joining(",","[","]"));
        System.out.println("Klucze zawierające wartość " + value + ":" + message);
    }
}