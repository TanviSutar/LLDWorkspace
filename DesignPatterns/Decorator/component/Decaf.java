package DesignPatterns.Decorator.component;

public class Decaf extends Beverage{
    private double basePrice = 45.5;

    @Override
    public String getDescription() {
        return super.getDescription() + "Decaf";
    }

    @Override
    public double cost() {
        return basePrice;
    }
}
