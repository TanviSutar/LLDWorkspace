package DesignPatterns.Decorator;

import java.util.Scanner;

import DesignPatterns.Decorator.component.*;
import DesignPatterns.Decorator.decorator.*;

public class CoffeeShopOperator{
    public static void main(String []args){
        Beverage orderBeverage = null;
        System.out.println("Options for Coffe:\n1. House Blend\n2. Dark Roast\n3. Decaf\n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch(input){
            case 1:
                orderBeverage = new HouseBlend();
                break;
            case 2:
                orderBeverage = new DarkRoast();
                break;
            case 3:
                orderBeverage = new Decaf();
                break;
            default:
                break;
        }
        System.out.println("Options for Condiments:\n1. Whipped Cream\n2. Mocha\n");
        input = scanner.nextInt();
        switch (input) {
            case 1:
                orderBeverage = new WhippedCreamDecorator(orderBeverage);
                break;
            case 2:
                orderBeverage = new MochaDecorator(orderBeverage);
                break;
            default:
                break;
        }
        System.out.println("Your order details:");
        System.out.print(orderBeverage.getDescription()+"-- $"+orderBeverage.cost()+"\n");
    }
}