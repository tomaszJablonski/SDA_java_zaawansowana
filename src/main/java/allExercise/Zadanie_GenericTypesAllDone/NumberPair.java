package allExercise.Zadanie_GenericTypesAllDone;

public class NumberPair <T extends Number> extends SingleTypePair<T> {


    public NumberPair(int i, double v) {
        super(i, v);
    }
}
