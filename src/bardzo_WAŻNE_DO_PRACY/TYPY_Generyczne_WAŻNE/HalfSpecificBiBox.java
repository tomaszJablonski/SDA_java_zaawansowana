package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

//2.Klasa może dospecyfikować część typów
//jeden może być generyczny a drugi jest zaszyty na stałe
public class HalfSpecificBiBox <W> extends GenericBiBox<W,String> {

    public HalfSpecificBiBox(W first, String second) {
        super(first, second);
    }
}
