package DesignPatterns.SimpleFactory;

public class MainClass{
    public static void main(String args[]){
        Employee employee = EmployeeFactory.getEmployee("Sara", "khan", 10000);
        System.out.println(employee);
        employee = EmployeeFactory.getEmployee("Khira", "Tross", 255000);
        System.out.println(employee);
    }
}