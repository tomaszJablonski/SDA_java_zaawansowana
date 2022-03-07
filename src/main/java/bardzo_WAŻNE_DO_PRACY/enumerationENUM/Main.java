package bardzo_WAŻNE_DO_PRACY.enumerationENUM;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //wybieramy wartość z predefiniowanej listy
        DayOfWeek day = DayOfWeek.MONDAY;
        DayOfWeek day1 = DayOfWeek.SUNDAY;

        //z klasy enum:
        // nazwę stałej:
        String enumName = day.name();
        System.out.println("enumName = " + enumName);

        //pozycja w liście:
        //pozycja stałej licząc od góry ( w klasie) od 0
        int ordinal = day.ordinal();
        System.out.println("ordinal = " + ordinal);

        //wszystkie wartości danego enuma;
        //zastosowanie - zmiana jakiejśwartości na enuma(poprzez pętle)
        DayOfWeek[] allDayOfWeek = DayOfWeek.values();
        System.out.println("allDayOfWeek = " + Arrays.toString(allDayOfWeek));

        //zamiana tekstu na enuma (po nazwie)
        DayOfWeek parsedDay = DayOfWeek.valueOf("SUNDAY");
        System.out.println("parsedDay = " + parsedDay);

        //porówanaie enumów (EQUALS)
        boolean isEqualWithEquals = day.equals(DayOfWeek.MONDAY);
        System.out.println("isEqualWithEquals = " + isEqualWithEquals);

        //możemy porównywać poprzez == bo java zapwenia , że jest tylko jedna instacja
        boolean isEqual = day == DayOfWeek.MONDAY;
        System.out.println("isEqual = " + isEqual);

        String polishName = day.getPolishName();
        System.out.println(day + " in polish is called = " + polishName);

        System.out.println("DayOfWeek.MONDAY.getDayNumber() = " + DayOfWeek.MONDAY.getDayNumber());

        System.out.println("DayOfWeek.MONDAY.isWorkingDay() = " + DayOfWeek.MONDAY.isWorkingDay());


        DayOfWeek fourthDay = DayOfWeek.parseByDayNumer(7);
        System.out.println("fourthDay = " + fourthDay);







    }
}
