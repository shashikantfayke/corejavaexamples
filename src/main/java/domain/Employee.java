package domain;


import java.io.Serializable;

public class Employee implements Serializable,Cloneable{

    private String firstName;
    private String lastName;
    private String designation;
    private String address;

    public Employee(){
        System.out.println("Default Constructor");
    }

    public Employee(String firstName, String lastName,String designation,String address){

        this.firstName=firstName;
        this.lastName=lastName;
        this.designation=designation;
        this.address=address;
        System.out.println("Parametrized Constructor");
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

}
