package allExercise.ZadaniaInterfejsyAllDone.ZadaniaInterfejsy_Zadanie4_Done;

public class PersonalOrder implements Order{

    private int numberOfElements;
    private double orderAmount;
    private Purchaser purchaser;

    public PersonalOrder(int numberOfElements, double orderAmount, Purchaser purchaser) {
        this.numberOfElements = numberOfElements;
        this.orderAmount = orderAmount;
        this.purchaser = purchaser;
    }

    @Override
    public int numberOfElements() {
        return numberOfElements;
    }

    @Override
    public double orderAmount() {
        return orderAmount;
    }

    @Override
    public Purchaser purchaser() {
        return purchaser;
    }
}
