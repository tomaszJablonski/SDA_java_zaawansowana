package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

import java.time.Instant;

//3. Klasa może dospecyfikowaćwszystkie typy
public class SpecificBox extends GenericBiBox<Instant, Long> {

    public SpecificBox(Instant first, Long second) {
        super(first, second);
    }
}
