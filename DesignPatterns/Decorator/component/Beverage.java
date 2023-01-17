package DesignPatterns.Decorator.component;

public abstract class Beverage {
    public String getDescription(){
        return "Starbuzz special Cofee ";
    }
    public abstract double cost();
}
