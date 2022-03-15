package wzorceProjektowe.wzorceKreacyjne.builder.builder;

import allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13.EngineType;

public class Director {

    public void constructionTirCar(Builder builder) {
        builder.setCarType(CarType.TIR);
        builder.setEngine(EngineType.V12);
        builder.setSeats(2);
    }

    public void constructionBus(Builder builder) {
        builder.setCarType(CarType.BUS);
        builder.setEngine(EngineType.S3);
        builder.setSeats(28);
    }

}
