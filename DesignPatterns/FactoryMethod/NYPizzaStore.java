package DesignPatterns.FactoryMethod;

import DesignPatterns.FactoryMethod.pizza.Pizza;
import DesignPatterns.FactoryMethod.pizza.NYStyleCheesePizza;
import DesignPatterns.FactoryMethod.pizza.NYStyleGreekPizza;
import DesignPatterns.FactoryMethod.pizza.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("greek")){
            pizza = new NYStyleGreekPizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}