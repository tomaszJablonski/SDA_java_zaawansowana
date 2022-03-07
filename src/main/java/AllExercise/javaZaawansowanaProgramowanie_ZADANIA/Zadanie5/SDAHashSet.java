package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SDAHashSet extends HashSet<String> {

    private List<String> elementsContainingLetterA = new ArrayList<>();


    @Override
    public boolean add(String s) {
        if(s.contains("a") || s.contains("A")){
            elementsContainingLetterA.add(s);
        }
        System.out.println("Dodajemy element");
        return super.add(s);
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("Usuwamy element");
        return super.remove(o);
    }

    @Override
    public int size() {
        System.out.println("Zwracamy wielkość");
        return super.size();
    }

    @Override
    public boolean contains(Object o) {
        System.out.println("Czy zawiera ....");
        return super.contains(o);
    }

    @Override
    public void clear() {
        super.clear();
    }

    public void printMyElements(){
        System.out.println(elementsContainingLetterA);
    }
}
