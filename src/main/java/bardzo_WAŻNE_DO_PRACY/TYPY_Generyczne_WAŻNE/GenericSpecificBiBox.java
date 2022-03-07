package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

//1. Klasa rozszerza klasę generyczną
//nie dospecyfikuje typów
//sama musi być generyczna
//nazwy typów: są rozłączne pomiędzy klasami
//tzn. nie muszą być takie same w klasie rodzicu i dziecku
//liczy sie kolejność a nie nazwa litery !!!!
public class GenericSpecificBiBox <W,G> extends GenericBiBox<W,G>{

    public GenericSpecificBiBox(W first, G second) {
        super(first, second);
    }
}
