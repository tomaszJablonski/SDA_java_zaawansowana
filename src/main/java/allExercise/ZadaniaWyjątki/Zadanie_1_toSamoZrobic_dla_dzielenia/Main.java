package allExercise.ZadaniaWyjątki.Zadanie_1_toSamoZrobic_dla_dzielenia;



public class Main {
    public static void main(String[] args) {

        try {
            Calcualtor.plus(5,5);
            Calcualtor.dividing(5,0);
        } catch (ZaMalaIloscArgumentow exc){
            System.out.println(exc.getMessage());
        } catch (CannotDivideBy0Exception exc){
            System.err.println("Nie wolno dzielić przez 0 ");
        }
    }
}
