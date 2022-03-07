package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie5;

public class Main {
    public static void main(String[] args) {

        SDAHashSet sdaHashSet = new SDAHashSet();

        sdaHashSet.add("cos tam");
        sdaHashSet.add("i tu cos tam");
        sdaHashSet.add("iść");
        System.out.println("sdaHashSet = " + sdaHashSet);
        System.out.println("==============================");
        sdaHashSet.printMyElements();

    }
}
