package DesignPatterns.Decorator.decorator;

import DesignPatterns.Decorator.component.Beverage;

public class MochaDecorator extends Decorator{
    private Beverage baseBeverage;
    private double cost = 20.5;

    public MochaDecorator(Beverage baseBeverage){
        this.baseBeverage = baseBeverage;
    }

    @Override
    public double cost() {
        return baseBeverage.cost()+cost;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+baseBeverage.getDescription()+" with Mocha";
    }
    
}
