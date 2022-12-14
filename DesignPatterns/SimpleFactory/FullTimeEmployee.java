package DesignPatterns.SimpleFactory;

public class FullTimeEmployee extends Employee{
    private double benefitsAmount;
    public FullTimeEmployee(String firstName, String lastName, double salary){
        super.firstName = firstName;
        super.lastName = lastName;
        super.salary = salary;
    }
    public double getBenefitsAmount() {
        return benefitsAmount;
    }
    public void setBenefitsAmount(double benefitsAmount) {
        this.benefitsAmount = benefitsAmount;
    }
} 