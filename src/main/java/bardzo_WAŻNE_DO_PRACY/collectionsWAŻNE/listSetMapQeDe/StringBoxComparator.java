package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

import java.util.Comparator;

public class StringBoxComparator implements Comparator<StringBox> {


    @Override
    public int compare(StringBox o1, StringBox o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
