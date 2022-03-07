package AllExercise.ZadaniaClass_allDONE.Zadanie4i5;

/*TODO
   4.
        Zaimplementuj klasę Point2D. Klasa powinna zawierać:
        - dwa pola typu int: x , y
        done
        - konstruktor bezparametrowy ustawiający wartość pól x i y na 0
        done
        - konstruktor z dwoma parametrami: float x , float y
        done
        - metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x , y
        done
        - metodę getXY zwracającą współrzędne x i y w postaci tablicy dwuelementowej
        done
        - metody typu setter odpowiedzialne za ustawianie wartości pól x , y
        done
        - metodę setXY ustawiającą współrzędne x i y
        done
        - metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y);
        done

 */

/*
5.
TODO Na podstawie klasy Point2D zaimplementuj klasę Point3D. Klasa ta powinna rozszerzać klasę Point2D oraz dodawać następującą implementację:
     - pole prywatne typu int: z
     done
     - konstruktor przyjmujący wartości dla pól: x , y , z
     done
     - metodę typu getter odpowiedzialną za zwracanie wartości zmiennej z
     done
     - metodę getXYZ zwracającą współrzędne x , y , z w postaci tablicy trzyelementowej
     done
     - metodę typu setter odpowiedzialną za ustawianie zmiennej z
     done
     - metodę setXYZ ustawiającą wartości dla zmiennych x , y , z
     done
     - metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y, z) ;
     done
 */

public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(5,15);
        System.out.println("point2D = " + point2D);

        System.out.println("=========");

        Point3D point3D = new Point3D(112,66,5);
        System.out.println(point3D);



    }
}
