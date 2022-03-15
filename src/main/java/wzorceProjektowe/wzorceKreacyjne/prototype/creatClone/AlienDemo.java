package wzorceProjektowe.wzorceKreacyjne.prototype.creatClone;

public class AlienDemo {
    public static void main(String[] args) {

        Alien alien = new Alien("Rose", 1.76D, 115.0D);
        Alien clone1 = (Alien) alien.createClone();
        Alien clone2 = (Alien) alien.createClone();
        Alien clone3 = (Alien) alien.createClone();
        Alien clone4 = (Alien) alien.createClone();

        clone2.setName("Roman");
        clone3.setName("Agnesia");
        clone4.setName("Wolania");

        System.out.println("clone1 = " + clone1);
        System.out.println("clone2 = " + clone2);
        System.out.println("clone3 = " + clone3);
        System.out.println("clone4 = " + clone4);


    }
}
