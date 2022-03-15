package allExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna2;

public class DebitAccount extends  Account{

    public DebitAccount(double accountBalance) {
        super(accountBalance);
    }

    @Override
    public double yearProfit(double currentBalance) {
        return 0;
    }

    @Override
    public String printProfits() {
        return "2 karty kredytowe";
    }
}
