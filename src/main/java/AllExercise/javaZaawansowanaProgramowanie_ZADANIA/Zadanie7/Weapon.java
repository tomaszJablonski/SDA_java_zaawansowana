package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie7;

import java.util.ArrayList;
import java.util.List;

public class Weapon {

    private final Integer sizeOfAmmo;

    private List<String> weaponMagazine = new ArrayList<>();

    public Weapon(Integer sizeOfAmmo) {

        this.sizeOfAmmo = sizeOfAmmo;
    }

    public void loadBullet(String bullet) {
        if (weaponMagazine.size() >= sizeOfAmmo) {
            System.out.println("You can`t add bullet for magazine " + bullet);
        } else {
            weaponMagazine.add(bullet);
        }
    }

    public boolean isLoaded() {
        return weaponMagazine.size() > 0;
    }

    public void shot() {
        if (!isLoaded()) {
            System.out.println("Magazine is empty, you can not shoot! ");
            return;

        }

        String bullet = weaponMagazine.remove(weaponMagazine.size() - 1);
        System.out.println("Shooot!  " + bullet);


        if(!isLoaded()) {
        System.out.println("You don`t have ammo ");
    }
}
    }



