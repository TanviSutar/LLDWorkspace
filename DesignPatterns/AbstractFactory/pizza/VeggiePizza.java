package DesignPatterns.AbstractFactory.pizza;

import java.util.Arrays;

import DesignPatterns.AbstractFactory.ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza with ingredients:");
        System.out.print(ingredientFactory.createDough());
        System.out.print(ingredientFactory.createSauce());
        System.out.print(Arrays.toString(ingredientFactory.createVeggies())+"\n");
    }
}
