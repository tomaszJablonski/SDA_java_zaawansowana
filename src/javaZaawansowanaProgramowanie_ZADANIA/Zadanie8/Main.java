package javaZaawansowanaProgramowanie_ZADANIA.Zadanie8;

//poćwiczyć testy junityowe!!!!
public class Main {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(15, 20, 30, 30, true);
        System.out.println("parcel = " + parcel);
        System.out.println("parcel.validate = " + parcel.validate(new Parcel(35, 35, 35, 18, false)));
    }


}
