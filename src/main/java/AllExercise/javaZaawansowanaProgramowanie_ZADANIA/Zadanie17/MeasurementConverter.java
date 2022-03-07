package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie17;


public class MeasurementConverter {

    public int convert(int value, ConversionType conversionType) {
        int result = (int) (value * conversionType.convert);
        return result;

    }

    public int convertGetter(int value, ConversionType conversionType) {
        int result = (int) (value * conversionType.getConvert());
        return result;

    }
}
