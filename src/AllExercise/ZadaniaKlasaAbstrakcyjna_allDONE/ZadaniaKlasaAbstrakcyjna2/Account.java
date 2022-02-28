package AllExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna2;

public abstract class Account {

    // private BigDecimal accountBalance;
    private double accountBalance;

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public abstract double yearProfit(double currentBalance);

    public abstract String printProfits();
}
