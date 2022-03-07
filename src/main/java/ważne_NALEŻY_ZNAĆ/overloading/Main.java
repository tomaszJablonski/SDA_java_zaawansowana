package ważne_NALEŻY_ZNAĆ.overloading;

public class Main {
    public static void main(String[] args) {

        Summator summator = new Summator();

        summator.sum("SDA", "SAD");
        System.out.println(summator);
        summator.sum(new Long[]{1L, 2L, 3L}, new Long[]{1L, 2L, 3L});
        System.out.println(summator);
    }
}
