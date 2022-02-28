package ważne_NALEŻY_ZNAĆ.records;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Astra", "Opel", LocalDate.now(), false, "123");

        System.out.println("car = " + car);

        CarRecord carRecord = new CarRecord("Astra","Opel",LocalDate.now(),true,"123");
        System.out.println("carRecord = " + carRecord);
    }
}
