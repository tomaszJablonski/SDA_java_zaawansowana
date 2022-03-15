package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie1;

import java.util.Objects;

public class Watch {

    private String name;

    public Watch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watch watch = (Watch) o;
        return Objects.equals(name, watch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Watch{" +
                "name='" + name + '\'' +
                '}';
    }
}
