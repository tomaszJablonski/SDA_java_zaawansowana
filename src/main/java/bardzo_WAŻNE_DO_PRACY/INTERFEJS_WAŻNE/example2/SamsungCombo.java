package bardzo_WAŻNE_DO_PRACY.INTERFEJS_WAŻNE.example2;

public class SamsungCombo implements  PrinterScanner,CopyMachine{

    //trzeba nadpisać metody żeby działały
    @Override
    public void print(String str) {
        System.out.println("Smasung printing: " + str);

    }

    @Override
    public String scan() {
        return "Samsung print";
    }

    @Override
    public String copy(String str) {
        return "Samsung copy document" + str;
    }
}
