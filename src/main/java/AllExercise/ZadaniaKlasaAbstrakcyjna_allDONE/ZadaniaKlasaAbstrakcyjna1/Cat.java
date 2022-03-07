package AllExercise.ZadaniaKlasaAbstrakcyjna_allDONE.ZadaniaKlasaAbstrakcyjna1;

public  class Cat extends Animal  {

    protected Cat(int age) {
        super(age);
    }

    @Override
    public  void giveAVoice(){
        System.out.println("Miał miał");
    }
}
