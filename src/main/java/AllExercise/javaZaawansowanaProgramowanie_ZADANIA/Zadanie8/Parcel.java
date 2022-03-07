package AllExercise.javaZaawansowanaProgramowanie_ZADANIA.Zadanie8;

public class Parcel implements Validator {

    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.isExpress = isExpress;
        setWeight(weight);
    }

    public int getxLenght() {
        return xLenght;
    }

    public void setxLenght(int xLenght) {
        this.xLenght = xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public void setyLenght(int yLenght) {
        this.yLenght = yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public void setzLenght(int zLenght) {
        this.zLenght = zLenght;
    }

    public float getWeight() {
        return weight;
    }
    //można też tu ustawić flagę false nie może byś większe niż 30, true nie może
    public void setWeight(float weight) {
        if(isExpress=false){
        if(this.weight>30) {
            System.out.println("Weight is not bigger than 30!!");
        }
        } else if(isExpress=true) {
            if (this.weight <= 15) {
            }
        }
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLenght=" + xLenght +
                ", yLenght=" + yLenght +
                ", zLenght=" + zLenght +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }

    @Override
    public boolean validate(Parcel input) {
        if (this.xLenght + this.yLenght + this.zLenght >300){
            return false;
        } else if (this.xLenght >30 ){
            return false;
        } else if(this.yLenght >30){
            return false;
        } else if(this.zLenght >30){
            return false;
        }

        return true;
    }
}
