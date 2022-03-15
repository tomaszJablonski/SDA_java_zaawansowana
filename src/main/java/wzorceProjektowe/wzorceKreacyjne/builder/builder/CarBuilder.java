package wzorceProjektowe.wzorceKreacyjne.builder.builder;

import allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13.EngineType;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private EngineType engineType;


    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(EngineType engineType) {
        this.engineType = engineType;
    }

    public Car getResult() {

        return new Car(type, seats, engineType);
    }
}
