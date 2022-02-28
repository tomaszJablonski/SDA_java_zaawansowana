package ważne_NALEŻY_ZNAĆ.anonymous_Klasa_Anonimowa;

//klasa anoninowa ->klasa bez nazwy
//tworzona w miejscu potrzeby
//wykorzystuje się do prostych i szybkich funkcjonalności

public class Main {
    public static void main(String[] args) {

        //Klasa anonimowa
        //stworzona w miejscy występowania
        //jednorazowa
        AbstractShape shape = new AbstractShape(){

            @Override
            public long area() {
                return 15;
            }
            //nie jest dostępna z zewnątrz i jest martwa bardzo żadko się tego używa
            public void doNothing(){

            }
        };

        System.out.println("shape.area() = " + shape.area());

    }
}
