package javaZaawansowanaProgramowanie_ZADANIA.Zadanie18i19;

/*
TODO
 Stwórz klasę Computer posiadającą pola określające cechy komputera: procesor, ram, karta grafiki, firma oraz model.
 Zaimplementuj settery, gettery, konstruktor z wszystkimi polami, metody toString() oraz equals() i hashcode().
 Zainstancjuj kilka obiektów i sprawdź działanie metod.
 */

import java.util.Objects;

public class Computer {

    private String processor;
    private Integer ram;
    private String graphicCard;
    private String firma;
    private String model;

    public Computer(String processor, Integer ram, String graphicCard, String firma, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.firma = firma;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram) && Objects.equals(graphicCard, computer.graphicCard) && Objects.equals(firma, computer.firma) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard, firma, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", firma='" + firma + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
