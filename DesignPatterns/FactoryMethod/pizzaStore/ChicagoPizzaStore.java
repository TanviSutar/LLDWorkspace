package DesignPatterns.FactoryMethod.pizzaStore;

import DesignPatterns.FactoryMethod.pizza.ChicagoStyleCheesePizza;
import DesignPatterns.FactoryMethod.pizza.ChicagoStyleGreekPizza;
import DesignPatterns.FactoryMethod.pizza.ChicagoStylePepperoniPizza;
import DesignPatterns.FactoryMethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}