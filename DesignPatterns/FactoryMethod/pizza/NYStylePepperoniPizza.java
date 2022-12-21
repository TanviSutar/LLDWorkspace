package DesignPatterns.FactoryMethod.pizza;

public class NYStylePepperoniPizza implements Pizza {
    public void prepare() {
        System.out.print("Preparing NY style pepperoni pizza.");
    }

    public void bake() {
        System.out.print("Baking NY style pepperoni pizza.");
    }

    public void cut() {
        System.out.print("Cutting NY style pepperoni pizza.");
    }

    public void box() {
        System.out.println("Boxing NY style pepperoni pizza.");
    }
}