package AllExercise.Zadanie_GenericTypes;

public class NumberPair <T extends Number> extends SingleTypePair<T> {


    public NumberPair(int i, double v) {
        super(i, v);
    }
}
