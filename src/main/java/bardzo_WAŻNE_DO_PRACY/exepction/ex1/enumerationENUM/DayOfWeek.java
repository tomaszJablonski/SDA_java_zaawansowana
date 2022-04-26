package bardzo_WAŻNE_DO_PRACY.exepction.ex1.enumerationENUM;


//enum o nazwie DayOfWeek
//wartości:MONDAY, SUNDAY

//enum - to specjalna klasa
//można dodawać metody
//można implementować interfejsu
//można dodwać pola ( z construktorem)

//Nie można dziedzczyć enumem po innej klasie
//bo wszystkie enumy dziedziczą po klasie Enum
//(a w javie nie ma wielokrotnego dziedziczenia)
enum DayOfWeek {
          //w nawiasach wywołanie konstruktora)
    MONDAY(1,true), //ordinal = 0
    SUNDAY(7,false), //ordinal = 1
    WEDNESDAY(3,true); // ordinal = 2

    //dobra praktyka
    //(jedyna słuszna)
    //to robić pola final (!)

    private final int dayNumber;
    private final boolean isWorkingDay;

    //konstruktor
    DayOfWeek(int dayNumber, boolean isWorkingDay){
        this.dayNumber = dayNumber;
        this.isWorkingDay = isWorkingDay;
    }

    //zamiana wartości na enum
    //filtrujemy po polu (nie po nazwie
    //mamy int numer dnia -> enum z tym dniem
    //metoda statyczna

    public static DayOfWeek parseByDayNumer(int dayNumber){
        for (DayOfWeek value : DayOfWeek.values()){
            if (value.dayNumber == dayNumber){
                return value;
            }
        }
        //return null bo nie znamy wyjątków
        return null;
    }

    //zwykła metoda więc:
    //może zwracać argumenty,voida i każdy inny typ


    public String getPolishName() {
        switch (this) {
            case MONDAY:
                return "Poniedziałek";
            case SUNDAY:
                return "Niedziala";
            case WEDNESDAY:
                return "Środa";
            default:
                return "brak mapowania";
        }
    }

        //dowolna metoda
        public long someRandomMethodToAddTwoLongs(int a, int b){
        return a+b;
        }

    public int getDayNumber() {
        return dayNumber;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }
}



