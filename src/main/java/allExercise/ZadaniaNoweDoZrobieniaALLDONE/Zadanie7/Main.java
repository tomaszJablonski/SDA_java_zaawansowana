package allExercise.ZadaniaNoweDoZrobieniaALLDONE.Zadanie7;

/*
Zadanie 7
Napisz program, który dla podanego stringu zawierającego nawiasy sprawdza czy wszystkie nawiasy są poprawnie zamknięte. Przykładowo:
"" => true
"()" => true
"()()((()()))" => true
")" => false
"()(()" => false
15.1*. Dodaj obsługę innych typów nawiasów - [], {}
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        String bracket = "(){}[";

        System.out.println("comparisonOfParentheses(bracket) = " + comparisonOfParentheses(bracket));


    }

    private static boolean comparisonOfParentheses (String bracket){

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0 ; i <bracket.length();i++){
            char b = bracket.charAt(i);

            if (b == '(' || b == '[' || b == '{'){
                stack.push(b);
                continue;
            }

            if (stack.isEmpty())
                return false;

            char check;
            switch (b){
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == ')' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == ')' || check == '}')
                        return false;
                    break;
        }

        }
        return (stack.isEmpty());
    }


}
