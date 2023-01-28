package DesignPatterns.Builder;

import DesignPatterns.Builder.product.Customer;

public class BuilderDemo {
    public static void main(String args[]){
        Customer customer = new Customer.CustomerBuilder("Henry", "Cavill", "henryC@gmail.com")
                            .middleName("Davis")
                            .secondaryEmail("henry.the.cool.1080@gmail.com")
                            .build();
        System.out.println(customer.toString());
    }
}
