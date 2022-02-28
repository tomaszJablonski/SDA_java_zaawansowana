package javaZaawansowanaProgramowanie_ZADANIA.Zadanie17;



public enum ConversionType {

    METERS_TO_YARDS(1.093613F),
    YARDS_TO_METERS(0.9144F),
    CENTIMETERS_TO_ICHES(0.393700787F),
    INCHES_TO_CENTIMETERS(2.54F),
    KILOMETERS_TO_MILES(1093.613F),
    MILES_TO_KILOMETERS(1.609344F);

    protected final float convert;

    ConversionType(float convert) {
        this.convert = convert;
    }

    public float getConvert() {
        return convert;
    }
}



