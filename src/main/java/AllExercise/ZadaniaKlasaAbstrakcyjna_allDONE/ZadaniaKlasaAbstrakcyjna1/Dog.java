package AllExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna1;

public class Dog extends Animal {


    protected Dog(int age) {
        super(age);
    }

    @Override
    public  void giveAVoice(){
        System.out.println("Hał hał");
    }


}
