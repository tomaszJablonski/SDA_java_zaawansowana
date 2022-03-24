package dodatkoweInformacje.bufferReaderVsScanner;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
The difference between BufferedReader and Scanner are following:

BufferedReader is synchronized but Scanner is not synchronized.
BufferedReader is thread-safe but Scanner is not thread-safe.
BufferedReader has larger buffer memory but Scanner has smaller buffer memory.
BufferedReader is faster but Scanner is slower in execution.
Code to read a line from the console:

 */


public class BufferReaderVsScanner {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String st = br.readLine();

            // You can make the object InputStreamReader object inside the BufferReader method.
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String st1 = br1.readLine();

            // You can even inspect the type of the input stream manually by using Parse method which accepts string parameter.
            int x = Integer.parseInt(br1.readLine());

            // Or you can pass the object directly.
            int x1 = Integer.parseInt(st);

            Scanner sc = new Scanner(System.in);
            String st2 = sc.nextLine();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
