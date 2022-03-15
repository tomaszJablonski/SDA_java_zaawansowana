package allExercise.ZadaniaClass_allDONE.Zadanie3;

/*

3.
TODO 1. Stwórz klasę Pojazd - pojazd posiada maksymalną prędkość oraz aktualną prędkość.
     Dodaj gettery, settery oraz konstruktor ustawiający maksymalną prękość.
     Done

TODO 2. Stwórz klasę Rower (maksymalna prękość 25), Samochód (100), Samolot (800).
     Klasy rozszerzają klasę Pojazd.
     Done

TODO 3. Do klas Rower, Samochód oraz samolot dodaj nowe pole, które będzie
 ustawiane poprzez konstruktor.
     Dla klasy rower - ilość biegów (int), dla klasy Samochód typ
     paliwa (String), dla klasy Samolot - ilość silników.
     Done

TODO 4. Zmodyfikuj setter aktualnej prędkości tak, aby wypisywał błąd oraz
     NIE ustawiał aktualnej prędkośći
     jeśli jest ona większa od maksymalnej lub mniejsza od zera.
     Done
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Car(250,"Oil");
        System.out.println("vehicle = " + vehicle);
        vehicle.setActualSpeed(50);






    }



}
