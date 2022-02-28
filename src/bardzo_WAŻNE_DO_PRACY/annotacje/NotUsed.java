package bardzo_WAŻNE_DO_PRACY.annotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@interface <-tworzy bardzo_WAŻNE_DO_PRACY.adnotacje
//może mieć metody ale jest tylko określony zbiór zwracanych rzeczy:
//String,Enum,Long,Int,Boolean

//Retention Policy - określa gdzie widać daną adnotację (kod,kompilator,runtime)
@Retention(RetentionPolicy.RUNTIME)
//ElementType - określa na czym mozna użyć adnotacji(pole,klasa,etc.)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface NotUsed {

    //pole w adnotacji
    String message() default "";


    //default nadaje domyślną wartość
    boolean forRemoval() default true;
}
