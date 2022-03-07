package function_WAŻNE.optional;

import java.util.Optional;

public class Main {


    //NullPointerException
    //rzuczamy gdy chcemy wywowałć akcje na zmiennej a ona przechowuje nulla

    //Optional<T> <- wartość może być ale może być null
    //1.!!!!!!!!!!!!!!!!!! Nigdy NIGDY nie przypisywać nulla do optionala
    public static void main(String[] args) {
        //wtedy wyskoczy NullPointerException
        //String abc = null;
        //int lenght = abc.length();

        //Optional ma dwa stany:
        //pusty
        Optional<String> empty = Optional.empty();
        Optional<String> emptyFromNullable = Optional.ofNullable(null);

        //z wartością
        Optional<String> full = Optional.of("SDA");

        //jak wydobyć (bezpiecznie) wartość z optionala
        String getString = full.get(); //najgorsze rzuca wyjątek -> NIE UŻYWAĆ !!!!

        //tylko te używać generalnie
        String orElseString = full.orElse("DefaultValue"); // albo
        // wartość z optionala albo default (nigdy nie dostaniemy nulla)
        String orEelseThrowString =  full.orElseThrow(() -> new IllegalStateException("Optional should by  full"));


        //jak sprawdzić czy optional coś w sobie ma:
        boolean isPresent = full.isPresent();
        boolean isEmpty = full.isEmpty();

        //bezpieczne z get:
        if (full.isPresent()){
            String value = full.get();
        }

        //transforamty
        //map -  mapowanie to jest zamiana jednego typu danych w drugi
        //transforumuje emlementy 1:1
        Optional<String> stringOptional = Optional.of("Kamil");
        Optional<Integer> lenghtOptional =  stringOptional.map((String valueInsideOptional) -> valueInsideOptional.length());
        System.out.println("lenghtOptional = " + lenghtOptional);

        //filtorwanie
        //filtorowanie zamienia z 1 na 0 bądź 1
        Optional<String> stringOptional1 = stringOptional.filter(s -> s.length() < 5);
        System.out.println("stringOptional = " + stringOptional);

        //flatmapowanie - ona go spłaszcza - rozpakowuje zagnieżdżone elementy jak są 2 pudełka to sprawdza każde po kolei i wyciąga tylko dane które są nie opakujwe ich dodatkowo
        //mapa T -> R ... Optional<T> -> Optional<R>
        //T -> Optional <R> --- Optional<T> -> Optional<Optional<R>> (chcemy :Optional<R>)
        Optional<Optional<Integer>> integer = stringOptional.map(s -> Optional.of(s.length()));
        System.out.println("integer = " + integer);

        Optional<Integer> floatInegeer = stringOptional.flatMap(s -> Optional.of(s.length()));
        System.out.println("floatInegeer = " + floatInegeer);
    }

}
