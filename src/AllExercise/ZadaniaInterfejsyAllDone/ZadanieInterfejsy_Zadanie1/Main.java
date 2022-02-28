package AllExercise.ZadaniaInterfejsyAllDone.ZadanieInterfejsy_Zadanie1;

/* TODO
1. Stwórz interfejs Zwierze wraz z metodą dajGłos().
Done
2. Stwórz klasy implementujące ten interejs: Kot, Pies, Wąż.
Done
3. Stwórz kilka obiektów i wywołaj metodę dajGłos - co się dzieje i dlaczego ?
done
4. Dodaj drugi interfejs RuchomeZwierze z metodą ruszaj().
Done
5. Zmień interfejs Zwierze tak, żeby rozszerzał RuchomeZwierze.
Done
 */
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        giveAVoice(dog);

        Animals animals = new Dog();
        giveAVoice(animals);
        move(animals);

        Animals animals1 = new Cat();
        giveAVoice(animals1);
        move(animals1);

        Animals animals2 = new Snake();
        giveAVoice(animals2);
        move(animals2);
    }
        //trzeba znaleźć część wspólną i ją wykorzystać, tutaj Animals.
    public static void giveAVoice(Animals voice){
        String result = voice.givaAVoice();
        System.out.println("Voice result " + result);
    }

    public static void move(Animals moves){
        String result = moves.move();
        System.out.println("Move " + result);
    }
}
