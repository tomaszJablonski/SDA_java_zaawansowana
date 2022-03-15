package wzorceProjektowe.wzorceKreacyjne.prototype.creatClone;

public class SpaceShipsDemo {
    public static void main(String[] args) {

        SpaceShip starKiler = new SpaceShip("StarKiler", 100, 14.5D, new Alien("Starlord", 123.34D, 500.34D));
        System.out.println(starKiler);

        SpaceShip clone1 = (SpaceShip) starKiler.createClone();
        SpaceShip clone2 = (SpaceShip) starKiler.createClone();
        clone2.getCaptain().setName("Tyrion");
        SpaceShip clone3 = (SpaceShip) starKiler.createClone();

        clone1.setName("Millennium Falcon");
        clone2.setName("Death Star");
        clone2.setCrew(200);
        clone3.setName("AirBus");
        clone3.setFuel(1000.56D);

        System.out.println("clone1 = " + clone1);
        System.out.println("clone2 = " + clone2);
        System.out.println("clone3 = " + clone3);


    }
}
