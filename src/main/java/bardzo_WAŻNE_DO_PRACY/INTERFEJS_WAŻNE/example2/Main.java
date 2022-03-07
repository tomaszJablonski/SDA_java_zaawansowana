package bardzo_WAŻNE_DO_PRACY.INTERFEJS_WAŻNE.example2;


//można rozwijać klasy niezależnie i dodwać tyle interfejsów ile chcemy
public class Main {
    public static void main(String[] args) {
        HpCombo hpCombo = new HpCombo();
        scan(hpCombo);
        print(hpCombo);
        //copy(HpCombo); nie da się bo HP nie ma tego interefejsu zaimplementowanego

        SamsungCombo samsungCombo = new SamsungCombo();
        scan(samsungCombo);
        print(samsungCombo);
        copy(samsungCombo);

    }

    private static void scan(PrinterScanner scanner){
        String result = scanner.scan();
        System.out.println("Scan result: " + result);
    }

    private static void print(PrinterScanner printer){
        printer.print("ToPrint");
    }

    private static void copy(CopyMachine copier){
        String copy = copier.copy("ToCopy");
        System.out.println("copy = " + copy);
    }
}
