package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.builderDokonczyc;

public class Car {

    private String marka;
    private int przebieg;

    public Car(String marka, int przebieg) {
        this.marka = marka;
        this.przebieg = przebieg;

    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", przebieg=" + przebieg +
                '}';
    }




}


