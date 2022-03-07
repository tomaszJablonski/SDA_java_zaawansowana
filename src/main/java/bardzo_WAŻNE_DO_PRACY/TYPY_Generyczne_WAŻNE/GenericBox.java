package bardzo_WAŻNE_DO_PRACY.TYPY_Generyczne_WAŻNE;


//typy generyczne <- pozwalają na napisanie klasy gdzie typy danych są podawane później
//generyczne mogą być klasy/interfejsy  oraz metody

//!!!!
//100% pytanie na rozmowie rekrutacyjnej
//TYPY GENERYCZNE SĄ WYMAZYWANE PODCZAS KOMPILACJI
//jak piszesz kod to one są a jak uruchamiasz kod to ich nie ma jest object
//!!!!

//generyczne klasy:
//1.mogą mieć więcej niż 1 parametr
//2.defiionwane są na poziomie klasy
//3.tyoy nazywamy zazwyczaj jedną literą T,U,Y ....
//4.definiujemy w<>



public class GenericBox<T> {

    private T value;

    public GenericBox(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
