package DesignPatterns.SimpleFactory;

public abstract class Employee{
    protected String firstName;
    protected String lastName;
    protected double salary;
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return firstName+lastName;
    } 
}