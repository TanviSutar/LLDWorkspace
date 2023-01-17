package DesignPatterns.Decorator.decorator;

import DesignPatterns.Decorator.component.Beverage;

public class WhippedCreamDecorator extends Decorator{
    private Beverage baseBeverage;
    private double cost = 15.0;

    public WhippedCreamDecorator(Beverage baseBeverage){
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+baseBeverage.getDescription()+" with whipped cream.";
    }

    @Override
    public double cost() {
        return baseBeverage.cost()+cost;
    }
    
}
