package DesignPatterns.SimpleFactory;

public class EmployeeFactory{
    public static Employee getEmployee(String firstName, String lastName, double salary){
        if(salary <= 25000)
            return new Intern(firstName, lastName, salary);
        else
            return new FullTimeEmployee(firstName, lastName, salary);
    }
}