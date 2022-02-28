package ważne_NALEŻY_ZNAĆ.abstractClass;

public abstract class ProductDepartmentEmployee extends Employee {

    public ProductDepartmentEmployee(String name, String lastName) {

        super(name, lastName);
    }

    @Override
    protected  String getDepartmentName(){
        return "Product";
    }
}
