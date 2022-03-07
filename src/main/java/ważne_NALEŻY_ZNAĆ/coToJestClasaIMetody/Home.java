package ważne_NALEŻY_ZNAĆ.coToJestClasaIMetody;

//może nie musi być public, może być protected, default
//klasa ma nazwę i nazwa to nazwa typu danych
public class Home {

    //pola - przechowują stan obiektu
    //domyślna wartość? -  null
    private String address;
    //wartość domyślna - 0
    private int numberofFlats;

    //constructor
    //specjalna "metoda" - pozwala tworzyć obiet oraz nadać wartości pól
    public Home(String address, int numberofFlats){
        this.address=address;
        this.numberofFlats = numberofFlats;
    }

    //metoda
    //<dostęp> <zwrot> <nazwa> (<opcjonalne argumenty>)

    private String getAddress(){
        return address;
    }

    private void setAddress(String address){
        this.address = address;
        //address.lenght();
        return;


    }
}
