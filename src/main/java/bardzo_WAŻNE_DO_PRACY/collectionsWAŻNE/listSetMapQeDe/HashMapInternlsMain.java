package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

import java.util.HashMap;
import java.util.Map;

//jak pod spodem działa hash mapa
public class HashMapInternlsMain {

    //jak wstawiamy coś do mapy to:
    //1.na kluczu wołamy hashCode
    //2. z tej wartości robimy modulo iść bucketów (miejsce na elementy w mapie)
    //3. w ten sposób mamy index bucketu gdzie chcemy wstawić
    //3.1 Koszyk jest pusty -> po prostu wstawiamy
    //3.2 W koszyku coś jest -> na wszystich w tym koszyku wywołuje `equals`
    //3.2.1 Jesli wszystkie equas zwrócą false -> zakładamy, że to jest nowy klucz i wstawiamy
    //3.2.2 Jeśli któryś equals zwróci true -> podmieniamy wartość

    public static void main(String[] args) {
        Map<CustomKey, Integer> hashMap = new HashMap<>();

        hashMap.put(new CustomKey(1),1);
        hashMap.put(new CustomKey(2),1);
        hashMap.put(new CustomKey(3),1);

        System.out.println("====duplicate ===");
        hashMap.put(new CustomKey(1),2);

        System.out.println("====get=====");
        hashMap.get(new CustomKey(2));




    }
}
