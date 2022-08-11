package WszystkiePodstawy.Podstawy4;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    //Zmienne:
    //imie, Nazwisko,numer indeksu, czyAktywny
    //Tablica maksymalnie 5 ocen

    //Metody: toString,Gettery i Settery
    //Metoda która największa ocena z tablicy
    //metoda która pozwala dodwać oceny (pamiętamy o weryfikowaniu nulli)
    private final int SIZE = 5;

    private String name;
    private String lastName;
    private int iDNumber;
    private boolean active;
    private int[] schoolDiary;

    public Student(Scanner odczytStudent) {
        System.out.println("Podaj imię");
        this.name = name;
        String name = odczytStudent.next();
        this.lastName = lastName;
        this.iDNumber = iDNumber;
        this.active = active;
        this.schoolDiary = schoolDiary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", iDNumber=" + iDNumber +
                ", active='" + active + '\'' +
                ", schoolDiary=" + Arrays.toString(schoolDiary) +
                '}';
    }

    public void showMaxOceny() {
        int max = 0;
        for (int i = 0; i < schoolDiary.length; i++) {
            if (schoolDiary[i] > max) {
                max = schoolDiary[i];
            }
        }
        System.out.println("Najwyższa ocena" + max);
    }

    public void dodajocene(int ocena) {
        boolean czydodano = false;

        for (int i = 0; i < schoolDiary.length; i++) {
            if (schoolDiary[i] == 0) {
                schoolDiary[i] = ocena;
                czydodano = true;
                break;
            }
        }
        if (czydodano) {
            System.out.println("dodano ocene");
        } else {
            System.out.println("Lista jest pełna");
        }
    }

    public Student(String name, String lastName, int iDNumber, boolean active, int[] schoolDiary) {
        this.name = name;
        this.lastName = lastName;
        this.iDNumber = iDNumber;
        this.active = active;
        this.schoolDiary = schoolDiary;
    }

    //przeciążanie konstruktora

//    public Student(String name, String lastname){
//        this.name = name;
//        this.lastName = lastname;
//    }
//
//    public Student(){
//        this.name ="Brak";
//        this.lastName = "Brak";
//    }
//
//    public Student (String name,int iDNumber){
//        this.active = true;
//        this.name = name;
//        this.iDNumber = iDNumber;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int[] getSchoolDiary() {
        return schoolDiary;
    }

    public void setSchoolDiary(int[] schoolDiary) {
        this.schoolDiary = schoolDiary;
    }


}
