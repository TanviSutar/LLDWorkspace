package DesignPatterns.FactoryMethod.pizza;

public class ChicagoStyleCheesePizza implements Pizza{
    public void prepare(){
        System.out.print("Preparing chicago style cheese pizza.");
    }
    public void bake(){
        System.out.print("Baking chicago style cheese pizza.");
    }
    public void cut(){
        System.out.print("Cutting chicago style cheese pizza.");
    }
    public void box(){
        System.out.println("Boxing chicago style cheese pizza.");
    }
}