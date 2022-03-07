package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;

import java.time.LocalDate;

public class LocalDateBox {

    private final LocalDate value;

    public LocalDateBox(LocalDate value){
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
