package ważne_NALEŻY_ZNAĆ.constructorChaining;

public class Point2d {
    private int x;
    private int y;
    private int difference;

    public Point2d(){
        //this() <- wywołanie innego konstruktora
        //this - musi być pierwszą linijką
        this(5,5);
    }

    public Point2d(int x, int y){
        this.x = x;
        this.y = y;
        difference = y - x;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
