package ważne_NALEŻY_ZNAĆ.klasy_Wewnętrzne.staticinner_Statyczna;


//klasa statyczna wewnętrzna
//nie ma dostępu do pól klasy
// jedyna różnica vs zwykła to fakt, że jest w innej

//używa się żeby podkreślić , że coś jest w danej klasie
public class Car {

    static class Engine{
        private double volume;

        public Engine(double volume) {

            this.volume = volume;
        }
    }
}
