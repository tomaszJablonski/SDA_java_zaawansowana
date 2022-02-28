package javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //streamy zamiast pętli

        Car fiat = new Car("Fiat","Palio",1500,1998,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain")),EngineType.V12 );
        System.out.println(fiat);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat","Palio",1500,1998,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain")),EngineType.V6 ));


        CarService carService = new CarService();

        carService.addCar((new Car("Fiat","Palio",1500,1998,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain")),EngineType.V12 )));
        carService.addCar((new Car("Alfa","Romeo",12500,2000,
                Arrays.asList(new Manufacturer("Valor",2015,"Poland")),EngineType.V6 )));
        carService.addCar((new Car("Mercedes","Class S",405000,2020,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain")),EngineType.S6 )));
        carService.addCar((new Car("Mercedes","Class A",300000,2020,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain")),EngineType.S6 )));
        carService.addCar((new Car("Mercedes","Class ",200000,2020,
                Arrays.asList(new Manufacturer("Hura",1898,"Spain"),new Manufacturer("Gordo",1888,"German")),EngineType.S6 )));

        System.out.println("lista aut");
        carService.listOfCars();
        System.out.println("Tylko V12");
        System.out.println("carService.carsWithEngineV12(EngineType.V12) = " + carService.carsWithEngine(EngineType.V12));

        System.out.println("Tylko przed 1999");
        System.out.println("carService.carsWithYearProduction1999() = " + carService.carsWithYearProduction1999());

        System.out.println("Najdroższe auto");
        System.out.println("carService.theMostExpensiveCar() = " + carService.theMostExpensiveCar());

        System.out.println("Najtańsze auto");
        System.out.println("carService.theCheapestCar() = " + carService.theCheapestCar());

        System.out.println("Z wieloma producentami");
        System.out.println("carService.theThreeProducers() = " + carService.theThreeProducers(2));

        System.out.println("Sortowanie rosnąco/malejąco");
        System.out.println("carService.sortedCars() = " + carService.sortedCars(false));

        System.out.println("Sortowanie za pomocą Euma i comparatora");
        System.out.println("carService.sortedCarsWithMultiStream(SortType.DESC,Car::getYear) = " + carService.sortedCarsWithMultiStream(SortType.ASC, Car::getYear));

        System.out.println("Podanie konkretnego auta");
        System.out.println("carService.specificCar() = " + carService.specificCar("Fiat"));

        System.out.println("Podanie konkretnego producenta");
        System.out.println("carService.specificManufacture" + carService.specificManufacture(new Manufacturer("Valor",2015,"Poland")));

    }
}
