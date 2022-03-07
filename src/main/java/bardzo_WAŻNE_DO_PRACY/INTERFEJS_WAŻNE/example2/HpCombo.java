package bardzo_WAŻNE_DO_PRACY.INTERFEJS_WAŻNE.example2;

//zwykła klasa
//w dziedziczeniu klasa rozszerze klase poprzez `extends`
//klasa implementuje interfejs (ile chce interfejsów)
//poprzez `implements`

public class HpCombo implements PrinterScanner {

    //trzeba nadpisać metody żeby działały
    @Override
    public void print(String str) {
        System.out.println("Hp printing: " + str);
    }

    @Override
    public String scan() {
        return "Hp scan result";
    }
}
