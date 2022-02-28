package javaZaawansowanaProgramowanie_ZADANIA.Zadanie18i19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("Intel",32,"nVidia","Razor","X250"));
        computerList.add(new Computer("Amd",8,"Radeon","Kobalt","134"));
        computerList.add(new Computer("Intel",64,"nVidia","Torn","X1560"));
        computerList.add(new Computer("Intel",16,"nVidia","WEX","X100"));

        for(Computer computer : computerList){
            System.out.println(computer);
        }

        computerList.add(new Laptop("Intel",64,"nVidia10.000","Razor","X1650","lenovo250"));

        for(Computer computer : computerList){
            System.out.println(computer);
        }

    }
}
