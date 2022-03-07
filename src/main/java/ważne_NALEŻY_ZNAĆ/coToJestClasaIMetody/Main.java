package ważne_NALEŻY_ZNAĆ.coToJestClasaIMetody;


import ważne_NALEŻY_ZNAĆ.coToJestClasaIMetody.railway.User;

public class Main {
    public static void main(String[] args) {
        //pakiet zmienia "pełna kwalifikowana nazwa klas"
        // pełna kwalifikowana nazwa klas to <nazwaPakietu>.<nazwaKlasy>
        //packageExample.Main <-pełna nazwa obecnej klasy
        //com.nazwafirmywktorejpracuje.resztainforamcji


        //użyć pełnej nazwy
        ważne_NALEŻY_ZNAĆ.coToJestClasaIMetody.airport.User  user = new ważne_NALEŻY_ZNAĆ.coToJestClasaIMetody.airport.User();
        user.sayHello();

        User user2 = new User();
        user2.sayHello();

        //ile tutaj jest adressów i ile jest mieszkań (jako pole)?
        //łącznie 8 pól, każdy obiekt ma swoje prywatne, osobne
        // (gettery i settery dlatego 8 bo każdy ma po 2)

        Home home1 = new Home("address1",1);
        Home home11 = new Home("address1",1);

        Home home2 = new Home("address2", 2);
        Home home21 = new Home("address2", 2);

    }
}
