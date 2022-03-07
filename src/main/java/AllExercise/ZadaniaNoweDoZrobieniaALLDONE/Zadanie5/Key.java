package AllExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie5;

public class Key {

    private int value;
    private static int newValue=0;

    public Key(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key{" +
                "value=" + value ;
    }

    public int hashCode(){
        return newValue++;
    }
}
