package ważne_NALEŻY_ZNAĆ.composition;

//takich się nie robi, trzeba rozbijać na
// inne klasy żeby to sensownie to podzielić
public class PlainPerson {
    private String name;
    private String middleName;
    private String lastName;
    private String street;
    private String streetNumber;
    private String building;
    private String country;

    public PlainPerson(String name, String middleName, String lastName, String street, String building, String country) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.street = street;
        this.building = building;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
