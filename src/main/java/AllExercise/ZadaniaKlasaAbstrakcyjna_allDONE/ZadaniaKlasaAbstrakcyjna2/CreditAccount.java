package AllExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna2;

public class CreditAccount extends Account {
    public CreditAccount(double accountBalance) {
        super(accountBalance);
    }

    @Override
    public double yearProfit(double currentBalance) {
        return 0;
    }

    @Override
    public String printProfits() {
        return "Możesz posiadać 2 karty...";
    }
}
