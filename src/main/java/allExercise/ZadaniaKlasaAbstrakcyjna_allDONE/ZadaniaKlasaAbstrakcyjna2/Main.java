package allExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna2;

public class Main {
    public static void main(String[] args) {

        DebitAccount account1 = new DebitAccount(15000);
        CreditAccount account2 = new CreditAccount(25000);
        SavingAccount account3 = new SavingAccount(35000);
        System.out.println("acc1.printProfits() = " + account1.printProfits());
        System.out.println("acc2.yearProfit() = " + account2.yearProfit(1000));

        account1.printProfits();




    }
}
