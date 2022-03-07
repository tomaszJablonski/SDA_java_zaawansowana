package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie7;

public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon(4);

        weapon.loadBullet("pierwsza");
        weapon.loadBullet("druga");
        weapon.loadBullet("trzecia");
        weapon.loadBullet("czwarta");

        System.out.println("Czy pistolet załadowany " + weapon.isLoaded());

        weapon.loadBullet("piąty");

        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();

        System.out.println("Is the gun loaded? " + weapon.isLoaded());

        weapon.shot();







    }
}
