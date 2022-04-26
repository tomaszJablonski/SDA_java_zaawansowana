package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

import java.util.Objects;

public class StringBox {

    private final String value;

    public StringBox(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringBox stringBox = (StringBox) o;
        return Objects.equals(value, stringBox.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "value='" + value + '\'' +
                '}';
    }
}
