package allExercise.Zadanie_GenericTypesAllDone;

public class Pair <T,V> {

    private T value1;
    private V value2;

    public Pair(int i, double v) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }
}
