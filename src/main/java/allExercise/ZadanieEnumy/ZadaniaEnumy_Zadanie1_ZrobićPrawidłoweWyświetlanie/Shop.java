package allExercise.ZadanieEnumy.ZadaniaEnumy_Zadanie1_ZrobićPrawidłoweWyświetlanie;

public class Shop {
    private String name;
    private DayOfWeek[] dayOfOpening;

    public Shop(String name, DayOfWeek[] dayOfOpening) {
        this.name = name;
        this.dayOfOpening = dayOfOpening;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayOfWeek[] getDayOfOpening() {
        return dayOfOpening;
    }

    public void setDayOfOpening(DayOfWeek[] dayOfOpening) {
        this.dayOfOpening = dayOfOpening;
    }
}
