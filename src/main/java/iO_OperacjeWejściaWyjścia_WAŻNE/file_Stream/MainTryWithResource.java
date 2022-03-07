package iO_OperacjeWejściaWyjścia_WAŻNE.file_Stream;

//W PRACY TYLKO TO !!!!!!!!!!!!!!


//Autoclosable - interfejsy z jedną metodą close
//Autoclosable - pozwala na automatyczne zwalnianie zasobów
//automatycznie zwalnianie zasobów - zwalnianie po żytku
//po użytku - try -with - resources
//close - zwalnia zasoby


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTryWithResource {
    public static void main(String[] args) {
        //try with resources
        //try with resources - GWARANTUJE wywołanie metody close na wszystkich zasobach
        //zasoby - wszystkie obiekty stworzone w try (<tutaj>), które implementuje AutoCloseable
        //wywołanie metody close jest automatyczne
        try (
                //jak przepisać plik do innego directory
                //można wczytać pliki z zewnątrz z dysku, z neta, z bazy danych
                FileInputStream inputStream = new FileInputStream((new File("source/input.txt")));
                FileOutputStream outputStream = new FileOutputStream("target/input.txt");

        )  {
            int b;
            //bardzo częsta pętla do czytania bajtów
            //b = inputStream.read() <- wczytuje pojedyncze bajty lub -1 jak plik się skończył
            while ((b = inputStream.read()) != -1){
                outputStream.write(b);
            }
        } catch (IOException exc){
            exc.printStackTrace();
            }
        }
        }



