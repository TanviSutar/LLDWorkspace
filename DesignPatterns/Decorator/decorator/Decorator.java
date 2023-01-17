package DesignPatterns.Decorator.decorator;

import DesignPatterns.Decorator.component.Beverage;

//this class can be skipped if there is no additional behaviour or state to be added that
//has to be present in all the concrete decorators, which is exactly the case in this eg
public abstract class Decorator extends Beverage{
    @Override
    public String getDescription(){
        return "Starbuzz special Cofee and Condiments ";
    }
}
