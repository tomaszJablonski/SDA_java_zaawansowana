package allExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie5;


/*
TODO
 5.
 1. Stwórz interfejs Procesor z jedną metodą, która zwraca boolean - czyIntel(). Zaimplementuj klasy IntelCore oraz AmdRyzen.
 done
 2. Stwórz intefejs PlytaGlowa z jedną metodą, która zwraca boolean - czyObslugujeIntel(). Zaimplementuj klasy PlytaIntel oraz PlytaAmd.
 done
 3. Stwórz klasę Komputer z trzema polami: wlaczony (boolean), plytaGlowna oraz procesor. Proces i plytaGlowa powinna byc przekazywana w konstruktorze.
 done
 4. Dodaj prywatną metodę czyCzesciPasuja(), która sprawdza, czy podana płyta głowna oraz procesor są kompatybilne.
 Done
 5. Zaimplementuj metodę wlacz(), która sprawdza czy części do siebie pasują i jeśli pasują to ustawia pole wlaczony na true.
 Done

 */
public class Main{
    public static void main (String[] args) {

    Computer computer1 = new Computer(new AmdRyzen(),new MainBoardIntel());
        System.out.println("computer1.isPowerOn() = " + computer1.isPowerOn());


        Computer computer2 = new Computer(new IntelCore(),new MainBoardIntel());
        System.out.println("computer2.isPowerOn() = " + computer2.isPowerOn());


    }

}
