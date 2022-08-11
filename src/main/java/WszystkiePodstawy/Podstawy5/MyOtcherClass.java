package WszystkiePodstawy.Podstawy5;

public class MyOtcherClass {
    private int outerNumber = 5;

    public class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber);
        }
    }

    public MyInnerClass init() {
        return new MyInnerClass();
    }
}
