package DesignPatterns.Decorator.component;

public class DarkRoast extends Beverage{
    private double basePrice = 40.5;

    @Override
    public String getDescription(){
        return super.getDescription()+"Dark Roast";
    }
    
    @Override
    public double cost(){
        return basePrice;
    }
}
