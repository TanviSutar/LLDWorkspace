package DesignPatterns.AbstractFactory.pizzaStore;

import DesignPatterns.AbstractFactory.ingredientFactory.*;
import DesignPatterns.AbstractFactory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type == "cheese") {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type == "veggie") {
            pizza = new VeggiePizza(ingredientFactory);
        } else if (type == "pepperoni") {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        return pizza;
    }
}
