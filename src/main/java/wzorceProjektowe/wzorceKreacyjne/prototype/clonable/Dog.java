package wzorceProjektowe.wzorceKreacyjne.prototype.clonable;

import lombok.ToString;

@ToString
public class Dog implements Cloneable {

    public Dog createDogClone() throws CloneNotSupportedException {
        return (Dog) clone();
    }


    private String name;
    private int age;

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
}
