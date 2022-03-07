package bardzo_WAŻNE_DO_PRACY.inheritance_Dziedziczenie;

//klasa student dziedziczy
//po klasie person
//klasa student rozszerza(extends) klase Person
//KAŻDY  Student jest osobą Person
//WAŻNE można rozszerzać TYLKO jedną klase
public final class Student extends Person {

    private String studentNumber;

    public  Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' + super.toString() +
                '}';
    }

    public Student(String name, String lastname, String studentNumber){
        super(name,lastname); // odwłanie z klasy rodzica i musi być jako pierwsza linijka w constructorze
        this.studentNumber = studentNumber; // odwołanie z tej klasy
        System.out.println("Creating student");

    }

    public Student(String studentNumber){

        this.studentNumber = studentNumber;
    }

    public final void  learn(){
        System.out.println("Learining...");
    }

    //nadpisywanie metody
    @Override
    public void sayHello(){
        super.sayHello();
        System.out.println("Hello from student");
    }


}
