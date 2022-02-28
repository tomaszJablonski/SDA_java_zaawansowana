package AllExercise.ZadaniaNoweDoZrobienia.Zadanie6;

/*
TODO
 Perfectly balanced. Napisz program, który dla podanych stringów sprawdza czy ilość WSZYSTKICH liter jest taka sama:
1. - czy jest taka sama ilość x i y
balanced("xxxyyy") => true
balanced("yyyxxx") => true
balanced("xxxyyyy") => false
balanced("yyxyxxyxxyyyyxxxyxyx") => true
balanced("xyxxxxyyyxyxxyxxyy") => false
balanced("") => true
balanced("x") => false

2. - czy jest taka sam ilość liter
balanced_bonus("xxxyyyzzz") => true
balanced_bonus("abccbaabccba") => true
balanced_bonus("xxxyyyzzzz") => false
balanced_bonus("abcdefghijklmnopqrstuvwxyz") => true
balanced_bonus("pqq") => false
balanced_bonus("fdedfdeffeddefeeeefddf") => false
balanced_bonus("www") => true
balanced_bonus("x") => true
balanced_bonus("") => true
 */

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String text = "xxxyyy";

        System.out.println("amountOfLettersXY = " + amountOfLettersXY(text));

    }

    public static boolean amountOfLettersXY(String text) {
        boolean isEqual = false;
        text.toLowerCase(Locale.ROOT);
        Character x = 'x';
        Character y = 'y';
        Character.toLowerCase(x);
        Character.toLowerCase(y);




        if (isEqual) {
            if (x.charValue() == y.charValue()) {
                for (char xLetter : text.toCharArray()) {
                    xLetter = x.charValue();
                    for (char yLetter : text.toCharArray()) {
                        yLetter = y.charValue();
                    }
                }
            return true;
            }
        }
        return isEqual;
    }
}

