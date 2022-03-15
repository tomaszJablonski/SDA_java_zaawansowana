package allExercise.ZadaniaClass_allDONE.zadanie2;


import java.util.Scanner;

/* 2. TODO
        1. Stwórz klasę Prostokąt wraz z konstruktorem, który inicjalizuje długość oraz szerokość. Klasa prostokąt powinna mieć metodę pozwalającą obliczyć pole oraz obwód.
        done
        2. Stwórz klasę Kwadrat, która rozszerza klasę prostokąt. Zadbaj o to, żeby pole oraz obwód było obliczane poprawnie dla tej klasy. Dodaj odpowiedni konstruktor.
        done
        3. Korzystając z metody toString (sprawdź w google do czego służy) nadpisanej z klasy Object wypisz nazwę klasy, obwód oraz polę figury.
        done
        4. Stwórz kilka kwadratów oraz prostokątów, a następnie umiejść je w jednej tablicy (jaki powinien być typ danych?). Stwórz metodę, która wypisuje informacje o obiektach na ekran.
        Done
        5*. Napisz program, który pobiera od użytkownika kształt oraz niezbędne dane potrzebne do zainicjalizowania tego kształtu. Wypisz polę i obwód otrzymanej figury.
        Done
        6*. Zmodyfikuj metodę do obliczania pola tak by była ona finalna - popraw klasy tak, żeby nadal działały.
        unDone
 */
public class Main {

    public static void showFigures(Rectangle[] figures){
        for(Rectangle f:figures){
            System.out.println(f);
        }
    }


    public static void main(String[] args) {

        Rectangle[] figures = new Rectangle[5];

        Rectangle r1 = new Rectangle(25,12);
        Rectangle r2 = new Rectangle(22,6);

        Square s1 = new Square(10);
        Square s2 = new Square(55);

        figures[0] = r1;
        figures[1] = r2;
        figures[2] = s1;
        figures[3] = s2;

        showFigures(figures);

        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);
        String options = "Rectangle | Square";
        System.out.println("Choose your figure " + options );
        String choose = scanner.nextLine();

        while (!(choose.equals("Rectangle") || choose.equals("Square"))){
            System.out.println("Wrong name");
            System.out.println("Enter correct name");
            choose = scanner.nextLine();
        }

            System.out.println("Enter side A");
            double sideA = scanner.nextDouble();

            if(choose.equals("Square")){
                double square = new Square(sideA).field();
                System.out.println("square field = " + square);
                double square1 = new Square(sideA).circumFerence();
                System.out.println("square circumFerence = " + square1);
            }

             if(choose.equals("Rectangle")){
                 System.out.println("Enter side B");
                 double sideB = scanner.nextDouble();

                 double rectangle = new Rectangle(sideA,sideB).field();
                 System.out.println("rectangle field = " + rectangle);
                 double rectangle1 = new Rectangle(sideA,sideB).circumFerence();
                 System.out.println("rectangle circumFerence = " + rectangle1);

             }

        }

    }

