package DesignPatterns.AbstractFactory.ingredientFactory;

import DesignPatterns.AbstractFactory.ingredients.*;

// This interface and its implementations are an example of abstract factory
public interface PizzaIngredientFactory{
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
}