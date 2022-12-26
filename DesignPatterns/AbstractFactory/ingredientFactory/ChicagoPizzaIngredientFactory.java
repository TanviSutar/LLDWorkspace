package DesignPatterns.AbstractFactory.ingredientFactory;

import DesignPatterns.AbstractFactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Eggplant(), new Spinach() };
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

}
