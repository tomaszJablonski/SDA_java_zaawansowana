package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie15;
/*
TODO
 Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp.
 Każdy z pojazdów ma własne parametry np. cena, moc, itp.
 Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
 Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
 Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana
 metoda boolean isFasterThan().
 Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o
 tym, że wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie.
 W tym celu skorzystaj z metody compareTo().
 */
public enum Car {
    FERRARI(2500000,150000),
    PORSCHE(500000,125000),
    MERCEDES(80000,85000),
    BMW(44000,25000),
    OPEL(15000,5800),
    FIAT(6800,1500),
    TOYOTA(27999,3500);

    private final double price;
    private final int power;


    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium(){
        return true;
    }

    public boolean isRegular(){
        return false;
    }

    public boolean isFasterThan(Car car){
        return this.compareTo(car) < 0;
    }


}




