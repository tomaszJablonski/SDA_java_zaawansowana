package AllExercise.ReflectionsAllDone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*TODO
   1.
   1. Stwórz klasę MobilePhone. Klasa przechowuje następujące wartości
   - producer (String)
   - model (String)
    - initialBatteryCapacity (long)
    - currentBatteryCapacity (long)
    - turnedOn (boolean)
   done
   2. Dla tak powstałej klasy nadpisz metodę toString, gettery, settery
   done
   3. Przy użyciu refleksji:
    - stwórz obiekt
    done
    - ustaw bezpośrednio wartość pól producer i model
    done
    - wywołaj settery dla initialBatteryCapacity, currentBatteryCapacity, turnedOn
    done
    4. Sprawdź czy wartości są poprawnie ustawione wywołując toString
    done
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class<MobilePhone> mobilePhoneClass = MobilePhone.class;

        Constructor<MobilePhone> mobilePhoneConstructor = mobilePhoneClass.getConstructor();
        MobilePhone mobilePhone = mobilePhoneConstructor.newInstance();
        System.out.println("mobilePhone = " + mobilePhone);

        Field mobilePhoneFieldProducer = mobilePhoneClass.getDeclaredField("producer");
        mobilePhoneFieldProducer.setAccessible(true);
        mobilePhoneFieldProducer.set(mobilePhone,"Nokia");
        System.out.println("mobilePhone = " + mobilePhone);

        Field mobilePhoneFieldModel = mobilePhoneClass.getDeclaredField("model");
        mobilePhoneFieldModel.setAccessible(true);
        mobilePhoneFieldModel.set(mobilePhone,"3310");

        System.out.println("mobilePhone = " + mobilePhone);

        Method mobilePhoneSetterInitialBatteryCapacity = mobilePhoneClass.getMethod("setInitialBatteryCapacity", long.class);
        System.out.println("mobilePhoneSetterInitialBatteryCapacity.invoke(mobilePhone,1000) = " + mobilePhoneSetterInitialBatteryCapacity.invoke(mobilePhone, 1000));


        Method mobilePhoneSetterCurrentBatteryCapacity = mobilePhoneClass.getMethod("setCurrentBatteryCapacity", long.class);
        System.out.println("mobilePhoneSetterCurrentBatteryCapacity.invoke(mobilePhone,85) = " + mobilePhoneSetterCurrentBatteryCapacity.invoke(mobilePhone, 85));

        Method mobilePhoneSetterTurnedOn = mobilePhoneClass.getMethod("setTurnedOn", boolean.class);
        System.out.println("mobilePhoneSetterTurnedOn.invoke(mobilePhone,true) = " + mobilePhoneSetterTurnedOn.invoke(mobilePhone, true));


    }
}
