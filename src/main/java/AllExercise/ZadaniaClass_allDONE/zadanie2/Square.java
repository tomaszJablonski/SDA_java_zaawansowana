package AllExercise.ZadaniaClass_allDONE.zadanie2;

public class Square extends Rectangle{

    public Square(double sideA) {

        super(sideA,sideA);
    }


    @Override
    public double field(){
        return getSideA()*getSideA();
    }

    @Override
    public double circumFerence(){
        return 4*getSideA();
    }


}





