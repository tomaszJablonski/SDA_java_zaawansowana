package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.listSetMapQeDe;

import java.util.Objects;

public class CustomKey {

    private final int value;

    public CustomKey(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Calling equals on: " + this + " with: " + o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return value == customKey.value;
    }

    @Override
    public int hashCode() {
        System.out.println("Calling hash code on: " + this);
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "CustomKey{" +
                "value=" + value +
                '}';
    }
}
