package function_WAŻNE.interfejs;

//interfejs funkcyjny - ma tylko jedną metodą abstrakycjną
//czasem określamy jako ASM (abstract signle method) // SAM (single abstract method)

//ta annotacja zapewnia, że ten interfejs ma tylko jedną metodę abstrakcyjną (inaczej się nie skompiluje)
@java.lang.FunctionalInterface
public interface FunctionalInterface {

    //vvvvvvvvvvv - metoda abstrakcyjna (musi być jedną(!))
    void  foo();

    //metody domyślne nie LICZĄ się jako abstrakycjne

    default void bar(){
    }


}
