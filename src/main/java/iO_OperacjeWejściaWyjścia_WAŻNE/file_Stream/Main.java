package iO_OperacjeWejściaWyjścia_WAŻNE.file_Stream;

//InputStream - wczytywanie danych
//OutputStream - wypisywanie danych

//streamy należy zamykać, inaczej zużywamy zasoby


//File(input.txt/output)Stream
//najbardziej niskopoziomowy (czytamy bajty)
//przepisać source/input.txt.txt ->target/file.txt


import java.io.*;

public class Main {
    public static void main(String[] args) {

        //jak przepisać plik do innego directory
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream((new File("source/input.txt")));
            outputStream = new FileOutputStream("target/input.txt");
            int b;

            //bardzo częsta pętla do czytania bajtów
            //b = inputStream.read() <- wczytuje pojedyncze bajty lub -1 jak plik się skończył
            while ((b = inputStream.read()) != -1){
                outputStream.write(b);

            }

        } catch (IOException exc){
            exc.printStackTrace();
        } finally {
            //zwalnianie zasobów
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException exc){
                //bardzo źle tragicznie :(
                exc.printStackTrace();
            }
        }
        }

    }

