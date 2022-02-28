package ważne_NALEŻY_ZNAĆ.abstractClass;

public class Main {
    public static void main(String[] args) {
        //nie można stworzyć obiektu klasy  abstrakcyjnej
//        Employee employee = new Employee(); {
        ItDepartmentEmployee itEmployee = new ItDepartmentEmployee("Marian","Maniutek");
        System.out.println("it Employee.getinfo() = " + itEmployee.getInfo());



        InternalProductDepartmentEmployee ipEmployee = new InternalProductDepartmentEmployee("Karolina","Wchodzi");
        System.out.println("it Employee.getinfo() = " + ipEmployee.getInfo());

        ExternalProductDepartmentEmployee epEmploye= new ExternalProductDepartmentEmployee("Agnieszka","Zwariowna");
        System.out.println("it Employee.getinfo() = "+ epEmploye.getInfo() );

    }
    }

