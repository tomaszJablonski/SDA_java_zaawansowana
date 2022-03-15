package wzorceProjektowe.wzorceKreacyjne.builder.builder;

public class MainCarFabric {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructionTirCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType() + "\n" + car.print());

        director.constructionBus(carBuilder);
        Car car1 = carBuilder.getResult();
        System.out.println("Car Built:\n" + car1.getType() + "\n" + car1.print());
    }
}
