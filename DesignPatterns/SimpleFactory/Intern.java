package DesignPatterns.SimpleFactory;
import java.util.Date;

public class Intern extends Employee{
    private Date endDate;
    public Intern(String firstName, String lastName, double salary){
        super.firstName = firstName;
        super.lastName = lastName;
        super.salary = salary;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}