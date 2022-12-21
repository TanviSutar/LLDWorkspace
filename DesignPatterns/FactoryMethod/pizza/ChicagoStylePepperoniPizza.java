package DesignPatterns.FactoryMethod.pizza;

public class ChicagoStylePepperoniPizza implements Pizza{
    public void prepare() {
        System.out.print("Preparing chicago style pepperoni pizza.");
    }

    public void bake() {
        System.out.print("Baking chicago style pepperoni pizza.");
    }

    public void cut() {
        System.out.print("Cutting chicago style pepperoni pizza.");
    }

    public void box() {
        System.out.print("Boxing chicago style pepperoni pizza.");
    }
}

