package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

public class GenericBiBox <T,U> {
    private T first;
    private U second;

    public GenericBiBox(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
