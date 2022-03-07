package ważne_NALEŻY_ZNAĆ.abstractClass;

public class ExternalProductDepartmentEmployee extends ProductDepartmentEmployee {

    public ExternalProductDepartmentEmployee(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    protected  String getDepartmentName(){
        return "External product";
    }
}
