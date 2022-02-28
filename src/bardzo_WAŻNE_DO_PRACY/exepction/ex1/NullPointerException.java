package bardzo_WAŻNE_DO_PRACY.exepction.ex1;

//był null a chcieliśmy wywołać jakąś metodę
public class NullPointerException {

    public static void main(String[] args) {
        String str = getString();
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
    }

    private static String getString(){
        return null;
    }
}
