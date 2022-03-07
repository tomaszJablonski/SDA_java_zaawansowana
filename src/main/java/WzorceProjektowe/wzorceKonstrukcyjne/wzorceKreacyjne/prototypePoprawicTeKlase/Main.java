package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.prototypePoprawicTeKlase;

//jest kosztowe czas i zasoby
//kopiowanie jest szybsze / lepsze

//Typy kopiowania:
//deep copy - kopiownie całości
//shallow copy - kopiowanie fragmentu


import WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.abstractFactory.GameType;
import WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.abstractFactory.PcGame;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //podobno nie jest to za bardzo używane

        //shallow - skopiowanie przez referencje
        PcGame a = new PcGame("game1", GameType.PC_GAME);
        //
        PcGame b = a;
        a.setName("game2");

        System.out.println(b.getName());
        System.out.println(b.equals(a));

        //deep copy

        Cat cat1 = new Cat("Mruczek",1);
        Cat cat2 = cat1;
        Cat cat3 = cat1.creatCatClone();

        System.out.println("cat1.getName() = " + cat1.getName());
        System.out.println("cat2.getName() = " + cat2.getName());
        System.out.println("cat3.getName() = " + cat3.getName());

        System.out.println("cat3.getName() = " + cat3.getDog());
        System.out.println("cat3.getName() = " + cat3.getDog());
        System.out.println("cat3.getName() = " + cat3.getDog());





    }
}
