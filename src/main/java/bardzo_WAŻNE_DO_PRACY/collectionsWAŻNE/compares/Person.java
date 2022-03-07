package bardzo_WAŻNE_DO_PRACY.collectionsWAŻNE.compares;


// przy porównywaniu znaczenie ma znak
// <0 <- jesteśmy (this.) mniejsze
// 0  <- równe
// >0 <- jesteśmy (this) większe

//WAŻNE (!)
//Comparable - definiuje coś co nazywa się - "naturalOrder"
//natural order - "domyślne porównania"
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    //porównanaie:
    //jeśli imię jest mniejsze to osoba jest mniejsza
    //jeśli imię jest równe to mniejsza jest to co ma maniejszy wiek
    //jeśli imie i wiek są równe to są sobie równe

    //problem tu moze wystąpić taki, że będzie za dużo ifów
    @Override
    public int compareTo(Person o) {
        //jeżeli nasze imiona nie są równe
        //to imię determinuje mniejsza/większa
        if(name.compareTo(o.name) !=0){
            return name.compareTo(o.name);
        }
        return Integer.compare(age, o.age);
    }
}
