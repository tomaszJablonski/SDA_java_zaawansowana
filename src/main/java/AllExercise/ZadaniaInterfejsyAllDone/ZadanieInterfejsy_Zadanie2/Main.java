package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie2;
/*
2.
1. Stwórz interfejs Shape z metodą zwracającą double - calculateArea().
done
2. Zaimlementuj Circle, Square, Triangle, Cube oraz Sphere które implementują interfejs Shape.
done
3. Stwórz interfejs Shape3d z metodą zwracającą double - calculateVolume().
done
4. Zaimplementuj interfejs Shape3d w klasie sześcian oraz Kula.
done
 */
public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube(10);
        calculateArea(cube);
        calculateVolume(cube);

        Sphere sphere = new Sphere(15);
        calculateArea(sphere);
        calculateVolume(sphere);



    }

    public static void calculateArea(Shape area){
        System.out.println(area.calculateArea());
    }

    public static void calculateVolume(Shape3d area3d){
        System.out.println(area3d.calculateVolume());
    }
}
