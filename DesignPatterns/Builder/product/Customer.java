package DesignPatterns.Builder.product;

import DesignPatterns.Builder.builder.ICustomerBuilder;

public class Customer {
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String middleName;
    private String secondaryEmail;
    
    private Customer(CustomerBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.primaryEmail = builder.primaryEmail;
        this.middleName = builder.middleName;
        this.secondaryEmail = secondaryEmail;
    }
    
    public static class CustomerBuilder implements ICustomerBuilder{
        private String firstName;
        private String lastName;
        private String primaryEmail;
        private String middleName;
        private String secondaryEmail;
        public CustomerBuilder(String firstName, String lastName, String primaryEmail){
            this.firstName = firstName;
            this.lastName = lastName;
            this.primaryEmail = primaryEmail;
        }
        public ICustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public ICustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public ICustomerBuilder primaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }
        public ICustomerBuilder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public ICustomerBuilder secondaryEmail(String secondaryEmail){
            this.secondaryEmail = secondaryEmail;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    public String toString(){
        return "Hello "+firstName+" "+lastName+".";
    }
}
