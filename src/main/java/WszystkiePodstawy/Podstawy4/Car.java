package WszystkiePodstawy.Podstawy4;

public class Car {
    //Rodzaje klas
    //public widoczna w calym programie
    //private tylko w obrebie danej klasy widoczne
    //protected
    //default
    //maina można kopiować ale w praktyce się tego nie stosuje w
    // Getery i setery
    //alt+insert albo w zakładce code --> generator itd.
    private String marka;
    private String kolor;
    private int pojemnosc;
    private int przebieg;

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", pojemnosc=" + pojemnosc +
                '}';
    }

    public Car(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        if (this.przebieg > przebieg) {
            this.przebieg = przebieg;
        }

    }

    public void wyswietlParametry() {
        System.out.println("Pojemnosc " + pojemnosc + " kolor " + kolor + " Marka " + marka);
    }

}
