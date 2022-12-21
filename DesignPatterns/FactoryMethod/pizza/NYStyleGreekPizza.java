package DesignPatterns.FactoryMethod.pizza;

public class NYStyleGreekPizza implements Pizza {
    public void prepare() {
        System.out.print("Preparing NY style greek pizza.");
    }

    public void bake() {
        System.out.print("Baking NY style greek pizza.");
    }

    public void cut() {
        System.out.print("Cutting NY style greek pizza.");
    }

    public void box() {
        System.out.println("Boxing NY style greek pizza.");
    }
}