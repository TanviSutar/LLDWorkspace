package DesignPatterns.FactoryMethod.pizza;

public class ChicagoStyleGreekPizza implements Pizza{
    public void prepare() {
        System.out.print("Preparing chicago style greek pizza.");
    }

    public void bake() {
        System.out.print("Baking chicago style greek pizza.");
    }

    public void cut() {
        System.out.print("Cutting chicago style greek pizza.");
    }

    public void box() {
        System.out.print("Boxing chicago style greek pizza.");
    }
}