package wzorceProjektowe.wzorceKreacyjne.prototype.clonable;

public class Cat implements Cloneable{

    public Cat creatCatClone() throws CloneNotSupportedException{
        return (Cat) clone();
    }


    private String name;
    private int age;
    private Dog dog;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.dog = new Dog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
     return this.dog;
    }
}
