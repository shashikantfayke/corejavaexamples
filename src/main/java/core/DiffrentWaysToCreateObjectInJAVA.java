package core;


import domain.Employee;

public class DiffrentWaysToCreateObjectInJAVA {
    /*
    1. Using New Operator.
    2. Using Class.forName.
    3. Using clone Method.
    4. Using DeSerialization
 */
    public static void main(String[] args) {

        Employee emp=new Employee();

        try {
            Employee anotherEmp= (Employee) Class.forName("domain.Employee").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
