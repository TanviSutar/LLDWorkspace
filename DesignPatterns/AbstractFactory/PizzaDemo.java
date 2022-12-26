package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.pizzaStore.ChicagoPizzaStore;
import DesignPatterns.AbstractFactory.pizzaStore.NYPizzaStore;
import DesignPatterns.AbstractFactory.pizzaStore.PizzaStore;
import DesignPatterns.AbstractFactory.pizza.Pizza;

public class PizzaDemo{
    public static void main(String []args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}