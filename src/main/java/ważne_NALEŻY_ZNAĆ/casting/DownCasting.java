package ważne_NALEŻY_ZNAĆ.casting;

//castowanie w dół
//zamiana klasy na jedną z klas, która rozszerza tą klasę
public class DownCasting {
    public static void main(String[] args) {
        Student student = new Student();
        castToPerson(student);
        castToLerner(student);

    }

    private static void castToPerson(Greeter greeter){
        //instanceof - sprawdza czy dany obiekt może być zamieniny na inny

        if (greeter instanceof Person) {
            Person p = (Person) greeter;
            System.out.println("Casted to person");
        }
    }

    private static void castToPersonWithPattern(Greeter greeter){
        if (greeter instanceof Person person){
            //TYLKO w JAVA 16+
            //używać person jak normalnej zmiennej
            //brak: Person person = (Person) greeter
        }
    }

    private static void castToLerner(Greeter greeter){
        if(greeter instanceof Learner){
            Learner learner = (Learner) greeter;
            System.out.println("Casted to learner");
        }
    }
}
