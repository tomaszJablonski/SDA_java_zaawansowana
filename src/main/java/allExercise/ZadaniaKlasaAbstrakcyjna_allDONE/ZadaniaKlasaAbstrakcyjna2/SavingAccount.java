package allExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna2;

public class SavingAccount extends Account {

    public SavingAccount(double accountBalance) {
        super(accountBalance);
    }

    @Override
    public double yearProfit(double currentBalance) {
        return 0.0001*currentBalance;
    }

    @Override
    public String printProfits() {
        return "brak";
    }
}
