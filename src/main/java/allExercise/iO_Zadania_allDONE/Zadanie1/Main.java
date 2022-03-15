package allExercise.iO_Zadania_allDONE.Zadanie1;


/*
1. Napisz program, który wczytuje zawartość danego pliku,
a następnie wypisuje ją na konsole.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        try (
            BufferedReader reader = new BufferedReader(new FileReader("date/data.txt"))
        ){
         String read;
         while ((read = reader.readLine()) != null){
             list.add(read);
         }

        }catch (IOException exc){
            exc.printStackTrace();
        }

        for (String read : list){
            System.out.println("read = " + read);
        }

    }


}
