package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

import java.io.IOException;
import java.io.UncheckedIOException;

public class HandleCheckedEception {
    public static void main(String[] args) {

    }

    //execute nie ma "throws" <- wyjątki typu chcecked zostału obsłużone lub zmienione na unchecked
    private static void execute() {
        try {
            bad();
        } catch (MyCheckedException exc){
            System.out.println("Something bad happend");
            exc.printStackTrace();
        } catch (IOException exc){
            //catch może rzucić inny wyjątek
            //często służy do "przepakowania" chcecked na unchecked
            throw new UncheckedIOException(exc);
        }
    }

    private static void bad() throws MyCheckedException, IOException {
        throw new MyCheckedException();
    }
}
