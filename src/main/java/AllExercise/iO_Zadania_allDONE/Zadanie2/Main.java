package AllExercise.iO_Zadania_allDONE.Zadanie2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
2. Napisz program, który pobiera tekst od użytkownika
i wpisuje go do pliku, do momentu aż użytkownik wpisze "koniec".
 */

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = scanner.nextLine();

        try(
                PrintWriter printWriter = new PrintWriter(new FileWriter("tekst.txt"));
        ){
            while(!tekst.equals("koniec")){
                printWriter.println(tekst);
                System.out.println("Podaj kolejny tekst: ");
                tekst = scanner.nextLine();
            }

        }catch(IOException exp){
            exp.printStackTrace();
        }







    }
}
