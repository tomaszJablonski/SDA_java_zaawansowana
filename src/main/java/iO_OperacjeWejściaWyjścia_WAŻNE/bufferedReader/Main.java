package iO_OperacjeWejściaWyjścia_WAŻNE.bufferedReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// problem - chcemy wczytać linijki tekstu
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // klasa BufferedReader - pozwala czytać całe linie
        try (
                BufferedReader reader = new BufferedReader(new FileReader("source/input.txt"))
        ){
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Linijki: ");
        System.out.println("list = " + list);

        // klasa PrintWriter - pozwala wpisywać do pliku z formatowaniem
        try(
                PrintWriter pw = new PrintWriter(new FileWriter("target/pretty.txt"))
        ){
            for (String line : list){
                pw.println(line);
            }
            pw.format("This line is final line:) %s", "Hello!!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}