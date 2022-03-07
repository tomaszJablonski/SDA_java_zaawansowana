package iO_OperacjeWejściaWyjścia_WAŻNE.files;

import java.io.File;

public class Main_StarePodejscie {
    //jak na razie często  używane

    //File - klasa, obrazujący plik* w systemie
    //*lub folder
    public static void main(String[] args) {

        File file = new File("customFolder");
        //sprawdzamy czy folder o nazwie customFolder istnieje
        boolean exists = file.exists();
        System.out.println("exists = " + exists);

        //możemy stworzyć taki folder
        //mkdir - z unixa - make directory

        boolean creatResult = file.mkdir();
        System.out.println("creatResult = " + creatResult);

        //ścieżki
        String absolutePatch = file.getAbsolutePath();
        //c:
        System.out.println("absolutePatch = " + absolutePatch);
        String path = file.getPath();
        //gdzie jest program
        System.out.println("path = " + path);
        String parent = file.getParent();
        System.out.println("parent = " + parent);

        //usunięcie pliku
        boolean deleted = file.delete();
        System.out.println("deleted = " + deleted);

    }
}
