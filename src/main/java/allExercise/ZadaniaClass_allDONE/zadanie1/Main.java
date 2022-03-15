package allExercise.ZadaniaClass_allDONE.zadanie1;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        Animal cat1 = new Cat("Mruczek",5,"dachowiec");
        Animal cat2 = new Cat("Łacio",2,"Tygrysi");
        cat1.voice();
        cat2.voice();

        Animal dog1 = new Dog("Klocek",4,"York","Czarny");
        Animal dog2 = new Dog("Waro",10,"Owczarek Niemiecki","Czarno-brązowy");
        dog1.voice();
        dog2.voice();

        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        animals[3] = dog2;


        for(int i=0; i<animals.length;i++){
            System.out.println(animals[i]);

            }

        }

    }




