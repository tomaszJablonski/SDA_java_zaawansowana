package wzorceProjektowe.wzorceKreacyjne.factoryMethod.systemFactory;

//Abstrakcyjna fabryka musi mieć w sobie wszystkie
//dotychczas stworzone abstarkcyjne typy

public interface MassFactory {
    Button createButton();

    MailBox createMailBox();
}
