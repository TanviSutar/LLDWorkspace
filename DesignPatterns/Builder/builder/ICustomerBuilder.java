package DesignPatterns.Builder.builder;

import DesignPatterns.Builder.product.Customer;

public interface ICustomerBuilder {
    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder primaryEmail(String primaryEmail);
    ICustomerBuilder middleName(String middleName);
    ICustomerBuilder secondaryEmail(String secondaryEmail);
    Customer build();
}
