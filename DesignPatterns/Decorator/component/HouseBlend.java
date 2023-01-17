package DesignPatterns.Decorator.component;

public class HouseBlend extends Beverage{
    private double basePrice = 30.5;

    @Override
    public String getDescription() {
        return super.getDescription() + "House Blend";
    }

    @Override
    public double cost() {
        return basePrice;
    }
}
