package DesignPatterns.FactoryMethod.pizza;

public class NYStyleCheesePizza implements Pizza {
    public void prepare() {
        System.out.print("Preparing NY style cheese pizza.");
    }

    public void bake() {
        System.out.print("Baking NY style cheese pizza.");
    }

    public void cut() {
        System.out.print("Cutting NY style cheese pizza.");
    }

    public void box() {
        System.out.println("Boxing NY style cheese pizza.");
    }
}