package wzorceProjektowe.wzorceKreacyjne.builder.builder;

import allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13.EngineType;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Car {
    CarType type;
    int seats;
    EngineType engineType;

    public String print() {
        String info = "";
        info += "Type of car:" + type + "\n";
        info += "Number of seats" + seats + "\n";
        info += "Engine Type" + engineType + "\n";

        return info;
    }
}
