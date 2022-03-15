package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie12i13;

/*
TODO
 1.dodawanie aut do listy,
 2.usuwanie auta z listy,
 3.zwracanie listy wszystkich aut,
 4.zwracanie aut z silnikiem V12,
 5.zwracanie aut wyprodukowanych przed rokiem 1999,
 6.zwracanie najdroższego auta,
 7.zwracanie najtańszego auta,
 done
 8.zwracanie auta z co najmniej 3 producentami,
 9.zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
 done
 10.sprawdzanie czy konkretne auto znajduje się na liście,
 done
 11.zwracanie listy aut wyprodukowanych przez konkretnego producenta,
******12.zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CarService {

    private List<Car> carList = new ArrayList<>();

    void addCar(Car car) {
        carList.add(car);
    }

    void removeCar(Car car) {
        carList.remove(car);
    }

    void listOfCars() {
        carList.stream()
                .forEach(car1 -> System.out.println(car1));
    }

    public List<Car> carsWithEngine(EngineType engine) {
        return carList.stream()
                .filter(car -> engine == car.getEngineType())
                .collect(Collectors.toList());
    }

    public List<Car> carsWithYearProduction1999() {
        return carList.stream()
                .filter(car1 -> car1.getYear() < 1999)
                .collect(Collectors.toList());
    }

    public Car theMostExpensiveCar() {
        return carList.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car theCheapestCar() {
        return carList.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    //zrobić później
    public List<Car> theThreeProducers(int minCount) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= minCount)
                .collect(Collectors.toList());

    }

    public List<Car> sortedCars(boolean typeOfSort) {  //true rosnąco,false malejąco
        if (typeOfSort == true) {
            return carList.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        } else {
            return carList.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
    }

    //to samo co wyżej  tylko za pomocą comparatora i enuma
    public List<Car> sortedCarsWithMultiStream(SortType sortType, Function<Car, ? extends Comparable> fieldExtractor) {
        return carList.stream()
                .sorted(sortType.getComparator(fieldExtractor))
                .collect(Collectors.toList());
    }

    public List<Car> specificCar(String nameSpecificCar) {
        return carList.stream()
                .filter(car -> car.getName().equals(nameSpecificCar)) //nie ważne jakie miejsce w pamięci
                .collect(Collectors.toList());

    }

    //sprawdza czy istnieje auto po nazwie i cenie nie większej niż przekazana
    public boolean isCarExistWithNameAndYear(String name, double maxPrice) {
        //odpowiednik tego co niżej
//        carList.stream()
//                .filter(car -> ar -> car.getName(name) && car.getPrice()<=maxPrice)
//                .findFirst()
//                .orElse(null) !=null

        return carList.stream()
                //anyMatch - czy istnieje taki element który spełnia określony kierunek
                .anyMatch(car -> car.getName().equals(name) && car.getPrice() <= maxPrice);

    }


    public List<Car> specificManufacture(Manufacturer nameSpecificManufacturer) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().contains(nameSpecificManufacturer))
                .collect(Collectors.toList());
    }

    //dokończyć z przykładu
    public List<Car> getCarListProducedByManuWithYear(int year, ComparisonFunction comparisonFunction){
    return null;
    }

}
