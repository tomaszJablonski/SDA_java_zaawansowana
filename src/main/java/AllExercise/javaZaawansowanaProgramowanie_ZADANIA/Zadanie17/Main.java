package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie17;

/*
TODO
 Stwórz klasę enum ConversionType ze stałymi
 METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
 Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
 Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę convert(int value, ConvertionType conversionType)
i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.
 */

public class Main {
    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println("measurementConverter = " + measurementConverter.convert(250, ConversionType.METERS_TO_YARDS));

        System.out.println("measurementConverter.convertGetter(100,ConversionType.MILES_TO_KILOMETERS) = " + measurementConverter.convertGetter(100, ConversionType.MILES_TO_KILOMETERS));


    }
}
