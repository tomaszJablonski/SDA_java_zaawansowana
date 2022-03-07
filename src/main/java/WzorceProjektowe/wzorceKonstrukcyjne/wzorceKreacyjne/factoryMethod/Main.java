package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.factoryMethod;


//transformowanie danych z np. liczb na napisy
//działamy na abstrakcjach (interfejsach)

//używamy do tego żeby ściągać dane z innych źródeł


public class Main {
    public static void main(String[] args) {

        Game game = new ValorantGameFactory().create();



    }
}
