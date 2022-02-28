package bardzo_WAŻNE_DO_PRACY.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //obiekt .class
        // jak uzyskać ?
        //statycznie
        Class<Invoice> invoiceClass = Invoice.class;
        //dynamicznie
        Class<?> dynamic = Class.forName("bardzo_WAŻNE_DO_PRACY.reflection.Invoice");

        System.out.println("invoiceClass = " + invoiceClass);
        System.out.println("dynamic = " + dynamic);

        //informacja o klasie
        System.out.println("========================");
        System.out.println("invoiceClass = " + invoiceClass);
        System.out.println("invoiceClass.getName() = " + invoiceClass.getName());
        System.out.println("invoiceClass.getSimpleName() = " + invoiceClass.getSimpleName());
        System.out.println("invoiceClass.getPackage() = " + invoiceClass.getPackage());
        System.out.println("invoiceClass.getInterfaces() = " + invoiceClass.getInterfaces());


        //pola,metody,construktory

        //pola
        System.out.println("==================");
        //getX vs getDeclaredX
        //getX ->widoczne na zewnątrz
        //getDeclaredX ->wszystkie
        System.out.println("invoiceClass.getFields() = " + Arrays.toString(invoiceClass.getFields()));
        System.out.println("invoiceClass.getDeclaredFields() = " + Arrays.toString(invoiceClass.getDeclaredFields()));

        //metody
        System.out.println("====================");
        System.out.println("invoiceClass.getMethods() = " + Arrays.toString(invoiceClass.getMethods()));

        //construktr
        System.out.println("===================");
        System.out.println("invoiceClass.getCanonicalName() = " + invoiceClass.getCanonicalName());
        System.out.println("invoiceClass.getDeclaredConstructors() = " + Arrays.toString(invoiceClass.getDeclaredConstructors()));

        //stworzyć obiekt poprzez refleksje
        Constructor<Invoice> constructor = invoiceClass.getConstructor();
        Invoice invoice = constructor.newInstance();
        System.out.println("invoice = " + invoice);

        //ustawienia pola:
        Field amountField = invoiceClass.getDeclaredField("amount");
        amountField.setAccessible(true);
        amountField.set(invoice, new BigDecimal(100));

        System.out.println("invoice = " + invoice);

        //wywołanie metody

        Method setCreatedDate = invoiceClass.getMethod("setCreatedData", LocalDateTime.class);
        setCreatedDate.invoke(invoice,LocalDateTime.now());

        System.out.println("invoice = " + invoice);

        //czy ma bardzo_WAŻNE_DO_PRACY.adnotacje
        System.out.println("setCreatedDate.getAnnotation() = " + setCreatedDate.getAnnotations());
        Deprecated annotation = setCreatedDate.getAnnotation(Deprecated.class);
        System.out.println("annotation.since() = " + annotation.since());

    }
}
