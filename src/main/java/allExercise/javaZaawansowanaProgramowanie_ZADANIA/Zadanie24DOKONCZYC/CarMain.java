package allExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie24DOKONCZYC;

import java.util.ArrayList;
import java.util.List;

/*
TODO
 1.listę wszystkich Modelów,
 2.listę wszystkich aut,
 3.listę wszystkich nazw producentów,
listę wszystkich lat założenia producentów,
listę wszystkich nazw modeli,
listę wszystkich lat startu produkcji modeli,
listę wszystkich nazw aut,
listę wszystkich opisów aut,
tylko modele z parzystym rokiem startu produkcji,
tylko auta producentów z parzystym rokiem założenia,
tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919.
 */
public class CarMain {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Camaro", "sport", CarType.SEDAN));
        carList.add(new Car("Fiat", "family", CarType.CABRIOLET));
        carList.add(new Car("Porsche", "vipSport", CarType.COUPE));
        carList.add(new Car("Peugeot", "recreation", CarType.HATCHBACK));

        List<Model> modelList = new ArrayList<>();
        modelList.add(new Model("X250", 2020, carList));
        modelList.add(new Model("t348", 2019, carList));
        modelList.add(new Model("F568", 1990, carList));
        modelList.add(new Model("U890", 2001, carList));


        List<Manufacturer> manufacturerList = new ArrayList<>();
        manufacturerList.add(new Manufacturer("Ignaszak", 1985, modelList));
        manufacturerList.add(new Manufacturer("Soeno", 1999, modelList));
        manufacturerList.add(new Manufacturer("Ha-Tu", 1854, modelList));
        manufacturerList.add(new Manufacturer("KurdeBlaszka", 1934, modelList));

        System.out.println("1.--------------");
        allModels(modelList);
        System.out.println("2.---------------");
        allCars(carList);
        System.out.println("3.----------------");
        allManufacturers(manufacturerList);
        System.out.println("4.----------------");
        //manufacturersProdYear(manufacturerList);
    }

    public static void allModels(List<Model> models) {
        for (Model all : models)
            System.out.println(all);

    }

    public static void allCars(List<Car> carList) {
        for (Car all : carList)
            System.out.println(all);
    }

    public static void allManufacturers(List<Manufacturer> manufacturerList) {
        for (Manufacturer all : manufacturerList)
            System.out.println(all);
    }
//TODO DOKONCZYC!!!!!
//    public static List<Manufacturer> manufacturersProdYear(List<Manufacturer> manufacturerList){
//        return manufacturerList.stream()
//                .allMatch(e -> e.getYearOfCreation() > 1990)
//                .collect(Collectors.toList());
//    }
}
