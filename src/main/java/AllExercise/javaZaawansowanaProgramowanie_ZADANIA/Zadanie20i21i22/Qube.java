package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie20i21i22;

public class Qube extends Shape3D {


    public Qube(double sideAShape) {
        super(sideAShape);
    }

    @Override
    protected double calculatePerimeter() {
        return 0;
    }

    @Override
    protected double calculateArea() {
        return 0;
    }

    @Override
    protected double calculateVolume() {
        return 3 * getSideAShape();
    }

    @Override
    public int fill(int water) {
        int result= water - (int) calculateVolume();
        if(result==0){
            System.out.println("Wlałeś wody po brzegi = " + result);
        } else if(result>1 ){
            System.out.println("Przelałeś figure!" );
        } else
            System.out.println("Wlałeś za mało wody = " + result);
        return result;
    }
}
