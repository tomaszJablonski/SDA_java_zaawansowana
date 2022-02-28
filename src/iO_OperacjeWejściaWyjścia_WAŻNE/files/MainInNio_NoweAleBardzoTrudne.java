package iO_OperacjeWejściaWyjścia_WAŻNE.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainInNio_NoweAleBardzoTrudne  {

//nio- new input output
//nowy standrad pracy z plikami od javy 7+
//*chyba
    public static void main(String[] args) throws IOException {
        //klasy z |s| na końcy np. Arrays/Collections/Paths
        //to klasy które są zgrupowaniem metod pomocnicznych
        //najczęściej  te metody są statyczne

        Path customPath = Paths.get("customPath");

        //Path - obrazuje plik lub folder
        //do pracy z plikami służy klasa Files

        boolean exists = Files.exists(customPath);
        System.out.println("exists = " + exists);

        Path file = Files.createFile(customPath);

        Files.delete(file);

        //wczytywanie wszystkich lini do pliku:

        Path sourceFile = Paths.get("source","input.txt");
        List<String> strings = Files.readAllLines(sourceFile);
        System.out.println("strings = " + strings);




    }
}
