package AllExercise.ZadaniaClass_allDONE.zadanie1;

public class Dog extends Animal{


    private String color;

    public Dog(String name, int age, String race, String color) {
        super(name,age,race);
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.println("Hał Hał");
    }


    }

