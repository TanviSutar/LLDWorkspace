package DesignPatterns.AbstractFactory.pizza;

import DesignPatterns.AbstractFactory.ingredientFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza with ingredients:");
        System.out.print(ingredientFactory.createDough());
        System.out.print(ingredientFactory.createSauce());
        System.out.print(ingredientFactory.createPepperoni() + "\n");
    }
}
