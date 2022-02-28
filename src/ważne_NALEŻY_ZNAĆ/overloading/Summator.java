package ważne_NALEŻY_ZNAĆ.overloading;

public class Summator {

    //przeciążanie (metody)

    // nazwa taka sama,inne argumenty


    public String sum(String s1, String s2){
        return String.valueOf(s1.length() + s2.length());
    }

    public double sum(Double[] a1, Double[] a2){
        return a1.length + a2.length;
    }

    public long sum(Long[] a1,Long[] a2){
        return a1.length + a2.length;
    }
}
