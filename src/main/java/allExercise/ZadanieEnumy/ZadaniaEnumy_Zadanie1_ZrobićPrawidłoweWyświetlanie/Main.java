package allExercise.ZadanieEnumy.ZadaniaEnumy_Zadanie1_ZrobićPrawidłoweWyświetlanie;
/*
1.
1. Stwórz enum DayOfWeek oraz dodaj wartości.
Done
2. Stwórz klasę Shop. Sklep posiada nazwę oraz
tablicę dni tygodnia w których jest otwarty.
3. Stwórz kilka obiektów typu Sklep, niektóre z
nich są otwarte w niedziele, niektóre nie.
4. Stwórz tablicę sklepów. Napisz statyczną
metodę, która przyjmuje tą tablice oraz dzień
tygodnia, a następnie zwraca ilość sklepów
otwartych w dany dzień tygodnia.

 */

public class Main {
    public static void main(String[] args) {
        //jak wstawić tablicę do konstruktora
        DayOfWeek[] giveOpenDays = {DayOfWeek.WEDNESDAY,DayOfWeek.FRIDAY};
        Shop shop1 = new Shop("Kaufland",giveOpenDays);
        System.out.println("shop1 = " + shop1);

        DayOfWeek[] giveOpenDays1= {DayOfWeek.SUNDAY,DayOfWeek.MONDAY};
        Shop shop2 = new Shop("Biedronka",giveOpenDays1);
        System.out.println("shop2 = " + shop2);

        Shop [] shopArray = {shop1,shop2};
    }

    public static int numberOfShops(Shop[] shops, DayOfWeek days){
        int numberOfShops = 0;
        for (int i = 0 ; i<shops.length; i++){
            Shop shop = shops[i];
            DayOfWeek[] dayOfOpening = shop.getDayOfOpening();
            for (DayOfWeek openDay: dayOfOpening){
                if(openDay == days){
                    numberOfShops++;
                }
            }
        }

        return numberOfShops;
    }
}
