package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie1;

import java.util.Objects;

public class ListNumbers {

    private int number;

    public ListNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNumbers that = (ListNumbers) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "ListNumbers{" +
                "number=" + number +
                '}';
    }
}
