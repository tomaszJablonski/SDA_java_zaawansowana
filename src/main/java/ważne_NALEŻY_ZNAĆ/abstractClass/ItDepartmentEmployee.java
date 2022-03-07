package ważne_NALEŻY_ZNAĆ.abstractClass;

public class ItDepartmentEmployee extends Employee {

    public ItDepartmentEmployee(String name, String lastName) {
        super(name, lastName);
    }

    //trzeba nadpisywać metody z klas abstrakcyjnych aby ich używać
    @Override
    protected  String getDepartmentName(){
        return "IT";
    }
}
