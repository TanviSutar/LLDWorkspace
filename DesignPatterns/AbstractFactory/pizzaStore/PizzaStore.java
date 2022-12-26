package DesignPatterns.AbstractFactory.pizzaStore;

import DesignPatterns.AbstractFactory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        return createPizza(type);
    }
    protected abstract Pizza createPizza(String type);
}
